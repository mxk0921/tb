package com.taobao.android.live.plugin.atype.flexalocal.fullscreen.schedule;

import android.content.Context;
import android.view.View;
import android.view.ViewStub;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.alilive.aliliveframework.frame.IComponent;
import com.taobao.android.live.plugin.atype.flexalocal.fullscreen.FullScreenLiveFrame2;
import com.taobao.android.live.plugin.proxy.smartlanding.ISmartLandingProxy;
import com.taobao.taobao.R;
import com.taobao.taolive.room.openarchitecture.opencompontent.ability.OpenAbilityCompontentTypeEnum;
import com.taobao.taolive.sdk.configurable.ComponentGroupConfig;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import tb.ay9;
import tb.chd;
import tb.clg;
import tb.dz9;
import tb.ej2;
import tb.er9;
import tb.f6k;
import tb.fr9;
import tb.h17;
import tb.ixl;
import tb.jzd;
import tb.nh4;
import tb.nzd;
import tb.o3s;
import tb.or;
import tb.q5k;
import tb.qeo;
import tb.rkv;
import tb.t2o;
import tb.u3s;
import tb.ux9;
import tb.v2s;
import tb.vwl;
import tb.w3u;
import tb.xeo;
import tb.xkg;
import tb.xr9;
import tb.y5k;
import tb.y8f;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ScheduleFullScreenLiveFrame extends FullScreenLiveFrame2 implements ISmartLandingProxy.d {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String FLUID_LAUNCHER_BIZ_NAME = "live_scroll";
    private static final long SMART_LANDING_MAX_TIMEOUT = TimeUnit.SECONDS.toMillis(2);
    private static final String TAG = "ScheduleFullScreenLiveFrame";
    private er9 mFluidLauncher = null;
    private final w3u mTopGroupFrames = new w3u();
    private final clg mLeftTopGroupFrames = new clg();
    private final xkg mLeftBottomGroupFrames = new xkg();
    private final xeo mRightTopGroupFrames = new xeo();
    private final qeo mRightBottomGroupFrames = new qeo();
    private final ej2 mBottomGroupFrames = new ej2();
    private final y5k mNonGroupFrames = new y5k();
    private final f6k mNonUIFrames = new f6k();
    private final q5k mNonFirstScreenFrames = new q5k();
    private final Set<IComponent> mPipelineComponents = new HashSet();
    private final List<xr9> mFluidTaskList = new ArrayList();
    private boolean mNeedLaunchFluidWithDataBind = false;
    private final Runnable mStartInstallComponents = new a();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                ScheduleFullScreenLiveFrame.access$000(ScheduleFullScreenLiveFrame.this, false);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements nzd {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // tb.nzd
        public List<xr9> a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (List) ipChange.ipc$dispatch("58c31d07", new Object[]{this});
            }
            return ScheduleFullScreenLiveFrame.access$100(ScheduleFullScreenLiveFrame.this);
        }
    }

    static {
        t2o.a(295698805);
        t2o.a(806355250);
    }

    public ScheduleFullScreenLiveFrame(Context context, boolean z, TBLiveDataModel tBLiveDataModel, ux9 ux9Var) {
        super(context, z, tBLiveDataModel, ux9Var);
    }

    public static /* synthetic */ void access$000(ScheduleFullScreenLiveFrame scheduleFullScreenLiveFrame, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3a97fa9", new Object[]{scheduleFullScreenLiveFrame, new Boolean(z)});
        } else {
            scheduleFullScreenLiveFrame.initLauncherAndSubmitTask(z);
        }
    }

    public static /* synthetic */ List access$100(ScheduleFullScreenLiveFrame scheduleFullScreenLiveFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("432d39d", new Object[]{scheduleFullScreenLiveFrame});
        }
        return scheduleFullScreenLiveFrame.mFluidTaskList;
    }

    private boolean enableRegisterSmartLanding() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("51b722ff", new Object[]{this})).booleanValue();
        }
        return Boolean.parseBoolean(v2s.o().p().b("tblive", "enableRegisterSmartLanding", "true"));
    }

    private jzd getTaskConfigRegistry(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jzd) ipChange.ipc$dispatch("e21fdfdb", new Object[]{this, new Boolean(z)});
        }
        if (vwl.e().c()) {
            return new ixl();
        }
        if (!fromUpDownSwitch() || z) {
            return new y8f();
        }
        return new rkv();
    }

    private void initFluidLauncher(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9361f13", new Object[]{this, new Boolean(z)});
            return;
        }
        this.mFluidLauncher = er9.d(this.mContext, this.mFrameContext, new fr9.a().a(FLUID_LAUNCHER_BIZ_NAME).d(new b()).c(getTaskConfigRegistry(z)).b());
    }

    public static /* synthetic */ Object ipc$super(ScheduleFullScreenLiveFrame scheduleFullScreenLiveFrame, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1857981988:
                super.onDidAppear();
                return null;
            case -1773235229:
                super.initRank();
                return null;
            case -1678547545:
                super.initUserTask();
                return null;
            case -1610016887:
                super.initGoodListFrame();
                return null;
            case -1528761620:
                super.initRewardPanel();
                return null;
            case -1373417162:
                super.initMultiPKLinkFrame();
                return null;
            case -1178985519:
                super.initInteractPanel((h17) objArr[0]);
                return null;
            case -1073179481:
                super.onFreezeLayout();
                return null;
            case -908767872:
                super.onUnfreezeLayout();
                return null;
            case -354804593:
                super.initNotice();
                return null;
            case -309961236:
                super.onCleanUp();
                return null;
            case -282012399:
                super.initMultiLinkFrame();
                return null;
            case 24692559:
                super.initPKLinkFrame();
                return null;
            case 120719712:
                super.initDoubleClickFavView();
                return null;
            case 323707383:
                super.initVoiceRoomFrame();
                return null;
            case 690752966:
                super.onBindData((TBLiveDataModel) objArr[0]);
                return null;
            case 730122974:
                super.initLinkLiveFrame();
                return null;
            case 740992956:
                super.initProjectScreen();
                return null;
            case 750810356:
                super.initBTypeOtherFrameInner();
                return null;
            case 798567141:
                super.initCleanView();
                return null;
            case 838817354:
                super.initMoreLive((chd) objArr[0]);
                return null;
            case 1035325029:
                super.initTBLiveXBackFrameInner();
                return null;
            case 1126913241:
                super.initMemberGuide();
                return null;
            case 1400099921:
                super.initPrivateVip();
                return null;
            case 2058633994:
                super.initInputFrame((ViewStub) objArr[0]);
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/fullscreen/schedule/ScheduleFullScreenLiveFrame");
        }
    }

    public void addFrameInstallTask(BaseFrame baseFrame, String str, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ab8dc59", new Object[]{this, baseFrame, str, view});
        } else {
            addFrameInstallTask(null, baseFrame, str, view, null);
        }
    }

    public void addFrameUnInstallTask(String str, BaseFrame baseFrame, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96722e48", new Object[]{this, str, baseFrame, str2});
        } else if (vwl.e().c()) {
            if (baseFrame == null) {
                o3s.b(TAG, "Add frame unInstall task failed, frameGroup: " + str + ", frameName = " + str2);
                return;
            }
            this.mFluidTaskList.add(new dz9(baseFrame));
        }
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public boolean childrenAppearImmediately() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b790d775", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.fullscreen.FullScreenFrame
    public void initB2BConnectingView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ccd0e26", new Object[]{this});
        } else if (!vwl.e().c()) {
            this.mNonFirstScreenFrames.e(this);
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.fullscreen.FullScreenFrame
    public void initBTypeOtherFrameInner() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2cc074f4", new Object[]{this});
        } else if (!vwl.e().c()) {
            if (nh4.z()) {
                this.mNonFirstScreenFrames.f(this);
                this.mNonFirstScreenFrames.k(this);
                return;
            }
            super.initBTypeOtherFrameInner();
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.fullscreen.AbsFullScreenFrame, com.taobao.android.live.plugin.atype.flexalocal.fullscreen.FullScreenFrame
    public void initBottomBar() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6578b3f", new Object[]{this});
            return;
        }
        this.mBottomBarView = this.mFrontView.findViewById(R.id.taolive_bottom_bar);
        this.mBottomGroupFrames.a(this);
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.fullscreen.AbsFullScreenFrame, com.taobao.android.live.plugin.atype.flexalocal.fullscreen.FullScreenFrame
    public void initChat() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dcb8650f", new Object[]{this});
        } else {
            this.mLeftBottomGroupFrames.a(this);
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.fullscreen.AbsFullScreenFrame, com.taobao.android.live.plugin.atype.flexalocal.fullscreen.FullScreenFrame
    public void initCleanView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f992ae5", new Object[]{this});
        } else if (!vwl.e().c()) {
            if (nh4.z()) {
                this.mNonGroupFrames.g(this);
            } else {
                super.initCleanView();
            }
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.fullscreen.AbsFullScreenFrame, com.taobao.android.live.plugin.atype.flexalocal.fullscreen.FullScreenFrame
    public void initDoubleClickFavView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7320960", new Object[]{this});
        } else if (!vwl.e().c()) {
            if (nh4.z()) {
                this.mBottomGroupFrames.b(this);
            } else {
                super.initDoubleClickFavView();
            }
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.fullscreen.AbsFullScreenFrame, com.taobao.android.live.plugin.atype.flexalocal.fullscreen.FullScreenFrame
    public void initFavor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f214e095", new Object[]{this});
        } else {
            this.mNonGroupFrames.h(this);
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.fullscreen.FullScreenLiveFrame2
    public void initFavorEffect() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5a68346", new Object[]{this});
        } else if (!vwl.e().c()) {
            this.mNonGroupFrames.i(this);
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.fullscreen.AbsFullScreenFrame, com.taobao.android.live.plugin.atype.flexalocal.fullscreen.FullScreenFrame
    public void initGoodListFrame() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0091789", new Object[]{this});
        } else if (!vwl.e().c()) {
            if (nh4.z()) {
                this.mBottomGroupFrames.c(this);
            } else {
                super.initGoodListFrame();
            }
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.fullscreen.AbsFullScreenFrame, com.taobao.android.live.plugin.atype.flexalocal.fullscreen.FullScreenFrame
    public void initH5Container() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cac0518b", new Object[]{this});
        } else if (or.a(getFrameContext(), OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_CustomizedSimpleLive)) {
            o3s.b("TBLVOpenShopCardComponent", "极简直播间禁用 Alive");
        } else {
            this.mNonFirstScreenFrames.g(this);
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.fullscreen.FullScreenLiveFrame2
    public void initImportantArea() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e812da6", new Object[]{this});
        } else {
            this.mLeftBottomGroupFrames.c(this);
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.fullscreen.AbsFullScreenFrame
    public void initInputFrame(ViewStub viewStub) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ab4430a", new Object[]{this, viewStub});
        } else if (!vwl.e().c()) {
            if (nh4.z()) {
                this.mBottomGroupFrames.d(this, viewStub);
            } else {
                super.initInputFrame(viewStub);
            }
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.fullscreen.AbsFullScreenFrame, com.taobao.android.live.plugin.atype.flexalocal.fullscreen.FullScreenFrame
    public void initInteractBizCenter() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("943d1209", new Object[]{this});
        } else {
            this.mNonUIFrames.a(this);
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.fullscreen.FullScreenFrame
    public void initInteractPanel(h17 h17Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9ba1bd1", new Object[]{this, h17Var});
        } else if (!vwl.e().c()) {
            if (nh4.z()) {
                this.mNonFirstScreenFrames.h(this, h17Var);
            } else {
                super.initInteractPanel(h17Var);
            }
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.fullscreen.AbsFullScreenFrame, com.taobao.android.live.plugin.atype.flexalocal.fullscreen.FullScreenFrame
    public void initInteractiveRightComponent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("496cd19a", new Object[]{this});
        } else {
            this.mRightTopGroupFrames.b(this);
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.fullscreen.FullScreenLiveFrame2
    public void initInteractiveSystemComponent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf7b0c03", new Object[]{this});
        } else {
            this.mRightTopGroupFrames.c(this);
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.fullscreen.FullScreenLiveFrame2
    public void initLinkLiveFrame() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b84cade", new Object[]{this});
        } else if (!vwl.e().c()) {
            if (nh4.z()) {
                this.mNonGroupFrames.j(this);
            } else {
                super.initLinkLiveFrame();
            }
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.fullscreen.AbsFullScreenFrame
    public void initLiveAvatarNewCardFrame() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("203e9539", new Object[]{this});
        } else if (!vwl.e().c()) {
            this.mNonFirstScreenFrames.i(this);
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.fullscreen.FullScreenLiveFrame2
    public void initLiveEndRecommend() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c040864", new Object[]{this});
        } else {
            this.mNonGroupFrames.k(this);
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.fullscreen.FullScreenLiveFrame2, com.taobao.android.live.plugin.atype.flexalocal.fullscreen.FullScreenFrame
    public void initMediaPlatform() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9139264e", new Object[]{this});
        } else {
            this.mNonUIFrames.b(this);
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.fullscreen.FullScreenLiveFrame2
    public void initMemberGuide() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("432b54d9", new Object[]{this});
        } else if (!vwl.e().c()) {
            if (nh4.z()) {
                this.mNonGroupFrames.l(this);
            } else {
                super.initMemberGuide();
            }
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.fullscreen.FullScreenLiveFrame2
    public void initMessageCard() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10fcf58e", new Object[]{this});
        } else {
            this.mLeftTopGroupFrames.e(this);
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.fullscreen.AbsFullScreenFrame
    public void initMoreLive(chd chdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("31ff564a", new Object[]{this, chdVar});
        } else if (vwl.e().c() || chdVar == null) {
        } else {
            if (nh4.z()) {
                this.mNonFirstScreenFrames.j(this, chdVar);
            } else {
                super.initMoreLive(chdVar);
            }
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.fullscreen.AbsFullScreenFrame
    public void initMoreLiveRightComponent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("636e7739", new Object[]{this});
        } else {
            this.mRightTopGroupFrames.a(this, isLandscape());
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.fullscreen.FullScreenLiveFrame2
    public void initMultiLinkFrame() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef30d511", new Object[]{this});
        } else if (!vwl.e().c()) {
            if (nh4.z()) {
                this.mNonGroupFrames.m(this);
            } else {
                super.initMultiLinkFrame();
            }
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.fullscreen.FullScreenLiveFrame2
    public void initMultiPKLinkFrame() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae235136", new Object[]{this});
        } else if (!vwl.e().c()) {
            if (nh4.z()) {
                this.mNonGroupFrames.n(this);
            } else {
                super.initMultiPKLinkFrame();
            }
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.fullscreen.AbsFullScreenFrame, com.taobao.android.live.plugin.atype.flexalocal.fullscreen.FullScreenFrame
    public void initNewBottomGuide() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93123f08", new Object[]{this});
        } else if (!vwl.e().c()) {
            this.mBottomNewGuide = (ViewStub) this.mFrontView.findViewById(R.id.taolive_bottom_guide_stub2);
            this.mNonFirstScreenFrames.d(this);
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.fullscreen.FullScreenLiveFrame2
    public void initNewGiftArea() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2690274", new Object[]{this});
        } else if (!vwl.e().c()) {
            this.mLeftBottomGroupFrames.b(this);
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.fullscreen.FullScreenLiveFrame2
    public void initNotice() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eada1c8f", new Object[]{this});
        } else if (nh4.z()) {
            this.mLeftTopGroupFrames.f(this);
        } else {
            super.initNotice();
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.fullscreen.FullScreenLiveFrame2
    public void initOfficialLiveEntry() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3005c12", new Object[]{this});
        } else if (!vwl.e().c()) {
            this.mTopGroupFrames.a(this);
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.fullscreen.FullScreenLiveFrame2
    public void initPKLinkFrame() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("178c74f", new Object[]{this});
        } else if (!vwl.e().c()) {
            if (nh4.z()) {
                this.mNonGroupFrames.o(this);
            } else {
                super.initPKLinkFrame();
            }
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.fullscreen.FullScreenLiveFrame2, com.taobao.android.live.plugin.atype.flexalocal.fullscreen.FullScreenFrame
    public void initPrivateVip() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5373d451", new Object[]{this});
        } else if (!vwl.e().c()) {
            if (nh4.z()) {
                this.mNonFirstScreenFrames.l(this);
            } else {
                super.initPrivateVip();
            }
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.fullscreen.FullScreenLiveFrame2
    public void initProjectScreen() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c2aa7bc", new Object[]{this});
        } else if (!vwl.e().c()) {
            if (nh4.z()) {
                this.mNonGroupFrames.p(this);
            } else {
                super.initProjectScreen();
            }
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.fullscreen.FullScreenFrame
    public void initRank() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("964e93e3", new Object[]{this});
        } else if (!vwl.e().c()) {
            if (nh4.z()) {
                this.mTopGroupFrames.b(this);
            } else {
                super.initRank();
            }
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.fullscreen.FullScreenLiveFrame2
    public void initRankLiveEntrance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24f0c5", new Object[]{this});
        } else if (!u3s.b()) {
            this.mLeftTopGroupFrames.g(this);
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.fullscreen.FullScreenLiveFrame2
    public void initRewardPanel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4e0f2ec", new Object[]{this});
        } else if (!vwl.e().c()) {
            if (nh4.z()) {
                this.mNonGroupFrames.q(this);
            } else {
                super.initRewardPanel();
            }
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.fullscreen.AbsFullScreenFrame, com.taobao.android.live.plugin.atype.flexalocal.fullscreen.FullScreenFrame
    public void initRoomWatermark(VideoInfo videoInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cff02c2d", new Object[]{this, videoInfo});
        } else if (!vwl.e().c()) {
            this.mRightTopGroupFrames.e(this);
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.fullscreen.FullScreenLiveFrame2
    public void initShowCase() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0a87b04", new Object[]{this});
        } else {
            this.mRightBottomGroupFrames.a(this);
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.fullscreen.FullScreenLiveFrame2
    public void initSubscribeLive() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("519ad3ad", new Object[]{this});
        } else {
            this.mLeftTopGroupFrames.d(this);
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.fullscreen.FullScreenFrame
    public void initTBLiveXBackFrameInner() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3db5ce65", new Object[]{this});
        } else if (!vwl.e().c()) {
            if (nh4.z()) {
                this.mNonGroupFrames.r(this);
            } else {
                super.initTBLiveXBackFrameInner();
            }
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.fullscreen.AbsFullScreenFrame, com.taobao.android.live.plugin.atype.flexalocal.fullscreen.FullScreenFrame
    public void initTopBar() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3488935", new Object[]{this});
        } else {
            this.mTopGroupFrames.c(this);
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.fullscreen.FullScreenLiveFrame2
    public void initTopSelectComment() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("127e0d25", new Object[]{this});
        } else if (!vwl.e().c()) {
            this.mLeftTopGroupFrames.h(this);
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.fullscreen.FullScreenFrame
    public void initUserTask() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9bf365a7", new Object[]{this});
        } else if (!vwl.e().c()) {
            if (nh4.z()) {
                this.mNonFirstScreenFrames.m(this);
            } else {
                super.initUserTask();
            }
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.fullscreen.FullScreenLiveFrame2
    public void initVirtualAnchor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff796af7", new Object[]{this});
        } else if (!vwl.e().c()) {
            this.mRightTopGroupFrames.d(this);
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.fullscreen.FullScreenLiveFrame2
    public void initVoiceRoomFrame() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("134b61f7", new Object[]{this});
        } else if (!vwl.e().c()) {
            if (nh4.z()) {
                this.mNonFirstScreenFrames.n(this);
            } else {
                super.initVoiceRoomFrame();
            }
        }
    }

    public boolean isEntranceHidden(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e39a6be9", new Object[]{this, str, str2})).booleanValue();
        }
        return ComponentGroupConfig.componentEntranceHidden(str, str2, this.mFrameContext);
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponent
    public void onBindData(TBLiveDataModel tBLiveDataModel) {
        er9 er9Var;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("292c0dc6", new Object[]{this, tBLiveDataModel});
            return;
        }
        super.onBindData(tBLiveDataModel);
        if (this.mNeedLaunchFluidWithDataBind && (er9Var = this.mFluidLauncher) != null) {
            er9Var.n();
            this.mNeedLaunchFluidWithDataBind = false;
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.fullscreen.FullScreenLiveFrame2, com.taobao.android.live.plugin.atype.flexalocal.fullscreen.AbsFullScreenFrame, com.taobao.android.live.plugin.atype.flexalocal.fullscreen.FullScreenFrame, com.taobao.alilive.aliliveframework.frame.BaseFrame
    public void onCleanUp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed865dec", new Object[]{this});
            return;
        }
        super.onCleanUp();
        this.mNeedLaunchFluidWithDataBind = false;
        this.weakHandler.removeCallbacks(this.mStartInstallComponents);
        er9 er9Var = this.mFluidLauncher;
        if (er9Var != null) {
            er9Var.c();
            this.mFluidLauncher.k();
            this.mFluidLauncher = null;
        }
    }

    @Override // com.taobao.android.live.plugin.atype.flexalocal.fullscreen.AbsFullScreenFrame, com.taobao.android.live.plugin.atype.flexalocal.fullscreen.FullScreenFrame, com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onDidAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("914171dc", new Object[]{this});
            return;
        }
        super.onDidAppear();
        for (IComponent iComponent : this.mComponents) {
            if (!this.mPipelineComponents.contains(iComponent)) {
                iComponent.onDidAppear();
            } else if (iComponent.getComponentView() != null) {
                iComponent.getComponentView().setVisibility(8);
            }
        }
        registerSmartLanding();
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public void onFreezeLayout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c00894a7", new Object[]{this});
            return;
        }
        super.onFreezeLayout();
        er9 er9Var = this.mFluidLauncher;
        if (er9Var != null) {
            er9Var.c();
        }
        ux9 ux9Var = this.mFrameContext;
        if (ux9Var != null) {
            ux9Var.t().i();
        }
    }

    @Override // com.taobao.android.live.plugin.proxy.smartlanding.ISmartLandingProxy.d
    public boolean onTaskActionListener(String str, String str2, JSONObject jSONObject, JSONArray jSONArray, JSONObject jSONObject2) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fd5561e5", new Object[]{this, str, str2, jSONObject, jSONArray, jSONObject2})).booleanValue();
        }
        if (jSONObject != null && jSONObject.containsKey("isNeedFirstLoad") && jSONObject.getBoolean("isNeedFirstLoad").booleanValue()) {
            z = true;
        }
        initLauncherAndSubmitTask(z);
        return true;
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public void onUnfreezeLayout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9d54d80", new Object[]{this});
            return;
        }
        super.onUnfreezeLayout();
        er9 er9Var = this.mFluidLauncher;
        if (er9Var != null) {
            er9Var.n();
        }
        ux9 ux9Var = this.mFrameContext;
        if (ux9Var != null) {
            ux9Var.t().j();
        }
    }

    private void initLauncherAndSubmitTask(boolean z) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75d315a9", new Object[]{this, new Boolean(z)});
            return;
        }
        this.weakHandler.removeCallbacks(this.mStartInstallComponents);
        if (this.mFluidLauncher == null) {
            StringBuilder sb = new StringBuilder("开始组件加载，提前加载alive ：");
            sb.append(z);
            sb.append(" liveContextKey = ");
            ux9 ux9Var = this.mFrameContext;
            if (ux9Var != null) {
                str = ux9Var.p();
            } else {
                str = "mFrameContext is null, can't get liveContextKey";
            }
            sb.append(str);
            o3s.b(TAG, sb.toString());
            initFluidLauncher(z);
            if (getLiveDataModel() == null) {
                this.mNeedLaunchFluidWithDataBind = true;
            } else {
                this.mFluidLauncher.n();
            }
        }
    }

    public void addFrameInstallTask(BaseFrame baseFrame, String str, View view, BaseFrame.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("654db7d5", new Object[]{this, baseFrame, str, view, bVar});
        } else {
            addFrameInstallTask(null, baseFrame, str, view, bVar);
        }
    }

    private void registerSmartLanding() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae7b7258", new Object[]{this});
        } else if (this.mFrameContext.j().u == null || !enableRegisterSmartLanding()) {
            initLauncherAndSubmitTask(false);
        } else {
            this.mFrameContext.j().u.j(true, "targetAlive", this);
            if (this.mFluidLauncher == null) {
                this.weakHandler.postDelayed(this.mStartInstallComponents, SMART_LANDING_MAX_TIMEOUT);
            }
        }
    }

    public void addFrameInstallTask(String str, BaseFrame baseFrame, String str2, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36231ce3", new Object[]{this, str, baseFrame, str2, view});
        } else {
            addFrameInstallTask(str, baseFrame, str2, view, null);
        }
    }

    public void addFrameInstallTask(String str, BaseFrame baseFrame, String str2, View view, BaseFrame.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3f8d8b", new Object[]{this, str, baseFrame, str2, view, bVar});
        } else if (baseFrame == null) {
            o3s.b(TAG, "Add frame install task failed, frameGroup: " + str + ", frameName = " + str2 + ", frameView = " + view);
        } else {
            this.mComponents.add(baseFrame);
            this.mPipelineComponents.add(baseFrame);
            ay9 ay9Var = new ay9(baseFrame, this, view);
            ay9Var.h(bVar);
            this.mFluidTaskList.add(ay9Var);
            if (nh4.z()) {
                er9 er9Var = this.mFluidLauncher;
                if (er9Var != null) {
                    er9Var.m(ay9Var);
                }
                o3s.b(TAG, "mFluidLauncher has submitted task list compensation submit task frameName = " + str2);
            }
        }
    }
}
