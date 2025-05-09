package tb;

import com.android.alibaba.ip.runtime.IpChange;
import mtopsdk.mtop.domain.MtopResponse;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class g8i {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(782237795);
    }

    public static void a(pjd pjdVar, MtopResponse mtopResponse, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0c8a4d4", new Object[]{pjdVar, mtopResponse, str});
        } else if (pjdVar != null) {
            if (mtopResponse == null) {
                pjdVar.onFail(str, "");
                return;
            }
            new StringBuilder(" handleError ").append(mtopResponse.toString());
            pjdVar.onFail(mtopResponse.getRetCode(), mtopResponse.getRetMsg());
        }
    }
}
