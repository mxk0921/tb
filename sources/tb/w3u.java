package tb;

import android.view.View;
import android.view.ViewStub;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.android.live.plugin.atype.flexalocal.banner.TaoLiveBannerFrame;
import com.taobao.android.live.plugin.atype.flexalocal.fullscreen.schedule.ScheduleFullScreenLiveFrame;
import com.taobao.android.live.plugin.atype.flexalocal.topbar.TopFakeBarFrame;
import com.taobao.taobao.R;
import com.taobao.taolive.room.openarchitecture.entity.TaoliveOpenBizCodeEnum;
import com.taobao.taolive.sdk.configurable.ComponentGroupConfig;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class w3u {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(295698823);
    }

    public void a(ScheduleFullScreenLiveFrame scheduleFullScreenLiveFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd4a2d8c", new Object[]{this, scheduleFullScreenLiveFrame});
        } else if (!gnk.a().b(scheduleFullScreenLiveFrame.mFrameContext, scheduleFullScreenLiveFrame.mLiveDataModel) && gnk.a().d(scheduleFullScreenLiveFrame.mLiveDataModel)) {
            scheduleFullScreenLiveFrame.addFrameInstallTask(scheduleFullScreenLiveFrame.mFrameContext.i().d().a("tl-official-live-entry"), "tl-official-live-entry", scheduleFullScreenLiveFrame.mFrontView.findViewById(R.id.taolive_official_live_entry_stub));
        }
    }

    public void b(ScheduleFullScreenLiveFrame scheduleFullScreenLiveFrame) {
        View view;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dbc95d7", new Object[]{this, scheduleFullScreenLiveFrame});
        } else if (scheduleFullScreenLiveFrame != null && !ComponentGroupConfig.componentEntranceHidden(ComponentGroupConfig.GROUP_TOP, ComponentGroupConfig.TOP_REWARD_RANK, scheduleFullScreenLiveFrame.mFrameContext) && d9m.e() != null) {
            int i = R.id.taolive_rank_stub;
            if (((ViewStub) scheduleFullScreenLiveFrame.findViewById(i)) != null && (view = scheduleFullScreenLiveFrame.mFrontView) != null) {
                scheduleFullScreenLiveFrame.addFrameInstallTask(d9m.e().createRankFrame(scheduleFullScreenLiveFrame.mContext, scheduleFullScreenLiveFrame.mFrameContext), "tl-rank", (ViewStub) view.findViewById(i));
            }
        }
    }

    public void c(ScheduleFullScreenLiveFrame scheduleFullScreenLiveFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63aae5fa", new Object[]{this, scheduleFullScreenLiveFrame});
            return;
        }
        if (liv.j(scheduleFullScreenLiveFrame.mLiveDetailData) && !scheduleFullScreenLiveFrame.mLandscape) {
            TaoLiveBannerFrame taoLiveBannerFrame = new TaoLiveBannerFrame(scheduleFullScreenLiveFrame.mContext, scheduleFullScreenLiveFrame.mFrameContext);
            scheduleFullScreenLiveFrame.addFrameInstallTask(ComponentGroupConfig.GROUP_TOP, taoLiveBannerFrame, taoLiveBannerFrame.getComponentName(), scheduleFullScreenLiveFrame.mFrontView.findViewById(R.id.taolive_topbar_stub2));
        }
        if (!scheduleFullScreenLiveFrame.isEntranceHidden(ComponentGroupConfig.GROUP_TOP, ComponentGroupConfig.TOP_ACCOUNT_INFO)) {
            BaseFrame a2 = scheduleFullScreenLiveFrame.mFrameContext.i().d().a("tl-top-bar");
            scheduleFullScreenLiveFrame.addFrameInstallTask(ComponentGroupConfig.GROUP_TOP, a2, a2.getComponentName(), scheduleFullScreenLiveFrame.mFrontView.findViewById(R.id.taolive_topbar_stub2));
            scheduleFullScreenLiveFrame.addFrameUnInstallTask(ComponentGroupConfig.GROUP_TOP, a2, a2.getComponentName());
        } else if (TaoliveOpenBizCodeEnum.TaoLiveOpenBizCode_OpenWatch.name().equals(scheduleFullScreenLiveFrame.mFrameContext.P.bizCode) || TaoliveOpenBizCodeEnum.TaoLiveOpenBizCode_Tab2.name().equals(scheduleFullScreenLiveFrame.mFrameContext.P.bizCode)) {
            TopFakeBarFrame topFakeBarFrame = new TopFakeBarFrame(scheduleFullScreenLiveFrame.mContext, scheduleFullScreenLiveFrame.mFrameContext);
            String componentName = topFakeBarFrame.getComponentName();
            View view = scheduleFullScreenLiveFrame.mFrontView;
            int i = R.id.taolive_topbar_stub2;
            scheduleFullScreenLiveFrame.addFrameInstallTask(ComponentGroupConfig.GROUP_TOP, topFakeBarFrame, componentName, view.findViewById(i));
            BaseFrame a3 = scheduleFullScreenLiveFrame.mFrameContext.i().d().a("tl-top-bar");
            scheduleFullScreenLiveFrame.addFrameInstallTask(ComponentGroupConfig.GROUP_TOP, a3, a3.getComponentName(), scheduleFullScreenLiveFrame.mFrontView.findViewById(i));
            scheduleFullScreenLiveFrame.addFrameUnInstallTask(ComponentGroupConfig.GROUP_TOP, a3, a3.getComponentName());
        }
    }
}
