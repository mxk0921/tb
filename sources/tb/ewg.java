package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.profile.LiveAvatarInfoCardRequest;
import com.taobao.android.live.plugin.atype.flexalocal.profile.LiveAvatarInfoCardResponse;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ewg extends nt1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(295699555);
    }

    public ewg(b0d b0dVar) {
        super(b0dVar);
    }

    public static /* synthetic */ Object ipc$super(ewg ewgVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/profile/LiveAvatarInfoCardBusiness");
    }

    public void K(long j, long j2, String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b927db5", new Object[]{this, new Long(j), new Long(j2), str, str2, new Boolean(z)});
            return;
        }
        LiveAvatarInfoCardRequest liveAvatarInfoCardRequest = new LiveAvatarInfoCardRequest();
        liveAvatarInfoCardRequest.liveId = j;
        liveAvatarInfoCardRequest.anchorId = j2;
        liveAvatarInfoCardRequest.encodeAccountId = str;
        liveAvatarInfoCardRequest.sourceType = str2;
        liveAvatarInfoCardRequest.isPublic = z;
        C(0, liveAvatarInfoCardRequest, LiveAvatarInfoCardResponse.class);
    }
}
