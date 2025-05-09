package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class r44 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(491782498);
    }

    public void a(BaseSectionModel<?> baseSectionModel, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9de02fc0", new Object[]{this, baseSectionModel, jSONObject});
        } else if (baseSectionModel != null && jSONObject != null && jSONObject.getJSONObject("clickParam") != null) {
            vve.k(baseSectionModel, jSONObject, null);
        }
    }

    public void b(BaseSectionModel<?> baseSectionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b2e6ab3", new Object[]{this, baseSectionModel});
        } else if (baseSectionModel != null && baseSectionModel.getJSONObject(i2b.TRACK_EXPOSURE_PARAM) != null) {
            vve.p(baseSectionModel, null);
        }
    }
}
