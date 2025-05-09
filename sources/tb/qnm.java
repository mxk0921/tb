package tb;

import android.app.Application;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.icart.weex.instance.BaseHybridInstance;
import com.taobao.android.icart.weex.prefetch.NextRPCPrefetch;
import com.taobao.android.icart.weex.utils.OrangeUtil;
import com.taobao.android.weex.WeexInstance;
import com.taobao.android.weex.WeexInstanceMode;
import com.taobao.android.weex.WeexRenderType;
import com.taobao.android.weex.config.WeexInstanceConfig;
import com.taobao.android.weex.config.WeexUnicornConfig;
import com.taobao.tao.Globals;
import tb.b6x;
import tb.m9u;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class qnm extends BaseHybridInstance {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class a extends BaseHybridInstance.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ boolean c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z) {
            super();
            this.c = z;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            if (str.hashCode() == -1542135199) {
                super.K1((WeexInstance) objArr[0], ((Boolean) objArr[1]).booleanValue());
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/icart/weex/instance/PreRenderWeexInstance$onCreate$1");
        }

        @Override // com.taobao.android.icart.weex.instance.BaseHybridInstance.b, tb.j6x
        public void K1(WeexInstance weexInstance, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a414e261", new Object[]{this, weexInstance, new Boolean(z)});
                return;
            }
            super.K1(weexInstance, z);
            if (n7v.a()) {
                z4v.a(Globals.getApplication(), "购物车weex预热成功");
            }
            if (this.c) {
                NextRPCPrefetch.INSTANCE.l(qnm.this.z());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class b implements b6x {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // tb.b6x
        public final void a(b6x.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("17d54df9", new Object[]{this, aVar});
                return;
            }
            m9u.a aVar2 = m9u.Companion;
            aVar2.a("Cart#InstanceCreatedAcceptInMain");
            qnm qnmVar = qnm.this;
            ckf.f(aVar, "result");
            qnmVar.p(aVar);
            aVar2.b("Cart#InstanceCreatedAcceptInMain");
        }
    }

    static {
        t2o.a(478151016);
    }

    public qnm() {
        super(true);
    }

    public static /* synthetic */ Object ipc$super(qnm qnmVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/icart/weex/instance/PreRenderWeexInstance");
    }

    @Override // tb.j2e
    public String name() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aa84494e", new Object[]{this});
        }
        return "PreRenderWeexInstance";
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
        aVar.a("Cart#PreRenderWeexInstanceCreate");
        long currentTimeMillis = System.currentTimeMillis();
        Application application = Globals.getApplication();
        int s = pb6.s(application);
        int w = w();
        hav.d(c9x.TAG, "开始构建预热实例 height=" + w);
        d5x d = com.taobao.android.weex.b.d();
        WeexInstanceMode weexInstanceMode = WeexInstanceMode.DOM;
        if (!d.k(weexInstanceMode)) {
            A().M(System.currentTimeMillis());
            com.taobao.android.weex.b.d().a(weexInstanceMode, Globals.getApplication());
            A().L(System.currentTimeMillis());
        }
        jt2 a2 = gd4.INSTANCE.a(A());
        boolean isEmpty = a2.a().isEmpty();
        J(OrangeUtil.INSTANCE.isPrefetchQueryForClick());
        String t = t(str + "&is_pre_render=true&isPrefetchQueryForPreRender=" + isEmpty, a2);
        WeexInstanceConfig weexInstanceConfig = new WeexInstanceConfig();
        weexInstanceConfig.t(WeexInstanceConfig.WeexEmbedPresentMode.WeexEmbedPresentModePage);
        WeexUnicornConfig weexUnicornConfig = new WeexUnicornConfig();
        weexUnicornConfig.i(WeexUnicornConfig.RenderMode.image);
        weexInstanceConfig.s(weexUnicornConfig);
        if (l()) {
            weexInstanceConfig.p(true);
        }
        t5x b2 = com.taobao.android.weex.b.b(application, t, weexInstanceMode, WeexRenderType.UNICORN, x(), weexInstanceConfig);
        b2.c(s, w);
        byte[] b3 = a2.b();
        if (b3 != null) {
            if (b3.length == 0) {
                z2 = true;
                z = true;
            } else {
                z2 = true;
                z = false;
            }
            if ((!z) == z2) {
                b2.initWithData(a2.b(), t);
                b2.addInstanceListener(new a(isEmpty));
                b2.render(s(a2));
                A().K(System.currentTimeMillis());
                b2.b(new b());
                A().n(System.currentTimeMillis() - currentTimeMillis);
                ine.INSTANCE.d(z());
                aVar.b("Cart#PreRenderWeexInstanceCreate");
                return null;
            }
        }
        b2.initWithURL(t);
        hav.d(c9x.TAG, "未获取到资源，使用initWithURL");
        E();
        b2.addInstanceListener(new a(isEmpty));
        b2.render(s(a2));
        A().K(System.currentTimeMillis());
        b2.b(new b());
        A().n(System.currentTimeMillis() - currentTimeMillis);
        ine.INSTANCE.d(z());
        aVar.b("Cart#PreRenderWeexInstanceCreate");
        return null;
    }
}
