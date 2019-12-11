package com.exercise.earthquakes.network.di


import com.exercise.earthquakes.network.clients.RetrofitClient
import dagger.Component
import io.github.adamshurwitz.retrorecycler.dependencyinjection.RetrofitClientDataModule
import javax.inject.Singleton

@Singleton
@Component(modules = [RetrofitClientDataModule::class])
interface RetrofitClientDataComponent {

    fun inject(mainModelView: RetrofitClient)
}
