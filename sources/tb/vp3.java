package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.model.common.VideoInfo;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class vp3 implements inb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(779093324);
        t2o.a(806355667);
    }

    @Override // tb.inb
    public void a(VideoInfo videoInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("298ba194", new Object[]{this, videoInfo});
        } else if (videoInfo != null) {
            cxa.c(videoInfo.liveId, null, null, dbu.SOURCE_SWITCH_REPLAY);
        }
    }
}
