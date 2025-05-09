package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.comments.chatKMP.ChatFrameKMP;
import com.taobao.android.live.plugin.atype.flexalocal.comments.notify.ImportantEventFrame;
import com.taobao.android.live.plugin.atype.flexalocal.fullscreen.schedule.ScheduleFullScreenLiveFrame;
import com.taobao.taobao.R;
import com.taobao.taolive.sdk.configurable.ComponentGroupConfig;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class xkg {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(295698810);
    }

    public void a(ScheduleFullScreenLiveFrame scheduleFullScreenLiveFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dbd4c603", new Object[]{this, scheduleFullScreenLiveFrame});
        } else if (scheduleFullScreenLiveFrame != null && !scheduleFullScreenLiveFrame.isEntranceHidden(ComponentGroupConfig.GROUP_LEFT_BOTTOM, ComponentGroupConfig.LEFT_BOTTOM_COMMENTS)) {
            ChatFrameKMP chatFrameKMP = new ChatFrameKMP(scheduleFullScreenLiveFrame.mContext, scheduleFullScreenLiveFrame.getFrameContext());
            scheduleFullScreenLiveFrame.addFrameInstallTask(ComponentGroupConfig.GROUP_LEFT_BOTTOM, chatFrameKMP, ChatFrameKMP.class.getSimpleName(), scheduleFullScreenLiveFrame.mFrontView.findViewById(R.id.taolive_msg_stub));
            scheduleFullScreenLiveFrame.addFrameUnInstallTask(ComponentGroupConfig.GROUP_LEFT_BOTTOM, chatFrameKMP, ChatFrameKMP.class.getSimpleName());
        }
    }

    public void b(ScheduleFullScreenLiveFrame scheduleFullScreenLiveFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98c70ddb", new Object[]{this, scheduleFullScreenLiveFrame});
        } else if (rgd.b().a() != null && rgd.b().a().instanceofTBLiveBizDataModel(scheduleFullScreenLiveFrame.mLiveDataModel)) {
            scheduleFullScreenLiveFrame.addFrameInstallTask(scheduleFullScreenLiveFrame.mFrameContext.i().d().a("tl-room-gift"), "tl-room-gift", scheduleFullScreenLiveFrame.mFrontView.findViewById(R.id.taolive_gift_stub));
        }
    }

    public void c(ScheduleFullScreenLiveFrame scheduleFullScreenLiveFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2355f203", new Object[]{this, scheduleFullScreenLiveFrame});
        } else if (scheduleFullScreenLiveFrame != null) {
            boolean isEntranceHidden = scheduleFullScreenLiveFrame.isEntranceHidden(ComponentGroupConfig.GROUP_LEFT_BOTTOM, ComponentGroupConfig.LEFT_BOTTOM_GIFT_SHOW);
            boolean isEntranceHidden2 = scheduleFullScreenLiveFrame.isEntranceHidden(ComponentGroupConfig.GROUP_LEFT_BOTTOM, ComponentGroupConfig.LEFT_BOTTOM_IMPORTANT_NOTICE);
            boolean isEntranceHidden3 = scheduleFullScreenLiveFrame.isEntranceHidden(ComponentGroupConfig.GROUP_LEFT_BOTTOM, ComponentGroupConfig.LEFT_BOTTOM_ATMOS_ENTER);
            if (!isEntranceHidden && !isEntranceHidden2 && !isEntranceHidden3 && rgd.b().a() != null && rgd.b().a().instanceofTBLiveBizDataModel(scheduleFullScreenLiveFrame.mLiveDataModel)) {
                ImportantEventFrame importantEventFrame = new ImportantEventFrame(scheduleFullScreenLiveFrame.mContext, scheduleFullScreenLiveFrame.getFrameContext());
                scheduleFullScreenLiveFrame.addFrameInstallTask(ComponentGroupConfig.GROUP_LEFT_BOTTOM, importantEventFrame, ImportantEventFrame.class.getSimpleName(), scheduleFullScreenLiveFrame.mFrontView.findViewById(R.id.taolive_important_event_stub));
                scheduleFullScreenLiveFrame.addFrameUnInstallTask(ComponentGroupConfig.GROUP_LEFT_BOTTOM, importantEventFrame, ImportantEventFrame.class.getSimpleName());
            }
        }
    }
}
