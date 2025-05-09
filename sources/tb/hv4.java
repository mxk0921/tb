package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class hv4 extends lmb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(479199438);
    }

    public static /* synthetic */ Object ipc$super(hv4 hv4Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/icart/core/event/CouponInitSubscriber");
    }

    @Override // tb.l12
    public void j(lcu lcuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fbad8af", new Object[]{this, lcuVar});
            return;
        }
        JSONObject jSONObject = this.e.getFields().getJSONObject("coupon");
        for (gsb gsbVar : (List) lcuVar.e("events")) {
            if (TextUtils.equals(gsbVar.getType(), "openPopupWindow")) {
                for (IDMComponent iDMComponent : cb4.B(this.k, gsbVar)) {
                    if (TextUtils.equals("cartShopCouponPopWindow", iDMComponent.getTag())) {
                        JSONObject fields = iDMComponent.getFields();
                        if (jSONObject != null) {
                            fields.putAll(jSONObject.getInnerMap());
                        }
                    }
                }
            }
        }
    }
}
