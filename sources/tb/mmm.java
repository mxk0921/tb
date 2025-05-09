package tb;

import android.app.Application;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.icart.weex.instance.BaseHybridInstance;
import com.taobao.android.icart.weex.utils.OrangeUtil;
import com.taobao.android.weex.WeexInstance;
import com.taobao.android.weex.WeexInstanceMode;
import com.taobao.android.weex.WeexRenderType;
import com.taobao.android.weex.b;
import com.taobao.android.weex.config.WeexInstanceConfig;
import com.taobao.android.weex.config.WeexUnicornConfig;
import com.taobao.tao.Globals;
import tb.b6x;
import tb.m9u;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class mmm extends BaseHybridInstance {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class a implements b6x {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.b6x
        public final void a(b6x.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("17d54df9", new Object[]{this, aVar});
                return;
            }
            m9u.a aVar2 = m9u.Companion;
            aVar2.a("Cart#PreCreateInstanceCreatedInMain");
            mmm mmmVar = mmm.this;
            ckf.f(aVar, "result");
            mmmVar.p(aVar);
            aVar2.b("Cart#PreCreateInstanceCreatedInMain");
        }
    }

    static {
        t2o.a(478151014);
    }

    public mmm(boolean z) {
        super(z);
    }

    public static /* synthetic */ Object ipc$super(mmm mmmVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/icart/weex/instance/PreCreateWeexInstance");
    }

    @Override // com.taobao.android.icart.weex.instance.BaseHybridInstance, tb.j2e
    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e5b64cf1", new Object[]{this})).booleanValue();
        }
        return B();
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
        return "PreCreateWeexInstance";
    }

    @Override // com.taobao.android.icart.weex.instance.BaseHybridInstance
    public WeexInstance D(String str) {
        boolean z;
        boolean z2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexInstance) ipChange.ipc$dispatch("797b1ae8", new Object[]{this, str});
        }
        ckf.g(str, "url");
        m9u.a aVar = m9u.Companion;
        aVar.a("Cart#PreCreateWeexInstanceCreate");
        hav.d(c9x.TAG, "开始构建预创建实例");
        long currentTimeMillis = System.currentTimeMillis();
        Application application = Globals.getApplication();
        int s = pb6.s(application);
        int w = w();
        d5x d = b.d();
        WeexInstanceMode weexInstanceMode = WeexInstanceMode.DOM;
        if (!d.k(weexInstanceMode)) {
            A().M(System.currentTimeMillis());
            b.d().a(weexInstanceMode, Globals.getApplication());
            A().L(System.currentTimeMillis());
        }
        jt2 a2 = gd4.INSTANCE.a(A());
        J(OrangeUtil.INSTANCE.isPrefetchQueryForClick());
        String t = t(str, a2);
        WeexInstanceConfig weexInstanceConfig = new WeexInstanceConfig();
        weexInstanceConfig.t(WeexInstanceConfig.WeexEmbedPresentMode.WeexEmbedPresentModePage);
        WeexUnicornConfig weexUnicornConfig = new WeexUnicornConfig();
        weexUnicornConfig.i(WeexUnicornConfig.RenderMode.surface);
        weexInstanceConfig.s(weexUnicornConfig);
        if (l()) {
            weexInstanceConfig.p(true);
        }
        t5x b = b.b(application, t, weexInstanceMode, WeexRenderType.UNICORN, x(), weexInstanceConfig);
        b.c(s, w);
        byte[] b2 = a2.b();
        if (b2 != null) {
            if (b2.length == 0) {
                z2 = true;
                z = true;
            } else {
                z2 = true;
                z = false;
            }
            if ((!z) == z2) {
                b.initWithData(a2.b(), t);
                b.addInstanceListener(new BaseHybridInstance.b());
                b.render(s(a2));
                A().K(System.currentTimeMillis());
                b.b(new a());
                A().n(System.currentTimeMillis() - currentTimeMillis);
                ine.INSTANCE.d(z());
                aVar.b("Cart#PreCreateWeexInstanceCreate");
                return null;
            }
        }
        b.initWithURL(t);
        hav.d(c9x.TAG, "未获取到资源，使用initWithURL");
        E();
        b.addInstanceListener(new BaseHybridInstance.b());
        b.render(s(a2));
        A().K(System.currentTimeMillis());
        b.b(new a());
        A().n(System.currentTimeMillis() - currentTimeMillis);
        ine.INSTANCE.d(z());
        aVar.b("Cart#PreCreateWeexInstanceCreate");
        return null;
    }
}
