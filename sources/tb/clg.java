package tb;

import android.view.ViewGroup;
import android.view.ViewStub;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.android.live.plugin.atype.flexalocal.fullscreen.schedule.ScheduleFullScreenLiveFrame;
import com.taobao.android.live.plugin.atype.flexalocal.rank.RankEntranceFrame;
import com.taobao.android.live.plugin.proxy.FlexaLiveX;
import com.taobao.taobao.R;
import com.taobao.taolive.sdk.configurable.ComponentGroupConfig;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import tb.bl9;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class clg {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements bl9.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ScheduleFullScreenLiveFrame f17135a;

        public a(ScheduleFullScreenLiveFrame scheduleFullScreenLiveFrame) {
            this.f17135a = scheduleFullScreenLiveFrame;
        }

        @Override // tb.bl9.b
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9bef331", new Object[]{this});
                return;
            }
            try {
                clg.a(clg.this, this.f17135a);
            } catch (Throwable th) {
                FlexaLiveX.w("[LeftTopGroupFrames#registerRemoteFrame#onBTypePluginInstalled]  error: " + th.getMessage());
            }
        }
    }

    static {
        t2o.a(295698811);
    }

    public static /* synthetic */ void a(clg clgVar, ScheduleFullScreenLiveFrame scheduleFullScreenLiveFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b36b2a68", new Object[]{clgVar, scheduleFullScreenLiveFrame});
        } else {
            clgVar.c(scheduleFullScreenLiveFrame);
        }
    }

    public final void b(ScheduleFullScreenLiveFrame scheduleFullScreenLiveFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbd757bb", new Object[]{this, scheduleFullScreenLiveFrame});
            return;
        }
        try {
            if (bl9.g().b()) {
                c(scheduleFullScreenLiveFrame);
            } else {
                bl9.g().i(new a(scheduleFullScreenLiveFrame));
            }
        } catch (Throwable th) {
            FlexaLiveX.w("[LeftTopGroupFrames#registerRemoteFrame]  error: " + th.getMessage());
        }
    }

    public final void c(ScheduleFullScreenLiveFrame scheduleFullScreenLiveFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e2aa2a5", new Object[]{this, scheduleFullScreenLiveFrame});
        } else if (d9m.v().getNoticeFrame4Class() != null) {
            zu1.b("tl-notice-4", d9m.v().getNoticeFrame4Class());
            scheduleFullScreenLiveFrame.addFrameInstallTask(ComponentGroupConfig.GROUP_NON_FIRST_SCREEN, scheduleFullScreenLiveFrame.mFrameContext.i().d().a("tl-notice-4"), "tl-notice-4", (ViewStub) scheduleFullScreenLiveFrame.mFrontView.findViewById(R.id.taolive_notice4_stub));
        }
    }

    public void d(ScheduleFullScreenLiveFrame scheduleFullScreenLiveFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80fafe72", new Object[]{this, scheduleFullScreenLiveFrame});
        } else if (scheduleFullScreenLiveFrame != null && !scheduleFullScreenLiveFrame.isEntranceHidden(ComponentGroupConfig.GROUP_LEFT_SIDE, ComponentGroupConfig.LEFT_SIDE_FANS_PUSH)) {
            if (nh4.p1()) {
                scheduleFullScreenLiveFrame.mFrameContext.i().g(scheduleFullScreenLiveFrame, "tl_7days_subscribe", (ViewStub) scheduleFullScreenLiveFrame.mFrontView.findViewById(R.id.taolive_subscribe_live));
            }
            BaseFrame a2 = scheduleFullScreenLiveFrame.mFrameContext.i().d().a("tl_7days_subscribe");
            scheduleFullScreenLiveFrame.addFrameInstallTask(ComponentGroupConfig.GROUP_LEFT_SIDE, a2, "tl_7days_subscribe", scheduleFullScreenLiveFrame.mFrontView.findViewById(R.id.taolive_subscribe_live));
            scheduleFullScreenLiveFrame.addFrameUnInstallTask(ComponentGroupConfig.GROUP_LEFT_SIDE, a2, "tl_7days_subscribe");
        }
    }

    public void e(ScheduleFullScreenLiveFrame scheduleFullScreenLiveFrame) {
        VideoInfo c0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8e3dbfb", new Object[]{this, scheduleFullScreenLiveFrame});
        } else if (scheduleFullScreenLiveFrame == null || !nh4.g() || (c0 = up6.c0(scheduleFullScreenLiveFrame.mFrameContext)) == null || c0.fullScreen) {
        } else {
            if ((!c0.landScape || !up6.v0(scheduleFullScreenLiveFrame.mFrameContext)) && !scheduleFullScreenLiveFrame.isEntranceHidden(ComponentGroupConfig.GROUP_LEFT_SIDE, ComponentGroupConfig.LEFT_SIDE_LEFT_NOTICE)) {
                BaseFrame a2 = scheduleFullScreenLiveFrame.mFrameContext.i().d().a("tl-message-card");
                scheduleFullScreenLiveFrame.addFrameInstallTask(ComponentGroupConfig.GROUP_LEFT_SIDE, a2, "tl-message-card", scheduleFullScreenLiveFrame.mFrontView.findViewById(R.id.taolive_messageCard_stub));
                scheduleFullScreenLiveFrame.addFrameUnInstallTask(ComponentGroupConfig.GROUP_LEFT_SIDE, a2, "tl-message-card");
            }
        }
    }

    public void f(ScheduleFullScreenLiveFrame scheduleFullScreenLiveFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbc27160", new Object[]{this, scheduleFullScreenLiveFrame});
        } else if (!vwl.e().c()) {
            if (gnk.a().d(scheduleFullScreenLiveFrame.mLiveDataModel)) {
                o3s.b("LeftTopGroupFrames", "initNotice return:[isOfficialLive is true]");
            } else if (scheduleFullScreenLiveFrame.mFrameContext.c()) {
                o3s.b("LeftTopGroupFrames", "initNotice return:[enableLiveAndHomeMix is true]");
            } else if (scheduleFullScreenLiveFrame.isEntranceHidden(ComponentGroupConfig.GROUP_NON_FIRST_SCREEN, ComponentGroupConfig.NON_FIRST_SCREEN_TOP_NOTICE)) {
                scheduleFullScreenLiveFrame.addFrameInstallTask(ComponentGroupConfig.GROUP_LEFT_SIDE, scheduleFullScreenLiveFrame.mFrameContext.i().h().a("tl-notice"), "tl-notice", (ViewStub) scheduleFullScreenLiveFrame.mFrontView.findViewById(R.id.taolive_notice_stub));
            } else if (scheduleFullScreenLiveFrame.isEnableNotice4()) {
                b(scheduleFullScreenLiveFrame);
            } else {
                scheduleFullScreenLiveFrame.addFrameInstallTask(ComponentGroupConfig.GROUP_LEFT_SIDE, scheduleFullScreenLiveFrame.mFrameContext.i().d().a("tl-notice"), "tl-notice", scheduleFullScreenLiveFrame.mFrontView.findViewById(R.id.taolive_notice_stub));
            }
        }
    }

    public void g(ScheduleFullScreenLiveFrame scheduleFullScreenLiveFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8033502d", new Object[]{this, scheduleFullScreenLiveFrame});
        } else if (!scheduleFullScreenLiveFrame.isEntranceHidden(ComponentGroupConfig.GROUP_LEFT_SIDE, ComponentGroupConfig.LEFT_SIDE_LEFT_BANNER)) {
            RankEntranceFrame rankEntranceFrame = new RankEntranceFrame(scheduleFullScreenLiveFrame.mContext, scheduleFullScreenLiveFrame.getFrameContext());
            scheduleFullScreenLiveFrame.addFrameInstallTask(ComponentGroupConfig.GROUP_LEFT_SIDE, rankEntranceFrame, RankEntranceFrame.class.getSimpleName(), scheduleFullScreenLiveFrame.mFrontView.findViewById(R.id.taolive_rank_live_entrance));
            scheduleFullScreenLiveFrame.addFrameUnInstallTask(ComponentGroupConfig.GROUP_LEFT_SIDE, rankEntranceFrame, RankEntranceFrame.class.getSimpleName());
        }
    }

    public void h(ScheduleFullScreenLiveFrame scheduleFullScreenLiveFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("597a219", new Object[]{this, scheduleFullScreenLiveFrame});
        } else if (!scheduleFullScreenLiveFrame.isLandscape()) {
            scheduleFullScreenLiveFrame.addFrameInstallTask(scheduleFullScreenLiveFrame.mFrameContext.i().d().a("tl-top-select_comment"), "tl-top-select_comment", scheduleFullScreenLiveFrame.mFrontView.findViewById(R.id.taolive_top_select_comment));
            scheduleFullScreenLiveFrame.mFrameContext.o0((ViewGroup) scheduleFullScreenLiveFrame.mFrontView.findViewById(R.id.taolive_left_top_container));
        }
    }
}
