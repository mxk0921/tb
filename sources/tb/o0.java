package tb;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.ut.abtest.UTABTest;
import com.alibaba.ut.abtest.Variation;
import com.alibaba.ut.abtest.VariationSet;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import java.util.Iterator;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class o0 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final o0 INSTANCE = new o0();

    static {
        t2o.a(1031798818);
    }

    public final JSONObject a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("eb73572b", new Object[]{this, str, str2});
        }
        ckf.g(str, "component");
        ckf.g(str2, "module");
        VariationSet activate = UTABTest.activate(str, str2);
        if (activate.size() == 0) {
            TLog.loge("TBHDABTestUtils", "未命中实验: " + str + ' ' + str2);
            return new JSONObject();
        }
        TLog.loge("TBHDABTestUtils", "命中实验: " + str + ' ' + str2 + ", 命中分组ID=" + activate.getExperimentBucketId());
        JSONObject jSONObject = new JSONObject();
        Iterator<Variation> it = activate.iterator();
        ckf.f(it, "variationSet.iterator()");
        while (it.hasNext()) {
            Variation next = it.next();
            TLog.loge("TBHDABTestUtils", "分组参数=" + ((Object) next.getName()) + ", 参数内容=" + next);
            jSONObject.put((JSONObject) next.getName(), (String) JSON.parseObject(next.getValueAsString("{}")));
        }
        return jSONObject;
    }
}
