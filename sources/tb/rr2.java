package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.data.meta.DetailClientData;
import com.taobao.android.detail.ttdetail.data.meta.Merged;
import kotlin.jvm.JvmStatic;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class rr2 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final rr2 INSTANCE = new rr2();
    public static final String TAG = "CacheAsyncRequestUtils";

    static {
        t2o.a(912261275);
    }

    @JvmStatic
    public static final boolean a(ze7 ze7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3ac0b298", new Object[]{ze7Var})).booleanValue();
        }
        ckf.h(ze7Var, "detailContext");
        try {
            if (!vbl.h0()) {
                return false;
            }
            bq6 e = ze7Var.e();
            ckf.c(e, "detailContext.dataEngine");
            if (e.o()) {
                return false;
            }
            Merged f = ze7Var.e().f(DetailClientData.class);
            ckf.c(f, "detailContext.dataEngine…ss.java\n                )");
            JSONObject jSONObject = ((DetailClientData) f).optimizeMap;
            if (jSONObject == null) {
                return false;
            }
            if (!jSONObject.isEmpty()) {
                return true;
            }
            return false;
        } catch (Exception e2) {
            tgh.c(TAG, "isUseCacheRequestWrapper error", e2);
            return false;
        }
    }
}
