package tb;

import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.desktop.widget.manager.WidgetCreateStrategy$Result;
import com.taobao.desktop.widget.monitor.MonitorType;
import com.taobao.desktop.widget.template.combine.WidgetCombineMiuiReceiver;
import com.taobao.desktop.widget.template.combine.WidgetTaoCaiReceiver;
import com.taobao.desktop.widget.template.combine.WidgetTaoMsgNewReceiver;
import com.taobao.desktop.widget.template.combine.WidgetTaoMsgReceiver;
import com.taobao.desktop.widget.template.combine.WidgetTaoVideoReceiver;
import com.taobao.desktop.widget.template.gold.WidgetTaoGoldReceiver;
import com.taobao.desktop.widget.template.standard.WidgetMainInteractionReceiver;
import com.taobao.desktop.widget.template.standard.WidgetStandardMiuiReceiver;
import com.taobao.desktop.widget.template.standard.WidgetStandardReceiver;
import com.taobao.desktop.widget.template.standard.WidgetTaoCartReceiver;
import com.taobao.desktop.widget.template.standard.WidgetTaoGameReceiver;
import com.taobao.desktop.widget.template.standard.WidgetTaoGuessReceiver;
import com.taobao.desktop.widget.template.standard.WidgetTaoShakeReceiver;
import com.taobao.desktop.widget.template.standard.WidgetTaoSignReceiver;
import com.taobao.desktop.widget.template.standard.WidgetTaoVideoSmallReceiver;
import com.taobao.desktop.widget.template.taolife.WidgetTaoLifeReceiver;
import com.taobao.wireless.link.widget.combine.WidgetCombineReceiver;
import com.taobao.wireless.link.widget.dynamic.WidgetDynamicReceiver;
import com.taobao.wireless.link.widget.farm.WidgetFarmReceiver;
import com.taobao.wireless.link.widget.live.WidgetLiveReceiver;
import com.taobao.wireless.link.widget.order.WidgetOrderReceiver;
import com.taobao.wireless.link.widget.tjb.TjbWidgetReceiver;
import java.util.HashMap;
import java.util.Map;
import tb.bcx;
import tb.cdx;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class nbx {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final Map<String, Class<?>> f24623a;
    public static final Map<Class<?>, String> b;
    public static final Map<Class<?>, String> c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f24624a;
        public final /* synthetic */ String b;

        public a(Context context, String str) {
            this.f24624a = context;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                nbx.e(this.f24624a, this.b);
            }
        }
    }

    public static Bundle a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bundle) ipChange.ipc$dispatch("e55b45dd", new Object[]{str, str2, str3});
        }
        Bundle bundle = new Bundle();
        bundle.putString("addType", "appWidgetDetail");
        bundle.putString(com.alibaba.triver.triver_shop.newShop.event.broadcast.a.WIDGET_NAME, ae7.c().b().getPackageName() + "/" + str);
        Bundle bundle2 = new Bundle();
        bundle2.putString("widget_type_id", str2);
        bundle2.putString("widget_channel", str3);
        bundle.putBundle("widgetExtraData", bundle2);
        return bundle;
    }

    public static Class<?> c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("9c4e3bc7", new Object[]{str});
        }
        Map<String, Class<?>> map = f24623a;
        if (((HashMap) map).containsKey(str)) {
            return (Class) ((HashMap) map).get(str);
        }
        return null;
    }

    public static String d(Class<?> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c29f7659", new Object[]{cls});
        }
        Map<Class<?>, String> map = b;
        if (((HashMap) map).containsKey(cls)) {
            return (String) ((HashMap) map).get(cls);
        }
        Map<Class<?>, String> map2 = c;
        if (((HashMap) map2).containsKey(cls)) {
            return (String) ((HashMap) map2).get(cls);
        }
        return "";
    }

    public static /* synthetic */ WidgetCreateStrategy$Result e(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WidgetCreateStrategy$Result) ipChange.ipc$dispatch("d14ae985", new Object[]{context, str});
        }
        return f(context, str);
    }

    public static void g(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44eb48e6", new Object[]{context, str});
        } else if (!TextUtils.isEmpty(str) && b9l.C(context).booleanValue() && qj7.x()) {
            nn8.c().execute(new a(context, str));
        }
    }

    public static void b(Context context, Class<?> cls, String str, String str2) {
        boolean isRequestPinAppWidgetSupported;
        PendingIntent pendingIntent;
        boolean requestPinAppWidget;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d201814c", new Object[]{context, cls, str, str2});
        } else if (cls != null) {
            try {
                if (Build.VERSION.SDK_INT >= 26) {
                    AppWidgetManager instance = AppWidgetManager.getInstance(context);
                    ComponentName componentName = new ComponentName(context, cls);
                    isRequestPinAppWidgetSupported = instance.isRequestPinAppWidgetSupported();
                    if (isRequestPinAppWidgetSupported) {
                        Intent intent = new Intent(context, cls);
                        intent.setAction("com.taobao.widget_receiver_action");
                        intent.putExtra("widget_type_id", str);
                        intent.putExtra("widget_channel", str2);
                        if (b9l.z(context)) {
                            pendingIntent = ya.e(context, 0, intent, 167772160);
                        } else {
                            pendingIntent = ya.e(context, 0, intent, 134217728);
                        }
                        requestPinAppWidget = instance.requestPinAppWidget(componentName, a(cls.getName(), str, str2), pendingIntent);
                        g(context, cls.getName());
                        cdx.b("widget_dynamic_add_success", str, str2, null);
                        bcx.e().a(MonitorType.WIDGET_STATE, new bcx.a().x(str).w("widget_state_create"));
                        hgh.d("requestPinAppWidget:" + requestPinAppWidget);
                    }
                }
            } catch (Throwable th) {
                hgh.d("requestPinAppWidget:" + th.getMessage());
                cdx.b("widget_catch_error", "requestPinAppWidget", th.getMessage(), new cdx.a().g(str).e(str2));
            }
        }
    }

    public static WidgetCreateStrategy$Result f(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WidgetCreateStrategy$Result) ipChange.ipc$dispatch("ac1a73f4", new Object[]{context, str});
        }
        Uri parse = Uri.parse("content://com.hihonor.servicecenter.provider.ExternalAddCardToLauncherProvider");
        Bundle bundle = new Bundle();
        bundle.putString("cardPkgName", "com.taobao.taobao");
        bundle.putString("cardClassName", str);
        try {
            Bundle call = context.getContentResolver().call(parse, "addCard", (String) null, bundle);
            if (call == null) {
                hgh.d("[addWidgetHonor] add card failed.");
                return WidgetCreateStrategy$Result.FAILED;
            } else if (call.getInt("code", -1) != 0) {
                String string = call.getString("msg");
                hgh.d("[addWidgetHonor] add card failed.msg : " + string);
                return WidgetCreateStrategy$Result.FAILED;
            } else {
                boolean z = call.getBoolean("animationSupport", false);
                String string2 = call.getString("cardId");
                if (z) {
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("cardId", string2);
                    try {
                        Bundle call2 = context.getContentResolver().call(parse, "executeAnimation", (String) null, bundle2);
                        if (call2 == null) {
                            hgh.d("[addWidgetHonor] add card success ");
                        } else if (call2.getInt("code") == 0) {
                            hgh.d("[addWidgetHonor] add card animationResult success ");
                            return WidgetCreateStrategy$Result.ALL_SUCCESS;
                        } else {
                            hgh.d("[addWidgetHonor] add card animationResult fail ");
                        }
                        return WidgetCreateStrategy$Result.ADD_SUCCESS;
                    } catch (Exception e) {
                        hgh.d("[addWidgetHonor] add card animationResult error: " + e);
                        return WidgetCreateStrategy$Result.ADD_SUCCESS;
                    }
                } else {
                    hgh.d("[addWidgetHonor] add card result success ");
                    return WidgetCreateStrategy$Result.ADD_SUCCESS;
                }
            }
        } catch (Throwable th) {
            hgh.d("[addWidgetHonor] add card error: " + th);
            return WidgetCreateStrategy$Result.FAILED;
        }
    }

    static {
        t2o.a(437256261);
        HashMap hashMap = new HashMap();
        f24623a = hashMap;
        HashMap hashMap2 = new HashMap();
        b = hashMap2;
        HashMap hashMap3 = new HashMap();
        c = hashMap3;
        hashMap.put("widget_dynamic_add", WidgetDynamicReceiver.class);
        hashMap.put("widget_add", TjbWidgetReceiver.class);
        hashMap.put("widget_combine_add", WidgetCombineReceiver.class);
        hashMap.put("widget_live_add", WidgetLiveReceiver.class);
        hashMap.put("widget_standard_add", WidgetStandardReceiver.class);
        hashMap.put("widget_gold_miui_add", WidgetTaoGoldReceiver.class);
        hashMap.put("widget_new_order_add", WidgetOrderReceiver.class);
        hashMap.put("widget_farm_add", WidgetFarmReceiver.class);
        hashMap2.put(TjbWidgetReceiver.class, "43");
        hashMap2.put(WidgetCombineReceiver.class, "131");
        hashMap2.put(WidgetLiveReceiver.class, "88");
        hashMap2.put(WidgetTaoLifeReceiver.class, "94");
        hashMap2.put(WidgetOrderReceiver.class, "taoLogistics");
        hashMap2.put(WidgetFarmReceiver.class, "tmallFarm");
        hashMap2.put(WidgetTaoSignReceiver.class, "taoQiandao");
        hashMap2.put(WidgetTaoGameReceiver.class, "xiaoxiaole");
        hashMap2.put(WidgetTaoVideoReceiver.class, "taoVideo");
        hashMap2.put(WidgetTaoCaiReceiver.class, "taoCaicai");
        hashMap2.put(WidgetTaoMsgReceiver.class, "taoInterest");
        hashMap2.put(WidgetTaoGuessReceiver.class, "aacRedPacketXSmall");
        hashMap2.put(WidgetMainInteractionReceiver.class, "mainInteraction");
        hashMap2.put(WidgetTaoMsgNewReceiver.class, "taoMessage");
        hashMap2.put(WidgetTaoVideoSmallReceiver.class, "taoVideoMini");
        hashMap2.put(WidgetTaoShakeReceiver.class, "taoShake");
        hashMap2.put(WidgetTaoCartReceiver.class, "taoCartsMini");
        hashMap3.put(WidgetTaoGoldReceiver.class, "43");
        hashMap3.put(WidgetStandardMiuiReceiver.class, "tmallFarm");
        hashMap3.put(WidgetCombineMiuiReceiver.class, "131");
        hashMap3.put(WidgetOrderReceiver.class, "taoLogistics");
        hashMap3.put(WidgetTaoVideoReceiver.class, "taoVideo");
    }
}
