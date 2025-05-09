package tb;

import android.text.TextUtils;
import com.alibaba.ariver.app.api.ui.darkmode.ThemeUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class hrs {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f20846a;
    public String b;
    public String c;
    public String d;
    public String e;
    public int f;

    static {
        t2o.a(815793447);
    }

    public static hrs a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hrs) ipChange.ipc$dispatch("7ce4f616", new Object[]{jSONObject});
        }
        if (jSONObject == null || jSONObject.isEmpty()) {
            return null;
        }
        hrs hrsVar = new hrs();
        hrsVar.f20846a = jSONObject.getString("normalTextColor");
        hrsVar.b = jSONObject.getString("selectedTextColor");
        hrsVar.c = jSONObject.getString("backgroundImage");
        hrsVar.d = jSONObject.getString("backgroundColor");
        String string = jSONObject.getString("statusBarStyle");
        if (TextUtils.equals(string, "light")) {
            hrsVar.f = 10002;
        } else if (TextUtils.equals(string, ThemeUtils.COLOR_SCHEME_DARK)) {
            hrsVar.f = 10001;
        } else {
            hrsVar.f = 10000;
        }
        hrsVar.e = jSONObject.getString("atmosphereLogoImage");
        return hrsVar;
    }
}
