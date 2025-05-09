package tb;

import android.os.Looper;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavir.config.BHRTaskConfigBase;
import com.taobao.android.opencart.check.CheckHoldManager;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.android.xsearchplugin.muise.SFMuiseSDK;
import com.ut.mini.UTAnalytics;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class ml1 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EXPOSURE_ONCE_KEY = "_exposureItemAutoUT";
    public static boolean b;

    /* renamed from: a  reason: collision with root package name */
    public final kmb f24113a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ IDMComponent f24114a;
        public final /* synthetic */ String b;
        public final /* synthetic */ int c;
        public final /* synthetic */ JSONObject d;
        public final /* synthetic */ Map e;

        public a(IDMComponent iDMComponent, String str, int i, JSONObject jSONObject, Map map) {
            this.f24114a = iDMComponent;
            this.b = str;
            this.c = i;
            this.d = jSONObject;
            this.e = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                ml1.a(ml1.this, this.f24114a, this.b, this.c, this.d, this.e);
            } catch (Exception e) {
                hav.b(c9x.CART_BIZ_NAME, "asyncAutoUTException", e.getMessage());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f24115a;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;
        public final /* synthetic */ String d;
        public final /* synthetic */ Map e;

        public b(int i, String str, String str2, String str3, Map map) {
            this.f24115a = i;
            this.b = str;
            this.c = str2;
            this.d = str3;
            this.e = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                ml1.b(ml1.this, this.f24115a, this.b, this.c, this.d, this.e);
            }
        }
    }

    static {
        t2o.a(479199475);
    }

    public ml1(kmb kmbVar) {
        this.f24113a = kmbVar;
        b = vav.a(c9x.CART_BIZ_NAME, "enableAsyncAutoUTExposureEvent", true);
    }

    public static /* synthetic */ void a(ml1 ml1Var, IDMComponent iDMComponent, String str, int i, JSONObject jSONObject, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770b4c0c", new Object[]{ml1Var, iDMComponent, str, new Integer(i), jSONObject, map});
        } else {
            ml1Var.k(iDMComponent, str, i, jSONObject, map);
        }
    }

    public static /* synthetic */ void b(ml1 ml1Var, int i, String str, String str2, String str3, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62812dd7", new Object[]{ml1Var, new Integer(i), str, str2, str3, map});
        } else {
            ml1Var.j(i, str, str2, str3, map);
        }
    }

    public static String g(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bcd290c7", new Object[]{new Boolean(z)});
        }
        if (z) {
            return "1";
        }
        return "0";
    }

    public static Map<String, String> h(kmb kmbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("eecc131", new Object[]{kmbVar});
        }
        return i(kmbVar, null);
    }

    public static Map<String, String> i(kmb kmbVar, Map<String, String> map) {
        String str;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("6b10da7e", new Object[]{kmbVar, map});
        }
        zxb P = kmbVar.d();
        HashMap hashMap = new HashMap();
        hashMap.put("isPoplayerFiltering", g(P.L()));
        hashMap.put("isManaging", g(P.K()));
        if (P.y() == null) {
            str = "";
        } else {
            str = P.y();
        }
        hashMap.put("currentFilterItem", str);
        hashMap.put("cartFrom", kmbVar.W().f());
        if (sca.A(P)) {
            str2 = "mix";
        } else {
            str2 = "";
        }
        hashMap.put("cartMode", str2);
        hashMap.put(v4s.PARAM_IS_INNER, g(kjf.a()));
        hashMap.put(c9x.CART_BIZ_NAME, "true");
        hashMap.put(d71.PARAM_TINCT_TAG, zxu.f(c9x.CART_BIZ_NAME));
        hashMap.put("currentCheckedCount", CheckHoldManager.i().e() + "");
        hashMap.put(na3.sKeyFeedFlowType, kmbVar.W().k());
        if (map != null) {
            hashMap.putAll(map);
        }
        return hashMap;
    }

    public static JSONObject l(JSONObject jSONObject) {
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("3e461c88", new Object[]{jSONObject});
        }
        if (jSONObject == null || (jSONObject2 = jSONObject.getJSONObject("features")) == null || (jSONObject3 = jSONObject2.getJSONObject(BHRTaskConfigBase.TYPE_CONFIG_UT)) == null || !jSONObject3.getBooleanValue("autoUt")) {
            return null;
        }
        return jSONObject3.getJSONObject("args");
    }

    public static String m(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("29cc1b65", new Object[]{iDMComponent});
        }
        if (cb4.Q(iDMComponent)) {
            return "custom";
        }
        if (cb4.U(iDMComponent)) {
            return "shop";
        }
        return "empty";
    }

    public void c(IDMComponent iDMComponent, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63701c97", new Object[]{this, iDMComponent, str});
        } else {
            d(iDMComponent, str, 2101, new HashMap());
        }
    }

    public final void d(IDMComponent iDMComponent, String str, int i, Map<String, String> map) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae06b3ad", new Object[]{this, iDMComponent, str, new Integer(i), map});
        } else if (iDMComponent != null && iDMComponent.getData() != null && (jSONObject = iDMComponent.getData().getJSONObject("features")) != null && (jSONObject2 = jSONObject.getJSONObject(BHRTaskConfigBase.TYPE_CONFIG_UT)) != null && jSONObject2.getBooleanValue("autoUt")) {
            if (b) {
                map.put("currentCheckedCount", String.valueOf(CheckHoldManager.i().e()));
                pav.k(new a(iDMComponent, str, i, jSONObject2, map));
                return;
            }
            try {
                k(iDMComponent, str, i, jSONObject2, map);
            } catch (Exception e) {
                hav.b(c9x.CART_BIZ_NAME, "autoUTException", e.getMessage());
            }
        }
    }

    public void e(IDMComponent iDMComponent, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e67014b2", new Object[]{this, iDMComponent, str});
        } else {
            d(iDMComponent, str, 2201, new HashMap());
        }
    }

    public void f(IDMComponent iDMComponent, String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0a38c93", new Object[]{this, iDMComponent, str, map});
            return;
        }
        if (map == null) {
            map = new HashMap<>();
        }
        d(iDMComponent, str, 2201, map);
    }

    public final void j(int i, String str, String str2, String str3, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6650c836", new Object[]{this, new Integer(i), str, str2, str3, map});
        } else {
            UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder(this.f24113a.W().o(), i, str, str2, str3, map).build());
        }
    }

    public final void k(IDMComponent iDMComponent, String str, int i, JSONObject jSONObject, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6da6053a", new Object[]{this, iDMComponent, str, new Integer(i), jSONObject, map});
            return;
        }
        String str2 = "Page_ShoppingCart_" + iDMComponent.getTag() + "_" + str;
        String string = jSONObject.getString("arg2");
        String string2 = jSONObject.getString("arg3");
        if (string == null) {
            string = "";
        }
        if (string2 == null) {
            string2 = "";
        }
        Map<String, String> i2 = i(this.f24113a, map);
        JSONObject jSONObject2 = jSONObject.getJSONObject("args");
        if (jSONObject2 != null) {
            for (String str3 : jSONObject2.keySet()) {
                i2.put(str3, jSONObject2.getString(str3));
            }
        }
        String tag = iDMComponent.getTag();
        if ("item".equals(tag)) {
            i2.put(SFMuiseSDK.MUISE_BUNDLE_TYPE, m(iDMComponent));
            if ("item".equals(iDMComponent.getTag())) {
                try {
                    i2.put("itemIndex", String.valueOf(vo0.e(iDMComponent, this.f24113a)));
                } catch (Exception e) {
                    ub3.g("getModelIndexException", e.getMessage());
                }
            }
        } else if ("bundleHeader".equals(tag)) {
            i2.put(SFMuiseSDK.MUISE_BUNDLE_TYPE, m(iDMComponent));
            if (i == 2101) {
                String n = n(iDMComponent);
                if (!TextUtils.isEmpty(n)) {
                    i2.put("checkedItemIds", n);
                }
            }
        } else if ("shop".equals(iDMComponent.getTag()) && i == 2101) {
            String n2 = n(iDMComponent);
            if (!TextUtils.isEmpty(n2)) {
                i2.put("checkedItemIds", n2);
            }
        }
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            pav.k(new b(i, str2, string, string2, i2));
        } else {
            j(i, str2, string, string2, i2);
        }
    }

    public final String n(IDMComponent iDMComponent) {
        List<IDMComponent> q;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9029007", new Object[]{this, iDMComponent});
        }
        if (iDMComponent == null || cb4.P(iDMComponent) || (q = cb4.q(iDMComponent)) == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (IDMComponent iDMComponent2 : q) {
            if ("item".equals(iDMComponent2.getTag()) && cb4.a(iDMComponent2)) {
                sb.append(iDMComponent2.getFields().getString("itemId"));
                sb.append("#");
            }
        }
        if (sb.toString().endsWith("#")) {
            sb.delete(sb.length() - 1, sb.length());
        }
        return sb.toString();
    }
}
