package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.sku.utils.SkuLogUtils;
import com.taobao.android.tbsku.dialog.XSkuSingleScalePopWindow;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class o2m implements lfb {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EVENT_TYPE = "click_main_pic_event";

    static {
        t2o.a(785383474);
        t2o.a(442499194);
    }

    @Override // tb.lfb
    public void a(v2q v2qVar, pr0 pr0Var) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91e5704a", new Object[]{this, v2qVar, pr0Var});
            return;
        }
        if (cjz.a()) {
            SkuLogUtils.x("PicPreEventHandler.handleEvent");
        }
        JSONObject c = v2qVar.c();
        if (c != null && !c.isEmpty() && (jSONObject = c.getJSONObject("fields")) != null && !jSONObject.isEmpty()) {
            List d = v2qVar.d();
            if (d == null || d.size() <= 0 || !(d.get(0) instanceof JSONObject)) {
                String string = jSONObject.getString("mainPic");
                if (!TextUtils.isEmpty(string)) {
                    String string2 = jSONObject.getString("mainDesc");
                    String str = "";
                    if (TextUtils.isEmpty(string2)) {
                        string2 = str;
                    }
                    String string3 = jSONObject.getString("mainPVId");
                    if (!TextUtils.isEmpty(string3)) {
                        str = string3;
                    }
                    b3q b3qVar = new b3q();
                    b3qVar.f16160a = string;
                    b3qVar.b = string2;
                    b3qVar.c = str;
                    new XSkuSingleScalePopWindow(v2qVar.b(), b3qVar, jSONObject.getJSONArray("imageInfoList"), pr0Var).j();
                    return;
                }
                return;
            }
            new XSkuSingleScalePopWindow(v2qVar.b(), (JSONObject) d.get(0), jSONObject.getJSONArray("imageInfoList"), pr0Var).j();
        }
    }
}
