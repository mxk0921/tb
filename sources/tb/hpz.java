package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.topbar.subscribe.TBLiveAddCollectRequest;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class hpz extends nt1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(295700048);
    }

    public hpz(b0d b0dVar) {
        super(b0dVar);
    }

    public static /* synthetic */ Object ipc$super(hpz hpzVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/topbar/subscribe/TBLiveAddCollectBusiness");
    }

    public void b(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f324a755", new Object[]{this, new Long(j)});
            return;
        }
        TBLiveAddCollectRequest tBLiveAddCollectRequest = new TBLiveAddCollectRequest();
        tBLiveAddCollectRequest.targetId = j;
        tBLiveAddCollectRequest.targetType = 7;
        C(1, tBLiveAddCollectRequest, null);
    }
}
