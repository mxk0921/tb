package com.taobao.taolive.room.controller2;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Message;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alilive.adapter.uikit.AliUrlImageView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.adaemon.ADaemon;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.android.live.plugin.atype.flexalocal.fullscreen.FullScreenFrame;
import com.taobao.android.live.plugin.proxy.input.IInputProxy;
import com.taobao.android.live.plugin.proxy.smartlanding.ISmartLandingProxy;
import com.taobao.android.live.plugin.proxy.tbliveinteractive.IInteractiveProxy;
import com.taobao.android.live.plugin.proxy.universal.IUniversalProxy;
import com.taobao.schedule.ViewProxy;
import com.taobao.taobao.R;
import com.taobao.taolive.room.datamanager.model.RecModel;
import com.taobao.taolive.room.openarchitecture.entity.ATaoLiveOpenEntity;
import com.taobao.taolive.room.openarchitecture.entity.TaoliveOpenBizCodeEnum;
import com.taobao.taolive.room.openarchitecture.listener.AccessListenerEnum;
import com.taobao.taolive.room.ui.model.TBLiveBizDataModel;
import com.taobao.taolive.room.ui.view.CircularProgressBar;
import com.taobao.taolive.sdk.configurable.ComponentGroupConfig;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.model.common.AccountInfo;
import com.taobao.taolive.sdk.model.common.QualitySelectItem;
import com.taobao.taolive.sdk.model.common.TBTVProgramInfo;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import com.taobao.taolive.sdk.model.message.JoinNotifyMessage;
import com.taobao.taolive.sdk.model.message.MessageTypeFilter;
import com.taobao.taolive.sdk.model.message.OfficialLiveEndMessage;
import com.taobao.taolive.sdk.model.message.OfficialLiveSwitchNextMessage;
import com.taobao.taolive.sdk.model.message.TBLivePVMsg;
import com.taobao.taolive.sdk.model.message.TBLiveSwitchMsg;
import com.taobao.taolive.sdk.model.message.TBTVProgramMessage;
import com.taobao.taolive.sdk.monitor.SceneStage;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import tb.air;
import tb.bl9;
import tb.bxl;
import tb.by9;
import tb.c84;
import tb.cba;
import tb.ccc;
import tb.cdr;
import tb.cf;
import tb.cpr;
import tb.cqk;
import tb.cv1;
import tb.cwd;
import tb.cxg;
import tb.d9m;
import tb.dba;
import tb.dzd;
import tb.e7w;
import tb.ehf;
import tb.f7a;
import tb.fif;
import tb.fkx;
import tb.ggv;
import tb.gq0;
import tb.h4s;
import tb.hif;
import tb.hjr;
import tb.iba;
import tb.igq;
import tb.ilq;
import tb.iws;
import tb.jbt;
import tb.jyw;
import tb.k6m;
import tb.l6m;
import tb.lhf;
import tb.liv;
import tb.lmg;
import tb.lxg;
import tb.m8c;
import tb.mkr;
import tb.mxf;
import tb.n8e;
import tb.ncc;
import tb.ogf;
import tb.pvs;
import tb.q0k;
import tb.qet;
import tb.qvs;
import tb.rbu;
import tb.s3c;
import tb.sj9;
import tb.sjr;
import tb.t2o;
import tb.t4l;
import tb.t54;
import tb.tz3;
import tb.u90;
import tb.uak;
import tb.up6;
import tb.uvg;
import tb.ux9;
import tb.uyg;
import tb.v2s;
import tb.v4l;
import tb.vc;
import tb.voj;
import tb.vx9;
import tb.x5t;
import tb.xj7;
import tb.y2h;
import tb.yj4;
import tb.yrk;
import tb.z9u;
import tb.zyg;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class OpenNormalRoomController extends BaseFrame implements ccc, cpr.b, s3c {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ICON_URL = "https://gw.alicdn.com/imgextra/i3/O1CN0188r4nU29Sjz3MK7ox_!!6000000008067-2-tps-429-207.png";
    private static final int MSG_DISPLAY_SHOP_LIVE_WRAP = 9;
    private static final int MSG_ENABLE_DRAWERCONSUMER_WRAP = 8;
    public static final int MSG_ENTER_ERROR = 1;
    private static final int MSG_HOLDER_PM = 3;
    private static final int MSG_INIT_LINK = 2;
    public static final int MSG_STAY_TIME = 0;
    private static final int MSG_TAOLIVE_DELAY = 4;
    private static final int MSG_TAOLIVE_ROOM_DRAW_DELAY = 11;
    public static final long STAY_CHECK_INTERVAL = 10000;
    private static final String TAG = OpenNormalRoomController.class.getSimpleName();
    public long curWatchNum;
    public String frameContextUnique;
    private String mAutoShare;
    private AliUrlImageView mBackgroundImage;
    private CircularProgressBar mCircularProgressBar;
    private String mCoverImage;
    private String mDirectPlayUrl;
    private boolean mHasSwitch;
    private boolean mHideUI;
    private String mId;
    private boolean mInSwitchTaoLiveRoom;
    private boolean mLandscapeVideo;
    private long mLastStayTimeStamp;
    private String mLiveSource;
    private JSONObject mMediaInfo;
    private bxl mPerfomenceTrackManager;
    private long mRoomDidAppearTime;
    private ViewGroup mRoomLayout;
    private String mShareItemId;
    private String mSjsdItemId;
    private int mStayCheckCount;
    private View mSwitchTVProgramNewView;
    private View mSwitchTVProgramNo;
    private AliUrlImageView mSwitchTVProgramNormalView;
    private TextView mSwitchTVProgramTitle;
    private View mSwitchTVProgramTransitionView;
    private View mSwitchTVProgramYes;
    private IInteractiveProxy.h mTBLiveInteractiveManager;
    private t4l mTaoliveShowByStatus;
    private qet mTaskInteractiveManager;
    private String mTimeMovingItemId;
    private String mTimeShiftUrl;
    private String mTrackId;
    private String mUserId;
    private n8e mVideoFrame;
    private s3c renderFinish;
    private ValueAnimator valueAnimator;
    private String mToken = "";
    private boolean mFirstFrameRendered = false;
    private jyw mHandler = new jyw(this);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements Animator.AnimatorListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("90a3af63", new Object[]{this, animator});
            } else if (OpenNormalRoomController.access$1000(OpenNormalRoomController.this) != null && OpenNormalRoomController.access$1000(OpenNormalRoomController.this).getParent() != null) {
                int i = R.id.taolive_root_view;
                if (((Activity) OpenNormalRoomController.this.mContext).findViewById(i) != null) {
                    ((ViewGroup) ((Activity) OpenNormalRoomController.this.mContext).findViewById(i)).removeView(OpenNormalRoomController.access$1000(OpenNormalRoomController.this));
                    OpenNormalRoomController.access$1002(OpenNormalRoomController.this, null);
                }
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
            } else if (OpenNormalRoomController.access$1000(OpenNormalRoomController.this) != null && OpenNormalRoomController.access$1000(OpenNormalRoomController.this).getParent() != null) {
                int i = R.id.taolive_root_view;
                if (((Activity) OpenNormalRoomController.this.mContext).findViewById(i) != null) {
                    ((ViewGroup) ((Activity) OpenNormalRoomController.this.mContext).findViewById(i)).removeView(OpenNormalRoomController.access$1000(OpenNormalRoomController.this));
                    OpenNormalRoomController.access$1002(OpenNormalRoomController.this, null);
                }
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4388ea84", new Object[]{this, animator});
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3a405721", new Object[]{this, animator});
            }
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
            } else {
                sjr.g().c(uyg.EVENT_NEGATIVE_FEEDBACK, null, OpenNormalRoomController.this.frameContextUnique);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ OfficialLiveEndMessage f13140a;

        public c(OfficialLiveEndMessage officialLiveEndMessage) {
            this.f13140a = officialLiveEndMessage;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            Context context = OpenNormalRoomController.this.mContext;
            voj.a(context, liv.d(this.f13140a.officialLiveId) + "&livesource=guanfangtai&forceRefresh=true");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ OfficialLiveSwitchNextMessage f13141a;

        public d(OfficialLiveSwitchNextMessage officialLiveSwitchNextMessage) {
            this.f13141a = officialLiveSwitchNextMessage;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                voj.a(OpenNormalRoomController.this.mContext, this.f13141a.targetLiveDetailUrl);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class g extends MessageTypeFilter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public g(OpenNormalRoomController openNormalRoomController) {
        }

        public static /* synthetic */ Object ipc$super(g gVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/room/controller2/OpenNormalRoomController$3");
        }

        @Override // com.taobao.taolive.sdk.model.message.MessageTypeFilter
        public boolean filter(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("c81f1ee8", new Object[]{this, new Integer(i)})).booleanValue();
            }
            if (i == 1058 || i == 1039 || i == 888000111 || i == 888000113 || i == 102 || i == 1059) {
                return true;
            }
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class h implements f7a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ cv1 f13144a;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
        public class a implements ISmartLandingProxy.d {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ cqk f13145a;

            public a(cqk cqkVar) {
                this.f13145a = cqkVar;
            }

            @Override // com.taobao.android.live.plugin.proxy.smartlanding.ISmartLandingProxy.d
            public boolean onTaskActionListener(String str, String str2, JSONObject jSONObject, JSONArray jSONArray, JSONObject jSONObject2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("fd5561e5", new Object[]{this, str, str2, jSONObject, jSONArray, jSONObject2})).booleanValue();
                }
                String access$000 = OpenNormalRoomController.access$000();
                StringBuilder sb = new StringBuilder("getComponentList onTaskActionListener popId ");
                sb.append(str2);
                sb.append(" actionData ");
                sb.append(jSONObject);
                sb.append(" benefitAliveList ");
                sb.append(jSONArray);
                sb.append(" ");
                sb.append(jSONObject2 != null ? Integer.valueOf(jSONObject2.size()) : null);
                x5t.d(access$000, sb.toString());
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("benefitAliveList", (Object) jSONArray);
                jSONObject3.put("smartLandingActionData", (Object) jSONObject);
                jSONObject3.put("componentListData", (Object) jSONObject2);
                if (h.this.f13144a.u != null) {
                    jSONObject3.put("enableSmartlanding", (Object) Boolean.TRUE);
                    JSONObject a2 = h.this.f13144a.u.a();
                    if (a2 != null && "dx_smart".equals(a2.getString("actionType"))) {
                        jSONObject3.put("smartLayerActionData", (Object) a2);
                    }
                }
                this.f13145a.R1(jSONObject3);
                return true;
            }
        }

        public h(OpenNormalRoomController openNormalRoomController, cv1 cv1Var) {
            this.f13144a = cv1Var;
        }

        @Override // tb.f7a
        public void a(cqk cqkVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5b741b85", new Object[]{this, cqkVar});
            } else {
                this.f13144a.u.j(true, "targetAlive", new a(cqkVar));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class i implements bl9.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public i() {
        }

        @Override // tb.bl9.b
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9bef331", new Object[]{this});
            } else {
                OpenNormalRoomController.access$400(OpenNormalRoomController.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class j implements ValueAnimator.AnimatorUpdateListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public j() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                return;
            }
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue instanceof Integer) {
                OpenNormalRoomController.access$500(OpenNormalRoomController.this).setProgress(((Integer) animatedValue).intValue());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class k implements Animator.AnimatorListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f13148a;

        public k(String str) {
            this.f13148a = str;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("90a3af63", new Object[]{this, animator});
            } else if (!OpenNormalRoomController.access$600(OpenNormalRoomController.this)) {
                OpenNormalRoomController.access$602(OpenNormalRoomController.this, true);
                OpenNormalRoomController.access$700(OpenNormalRoomController.this);
                if (OpenNormalRoomController.access$800(OpenNormalRoomController.this) != null) {
                    OpenNormalRoomController.access$800(OpenNormalRoomController.this).reset();
                }
                voj.a(OpenNormalRoomController.this.mContext, this.f13148a);
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
            } else if (!OpenNormalRoomController.access$600(OpenNormalRoomController.this)) {
                OpenNormalRoomController.access$602(OpenNormalRoomController.this, true);
                OpenNormalRoomController.access$700(OpenNormalRoomController.this);
                if (OpenNormalRoomController.access$800(OpenNormalRoomController.this) != null) {
                    OpenNormalRoomController.access$800(OpenNormalRoomController.this).reset();
                }
                voj.a(OpenNormalRoomController.this.mContext, this.f13148a);
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4388ea84", new Object[]{this, animator});
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3a405721", new Object[]{this, animator});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class l implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public l() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            OpenNormalRoomController.access$602(OpenNormalRoomController.this, true);
            if (OpenNormalRoomController.access$900(OpenNormalRoomController.this) != null) {
                OpenNormalRoomController.access$900(OpenNormalRoomController.this).cancel();
            }
            OpenNormalRoomController.access$700(OpenNormalRoomController.this);
            TBLiveDataModel tBLiveDataModel = OpenNormalRoomController.this.mLiveDataModel;
            if (tBLiveDataModel != null && !TextUtils.isEmpty(tBLiveDataModel.mActionUrl)) {
                String str2 = OpenNormalRoomController.this.mLiveDataModel.mActionUrl;
                if (!str2.contains("forceRefresh")) {
                    str = str2.concat("&forceRefresh=true");
                } else {
                    str = str2.replace("forceRefresh=false", "forceRefresh=true");
                }
                voj.a(OpenNormalRoomController.this.mContext, str);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class m implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public m() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else if (OpenNormalRoomController.access$900(OpenNormalRoomController.this) != null) {
                OpenNormalRoomController.access$900(OpenNormalRoomController.this).cancel();
            }
        }
    }

    static {
        t2o.a(779092849);
        t2o.a(806356161);
        t2o.a(806356196);
        t2o.a(806355016);
    }

    public OpenNormalRoomController(Context context, boolean z, TBLiveDataModel tBLiveDataModel, View view, n8e n8eVar, ux9 ux9Var) {
        super(context, z, tBLiveDataModel, ux9Var);
        this.frameContextUnique = null;
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.taolive_room_layout);
        this.mRoomLayout = viewGroup;
        viewGroup.removeAllViews();
        this.mBackgroundImage = (AliUrlImageView) view.findViewById(R.id.taolive_background_image);
        this.mVideoFrame = n8eVar;
        bindData(this.mLiveDataModel);
        ux9 ux9Var2 = this.mFrameContext;
        if (ux9Var2 != null) {
            this.frameContextUnique = ux9Var2.C();
        }
    }

    public static /* synthetic */ String access$000() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7022ea09", new Object[0]);
        }
        return TAG;
    }

    public static /* synthetic */ String access$100(OpenNormalRoomController openNormalRoomController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("76ba767a", new Object[]{openNormalRoomController});
        }
        return openNormalRoomController.mTrackId;
    }

    public static /* synthetic */ View access$1000(OpenNormalRoomController openNormalRoomController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("8880f796", new Object[]{openNormalRoomController});
        }
        return openNormalRoomController.mSwitchTVProgramTransitionView;
    }

    public static /* synthetic */ View access$1002(OpenNormalRoomController openNormalRoomController, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("39f80a7e", new Object[]{openNormalRoomController, view});
        }
        openNormalRoomController.mSwitchTVProgramTransitionView = view;
        return view;
    }

    public static /* synthetic */ bxl access$200(OpenNormalRoomController openNormalRoomController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bxl) ipChange.ipc$dispatch("9d940847", new Object[]{openNormalRoomController});
        }
        return openNormalRoomController.mPerfomenceTrackManager;
    }

    public static /* synthetic */ s3c access$300(OpenNormalRoomController openNormalRoomController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (s3c) ipChange.ipc$dispatch("ea3306be", new Object[]{openNormalRoomController});
        }
        return openNormalRoomController.renderFinish;
    }

    public static /* synthetic */ void access$400(OpenNormalRoomController openNormalRoomController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ecbe1569", new Object[]{openNormalRoomController});
        } else {
            openNormalRoomController.liveBizRequestManagerStart();
        }
    }

    public static /* synthetic */ CircularProgressBar access$500(OpenNormalRoomController openNormalRoomController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CircularProgressBar) ipChange.ipc$dispatch("a34882a3", new Object[]{openNormalRoomController});
        }
        return openNormalRoomController.mCircularProgressBar;
    }

    public static /* synthetic */ boolean access$600(OpenNormalRoomController openNormalRoomController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cf61346f", new Object[]{openNormalRoomController})).booleanValue();
        }
        return openNormalRoomController.mHasSwitch;
    }

    public static /* synthetic */ boolean access$602(OpenNormalRoomController openNormalRoomController, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("55a2048b", new Object[]{openNormalRoomController, new Boolean(z)})).booleanValue();
        }
        openNormalRoomController.mHasSwitch = z;
        return z;
    }

    public static /* synthetic */ void access$700(OpenNormalRoomController openNormalRoomController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0b2c3ec", new Object[]{openNormalRoomController});
        } else {
            openNormalRoomController.hideSwitchTVProgramTransitionView();
        }
    }

    public static /* synthetic */ n8e access$800(OpenNormalRoomController openNormalRoomController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (n8e) ipChange.ipc$dispatch("c6e4a220", new Object[]{openNormalRoomController});
        }
        return openNormalRoomController.mVideoFrame;
    }

    public static /* synthetic */ ValueAnimator access$900(OpenNormalRoomController openNormalRoomController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ValueAnimator) ipChange.ipc$dispatch("4afb1452", new Object[]{openNormalRoomController});
        }
        return openNormalRoomController.valueAnimator;
    }

    private boolean checkDegrade(VideoInfo videoInfo) {
        VideoInfo.DegradeInfo degradeInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2219bedc", new Object[]{this, videoInfo})).booleanValue();
        }
        if (videoInfo == null || (degradeInfo = videoInfo.degradeInfo) == null || !degradeInfo.cdnDegrade) {
            return false;
        }
        String str = degradeInfo.degradeUrl;
        if (TextUtils.isEmpty(str)) {
            str = pvs.n2();
        }
        voj.a(this.mContext, str);
        sjr.g().c("com.taobao.taolive.room.killself", null, this.frameContextUnique);
        return true;
    }

    private void checkSwitch(TBLiveDataModel tBLiveDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f92a0a1c", new Object[]{this, tBLiveDataModel});
            return;
        }
        if (tBLiveDataModel.mVideoInfo.closeLeftAndRightSlide) {
            sjr.g().c(FullScreenFrame.EVENT_DISABLE_LEFTRIGHT_SWITCH, null, this.frameContextUnique);
        } else {
            sjr.g().c(FullScreenFrame.EVENT_ENABLE_LEFTRIGHT_SWITCH, null, this.frameContextUnique);
        }
        if (tBLiveDataModel.mVideoInfo.closeUpAndDownSlide) {
            sjr.g().c("com.taobao.taolive.room.disable_updown_switch", "checkSwitch", this.frameContextUnique);
        } else {
            sjr.g().c("com.taobao.taolive.room.enable_updown_switch", null, this.frameContextUnique);
        }
    }

    private void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        IInteractiveProxy.h hVar = this.mTBLiveInteractiveManager;
        if (hVar != null) {
            hVar.destroy();
            this.mTBLiveInteractiveManager = null;
        }
        qet qetVar = this.mTaskInteractiveManager;
        if (qetVar != null) {
            qetVar.r();
            this.mTaskInteractiveManager = null;
        }
        sjr.g().b(this);
        e7w.u(this.mFrameContext, this);
        jyw jywVar = this.mHandler;
        if (jywVar != null) {
            jywVar.removeCallbacksAndMessages(null);
        }
        ViewGroup viewGroup = this.mRoomLayout;
        if (viewGroup != null) {
            viewGroup.setVisibility(8);
        }
        t4l t4lVar = this.mTaoliveShowByStatus;
        if (t4lVar != null) {
            t4lVar.z();
        }
        ilq.b(this.mFrameContext);
        jyw jywVar2 = this.mHandler;
        if (jywVar2 != null) {
            jywVar2.removeMessages(3);
            this.mHandler.removeMessages(0);
            this.mHandler.removeMessages(4);
        }
        sjr.g().b(this.renderFinish);
        d9m.o().atmosphereInstanceDestroy(this.mFrameContext);
    }

    private void endOfficialLive(OfficialLiveEndMessage officialLiveEndMessage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1dae4c8e", new Object[]{this, officialLiveEndMessage});
            return;
        }
        VideoInfo e2 = cxg.e(this.mLiveDataModel);
        if (e2 != null && e2.isOfficialType() && officialLiveEndMessage != null && !TextUtils.isEmpty(officialLiveEndMessage.officialLiveId) && officialLiveEndMessage.officialLiveId.equals(e2.officialLiveInfo.officialLiveId)) {
            Toast makeText = Toast.makeText(this.mContext, hjr.G(), 1);
            makeText.setGravity(17, 0, 0);
            makeText.show();
            jyw jywVar = this.mHandler;
            if (jywVar != null) {
                jywVar.postDelayed(new c(officialLiveEndMessage), hjr.F());
            }
        }
    }

    private void getCustomPageExtParams() {
        ATaoLiveOpenEntity A;
        cf cfVar;
        yrk a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("597e3618", new Object[]{this});
            return;
        }
        ux9 ux9Var = this.mFrameContext;
        if (ux9Var != null && (A = ux9Var.A()) != null && (cfVar = A.eventCompontent) != null && cfVar.a() != null && (a2 = A.eventCompontent.a().a()) != null) {
            Map w = a2.w();
            String str = TAG;
            x5t.h(str, "getCustomPageExtParams，customPageParamsExtMap：" + w);
            getCustomPageExtParamsInernal(w);
        }
    }

    private void getCustomPageExtParamsInernal(Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d884a468", new Object[]{this, map});
        } else if (this.mFrameContext.j() instanceof cba) {
            cba cbaVar = (cba) this.mFrameContext.j();
            if (cbaVar.M() && !tz3.b(map) && !tz3.b(map)) {
                cbaVar.h0(map);
            }
        }
    }

    private boolean hasLiveUrlListChanged(ArrayList<QualitySelectItem> arrayList, ArrayList<QualitySelectItem> arrayList2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3f8fcad8", new Object[]{this, arrayList, arrayList2})).booleanValue();
        }
        if (arrayList == null || arrayList2 == null || arrayList.isEmpty() || arrayList2.isEmpty() || arrayList.get(0) == null || arrayList2.get(0) == null || TextUtils.equals(arrayList.get(0).flvUrl, arrayList2.get(0).flvUrl)) {
            return false;
        }
        return true;
    }

    private void hideSwitchTVProgramTransitionView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37f1598d", new Object[]{this});
            return;
        }
        if (this.mSwitchTVProgramTransitionView == null) {
            this.mSwitchTVProgramTransitionView = ((Activity) this.mContext).findViewById(R.id.taolive_switch_tv_layout);
        }
        if (this.mSwitchTVProgramTransitionView != null) {
            initViews();
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.mSwitchTVProgramTransitionView, "alpha", 1.0f, 0.0f);
            ofFloat.setDuration(1000L);
            ofFloat.addListener(new a());
            ofFloat.start();
        }
    }

    private void initFrameInstaller() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("365bb4d2", new Object[]{this});
            return;
        }
        by9 by9Var = new by9(this.mContext, sj9.s(), false);
        by9Var.start();
        by9Var.i(new lmg(this.mContext, this.mLiveDataModel, this.mFrameContext));
        by9Var.a(new q0k(this.mContext, this.mFrameContext));
        this.mFrameContext.U(by9Var);
    }

    private void initRoomScreenManager(VideoInfo videoInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d989a50", new Object[]{this, videoInfo});
            return;
        }
        if (vc.a()) {
            if (vc.g(this.mContext)) {
                this.mLandscape = true;
            } else {
                this.mLandscape = false;
            }
            this.mFrameContext.c = this.mLandscape;
        }
        if (this.mTaoliveShowByStatus == null) {
            t4l k2 = new t4l.e().m(videoInfo.landScape).o(this.mContext).p(this.mHandler).q(this.mHideUI).r(this.mLiveDataModel).s(this).t(this.mRoomLayout).u(this.mVideoFrame).n(this.mBackgroundImage).l(this.mFrameContext).k();
            this.mTaoliveShowByStatus = k2;
            k2.g();
        }
        t4l t4lVar = this.mTaoliveShowByStatus;
        if (t4lVar != null) {
            t4lVar.n(this.mHideUI);
            if (!vc.a()) {
                this.mLandscape = this.mLiveDataModel.mVideoInfo.landScape;
            }
            this.mTaoliveShowByStatus.k(isLandscape());
            this.mTaoliveShowByStatus.o(this.mLiveDataModel);
            IInteractiveProxy.h hVar = this.mTBLiveInteractiveManager;
            if (hVar != null) {
                this.mTaoliveShowByStatus.m(hVar);
            }
        }
    }

    private void initViews() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ffd024c5", new Object[]{this});
            return;
        }
        this.mSwitchTVProgramNormalView = (AliUrlImageView) this.mSwitchTVProgramTransitionView.findViewById(R.id.taolive_switch_tv_program_normal);
        this.mSwitchTVProgramNewView = this.mSwitchTVProgramTransitionView.findViewById(R.id.taolive_switch_tv_program_new_layer);
        this.mCircularProgressBar = (CircularProgressBar) this.mSwitchTVProgramTransitionView.findViewById(R.id.circularProgressbar);
        this.mSwitchTVProgramNo = this.mSwitchTVProgramTransitionView.findViewById(R.id.taolive_tv_switch_program_no);
        this.mSwitchTVProgramYes = this.mSwitchTVProgramTransitionView.findViewById(R.id.taolive_tv_switch_program_yes);
        this.mSwitchTVProgramTitle = (TextView) this.mSwitchTVProgramTransitionView.findViewById(R.id.taolive_room_switch_tv_program_title);
        ViewProxy.setOnClickListener(this.mSwitchTVProgramNo, new l());
        ViewProxy.setOnClickListener(this.mSwitchTVProgramYes, new m());
        this.mSwitchTVProgramNormalView.setImageUrl(ICON_URL);
    }

    public static /* synthetic */ Object ipc$super(OpenNormalRoomController openNormalRoomController, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1857981988:
                super.onDidAppear();
                return null;
            case -1801045031:
                super.onWillDisappear();
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case -1257959318:
                super.onDidDisappear();
                return null;
            case -553924265:
                super.onStatusChange(((Number) objArr[0]).intValue(), objArr[1]);
                return null;
            case -236809011:
                super.onWillAppear();
                return null;
            case 188604040:
                super.onStop();
                return null;
            case 690752966:
                super.onBindData((TBLiveDataModel) objArr[0]);
                return null;
            case 2133689546:
                super.onStart();
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/room/controller2/OpenNormalRoomController");
        }
    }

    private boolean isTab2(ux9 ux9Var) {
        ATaoLiveOpenEntity A;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f9e9c1ba", new Object[]{this, ux9Var})).booleanValue();
        }
        if (ux9Var == null || (A = ux9Var.A()) == null || !TextUtils.equals(TaoliveOpenBizCodeEnum.TaoLiveOpenBizCode_Tab2.toString(), A.bizCode)) {
            return false;
        }
        return true;
    }

    private void liveBizRequestManagerStart() {
        IUniversalProxy.a liveBizRequestManager;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce34f6e4", new Object[]{this});
        } else if (d9m.L() != null && (liveBizRequestManager = d9m.L().getLiveBizRequestManager()) != null) {
            VideoInfo videoInfo = this.mLiveDataModel.mVideoInfo;
            String str = videoInfo.liveId;
            AccountInfo accountInfo = videoInfo.broadCaster;
            liveBizRequestManager.a(str, accountInfo.accountId, accountInfo.encodeAccountId);
        }
    }

    private void realSwitchTaoLiveRoom(String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b9ec222", new Object[]{this, str, str2, new Boolean(z)});
        } else if (!TextUtils.isEmpty(str)) {
            showSwitchTVProgramTransitionView(str, str2, z);
        }
    }

    private void redirRoom(TBLiveDataModel tBLiveDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1721cf5", new Object[]{this, tBLiveDataModel});
        } else if (gq0.q(this.mContext, tBLiveDataModel.mVideoInfo)) {
            sjr.g().c("com.taobao.taolive.room.killself", null, this.frameContextUnique);
        } else {
            long min = Math.min((up6.n(this.mFrameContext) - System.currentTimeMillis()) + 30, 500L);
            if (this.mHandler == null || min <= 0 || !pvs.A0()) {
                showByStatus(tBLiveDataModel);
            } else {
                this.mHandler.removeMessages(11);
                jyw jywVar = this.mHandler;
                jywVar.sendMessageDelayed(jywVar.obtainMessage(11, tBLiveDataModel), min);
                cwd A = v2s.o().A();
                String str = TAG;
                A.b(str, "MSG_TAOLIVE_ROOM_DRAW_DELAY info = " + tBLiveDataModel + " delayedTime " + min);
            }
            igq.n().p("lockScroll", "redirRoom:lockScroll:false");
        }
    }

    private void refreshInitParams(VideoInfo videoInfo, RecModel recModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a901fb79", new Object[]{this, videoInfo, recModel});
            return;
        }
        JSONObject d2 = fkx.d(recModel.initParams.get(yj4.PARAM_CUSTOM_PLAY_CTRL));
        if (d2 != null) {
            if (d2.containsKey("h265")) {
                d2.put("h265", (Object) Boolean.valueOf(videoInfo.h265));
            }
            if (d2.containsKey(yj4.PARAM_MEDIA_INFO_RATEADAPTE)) {
                d2.put(yj4.PARAM_MEDIA_INFO_RATEADAPTE, (Object) Boolean.valueOf(videoInfo.rateAdapte));
            }
            if (d2.containsKey("liveId")) {
                d2.put("liveId", (Object) videoInfo.liveId);
            }
            if (d2.containsKey("pushFeature")) {
                d2.put("pushFeature", (Object) videoInfo.pushFeature);
            }
            if (d2.containsKey("mediaConfig")) {
                d2.put("mediaConfig", (Object) videoInfo.mediaConfig);
            }
            if (d2.containsKey("liveUrlList")) {
                d2.put("liveUrlList", (Object) lxg.b(videoInfo.liveUrlList));
            }
            recModel.initParams.put(yj4.PARAM_CUSTOM_PLAY_CTRL, d2.toJSONString());
        }
    }

    private void registerRenderFinishListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("348fc967", new Object[]{this});
            return;
        }
        this.renderFinish = new e(new HashSet());
        sjr.g().a(this.renderFinish);
    }

    private void setPlayReportFeedType(String str) {
        k6m b2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6292b4b3", new Object[]{this, str});
        } else if (pvs.Y0() && this.mFrameContext != null && (b2 = l6m.c().b(this.mFrameContext.p())) != null) {
            b2.j = str;
        }
    }

    private void setupGlobalData(VideoInfo videoInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9d8dedc", new Object[]{this, videoInfo});
            return;
        }
        iba.X(videoInfo.liveId, vx9.f(this.mFrameContext));
        up6.I0(videoInfo.liveId, this.mFrameContext);
        AccountInfo accountInfo = videoInfo.broadCaster;
        if (accountInfo != null) {
            up6.H0(accountInfo.accountId, this.mFrameContext);
        }
    }

    private void showGoodListsIfNeed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4215ef15", new Object[]{this});
        } else if (!TextUtils.isEmpty(this.mShareItemId) && pvs.V2()) {
            sjr.g().c(uyg.EVENT_SHOW_GOODSPACKAGE, null, this.frameContextUnique);
        }
    }

    private void startLiveBizRequest() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a55c4491", new Object[]{this});
        } else if (!ggv.a()) {
            startLiveBizRequestOld();
        }
    }

    private void startLiveBizRequestOld() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75342ac4", new Object[]{this});
        } else if (this.mLiveDataModel.mVideoInfo.broadCaster == null) {
        } else {
            if (bl9.g().b()) {
                liveBizRequestManagerStart();
            } else {
                bl9.g().i(new i());
            }
        }
    }

    private void switchTaoLiveRoom(TBLiveSwitchMsg tBLiveSwitchMsg) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae91858f", new Object[]{this, tBLiveSwitchMsg});
            return;
        }
        VideoInfo e2 = cxg.e(this.mLiveDataModel);
        if (e2 == null || tBLiveSwitchMsg == null || TextUtils.isEmpty(tBLiveSwitchMsg.targetLiveId) || (tBLiveSwitchMsg.newRoomType & 256) != 256 || TextUtils.isEmpty(tBLiveSwitchMsg.targetUrl) || this.mInSwitchTaoLiveRoom || this.mIsPaused || iws.b()) {
            return;
        }
        if ((tBLiveSwitchMsg.targetLiveId.equals(this.mId) && !up6.w0(e2, this.mFrameContext)) || (!tBLiveSwitchMsg.targetLiveId.equals(this.mId) && up6.w0(e2, this.mFrameContext))) {
            this.mInSwitchTaoLiveRoom = true;
            if (tBLiveSwitchMsg.delay == 0) {
                realSwitchTaoLiveRoom(tBLiveSwitchMsg.targetUrl, tBLiveSwitchMsg.targetLiveTitle, tBLiveSwitchMsg.targetLiveId.equals(this.mId));
            } else if (this.mHandler != null) {
                Message obtain = Message.obtain();
                obtain.what = 4;
                obtain.obj = tBLiveSwitchMsg;
                this.mHandler.sendMessageDelayed(obtain, c84.b((int) tBLiveSwitchMsg.delay));
            }
        }
    }

    private void updateParams(VideoInfo videoInfo) {
        TBTVProgramInfo tBTVProgramInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b197f57", new Object[]{this, videoInfo});
        } else if (videoInfo != null) {
            this.mId = videoInfo.liveId;
            AccountInfo accountInfo = videoInfo.broadCaster;
            if (accountInfo != null) {
                this.mUserId = accountInfo.accountId;
            }
            this.mLandscapeVideo = videoInfo.landScape;
            if (up6.x0(this.mFrameContext) && (tBTVProgramInfo = videoInfo.tbtvLiveDO) != null) {
                videoInfo.landScape = tBTVProgramInfo.landScape;
                videoInfo.millionBaby = tBTVProgramInfo.millionBaby;
            }
        }
    }

    @Override // tb.s3c
    public String bizCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("36951559", new Object[]{this});
        }
        return "OpenNormalRoomController";
    }

    public View getUbeeContainer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("e01a45e7", new Object[]{this});
        }
        t4l t4lVar = this.mTaoliveShowByStatus;
        if (t4lVar == null || !(t4lVar.f() instanceof m8c)) {
            return null;
        }
        return ((m8c) this.mTaoliveShowByStatus.f()).getUbeeContainer();
    }

    @Override // tb.s3c
    public String[] observeEvents() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("37b2602b", new Object[]{this});
        }
        return new String[]{"com.taobao.taolive.room.mediaplatform_switch_to_landscape", "com.taobao.taolive.room.mediaplatform_switch_to_portrait", "com.taobao.taolive.room.switch.official.live"};
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

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponent
    public void onBindData(TBLiveDataModel tBLiveDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("292c0dc6", new Object[]{this, tBLiveDataModel});
            return;
        }
        h4s.c(TAG, "onBindData");
        bindData(tBLiveDataModel);
        super.onBindData(tBLiveDataModel);
        h4s.e();
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public void onCreateView(ViewStub viewStub) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3782edd", new Object[]{this, viewStub});
        }
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        h4s.c(TAG, "onDestroy");
        super.onDestroy();
        if (this.mFrameContext.i() != null) {
            this.mFrameContext.i().destroy();
        }
        destroy();
        h4s.e();
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onDidAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("914171dc", new Object[]{this});
            return;
        }
        h4s.c(TAG, "onDidAppear");
        this.mRoomDidAppearTime = System.currentTimeMillis();
        bxl bxlVar = this.mPerfomenceTrackManager;
        if (bxlVar != null) {
            this.mTrackId = bxlVar.d();
        }
        super.onDidAppear();
        h4s.e();
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onDidDisappear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b505106a", new Object[]{this});
            return;
        }
        h4s.c(TAG, "onDidDisappear");
        super.onDidDisappear();
        destroy();
        h4s.e();
    }

    @Override // tb.s3c
    public void onEvent(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3897928", new Object[]{this, str, obj});
        } else if ("com.taobao.taolive.room.mediaplatform_switch_to_landscape".equals(str)) {
            t4l t4lVar = this.mTaoliveShowByStatus;
            if (t4lVar != null) {
                t4lVar.w();
            }
        } else if ("com.taobao.taolive.room.mediaplatform_switch_to_portrait".equals(str)) {
            t4l t4lVar2 = this.mTaoliveShowByStatus;
            if (t4lVar2 != null) {
                t4lVar2.x();
                if (pvs.K() && (obj instanceof String) && "landscapeNegativeFeedback".equals(obj)) {
                    this.mHandler.postDelayed(new b(), pvs.O2());
                }
            }
        } else if ("com.taobao.taolive.room.switch.official.live".equals(str) && (obj instanceof OfficialLiveSwitchNextMessage)) {
            switchOfficialLiveRoom((OfficialLiveSwitchNextMessage) obj);
        }
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onWillAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1e294cd", new Object[]{this});
            return;
        }
        h4s.c(TAG, "onWillAppear");
        TBLiveDataModel tBLiveDataModel = this.mLiveDataModel;
        if (tBLiveDataModel != null && !liv.j(tBLiveDataModel.mVideoInfo)) {
            super.onWillAppear();
        }
        h4s.e();
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onWillDisappear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94a63bd9", new Object[]{this});
            return;
        }
        h4s.c(TAG, "onWillDisappear");
        TBLiveDataModel tBLiveDataModel = this.mLiveDataModel;
        if (tBLiveDataModel != null && !liv.j(tBLiveDataModel.mVideoInfo)) {
            super.onWillDisappear();
        }
        h4s.e();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class e implements s3c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Set f13142a;

        public e(Set set) {
            this.f13142a = set;
        }

        @Override // tb.s3c
        public String bizCode() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("36951559", new Object[]{this});
            }
            return "OpenNormalRoomControllerRenderFinish";
        }

        @Override // tb.s3c
        public String[] observeEvents() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String[]) ipChange.ipc$dispatch("37b2602b", new Object[]{this});
            }
            return new String[]{uyg.EVENT_LIVE_UI_RENDER_FINISH};
        }

        @Override // tb.s3c
        public String observeUniqueIdentification() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("4914bdfe", new Object[]{this});
            }
            ux9 ux9Var = OpenNormalRoomController.this.mFrameContext;
            if (ux9Var == null) {
                return null;
            }
            return ux9Var.C();
        }

        @Override // tb.s3c
        public void onEvent(String str, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c3897928", new Object[]{this, str, obj});
                return;
            }
            if (obj instanceof String) {
                this.f13142a.add((String) obj);
            }
            if (this.f13142a.size() >= 2) {
                x5t.f(OpenNormalRoomController.access$000(), "render finish");
                OpenNormalRoomController.access$200(OpenNormalRoomController.this).C(OpenNormalRoomController.access$100(OpenNormalRoomController.this));
                if (!TextUtils.equals(z9u.SOURCE_UPDOWNSWITCH, iba.B(vx9.f(OpenNormalRoomController.this.mFrameContext)))) {
                    uvg.g().d("LIVE_CODE_BOOT_STAGE");
                }
                sjr.g().b(OpenNormalRoomController.access$300(OpenNormalRoomController.this));
                iba.O0(false, vx9.f(OpenNormalRoomController.this.mFrameContext));
                ux9 ux9Var = OpenNormalRoomController.this.mFrameContext;
                if (ux9Var instanceof air) {
                    iba.O0(false, ((air) ux9Var).j());
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class f implements ncc {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ TBLiveDataModel f13143a;

        public f(TBLiveDataModel tBLiveDataModel) {
            this.f13143a = tBLiveDataModel;
        }

        @Override // tb.ncc
        public Map<String, String> getHeartParams() {
            String str;
            AccountInfo accountInfo;
            JSONObject jSONObject;
            int i = 0;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("ab918d32", new Object[]{this});
            }
            HashMap hashMap = new HashMap();
            OpenNormalRoomController openNormalRoomController = OpenNormalRoomController.this;
            Map<String, String> v = rbu.v(openNormalRoomController.mFrameContext, openNormalRoomController.mContext);
            if (v != null) {
                hashMap.putAll(v);
            }
            if (pvs.J1()) {
                ux9 ux9Var = OpenNormalRoomController.this.mFrameContext;
                if ((ux9Var instanceof cdr) && ((cdr) ux9Var).w0() != null && ((cdr) OpenNormalRoomController.this.mFrameContext).w0().isFirst && (OpenNormalRoomController.this.mFrameContext.j() instanceof cba) && !TextUtils.isEmpty(((cba) OpenNormalRoomController.this.mFrameContext.j()).Y())) {
                    hashMap.put(yj4.PARAM_PM_PARAMS, ((cba) OpenNormalRoomController.this.mFrameContext.j()).Y());
                }
            }
            Map<String, String> map = this.f13143a.mInitParams;
            if (map != null && !TextUtils.isEmpty(map.get(yj4.PARAM_IGNORE_PV))) {
                hashMap.put(yj4.PARAM_IGNORE_PV, this.f13143a.mInitParams.get(yj4.PARAM_IGNORE_PV));
            }
            VideoInfo videoInfo = this.f13143a.mVideoInfo;
            if (!(videoInfo == null || (jSONObject = videoInfo.pmContext) == null)) {
                hashMap.put("pmContext", jSONObject.toJSONString());
            }
            VideoInfo videoInfo2 = this.f13143a.mVideoInfo;
            if (!(videoInfo2 == null || (accountInfo = videoInfo2.broadCaster) == null)) {
                hashMap.put(z9u.KEY_ACCOUNT_ID, accountInfo.accountId);
                hashMap.put(z9u.KEY_LIVE_STATUS, String.valueOf(this.f13143a.mVideoInfo.status));
                hashMap.put("feed_id", this.f13143a.mVideoInfo.liveId);
                hashMap.put("liveServerParams", this.f13143a.mVideoInfo.trackInfo);
                hashMap.put(z9u.KEY_ROOMTYPE, String.valueOf(this.f13143a.mVideoInfo.roomType));
                hashMap.put("newRoomType", String.valueOf(this.f13143a.mVideoInfo.newRoomType));
                hashMap.put("roomStatus", this.f13143a.mVideoInfo.roomStatus);
                hashMap.put("streamStatus", this.f13143a.mVideoInfo.streamStatus);
                if (this.f13143a.mVideoInfo.isOfficialType()) {
                    hashMap.put("officialLiveId", this.f13143a.mVideoInfo.officialLiveInfo.officialLiveId);
                    hashMap.put("officialAccountId", this.f13143a.mVideoInfo.officialLiveInfo.accountId);
                }
            }
            ux9 ux9Var2 = OpenNormalRoomController.this.mFrameContext;
            if (ux9Var2 != null) {
                hashMap.put("liveToken", ux9Var2.p());
            }
            ux9 ux9Var3 = OpenNormalRoomController.this.mFrameContext;
            if (ux9Var3 != null) {
                hashMap.put("pmSession", ux9Var3.p());
                if (OpenNormalRoomController.this.mFrameContext.g() != null) {
                    hashMap.put("liveItemId", OpenNormalRoomController.this.mFrameContext.g().R1());
                }
                hashMap.put("entryLiveItemId", iba.n(OpenNormalRoomController.this.mFrameContext.j()));
            }
            String a0 = up6.a0(OpenNormalRoomController.this.mFrameContext);
            if (!pvs.b3() || !"tpp_88".equals(iba.B(vx9.f(OpenNormalRoomController.this.mFrameContext))) || TextUtils.isEmpty(up6.z(OpenNormalRoomController.this.mFrameContext))) {
                hashMap.put("trackInfo", a0);
            } else {
                JSONObject d = fkx.d(Uri.decode(up6.z(OpenNormalRoomController.this.mFrameContext)));
                if (d == null || d.getString("trackInfo") == null) {
                    hashMap.put("trackInfo", a0);
                } else {
                    hashMap.put("trackInfo", d.getString("trackInfo"));
                }
            }
            up6.U(OpenNormalRoomController.this.mFrameContext);
            hashMap.put("clickid", up6.i(OpenNormalRoomController.this.mFrameContext));
            hashMap.put("livesource", iba.B(vx9.f(OpenNormalRoomController.this.mFrameContext)));
            hashMap.put("entry_source", up6.r(OpenNormalRoomController.this.mFrameContext));
            if (!hashMap.containsKey("spm-url") || TextUtils.isEmpty((CharSequence) hashMap.get("spm-url"))) {
                ux9 ux9Var4 = OpenNormalRoomController.this.mFrameContext;
                if (ux9Var4 instanceof air) {
                    hashMap.put("spm-url", up6.U(ux9Var4));
                }
            }
            hashMap.put("isAD", String.valueOf(up6.j0(OpenNormalRoomController.this.mFrameContext) ? 1 : 0));
            hashMap.put(yj4.PARAM_LIVE_AD_PARAMS, Uri.encode(up6.I(OpenNormalRoomController.this.mFrameContext)));
            if (up6.d(OpenNormalRoomController.this.mFrameContext) != null) {
                i = 1;
            }
            hashMap.put("isAdTransParams", String.valueOf(i));
            hashMap.put("isChatRoom", String.valueOf(up6.o0(this.f13143a, OpenNormalRoomController.this.mFrameContext) ? 1 : 0));
            if (!TextUtils.isEmpty(this.f13143a.mVideoInfo.timeMovingPlayUrl)) {
                str = "smartpoint";
            } else {
                str = "default";
            }
            hashMap.put("scene", str);
            hashMap.put("kandianid", up6.p(OpenNormalRoomController.this.mFrameContext) + "_" + up6.H(OpenNormalRoomController.this.mFrameContext));
            hashMap.put("watchid", up6.g0(OpenNormalRoomController.this.mFrameContext));
            ux9 ux9Var5 = OpenNormalRoomController.this.mFrameContext;
            if (ux9Var5 instanceof air) {
                hashMap.put(yj4.PARAM_PVID, up6.P(ux9Var5));
            }
            return hashMap;
        }
    }

    private void autoShare() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("606303f7", new Object[]{this});
        } else if ("true".equals(this.mAutoShare)) {
            u90.o((Activity) this.mContext, false);
            this.mAutoShare = "";
        }
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponent, com.taobao.taolive.sdk.controller.IComponentLifeCycle2, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            return;
        }
        h4s.c(TAG, "onStart");
        super.onStart();
        ilq.b(this.mFrameContext);
        ux9 ux9Var = this.mFrameContext;
        if (ux9Var instanceof cdr) {
            ((cdr) ux9Var).e0 = false;
        }
        qet qetVar = this.mTaskInteractiveManager;
        if (qetVar != null) {
            qetVar.s();
        }
        h4s.e();
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
            return;
        }
        h4s.c(TAG, "onStop");
        super.onStop();
        ilq.b(this.mFrameContext);
        ux9 ux9Var = this.mFrameContext;
        if (ux9Var instanceof cdr) {
            ((cdr) ux9Var).e0 = true;
        }
        qet qetVar = this.mTaskInteractiveManager;
        if (qetVar != null) {
            qetVar.t();
        }
        h4s.e();
    }

    private void bindData(TBLiveDataModel tBLiveDataModel) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd0bc887", new Object[]{this, tBLiveDataModel});
        } else if (tBLiveDataModel != null) {
            this.mAutoShare = tBLiveDataModel.mInitParams.get(yj4.PARAM_AUTO_SHARE);
            this.mShareItemId = tBLiveDataModel.mInitParams.get(yj4.PARAM_SHAQRE_ITEM_ID);
            ux9 ux9Var = this.mFrameContext;
            if (ux9Var != null && (ux9Var.j() instanceof dba)) {
                this.mHideUI = ((dba) this.mFrameContext.j()).l0;
            }
            this.mSjsdItemId = tBLiveDataModel.mInitParams.get(yj4.PARAM_SJSD_ITEM_ID);
            this.mTimeMovingItemId = tBLiveDataModel.mInitParams.get(yj4.PARAM_TIMEMOVING_ITEM_ID);
            String str = tBLiveDataModel.mInitParams.get(yj4.PARAM_LANDSCAPE_VIDEO);
            if (TextUtils.isEmpty(str) || !Boolean.parseBoolean(str)) {
                z = false;
            }
            this.mLandscapeVideo = z;
            this.mToken = tBLiveDataModel.mInitParams.get(yj4.PARAM_PLAYER_TOKEN);
            this.mLiveSource = tBLiveDataModel.mInitParams.get("livesource");
            if (tBLiveDataModel instanceof TBLiveBizDataModel) {
                this.mPerfomenceTrackManager = ((TBLiveBizDataModel) tBLiveDataModel).perfomenceTrackManager;
            }
            this.mDirectPlayUrl = null;
            this.mMediaInfo = null;
            try {
                String str2 = tBLiveDataModel.mInitParams.get(yj4.PARAM_CUSTOM_PLAY_CTRL);
                if (!TextUtils.isEmpty(str2)) {
                    this.mMediaInfo = mxf.e(str2);
                }
                this.mDirectPlayUrl = mkr.b(this.mMediaInfo);
            } catch (Exception unused) {
            }
        }
    }

    private void showSwitchTVProgramTransitionView(String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97bdd84e", new Object[]{this, str, str2, new Boolean(z)});
            return;
        }
        if (this.mSwitchTVProgramTransitionView == null) {
            View inflate = LayoutInflater.from(this.mContext).inflate(R.layout.taolive_switch_tv_program_layout, (ViewGroup) null);
            this.mSwitchTVProgramTransitionView = inflate;
            inflate.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            initViews();
        }
        if (z) {
            this.mSwitchTVProgramNormalView.setVisibility(0);
            this.mSwitchTVProgramNewView.setVisibility(8);
            n8e n8eVar = this.mVideoFrame;
            if (n8eVar != null) {
                n8eVar.reset();
            }
            voj.a(this.mContext, str);
        } else {
            this.mSwitchTVProgramNormalView.setVisibility(8);
            this.mSwitchTVProgramNewView.setVisibility(0);
            if (!TextUtils.isEmpty(str2)) {
                this.mSwitchTVProgramTitle.setVisibility(0);
                this.mSwitchTVProgramTransitionView.findViewById(R.id.taolive_room_switch_tv_program_secant_line).setVisibility(0);
                TextView textView = this.mSwitchTVProgramTitle;
                textView.setText("《" + str2 + "》");
            } else {
                this.mSwitchTVProgramTitle.setVisibility(8);
                this.mSwitchTVProgramTransitionView.findViewById(R.id.taolive_room_switch_tv_program_secant_line).setVisibility(8);
            }
            this.mCircularProgressBar.setProgress(0.0f);
            ValueAnimator ofInt = ValueAnimator.ofInt(0, 100);
            this.valueAnimator = ofInt;
            ofInt.setDuration(pvs.z2() * 1000);
            this.valueAnimator.addUpdateListener(new j());
            this.valueAnimator.addListener(new k(str));
            this.mHasSwitch = false;
            this.valueAnimator.start();
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.mSwitchTVProgramTransitionView, "alpha", 0.0f, 1.0f);
        ofFloat.setDuration(500L);
        ofFloat.start();
        if (this.mSwitchTVProgramTransitionView.getParent() == null) {
            int i2 = R.id.taolive_root_view;
            if (((ViewGroup) ((Activity) this.mContext).findViewById(i2)) != null) {
                ((ViewGroup) ((Activity) this.mContext).findViewById(i2)).addView(this.mSwitchTVProgramTransitionView);
            }
        }
    }

    private void switchOfficialLiveRoom(OfficialLiveSwitchNextMessage officialLiveSwitchNextMessage) {
        String str;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2f4f12a", new Object[]{this, officialLiveSwitchNextMessage});
            return;
        }
        VideoInfo e2 = cxg.e(this.mLiveDataModel);
        if (e2 != null && e2.isOfficialType() && officialLiveSwitchNextMessage != null && !TextUtils.isEmpty(officialLiveSwitchNextMessage.targetLiveId) && !TextUtils.isEmpty(officialLiveSwitchNextMessage.targetLiveDetailUrl) && !officialLiveSwitchNextMessage.targetLiveId.equals(e2.liveId) && officialLiveSwitchNextMessage.officialLiveId.equals(e2.officialLiveInfo.officialLiveId) && !this.mInSwitchTaoLiveRoom && !this.mIsPaused) {
            if ("true".equals(officialLiveSwitchNextMessage.gapPeriod)) {
                if (TextUtils.isEmpty(officialLiveSwitchNextMessage.nextPlanStartTime)) {
                    str2 = "";
                } else {
                    str2 = officialLiveSwitchNextMessage.nextPlanStartTime;
                }
                str = String.format(hjr.I(), str2);
            } else {
                str = hjr.H();
            }
            Toast makeText = Toast.makeText(this.mContext, str, 1);
            makeText.setGravity(17, 0, 0);
            makeText.show();
            jyw jywVar = this.mHandler;
            if (jywVar != null) {
                jywVar.postDelayed(new d(officialLiveSwitchNextMessage), hjr.J());
            }
        }
    }

    @Override // tb.gtc
    public void onMessageReceived(int i2, Object obj) {
        TBTVProgramMessage tBTVProgramMessage;
        TBTVProgramInfo tBTVProgramInfo;
        t4l t4lVar;
        TBLiveDataModel tBLiveDataModel;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b152aef", new Object[]{this, new Integer(i2), obj});
        } else if (i2 == 102) {
            TBLiveDataModel tBLiveDataModel2 = this.mLiveDataModel;
            if (tBLiveDataModel2 != null && !liv.j(tBLiveDataModel2.mVideoInfo) && (obj instanceof JoinNotifyMessage)) {
                JoinNotifyMessage joinNotifyMessage = (JoinNotifyMessage) obj;
                String a2 = v4l.a(this.curWatchNum, uak.e(joinNotifyMessage), false, joinNotifyMessage.viewCountFormat, this.mLiveDataModel.mVideoInfo, this.mContext);
                ATaoLiveOpenEntity A = this.mFrameContext.A();
                if (A != null) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("watchNumberDes", a2);
                    A.accessListener(AccessListenerEnum.onLiveRoomWatchCountChange, hashMap);
                }
                IInteractiveProxy.h hVar = this.mTBLiveInteractiveManager;
                if (hVar != null) {
                    hVar.g(a2);
                }
            }
        } else if (i2 == 1039) {
            rbu.c0(this.mFrameContext, z9u.SHOW_PROGRAM, null);
            if ((obj instanceof TBTVProgramMessage) && (tBTVProgramInfo = (tBTVProgramMessage = (TBTVProgramMessage) obj).liveDO) != null && !TextUtils.isEmpty(tBTVProgramInfo.backgroundImageURL) && (t4lVar = this.mTaoliveShowByStatus) != null) {
                t4lVar.j(tBTVProgramMessage.liveDO.backgroundImageURL);
            }
        } else if (i2 != 888000111) {
            if (i2 != 888000113) {
                if (i2 != 1058) {
                    if (i2 == 1059 && (tBLiveDataModel = this.mLiveDataModel) != null && liv.j(tBLiveDataModel.mVideoInfo) && (obj instanceof TBLivePVMsg)) {
                        TBLivePVMsg tBLivePVMsg = (TBLivePVMsg) obj;
                        String a3 = v4l.a(this.curWatchNum, tBLivePVMsg.pv, true, tBLivePVMsg.viewCountFormat, this.mLiveDataModel.mVideoInfo, this.mContext);
                        ATaoLiveOpenEntity A2 = this.mFrameContext.A();
                        if (A2 != null) {
                            HashMap hashMap2 = new HashMap();
                            hashMap2.put("watchNumberDes", a3);
                            A2.accessListener(AccessListenerEnum.onLiveRoomWatchCountChange, hashMap2);
                        }
                        IInteractiveProxy.h hVar2 = this.mTBLiveInteractiveManager;
                        if (hVar2 != null) {
                            hVar2.g(a3);
                        }
                    }
                } else if (obj instanceof TBLiveSwitchMsg) {
                    switchTaoLiveRoom((TBLiveSwitchMsg) obj);
                }
            } else if (obj instanceof OfficialLiveEndMessage) {
                endOfficialLive((OfficialLiveEndMessage) obj);
            }
        } else if (obj instanceof OfficialLiveSwitchNextMessage) {
            switchOfficialLiveRoom((OfficialLiveSwitchNextMessage) obj);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:103:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x027c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void showByStatus(com.taobao.taolive.sdk.model.TBLiveDataModel r14) {
        /*
            Method dump skipped, instructions count: 704
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.taolive.room.controller2.OpenNormalRoomController.showByStatus(com.taobao.taolive.sdk.model.TBLiveDataModel):void");
    }

    @Override // tb.ccc
    public void handleMessage(Message message) {
        VideoInfo e2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
            return;
        }
        int i2 = message.what;
        if (i2 == 0) {
            rbu.i(this.mFrameContext, "stay", "time=10");
            this.mHandler.sendEmptyMessageDelayed(0, 10000L);
            this.mLastStayTimeStamp = System.currentTimeMillis();
            int i3 = this.mStayCheckCount + 1;
            this.mStayCheckCount = i3;
            if (i3 % 6 == 0) {
                this.mStayCheckCount = 0;
                VideoInfo c0 = up6.c0(this.mFrameContext);
                if (!(c0 == null || c0.broadCaster == null || !"1".equals(c0.roomStatus))) {
                    rbu.L(this.mFrameContext, z9u.CALC_STAY_TIME, "duration=60");
                    t4l t4lVar = this.mTaoliveShowByStatus;
                    if (t4lVar != null) {
                        t4lVar.l = System.currentTimeMillis();
                    }
                }
                ilq.b(this.mFrameContext);
            }
        } else if (i2 != 1) {
            if (i2 == 2) {
                sjr.g().c(FullScreenFrame.EVENT_LINKLIVE_INIT, null, this.frameContextUnique);
            } else if (i2 == 3) {
                e7w.j(this.mFrameContext, false);
            } else if (i2 == 4) {
                Object obj = message.obj;
                if (obj instanceof TBLiveSwitchMsg) {
                    TBLiveSwitchMsg tBLiveSwitchMsg = (TBLiveSwitchMsg) obj;
                    realSwitchTaoLiveRoom(tBLiveSwitchMsg.targetUrl, tBLiveSwitchMsg.targetLiveTitle, tBLiveSwitchMsg.targetLiveId.equals(this.mId));
                }
            }
        } else if (!this.mFirstFrameRendered && (e2 = cxg.e(this.mLiveDataModel)) != null && e2.broadCaster != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("feedId", e2.liveId);
            hashMap.put("feed_id", e2.liveId);
            hashMap.put(z9u.KEY_ACCOUNT_ID, e2.broadCaster.accountId);
            hashMap.put(z9u.KEY_LIVE_STATUS, e2.status + "");
            rbu.K(this.mFrameContext, z9u.CALC_ENTER_ERROR, hashMap);
        }
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onStatusChange(int i2, Object obj) {
        jbt jbtVar;
        dzd dzdVar;
        Map<String, Object> map;
        RecModel V0;
        boolean z;
        ux9 ux9Var;
        RecModel V02;
        Map<String, String> map2;
        VideoInfo videoInfo;
        AccountInfo accountInfo;
        ux9 ux9Var2;
        boolean z2 = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("defbc957", new Object[]{this, new Integer(i2), obj});
            return;
        }
        String str = TAG;
        h4s.c(str, "onStatusChange");
        super.onStatusChange(i2, obj);
        TBLiveDataModel tBLiveDataModel = (TBLiveDataModel) obj;
        if (tBLiveDataModel != null && tBLiveDataModel.mVideoInfo != null) {
            if (i2 == 1) {
                if (qvs.O() && (ux9Var2 = this.mFrameContext) != null && !ux9Var2.L()) {
                    ADaemon.resumeFrameLock(5);
                }
                if (!(!pvs.G0() || (videoInfo = tBLiveDataModel.mVideoInfo) == null || (accountInfo = videoInfo.broadCaster) == null)) {
                    if (accountInfo.frameLockForbidden) {
                        ADaemon.pauseFrameLock(2);
                    } else {
                        ADaemon.resumeFrameLock(2);
                    }
                }
                if (!pvs.F0()) {
                    ADaemon.pauseFrameLock(2);
                }
                initFrameInstaller();
                if (!TextUtils.equals(z9u.SOURCE_UPDOWNSWITCH, iba.B(vx9.f(this.mFrameContext)))) {
                    uvg.g().a("LIVE_CODE_BOOT_STAGE", SceneStage.SCENE_STAGE_T2);
                    x5t.f("LIVE_CODE_BOOT_STAGE", "stage:t2");
                }
                igq.n().p(str, "STATUS_INIT_SUCCESS");
                Map<String, String> map3 = tBLiveDataModel.mInitParams;
                if (map3 != null) {
                    iba.V0(map3.get(yj4.PARAM_TRACK_LIVEOPRT_ID), vx9.f(this.mFrameContext));
                }
                ux9 ux9Var3 = this.mFrameContext;
                if (!(!(ux9Var3 instanceof cdr) || (V02 = ((cdr) ux9Var3).w0()) == null || (map2 = V02.initParams) == null)) {
                    up6.F0(V02.initParams.get("content"), this.mFrameContext);
                    iba.j1(map2.get("spm"), vx9.f(this.mFrameContext));
                    iba.p1(V02.initParams.get("trackInfo"), vx9.f(this.mFrameContext));
                }
                if (qvs.F() && (ux9Var = this.mFrameContext) != null) {
                    ux9Var.f0(new com.taobao.taolive.room.business.mess.a());
                }
                bxl bxlVar = this.mPerfomenceTrackManager;
                if (bxlVar != null) {
                    bxlVar.i(this.mTrackId);
                }
                v2s.o().A().a("vanda", "STATUS_INIT_SUCCESS info = " + obj);
                e7w.s(this.mFrameContext, new f(tBLiveDataModel));
                sjr.g().a(this);
                e7w.q(this.mFrameContext, this, new g(this));
                int i3 = tBLiveDataModel.mVideoInfo.status;
                if (i3 == 4 || i3 == 0 || i3 == 3 || i3 == 1) {
                    boolean z3 = xj7.a() == 2;
                    e7w.j(this.mFrameContext, z3);
                    jyw jywVar = this.mHandler;
                    if (jywVar != null && z3) {
                        jywVar.sendEmptyMessageDelayed(3, 3000L);
                    }
                    ux9 ux9Var4 = this.mFrameContext;
                    if (ux9Var4 != null) {
                        e7w.l(ux9Var4, ux9Var4.p(), tBLiveDataModel);
                    }
                }
                ux9 ux9Var5 = this.mFrameContext;
                if ((ux9Var5 instanceof cdr) && (V0 = ((cdr) ux9Var5).w0()) != null) {
                    if (!pvs.l1() || !tBLiveDataModel.mVideoInfo.isOfficialLive()) {
                        z = false;
                    } else {
                        if (!V0.isFirst || V0.initParams == null) {
                            z = false;
                        } else {
                            refreshInitParams(tBLiveDataModel.mVideoInfo, V0);
                            z = true;
                        }
                        if (hasLiveUrlListChanged(V0.liveUrlList, tBLiveDataModel.mVideoInfo.liveUrlList)) {
                            VideoInfo videoInfo2 = tBLiveDataModel.mVideoInfo;
                            V0.h265 = videoInfo2.h265;
                            V0.rateAdapte = videoInfo2.rateAdapte;
                            V0.liveUrlList = videoInfo2.liveUrlList;
                            V0.mediaConfig = videoInfo2.mediaConfig;
                            V0.mediaSourceType = videoInfo2.pushFeature;
                            z = true;
                        }
                    }
                    if (pvs.k1() && V0.imageUrl == null) {
                        V0.imageUrl = tBLiveDataModel.mVideoInfo.coverImg;
                        z = true;
                    }
                    if (z) {
                        ((cdr) this.mFrameContext).m1(V0);
                        n8e n8eVar = this.mVideoFrame;
                        if (n8eVar != null) {
                            n8eVar.p(V0);
                        }
                        sjr.g().e("com.taobao.taolive.room.refresh.recmodel", V0);
                    }
                }
                System.currentTimeMillis();
                HashMap<String, String> hashMap = new HashMap<>();
                AccountInfo accountInfo2 = this.mLiveDataModel.mVideoInfo.broadCaster;
                if (accountInfo2 != null) {
                    hashMap.put(z9u.KEY_ACCOUNT_ID, accountInfo2.accountId);
                }
                Context context = this.mContext;
                if ((context instanceof Activity) && ((Activity) context).getIntent() != null) {
                    hashMap.put(yj4.PARAM_MEDIA_INFO_LIVEURL, ((Activity) this.mContext).getIntent().getDataString());
                }
                hashMap.put("livesource", iba.B(vx9.f(this.mFrameContext)));
                hashMap.put("live_id", this.mLiveDataModel.mVideoInfo.liveId);
                hashMap.put(z9u.KEY_ROOMTYPE, String.valueOf(this.mLiveDataModel.mVideoInfo.roomType));
                hashMap.put("newRoomType", String.valueOf(this.mLiveDataModel.mVideoInfo.newRoomType));
                hashMap.put("isLandScape", String.valueOf(up6.v0(this.mFrameContext)));
                ux9 ux9Var6 = this.mFrameContext;
                if (!(ux9Var6 instanceof air) || ((air) ux9Var6).A() == null) {
                    jbtVar = null;
                } else {
                    jbtVar = ((air) this.mFrameContext).A().taoliveOpenContext;
                    if (!(jbtVar == null || (map = jbtVar.f) == null)) {
                        Object obj2 = map.get("aliveChanel");
                        String valueOf = obj2 != null ? String.valueOf(obj2) : null;
                        if (!TextUtils.isEmpty(valueOf)) {
                            hashMap.put("channel", valueOf);
                        }
                    }
                }
                if (this.mTBLiveInteractiveManager == null) {
                    this.mTBLiveInteractiveManager = d9m.p().createInteractiveManager(this.mContext, this.mFrameContext, this.mCreateViewTime);
                    TaoliveOpenBizCodeEnum taoliveOpenBizCodeEnum = TaoliveOpenBizCodeEnum.TaoLiveOpenBizCode_OpenWatch;
                    if (!(!taoliveOpenBizCodeEnum.name().equals(jbtVar.b) || (dzdVar = jbtVar.d) == null || dzdVar.f() == null)) {
                        this.mTBLiveInteractiveManager.i(jbtVar.d.f().intValue());
                    }
                    if (taoliveOpenBizCodeEnum.name().equals(jbtVar.b) || TaoliveOpenBizCodeEnum.TaoLiveOpenBizCode_Tab2.name().equals(jbtVar.b) || TaoliveOpenBizCodeEnum.TaoLiveOpenBizCode_ShopTab3.name().equals(jbtVar.b)) {
                        this.mTBLiveInteractiveManager.i(jbtVar.d.f().intValue());
                        this.mTBLiveInteractiveManager.w(!ComponentGroupConfig.componentEntranceHidden(ComponentGroupConfig.GROUP_TOP, ComponentGroupConfig.TOP_WATCH_NUM, this.mFrameContext));
                    }
                }
                sj9.a(this.mFrameContext);
                cv1 f2 = vx9.f(this.mFrameContext);
                h hVar = (f2 == null || f2.u == null) ? null : new h(this, f2);
                if (this.mFrameContext.j() != null) {
                    this.mFrameContext.j().F(this.mFrameContext.j().h());
                    this.mFrameContext.j().D("normal");
                }
                this.mTBLiveInteractiveManager.l(this.mLiveDataModel.mVideoInfo, up6.r(this.mFrameContext), this.mLiveSource, hashMap, hVar);
                this.mTBLiveInteractiveManager.j(new hif(this.mFrameContext));
                this.mTBLiveInteractiveManager.e(new fif(this.mFrameContext));
                this.mTBLiveInteractiveManager.A(new ogf(this.mFrameContext, this));
                this.mTBLiveInteractiveManager.a(new ehf());
                this.mTBLiveInteractiveManager.r(new y2h(this.mContext, this.mFrameContext));
                this.mTBLiveInteractiveManager.h(new zyg(this.mContext, this.mFrameContext, this.mLiveDataModel));
                this.mTBLiveInteractiveManager.q().h(new lhf(this.mTrackId, this.mContext, this.mFrameContext, this.mPerfomenceTrackManager));
                ((t54) this.mFrameContext).F0(this.mTBLiveInteractiveManager);
                if (tBLiveDataModel instanceof TBLiveBizDataModel) {
                    ((TBLiveBizDataModel) tBLiveDataModel).liveInteractiveManager = this.mTBLiveInteractiveManager;
                }
                t4l t4lVar = this.mTaoliveShowByStatus;
                if (t4lVar != null) {
                    t4lVar.m(this.mTBLiveInteractiveManager);
                }
                this.mTaskInteractiveManager = new qet(this.mTBLiveInteractiveManager, this.mLiveDataModel.mVideoInfo, false, this.mFrameContext);
                if (((cdr) this.mFrameContext).w0() != null) {
                    VideoInfo videoInfo3 = tBLiveDataModel.mVideoInfo;
                    if (((cdr) this.mFrameContext).w0().adEurlParams == null) {
                        z2 = false;
                    }
                    videoInfo3.isAD = z2;
                    this.mTaskInteractiveManager.u(((cdr) this.mFrameContext).w0().adEurlParams);
                }
                this.mTBLiveInteractiveManager.y();
                this.mTBLiveInteractiveManager.z();
                if (!(this.mFrameContext == null || this.mLiveDataModel.mVideoInfo.broadCaster == null || (!qvs.b0() && !qvs.y()))) {
                    IInputProxy o = d9m.o();
                    ux9 ux9Var7 = this.mFrameContext;
                    VideoInfo videoInfo4 = this.mLiveDataModel.mVideoInfo;
                    String str2 = videoInfo4.liveId;
                    AccountInfo accountInfo3 = videoInfo4.broadCaster;
                    o.atmosphereInstanceGetAtmosphereRes(ux9Var7, str2, accountInfo3.accountId, accountInfo3.encodeAccountId);
                }
                startLiveBizRequest();
                showGoodListsIfNeed();
                redirRoom(this.mLiveDataModel);
                bxl bxlVar2 = this.mPerfomenceTrackManager;
                if (bxlVar2 != null) {
                    bxlVar2.B(this.mTrackId);
                }
                rbu.h(this.mFrameContext, "", "timeMovingItemId=" + this.mTimeMovingItemId, "sjsdItemId=" + this.mSjsdItemId);
            }
            h4s.e();
        }
    }
}
