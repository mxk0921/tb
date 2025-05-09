package com.taobao.android.icart.weex.utils;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.icart.weex.downgrade.CartWeexDowngradeHelper;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import tb.c9x;
import tb.ckf;
import tb.d1a;
import tb.hav;
import tb.ipx;
import tb.j6v;
import tb.m9u;
import tb.m9v;
import tb.ne3;
import tb.pav;
import tb.q1r;
import tb.t2o;
import tb.v9v;
import tb.wo0;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0007¢\u0006\u0004\b\f\u0010\u0003J\u0017\u0010\r\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\u000bJ\u000f\u0010\u000e\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000e\u0010\u0003J\u0017\u0010\u0010\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0010\u0010\u000bJ\u000f\u0010\u0011\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0011\u0010\u0006J\u000f\u0010\u0012\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0012\u0010\u0006J\r\u0010\u0013\u001a\u00020\u0004¢\u0006\u0004\b\u0013\u0010\u0006J\r\u0010\u0014\u001a\u00020\u0004¢\u0006\u0004\b\u0014\u0010\u0006J\r\u0010\u0015\u001a\u00020\u0004¢\u0006\u0004\b\u0015\u0010\u0006J\r\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001c\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u00198\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001d\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u00198\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001e\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u00198\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001f\u0010\u001bR\u0014\u0010 \u001a\u00020\u00198\u0002X\u0082T¢\u0006\u0006\n\u0004\b \u0010\u001bR\u0014\u0010!\u001a\u00020\u00198\u0002X\u0082T¢\u0006\u0006\n\u0004\b!\u0010\u001bR\u0014\u0010\"\u001a\u00020\u00198\u0002X\u0082T¢\u0006\u0006\n\u0004\b\"\u0010\u001bR\u0014\u0010#\u001a\u00020\u00168\u0002X\u0082T¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010(\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010\u0013\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010)R\u0014\u0010\u0014\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010)R\u0014\u0010*\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010)R\u0014\u0010+\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010)R\u0014\u0010,\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010$R \u0010/\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0.0-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u00101\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u0010)¨\u00062"}, d2 = {"Lcom/taobao/android/icart/weex/utils/OrangeUtil;", "", "<init>", "()V", "", "useWeexPrerender", "()Z", "isWeexCart", "isResume", "Ltb/xhv;", "update", "(Z)V", "activeWeexABTest", "updateInner", "registerOrangeListener", "emergency", "handleEmergency", "isShowWeexCartABTest", "isWeexForceNative", "isLoadRawFile", "isPrefetchQueryForClick", "isJSExceptionDowngrade", "", "getHandleShakeCountDown", "()J", "", "CART_NAME_SPACE", "Ljava/lang/String;", "CART_WEEX_PRE_RENDER", "EMERGENCY_OPEN_KEY", "WEEX_AB_TEST_OPEN_KEY", "LOAD_RAW_FILE_KEY", "PRE_PREFETCH_FOR_CLICK", "JS_EXCEPTION_DOWNGRADE", "HANDLE_SHAKE_COUNT_DOWN", "DEFAULT_HANDLE_SHARE_COUNT_DOWN_VALUE", "J", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isUpdateOrange", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isWeexABTestOpen", "Z", "isPreRenderOpen", "isForceWeex", OrangeUtil.HANDLE_SHAKE_COUNT_DOWN, "", "Lkotlin/Function0;", "orangeUpdateListenerList", "Ljava/util/List;", "isEmergencyOpen", "icart-bundle-android_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class OrangeUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String CART_NAME_SPACE = "cart_switch";
    private static final String CART_WEEX_PRE_RENDER = "useWeexPreRenderInstance";
    private static final long DEFAULT_HANDLE_SHARE_COUNT_DOWN_VALUE = 0;
    private static final String EMERGENCY_OPEN_KEY = "weexEmergencyOpen";
    private static final String HANDLE_SHAKE_COUNT_DOWN = "weexHandleShareCountDown";
    public static final OrangeUtil INSTANCE;
    private static final String JS_EXCEPTION_DOWNGRADE = "weexJSExceptionDowngrade";
    private static final String LOAD_RAW_FILE_KEY = "weexLoadRawFileOpen";
    private static final String PRE_PREFETCH_FOR_CLICK = "weexPrefetchQueryForClick";
    private static final String WEEX_AB_TEST_OPEN_KEY = "weexABTestOpen";
    private static volatile boolean isEmergencyOpen;
    private static final boolean isForceWeex;
    private static final boolean isLoadRawFile;
    private static final boolean isPreRenderOpen;
    private static final boolean isPrefetchQueryForClick;
    private static final boolean isWeexABTestOpen;
    private static final long weexHandleShareCountDown;
    private static final AtomicBoolean isUpdateOrange = new AtomicBoolean();
    private static final List<d1a<xhv>> orangeUpdateListenerList = new ArrayList();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class a implements wo0 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
        /* renamed from: com.taobao.android.icart.weex.utils.OrangeUtil$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
        public static final class RunnableC0429a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;
            public static final RunnableC0429a INSTANCE = new RunnableC0429a();

            @Override // java.lang.Runnable
            public final void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                OrangeUtil orangeUtil = OrangeUtil.INSTANCE;
                OrangeUtil.access$isUpdateOrange$p(orangeUtil).set(true);
                for (d1a d1aVar : OrangeUtil.access$getOrangeUpdateListenerList$p(orangeUtil)) {
                    d1aVar.invoke();
                }
                OrangeUtil.access$getOrangeUpdateListenerList$p(OrangeUtil.INSTANCE).clear();
            }
        }

        @Override // tb.wo0
        public void onConfigUpdate(String str, Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4f2fc4ea", new Object[]{this, str, map});
            } else if (ckf.b(str, "cart_switch")) {
                hav.d(c9x.TAG, "cart orange更新完成");
                v9v.l("cart_switch", this);
                pav.i(RunnableC0429a.INSTANCE, 5000L);
            }
        }
    }

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f8080a;

        public c(boolean z) {
            this.f8080a = z;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                OrangeUtil.access$updateInner(OrangeUtil.INSTANCE, this.f8080a);
            }
        }
    }

    private OrangeUtil() {
    }

    public static final /* synthetic */ List access$getOrangeUpdateListenerList$p(OrangeUtil orangeUtil) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("28107b69", new Object[]{orangeUtil});
        }
        return orangeUpdateListenerList;
    }

    public static final /* synthetic */ AtomicBoolean access$isUpdateOrange$p(OrangeUtil orangeUtil) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AtomicBoolean) ipChange.ipc$dispatch("55a07ce0", new Object[]{orangeUtil});
        }
        return isUpdateOrange;
    }

    public static final /* synthetic */ void access$updateInner(OrangeUtil orangeUtil, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41ba11d4", new Object[]{orangeUtil, new Boolean(z)});
        } else {
            orangeUtil.updateInner(z);
        }
    }

    @JvmStatic
    public static final void activeWeexABTest() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91dcc6c1", new Object[0]);
        } else if (!isUpdateOrange.get()) {
            orangeUpdateListenerList.add(OrangeUtil$activeWeexABTest$1.INSTANCE);
        } else {
            boolean isShowWeexCartABTest = INSTANCE.isShowWeexCartABTest();
            m9v.d(c9x.CART_BIZ_NAME).p(WEEX_AB_TEST_OPEN_KEY, isShowWeexCartABTest);
            ne3.a aVar = new ne3.a("ActiveWeexABTest");
            StringBuilder sb = new StringBuilder("购物车一休开关 showWeexCart=");
            sb.append(isShowWeexCartABTest);
            sb.append(", isWeexABTestOpen=");
            boolean z = isWeexABTestOpen;
            sb.append(z);
            aVar.tag(sb.toString()).dimension("abTestSwitch", String.valueOf(isShowWeexCartABTest)).dimension("abTestSwitchCache", String.valueOf(z));
            ne3.Companion.c(aVar);
            hav.d(c9x.TAG, "activeWeexABTest abTestSwitch=" + isShowWeexCartABTest + ", abTestSwitchCache=" + z);
        }
    }

    private final void handleEmergency(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("145e2084", new Object[]{this, new Boolean(z)});
            return;
        }
        isEmergencyOpen = z;
        if (isEmergencyOpen) {
            hav.d(c9x.TAG, "触发保命开关，强制降级Native");
            CartWeexDowngradeHelper.Companion.a("emergencyOpen");
        }
    }

    private final boolean isShowWeexCartABTest() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("94eea486", new Object[]{this})).booleanValue();
        }
        Object a2 = j6v.a("icart_client", "cart_weex", "showWeexCart", Boolean.FALSE);
        ckf.f(a2, "UltronABTest.getVariatio…\", \"showWeexCart\", false)");
        return ((Boolean) a2).booleanValue();
    }

    @JvmStatic
    public static final boolean isWeexCart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9a6d516", new Object[0])).booleanValue();
        }
        if (isEmergencyOpen || !isWeexABTestOpen || INSTANCE.isWeexForceNative()) {
            return false;
        }
        return true;
    }

    private final void registerOrangeListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c111c8c", new Object[]{this});
        } else {
            v9v.k("cart_switch", new a());
        }
    }

    @JvmStatic
    public static final void update(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dafc9c04", new Object[]{new Boolean(z)});
        } else if (!isUpdateOrange.get()) {
            orangeUpdateListenerList.add(new OrangeUtil$update$1(z));
        } else {
            pav.k(new c(z));
        }
    }

    @JvmStatic
    public static final boolean useWeexPrerender() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("853fc0bc", new Object[0])).booleanValue();
        }
        return isPreRenderOpen;
    }

    public final long getHandleShakeCountDown() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("35383aa4", new Object[]{this})).longValue();
        }
        return weexHandleShareCountDown * 1000;
    }

    public final boolean isLoadRawFile() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c6038ff", new Object[]{this})).booleanValue();
        }
        return isLoadRawFile;
    }

    public final boolean isPrefetchQueryForClick() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e5b64cf1", new Object[]{this})).booleanValue();
        }
        return isPrefetchQueryForClick;
    }

    private final boolean isWeexForceNative() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d97faaa2", new Object[]{this})).booleanValue();
        }
        return m9v.d(c9x.CART_BIZ_NAME).h("weexForceNative", false);
    }

    public final boolean isJSExceptionDowngrade() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("85006244", new Object[]{this})).booleanValue();
        }
        return v9v.i("cart_switch", JS_EXCEPTION_DOWNGRADE, true);
    }

    private final void updateInner(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1be6440", new Object[]{this, new Boolean(z)});
        } else if (isWeexABTestOpen) {
            m9v d = m9v.d(c9x.CART_BIZ_NAME);
            ckf.f(d, "UltronMMKV.get(WeexUtil.CART_BIZ_NAME)");
            handleEmergency(v9v.i("cart_switch", EMERGENCY_OPEN_KEY, false));
            d.p(EMERGENCY_OPEN_KEY, isEmergencyOpen);
            d.p(LOAD_RAW_FILE_KEY, v9v.i("cart_switch", LOAD_RAW_FILE_KEY, true));
            d.p(PRE_PREFETCH_FOR_CLICK, v9v.i("cart_switch", PRE_PREFETCH_FOR_CLICK, true));
            d.p(CART_WEEX_PRE_RENDER, v9v.i("cart_switch", CART_WEEX_PRE_RENDER, true));
            d.r(HANDLE_SHAKE_COUNT_DOWN, v9v.f("cart_switch", HANDLE_SHAKE_COUNT_DOWN, 0L));
            if (!z) {
                ipx.Companion.a();
            }
        }
    }

    static {
        t2o.a(478151049);
        OrangeUtil orangeUtil = new OrangeUtil();
        INSTANCE = orangeUtil;
        boolean c2 = q1r.c("/.biz_cart_switch/.forceWeex");
        isForceWeex = c2;
        m9u.a aVar = m9u.Companion;
        aVar.a("Cart#orangeCacheInit");
        m9v d = m9v.d(c9x.CART_BIZ_NAME);
        ckf.f(d, "UltronMMKV.get(WeexUtil.CART_BIZ_NAME)");
        boolean z = c2 || d.g(WEEX_AB_TEST_OPEN_KEY);
        isWeexABTestOpen = z;
        long j = 0;
        if (z) {
            isEmergencyOpen = d.h(EMERGENCY_OPEN_KEY, false);
            boolean h = d.h(LOAD_RAW_FILE_KEY, true);
            isLoadRawFile = h;
            boolean h2 = d.h(PRE_PREFETCH_FOR_CLICK, true);
            isPrefetchQueryForClick = h2;
            boolean h3 = d.h(CART_WEEX_PRE_RENDER, true);
            isPreRenderOpen = h3;
            long k = d.k(HANDLE_SHAKE_COUNT_DOWN);
            Long valueOf = Long.valueOf(k);
            if (k == 0) {
                valueOf = null;
            }
            if (valueOf != null) {
                j = valueOf.longValue();
            }
            weexHandleShareCountDown = j;
            hav.d(c9x.TAG, "命中weex分流，获取开关值：isWeexForceNative=" + orangeUtil.isWeexForceNative() + ",emergency=" + isEmergencyOpen + ",loadRawFile=" + h + ",isPrefetchQueryForClick=" + h2 + ",isPreRenderOpen=" + h3 + ",weexHandleShareCountDown=" + j);
        } else {
            isEmergencyOpen = false;
            isLoadRawFile = true;
            isPrefetchQueryForClick = true;
            isPreRenderOpen = true;
            weexHandleShareCountDown = 0L;
        }
        orangeUtil.registerOrangeListener();
        aVar.b("Cart#orangeCacheInit");
    }
}
