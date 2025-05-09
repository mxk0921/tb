package tb;

import android.content.Context;
import android.view.View;
import android.view.ViewStub;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.android.live.plugin.atype.flexalocal.fullscreen.schedule.ScheduleFullScreenLiveFrame;
import com.taobao.android.live.plugin.proxy.FlexaLiveX;
import com.taobao.android.live.plugin.proxy.bclink.IBCLinkProxy;
import com.taobao.android.live.plugin.proxy.room.IBTypeRoomProxy;
import com.taobao.taobao.R;
import com.taobao.taolive.sdk.configurable.ComponentGroupConfig;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import tb.bl9;
import tb.xco;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class y5k {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements bl9.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ScheduleFullScreenLiveFrame f31868a;

        public a(ScheduleFullScreenLiveFrame scheduleFullScreenLiveFrame) {
            this.f31868a = scheduleFullScreenLiveFrame;
        }

        @Override // tb.bl9.b
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9bef331", new Object[]{this});
                return;
            }
            try {
                y5k.c(y5k.this, this.f31868a);
            } catch (Throwable th) {
                FlexaLiveX.w("[NonGroupFrames#registerRemoteFrame#onBTypePluginInstalled]  error: " + th.getMessage());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements BaseFrame.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ScheduleFullScreenLiveFrame f31869a;

        public b(y5k y5kVar, ScheduleFullScreenLiveFrame scheduleFullScreenLiveFrame) {
            this.f31869a = scheduleFullScreenLiveFrame;
        }

        @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame.b
        public void a(BaseFrame baseFrame) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6e03ebfb", new Object[]{this, baseFrame});
            } else if (this.f31869a.isClearScreen) {
                d9m.y().blankFrame2Show(this.f31869a.mBlankFrame, false);
            } else {
                d9m.y().blankFrame2Hide(this.f31869a.mBlankFrame);
            }
        }
    }

    static {
        t2o.a(295698817);
    }

    public static /* synthetic */ void c(y5k y5kVar, ScheduleFullScreenLiveFrame scheduleFullScreenLiveFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5af0109", new Object[]{y5kVar, scheduleFullScreenLiveFrame});
        } else {
            y5kVar.d(scheduleFullScreenLiveFrame);
        }
    }

    public static /* synthetic */ View e(ScheduleFullScreenLiveFrame scheduleFullScreenLiveFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("555e799e", new Object[]{scheduleFullScreenLiveFrame});
        }
        return scheduleFullScreenLiveFrame.mContainer.findViewById(R.id.taolive_reward_x_card_frame);
    }

    public static /* synthetic */ View f(ScheduleFullScreenLiveFrame scheduleFullScreenLiveFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("8f30cdac", new Object[]{scheduleFullScreenLiveFrame});
        }
        return scheduleFullScreenLiveFrame.mContainer.findViewById(R.id.taolive_bottom_bar_wrapper);
    }

    public final void d(final ScheduleFullScreenLiveFrame scheduleFullScreenLiveFrame) {
        ux9 ux9Var;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8784e799", new Object[]{this, scheduleFullScreenLiveFrame});
        } else if (d9m.e() != null && d9m.e().getFrameClassMap(IBTypeRoomProxy.KEY_FRAME_CLASS_REWARD_PANEL_FRAME) != null && (ux9Var = scheduleFullScreenLiveFrame.mFrameContext) != null && ux9Var.i() != null && scheduleFullScreenLiveFrame.mFrameContext.i().d() != null) {
            zu1.b("tl-reward-panel", d9m.e().getFrameClassMap(IBTypeRoomProxy.KEY_FRAME_CLASS_REWARD_PANEL_FRAME));
            scheduleFullScreenLiveFrame.addFrameInstallTask(scheduleFullScreenLiveFrame.mFrameContext.i().d().a("tl-reward-panel"), "tl-reward-panel", scheduleFullScreenLiveFrame.mContainer.findViewById(R.id.taolive_room_reward_panel_stub));
            FlexaLiveX.w("[NonGroupFrames#registerRemoteFrame#onBTypePluginInstalled] REWARD_FRAME success: ");
            if (((t54) scheduleFullScreenLiveFrame.mFrameContext).x0() != null) {
                ((t54) scheduleFullScreenLiveFrame.mFrameContext).x0().d(new xco.a() { // from class: tb.w5k
                    @Override // tb.xco.a
                    public final View getView() {
                        View e;
                        e = y5k.e(ScheduleFullScreenLiveFrame.this);
                        return e;
                    }
                });
            }
        }
    }

    public void g(ScheduleFullScreenLiveFrame scheduleFullScreenLiveFrame) {
        ux9 ux9Var;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae6cee0a", new Object[]{this, scheduleFullScreenLiveFrame});
        } else if (scheduleFullScreenLiveFrame != null && scheduleFullScreenLiveFrame.configCleanScreenEntranceShow() && (ux9Var = scheduleFullScreenLiveFrame.mFrameContext) != null && ux9Var.i() != null && scheduleFullScreenLiveFrame.mFrameContext.i().d() != null && scheduleFullScreenLiveFrame.mContainer != null) {
            BaseFrame a2 = scheduleFullScreenLiveFrame.mFrameContext.i().d().a("tl-clear-screen");
            scheduleFullScreenLiveFrame.mBlankFrame = a2;
            if (a2 != null) {
                scheduleFullScreenLiveFrame.addFrameInstallTask(a2, "tl-clear-screen", scheduleFullScreenLiveFrame.mContainer.findViewById(R.id.taolive_blank_frame_stub), new b(this, scheduleFullScreenLiveFrame));
            }
        }
    }

    public void h(ScheduleFullScreenLiveFrame scheduleFullScreenLiveFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70235a83", new Object[]{this, scheduleFullScreenLiveFrame});
        } else if (scheduleFullScreenLiveFrame != null) {
            BaseFrame a2 = scheduleFullScreenLiveFrame.mFrameContext.i().d().a("tl-favor-anim");
            scheduleFullScreenLiveFrame.addFrameInstallTask(a2, "tl-favor-anim", scheduleFullScreenLiveFrame.mFrontView.findViewById(R.id.taolive_favor_stub3));
            scheduleFullScreenLiveFrame.addFrameUnInstallTask(ComponentGroupConfig.GROUP_DEFAULT, a2, "tl-favor-anim");
        }
    }

    public void i(ScheduleFullScreenLiveFrame scheduleFullScreenLiveFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85ce000", new Object[]{this, scheduleFullScreenLiveFrame});
        } else if (lvs.f() && !scheduleFullScreenLiveFrame.mLandscape) {
            scheduleFullScreenLiveFrame.addFrameInstallTask(scheduleFullScreenLiveFrame.mFrameContext.i().h().a("tl-favor-effect"), "tl-favor-effect", scheduleFullScreenLiveFrame.mFrontView.findViewById(R.id.taolive_favor_effect_stub));
        }
    }

    public void j(ScheduleFullScreenLiveFrame scheduleFullScreenLiveFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3030dab1", new Object[]{this, scheduleFullScreenLiveFrame});
        } else if (scheduleFullScreenLiveFrame != null && d9m.d() != null) {
            IBCLinkProxy d = d9m.d();
            Context context = scheduleFullScreenLiveFrame.mContext;
            ux9 ux9Var = scheduleFullScreenLiveFrame.mFrameContext;
            TBLiveDataModel tBLiveDataModel = scheduleFullScreenLiveFrame.mLiveDataModel;
            View view = scheduleFullScreenLiveFrame.mContainer;
            int i = R.id.taolive_video_linklive3_stub;
            BaseFrame createLiveLinkFrame3 = d.createLiveLinkFrame3(context, ux9Var, tBLiveDataModel, (ViewStub) view.findViewById(i));
            scheduleFullScreenLiveFrame.liveLinkFrame3 = createLiveLinkFrame3;
            scheduleFullScreenLiveFrame.addFrameInstallTask(createLiveLinkFrame3, "tl-link-live", scheduleFullScreenLiveFrame.mFrontView.findViewById(i));
        }
    }

    public void k(ScheduleFullScreenLiveFrame scheduleFullScreenLiveFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40a6be18", new Object[]{this, scheduleFullScreenLiveFrame});
        } else {
            scheduleFullScreenLiveFrame.addFrameInstallTask(scheduleFullScreenLiveFrame.mFrameContext.i().d().a("tl-live-end-recommend"), "tl-live-end-recommend", scheduleFullScreenLiveFrame.mFrontView.findViewById(R.id.taolive_live_end_recommend_container));
        }
    }

    public void l(ScheduleFullScreenLiveFrame scheduleFullScreenLiveFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8786d353", new Object[]{this, scheduleFullScreenLiveFrame});
        } else if (scheduleFullScreenLiveFrame != null && d9m.o() != null) {
            scheduleFullScreenLiveFrame.addFrameInstallTask(d9m.o().getMemberGuideFrame2(scheduleFullScreenLiveFrame.mContext, scheduleFullScreenLiveFrame.mLandscape, scheduleFullScreenLiveFrame.mLiveDataModel, scheduleFullScreenLiveFrame.mFrameContext), "tl-member-guide", null);
        }
    }

    public void m(ScheduleFullScreenLiveFrame scheduleFullScreenLiveFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("734d9f24", new Object[]{this, scheduleFullScreenLiveFrame});
        } else if (scheduleFullScreenLiveFrame != null && !scheduleFullScreenLiveFrame.mLandscape && !ComponentGroupConfig.componentEntranceHidden(ComponentGroupConfig.GROUP_NON_FIRST_SCREEN, ComponentGroupConfig.NON_FIRST_SCREEN_MULTI_BB_LINK_WATCH, scheduleFullScreenLiveFrame.mFrameContext)) {
            BaseFrame multiLinkFrame = d9m.t().getMultiLinkFrame(scheduleFullScreenLiveFrame.mContext, scheduleFullScreenLiveFrame.mFrameContext);
            scheduleFullScreenLiveFrame.mMultiAnchorLinkFrame = multiLinkFrame;
            if (multiLinkFrame != null) {
                scheduleFullScreenLiveFrame.addFrameInstallTask(multiLinkFrame, "tl-multi-anchor-link", scheduleFullScreenLiveFrame.mFrontView.findViewById(R.id.taolive_multi_anchor_link_stub));
            } else {
                o3s.d("NonGroupFrames", "initMultiLinkFrame, frame = null");
            }
        }
    }

    public void n(ScheduleFullScreenLiveFrame scheduleFullScreenLiveFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e7532df", new Object[]{this, scheduleFullScreenLiveFrame});
        } else if (scheduleFullScreenLiveFrame != null && lvs.h() && !scheduleFullScreenLiveFrame.mLandscape) {
            BaseFrame multiPkLinkFrame = d9m.u().getMultiPkLinkFrame(scheduleFullScreenLiveFrame.mContext, scheduleFullScreenLiveFrame.mFrameContext);
            scheduleFullScreenLiveFrame.mMultiPKLinkFrame = multiPkLinkFrame;
            if (multiPkLinkFrame != null) {
                scheduleFullScreenLiveFrame.addFrameInstallTask(multiPkLinkFrame, "tl-multi-pk-link", scheduleFullScreenLiveFrame.mFrontView.findViewById(R.id.taolive_multi_pk_link_stub));
            } else {
                o3s.d("NonGroupFrames", "initPKLinkFrame, frame = null");
            }
        }
    }

    public void o(ScheduleFullScreenLiveFrame scheduleFullScreenLiveFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7bf53fa0", new Object[]{this, scheduleFullScreenLiveFrame});
        } else if (scheduleFullScreenLiveFrame != null) {
            if (!scheduleFullScreenLiveFrame.mLandscape || lvs.e()) {
                BaseFrame pkLinkFrame = d9m.z().getPkLinkFrame(scheduleFullScreenLiveFrame.mContext, scheduleFullScreenLiveFrame.mFrameContext);
                scheduleFullScreenLiveFrame.mPKLinkFrame = pkLinkFrame;
                if (pkLinkFrame != null) {
                    scheduleFullScreenLiveFrame.addFrameInstallTask(pkLinkFrame, "tl-pk-link", scheduleFullScreenLiveFrame.mFrontView.findViewById(R.id.taolive_pk_link_stub));
                } else {
                    o3s.d("NonGroupFrames", "initPKLinkFrame, frame = null");
                }
            }
        }
    }

    public void p(ScheduleFullScreenLiveFrame scheduleFullScreenLiveFrame) {
        ux9 ux9Var;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6efb0b36", new Object[]{this, scheduleFullScreenLiveFrame});
        } else if (scheduleFullScreenLiveFrame != null && (ux9Var = scheduleFullScreenLiveFrame.mFrameContext) != null && ux9Var.i() != null && scheduleFullScreenLiveFrame.mFrameContext.i().d() != null && scheduleFullScreenLiveFrame.mFrontView != null) {
            scheduleFullScreenLiveFrame.addFrameInstallTask(scheduleFullScreenLiveFrame.mFrameContext.i().d().a("tl-project-screen-icon"), "tl-project-screen", scheduleFullScreenLiveFrame.mFrontView.findViewById(R.id.taolive_live_project_screen_icon_container));
            scheduleFullScreenLiveFrame.addFrameInstallTask(scheduleFullScreenLiveFrame.mFrameContext.i().d().a("tl-project-screen-search"), "tl-project-screen-search", scheduleFullScreenLiveFrame.mFrontView.findViewById(R.id.taolive_live_project_screen_container));
            scheduleFullScreenLiveFrame.addFrameInstallTask(scheduleFullScreenLiveFrame.mFrameContext.i().d().a("tl-project-screen-opt"), "tl-project-screen-opt", scheduleFullScreenLiveFrame.mFrontView.findViewById(R.id.taolive_live_project_screen_opt_container));
        }
    }

    public void q(final ScheduleFullScreenLiveFrame scheduleFullScreenLiveFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac03326", new Object[]{this, scheduleFullScreenLiveFrame});
        } else if (scheduleFullScreenLiveFrame != null && !vwl.e().c() && !u3s.b()) {
            try {
                if (bl9.g().b()) {
                    d(scheduleFullScreenLiveFrame);
                } else {
                    bl9.g().i(new a(scheduleFullScreenLiveFrame));
                }
            } catch (Throwable th) {
                FlexaLiveX.w("[NonGroupFrames#registerRemoteFrame]  error: " + th.getMessage());
            }
            ux9 ux9Var = scheduleFullScreenLiveFrame.mFrameContext;
            if (ux9Var != null && ((t54) ux9Var).x0() != null) {
                ((t54) scheduleFullScreenLiveFrame.mFrameContext).x0().c(new xco.a() { // from class: tb.u5k
                    @Override // tb.xco.a
                    public final View getView() {
                        View f;
                        f = y5k.f(ScheduleFullScreenLiveFrame.this);
                        return f;
                    }
                });
            }
        }
    }

    public void r(ScheduleFullScreenLiveFrame scheduleFullScreenLiveFrame) {
        BaseFrame createRightBackwardTipsFrame;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("808a2056", new Object[]{this, scheduleFullScreenLiveFrame});
        } else if (scheduleFullScreenLiveFrame != null && d9m.e() != null && (createRightBackwardTipsFrame = d9m.e().createRightBackwardTipsFrame(scheduleFullScreenLiveFrame.mContext, scheduleFullScreenLiveFrame.mLandscape, scheduleFullScreenLiveFrame.mLiveDataModel, scheduleFullScreenLiveFrame.mFrameContext)) != null) {
            scheduleFullScreenLiveFrame.addFrameInstallTask(createRightBackwardTipsFrame, "tl-x-back", scheduleFullScreenLiveFrame.mFrontView.findViewById(R.id.taolive_right_mid_tips_stub));
        }
    }
}
