package com.exercise.earthquakes.ui.di

import com.exercise.earthquakes.Repository
import dagger.Component

@Component(modules = [ModelViewDataModule::class])
interface ModelViewDataComponent {

    fun inject(repository: Repository)
}