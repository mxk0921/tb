package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.room.business.mess.LiveDetailMessinfoRequest;
import com.taobao.taolive.room.business.mess.LiveDetailMessinfoResponse;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class dyg extends nt1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(779092820);
    }

    public dyg(b0d b0dVar) {
        super(b0dVar);
    }

    public static /* synthetic */ Object ipc$super(dyg dygVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/room/business/mess/LiveDetailMessInfoBusiness");
    }

    public void K(String str, String str2, ux9 ux9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6f2207f", new Object[]{this, str, str2, ux9Var});
            return;
        }
        LiveDetailMessinfoRequest liveDetailMessinfoRequest = new LiveDetailMessinfoRequest();
        liveDetailMessinfoRequest.creatorId = str;
        liveDetailMessinfoRequest.liveId = str2;
        liveDetailMessinfoRequest.type = "sponsor,timerInteractive4NeoProtocol,broadcasterScore,activity,liveHeadBanner,visitorIdentity,hasLive";
        if (up6.c0(ux9Var) != null && up6.c0(ux9Var).extraBizType == 1) {
            liveDetailMessinfoRequest.type += ",auction";
        }
        C(0, liveDetailMessinfoRequest, LiveDetailMessinfoResponse.class);
    }
}
