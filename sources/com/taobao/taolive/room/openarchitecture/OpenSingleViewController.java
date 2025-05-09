package com.taobao.taolive.room.openarchitecture;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Outline;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.ViewStub;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.core.app.NotificationCompat;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alilive.adapter.uikit.AliUrlImageView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.alilive.aliliveframework.frame.FrameManager;
import com.taobao.alilive.aliliveframework.frame.IComponent;
import com.taobao.android.live.plugin.atype.flexalocal.fullscreen.FullScreenFrame;
import com.taobao.android.live.plugin.atype.flexalocal.profile.LiveAvatarNewFrame;
import com.taobao.android.live.plugin.proxy.FlexaLiveX;
import com.taobao.android.live.plugin.proxy.good.IGoodProxy;
import com.taobao.android.live.plugin.proxy.kmp.ICommentSendProxy;
import com.taobao.android.live.plugin.proxy.smartlanding.ISmartLandingProxy;
import com.taobao.android.live.plugin.proxy.universal.IUniversalProxy;
import com.taobao.schedule.ViewProxy;
import com.taobao.tao.BaseActivity;
import com.taobao.taobao.R;
import com.taobao.taolive.movehighlight.controller.TaoliveHighlightController;
import com.taobao.taolive.room.H5EmbedView;
import com.taobao.taolive.room.afccoldlunch.SimpleVideoInfo;
import com.taobao.taolive.room.controller2.OpenNormalRoomController;
import com.taobao.taolive.room.datamanager.model.RecModel;
import com.taobao.taolive.room.openarchitecture.entity.ATaoLiveOpenEntity;
import com.taobao.taolive.room.openarchitecture.entity.TaoliveOpenBizCodeEnum;
import com.taobao.taolive.room.openarchitecture.entity.TaoliveOpenLiveRoom;
import com.taobao.taolive.room.openarchitecture.kmp.OpenArchSingleEntityAdapter;
import com.taobao.taolive.room.openarchitecture.listener.AccessListenerEnum;
import com.taobao.taolive.room.openarchitecture.listener.WatchPlatformListenerEnum;
import com.taobao.taolive.room.openarchitecture.opencompontent.ability.OpenAbilityCompontentTypeEnum;
import com.taobao.taolive.room.player.standard.manager.LiveMediaManager;
import com.taobao.taolive.room.player.warm.LiveRoomWarmManager;
import com.taobao.taolive.room.service.IPlayPublicService;
import com.taobao.taolive.room.ui.model.TBLiveBizDataModel;
import com.taobao.taolive.room.ui.newstyle.utils.NewStyleUtils;
import com.taobao.taolive.sdk.business.IRemoteExtendListener;
import com.taobao.taolive.sdk.configurable.ComponentGroupConfig;
import com.taobao.taolive.sdk.configurable.ITaoLiveComponentConfig;
import com.taobao.taolive.sdk.core.impl.TBLiveDataProvider;
import com.taobao.taolive.sdk.core.interfaces.ISmallWindowStrategy;
import com.taobao.taolive.sdk.model.common.AccountInfo;
import com.taobao.taolive.sdk.model.common.ChatRoomInfo;
import com.taobao.taolive.sdk.model.common.FandomInfo;
import com.taobao.taolive.sdk.model.common.LiveItem;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import com.taobao.taolive.sdk.model.message.MessageTypeFilter;
import com.taobao.taolive.sdk.monitor.SceneStage;
import com.taobao.taolive.sdk.ui.media.IMediaPlayer;
import com.taobao.taolive.sdk.utils.VideoStatus;
import com.taobao.uikit.extend.component.TBErrorViewWidget;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import mtopsdk.mtop.util.ErrorConstant;
import tb.air;
import tb.amr;
import tb.azd;
import tb.bia;
import tb.bl9;
import tb.bon;
import tb.btd;
import tb.bxl;
import tb.c1j;
import tb.cba;
import tb.cdr;
import tb.cf;
import tb.con;
import tb.cpr;
import tb.cwd;
import tb.cxa;
import tb.czd;
import tb.d4s;
import tb.d9m;
import tb.dba;
import tb.dir;
import tb.dt9;
import tb.du4;
import tb.dxa;
import tb.e3c;
import tb.e4l;
import tb.e7w;
import tb.egv;
import tb.et9;
import tb.f1j;
import tb.f8c;
import tb.fif;
import tb.fkx;
import tb.fxa;
import tb.g9c;
import tb.gbt;
import tb.ggv;
import tb.gmr;
import tb.gnk;
import tb.h4s;
import tb.hgb;
import tb.hjr;
import tb.hlc;
import tb.huk;
import tb.hw0;
import tb.iba;
import tb.ibt;
import tb.igq;
import tb.iw0;
import tb.iz1;
import tb.k6m;
import tb.k9e;
import tb.l6m;
import tb.liv;
import tb.lzk;
import tb.m2g;
import tb.mgf;
import tb.n23;
import tb.n8e;
import tb.naj;
import tb.nwa;
import tb.nxq;
import tb.o3s;
import tb.ohd;
import tb.or;
import tb.phf;
import tb.pvs;
import tb.pwg;
import tb.q2g;
import tb.q6f;
import tb.q6q;
import tb.qdd;
import tb.qsj;
import tb.qvs;
import tb.rbt;
import tb.rbu;
import tb.rc;
import tb.rjr;
import tb.s3c;
import tb.si8;
import tb.sj9;
import tb.sjr;
import tb.skv;
import tb.sya;
import tb.t0;
import tb.t0u;
import tb.t2o;
import tb.t4w;
import tb.toy;
import tb.txb;
import tb.tz3;
import tb.u4w;
import tb.u90;
import tb.ubt;
import tb.up6;
import tb.uvg;
import tb.uwa;
import tb.uwt;
import tb.uyg;
import tb.v2s;
import tb.v73;
import tb.vc;
import tb.vfo;
import tb.vnm;
import tb.voj;
import tb.vwl;
import tb.vx9;
import tb.w3d;
import tb.w73;
import tb.wng;
import tb.wwa;
import tb.x5l;
import tb.x5t;
import tb.xca;
import tb.y5l;
import tb.y6j;
import tb.yh6;
import tb.yj4;
import tb.yqq;
import tb.yrk;
import tb.z9u;
import tb.zjd;
import tb.zlr;
import tb.znm;
import tb.zzn;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class OpenSingleViewController implements IRemoteExtendListener, TBLiveDataProvider.c, cpr.b, s3c, hlc.a, t4w, w3d, huk, hgb.a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "OpenSingleViewController";
    private boolean delayDidAppear;
    public boolean hasDidAppear;
    public boolean hasExectDidAppear;
    public boolean hasSurfaceRender;
    private boolean hasSurfaceUpdate;
    private iz1 highlightPreloadTimeMove;
    private boolean isFromBackground;
    public View itemView;
    private v73 mCardAnalysis;
    public BaseFrame mComponentManager;
    public Context mContext;
    private hlc mDataProvider;
    private boolean mEnableCompensateSEIDispatcherInit;
    private View mErrorView;
    private et9 mFollowChangeListener;
    private cba mGlobalContext;
    private String mHitPreRequestLiveId;
    public boolean mIsDestroyed;
    private OpenArchSingleEntityAdapter mKMPEntityAdapter;
    public TBLiveBizDataModel mLiveDataModel;
    private f1j mMoreSwitchGuideTip;
    private naj mMultiRoomVideoControllerObserver;
    public bxl mPerfomenceTrackManager;
    public RecModel mRecModel;
    private ohd mRecommendPop;
    public String mRequestAccountId;
    public String mRequestLiveId;
    public BaseFrame mRoomController;
    public ViewGroup mRoomLayout;
    private q6q mSmartLayerManager;
    private dir mTBLIveRoomEngine;
    private String mTrackId;
    private skv mUpdownSwitchStateObserver;
    public n8e mVideoFrame;
    private Object seiDispatcher;
    private ATaoLiveOpenEntity taoLiveOpenEntity;
    private long mFirstTime = 0;
    public cdr mFrameContext = new cdr();
    private boolean mDidAppear = false;
    private boolean mHasDisappear = false;
    private boolean mEnableAdjustBBConnectionVideoSize = false;
    public String frameContextUnique = null;
    private final Handler mMainHandler = new Handler(Looper.getMainLooper());
    private s3c mEnterEndEventObserver = new l();
    private final zjd mResetMediaListener = new h();
    private final k9e mIVideoStatusChangeListener = new i();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                sjr.g().c("com.taobao.taolive.room.killself", null, OpenSingleViewController.this.frameContextUnique);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class b implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ImageView f13175a;

        public b(ImageView imageView) {
            this.f13175a = imageView;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                sjr.g().c("com.taobao.taolive.room.more_btn_click", this.f13175a, OpenSingleViewController.this.frameContextUnique);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class c extends ViewOutlineProvider {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c(OpenSingleViewController openSingleViewController) {
        }

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/room/openarchitecture/OpenSingleViewController$12");
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7054f590", new Object[]{this, view, outline});
            } else {
                outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), 12.0f);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class d extends ViewOutlineProvider {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d(OpenSingleViewController openSingleViewController) {
        }

        public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/room/openarchitecture/OpenSingleViewController$13");
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7054f590", new Object[]{this, view, outline});
            } else {
                outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), 0.0f);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class f implements ISmartLandingProxy.d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public f() {
        }

        @Override // com.taobao.android.live.plugin.proxy.smartlanding.ISmartLandingProxy.d
        public boolean onTaskActionListener(String str, String str2, JSONObject jSONObject, JSONArray jSONArray, JSONObject jSONObject2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("fd5561e5", new Object[]{this, str, str2, jSONObject, jSONArray, jSONObject2})).booleanValue();
            }
            o3s.b(OpenSingleViewController.TAG, "SmartLanding createSmartLayer onTaskActionListener popId " + str2 + " actionData " + jSONObject);
            if (jSONObject != null) {
                String string = jSONObject.getString(yh6.CONFIG_KEY_TEMPLATE_NAME);
                String string2 = jSONObject.getString("smartBizId");
                String string3 = jSONObject.getString("benefitType");
                ViewGroup viewGroup = OpenSingleViewController.this.mRoomLayout;
                ViewGroup viewGroup2 = viewGroup != null ? (ViewGroup) viewGroup.findViewById(R.id.taolive_open_popview_frame) : null;
                if (viewGroup2 == null) {
                    OpenSingleViewController openSingleViewController = OpenSingleViewController.this;
                    viewGroup2 = iba.c(openSingleViewController.mContext, vx9.f(openSingleViewController.mFrameContext));
                }
                HashMap<String, String> hashMap = new HashMap<>();
                hashMap.put(yj4.PARAM_FANDOM_INTERACTTYPE, string3);
                hashMap.put(yh6.CONFIG_KEY_TEMPLATE_NAME, string);
                hashMap.put("popId", str2);
                if (OpenSingleViewController.access$1100(OpenSingleViewController.this) != null) {
                    sj9.D("SmartLayer showSmartLayerWithBizId ");
                    q6q access$1100 = OpenSingleViewController.access$1100(OpenSingleViewController.this);
                    OpenSingleViewController openSingleViewController2 = OpenSingleViewController.this;
                    HashMap<String, Object> b = q6q.b(openSingleViewController2.mFrameContext, openSingleViewController2.mLiveDataModel, jSONObject);
                    OpenSingleViewController openSingleViewController3 = OpenSingleViewController.this;
                    access$1100.k(string2, hashMap, b, (Activity) openSingleViewController3.mContext, openSingleViewController3.mFrameContext, viewGroup2, new q6q.a(OpenSingleViewController.access$1200(OpenSingleViewController.this), str, str2));
                }
            }
            return true;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class g implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                OpenSingleViewController.access$500(OpenSingleViewController.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class h implements zjd {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public h() {
        }

        public void a(IPlayPublicService iPlayPublicService) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a333f81", new Object[]{this, iPlayPublicService});
                return;
            }
            o3s.b(OpenSingleViewController.TAG, "resetMedia后,更新setIPlayPublicService：" + iPlayPublicService);
            OpenSingleViewController.access$1300(OpenSingleViewController.this, iPlayPublicService);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class i implements k9e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public i() {
        }

        @Override // tb.k9e
        public void onStatusChange(int i, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("defbc957", new Object[]{this, new Integer(i), obj});
            } else if (i == 3) {
                OpenSingleViewController openSingleViewController = OpenSingleViewController.this;
                rc.f(openSingleViewController.mContext, openSingleViewController.mFrameContext);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class j implements View.OnLayoutChangeListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public j() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            WindowInsets rootWindowInsets;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("899df952", new Object[]{this, view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), new Integer(i7), new Integer(i8)});
                return;
            }
            v2s.o().A().a("TBLive", "onLayoutChange ========= ");
            rootWindowInsets = ((Activity) OpenSingleViewController.this.mContext).getWindow().getDecorView().getRootWindowInsets();
            cwd A = v2s.o().A();
            A.a("TBLive", "mInsets ========= " + rootWindowInsets);
            if (!nxq.b((Activity) OpenSingleViewController.this.mContext) || rootWindowInsets == null) {
                iba.M0(false, vx9.f(OpenSingleViewController.this.mFrameContext));
                iba.Y(0, vx9.f(OpenSingleViewController.this.mFrameContext));
                iba.b1(0, vx9.f(OpenSingleViewController.this.mFrameContext));
            } else {
                boolean r = nxq.r(OpenSingleViewController.this.mContext, rootWindowInsets);
                iba.M0(r, vx9.f(OpenSingleViewController.this.mFrameContext));
                if (r) {
                    cwd A2 = v2s.o().A();
                    A2.a("TBLive", "mCutoutHeight = " + xca.b);
                    int g = nxq.g(OpenSingleViewController.this.mContext, rootWindowInsets);
                    iba.Y(g, vx9.f(OpenSingleViewController.this.mFrameContext));
                    iba.b1(g, vx9.f(OpenSingleViewController.this.mFrameContext));
                } else {
                    iba.Y(0, vx9.f(OpenSingleViewController.this.mFrameContext));
                    iba.b1(0, vx9.f(OpenSingleViewController.this.mFrameContext));
                }
            }
            gmr.a(OpenSingleViewController.this.mFrameContext.j());
            ((Activity) OpenSingleViewController.this.mContext).getWindow().getDecorView().removeOnLayoutChangeListener(this);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class k implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public k() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            cdr cdrVar;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else if (or.a(OpenSingleViewController.this.mFrameContext, OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_CustomizedSimpleLive) && (cdrVar = OpenSingleViewController.this.mFrameContext) != null && cdrVar.A() != null) {
                o3s.b("TBLVOpenShopCardComponent", "click roomLayout");
                OpenSingleViewController.this.mFrameContext.A().accessListener(AccessListenerEnum.onClickCleanScreen, Boolean.FALSE);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class l implements s3c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public l() {
        }

        @Override // tb.s3c
        public String bizCode() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("36951559", new Object[]{this});
            }
            return OpenSingleViewController.TAG;
        }

        @Override // tb.s3c
        public String[] observeEvents() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String[]) ipChange.ipc$dispatch("37b2602b", new Object[]{this});
            }
            return new String[]{"com.taobao.taolive.room.ent.opt.animation.end"};
        }

        @Override // tb.s3c
        public String observeUniqueIdentification() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("4914bdfe", new Object[]{this});
            }
            cdr cdrVar = OpenSingleViewController.this.mFrameContext;
            if (cdrVar == null) {
                return null;
            }
            return cdrVar.C();
        }

        @Override // tb.s3c
        public void onEvent(String str, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c3897928", new Object[]{this, str, obj});
            } else if ("com.taobao.taolive.room.ent.opt.animation.end".equals(str)) {
                cdr cdrVar = OpenSingleViewController.this.mFrameContext;
                if (!(cdrVar == null || cdrVar.j() == null)) {
                    OpenSingleViewController.this.mFrameContext.j().m0(true);
                }
                OpenSingleViewController.access$000(OpenSingleViewController.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class m implements g9c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public m() {
        }

        @Override // tb.g9c
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("67b48357", new Object[]{this});
                return;
            }
            OpenSingleViewController.access$400(OpenSingleViewController.this);
            if (hw0.l()) {
                t0u.c(OpenSingleViewController.this.mContext, "极简启动 提前加载simple数据 失败");
            }
        }

        @Override // tb.g9c
        public void b(SimpleVideoInfo simpleVideoInfo) {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e066f337", new Object[]{this, simpleVideoInfo});
                return;
            }
            OpenSingleViewController openSingleViewController = OpenSingleViewController.this;
            RecModel recModel = openSingleViewController.mRecModel;
            if (recModel != null && recModel.initParams != null && simpleVideoInfo != null) {
                OpenSingleViewController.access$100(openSingleViewController, simpleVideoInfo);
                OpenSingleViewController.this.mRecModel.initParams.put(yj4.PARAM_ITEM_IDS, simpleVideoInfo.holdItemIds);
                OpenSingleViewController.this.mRecModel.initParams.put(yj4.PARAM_ITEM_HOLD_TYPE, simpleVideoInfo.itemHoldType);
                if (!TextUtils.isEmpty(simpleVideoInfo.timeMovingId) && yqq.m(simpleVideoInfo.timeMovingId) != 0) {
                    OpenSingleViewController.this.mRecModel.initParams.put("keyPointId", simpleVideoInfo.timeMovingId);
                    Map<String, String> map = OpenSingleViewController.this.mRecModel.initParams;
                    if ("customizeView".equals(simpleVideoInfo.itemHoldType)) {
                        str = simpleVideoInfo.dispatchItemID;
                    } else {
                        str = simpleVideoInfo.holdItemIds;
                    }
                    map.put(yj4.PARAM_TIMEMOVING_ITEM_ID, str);
                    OpenSingleViewController.this.mRecModel.initParams.put(yj4.PARAM_PRODUCT_TYPE, com.taobao.live.timemove.base.data.RecModel.MEDIA_TYPE_TIMEMOVE);
                }
                JSONObject d = fkx.d(OpenSingleViewController.this.mRecModel.initParams.get(yj4.PARAM_TRANSPARENT_PARAMS));
                if (d == null) {
                    d = new JSONObject();
                }
                d.put("dispatchItemID", (Object) simpleVideoInfo.dispatchItemID);
                d.put("simpleTransParams", (Object) simpleVideoInfo.simpleTransParams);
                OpenSingleViewController.this.mRecModel.initParams.put(yj4.PARAM_TRANSPARENT_PARAMS, d.toJSONString());
                OpenSingleViewController.access$200(OpenSingleViewController.this, simpleVideoInfo.disPatchTrackInfo);
                OpenSingleViewController.access$300(OpenSingleViewController.this, simpleVideoInfo.liveId);
                if (hw0.l()) {
                    String str2 = "看点态";
                    sj9.D("极简启动 提前加载simple数据 ".concat(TextUtils.isEmpty(simpleVideoInfo.timeMovingId) ? "直播态" : str2));
                    Context context = OpenSingleViewController.this.mContext;
                    if (TextUtils.isEmpty(simpleVideoInfo.timeMovingId)) {
                        str2 = "直播态";
                    }
                    t0u.c(context, "极简启动 提前加载simple数据 ".concat(str2));
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class n implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public n() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            o3s.b(OpenSingleViewController.TAG, "onRealDidAppear首帧未出现，1.3s 结束, liveContextKey = " + OpenSingleViewController.this.mFrameContext.p());
            OpenSingleViewController.access$500(OpenSingleViewController.this);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class o extends MessageTypeFilter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public o(OpenSingleViewController openSingleViewController) {
        }

        public static /* synthetic */ Object ipc$super(o oVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/room/openarchitecture/OpenSingleViewController$5");
        }

        @Override // com.taobao.taolive.sdk.model.message.MessageTypeFilter
        public boolean filter(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("c81f1ee8", new Object[]{this, new Integer(i)})).booleanValue();
            }
            if (i == 1004 || i == 1006) {
                return true;
            }
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class p implements qdd {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Runnable f13186a;
        public final /* synthetic */ si8 b;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
        public class a implements View.OnClickListener {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* compiled from: Taobao */
            /* renamed from: com.taobao.taolive.room.openarchitecture.OpenSingleViewController$p$a$a  reason: collision with other inner class name */
            /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
            public class C0752a implements e3c {
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public C0752a(a aVar) {
                }

                public Map<String, Object> a() {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        return (Map) ipChange.ipc$dispatch("516a2e9c", new Object[]{this});
                    }
                    return null;
                }

                public String b() {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        return (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this});
                    }
                    return "onRetry";
                }
            }

            public a() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else {
                    p.this.b.b(new C0752a(this));
                }
            }
        }

        public p(Runnable runnable, si8 si8Var) {
            this.f13186a = runnable;
            this.b = si8Var;
        }

        @Override // tb.qdd
        public void b(Map<String, ?> map, Map<String, ?> map2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("20efca30", new Object[]{this, map, map2});
                return;
            }
            Runnable runnable = this.f13186a;
            if (runnable != null) {
                runnable.run();
            }
        }

        @Override // tb.qdd
        public void a(Map<String, ?> map, zzn zznVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("29d70945", new Object[]{this, map, zznVar});
            } else if (OpenSingleViewController.access$600(OpenSingleViewController.this) != null) {
                OpenSingleViewController.access$600(OpenSingleViewController.this).setVisibility(0);
                TextView textView = (TextView) OpenSingleViewController.access$600(OpenSingleViewController.this).findViewById(R.id.taolive_error_title);
                Object obj = map.get("title");
                String str = "";
                textView.setText(obj != null ? obj.toString() : str);
                TextView textView2 = (TextView) OpenSingleViewController.access$600(OpenSingleViewController.this).findViewById(R.id.taolive_error_button);
                Object obj2 = map.get("buttonText");
                if (obj2 != null) {
                    str = obj2.toString();
                }
                textView2.setText(str);
                textView2.setOnClickListener(new a());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class q implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public q() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                OpenSingleViewController.access$700(OpenSingleViewController.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class r implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public r() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                OpenSingleViewController.access$700(OpenSingleViewController.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class s implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public s() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else if (pvs.k0()) {
                OpenSingleViewController.access$800(OpenSingleViewController.this);
            } else {
                OpenSingleViewController.access$400(OpenSingleViewController.this);
            }
        }
    }

    static {
        t2o.a(779092987);
        t2o.a(806355975);
        t2o.a(806356086);
        t2o.a(806356196);
        t2o.a(806355016);
        t2o.a(806356090);
        t2o.a(779093080);
        t2o.a(779093061);
        t2o.a(806355884);
        t2o.a(806356088);
    }

    public OpenSingleViewController() {
        this.mFrameContext.Y(new wwa());
    }

    public static /* synthetic */ void access$000(OpenSingleViewController openSingleViewController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ea9d0e5", new Object[]{openSingleViewController});
        } else {
            openSingleViewController.onDelayDidAppear();
        }
    }

    public static /* synthetic */ void access$100(OpenSingleViewController openSingleViewController, SimpleVideoInfo simpleVideoInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34988523", new Object[]{openSingleViewController, simpleVideoInfo});
        } else {
            openSingleViewController.addSimplePageTrackFeedId(simpleVideoInfo);
        }
    }

    public static /* synthetic */ boolean access$1000(OpenSingleViewController openSingleViewController, dt9 dt9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("598b563a", new Object[]{openSingleViewController, dt9Var})).booleanValue();
        }
        return openSingleViewController.checkFollowAccountId(dt9Var);
    }

    public static /* synthetic */ q6q access$1100(OpenSingleViewController openSingleViewController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (q6q) ipChange.ipc$dispatch("f2d6f892", new Object[]{openSingleViewController});
        }
        return openSingleViewController.mSmartLayerManager;
    }

    public static /* synthetic */ cba access$1200(OpenSingleViewController openSingleViewController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cba) ipChange.ipc$dispatch("18aef503", new Object[]{openSingleViewController});
        }
        return openSingleViewController.mGlobalContext;
    }

    public static /* synthetic */ void access$1300(OpenSingleViewController openSingleViewController, IPlayPublicService iPlayPublicService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dbe1d299", new Object[]{openSingleViewController, iPlayPublicService});
        } else {
            openSingleViewController.setIPlayPublicService(iPlayPublicService);
        }
    }

    public static /* synthetic */ void access$200(OpenSingleViewController openSingleViewController, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80518a2d", new Object[]{openSingleViewController, str});
        } else {
            openSingleViewController.updateDisPatchTrackInfo(str);
        }
    }

    public static /* synthetic */ void access$300(OpenSingleViewController openSingleViewController, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f78198c", new Object[]{openSingleViewController, str});
        } else {
            openSingleViewController.getLiveDetail(str);
        }
    }

    public static /* synthetic */ void access$400(OpenSingleViewController openSingleViewController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f86db561", new Object[]{openSingleViewController});
        } else {
            openSingleViewController.getLiveDetail();
        }
    }

    public static /* synthetic */ void access$500(OpenSingleViewController openSingleViewController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12deae80", new Object[]{openSingleViewController});
        } else {
            openSingleViewController.surfaceRenderRequest();
        }
    }

    public static /* synthetic */ View access$600(OpenSingleViewController openSingleViewController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("a2a53621", new Object[]{openSingleViewController});
        }
        return openSingleViewController.mErrorView;
    }

    public static /* synthetic */ void access$700(OpenSingleViewController openSingleViewController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47c0a0be", new Object[]{openSingleViewController});
        } else {
            openSingleViewController.forceRefresh();
        }
    }

    public static /* synthetic */ void access$800(OpenSingleViewController openSingleViewController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("623199dd", new Object[]{openSingleViewController});
        } else {
            openSingleViewController.performRequestLiveDetail();
        }
    }

    public static /* synthetic */ ATaoLiveOpenEntity access$900(OpenSingleViewController openSingleViewController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ATaoLiveOpenEntity) ipChange.ipc$dispatch("6b356b55", new Object[]{openSingleViewController});
        }
        return openSingleViewController.taoLiveOpenEntity;
    }

    private void addClickListnerForSimpleLiveRoom() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b24b533", new Object[]{this});
        } else {
            this.mRoomLayout.setOnClickListener(new k());
        }
    }

    private void addSimplePageTrackFeedId(SimpleVideoInfo simpleVideoInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2931e928", new Object[]{this, simpleVideoInfo});
        } else if (simpleVideoInfo != null) {
            HashMap hashMap = new HashMap();
            if (!TextUtils.isEmpty(simpleVideoInfo.liveId)) {
                hashMap.put("feed_id", simpleVideoInfo.liveId);
            }
            if (!TextUtils.isEmpty(simpleVideoInfo.accountId)) {
                hashMap.put(z9u.KEY_ACCOUNT_ID, simpleVideoInfo.accountId);
            } else if (!TextUtils.isEmpty(simpleVideoInfo.encodeAccountId)) {
                hashMap.put(z9u.KEY_ACCOUNT_ID, simpleVideoInfo.encodeAccountId);
            }
            if (!TextUtils.isEmpty(simpleVideoInfo.encodeAccountId)) {
                hashMap.put("simple_encode_account_id", simpleVideoInfo.encodeAccountId);
            }
            du4.c(this.mFrameContext, rbu.t(this.mFrameContext, this.mContext), hashMap);
        }
    }

    private void bindingOpenPlatformListener() {
        ATaoLiveOpenEntity aTaoLiveOpenEntity;
        cf cfVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("252b9c5d", new Object[]{this});
        } else if (this.mDidAppear && (aTaoLiveOpenEntity = this.taoLiveOpenEntity) != null && (cfVar = aTaoLiveOpenEntity.eventCompontent) != null && cfVar.c() != null && this.taoLiveOpenEntity.eventCompontent.c().P() != null) {
            this.taoLiveOpenEntity.eventCompontent.c().b0(new y5l(this));
            this.taoLiveOpenEntity.eventCompontent.c().a0(new x5l(this));
            this.taoLiveOpenEntity.eventCompontent.c().Y(new e4l(this));
        }
    }

    private boolean checkAccountId(VideoInfo videoInfo) {
        String str;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6a2e5b6a", new Object[]{this, videoInfo})).booleanValue();
        }
        if (TextUtils.isEmpty(this.mRequestAccountId) || videoInfo.broadCaster == null) {
            return false;
        }
        if (isOfficialType(videoInfo)) {
            str = this.mRequestAccountId;
            str2 = videoInfo.officialLiveInfo.accountId;
        } else {
            str = this.mRequestAccountId;
            str2 = videoInfo.broadCaster.accountId;
        }
        return str.equals(str2);
    }

    private boolean checkFollowAccountId(dt9 dt9Var) {
        TBLiveBizDataModel tBLiveBizDataModel;
        VideoInfo videoInfo;
        AccountInfo accountInfo;
        TBLiveBizDataModel tBLiveBizDataModel2;
        VideoInfo videoInfo2;
        VideoInfo.OfficialLiveInfo officialLiveInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8e95713a", new Object[]{this, dt9Var})).booleanValue();
        }
        if (TaoliveOpenBizCodeEnum.TaoLiveOpenBizCode_OpenWatch.name().equals(this.taoLiveOpenEntity.bizCode) && gnk.a().d(this.mLiveDataModel)) {
            if (gnk.a().f(this.mLiveDataModel) && (TextUtils.isEmpty(dt9Var.f18052a) || (tBLiveBizDataModel2 = this.mLiveDataModel) == null || (videoInfo2 = tBLiveBizDataModel2.mVideoInfo) == null || (officialLiveInfo = videoInfo2.officialLiveInfo) == null || !dt9Var.f18052a.equals(officialLiveInfo.accountId))) {
                return true;
            }
            if (!gnk.a().f(this.mLiveDataModel) && (TextUtils.isEmpty(dt9Var.f18052a) || (tBLiveBizDataModel = this.mLiveDataModel) == null || (videoInfo = tBLiveBizDataModel.mVideoInfo) == null || (accountInfo = videoInfo.broadCaster) == null || !dt9Var.f18052a.equals(accountInfo.accountId))) {
                return true;
            }
        }
        return false;
    }

    private boolean checkLiveDetailWithBindModel(VideoInfo videoInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e3fcf689", new Object[]{this, videoInfo})).booleanValue();
        }
        RecModel recModel = this.mRecModel;
        if (recModel == null || videoInfo == null || TextUtils.isEmpty(recModel.liveId) || !this.mRecModel.liveId.equals(videoInfo.liveId)) {
            return false;
        }
        return true;
    }

    private boolean checkLiveId(VideoInfo videoInfo) {
        String str;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8be7c4bb", new Object[]{this, videoInfo})).booleanValue();
        }
        if (TextUtils.isEmpty(this.mRequestLiveId) || videoInfo == null) {
            return false;
        }
        if (isOfficialType(videoInfo)) {
            str = this.mRequestLiveId;
            str2 = videoInfo.officialLiveInfo.officialLiveId;
        } else {
            str = this.mRequestLiveId;
            str2 = videoInfo.liveId;
        }
        return str.equals(str2);
    }

    private boolean checkTopic(VideoInfo videoInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4a5ab703", new Object[]{this, videoInfo})).booleanValue();
        }
        if (TextUtils.isEmpty(this.mRequestLiveId) || !this.mRequestLiveId.equals(videoInfo.topic)) {
            return false;
        }
        return true;
    }

    private et9 createFollowChangeListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (et9) ipChange.ipc$dispatch("a9977aee", new Object[]{this});
        }
        return new e();
    }

    private void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        } else {
            destroy(false, false);
        }
    }

    private void exectDidAppear() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e60038", new Object[]{this});
        } else if (this.mComponentManager != null) {
            RecModel recModel = this.mRecModel;
            if (recModel == null || TextUtils.isEmpty(recModel.liveId)) {
                str = "-1";
            } else {
                str = this.mRecModel.liveId;
            }
            o3s.b("JingChunLifecycle", "TaoLiveSingleRoomController onDidAppear liveId=" + str + " liveContextKey = " + this.mFrameContext.p());
            this.mComponentManager.onDidAppear();
        }
    }

    private void falcoSpanStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7ea8782", new Object[]{this});
            return;
        }
        v73 v73Var = new v73();
        this.mCardAnalysis = v73Var;
        cdr cdrVar = this.mFrameContext;
        if (cdrVar != null) {
            cdrVar.d1(v73Var);
        }
        m2g fetchEntity = d9m.P().fetchEntity(getOpenArchEntityAdapter().l());
        if (!(fetchEntity == null || d9m.P().getAnalysisComponent(fetchEntity) == null)) {
            d9m.P().getAnalysisComponent(fetchEntity).b(this.mCardAnalysis);
        }
        w73.c(this.mCardAnalysis);
    }

    public static String generateLiveContextKey(cba cbaVar, String str, String str2) {
        String str3;
        String str4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8836af05", new Object[]{cbaVar, str, str2});
        }
        if (qvs.W0()) {
            return generateLiveContextKeyNewInternal(str, str2);
        }
        if (cbaVar != null) {
            str3 = cbaVar.V();
        } else {
            str3 = "";
        }
        if (!TextUtils.isEmpty(str)) {
            str4 = rjr.e().c(str);
        } else {
            str4 = "unknown";
        }
        if (TextUtils.isEmpty(str3)) {
            return str4;
        }
        return str3 + "_" + str4;
    }

    private static String generateLiveContextKeyNewInternal(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("11d542b9", new Object[]{str, str2});
        }
        if (!TextUtils.isEmpty(str)) {
            return rjr.e().c(str);
        }
        if (!TextUtils.isEmpty(str2)) {
            return rjr.e().c(str2);
        }
        return "unknown";
    }

    private JSONObject generateTcpContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("6847600a", new Object[]{this});
        }
        JSONObject jSONObject = new JSONObject();
        cdr cdrVar = this.mFrameContext;
        if (cdrVar != null && (cdrVar.j() instanceof dba)) {
            jSONObject.put(yj4.PARAM_TCP_OUTER_PARAM, (Object) ((dba) this.mFrameContext.j()).a0);
        }
        return jSONObject;
    }

    private void getLiveDetail() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8efe2f5a", new Object[]{this});
        } else {
            getLiveDetail(null);
        }
    }

    private void hideError() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("226b1f6d", new Object[]{this});
            return;
        }
        View view = this.mErrorView;
        if (view != null) {
            view.setVisibility(8);
        }
    }

    private void initKandianUTParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c632be26", new Object[]{this});
            return;
        }
        up6.P0(null, this.mFrameContext);
        up6.N0(null, this.mFrameContext);
        up6.Q0(null, this.mFrameContext);
        cxa.b = null;
    }

    private void initRec(VideoInfo videoInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87dabe06", new Object[]{this, videoInfo});
            return;
        }
        RecModel recModel = this.mRecModel;
        if (recModel != null && recModel.isFirst && pvs.W2()) {
            sjr.g().e("com.taobao.taolive.room.updownswitch.init", videoInfo);
        }
    }

    private void initRecommendPop() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a73aab2c", new Object[]{this});
        } else if (pvs.I2() && (!this.mDidAppear || this.mLiveDataModel == null || this.mRecommendPop != null)) {
        } else {
            if (or.a(this.mFrameContext, OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_CustomizedSimpleLive)) {
                o3s.b("TBLVOpenShopCardComponent", "禁用 dx 弹窗");
                return;
            }
            if (phf.c(up6.L(this.mFrameContext), up6.r(this.mFrameContext)) && this.mLiveDataModel != null) {
                ViewGroup viewGroup = this.mRoomLayout;
                ViewGroup viewGroup2 = viewGroup != null ? (ViewGroup) viewGroup.findViewById(R.id.taolive_open_popview_frame) : null;
                if (viewGroup2 == null) {
                    viewGroup2 = iba.c(this.mContext, vx9.f(this.mFrameContext));
                }
                this.mRecommendPop = new amr(this.mContext, viewGroup2, this.mFrameContext, this.mLiveDataModel, this.mComponentManager, new con(this.mFrameContext));
            }
            if (this.mRecommendPop != null) {
                Context context = this.mContext;
                if (!(context instanceof Activity) || ((Activity) context).getIntent() == null) {
                    str = "";
                } else {
                    str = ((Activity) this.mContext).getIntent().getDataString();
                }
                ((amr) this.mRecommendPop).K(String.valueOf(up6.W(this.mFrameContext)), up6.U(this.mFrameContext), up6.w(this.mFrameContext), up6.L(this.mFrameContext), up6.r(this.mFrameContext), rbu.r(this.mFrameContext), str);
                ((amr) this.mRecommendPop).R(new bon());
                ((amr) this.mRecommendPop).S(new fif(this.mFrameContext));
            }
        }
    }

    private void initSmartLayer() {
        cba cbaVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b5e5abf", new Object[]{this});
            return;
        }
        q6q q6qVar = this.mSmartLayerManager;
        if (q6qVar != null && !q6qVar.c() && (cbaVar = this.mGlobalContext) != null && cbaVar.u != null) {
            sj9.D("SmartLayer initSmartLayer open single ");
            this.mGlobalContext.u.j(false, "dx_smart", new f());
        }
    }

    private void initTopContainer() {
        czd czdVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd373263", new Object[]{this});
            return;
        }
        ATaoLiveOpenEntity aTaoLiveOpenEntity = this.taoLiveOpenEntity;
        if (aTaoLiveOpenEntity != null && (czdVar = aTaoLiveOpenEntity.uiCompontent) != null && ((rbt) czdVar).b() != null) {
            View m2 = ((rbt) this.taoLiveOpenEntity.uiCompontent).b().m();
            if (m2 instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) m2;
                viewGroup.addView(LayoutInflater.from(this.mContext).inflate(R.layout.taolive_open_top_container, (ViewGroup) null, false), viewGroup.getChildCount());
            }
        }
    }

    private void initVideo(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e58adbb6", new Object[]{this, context});
            return;
        }
        n8e a2 = u4w.a(this.mFrameContext, context, this.itemView, this.mResetMediaListener);
        this.mVideoFrame = a2;
        IPlayPublicService G = a2.G();
        o3s.b(TAG, "initVideo,初始化时IPlayPublicService：" + G);
        setIPlayPublicService(this.mVideoFrame.G());
    }

    private void interceptColdStartDataUploadIfNeed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e8f5e61", new Object[]{this});
            return;
        }
        String B = iba.B(vx9.f(this.mFrameContext));
        if (!z9u.SOURCE_UPDOWNSWITCH.equalsIgnoreCase(B) && !this.mFrameContext.j().k().X0().D()) {
            uvg.g().j("LIVE_CODE_BOOT_STAGE");
            x5t.k(TAG, "interceptContinueUpload:" + B);
        }
    }

    private void keepMuteManagerStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9645a1a", new Object[]{this});
            return;
        }
        cdr cdrVar = this.mFrameContext;
        if (cdrVar != null && cdrVar.h0 != null) {
            o3s.b(TAG, "keepMuteManagerStart");
            this.mFrameContext.h0.B();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$getLiveDetail$1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e368c4a", new Object[]{this});
            return;
        }
        vnm c2 = vnm.c();
        c2.j(vnm.PRE_CREATE_ROOM_REC + this.mRecModel.initParams.get("livesource"), this, this);
    }

    private void onDelayDidAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d7980f7", new Object[]{this});
        } else if (this.delayDidAppear) {
            onRealDidAppear();
        }
    }

    private void putCustomKLifecycleParam(bxl bxlVar) {
        ATaoLiveOpenEntity A;
        cf cfVar;
        yrk a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a9912fb", new Object[]{this, bxlVar});
            return;
        }
        cdr cdrVar = this.mFrameContext;
        if (!(cdrVar == null || (A = cdrVar.A()) == null || (cfVar = A.eventCompontent) == null || cfVar.a() == null || (a2 = A.eventCompontent.a().a()) == null)) {
            Map<String, String> u = a2.u();
            o3s.b(TAG, "onCustomerKLifecycleParam，onCustomerKLifecycleParam：" + u);
            if (!tz3.b(u)) {
                for (Map.Entry<String, String> entry : u.entrySet()) {
                    String key = entry.getKey();
                    if (!TextUtils.isEmpty(key) && bxlVar != null) {
                        bxlVar.a(key, entry.getValue());
                    }
                }
            }
        }
    }

    private void putKLifecycleParam(String str, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71fea1f4", new Object[]{this, str, new Long(j2)});
            return;
        }
        String str2 = this.mGlobalContext.W().get(str);
        if (!isFirstEnter() || str2 == null) {
            this.mPerfomenceTrackManager.a(str, String.valueOf(j2));
        } else {
            this.mPerfomenceTrackManager.a(str, str2);
        }
        this.mGlobalContext.W().remove(str);
    }

    private void reportCheckLiveDetailWithBindModelError(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("222f25a2", new Object[]{this, str, str2, str3, str4});
            return;
        }
        x5t.h(TAG, "reportCheckLiveDetailWithBindModelError error recommendLiveID" + str + " liveDetailLiveID = " + str3 + " liveContextKey = " + str4 + " hash = " + this);
        HashMap hashMap = new HashMap();
        hashMap.put("recommendLiveID", str);
        hashMap.put("recommendAccountId", str2);
        hashMap.put("liveDetailLiveID", str3);
        if (v2s.o().s() != null) {
            v2s.o().s().a("LiveDetailMistake", "Page_TaobaoLiveWatch", hashMap);
        }
        uwt.a(hashMap);
        rbu.K(this.mFrameContext, "LiveDetailMistake", hashMap);
    }

    private void resetMoreTip() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf41d5be", new Object[]{this});
            return;
        }
        f1j f1jVar = this.mMoreSwitchGuideTip;
        if (f1jVar != null) {
            f1jVar.g();
        }
    }

    private void sendDetailResultNotify(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70bc95c2", new Object[]{this, obj});
        } else if (this.taoLiveOpenEntity != null && obj != null) {
            bindingOpenPlatformListener();
            this.taoLiveOpenEntity.accessListener(AccessListenerEnum.onRecieveDetailResponse, obj);
        }
    }

    private void setIPlayPublicService(IPlayPublicService iPlayPublicService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96a6593e", new Object[]{this, iPlayPublicService});
            return;
        }
        cdr cdrVar = this.mFrameContext;
        if (cdrVar != null) {
            cdrVar.Z(iPlayPublicService);
        }
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

    private void setupComponentGroupConfig() {
        azd azdVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9853ef88", new Object[]{this});
            return;
        }
        ATaoLiveOpenEntity aTaoLiveOpenEntity = this.taoLiveOpenEntity;
        if (aTaoLiveOpenEntity != null && (azdVar = aTaoLiveOpenEntity.abilityCompontent) != null) {
            OpenAbilityCompontentTypeEnum openAbilityCompontentTypeEnum = OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_LRComponent;
            if (((ibt) azdVar).d(openAbilityCompontentTypeEnum)) {
                Object c2 = ((ibt) this.taoLiveOpenEntity.abilityCompontent).c(openAbilityCompontentTypeEnum);
                if (c2 instanceof String) {
                    this.mFrameContext.S(ComponentGroupConfig.defaultComponentGroupConfig());
                    ComponentGroupConfig.setShowComponent((ITaoLiveComponentConfig) JSON.parseObject((String) c2, ITaoLiveComponentConfig.class), this.mFrameContext);
                    cdr cdrVar = this.mFrameContext;
                    if (cdrVar != null && cdrVar.f() != null && this.mFrameContext.f().getConfigurableConfig() != null) {
                        x5t.j(TAG, this.mFrameContext.f().getConfigurableConfig().toString());
                    }
                }
            }
        }
    }

    private void showError4CMP(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55f68682", new Object[]{this, runnable});
            return;
        }
        View view = this.itemView;
        if (view != null) {
            String string = view.getContext().getString(R.string.taolive_status_error_hang_cmp);
            String string2 = this.itemView.getContext().getString(R.string.taolive_status_error_reload);
            if (this.mErrorView == null) {
                ViewStub viewStub = (ViewStub) this.itemView.findViewById(R.id.taolive_status_error_stub);
                viewStub.setLayoutResource(R.layout.taolive_status_error_layout);
                this.mErrorView = viewStub.inflate();
            }
            JSONObject jSONObject = new JSONObject();
            if (string == null) {
                string = this.itemView.getContext().getString(R.string.taolive_status_error_hang);
            }
            jSONObject.put("title", (Object) string);
            jSONObject.put("message", (Object) "");
            if (string2 == null) {
                string2 = "";
            }
            jSONObject.put("buttonText", (Object) string2);
            si8 si8Var = new si8(jSONObject);
            si8Var.a(new p(runnable, si8Var));
            si8Var.e(null);
        }
    }

    private void showMoreTip() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9f85f50", new Object[]{this});
            return;
        }
        f1j f1jVar = this.mMoreSwitchGuideTip;
        if (f1jVar != null) {
            f1jVar.h();
        }
    }

    private void syncLiveDetailToKMP(String str) {
        m2g fetchEntity;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9a994ac", new Object[]{this, str});
        } else if (getOpenArchEntityAdapter().l() == null) {
        } else {
            if ((isPreRequest() || isPreSimpleRequest()) && (fetchEntity = d9m.P().fetchEntity(getOpenArchEntityAdapter().l())) != null && fetchEntity.j() != null) {
                q2g a2 = q2g.Companion.a("DataServiceIntent_SyncNativeLiveDetail");
                HashMap hashMap = new HashMap();
                hashMap.put("liveDetailData", fkx.d(str));
                fetchEntity.j().e(toy.Companion.a(), a2, hashMap);
            }
        }
    }

    private void transParamsAddLiveSourcePre(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81e5d4a0", new Object[]{this, jSONObject});
        } else if (!pvs.B1()) {
        } else {
            if (jSONObject.getJSONObject("tppParam") == null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("entryLiveSourcePre", (Object) up6.s(this.mFrameContext));
                jSONObject.put("tppParam", (Object) jSONObject2);
                return;
            }
            jSONObject.getJSONObject("tppParam").put("entryLiveSourcePre", (Object) up6.s(this.mFrameContext));
        }
    }

    private void updateBackward() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0c94e53", new Object[]{this});
            return;
        }
        if (bl9.g().b() && d9m.e().getBackwardX() != null) {
            d9m.e().getBackwardX().c(this.mLiveDataModel, vx9.f(this.mFrameContext), this.mFrameContext);
        }
        iba.P(yqq.h(this.mLiveDataModel.mInitParams.get(yj4.PARAM_BACKWARD_SWITCH)), vx9.f(this.mFrameContext));
        if (up6.k0(this.mFrameContext)) {
            String O = up6.O(this.mFrameContext);
            String g2 = up6.g(this.mFrameContext);
            if (!TextUtils.isEmpty(g2)) {
                O = g2;
            }
            iba.Q(O, vx9.f(this.mFrameContext));
        } else {
            iba.R(null, vx9.f(this.mFrameContext));
            iba.Q(null, vx9.f(this.mFrameContext));
        }
        iba.S(this.mLiveDataModel.mInitParams.get(yj4.PARAM_INTENT_URL), vx9.f(this.mFrameContext));
    }

    private void updateDisPatchTrackInfo(String str) {
        Map<String, String> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a0295a7", new Object[]{this, str});
            return;
        }
        cdr cdrVar = this.mFrameContext;
        String H = cdrVar instanceof air ? cdrVar.j().k().q().H() : null;
        if (pvs.S1() && TextUtils.isEmpty(H) && !TextUtils.isEmpty(str)) {
            iba.p1(str, vx9.f(this.mFrameContext));
        }
        RecModel recModel = this.mRecModel;
        if (recModel != null && (map = recModel.initParams) != null && TextUtils.isEmpty(map.get("trackInfo")) && !TextUtils.isEmpty(str)) {
            this.mRecModel.initParams.put("trackInfo", str);
        }
    }

    private void uploadFirstFramePoint() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df234e39", new Object[]{this});
        } else if (!TextUtils.equals(z9u.SOURCE_UPDOWNSWITCH, iba.B(vx9.f(this.mFrameContext)))) {
            uvg.g().a("LIVE_CODE_BOOT_STAGE", SceneStage.SCENE_STAGE_T1);
            x5t.k("LIVE_CODE_BOOT_STAGE", "stage:t1");
        }
    }

    private void volumeChangeHide() {
        IUniversalProxy.c volumeChangeUploadManager;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84c6f653", new Object[]{this});
            return;
        }
        TBLiveBizDataModel tBLiveBizDataModel = this.mLiveDataModel;
        if (tBLiveBizDataModel != null && tBLiveBizDataModel.mVideoInfo != null) {
            if (!(d9m.L() == null || (volumeChangeUploadManager = d9m.L().getVolumeChangeUploadManager()) == null)) {
                volumeChangeUploadManager.a(this.mLiveDataModel.mVideoInfo.liveId);
            }
            x5t.j(TAG, "volumeChangeHide");
        }
    }

    public void aboutToDisappear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1754a2", new Object[]{this});
            return;
        }
        x5t.h("SingleRoomLifeCycle", "OpenSingleViewController aboutToDisappear");
        new sya(this.mFrameContext).i();
        n8e n8eVar = this.mVideoFrame;
        if (n8eVar != null) {
            n8eVar.u();
        }
    }

    @Override // tb.s3c
    public String bizCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("36951559", new Object[]{this});
        }
        return TAG;
    }

    public void checkDisplayCutout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c547228d", new Object[]{this});
        } else if (!iba.v(vx9.f(this.mFrameContext))) {
            Context context = this.mContext;
            if (context instanceof Activity) {
                if (Build.VERSION.SDK_INT >= 23) {
                    ((Activity) context).getWindow().getDecorView().addOnLayoutChangeListener(new j());
                } else {
                    iba.M0(false, vx9.f(this.mFrameContext));
                    iba.Y(0, vx9.f(this.mFrameContext));
                    iba.b1(0, vx9.f(this.mFrameContext));
                }
                gmr.a(this.mFrameContext.j());
            }
        }
    }

    public String curLiveScene() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ca9f8259", new Object[]{this});
        }
        cdr cdrVar = this.mFrameContext;
        if (cdrVar == null || cdrVar.r() == null) {
            return "fullLive";
        }
        return this.mFrameContext.r().b();
    }

    @Override // com.taobao.taolive.sdk.business.IRemoteExtendListener
    public void dataParseBegin(long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a054be1d", new Object[]{this, new Long(j2)});
        }
    }

    @Override // tb.w3d
    public Context getContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("e1727078", new Object[]{this});
        }
        return this.mContext;
    }

    @Override // tb.w3d
    public cdr getFrameContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cdr) ipChange.ipc$dispatch("52a2fd", new Object[]{this});
        }
        return this.mFrameContext;
    }

    @Override // tb.w3d
    public cba getGlobalContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cba) ipChange.ipc$dispatch("7f95b5cc", new Object[]{this});
        }
        cdr cdrVar = this.mFrameContext;
        if (cdrVar != null) {
            return cdrVar.j();
        }
        return null;
    }

    public String getKmpIdentify() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fde01635", new Object[]{this});
        }
        return getOpenArchEntityAdapter().l();
    }

    @Override // tb.w3d
    public OpenArchSingleEntityAdapter getOpenArchEntityAdapter() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (OpenArchSingleEntityAdapter) ipChange.ipc$dispatch("82df1a77", new Object[]{this});
        }
        if (this.mKMPEntityAdapter == null) {
            this.mKMPEntityAdapter = new OpenArchSingleEntityAdapter(this);
        }
        return this.mKMPEntityAdapter;
    }

    @Override // tb.w3d
    public RecModel getRecModel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecModel) ipChange.ipc$dispatch("733b4e04", new Object[]{this});
        }
        return this.mRecModel;
    }

    @Override // tb.w3d
    public TBLiveBizDataModel getTBLiveBizDataModel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBLiveBizDataModel) ipChange.ipc$dispatch("b169bccd", new Object[]{this});
        }
        return this.mLiveDataModel;
    }

    public View getUbeeContainer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("e01a45e7", new Object[]{this});
        }
        BaseFrame baseFrame = this.mRoomController;
        if (baseFrame == null || !(baseFrame instanceof TaoliveHighlightController)) {
            return null;
        }
        return ((TaoliveHighlightController) baseFrame).getUbeeContainer();
    }

    @Override // tb.w3d
    public String getUniStr() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ada47542", new Object[]{this});
        }
        cdr cdrVar = this.mFrameContext;
        if (cdrVar != null) {
            return cdrVar.C();
        }
        return null;
    }

    @Override // tb.w3d
    public Map<String, String> getUtParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("5e259437", new Object[]{this});
        }
        cdr cdrVar = this.mFrameContext;
        if (cdrVar != null) {
            return cdrVar.u;
        }
        return new HashMap();
    }

    public String getViewItemId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8c73b410", new Object[]{this});
        }
        RecModel recModel = this.mRecModel;
        if (recModel != null) {
            return recModel.getViewItemId();
        }
        return "";
    }

    public void hideWidgets(String str) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df605dde", new Object[]{this, str});
        } else if ("fullScreenOverlay".equals(str)) {
            ViewGroup viewGroup = this.mRoomLayout;
            if (viewGroup != null) {
                viewGroup.setVisibility(8);
            }
        } else {
            cdr cdrVar = this.mFrameContext;
            if (cdrVar == null || cdrVar.r() == null) {
                z = false;
            } else {
                z = this.mFrameContext.r().c();
            }
            if ("close".equals(str) && (this.mContext instanceof Activity)) {
                if (z) {
                    cdr cdrVar2 = this.mFrameContext;
                    if (!(cdrVar2 == null || cdrVar2.v() == null)) {
                        this.mFrameContext.v().x(str);
                    }
                } else if (v2s.o().I("closeBtn") && !up6.s0(this.mFrameContext)) {
                    View findViewById = ((Activity) this.mContext).findViewById(R.id.taolive_close_btn);
                    View findViewById2 = this.mRoomLayout.findViewById(R.id.taolive_close_backup_btn);
                    if (findViewById != null) {
                        findViewById.setVisibility(4);
                        if (findViewById2 != null) {
                            findViewById2.setVisibility(0);
                            findViewById2.setBackgroundResource(R.drawable.taolive_room_close_btn_background_small);
                            ViewGroup.LayoutParams layoutParams = findViewById2.getLayoutParams();
                            int E = iba.E(vx9.f(this.mFrameContext));
                            if (layoutParams != null) {
                                ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = hw0.b(this.mContext, 14.0f) + E;
                                findViewById2.setLayoutParams(layoutParams);
                            }
                            ImageView imageView = (ImageView) findViewById2.findViewById(R.id.taolive_room_top_more_btn);
                            ImageView imageView2 = (ImageView) findViewById2.findViewById(R.id.taolive_room_top_close_btn);
                            NewStyleUtils.b(this.mContext, findViewById2, NewStyleUtils.NewStyleType.SMALL);
                            imageView.setImageResource(R.drawable.taolive_room_new_style_topbar_more_flexalocal);
                            imageView2.setImageResource(R.drawable.taolive_room_new_style_topbar_close_flexalocal);
                            imageView.getLayoutParams().width = hw0.b(this.mContext, 16.0f);
                            imageView.getLayoutParams().height = hw0.b(this.mContext, 16.0f);
                            imageView2.getLayoutParams().width = hw0.b(this.mContext, 16.0f);
                            imageView2.getLayoutParams().height = hw0.b(this.mContext, 16.0f);
                            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) findViewById2.getLayoutParams();
                            marginLayoutParams.topMargin += hw0.b(this.mContext, 2.0f);
                            marginLayoutParams.width = hw0.b(this.mContext, 64.0f);
                            marginLayoutParams.height = hw0.b(this.mContext, 28.0f);
                            findViewById2.setLayoutParams(marginLayoutParams);
                            ViewProxy.setOnClickListener(findViewById2, new a());
                            imageView.setOnClickListener(new b(imageView));
                            return;
                        }
                        return;
                    }
                    return;
                }
            }
            IComponent componentByName = this.mComponentManager.getComponentByName(str);
            if (componentByName != null) {
                componentByName.hide();
                return;
            }
            View viewByName = this.mComponentManager.getViewByName(str);
            if (viewByName != null) {
                viewByName.setVisibility(4);
            }
        }
    }

    public void init(Context context, TaoliveOpenLiveRoom taoliveOpenLiveRoom) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7e14feb", new Object[]{this, context, taoliveOpenLiveRoom});
        }
    }

    public void initKMPKMPEntityAdapter(w3d w3dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3add9f0", new Object[]{this, w3dVar});
        } else {
            this.mKMPEntityAdapter = new OpenArchSingleEntityAdapter(w3dVar);
        }
    }

    public void initMultiRoomVideoControllerObserver(naj najVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b9dfc9", new Object[]{this, najVar});
        } else {
            this.mMultiRoomVideoControllerObserver = najVar;
        }
    }

    @Override // tb.w3d
    public void initParams(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e33fb2d9", new Object[]{this, obj});
        }
    }

    public void initSingleEntity() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa39ee82", new Object[]{this});
        } else {
            this.mKMPEntityAdapter.m();
        }
    }

    public void interruptEndingState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15448e4e", new Object[]{this});
            return;
        }
        x5t.h("SingleRoomLifeCycle", "OpenSingleViewController interruptEndingState");
        n8e n8eVar = this.mVideoFrame;
        if (n8eVar != null) {
            n8eVar.H();
        }
    }

    public boolean isPreSimpleRequest() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6b2d3a6f", new Object[]{this})).booleanValue();
        }
        if ((sj9.s() || q6f.b) && znm.k().p()) {
            return true;
        }
        return false;
    }

    @Override // tb.w3d
    public void mute(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4254d4b4", new Object[]{this, new Boolean(z)});
            return;
        }
        cdr cdrVar = this.mFrameContext;
        if (cdrVar != null && cdrVar.u() != null) {
            this.mFrameContext.u().i(z);
        }
    }

    @Override // tb.w3d
    public void needPresentAvatarPage(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27bd5651", new Object[]{this, map});
            return;
        }
        cdr cdrVar = this.mFrameContext;
        if (cdrVar != null && cdrVar.h() != null && map != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("sourceType", (Object) map.get("sourceType"));
            jSONObject.put("liveId", (Object) map.get("liveId"));
            jSONObject.put("accountId", (Object) map.get("accountId"));
            jSONObject.put(LiveAvatarNewFrame.LIVE_AVATAR_ENCODE_ACCOUNT_ID, (Object) map.get(LiveAvatarNewFrame.LIVE_AVATAR_ENCODE_ACCOUNT_ID));
            this.mFrameContext.h().e("com.taobao.taolive.room.avatar_card_show", jSONObject);
        }
    }

    @Override // tb.s3c
    public String[] observeEvents() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("37b2602b", new Object[]{this});
        }
        return new String[]{uyg.EVENT_MEDIAPLATFORM_SHOW_WIDGETS, uyg.EVENT_MEDIAPLATFORM_HIDE_WIDGETS, "com.taobao.taolive.room.addcart_for_showcase", FullScreenFrame.EVENT_TAOLIVE_ROOM_CLEAR_SCREEN, "taolive.more.live.status", "com.taobao.taolive.room.enable_updown_switch", "com.taobao.taolive.room.disable_updown_switch", FullScreenFrame.EVENT_ENABLE_LEFTRIGHT_SWITCH, FullScreenFrame.EVENT_DISABLE_LEFTRIGHT_SWITCH, LiveMediaManager.EVENT_ACTION_SHOW_SWITCH_TIP, "com.taobao.taolive.room.ent.opt.animation.end", uyg.c, uyg.d};
    }

    @Override // tb.s3c
    public String observeUniqueIdentification() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4914bdfe", new Object[]{this});
        }
        cdr cdrVar = this.mFrameContext;
        if (cdrVar == null) {
            return null;
        }
        return cdrVar.C();
    }

    @Override // tb.hgb.a
    public void onAppInBackgroud() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c87472c", new Object[]{this});
            return;
        }
        this.isFromBackground = true;
        v2s.o().f().b(this);
    }

    @Override // tb.hgb.a
    public void onAppInForeground() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("111bbcb1", new Object[]{this});
        }
    }

    @Override // tb.w3d
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        h4s.c(TAG, "onDestroy");
        onDestroy(false);
        h4s.e();
    }

    @Override // tb.t4w
    public void onFirstFrame(long j2, long j3) {
        String str;
        RecModel recModel;
        Map<String, String> map;
        n8e n8eVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("baf47623", new Object[]{this, new Long(j2), new Long(j3)});
            return;
        }
        dir dirVar = this.mTBLIveRoomEngine;
        if (dirVar != null) {
            dirVar.j();
        }
        btd btdVar = (btd) rjr.e().d(this.mFrameContext.p(), btd.class);
        if (btdVar != null) {
            btdVar.p();
        }
        uploadFirstFramePoint();
        bxl bxlVar = this.mPerfomenceTrackManager;
        if (!(bxlVar == null || (n8eVar = this.mVideoFrame) == null)) {
            bxlVar.t(n8eVar.a());
        }
        if (!(!pvs.t0() || (recModel = this.mRecModel) == null || (map = recModel.initParams) == null)) {
            wng.c(this.mFrameContext, map.get("livesource"), j2, j3);
            bxl bxlVar2 = this.mPerfomenceTrackManager;
            if (bxlVar2 != null) {
                putCustomKLifecycleParam(bxlVar2);
                this.mPerfomenceTrackManager.a("startPlayTs", String.valueOf(j2));
            }
            if (!(this.mPerfomenceTrackManager == null || this.mGlobalContext == null)) {
                putKLifecycleParam("kPlayerFirstFinishTime", j3);
                new HashMap().put("kLivePlayerSuccess", String.valueOf(j3));
            }
        }
        sj9.g(this.mFrameContext);
        rc.f(this.mContext, this.mFrameContext);
        if (this.mFrameContext != null) {
            str = "liveId:" + this.mFrameContext.i + "&liveToken:" + this.mFrameContext.p();
        } else {
            str = null;
        }
        w73.a(this.mCardAnalysis, str);
    }

    @Override // tb.t4w
    public void onFrameReady() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a903d7c", new Object[]{this});
        } else {
            keepMuteManagerStart();
        }
    }

    @Override // tb.hlc.a
    public void onGetFandomInfoSuccess(FandomInfo fandomInfo, String str) {
        cdr cdrVar;
        String str2;
        azd azdVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e52d6dd", new Object[]{this, fandomInfo, str});
            return;
        }
        syncLiveDetailToKMP(str);
        ATaoLiveOpenEntity aTaoLiveOpenEntity = this.taoLiveOpenEntity;
        if (!(aTaoLiveOpenEntity == null || (azdVar = aTaoLiveOpenEntity.abilityCompontent) == null)) {
            if (!((ibt) azdVar).d(OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_HideFandom)) {
                if (((ibt) this.taoLiveOpenEntity.abilityCompontent).d(OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_HideFandomAndRefreshLiveRoom)) {
                    forceRefresh();
                    return;
                }
            } else {
                return;
            }
        }
        rc.f(this.mContext, this.mFrameContext);
        vnm.c().i(this.mRequestLiveId);
        if (!this.mIsDestroyed && fandomInfo != null && !TextUtils.isEmpty(fandomInfo.bbQJumpH5) && (this.mContext instanceof Activity) && (cdrVar = this.mFrameContext) != null) {
            String C = iba.C(cdrVar.j());
            if (!TextUtils.isEmpty(C)) {
                str2 = Uri.parse(C).getQuery();
            } else {
                str2 = null;
            }
            String str3 = fandomInfo.bbQJumpH5;
            if (!TextUtils.isEmpty(str2)) {
                if (str3.contains("?")) {
                    str3 = str3 + "&" + str2;
                } else {
                    str3 = str3 + "?" + str2;
                }
            }
            voj.a(this.mContext, str3);
            Context context = this.mContext;
            if (context instanceof BaseActivity) {
                ((BaseActivity) context).finish(true);
            } else {
                ((Activity) context).finish();
            }
        }
    }

    @Override // com.taobao.taolive.sdk.core.impl.TBLiveDataProvider.c
    public void onGetHeaderFields(Map<String, List<String>> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4dd45ac1", new Object[]{this, map});
        } else {
            t0.a(map, this.mContext);
        }
    }

    @Override // tb.hlc.a
    public void onGetVideoInfoFail(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa662561", new Object[]{this, str});
            return;
        }
        vnm.c().i(this.mRequestLiveId);
        if (this.mContext != null) {
            this.mPerfomenceTrackManager.a(bxl.DETAIL_SUCCESS, "false");
            rc.f(this.mContext, this.mFrameContext);
            this.mRequestLiveId = null;
            this.mRequestAccountId = null;
            dir dirVar = this.mTBLIveRoomEngine;
            if (dirVar != null) {
                dirVar.k();
            }
            n8e n8eVar = this.mVideoFrame;
            if (n8eVar != null) {
                n8eVar.B();
            }
            igq.n().p(TAG, "STATUS_INIT_FAIL");
            if (qsj.k(str) || qsj.c(str)) {
                t0u.b(this.mContext, R.string.taolive_status_error_traffic_limit);
                voj.a(this.mContext, pvs.n2());
                sjr.g().c("com.taobao.taolive.room.killself", null, this.frameContextUnique);
                return;
            }
            if (ErrorConstant.ERRCODE_NO_NETWORK.equals(str)) {
                t0u.c(this.mContext, "手机网络未打开，请联网后重试");
            }
            showError();
        }
    }

    @Override // tb.t4w
    public void onLiveStartPlay() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49912692", new Object[]{this});
            return;
        }
        keepMuteManagerStart();
        sj9.I(this.mFrameContext);
    }

    @Override // tb.gtc
    public void onMessageReceived(int i2, Object obj) {
        VideoInfo videoInfo;
        ATaoLiveOpenEntity aTaoLiveOpenEntity;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b152aef", new Object[]{this, new Integer(i2), obj});
        } else if (i2 == 1004) {
            TBLiveBizDataModel tBLiveBizDataModel = this.mLiveDataModel;
            if (tBLiveBizDataModel == null || (videoInfo = tBLiveBizDataModel.mVideoInfo) == null || !videoInfo.isOfficialType()) {
                BaseFrame baseFrame = this.mComponentManager;
                if (baseFrame != null) {
                    baseFrame.onVideoStatusChanged(5);
                }
                ATaoLiveOpenEntity aTaoLiveOpenEntity2 = this.taoLiveOpenEntity;
                if (aTaoLiveOpenEntity2 != null) {
                    aTaoLiveOpenEntity2.accessListener(AccessListenerEnum.liveRoomEnd, new Object[0]);
                    return;
                }
                return;
            }
            Context context = this.mContext;
            voj.a(context, liv.d(this.mLiveDataModel.mVideoInfo.officialLiveInfo.officialLiveId) + "&livesource=guanfangtai&forceRefresh=true");
        } else if (i2 == 1006 && (aTaoLiveOpenEntity = this.taoLiveOpenEntity) != null) {
            aTaoLiveOpenEntity.accessListener(AccessListenerEnum.liveRoomUserLeave, new Object[0]);
        }
    }

    @Override // tb.w3d
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        h4s.c(TAG, "onPause");
        if (!this.mIsDestroyed) {
            BaseFrame baseFrame = this.mComponentManager;
            if (baseFrame != null) {
                baseFrame.onPause();
            }
            n8e n8eVar = this.mVideoFrame;
            if (n8eVar != null) {
                n8eVar.onPause();
            }
            q6q q6qVar = this.mSmartLayerManager;
            if (q6qVar != null) {
                q6qVar.g(this.mFrameContext);
            }
            h4s.e();
        }
    }

    @Override // tb.w3d
    public void onResume() {
        Map<String, String> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        h4s.c(TAG, "onResume");
        if (!this.mIsDestroyed) {
            RecModel recModel = this.mRecModel;
            if (!(recModel == null || (map = recModel.initParams) == null || map.get("livesource") == null)) {
                iba.W0(this.mRecModel.initParams.get("livesource"), vx9.f(this.mFrameContext));
                iba.U0(this.mRecModel.initParams.get(yj4.PARAM_LIVE_IS_AD), vx9.f(this.mFrameContext));
            }
            sj9.D("TaoLiveSingleRoomController_onResume");
            BaseFrame baseFrame = this.mComponentManager;
            if (baseFrame != null) {
                baseFrame.onResume();
            }
            n8e n8eVar = this.mVideoFrame;
            if (n8eVar != null) {
                n8eVar.onResume();
            }
            q6q q6qVar = this.mSmartLayerManager;
            if (q6qVar != null) {
                q6qVar.h(this.mFrameContext);
            }
            h4s.e();
        }
    }

    @Override // tb.huk
    public void onScreenOrientationChange(boolean z) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("647c2a98", new Object[]{this, new Boolean(z)});
        } else if (vc.i(this.mContext) || vc.d(this.mContext)) {
            if (!z) {
                str = "com.taobao.taolive.room.mediaplatform_switch_to_portrait";
            } else {
                str = "com.taobao.taolive.room.mediaplatform_switch_to_landscape";
            }
            sjr.g().d(str);
        }
    }

    public void onScrollStateChanged(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62ef402d", new Object[]{this, new Integer(i2)});
            return;
        }
        BaseFrame baseFrame = this.mComponentManager;
        if (baseFrame != null) {
            baseFrame.onScrollStateChanged(i2);
        }
    }

    @Override // tb.w3d
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            return;
        }
        h4s.c(TAG, "onStart");
        if (!this.mIsDestroyed) {
            sj9.D("TaoLiveSingleRoomController_onStart");
            dir dirVar = this.mTBLIveRoomEngine;
            if (dirVar != null) {
                dirVar.m();
            }
            n8e n8eVar = this.mVideoFrame;
            if (n8eVar != null) {
                n8eVar.onStart();
            }
            BaseFrame baseFrame = this.mComponentManager;
            if (baseFrame != null) {
                baseFrame.onStart();
            }
            h4s.e();
        }
    }

    @Override // tb.w3d
    public void onStop(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c7ea54c", new Object[]{this, new Boolean(z)});
            return;
        }
        h4s.c(TAG, "onStop");
        dir dirVar = this.mTBLIveRoomEngine;
        if (dirVar != null) {
            dirVar.n();
        }
        BaseFrame baseFrame = this.mComponentManager;
        if (baseFrame != null) {
            baseFrame.onStop();
        }
        n8e n8eVar = this.mVideoFrame;
        if (n8eVar != null) {
            n8eVar.onStop(z);
        }
        h4s.e();
    }

    @Override // tb.t4w
    public void onVideoError(IMediaPlayer iMediaPlayer, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc252069", new Object[]{this, iMediaPlayer, new Integer(i2), new Integer(i3)});
        } else {
            rc.f(this.mContext, this.mFrameContext);
        }
    }

    @Override // tb.t4w
    public void onVideoInfo(IMediaPlayer iMediaPlayer, long j2, long j3, Object obj) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("402f4cc3", new Object[]{this, iMediaPlayer, new Long(j2), new Long(j3), obj});
        } else if (((int) j2) == 715 && pvs.u0()) {
            if (obj != null) {
                str = (String) obj;
            } else {
                str = null;
            }
            if (!TextUtils.isEmpty(str) && this.mDidAppear) {
                if (v2s.o().A() != null) {
                    cwd A = v2s.o().A();
                    A.a(TAG, "MEDIA_INFO_SEI_USERDEFINED_STRUCT seiData = " + str);
                }
                if (this.seiDispatcher == null && this.mEnableCompensateSEIDispatcherInit) {
                    this.seiDispatcher = d9m.d().createSEIDispatcher(this.mFrameContext);
                    d9m.d().seiDispatcherInitialize(this.seiDispatcher);
                    o3s.b(TAG, "enableCompensateSEIDispatcherInit");
                }
                d9m.d().seiDispatcherDispatch(this.seiDispatcher, str);
                if (this.mEnableAdjustBBConnectionVideoSize) {
                    x5t.j(TAG, "adjustBBConnectionVideoSize allow");
                    if (bl9.g().b() && d9m.e() != null) {
                        d9m.e().adjustBBConnectionVideoSize(this.mContext, this.mFrameContext, str);
                    }
                }
                sjr.g().c("com.taobao.taolive.room.get_sei_info", str, this.frameContextUnique);
            }
        }
    }

    @Override // tb.w3d
    public void onViewHolderDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cef86571", new Object[]{this});
            return;
        }
        BaseFrame baseFrame = this.mComponentManager;
        if (baseFrame != null) {
            baseFrame.onViewHolderDestroy();
        }
        if (!this.mHasDisappear && !this.mIsDestroyed) {
            onDestroy();
        }
        o3s.b("SingleRoomLifeCycle", "OpenSingleViewController onViewHolderDestroy liveContextKey = " + this.mFrameContext.p() + " " + this);
    }

    @Override // tb.w3d
    public void onViewHolderDidAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25aa9f6b", new Object[]{this});
            return;
        }
        if (!this.mDidAppear) {
            onDidAppear();
        }
        BaseFrame baseFrame = this.mComponentManager;
        if (baseFrame != null) {
            baseFrame.onViewHolderDidAppear();
        }
        o3s.b("ConsistentSingleRoomLifeCycle", "OpenSingleViewController onViewHolderDidAppear liveContextKey = " + this.mFrameContext.p() + " " + this);
    }

    @Override // tb.w3d
    public void onViewHolderDidDisappear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70b1c47b", new Object[]{this});
            return;
        }
        if (this.mDidAppear) {
            onDidDisappear();
        } else {
            onWillDisappear();
        }
        BaseFrame baseFrame = this.mComponentManager;
        if (baseFrame != null) {
            baseFrame.onViewHolderDidDisappear();
        }
        o3s.b("ConsistentSingleRoomLifeCycle", "OpenSingleViewController onViewHolderDidDisappear liveContextKey = " + this.mFrameContext.p() + " " + this);
    }

    @Override // tb.w3d
    public void onViewHolderWillAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea9f191e", new Object[]{this});
            return;
        }
        onWillAppear();
        BaseFrame baseFrame = this.mComponentManager;
        if (baseFrame != null) {
            baseFrame.onViewHolderWillAppear();
        }
        o3s.b("ConsistentSingleRoomLifeCycle", "OpenSingleViewController onViewHolderWillAppear liveContextKey = " + this.mFrameContext.p() + " " + this);
    }

    @Override // tb.w3d
    public void onViewHolderWillDisappear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e9009e8", new Object[]{this});
            return;
        }
        BaseFrame baseFrame = this.mComponentManager;
        if (baseFrame != null) {
            baseFrame.onViewHolderWillDisappear();
        }
        if (pvs.o()) {
            sjr.g().d("com.taobao.taolive.room.updownswitch.vh.willdisappear");
        }
        o3s.b("ConsistentSingleRoomLifeCycle", "OpenSingleViewController onViewHolderWillDisappear liveContextKey = " + this.mFrameContext.p() + " " + this);
    }

    @Override // tb.w3d
    public void onViewHolderWillLoad(RecModel recModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac1ce313", new Object[]{this, recModel});
            return;
        }
        onBindView(recModel);
        BaseFrame baseFrame = this.mComponentManager;
        if (baseFrame != null) {
            baseFrame.onViewHolderWillLoad(recModel);
        }
        o3s.b("ConsistentSingleRoomLifeCycle", "OpenSingleViewController onViewHolderWillLoad liveContextKey = " + this.mFrameContext.p() + " " + this);
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01a1  */
    @Override // tb.w3d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onWillAppear() {
        /*
            Method dump skipped, instructions count: 963
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.taolive.room.openarchitecture.OpenSingleViewController.onWillAppear():void");
    }

    @Override // tb.w3d
    public void reportRequest() {
        n8e n8eVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("841661c2", new Object[]{this});
        } else if (this.mContext != null && this.mLiveDataModel != null && (n8eVar = this.mVideoFrame) != null && n8eVar.G() != null) {
            IPlayPublicService G = this.mVideoFrame.G();
            o3s.b(TAG, "OpenPlatformListener onSuccess reportRequest reportRequest时，IPlayPublicService：" + G);
            vfo.c(this.mContext, this.mFrameContext, this.mLiveDataModel, G.getCurrentPosition(), false);
        }
    }

    @Override // com.taobao.taolive.sdk.business.IRemoteExtendListener
    public void responseReceive(y6j y6jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f400314d", new Object[]{this, y6jVar});
        }
    }

    @Override // tb.w3d
    public void retryVideo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6555dba", new Object[]{this});
            return;
        }
        n8e n8eVar = this.mVideoFrame;
        if (n8eVar != null) {
            n8eVar.c();
        }
    }

    @Override // tb.w3d
    public void setContainerOffset(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c03b86d7", new Object[]{this, jSONObject});
            return;
        }
        cdr cdrVar = this.mFrameContext;
        if (cdrVar != null && cdrVar.h() != null && !tz3.b(jSONObject)) {
            x5t.d(TAG, "沉浸式设置，发送Event，offsetMap = " + jSONObject);
            this.mFrameContext.h().e(uyg.EVENT_CHANGE_CONTAINER_OFFSET, jSONObject);
        }
    }

    public void setGlobalContext(cba cbaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13c924ce", new Object[]{this, cbaVar});
            return;
        }
        this.mGlobalContext = cbaVar;
        this.mFrameContext.M0(cbaVar);
        if (cbaVar != null && (cbaVar.r() instanceof ATaoLiveOpenEntity)) {
            ATaoLiveOpenEntity aTaoLiveOpenEntity = (ATaoLiveOpenEntity) cbaVar.r();
            this.taoLiveOpenEntity = aTaoLiveOpenEntity;
            this.mFrameContext.n0(aTaoLiveOpenEntity);
        }
        this.mUpdownSwitchStateObserver = new skv(cbaVar);
    }

    @Override // tb.w3d
    public void setSmallWindowClickListener(ISmallWindowStrategy iSmallWindowStrategy) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("707f1784", new Object[]{this, iSmallWindowStrategy});
            return;
        }
        cdr cdrVar = this.mFrameContext;
        if (cdrVar != null && cdrVar.x() != null) {
            this.mFrameContext.x().setSmallWindowClickListener(iSmallWindowStrategy);
        }
    }

    public void showWidgets(String str) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b199de03", new Object[]{this, str});
        } else if ("fullScreenOverlay".equals(str)) {
            ViewGroup viewGroup = this.mRoomLayout;
            if (viewGroup != null) {
                viewGroup.setVisibility(0);
            }
        } else {
            cdr cdrVar = this.mFrameContext;
            if (cdrVar == null || cdrVar.r() == null) {
                z = false;
            } else {
                z = this.mFrameContext.r().c();
            }
            if (z) {
                cdr cdrVar2 = this.mFrameContext;
                if (!(cdrVar2 == null || cdrVar2.v() == null)) {
                    this.mFrameContext.v().D(str);
                }
            } else if ("close".equals(str)) {
                Context context = this.mContext;
                if (context instanceof Activity) {
                    View findViewById = ((Activity) context).findViewById(R.id.taolive_close_btn);
                    View findViewById2 = this.mRoomLayout.findViewById(R.id.taolive_close_backup_btn);
                    if (findViewById == null) {
                        return;
                    }
                    if (!v2s.o().I("closeBtn") || up6.s0(this.mFrameContext)) {
                        findViewById.setVisibility(8);
                        return;
                    }
                    findViewById.setVisibility(0);
                    if (findViewById2 != null) {
                        findViewById2.setVisibility(8);
                        return;
                    }
                    return;
                }
            }
            IComponent componentByName = this.mComponentManager.getComponentByName(str);
            if (componentByName != null) {
                componentByName.show();
                return;
            }
            View viewByName = this.mComponentManager.getViewByName(str);
            if (viewByName != null) {
                viewByName.setVisibility(0);
            }
        }
    }

    @Override // tb.w3d
    public void updatePerformanceTrack(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe38e7ff", new Object[]{this, str, str2});
        } else {
            this.mPerfomenceTrackManager.a(str, str2);
        }
    }

    @Override // tb.w3d
    public void updateUserTrackData(Map<String, String> map) {
        RecModel recModel;
        Map<String, String> map2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("829410bd", new Object[]{this, map});
        } else if (map != null) {
            String str = map.get("spm-url");
            if (!(TextUtils.isEmpty(str) || (recModel = this.mRecModel) == null || (map2 = recModel.initParams) == null || this.mFrameContext == null)) {
                map2.put("spm", str);
                iba.j1(str, vx9.f(this.mFrameContext));
            }
            String str2 = map.get("entrySpm");
            if (!TextUtils.isEmpty(str2)) {
                iba.w0(str2, vx9.f(this.mFrameContext));
            }
            String r2 = rbu.r(vx9.d());
            iba.k1(r2, vx9.f(vx9.d()));
            if (pvs.c2()) {
                HashMap hashMap = new HashMap();
                hashMap.put("spm-url", str);
                hashMap.put("entrySpm", str2);
                hashMap.put("spm-cnt", r2);
                rbu.n0(this.mFrameContext, hashMap);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class e implements et9 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e() {
        }

        @Override // tb.et9
        public void onFollowChange(dt9 dt9Var) {
            TBLiveBizDataModel tBLiveBizDataModel;
            VideoInfo videoInfo;
            AccountInfo accountInfo;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fb93c2e5", new Object[]{this, dt9Var});
            } else if (dt9Var != null && OpenSingleViewController.access$900(OpenSingleViewController.this) != null) {
                HashMap hashMap = new HashMap();
                hashMap.put("accountId", dt9Var.f18052a);
                hashMap.put("accountType", null);
                hashMap.put("followSource", null);
                if (pvs.J0() && OpenSingleViewController.access$1000(OpenSingleViewController.this, dt9Var)) {
                    return;
                }
                if (dt9Var.b) {
                    OpenSingleViewController.access$900(OpenSingleViewController.this).accessListener(AccessListenerEnum.onFollowAction, hashMap);
                    if (!TextUtils.isEmpty(dt9Var.f18052a) && (tBLiveBizDataModel = OpenSingleViewController.this.mLiveDataModel) != null && (videoInfo = tBLiveBizDataModel.mVideoInfo) != null && (accountInfo = videoInfo.broadCaster) != null && dt9Var.f18052a.equals(accountInfo.accountId) && !TaoliveOpenBizCodeEnum.TaoLiveOpenBizCode_StandardOpenWatch.name().equals(OpenSingleViewController.access$900(OpenSingleViewController.this).bizCode) && !TaoliveOpenBizCodeEnum.TaoLiveOpenBizCode_Shop2F.name().equals(OpenSingleViewController.access$900(OpenSingleViewController.this).bizCode)) {
                        o3s.b(hjr.KMPTag, "open single view controller kmp send");
                        ICommentSendProxy h = d9m.h();
                        OpenSingleViewController openSingleViewController = OpenSingleViewController.this;
                        h.sendCommentAction(openSingleViewController.mContext, openSingleViewController.mFrameContext, "follow");
                        return;
                    }
                    return;
                }
                OpenSingleViewController.access$900(OpenSingleViewController.this).accessListener(AccessListenerEnum.onUnfollowAciton, hashMap);
            }
        }
    }

    private void destroy(boolean z, boolean z2) {
        cdr cdrVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b1315c1", new Object[]{this, new Boolean(z), new Boolean(z2)});
            return;
        }
        this.mRequestLiveId = null;
        this.mRequestAccountId = null;
        this.delayDidAppear = false;
        this.hasSurfaceUpdate = false;
        this.isFromBackground = false;
        wng.d = false;
        resetMoreTip();
        d9m.d().seiDispatcherQuit(this.seiDispatcher);
        bxl bxlVar = this.mPerfomenceTrackManager;
        if (bxlVar != null) {
            cdr cdrVar2 = this.mFrameContext;
            if (cdrVar2 != null) {
                bxlVar.a("liveToken", cdrVar2.p());
            }
            this.mPerfomenceTrackManager.a("switchIndex", String.valueOf(up6.W(this.mFrameContext)));
            this.mPerfomenceTrackManager.a("entryLiveSource", up6.r(this.mFrameContext));
            if (hjr.d()) {
                this.mPerfomenceTrackManager.b(rbu.w(this.mFrameContext));
            }
            this.mPerfomenceTrackManager.n(this.mTrackId);
            this.mPerfomenceTrackManager.m();
        }
        sjr.g().b(this);
        sjr.g().b(this.mEnterEndEventObserver);
        v2s.o().f().b(this);
        ohd ohdVar = this.mRecommendPop;
        if (ohdVar != null) {
            ((amr) ohdVar).s();
            this.mRecommendPop = null;
        }
        if (pvs.a2()) {
            iba.U(null, vx9.f(this.mFrameContext));
        }
        if (this.mFrameContext != null) {
            rjr.e().b(this.mFrameContext.p());
        }
        IGoodProxy n2 = d9m.n();
        cdr cdrVar3 = this.mFrameContext;
        n2.destroy(cdrVar3 == null ? null : cdrVar3.k());
        if (!(z2 || (cdrVar = this.mFrameContext) == null || cdrVar.x() == null)) {
            this.mFrameContext.x().H();
        }
        if (!(v2s.o().k() == null || this.mFollowChangeListener == null)) {
            v2s.o().k().g(this.mFollowChangeListener);
            this.mFollowChangeListener = null;
        }
        if (vc.a() && (vc.i(this.mContext) || vc.d(this.mContext))) {
            vc.l(this);
        }
        e7w.v(this.mFrameContext, this.mIVideoStatusChangeListener);
        up6.W0(null, null, this.mFrameContext);
        znm.k().h();
        q6f.b = false;
    }

    private int getJumpType() {
        Map<String, String> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("59b4c378", new Object[]{this})).intValue();
        }
        if (isFirstEnter()) {
            return sj9.v() ? 5 : 1;
        }
        if (isNewIntent()) {
            return 3;
        }
        RecModel recModel = this.mRecModel;
        return (recModel == null || (map = recModel.initParams) == null || !z9u.SOURCE_UPDOWNSWITCH.equalsIgnoreCase(map.get("livesource"))) ? 4 : 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x03f1  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x046d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x036a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void getLiveDetail(java.lang.String r17) {
        /*
            Method dump skipped, instructions count: 1183
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.taolive.room.openarchitecture.OpenSingleViewController.getLiveDetail(java.lang.String):void");
    }

    private boolean isFirstEnter() {
        Map<String, String> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("be223a5d", new Object[]{this})).booleanValue();
        }
        RecModel recModel = this.mRecModel;
        if (recModel == null || (map = recModel.initParams) == null) {
            return false;
        }
        return TextUtils.equals(map.get(yj4.PARAM_IS_FIRST_ENTER), "true");
    }

    private boolean isNewIntent() {
        Map<String, String> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4e5561dd", new Object[]{this})).booleanValue();
        }
        RecModel recModel = this.mRecModel;
        if (recModel == null || (map = recModel.initParams) == null) {
            return false;
        }
        return TextUtils.equals(map.get(yj4.PARAM_IS_NEW_INTENT), "true");
    }

    private void onRealDidAppear() {
        String str;
        n8e n8eVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0b405e", new Object[]{this});
            return;
        }
        if (!(vx9.d() == null || this.mFrameContext == null || !vx9.d().K())) {
            this.mFrameContext.q0(true);
        }
        vx9.g(this.mFrameContext);
        dir dirVar = this.mTBLIveRoomEngine;
        if (dirVar != null) {
            dirVar.h();
        }
        long currentTimeMillis = System.currentTimeMillis();
        n8e n8eVar2 = this.mVideoFrame;
        if (n8eVar2 != null) {
            n8eVar2.x(currentTimeMillis);
        }
        skv skvVar = this.mUpdownSwitchStateObserver;
        cdr cdrVar = this.mFrameContext;
        RecModel recModel = this.mRecModel;
        if (recModel != null) {
            str = recModel.liveId;
        } else {
            str = "null";
        }
        skvVar.c(cdrVar, str, hashCode(), this.mFrameContext.p());
        d9m.d().seiDispatcherInitialize(this.seiDispatcher);
        this.mDidAppear = true;
        bxl bxlVar = this.mPerfomenceTrackManager;
        if (bxlVar != null) {
            bxlVar.j(this.mFirstTime);
            this.mPerfomenceTrackManager.v(this.mTrackId);
        }
        if (!(this.mMultiRoomVideoControllerObserver == null || (n8eVar = this.mVideoFrame) == null)) {
            IPlayPublicService G = n8eVar.G();
            o3s.b(TAG, "设置给静音控制的，IPlayPublicService：" + G);
            this.mMultiRoomVideoControllerObserver.c(G);
        }
        RecModel recModel2 = this.mRecModel;
        if (!(recModel2 == null || recModel2.initParams == null)) {
            x5t.f(TAG, "onDidAppear | liveId=" + this.mRecModel.liveId);
            iba.T0(this.mRecModel.initParams, vx9.f(this.mFrameContext));
            iba.W0(this.mRecModel.initParams.get("livesource"), vx9.f(this.mFrameContext));
            iba.U0(this.mRecModel.initParams.get(yj4.PARAM_LIVE_IS_AD), vx9.f(this.mFrameContext));
        }
        TBLiveBizDataModel tBLiveBizDataModel = this.mLiveDataModel;
        if (tBLiveBizDataModel != null) {
            sendDetailResultNotify(tBLiveBizDataModel.mVideoInfo);
        }
        this.hasDidAppear = true;
        if (vwl.e().d()) {
            exectDidAppear();
        } else if (this.mRecModel == null || this.mRoomLayout == null) {
            o3s.b(TAG, "mRecModel为null直接调用onDidAppear, liveContextKey = " + this.mFrameContext.p());
            exectDidAppear();
        } else if (this.hasSurfaceRender && !this.hasExectDidAppear) {
            o3s.b(TAG, "onRealDidAppear首帧已经回调, liveContextKey = " + this.mFrameContext.p());
            surfaceRenderRequest();
        } else if (this.mVideoFrame.l()) {
            o3s.b(TAG, "onRealDidAppear首帧未出现，mRoomLayout.postDelayed 延迟1.3s等待首帧, liveContextKey = " + this.mFrameContext.p());
            this.mMainHandler.postDelayed(new n(), 1300L);
        } else {
            o3s.b(TAG, "没有preload的话直接调用onDidAppear, liveContextKey = " + this.mFrameContext.p());
            exectDidAppear();
        }
        e7w.q(this.mFrameContext, this, new o(this));
        sjr.g().a(this);
        bxl bxlVar2 = this.mPerfomenceTrackManager;
        if (bxlVar2 != null) {
            bxlVar2.k(this.mTrackId);
        }
        if (pvs.t0()) {
            cdr cdrVar2 = this.mFrameContext;
            wng.b(cdrVar2, up6.L(cdrVar2));
            bxl bxlVar3 = this.mPerfomenceTrackManager;
            if (bxlVar3 != null) {
                bxlVar3.a("kLiveRoomViewDidAppear", String.valueOf(currentTimeMillis));
                rbu.e0(this.mGlobalContext, this.mPerfomenceTrackManager);
            }
        }
        o3s.b("SingleRoomLifeCycle", "OpenSingleViewController onDidAppear liveContextKey = " + this.mFrameContext.p() + " " + this);
        iba.k1(rbu.r(this.mFrameContext), vx9.f(vx9.d()));
        afterDidAppearAndGetVideoInfo();
        initRecommendPop();
        q6q q6qVar = this.mSmartLayerManager;
        if (q6qVar != null) {
            q6qVar.e(this.mFrameContext);
        }
    }

    private void performRequestLiveDetail() {
        m2g fetchEntity;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a8679f2", new Object[]{this});
        } else if (getOpenArchEntityAdapter().l() != null && (fetchEntity = d9m.P().fetchEntity(getOpenArchEntityAdapter().l())) != null && fetchEntity.j() != null) {
            q2g a2 = q2g.Companion.a("DataServiceIntent_PerformRequestLiveDetail");
            HashMap hashMap = new HashMap();
            hashMap.put("inputParams", lzk.a(this.mFrameContext.w0(), this.mFrameContext));
            Map<String, Object> c2 = lzk.c(this.mFrameContext);
            c2.put("needRequestLiveDetail", String.valueOf(true));
            hashMap.put("localParams", c2);
            fetchEntity.j().e(toy.Companion.a(), a2, hashMap);
        }
    }

    public void init(Context context, View view) {
        LiveRoomWarmManager liveRoomWarmManager;
        azd azdVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d258e321", new Object[]{this, context, view});
            return;
        }
        h4s.c(TAG, "init");
        this.mContext = context;
        this.mFrameContext.T(new txb());
        this.mFrameContext.f29656a = sj9.k();
        this.itemView = view;
        cdr cdrVar = this.mFrameContext;
        if (cdrVar != null) {
            this.frameContextUnique = cdrVar.C();
        }
        this.mFrameContext.h1(curLiveScene());
        ViewGroup viewGroup = (ViewGroup) this.itemView.findViewById(R.id.taolive_room_layout);
        this.mRoomLayout = viewGroup;
        viewGroup.setClickable(true);
        addClickListnerForSimpleLiveRoom();
        View findViewById = view.findViewById(R.id.tab2_backgroud_view);
        ATaoLiveOpenEntity aTaoLiveOpenEntity = this.taoLiveOpenEntity;
        if (!(aTaoLiveOpenEntity == null || (azdVar = aTaoLiveOpenEntity.abilityCompontent) == null || !((ibt) azdVar).d(OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_CustomizedTopMask))) {
            if (findViewById.getLayoutParams() instanceof FrameLayout.LayoutParams) {
                ((FrameLayout.LayoutParams) findViewById.getLayoutParams()).height += nxq.o(this.mContext);
            }
            findViewById.setVisibility(0);
        }
        this.mComponentManager = new FrameManager(this.mContext);
        if (hjr.O()) {
            BaseFrame createInteractBizCenterFrame = d9m.l().createInteractBizCenterFrame(this.mContext, this.mFrameContext);
            o3s.b(TAG, "add interactBizCenterFrame: " + createInteractBizCenterFrame);
            if (createInteractBizCenterFrame != null) {
                this.mComponentManager.addComponent(createInteractBizCenterFrame);
            }
        }
        if (this.mFrameContext.A() != null && !TaoliveOpenBizCodeEnum.TaoLiveOpenBizCode_ShopTab3.toString().equals(this.mFrameContext.A().bizCode)) {
            if (view instanceof ViewGroup) {
                liveRoomWarmManager = new LiveRoomWarmManager(this.mFrameContext, context, (ViewGroup) view);
            } else {
                liveRoomWarmManager = new LiveRoomWarmManager(this.mFrameContext, context);
            }
            this.mComponentManager.addComponent(liveRoomWarmManager);
        }
        bxl bxlVar = new bxl(true);
        this.mPerfomenceTrackManager = bxlVar;
        bxlVar.q(curLiveScene());
        this.mPerfomenceTrackManager.y(this.mFrameContext);
        initVideo(context);
        this.seiDispatcher = d9m.d().createSEIDispatcher(this.mFrameContext);
        x5t.h("SingleRoomLifeCycle", "init " + this);
        initTopContainer();
        FlexaLiveX.o().z(FlexaLiveX.ATYPE, false, this.mContext);
        FlexaLiveX.o().z(FlexaLiveX.BTYPE, false, this.mContext);
        this.mMoreSwitchGuideTip = new f1j(this.mContext, this.mComponentManager, this.mFrameContext);
        h4s.e();
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00eb, code lost:
        if (r3.e(tb.vnm.PRE_CREATE_ROOM_REC + r7.mRecModel.initParams.get("livesource")) == false) goto L_0x00ed;
     */
    @Override // tb.w3d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onBindView(com.taobao.taolive.room.datamanager.model.RecModel r8) {
        /*
            Method dump skipped, instructions count: 430
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.taolive.room.openarchitecture.OpenSingleViewController.onBindView(com.taobao.taolive.room.datamanager.model.RecModel):void");
    }

    @Override // tb.w3d
    public void onDidAppear() {
        cdr cdrVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("914171dc", new Object[]{this});
            return;
        }
        h4s.c(TAG, "onDidAppear");
        bxl bxlVar = this.mPerfomenceTrackManager;
        if (bxlVar != null) {
            cba cbaVar = this.mGlobalContext;
            if (cbaVar instanceof dba) {
                bxlVar.a("lastWarmLiveID", String.valueOf(((dba) cbaVar).j0.f19971a));
                this.mPerfomenceTrackManager.a("lastSwitchIndex", String.valueOf(((dba) this.mGlobalContext).j0.b));
                this.mPerfomenceTrackManager.a("onWarmDidAppearTs", String.valueOf(((dba) this.mGlobalContext).j0.c));
                this.mPerfomenceTrackManager.a("onWarmDelayedTaskReachTs", String.valueOf(((dba) this.mGlobalContext).j0.d));
                this.mPerfomenceTrackManager.a("onRealTimeDataUpdateTs", String.valueOf(((dba) this.mGlobalContext).j0.e));
                this.mPerfomenceTrackManager.a("onWarmDisAppearTs", String.valueOf(((dba) this.mGlobalContext).j0.f));
                this.mPerfomenceTrackManager.a("onStartWarmTs", String.valueOf(((dba) this.mGlobalContext).j0.g));
                this.mPerfomenceTrackManager.a("onWarmSuccTs", String.valueOf(((dba) this.mGlobalContext).j0.h));
                ((dba) this.mGlobalContext).j0.a();
            }
        }
        if (pvs.I() && (cdrVar = this.mFrameContext) != null && cdrVar.j() != null && this.mFrameContext.w0() != null && this.mFrameContext.j().b0() && !this.mFrameContext.j().c0() && !this.mFrameContext.j().d0() && this.mFrameContext.w0().isFirst) {
            this.delayDidAppear = true;
            this.mFrameContext.j().l0(true);
        }
        if (!this.delayDidAppear) {
            onRealDidAppear();
        }
        h4s.e();
    }

    @Override // tb.w3d
    public void onWillDisappear() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94a63bd9", new Object[]{this});
            return;
        }
        h4s.c(TAG, "onWillDisappear");
        if (this.mIsDestroyed) {
            h4s.e();
        } else if (this.mHasDisappear) {
            h4s.e();
        } else {
            this.mHasDisappear = true;
            this.mMainHandler.removeCallbacksAndMessages(null);
            dir dirVar = this.mTBLIveRoomEngine;
            if (dirVar != null) {
                dirVar.p();
            }
            n8e n8eVar = this.mVideoFrame;
            if (n8eVar != null) {
                n8eVar.onWillDisappear();
                this.mVideoFrame.e(null);
            }
            skv skvVar = this.mUpdownSwitchStateObserver;
            cdr cdrVar = this.mFrameContext;
            RecModel recModel = this.mRecModel;
            if (recModel != null) {
                str = recModel.liveId;
            } else {
                str = "null";
            }
            skvVar.f(cdrVar, str, hashCode(), this.mFrameContext.p());
            TBLiveBizDataModel tBLiveBizDataModel = this.mLiveDataModel;
            if (tBLiveBizDataModel != null) {
                tBLiveBizDataModel.clearManager();
            }
            this.mLiveDataModel = null;
            BaseFrame baseFrame = this.mComponentManager;
            if (baseFrame != null) {
                baseFrame.onWillDisappear();
            }
            bxl bxlVar = this.mPerfomenceTrackManager;
            if (bxlVar != null) {
                bxlVar.x(this.mTrackId);
            }
            w73.b(this.mCardAnalysis);
            destroy();
            o3s.b("SingleRoomLifeCycle", "OpenSingleViewController onWillDisappear liveContextKey = " + this.mFrameContext.p() + " " + this);
            h4s.e();
        }
    }

    private void afterDidAppearAndGetVideoInfo() {
        TBLiveBizDataModel tBLiveBizDataModel;
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("444fcc79", new Object[]{this});
        } else if (this.mDidAppear && this.mLiveDataModel != null) {
            cba cbaVar = this.mGlobalContext;
            if (!(cbaVar == null || cbaVar.u == null)) {
                HashMap<String, String> hashMap = new HashMap<>();
                hashMap.put("liveToken", this.mFrameContext.p());
                hashMap.put("jumpType", String.valueOf(getJumpType()));
                TBLiveBizDataModel tBLiveBizDataModel2 = this.mLiveDataModel;
                if (ubt.a(tBLiveBizDataModel2.mVideoInfo, tBLiveBizDataModel2.mInitParams.get(yj4.PARAM_SJSD_ITEM_ID), this.mLiveDataModel.mInitParams.get("keyPointId")) != null) {
                    z = true;
                }
                hashMap.put("isTimeMove", String.valueOf(z));
                this.mGlobalContext.u.e(this.mLiveDataModel, hashMap);
            }
            if (ggv.a() && (tBLiveBizDataModel = this.mLiveDataModel) != null) {
                egv.o(this.mContext, this.mFrameContext, tBLiveBizDataModel);
            }
            initSmartLayer();
        }
    }

    private void checkLiveDetailError(VideoInfo videoInfo, boolean z) {
        RecModel recModel;
        String str;
        boolean z2 = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c716da31", new Object[]{this, videoInfo, new Boolean(z)});
        } else if (videoInfo != null && !gnk.a().e(videoInfo) && (recModel = this.mRecModel) != null) {
            String str2 = recModel.liveId;
            boolean z3 = str2 != null && !str2.isEmpty();
            String str3 = this.mRecModel.accountId;
            boolean z4 = str3 != null && !str3.isEmpty();
            boolean z5 = z3 ? !this.mRecModel.liveId.equals(videoInfo.liveId) : false;
            if (z4) {
                z2 = !this.mRecModel.accountId.equals(videoInfo.broadCaster.accountId);
            }
            if (z) {
                return;
            }
            if (z5 || z2) {
                RecModel recModel2 = this.mRecModel;
                String str4 = recModel2.liveId;
                String str5 = recModel2.accountId;
                String str6 = videoInfo.liveId;
                if (str6 == null) {
                    str6 = "null";
                }
                if (this.mFrameContext.p() != null) {
                    str = this.mFrameContext.p();
                } else {
                    str = "unknown";
                }
                reportCheckLiveDetailWithBindModelError(str4, str5, str6, str);
            }
        }
    }

    private void checkTcpouterAccountId(VideoInfo videoInfo) {
        String str;
        Uri parse;
        AccountInfo accountInfo;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29f549c0", new Object[]{this, videoInfo});
            return;
        }
        String L = up6.L(this.mFrameContext);
        if (!TextUtils.isEmpty(L) && L.startsWith("tcpouter")) {
            String str2 = "";
            String str3 = (videoInfo == null || (accountInfo = videoInfo.broadCaster) == null) ? str2 : accountInfo.accountId;
            String C = iba.C(this.mGlobalContext);
            if (TextUtils.isEmpty(C) || (parse = Uri.parse(C)) == null || parse.isOpaque()) {
                str = null;
            } else {
                str2 = parse.getQueryParameter("userId");
                str = parse.getQueryParameter(yj4.PARAM_TCP_OUTER_PARAM);
            }
            if (TextUtils.isEmpty(str2) || !TextUtils.equals(str2, str3)) {
                z = false;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("livesource", L);
            hashMap.put("urlUserId", str2);
            hashMap.put("liveDetailAccountId", str3);
            hashMap.put("isEqualAccountId", String.valueOf(z));
            hashMap.put("tcpouterParams", str);
            if (v2s.o().s() != null) {
                v2s.o().s().a("tcpouterCheckAccountId", "Page_TaobaoLiveWatch", hashMap);
            }
            if (!z) {
                rbu.K(this.mFrameContext, "tcpouterCheckEqualAccountId", hashMap);
            }
        }
    }

    private void forceRefresh() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c16dddf7", new Object[]{this});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(NotificationCompat.MessagingStyle.Message.KEY_DATA_URI, Uri.parse(zlr.GUANG_REFRESH_URL));
        Boolean bool = Boolean.TRUE;
        hashMap.put("forceRefresh", bool);
        hashMap.put("needUT", bool);
        this.taoLiveOpenEntity.callWatchPlatform(WatchPlatformListenerEnum.refreshByUi, hashMap);
    }

    private boolean isOfficialType(VideoInfo videoInfo) {
        VideoInfo.OfficialLiveInfo officialLiveInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fbd783fb", new Object[]{this, videoInfo})).booleanValue();
        }
        return (videoInfo == null || (officialLiveInfo = videoInfo.officialLiveInfo) == null || !"official".equals(officialLiveInfo.officialLive)) ? false : true;
    }

    private void showError() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed586412", new Object[]{this});
            return;
        }
        if (d4s.e("enableCmpErrorView", true)) {
            showError4CMP(new q());
        } else if (!pvs.w0() || this.taoLiveOpenEntity == null || TaoliveOpenBizCodeEnum.TaoLiveOpenBizCode_ShopTab3.toString().equals(this.taoLiveOpenEntity.bizCode)) {
            if (this.mErrorView == null) {
                ViewStub viewStub = (ViewStub) this.itemView.findViewById(R.id.taolive_status_error_stub);
                viewStub.setLayoutResource(R.layout.taolive_status_error_layout);
                this.mErrorView = viewStub.inflate();
            }
            View view = this.mErrorView;
            if (view != null) {
                ((TextView) view.findViewById(R.id.taolive_error_title)).setText(R.string.taolive_status_error_hang);
                ViewProxy.setOnClickListener(this.mErrorView.findViewById(R.id.taolive_error_button), new s());
                this.mErrorView.setVisibility(0);
            }
        } else {
            if (this.mErrorView == null) {
                ViewStub viewStub2 = (ViewStub) this.itemView.findViewById(R.id.taolive_status_error_stub);
                viewStub2.setLayoutResource(R.layout.taolive_status_error_new_layout);
                this.mErrorView = viewStub2.inflate();
            }
            View view2 = this.mErrorView;
            if (view2 != null) {
                TBErrorViewWidget tBErrorViewWidget = (TBErrorViewWidget) view2.findViewById(R.id.error_view_widget);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) tBErrorViewWidget.getLayoutParams();
                Context context = this.mContext;
                if (context instanceof Activity) {
                    layoutParams.width = TBErrorViewWidget.getSuggestedWidth((Activity) context);
                }
                if (TaoliveOpenBizCodeEnum.TaoLiveOpenBizCode_Tab2.toString().equals(this.taoLiveOpenEntity.bizCode)) {
                    layoutParams.bottomMargin = hw0.b(this.mContext, 56.0f);
                }
                tBErrorViewWidget.setLayoutParams(layoutParams);
                tBErrorViewWidget.setTopic(H5EmbedView.VIEW_TYPE);
                tBErrorViewWidget.setStatus(TBErrorViewWidget.Status.STATUS_NETWORK_ERROR);
                tBErrorViewWidget.setRefreshButton(new r());
                this.mErrorView.setVisibility(0);
            }
        }
        sjr.g().c("com.taobao.taolive.room.show_error", null, this.frameContextUnique);
    }

    private boolean showKandian(VideoInfo videoInfo, fxa fxaVar) {
        cba cbaVar;
        cdr cdrVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("277d9795", new Object[]{this, videoInfo, fxaVar})).booleanValue();
        }
        if (pvs.f3()) {
            this.mVideoFrame.a(videoInfo, fxaVar);
        }
        rc.f(this.mContext, this.mFrameContext);
        up6.c(this.mFrameContext, VideoStatus.VIDEO_TIMESHIFT_STATUS);
        if ((this.mRecModel.isFirst && (cdrVar = this.mFrameContext) != null && cdrVar.p0) || ((cbaVar = this.mGlobalContext) != null && cbaVar.X)) {
            up6.R0(1, this.mFrameContext);
            cba cbaVar2 = this.mGlobalContext;
            if (cbaVar2 instanceof dba) {
                ((dba) cbaVar2).h0 = true;
            }
            cdr cdrVar2 = this.mFrameContext;
            if (cdrVar2 != null) {
                cdrVar2.p0 = true;
            }
        }
        nwa.a(this.mFrameContext).f24989a = this.mRecModel.initParams.get("scm");
        TBLiveBizDataModel tBLiveBizDataModel = this.mLiveDataModel;
        if (tBLiveBizDataModel == null || tBLiveBizDataModel.mVideoInfo == null) {
            return true;
        }
        e7w.t(this.mFrameContext, tBLiveBizDataModel);
        TBLiveBizDataModel tBLiveBizDataModel2 = this.mLiveDataModel;
        if (tBLiveBizDataModel2 != null) {
            up6.W0(tBLiveBizDataModel2, tBLiveBizDataModel2.mVideoInfo, this.mFrameContext);
        }
        RecModel recModel = this.mRecModel;
        if (recModel.liveUrlList != null) {
            recModel.liveUrlList = null;
        }
        BaseFrame baseFrame = this.mRoomController;
        if (baseFrame != null && !(baseFrame instanceof TaoliveHighlightController)) {
            this.mComponentManager.deleteComponent(baseFrame);
            this.mRoomController.onDestroy();
            this.mRoomController = null;
        }
        up6.U0(true, this.mFrameContext);
        if ((this.mRoomController instanceof TaoliveHighlightController) && uwa.i()) {
            ((TaoliveHighlightController) this.mRoomController).setmBasePreloadRequest(null);
        }
        this.mComponentManager.onBindData(this.mLiveDataModel);
        BaseFrame baseFrame2 = this.mRoomController;
        if (baseFrame2 == null) {
            this.mRoomController = new TaoliveHighlightController(this.mContext, videoInfo.landScape, this.mLiveDataModel, this.mFrameContext);
            ((TaoliveHighlightController) this.mRoomController).initFrameLayout(this.mVideoFrame, this.mRoomLayout, (AliUrlImageView) this.itemView.findViewById(R.id.taolive_background_image), this.mPerfomenceTrackManager, fxaVar, null);
            this.mComponentManager.addComponent(this.mRoomController);
        } else if (baseFrame2 instanceof TaoliveHighlightController) {
            ((TaoliveHighlightController) baseFrame2).updateHighlightPlayInfo(fxaVar);
        }
        bxl bxlVar = this.mPerfomenceTrackManager;
        if (bxlVar != null) {
            bxlVar.A(com.taobao.live.timemove.base.data.RecModel.MEDIA_TYPE_TIMEMOVE);
        }
        cdr cdrVar3 = this.mFrameContext;
        if (cdrVar3 != null && (cdrVar3.j() instanceof dba)) {
            ((dba) this.mFrameContext.j()).f0 = com.taobao.live.timemove.base.data.RecModel.MEDIA_TYPE_TIMEMOVE;
        }
        return false;
    }

    private void surfaceRenderRequest() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf32e6f3", new Object[]{this});
            return;
        }
        this.hasSurfaceRender = true;
        if (!this.hasExectDidAppear && this.hasDidAppear) {
            this.hasExectDidAppear = true;
            exectDidAppear();
            if (iw0.j(this.mContext)) {
                Toast.makeText(this.mContext, "上下滑优化开启", 0).show();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0068, code lost:
        if (r2.e(tb.vnm.PRE_CREATE_ROOM_REC + r6.mRecModel.initParams.get("livesource")) == false) goto L_0x006a;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean isPreRequest() {
        /*
            r6 = this;
            r0 = 0
            r1 = 1
            com.android.alibaba.ip.runtime.IpChange r2 = com.taobao.taolive.room.openarchitecture.OpenSingleViewController.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x0019
            java.lang.String r3 = "5f0720c1"
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r0] = r6
            java.lang.Object r0 = r2.ipc$dispatch(r3, r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L_0x0019:
            com.taobao.taolive.room.datamanager.model.RecModel r2 = r6.mRecModel
            if (r2 == 0) goto L_0x0092
            boolean r2 = tb.qvs.v()
            if (r2 == 0) goto L_0x0031
            tb.vnm r2 = tb.vnm.c()
            com.taobao.taolive.room.datamanager.model.RecModel r3 = r6.mRecModel
            java.lang.String r3 = r3.liveId
            boolean r2 = r2.e(r3)
            if (r2 != 0) goto L_0x0091
        L_0x0031:
            com.taobao.taolive.room.datamanager.model.RecModel r2 = r6.mRecModel
            java.util.Map<java.lang.String, java.lang.String> r2 = r2.initParams
            java.lang.String r3 = "shouldUsePreRecommend"
            java.lang.Object r2 = r2.get(r3)
            java.lang.String r2 = (java.lang.String) r2
            boolean r2 = java.lang.Boolean.parseBoolean(r2)
            if (r2 == 0) goto L_0x006a
            tb.vnm r2 = tb.vnm.c()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "isPreCreateRoomRec"
            r3.<init>(r4)
            com.taobao.taolive.room.datamanager.model.RecModel r4 = r6.mRecModel
            java.util.Map<java.lang.String, java.lang.String> r4 = r4.initParams
            java.lang.String r5 = "livesource"
            java.lang.Object r4 = r4.get(r5)
            java.lang.String r4 = (java.lang.String) r4
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            boolean r2 = r2.e(r3)
            if (r2 != 0) goto L_0x0091
        L_0x006a:
            com.taobao.taolive.room.datamanager.model.RecModel r2 = r6.mRecModel
            java.util.Map<java.lang.String, java.lang.String> r2 = r2.initParams
            java.lang.String r3 = "preRequestTimeMoveKey"
            java.lang.Object r2 = r2.get(r3)
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L_0x0092
            tb.vnm r2 = tb.vnm.c()
            com.taobao.taolive.room.datamanager.model.RecModel r4 = r6.mRecModel
            java.util.Map<java.lang.String, java.lang.String> r4 = r4.initParams
            java.lang.Object r3 = r4.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            boolean r2 = r2.e(r3)
            if (r2 == 0) goto L_0x0092
        L_0x0091:
            return r1
        L_0x0092:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.taolive.room.openarchitecture.OpenSingleViewController.isPreRequest():boolean");
    }

    @Override // tb.w3d
    public void onDidDisappear() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b505106a", new Object[]{this});
            return;
        }
        h4s.c(TAG, "onDidDisappear");
        sj9.D("TaoLiveSingleRoomController_onDidDisappear");
        volumeChangeHide();
        this.mDidAppear = false;
        if (!this.mIsDestroyed && !this.mHasDisappear) {
            this.mHasDisappear = true;
            this.mMainHandler.removeCallbacksAndMessages(null);
            n8e n8eVar = this.mVideoFrame;
            if (n8eVar != null) {
                n8eVar.onDidDisappear();
                this.mVideoFrame.e(null);
            }
            if (this.mDataProvider != null && pvs.B()) {
                this.mDataProvider.destroy();
            }
            dir dirVar = this.mTBLIveRoomEngine;
            if (dirVar != null) {
                dirVar.i();
            }
            skv skvVar = this.mUpdownSwitchStateObserver;
            cdr cdrVar = this.mFrameContext;
            RecModel recModel = this.mRecModel;
            if (recModel != null) {
                str = recModel.liveId;
            } else {
                str = "null";
            }
            skvVar.d(cdrVar, str, hashCode(), this.mFrameContext.p());
            bxl bxlVar = this.mPerfomenceTrackManager;
            if (bxlVar != null) {
                bxlVar.x(this.mTrackId);
            }
            if (bl9.g().b() && d9m.e().getBackwardX() != null) {
                d9m.e().getBackwardX().b(this.mLiveDataModel, vx9.f(this.mFrameContext));
            }
            TBLiveBizDataModel tBLiveBizDataModel = this.mLiveDataModel;
            if (tBLiveBizDataModel != null) {
                tBLiveBizDataModel.clearManager();
            }
            this.mLiveDataModel = null;
            if (this.mComponentManager != null) {
                o3s.b("JingChunLifecycle", "TaoLiveSingleRoomController onDidDisappear liveId=" + this.mRecModel.liveId + " liveContextKey = " + this.mFrameContext.p());
                this.mComponentManager.onDidDisappear();
            }
            q6q q6qVar = this.mSmartLayerManager;
            if (q6qVar != null) {
                q6qVar.f(this.mFrameContext);
            }
            showWidgets("close");
            cdr cdrVar2 = this.mFrameContext;
            if (cdrVar2 != null) {
                e7w.e(cdrVar2, false, cdrVar2.p());
                f8c i2 = this.mFrameContext.i();
                if (i2 instanceof n23) {
                    ((n23) i2).a();
                }
            }
            up6.c(this.mFrameContext, VideoStatus.VIDEO_NORMAL_STATUS);
            w73.b(this.mCardAnalysis);
            destroy();
            o3s.b("SingleRoomLifeCycle", "OpenSingleViewController onDidDisappear liveContextKey = " + this.mFrameContext.p() + " " + this);
            h4s.e();
        }
    }

    @Override // tb.s3c
    public void onEvent(String str, Object obj) {
        n8e n8eVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3897928", new Object[]{this, str, obj});
        } else if (uyg.EVENT_MEDIAPLATFORM_HIDE_WIDGETS.equals(str)) {
            hideWidgets((String) obj);
        } else if (uyg.EVENT_MEDIAPLATFORM_SHOW_WIDGETS.equals(str)) {
            showWidgets((String) obj);
        } else if ("com.taobao.taolive.room.addcart_for_showcase".equals(str)) {
            if (obj instanceof LiveItem) {
                LiveItem liveItem = (LiveItem) obj;
                HashMap hashMap = new HashMap();
                Map<String, String> map = liveItem.extraUTParams;
                if (map != null) {
                    hashMap.putAll(map);
                }
                hashMap.put("channel", "bubble");
                hashMap.put("laiyuan", "1");
                LiveItem.Ext ext = liveItem.extendVal;
                if (ext != null) {
                    hashMap.put("itemBizType", ext.itemBizType);
                }
                u90.a((Activity) this.mContext, 10000, liveItem, hashMap);
            }
        } else if (FullScreenFrame.EVENT_TAOLIVE_ROOM_CLEAR_SCREEN.equals(str)) {
            showWidgets("close");
        } else if ("com.taobao.taolive.room.enable_updown_switch".equals(str)) {
            if (pvs.W1() && this.mFrameContext.A() != null) {
                this.mFrameContext.A().accessListener(AccessListenerEnum.onVerticalScrollEnable, new Object[0]);
            }
        } else if ("com.taobao.taolive.room.disable_updown_switch".equals(str)) {
            if (pvs.W1() && this.mFrameContext.A() != null) {
                this.mFrameContext.A().accessListener(AccessListenerEnum.onVerticalScrollDisable, new Object[0]);
            }
        } else if (FullScreenFrame.EVENT_ENABLE_LEFTRIGHT_SWITCH.equals(str)) {
            if (pvs.r0() && this.mFrameContext.A() != null) {
                this.mFrameContext.A().accessListener(AccessListenerEnum.onHorizontalScrollEnable, new Object[0]);
            }
        } else if (FullScreenFrame.EVENT_DISABLE_LEFTRIGHT_SWITCH.equals(str)) {
            if (pvs.r0() && this.mFrameContext.A() != null) {
                this.mFrameContext.A().accessListener(AccessListenerEnum.onHorizontalScrollDisable, new Object[0]);
            }
        } else if (LiveMediaManager.EVENT_ACTION_SHOW_SWITCH_TIP.equals(str)) {
            showMoreTip();
        } else if (uyg.c.equals(str)) {
            if (obj instanceof Integer) {
                int intValue = (int) ((this.mContext.getResources().getDisplayMetrics().widthPixels / 750.0f) * (((Integer) obj).intValue() + hjr.a()));
                n8e n8eVar2 = this.mVideoFrame;
                if (n8eVar2 != null) {
                    View contentView = n8eVar2.getContentView();
                    if (contentView != null) {
                        contentView.setClipToOutline(true);
                        contentView.setOutlineProvider(new c(this));
                    }
                    this.itemView.setBackgroundColor(-16777216);
                    this.mVideoFrame.C(-intValue, 300L);
                }
            }
        } else if (!uyg.d.equals(str)) {
        } else {
            if ((!(obj instanceof String) || !obj.equals("videoViewUp")) && (n8eVar = this.mVideoFrame) != null) {
                View contentView2 = n8eVar.getContentView();
                if (contentView2 != null) {
                    contentView2.setClipToOutline(true);
                    contentView2.setOutlineProvider(new d(this));
                }
                this.mVideoFrame.C(0.0f, 300L);
            }
        }
    }

    @Override // tb.t4w
    public void onSurfaceRenderFirstFrame(long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a630cefc", new Object[]{this, new Long(j2)});
            return;
        }
        if (pvs.b0() && !this.mFrameContext.j().O && this.mRoomLayout != null) {
            this.mMainHandler.post(new g());
        }
        if (pvs.t0() && !this.hasSurfaceUpdate && this.mPerfomenceTrackManager != null && this.mGlobalContext != null) {
            HashMap hashMap = new HashMap();
            if ((!isFirstEnter() || !wng.d) && !this.isFromBackground) {
                putKLifecycleParam("kLivePlayerSuccess", System.currentTimeMillis());
                putKLifecycleParam("kLiveLowerPlayerSuccess", j2);
            } else {
                this.mPerfomenceTrackManager.a("kLivePlayerSuccess", String.valueOf(1000));
                this.mPerfomenceTrackManager.a("kLiveLowerPlayerSuccess", String.valueOf(1000));
                hashMap.put("kLivePlayerSuccess", String.valueOf(1000));
            }
            rbu.e0(this.mGlobalContext, this.mPerfomenceTrackManager);
            h4s.b("KLifecycle_first_frame_actual");
            h4s.e();
            this.hasSurfaceUpdate = true;
        }
        this.isFromBackground = false;
        wng.d = false;
    }

    public void onDestroy(boolean z) {
        AccountInfo accountInfo;
        AccountInfo accountInfo2;
        n8e n8eVar;
        boolean z2 = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("241196f2", new Object[]{this, new Boolean(z)});
            return;
        }
        cdr cdrVar = this.mFrameContext;
        if (cdrVar != null) {
            e7w.e(cdrVar, false, cdrVar.p());
        }
        if (!pvs.D() && (n8eVar = this.mVideoFrame) != null) {
            n8eVar.onDestroy();
        }
        n8e n8eVar2 = this.mVideoFrame;
        boolean onDestroy = n8eVar2 != null ? n8eVar2.onDestroy() : false;
        dir dirVar = this.mTBLIveRoomEngine;
        if (dirVar != null) {
            dirVar.g();
        }
        ohd ohdVar = this.mRecommendPop;
        if (ohdVar != null) {
            ((amr) ohdVar).s();
            this.mRecommendPop = null;
        }
        skv skvVar = this.mUpdownSwitchStateObserver;
        cdr cdrVar2 = this.mFrameContext;
        RecModel recModel = this.mRecModel;
        skvVar.b(cdrVar2, recModel != null ? recModel.liveId : "null", hashCode(), this.mFrameContext.p());
        if (bl9.g().b() && d9m.e().getBackwardX() != null) {
            d9m.e().getBackwardX().b(this.mLiveDataModel, vx9.f(this.mFrameContext));
        }
        TBLiveBizDataModel tBLiveBizDataModel = this.mLiveDataModel;
        if (tBLiveBizDataModel != null) {
            VideoInfo videoInfo = tBLiveBizDataModel.mVideoInfo;
            if (videoInfo == null || (accountInfo2 = videoInfo.broadCaster) == null) {
                FandomInfo fandomInfo = tBLiveBizDataModel.mFandomInfo;
                if (fandomInfo == null || (accountInfo = fandomInfo.broadCaster) == null) {
                    iba.R(null, vx9.f(this.mFrameContext));
                } else {
                    iba.R(accountInfo.headImg, vx9.f(this.mFrameContext));
                }
            } else {
                iba.R(accountInfo2.headImg, vx9.f(this.mFrameContext));
            }
        }
        BaseFrame baseFrame = this.mComponentManager;
        if (baseFrame != null) {
            baseFrame.onDestroy();
        }
        this.mRoomController = null;
        ViewGroup viewGroup = this.mRoomLayout;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        volumeChangeHide();
        TBLiveBizDataModel tBLiveBizDataModel2 = this.mLiveDataModel;
        if (tBLiveBizDataModel2 != null) {
            tBLiveBizDataModel2.clearManager();
        }
        this.mLiveDataModel = null;
        this.mIsDestroyed = true;
        if (!pvs.w1() || !onDestroy) {
            z2 = false;
        }
        destroy(z, z2);
        q6q q6qVar = this.mSmartLayerManager;
        if (q6qVar != null) {
            q6qVar.d(this.mFrameContext);
            this.mSmartLayerManager = null;
            cba cbaVar = this.mGlobalContext;
            if (cbaVar instanceof dba) {
                ((dba) cbaVar).k0 = null;
            }
        }
        v73 v73Var = this.mCardAnalysis;
        if (v73Var != null) {
            v73Var.n();
            this.mCardAnalysis = null;
        }
        o3s.b("SingleRoomLifeCycle", "OpenSingleViewController onDestroy liveContextKey = " + this.mFrameContext.p() + " " + this);
    }

    private String generateLiveContextKey() {
        String str;
        RecModel recModel;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("dc914e88", new Object[]{this});
        }
        if (!pvs.q1() || !sj9.s() || TextUtils.isEmpty(znm.k().l())) {
            RecModel recModel2 = this.mRecModel;
            String str2 = "";
            String str3 = recModel2 == null ? str2 : recModel2.liveId;
            if (recModel2 != null) {
                str2 = recModel2.accountId;
            }
            str = generateLiveContextKey(this.mGlobalContext, str3, str2);
        } else {
            str = znm.k().l();
        }
        cdr cdrVar = this.mFrameContext;
        if (cdrVar != null) {
            cdrVar.e0(str);
        }
        cdr cdrVar2 = this.mFrameContext;
        if (!(cdrVar2 == null || (recModel = this.mRecModel) == null)) {
            cdrVar2.i = recModel.liveId;
        }
        up6.G0(str, cdrVar2);
        return str;
    }

    @Override // tb.hlc.a
    public void onGetVideoInfoSuccess(VideoInfo videoInfo, String str) {
        boolean z;
        VideoInfo.DynamicRender dynamicRender;
        String str2;
        LiveItem.TimeMovingPlayInfo timeMovingPlayInfo;
        azd azdVar;
        Boolean bool;
        View view;
        JSONObject jSONObject;
        JSONObject jSONObject2;
        int i2;
        Map<String, String> map;
        bxl bxlVar;
        k6m b2;
        cdr cdrVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889673f", new Object[]{this, videoInfo, str});
            return;
        }
        if (videoInfo != null) {
            o3s.b("SingleRoomLifeCycle", "OpenSingleViewController onGetVideoInfoSuccess " + videoInfo.liveId + " mRequestLiveId = " + this.mRequestLiveId + " mRequestAccountId = " + this.mRequestAccountId + " liveContextKey = " + this.mFrameContext.p() + " " + this);
        }
        this.mPerfomenceTrackManager.a(bxl.DETAIL_SUCCESS, "true");
        this.mPerfomenceTrackManager.a(bxl.DETAIL_END_TS, String.valueOf(System.currentTimeMillis()));
        if (videoInfo != null && videoInfo.getMtopResult() != null && videoInfo.getMtopResult().f31880a > 0 && videoInfo.getMtopResult().c > 0) {
            this.mPerfomenceTrackManager.a(bxl.DETAIL_RECEIVE_TS, String.valueOf(videoInfo.getMtopResult().f31880a));
            this.mPerfomenceTrackManager.a(bxl.DETAIL_MODEL_TS, String.valueOf(videoInfo.getMtopResult().c));
        }
        FlexaLiveX.v(this.mContext);
        putKLifecycleParam("kLiveDetailInfoSuccess", System.currentTimeMillis());
        if (!this.mIsDestroyed && videoInfo != null && videoInfo.broadCaster != null) {
            syncLiveDetailToKMP(str);
            boolean h2 = yqq.h(this.mRecModel.initParams.get(yj4.PARAM_NEED_RECOMMEND));
            if (Boolean.parseBoolean(this.mRecModel.initParams.get(yj4.SHOULD_USE_PRE_CREATE_REC))) {
                vnm c2 = vnm.c();
                c2.i(vnm.PRE_CREATE_ROOM_REC + this.mRecModel.initParams.get("livesource"));
            }
            boolean z2 = videoInfo.roomType == 13 || up6.w0(videoInfo, this.mFrameContext);
            if (h2 || z2 || checkLiveId(videoInfo) || checkTopic(videoInfo) || checkAccountId(videoInfo)) {
                String str3 = null;
                this.mRequestLiveId = null;
                this.mRequestAccountId = null;
                o3s.b("SingleRoomLifeCycle", "OpenSingleViewController onGetVideoInfoSuccess checkLiveId = true liveId = " + videoInfo.liveId + " liveContextKey = " + this.mFrameContext.p() + " " + this);
                if (qvs.F() && (cdrVar = this.mFrameContext) != null) {
                    cdrVar.f0(new com.taobao.taolive.room.business.mess.a());
                }
                this.mFrameContext.Q0(videoInfo);
                if (this.mDidAppear) {
                    sendDetailResultNotify(videoInfo);
                }
                dir dirVar = this.mTBLIveRoomEngine;
                if (dirVar != null) {
                    dirVar.l(videoInfo);
                }
                checkLiveDetailError(videoInfo, h2);
                checkTcpouterAccountId(videoInfo);
                sj9.x(this.mFrameContext, videoInfo.roomStatus);
                bxl bxlVar2 = this.mPerfomenceTrackManager;
                if (!(bxlVar2 == null || bxlVar2.c() == null || (b2 = l6m.c().b(this.mPerfomenceTrackManager.c())) == null)) {
                    b2.d = String.valueOf(videoInfo.status);
                }
                if (up6.o(this.mFrameContext)) {
                    up6.J0(this.mFrameContext, false);
                    up6.K0(this.mFrameContext, videoInfo.liveId);
                }
                updateDisPatchTrackInfo(videoInfo.disPatchTrackInfo);
                if (TextUtils.isEmpty(this.mRecModel.liveId)) {
                    this.mRecModel.liveId = videoInfo.liveId;
                    if (!(!pvs.s0() || (map = this.mRecModel.initParams) == null || (bxlVar = this.mPerfomenceTrackManager) == null || this.mVideoFrame == null)) {
                        String str4 = videoInfo.liveId;
                        this.mTrackId = str4;
                        bxlVar.D(str4, map.get("livesource"), null, null);
                        this.mVideoFrame.h(this.mPerfomenceTrackManager, videoInfo.liveId);
                    }
                }
                if (TextUtils.isEmpty(this.mRecModel.accountId)) {
                    this.mRecModel.accountId = videoInfo.broadCaster.accountId;
                }
                if (TextUtils.isEmpty(this.mRecModel.actionUrl)) {
                    this.mRecModel.actionUrl = u90.h(videoInfo.nativeFeedDetailUrl, z9u.SOURCE_UPDOWNSWITCH);
                    String O = up6.O(this.mFrameContext);
                    if (!TextUtils.isEmpty(O)) {
                        String queryParameter = Uri.parse(O).getQueryParameter(yj4.PARAM_LIVE_AD_PARAMS);
                        if (!TextUtils.isEmpty(queryParameter)) {
                            RecModel recModel = this.mRecModel;
                            recModel.actionUrl = this.mRecModel.actionUrl + "&liveAdParams=" + Uri.encode(queryParameter);
                        }
                    }
                    z = true;
                } else {
                    z = false;
                }
                RecModel recModel2 = this.mRecModel;
                if (recModel2.liveUrlList == null) {
                    recModel2.liveUrlList = videoInfo.liveUrlList;
                    recModel2.h265 = videoInfo.h265;
                    recModel2.rateAdapte = videoInfo.rateAdapte;
                    recModel2.edgePcdn = videoInfo.edgePcdn;
                    recModel2.mediaConfig = videoInfo.mediaConfig;
                }
                if (!(!recModel2.isFirst || (i2 = videoInfo.status) == 0 || i2 == 3)) {
                    recModel2.supportPreLoad = 0L;
                }
                cdr cdrVar2 = this.mFrameContext;
                if (!(cdrVar2 == null || cdrVar2.A() == null || this.mFrameContext.A().abilityCompontent == null || !((ibt) this.mFrameContext.A().abilityCompontent).d(OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_Hide_Half_Detail) || (jSONObject2 = videoInfo.itemConfigInfo) == null)) {
                    jSONObject2.put(bia.UNDER_TAKE_INSIDE_DETAIL, (Object) Boolean.FALSE);
                }
                if (up6.q0(this.mFrameContext) && pvs.h0() && (jSONObject = videoInfo.itemConfigInfo) != null) {
                    jSONObject.put(bia.UNDER_TAKE_INSIDE_DETAIL, (Object) Boolean.FALSE);
                }
                TBLiveBizDataModel tBLiveBizDataModel = new TBLiveBizDataModel();
                this.mLiveDataModel = tBLiveBizDataModel;
                tBLiveBizDataModel.mViewItemId = this.mRecModel.getViewItemId();
                this.mLiveDataModel.mVideoInfo = videoInfo;
                try {
                    videoInfo.originalData = JSON.parseObject(str);
                } catch (Exception unused) {
                }
                TBLiveBizDataModel tBLiveBizDataModel2 = this.mLiveDataModel;
                tBLiveBizDataModel2.mFandomInfo = null;
                tBLiveBizDataModel2.mRoomInfo = new ChatRoomInfo();
                TBLiveBizDataModel tBLiveBizDataModel3 = this.mLiveDataModel;
                tBLiveBizDataModel3.mRoomInfo.roomId = videoInfo.topic;
                tBLiveBizDataModel3.mRawData = str;
                tBLiveBizDataModel3.mInitParams = new HashMap();
                this.mLiveDataModel.mInitParams.putAll(this.mRecModel.initParams);
                TBLiveBizDataModel tBLiveBizDataModel4 = this.mLiveDataModel;
                RecModel recModel3 = this.mRecModel;
                tBLiveBizDataModel4.mActionUrl = recModel3.actionUrl;
                tBLiveBizDataModel4.perfomenceTrackManager = this.mPerfomenceTrackManager;
                iba.C0(recModel3.isFirst, vx9.f(this.mFrameContext));
                n8e n8eVar = this.mVideoFrame;
                if (n8eVar != null) {
                    n8eVar.i(videoInfo, this.mLiveDataModel);
                }
                this.mFrameContext.r0(this.mRecModel.initParams);
                q6q q6qVar = this.mSmartLayerManager;
                if (q6qVar != null) {
                    q6qVar.l(q6q.b(this.mFrameContext, this.mLiveDataModel, null), (Activity) this.mContext, this.mFrameContext);
                }
                afterDidAppearAndGetVideoInfo();
                cdr cdrVar3 = this.mFrameContext;
                if (!(cdrVar3 == null || cdrVar3.j() == null)) {
                    boolean z3 = this.mFrameContext.j().O;
                }
                igq.n().r("liveDetail", str);
                updateBackward();
                hideError();
                boolean h3 = yqq.h(this.mLiveDataModel.mInitParams.get(yj4.PARAM_SHOW_ANIMATED));
                ViewGroup viewGroup = this.mRoomLayout;
                if (viewGroup != null && h3) {
                    viewGroup.setAlpha(0.0f);
                }
                initRec(videoInfo);
                if (videoInfo.isOfficialLive()) {
                    sjr.g().e("com.taobao.taolive.room.updownswitch.official.dedup", videoInfo);
                }
                String str5 = this.mRecModel.initParams.get(yj4.PARAM_TRANSPARENT_PARAMS);
                nwa a2 = nwa.a(this.mFrameContext);
                a2.d(new gbt());
                nwa.b().d(new gbt());
                if (a2.c() != null) {
                    a2.c().d(str5);
                }
                initKandianUTParams();
                up6.U0(false, this.mFrameContext);
                up6.R0(0, this.mFrameContext);
                cba cbaVar = this.mGlobalContext;
                if (cbaVar instanceof dba) {
                    ((dba) cbaVar).h0 = false;
                }
                dxa.b(this.mFrameContext).o(new pwg());
                dxa.e().o(new pwg());
                cdr cdrVar4 = this.mFrameContext;
                if (cdrVar4 != null) {
                    cdrVar4.b = new c1j();
                }
                if (bl9.g().b()) {
                    d9m.J().initTaoliveMore();
                }
                TBLiveBizDataModel tBLiveBizDataModel5 = this.mLiveDataModel;
                fxa a3 = ubt.a(tBLiveBizDataModel5.mVideoInfo, tBLiveBizDataModel5.mInitParams.get(yj4.PARAM_SJSD_ITEM_ID), this.mLiveDataModel.mInitParams.get("keyPointId"));
                if (videoInfo.status == 1) {
                    if (d4s.e("enableReadyRecommend", true) && (bool = videoInfo.trialBroadcast) != null && bool.booleanValue() && (view = this.itemView) != null) {
                        ViewStub viewStub = (ViewStub) view.findViewById(R.id.taolive_live_ready_recommend_container);
                        BaseFrame liveReadyFrame = d9m.y().getLiveReadyFrame(this.mContext, this.mFrameContext);
                        if (viewStub != null && liveReadyFrame != null) {
                            liveReadyFrame.createView(viewStub);
                            liveReadyFrame.onDataReceived(this.mLiveDataModel);
                            return;
                        }
                        return;
                    } else if (TextUtils.isEmpty(videoInfo.replayUrl) && a3 == null) {
                        if (this.taoLiveOpenEntity == null || !TaoliveOpenBizCodeEnum.TaoLiveOpenBizCode_Tab2.toString().equals(this.taoLiveOpenEntity.bizCode)) {
                            if (!TextUtils.isEmpty(videoInfo.broadCaster.accountInfoUrl)) {
                                v2s.o().v().b(this.mContext, videoInfo.broadCaster.accountInfoUrl, null);
                                sjr.g().c("com.taobao.taolive.room.killself", null, this.frameContextUnique);
                                return;
                            }
                            return;
                        } else if (this.mRecModel.isFirst) {
                            forceRefresh();
                            return;
                        } else if (up6.G(this.mFrameContext) == 1) {
                            sjr g2 = sjr.g();
                            String str6 = videoInfo.liveId;
                            cdr cdrVar5 = this.mFrameContext;
                            if (cdrVar5 != null) {
                                str3 = cdrVar5.C();
                            }
                            g2.c("com.taobao.taolive.room.auto_up", str6, str3);
                            return;
                        } else {
                            sjr g3 = sjr.g();
                            String str7 = videoInfo.liveId;
                            cdr cdrVar6 = this.mFrameContext;
                            if (cdrVar6 != null) {
                                str3 = cdrVar6.C();
                            }
                            g3.c("com.taobao.taolive.room.auto_down", str7, str3);
                            return;
                        }
                    }
                }
                cdr cdrVar7 = this.mFrameContext;
                if (cdrVar7 != null) {
                    cdrVar7.p0 = isFirstEnter();
                }
                if (a3 != null || "true".equals(this.mLiveDataModel.mInitParams.get("highlightSignByRePlay"))) {
                    ATaoLiveOpenEntity aTaoLiveOpenEntity = this.taoLiveOpenEntity;
                    if (aTaoLiveOpenEntity == null || (azdVar = aTaoLiveOpenEntity.abilityCompontent) == null || !((ibt) azdVar).d(OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_HideHiglightLive)) {
                        setPlayReportFeedType("timeshift");
                        if (pvs.u1() && z && !this.mRecModel.actionUrl.contains(yj4.PARAM_SJSD_ITEM_ID) && (timeMovingPlayInfo = videoInfo.timeMovingPlayInfo) != null) {
                            this.mRecModel.initParams.put(yj4.PARAM_SJSD_ITEM_ID, timeMovingPlayInfo.sjsdItemId);
                            this.mRecModel.initParams.put(yj4.PARAM_PRODUCT_TYPE, com.taobao.live.timemove.base.data.RecModel.MEDIA_TYPE_TIMEMOVE);
                            RecModel recModel4 = this.mRecModel;
                            recModel4.actionUrl = u90.g(recModel4.actionUrl, yj4.PARAM_SJSD_ITEM_ID, videoInfo.timeMovingPlayInfo.sjsdItemId);
                            RecModel recModel5 = this.mRecModel;
                            recModel5.actionUrl = u90.g(recModel5.actionUrl, yj4.PARAM_PRODUCT_TYPE, com.taobao.live.timemove.base.data.RecModel.MEDIA_TYPE_TIMEMOVE);
                            this.mLiveDataModel.mActionUrl = this.mRecModel.actionUrl;
                        }
                        showKandian(videoInfo, a3);
                    } else {
                        return;
                    }
                } else {
                    up6.c(this.mFrameContext, VideoStatus.VIDEO_NORMAL_STATUS);
                    BaseFrame baseFrame = this.mRoomController;
                    if (baseFrame != null && !(baseFrame instanceof OpenNormalRoomController)) {
                        this.mComponentManager.deleteComponent(baseFrame);
                        this.mRoomController.onDestroy();
                        this.mRoomController = null;
                    }
                    up6.U0(false, this.mFrameContext);
                    this.mComponentManager.onBindData(this.mLiveDataModel);
                    o3s.b("JingChunLifecycle", "TaoLiveSingleRoomController onBindData liveId=" + this.mRecModel.liveId);
                    if (this.mRoomController == null) {
                        OpenNormalRoomController openNormalRoomController = new OpenNormalRoomController(this.mContext, videoInfo.landScape, this.mLiveDataModel, this.itemView, this.mVideoFrame, this.mFrameContext);
                        this.mRoomController = openNormalRoomController;
                        this.mComponentManager.addComponent(openNormalRoomController);
                    }
                    cdr cdrVar8 = this.mFrameContext;
                    if (cdrVar8 != null && (cdrVar8.j() instanceof dba)) {
                        if (com.taobao.live.timemove.base.data.RecModel.MEDIA_TYPE_TIMEMOVE.equals(((dba) this.mFrameContext.j()).f0)) {
                            HashMap hashMap = new HashMap();
                            hashMap.put("direction", "live");
                            rbu.K(this.mFrameContext, "jiangjie_slide", hashMap);
                        }
                        ((dba) this.mFrameContext.j()).f0 = "live";
                    }
                }
                ViewGroup viewGroup2 = this.mRoomLayout;
                if (viewGroup2 != null && h3) {
                    ObjectAnimator.ofFloat(viewGroup2, "alpha", 0.0f, 1.0f).setDuration(300L).start();
                }
                bxl bxlVar3 = this.mPerfomenceTrackManager;
                if (!(bxlVar3 == null || (dynamicRender = videoInfo.dynamicRender) == null || (str2 = dynamicRender.h5DynamicRenderVersion) == null)) {
                    bxlVar3.o(str2);
                }
                if (pvs.g()) {
                    d9m.r().jump302(this.mContext, this.mFrameContext.j(), this.mLiveDataModel);
                }
                initRecommendPop();
                if (this.taoLiveOpenEntity != null) {
                    if (this.mFollowChangeListener == null) {
                        this.mFollowChangeListener = createFollowChangeListener();
                    }
                    if (!(v2s.o().k() == null || this.mFollowChangeListener == null)) {
                        v2s.o().k().b(this.mFollowChangeListener);
                    }
                    if ("1".equals(videoInfo.roomStatus)) {
                        this.taoLiveOpenEntity.accessListener(AccessListenerEnum.onLive, new Object[0]);
                    } else if ("2".equals(videoInfo.roomStatus)) {
                        this.taoLiveOpenEntity.accessListener(AccessListenerEnum.onReplay, new Object[0]);
                    } else if ("0".equals(videoInfo.roomStatus)) {
                        this.taoLiveOpenEntity.accessListener(AccessListenerEnum.onPrelive, new Object[0]);
                    }
                    if ("1".equals(videoInfo.streamStatus)) {
                        this.taoLiveOpenEntity.accessListener(AccessListenerEnum.streamPlay, new Object[0]);
                    } else if ("0".equals(videoInfo.streamStatus)) {
                        this.taoLiveOpenEntity.accessListener(AccessListenerEnum.streamPause, new Object[0]);
                    }
                }
                if (!TextUtils.isEmpty(videoInfo.toast)) {
                    t0u.c(this.mContext, videoInfo.toast);
                }
                mgf.c(this.mFrameContext, videoInfo.broadCaster.accountId);
            }
        }
    }
}
