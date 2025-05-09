package tb;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.framework.adapter.IMTopAdapter;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopResponse;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public abstract class jrf<T extends BaseOutDo> implements IMTopAdapter.b<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(468713832);
        t2o.a(468713813);
    }

    @Override // com.taobao.android.fluid.framework.adapter.IMTopAdapter.b
    public final void a(MtopResponse mtopResponse, T t) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ed028ea", new Object[]{this, mtopResponse, t});
        } else if (mtopResponse == null || mtopResponse.getBytedata() == null) {
            onError(mtopResponse);
        } else {
            try {
                jSONObject = JSON.parseObject(new String(mtopResponse.getBytedata()));
            } catch (Exception unused) {
                jSONObject = null;
            }
            if (jSONObject == null) {
                onError(mtopResponse);
            } else {
                b(mtopResponse, jSONObject, t);
            }
        }
    }

    public abstract void b(MtopResponse mtopResponse, JSONObject jSONObject, T t);
}
