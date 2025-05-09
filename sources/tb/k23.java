package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.movehighlight.bussiness.detail.CancelQueryExplainRequest;
import com.taobao.taolive.sdk.goodlist.TemplateListResponse;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class k23 extends nt1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(779092582);
    }

    public k23(b0d b0dVar) {
        super(b0dVar);
    }

    public static /* synthetic */ Object ipc$super(k23 k23Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/movehighlight/bussiness/detail/CancelQueryExplainBusiness");
    }

    public void K(long j, long j2, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50e7d2e0", new Object[]{this, new Long(j), new Long(j2), str});
            return;
        }
        CancelQueryExplainRequest cancelQueryExplainRequest = new CancelQueryExplainRequest();
        cancelQueryExplainRequest.liveId = j;
        cancelQueryExplainRequest.itemId = j2;
        cancelQueryExplainRequest.source = str;
        C(1, cancelQueryExplainRequest, TemplateListResponse.class);
    }
}
