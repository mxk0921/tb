package tb;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavir.solution.a;
import com.taobao.android.testutils.log.LogUtils;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public abstract class lm1 extends a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String NAME = "rerank";

    static {
        t2o.a(404750393);
    }

    public static /* synthetic */ Object ipc$super(lm1 lm1Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/behavir/solution/BHRReRankSolution");
    }

    public abstract void w(em1 em1Var, List<JSONObject> list);

    @Override // com.taobao.android.behavir.solution.a
    public final void v(em1 em1Var, Map<String, Object> map) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("862a2b71", new Object[]{this, em1Var, map});
            return;
        }
        try {
            jSONObject = JSON.parseObject((String) map.get("result"));
        } catch (Exception unused) {
            jSONObject = new JSONObject();
        }
        if (jSONObject == null) {
            LogUtils.f("", "BHRReRankSolution", "resultJSON null");
            return;
        }
        boolean booleanValue = jSONObject.getBooleanValue("shouldReRank");
        if (booleanValue) {
            w(em1Var, JSON.parseArray((String) jSONObject.get(bia.UNDER_TAKE_GOODS_LIST), JSONObject.class));
            return;
        }
        String str = "model shouldReRank is " + booleanValue;
        oh8 oh8Var = new oh8();
        oh8Var.c(str);
        oh8Var.a(str);
        oh8Var.b(jSONObject);
        s(em1Var, oh8Var);
    }
}
