package tb;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class gb3 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    public static String f19860a = m9v.d(c9x.CART_BIZ_NAME).l("firstScreenItemImageUrls");
    public static final int sDefaultMaxPreloadItemImageCount = 5;

    static {
        t2o.a(479199502);
    }

    public static String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e6ec44ea", new Object[0]);
        }
        String str = f19860a;
        if (str == null) {
            return "";
        }
        return str;
    }

    public static boolean a(StringBuilder sb, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9982eaf6", new Object[]{sb, jSONObject})).booleanValue();
        }
        String string = jSONObject.getString("pic");
        if (TextUtils.isEmpty(string)) {
            return false;
        }
        sb.append(string);
        sb.append(",");
        return true;
    }

    public static void b(kcu kcuVar, Context context) {
        List<IDMComponent> a2;
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0d68718", new Object[]{kcuVar, context});
        } else if (kcuVar != null && context != null && (a2 = kcuVar.a()) != null) {
            int e = vav.e(c9x.CART_BIZ_NAME, "maxPreloadItemImageCount", 5);
            StringBuilder sb = new StringBuilder();
            int i = 0;
            for (int i2 = 0; i2 < a2.size(); i2++) {
                IDMComponent iDMComponent = a2.get(i2);
                if (iDMComponent != null) {
                    JSONObject data = iDMComponent.getData();
                    if ("item".equalsIgnoreCase(data.getString("tag")) && (jSONObject = data.getJSONObject("fields")) != null) {
                        if (a(sb, jSONObject)) {
                            i++;
                        }
                        if (e <= i) {
                            break;
                        }
                    }
                }
            }
            f19860a = sb.toString();
            m9v.d(c9x.CART_BIZ_NAME).s("firstScreenItemImageUrls", f19860a);
        }
    }
}
