package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.usertask.business.MtopIliadUsertaskTasksEntryRequest;
import com.taobao.android.live.plugin.atype.flexalocal.usertask.business.MtopIliadUsertaskTasksEntryResponse;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ftv extends nt1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(295700119);
    }

    public ftv(b0d b0dVar) {
        super(b0dVar);
    }

    public static /* synthetic */ Object ipc$super(ftv ftvVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/usertask/business/UserTaskEntryBusiness");
    }

    public void K(String str, String str2, String str3, String str4, String str5, String str6) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cfbe8ccd", new Object[]{this, str, str2, str3, str4, str5, str6});
            return;
        }
        MtopIliadUsertaskTasksEntryRequest mtopIliadUsertaskTasksEntryRequest = new MtopIliadUsertaskTasksEntryRequest();
        mtopIliadUsertaskTasksEntryRequest.API_NAME = "mtop.iliad.usertask.tasks.liveroom.entry";
        mtopIliadUsertaskTasksEntryRequest.liveSource = str;
        mtopIliadUsertaskTasksEntryRequest.entryLiveSource = str2;
        mtopIliadUsertaskTasksEntryRequest.userTaskParams = str3;
        mtopIliadUsertaskTasksEntryRequest.creatorId = str5;
        mtopIliadUsertaskTasksEntryRequest.liveId = str4;
        mtopIliadUsertaskTasksEntryRequest.appVersion = "20240923";
        if (!TextUtils.isEmpty(str6)) {
            mtopIliadUsertaskTasksEntryRequest.scene = str6;
        }
        C(0, mtopIliadUsertaskTasksEntryRequest, MtopIliadUsertaskTasksEntryResponse.class);
    }
}
