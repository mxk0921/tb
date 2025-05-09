package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.android.live.plugin.atype.flexalocal.fullscreen.schedule.ScheduleFullScreenLiveFrame;
import com.taobao.taobao.R;
import com.taobao.taolive.sdk.configurable.ComponentGroupConfig;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class qeo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(295698821);
    }

    public void a(ScheduleFullScreenLiveFrame scheduleFullScreenLiveFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2f435b8", new Object[]{this, scheduleFullScreenLiveFrame});
        } else if (scheduleFullScreenLiveFrame != null && !scheduleFullScreenLiveFrame.isEntranceHidden(ComponentGroupConfig.GROUP_RIGHT_BOTTOM, ComponentGroupConfig.RIGHT_BOTTOM_RIGHT_GOODS_CARD)) {
            BaseFrame a2 = scheduleFullScreenLiveFrame.mFrameContext.i().d().a("tl-showcase-common");
            scheduleFullScreenLiveFrame.addFrameInstallTask(ComponentGroupConfig.GROUP_RIGHT_BOTTOM, a2, "tl-showcase-common", scheduleFullScreenLiveFrame.mFrontView.findViewById(R.id.taolive_good_showcase_common_stub));
            scheduleFullScreenLiveFrame.addFrameUnInstallTask(ComponentGroupConfig.GROUP_RIGHT_BOTTOM, a2, "tl-showcase-common");
        }
    }
}
