package tb;

import android.os.Build;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail2.core.biz.superitemcard.viewholder.SuperItemViewHolder;
import com.taobao.android.editionswitcher.PositionInfo;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.data.DataVersionManager;
import com.taobao.android.fluid.framework.data.remote.base.IMTOPRequest;
import com.taobao.android.fluid.framework.data.remote.newmodel.NewRecommendRequest;
import com.taobao.android.layoutmanager.module.MtopModule;
import com.taobao.tao.flexbox.layoutmanager.core.o;
import java.util.Map;
import tb.c4o;
import tb.k1k;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class jwi {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String MATCH_ALL = "*";
    public static final String MATCH_IGNORE = "ignore";
    public static final String MATCH_NONE = "-";

    static {
        t2o.a(468714248);
    }

    public static k1k.a a(pep pepVar, String str, String str2) {
        String str3;
        String str4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (k1k.a) ipChange.ipc$dispatch("c2cf5ae5", new Object[]{pepVar, str, str2});
        }
        NewRecommendRequest newRecommendRequest = new NewRecommendRequest();
        PositionInfo i = o78.i(o.J());
        k1k.a u = new k1k().e(pepVar, newRecommendRequest).b().c(g()).h(str).r(pepVar.c).z(pepVar.b).s(pepVar.b).q(inx.c("nq")).u(str2);
        if (p91.l()) {
            str3 = "y";
        } else {
            str3 = "n";
        }
        k1k.a v = u.n(str3).d(nwv.M(o.J())).v(Build.MODEL);
        if (i == null) {
            str4 = o78.CHINA_MAINLAND;
        } else {
            str4 = i.countryCode;
        }
        return v.i(str4).o("content").m(SuperItemViewHolder.VIEWHOLDER_KEY).p(x3w.OPEN_TYPE_MVP).x("POST").j(DataVersionManager.k(pepVar.b));
    }

    public static njd b(boolean z, boolean z2, int i, String str, pep pepVar, Map map, Map map2, boolean z3, FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (njd) ipChange.ipc$dispatch("7169d9d4", new Object[]{new Boolean(z), new Boolean(z2), new Integer(i), str, pepVar, map, map2, new Boolean(z3), fluidContext});
        }
        String str2 = !sz3.b(map) ? (String) map.get(c4o.KEY_TAB3COMPONENTSOURCE) : null;
        String c = nql.c(pepVar, map2);
        c4o.a k = nql.f(pepVar, str2, z2, false, null, fluidContext).k(z3);
        k1k.a a2 = a(pepVar, str, "1");
        a2.k(c).l(JSON.toJSONString(k.a())).A(z).w(i).a();
        if (z2) {
            a2.g("detail_launch");
        } else {
            a2.g("detail_preload");
        }
        return a2;
    }

    public static njd c(FluidContext fluidContext, tg7 tg7Var, pep pepVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (njd) ipChange.ipc$dispatch("1ce72da3", new Object[]{fluidContext, tg7Var, pepVar, new Boolean(z)});
        }
        tfs.c("RecommendNewMixUtils", "开始请求");
        String str = null;
        String str2 = (z || !ws6.i()) ? null : k1k.ASAC_VALUE;
        k1k.a a2 = a(pepVar, tg7Var.b(), "1");
        a2.k(tg7Var.c()).l(tg7Var.e()).A(z).e(str2).a();
        JSONObject build = tg7Var.build();
        JSONObject jSONObject = build != null ? build.getJSONObject("options") : null;
        if (jSONObject != null) {
            str = jSONObject.getString(MtopModule.KEY_MTOP_BIZ_TOPIC);
        }
        if (str != null) {
            a2.g(str);
        }
        return a2;
    }

    public static IMTOPRequest d(FluidContext fluidContext, pep pepVar, String str, String str2, String str3, int i, String str4, boolean z, boolean z2) {
        String str5;
        String str6;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IMTOPRequest) ipChange.ipc$dispatch("e22f1a74", new Object[]{fluidContext, pepVar, str, str2, str3, new Integer(i), str4, new Boolean(z), new Boolean(z2)});
        }
        if (TextUtils.isEmpty(str)) {
            str = pepVar.d;
        }
        if (z) {
            str5 = "8";
        } else {
            str5 = "1";
        }
        k1k.a l = a(pepVar, str, str5).l(str2);
        if (z2) {
            str6 = k1k.ASAC_VALUE;
        } else {
            str6 = null;
        }
        return l.e(str6).f(str3).t(i).y(str4).a().getMtopRequest();
    }

    public static IMTOPRequest e(FluidContext fluidContext, pep pepVar, String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IMTOPRequest) ipChange.ipc$dispatch("e028c61e", new Object[]{fluidContext, pepVar, str});
        }
        ir9.b("RecommendNewMixUtils", "fetchContentDetail request detail buildExtendParameters refreshCurrentData");
        c4o.a f = nql.f(pepVar, fluidContext.getInstanceConfig().getTab3ComponentSource(), false, true, null, fluidContext);
        k1k.a a2 = a(pepVar, str, "1");
        k1k.a k = a2.k(pepVar.g);
        if (ws6.i()) {
            str2 = k1k.ASAC_VALUE;
        } else {
            str2 = null;
        }
        k.e(str2).l(JSON.toJSONString(f.a())).a();
        return a2.getMtopRequest();
    }

    public static String f(ncp ncpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("42ce2fcd", new Object[]{ncpVar});
        }
        return ncpVar.q;
    }

    public static String g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8e421f57", new Object[0]);
        }
        String H2 = akt.H2("ShortVideo.newRecommendMtopAppId", "666");
        ir9.b("RecommendNewMixUtils", "getNewRecommendMtopAppId appId:" + H2);
        return H2;
    }
}
