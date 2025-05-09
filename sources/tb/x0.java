package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.ut.abtest.UTABTest;
import com.alibaba.ut.abtest.Variation;
import com.alibaba.ut.abtest.VariationSet;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.festival.jsbridge.AliFestivalWVPlugin;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class x0 {
    public static final a Companion = new a(null);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(919601396);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public final Object a(String str, Object obj) {
            String str2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("84c9cac", new Object[]{this, str, obj});
            }
            ckf.g(str, "keyValue");
            ckf.g(obj, AliFestivalWVPlugin.PARAMS_DEFAULT_VALUE);
            List z0 = wsq.z0(str, new String[]{"."}, false, 0, 6, null);
            if (z0.size() == 1) {
                return Boolean.valueOf(t.a(spu.Companion.d(), (String) z0.get(0)));
            }
            if (!(z0.size() == 3 || z0.size() == 2)) {
                return obj;
            }
            String str3 = (String) z0.get(0);
            String str4 = (String) z0.get(1);
            if (z0.size() == 3) {
                str2 = (String) z0.get(2);
            } else {
                str2 = "";
            }
            VariationSet activate = UTABTest.activate(str3, str4, null, null);
            if (activate == null) {
                return obj;
            }
            long experimentId = activate.getExperimentId();
            long experimentReleaseId = activate.getExperimentReleaseId();
            long experimentBucketId = activate.getExperimentBucketId();
            JSONObject jSONObject = new JSONObject();
            Variation variation = activate.getVariation(str2);
            if (variation != null || activate.size() <= 0) {
                return (variation == null || TextUtils.isEmpty(variation.getValueAsString(""))) ? obj : variation.getValueAsString("");
            }
            for (Variation variation2 : activate) {
                if (variation2 != null) {
                    jSONObject.put((JSONObject) variation2.getName(), variation2.getValueAsString(""));
                }
            }
            jSONObject.put((JSONObject) "experimentId", (String) Long.valueOf(experimentId));
            jSONObject.put((JSONObject) "experimentReleaseId", (String) Long.valueOf(experimentReleaseId));
            jSONObject.put((JSONObject) "experimentBucketId", (String) Long.valueOf(experimentBucketId));
            return jSONObject;
        }
    }

    static {
        t2o.a(919601395);
    }
}
