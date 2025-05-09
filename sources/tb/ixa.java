package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.movehighlight.bussiness.highlight.newModel.HighlightRowRequest;
import com.taobao.taolive.movehighlight.bussiness.highlight.newModel.HighlightRowResponse;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class ixa extends nt1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final ux9 l;

    static {
        t2o.a(779092609);
    }

    public ixa(ux9 ux9Var, b0d b0dVar) {
        super(b0dVar);
        this.l = ux9Var;
    }

    public static /* synthetic */ Object ipc$super(ixa ixaVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/movehighlight/bussiness/highlight/newModel/HighlightRowBusiness");
    }

    public void K(String str, int i, int i2, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2863fefa", new Object[]{this, str, new Integer(i), new Integer(i2), str2, str3, str4});
        } else if (!TextUtils.isEmpty(str) && TextUtils.isDigitsOnly(str)) {
            HighlightRowRequest highlightRowRequest = new HighlightRowRequest();
            highlightRowRequest.setLiveId(zqq.h(str));
            if (!TextUtils.isEmpty(str2) && TextUtils.isDigitsOnly(str2)) {
                highlightRowRequest.setWswgItemId(zqq.h(str2));
            }
            highlightRowRequest.s = i;
            highlightRowRequest.n = i2;
            highlightRowRequest.transParams = str3;
            highlightRowRequest.entryLiveSource = up6.r(this.l);
            highlightRowRequest.liveSource = up6.L(this.l);
            ux9 ux9Var = this.l;
            if (ux9Var == null || !ux9Var.g) {
                highlightRowRequest.isTimeMovingV2 = false;
            } else {
                highlightRowRequest.isTimeMovingV2 = true;
                highlightRowRequest.n = 0;
            }
            if (uwa.k()) {
                highlightRowRequest.keyPointId = str4;
            }
            C(0, highlightRowRequest, HighlightRowResponse.class);
        }
    }
}
