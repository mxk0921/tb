package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class rtw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Object f27609a;

    public rtw(Context context) {
        if (context != null) {
            try {
                this.f27609a = Class.forName("com.taobao.weex.analyzer.WeexDevOptions").getDeclaredConstructor(Context.class).newInstance(context);
            } catch (Exception unused) {
            }
        }
    }

    public void a() {
        Object obj = this.f27609a;
        if (obj != null) {
            try {
                obj.getClass().getDeclaredMethod("onCreate", new Class[0]).invoke(obj, new Object[0]);
            } catch (Exception unused) {
            }
        }
    }

    public void b() {
        Object obj = this.f27609a;
        if (obj != null) {
            try {
                obj.getClass().getDeclaredMethod("onDestroy", new Class[0]).invoke(obj, new Object[0]);
            } catch (Exception unused) {
            }
        }
    }

    public void c() {
        Object obj = this.f27609a;
        if (obj != null) {
            try {
                obj.getClass().getDeclaredMethod("onPause", new Class[0]).invoke(obj, new Object[0]);
            } catch (Exception unused) {
            }
        }
    }

    public void d() {
        Object obj = this.f27609a;
        if (obj != null) {
            try {
                obj.getClass().getDeclaredMethod("onResume", new Class[0]).invoke(obj, new Object[0]);
            } catch (Exception unused) {
            }
        }
    }

    public void e() {
        Object obj = this.f27609a;
        if (obj != null) {
            try {
                obj.getClass().getDeclaredMethod("onStart", new Class[0]).invoke(obj, new Object[0]);
            } catch (Exception unused) {
            }
        }
    }

    public void f() {
        Object obj = this.f27609a;
        if (obj != null) {
            try {
                obj.getClass().getDeclaredMethod("onStop", new Class[0]).invoke(obj, new Object[0]);
            } catch (Exception unused) {
            }
        }
    }
}
