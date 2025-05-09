package tb;

import android.text.TextUtils;
import com.alibaba.evo.EVO;
import com.alibaba.fastjson.JSON;
import com.alibaba.ut.abtest.Variation;
import com.alibaba.ut.abtest.VariationSet;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.chitu.TBSearchChiTuJSBridge;
import com.taobao.android.task.Coordinator;
import com.taobao.tao.Globals;
import java.util.ArrayList;
import java.util.HashMap;
import tb.qy8;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class m7p implements gdb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(729809858);
        t2o.a(729809756);
    }

    public static HashMap<String, String> c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("60883573", new Object[0]);
        }
        HashMap<String, String> hashMap = new HashMap<>();
        String e = qy8.b.e(exl.KEY, "Home_Page_ExperimentBucketId", "");
        if (!TextUtils.isEmpty(e)) {
            hashMap.put("bucketId", e);
            vxm.b.e().a("bucketId", e);
        }
        String e2 = qy8.b.e(exl.KEY, "Home_Page_ExperimentId", "");
        if (!TextUtils.isEmpty(e2)) {
            hashMap.put("testId", e2);
        }
        return hashMap;
    }

    @Override // tb.gdb
    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("17f746f7", new Object[]{this});
        }
        return "secondRefreshAbTestInfo";
    }

    @Override // tb.gdb
    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("88f820b4", new Object[]{this});
        }
        HashMap<String, String> c = c();
        if (c.isEmpty()) {
            return null;
        }
        return JSON.toJSONString(c);
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e66a61e", new Object[]{this});
        } else {
            Coordinator.execute(new a());
        }
    }

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
            VariationSet activateSync = EVO.activateSync(Globals.getApplication(), "Home_Page_ExperimentBucketId");
            String str = "";
            if (activateSync == null || activateSync.size() <= 0) {
                qy8.b.i(exl.KEY, "Home_Page_ExperimentBucketId", str);
                qy8.b.i(exl.KEY, "Home_Page_ExperimentId", str);
                return;
            }
            Variation variation = activateSync.getVariation("Home_Page_ExperimentBucketId");
            qy8.b.i(exl.KEY, "Home_Page_ExperimentBucketId", variation == null ? str : variation.getValueAsString(str));
            Variation variation2 = activateSync.getVariation("Home_Page_ExperimentId");
            if (variation2 != null) {
                str = variation2.getValueAsString(str);
            }
            qy8.b.i(exl.KEY, "Home_Page_ExperimentId", str);
            try {
                if (dvh.l()) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add("Home_Page_ExperimentBucketId");
                    arrayList.add("tb_start_bucket_id");
                    StringBuilder sb = new StringBuilder();
                    for (int i = 0; i < arrayList.size(); i++) {
                        VariationSet activateSync2 = EVO.activateSync(Globals.getApplication(), (String) arrayList.get(i));
                        if (activateSync2 != null && activateSync2.size() > 0) {
                            sb.append(activateSync2.getExperimentId());
                            sb.append("_");
                            sb.append(activateSync2.getExperimentBucketId());
                            if (i != arrayList.size() - 1) {
                                sb.append("#");
                            }
                        }
                    }
                    if (sb.length() > 0) {
                        dvh.n(TBSearchChiTuJSBridge.ABTEST, sb.toString());
                    }
                    dvh.n("home_bucket", tm2.a());
                }
            } catch (Throwable th) {
                bqa.b("secondRefreshAbTestInfo", "abtest set error", th);
            }
        }
    }
}
