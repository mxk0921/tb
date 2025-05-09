package tb;

import android.graphics.Color;
import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.model.UltronTradeHybridInstanceRenderMode;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.topmultitab.service.pulldown.request.SecondFloorConfigResult;
import com.taobao.weex.utils.TBWXConfigManger;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class i7p {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final int f21145a = Color.parseColor("#31284D");
    public static final int b = Color.parseColor("#2A1B44");
    public static final int c = Color.parseColor("#501337");

    static {
        t2o.a(729810314);
    }

    public static h7p a(SecondFloorConfigResult secondFloorConfigResult) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h7p) ipChange.ipc$dispatch("122db7f0", new Object[]{secondFloorConfigResult});
        }
        if (secondFloorConfigResult == null || (jSONObject = secondFloorConfigResult.ext) == null) {
            return null;
        }
        return new h7p(jSONObject.getString("defaultBgImgUrl"), g(jSONObject.getString("backgroundColor"), f21145a), jSONObject.getString("straightPullImgUrl"), jSONObject.getString("shadeBgImgUrl"), jSONObject.getString("targetUrl"), g(jSONObject.getString("shadeGradientStartBgColor"), b), g(jSONObject.getString("shadeGradientEndBgColor"), c));
    }

    public static String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3e06150", new Object[0]);
        }
        JSONObject e = e();
        if (e == null) {
            return null;
        }
        return e.getString("straightHomePullImgUrl");
    }

    public static String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e0fb87fe", new Object[0]);
        }
        JSONObject e = e();
        if (e == null) {
            return null;
        }
        return e.getString("straightHomeShadeBgUrl");
    }

    public static JSONObject d(SecondFloorConfigResult secondFloorConfigResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("2713a768", new Object[]{secondFloorConfigResult});
        }
        JSONObject jSONObject = new JSONObject();
        if (secondFloorConfigResult.getSections() == null) {
            return jSONObject;
        }
        for (JSONObject jSONObject2 : secondFloorConfigResult.getSections()) {
            if (TextUtils.equals("Page_SecondFloor", jSONObject2.getString("sectionBizCode"))) {
                return jSONObject2;
            }
        }
        return jSONObject;
    }

    public static JSONObject e() {
        JSONObject ext;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("3afa70a6", new Object[0]);
        }
        String f = yyj.e().f();
        imn d = zza.d(f);
        if (d == null || (ext = d.u(f).getExt()) == null) {
            return null;
        }
        return ext.getJSONObject("secondTheme");
    }

    public static double f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("646364ef", new Object[]{str})).doubleValue();
        }
        JSONObject e = e();
        if (e == null) {
            return vu3.b.GEO_NOT_SUPPORT;
        }
        String string = e.getString(str);
        if (TextUtils.isEmpty(string)) {
            return vu3.b.GEO_NOT_SUPPORT;
        }
        try {
            return Double.parseDouble(string);
        } catch (Exception e2) {
            bqa.d("SecondFloorConfigParseUtil", "getValueFromSecondTheme except: " + e2);
            return vu3.b.GEO_NOT_SUPPORT;
        }
    }

    public static int g(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c923b015", new Object[]{str, new Integer(i)})).intValue();
        }
        if (TextUtils.isEmpty(str)) {
            return i;
        }
        try {
            return Color.parseColor(str);
        } catch (Exception e) {
            bqa.c("SecondFloorConfigParseUtil", e, "backgroundColor parse error");
            return i;
        }
    }

    public static int h(JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3276b5a2", new Object[]{jSONObject})).intValue();
        }
        if (jSONObject == null || (jSONObject2 = jSONObject.getJSONObject("ext")) == null) {
            return Integer.MAX_VALUE;
        }
        try {
            return jSONObject2.getIntValue("height");
        } catch (Exception e) {
            bqa.d("SecondFloorConfigParseUtil", "parseEnterSecondFloorHeight except: " + e);
            return Integer.MAX_VALUE;
        }
    }

    public static String i(String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8bf280f7", new Object[]{str});
        }
        Uri parse = Uri.parse(str);
        if (parse.isHierarchical()) {
            str2 = parse.getQueryParameter("_mus_tpl");
        } else {
            str2 = "";
        }
        if (TextUtils.isEmpty(str2)) {
            return str;
        }
        return str2;
    }

    public static double j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("faba6ef7", new Object[0])).doubleValue();
        }
        return f("shadeBgEndAlpha");
    }

    public static double k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4fd01c2a", new Object[0])).doubleValue();
        }
        return f("shadeBgMidAlpha");
    }

    public static double l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("189a8790", new Object[0])).doubleValue();
        }
        return f("shadeBgStartAlpha");
    }

    public static String m(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7bcd2a54", new Object[]{str});
        }
        bqa.d("SecondFloorConfigParseUtil", "parseWeexUrl targetUrl: " + str);
        String configUrl = TBWXConfigManger.getInstance().getConfigUrl(str);
        if (TextUtils.isEmpty(configUrl) && h8x.d(str)) {
            configUrl = str;
        }
        if (!TextUtils.isEmpty(configUrl)) {
            return Uri.parse(configUrl).buildUpon().appendQueryParameter("renderMode", UltronTradeHybridInstanceRenderMode.TEXTURE).appendQueryParameter("isOpenDirectly", "true").toString();
        }
        AppMonitor.Alarm.commitFail("Page_Home", u3b.MONITOR_POINT, null, "parseWeexUrlEmpty", "targetUrl: " + str);
        return str;
    }
}
