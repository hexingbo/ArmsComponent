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
package me.jessyan.armscomponent.gold.di.component;

import com.jess.arms.di.component.AppComponent;
import com.jess.arms.di.scope.ActivityScope;

import dagger.BindsInstance;
import dagger.Component;
import me.jessyan.armscomponent.gold.di.module.GoldHomeModule;
import me.jessyan.armscomponent.gold.mvp.contract.GoldHomeContract;
import me.jessyan.armscomponent.gold.mvp.ui.activity.GoldHomeActivity;

/**
 * ================================================
 * 展示 Component 的用法
 * ================================================
 */
@ActivityScope
@Component(modules = GoldHomeModule.class, dependencies = AppComponent.class)
public interface GoldHomeComponent {
    void inject(GoldHomeActivity activity);
    @Component.Builder
    interface Builder {
        @BindsInstance
        GoldHomeComponent.Builder view(GoldHomeContract.View view);
        GoldHomeComponent.Builder appComponent(AppComponent appComponent);
        GoldHomeComponent build();
    }
}
