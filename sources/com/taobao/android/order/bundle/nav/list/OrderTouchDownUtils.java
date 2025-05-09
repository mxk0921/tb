package com.taobao.android.order.bundle.nav.list;

import android.content.Context;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.utils.UltronTradeHybridSwitcherHelper;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.order.bundle.weex2.AsyncInstanceLoadManager;
import com.taobao.android.order.core.performance.OrderUltronInstanceFactory;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.text.Regex;
import tb.ae2;
import tb.ckf;
import tb.g6i;
import tb.hav;
import tb.jpu;
import tb.lcv;
import tb.ldl;
import tb.nbv;
import tb.pav;
import tb.t2o;
import tb.v9v;
import tb.wbl;
import tb.yxr;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J/\u0010\r\u001a\u00020\f2\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\tH\u0007¢\u0006\u0004\b\r\u0010\u000eJ/\u0010\u000f\u001a\u00020\f2\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\tH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ/\u0010\u0010\u001a\u00020\f2\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\tH\u0007¢\u0006\u0004\b\u0010\u0010\u000eJ/\u0010\u0011\u001a\u00020\f2\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\tH\u0007¢\u0006\u0004\b\u0011\u0010\u000eJ\u0017\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R \u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R(\u0010\u0019\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0019\u0010\u001a\u0012\u0004\b\u001d\u0010\u0003\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Lcom/taobao/android/order/bundle/nav/list/OrderTouchDownUtils;", "", "<init>", "()V", "", "enableOrderTouchDown", "()Z", "Landroid/content/Context;", "context", "", "", "params", "Ltb/xhv;", "onTouchDown", "(Landroid/content/Context;Ljava/util/Map;)V", "doTouchDown", "onTouchCancel", "onMyTBRenderFinish", "input", "extractText", "(Ljava/lang/String;)Ljava/lang/String;", RPCDataItems.SWITCH_TAG_LOG, "Ljava/lang/String;", "tabCodeMap", "Ljava/util/Map;", "isRenderFinished", "Z", "setRenderFinished", "(Z)V", "isRenderFinished$annotations", "taobao-order-bundle_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class OrderTouchDownUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "OrderTouchDown";
    private static boolean isRenderFinished;
    public static final OrderTouchDownUtils INSTANCE = new OrderTouchDownUtils();
    private static final Map<String, String> tabCodeMap = kotlin.collections.a.j(jpu.a("我的订单全部", "all"), jpu.a("待付款", "waitPay"), jpu.a("待发货", "waitSend"), jpu.a("待收货", "waitConfirm"), jpu.a("退款/售后", ae2.BizKeyRefund));

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final a INSTANCE = new a();

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            lcv.b();
            yxr.b(9);
        }
    }

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/taobao/android/order/bundle/nav/list/OrderTouchDownUtils$b", "Ljava/lang/Runnable;", "Ltb/xhv;", "run", "()V", "taobao-order-bundle_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Map f9107a;

        /* compiled from: Taobao */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
        public static final class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;
            public static final a INSTANCE = new a();

            @Override // java.lang.Runnable
            public final void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    AsyncInstanceLoadManager.m();
                }
            }
        }

        public b(Map map) {
            this.f9107a = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            hav.d(OrderTouchDownUtils.TAG, "onTouchCancel");
            Map map = this.f9107a;
            Object obj = map != null ? map.get("accessibilityText") : null;
            if (obj instanceof String) {
                if (ckf.b("退款/售后", OrderTouchDownUtils.access$extractText(OrderTouchDownUtils.INSTANCE, (String) obj))) {
                    pav.i(a.INSTANCE, 0L);
                    nbv.a(nbv.a.a("OrderTouchCancel").message("退款/售后").sampling(0.001f));
                    return;
                }
                OrderUltronInstanceFactory.clearInstance();
                ldl.INSTANCE.e();
            }
        }
    }

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f9108a;
        public final /* synthetic */ Map b;

        public c(Context context, Map map) {
            this.f9108a = context;
            this.b = map;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                OrderTouchDownUtils.access$doTouchDown(OrderTouchDownUtils.INSTANCE, this.f9108a, this.b);
            }
        }
    }

    private OrderTouchDownUtils() {
    }

    public static final /* synthetic */ void access$doTouchDown(OrderTouchDownUtils orderTouchDownUtils, Context context, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72438ef7", new Object[]{orderTouchDownUtils, context, map});
        } else {
            orderTouchDownUtils.doTouchDown(context, map);
        }
    }

    public static final /* synthetic */ String access$extractText(OrderTouchDownUtils orderTouchDownUtils, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aa593584", new Object[]{orderTouchDownUtils, str});
        }
        return orderTouchDownUtils.extractText(str);
    }

    private final void doTouchDown(Context context, Map<String, ? extends Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba9a3f7a", new Object[]{this, context, map});
        } else if (context == null || !enableOrderTouchDown()) {
            hav.d(TAG, "context is null");
        } else {
            Object obj = map != null ? map.get("accessibilityText") : null;
            if (!(obj instanceof String)) {
                hav.d(TAG, "accessibilityText is null");
                return;
            }
            String extractText = extractText((String) obj);
            hav.d(TAG, "onTouchDown: " + extractText);
            if (ckf.b("退款/售后", extractText)) {
                AsyncInstanceLoadManager.INSTANCE.e(context);
                nbv.a(nbv.a.a(TAG).message("退款/售后").sampling(0.001f));
                return;
            }
            String str = tabCodeMap.get(extractText);
            if (str != null) {
                hav.d(TAG, "asyncTask onTouchDown: ".concat(str));
                ldl.INSTANCE.b(null, str, context);
            }
        }
    }

    private final String extractText(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("96e36521", new Object[]{this, str});
        }
        g6i find$default = Regex.find$default(new Regex("\\D+"), str, 0, 2, null);
        if (find$default != null) {
            return find$default.getValue();
        }
        return "";
    }

    public static final boolean isRenderFinished() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5586337d", new Object[0])).booleanValue();
        }
        return isRenderFinished;
    }

    @JvmStatic
    public static /* synthetic */ void isRenderFinished$annotations() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5bc3d4f9", new Object[0]);
        }
    }

    @JvmStatic
    public static final void onTouchCancel(Context context, Map<String, ? extends Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e18e07e", new Object[]{context, map});
        } else if (context != null && INSTANCE.enableOrderTouchDown()) {
            pav.k(new b(map));
        }
    }

    @JvmStatic
    public static final void onTouchDown(Context context, Map<String, ? extends Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("671e6aa6", new Object[]{context, map});
        } else if (!pav.b()) {
            INSTANCE.doTouchDown(context, map);
        } else {
            pav.k(new c(context, map));
        }
    }

    public static final void setRenderFinished(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e91c443", new Object[]{new Boolean(z)});
        } else {
            isRenderFinished = z;
        }
    }

    private final boolean enableOrderTouchDown() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("62353ac1", new Object[]{this})).booleanValue();
        }
        return v9v.i(UltronTradeHybridSwitcherHelper.ORANGE_KEY_MY_TAOBAO, "enableOrderTouchDown", true);
    }

    @JvmStatic
    public static final void onMyTBRenderFinish(Context context, Map<String, ? extends Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48833d46", new Object[]{context, map});
        } else if (v9v.i(wbl.NEW_BABEL_ORDER, "onMyTBRenderFinish", true)) {
            hav.d(TAG, "onMyTBRenderFinish");
            isRenderFinished = true;
            pav.l(a.INSTANCE, v9v.f(wbl.NEW_BABEL_ORDER, "onMyTaobaoResumeDelay", 200L));
        }
    }

    static {
        t2o.a(713031846);
    }
}
