
package com.clipsub.RNCountryCodes;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;

public class RNCountryCodesModule extends ReactContextBaseJavaModule {

  private final ReactApplicationContext reactContext;

  public RNCountryCodesModule(ReactApplicationContext reactContext) {
    super(reactContext);
    this.reactContext = reactContext;
  }

  @Override
  public String getName() {
    return "RNCountryCodes";
  }
}