package com.taobao.android.order.bundle.weex2;

import android.content.Context;
import android.content.res.Resources;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.utils.HybridPreRenderHelper;
import com.alipay.mobile.verifyidentity.common.ModuleConstants;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex.WeexInstance;
import com.taobao.android.weex.WeexInstanceMode;
import com.taobao.android.weex.WeexRenderType;
import com.taobao.android.weex.config.WeexInstanceConfig;
import com.taobao.android.weex.config.WeexUnicornConfig;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import tb.b6x;
import tb.ckf;
import tb.dbv;
import tb.ge1;
import tb.hav;
import tb.lbv;
import tb.mgw;
import tb.pb6;
import tb.t2o;
import tb.t5x;
import tb.xcv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class AsyncInstanceLoadManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final AsyncInstanceLoadManager INSTANCE = new AsyncInstanceLoadManager();

    /* renamed from: a  reason: collision with root package name */
    public static volatile LoadState f9109a = LoadState.INIT;
    public static t5x.a b;
    public static WeexInstance c;
    public static boolean d;
    public static a e;

    /* compiled from: Taobao */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/taobao/android/order/bundle/weex2/AsyncInstanceLoadManager$LoadState;", "", "(Ljava/lang/String;I)V", ModuleConstants.VI_MODULE_NAME_INIT, "LOADING", "SUCCESS", "FAIL", "taobao-order-bundle_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public enum LoadState {
        INIT,
        LOADING,
        SUCCESS,
        FAIL;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(LoadState loadState, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/order/bundle/weex2/AsyncInstanceLoadManager$LoadState");
        }

        public static LoadState valueOf(String str) {
            Object valueOf;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                valueOf = ipChange.ipc$dispatch("22568018", new Object[]{str});
            } else {
                valueOf = Enum.valueOf(LoadState.class, str);
            }
            return (LoadState) valueOf;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface a {
        void a();

        void b(WeexInstance weexInstance);

        void c(WeexInstance weexInstance);
    }

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ltb/b6x$a;", "kotlin.jvm.PlatformType", "instance", "Ltb/xhv;", "onInstanceCreatedInMain", "(Ltb/b6x$a;)V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class b implements b6x {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f9110a;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
        public static final class a implements xcv {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // tb.xcv
            public void n0(String str, String str2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("1435fd2c", new Object[]{this, str, str2});
                } else {
                    AsyncInstanceLoadManager.b(AsyncInstanceLoadManager.INSTANCE, false);
                }
            }

            @Override // tb.xcv
            public void S() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("1a730856", new Object[]{this});
                    return;
                }
                hav.d("TBRefundInstanceManager", "step4 ---------实例传入bizReady回调");
                AsyncInstanceLoadManager asyncInstanceLoadManager = AsyncInstanceLoadManager.INSTANCE;
                AsyncInstanceLoadManager.b(asyncInstanceLoadManager, true);
                a f = asyncInstanceLoadManager.f();
                if (f != null) {
                    f.b(AsyncInstanceLoadManager.a(asyncInstanceLoadManager));
                }
                asyncInstanceLoadManager.k(null);
            }
        }

        public b(Context context) {
            this.f9110a = context;
        }

        @Override // tb.b6x
        public final void a(b6x.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("17d54df9", new Object[]{this, aVar});
                return;
            }
            AsyncInstanceLoadManager asyncInstanceLoadManager = AsyncInstanceLoadManager.INSTANCE;
            AsyncInstanceLoadManager.d(asyncInstanceLoadManager, aVar != null ? aVar.b(this.f9110a) : null);
            if (AsyncInstanceLoadManager.a(asyncInstanceLoadManager) == null) {
                AsyncInstanceLoadManager.c(asyncInstanceLoadManager, LoadState.FAIL);
                return;
            }
            hav.d("TBRefundInstanceManager", "step4 ---------实例创建成功");
            AsyncInstanceLoadManager.c(asyncInstanceLoadManager, LoadState.SUCCESS);
            a f = asyncInstanceLoadManager.f();
            if (f != null) {
                f.c(AsyncInstanceLoadManager.a(asyncInstanceLoadManager));
            }
            a aVar2 = new a();
            WeexInstance a2 = AsyncInstanceLoadManager.a(asyncInstanceLoadManager);
            if (a2 != null) {
                a2.setTag("bizLifecycleListener", aVar2);
            }
        }
    }

    static {
        t2o.a(713031941);
    }

    public static final /* synthetic */ WeexInstance a(AsyncInstanceLoadManager asyncInstanceLoadManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexInstance) ipChange.ipc$dispatch("a0ed788c", new Object[]{asyncInstanceLoadManager});
        }
        return c;
    }

    public static final /* synthetic */ void b(AsyncInstanceLoadManager asyncInstanceLoadManager, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27cb2ff8", new Object[]{asyncInstanceLoadManager, new Boolean(z)});
        } else {
            d = z;
        }
    }

    public static final /* synthetic */ void c(AsyncInstanceLoadManager asyncInstanceLoadManager, LoadState loadState) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9bcacff9", new Object[]{asyncInstanceLoadManager, loadState});
        } else {
            f9109a = loadState;
        }
    }

    public static final /* synthetic */ void d(AsyncInstanceLoadManager asyncInstanceLoadManager, WeexInstance weexInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("702b12", new Object[]{asyncInstanceLoadManager, weexInstance});
        } else {
            c = weexInstance;
        }
    }

    @JvmStatic
    public static final int h(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7d8db1ae", new Object[]{context})).intValue();
        }
        ckf.g(context, "context");
        return mgw.e(context) + pb6.c(context, 85.0f);
    }

    @JvmStatic
    public static final void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[0]);
            return;
        }
        hav.d("TBRefundInstanceManager", " ---------调用onDestroy，重置所有状态");
        c = null;
        b = null;
        e = null;
        d = false;
        f9109a = LoadState.INIT;
    }

    @JvmStatic
    public static final void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f760d335", new Object[0]);
            return;
        }
        hav.d("TBRefundInstanceManager", " ---------取消异步创建预热实例，onTouchCancel操作");
        WeexInstance weexInstance = c;
        if (weexInstance != null) {
            weexInstance.destroy();
        }
        j();
    }

    public final a f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("269b05d7", new Object[]{this});
        }
        return e;
    }

    public final LoadState g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LoadState) ipChange.ipc$dispatch("df624748", new Object[]{this});
        }
        return f9109a;
    }

    public final void k(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("355ba297", new Object[]{this, aVar});
        } else {
            e = aVar;
        }
    }

    public final void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7dd82042", new Object[]{this});
            return;
        }
        t5x.a aVar = b;
        if (aVar != null) {
            aVar.a();
        }
    }

    public final void e(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9a33093", new Object[]{this, context});
            return;
        }
        ckf.g(context, "context");
        hav.d("TBRefundInstanceManager", "step1 ---------异步创建预热实例");
        d = false;
        f9109a = LoadState.LOADING;
        c = null;
        HybridPreRenderHelper.a aVar = HybridPreRenderHelper.Companion;
        String b2 = aVar.b("mytaobao", dbv.BIZ_REFUND_LIST);
        WeexUnicornConfig weexUnicornConfig = new WeexUnicornConfig();
        if (aVar.i()) {
            weexUnicornConfig.i(WeexUnicornConfig.RenderMode.surface);
        } else {
            weexUnicornConfig.i(WeexUnicornConfig.RenderMode.texture);
        }
        WeexInstanceConfig weexInstanceConfig = new WeexInstanceConfig();
        weexInstanceConfig.s(weexUnicornConfig);
        weexInstanceConfig.t(WeexInstanceConfig.WeexEmbedPresentMode.WeexEmbedPresentModePage);
        t5x b3 = com.taobao.android.weex.b.b(context, b2, WeexInstanceMode.DOM, WeexRenderType.UNICORN, null, weexInstanceConfig);
        Resources resources = context.getResources();
        ckf.f(resources, "context.resources");
        b3.c(resources.getDisplayMetrics().widthPixels, (lbv.f(context) - h(context)) - mgw.c(context));
        b3.initWithURL(b2);
        b3.render(null);
        b = b3.b(new b(context));
    }

    public final void i(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d43db52", new Object[]{this, aVar});
            return;
        }
        ckf.g(aVar, "callback");
        hav.d("TBRefundInstanceManager", "step2 ---------获取异步预热实例");
        if (b == null) {
            hav.d("TBRefundInstanceManager", "step3 ---------获取异步预热实例失败  ticket == null  ");
            aVar.a();
            return;
        }
        l();
        int i = ge1.$EnumSwitchMapping$0[f9109a.ordinal()];
        if (i == 1) {
            hav.d("TBRefundInstanceManager", "step3 ---------获取异步预热实例失败  LoadState.INIT ");
            aVar.a();
        } else if (i == 2) {
            hav.d("TBRefundInstanceManager", "step3 ---------获取异步预热实例失败  LoadState.LOADING  赋值callback ");
            e = aVar;
        } else if (i != 3) {
            hav.d("TBRefundInstanceManager", "step3 ---------获取异步预热实例失败  LoadState.Fail ");
            aVar.a();
        } else {
            aVar.c(c);
            if (d) {
                hav.d("TBRefundInstanceManager", "step3 ---------获取异步预热实例成功,并且实例已经bizReady，回调");
                aVar.b(c);
            } else {
                hav.d("TBRefundInstanceManager", "step3 ---------获取异步预热实例成功,但实例还没bizReady，传入回调");
                e = aVar;
            }
        }
        b = null;
    }
}
