// Generated by dagger.internal.codegen.ComponentProcessor (https://google.github.io/dagger).
package com.exercise.earthquakes.ui.di;

import com.exercise.earthquakes.Repository;
import com.exercise.earthquakes.Repository_MembersInjector;
import com.exercise.earthquakes.network.EarthquakeRequestParams;
import com.exercise.earthquakes.network.clients.BaseClient;
import dagger.MembersInjector;
import dagger.internal.Preconditions;
import javax.inject.Provider;

public final class DaggerModelViewDataComponent implements ModelViewDataComponent {
  private Provider<BaseClient> provideViewModelProvider;

  private Provider<EarthquakeRequestParams> provideEarthquakeRequestParamsProvider;

  private MembersInjector<Repository> repositoryMembersInjector;

  private DaggerModelViewDataComponent(Builder builder) {
    assert builder != null;
    initialize(builder);
  }

  public static Builder builder() {
    return new Builder();
  }

  @SuppressWarnings("unchecked")
  private void initialize(final Builder builder) {

    this.provideViewModelProvider =
        ModelViewDataModule_ProvideViewModelFactory.create(builder.modelViewDataModule);

    this.provideEarthquakeRequestParamsProvider =
        ModelViewDataModule_ProvideEarthquakeRequestParamsFactory.create(
            builder.modelViewDataModule);

    this.repositoryMembersInjector =
        Repository_MembersInjector.create(
            provideViewModelProvider, provideEarthquakeRequestParamsProvider);
  }

  @Override
  public void inject(Repository arg0) {
    repositoryMembersInjector.injectMembers(arg0);
  }

  public static final class Builder {
    private ModelViewDataModule modelViewDataModule;

    private Builder() {}

    public ModelViewDataComponent build() {
      if (modelViewDataModule == null) {
        throw new IllegalStateException(
            ModelViewDataModule.class.getCanonicalName() + " must be set");
      }
      return new DaggerModelViewDataComponent(this);
    }

    public Builder modelViewDataModule(ModelViewDataModule modelViewDataModule) {
      this.modelViewDataModule = Preconditions.checkNotNull(modelViewDataModule);
      return this;
    }
  }
}
