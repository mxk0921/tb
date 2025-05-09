package com.uc.webview.internal.interfaces;

import android.webkit.ValueCallback;
import com.uc.webview.base.IExtender;
import com.uc.webview.export.WebView;
import com.uc.webview.export.extension.Sdk2CoreHost;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class CrExtensionsManager implements IExtender {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface ExtenderID {
        public static final int SUPPORT_FEATURE = 1724422726;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class Instance {
        private static volatile CrExtensionsManager sInstance;

        public static CrExtensionsManager get() {
            if (sInstance != null) {
                return sInstance;
            }
            synchronized (Instance.class) {
                if (sInstance != null) {
                    return sInstance;
                }
                Object invoke = Sdk2CoreHost.impl().invoke(8, null);
                if (invoke instanceof CrExtensionsManager) {
                    sInstance = (CrExtensionsManager) invoke;
                } else {
                    sInstance = new CrExtensionsManager();
                }
                return sInstance;
            }
        }
    }

    public CrExtensionInfo[] getAllExtensions(Map<String, Object> map) {
        return new CrExtensionInfo[0];
    }

    @Override // com.uc.webview.base.IExtender
    public Object invoke(int i, Object[] objArr) {
        return null;
    }

    public boolean isEnabled() {
        return false;
    }

    public boolean supportFeature(int i) {
        Object invoke = invoke(ExtenderID.SUPPORT_FEATURE, new Object[]{Integer.valueOf(i)});
        if (invoke == null || !(invoke instanceof Boolean)) {
            return false;
        }
        return ((Boolean) invoke).booleanValue();
    }

    public void getAllExtensions(Map<String, Object> map, ValueCallback<CrExtensionInfo[]> valueCallback) {
        if (valueCallback != null) {
            valueCallback.onReceiveValue(new CrExtensionInfo[0]);
        }
    }

    public void doAction(String str, Map<String, Object> map) {
    }

    public void installCrxExtension(String str, Map<String, Object> map) {
    }

    public void notifyActiveWebViewChanged(WebView webView, Map<String, Object> map) {
    }

    public void uninstallExtension(String str, Map<String, Object> map) {
    }
}
