package tb;

import android.content.Context;
import android.net.Uri;
import com.alibaba.ability.hub.AbilityHubAdapter;
import com.alibaba.ability.impl.stdpop.StdPopAbility;
import com.alibaba.ability.result.ExecuteResult;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.ut.abtest.UTABTest;
import com.alibaba.ut.abtest.Variation;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import tb.uem;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class bca {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a extends TypeReference<HashMap<String, String>> {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class b implements uem.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.uem.b
        public void a(String str, String str2, String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("30005e67", new Object[]{this, str, str2, str3});
                return;
            }
            hgh.b("PopLayerTrigger onDisplayed protocol: " + str2);
        }

        @Override // tb.uem.b
        public void b(String str, boolean z, boolean z2, String str2, String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9e12c310", new Object[]{this, str, new Boolean(z), new Boolean(z2), str2, str3});
                return;
            }
            hgh.b("PopLayerTrigger onClosed closeReason: " + str2);
        }

        @Override // tb.uem.b
        public void c(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("42b06e87", new Object[]{this, str});
                return;
            }
            hgh.b("PopLayerTrigger onTriggerFailed reason: " + str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class c extends TypeReference<HashMap<String, String>> {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class d implements s2d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.s2d
        public void onCallback(ExecuteResult executeResult) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f183ed74", new Object[]{this, executeResult});
                return;
            }
            hgh.d("AbilityHubAdapter.call result：" + JSON.toJSONString(executeResult.toFormattedData()));
        }
    }

    static {
        t2o.a(437256216);
    }

    public static void a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e1b28a1", new Object[]{context, str});
            return;
        }
        Variation variation = UTABTest.activate("AB_", "202301301925_1833").getVariation("addDesktopNewMode");
        if (!b9l.g() || variation == null || !variation.getValueAsBoolean(false)) {
            hgh.d("GlobalNavigationService addRouter isNewMode false");
            c(str);
            return;
        }
        hgh.d("GlobalNavigationService addRouter isNewMode true");
        d(context, str);
    }

    public static void b(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68484710", new Object[]{context, str});
            return;
        }
        try {
            a(context, str);
        } catch (Exception e) {
            hgh.d("GlobalNavigationService addDesktop error: " + e.getMessage());
        }
    }

    public static String e(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7abf558", new Object[]{str, map});
        }
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        for (String str2 : map.keySet()) {
            buildUpon.appendQueryParameter(str2, map.get(str2));
        }
        buildUpon.build();
        return buildUpon.toString();
    }

    public static void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94e3f358", new Object[]{str});
            return;
        }
        String e = e("poplayer://tbShortcutGuide", (HashMap) JSON.parseObject(str, new a(), new Feature[0]));
        hgh.d("GlobalNavigationService addShortcut uri: " + e);
        uem.m(e, e).j(new b()).l();
    }

    public static void d(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4b13fc6", new Object[]{context, str});
            return;
        }
        String e = e("https://market.m.taobao.com/app/starlink/universal-tb-shortcut/swiper-guide", (HashMap) JSON.parseObject(str, new c(), new Feature[0]));
        hgh.d("GlobalNavigationService addWidget uri: " + e);
        AbilityHubAdapter abilityHubAdapter = new AbilityHubAdapter(new zq("manufacturer", "manufacturer").a(context));
        JSONObject jSONObject = new JSONObject(2);
        jSONObject.put("url", (Object) e);
        jSONObject.put("popId", (Object) "float-layer-pop");
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("animation", (Object) nbf.STDPOP_ANIMATION_BOTTOM);
        jSONObject2.put("panEnable", (Object) "true");
        jSONObject2.put("originHeight", (Object) "0.8");
        jSONObject.put(h9.KEY_POP_CONFIG, (Object) jSONObject2);
        abilityHubAdapter.j("stdPop", StdPopAbility.API_H5, new xq(), jSONObject, new d());
    }
}
