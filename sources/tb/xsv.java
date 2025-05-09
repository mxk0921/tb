package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.usertask.business.MtopIliadUsertaskTasksEntryclickRequest;
import com.taobao.android.live.plugin.atype.flexalocal.usertask.business.MtopIliadUsertaskTasksEntryclickResponse;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class xsv extends nt1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(295700117);
    }

    public xsv(b0d b0dVar) {
        super(b0dVar);
    }

    public static /* synthetic */ Object ipc$super(xsv xsvVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/usertask/business/UserTaskClickBusiness");
    }

    public void K(long j, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78885e94", new Object[]{this, new Long(j), str, str2});
            return;
        }
        MtopIliadUsertaskTasksEntryclickRequest mtopIliadUsertaskTasksEntryclickRequest = new MtopIliadUsertaskTasksEntryclickRequest();
        mtopIliadUsertaskTasksEntryclickRequest.setDeliveryId(j);
        mtopIliadUsertaskTasksEntryclickRequest.setLiveSource(str);
        mtopIliadUsertaskTasksEntryclickRequest.setEntryLiveSource(str2);
        mtopIliadUsertaskTasksEntryclickRequest.setAppVersion("20240923");
        C(0, mtopIliadUsertaskTasksEntryclickRequest, MtopIliadUsertaskTasksEntryclickResponse.class);
    }
}
