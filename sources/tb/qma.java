package tb;

import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.searchdoor.activate.guess.GuessDiscoveryVO;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class qma extends g5p<pma> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(815792978);
    }

    public static /* synthetic */ Object ipc$super(qma qmaVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/searchdoor/activate/guess/impl/GuessDiscoveryTppConverter");
    }

    /* renamed from: d */
    public pma b(JSONObject jSONObject, v5p v5pVar) {
        JSONObject optJSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (pma) ipChange.ipc$dispatch("e50ac139", new Object[]{this, jSONObject, v5pVar});
        }
        pma pmaVar = new pma();
        JSONObject optJSONObject2 = jSONObject.optJSONObject("result");
        pmaVar.e = optJSONObject2.optString(h1p.KEY_SUGGEST_RN);
        JSONObject optJSONObject3 = optJSONObject2.optJSONObject("hyh_result");
        if (optJSONObject3 != null) {
            JSONObject optJSONObject4 = optJSONObject3.optJSONObject("data");
            if (!(optJSONObject4 == null || (optJSONObject = optJSONObject4.optJSONObject("result")) == null)) {
                pmaVar.d = (GuessDiscoveryVO.a) JSON.parseObject(optJSONObject.toString(), GuessDiscoveryVO.a.class);
            }
            pmaVar.f = optJSONObject3.optString("traceBizType");
            pmaVar.g = optJSONObject3.optString("traceTmplType");
        }
        return pmaVar;
    }

    /* renamed from: e */
    public pma c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (pma) ipChange.ipc$dispatch("cd693b58", new Object[]{this});
        }
        return new pma();
    }
}
