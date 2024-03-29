// Generated by dagger.internal.codegen.ComponentProcessor (https://google.github.io/dagger).
package io.github.adamshurwitz.retrorecycler.dependencyinjection;

import com.exercise.earthquakes.network.EarthquakeService;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import retrofit2.Retrofit;

public final class RetrofitClientDataModule_ProvideServiceFactory
    implements Factory<EarthquakeService> {
  private final RetrofitClientDataModule module;

  private final Provider<Retrofit> arg0Provider;

  public RetrofitClientDataModule_ProvideServiceFactory(
      RetrofitClientDataModule module, Provider<Retrofit> arg0Provider) {
    assert module != null;
    this.module = module;
    assert arg0Provider != null;
    this.arg0Provider = arg0Provider;
  }

  @Override
  public EarthquakeService get() {
    return Preconditions.checkNotNull(
        module.provideService(arg0Provider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<EarthquakeService> create(
      RetrofitClientDataModule module, Provider<Retrofit> arg0Provider) {
    return new RetrofitClientDataModule_ProvideServiceFactory(module, arg0Provider);
  }
}
