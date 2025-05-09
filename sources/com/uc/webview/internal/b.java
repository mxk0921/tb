package com.uc.webview.internal;

import android.content.Context;
import android.util.AttributeSet;
import com.uc.webview.base.f;
import com.uc.webview.base.timing.StartupTimingKeys;
import com.uc.webview.base.timing.TraceEvent;
import com.uc.webview.export.WebView;
import com.uc.webview.internal.android.CookieManagerAndroid;
import com.uc.webview.internal.android.m;
import com.uc.webview.internal.android.o;
import com.uc.webview.internal.interfaces.ICookieManager;
import com.uc.webview.internal.interfaces.ICoreFactory;
import com.uc.webview.internal.interfaces.IGeolocationPermissions;
import com.uc.webview.internal.interfaces.IMimeTypeMap;
import com.uc.webview.internal.interfaces.ISdk2Core;
import com.uc.webview.internal.interfaces.IServiceWorkerController;
import com.uc.webview.internal.interfaces.IWebStorage;
import com.uc.webview.internal.interfaces.IWebView;
import com.uc.webview.internal.interfaces.IWebViewDatabase;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private static volatile ICoreFactory f14367a;

    public static boolean a() {
        return d() != null;
    }

    public static boolean b() {
        return WebView.getCoreType() == 3 && d() != null;
    }

    public static IGeolocationPermissions c(int i) {
        if (f(i)) {
            return new com.uc.webview.internal.android.b();
        }
        return d().getGeolocationPermissions();
    }

    private static ICoreFactory d() {
        if (f14367a != null) {
            return f14367a;
        }
        synchronized (b.class) {
            try {
                if (f14367a != null) {
                    return f14367a;
                }
                TraceEvent scoped = TraceEvent.scoped((int) StartupTimingKeys.INIT_CORE_FACTORY);
                f14367a = (ICoreFactory) f.b("com.uc.sdk_glue.extension.CoreFactoryImpl", "instance");
                if (scoped != null) {
                    scoped.close();
                }
                return f14367a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static IMimeTypeMap e(int i) {
        if (f(i)) {
            return new com.uc.webview.internal.android.f();
        }
        return d().getMimeTypeMap();
    }

    private static boolean f(int i) {
        e.a();
        if (i == 2) {
            return true;
        }
        return false;
    }

    public static ICookieManager a(int i) {
        if (f(i)) {
            return new CookieManagerAndroid();
        }
        return d().getCookieManager();
    }

    public static IServiceWorkerController b(int i) {
        if (f(i)) {
            return null;
        }
        return d().getServiceWorkerController();
    }

    public static ISdk2Core c() {
        if (b()) {
            return d().getSdk2CoreHost();
        }
        return null;
    }

    public static IWebView a(Context context, AttributeSet attributeSet, Map<String, Object> map) {
        return d().createWebView(context, attributeSet, map);
    }

    public static IWebViewDatabase a(Context context, int i) {
        if (f(i)) {
            return new o(context);
        }
        return d().getWebViewDatabase(context);
    }

    public static IWebStorage d(int i) {
        if (f(i)) {
            return new m();
        }
        return d().getWebStorage();
    }
}
