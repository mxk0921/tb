package com.taobao.taolive.sdk.playcontrol.card;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx.widget.DXWidgetRefreshOption;
import com.taobao.live.timemove.base.data.RecModel;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import com.taobao.tao.log.TLog;
import com.taobao.taolive.room.player.standard.window.NormalLiveRoomWindowImpl;
import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import com.taobao.taolive.sdk.ui.media.MediaData;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import com.taobao.uikit.feature.features.AbsFeature;
import com.uc.webview.export.media.MessageID;
import tb.b5v;
import tb.bjr;
import tb.cit;
import tb.cjr;
import tb.ejr;
import tb.jw0;
import tb.mxg;
import tb.pvs;
import tb.qlr;
import tb.rlr;
import tb.ryp;
import tb.s8d;
import tb.shi;
import tb.slr;
import tb.t2o;
import tb.twg;
import tb.vfp;
import tb.y83;
import tb.zqq;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class TBLiveMediaCardView extends RelativeLayout implements twg.b, rlr {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int LIVE_STATUS_KANDIAN = 1;
    private static final int LIVE_STATUS_LIVE = 0;
    private static final int LIVE_STATUS_VIDEO = 2;
    private static final String TAG = "TBLiveOpenCardView";
    private static boolean isLiveInit = false;
    private int mAnimateTime;
    private qlr mCallback;
    private y83 mCardPlayPerformanceTracker;
    private TUrlImageView mCover;
    private d mCoverImageSuccessCallBack;
    private DinamicXEngine mDinamicXEngine;
    private String mLifeCycleSyncViewUserIds;
    private twg mLiveCardPlayer;
    private DXWidgetNode mParentRootView;
    private String mPlayUrl;
    private boolean mPlayVideo;
    private rlr mPlayerCallback;
    private JSONObject mPlayerDataJSON;
    private RelativeLayout mRootView;
    private FrameLayout mVideoContainer;
    private TUrlImageView mVideoPlaceHolder;
    private int mLiveStatus = 0;
    private boolean mIsLiveVideo = true;
    private boolean mIsPlaying = false;
    private boolean mVideoLoop = true;
    private boolean mEnableConsumePlayer = false;
    private boolean mEnableCoverFade = false;
    public boolean closeSkipPlaySwitch = false;
    private boolean mEnableKeepLastFrame = false;
    private Object mPageID = "unKnownPage";
    private String mSubBusinessType = "homepageLiveCard";
    private boolean isMute = true;
    private boolean isPlayerWarm = false;
    private boolean isPlayerWarmUsed = false;
    private boolean isPlayerWarmSucc = false;
    private int mPlayDuration = 0;
    private String mViewId = b5v.a();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class SpfPlayVideo implements INetDataObject {
        public String playInfo;
        public String videoType;

        static {
            t2o.a(779093474);
            t2o.a(806355930);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements s8d<SuccPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        /* renamed from: a */
        public boolean onHappen(SuccPhenixEvent succPhenixEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("362cccf4", new Object[]{this, succPhenixEvent})).booleanValue();
            }
            if (TBLiveMediaCardView.access$000(TBLiveMediaCardView.this) != null) {
                TBLiveMediaCardView.access$000(TBLiveMediaCardView.this).onSuccess();
            }
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (TBLiveMediaCardView.access$100(TBLiveMediaCardView.this)) {
                TBLiveMediaCardView.access$200(TBLiveMediaCardView.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class c implements Animation.AnimationListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("724c33d", new Object[]{this, animation});
            } else if (TBLiveMediaCardView.access$100(TBLiveMediaCardView.this)) {
                if (TBLiveMediaCardView.access$300(TBLiveMediaCardView.this) != null) {
                    TBLiveMediaCardView.access$300(TBLiveMediaCardView.this).setAlpha(1.0f);
                }
                TBLiveMediaCardView.access$200(TBLiveMediaCardView.this);
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8f2883e7", new Object[]{this, animation});
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f2d146c4", new Object[]{this, animation});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface d {
        void onSuccess();
    }

    static {
        t2o.a(779093469);
        t2o.a(779093672);
        t2o.a(806356528);
    }

    public TBLiveMediaCardView(Context context) {
        super(context);
        initView(context);
        initLive();
    }

    public static /* synthetic */ d access$000(TBLiveMediaCardView tBLiveMediaCardView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("fc19b2ba", new Object[]{tBLiveMediaCardView});
        }
        return tBLiveMediaCardView.mCoverImageSuccessCallBack;
    }

    public static /* synthetic */ boolean access$100(TBLiveMediaCardView tBLiveMediaCardView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("618baa3e", new Object[]{tBLiveMediaCardView})).booleanValue();
        }
        return tBLiveMediaCardView.mIsPlaying;
    }

    public static /* synthetic */ void access$200(TBLiveMediaCardView tBLiveMediaCardView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fdf9a699", new Object[]{tBLiveMediaCardView});
        } else {
            tBLiveMediaCardView.dismissImgView();
        }
    }

    public static /* synthetic */ TUrlImageView access$300(TBLiveMediaCardView tBLiveMediaCardView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TUrlImageView) ipChange.ipc$dispatch("35f6e04", new Object[]{tBLiveMediaCardView});
        }
        return tBLiveMediaCardView.mCover;
    }

    private cjr boxPlayData(cjr cjrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cjr) ipChange.ipc$dispatch("975e3d88", new Object[]{this, cjrVar});
        }
        cjrVar.b = this.mPlayUrl;
        if (!this.mIsLiveVideo) {
            cjrVar.h = this.mVideoLoop;
        }
        cjrVar.f = this.mPlayDuration;
        cjrVar.j = this.mEnableConsumePlayer;
        cjrVar.g = this.mSubBusinessType;
        return cjrVar;
    }

    private void callError(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d5a2b52", new Object[]{this, new Integer(i)});
            return;
        }
        log("callError errParseData = " + i);
        qlr qlrVar = this.mCallback;
        if (qlrVar != null) {
            qlrVar.onError(i);
        }
    }

    private void callEvent(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76801600", new Object[]{this, new Integer(i)});
            return;
        }
        qlr qlrVar = this.mCallback;
        if (qlrVar != null) {
            qlrVar.onInfo(i);
        }
    }

    private void delayDismissCover() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d2b64f7", new Object[]{this});
        } else {
            this.mCover.postDelayed(new b(), 300L);
        }
    }

    private void dismissImgView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e5048a5", new Object[]{this});
            return;
        }
        log("dismissImgView");
        TUrlImageView tUrlImageView = this.mCover;
        if (tUrlImageView != null) {
            tUrlImageView.setVisibility(4);
        }
    }

    private void initLive() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db8b98a3", new Object[]{this});
            return;
        }
        if (!pvs.V1() && !isLiveInit) {
            log("initLive");
            com.android.tools.ir.runtime.a.a("com.taobao.taolive", null);
            isLiveInit = true;
        }
        this.mCardPlayPerformanceTracker = new y83();
    }

    private void initView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f359fd6c", new Object[]{this, context});
            return;
        }
        RelativeLayout relativeLayout = new RelativeLayout(context);
        this.mRootView = relativeLayout;
        relativeLayout.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        this.mVideoPlaceHolder = new TUrlImageView(context);
        this.mVideoPlaceHolder.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        this.mVideoPlaceHolder.setScaleType(ImageView.ScaleType.CENTER_CROP);
        this.mVideoPlaceHolder.setVisibility(8);
        this.mVideoContainer = new FrameLayout(context);
        this.mVideoContainer.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        this.mCover = new TUrlImageView(context);
        this.mCover.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(9, -1);
        layoutParams.addRule(12, -1);
        layoutParams.leftMargin = jw0.b(context, 8.0f);
        layoutParams.rightMargin = jw0.b(context, 8.0f);
        this.mRootView.addView(this.mVideoPlaceHolder);
        this.mRootView.addView(this.mVideoContainer);
        this.mRootView.addView(this.mCover);
        addView(this.mRootView);
    }

    public static /* synthetic */ Object ipc$super(TBLiveMediaCardView tBLiveMediaCardView, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/sdk/playcontrol/card/TBLiveMediaCardView");
    }

    private void liveStartBroadcast() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e759c992", new Object[]{this});
            return;
        }
        Intent intent = new Intent(NormalLiveRoomWindowImpl.ON_LIVE_CARD_START_ACTION);
        intent.putExtra("isMute", isMute());
        intent.putExtra("SubBusinessType", this.mSubBusinessType);
        if (getContext() != null) {
            getContext().sendBroadcast(intent);
        }
    }

    private void log(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9dd52d5", new Object[]{this, str});
            return;
        }
        TLog.loge(TAG, this.mViewId + " " + str);
    }

    private MediaData parseLiveMediaData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MediaData) ipChange.ipc$dispatch("c5e9d056", new Object[]{this});
        }
        return mxg.a(this.mPlayerDataJSON.getJSONObject("queryParams"));
    }

    private void setPlayModel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c960d51a", new Object[]{this});
            return;
        }
        y83 y83Var = this.mCardPlayPerformanceTracker;
        if (y83Var == null) {
            return;
        }
        if (this.isPlayerWarmSucc) {
            y83Var.i("warmuped");
        } else if (this.isPlayerWarm) {
            y83Var.i("warmuping");
        } else {
            y83Var.i("defaultInit");
        }
    }

    private void startCoverViewFadeAnimation() {
        long j;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8e71355", new Object[]{this});
            return;
        }
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        int i = this.mAnimateTime;
        if (i > 0) {
            j = i;
        } else {
            j = 300;
        }
        alphaAnimation.setDuration(j);
        alphaAnimation.setAnimationListener(new c());
        TUrlImageView tUrlImageView = this.mCover;
        if (tUrlImageView != null) {
            tUrlImageView.startAnimation(alphaAnimation);
        }
    }

    private void startPlayer(cjr cjrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d82291a", new Object[]{this, cjrVar});
            return;
        }
        if (!this.isPlayerWarm) {
            stopPlayer(false);
            twg twgVar = new twg(getContext());
            this.mLiveCardPlayer = twgVar;
            twgVar.v(this);
            this.mLiveCardPlayer.t(this);
            this.mLiveCardPlayer.s(cjrVar);
            this.mLiveCardPlayer.i(this.mVideoContainer);
        } else {
            slr.a().b(this.mPageID, false);
            this.isPlayerWarmUsed = true;
        }
        setPlayModel();
        this.mLiveCardPlayer.x();
        this.mLiveCardPlayer.u(this.isMute);
        y83 y83Var = this.mCardPlayPerformanceTracker;
        if (y83Var != null) {
            y83Var.o();
        }
        bjr.d().b(this.mPageID, this.mLiveCardPlayer);
        callEvent(100006);
    }

    private void stopPlayer(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61b38a", new Object[]{this, new Boolean(z)});
            return;
        }
        y83 y83Var = this.mCardPlayPerformanceTracker;
        if (y83Var != null) {
            y83Var.c(this.isPlayerWarmUsed);
            this.mCardPlayPerformanceTracker.p();
        }
        twg twgVar = this.mLiveCardPlayer;
        if (twgVar != null) {
            twgVar.y(z);
            bjr.d().f(this.mPageID, this.mLiveCardPlayer);
            this.mLiveCardPlayer = null;
        }
        if (this.isPlayerWarm) {
            slr.a().b(this.mPageID, false);
        }
        this.isPlayerWarm = false;
        this.isPlayerWarmUsed = false;
        this.isPlayerWarmSucc = false;
    }

    public boolean addFeature(AbsFeature<? super ImageView> absFeature) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2aa4ab52", new Object[]{this, absFeature})).booleanValue();
        }
        TUrlImageView tUrlImageView = this.mCover;
        if (tUrlImageView != null) {
            return tUrlImageView.addFeature(absFeature);
        }
        return false;
    }

    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        log("destroy");
        stopVideo(true);
    }

    public AbsFeature<? super ImageView> findFeature(Class<? extends AbsFeature<? super ImageView>> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AbsFeature) ipChange.ipc$dispatch("67a9db6f", new Object[]{this, cls});
        }
        TUrlImageView tUrlImageView = this.mCover;
        if (tUrlImageView != null) {
            return tUrlImageView.findFeature(cls);
        }
        return null;
    }

    public y83 getCardPlayPerformanceTracker() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (y83) ipChange.ipc$dispatch("6d785199", new Object[]{this});
        }
        return this.mCardPlayPerformanceTracker;
    }

    public TUrlImageView getCover() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TUrlImageView) ipChange.ipc$dispatch("e99e40f4", new Object[]{this});
        }
        return this.mCover;
    }

    public Bitmap getCurrentFrame() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("900dd4f", new Object[]{this});
        }
        twg twgVar = this.mLiveCardPlayer;
        if (twgVar != null) {
            return twgVar.k();
        }
        return null;
    }

    public ViewGroup getPlayerRootView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("2bcf1150", new Object[]{this});
        }
        twg twgVar = this.mLiveCardPlayer;
        if (twgVar != null) {
            return twgVar.p();
        }
        return null;
    }

    public String getPlayerSession() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aa9b7f9a", new Object[]{this});
        }
        twg twgVar = this.mLiveCardPlayer;
        if (twgVar != null) {
            return twgVar.l();
        }
        return null;
    }

    public String getPlayerToken() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("41c2c5d7", new Object[]{this});
        }
        twg twgVar = this.mLiveCardPlayer;
        if (twgVar != null) {
            return twgVar.m();
        }
        return null;
    }

    public String getRecycleToken() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b7687add", new Object[]{this});
        }
        twg twgVar = this.mLiveCardPlayer;
        if (twgVar != null) {
            return twgVar.o();
        }
        return null;
    }

    public boolean isMute() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("467c96e", new Object[]{this})).booleanValue();
        }
        twg twgVar = this.mLiveCardPlayer;
        if (twgVar != null) {
            return twgVar.q();
        }
        return this.isMute;
    }

    public boolean isPlayVideo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c1b529a8", new Object[]{this})).booleanValue();
        }
        return this.mPlayVideo;
    }

    public boolean isPlaying() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9a3f2a2f", new Object[]{this})).booleanValue();
        }
        return this.mIsPlaying;
    }

    @Override // tb.twg.b
    public void onClear(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("989a503f", new Object[]{this, new Boolean(z)});
            return;
        }
        log("onClear");
        stopVideo(z);
    }

    @Override // tb.twg.b
    public void onFirstFrame() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99e6aa63", new Object[]{this});
            return;
        }
        log("onFirstFrame");
        if (this.mCover != null) {
            if (this.mEnableCoverFade) {
                startCoverViewFadeAnimation();
            } else {
                delayDismissCover();
            }
        }
        y83 y83Var = this.mCardPlayPerformanceTracker;
        if (y83Var != null) {
            twg twgVar = this.mLiveCardPlayer;
            if (twgVar != null) {
                y83Var.k(twgVar.m());
                this.mCardPlayPerformanceTracker.m(shi.a(this.mLiveCardPlayer.n()));
            }
            this.mCardPlayPerformanceTracker.a();
        }
        callEvent(cit.ERROR_TEMPLATE_INIT_FAILED);
    }

    @Override // tb.twg.b
    public void onInstallReadyRetry() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68affaa8", new Object[]{this});
        } else {
            log("onInstallReadyRetry");
        }
    }

    @Override // tb.twg.b
    public void onNotInstallPlayError() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("638f1674", new Object[]{this});
        } else {
            log("onNotInstallPlayError");
        }
    }

    @Override // tb.twg.b
    public void onPrepared() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc853dc3", new Object[]{this});
            return;
        }
        log(MessageID.onPrepared);
        callEvent(100007);
    }

    @Override // tb.twg.b
    public void onRetry() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2145010", new Object[]{this});
            return;
        }
        log("onRetry");
        callEvent(100001);
    }

    public void pageAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e933178b", new Object[]{this});
            return;
        }
        y83 y83Var = this.mCardPlayPerformanceTracker;
        if (y83Var != null) {
            y83Var.b();
        }
    }

    public void pageDisappear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6c4d85b", new Object[]{this});
        }
    }

    public void refreshTemplateView(DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("703b550e", new Object[]{this, dXWidgetNode});
        } else if (dXWidgetNode != null) {
            this.mDinamicXEngine.I0(dXWidgetNode, 0, new DXWidgetRefreshOption.a().c(1).d(true).g(false).a());
        }
    }

    public void setAnimateTime(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cbd97b50", new Object[]{this, new Integer(i)});
        } else {
            this.mAnimateTime = i;
        }
    }

    public void setCloseSkipPlaySwitch(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddf5290", new Object[]{this, new Boolean(z)});
        } else {
            this.closeSkipPlaySwitch = z;
        }
    }

    public void setColorFilter(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca662803", new Object[]{this, new Integer(i)});
            return;
        }
        TUrlImageView tUrlImageView = this.mCover;
        if (tUrlImageView != null) {
            tUrlImageView.setColorFilter(i);
        }
    }

    @Deprecated
    public void setCornerRadius(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9823bd90", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        }
    }

    public void setCoverImageSuccessCallBack(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fc13068", new Object[]{this, dVar});
        } else {
            this.mCoverImageSuccessCallBack = dVar;
        }
    }

    public void setEnableConsumePlayer(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de9960b5", new Object[]{this, new Boolean(z)});
        } else {
            this.mEnableConsumePlayer = z;
        }
    }

    public void setEnableCoverFade(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be301c1f", new Object[]{this, new Boolean(z)});
        } else {
            this.mEnableCoverFade = z;
        }
    }

    public void setEnableKeepLastFrame(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b948960", new Object[]{this, new Boolean(z)});
        } else {
            this.mEnableKeepLastFrame = z;
        }
    }

    public void setEnableReport(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6bc620b4", new Object[]{this, new Boolean(z)});
            return;
        }
        y83 y83Var = this.mCardPlayPerformanceTracker;
        if (y83Var != null) {
            y83Var.h(z);
        }
    }

    @Deprecated
    public void setImageResource(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5ebca75", new Object[]{this, new Integer(i)});
        }
    }

    public void setImageUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cec106a7", new Object[]{this, str});
            return;
        }
        TUrlImageView tUrlImageView = this.mCover;
        if (tUrlImageView != null) {
            tUrlImageView.setImageUrl(str);
            this.mCover.succListener(new a());
        }
    }

    public void setMuted(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810efea4", new Object[]{this, new Boolean(z)});
            return;
        }
        this.isMute = z;
        twg twgVar = this.mLiveCardPlayer;
        if (twgVar != null) {
            twgVar.u(z);
        }
    }

    public void setPageId(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0994aaf", new Object[]{this, obj});
        } else {
            this.mPageID = obj;
        }
    }

    public void setPlaceHoldImageResId(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cdf7958", new Object[]{this, new Integer(i)});
            return;
        }
        TUrlImageView tUrlImageView = this.mCover;
        if (tUrlImageView != null) {
            tUrlImageView.setPlaceHoldImageResId(i);
        }
    }

    public void setPlayDuration(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5c89b32", new Object[]{this, new Integer(i)});
        } else {
            this.mPlayDuration = i;
        }
    }

    public void setPlayUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14dab0aa", new Object[]{this, str});
        } else {
            this.mPlayUrl = str;
        }
    }

    public void setPlayVideo(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84d36ae8", new Object[]{this, new Boolean(z)});
        } else {
            this.mPlayVideo = z;
        }
    }

    public void setPlayerCover(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1d31c7e", new Object[]{this, str, new Integer(i)});
            return;
        }
        twg twgVar = this.mLiveCardPlayer;
        if (twgVar != null) {
            twgVar.w(str, i);
        }
    }

    public void setPlayerData(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f30ff3c", new Object[]{this, jSONObject});
            return;
        }
        this.mPlayerDataJSON = jSONObject;
        if (jSONObject.getJSONObject("queryParams") == null && this.mPlayerDataJSON.getJSONObject("queryParam") != null) {
            JSONObject jSONObject2 = this.mPlayerDataJSON;
            jSONObject2.put("queryParams", (Object) jSONObject2.getJSONObject("queryParam"));
        }
    }

    public void setScaleType(ImageView.ScaleType scaleType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("732a5c3", new Object[]{this, scaleType});
            return;
        }
        TUrlImageView tUrlImageView = this.mCover;
        if (tUrlImageView != null) {
            tUrlImageView.setScaleType(scaleType);
        }
    }

    public void setSubBusinessType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66c26149", new Object[]{this, str});
        } else {
            this.mSubBusinessType = str;
        }
    }

    public void setVideoLoop(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("127f99d0", new Object[]{this, new Boolean(z)});
        } else {
            this.mVideoLoop = z;
        }
    }

    public void setViewInfoLifeCycleSyncOpenCard(DinamicXEngine dinamicXEngine, DXWidgetNode dXWidgetNode, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70be9097", new Object[]{this, dinamicXEngine, dXWidgetNode, str});
            return;
        }
        this.mDinamicXEngine = dinamicXEngine;
        this.mParentRootView = dXWidgetNode;
        this.mLifeCycleSyncViewUserIds = str;
    }

    public void stopVideo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d778dda0", new Object[]{this});
        } else {
            stopVideo(true);
        }
    }

    public void warmVideo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e127767d", new Object[]{this});
            return;
        }
        log("warmVideo mPlayVideo = " + this.mPlayVideo);
        if (!this.mPlayVideo || this.mVideoContainer == null || getContext() == null) {
            log("warmVideo cannot play");
            return;
        }
        cjr parsePlayData = parsePlayData();
        if (parsePlayData == null) {
            callError(-90001);
            return;
        }
        boxPlayData(parsePlayData);
        warmPlayer(parsePlayData);
    }

    private void recoverImgView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ba3618b", new Object[]{this});
            return;
        }
        log("recoverImgView");
        TUrlImageView tUrlImageView = this.mCover;
        if (tUrlImageView != null) {
            tUrlImageView.setVisibility(0);
        }
        TUrlImageView tUrlImageView2 = this.mVideoPlaceHolder;
        if (tUrlImageView2 != null) {
            tUrlImageView2.setVisibility(8);
        }
    }

    private void stopVideo(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17a38934", new Object[]{this, new Boolean(z)});
            return;
        }
        log("stopVideo");
        stopPlayer(z);
        recoverImgView();
        this.mIsPlaying = false;
        refreshComponentViews(false);
    }

    private void warmPlayer(cjr cjrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55b15dd7", new Object[]{this, cjrVar});
            return;
        }
        twg twgVar = new twg(getContext());
        this.mLiveCardPlayer = twgVar;
        twgVar.v(this);
        this.mLiveCardPlayer.t(this);
        this.mLiveCardPlayer.s(cjrVar);
        this.mLiveCardPlayer.i(this.mVideoContainer);
        if (!slr.a().c(this.mPageID)) {
            this.mLiveCardPlayer.z();
            this.isPlayerWarm = true;
            log("warmup");
            slr.a().b(this.mPageID, true);
        }
    }

    @Override // tb.twg.b
    public void onComplete() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cbffcbf", new Object[]{this});
            return;
        }
        log("onComplete");
        stopVideo(false);
        callEvent(100003);
    }

    @Override // tb.twg.b
    public void onError(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25ce1193", new Object[]{this, new Integer(i)});
            return;
        }
        log("onError errCode = " + i);
        callError(i);
        stopVideo(false);
    }

    @Override // tb.rlr
    public void onMediaError(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42ee0aa", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        log("onError what = " + i);
        rlr rlrVar = this.mPlayerCallback;
        if (rlrVar != null) {
            rlrVar.onMediaError(i, i2);
        }
        stopVideo(false);
    }

    @Override // tb.twg.b
    public void onRevoked() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbb850c6", new Object[]{this});
            return;
        }
        log("onRevoked");
        stopVideo(false);
        callEvent(100002);
    }

    private cjr parsePlayData() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cjr) ipChange.ipc$dispatch("7892e10c", new Object[]{this});
        }
        cjr cjrVar = new cjr();
        if (this.mPlayerDataJSON == null) {
            log("parsePlayData mPlayerDataJSON == null");
            return null;
        }
        if (ejr.k()) {
            if (this.mPlayerDataJSON.containsKey("videoInfoType") && "video".equals(this.mPlayerDataJSON.getString("videoInfoType"))) {
                this.mIsLiveVideo = false;
                this.mLiveStatus = 2;
            } else if (!this.mPlayerDataJSON.containsKey("isTimeMove") || !zqq.c(this.mPlayerDataJSON.getString("isTimeMove"))) {
                this.mIsLiveVideo = true;
                this.mLiveStatus = 0;
            } else {
                this.mIsLiveVideo = false;
                this.mLiveStatus = 1;
            }
        } else if (this.mPlayerDataJSON.containsKey("isTimeMove")) {
            this.mIsLiveVideo = !zqq.c(this.mPlayerDataJSON.getString("isTimeMove"));
        } else {
            this.mIsLiveVideo = true;
        }
        log("parsePlayData mIsLiveVideo = " + this.mIsLiveVideo);
        y83 y83Var = this.mCardPlayPerformanceTracker;
        if (y83Var != null) {
            if (this.mIsLiveVideo) {
                str = "live";
            } else {
                str = RecModel.MEDIA_TYPE_TIMEMOVE;
            }
            y83Var.n(str);
        }
        cjrVar.f17104a = this.mIsLiveVideo;
        if (this.mPlayerDataJSON.getJSONObject("queryParams") != null) {
            this.mPlayerDataJSON.getJSONObject("queryParams").getString("feedId");
        }
        cjrVar.i = this.mPlayerDataJSON.getString("liveConfigForStream");
        if (!parseMediaData(cjrVar)) {
            return null;
        }
        return cjrVar;
    }

    @Override // tb.twg.b
    public void onReuse() {
        twg twgVar;
        Bitmap k;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7958ddc", new Object[]{this});
            return;
        }
        log("onReuse");
        if (!ejr.l() || !this.mEnableKeepLastFrame || (twgVar = this.mLiveCardPlayer) == null || (k = twgVar.k()) == null) {
            stopVideo(false);
        } else {
            BitmapDrawable bitmapDrawable = new BitmapDrawable(getResources(), k);
            this.mVideoPlaceHolder.setVisibility(0);
            this.mVideoPlaceHolder.setImageDrawable(bitmapDrawable);
            stopPlayer(true);
            this.mIsPlaying = false;
        }
        callEvent(100004);
    }

    public boolean playVideo(qlr qlrVar, rlr rlrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("28601df1", new Object[]{this, qlrVar, rlrVar})).booleanValue();
        }
        log("playVideo mPlayVideo = " + this.mPlayVideo);
        if (!this.mPlayVideo || this.mVideoContainer == null || getContext() == null) {
            log("playVideo cannot play");
            return false;
        } else if (vfp.a(getContext()) || this.closeSkipPlaySwitch) {
            this.mCallback = qlrVar;
            this.mPlayerCallback = rlrVar;
            cjr parsePlayData = parsePlayData();
            if (parsePlayData == null) {
                callError(-90001);
                return false;
            }
            boxPlayData(parsePlayData);
            startPlayer(parsePlayData);
            this.mIsPlaying = true;
            liveStartBroadcast();
            refreshComponentViews(true);
            return true;
        } else {
            log("playVideo cannot play");
            return false;
        }
    }

    public void refreshComponentViews(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7649f381", new Object[]{this, new Boolean(z)});
        } else if (this.mDinamicXEngine != null && this.mParentRootView != null && !zqq.a(this.mLifeCycleSyncViewUserIds)) {
            String[] split = this.mLifeCycleSyncViewUserIds.split(",");
            if (split.length > 0) {
                try {
                    for (String str : split) {
                        if (!zqq.a(str)) {
                            DXWidgetNode queryWidgetNodeByUserId = this.mParentRootView.queryWidgetNodeByUserId(str);
                            JSONObject i = this.mParentRootView.getDXRuntimeContext().i();
                            if (i != null && ((i.getBoolean("hidden") == null && z) || !(i.getBoolean("hidden") == null || i.getBoolean("hidden").booleanValue() == z))) {
                                this.mParentRootView.getDXRuntimeContext().i().put("hidden", (Object) Boolean.valueOf(z));
                                refreshTemplateView(queryWidgetNodeByUserId);
                            }
                        }
                    }
                } catch (Exception e) {
                    TLog.loge(TAG, "refreshComponentViews：" + e.getMessage());
                }
            }
        }
    }

    private boolean parseMediaData(cjr cjrVar) {
        String str;
        String str2;
        JSONObject jSONObject;
        SpfPlayVideo spfPlayVideo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ca9b3fc6", new Object[]{this, cjrVar})).booleanValue();
        }
        MediaData mediaData = null;
        if (this.mIsLiveVideo) {
            if (!this.mPlayerDataJSON.containsKey("queryParams")) {
                str2 = null;
            } else if (this.mPlayerDataJSON.getIntValue("roomStatus") != zqq.g("1", 1)) {
                return false;
            } else {
                MediaData parseLiveMediaData = parseLiveMediaData();
                log("parseMediaData mIsLiveVideo = " + this.mIsLiveVideo + "mediaInfo = " + parseLiveMediaData);
                if (parseLiveMediaData == null) {
                    return false;
                }
                str2 = null;
                mediaData = parseLiveMediaData;
            }
            str = str2;
        } else {
            if (!ejr.k() || this.mLiveStatus != 2) {
                JSONObject jSONObject2 = this.mPlayerDataJSON.getJSONObject("componentTimeMovingDTO");
                if (jSONObject2 == null) {
                    return false;
                }
                jSONObject = jSONObject2.getJSONObject("spfPlayVideo");
            } else {
                JSONObject jSONObject3 = this.mPlayerDataJSON.getJSONObject("videoInfo");
                if (jSONObject3 == null) {
                    return false;
                }
                jSONObject = jSONObject3.getJSONObject("spfVideoInfo");
            }
            if (jSONObject == null || (spfPlayVideo = (SpfPlayVideo) JSON.toJavaObject(jSONObject, SpfPlayVideo.class)) == null) {
                return false;
            }
            if (TextUtils.isEmpty(spfPlayVideo.playInfo)) {
                str2 = null;
                str = null;
            } else if (ryp.FILE_TYPE_VIDEO_MP4.equals(spfPlayVideo.videoType)) {
                str2 = spfPlayVideo.playInfo;
                str = null;
            } else {
                str = spfPlayVideo.playInfo;
                str2 = null;
            }
            log("parseMediaData mIsLiveVideo = " + this.mIsLiveVideo + " mLiveStatus = " + this.mLiveStatus + " mVideoID = " + str2 + " m3u8Url = " + str);
        }
        cjrVar.c = mediaData;
        cjrVar.e = str2;
        cjrVar.d = str;
        return true;
    }

    @Override // tb.rlr
    public void onMediaInfo(long j, long j2, long j3, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da5a2c6", new Object[]{this, new Long(j), new Long(j2), new Long(j3), obj});
            return;
        }
        rlr rlrVar = this.mPlayerCallback;
        if (rlrVar != null) {
            rlrVar.onMediaInfo(j, j2, j3, obj);
        }
        int i = (int) j;
        if (i == 3) {
            log("onInfo MEDIA_INFO_VIDEO_RENDERING_START isPlayerWarmUsed = " + this.isPlayerWarmUsed + " isPlayerWarmSucc = " + this.isPlayerWarmSucc);
        } else if (i == 12000) {
            this.isPlayerWarmSucc = true;
            log("onInfo isPlayerWarmSucc");
        }
    }

    public TBLiveMediaCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        initView(context);
        initLive();
    }

    public TBLiveMediaCardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        initView(context);
        initLive();
    }
}
