package tb;

import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class wrm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public JSONObject f30875a;
    public String b;
    public String c;
    public String d;
    public boolean e;
    public String f;

    static {
        t2o.a(912262202);
    }

    public static String a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c5f7cffb", new Object[]{jSONObject});
        }
        if (jSONObject == null) {
            return "";
        }
        String string = jSONObject.getString("id");
        if (TextUtils.isEmpty(string)) {
            return jSONObject.getString("itemId");
        }
        return string;
    }

    public static wrm b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (wrm) ipChange.ipc$dispatch("2937b029", new Object[]{jSONObject});
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("queryParams");
        if (jSONObject2 == null) {
            jSONObject2 = new JSONObject();
            String string = jSONObject.getString("url");
            if (string != null && string.startsWith(itw.URL_SEPARATOR)) {
                string = uyv.HTTPS_SCHEMA.concat(string);
            }
            if (!TextUtils.isEmpty(string)) {
                jSONObject2.putAll(jov.g(Uri.parse(string)));
            }
        }
        wrm wrmVar = new wrm();
        wrmVar.f30875a = jSONObject2;
        wrmVar.b = a(jSONObject2);
        return wrmVar;
    }
}
