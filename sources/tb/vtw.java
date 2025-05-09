package tb;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.WXSDKInstance;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class vtw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Object f30253a;

    static {
        t2o.a(416284698);
    }

    public vtw(Context context) {
        if (context != null) {
            try {
                this.f30253a = Class.forName("com.taobao.weex.analyzer.WeexDevOptions").getDeclaredConstructor(Context.class).newInstance(context);
            } catch (Exception unused) {
            }
        }
    }

    public void a() {
        Object obj = this.f30253a;
        if (obj != null) {
            try {
                obj.getClass().getDeclaredMethod("onCreate", new Class[0]).invoke(obj, new Object[0]);
            } catch (Exception unused) {
            }
        }
    }

    public void b(WXSDKInstance wXSDKInstance, String str, String str2) {
        Object obj = this.f30253a;
        if (obj != null) {
            if (!TextUtils.isEmpty(str) || !TextUtils.isEmpty(str2)) {
                try {
                    obj.getClass().getDeclaredMethod("onException", WXSDKInstance.class, String.class, String.class).invoke(obj, wXSDKInstance, str, str2);
                } catch (Exception unused) {
                }
            }
        }
    }

    public void c(WXSDKInstance wXSDKInstance) {
        Object obj = this.f30253a;
        if (!(obj == null || wXSDKInstance == null)) {
            try {
                obj.getClass().getDeclaredMethod("onWeexRenderSuccess", WXSDKInstance.class).invoke(obj, wXSDKInstance);
            } catch (Exception unused) {
            }
        }
    }

    public View d(WXSDKInstance wXSDKInstance, View view) {
        Object obj = this.f30253a;
        if (obj == null || wXSDKInstance == null || view == null) {
            return null;
        }
        try {
            return (View) obj.getClass().getDeclaredMethod("onWeexViewCreated", WXSDKInstance.class, View.class).invoke(obj, wXSDKInstance, view);
        } catch (Exception unused) {
            return view;
        }
    }
}
