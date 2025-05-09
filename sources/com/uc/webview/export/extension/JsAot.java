package com.uc.webview.export.extension;

import android.webkit.ValueCallback;
import com.uc.webview.base.Log;
import com.uc.webview.internal.interfaces.ISdk2Core;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class JsAot {
    private static final String TAG = "JsAot";

    public static void addSnapshotUrl(Map<String, String> map) {
        try {
            Sdk2CoreHost.impl().invoke(ISdk2Core.IExtenderID.ADD_SNAPSHOT_URL, new Object[]{map});
        } catch (Throwable th) {
            Log.w(TAG, "addSnapshotUrl falied", th);
        }
    }

    public static void deleteSnapshotUrl(String[] strArr) {
        try {
            Sdk2CoreHost.impl().invoke(ISdk2Core.IExtenderID.DELETE_SNAPSHOT_URL, new Object[]{strArr});
        } catch (Throwable th) {
            Log.w(TAG, "deleteSnapshotUrl falied", th);
        }
    }

    public static void enableJSCoverageInfo(ValueCallback<String> valueCallback) {
        try {
            Sdk2CoreHost.impl().enableJSCoverageInfo(valueCallback);
        } catch (Throwable th) {
            Log.w(TAG, "enableJSCoverageInfo falied", th);
        }
    }

    public static void generateCodeCache(Map<String, String> map, ValueCallback<Integer> valueCallback) {
        try {
            Sdk2CoreHost.impl().generateCodeCache(map, valueCallback);
        } catch (Throwable th) {
            Log.w(TAG, "generateCodeCache falied", th);
        }
    }

    public static String getSnapshotVersion() {
        try {
            Object invoke = Sdk2CoreHost.impl().invoke(4, new Object[0]);
            if (!(invoke instanceof String)) {
                return "";
            }
            android.util.Log.e("v8snapshot", "getSnapshotVersion: ".concat(String.valueOf(invoke)));
            return (String) invoke;
        } catch (Exception e) {
            Log.e("v8snapshot", "getSnapshotVersion", e);
            return "";
        }
    }

    public static void notifySnapshotLoadResult(String str, String str2, int i) {
        try {
            Sdk2CoreHost.impl().invoke(5, new Object[]{str, str2, Integer.valueOf(i)});
        } catch (Exception e) {
            Log.e("v8snapshot", "notifySnapshotLoadResult", e);
        }
    }

    public static void setCodeCache(String[] strArr, ValueCallback<Integer> valueCallback) {
        try {
            Sdk2CoreHost.impl().setCodeCache(strArr, valueCallback);
        } catch (Throwable th) {
            Log.w(TAG, "setCodeCache falied", th);
        }
    }

    public static void setOnSnapshotInitFailedCallback(ValueCallback<String> valueCallback) {
        try {
            Sdk2CoreHost.impl().invoke(6, new Object[]{valueCallback});
        } catch (Exception e) {
            Log.e("v8snapshot", "setOnSnapshotInitFailedCallback", e);
        }
    }

    public static void initializeSnapshot(String str, byte[] bArr, ValueCallback<Integer> valueCallback) {
        try {
            Sdk2CoreHost.impl().invoke(3, new Object[]{str, bArr, valueCallback});
        } catch (Exception e) {
            Log.e("v8snapshot", "initializeSnapshot", e);
        }
    }

    public static void initializeSnapshots(List<String> list, ValueCallback<Integer> valueCallback) {
        try {
            Sdk2CoreHost.impl().invoke(2, new Object[]{list, valueCallback});
        } catch (Exception e) {
            Log.e("v8snapshot", "initializeSnapshots", e);
        }
    }
}
