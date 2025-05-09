package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.bottom.control.share.business.ShareReturnRequest;
import com.taobao.android.live.plugin.atype.flexalocal.bottom.control.share.business.ShareReturnResponse;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ekp extends nt1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(295698532);
    }

    public ekp(b0d b0dVar) {
        super(b0dVar);
    }

    public static /* synthetic */ Object ipc$super(ekp ekpVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/bottom/control/share/business/ShareReturnRequestBusiness");
    }

    public void K(ShareReturnRequest shareReturnRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a624a70", new Object[]{this, shareReturnRequest});
        } else {
            C(0, shareReturnRequest, ShareReturnResponse.class);
        }
    }
}
