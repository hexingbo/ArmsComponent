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
package me.jessyan.armscomponent.gank.mvp.model;

import com.jess.arms.di.scope.ActivityScope;
import com.jess.arms.integration.IRepositoryManager;
import com.jess.arms.mvp.BaseModel;

import java.util.List;

import javax.inject.Inject;

import io.reactivex.Observable;
import me.jessyan.armscomponent.gank.mvp.contract.GankHomeContract;
import me.jessyan.armscomponent.gank.mvp.model.api.service.GankService;
import me.jessyan.armscomponent.gank.mvp.model.entity.GankBaseResponse;
import me.jessyan.armscomponent.gank.mvp.model.entity.GankItemBean;

/**
 * ================================================
 * 展示 Model 的用法
 * ================================================
 */
@ActivityScope
public class GankModel extends BaseModel implements GankHomeContract.Model {

    @Inject
    public GankModel(IRepositoryManager repositoryManager) {
        super(repositoryManager);
    }

    @Override
    public Observable<GankBaseResponse<List<GankItemBean>>> getGirlList(int num, int page) {
        return mRepositoryManager
                .obtainRetrofitService(GankService.class)
                .getGirlList(num, page);
    }
}
