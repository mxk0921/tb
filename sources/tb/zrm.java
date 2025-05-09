package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.room.player.preload.instance.PreloadParams;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class zrm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(779093091);
    }

    public static mcd a(PreloadParams preloadParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mcd) ipChange.ipc$dispatch("196e4989", new Object[]{preloadParams});
        }
        o3s.b("PreloadLiveInstanceFactory", "复用 播放器标准化流程");
        return new yrm(preloadParams);
    }
}
