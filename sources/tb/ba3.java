package tb;

import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.utils.Global;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class ba3 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ JSONObject f16273a;
        public final /* synthetic */ String b;

        public a(JSONObject jSONObject, String str) {
            this.f16273a = jSONObject;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (this.f16273a != null && !TextUtils.isEmpty(this.b)) {
                try {
                    String str = "cartId=" + this.f16273a.getLong("cartId") + ";addToGroupExParams=" + this.f16273a.getString("addToGroupExParams");
                    v1.b("CartAnimManager", "ready to saveDiskAndSendBroadcast, and itemId: " + this.b + ", value: " + str);
                    StringBuilder sb = new StringBuilder("AdvAddToCartNewAnimation-");
                    sb.append(this.b);
                    hno.d(sb.toString(), str);
                    LocalBroadcastManager.getInstance(Global.getApplication()).sendBroadcast(new Intent("AdvAddToCartDetailNewAnim"));
                } catch (Exception e) {
                    v1.b("CartAnimManager", "saveDiskAndSendBroadcast fail, and error: " + e.getMessage());
                }
            }
        }
    }

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0335000", new Object[]{str});
        } else if (!r8l.a()) {
            v1.b("CartAnimManager", "clearAdvToCartNewAnimKey fail, and enableAddToCartAnim is false");
        } else {
            String str2 = "AdvAddToCartNewAnimation-" + str;
            v1.b("CartAnimManager", "clearAdvToCartNewAnimKey, and key: " + str2);
            hno.c(str2);
        }
    }

    public static JSONObject b(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("b3db290b", new Object[]{map});
        }
        if (map == null) {
            return null;
        }
        try {
            if (!map.containsKey("addCartResult")) {
                return null;
            }
            Object obj = map.get("addCartResult");
            if (obj instanceof JSONObject) {
                return (JSONObject) obj;
            }
            return null;
        } catch (Exception e) {
            v1.b("CartAnimManager", "getCartResult fail, and error: " + e.getMessage());
            return null;
        }
    }

    public static boolean d(k8 k8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a1c7f39", new Object[]{k8Var})).booleanValue();
        }
        return c(nr6.b(k8Var));
    }

    public static void e(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eede34a3", new Object[]{str, jSONObject});
        } else {
            new Handler(Looper.getMainLooper()).postDelayed(new a(jSONObject, str), 2000L);
        }
    }

    public static void f(String str, String str2, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63a90559", new Object[]{str, str2, jSONObject});
        } else if (!r8l.a()) {
            v1.b("CartAnimManager", "saveDiskAndSendBroadcast fail, and enableAddToCartAnim is false");
        } else if (c(str)) {
            e(str2, jSONObject);
        } else {
            v1.b("CartAnimManager", "saveDiskAndSendBroadcast, isGotoDetail is false");
        }
    }

    public static void g(k8 k8Var, String str, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80c3e4e4", new Object[]{k8Var, str, map});
        } else if (!r8l.a()) {
            v1.b("CartAnimManager", "saveDiskAndSendBroadcast fail, and enableAddToCartAnim is false");
        } else if (k8Var == null || !d(k8Var)) {
            v1.b("CartAnimManager", "saveDiskAndSendBroadcast, isGotoDetail is false");
        } else {
            e(str, b(map));
        }
    }

    public static boolean c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9d72c73", new Object[]{str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            v1.b("CartAnimManager", "isGotoDetail fail, and url is empty!");
            return false;
        }
        try {
            return "launchAdvertisement".equals(Uri.parse(str).getQueryParameter("from"));
        } catch (Exception e) {
            v1.b("CartAnimManager", "isGotoDetail fail, and error: " + e.getMessage());
            return false;
        }
    }
}
