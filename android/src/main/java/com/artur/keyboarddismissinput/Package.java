package com.artur.keyboarddismissinput;

import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Arrays;

public class Package implements ReactPackage {




    @Override
    public List<ViewManager> createViewManagers( ReactApplicationContext reactContext) {
        return Collections.<ViewManager>singletonList( new EditTextViewManager() );
    }

    @Override
    public List<NativeModule> createNativeModules(ReactApplicationContext reactContext) {
        return Collections.emptyList();
    }



}
