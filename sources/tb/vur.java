package tb;

import android.text.TextUtils;
import android.util.Log;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.detail.rate.model.RateInfoV2;
import com.taobao.detail.rate.preload.RateListPreRequestManager;
import com.taobao.detail.rate.vivid.utils.WeexUtils;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class vur {
    public static final String BIZ_TYPE_ASK_LIST = "askList";
    public static final String BIZ_TYPE_PROMOTION_LIST = "promotionList";
    public static final String BIZ_TYPE_RATE_LIST = "rateList";
    public static final a Companion = new a(null);
    public static final String TAG = "TBRatePreloader";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public final void a(String str, JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b20ae293", new Object[]{this, str, jSONObject});
                return;
            }
            ckf.g(str, "bizType");
            ckf.g(jSONObject, "params");
            odg.c(vur.TAG, "preRequest bizType:" + str + ", params:" + jSONObject);
            if (TextUtils.equals(str, "rateList")) {
                try {
                    RateInfoV2 rateInfoV2 = (RateInfoV2) JSON.toJavaObject(jSONObject, RateInfoV2.class);
                    if (WeexUtils.INSTANCE.e()) {
                        RateListPreRequestManager a2 = RateListPreRequestManager.Companion.a();
                        ckf.f(rateInfoV2, "rateInfoV2");
                        a2.j(jSONObject, rateInfoV2);
                    } else {
                        RateListPreRequestManager a3 = RateListPreRequestManager.Companion.a();
                        ckf.f(rateInfoV2, "rateInfoV2");
                        a3.h(rateInfoV2);
                    }
                    uhn.b("Page_DetailComments2", "Page_DetailComments2_Pre_Request_Call", RateListPreRequestManager.Companion.b());
                } catch (Throwable th) {
                    odg.c(vur.TAG, "preRequest. error=" + Log.getStackTraceString(th));
                }
            }
        }
    }
}
