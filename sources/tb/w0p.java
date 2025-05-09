package tb;

import android.graphics.Color;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.festival.FestivalMgr;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class w0p {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(729810354);
    }

    public static kkc a(IContainerDataModel<?> iContainerDataModel, String str) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kkc) ipChange.ipc$dispatch("97b9d1ea", new Object[]{iContainerDataModel, str});
        }
        JSONObject l = vaj.l(iContainerDataModel);
        JSONObject jSONObject = null;
        if (l == null) {
            fve.e("SearchBgDataUtil", "assembleLinkedTabUiConfig tabSection == null");
            return null;
        }
        List<JSONObject> x = vaj.x(l);
        if (x == null) {
            fve.e("SearchBgDataUtil", "assembleLinkedTabUiConfig tabList == null");
            return null;
        }
        while (true) {
            if (i >= x.size()) {
                break;
            }
            JSONObject jSONObject2 = x.get(i);
            if (TextUtils.equals(vaj.w(jSONObject2), str)) {
                jSONObject = jSONObject2;
                break;
            }
            i++;
        }
        return vaj.F(jSONObject, l);
    }

    public static kkc b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kkc) ipChange.ipc$dispatch("e83f48fa", new Object[0]);
        }
        return a(yyj.e().c().u(z4a.NEW_FACE_PARENT.f32522a), "recommend_recommend");
    }

    public static int c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("79ce0bca", new Object[0])).intValue();
        }
        return f(FestivalMgr.i().l("global", FestivalMgr.KEY_GLOBAL_ACTIONBAR_BG), Color.parseColor("#FFFFFF"));
    }

    public static String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3952f7fa", new Object[0]);
        }
        return FestivalMgr.i().l("global", FestivalMgr.KEY_GLOBAL_ACTIONBAR_IMG);
    }

    public static boolean e(JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a0eddf4e", new Object[]{jSONObject})).booleanValue();
        }
        if (jSONObject == null || (jSONObject2 = jSONObject.getJSONObject("ext")) == null) {
            return false;
        }
        return jSONObject2.getBooleanValue("nativeBgEnable");
    }

    public static int f(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6695608", new Object[]{str, new Integer(i)})).intValue();
        }
        if (TextUtils.isEmpty(str)) {
            return i;
        }
        try {
            return Color.parseColor(str);
        } catch (Exception unused) {
            return i;
        }
    }
}
