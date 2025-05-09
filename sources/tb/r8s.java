package tb;

import android.text.TextUtils;
import com.alibaba.ariver.resource.api.models.PluginModel;
import com.alibaba.ariver.resource.api.models.TemplateConfigModel;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.container.Window;
import com.taobao.themis.kernel.metaInfo.TMSMetaInfoWrapper;
import com.taobao.themis.kernel.solution.TMSSolutionType;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class r8s {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            t2o.a(839909960);
            int[] iArr = new int[TMSSolutionType.values().length];
            iArr[TMSSolutionType.MINIGAME.ordinal()] = 1;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        t2o.a(839909959);
    }

    public static final String A(bbs bbsVar) {
        JSONObject e;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ac6c439a", new Object[]{bbsVar});
        }
        ckf.g(bbsVar, "<this>");
        TMSMetaInfoWrapper U = bbsVar.U();
        if (U == null || (e = U.e()) == null) {
            return null;
        }
        return e.getString("widgetPackageUrl");
    }

    public static final String B(bbs bbsVar) {
        JSONObject e;
        String string;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("41521fa3", new Object[]{bbsVar});
        }
        ckf.g(bbsVar, "<this>");
        TMSMetaInfoWrapper U = bbsVar.U();
        return (U == null || (e = U.e()) == null || (string = e.getString("widgetRuntimeVersion")) == null) ? "" : string;
    }

    public static final boolean C(bbs bbsVar) {
        JSONObject e;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b40529b3", new Object[]{bbsVar})).booleanValue();
        }
        ckf.g(bbsVar, "<this>");
        TMSMetaInfoWrapper U = bbsVar.U();
        if (U == null || (e = U.e()) == null || e.getIntValue("appChannel") != 5) {
            return false;
        }
        return true;
    }

    public static final boolean D(bbs bbsVar) {
        TemplateConfigModel y;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("713535ff", new Object[]{bbsVar})).booleanValue();
        }
        ckf.g(bbsVar, "<this>");
        TMSMetaInfoWrapper U = bbsVar.U();
        if (U == null || (y = U.y()) == null || !y.isTemplateValid()) {
            return false;
        }
        return true;
    }

    public static final String a(bbs bbsVar) {
        JSONObject e;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ede6f0ff", new Object[]{bbsVar});
        }
        ckf.g(bbsVar, "<this>");
        TMSMetaInfoWrapper U = bbsVar.U();
        if (U == null || (e = U.e()) == null) {
            return null;
        }
        return e.getString("instanceSite");
    }

    public static final String b(bbs bbsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c3b0801", new Object[]{bbsVar});
        }
        ckf.g(bbsVar, "<this>");
        TMSMetaInfoWrapper U = bbsVar.U();
        if (U == null) {
            return null;
        }
        return U.a();
    }

    public static final String c(bbs bbsVar) {
        JSONObject e;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3d8ecc81", new Object[]{bbsVar});
        }
        ckf.g(bbsVar, "<this>");
        TMSMetaInfoWrapper U = bbsVar.U();
        String str = null;
        if (!(U == null || (e = U.e()) == null)) {
            str = e.getString("frameTempType");
        }
        if (TextUtils.isEmpty(str)) {
            return bbsVar.c0().getAppFrameType();
        }
        return str;
    }

    public static final String d(bbs bbsVar) {
        String i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4e7931a9", new Object[]{bbsVar});
        }
        ckf.g(bbsVar, "<this>");
        TMSMetaInfoWrapper U = bbsVar.U();
        if (U == null || (i = U.i()) == null) {
            return "";
        }
        return i;
    }

    public static final String e(bbs bbsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fdd188a7", new Object[]{bbsVar});
        }
        ckf.g(bbsVar, "<this>");
        TMSMetaInfoWrapper U = bbsVar.U();
        if (U == null) {
            return null;
        }
        return U.j();
    }

    public static final String f(bbs bbsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ec2247c7", new Object[]{bbsVar});
        }
        ckf.g(bbsVar, "<this>");
        TMSMetaInfoWrapper U = bbsVar.U();
        if (U == null) {
            return null;
        }
        return U.k();
    }

    public static final String g(bbs bbsVar) {
        JSONObject e;
        JSONObject jSONObject;
        String string;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ad55829d", new Object[]{bbsVar});
        }
        ckf.g(bbsVar, "<this>");
        TMSMetaInfoWrapper U = bbsVar.U();
        return (U == null || (e = U.e()) == null || (jSONObject = e.getJSONObject("appNaviConfig")) == null || (string = jSONObject.getString("style")) == null) ? "" : string;
    }

    public static final String h(bbs bbsVar) {
        JSONObject e;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1312500e", new Object[]{bbsVar});
        }
        ckf.g(bbsVar, "<this>");
        String str = null;
        str = o9s.h(bbsVar.K()) ? bbsVar.c0().getAppSubType() : null;
        if (TextUtils.isEmpty(str)) {
            TMSMetaInfoWrapper U = bbsVar.U();
            if (!(U == null || (e = U.e()) == null)) {
                str = e.getString(qxq.SUB_KEY_FRAGMENT_JUMP);
            }
        }
        return TextUtils.isEmpty(str) ? bbsVar.c0().getAppSubType() : str;
    }

    public static final String i(bbs bbsVar) {
        String l;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("11e03610", new Object[]{bbsVar});
        }
        ckf.g(bbsVar, "<this>");
        TMSMetaInfoWrapper U = bbsVar.U();
        if (U == null || (l = U.l()) == null) {
            return "-1";
        }
        return l;
    }

    public static final String j(bbs bbsVar) {
        JSONObject e;
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e38659c", new Object[]{bbsVar});
        }
        ckf.g(bbsVar, "<this>");
        TMSMetaInfoWrapper U = bbsVar.U();
        String str = null;
        if (!(U == null || (e = U.e()) == null || (jSONObject = e.getJSONObject("authInfo")) == null)) {
            str = jSONObject.getString("authAppkey");
        }
        if (str == null) {
            return d(bbsVar);
        }
        return str;
    }

    public static final String k(bbs bbsVar) {
        JSONObject e;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f0782086", new Object[]{bbsVar});
        }
        ckf.g(bbsVar, "<this>");
        TMSMetaInfoWrapper U = bbsVar.U();
        String str = null;
        if (!(U == null || (e = U.e()) == null)) {
            str = e.getString("bizType");
        }
        if (TextUtils.isEmpty(str)) {
            return bbsVar.c0().getBizType();
        }
        return str;
    }

    public static final String l(bbs bbsVar) {
        JSONObject e;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("34a3e409", new Object[]{bbsVar});
        }
        ckf.g(bbsVar, "<this>");
        TMSMetaInfoWrapper U = bbsVar.U();
        if (U == null || (e = U.e()) == null) {
            return null;
        }
        return e.getString("developer");
    }

    public static final String m(bbs bbsVar) {
        int i;
        Window f;
        Window.Orientation j;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3cb9c639", new Object[]{bbsVar});
        }
        ckf.g(bbsVar, "<this>");
        TMSSolutionType a0 = bbsVar.a0();
        if (a0 == null) {
            i = -1;
        } else {
            i = a.$EnumSwitchMapping$0[a0.ordinal()];
        }
        if (i == 1) {
            TMSMetaInfoWrapper U = bbsVar.U();
            if (U == null) {
                return null;
            }
            return U.p();
        }
        mm4 N = bbsVar.N();
        if (N == null || (f = N.f()) == null || (j = f.j()) == null) {
            return null;
        }
        return j.getOrientation();
    }

    public static final List<PluginModel> n(bbs bbsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("8b9764c", new Object[]{bbsVar});
        }
        ckf.g(bbsVar, "<this>");
        TMSMetaInfoWrapper P = bbsVar.P();
        if (P == null) {
            return null;
        }
        return P.g();
    }

    public static final boolean o(bbs bbsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fec5371d", new Object[]{bbsVar})).booleanValue();
        }
        ckf.g(bbsVar, "<this>");
        TMSMetaInfoWrapper U = bbsVar.U();
        if (U == null) {
            return false;
        }
        return U.q();
    }

    public static final String p(bbs bbsVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d01ba45", new Object[]{bbsVar, str});
        }
        ckf.g(bbsVar, "<this>");
        if (str == null || wsq.a0(str)) {
            str = null;
        }
        if (str != null) {
            return str;
        }
        String w = w(bbsVar);
        if (w != null) {
            return w;
        }
        String L = bbsVar.L();
        ckf.f(L, "appId");
        return L;
    }

    public static /* synthetic */ String q(bbs bbsVar, String str, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f9c2b039", new Object[]{bbsVar, str, new Integer(i), obj});
        }
        if ((i & 1) != 0) {
            str = null;
        }
        return p(bbsVar, str);
    }

    public static final String r(bbs bbsVar) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c8211c91", new Object[]{bbsVar});
        }
        ckf.g(bbsVar, "<this>");
        String x = x(bbsVar);
        if (x == null || x.length() == 0) {
            z = true;
        }
        if (z) {
            x = null;
        }
        if (x == null) {
            return d(bbsVar);
        }
        return x;
    }

    public static final String s(bbs bbsVar) {
        JSONObject e;
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9cfe5350", new Object[]{bbsVar});
        }
        ckf.g(bbsVar, "<this>");
        TMSMetaInfoWrapper U = bbsVar.U();
        String str = null;
        if (!(U == null || (e = U.e()) == null || (jSONObject = e.getJSONObject("authInfo")) == null)) {
            str = jSONObject.getString("authAppId");
        }
        if (str != null) {
            return str;
        }
        String L = bbsVar.L();
        ckf.f(L, "appId");
        return L;
    }

    public static final String t(bbs bbsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("17b6af3a", new Object[]{bbsVar});
        }
        ckf.g(bbsVar, "<this>");
        return bbsVar.c0().getOpenModel();
    }

    public static final String u(bbs bbsVar) {
        JSONObject e;
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5b660fb2", new Object[]{bbsVar});
        }
        ckf.g(bbsVar, "<this>");
        TMSMetaInfoWrapper U = bbsVar.U();
        if (U == null || (e = U.e()) == null || (jSONObject = e.getJSONObject("bizInfo")) == null) {
            return null;
        }
        return jSONObject.getString("searchGuideKeyword");
    }

    public static final String v(bbs bbsVar) {
        JSONObject e;
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d1099a8", new Object[]{bbsVar});
        }
        ckf.g(bbsVar, "<this>");
        TMSMetaInfoWrapper U = bbsVar.U();
        if (U == null || (e = U.e()) == null || (jSONObject = e.getJSONObject("sellerInfo")) == null) {
            return null;
        }
        return jSONObject.getString("sellerId");
    }

    public static final String w(bbs bbsVar) {
        TemplateConfigModel y;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ec886b92", new Object[]{bbsVar});
        }
        ckf.g(bbsVar, "<this>");
        TMSMetaInfoWrapper U = bbsVar.U();
        if (U == null || (y = U.y()) == null) {
            return null;
        }
        return y.getTemplateId();
    }

    public static final String x(bbs bbsVar) {
        TemplateConfigModel y;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f0765ee", new Object[]{bbsVar});
        }
        ckf.g(bbsVar, "<this>");
        TMSMetaInfoWrapper U = bbsVar.U();
        if (U == null || (y = U.y()) == null) {
            return null;
        }
        return y.getAppKey();
    }

    public static final String y(bbs bbsVar) {
        TemplateConfigModel y;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4c00bfd5", new Object[]{bbsVar});
        }
        ckf.g(bbsVar, "<this>");
        TMSMetaInfoWrapper U = bbsVar.U();
        if (U == null || (y = U.y()) == null) {
            return null;
        }
        return y.getTemplateVersion();
    }

    public static final JSONObject z(bbs bbsVar) {
        JSONObject e;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("92958c39", new Object[]{bbsVar});
        }
        ckf.g(bbsVar, "<this>");
        TMSMetaInfoWrapper U = bbsVar.U();
        if (U == null || (e = U.e()) == null) {
            return null;
        }
        return e.getJSONObject("widgetCacheInfo");
    }
}
