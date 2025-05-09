package tb;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class gs2 {

    /* renamed from: a  reason: collision with root package name */
    public final it2 f20185a;

    public gs2(it2 it2Var) {
        this.f20185a = it2Var;
    }

    public String a() {
        it2 it2Var = this.f20185a;
        if (it2Var != null) {
            String c = it2Var.c();
            if (!TextUtils.isEmpty(c)) {
                try {
                    JSONObject jSONObject = new JSONObject(c);
                    if (it2Var.b().a() == jSONObject.optInt("version", -1)) {
                        return jSONObject.optString("content");
                    }
                    return null;
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }
        return null;
    }

    public boolean b(String str) {
        it2 it2Var = this.f20185a;
        if (it2Var != null) {
            if (!TextUtils.isEmpty(str)) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("content", str);
                    jSONObject.put("version", it2Var.b().a());
                    it2Var.d(jSONObject.toString());
                } catch (JSONException e) {
                    e.printStackTrace();
                    return false;
                }
            } else {
                it2Var.a();
                return true;
            }
        }
        return false;
    }
}
