package tb;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import tb.vm0;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class bn0 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(301990110);
    }

    public static void c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10a23597", new Object[]{context});
        } else if (b(context)) {
            g(context);
        }
    }

    public static void d(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a3c7a1", new Object[]{context, str});
        } else if (b(context)) {
            if (!a(context) || TextUtils.isEmpty(str)) {
                g(context);
            } else {
                f(context, str);
            }
        }
    }

    public static void e(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4fa3e4a", new Object[]{str, jSONObject});
        } else {
            new kmi().c("tbBuy", str, jSONObject);
        }
    }

    public static void f(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66ce1157", new Object[]{context, str});
            return;
        }
        Intent intent = new Intent();
        intent.setAction("cartRefreshData");
        intent.addCategory("android.intent.category.DEFAULT");
        intent.putExtra("cartIds", str);
        intent.putExtra("from", "modalBuyCreateOrder");
        intent.putExtra("cartBroadcastFrom", "modalBuyCreateOrder");
        LocalBroadcastManager.getInstance(context).sendBroadcast(intent);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("cartIds", (Object) str);
        jSONObject.put("from", (Object) "modalBuyCreateOrder");
        e("cartRefreshData", jSONObject);
    }

    public static void g(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d95bb4d3", new Object[]{context});
            return;
        }
        Intent intent = new Intent();
        intent.setAction("cartRefreshData");
        intent.addCategory("android.intent.category.DEFAULT");
        intent.putExtra("from", "buyCreateOrder");
        intent.putExtra("cartBroadcastFrom", "createOrder");
        LocalBroadcastManager.getInstance(context).sendBroadcast(intent);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("from", (Object) "buyCreateOrder");
        e("cartRefreshData", jSONObject);
    }

    public static boolean a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b3f87fd1", new Object[]{context})).booleanValue();
        }
        Intent h = hh.h(context);
        if (h != null) {
            return "float".equals(h.getStringExtra("pageType")) && !rm0.b();
        }
        vm0.d(vm0.a.a("buyFragment").message("intent is empty").tag("EMPTY_INTENT_FORM_(isFloatBuy)").sampling(1.0f));
        return false;
    }

    public static boolean b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3830462c", new Object[]{context})).booleanValue();
        }
        Intent h = hh.h(context);
        if (h == null) {
            vm0.d(vm0.a.a("buyFragment").message("intent is empty").tag("EMPTY_INTENT_FORM_(needRefreshCartImmediately)").sampling(1.0f));
            return false;
        }
        return h.getIntExtra("purchase_from", -1) != 2 || "carts".equals(h.getStringExtra("openFrom"));
    }
}
