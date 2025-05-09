package com.taobao.android.tab2liveroom.liveroom;

import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.app.NotificationCompat;
import androidx.fragment.app.Fragment;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tab2liveroom.liveroom.a;
import com.taobao.android.tab2liveroom.liveroom.immersive.ImmersiveManager;
import com.taobao.android.tab2liveroom.liveroom.plugins.AutoLoginPlugin;
import com.taobao.android.tab2liveroom.liveroom.preload.LivePreloadData;
import com.taobao.android.tab2liveroom.liveroom.topAvatar.LiveAvatarController;
import com.taobao.android.tab2liveroom.liveroom.topAvatar.a;
import com.taobao.android.turbo.core.component.BaseComponent;
import com.taobao.android.turbo.core.component.BaseOuterComponent;
import com.taobao.android.turbo.core.component.IComponentLifecycle$TriggerType;
import com.taobao.android.turbo.core.service.BaseServiceDelegate;
import com.taobao.android.turbo.core.service.page.IPageBackLifecycle;
import com.taobao.android.turbo.core.subpage.BaseSubPageComponent;
import com.taobao.android.turbo.model.DrawerModel;
import com.taobao.android.turbo.model.TabModel;
import com.taobao.tao.flexbox.layoutmanager.adapter.interfaces.IDeviceInfo;
import com.taobao.tao.flexbox.layoutmanager.core.n;
import com.taobao.taolive.room.launch.TaoLiveLaunchInitializer;
import com.taobao.taolive.room.openarchitecture.entity.TaoliveOpenBizCodeEnum;
import com.taobao.taolive.room.openarchitecture.entity.TaoliveOpenLiveRoom;
import com.taobao.taolive.room.openarchitecture.listener.WatchPlatformListenerEnum;
import com.taobao.taolive.sdk.adapter.nav.INavInterceptor;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import tb.a1c;
import tb.akt;
import tb.alc;
import tb.c21;
import tb.cba;
import tb.d4s;
import tb.g2e;
import tb.g3l;
import tb.ieb;
import tb.jbt;
import tb.kxd;
import tb.n6r;
import tb.nuo;
import tb.nwv;
import tb.o3s;
import tb.od0;
import tb.p3h;
import tb.pyc;
import tb.q2h;
import tb.qau;
import tb.qbt;
import tb.s6o;
import tb.sj4;
import tb.sjr;
import tb.t2o;
import tb.tz3;
import tb.v2s;
import tb.v3h;
import tb.wng;
import tb.wzt;
import tb.x3h;
import tb.yqq;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class LiveSubPageComponent extends BaseSubPageComponent<TabModel, View> implements alc {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String HADDLE_BACK_TRIGGER = "handleBack";
    private static final String JUMP_INNER_LIVE_TRIGGER = "jumpInnerLive";
    private static final String KEY_ID = "id";
    private static final String KEY_LIVEID = "liveId";
    private static final String KEY_LIVE_MUTE = "isLiveMute";
    public static final String KEY_LIVE_TAB_TOP_ITEM_SWITCH = "live_tab_top_item_switch";
    private static final String KEY_NEED_RECOMMEND = "needRecommend";
    public static final String KEY_QUERY = "query";
    private static final String KEY_UPDATE_DATA_WHEN_REFRESH = "updateAllDataWhenRefresh";
    private static final String KEY_USERID = "userId";
    private static final String LIVE_STATE_END = "end";
    private static final String LIVE_STATE_INIT = "init";
    private static final String LIVE_STATE_USERLEAVE = "userleave";
    private static final String LOGIN_SUCCESS_TRIGGER = "loginSuccess";
    private static final int MSG_DESTROY_LIVEROOM = 1;
    private static final int MSG_OVERTIME_REFRESH_LIVEROOM = 2;
    public static final int M_LEAVE_REFRESH_TIME = 7200000;
    private static final String OVER_TIME_TRIGGER = "overTime";
    private static final String PULL_DOWN_TRIGGER = "pullDown";
    private static final String RELAY_TRIGGER = "relay";
    public static final String TAG = "LiveSubPageComponent";
    private static boolean sLiveBundleInit = false;
    private AutoLoginPlugin mAutoLoginPlugin;
    private final Context mContext;
    private String mCurrentPageUrl;
    private VideoInfo mCurrentVideoInfo;
    private final Object mHost;
    private ImmersiveManager mImmersiveManager;
    private View mLiveRoomView;
    private com.taobao.android.tab2liveroom.liveroom.topAvatar.a mLiveSecondRefreshManager;
    public String mLiveState;
    private g3l mOpenConfig;
    private jbt mOpenContext;
    private LivePreloadData mPreloadData;
    private FrameLayout mRootView;
    private kxd mServiceDelegate;
    private final BaseOuterComponent.OuterComponentType mSubPageComponentType;
    private final String mSubPageId;
    private TaoliveOpenLiveRoom mTaoliveOpenLiveRoom;
    private final String mTnodeUrl;
    private final g2e mTrackTint = qau.q("live");
    private final List<a.f> mInteractiveMsgHandlerList = new CopyOnWriteArrayList();
    private boolean mEnableScroll = true;
    private final p3h mLiveRoomParams = new p3h();
    private long mAppearTime = -1;
    private long mDisappearTime = -1;
    private final Handler mHandler = new a(Looper.getMainLooper());
    private final INavInterceptor mInterceptor = new b();
    public ieb mActivityResultLifecycle = new c();
    private final ComponentCallbacks mComponentCallbacks = new d();
    public a1c mDrawerChangeListener = new e(this);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class d implements ComponentCallbacks {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // android.content.ComponentCallbacks
        public void onConfigurationChanged(Configuration configuration) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("eb2f300c", new Object[]{this, configuration});
            }
        }

        @Override // android.content.ComponentCallbacks
        public void onLowMemory() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4bbd23dd", new Object[]{this});
            } else if (akt.b1() && !LiveSubPageComponent.access$500(LiveSubPageComponent.this)) {
                o3s.d(LiveSubPageComponent.TAG, "onLowMemory");
                LiveSubPageComponent.access$600(LiveSubPageComponent.this).removeMessages(1);
                LiveSubPageComponent.access$600(LiveSubPageComponent.this).sendEmptyMessage(1);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class e implements a1c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e(LiveSubPageComponent liveSubPageComponent) {
        }

        @Override // tb.a1c
        public void M(DrawerModel.DrawerGravity drawerGravity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("61429c28", new Object[]{this, drawerGravity});
            } else {
                o3s.b(LiveSubPageComponent.TAG, "onDrawerOpened");
            }
        }

        @Override // tb.a1c
        public void U0(DrawerModel.DrawerGravity drawerGravity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("47ad81eb", new Object[]{this, drawerGravity});
            } else {
                o3s.b(LiveSubPageComponent.TAG, "onDrawerClosed");
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class f implements wzt {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public f() {
        }

        @Override // tb.wzt
        public void onRefresh() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c9cbba83", new Object[]{this});
                return;
            }
            o3s.d(LiveSubPageComponent.TAG, "onPostRefresh");
            LiveSubPageComponent.access$100(LiveSubPageComponent.this, null, LiveSubPageComponent.PULL_DOWN_TRIGGER);
        }

        @Override // tb.wzt
        public void onRefreshEnd() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6e6df846", new Object[]{this});
            } else {
                o3s.d(LiveSubPageComponent.TAG, "onPostRefresh");
            }
        }
    }

    static {
        t2o.a(779092126);
        t2o.a(779092107);
    }

    public LiveSubPageComponent(BaseOuterComponent.OuterComponentType outerComponentType, String str, Context context, Object obj, String str2, String str3, BaseServiceDelegate baseServiceDelegate) {
        super(outerComponentType, str, context, obj, str2, str3, baseServiceDelegate);
        o3s.d(TAG, TAG + str2);
        this.mContext = context;
        this.mHost = obj;
        this.mTnodeUrl = str2;
        this.mSubPageId = str;
        this.mSubPageComponentType = outerComponentType;
        o3s.b(TAG, "LiveSubPageComponent + " + str + " mSubPageComponentType" + outerComponentType);
        if (baseServiceDelegate instanceof kxd) {
            this.mServiceDelegate = (kxd) baseServiceDelegate;
        }
    }

    public static /* synthetic */ void access$000(LiveSubPageComponent liveSubPageComponent, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("729f42f4", new Object[]{liveSubPageComponent, new Boolean(z)});
        } else {
            liveSubPageComponent.destroyLiveRoomInternal(z);
        }
    }

    public static /* synthetic */ void access$100(LiveSubPageComponent liveSubPageComponent, Map map, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16b78d70", new Object[]{liveSubPageComponent, map, str});
        } else {
            liveSubPageComponent.refresh(map, str);
        }
    }

    public static /* synthetic */ TaoliveOpenLiveRoom access$200(LiveSubPageComponent liveSubPageComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TaoliveOpenLiveRoom) ipChange.ipc$dispatch("519f362a", new Object[]{liveSubPageComponent});
        }
        return liveSubPageComponent.mTaoliveOpenLiveRoom;
    }

    public static /* synthetic */ Context access$300(LiveSubPageComponent liveSubPageComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("2b7e45b5", new Object[]{liveSubPageComponent});
        }
        return liveSubPageComponent.mContext;
    }

    public static /* synthetic */ void access$400(LiveSubPageComponent liveSubPageComponent, String str, boolean z, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3648b8", new Object[]{liveSubPageComponent, str, new Boolean(z), str2});
        } else {
            liveSubPageComponent.refreshWithUrl(str, z, str2);
        }
    }

    public static /* synthetic */ boolean access$500(LiveSubPageComponent liveSubPageComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("51a0ceff", new Object[]{liveSubPageComponent})).booleanValue();
        }
        return liveSubPageComponent.isLiveResume();
    }

    public static /* synthetic */ Handler access$600(LiveSubPageComponent liveSubPageComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("4e6914ec", new Object[]{liveSubPageComponent});
        }
        return liveSubPageComponent.mHandler;
    }

    private void attachNewRefreshViewListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4e237e0", new Object[]{this});
        } else {
            this.mLiveSecondRefreshManager.q(new f(), 10000);
        }
    }

    private boolean checkTopActivityValid() {
        String str;
        Activity activity;
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8a0fdc8b", new Object[]{this})).booleanValue();
        }
        if (!akt.p2("enableLiveRoomTopActivityCheck", true)) {
            return true;
        }
        String K = nwv.K(this.mContext);
        Context context = this.mContext;
        if (context instanceof Activity) {
            activity = (Activity) context;
            str = activity.getComponentName().getClassName();
        } else {
            activity = null;
            str = null;
        }
        boolean equals = TextUtils.equals(K, str);
        if (equals || activity == null || !n6r.d(activity)) {
            return equals;
        }
        if (c21.i() == activity) {
            z = true;
        }
        return z;
    }

    private void checkTopAvatarDisappear() {
        com.taobao.android.tab2liveroom.liveroom.topAvatar.a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("854c8164", new Object[]{this});
            return;
        }
        String str = this.mCurrentPageUrl;
        p3h p3hVar = this.mLiveRoomParams;
        if (!LiveAvatarController.H(str, p3hVar.J0, p3hVar.G0) && (aVar = this.mLiveSecondRefreshManager) != null) {
            aVar.e();
        }
    }

    private void closeFloatView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64391410", new Object[]{this});
            return;
        }
        TaoliveOpenLiveRoom taoliveOpenLiveRoom = getTaoliveOpenLiveRoom();
        if (taoliveOpenLiveRoom != null) {
            taoliveOpenLiveRoom.callWatchPlatform(WatchPlatformListenerEnum.onClickCloseBtn, new Object[0]);
        }
    }

    private void createLiveRoomInternal(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1be57841", new Object[]{this, context});
            return;
        }
        try {
            this.mLiveRoomView = initTaoliveOpenWatch();
            this.mRootView.removeAllViews();
            com.taobao.android.tab2liveroom.liveroom.topAvatar.a aVar = this.mLiveSecondRefreshManager;
            if (aVar == null) {
                this.mLiveSecondRefreshManager = new a.c().b(context).i(this.mRootView).f(this.mLiveRoomView).k(this.mTaoliveOpenLiveRoom).e(this).l(this.mLiveRoomParams.y0).c(this.mCurrentPageUrl).j(this.mLiveRoomParams.J0).d(this.mLiveRoomParams.G0).h(this.mLiveRoomParams.x0).a();
            } else {
                aVar.v(this.mRootView, this.mLiveRoomView, this.mTaoliveOpenLiveRoom);
            }
            attachNewRefreshViewListener();
        } catch (Exception e2) {
            o3s.b(TAG, "tryCatch error: " + e2.getMessage());
        }
    }

    private void destroyLiveRoomInternal(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db54260f", new Object[]{this, new Boolean(z)});
        } else if (this.mTaoliveOpenLiveRoom != null) {
            o3s.d(TAG, "destroyLiveRoomInternal clearLiveRoomObject:" + z);
            this.mTaoliveOpenLiveRoom.callWatchPlatform(WatchPlatformListenerEnum.openContainer_onDestroy, new Object[0]);
            if (z) {
                this.mTaoliveOpenLiveRoom = null;
                this.mOpenContext = null;
            } else if (!TextUtils.isEmpty(this.mCurrentPageUrl)) {
                updateCurrentLiveRoomInfo(this.mCurrentVideoInfo, Uri.parse(this.mCurrentPageUrl).getQueryParameter("id"), null);
            }
        }
    }

    public static String generateUrl(String str, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("942da286", new Object[]{str, map});
        }
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        Uri parse = Uri.parse(str);
        HashMap hashMap = new HashMap();
        if (map != null) {
            hashMap.putAll(map);
        }
        hashMap.put("updateAllDataWhenRefresh", "true");
        String queryParameter = parse.getQueryParameter("id");
        String queryParameter2 = parse.getQueryParameter("userId");
        String queryParameter3 = parse.getQueryParameter("liveId");
        Object obj = hashMap.get("id");
        Object obj2 = hashMap.get("userId");
        Object obj3 = hashMap.get("liveId");
        if (TextUtils.isEmpty(queryParameter) && TextUtils.isEmpty(queryParameter3) && TextUtils.isEmpty(queryParameter2) && ((obj == null || TextUtils.isEmpty(obj.toString())) && ((obj2 == null || TextUtils.isEmpty(obj2.toString())) && (obj3 == null || TextUtils.isEmpty(obj3.toString()))))) {
            hashMap.put("needRecommend", "true");
        }
        return nwv.l0(parse, hashMap).toString();
    }

    private String getLiveHomePageType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c8c10a4f", new Object[]{this});
        }
        String str = this.mLiveRoomParams.w0;
        String queryParameter = str != null ? Uri.parse(str).getQueryParameter("liveHomePageType") : null;
        if (!TextUtils.isEmpty(queryParameter)) {
            return queryParameter;
        }
        if (yqq.e(this.mLiveRoomParams.J0)) {
            return "mixLive";
        }
        return this.mLiveRoomParams.J0;
    }

    private boolean getLiveMute() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2161da6", new Object[]{this})).booleanValue();
        }
        TaoliveOpenLiveRoom taoliveOpenLiveRoom = this.mTaoliveOpenLiveRoom;
        if (taoliveOpenLiveRoom == null) {
            return false;
        }
        Object callWatchPlatform = taoliveOpenLiveRoom.callWatchPlatform(WatchPlatformListenerEnum.getGlobalContext, new Object[0]);
        if (!(callWatchPlatform instanceof cba)) {
            return false;
        }
        boolean e0 = ((cba) callWatchPlatform).e0();
        o3s.b(TAG, "getLiveMute muteState " + e0);
        return e0;
    }

    private void getPreloadDataAndDeleteFromService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e905ad2d", new Object[]{this});
            return;
        }
        this.mPreloadData = q2h.d().f();
        q2h.d().g();
    }

    private void installLiveBundle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("beeb8090", new Object[]{this});
        } else if (!sLiveBundleInit) {
            TaoLiveLaunchInitializer.init();
            sLiveBundleInit = true;
        }
    }

    public static /* synthetic */ Object ipc$super(LiveSubPageComponent liveSubPageComponent, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1502133455:
                super.onStart((IComponentLifecycle$TriggerType) objArr[0]);
                return null;
            case -1098451737:
                super.handleOuterMessage((BaseOuterComponent.b) objArr[0]);
                return null;
            case -560092455:
                super.onDestroy((IComponentLifecycle$TriggerType) objArr[0]);
                return null;
            case -258772824:
                super.onResume((IComponentLifecycle$TriggerType) objArr[0]);
                return null;
            case -128189347:
                super.onCreate((LiveSubPageComponent) objArr[0], (IComponentLifecycle$TriggerType) objArr[1]);
                return null;
            case 316403507:
                super.onStop((IComponentLifecycle$TriggerType) objArr[0]);
                return null;
            case 916714806:
                super.updateDataImpl((LiveSubPageComponent) objArr[0]);
                return null;
            case 1484435997:
                super.onPause((IComponentLifecycle$TriggerType) objArr[0]);
                return null;
            case 2141276188:
                return new Boolean(super.handleBack((IPageBackLifecycle.TriggerType) objArr[0]));
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/tab2liveroom/liveroom/LiveSubPageComponent");
        }
    }

    private boolean isFloatViewShowing() {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fd937839", new Object[]{this})).booleanValue();
        }
        TaoliveOpenLiveRoom taoliveOpenLiveRoom = getTaoliveOpenLiveRoom();
        if (taoliveOpenLiveRoom != null) {
            obj = taoliveOpenLiveRoom.callWatchPlatform(WatchPlatformListenerEnum.isFloatViewShowing, new Object[0]);
        } else {
            obj = Boolean.FALSE;
        }
        return nwv.o(obj, false);
    }

    private static boolean isFoldableOrPad() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("61df8196", new Object[0])).booleanValue();
        }
        IDeviceInfo i = od0.D().i();
        if (i == null || !i.i()) {
            return false;
        }
        return true;
    }

    private boolean isLiveResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("63a24c0e", new Object[]{this})).booleanValue();
        }
        if (getState() == BaseComponent.State.RESUME) {
            return true;
        }
        return false;
    }

    private void liveCardAppear(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9adb758", new Object[]{this, new Boolean(z), new Boolean(z2)});
            return;
        }
        sendScrollStateMessage(this.mEnableScroll, z, z2);
        sendMuteStateMessage(getLiveMute());
    }

    private boolean rebuildLiveRoomIfDestroyed() {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d1d48685", new Object[]{this})).booleanValue();
        }
        TaoliveOpenLiveRoom taoliveOpenLiveRoom = this.mTaoliveOpenLiveRoom;
        if (taoliveOpenLiveRoom != null) {
            z = nwv.o(taoliveOpenLiveRoom.callWatchPlatform(WatchPlatformListenerEnum.isDestroyed, new Object[0]), false);
        } else {
            z = false;
        }
        o3s.d(TAG, "checkDestroyed isDestroy " + z);
        if (!z) {
            return false;
        }
        com.taobao.android.tab2liveroom.liveroom.topAvatar.a aVar = this.mLiveSecondRefreshManager;
        if (!(aVar == null || aVar.h() == null)) {
            this.mLiveSecondRefreshManager.h().removeView(this.mLiveRoomView);
        }
        createLiveRoomInternal(this.mContext);
        return true;
    }

    private void refresh(Map<String, ?> map, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fcf3206d", new Object[]{this, map, str});
            return;
        }
        Map<String, Object> convertParams = convertParams(map);
        String generateUrl = generateUrl(this.mLiveRoomParams.w0, interceptQuery(convertParams));
        if (interceptRefreshByRedPoint(convertParams, generateUrl)) {
            this.mCurrentPageUrl = generateUrl;
        } else {
            refreshWithUrl(generateUrl, true, str);
        }
    }

    private void registerLowMemoryCallback() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d49f97e", new Object[]{this});
        } else {
            this.mContext.registerComponentCallbacks(this.mComponentCallbacks);
        }
    }

    private void unregisterLowMemoryCallback() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65df3d85", new Object[]{this});
        } else {
            this.mContext.unregisterComponentCallbacks(this.mComponentCallbacks);
        }
    }

    private void unwatchOnActivityResult() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d60109c8", new Object[]{this});
            return;
        }
        kxd kxdVar = this.mServiceDelegate;
        if (kxdVar != null) {
            kxdVar.r(this.mActivityResultLifecycle);
        }
    }

    private void watchOnActivityResult() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d892aa41", new Object[]{this});
            return;
        }
        kxd kxdVar = this.mServiceDelegate;
        if (kxdVar != null) {
            kxdVar.M(this.mActivityResultLifecycle);
        }
    }

    @Override // tb.alc
    public Map<String, String> buildCustomerKLifecycleParam() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("6b57c07e", new Object[]{this});
        }
        if (this.mPreloadData == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("hitRecommendPreload", String.valueOf(this.mPreloadData.isHitPreloadAB()));
        this.mPreloadData.buildPreloadStatus();
        hashMap.put("recommendPreloadResult", String.valueOf(this.mPreloadData.getPreloadStatus()));
        o3s.b(TAG, "buildCustomerKLifecycleParam:" + hashMap);
        return hashMap;
    }

    @Override // com.taobao.android.turbo.core.component.BaseComponent
    public View createViewImpl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("af9921ca", new Object[]{this});
        }
        o3s.d(TAG, "createViewImpl");
        installLiveBundle();
        nuo initSchedulerMessage = getInitSchedulerMessage(this.mLiveRoomParams.E0);
        Map<String, Object> a2 = initSchedulerMessage == null ? null : initSchedulerMessage.a();
        if (initSchedulerMessage != null) {
            o3s.b(TAG, "createViewImpl schedulerMessage" + initSchedulerMessage);
        }
        if (!(a2 == null || initSchedulerMessage == null || !(initSchedulerMessage.b() instanceof HashMap))) {
            a2.put("isOutside", Boolean.valueOf(TextUtils.equals(sj4.TAB2_SOURCE_OUTSIDE, (String) ((HashMap) initSchedulerMessage.b()).get("source"))));
        }
        Map<String, Object> convertParams = convertParams(a2);
        this.mLiveRoomParams.x0 = convertParams;
        String generateUrl = generateUrl(this.mLiveRoomParams.w0, interceptQuery(convertParams));
        getPreloadDataAndDeleteFromService();
        this.mCurrentPageUrl = x3h.a(generateUrl, this.mPreloadData);
        o3s.b(TAG, "createViewImpl pageUrl" + this.mCurrentPageUrl);
        ImmersiveManager immersiveManager = this.mImmersiveManager;
        if (immersiveManager != null) {
            immersiveManager.k(this.mServiceDelegate);
        }
        this.mRootView = new FrameLayout(this.mContext);
        if (!isFoldableOrPad()) {
            this.mRootView.setLayoutParams(new FrameLayout.LayoutParams(-1, s6o.h(this.mContext)));
        }
        this.mRootView.setBackgroundColor(-16777216);
        return this.mRootView;
    }

    @Override // tb.alc
    public Map<Object, Object> getCustomerPageUTExtParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("dc91c881", new Object[]{this});
        }
        return nwv.z(this.mLiveRoomParams.F0, null);
    }

    @Override // tb.alc
    public ImmersiveManager getImmersiveManager() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ImmersiveManager) ipChange.ipc$dispatch("f809b9ea", new Object[]{this});
        }
        return this.mImmersiveManager;
    }

    @Override // tb.alc
    public com.taobao.android.tab2liveroom.liveroom.topAvatar.a getLiveSecondRefreshManager() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.tab2liveroom.liveroom.topAvatar.a) ipChange.ipc$dispatch("1cc3a17d", new Object[]{this});
        }
        return this.mLiveSecondRefreshManager;
    }

    @Override // tb.alc
    public n getNode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (n) ipChange.ipc$dispatch("6c6e1b01", new Object[]{this});
        }
        return null;
    }

    @Override // tb.alc
    public g3l getOpenConfig() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g3l) ipChange.ipc$dispatch("424ebfb", new Object[]{this});
        }
        return this.mOpenConfig;
    }

    @Override // tb.alc
    public kxd getTab2ServiceDelegate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kxd) ipChange.ipc$dispatch("55f6b969", new Object[]{this});
        }
        return this.mServiceDelegate;
    }

    @Override // tb.alc
    public TaoliveOpenLiveRoom getTaoliveOpenLiveRoom() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TaoliveOpenLiveRoom) ipChange.ipc$dispatch("ced4d3dc", new Object[]{this});
        }
        return this.mTaoliveOpenLiveRoom;
    }

    @Override // tb.alc
    public g2e getTrackTint() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g2e) ipChange.ipc$dispatch("2eb6f185", new Object[]{this});
        }
        return this.mTrackTint;
    }

    @Override // tb.alc
    public p3h getViewParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (p3h) ipChange.ipc$dispatch("f57fd05c", new Object[]{this});
        }
        return this.mLiveRoomParams;
    }

    @Override // com.taobao.android.turbo.core.component.BaseOuterComponent
    public void handleOuterMessage(BaseOuterComponent.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be86f4e7", new Object[]{this, bVar});
            return;
        }
        super.handleOuterMessage(bVar);
        String b2 = bVar.b();
        b2.hashCode();
        if (b2.equals("getLiveMuteState") && this.mServiceDelegate != null && this.mOpenContext != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("mute", (Object) Boolean.valueOf(getLiveMute()));
            o3s.b(TAG, "handleOuterMessage" + jSONObject);
            this.mServiceDelegate.u(new BaseOuterComponent.b("setLiveMuteState", jSONObject, this.mSubPageComponentType, this.mSubPageId, bVar.d(), bVar.c()));
        }
    }

    @Override // com.taobao.android.turbo.core.subpage.BaseSubPageComponent
    public void handleShare() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de66eb9e", new Object[]{this});
        } else if (sjr.g() != null) {
            sjr.g().e("com.taolive.taolive.room.mediaplatform_show_sharepanel", null);
        }
    }

    @Override // tb.alc
    public void onCleanPreloadData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5a66b50", new Object[]{this});
        } else {
            this.mPreloadData = null;
        }
    }

    @Override // tb.alc
    public void onInteractiveMsg(Map<Object, Object> map, Map<Object, Object> map2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c98c4925", new Object[]{this, map, map2});
            return;
        }
        o3s.b(TAG, "业务接收直播间内发来的互动消息，msg = " + map + ", params = " + map2);
        for (a.f fVar : this.mInteractiveMsgHandlerList) {
            fVar.a(map, map2);
        }
    }

    @Override // tb.alc
    public void onLiveDetailSuccess() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f467e5ce", new Object[]{this});
            return;
        }
        com.taobao.android.tab2liveroom.liveroom.topAvatar.a aVar = this.mLiveSecondRefreshManager;
        if (aVar != null) {
            aVar.l(this.mCurrentVideoInfo);
        }
    }

    @Override // com.taobao.android.turbo.core.component.BaseComponent
    public void onResume(IComponentLifecycle$TriggerType iComponentLifecycle$TriggerType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f09370a8", new Object[]{this, iComponentLifecycle$TriggerType});
            return;
        }
        super.onResume(iComponentLifecycle$TriggerType);
        onLiveRoomResume(iComponentLifecycle$TriggerType);
        o3s.d(TAG, "onResume");
    }

    @Override // com.taobao.android.turbo.core.component.BaseComponent
    public void onStart(IComponentLifecycle$TriggerType iComponentLifecycle$TriggerType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6774331", new Object[]{this, iComponentLifecycle$TriggerType});
            return;
        }
        super.onStart(iComponentLifecycle$TriggerType);
        o3s.d(TAG, "onStart");
        onLiveRoomStart();
    }

    @Override // tb.alc
    public void rootViewHeightChange(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc53b5ef", new Object[]{this, new Boolean(z)});
            return;
        }
        ImmersiveManager immersiveManager = this.mImmersiveManager;
        if (immersiveManager != null) {
            immersiveManager.m(z);
        }
    }

    @Override // tb.alc
    public void sendMuteStateMessage(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3765baf6", new Object[]{this, new Boolean(z)});
        }
    }

    @Override // tb.alc
    public void sendScrollStateMessage(boolean z, boolean z2, boolean z3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb7a60c2", new Object[]{this, new Boolean(z), new Boolean(z2), new Boolean(z3)});
            return;
        }
        o3s.b(TAG, "sendScrollStateMessage: " + z + ", isAppearCompensate = " + z2 + ", isRefreshCompensate = " + z3);
        kxd kxdVar = this.mServiceDelegate;
        if (kxdVar != null) {
            kxdVar.Z(z);
        }
    }

    @Override // tb.alc
    public void setScrollEnable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8304963b", new Object[]{this, new Boolean(z)});
        } else {
            this.mEnableScroll = z;
        }
    }

    @Override // tb.alc
    public void updateCurrentLiveRoomInfo(VideoInfo videoInfo, String str, Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("109bf462", new Object[]{this, videoInfo, str, bool});
            return;
        }
        this.mCurrentVideoInfo = videoInfo;
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("id", str);
        }
        if (bool != null) {
            hashMap.put("isLiveMute", String.valueOf(bool));
        }
        this.mCurrentPageUrl = generateUrl(this.mCurrentPageUrl, hashMap);
    }

    @Override // tb.alc
    public void updatePageName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("127f43f4", new Object[]{this, str});
            return;
        }
        kxd kxdVar = this.mServiceDelegate;
        if (kxdVar != null) {
            kxdVar.D(this.mSubPageId, str);
        }
    }

    @Override // tb.alc
    public void updatePageProperties(Object obj, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24452d17", new Object[]{this, obj, map});
            return;
        }
        kxd kxdVar = this.mServiceDelegate;
        if (kxdVar != null) {
            kxdVar.J(this.mSubPageId, map);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b implements INavInterceptor {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // com.taobao.taolive.sdk.adapter.nav.INavInterceptor
        public boolean onNavIntercept(Context context, String str, Bundle bundle, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("d49213cb", new Object[]{this, context, str, bundle, new Integer(i), new Integer(i2)})).booleanValue();
            }
            o3s.d(LiveSubPageComponent.TAG, "onNavIntercept, url: " + str + " appear:");
            if (!TextUtils.isEmpty(str)) {
                Uri parse = Uri.parse(str);
                if (LiveSubPageComponent.access$200(LiveSubPageComponent.this) != null && context == LiveSubPageComponent.access$300(LiveSubPageComponent.this) && x3h.c(parse)) {
                    LiveSubPageComponent.access$400(LiveSubPageComponent.this, str, parse.getBooleanQueryParameter("forceRefresh", false), LiveSubPageComponent.JUMP_INNER_LIVE_TRIGGER);
                    return true;
                }
            }
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class c implements ieb {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // tb.ieb
        public void onActivityResult(int i, int i2, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
                return;
            }
            o3s.d(LiveSubPageComponent.TAG, "onActivityResult " + i + " " + i2);
            if (LiveSubPageComponent.access$200(LiveSubPageComponent.this) == null) {
                return;
            }
            if (i == 20000) {
                LiveSubPageComponent.access$200(LiveSubPageComponent.this).callWatchPlatform(WatchPlatformListenerEnum.processGoToDetailAction, new Object[0]);
            } else if (i == 20001) {
                LiveSubPageComponent.access$200(LiveSubPageComponent.this).callWatchPlatform(WatchPlatformListenerEnum.processGoToBulkDetailAction, new Object[0]);
            } else if (i != 10000) {
            } else {
                if (i2 == 8 || i2 == 1) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("success", Boolean.valueOf(i2 == 1));
                    LiveSubPageComponent.access$200(LiveSubPageComponent.this).callWatchPlatform(WatchPlatformListenerEnum.processAddCartAction, hashMap);
                }
            }
        }
    }

    private boolean isInSmallMode() {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("97890f26", new Object[]{this})).booleanValue();
        }
        TaoliveOpenLiveRoom taoliveOpenLiveRoom = getTaoliveOpenLiveRoom();
        if (taoliveOpenLiveRoom != null) {
            obj = taoliveOpenLiveRoom.callWatchPlatform(WatchPlatformListenerEnum.isInSmallMode, new Object[0]);
        } else {
            obj = Boolean.FALSE;
        }
        o3s.d(TAG, "查询是否是小窗模式: " + obj);
        return nwv.o(obj, false);
    }

    public void onCreate(TabModel tabModel, IComponentLifecycle$TriggerType iComponentLifecycle$TriggerType) {
        Map map;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9183789a", new Object[]{this, tabModel, iComponentLifecycle$TriggerType});
            return;
        }
        super.onCreate((LiveSubPageComponent) tabModel, iComponentLifecycle$TriggerType);
        o3s.d(TAG, "onCreate");
        this.mImmersiveManager = new ImmersiveManager(this, this.mContext);
        if (tabModel != null) {
            this.mLiveRoomParams.E0 = tabModel.id;
            o3s.b(TAG, this.mLiveRoomParams.E0 + "just test" + this.mSubPageId);
            this.mLiveRoomParams.w0 = tabModel.getUrl();
            StringBuilder sb = new StringBuilder("onCreate tabModel");
            sb.append(tabModel.getUrl());
            o3s.b(TAG, sb.toString());
            try {
                Uri parse = Uri.parse(this.mTnodeUrl);
                String queryParameter = parse.getQueryParameter("tabid");
                Map map2 = (Map) JSON.parseObject(parse.getQueryParameter("extParams"), Map.class);
                String queryParameter2 = parse.getQueryParameter("spm");
                String queryParameter3 = parse.getQueryParameter("source");
                p3h p3hVar = this.mLiveRoomParams;
                if (!TextUtils.equals(queryParameter, this.mSubPageId)) {
                    map2 = (Map) tabModel.getQuery();
                }
                p3hVar.x0 = map2;
                boolean e2 = yqq.e(queryParameter2);
                boolean z2 = (tabModel.getQuery() == null || !(tabModel.getQuery() instanceof Map) || ((Map) tabModel.getQuery()).get("spm") == null) ? false : true;
                if (e2) {
                    if (!z2 || (map = (Map) tabModel.getQuery()) == null || map.get("spm") == null) {
                        queryParameter2 = "a2141.1.tabbar.guangguang";
                    } else {
                        queryParameter2 = map.get("spm").toString();
                    }
                }
                p3h p3hVar2 = this.mLiveRoomParams;
                p3hVar2.w0 = this.mLiveRoomParams.w0 + "&spm=" + queryParameter2;
                p3h p3hVar3 = this.mLiveRoomParams;
                p3hVar3.J0 = queryParameter3;
                p3hVar3.F0 = tabModel.getUtParams();
            } catch (Throwable th) {
                o3s.b(TAG, "parse params error: " + th.getMessage());
            }
        }
        kxd kxdVar = this.mServiceDelegate;
        if (kxdVar != null) {
            this.mLiveRoomParams.y0 = kxdVar.y() + this.mServiceDelegate.W();
            DrawerModel.DrawerGravity E = this.mServiceDelegate.E("sideLive");
            if (E != DrawerModel.DrawerGravity.RIGHT) {
                z = false;
            }
            p3h p3hVar4 = this.mLiveRoomParams;
            p3hVar4.I0 = z;
            p3hVar4.G0 = z;
            o3s.b(TAG, "onCreate sideLive" + E + " enableMoreLive" + this.mLiveRoomParams.I0);
        }
    }

    @Override // com.taobao.android.turbo.core.component.BaseComponent
    public void onDestroy(IComponentLifecycle$TriggerType iComponentLifecycle$TriggerType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de9daad9", new Object[]{this, iComponentLifecycle$TriggerType});
            return;
        }
        super.onDestroy(iComponentLifecycle$TriggerType);
        o3s.d(TAG, "onDestroy");
        this.mHandler.removeMessages(1);
        unwatchOnActivityResult();
        unregisterLowMemoryCallback();
        kxd kxdVar = this.mServiceDelegate;
        if (kxdVar != null) {
            kxdVar.d(this.mDrawerChangeListener);
        }
        ImmersiveManager immersiveManager = this.mImmersiveManager;
        if (immersiveManager != null) {
            immersiveManager.o(this.mServiceDelegate);
        }
        pyc v = v2s.o().v();
        if (v != null) {
            v.a(this.mInterceptor);
        }
        destroyLiveRoomInternal(true);
        this.mInteractiveMsgHandlerList.clear();
    }

    @Override // com.taobao.android.turbo.core.component.BaseComponent
    public void onPause(IComponentLifecycle$TriggerType iComponentLifecycle$TriggerType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("587ab21d", new Object[]{this, iComponentLifecycle$TriggerType});
            return;
        }
        super.onPause(iComponentLifecycle$TriggerType);
        this.mDisappearTime = System.currentTimeMillis();
        o3s.d(TAG, "onPause appearTime" + (this.mDisappearTime - this.mAppearTime));
        TaoliveOpenLiveRoom taoliveOpenLiveRoom = this.mTaoliveOpenLiveRoom;
        if (taoliveOpenLiveRoom != null) {
            taoliveOpenLiveRoom.callWatchPlatform(WatchPlatformListenerEnum.openContainer_onPause, new Object[0]);
            pyc v = v2s.o().v();
            if (v != null) {
                v.a(this.mInterceptor);
            }
            kxd kxdVar = this.mServiceDelegate;
            if (kxdVar != null) {
                kxdVar.O();
            }
        }
        AutoLoginPlugin autoLoginPlugin = this.mAutoLoginPlugin;
        if (autoLoginPlugin != null) {
            autoLoginPlugin.q();
        }
    }

    @Override // com.taobao.android.turbo.core.subpage.BaseSubPageComponent
    public void onRefresh(Map<String, ?> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7ff6aa2", new Object[]{this, map});
            return;
        }
        o3s.d(TAG, "onRefresh");
        this.mHandler.removeMessages(2);
        refresh(map, RELAY_TRIGGER);
    }

    public void updateDataImpl(TabModel tabModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1695729", new Object[]{this, tabModel});
            return;
        }
        super.updateDataImpl((LiveSubPageComponent) tabModel);
        o3s.d(TAG, "updateDataImpl");
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a extends Handler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(Looper looper) {
            super(looper);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/tab2liveroom/liveroom/LiveSubPageComponent$1");
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
                return;
            }
            int i = message.what;
            if (i == 1) {
                LiveSubPageComponent.access$000(LiveSubPageComponent.this, false);
            } else if (i == 2) {
                LiveSubPageComponent.access$100(LiveSubPageComponent.this, null, LiveSubPageComponent.OVER_TIME_TRIGGER);
            }
        }
    }

    private static Map<String, Object> convertParams(Map<String, ?> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("1a18f3da", new Object[]{map});
        }
        if (tz3.b(map)) {
            return null;
        }
        try {
            String str = (String) map.get("iconStreams");
            if (!nwv.o(map.get("isOutside"), false) && (str != null || !d4s.e("overLayTab2ExtParams", true))) {
                JSONArray jSONArray = (JSONArray) JSON.parse(str);
                if (jSONArray == null || !(jSONArray.get(0) instanceof JSONObject)) {
                    return null;
                }
                return (JSONObject) ((JSONObject) jSONArray.get(0)).get("extra");
            }
            return new HashMap(map);
        } catch (Exception e2) {
            o3s.b(TAG, "tryCatch error: " + e2.getMessage());
            return null;
        }
    }

    private View initTaoliveOpenWatch() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("6eefb7b0", new Object[]{this});
        }
        LiveRoomEventHandler liveRoomEventHandler = new LiveRoomEventHandler(this);
        this.mOpenConfig = new g3l(this);
        HashMap hashMap = new HashMap();
        Object obj = this.mHost;
        if (obj instanceof Fragment) {
            hashMap.put("goDetailFragment", obj);
        }
        hashMap.put("liveHomePageType", getLiveHomePageType());
        hashMap.put("enableReplayStatusShowLiveEnd", Boolean.valueOf(this.mOpenConfig.a()));
        this.mOpenContext = qbt.h().b(this.mContext, TaoliveOpenBizCodeEnum.TaoLiveOpenBizCode_Tab2.toString(), liveRoomEventHandler.v(), liveRoomEventHandler.x(), hashMap);
        qbt.h().g(this.mOpenContext);
        this.mTaoliveOpenLiveRoom = qbt.h().c(this.mOpenContext);
        ViewGroup f2 = qbt.h().f(this.mOpenContext, this.mTaoliveOpenLiveRoom, (Activity) this.mContext, this.mCurrentPageUrl, null);
        TaoliveOpenLiveRoom taoliveOpenLiveRoom = this.mTaoliveOpenLiveRoom;
        if (taoliveOpenLiveRoom != null) {
            taoliveOpenLiveRoom.callWatchPlatform(WatchPlatformListenerEnum.openContainer_onCreate, new Object[0]);
            liveRoomEventHandler.C();
        }
        wng.f30792a = System.currentTimeMillis();
        wng.b = true;
        return f2;
    }

    private Map<String, Object> interceptQuery(Map<String, Object> map) {
        Uri parse;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("f3a7696d", new Object[]{this, map});
        }
        try {
            parse = Uri.parse(this.mLiveRoomParams.w0);
        } catch (Exception e2) {
            o3s.b(TAG, "tryCatch error: " + e2.getMessage());
        }
        if (parse == null) {
            return map;
        }
        String queryParameter = parse.getQueryParameter("id");
        String queryParameter2 = parse.getQueryParameter("userId");
        String queryParameter3 = parse.getQueryParameter("liveId");
        boolean z2 = map != null && akt.l() && nwv.o(map.get("live_tab_top_item_switch"), false);
        o3s.b(TAG, "interceptQuery, isRedPoint2TopAvatar: " + z2);
        if (!TextUtils.isEmpty(queryParameter) || !TextUtils.isEmpty(queryParameter3) || !TextUtils.isEmpty(queryParameter2)) {
            z = false;
        }
        if (z2 && z) {
            p3h p3hVar = this.mLiveRoomParams;
            if (LiveAvatarController.H(p3hVar.w0, p3hVar.J0, p3hVar.G0)) {
                com.taobao.android.tab2liveroom.liveroom.topAvatar.a aVar = this.mLiveSecondRefreshManager;
                if (aVar != null) {
                    aVar.r("query", map);
                }
                HashMap hashMap = new HashMap();
                hashMap.put("live_tab_top_item_switch", "true");
                hashMap.put("needRecommend", "true");
                hashMap.put("updateAllDataWhenRefresh", "true");
                return hashMap;
            }
        }
        return map;
    }

    private boolean interceptRefreshByRedPoint(Map<String, Object> map, String str) {
        com.taobao.android.tab2liveroom.liveroom.topAvatar.a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e8ba363d", new Object[]{this, map, str})).booleanValue();
        }
        boolean o = map != null ? nwv.o(map.get("live_tab_top_item_switch"), false) : false;
        Map map2 = this.mLiveRoomParams.x0;
        if (map2 != null) {
            map2.put("live_tab_top_item_switch", Boolean.valueOf(o));
        }
        if (akt.l() && o) {
            p3h p3hVar = this.mLiveRoomParams;
            if (LiveAvatarController.H(str, p3hVar.J0, p3hVar.G0) && (aVar = this.mLiveSecondRefreshManager) != null) {
                aVar.u();
                return true;
            }
        }
        return false;
    }

    private void onLiveRoomStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e957d7a3", new Object[]{this});
            return;
        }
        o3s.d(TAG, "onLiveRoomStart");
        this.mHandler.removeMessages(1);
        if (this.mTaoliveOpenLiveRoom == null) {
            createLiveRoomInternal(this.mContext);
            registerLowMemoryCallback();
            watchOnActivityResult();
            kxd kxdVar = this.mServiceDelegate;
            if (kxdVar != null) {
                kxdVar.p(this.mDrawerChangeListener);
            }
        }
        if (this.mTaoliveOpenLiveRoom != null) {
            if (checkTopActivityValid()) {
                rebuildLiveRoomIfDestroyed();
            }
            this.mTaoliveOpenLiveRoom.callWatchPlatform(WatchPlatformListenerEnum.openContainer_onStart, new Object[0]);
        }
    }

    private void refreshWithUrl(String str, boolean z, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc5b2dbf", new Object[]{this, str, new Boolean(z), str2});
            return;
        }
        this.mCurrentPageUrl = str;
        o3s.b(TAG, "初始的url是" + this.mCurrentPageUrl + " forceRefresh=" + z + " refreshTrigger=" + str2);
        checkTopAvatarDisappear();
        if (this.mTaoliveOpenLiveRoom != null) {
            Uri parse = Uri.parse(str);
            HashMap hashMap = new HashMap();
            hashMap.put(NotificationCompat.MessagingStyle.Message.KEY_DATA_URI, parse);
            hashMap.put("forceRefresh", Boolean.valueOf(z));
            hashMap.put("needUT", Boolean.TRUE);
            o3s.b(TAG, "refreshWithUrl forceRefresh=" + z + " url=" + str);
            this.mTaoliveOpenLiveRoom.callWatchPlatform(WatchPlatformListenerEnum.refreshByUi, hashMap);
            this.mEnableScroll = true;
            liveCardAppear(false, true);
            return;
        }
        o3s.b(TAG, "refreshWithUrl fail, forceRefresh=" + z + " url=" + str);
    }

    @Override // com.taobao.android.turbo.core.subpage.BaseSubPageComponent
    public boolean handleBack(IPageBackLifecycle.TriggerType triggerType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7fa1481c", new Object[]{this, triggerType})).booleanValue();
        }
        ImmersiveManager immersiveManager = this.mImmersiveManager;
        boolean z = immersiveManager != null && immersiveManager.j();
        boolean p2 = akt.p2("enableInterceptBackFloatViewShow", true);
        o3s.b(TAG, HADDLE_BACK_TRIGGER + triggerType + " isVisible" + z + " enableInterceptBackFloatViewShow" + p2);
        if (p2 && isFloatViewShowing()) {
            o3s.d(TAG, "onBackClick回退挽留,isFloatViewShowing");
            closeFloatView();
            return true;
        } else if (!z || od0.D().f().a() != this.mContext) {
            return super.handleBack(triggerType);
        } else {
            o3s.d(TAG, "onBackClick回退挽留");
            setImmersiveMode(false);
            refresh(null, HADDLE_BACK_TRIGGER);
            return true;
        }
    }

    @Override // com.taobao.android.turbo.core.component.BaseComponent
    public void onStop(IComponentLifecycle$TriggerType iComponentLifecycle$TriggerType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12dbef33", new Object[]{this, iComponentLifecycle$TriggerType});
            return;
        }
        super.onStop(iComponentLifecycle$TriggerType);
        o3s.d(TAG, "onStop");
        TaoliveOpenLiveRoom taoliveOpenLiveRoom = this.mTaoliveOpenLiveRoom;
        if (taoliveOpenLiveRoom != null) {
            taoliveOpenLiveRoom.callWatchPlatform(WatchPlatformListenerEnum.openContainer_onStop, new Object[0]);
            this.mHandler.removeMessages(1);
            if (!isInSmallMode()) {
                this.mHandler.sendEmptyMessageDelayed(1, akt.w2("liveRoomMemReleaseDelay", 5000));
            }
            com.taobao.android.tab2liveroom.liveroom.topAvatar.a aVar = this.mLiveSecondRefreshManager;
            if (!(aVar == null || aVar.g() == null)) {
                this.mLiveSecondRefreshManager.g().g();
            }
            HashMap hashMap = new HashMap();
            hashMap.put("type", iComponentLifecycle$TriggerType);
            this.mTaoliveOpenLiveRoom.callWatchPlatform(WatchPlatformListenerEnum.onTabUnselected, hashMap);
        }
    }

    @Override // tb.alc
    public void setImmersiveMode(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15a4ef1", new Object[]{this, new Boolean(z)});
        } else if (!isFoldableOrPad()) {
            ImmersiveManager immersiveManager = this.mImmersiveManager;
            if (immersiveManager != null) {
                immersiveManager.n(z);
                this.mImmersiveManager.i();
            }
            if (this.mServiceDelegate != null) {
                o3s.b(TAG, "setImmersiveMode: " + z);
                if (z) {
                    this.mServiceDelegate.showBackButton();
                    this.mServiceDelegate.A(false, true);
                    return;
                }
                this.mServiceDelegate.hideBackButton();
                this.mServiceDelegate.A(true, true);
            }
        }
    }

    private void onLiveRoomResume(IComponentLifecycle$TriggerType iComponentLifecycle$TriggerType) {
        boolean z;
        Handler handler;
        int i = 1;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76918041", new Object[]{this, iComponentLifecycle$TriggerType});
            return;
        }
        o3s.d(TAG, "onLiveRoomResume topActivity: ");
        this.mAppearTime = System.currentTimeMillis();
        if (this.mTaoliveOpenLiveRoom != null) {
            if (!iComponentLifecycle$TriggerType.equals(IComponentLifecycle$TriggerType.TAB_SELECT)) {
                ImmersiveManager immersiveManager = this.mImmersiveManager;
                setImmersiveMode(immersiveManager != null && immersiveManager.j());
            }
            z = rebuildLiveRoomIfDestroyed();
            if (z) {
                this.mTaoliveOpenLiveRoom.callWatchPlatform(WatchPlatformListenerEnum.openContainer_onStart, new Object[0]);
            }
            this.mTaoliveOpenLiveRoom.callWatchPlatform(WatchPlatformListenerEnum.openContainer_onResume, new Object[0]);
            pyc v = v2s.o().v();
            if (v != null) {
                v.d(this.mInterceptor);
            }
        } else {
            z = false;
        }
        if (this.mTaoliveOpenLiveRoom != null) {
            if (z) {
                this.mEnableScroll = true;
            }
            liveCardAppear(true, false);
        }
        if (this.mAutoLoginPlugin == null) {
            this.mAutoLoginPlugin = new AutoLoginPlugin(this.mContext, this.mRootView, this);
        }
        this.mAutoLoginPlugin.l();
        if (TextUtils.equals(this.mLiveState, LIVE_STATE_USERLEAVE)) {
            this.mLiveState = "init";
        } else {
            i = M_LEAVE_REFRESH_TIME;
        }
        if (TextUtils.isEmpty(this.mLiveState)) {
            v3h.e(this);
        }
        kxd kxdVar = this.mServiceDelegate;
        if (kxdVar != null) {
            kxdVar.N();
        }
        long j = this.mDisappearTime;
        if (j > 0 && this.mAppearTime - j >= i && (handler = this.mHandler) != null) {
            handler.sendEmptyMessageDelayed(2, 500L);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005f, code lost:
        if (r8.equals("onRoomStateChanged") == false) goto L_0x0026;
     */
    @Override // tb.alc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void sendLiveRoomMessage(java.lang.String r8, java.util.Map<java.lang.String, java.lang.Object> r9) {
        /*
            Method dump skipped, instructions count: 296
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.tab2liveroom.liveroom.LiveSubPageComponent.sendLiveRoomMessage(java.lang.String, java.util.Map):void");
    }
}
