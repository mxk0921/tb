package tb;

import android.text.TextUtils;
import com.alibaba.evo.EVO;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.ut.abtest.Variation;
import com.alibaba.ut.abtest.VariationSet;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.task.Coordinator;
import com.taobao.tao.Globals;
import tb.qy8;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class exl implements gdb {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY = "performanceAbTestInfo";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            VariationSet activateSync = EVO.activateSync(Globals.getApplication(), "tb_start_bucket_id");
            String str = "";
            if (activateSync == null || activateSync.size() <= 0) {
                qy8.b.i(exl.KEY, "tb_start_bucket_id", str);
                qy8.b.i(exl.KEY, "tb_bucket_type", str);
                qy8.b.i(exl.KEY, "tb_start_test_id", str);
                return;
            }
            Variation variation = activateSync.getVariation("tb_start_bucket_id");
            qy8.b.i(exl.KEY, "tb_start_bucket_id", variation == null ? str : variation.getValueAsString(str));
            Variation variation2 = activateSync.getVariation("tb_bucket_type");
            qy8.b.i(exl.KEY, "tb_bucket_type", variation2 == null ? str : variation2.getValueAsString(str));
            Variation variation3 = activateSync.getVariation("tb_start_test_id");
            if (variation3 != null) {
                str = variation3.getValueAsString(str);
            }
            qy8.b.i(exl.KEY, "tb_start_test_id", str);
        }
    }

    static {
        t2o.a(729809856);
        t2o.a(729809756);
    }

    @Override // tb.gdb
    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("17f746f7", new Object[]{this});
        }
        return KEY;
    }

    @Override // tb.gdb
    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("88f820b4", new Object[]{this});
        }
        return c();
    }

    public final String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("83a4b290", new Object[]{this});
        }
        JSONObject jSONObject = new JSONObject();
        String e = qy8.b.e(KEY, "tb_start_bucket_id", "");
        if (!TextUtils.isEmpty(e)) {
            jSONObject.put("bucketId", (Object) e);
        }
        String e2 = qy8.b.e(KEY, "tb_bucket_type", "");
        if (!TextUtils.isEmpty(e2)) {
            jSONObject.put("bucketType", (Object) e2);
        }
        String e3 = qy8.b.e(KEY, "tb_start_test_id", "");
        if (!TextUtils.isEmpty(e3)) {
            jSONObject.put("testId", (Object) e3);
        }
        if (jSONObject.isEmpty()) {
            return null;
        }
        return jSONObject.toJSONString();
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e66a61e", new Object[]{this});
        } else {
            Coordinator.execute(new a());
        }
    }
}
