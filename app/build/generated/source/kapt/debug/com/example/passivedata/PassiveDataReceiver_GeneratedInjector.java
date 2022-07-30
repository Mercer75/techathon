package com.example.passivedata;

import dagger.hilt.InstallIn;
import dagger.hilt.codegen.OriginatingElement;
import dagger.hilt.components.SingletonComponent;
import dagger.hilt.internal.GeneratedEntryPoint;

@OriginatingElement(
    topLevelClass = PassiveDataReceiver.class
)
@GeneratedEntryPoint
@InstallIn(SingletonComponent.class)
public interface PassiveDataReceiver_GeneratedInjector {
  void injectPassiveDataReceiver(PassiveDataReceiver passiveDataReceiver);
}
