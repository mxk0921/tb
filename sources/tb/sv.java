package tb;

import android.app.Activity;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.icart.BaseICartFragmentProxy;
import com.taobao.android.icart.weex.call.CartMegaManager;
import com.taobao.android.icart.weex.call.callback.CartCallbackManager;
import com.taobao.android.megadesign.view.LoadingView;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public abstract class sv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(478150921);
    }

    public sv(CartMegaManager.InstanceType instanceType) {
        ckf.g(instanceType, "instanceType");
    }

    public abstract void a();

    public abstract void b();

    public abstract void c(String str, String str2, String str3, JSONObject jSONObject);

    public abstract void d(String str);

    public abstract void e(String str);

    public abstract Activity f();

    public abstract CartCallbackManager g();

    public abstract Fragment h();

    public abstract LoadingView i();

    public abstract ViewGroup j();

    public abstract plq k();

    public abstract boolean l();

    public abstract boolean m();

    public abstract boolean n();

    public abstract void o(BaseICartFragmentProxy.a aVar);

    public abstract void p(boolean z);

    public abstract void q(plq plqVar);

    public abstract void r(BaseICartFragmentProxy.a aVar);
}
