package com.taobao.taolive.movehighlight.screen.frame;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.schedule.ViewProxy;
import com.taobao.taobao.R;
import com.taobao.taolive.movehighlight.screen.frame.adapter.RoomPagerAdapter;
import com.taobao.taolive.movehighlight.view.ClickableViewHighlight;
import com.taobao.taolive.movehighlight.view.PassEventViewPagerHighlight;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.model.common.AccountInfo;
import com.taobao.taolive.sdk.model.common.LiveItem;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import com.taobao.taolive.sdk.model.message.MessageTypeFilter;
import com.taobao.taolive.sdk.model.message.TLiveMsg;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import tb.cpr;
import tb.cxg;
import tb.czs;
import tb.d9m;
import tb.dxa;
import tb.f3c;
import tb.fkx;
import tb.giv;
import tb.hcc;
import tb.hgb;
import tb.hjr;
import tb.iw0;
import tb.m09;
import tb.o3s;
import tb.pvs;
import tb.qoc;
import tb.qvs;
import tb.rgd;
import tb.s3c;
import tb.sjr;
import tb.t2o;
import tb.up6;
import tb.urf;
import tb.uwa;
import tb.ux9;
import tb.uyg;
import tb.v2s;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public abstract class FullScreenFrame extends BaseFrame implements View.OnClickListener, s3c {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "HighLight FullScreenFrame";
    private dxa highlightLocalAdapter;
    public View mAdView;
    public View mFrontView;
    private boolean mIsSeekBarTouching;
    private boolean mIsSpeakingStatus;
    public VideoInfo mLiveDetailData;
    public PassEventViewPagerHighlight mViewPager;
    public View mViewPagerBackground;
    public RoomPagerAdapter simpleAdapter;
    private hgb.a mAppLifeCycleListener = new a(this);
    private cpr.b mMessageListener = new b();
    public qoc mOnCustomerLongClickListener = new c();
    public boolean isClearScreen = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements hgb.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(FullScreenFrame fullScreenFrame) {
        }

        @Override // tb.hgb.a
        public void onAppInBackgroud() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1c87472c", new Object[]{this});
            } else if (hjr.o() && d9m.f() != null) {
                o3s.b(FullScreenFrame.TAG, "full screen onAppInBackgroud");
                d9m.f().onAppDidEnterBackground();
            }
        }

        @Override // tb.hgb.a
        public void onAppInForeground() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("111bbcb1", new Object[]{this});
            } else if (hjr.o() && d9m.f() != null) {
                o3s.b(FullScreenFrame.TAG, "full screen onAppInForeground");
                d9m.f().onAppWillEnterForeground();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements cpr.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // tb.gtc
        public void onMessageReceived(int i, Object obj) {
            ux9 ux9Var;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5b152aef", new Object[]{this, new Integer(i), obj});
            } else if (obj instanceof TLiveMsg) {
                TLiveMsg tLiveMsg = (TLiveMsg) obj;
                Map<String, ? extends Object> b = urf.b(fkx.d(new String(tLiveMsg.data)));
                if (hjr.d() && (ux9Var = FullScreenFrame.this.mFrameContext) != null && up6.c0(ux9Var) != null && !TextUtils.equals(up6.c0(FullScreenFrame.this.mFrameContext).topic, tLiveMsg.topic)) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("liveBizPmError", "1");
                    ux9 ux9Var2 = FullScreenFrame.this.mFrameContext;
                    if (ux9Var2 != null && ux9Var2.w() != null) {
                        FullScreenFrame.this.mFrameContext.w().b(hashMap);
                    }
                } else if (d9m.f() != null) {
                    d9m.f().didRevLivePowerMsg(i, b);
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class d implements hcc {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        public void a(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4e250475", new Object[]{this, obj});
            } else {
                FullScreenFrame.this.handleRoomCleanScreen(obj);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class e extends MessageTypeFilter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e(FullScreenFrame fullScreenFrame) {
        }

        public static /* synthetic */ Object ipc$super(e eVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/movehighlight/screen/frame/FullScreenFrame$5");
        }

        @Override // com.taobao.taolive.sdk.model.message.MessageTypeFilter
        public boolean filter(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("c81f1ee8", new Object[]{this, new Integer(i)})).booleanValue();
            }
            return true;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class f implements View.OnTouchListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ double f13098a;

        public f(double d) {
            this.f13098a = d;
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("d4aa3aa4", new Object[]{this, view, motionEvent})).booleanValue();
            }
            if (motionEvent.getY() > this.f13098a) {
                FullScreenFrame.this.mViewPager.setCanScroll(false);
            } else {
                FullScreenFrame.this.mViewPager.setCanScroll(true);
            }
            return false;
        }
    }

    static {
        t2o.a(779092693);
        t2o.a(806355016);
    }

    public FullScreenFrame(Context context, boolean z, TBLiveDataModel tBLiveDataModel, ux9 ux9Var) {
        super(context, z, tBLiveDataModel, ux9Var);
        this.highlightLocalAdapter = dxa.b(ux9Var);
    }

    public static /* synthetic */ boolean access$000(FullScreenFrame fullScreenFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b5b97141", new Object[]{fullScreenFrame})).booleanValue();
        }
        return fullScreenFrame.mIsSeekBarTouching;
    }

    public static /* synthetic */ boolean access$100(FullScreenFrame fullScreenFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ee99d1e0", new Object[]{fullScreenFrame})).booleanValue();
        }
        return fullScreenFrame.mIsSpeakingStatus;
    }

    public static /* synthetic */ void access$200(FullScreenFrame fullScreenFrame, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97b3d385", new Object[]{fullScreenFrame, str});
        } else {
            fullScreenFrame.sendChangePlayRateMsg(str);
        }
    }

    private boolean canTriggerKmpLifecycleWithConsistent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2e4f4f47", new Object[]{this})).booleanValue();
        }
        if (!qvs.u() || !hjr.o() || d9m.f() == null) {
            return false;
        }
        return true;
    }

    private boolean canTriggerKmpLifecycleWithOld() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("917b7148", new Object[]{this})).booleanValue();
        }
        if (qvs.u() || !hjr.o() || d9m.f() == null) {
            return false;
        }
        return true;
    }

    private void cleanBizManager() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d43954a", new Object[]{this});
        } else if (d9m.f() != null) {
            d9m.f().unInstall();
            d9m.a();
        }
    }

    private void initEvents() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72395e50", new Object[]{this});
        } else if (this.highlightLocalAdapter.j() != null) {
            this.highlightLocalAdapter.j().a(new d());
        }
    }

    private void initKMPBizManager(TBLiveDataModel tBLiveDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e0ea298", new Object[]{this, tBLiveDataModel});
        } else if (d9m.f() == null) {
            o3s.b(TAG, "initKMPBizManager error");
        } else {
            o3s.b(TAG, "initKMPBizManager");
            d9m.f().install("");
            d9m.f().updateLiveDetail(mapKtDetailModelWithNativeDetailModel(tBLiveDataModel));
            d9m.f().updateLiveUtManager(giv.e());
            if (this.mFrameContext.J()) {
                d9m.f().onScreenOrientationChanged(true ^ this.mLandscape);
                this.mFrameContext.j0(false);
            }
        }
    }

    private void initKMPMessageListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d07bd3e4", new Object[]{this});
            return;
        }
        ux9 ux9Var = this.mFrameContext;
        if (!(ux9Var == null || ux9Var.t() == null)) {
            this.mFrameContext.t().l(this.mMessageListener, new e(this));
        }
        v2s.o().f().a(this.mAppLifeCycleListener);
    }

    private void initPlayRateFunc(VideoInfo videoInfo) {
        LiveItem.TimeMovingPlayInfo timeMovingPlayInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82cb561e", new Object[]{this, videoInfo});
        } else if (uwa.r() && this.mViewPager != null && this.mFrameContext.f) {
            View view = this.mViewPagerBackground;
            if (view instanceof ClickableViewHighlight) {
                ((ClickableViewHighlight) view).setOnViewPagerLongClickListener(this.mOnCustomerLongClickListener);
            }
            PassEventViewPagerHighlight passEventViewPagerHighlight = this.mViewPager;
            if (passEventViewPagerHighlight != null) {
                passEventViewPagerHighlight.setOnViewPagerLongClickListener(this.mOnCustomerLongClickListener);
            }
            if (videoInfo != null && (timeMovingPlayInfo = videoInfo.timeMovingPlayInfo) != null) {
                this.mIsSpeakingStatus = timeMovingPlayInfo.isSpeaking;
            }
        }
    }

    public static /* synthetic */ Object ipc$super(FullScreenFrame fullScreenFrame, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1857981988:
                super.onDidAppear();
                return null;
            case -1801045031:
                super.onWillDisappear();
                return null;
            case -1512649357:
                super.onResume();
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case -1272916118:
                super.onDataReceived((TBLiveDataModel) objArr[0]);
                return null;
            case -1257959318:
                super.onDidDisappear();
                return null;
            case -358672098:
                super.onViewHolderWillAppear();
                return null;
            case -309961236:
                super.onCleanUp();
                return null;
            case -236809011:
                super.onWillAppear();
                return null;
            case 631938923:
                super.onViewHolderDidAppear();
                return null;
            case 797441118:
                super.onPause();
                return null;
            case 1318062568:
                super.onViewHolderWillDisappear();
                return null;
            case 1890698363:
                super.onViewHolderDidDisappear();
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/movehighlight/screen/frame/FullScreenFrame");
        }
    }

    private czs mapKtDetailModelWithNativeDetailModel(TBLiveDataModel tBLiveDataModel) {
        VideoInfo videoInfo;
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (czs) ipChange.ipc$dispatch("55e7138e", new Object[]{this, tBLiveDataModel});
        }
        czs czsVar = new czs();
        if (!(tBLiveDataModel == null || (videoInfo = tBLiveDataModel.mVideoInfo) == null)) {
            czsVar.Q(videoInfo.liveId);
            czsVar.K(up6.r(this.mFrameContext));
            czsVar.Y(tBLiveDataModel.mVideoInfo.roomStatus);
            czsVar.a0(tBLiveDataModel.mVideoInfo.topic);
            JSONObject jSONObject = tBLiveDataModel.mVideoInfo.originalData;
            czsVar.E(jSONObject.getJSONObject("broadCaster"));
            VideoInfo.OfficialLiveInfo officialLiveInfo = tBLiveDataModel.mVideoInfo.officialLiveInfo;
            if (officialLiveInfo != null) {
                czsVar.T(officialLiveInfo.officialLive);
                czsVar.V(officialLiveInfo.officialLiveTopic);
            }
            JSONArray jSONArray = jSONObject.getJSONArray("conventionList");
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < jSONArray.size(); i++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                HashMap hashMap = new HashMap();
                for (String str : jSONObject2.keySet()) {
                    hashMap.put(str, jSONObject2.getString(str));
                }
                arrayList.add(hashMap);
            }
            czsVar.I(arrayList);
            czsVar.U(jSONObject.getJSONObject("officialLiveInfo"));
            czsVar.S(tBLiveDataModel.mVideoInfo.location);
            czsVar.R(tBLiveDataModel.mVideoInfo.liveIntroduction);
            czsVar.X(tBLiveDataModel.mVideoInfo.recommendReason);
            czsVar.P(tBLiveDataModel.mVideoInfo.itemNoBeauty);
            czsVar.F(tBLiveDataModel.mVideoInfo.closeAddOneComment);
            czsVar.b0(cpr.J);
            czsVar.M(tBLiveDataModel.mVideoInfo.fetchCommentsUseLMSDK);
            czsVar.O(tBLiveDataModel.mVideoInfo.fetchCommentsUseMtop);
            czsVar.c0(tBLiveDataModel.mVideoInfo.forceCommentsUseCdn);
            if (tBLiveDataModel.mVideoInfo.commentSwitchStatus == 0) {
                z = true;
            }
            czsVar.G(z);
            czsVar.Z(tBLiveDataModel.mVideoInfo.secretUserId);
            czsVar.W(tBLiveDataModel.mVideoInfo.originalData);
            VideoInfo.AdmireInfo admireInfo = tBLiveDataModel.mVideoInfo.admireInfo;
            if (admireInfo != null) {
                czsVar.H(admireInfo.contributionEnabled);
            }
            AccountInfo accountInfo = tBLiveDataModel.mVideoInfo.broadCaster;
            if (accountInfo != null) {
                czsVar.D(accountInfo.accountId);
            }
            czsVar.W(tBLiveDataModel.mVideoInfo.originalData);
        }
        return czsVar;
    }

    private void uninstallMessageListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4a030a0", new Object[]{this});
            return;
        }
        ux9 ux9Var = this.mFrameContext;
        if (!(ux9Var == null || ux9Var.t() == null)) {
            this.mFrameContext.t().a(this.mMessageListener);
        }
        v2s.o().f().b(this.mAppLifeCycleListener);
    }

    @Override // tb.s3c
    public String bizCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("36951559", new Object[]{this});
        }
        return TAG;
    }

    public void clearComponents() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc5b844a", new Object[]{this});
        } else if (hjr.o()) {
            o3s.b(TAG, "full screen clear components");
            cleanBizManager();
            uninstallMessageListener();
        }
    }

    public View getUbeeContainer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("e01a45e7", new Object[]{this});
        }
        View view = this.mFrontView;
        if (view == null) {
            return null;
        }
        ViewStub viewStub = (ViewStub) view.findViewById(R.id.taolive_ubee_container_stub);
        if (viewStub != null) {
            viewStub.inflate();
        }
        return this.mFrontView.findViewById(R.id.taolive_ubee_container);
    }

    public void handlePlayerMoveCleanScreen(Object obj) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e166b7e", new Object[]{this, obj});
        } else if (obj instanceof Boolean) {
            PassEventViewPagerHighlight passEventViewPagerHighlight = this.mViewPager;
            if (passEventViewPagerHighlight != null) {
                if (((Boolean) obj).booleanValue()) {
                    i = 4;
                }
                passEventViewPagerHighlight.setVisibility(i);
            }
            ux9 ux9Var = this.mFrameContext;
            if (ux9Var != null && ux9Var.h() != null) {
                f3c h = this.mFrameContext.h();
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                h.e(uyg.EVENT_HIGHLIGHT_BOTTOM_CLEAN_NOTIFY, bool);
            }
        }
    }

    public void handleRoomCleanScreen(Object obj) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cc47c15", new Object[]{this, obj});
            return;
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        this.isClearScreen = booleanValue;
        PassEventViewPagerHighlight passEventViewPagerHighlight = this.mViewPager;
        if (passEventViewPagerHighlight != null) {
            if (booleanValue) {
                i = 4;
            }
            passEventViewPagerHighlight.setVisibility(i);
        }
        ux9 ux9Var = this.mFrameContext;
        if (ux9Var != null && ux9Var.h() != null) {
            this.mFrameContext.h().e(uyg.EVENT_HIGHLIGHT_BOTTOM_CLEAN_NOTIFY, Boolean.valueOf(this.isClearScreen));
        }
    }

    public void initAdapter() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bec36126", new Object[]{this});
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.mFrontView);
        this.simpleAdapter = new RoomPagerAdapter(arrayList);
    }

    public void initAll() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("183da678", new Object[]{this});
            return;
        }
        initEvents();
        initView();
        setUpView();
    }

    public abstract void initAvatarCard();

    public abstract void initClearScreen();

    public void initFrontView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db9072c5", new Object[]{this});
            return;
        }
        this.mFrontView = LayoutInflater.from(this.mContext).inflate(R.layout.taolive_video_content_highlight, (ViewGroup) null);
        if (uwa.t()) {
            ViewProxy.setOnTouchListener(this.mFrontView, new f(iw0.e(this.mContext) * uwa.I()));
        }
        this.mFrontView.setSoundEffectsEnabled(false);
    }

    public abstract void initGoodListFrame();

    public void initH5Container() {
        BaseFrame createH5DynamicSDKFrame;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cac0518b", new Object[]{this});
            return;
        }
        ViewStub viewStub = (ViewStub) this.mFrontView.findViewById(R.id.taolive_h5_container_fullscreen_stub);
        if (viewStub != null && rgd.b().a() != null && (createH5DynamicSDKFrame = rgd.b().a().createH5DynamicSDKFrame(this.mContext, this.mLandscape, this.mLiveDataModel, this.mFrameContext)) != null) {
            createH5DynamicSDKFrame.onCreateView(viewStub);
            addComponent(createH5DynamicSDKFrame);
        }
    }

    public abstract void initHighligtFrame(VideoInfo videoInfo);

    public void initMediaPlatform() {
        BaseFrame createMediaPlatformFrame;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9139264e", new Object[]{this});
        } else if (rgd.b().a() != null && (createMediaPlatformFrame = rgd.b().a().createMediaPlatformFrame(this.mContext, this.mLandscape, this.mLiveDataModel, this.mFrameContext)) != null) {
            createMediaPlatformFrame.onCreateView(null);
            addComponent(createMediaPlatformFrame);
        }
    }

    public abstract void initRoomWatermark(VideoInfo videoInfo);

    public abstract void initSubscribeCard();

    public abstract void initTBLiveXBackFrame(VideoInfo videoInfo);

    public abstract void initTopBar();

    public void initView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce529ddc", new Object[]{this});
            return;
        }
        initFrontView();
        initViewPager();
    }

    public void initViewPager() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77226e75", new Object[]{this});
            return;
        }
        PassEventViewPagerHighlight passEventViewPagerHighlight = (PassEventViewPagerHighlight) this.mContainer.findViewById(R.id.taolive_viewpager_highlight);
        this.mViewPager = passEventViewPagerHighlight;
        passEventViewPagerHighlight.setFrameContext(this.mFrameContext);
        this.mViewPagerBackground = this.mContainer.findViewById(R.id.taolive_viewpager_background_highlight);
        initAdapter();
        this.mViewPager.setAdapter(this.simpleAdapter);
        this.mViewPager.setCurrentItem(0);
        this.simpleAdapter.notifyDataSetChanged();
        initClearScreen();
    }

    @Override // tb.s3c
    public String[] observeEvents() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("37b2602b", new Object[]{this});
        }
        return new String[]{uyg.EVENT_SCREEN_ORIENTATION_CHANGED, uyg.EVENT_CLEAR_SCREEN_AND_HIDE_GOODS_ICON, uyg.EVENT_SEEK_BAR_TOUCH, uyg.EVENT_HIGHLIGHT_SWITCH_PLAY_RATE};
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
        sjr.g().b(this);
        if (hjr.o()) {
            o3s.b(TAG, "full screen clean up");
            cleanBizManager();
            uninstallMessageListener();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
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
        sjr.g().a(this);
        if (hjr.o()) {
            m09.e().j();
            o3s.b(TAG, "full screen data received");
            initKMPBizManager(tBLiveDataModel);
            initKMPMessageListener();
        }
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        PassEventViewPagerHighlight passEventViewPagerHighlight = this.mViewPager;
        if (passEventViewPagerHighlight != null) {
            passEventViewPagerHighlight.setAdapter(null);
            this.mViewPager = null;
        }
        RoomPagerAdapter roomPagerAdapter = this.simpleAdapter;
        if (roomPagerAdapter != null) {
            roomPagerAdapter.h();
            this.simpleAdapter = null;
        }
        sjr.g().b(this);
        clearComponents();
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onDidAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("914171dc", new Object[]{this});
            return;
        }
        super.onDidAppear();
        if (canTriggerKmpLifecycleWithOld() && d9m.f() != null) {
            o3s.b(TAG, "full screen did appear");
            d9m.f().viewDidAppear();
        }
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onDidDisappear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b505106a", new Object[]{this});
            return;
        }
        o3s.b(TAG, "full screen did disappear");
        if (canTriggerKmpLifecycleWithOld() && d9m.f() != null) {
            o3s.b(TAG, "full screen trigger kmp did disappear");
            d9m.f().viewDidDisappear();
        }
        super.onDidDisappear();
    }

    @Override // tb.s3c
    public void onEvent(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3897928", new Object[]{this, str, obj});
        } else if (uyg.EVENT_SCREEN_ORIENTATION_CHANGED.equals(str)) {
            if ((obj instanceof String) && hjr.o()) {
                this.mFrameContext.j0(true);
            }
        } else if (uyg.EVENT_CLEAR_SCREEN_AND_HIDE_GOODS_ICON.equals(str)) {
            if (!this.isClearScreen) {
                handlePlayerMoveCleanScreen(obj);
            }
        } else if (TextUtils.equals(str, uyg.EVENT_SEEK_BAR_TOUCH)) {
            if (obj instanceof Boolean) {
                this.mIsSeekBarTouching = ((Boolean) obj).booleanValue();
            }
        } else if (TextUtils.equals(str, uyg.EVENT_HIGHLIGHT_SWITCH_PLAY_RATE) && (obj instanceof Boolean)) {
            this.mIsSpeakingStatus = ((Boolean) obj).booleanValue();
        }
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        super.onPause();
        if (hjr.o() && d9m.f() != null) {
            o3s.b(TAG, "full screen onPause");
            d9m.f().viewWillDisappear();
            d9m.f().viewDidDisappear();
        }
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        if (hjr.o() && d9m.f() != null) {
            o3s.b(TAG, "full screen onResume");
            d9m.f().viewWillAppear();
            d9m.f().viewDidAppear();
        }
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.taolive.sdk.controller.IComponentLifeCycle2
    public void onViewHolderDidAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25aa9f6b", new Object[]{this});
            return;
        }
        super.onViewHolderDidAppear();
        if (canTriggerKmpLifecycleWithConsistent() && d9m.f() != null) {
            o3s.b(TAG, "full screen onViewHolderDidAppear");
            d9m.f().viewDidAppear();
        }
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.taolive.sdk.controller.IComponentLifeCycle2
    public void onViewHolderDidDisappear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70b1c47b", new Object[]{this});
            return;
        }
        super.onViewHolderDidDisappear();
        if (canTriggerKmpLifecycleWithConsistent() && d9m.f() != null) {
            o3s.b(TAG, "full screen onViewHolderDidDisappear");
            d9m.f().viewDidDisappear();
        }
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.taolive.sdk.controller.IComponentLifeCycle2
    public void onViewHolderWillAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea9f191e", new Object[]{this});
            return;
        }
        super.onViewHolderWillAppear();
        if (canTriggerKmpLifecycleWithConsistent() && d9m.f() != null) {
            o3s.b(TAG, "full screen onViewHolderWillAppear");
            d9m.f().viewWillAppear();
        }
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.taolive.sdk.controller.IComponentLifeCycle2
    public void onViewHolderWillDisappear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e9009e8", new Object[]{this});
            return;
        }
        super.onViewHolderWillDisappear();
        if (canTriggerKmpLifecycleWithConsistent() && d9m.f() != null) {
            o3s.b(TAG, "full screen onViewHolderWillDisappear");
            d9m.f().viewWillDisappear();
        }
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onWillAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1e294cd", new Object[]{this});
            return;
        }
        super.onWillAppear();
        if (canTriggerKmpLifecycleWithOld() && d9m.f() != null) {
            o3s.b(TAG, "full screen will appear");
            d9m.f().viewWillAppear();
        }
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onWillDisappear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94a63bd9", new Object[]{this});
            return;
        }
        super.onWillDisappear();
        if (canTriggerKmpLifecycleWithOld() && d9m.f() != null) {
            o3s.b(TAG, "full screen will disappear");
            d9m.f().viewWillDisappear();
        }
    }

    public void setBackView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f84967d", new Object[]{this, view});
            return;
        }
        PassEventViewPagerHighlight passEventViewPagerHighlight = this.mViewPager;
        if (passEventViewPagerHighlight != null) {
            passEventViewPagerHighlight.setBackView(view);
        }
    }

    public void setUpView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eaf59269", new Object[]{this});
            return;
        }
        VideoInfo e2 = cxg.e(this.mLiveDataModel);
        if (e2 != null && e2.broadCaster != null) {
            this.mLiveDetailData = e2;
            initHighligtFrame(e2);
            initRoomWatermark(e2);
            initTopBar();
            initGoodListFrame();
            initAvatarCard();
            initSubscribeCard();
            initTBLiveXBackFrame(e2);
            showHighlightGuide(e2);
            if (pvs.l0()) {
                initMediaPlatform();
                initH5Container();
            }
            initPlayRateFunc(e2);
        }
    }

    public abstract void showHighlightGuide(VideoInfo videoInfo);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class c implements qoc {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // tb.qoc
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("70b73f2e", new Object[]{this});
                return;
            }
            ux9 ux9Var = FullScreenFrame.this.mFrameContext;
            if (ux9Var != null && ux9Var.x() != null) {
                float t = FullScreenFrame.this.mFrameContext.x().t();
                o3s.b(FullScreenFrame.TAG, "长按事件取消，恢复正常速度 或者 之前记录的速度播放，playRate = " + t);
                FullScreenFrame.access$200(FullScreenFrame.this, String.valueOf(t));
            }
        }

        @Override // tb.qoc
        public boolean a(View view, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5c99319a", new Object[]{this, view, new Boolean(z)})).booleanValue();
            }
            if (FullScreenFrame.access$000(FullScreenFrame.this) || FullScreenFrame.access$100(FullScreenFrame.this)) {
                o3s.b(FullScreenFrame.TAG, "长按事件阻断，进度条正在拖动中");
                return false;
            }
            ux9 ux9Var = FullScreenFrame.this.mFrameContext;
            if (!(ux9Var == null || ux9Var.x() == null)) {
                boolean isPlaying = FullScreenFrame.this.mFrameContext.x().isPlaying();
                if (z && isPlaying) {
                    o3s.b(FullScreenFrame.TAG, "长按事件触发倍速播放中");
                    if (giv.f() != null) {
                        giv.f().m(FullScreenFrame.this.mFrameContext, "timemove_fastforward", new HashMap());
                    }
                    FullScreenFrame.access$200(FullScreenFrame.this, "2");
                }
            }
            return true;
        }
    }

    private void sendChangePlayRateMsg(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("410bcd06", new Object[]{this, str});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("type", str);
        hashMap.put("needRecord", String.valueOf(false));
        sjr.g().c(uyg.EVENT_PLAY_RATE_CHANGED, hashMap, this.mFrameContext.C());
    }
}
