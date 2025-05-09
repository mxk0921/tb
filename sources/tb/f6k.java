package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.android.live.plugin.atype.flexalocal.fullscreen.schedule.ScheduleFullScreenLiveFrame;
import com.taobao.android.live.plugin.atype.flexalocal.interactcenter.InteractBizCenterFrame;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class f6k {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(295698820);
    }

    public void a(ScheduleFullScreenLiveFrame scheduleFullScreenLiveFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16047a43", new Object[]{this, scheduleFullScreenLiveFrame});
            return;
        }
        InteractBizCenterFrame interactBizCenterFrame = new InteractBizCenterFrame(scheduleFullScreenLiveFrame.mContext, scheduleFullScreenLiveFrame.mFrameContext);
        scheduleFullScreenLiveFrame.addFrameInstallTask(interactBizCenterFrame, interactBizCenterFrame.getComponentName(), null);
    }

    public void b(ScheduleFullScreenLiveFrame scheduleFullScreenLiveFrame) {
        BaseFrame createMediaPlatformFrame2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2688575c", new Object[]{this, scheduleFullScreenLiveFrame});
        } else if (rgd.b().a() != null && (createMediaPlatformFrame2 = rgd.b().a().createMediaPlatformFrame2(scheduleFullScreenLiveFrame.mContext, scheduleFullScreenLiveFrame.mLandscape, scheduleFullScreenLiveFrame.mLiveDataModel, scheduleFullScreenLiveFrame.mFrameContext)) != null) {
            scheduleFullScreenLiveFrame.addFrameInstallTask(createMediaPlatformFrame2, createMediaPlatformFrame2.getComponentName(), null);
        }
    }
}
