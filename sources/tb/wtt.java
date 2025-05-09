package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.room.business.timemoveReplay.TimeMoveReplayRequest;
import com.taobao.taolive.room.business.timemoveReplay.TimeMoveReplayResponse;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class wtt extends nt1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(779092835);
    }

    public wtt(b0d b0dVar) {
        super(b0dVar);
    }

    public static /* synthetic */ Object ipc$super(wtt wttVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/room/business/timemoveReplay/TimeMoveReplayBusiness");
    }

    public void K(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d280d59", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str) && TextUtils.isDigitsOnly(str)) {
            TimeMoveReplayRequest timeMoveReplayRequest = new TimeMoveReplayRequest();
            timeMoveReplayRequest.liveId = str;
            C(0, timeMoveReplayRequest, TimeMoveReplayResponse.class);
        }
    }
}
