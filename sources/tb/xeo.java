package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.android.live.plugin.atype.flexalocal.fullscreen.schedule.ScheduleFullScreenLiveFrame;
import com.taobao.taobao.R;
import com.taobao.taolive.sdk.configurable.ComponentGroupConfig;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import com.taobao.taolive.sdk.morelive.TaoliveRoomRightGuideFrame;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class xeo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(295698822);
    }

    public void a(ScheduleFullScreenLiveFrame scheduleFullScreenLiveFrame, boolean z) {
        chd f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1cb107e8", new Object[]{this, scheduleFullScreenLiveFrame, new Boolean(z)});
        } else if (qvs.I() && !z && !scheduleFullScreenLiveFrame.getFrameContext().c() && (f = tbt.c().f()) != null && !scheduleFullScreenLiveFrame.isEntranceHidden(ComponentGroupConfig.GROUP_RIGHT_SIDE, ComponentGroupConfig.RIGHT_SIDE_LIVE_MORE_ENTRANCE)) {
            TaoliveRoomRightGuideFrame b = f.b(scheduleFullScreenLiveFrame.mContext, false, scheduleFullScreenLiveFrame.mLiveDataModel, scheduleFullScreenLiveFrame.getFrameContext());
            scheduleFullScreenLiveFrame.mMoreLiveRightGuideFrame = b;
            scheduleFullScreenLiveFrame.addFrameInstallTask(ComponentGroupConfig.GROUP_RIGHT_SIDE, b, p00.MoreLiveGuideFrame, scheduleFullScreenLiveFrame.mFrontView.findViewById(R.id.taolive_more_live_guide_stub));
        }
    }

    public void b(ScheduleFullScreenLiveFrame scheduleFullScreenLiveFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d3d3810", new Object[]{this, scheduleFullScreenLiveFrame});
        } else if (scheduleFullScreenLiveFrame != null && !scheduleFullScreenLiveFrame.isEntranceHidden(ComponentGroupConfig.GROUP_RIGHT_SIDE, ComponentGroupConfig.RIGHT_SIDE_INTERACTION_ENTRANCE) && rgd.b().a() != null && rgd.b().a().liveInteractiveManagerNotNull(scheduleFullScreenLiveFrame.mLiveDataModel)) {
            BaseFrame a2 = scheduleFullScreenLiveFrame.getFrameContext().i().h().a("tl-interactive-entrance");
            scheduleFullScreenLiveFrame.addFrameInstallTask(ComponentGroupConfig.GROUP_RIGHT_SIDE, a2, "tl-interactive-entrance", scheduleFullScreenLiveFrame.mFrontView.findViewById(R.id.taolive_interactive_right_frame));
            scheduleFullScreenLiveFrame.addFrameUnInstallTask(ComponentGroupConfig.GROUP_RIGHT_SIDE, a2, "tl-interactive-entrance");
        }
    }

    public void c(ScheduleFullScreenLiveFrame scheduleFullScreenLiveFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e3d16bd", new Object[]{this, scheduleFullScreenLiveFrame});
        } else if (scheduleFullScreenLiveFrame == null || scheduleFullScreenLiveFrame.isEntranceHidden(ComponentGroupConfig.GROUP_TOP, ComponentGroupConfig.TOP_INTIMACY_ENTRANCE)) {
        } else {
            if ((vc.i(scheduleFullScreenLiveFrame.mContext) || vc.d(scheduleFullScreenLiveFrame.mContext) || !scheduleFullScreenLiveFrame.isLandscape()) && rgd.b().a() != null && rgd.b().a().liveInteractiveManagerNotNull(scheduleFullScreenLiveFrame.mLiveDataModel)) {
                BaseFrame a2 = scheduleFullScreenLiveFrame.getFrameContext().i().h().a("tl-intimacy");
                scheduleFullScreenLiveFrame.addFrameInstallTask(ComponentGroupConfig.GROUP_TOP, a2, "tl-intimacy", scheduleFullScreenLiveFrame.mFrontView.findViewById(R.id.taolive_interactive_system_frame));
                scheduleFullScreenLiveFrame.addFrameUnInstallTask(ComponentGroupConfig.GROUP_TOP, a2, "tl-intimacy");
            }
        }
    }

    public void d(ScheduleFullScreenLiveFrame scheduleFullScreenLiveFrame) {
        VideoInfo videoInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22fece4e", new Object[]{this, scheduleFullScreenLiveFrame});
        } else if (!scheduleFullScreenLiveFrame.isEntranceHidden(ComponentGroupConfig.GROUP_RIGHT_SIDE, ComponentGroupConfig.RIGHT_SIDE_VIRTUAL_HOST_TAG) && (videoInfo = scheduleFullScreenLiveFrame.mLiveDetailData) != null && videoInfo.roomType == 8888) {
            scheduleFullScreenLiveFrame.addFrameInstallTask(ComponentGroupConfig.GROUP_RIGHT_SIDE, scheduleFullScreenLiveFrame.mFrameContext.i().d().a("tl-virtual-anchor"), "tl-virtual-anchor", scheduleFullScreenLiveFrame.mFrontView.findViewById(R.id.taolive_virtual_anchor_stub));
        }
    }

    public void e(ScheduleFullScreenLiveFrame scheduleFullScreenLiveFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9934104e", new Object[]{this, scheduleFullScreenLiveFrame});
            return;
        }
        try {
            if (!scheduleFullScreenLiveFrame.isEntranceHidden(ComponentGroupConfig.GROUP_RIGHT_SIDE, ComponentGroupConfig.RIGHT_SIDE_LIVE_WATER_MARK)) {
                scheduleFullScreenLiveFrame.addFrameInstallTask(ComponentGroupConfig.GROUP_RIGHT_SIDE, scheduleFullScreenLiveFrame.mFrameContext.i().d().a("tl-watermark"), "tl-watermark", scheduleFullScreenLiveFrame.mFrontView.findViewById(R.id.taolive_room_watermark));
            }
        } catch (Exception e) {
            o3s.b("RightTopGroupFrames", "initRoomWatermark exp :" + e.getMessage());
        }
    }
}
