package com.uc.webview.internal;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import com.uc.webview.base.Log;
import com.uc.webview.internal.c;
import com.uc.webview.internal.interfaces.IPlatformPort;
import com.uc.webview.internal.interfaces.IWebView;
import com.uc.webview.internal.stats.i;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class f {
    private static c j;
    public boolean c;
    public int d = -1;
    public int e = -1;
    private Context k;
    private static final Handler g = new Handler(Looper.getMainLooper());
    private static final LinkedHashSet<IWebView> h = new LinkedHashSet<>();

    /* renamed from: a  reason: collision with root package name */
    public static final AtomicInteger f14373a = new AtomicInteger();
    public static final AtomicInteger b = new AtomicInteger();
    private static boolean i = false;
    private static final Runnable l = new Runnable() { // from class: com.uc.webview.internal.f.1
        @Override // java.lang.Runnable
        public final void run() {
            try {
                Iterator it = f.h.iterator();
                while (it.hasNext()) {
                    if (((IWebView) it.next()).getView().getWindowVisibility() == 0) {
                        return;
                    }
                }
                if (f.i) {
                    boolean unused = f.i = false;
                    Log.d("WebViewStatusMonitor", "onPause");
                    IPlatformPort iPlatformPort = IPlatformPort.Instance.get();
                    if (iPlatformPort != null) {
                        iPlatformPort.onPause();
                    }
                    i.a().a(false);
                }
            } catch (Throwable unused2) {
            }
        }
    };
    public static final a f = new a((byte) 0);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class b implements c.a {
        private Context b;

        public b(Context context) {
            this.b = context.getApplicationContext();
        }

        private static void d() {
            Log.d("WebViewStatusMonitor", "onScreenUnLock");
            IPlatformPort iPlatformPort = IPlatformPort.Instance.get();
            if (iPlatformPort != null) {
                iPlatformPort.onScreenUnLock();
                iPlatformPort.onResume();
            }
        }

        @Override // com.uc.webview.internal.c.a
        public final void a() {
            Log.d("WebViewStatusMonitor", "onScreenOn");
            c unused = f.j;
            if (!c.a(this.b)) {
                d();
            }
        }

        @Override // com.uc.webview.internal.c.a
        public final void b() {
            Log.d("WebViewStatusMonitor", "onScreenOff");
            Log.d("WebViewStatusMonitor", "onScreenLock");
            IPlatformPort iPlatformPort = IPlatformPort.Instance.get();
            if (iPlatformPort != null) {
                iPlatformPort.onScreenLock();
                iPlatformPort.onPause();
            }
        }

        @Override // com.uc.webview.internal.c.a
        public final void c() {
            Log.d("WebViewStatusMonitor", "onUserPresent");
            d();
        }
    }

    public f(Context context, IWebView iWebView) {
        this.k = context;
        boolean z = iWebView.getExtension() != null;
        this.c = z;
        if (z && j == null) {
            c cVar = new c(context);
            j = cVar;
            cVar.b = new b(context);
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            cVar.f14368a.registerReceiver(cVar, intentFilter);
            if (c.a((PowerManager) cVar.f14368a.getSystemService("power"))) {
                c.a aVar = cVar.b;
                if (aVar != null) {
                    aVar.a();
                    return;
                }
                return;
            }
            c.a aVar2 = cVar.b;
            if (aVar2 != null) {
                aVar2.b();
            }
        }
    }

    public static String a(IWebView iWebView) {
        String url = iWebView.getUrl();
        if (url == null || url.isEmpty()) {
            return Integer.toHexString(iWebView.hashCode());
        }
        if (url.length() > 40) {
            return url.substring(0, 40) + "...@" + Integer.toHexString(iWebView.hashCode());
        }
        return url + "@" + Integer.toHexString(iWebView.hashCode());
    }

    public static void b(IWebView iWebView) {
        Log.d("WebViewStatusMonitor", "onAttachedToWindow webview: " + a(iWebView));
        h.add(iWebView);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final AtomicBoolean f14374a;

        private a() {
            this.f14374a = new AtomicBoolean(false);
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    public static void c(IWebView iWebView) {
        Log.d("WebViewStatusMonitor", "onDetachedFromWindow webview: " + a(iWebView));
        LinkedHashSet<IWebView> linkedHashSet = h;
        linkedHashSet.remove(iWebView);
        if (linkedHashSet.isEmpty()) {
            i.a().a(true);
        }
    }

    public static void b() {
        int i2 = b.get();
        int i3 = f14373a.get();
        com.uc.webview.base.b.a("wk_exportWebview", String.format(Locale.CHINA, "total:%d, u4:%d, system:%d", Integer.valueOf(i2 + i3), Integer.valueOf(i2), Integer.valueOf(i3)));
    }

    public static void a(IWebView iWebView, int i2) {
        Log.d("WebViewStatusMonitor", "onWindowVisibilityChanged webview: " + a(iWebView) + ", visibility: " + i2);
        if (i2 == 0) {
            if (!i) {
                i = true;
                Log.d("WebViewStatusMonitor", "onResume, " + a(iWebView));
                IPlatformPort iPlatformPort = IPlatformPort.Instance.get();
                if (iPlatformPort != null) {
                    iPlatformPort.onResume();
                }
            }
        } else if (i) {
            Handler handler = g;
            Runnable runnable = l;
            handler.removeCallbacks(runnable);
            handler.post(runnable);
        }
    }

    public static IPlatformPort a() {
        return IPlatformPort.Instance.get();
    }
}
