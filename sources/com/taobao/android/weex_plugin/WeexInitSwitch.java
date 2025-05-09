package com.taobao.android.weex_plugin;

import android.app.Application;
import android.content.SharedPreferences;
import android.os.Build;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import com.taobao.tao.Globals;
import java.io.Serializable;
import java.util.Map;
import tb.bzn;
import tb.dwh;
import tb.j3x;
import tb.obk;
import tb.p7x;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class WeexInitSwitch implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String LOG_TAG = "[Weex]InitSwitch";
    private static final String SO_KEY;
    private static boolean sIsRemoteQking;
    private static boolean sIsSoPreload;
    private static boolean sIsSoPreloadBatch;
    private static boolean sLoaded = false;
    private static final SharedPreferences sSp;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a implements obk {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.obk
        public void onConfigUpdate(String str, Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4f2fc4ea", new Object[]{this, str, map});
            } else {
                WeexInitSwitch.access$000();
            }
        }
    }

    static {
        String makeRemoteSOPerfKey = makeRemoteSOPerfKey();
        SO_KEY = makeRemoteSOPerfKey;
        sIsRemoteQking = false;
        sIsSoPreload = true;
        sIsSoPreloadBatch = true;
        SharedPreferences sharedPreferences = Globals.getApplication().getSharedPreferences("weex_2_preference", 0);
        sSp = sharedPreferences;
        try {
            sIsRemoteQking = sharedPreferences.getBoolean(makeRemoteSOPerfKey, false);
            Log.e(LOG_TAG, "libquickjs so ab: local sp: " + sIsRemoteQking);
            sIsSoPreload = sharedPreferences.getBoolean("UseSoPreload", true);
            sIsSoPreloadBatch = sharedPreferences.getBoolean("UseSoPreloadBatch", true);
            OrangeConfig.getInstance().registerListener(new String[]{"qking_so_ab_config"}, new a(), true);
            updateOrangeAndSP();
        } catch (Throwable th) {
            Log.e(LOG_TAG, "libquickjs so ab: init failed, fallback to false", th);
            sIsRemoteQking = false;
        }
    }

    public static /* synthetic */ void access$000() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bcd60777", new Object[0]);
        } else {
            updateOrangeAndSP();
        }
    }

    public static synchronized boolean isIsSoPreloadBatch() {
        synchronized (WeexInitSwitch.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("a2ac504c", new Object[0])).booleanValue();
            }
            return sIsSoPreloadBatch;
        }
    }

    public static synchronized boolean isRemoteQking() {
        synchronized (WeexInitSwitch.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("d40fa3e3", new Object[0])).booleanValue();
            } else if (Build.VERSION.SDK_INT < 30) {
                return false;
            } else {
                return sIsRemoteQking;
            }
        }
    }

    public static synchronized boolean isSoPreload() {
        synchronized (WeexInitSwitch.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("393d650e", new Object[0])).booleanValue();
            }
            return sIsSoPreload;
        }
    }

    private static String makeRemoteSOPerfKey() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c6e14f53", new Object[0]);
        }
        try {
            return "UseRemoteQking2_" + p7x.a(Globals.getApplication());
        } catch (Throwable th) {
            Log.e(dwh.TAG, "remote libquickjs key error", th);
            return "UseRemoteQking2";
        }
    }

    private static synchronized void updateOrangeAndSP() {
        synchronized (WeexInitSwitch.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("40b15664", new Object[0]);
                return;
            }
            String config = OrangeConfig.getInstance().getConfig("qking_so_ab_config", "useRemote2", null);
            if (config == null) {
                Log.e(LOG_TAG, "libquickjs so ab: update orange: remote no orange");
            } else {
                Log.e(LOG_TAG, "libquickjs so ab: update orange: remote orange: ".concat(config));
                boolean equals = "true".equals(config);
                sIsRemoteQking = equals;
                sSp.edit().putBoolean(SO_KEY, equals).apply();
            }
            String config2 = OrangeConfig.getInstance().getConfig("qking_so_ab_config", "UseSoPreload", null);
            if (config2 != null) {
                boolean equals2 = "true".equals(config2);
                sIsSoPreload = equals2;
                sSp.edit().putBoolean("UseSoPreload", equals2).apply();
            }
            String config3 = OrangeConfig.getInstance().getConfig("qking_so_ab_config", "UseSoPreloadBatch", null);
            if (config3 != null) {
                boolean equals3 = "true".equals(config3);
                sIsSoPreloadBatch = equals3;
                sSp.edit().putBoolean("UseSoPreloadBatch", equals3).apply();
            }
        }
    }

    public static synchronized void loadRemoteQking(Application application) {
        synchronized (WeexInitSwitch.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bf3079c", new Object[]{application});
            } else if (!sLoaded) {
                sLoaded = true;
                if (Build.VERSION.SDK_INT >= 30) {
                    if (isRemoteQking()) {
                        if (bzn.d().load("quickjs").i()) {
                            Log.e(LOG_TAG, "libquickjs so ab: orange true, use remote libquickjs");
                            j3x.w = true;
                        } else {
                            Log.e(LOG_TAG, "libquickjs so ab: orange true, but disalbed, use apk libquickjs");
                            j3x.w = false;
                        }
                        return;
                    }
                    Log.e(LOG_TAG, "libquickjs so ab: orange false, use local");
                }
            }
        }
    }
}
