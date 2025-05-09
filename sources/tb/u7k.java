package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.icart.BaseICartFragmentProxy;
import com.taobao.android.icart.weex.instance.BaseHybridInstance;
import com.taobao.android.icart.weex.utils.OrangeUtil;
import com.taobao.android.weex.WeexInstance;
import com.taobao.android.weex.WeexInstanceMode;
import com.taobao.android.weex.WeexRenderType;
import com.taobao.android.weex.b;
import com.taobao.android.weex.config.WeexInstanceConfig;
import com.taobao.android.weex.config.WeexUnicornConfig;
import com.taobao.tao.Globals;
import tb.m9u;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class u7k extends BaseHybridInstance {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(478151013);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u7k(BaseICartFragmentProxy baseICartFragmentProxy, boolean z) {
        super(z);
        ckf.g(baseICartFragmentProxy, pg1.ATOM_proxy);
        H(baseICartFragmentProxy.b());
        I(baseICartFragmentProxy);
    }

    public static /* synthetic */ Object ipc$super(u7k u7kVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/icart/weex/instance/NormalWeexInstance");
    }

    public final void M(WeexInstance weexInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43bfb9d2", new Object[]{this, weexInstance});
            return;
        }
        int s = pb6.s(Globals.getApplication());
        int w = w();
        weexInstance.updateContainerSize(s, w);
        q6x q6xVar = (q6x) weexInstance.getExtend(q6x.class);
        if (q6xVar != null) {
            q6xVar.b(s, w);
        }
    }

    @Override // com.taobao.android.icart.weex.instance.BaseHybridInstance, tb.j2e
    public boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("70be4c64", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // tb.j2e
    public String name() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aa84494e", new Object[]{this});
        }
        return "NormalWeexInstance";
    }

    @Override // com.taobao.android.icart.weex.instance.BaseHybridInstance
    public WeexInstance D(String str) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexInstance) ipChange.ipc$dispatch("797b1ae8", new Object[]{this, str});
        }
        ckf.g(str, "url");
        m9u.a aVar = m9u.Companion;
        aVar.a("Cart#NormalWeexInstanceCreate");
        J(OrangeUtil.INSTANCE.isPrefetchQueryForClick());
        WeexInstanceConfig weexInstanceConfig = new WeexInstanceConfig();
        if (l()) {
            weexInstanceConfig.p(true);
        }
        weexInstanceConfig.t(WeexInstanceConfig.WeexEmbedPresentMode.WeexEmbedPresentModePage);
        WeexUnicornConfig weexUnicornConfig = new WeexUnicornConfig();
        weexUnicornConfig.i(WeexUnicornConfig.RenderMode.surface);
        weexUnicornConfig.h(true);
        weexUnicornConfig.g(-1);
        weexInstanceConfig.s(weexUnicornConfig);
        A().K(System.currentTimeMillis());
        WeexInstance a2 = b.a(y(), str, WeexInstanceMode.DOM, WeexRenderType.UNICORN, x(), weexInstanceConfig);
        A().J(System.currentTimeMillis());
        ckf.f(a2, "instance");
        M(a2);
        jt2 a3 = gd4.INSTANCE.a(A());
        String t = t(str, a3);
        a2.updateBundleUrl(t);
        byte[] b = a3.b();
        if (b != null) {
            if (b.length == 0) {
                z = true;
            }
            if (!z) {
                a2.initWithData(a3.b(), t);
                a2.addInstanceListener(new BaseHybridInstance.b());
                a2.render(s(a3));
                A().w(System.currentTimeMillis());
                A().n(System.currentTimeMillis() - A().f());
                aVar.b("Cart#NormalWeexInstanceCreate");
                return a2;
            }
        }
        a2.initWithURL(t);
        hav.d(c9x.TAG, "未获取到资源，使用initWithURL");
        E();
        a2.addInstanceListener(new BaseHybridInstance.b());
        a2.render(s(a3));
        A().w(System.currentTimeMillis());
        A().n(System.currentTimeMillis() - A().f());
        aVar.b("Cart#NormalWeexInstanceCreate");
        return a2;
    }
}
