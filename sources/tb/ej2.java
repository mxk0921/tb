package tb;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewStub;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.android.live.plugin.atype.flexalocal.fullscreen.schedule.ScheduleFullScreenLiveFrame;
import com.taobao.taobao.R;
import com.taobao.taolive.sdk.configurable.ComponentGroupConfig;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class ej2 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements BaseFrame.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ScheduleFullScreenLiveFrame f18609a;

        public a(ej2 ej2Var, ScheduleFullScreenLiveFrame scheduleFullScreenLiveFrame) {
            this.f18609a = scheduleFullScreenLiveFrame;
        }

        @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame.b
        public void a(BaseFrame baseFrame) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6e03ebfb", new Object[]{this, baseFrame});
                return;
            }
            View view = this.f18609a.mContainer;
            if (view instanceof kyd) {
                ((kyd) view).setAbsInputFrame2(baseFrame);
            }
        }
    }

    static {
        t2o.a(295698808);
    }

    public void a(ScheduleFullScreenLiveFrame scheduleFullScreenLiveFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8c0e06a", new Object[]{this, scheduleFullScreenLiveFrame});
        } else if (scheduleFullScreenLiveFrame != null) {
            BaseFrame a2 = scheduleFullScreenLiveFrame.mFrameContext.i().d().a("tl-bottom-bar");
            scheduleFullScreenLiveFrame.addFrameInstallTask("BottomGroup", a2, "tl-bottom-bar-native", scheduleFullScreenLiveFrame.mFrontView.findViewById(R.id.taolive_bottombar_stub2));
            scheduleFullScreenLiveFrame.addFrameUnInstallTask("BottomGroup", a2, "tl-bottom-bar-native");
        }
    }

    public void b(ScheduleFullScreenLiveFrame scheduleFullScreenLiveFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92f75654", new Object[]{this, scheduleFullScreenLiveFrame});
        } else if (!scheduleFullScreenLiveFrame.isEntranceHidden(ComponentGroupConfig.GROUP_NON_FIRST_SCREEN, ComponentGroupConfig.NON_FIRST_SCREEN_DOUBLE_LIKE)) {
            scheduleFullScreenLiveFrame.addFrameInstallTask("BottomGroup", scheduleFullScreenLiveFrame.mFrameContext.i().d().a("tl-double-click"), "tl-double-click", scheduleFullScreenLiveFrame.mContainer.findViewById(R.id.taolive_room_double_click_fav));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void c(com.taobao.android.live.plugin.atype.flexalocal.fullscreen.schedule.ScheduleFullScreenLiveFrame r12) {
        /*
            Method dump skipped, instructions count: 319
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.ej2.c(com.taobao.android.live.plugin.atype.flexalocal.fullscreen.schedule.ScheduleFullScreenLiveFrame):void");
    }

    public void d(ScheduleFullScreenLiveFrame scheduleFullScreenLiveFrame, ViewStub viewStub) {
        ux9 ux9Var;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2db60709", new Object[]{this, scheduleFullScreenLiveFrame, viewStub});
        } else if (scheduleFullScreenLiveFrame != null && viewStub != null && (ux9Var = scheduleFullScreenLiveFrame.mFrameContext) != null && ux9Var.i() != null && scheduleFullScreenLiveFrame.mFrameContext.i().d() != null) {
            scheduleFullScreenLiveFrame.addFrameInstallTask("BottomGroup", scheduleFullScreenLiveFrame.mFrameContext.i().d().a("tl-input"), "tl-input", viewStub, new a(this, scheduleFullScreenLiveFrame));
        }
    }

    public final void e(ux9 ux9Var, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93c444b1", new Object[]{this, ux9Var, str});
        } else if (ux9Var != null && !TextUtils.isEmpty(str)) {
            HashMap hashMap = new HashMap();
            hashMap.put("track_type", "initError");
            hashMap.put("schedule", "1");
            hashMap.put("glCode", str);
            if (giv.f() != null) {
                giv.f().m(ux9Var, "GLBindDataTime", hashMap);
            }
        }
    }
}
