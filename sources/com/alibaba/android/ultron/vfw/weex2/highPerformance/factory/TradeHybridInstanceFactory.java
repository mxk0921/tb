package com.alibaba.android.ultron.vfw.weex2.highPerformance.factory;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.utils.UltronTradeHybridSwitcherHelper;
import com.alibaba.fastjson.JSON;
import com.alipay.mobile.verifyidentity.common.ModuleConstants;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex.WeexInstance;
import com.taobao.android.weex.WeexInstanceImpl;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import tb.b6x;
import tb.ckf;
import tb.hav;
import tb.lbv;
import tb.m8v;
import tb.nbv;
import tb.njg;
import tb.ocu;
import tb.pav;
import tb.t2o;
import tb.t5x;
import tb.tvh;
import tb.v9v;
import tb.xcv;
import tb.yz3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class TradeHybridInstanceFactory {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final TradeHybridInstanceFactory INSTANCE = new TradeHybridInstanceFactory();

    /* renamed from: a  reason: collision with root package name */
    public static final ConcurrentHashMap<String, AsyncInsLoadState> f2369a = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<String, t5x.a> b = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<String, com.taobao.android.weex_framework.a> c = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<String, Boolean> d = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<String, a> e = new ConcurrentHashMap<>();
    public static final njg f = kotlin.a.b(TradeHybridInstanceFactory$hitRenderPathList$2.INSTANCE);

    /* compiled from: Taobao */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/alibaba/android/ultron/vfw/weex2/highPerformance/factory/TradeHybridInstanceFactory$AsyncInsLoadState;", "", "(Ljava/lang/String;I)V", ModuleConstants.VI_MODULE_NAME_INIT, "LOADING", "SUCCESS", "FAIL", "ultron-view-kit_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public enum AsyncInsLoadState {
        INIT,
        LOADING,
        SUCCESS,
        FAIL;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(AsyncInsLoadState asyncInsLoadState, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/ultron/vfw/weex2/highPerformance/factory/TradeHybridInstanceFactory$AsyncInsLoadState");
        }

        public static AsyncInsLoadState valueOf(String str) {
            Object valueOf;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                valueOf = ipChange.ipc$dispatch("d5ac549a", new Object[]{str});
            } else {
                valueOf = Enum.valueOf(AsyncInsLoadState.class, str);
            }
            return (AsyncInsLoadState) valueOf;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public interface a {
        void a();

        void b(com.taobao.android.weex_framework.a aVar);

        void c(com.taobao.android.weex_framework.a aVar);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class b implements b6x {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f2370a;
        public final /* synthetic */ String b;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
        public static final class a implements xcv {
            public static volatile transient /* synthetic */ IpChange $ipChange;
            public final /* synthetic */ tvh b;

            public a(tvh tvhVar) {
                this.b = tvhVar;
            }

            @Override // tb.xcv
            public void S() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("1a730856", new Object[]{this});
                    return;
                }
                hav.d("TradeHybridInstanceLoadManager", "实例传入bizReady回调");
                TradeHybridInstanceFactory tradeHybridInstanceFactory = TradeHybridInstanceFactory.INSTANCE;
                TradeHybridInstanceFactory.e(tradeHybridInstanceFactory).put(b.this.b, Boolean.TRUE);
                a aVar = (a) TradeHybridInstanceFactory.a(tradeHybridInstanceFactory).remove(b.this.b);
                if (aVar != null) {
                    aVar.c(this.b);
                }
            }

            @Override // tb.xcv
            public void n0(String str, String str2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("1435fd2c", new Object[]{this, str, str2});
                } else {
                    TradeHybridInstanceFactory.e(TradeHybridInstanceFactory.INSTANCE).put(b.this.b, Boolean.FALSE);
                }
            }
        }

        public b(Context context, String str) {
            this.f2370a = context;
            this.b = str;
        }

        @Override // tb.b6x
        public final void a(b6x.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("17d54df9", new Object[]{this, aVar});
                return;
            }
            tvh tvhVar = null;
            WeexInstance b = aVar != null ? aVar.b(this.f2370a) : null;
            if (!(b instanceof WeexInstanceImpl)) {
                b = null;
            }
            WeexInstanceImpl weexInstanceImpl = (WeexInstanceImpl) b;
            if (weexInstanceImpl != null) {
                tvhVar = weexInstanceImpl.getAdapterMUSInstance();
            }
            if (!com.alibaba.android.ultron.vfw.weex2.a.g().c(tvhVar)) {
                TradeHybridInstanceFactory tradeHybridInstanceFactory = TradeHybridInstanceFactory.INSTANCE;
                TradeHybridInstanceFactory.d(tradeHybridInstanceFactory).put(this.b, tvhVar);
                if (tvhVar == null) {
                    TradeHybridInstanceFactory.b(tradeHybridInstanceFactory).put(this.b, AsyncInsLoadState.FAIL);
                    TradeHybridInstanceFactory.f(tradeHybridInstanceFactory, "loadState is fail");
                    return;
                }
                hav.d("TradeHybridInstanceLoadManager", "实例创建成功");
                TradeHybridInstanceFactory.b(tradeHybridInstanceFactory).put(this.b, AsyncInsLoadState.SUCCESS);
                a aVar2 = (a) TradeHybridInstanceFactory.a(tradeHybridInstanceFactory).get(this.b);
                if (aVar2 != null) {
                    aVar2.b(tvhVar);
                }
                tvhVar.setTag("bizLifecycleListener", new a(tvhVar));
            }
        }
    }

    static {
        t2o.a(157286817);
    }

    public static final /* synthetic */ ConcurrentHashMap a(TradeHybridInstanceFactory tradeHybridInstanceFactory) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConcurrentHashMap) ipChange.ipc$dispatch("286dc10a", new Object[]{tradeHybridInstanceFactory});
        }
        return e;
    }

    public static final /* synthetic */ ConcurrentHashMap b(TradeHybridInstanceFactory tradeHybridInstanceFactory) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConcurrentHashMap) ipChange.ipc$dispatch("e4bf11e4", new Object[]{tradeHybridInstanceFactory});
        }
        return f2369a;
    }

    public static final /* synthetic */ List c(TradeHybridInstanceFactory tradeHybridInstanceFactory) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("cd22698f", new Object[]{tradeHybridInstanceFactory});
        }
        return tradeHybridInstanceFactory.k();
    }

    public static final /* synthetic */ ConcurrentHashMap d(TradeHybridInstanceFactory tradeHybridInstanceFactory) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConcurrentHashMap) ipChange.ipc$dispatch("65cd3062", new Object[]{tradeHybridInstanceFactory});
        }
        return c;
    }

    public static final /* synthetic */ ConcurrentHashMap e(TradeHybridInstanceFactory tradeHybridInstanceFactory) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConcurrentHashMap) ipChange.ipc$dispatch("86fb321e", new Object[]{tradeHybridInstanceFactory});
        }
        return d;
    }

    public static final /* synthetic */ void f(TradeHybridInstanceFactory tradeHybridInstanceFactory, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69665855", new Object[]{tradeHybridInstanceFactory, str});
        } else {
            tradeHybridInstanceFactory.p(str);
        }
    }

    @JvmStatic
    public static final void q(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d51bd93", new Object[]{str});
        } else if (str == null || str.length() == 0) {
            f2369a.clear();
            b.clear();
            c.clear();
            d.clear();
            e.clear();
            hav.g("TradeHybridInstanceLoadManager", "resetState:", "uniqueKey is empty");
        } else {
            f2369a.remove(str);
            b.remove(str);
            c.remove(str);
            d.remove(str);
            e.remove(str);
        }
    }

    @JvmStatic
    public static final void r(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8cc27d8c", new Object[]{str});
            return;
        }
        TradeHybridInstanceFactory tradeHybridInstanceFactory = INSTANCE;
        if (tradeHybridInstanceFactory.h("stealTicket")) {
            if (str == null || str.length() == 0) {
                tradeHybridInstanceFactory.p("stealTicket, uniqueKey is empty");
                return;
            }
            t5x.a aVar = b.get(str);
            if (aVar != null) {
                aVar.a();
            }
        }
    }

    public final List<String> j() {
        Object value;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            value = ipChange.ipc$dispatch("e6465b4a", new Object[]{this});
        } else {
            value = f.getValue();
        }
        return (List) value;
    }

    public final List<String> k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("b15f0fd9", new Object[]{this});
        }
        try {
            String g = v9v.g(UltronTradeHybridSwitcherHelper.ORANGE_KEY_NAV_OPT, "navOptRenderPathList", i());
            if (!(g == null || g.length() == 0)) {
                List<String> parseArray = JSON.parseArray(g, String.class);
                ckf.f(parseArray, "JSON.parseArray(pathListStr, String::class.java)");
                return parseArray;
            }
            return yz3.i();
        } catch (Throwable th) {
            p("getHitRenderPathList: " + th);
            return yz3.i();
        }
    }

    public final boolean n(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f1bd33b3", new Object[]{this, str})).booleanValue();
        }
        ckf.g(str, "url");
        return TextUtils.equals(lbv.e(str, "navAsyncPrerender"), "true");
    }

    public final boolean o(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c6277ddb", new Object[]{this, str})).booleanValue();
        }
        if (str == null || str.length() == 0 || !m(str)) {
            return false;
        }
        return n(str);
    }

    public final void p(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2dd48c5", new Object[]{this, str});
        } else {
            nbv.a(nbv.a.a("TradeHybridInstanceError").success(false).message(str).sampling(0.01f));
        }
    }

    public final String i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a7fced16", new Object[]{this});
        }
        if (!v9v.i(UltronTradeHybridSwitcherHelper.ORANGE_KEY_NAV_OPT, "enableRenderDefaultList", true)) {
            return "";
        }
        return "[\"/app/mtb/logisticsV2/detail\"]";
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    @kotlin.jvm.JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void g(java.lang.String r10, android.content.Context r11, int r12, int r13, tb.mbv r14) {
        /*
            Method dump skipped, instructions count: 382
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.android.ultron.vfw.weex2.highPerformance.factory.TradeHybridInstanceFactory.g(java.lang.String, android.content.Context, int, int, tb.mbv):void");
    }

    @JvmStatic
    public static final void l(String str, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a007009", new Object[]{str, aVar});
            return;
        }
        ckf.g(aVar, "asyncCallback");
        TradeHybridInstanceFactory tradeHybridInstanceFactory = INSTANCE;
        if (tradeHybridInstanceFactory.h("getWeexInstance")) {
            if (str == null || str.length() == 0) {
                tradeHybridInstanceFactory.p("getWeexInstance, uniqueKey is empty");
                return;
            }
            ConcurrentHashMap<String, t5x.a> concurrentHashMap = b;
            if (concurrentHashMap.get(str) == null) {
                tradeHybridInstanceFactory.p("getWeexInstance: ticket == null");
                aVar.a();
                return;
            }
            r(str);
            AsyncInsLoadState asyncInsLoadState = f2369a.get(str);
            if (asyncInsLoadState != null) {
                int i = ocu.$EnumSwitchMapping$0[asyncInsLoadState.ordinal()];
                if (i == 1) {
                    tradeHybridInstanceFactory.p("getWeexInstance: LoadState.INIT");
                    aVar.a();
                } else if (i == 2) {
                    tradeHybridInstanceFactory.p("getWeexInstance: LoadState.LOADING  赋值callback");
                    e.put(str, aVar);
                } else if (i == 3) {
                    com.taobao.android.weex_framework.a aVar2 = c.get(str);
                    aVar.b(aVar2);
                    if (ckf.b(d.get(str), Boolean.TRUE)) {
                        hav.g("TradeHybridInstanceLoadManager", "getWeexInstance", "获取异步预热实例成功,并且实例已经bizReady，回调");
                        aVar.c(aVar2);
                    } else {
                        hav.g("TradeHybridInstanceLoadManager", "getWeexInstance", "获取异步预热实例成功,但实例还没bizReady，传入回调");
                        e.put(str, aVar);
                    }
                }
                concurrentHashMap.remove(str);
            }
            tradeHybridInstanceFactory.p("getWeexInstance: LoadState.Fail");
            aVar.a();
            concurrentHashMap.remove(str);
        }
    }

    public final boolean h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("239848a0", new Object[]{this, str})).booleanValue();
        }
        if (pav.b()) {
            return true;
        }
        p("not in main thread, " + str);
        return false;
    }

    public final boolean m(String str) {
        String str2 = "";
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fff20ead", new Object[]{this, str})).booleanValue();
        }
        ckf.g(str, "url");
        try {
            Uri parse = Uri.parse(str);
            ckf.f(parse, "Uri.parse(url)");
            String path = parse.getPath();
            if (path != null) {
                str2 = path;
            }
        } catch (Exception e2) {
            e2.printStackTrace();
            m8v.a(e2);
        }
        return !j().isEmpty() && j().contains(str2);
    }
}
