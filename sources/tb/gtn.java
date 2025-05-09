package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.miniLive.services.mtop.RedPacketRainCheckRequest;
import com.taobao.android.miniLive.services.mtop.RedPacketRainCheckResponse;
import com.taobao.android.miniLive.services.mtop.RedPacketRainRequest;
import com.taobao.android.miniLive.services.mtop.RedPacketRainResponse;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class gtn extends nt1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(779092050);
    }

    public gtn(b0d b0dVar) {
        super(b0dVar);
    }

    public static /* synthetic */ Object ipc$super(gtn gtnVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/miniLive/services/mtop/RedPacketRainBusiness");
    }

    public void K(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5115ed13", new Object[]{this, str, str2});
            return;
        }
        RedPacketRainRequest redPacketRainRequest = new RedPacketRainRequest();
        redPacketRainRequest.anchorId = str;
        redPacketRainRequest.liveId = str2;
        C(0, redPacketRainRequest, RedPacketRainResponse.class);
    }

    public void L(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2dec0fe2", new Object[]{this, str, str2, str3});
            return;
        }
        RedPacketRainCheckRequest redPacketRainCheckRequest = new RedPacketRainCheckRequest();
        redPacketRainCheckRequest.anchorId = str;
        redPacketRainCheckRequest.liveId = str2;
        redPacketRainCheckRequest.benefitEname = str3;
        C(0, redPacketRainCheckRequest, RedPacketRainCheckResponse.class);
    }
}
