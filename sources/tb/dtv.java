package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.usertask.business.MtopIliadUsertaskTasksDotaskRequest;
import com.taobao.android.live.plugin.atype.flexalocal.usertask.business.MtopIliadUsertaskTasksDotaskResponse;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class dtv extends nt1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(295700118);
    }

    public dtv(b0d b0dVar) {
        super(b0dVar);
    }

    public static /* synthetic */ Object ipc$super(dtv dtvVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/usertask/business/UserTaskDoTaskBusiness");
    }

    public void K(long j, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7686068b", new Object[]{this, new Long(j), str, str2, str3});
            return;
        }
        MtopIliadUsertaskTasksDotaskRequest mtopIliadUsertaskTasksDotaskRequest = new MtopIliadUsertaskTasksDotaskRequest();
        mtopIliadUsertaskTasksDotaskRequest.deliveryId = j;
        mtopIliadUsertaskTasksDotaskRequest.liveSource = str;
        mtopIliadUsertaskTasksDotaskRequest.entryLiveSource = str2;
        mtopIliadUsertaskTasksDotaskRequest.userTaskParams = str3;
        mtopIliadUsertaskTasksDotaskRequest.appVersion = "20240923";
        if (L()) {
            String M = M();
            HashMap<String, String> hashMap = new HashMap<>();
            hashMap.put("asac", M);
            A(hashMap);
        }
        C(0, mtopIliadUsertaskTasksDotaskRequest, MtopIliadUsertaskTasksDotaskResponse.class);
    }

    public final String M() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("788952af", new Object[]{this});
        }
        return vvs.i("tblive", "userTaskDoTaskASAC", "2A24B2559GYFS2US3VF048");
    }

    public final boolean L() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d0706c82", new Object[]{this})).booleanValue();
        }
        return vvs.b("tblive", "enableUserTaskDoTaskASAC", false);
    }
}
