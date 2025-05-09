package tb;

import com.alipay.mobile.verifyidentity.ui.fb.plugin.BaseFBPlugin;
import com.unionpay.UPPayWapActivity;
import com.unionpay.utils.a;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class xay implements xux {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ UPPayWapActivity f31260a;

    public xay(UPPayWapActivity uPPayWapActivity) {
        this.f31260a = uPPayWapActivity;
    }

    @Override // tb.xux
    public final void a(String str, zux zuxVar) {
        String i;
        String i2;
        String str2;
        String j;
        try {
            JSONArray jSONArray = new JSONArray(str);
            if (jSONArray.length() > 0) {
                JSONObject jSONObject = new JSONObject();
                int i3 = 0;
                while (true) {
                    str2 = "0";
                    if (i3 >= jSONArray.length()) {
                        break;
                    }
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i3);
                    String string = jSONObject2.getString("packageName");
                    if (a.i(this.f31260a, string, jSONObject2.getString("packageSign"), jSONObject2.getString(BaseFBPlugin.ACT_CONF.supportVersion))) {
                        str2 = "1";
                    }
                    jSONObject.put(string, str2);
                    i3++;
                }
                if (zuxVar != null) {
                    j = UPPayWapActivity.j(str2, "success", jSONObject);
                    zuxVar.a(j);
                }
            } else if (zuxVar != null) {
                i2 = UPPayWapActivity.i("1", "Parameter error", null);
                zuxVar.a(i2);
            }
        } catch (Exception e) {
            if (zuxVar != null) {
                i = UPPayWapActivity.i("1", e.getMessage(), null);
                zuxVar.a(i);
            }
        }
    }
}
