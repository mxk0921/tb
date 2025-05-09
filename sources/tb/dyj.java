package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel;
import com.taobao.tao.recommend4.recyclerview.RecommendViewPreloadListener;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class dyj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(491782430);
    }

    public final JSONObject a(IContainerDataModel<?> iContainerDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("a90302ae", new Object[]{this, iContainerDataModel});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(RecommendViewPreloadListener.KEY_ENABLE_PRE_LOAD_NEW_DETAIL, (Object) (gyj.a(iContainerDataModel) + ""));
        jSONObject.put("bucket", (Object) gyj.b(iContainerDataModel));
        return jSONObject;
    }

    public void b(IContainerDataModel<?> iContainerDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5bbf11ea", new Object[]{this, iContainerDataModel});
        } else {
            eyj.f(a(iContainerDataModel));
        }
    }
}
