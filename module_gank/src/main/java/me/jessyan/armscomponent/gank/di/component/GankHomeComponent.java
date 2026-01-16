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
package me.jessyan.armscomponent.gank.di.component;

import com.jess.arms.di.component.AppComponent;
import com.jess.arms.di.scope.ActivityScope;

import dagger.BindsInstance;
import dagger.Component;
import me.jessyan.armscomponent.gank.di.module.GankHomeModule;
import me.jessyan.armscomponent.gank.mvp.contract.GankHomeContract;
import me.jessyan.armscomponent.gank.mvp.ui.activity.GankHomeActivity;

/**
 * ================================================
 * 展示 Component 的用法
 * ================================================
 */
@ActivityScope
@Component(modules = GankHomeModule.class, dependencies = AppComponent.class)
public interface GankHomeComponent {
    void inject(GankHomeActivity activity);
    @Component.Builder
    interface Builder {
        @BindsInstance
        GankHomeComponent.Builder view(GankHomeContract.View view);
        GankHomeComponent.Builder appComponent(AppComponent appComponent);
        GankHomeComponent build();
    }
}
