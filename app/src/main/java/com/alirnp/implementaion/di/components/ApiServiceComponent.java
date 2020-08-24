package com.alirnp.implementaion.di.components;

import com.alirnp.implementaion.di.modules.ApiServiceModule;
import com.alirnp.implementaion.di.modules.NetModule;
import com.alirnp.implementaion.di.scopes.UserScope;
import com.alirnp.implementaion.interfaces.ApiService;
import com.alirnp.implementaion.ui.MainActivity;

import dagger.Component;

@UserScope
@Component(modules = {ApiServiceModule.class} , dependencies = NetComponent.class )
public interface ApiServiceComponent {
    void inject(MainActivity mainActivity);
}
