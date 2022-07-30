package com.example.passivedata;

import java.lang.System;

/**
 * Receives heart rate updates passively and saves it to the repository.
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\u000f"}, d2 = {"Lcom/example/passivedata/PassiveDataReceiver;", "Landroid/content/BroadcastReceiver;", "()V", "repository", "Lcom/example/passivedata/PassiveDataRepository;", "getRepository", "()Lcom/example/passivedata/PassiveDataRepository;", "setRepository", "(Lcom/example/passivedata/PassiveDataRepository;)V", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class PassiveDataReceiver extends android.content.BroadcastReceiver {
    @javax.inject.Inject()
    public com.example.passivedata.PassiveDataRepository repository;
    
    public PassiveDataReceiver() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.passivedata.PassiveDataRepository getRepository() {
        return null;
    }
    
    public final void setRepository(@org.jetbrains.annotations.NotNull()
    com.example.passivedata.PassiveDataRepository p0) {
    }
    
    @java.lang.Override()
    public void onReceive(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.content.Intent intent) {
    }
}