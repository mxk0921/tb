package tb;

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.WXSDKInstance;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class stw {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static boolean b = true;

    /* renamed from: a  reason: collision with root package name */
    public final Object f28272a;

    static {
        t2o.a(764412011);
    }

    public stw(Context context) {
        if (context != null && b) {
            try {
                this.f28272a = Class.forName("com.taobao.weex.analyzer.WeexDevOptions").getDeclaredConstructor(Context.class).newInstance(context);
            } catch (Exception unused) {
                b = false;
            }
        }
    }

    public void a() {
        Object obj = this.f28272a;
        if (obj != null) {
            try {
                obj.getClass().getDeclaredMethod("onCreate", new Class[0]).invoke(obj, new Object[0]);
            } catch (Exception unused) {
            }
        }
    }

    public void b() {
        Object obj = this.f28272a;
        if (obj != null) {
            try {
                obj.getClass().getDeclaredMethod("onDestroy", new Class[0]).invoke(obj, new Object[0]);
            } catch (Exception unused) {
            }
        }
    }

    public void d() {
        Object obj = this.f28272a;
        if (obj != null) {
            try {
                obj.getClass().getDeclaredMethod("onPause", new Class[0]).invoke(obj, new Object[0]);
            } catch (Exception unused) {
            }
        }
    }

    public void f() {
        Object obj = this.f28272a;
        if (obj != null) {
            try {
                obj.getClass().getDeclaredMethod("onResume", new Class[0]).invoke(obj, new Object[0]);
            } catch (Exception unused) {
            }
        }
    }

    public void g() {
        Object obj = this.f28272a;
        if (obj != null) {
            try {
                obj.getClass().getDeclaredMethod("onStart", new Class[0]).invoke(obj, new Object[0]);
            } catch (Exception unused) {
            }
        }
    }

    public void h() {
        Object obj = this.f28272a;
        if (obj != null) {
            try {
                obj.getClass().getDeclaredMethod("onStop", new Class[0]).invoke(obj, new Object[0]);
            } catch (Exception unused) {
            }
        }
    }

    public void e(MotionEvent motionEvent) {
        Object obj = this.f28272a;
        if (obj != null) {
            try {
                obj.getClass().getDeclaredMethod("onReceiveTouchEvent", MotionEvent.class).invoke(obj, motionEvent);
            } catch (Exception unused) {
            }
        }
    }

    public void i(WXSDKInstance wXSDKInstance) {
        Object obj = this.f28272a;
        if (!(obj == null || wXSDKInstance == null)) {
            try {
                obj.getClass().getDeclaredMethod("onWeexRenderSuccess", WXSDKInstance.class).invoke(obj, wXSDKInstance);
            } catch (Exception unused) {
            }
        }
    }

    public View j(WXSDKInstance wXSDKInstance, View view) {
        Object obj = this.f28272a;
        if (obj == null || wXSDKInstance == null || view == null) {
            return null;
        }
        try {
            return (View) obj.getClass().getDeclaredMethod("onWeexViewCreated", WXSDKInstance.class, View.class).invoke(obj, wXSDKInstance, view);
        } catch (Exception unused) {
            return view;
        }
    }

    public void c(WXSDKInstance wXSDKInstance, String str, String str2) {
        Object obj = this.f28272a;
        if (obj != null) {
            if ("WX_ERR_RELOAD_PAGE".equals(str) && str2.contains("jsc reboot")) {
                return;
            }
            if (!TextUtils.isEmpty(str) || !TextUtils.isEmpty(str2)) {
                try {
                    obj.getClass().getDeclaredMethod("onException", WXSDKInstance.class, String.class, String.class).invoke(obj, wXSDKInstance, str, str2);
                } catch (Exception unused) {
                }
            }
        }
    }
}
