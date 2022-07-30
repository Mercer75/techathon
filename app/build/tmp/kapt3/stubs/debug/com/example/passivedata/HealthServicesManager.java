package com.example.passivedata;

import java.lang.System;

/**
 * Entry point for [HealthServicesClient] APIs. This also provides suspend functions around
 * those APIs to enable use in coroutines.
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0011\u0010\f\u001a\u00020\rH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eJ\u0011\u0010\u000f\u001a\u00020\u0010H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eJ\u0011\u0010\u0011\u001a\u00020\u0010H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0012"}, d2 = {"Lcom/example/passivedata/HealthServicesManager;", "", "context", "Landroid/content/Context;", "healthServicesClient", "Landroidx/health/services/client/HealthServicesClient;", "(Landroid/content/Context;Landroidx/health/services/client/HealthServicesClient;)V", "dataTypes", "", "Landroidx/health/services/client/data/DataType;", "passiveMonitoringClient", "Landroidx/health/services/client/PassiveMonitoringClient;", "hasHeartRateCapability", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "registerForHeartRateData", "", "unregisterForHeartRateData", "app_debug"})
public final class HealthServicesManager {
    private final android.content.Context context = null;
    private final androidx.health.services.client.PassiveMonitoringClient passiveMonitoringClient = null;
    private final java.util.Set<androidx.health.services.client.data.DataType> dataTypes = null;
    
    @javax.inject.Inject()
    public HealthServicesManager(@org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.qualifiers.ApplicationContext()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    androidx.health.services.client.HealthServicesClient healthServicesClient) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object hasHeartRateCapability(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object registerForHeartRateData(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object unregisterForHeartRateData(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
}