package tb;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.WXSDKInstance;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class ttw {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static volatile ttw b;

    /* renamed from: a  reason: collision with root package name */
    public volatile Object f28956a;

    static {
        t2o.a(442499281);
    }

    public static synchronized ttw a() {
        synchronized (ttw.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ttw) ipChange.ipc$dispatch("3caa5ab4", new Object[0]);
            }
            if (b == null) {
                b = new ttw();
            }
            return b;
        }
    }

    public void b(Context context) {
        if (context != null && yv6.b(context)) {
            try {
                this.f28956a = Class.forName("com.taobao.weex.analyzer.WeexDevOptions").getDeclaredConstructor(Context.class).newInstance(context);
            } catch (Throwable th) {
                Log.e("SKU WXAnalyzerDelegate", th.toString());
            }
        }
    }

    public void c() {
        if (this.f28956a != null) {
            try {
                this.f28956a.getClass().getDeclaredMethod("onCreate", new Class[0]).invoke(this.f28956a, new Object[0]);
            } catch (Throwable th) {
                Log.e("SKU WXAnalyzerDelegate", th.toString());
            }
        }
    }

    public void d() {
        if (this.f28956a != null) {
            try {
                this.f28956a.getClass().getDeclaredMethod("onDestroy", new Class[0]).invoke(this.f28956a, new Object[0]);
            } catch (Throwable th) {
                Log.e("SKU WXAnalyzerDelegate", th.toString());
            }
            b = null;
        }
    }

    public void f() {
        if (this.f28956a != null) {
            try {
                this.f28956a.getClass().getDeclaredMethod("onPause", new Class[0]).invoke(this.f28956a, new Object[0]);
            } catch (Throwable th) {
                Log.e("SKU WXAnalyzerDelegate", th.toString());
            }
        }
    }

    public void g() {
        if (this.f28956a != null) {
            try {
                this.f28956a.getClass().getDeclaredMethod("onResume", new Class[0]).invoke(this.f28956a, new Object[0]);
            } catch (Throwable th) {
                Log.e("SKU WXAnalyzerDelegate", th.toString());
            }
        }
    }

    public void h() {
        if (this.f28956a != null) {
            try {
                this.f28956a.getClass().getDeclaredMethod("onStart", new Class[0]).invoke(this.f28956a, new Object[0]);
            } catch (Throwable th) {
                Log.e("SKU WXAnalyzerDelegate", th.toString());
            }
        }
    }

    public void i() {
        if (this.f28956a != null) {
            try {
                this.f28956a.getClass().getDeclaredMethod("onStop", new Class[0]).invoke(this.f28956a, new Object[0]);
            } catch (Throwable th) {
                Log.e("SKU WXAnalyzerDelegate", th.toString());
            }
        }
    }

    public void j(WXSDKInstance wXSDKInstance) {
        if (this.f28956a != null && wXSDKInstance != null) {
            try {
                this.f28956a.getClass().getDeclaredMethod("onWeexRenderSuccess", WXSDKInstance.class).invoke(this.f28956a, wXSDKInstance);
            } catch (Throwable th) {
                Log.e("SKU WXAnalyzerDelegate", th.toString());
            }
        }
    }

    public View k(WXSDKInstance wXSDKInstance, View view) {
        if (this.f28956a == null || wXSDKInstance == null || view == null) {
            return null;
        }
        try {
            return (View) this.f28956a.getClass().getDeclaredMethod("onWeexViewCreated", WXSDKInstance.class, View.class).invoke(this.f28956a, wXSDKInstance, view);
        } catch (Throwable th) {
            Log.e("SKU WXAnalyzerDelegate", th.toString());
            return view;
        }
    }

    public void e(WXSDKInstance wXSDKInstance, String str, String str2) {
        if (this.f28956a != null) {
            if (!TextUtils.isEmpty(str) || !TextUtils.isEmpty(str2)) {
                try {
                    this.f28956a.getClass().getDeclaredMethod("onException", WXSDKInstance.class, String.class, String.class).invoke(this.f28956a, wXSDKInstance, str, str2);
                } catch (Throwable th) {
                    Log.e("SKU WXAnalyzerDelegate", th.toString());
                }
            }
        }
    }
}
