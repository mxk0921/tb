package tb;

import android.text.TextUtils;
import com.alibaba.ut.abtest.UTABTest;
import com.alibaba.ut.abtest.Variation;
import com.alibaba.ut.abtest.VariationSet;
import com.android.alibaba.ip.runtime.IpChange;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class hzu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f20993a;

    static {
        t2o.a(996147263);
        f20993a = false;
        try {
            f20993a = true;
        } catch (NoClassDefFoundError unused) {
        }
    }

    public static JSONObject a(String str) {
        VariationSet activate;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("ca053203", new Object[]{str});
        }
        if (TextUtils.isEmpty(str) || (activate = UTABTest.activate("AB_", str)) == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        for (Variation variation : activate) {
            try {
                String valueAsString = variation.getValueAsString("");
                if (!TextUtils.isEmpty(valueAsString)) {
                    jSONObject.put(variation.getName(), valueAsString);
                }
            } catch (JSONException unused) {
            }
        }
        return jSONObject;
    }
}
