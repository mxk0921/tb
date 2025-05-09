package com.taobao.android.live.plugin.atype.flexalocal.topbar;

import android.content.Context;
import android.graphics.Outline;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.airbnb.lottie.LottieAnimationView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.android.live.plugin.atype.flexalocal.topbar.anchorinfokmp.AnchorInfoFrameKMP;
import com.taobao.android.live.plugin.atype.flexalocal.topbar.official.OfficialLiveTopBarEntryFrame;
import com.taobao.android.live.plugin.proxy.FlexaLiveX;
import com.taobao.android.task.Coordinator;
import com.taobao.taobao.R;
import com.taobao.taolive.room.openarchitecture.entity.ATaoLiveOpenEntity;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import com.taobao.taolive.sdk.adapter.network.NetResponse;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.model.common.AccountInfo;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.HashMap;
import tb.b0d;
import tb.czd;
import tb.e9m;
import tb.giv;
import tb.gnk;
import tb.hw0;
import tb.k0r;
import tb.liv;
import tb.lmk;
import tb.nh4;
import tb.rbt;
import tb.s3c;
import tb.t2o;
import tb.ux9;
import tb.uyg;
import tb.v2s;
import tb.xca;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class TopBarFrame3 extends BaseFrame implements s3c, b0d {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "TopBarFrame3";
    private LinearLayout avatarLayout;
    private LottieAnimationView flashLottieView;
    private TUrlImageView mAvatarViewBoard;
    private lmk officialEnhanceAnimatorManager;
    private View.OnLayoutChangeListener onLayoutChangeListener;
    private LinearLayout topBarContainer;
    private final Handler mMainHandler = new Handler(Looper.getMainLooper());
    private final Handler mAsyncInflateHandler = new Handler(Coordinator.getWorkerLooper());

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements View.OnLayoutChangeListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* renamed from: com.taobao.android.live.plugin.atype.flexalocal.topbar.TopBarFrame3$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
        public class C0453a extends ViewOutlineProvider {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ int f8699a;
            public final /* synthetic */ int b;

            public C0453a(int i, int i2) {
                this.f8699a = i;
                this.b = i2;
            }

            public static /* synthetic */ Object ipc$super(C0453a aVar, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/topbar/TopBarFrame3$1$1");
            }

            @Override // android.view.ViewOutlineProvider
            public void getOutline(View view, Outline outline) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("7054f590", new Object[]{this, view, outline});
                } else {
                    outline.setRoundRect(0, 0, this.f8699a, this.b, hw0.b(TopBarFrame3.this.mContext, 18.0f));
                }
            }
        }

        public a() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("899df952", new Object[]{this, view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), new Integer(i7), new Integer(i8)});
            } else if (TopBarFrame3.access$000(TopBarFrame3.this) != null) {
                int i9 = i3 - i;
                int i10 = i4 - i2;
                TopBarFrame3.access$000(TopBarFrame3.this).getLayoutParams().width = i9;
                TopBarFrame3.access$000(TopBarFrame3.this).getLayoutParams().height = i10;
                TopBarFrame3.access$000(TopBarFrame3.this).setLayoutParams(TopBarFrame3.access$000(TopBarFrame3.this).getLayoutParams());
                TopBarFrame3.access$000(TopBarFrame3.this).setOutlineProvider(new C0453a(i9, i10));
                TopBarFrame3.access$000(TopBarFrame3.this).setClipToOutline(true);
            }
        }
    }

    static {
        t2o.a(295700013);
        t2o.a(806355016);
        t2o.a(806355932);
    }

    public TopBarFrame3(Context context, ux9 ux9Var) {
        super(context, ux9Var);
    }

    public static /* synthetic */ LottieAnimationView access$000(TopBarFrame3 topBarFrame3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LottieAnimationView) ipChange.ipc$dispatch("afa466e3", new Object[]{topBarFrame3});
        }
        return topBarFrame3.flashLottieView;
    }

    private void addOnLayoutChangeListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("780c1255", new Object[]{this});
            return;
        }
        if (this.onLayoutChangeListener == null) {
            this.onLayoutChangeListener = new a();
        }
        LinearLayout linearLayout = this.topBarContainer;
        if (linearLayout != null) {
            linearLayout.addOnLayoutChangeListener(this.onLayoutChangeListener);
        }
    }

    private void adjustLayoutParams() {
        ux9 ux9Var;
        ATaoLiveOpenEntity A;
        czd czdVar;
        Float f;
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65833386", new Object[]{this});
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) getComponentView().getLayoutParams();
        if (marginLayoutParams != null) {
            marginLayoutParams.topMargin = 0;
            float f2 = 0.0f;
            if (!(giv.c().b() || (ux9Var = this.mFrameContext) == null || (A = ux9Var.A()) == null || (czdVar = A.uiCompontent) == null || ((rbt) czdVar).b() == null || (f = ((rbt) A.uiCompontent).b().f()) == null || f.floatValue() <= 0.0f || f.floatValue() > 500.0f)) {
                f2 = f.floatValue();
                z = true;
            }
            ux9 ux9Var2 = this.mFrameContext;
            if (ux9Var2 != null && ux9Var2.c()) {
                if (!(giv.c().b() || getFrameContext() == null || giv.f() == null)) {
                    marginLayoutParams.topMargin += giv.f().k(this.mFrameContext);
                }
                marginLayoutParams.topMargin += hw0.b(this.mContext, 7.0f);
            } else if (liv.i(this.mLiveDataModel.mVideoInfo) || liv.h(this.mLiveDataModel.mVideoInfo)) {
                if (!this.mLandscape) {
                    int f3 = marginLayoutParams.topMargin + liv.f(this.mContext);
                    marginLayoutParams.topMargin = f3;
                    marginLayoutParams.topMargin = f3 + hw0.b(this.mContext, 7.0f);
                } else if (k0r.v()) {
                    marginLayoutParams.topMargin += xca.c;
                } else {
                    marginLayoutParams.topMargin += hw0.b(this.mContext, 12.0f);
                }
            } else if (z) {
                marginLayoutParams.topMargin += (int) f2;
            } else if (!this.mLandscape) {
                if (k0r.v()) {
                    marginLayoutParams.topMargin += Math.max(xca.b, xca.c);
                } else {
                    marginLayoutParams.topMargin += xca.b;
                }
                marginLayoutParams.topMargin += hw0.b(this.mContext, 12.0f);
            } else if (k0r.v()) {
                marginLayoutParams.topMargin += xca.c;
            } else {
                marginLayoutParams.topMargin += hw0.b(this.mContext, 12.0f);
            }
            getComponentView().setLayoutParams(marginLayoutParams);
        } else if (v2s.o().A() != null) {
            v2s.o().A().c("TopBarFrame_adjustLayoutParams", getComponentView().toString());
        }
    }

    private Handler getAsyncHandler() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("4e5fe2bb", new Object[]{this});
        }
        return this.mAsyncInflateHandler;
    }

    private Handler getMainHandler() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("590b0a64", new Object[]{this});
        }
        return this.mMainHandler;
    }

    private void initAnchorInfoKmp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab512f22", new Object[]{this});
            return;
        }
        AnchorInfoFrameKMP anchorInfoFrameKMP = new AnchorInfoFrameKMP(this.mContext, this.mFrameContext);
        Handler mainHandler = getMainHandler();
        Handler asyncHandler = getAsyncHandler();
        if (mainHandler == null || asyncHandler == null) {
            anchorInfoFrameKMP.createView((ViewStub) findViewById(R.id.taolive_anchor_info_kmp_stub));
            addComponent(anchorInfoFrameKMP);
            return;
        }
        anchorInfoFrameKMP.asyncRenderComponentWithSerialFrameInstaller(this, (ViewGroup) findViewById(R.id.taolive_avatar_info_content), (ViewStub) findViewById(R.id.taolive_anchor_info_kmp_stub), asyncHandler, mainHandler, null, 0L);
    }

    private void initOfficialLiveEntry() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3005c12", new Object[]{this});
        } else if (!gnk.a().h(this.mFrameContext) && !giv.c().b()) {
            OfficialLiveTopBarEntryFrame officialLiveTopBarEntryFrame = new OfficialLiveTopBarEntryFrame(this.mContext, this.mFrameContext);
            officialLiveTopBarEntryFrame.keepViewStubWithoutInflate((ViewStub) findViewById(R.id.taolive_official_live_entry_stub));
            officialLiveTopBarEntryFrame.setAvatarLayout((ViewGroup) findViewById(R.id.taolive_avatar_info_content));
            addComponent(officialLiveTopBarEntryFrame);
        }
    }

    public static /* synthetic */ Object ipc$super(TopBarFrame3 topBarFrame3, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1272916118) {
            super.onDataReceived((TBLiveDataModel) objArr[0]);
            return null;
        } else if (hashCode == -309961236) {
            super.onCleanUp();
            return null;
        } else if (hashCode == 91531079) {
            super.onViewCreated((View) objArr[0]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/live/plugin/atype/flexalocal/topbar/TopBarFrame3");
        }
    }

    private void setAvatarFrame() {
        AccountInfo accountInfo;
        AccountInfo.Atmosphere atmosphere;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eaf4ed59", new Object[]{this});
            return;
        }
        VideoInfo videoInfo = this.mLiveDataModel.mVideoInfo;
        if (videoInfo == null || (accountInfo = videoInfo.broadCaster) == null || (atmosphere = accountInfo.atmosphere) == null || TextUtils.isEmpty(atmosphere.headIcon)) {
            this.mAvatarViewBoard.setVisibility(4);
            return;
        }
        this.mAvatarViewBoard.setVisibility(0);
        this.mAvatarViewBoard.setImageUrl(videoInfo.broadCaster.atmosphere.headIcon);
    }

    private void startOfficialEnhanceAnimator() {
        VideoInfo videoInfo;
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c94e930f", new Object[]{this});
            return;
        }
        TBLiveDataModel tBLiveDataModel = this.mLiveDataModel;
        if (tBLiveDataModel != null && (videoInfo = tBLiveDataModel.mVideoInfo) != null && (jSONObject = videoInfo.originalData) != null && jSONObject.getJSONObject("officialLiveInfo") != null && videoInfo.originalData.getJSONObject("officialLiveInfo").getString("officialLiveAtmosphereLottieUrl") != null) {
            String string = this.mLiveDataModel.mVideoInfo.originalData.getJSONObject("officialLiveInfo").getString("officialLiveAtmosphereLottieUrl");
            if (this.officialEnhanceAnimatorManager == null) {
                this.officialEnhanceAnimatorManager = new lmk(this.mContext, this.mAvatarViewBoard, this.flashLottieView);
            }
            this.officialEnhanceAnimatorManager.c(string);
            this.officialEnhanceAnimatorManager.e();
        }
    }

    private void updateView() {
        VideoInfo videoInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b12a895", new Object[]{this});
            return;
        }
        if (hideTopbar()) {
            hide();
        }
        if (this.flashLottieView != null) {
            TBLiveDataModel tBLiveDataModel = this.mLiveDataModel;
            if (tBLiveDataModel == null || (videoInfo = tBLiveDataModel.mVideoInfo) == null || videoInfo.officialLiveInfo == null || !gnk.a().f(this.mLiveDataModel)) {
                this.flashLottieView.setVisibility(8);
            } else {
                this.flashLottieView.setVisibility(0);
            }
        }
    }

    @Override // tb.s3c
    public String bizCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("36951559", new Object[]{this});
        }
        return "FavorAnimView2";
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponent
    public String getComponentName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bb5fe8c7", new Object[]{this});
        }
        return "tl-top-bar";
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public int getLayoutResId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f1151e95", new Object[]{this})).intValue();
        }
        return R.layout.taolive_topbar_frame_topbar3_flexalocal;
    }

    @Override // tb.s3c
    public String[] observeEvents() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("37b2602b", new Object[]{this});
        }
        return new String[]{uyg.EVENT_MEDIAPLATFORM_CONTAINER_LOAD_FAIL};
    }

    @Override // tb.s3c
    public String observeUniqueIdentification() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4914bdfe", new Object[]{this});
        }
        ux9 ux9Var = this.mFrameContext;
        if (ux9Var == null) {
            return null;
        }
        return ux9Var.C();
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public void onCleanUp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed865dec", new Object[]{this});
            return;
        }
        super.onCleanUp();
        ux9 ux9Var = this.mFrameContext;
        if (ux9Var != null) {
            if (ux9Var.q() != null) {
                this.mFrameContext.q().e(this);
            }
            this.mFrameContext.h().b(this);
        }
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponent, com.taobao.taolive.sdk.controller.IComponentLifeCycle2, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onDataReceived(TBLiveDataModel tBLiveDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b420d76a", new Object[]{this, tBLiveDataModel});
            return;
        }
        super.onDataReceived(tBLiveDataModel);
        ux9 ux9Var = this.mFrameContext;
        if (!(ux9Var == null || ux9Var.q() == null)) {
            this.mFrameContext.q().d(this);
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.mAvatarViewBoard.getLayoutParams();
        layoutParams.height = hw0.b(this.mContext, 46.0f);
        layoutParams.width = hw0.b(this.mContext, 46.0f);
        if (gnk.a().f(tBLiveDataModel) || !nh4.z0()) {
            this.avatarLayout.setPadding(hw0.b(this.mContext, 2.0f), hw0.b(this.mContext, 2.0f), hw0.b(this.mContext, 5.0f), hw0.b(this.mContext, 2.0f));
            this.topBarContainer.setBackgroundResource(R.drawable.taolive_topbar_bg3_flexalocal);
        } else {
            this.topBarContainer.setBackground(null);
        }
        this.mAvatarViewBoard.setLayoutParams(layoutParams);
        this.mFrameContext.h().a(this);
        adjustLayoutParams();
        updateView();
        setAvatarFrame();
        HashMap hashMap = new HashMap();
        hashMap.put("location", "live");
        hashMap.put("isRemote", String.valueOf(e9m.b()));
        v2s.o().E().track4Show("Page_TaobaoLiveWatch", "HeadPortrait", hashMap);
    }

    @Override // tb.b0d
    public void onError(int i, NetResponse netResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i), netResponse, obj});
        } else if (v2s.o().e() != null) {
            v2s.o().e().commitFail("taolive", netResponse.getApi(), netResponse.getRetCode(), netResponse.getRetMsg());
        }
    }

    @Override // tb.s3c
    public void onEvent(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3897928", new Object[]{this, str, obj});
        } else if (uyg.EVENT_MEDIAPLATFORM_CONTAINER_LOAD_FAIL.equals(str) && hideTopbar() && getComponentView() != null && getComponentView().getVisibility() == 4) {
            show();
        }
    }

    @Override // tb.b0d
    public void onSuccess(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb090915", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
        } else if (v2s.o().e() != null && netResponse != null) {
            v2s.o().e().commitSuccess("taolive", netResponse.getApi());
        }
    }

    @Override // tb.b0d
    public void onSystemError(int i, NetResponse netResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9bfdbcd9", new Object[]{this, new Integer(i), netResponse, obj});
        } else {
            onError(i, netResponse, obj);
        }
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onViewCreated(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("574a747", new Object[]{this, view});
            return;
        }
        super.onViewCreated(view);
        this.topBarContainer = (LinearLayout) view.findViewById(R.id.taolive_topbar_container);
        this.mAvatarViewBoard = (TUrlImageView) view.findViewById(R.id.taolive_avatar_view_border);
        this.flashLottieView = (LottieAnimationView) view.findViewById(R.id.taolive_flash_lottie_view);
        this.avatarLayout = (LinearLayout) view.findViewById(R.id.taolive_avatar_info_content);
        initAnchorInfoKmp();
        initOfficialLiveEntry();
        FlexaLiveX.w("TopBarFrame3: class: " + getClass().getName() + ", pluginEnv: " + e9m.b());
    }

    private boolean hideTopbar() {
        VideoInfo videoInfo;
        String[] strArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("25c4530b", new Object[]{this})).booleanValue();
        }
        TBLiveDataModel tBLiveDataModel = this.mLiveDataModel;
        if (tBLiveDataModel != null && (videoInfo = tBLiveDataModel.mVideoInfo) != null && (strArr = videoInfo.hiddenElementList) != null && strArr.length > 0) {
            int i = 0;
            while (true) {
                String[] strArr2 = videoInfo.hiddenElementList;
                if (i >= strArr2.length) {
                    break;
                } else if ("topBar".equals(strArr2[i])) {
                    return true;
                } else {
                    i++;
                }
            }
        }
        return false;
    }
}
