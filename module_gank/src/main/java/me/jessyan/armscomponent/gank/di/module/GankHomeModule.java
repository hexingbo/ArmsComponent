/*
 * Copyright 2017 JessYan
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package me.jessyan.armscomponent.gank.di.module;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.jess.arms.di.scope.ActivityScope;

import java.util.ArrayList;
import java.util.List;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import me.jessyan.armscomponent.gank.mvp.contract.GankHomeContract;
import me.jessyan.armscomponent.gank.mvp.model.GankModel;
import me.jessyan.armscomponent.gank.mvp.model.entity.GankItemBean;
import me.jessyan.armscomponent.gank.mvp.ui.adapter.GankHomeAdapter;

/**
 * ================================================
 * 展示 Module 的用法
 * ================================================
 */
@Module
public abstract class GankHomeModule {
    @Binds
    abstract GankHomeContract.Model bindGankModel(GankModel model);

    @ActivityScope
    @Provides
    static RecyclerView.LayoutManager provideLayoutManager(GankHomeContract.View view) {
        return new GridLayoutManager(view.getActivity(), 2);
    }

    @ActivityScope
    @Provides
    static List<GankItemBean> provideList() {
        return new ArrayList<>();
    }

    @ActivityScope
    @Provides
    static RecyclerView.Adapter provideGankHomeAdapter(List<GankItemBean> list) {
        return new GankHomeAdapter(list);
    }
}
