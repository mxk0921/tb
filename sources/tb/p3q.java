package tb;

import android.content.Intent;
import android.text.TextUtils;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.sku.utils.SkuLogUtils;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class p3q implements lfb {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EVENT_TYPE = "sku_update_item";

    static {
        t2o.a(442499145);
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
            SkuLogUtils.x("SkuUpdateItemHandler.handleEvent");
        }
        ArrayList arrayList = new ArrayList();
        List d = v2qVar.d();
        if (d != null && d.size() > 0) {
            for (int i = 0; i < d.size(); i++) {
                Object obj = d.get(i);
                if (obj instanceof JSONObject) {
                    arrayList.add((JSONObject) obj);
                }
            }
        }
        JSONObject c = v2qVar.c();
        if (!(c == null || c.isEmpty() || (jSONObject = c.getJSONObject("fields")) == null || jSONObject.isEmpty())) {
            String e = pr0Var.e();
            jr8.a(new JSONObject(), arrayList, jSONObject);
            String string = jSONObject.getString("originalItemId");
            String string2 = jSONObject.getString("targetItemId");
            String string3 = jSONObject.getString(q2q.KEY_AREA_ID);
            String string4 = jSONObject.getString("addressId");
            Object obj2 = jSONObject.get("params");
            Object obj3 = jSONObject.get("relatedAuctionParams");
            if (!(TextUtils.isEmpty(string) || TextUtils.isEmpty(string2))) {
                pr0Var.i();
                Intent intent = new Intent();
                intent.setAction("com.taobao.sku.intent.action.updateData");
                intent.putExtra("skuToken", e);
                intent.putExtra("originalItemId", string);
                intent.putExtra("targetItemId", string2);
                intent.putExtra(q2q.KEY_AREA_ID, string3);
                intent.putExtra("addressId", string4);
                String str = "";
                intent.putExtra("params", obj2 != null ? obj2.toString() : str);
                if (obj3 != null) {
                    str = obj3.toString();
                }
                intent.putExtra("relatedAuctionParams", str);
                intent.addCategory("android.intent.category.DEFAULT");
                LocalBroadcastManager.getInstance(v2qVar.b()).sendBroadcast(intent);
            }
        }
    }
}
