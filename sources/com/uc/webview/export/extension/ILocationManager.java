package com.uc.webview.export.extension;

import android.location.LocationListener;
import com.uc.webview.base.Log;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public interface ILocationManager {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class Instance {
        public static void set(ILocationManager iLocationManager) {
            try {
                Sdk2CoreHost.impl().setLocationManager(iLocationManager);
            } catch (Throwable th) {
                Log.w("ILocationManager", "set failed", th);
            }
        }
    }

    void removeUpdates(LocationListener locationListener);

    void requestLocationUpdates(String str, long j, float f, LocationListener locationListener);

    void requestLocationUpdatesWithUrl(String str, long j, float f, LocationListener locationListener, String str2);
}
