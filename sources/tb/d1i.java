package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class d1i extends rql {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_HEADER_PIC = "headerPic";
    public static final String KEY_LAYOUT_INFO = "layoutInfo";
    public static final String KEY_MODEL = "model";
    public static final String MAIN_SCREEN_TYPE = "mainScreen";
    public yns k;
    public final Map<String, nb4> l = new HashMap(0);

    static {
        t2o.a(912261540);
    }

    public d1i(JSONObject jSONObject) {
        super(jSONObject);
        u(jSONObject, null);
    }

    public static /* synthetic */ Object ipc$super(d1i d1iVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/data/MainScreenComponentData");
    }

    public static /* synthetic */ Map s(d1i d1iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("c215cd0f", new Object[]{d1iVar});
        }
        return d1iVar.l;
    }

    public yns t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (yns) ipChange.ipc$dispatch("af753839", new Object[]{this});
        }
        return this.k;
    }

    public final void u(JSONObject jSONObject, qdb qdbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7a3dead", new Object[]{this, jSONObject, qdbVar});
            return;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("model");
        if (jSONObject2 != null) {
            for (String str : jSONObject2.keySet()) {
                JSONObject jSONObject3 = jSONObject2.getJSONObject(str);
                if (jSONObject3 != null) {
                    if (TextUtils.equals("headerPic", str)) {
                        ((HashMap) this.l).put(str, new wua(jSONObject3, qdbVar));
                    } else {
                        ((HashMap) this.l).put(str, new nb4(jSONObject3, qdbVar));
                    }
                }
            }
        }
        JSONObject jSONObject4 = jSONObject.getJSONObject(KEY_LAYOUT_INFO);
        if (jSONObject4 != null) {
            this.k = new yns(jSONObject4, new c1i(this));
        }
    }

    public d1i(JSONObject jSONObject, qdb qdbVar) {
        super(jSONObject, qdbVar);
        u(jSONObject, qdbVar);
    }
}
