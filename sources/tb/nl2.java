package tb;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import androidx.fragment.app.FragmentActivity;
import com.alibaba.ability.result.ErrorResult;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.utils.UltronTradeHybridSwitcherHelper;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.BroadcastAddListenerEventResult;
import com.taobao.android.abilityidl.ability.BroadcastEventResult;
import com.taobao.android.order.bundle.TBOrderListFragment;
import com.taobao.android.order.core.OrderConfigs;
import com.taobao.tao.tbmainfragment.ISupportFragment;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class nl2 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String BROADCAST_ACTION_ORDER_LIST_NEED_REFRESH = "orderListNeedRefreshAction";
    public static final String IMMEDIATELY_REFRESH = "immediatelyRefresh";
    public static final String MEGA_REFRESH_ORDERLIST = "mega_refreshOrderList";
    public static final String MY_TAOBAO_ACTION = "MyTaobao_Order_Refresh";
    public static final String ORDER_ACTION = "orderRefresh";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a implements msc {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.jdb
        public void O(ErrorResult errorResult) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("14182866", new Object[]{this, errorResult});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class b implements msc {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.jdb
        public void O(ErrorResult errorResult) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("14182866", new Object[]{this, errorResult});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class c implements msc {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.jdb
        public void O(ErrorResult errorResult) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("14182866", new Object[]{this, errorResult});
                return;
            }
            hav.g("BroadcastHelper", "removeEventListener:", "removePrefetchData - " + errorResult.toString());
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class d implements msc {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.jdb
        public void O(ErrorResult errorResult) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("14182866", new Object[]{this, errorResult});
                return;
            }
            hav.g("BroadcastHelper", "removeEventListener:", "startTransition - " + errorResult.toString());
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class e implements qsc {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final WeakReference<Context> f24801a;

        static {
            t2o.a(713031790);
            t2o.a(525337676);
        }

        public e(Context context) {
            this.f24801a = new WeakReference<>(context);
        }

        @Override // tb.jdb
        public void O(ErrorResult errorResult) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("14182866", new Object[]{this, errorResult});
            }
        }

        @Override // tb.ekb
        public void n1(BroadcastAddListenerEventResult broadcastAddListenerEventResult) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("70116a6f", new Object[]{this, broadcastAddListenerEventResult});
            }
        }

        @Override // tb.qsc, tb.ekb
        public void onEvent(BroadcastEventResult broadcastEventResult) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("560ff2e1", new Object[]{this, broadcastEventResult});
                return;
            }
            Context context = this.f24801a.get();
            if (context != null) {
                gb0.d(context, true);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class f implements qsc {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final WeakReference<Context> f24802a;

        static {
            t2o.a(713031791);
            t2o.a(525337676);
        }

        public f(Context context) {
            this.f24802a = new WeakReference<>(context);
        }

        @Override // tb.jdb
        public void O(ErrorResult errorResult) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("14182866", new Object[]{this, errorResult});
            }
        }

        @Override // tb.ekb
        public void n1(BroadcastAddListenerEventResult broadcastAddListenerEventResult) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("70116a6f", new Object[]{this, broadcastAddListenerEventResult});
            }
        }

        @Override // tb.qsc, tb.ekb
        public void onEvent(BroadcastEventResult broadcastEventResult) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("560ff2e1", new Object[]{this, broadcastEventResult});
            } else if (broadcastEventResult != null) {
                try {
                    Map<String, ? extends Object> map = broadcastEventResult.detail;
                    if (map != null && !map.isEmpty()) {
                        Object obj = broadcastEventResult.detail.get(jjx.ZZB_BUNDLE_KEY);
                        if (obj instanceof JSONObject) {
                            String jSONString = ((JSONObject) obj).toJSONString();
                            if (!TextUtils.isEmpty(jSONString)) {
                                Context context = this.f24802a.get();
                                if (context instanceof FragmentActivity) {
                                    ISupportFragment h = qxq.h(((FragmentActivity) context).getSupportFragmentManager());
                                    if (h instanceof TBOrderListFragment) {
                                        ((TBOrderListFragment) h).d4(jSONString);
                                    }
                                }
                            }
                        }
                    }
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class g implements qsc {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final WeakReference<OrderConfigs> f24803a;

        static {
            t2o.a(713031792);
            t2o.a(525337676);
        }

        public g(OrderConfigs orderConfigs) {
            this.f24803a = new WeakReference<>(orderConfigs);
        }

        @Override // tb.jdb
        public void O(ErrorResult errorResult) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("14182866", new Object[]{this, errorResult});
            }
        }

        @Override // tb.ekb
        public void n1(BroadcastAddListenerEventResult broadcastAddListenerEventResult) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("70116a6f", new Object[]{this, broadcastAddListenerEventResult});
            }
        }

        @Override // tb.qsc, tb.ekb
        public void onEvent(BroadcastEventResult broadcastEventResult) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("560ff2e1", new Object[]{this, broadcastEventResult});
                return;
            }
            OrderConfigs orderConfigs = this.f24803a.get();
            if (orderConfigs != null) {
                orderConfigs.L(true);
            }
            hav.g("BroadcastHelper", "TradeHybridRemovePrefetchDataEvent:", "onEvent - " + broadcastEventResult.toString());
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class h implements qsc {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final WeakReference<OrderConfigs> f24804a;

        static {
            t2o.a(713031793);
            t2o.a(525337676);
        }

        public h(OrderConfigs orderConfigs) {
            this.f24804a = new WeakReference<>(orderConfigs);
        }

        @Override // tb.jdb
        public void O(ErrorResult errorResult) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("14182866", new Object[]{this, errorResult});
            }
        }

        @Override // tb.ekb
        public void n1(BroadcastAddListenerEventResult broadcastAddListenerEventResult) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("70116a6f", new Object[]{this, broadcastAddListenerEventResult});
            }
        }

        @Override // tb.qsc, tb.ekb
        public void onEvent(BroadcastEventResult broadcastEventResult) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("560ff2e1", new Object[]{this, broadcastEventResult});
                return;
            }
            OrderConfigs orderConfigs = this.f24804a.get();
            if (orderConfigs != null) {
                orderConfigs.M(true);
            }
            hav.g("BroadcastHelper", "TradeHybridStartTransitionEvent:", "onEvent - " + broadcastEventResult.toString());
        }
    }

    static {
        t2o.a(713031785);
    }

    public static void b(Context context, BroadcastReceiver broadcastReceiver) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("317d7638", new Object[]{context, broadcastReceiver});
        } else if (context != null && broadcastReceiver != null) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction(ORDER_ACTION);
            intentFilter.addAction("orderListNeedRefreshAction");
            context.registerReceiver(broadcastReceiver, intentFilter);
        }
    }

    public static void c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bcf63794", new Object[]{context});
            return;
        }
        dii c2 = dii.c();
        if (c2 != null) {
            c2.a(MEGA_REFRESH_ORDERLIST, new e(context));
        }
    }

    public static void e(String str, Context context, Intent intent, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e877529", new Object[]{str, context, intent, str2, new Boolean(z)});
        } else if (context != null && !TextUtils.isEmpty(str2)) {
            if (intent == null) {
                intent = new Intent();
            }
            intent.setAction(str);
            intent.putExtra(str2, true);
            intent.putExtra(IMMEDIATELY_REFRESH, z);
            String packageName = context.getPackageName();
            if (TextUtils.isEmpty(packageName)) {
                packageName = "com.taobao.taobao";
            }
            intent.setPackage(packageName);
            context.sendBroadcast(intent);
        }
    }

    public static void f(String str, Context context, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a6d8c06", new Object[]{str, context, str2, new Boolean(z)});
        } else {
            e(str, context, null, str2, z);
        }
    }

    public static void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a12b204", new Object[0]);
        } else if (uel.l("useOLFragmentV2", false) || !uel.l("useOLFragmentV2PageUserInfoBroadcast", true)) {
            try {
                dii c2 = dii.c();
                if (c2 != null) {
                    c2.e("tradePageUserInfo", new a());
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public static void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8841f18d", new Object[0]);
            return;
        }
        dii c2 = dii.c();
        if (c2 != null) {
            c2.e(MEGA_REFRESH_ORDERLIST, new b());
        }
    }

    public static void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4971824", new Object[0]);
        } else if (!wbl.f()) {
            hav.g("BroadcastHelper", "unregisterTradeHybridMegaEventBroadcast:", "switcher is off");
        } else {
            dii c2 = dii.c();
            if (c2 != null) {
                if (v9v.i(UltronTradeHybridSwitcherHelper.ORANGE_KEY_ORDER_DETAIL, "enableListenRemovePrefetchData", true)) {
                    c2.e("removePrefetchData", new c());
                }
                c2.e("startTransition", new d());
            }
        }
    }

    public static void d(OrderConfigs orderConfigs) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad55eccd", new Object[]{orderConfigs});
        } else if (!wbl.f()) {
            hav.g("BroadcastHelper", "registerTradeHybridMegaEventBroadcast:", "switcher is off");
        } else {
            dii c2 = dii.c();
            if (c2 != null) {
                if (v9v.i(UltronTradeHybridSwitcherHelper.ORANGE_KEY_ORDER_DETAIL, "enableListenRemovePrefetchData", true)) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("bizId", "TradeHybrid");
                    hashMap.put("eventName", "removePrefetchData");
                    c2.b(new el2(hashMap), new g(orderConfigs));
                }
                HashMap hashMap2 = new HashMap();
                hashMap2.put("bizId", "TradeHybrid");
                hashMap2.put("eventName", "startTransition");
                c2.b(new el2(hashMap2), new h(orderConfigs));
            }
        }
    }

    public static void h(Context context, BroadcastReceiver broadcastReceiver) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fcb5ead1", new Object[]{context, broadcastReceiver});
            return;
        }
        try {
            context.unregisterReceiver(broadcastReceiver);
        } catch (Exception e2) {
            lor.c("unregisterReceiver exception", e2.toString(), new String[0]);
        }
    }

    public static void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b63378eb", new Object[]{context});
        } else if (uel.l("useOLFragmentV2", false) || !uel.l("useOLFragmentV2PageUserInfoBroadcast", true)) {
            try {
                dii c2 = dii.c();
                if (c2 != null) {
                    c2.a("tradePageUserInfo", new f(context));
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }
}
