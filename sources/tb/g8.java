package tb;

import com.alibaba.ability.impl.hapticsengine.HapticsEngineAbility;
import com.alibaba.ability.impl.nfc.NfcAbility;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilitykit.mega.MegaHubBuilder;
import com.taobao.android.behavir.config.BHRTaskConfigBase;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class g8 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static Map<String, w8> f19780a = new HashMap(0);
    public static v8 b = null;
    public static y8 c = null;
    public static j8 d = null;
    public static bee e = null;
    public static l8 f = null;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a implements l8 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.l8
        public String a(y7 y7Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("c91e1658", new Object[]{this, y7Var});
            }
            if (y7Var == null) {
                return "AbilityKit";
            }
            return y7Var.g().getBusinessID();
        }
    }

    static {
        t2o.a(336592909);
    }

    public static bee a() {
        try {
            return (bee) e.getClass().newInstance();
        } catch (Throwable unused) {
            return null;
        }
    }

    public static j8 b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (j8) ipChange.ipc$dispatch("691ad58", new Object[0]);
        }
        return d;
    }

    public static y8 c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (y8) ipChange.ipc$dispatch("ad08a8bd", new Object[0]);
        }
        return c;
    }

    public static v8 d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (v8) ipChange.ipc$dispatch("a962c064", new Object[0]);
        }
        return b;
    }

    public static l8 e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (l8) ipChange.ipc$dispatch("adf15d42", new Object[0]);
        }
        if (f == null) {
            f = new a();
        }
        return f;
    }

    public static void f(Map<String, w8> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7171a547", new Object[]{map});
            return;
        }
        if (map != null) {
            f19780a = map;
        } else {
            f19780a = new HashMap(200);
        }
        MegaHubBuilder megaHubBuilder = new MegaHubBuilder("toast", "show");
        f19780a.put("19624396198704", megaHubBuilder);
        f19780a.put("toast", megaHubBuilder);
        q8 q8Var = new q8(o9.class);
        f19780a.put(o9.UT_KEY, q8Var);
        f19780a.put(BHRTaskConfigBase.TYPE_CONFIG_UT, q8Var);
        q8 q8Var2 = new q8(b9.class);
        f19780a.put(b9.OPEN_URL_KEY, q8Var2);
        f19780a.put("openUrl", q8Var2);
        q8 q8Var3 = new q8(p8.class);
        f19780a.put(p8.CHAIN_STORAGE_SET_KEY, q8Var3);
        f19780a.put("chainStorageSet", q8Var3);
        f19780a.put("engineStorageGet", new vhi(new qq(ze8.class), "get"));
        vhi vhiVar = new vhi(new qq(ze8.class), "set");
        f19780a.put("-5501025549152042105", vhiVar);
        f19780a.put("engineStorageSet", vhiVar);
        vhi vhiVar2 = new vhi(new qq(ze8.class), "remove");
        f19780a.put("-7356852182257447732", vhiVar2);
        f19780a.put("engineStorageRemove", vhiVar2);
        q8 q8Var4 = new q8(o8.class);
        f19780a.put(o8.CHAIN_STORAGE_REMOVE_KEY, q8Var4);
        f19780a.put("chainStorageRemove", q8Var4);
        MegaHubBuilder megaHubBuilder2 = new MegaHubBuilder("modal", "confirm");
        f19780a.put("16887455482557", megaHubBuilder2);
        f19780a.put("alert", megaHubBuilder2);
        MegaHubBuilder megaHubBuilder3 = new MegaHubBuilder("clipboard", "set", new pt4());
        f19780a.put("33283577007", megaHubBuilder3);
        f19780a.put("copy", megaHubBuilder3);
        q8 q8Var5 = new q8(wvq.class);
        f19780a.put(wvq.SUBSCRIBEMSG_KEY, q8Var5);
        f19780a.put("subscribeMsg", q8Var5);
        q8 q8Var6 = new q8(ljm.class);
        f19780a.put(ljm.POSTMSG_KEY, q8Var6);
        f19780a.put("postMsg", q8Var6);
        f19780a.put(c8a.GETABILITYRESULT, new q8(c8a.class));
        q8 q8Var7 = new q8(da7.class);
        f19780a.put(da7.DELAY, q8Var7);
        f19780a.put("delay", q8Var7);
        q8 q8Var8 = new q8(b52.class);
        f19780a.put("batchEngineStorageSet", q8Var8);
        f19780a.put(b52.BATCHENGINESTORAGESET, q8Var8);
        q8 q8Var9 = new q8(a52.class);
        f19780a.put("batchChainStorageSet", q8Var9);
        f19780a.put(a52.BATCHCHAINSTORAGESET, q8Var9);
        vhi vhiVar3 = new vhi(new qq(xe8.class), xe8.UNSUBSCRIBE);
        f19780a.put("3543788934920872410", vhiVar3);
        f19780a.put(xe8.UNSUBSCRIBE, vhiVar3);
        MegaHubBuilder megaHubBuilder4 = new MegaHubBuilder("appLocalStorage", "set");
        f19780a.put("localStorageSet", megaHubBuilder4);
        f19780a.put("5790826678801003547", megaHubBuilder4);
        MegaHubBuilder megaHubBuilder5 = new MegaHubBuilder("appLocalStorage", "remove");
        f19780a.put("localStorageRemove", megaHubBuilder5);
        f19780a.put("1205113155689526880", megaHubBuilder5);
        f19780a.put("localStorageGet", new MegaHubBuilder("appLocalStorage", "get"));
        MegaHubBuilder megaHubBuilder6 = new MegaHubBuilder("loading", "show");
        f19780a.put("-2939618971112730742", megaHubBuilder6);
        f19780a.put("showLoading", megaHubBuilder6);
        MegaHubBuilder megaHubBuilder7 = new MegaHubBuilder("loading", "hide");
        f19780a.put("8835679324859276387", megaHubBuilder7);
        f19780a.put("hideLoading", megaHubBuilder7);
        f19780a.put("-6497110954824747617", new MegaHubBuilder("telephone", "call"));
        MegaHubBuilder megaHubBuilder8 = new MegaHubBuilder("nfc", "checkStatus");
        f19780a.put("108007756778224807", megaHubBuilder8);
        f19780a.put("nfcCheckStatus", megaHubBuilder8);
        MegaHubBuilder megaHubBuilder9 = new MegaHubBuilder("nfc", "subscribe");
        f19780a.put("5117748265580200421", megaHubBuilder9);
        f19780a.put("nfcSubscribe", megaHubBuilder9);
        MegaHubBuilder megaHubBuilder10 = new MegaHubBuilder("nfc", NfcAbility.API_UNSUBSCRIBE);
        f19780a.put("6484524228157736106", megaHubBuilder10);
        f19780a.put("nfcUnSubscribe", megaHubBuilder10);
        f19780a.put("-8650336092319702444", new MegaHubBuilder("hapticsEngine", HapticsEngineAbility.API_IMPACT_LIGHT));
        f19780a.put("-7245659340636260162", new MegaHubBuilder("hapticsEngine", HapticsEngineAbility.API_IMPACT_MEDIUM));
        f19780a.put("-8654928393693493159", new MegaHubBuilder("hapticsEngine", HapticsEngineAbility.API_IMPACT_HEAVY));
        f19780a.put("4199085201809887479", new MegaHubBuilder("hapticsEngine", HapticsEngineAbility.API_IMPACT_SOFT));
        f19780a.put("-8643474493436904629", new MegaHubBuilder("hapticsEngine", HapticsEngineAbility.API_IMPACT_RIGID));
        f19780a.put("-4519297587126488378", new MegaHubBuilder("hapticsEngine", HapticsEngineAbility.API_NOTIFICATION_SUCCESS));
        f19780a.put("5513535128116053699", new MegaHubBuilder("hapticsEngine", HapticsEngineAbility.API_NOTIFICATION_WARNING));
        f19780a.put("-2061066385349986315", new MegaHubBuilder("hapticsEngine", HapticsEngineAbility.API_NOTIFICATION_ERROR));
        f19780a.put("5385686896002704622", new MegaHubBuilder("hapticsEngine", HapticsEngineAbility.API_SELECTION_CHANGE));
        f19780a.put("-4656032954816542521", new MegaHubBuilder("hapticsEngine", HapticsEngineAbility.API_VIBRATE));
        f19780a.put("-1969902236801825729", new MegaHubBuilder("hapticsEngine", "cancel"));
    }
}
