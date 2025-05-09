package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.room.business.commission.request.OuterTraceRequest;
import com.taobao.taolive.room.business.commission.request.OuterTraceResponse;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class agl extends nt1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(779092793);
    }

    public agl(b0d b0dVar) {
        super(b0dVar);
    }

    public static /* synthetic */ Object ipc$super(agl aglVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/room/business/commission/request/OuterTraceBusiness");
    }

    public void K(String str, String str2, JSONObject jSONObject, String str3, String str4, String str5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c84befc", new Object[]{this, str, str2, jSONObject, str3, str4, str5});
            return;
        }
        OuterTraceRequest outerTraceRequest = new OuterTraceRequest();
        outerTraceRequest.fromType = str;
        outerTraceRequest.liveId = str2;
        outerTraceRequest.context = jSONObject;
        outerTraceRequest.entryLiveSource = str3;
        outerTraceRequest.actionSource = str4;
        outerTraceRequest.liveSource = str5;
        C(0, outerTraceRequest, OuterTraceResponse.class);
    }
}
