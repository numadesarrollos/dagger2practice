package com.numadesarrollos.dagger2practice.di.main;

import android.app.Application;

import androidx.recyclerview.widget.LinearLayoutManager;

import com.numadesarrollos.dagger2practice.network.main.MainApi;
import com.numadesarrollos.dagger2practice.ui.main.posts.PostsRecyclerAdapter;
import com.numadesarrollos.dagger2practice.util.VerticalSpaceItemDecoration;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;

@Module
public class MainModule {

    @Provides
    static MainApi provideMainApi(Retrofit retrofit){
        return retrofit.create(MainApi.class);
    }

    @Provides
    static PostsRecyclerAdapter provideAdapter(){
       return new PostsRecyclerAdapter();
    }

    @Provides
    static LinearLayoutManager provideLinearLayoutManager(Application application){
        return new LinearLayoutManager(application);
    }

    @Provides
    static VerticalSpaceItemDecoration provideItemDecoration(){
        return new VerticalSpaceItemDecoration(15);
    }
}
