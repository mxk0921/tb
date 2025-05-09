package tb;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.android.live.plugin.atype.flexalocal.bottom.guide.BottomSlideNewGuideFrame;
import com.taobao.android.live.plugin.atype.flexalocal.fullscreen.schedule.ScheduleFullScreenLiveFrame;
import com.taobao.android.live.plugin.atype.flexalocal.tbliveinteractive.room.interactpanel.InteractPanelFrameSDK;
import com.taobao.android.live.plugin.atype.flexalocal.usertask.FloatingUserTaskFrame;
import com.taobao.android.live.plugin.proxy.ir.room.IRRoomProxy;
import com.taobao.android.live.plugin.proxy.room.IBTypeRoomProxy;
import com.taobao.taobao.R;
import com.taobao.taolive.room.openarchitecture.entity.ATaoLiveOpenEntity;
import com.taobao.taolive.room.openarchitecture.entity.TaoliveOpenBizCodeEnum;
import com.taobao.taolive.sdk.configurable.ComponentGroupConfig;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import com.taobao.taolive.sdk.morelive.TaoMoreLiveRoomFrame;
import tb.bl9;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class q5k {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements r7e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ScheduleFullScreenLiveFrame f26519a;

        public a(q5k q5kVar, ScheduleFullScreenLiveFrame scheduleFullScreenLiveFrame) {
            this.f26519a = scheduleFullScreenLiveFrame;
        }

        @Override // tb.r7e
        public void a(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("34ae6dec", new Object[]{this, str, str2});
            } else {
                sjr.g().c(str, str2, this.f26519a.observeUniqueIdentification());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements bl9.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ScheduleFullScreenLiveFrame f26520a;

        public b(ScheduleFullScreenLiveFrame scheduleFullScreenLiveFrame) {
            this.f26520a = scheduleFullScreenLiveFrame;
        }

        @Override // tb.bl9.b
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9bef331", new Object[]{this});
            } else {
                q5k.a(q5k.this, this.f26520a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class c implements BaseFrame.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ h17 f26521a;

        public c(q5k q5kVar, h17 h17Var) {
            this.f26521a = h17Var;
        }

        @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame.b
        public void a(BaseFrame baseFrame) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6e03ebfb", new Object[]{this, baseFrame});
                return;
            }
            h17 h17Var = this.f26521a;
            if (h17Var != null) {
                h17Var.a(baseFrame);
            }
        }
    }

    static {
        t2o.a(295698813);
    }

    public static /* synthetic */ void a(q5k q5kVar, ScheduleFullScreenLiveFrame scheduleFullScreenLiveFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7bd2da06", new Object[]{q5kVar, scheduleFullScreenLiveFrame});
        } else {
            q5kVar.b(scheduleFullScreenLiveFrame);
        }
    }

    public static boolean c(ux9 ux9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a71b45f2", new Object[]{ux9Var})).booleanValue();
        }
        if (ux9Var.A() == null || ux9Var.A().bizCode == null) {
            return false;
        }
        return TaoliveOpenBizCodeEnum.TaoLiveOpenBizCode_StandardOpenWatch.toString().equals(ux9Var.A().bizCode);
    }

    public final void b(ScheduleFullScreenLiveFrame scheduleFullScreenLiveFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("306c98", new Object[]{this, scheduleFullScreenLiveFrame});
        } else if (d9m.e() != null) {
            IBTypeRoomProxy e = d9m.e();
            Context context = scheduleFullScreenLiveFrame.mContext;
            boolean z = scheduleFullScreenLiveFrame.mLandscape;
            TBLiveDataModel tBLiveDataModel = scheduleFullScreenLiveFrame.mLiveDataModel;
            View view = scheduleFullScreenLiveFrame.mFrontView;
            int i = R.id.taolive_privatevip_container_stub;
            BaseFrame createPrivateVipFrame = e.createPrivateVipFrame(context, z, tBLiveDataModel, (ViewStub) view.findViewById(i));
            if (createPrivateVipFrame != null) {
                scheduleFullScreenLiveFrame.addFrameInstallTask(createPrivateVipFrame, "tl-private-vip", scheduleFullScreenLiveFrame.mFrontView.findViewById(i));
            }
        }
    }

    public void d(ScheduleFullScreenLiveFrame scheduleFullScreenLiveFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ddc02173", new Object[]{this, scheduleFullScreenLiveFrame});
        } else if (!liv.j(scheduleFullScreenLiveFrame.mLiveDetailData) && !scheduleFullScreenLiveFrame.mLandscape) {
            BottomSlideNewGuideFrame bottomSlideNewGuideFrame = new BottomSlideNewGuideFrame(scheduleFullScreenLiveFrame.mContext, true, scheduleFullScreenLiveFrame.mLiveDataModel, scheduleFullScreenLiveFrame.mFrameContext);
            scheduleFullScreenLiveFrame.addFrameInstallTask(bottomSlideNewGuideFrame, bottomSlideNewGuideFrame.getComponentName(), scheduleFullScreenLiveFrame.mFrontView.findViewById(R.id.taolive_bottom_guide_stub2));
        }
    }

    public void e(ScheduleFullScreenLiveFrame scheduleFullScreenLiveFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3db137b", new Object[]{this, scheduleFullScreenLiveFrame});
        } else if (lvs.j() && v2s.o().I("link")) {
            scheduleFullScreenLiveFrame.addFrameInstallTask(scheduleFullScreenLiveFrame.mFrameContext.i().h().a("tl-connect-mic"), "tl-connect-mic", scheduleFullScreenLiveFrame.mFrontView.findViewById(R.id.taolive_bbconecting_stub));
        }
    }

    public void f(ScheduleFullScreenLiveFrame scheduleFullScreenLiveFrame) {
        BaseFrame createDecelerationZoneFrame;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e21609d6", new Object[]{this, scheduleFullScreenLiveFrame});
        } else if (scheduleFullScreenLiveFrame != null && bl9.g().b() && d9m.e() != null && (createDecelerationZoneFrame = d9m.e().createDecelerationZoneFrame(scheduleFullScreenLiveFrame.mContext, scheduleFullScreenLiveFrame.mLandscape, scheduleFullScreenLiveFrame.mLiveDataModel, scheduleFullScreenLiveFrame.mFrameContext)) != null) {
            scheduleFullScreenLiveFrame.addFrameInstallTask(createDecelerationZoneFrame, "tl-deceleration-zone", null);
        }
    }

    public void g(ScheduleFullScreenLiveFrame scheduleFullScreenLiveFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e44991d3", new Object[]{this, scheduleFullScreenLiveFrame});
        } else if (scheduleFullScreenLiveFrame != null && rgd.b().a() != null && rgd.b().a().liveInteractiveManagerNotNull(scheduleFullScreenLiveFrame.mLiveDataModel)) {
            BaseFrame a2 = scheduleFullScreenLiveFrame.getFrameContext().i().h().a("dynamic_h5_sdk");
            scheduleFullScreenLiveFrame.addFrameInstallTask(a2, "dynamic_h5_sdk", scheduleFullScreenLiveFrame.getH5RootView());
            scheduleFullScreenLiveFrame.addFrameUnInstallTask(ComponentGroupConfig.GROUP_DEFAULT, a2, "dynamic_h5_sdk");
        }
    }

    public void h(ScheduleFullScreenLiveFrame scheduleFullScreenLiveFrame, h17 h17Var) {
        View view;
        View view2;
        czd czdVar;
        View m;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d29d064c", new Object[]{this, scheduleFullScreenLiveFrame, h17Var});
        } else if (scheduleFullScreenLiveFrame != null && scheduleFullScreenLiveFrame.mInteractPanelFrame == null) {
            ViewGroup viewGroup = null;
            ATaoLiveOpenEntity taoliveOpenLiveRoomEntity = rgd.b().a() != null ? rgd.b().a().getTaoliveOpenLiveRoomEntity(scheduleFullScreenLiveFrame.mFrameContext) : null;
            ViewGroup viewGroup2 = (taoliveOpenLiveRoomEntity == null || (czdVar = taoliveOpenLiveRoomEntity.uiCompontent) == null || ((rbt) czdVar).b() == null || (m = ((rbt) taoliveOpenLiveRoomEntity.uiCompontent).b().m()) == null) ? null : (ViewGroup) m.findViewById(rgd.b().c(IRRoomProxy.R_ID_TAOLIVE_OPEN_INTERACT_PANEL_FRAME));
            if (viewGroup2 != null) {
                View inflate = LayoutInflater.from(scheduleFullScreenLiveFrame.mContext).inflate(R.layout.taolive_interact_container_flexalocal, (ViewGroup) null);
                if (inflate != null) {
                    viewGroup = (ViewGroup) inflate.findViewById(R.id.taolive_interact_list_container);
                    view = inflate.findViewById(R.id.taolive_interact_cover);
                    viewGroup2.addView(inflate);
                } else {
                    view = null;
                }
            } else {
                Context context = scheduleFullScreenLiveFrame.mContext;
                int i = R.id.taolive_interact_list_container;
                ViewGroup viewGroup3 = (ViewGroup) e9m.a(context, i);
                Context context2 = scheduleFullScreenLiveFrame.mContext;
                int i2 = R.id.taolive_interact_cover;
                View a2 = e9m.a(context2, i2);
                if (!lvs.c() || (view2 = scheduleFullScreenLiveFrame.mContainer) == null) {
                    viewGroup = viewGroup3;
                    view = a2;
                } else {
                    viewGroup = (ViewGroup) view2.findViewById(i);
                    view = scheduleFullScreenLiveFrame.mContainer.findViewById(i2);
                }
            }
            if (viewGroup != null) {
                InteractPanelFrameSDK interactPanelFrameSDK = new InteractPanelFrameSDK(scheduleFullScreenLiveFrame.mContext, scheduleFullScreenLiveFrame.isLandscape(), scheduleFullScreenLiveFrame.mLiveDataModel, scheduleFullScreenLiveFrame.mFrameContext);
                scheduleFullScreenLiveFrame.mInteractPanelFrame = interactPanelFrameSDK;
                interactPanelFrameSDK.setCoverView(view);
                if (h17Var != null) {
                    h17Var.b(interactPanelFrameSDK);
                }
                scheduleFullScreenLiveFrame.addFrameInstallTask(interactPanelFrameSDK, "tl-interact-panel", viewGroup, new c(this, h17Var));
            }
        }
    }

    public void i(ScheduleFullScreenLiveFrame scheduleFullScreenLiveFrame) {
        BaseFrame liveAvatarNewFrame;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1911ccc", new Object[]{this, scheduleFullScreenLiveFrame});
        } else if (!scheduleFullScreenLiveFrame.isEntranceHidden(ComponentGroupConfig.GROUP_NON_FIRST_SCREEN, ComponentGroupConfig.NON_FIRST_SCREEN_LIVE_ANCHOR_PAGE) && (liveAvatarNewFrame = d9m.y().getLiveAvatarNewFrame(scheduleFullScreenLiveFrame.mContext, scheduleFullScreenLiveFrame.mFrameContext)) != null) {
            scheduleFullScreenLiveFrame.addFrameInstallTask(liveAvatarNewFrame, "LiveAvatarNewCardFrame", scheduleFullScreenLiveFrame.mFrontView.findViewById(R.id.taolive_live_avatar_card_container));
        }
    }

    public void j(ScheduleFullScreenLiveFrame scheduleFullScreenLiveFrame, chd chdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fe59616", new Object[]{this, scheduleFullScreenLiveFrame, chdVar});
        } else if (chdVar != null && scheduleFullScreenLiveFrame != null) {
            TaoMoreLiveRoomFrame c2 = chdVar.c(scheduleFullScreenLiveFrame.mContext, scheduleFullScreenLiveFrame.mLandscape, scheduleFullScreenLiveFrame.mLiveDataModel, scheduleFullScreenLiveFrame.mFrameContext);
            scheduleFullScreenLiveFrame.mTaoMoreLiveFrame = c2;
            scheduleFullScreenLiveFrame.mAdView = c2.getContainerView();
            scheduleFullScreenLiveFrame.addFrameInstallTask(scheduleFullScreenLiveFrame.mTaoMoreLiveFrame, "tl-more-live", null);
        }
    }

    public void k(ScheduleFullScreenLiveFrame scheduleFullScreenLiveFrame) {
        BaseFrame createNonageFrame;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b0735fd", new Object[]{this, scheduleFullScreenLiveFrame});
        } else if (scheduleFullScreenLiveFrame != null && bl9.g().b() && d9m.e() != null && scheduleFullScreenLiveFrame.mContext != null && scheduleFullScreenLiveFrame.mFrameContext != null && !giv.c().b() && c(scheduleFullScreenLiveFrame.mFrameContext) && (createNonageFrame = d9m.e().createNonageFrame(scheduleFullScreenLiveFrame.mContext, scheduleFullScreenLiveFrame.mLandscape, scheduleFullScreenLiveFrame.mLiveDataModel, scheduleFullScreenLiveFrame.mFrameContext)) != null) {
            scheduleFullScreenLiveFrame.addFrameInstallTask(createNonageFrame, "tl-nonage", null);
        }
    }

    public void l(ScheduleFullScreenLiveFrame scheduleFullScreenLiveFrame) {
        VideoInfo c0;
        VideoInfo.AccessInfo accessInfo;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5623f964", new Object[]{this, scheduleFullScreenLiveFrame});
        } else if (lvs.t() && scheduleFullScreenLiveFrame != null && (c0 = up6.c0(scheduleFullScreenLiveFrame.mFrameContext)) != null && (accessInfo = c0.accessInfo) != null) {
            if (accessInfo.access) {
                if (TextUtils.equals("PRIVATE", accessInfo.accessType)) {
                    str = "欢迎进入会员专属直播间";
                } else if (TextUtils.equals("VIP", c0.accessInfo.accessType)) {
                    str = "欢迎" + v2s.o().u().getNick() + "\n进入您的专属直播间！";
                } else {
                    str = "";
                }
                if (!TextUtils.isEmpty(str)) {
                    w0u.b(scheduleFullScreenLiveFrame.mContext, str);
                }
            } else if (bl9.g().b()) {
                b(scheduleFullScreenLiveFrame);
            } else {
                bl9.g().i(new b(scheduleFullScreenLiveFrame));
            }
        }
    }

    public void m(ScheduleFullScreenLiveFrame scheduleFullScreenLiveFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96f51b8e", new Object[]{this, scheduleFullScreenLiveFrame});
        } else if (scheduleFullScreenLiveFrame != null && !up6.q0(scheduleFullScreenLiveFrame.mFrameContext) && !ysv.M(scheduleFullScreenLiveFrame.mFrameContext)) {
            FloatingUserTaskFrame floatingUserTaskFrame = new FloatingUserTaskFrame(scheduleFullScreenLiveFrame.mContext, scheduleFullScreenLiveFrame.mFrameContext, "");
            floatingUserTaskFrame.setIUserTaskEventListener(new a(this, scheduleFullScreenLiveFrame));
            scheduleFullScreenLiveFrame.addFrameInstallTask(floatingUserTaskFrame, "tl-floating-user-task", scheduleFullScreenLiveFrame.mFrontView.findViewById(R.id.taolive_user_task));
        }
    }

    public void n(ScheduleFullScreenLiveFrame scheduleFullScreenLiveFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c92f6fe", new Object[]{this, scheduleFullScreenLiveFrame});
        } else if (scheduleFullScreenLiveFrame != null && scheduleFullScreenLiveFrame.mFrontView != null && lvs.a() && !scheduleFullScreenLiveFrame.isLandscape()) {
            BaseFrame voiceRoomFrame = d9m.N().getVoiceRoomFrame(scheduleFullScreenLiveFrame.mContext, scheduleFullScreenLiveFrame.getFrameContext());
            scheduleFullScreenLiveFrame.mChatRoomLinkFrame = voiceRoomFrame;
            if (voiceRoomFrame != null) {
                View view = scheduleFullScreenLiveFrame.mFrontView;
                int i = R.id.taolive_voice_room_link_stub;
                voiceRoomFrame.keepViewStubWithoutInflate((ViewStub) view.findViewById(i));
                scheduleFullScreenLiveFrame.addFrameInstallTask(scheduleFullScreenLiveFrame.mChatRoomLinkFrame, "tl-voice-room", scheduleFullScreenLiveFrame.mFrontView.findViewById(i));
                return;
            }
            o3s.d("NonFirstScreenFrames", "showVoiceRoomFrame, frame = null");
        }
    }
}
