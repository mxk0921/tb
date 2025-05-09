package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.task.Coordinator;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class e7p {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_SHOW_SEC_SCREEN_LIVE_MODE = "showSecScreenLiveMode";
    public static final String KEY_SHOW_SEC_SCREEN_SHOP_MODE = "showSecScreenShopMode";

    /* renamed from: a  reason: collision with root package name */
    public boolean f18343a;
    public boolean b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            rgj.d("cache_showLive", e7p.a(e7p.this));
            rgj.d("cache_showShop", e7p.b(e7p.this));
        }
    }

    static {
        t2o.a(745538152);
    }

    public static /* synthetic */ boolean a(e7p e7pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9967da0a", new Object[]{e7pVar})).booleanValue();
        }
        return e7pVar.f18343a;
    }

    public static /* synthetic */ boolean b(e7p e7pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("befbe30b", new Object[]{e7pVar})).booleanValue();
        }
        return e7pVar.b;
    }

    public static e7p c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e7p) ipChange.ipc$dispatch("e022c7c9", new Object[0]);
        }
        e7p e7pVar = new e7p();
        e7pVar.f18343a = rgj.a("cache_showLive", "true");
        e7pVar.b = rgj.a("cache_showShop", "true");
        return e7pVar;
    }

    public static e7p d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e7p) ipChange.ipc$dispatch("b7dc0c0e", new Object[0]);
        }
        e7p e7pVar = new e7p();
        e7pVar.f18343a = rgj.a(rgj.SWITCH_SEC_LIVE, "true");
        e7pVar.b = rgj.a(rgj.SWITCH_SEC_SHOP, "true");
        return e7pVar;
    }

    public static void i(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a19b78e", new Object[]{jSONObject});
            return;
        }
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject(q3g.b);
            rgj.c(rgj.KEY_SHOW_SEC_SCREEN_LIVE_SWITCH, jSONObject2.getBooleanValue(rgj.KEY_SHOW_SEC_SCREEN_LIVE_SWITCH));
            rgj.c(rgj.KEY_SHOW_SEC_SCREEN_SHOP_SWITCH, jSONObject2.getBooleanValue(rgj.KEY_SHOW_SEC_SCREEN_SHOP_SWITCH));
        } catch (Throwable th) {
            cph.a("parse_json", "setSecScreenConfigToSettings", "二屏配置解析异常 " + th.getMessage());
        }
    }

    public boolean e(e7p e7pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e1ecd99", new Object[]{this, e7pVar})).booleanValue();
        }
        if (e7pVar != null && this.f18343a == e7pVar.f18343a && this.b == e7pVar.b) {
            return true;
        }
        return false;
    }

    public boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("11d0b601", new Object[]{this})).booleanValue();
        }
        return this.f18343a;
    }

    public boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("80565b8b", new Object[]{this})).booleanValue();
        }
        return this.b;
    }

    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84643f84", new Object[]{this});
        } else {
            Coordinator.execute(new a());
        }
    }
}
