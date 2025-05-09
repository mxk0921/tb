package tb;

import android.os.Handler;
import android.os.HandlerThread;
import android.taobao.windvane.extra.WVPerformanceListenerManager;
import android.taobao.windvane.extra.uc.preRender.BasePreInitManager;
import android.text.TextUtils;
import androidx.collection.LruCache;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.riverlogger.RVLLevel;
import com.uc.webview.export.WebView;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class xru {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static xru i;

    /* renamed from: a  reason: collision with root package name */
    public final Handler f31559a;
    public final StringBuffer b = new StringBuffer();
    public final LruCache<String, String> c = new LruCache<>(10);
    public String d = "";
    public String e = "";
    public String f = "";
    public int g = -1;
    public final int h = 1000;
    public static final String TAG = xru.class.getSimpleName();
    public static long j = 0;
    public static final Runnable k = new a();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                xru.a(xru.d());
            }
        }
    }

    static {
        t2o.a(989856193);
    }

    public xru() {
        this.f31559a = null;
        HandlerThread a2 = wsa.a("UC_HA");
        a2.start();
        this.f31559a = new Handler(a2.getLooper());
    }

    public static /* synthetic */ void a(xru xruVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e34997d0", new Object[]{xruVar});
        } else {
            xruVar.b();
        }
    }

    public static xru d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xru) ipChange.ipc$dispatch("569d0169", new Object[0]);
        }
        if (i == null) {
            synchronized (xru.class) {
                try {
                    if (i == null) {
                        i = new xru();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return i;
    }

    public final void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a02127e2", new Object[]{this});
        } else {
            this.f31559a.removeCallbacks(k);
        }
    }

    public void f(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16fd4a0", new Object[]{this, str, str2});
        } else {
            this.c.put(str, str2);
        }
    }

    public void g(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f349a46a", new Object[]{this, str, str2});
            return;
        }
        b();
        this.e = str;
        j = System.currentTimeMillis();
        this.f = str2;
    }

    public void h(String str, int i2, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d0f0dba", new Object[]{this, str, new Integer(i2), str2});
        } else if (!e(i2, str2)) {
            Handler handler = this.f31559a;
            Runnable runnable = k;
            handler.removeCallbacks(runnable);
            if (!TextUtils.equals(this.d, str2)) {
                if (!TextUtils.isEmpty(this.d)) {
                    b();
                }
                this.d = str2;
            }
            this.g = i2;
            this.f31559a.postDelayed(runnable, this.h);
            StringBuffer stringBuffer = this.b;
            stringBuffer.append(str);
            stringBuffer.append("\n");
        }
    }

    public void i(WebView webView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6bb6f9c", new Object[]{this, webView});
        } else {
            new WeakReference(webView);
        }
    }

    public final void b() {
        String str;
        String str2;
        aka b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a545d345", new Object[]{this});
        } else if (!TextUtils.isEmpty(this.b) && !bsw.b().a().a()) {
            HashMap hashMap = new HashMap();
            String str3 = this.d;
            if (str3 != null) {
                str = this.c.remove(str3);
            } else {
                str = this.e;
            }
            hashMap.put("url", str);
            hashMap.put("error", this.b.toString());
            if (this.g == 0 && !TextUtils.isEmpty(str) && (b = bka.c().b(str)) != null) {
                String str4 = TAG;
                v7t.l(str4, "found grey page: " + str);
                hashMap.put(aka.KEY_AIR_TAG, b.a());
            }
            if (this.g == 0) {
                vpw.b();
                wpw wpwVar = vpw.commonConfig;
                if (wpwVar.E0) {
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put("url", str);
                    hashMap2.put("time", String.valueOf(System.currentTimeMillis()));
                    WVPerformanceListenerManager.getInstance().onWhitePageOccur(hashMap2);
                    if (wpwVar.c1) {
                        lcn.a(RVLLevel.Warn, "WindVane/Page").j("pageEmpty").a("url", str).f();
                    }
                }
            }
            int i2 = this.g;
            if (i2 == 0) {
                if (trw.getWVWhitePageMonitorInterface() != null) {
                    trw.getWVWhitePageMonitorInterface().onOccurWhitePage(str, null);
                }
                str2 = "TEMP_H5_ERROR_EVENT";
            } else if (i2 == 1) {
                str2 = "WindVane.UCHAR";
            } else if (i2 == 2) {
                str2 = "WindVane.BlackScreen";
            } else if (i2 != 3) {
                str2 = "";
            } else {
                str2 = "WindVane.Memory";
            }
            if (!TextUtils.isEmpty(str2)) {
                sqw.a(str2, str, String.valueOf(j), this.f, hashMap);
            }
            StringBuffer stringBuffer = this.b;
            stringBuffer.delete(0, stringBuffer.length());
            c();
        }
    }

    public final boolean e(int i2, String str) {
        Throwable th;
        String str2;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ad60b12c", new Object[]{this, new Integer(i2), str})).booleanValue();
        }
        if (i2 == 0) {
            try {
                if (vpw.commonConfig.M) {
                    if (str != null) {
                        str2 = this.c.get(str);
                    } else {
                        str2 = this.e;
                    }
                    if (TextUtils.isEmpty(str2) || !str2.contains(BasePreInitManager.PRE_RENDER_URL_ADDITION_JUDGE)) {
                        String str3 = TAG;
                        v7t.d(str3, "upload white page :" + str2);
                    } else {
                        try {
                            v7t.d(TAG, "IPreRenderWebView skip upload white page");
                            return true;
                        } catch (Throwable th2) {
                            th = th2;
                            th.printStackTrace();
                            return z;
                        }
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                z = false;
            }
        }
        return false;
    }
}
