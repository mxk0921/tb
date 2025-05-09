package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import com.taobao.taolive.sdk.mergeInfo.UnImportantLiveInfoResponse;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class dgv extends nt1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(806356134);
    }

    public dgv(b0d b0dVar) {
        super(b0dVar);
    }

    public static /* synthetic */ Object ipc$super(dgv dgvVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/sdk/mergeInfo/UnImportantLiveInfoBusiness");
    }

    public void K(INetDataObject iNetDataObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("136f9844", new Object[]{this, iNetDataObject});
        } else {
            C(0, iNetDataObject, UnImportantLiveInfoResponse.class);
        }
    }
}
