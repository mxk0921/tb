package com.uc.webview.internal.interfaces;

import android.webkit.ValueCallback;
import com.uc.webview.base.IExtender;
import com.uc.webview.base.Log;
import com.uc.webview.export.extension.Sdk2CoreHost;
import java.util.HashMap;
import java.util.Vector;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class ILoginDelegate implements IExtender {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class Instance {
        private static volatile ILoginDelegate sInstance;

        public static ILoginDelegate get() {
            return sInstance;
        }

        public static void set(ILoginDelegate iLoginDelegate) {
            try {
                Sdk2CoreHost.impl().setLoginDelegate(iLoginDelegate);
                sInstance = iLoginDelegate;
            } catch (Throwable th) {
                Log.w("LoginDelegate", "set failed", th);
            }
        }
    }

    @Override // com.uc.webview.base.IExtender
    public Object invoke(int i, Object[] objArr) {
        return null;
    }

    public void onGetLogins(HashMap hashMap, ValueCallback<Vector<HashMap<String, String>>> valueCallback) {
        valueCallback.onReceiveValue(null);
    }

    public void onAddLogin(HashMap hashMap) {
    }

    public void onRemoveLogin(HashMap hashMap) {
    }

    public void onUpdateLogin(HashMap hashMap) {
    }
}
