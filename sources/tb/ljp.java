package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.share.taopassword.constants.TPTargetType;
import com.taobao.tao.util.AnalyticsUtil;
import com.ut.share.business.ShareTargetType;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class ljp extends yhp {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(666894480);
    }

    public ljp(whp whpVar) {
        super(whpVar);
    }

    public static /* synthetic */ Object ipc$super(ljp ljpVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/handler/worker/ShareImageWorker");
    }

    public void d(String str) {
        TPTargetType tPTargetType;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb7424d", new Object[]{this, str});
            return;
        }
        ma4 ma4Var = this.f32102a.b.h;
        if (ma4Var != null) {
            boolean equals = TextUtils.equals(ShareTargetType.Share2QQ.getValue(), ma4Var.b());
            if (TextUtils.equals(ShareTargetType.Share2Weixin.getValue(), ma4Var.b()) || equals) {
                if (equals) {
                    tPTargetType = TPTargetType.QQFRIEND;
                } else {
                    tPTargetType = TPTargetType.WEIXIN;
                }
                String c = kwr.c(tPTargetType);
                if (!TextUtils.isEmpty(c)) {
                    kwr.e(this.f32102a.b.c.getContext(), c);
                }
                AnalyticsUtil.wxAndQQOnClick(ma4Var);
                return;
            }
            bwr.h().e().imgPath = str;
            kjp.c(ma4Var.b(), null);
            AnalyticsUtil.traceViewClickOthers(ma4Var, bwr.h().e().url);
        }
    }
}
