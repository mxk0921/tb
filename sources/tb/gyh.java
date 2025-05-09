package tb;

import android.os.Bundle;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.sku.utils.SkuLogUtils;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class gyh implements lfb {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EVENT_TYPE = "openMAC";

    static {
        t2o.a(785383473);
        t2o.a(442499194);
    }

    @Override // tb.lfb
    public void a(v2q v2qVar, pr0 pr0Var) {
        JSONObject c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91e5704a", new Object[]{this, v2qVar, pr0Var});
            return;
        }
        if (cjz.a()) {
            SkuLogUtils.x("MacOpenHandler.handleEvent");
        }
        if (v2qVar != null && (c = v2qVar.c()) != null) {
            JSONObject jSONObject = c.getJSONObject("fields");
            Bundle bundle = new Bundle();
            bundle.putSerializable("fields", jSONObject);
            try {
                xq0.c().a(v2qVar.b()).d(bundle).c("https://maccolor.taobao.com/home.htm");
            } catch (Exception unused) {
            }
        }
    }
}
