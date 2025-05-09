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
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.facebook.yoga.YogaMeasureFunction;
import com.taobao.android.detail2.core.framework.view.feeds.VerticalAbsViewHolder;
import com.taobao.android.live.plugin.atype.flexalocal.profile.LiveAvatarNewFrame;
import com.taobao.android.tab2liveroom.liveroom.immersive.ImmersiveManager;
import com.taobao.android.tab2liveroom.liveroom.plugins.AutoLoginPlugin;
import com.taobao.android.tab2liveroom.liveroom.preload.LivePreloadData;
import com.taobao.android.tab2liveroom.liveroom.topAvatar.LiveAvatarController;
import com.taobao.android.tab2liveroom.liveroom.topAvatar.a;
import com.taobao.tao.flexbox.layoutmanager.ac.d;
import com.taobao.tao.flexbox.layoutmanager.core.Component;
import com.taobao.tao.flexbox.layoutmanager.core.j;
import com.taobao.tao.flexbox.layoutmanager.core.n;
import com.taobao.tao.flexbox.layoutmanager.core.o;
import com.taobao.tao.flexbox.layoutmanager.core.q;
import com.taobao.taolive.room.launch.TaoLiveLaunchInitializer;
import com.taobao.taolive.room.openarchitecture.entity.TaoliveOpenBizCodeEnum;
import com.taobao.taolive.room.openarchitecture.entity.TaoliveOpenLiveRoom;
import com.taobao.taolive.room.openarchitecture.listener.PlatformListenerEnum;
import com.taobao.taolive.room.openarchitecture.listener.WatchPlatformListenerEnum;
import com.taobao.taolive.sdk.adapter.nav.INavInterceptor;
import com.taobao.taolive.sdk.model.common.AccountInfo;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import tb.akt;
import tb.alc;
import tb.c21;
import tb.cba;
import tb.g2e;
import tb.g3l;
import tb.hk8;
import tb.jbt;
import tb.kxd;
import tb.n6r;
import tb.nwv;
import tb.od0;
import tb.p3h;
import tb.pyc;
import tb.q2h;
import tb.qau;
import tb.qbt;
import tb.t2o;
import tb.tfs;
import tb.v2s;
import tb.wng;
import tb.wzt;
import tb.x3h;
import tb.yj4;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class a extends Component<FrameLayout, p3h> implements j, alc {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DEFAULT_REFRESH_URL = "https://h5.m.taobao.com/taolive/video.html?livesource=tb_tab2.guangguang_newlivetab";
    public static final String KEY_LIVE_TAB_TOP_ITEM_SWITCH = "live_tab_top_item_switch";
    public static final String KEY_QUERY = "query";
    public static final String TAG = "[live-native]";
    public static boolean t = false;

    /* renamed from: a  reason: collision with root package name */
    public com.taobao.android.tab2liveroom.liveroom.topAvatar.a f9504a;
    public View b;
    public TaoliveOpenLiveRoom c;
    public jbt d;
    public AutoLoginPlugin e;
    public String f;
    public VideoInfo g;
    public FrameLayout i;
    public boolean k;
    public g3l l;
    public ImmersiveManager m;
    public LivePreloadData p;
    public final boolean h = akt.p2("enableLiveRoomIntercept", true);
    public boolean j = true;
    public final g2e n = qau.q("tab2");
    public final List<f> o = new CopyOnWriteArrayList();
    public final Handler q = new HandlerC0489a(Looper.getMainLooper());
    public final ComponentCallbacks r = new b();
    public final INavInterceptor s = new c();

    /* compiled from: Taobao */
    /* renamed from: com.taobao.android.tab2liveroom.liveroom.a$a  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class HandlerC0489a extends Handler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public HandlerC0489a(Looper looper) {
            super(looper);
        }

        public static /* synthetic */ Object ipc$super(HandlerC0489a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/tab2liveroom/liveroom/LiveRoomComponent$1");
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
            } else if (message.what == 1) {
                a.h(a.this, false);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b implements ComponentCallbacks {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
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
            } else if (!a.i(a.this).I0() && akt.b1()) {
                tfs.g(a.TAG, "onLowMemory");
                a.j(a.this).removeMessages(1);
                a.j(a.this).sendEmptyMessage(1);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                a.q(a.this, false);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class e implements wzt {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e() {
        }

        @Override // tb.wzt
        public void onRefresh() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c9cbba83", new Object[]{this});
            } else {
                a.this.sendLiveRoomMessage("onrefresh", null);
            }
        }

        @Override // tb.wzt
        public void onRefreshEnd() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6e6df846", new Object[]{this});
            } else {
                tfs.g(a.TAG, "onPostRefresh");
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface f {
        void a(Map map, Map map2);
    }

    static {
        t2o.a(779092109);
        t2o.a(503317092);
        t2o.a(779092107);
    }

    public static /* synthetic */ void h(a aVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d66494", new Object[]{aVar, new Boolean(z)});
        } else {
            aVar.w(z);
        }
    }

    public static /* synthetic */ n i(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (n) ipChange.ipc$dispatch("bb854203", new Object[]{aVar});
        }
        return aVar.node;
    }

    public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1619485803:
                return new Boolean(super.invoke((d.j) objArr[0], (String) objArr[1], (JSONObject) objArr[2], (d.k) objArr[3]));
            case -288698517:
                return super.getViewParams();
            case 1052797818:
                super.detach(((Boolean) objArr[0]).booleanValue());
                return null;
            case 1604521168:
                super.onCreate((n) objArr[0]);
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/tab2liveroom/liveroom/LiveRoomComponent");
        }
    }

    public static /* synthetic */ Handler j(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("b80af5c4", new Object[]{aVar});
        }
        return aVar.q;
    }

    public static /* synthetic */ n k(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (n) ipChange.ipc$dispatch("2e7e6d85", new Object[]{aVar});
        }
        return aVar.node;
    }

    public static /* synthetic */ boolean l(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e2d30548", new Object[]{aVar})).booleanValue();
        }
        return aVar.h;
    }

    public static /* synthetic */ TaoliveOpenLiveRoom m(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TaoliveOpenLiveRoom) ipChange.ipc$dispatch("d9130691", new Object[]{aVar});
        }
        return aVar.c;
    }

    public static /* synthetic */ n n(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (n) ipChange.ipc$dispatch("5af42ec8", new Object[]{aVar});
        }
        return aVar.node;
    }

    public static /* synthetic */ n o(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (n) ipChange.ipc$dispatch("1470c489", new Object[]{aVar});
        }
        return aVar.node;
    }

    public static /* synthetic */ void p(a aVar, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2adf9902", new Object[]{aVar, str, new Boolean(z)});
        } else {
            aVar.V(str, z);
        }
    }

    public static /* synthetic */ boolean q(a aVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a13542d", new Object[]{aVar, new Boolean(z)})).booleanValue();
        }
        aVar.k = z;
        return z;
    }

    public static String x(String str, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("942da286", new Object[]{str, map});
        }
        Uri parse = Uri.parse(str);
        HashMap hashMap = new HashMap();
        if (map != null) {
            hashMap.putAll(map);
        }
        hashMap.put(yj4.PARAM_UPDATE_ALL_DATA_WHEN_REFRESH, "true");
        String queryParameter = parse.getQueryParameter("id");
        String queryParameter2 = parse.getQueryParameter("userId");
        String queryParameter3 = parse.getQueryParameter("liveId");
        Object obj = hashMap.get("id");
        Object obj2 = hashMap.get("userId");
        Object obj3 = hashMap.get("liveId");
        if (TextUtils.isEmpty(queryParameter) && TextUtils.isEmpty(queryParameter3) && TextUtils.isEmpty(queryParameter2) && ((obj == null || TextUtils.isEmpty(obj.toString())) && ((obj2 == null || TextUtils.isEmpty(obj2.toString())) && (obj3 == null || TextUtils.isEmpty(obj3.toString()))))) {
            hashMap.put(yj4.PARAM_NEED_RECOMMEND, "true");
        }
        return nwv.l0(parse, hashMap).toString();
    }

    public final void A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e905ad2d", new Object[]{this});
            return;
        }
        this.p = q2h.d().f();
        q2h.d().g();
    }

    public final void B(String str, String str2, String str3, boolean z) {
        PlatformListenerEnum platformListenerEnum;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30e27360", new Object[]{this, str, str2, str3, new Boolean(z)});
        } else if (!TextUtils.isEmpty(str) && this.c != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("accountId", str);
            hashMap.put("accountType", str2);
            hashMap.put("followSource", str3);
            TaoliveOpenLiveRoom taoliveOpenLiveRoom = this.c;
            if (z) {
                platformListenerEnum = PlatformListenerEnum.onFollowAction;
            } else {
                platformListenerEnum = PlatformListenerEnum.onUnfollowAciton;
            }
            taoliveOpenLiveRoom.callPlatform(platformListenerEnum, hashMap);
        }
    }

    public final void C(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76d13645", new Object[]{this, context});
        } else if (this.c == null) {
            v(context);
            b0();
            X();
        }
    }

    public final void E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("beeb8090", new Object[]{this});
        } else if (!t) {
            TaoLiveLaunchInitializer.init();
            t = true;
        }
    }

    public final boolean H() {
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

    public final void J(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9adb758", new Object[]{this, new Boolean(z), new Boolean(z2)});
            return;
        }
        sendScrollStateMessage(this.j, z, z2);
        Object callWatchPlatform = this.c.callWatchPlatform(WatchPlatformListenerEnum.getGlobalContext, new Object[0]);
        if (callWatchPlatform instanceof cba) {
            sendMuteStateMessage(((cba) callWatchPlatform).e0());
        }
    }

    public final boolean T() {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d1d48685", new Object[]{this})).booleanValue();
        }
        TaoliveOpenLiveRoom taoliveOpenLiveRoom = this.c;
        if (taoliveOpenLiveRoom != null) {
            z = nwv.o(taoliveOpenLiveRoom.callWatchPlatform(WatchPlatformListenerEnum.isDestroyed, new Object[0]), false);
        } else {
            z = false;
        }
        tfs.g(TAG, "checkDestroyed isDestroy " + z);
        if (!z) {
            return false;
        }
        com.taobao.android.tab2liveroom.liveroom.topAvatar.a aVar = this.f9504a;
        if (!(aVar == null || aVar.h() == null)) {
            this.f9504a.h().removeView(this.b);
        }
        v(this.node.N());
        return true;
    }

    public final void U(Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7b26963", new Object[]{this, map});
            return;
        }
        String x = x(((p3h) this.viewParams).w0, F(map));
        if (G(map, x)) {
            this.f = x;
        } else {
            V(x, true);
        }
    }

    public void W(f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad1244d1", new Object[]{this, fVar});
        } else if (fVar != null) {
            ((CopyOnWriteArrayList) this.o).add(fVar);
        }
    }

    public final void X() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d49f97e", new Object[]{this});
        } else {
            this.node.N().registerComponentCallbacks(this.r);
        }
    }

    public void Y(f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("762e0198", new Object[]{this, fVar});
        } else if (fVar != null) {
            ((CopyOnWriteArrayList) this.o).remove(fVar);
        }
    }

    public final void Z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65df3d85", new Object[]{this});
        } else {
            this.node.N().unregisterComponentCallbacks(this.r);
        }
    }

    public final void a0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d60109c8", new Object[]{this});
            return;
        }
        o.t T = this.node.T();
        if (T != null) {
            T.a("onactivityresult", this);
        }
    }

    public final void b0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d892aa41", new Object[]{this});
            return;
        }
        o.t T = this.node.T();
        if (T != null) {
            T.b("onactivityresult", this);
        }
    }

    @Override // tb.alc
    public Map<String, String> buildCustomerKLifecycleParam() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("6b57c07e", new Object[]{this});
        }
        if (this.p == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("hitRecommendPreload", String.valueOf(this.p.isHitPreloadAB()));
        this.p.buildPreloadStatus();
        hashMap.put("recommendPreloadResult", String.valueOf(this.p.getPreloadStatus()));
        tfs.e(TAG, "buildCustomerKLifecycleParam:" + hashMap);
        return hashMap;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public void detach(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ec06b7a", new Object[]{this, new Boolean(z)});
            return;
        }
        super.detach(z);
        N();
    }

    @Override // tb.alc
    public Map getCustomerPageUTExtParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("dc91c881", new Object[]{this});
        }
        return nwv.z(this.node.H(p3h.KEY_PAGE_UT_PARAMS), null);
    }

    @Override // tb.alc
    public ImmersiveManager getImmersiveManager() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ImmersiveManager) ipChange.ipc$dispatch("f809b9ea", new Object[]{this});
        }
        return this.m;
    }

    @Override // tb.alc
    public com.taobao.android.tab2liveroom.liveroom.topAvatar.a getLiveSecondRefreshManager() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.tab2liveroom.liveroom.topAvatar.a) ipChange.ipc$dispatch("1cc3a17d", new Object[]{this});
        }
        return this.f9504a;
    }

    @Override // tb.alc
    public g3l getOpenConfig() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g3l) ipChange.ipc$dispatch("424ebfb", new Object[]{this});
        }
        return this.l;
    }

    @Override // tb.alc
    public kxd getTab2ServiceDelegate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kxd) ipChange.ipc$dispatch("55f6b969", new Object[]{this});
        }
        return null;
    }

    @Override // tb.alc
    public TaoliveOpenLiveRoom getTaoliveOpenLiveRoom() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TaoliveOpenLiveRoom) ipChange.ipc$dispatch("ced4d3dc", new Object[]{this});
        }
        return this.c;
    }

    @Override // tb.alc
    public g2e getTrackTint() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g2e) ipChange.ipc$dispatch("2eb6f185", new Object[]{this});
        }
        return this.n;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component, tb.alc
    public /* bridge */ /* synthetic */ p3h getViewParams() {
        return (p3h) super.getViewParams();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0079, code lost:
        if (r8.equals("refresh") == false) goto L_0x0070;
     */
    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean invoke(com.taobao.tao.flexbox.layoutmanager.ac.d.j r8, java.lang.String r9, com.alibaba.fastjson.JSONObject r10, com.taobao.tao.flexbox.layoutmanager.ac.d.k r11) {
        /*
            r7 = this;
            java.lang.String r0 = "follow"
            r1 = 3
            r2 = 2
            r3 = 1
            r4 = 0
            com.android.alibaba.ip.runtime.IpChange r5 = com.taobao.android.tab2liveroom.liveroom.a.$ipChange
            boolean r6 = r5 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r6 == 0) goto L_0x0027
            java.lang.String r0 = "9f789b95"
            r6 = 5
            java.lang.Object[] r6 = new java.lang.Object[r6]
            r6[r4] = r7
            r6[r3] = r8
            r6[r2] = r9
            r6[r1] = r10
            r8 = 4
            r6[r8] = r11
            java.lang.Object r8 = r5.ipc$dispatch(r0, r6)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            return r8
        L_0x0027:
            java.lang.String r5 = "onMessage"
            boolean r5 = android.text.TextUtils.equals(r9, r5)
            if (r5 == 0) goto L_0x00ca
            if (r10 == 0) goto L_0x00c9
            java.lang.String r8 = "type"
            java.lang.String r8 = r10.getString(r8)
            java.lang.String r9 = "args"
            com.alibaba.fastjson.JSONObject r9 = r10.getJSONObject(r9)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r11 = "onMessage type "
            r10.<init>(r11)
            r10.append(r8)
            java.lang.String r11 = " args "
            r10.append(r11)
            r10.append(r9)
            java.lang.String r11 = "ignoreFirstRefresh:"
            r10.append(r11)
            boolean r11 = r7.k
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            java.lang.String r11 = "[live-native]"
            tb.tfs.g(r11, r10)
            r8.hashCode()
            r10 = -1
            int r11 = r8.hashCode()
            switch(r11) {
                case -1268958287: goto L_0x0094;
                case -437769565: goto L_0x0088;
                case -382454902: goto L_0x007c;
                case 1085444827: goto L_0x0072;
                default: goto L_0x0070;
            }
        L_0x0070:
            r1 = -1
            goto L_0x009c
        L_0x0072:
            java.lang.String r11 = "refresh"
            boolean r11 = r8.equals(r11)
            if (r11 != 0) goto L_0x009c
            goto L_0x0070
        L_0x007c:
            java.lang.String r11 = "unfollow"
            boolean r11 = r8.equals(r11)
            if (r11 != 0) goto L_0x0086
            goto L_0x0070
        L_0x0086:
            r1 = 2
            goto L_0x009c
        L_0x0088:
            java.lang.String r11 = "presentAvatarPage"
            boolean r11 = r8.equals(r11)
            if (r11 != 0) goto L_0x0092
            goto L_0x0070
        L_0x0092:
            r1 = 1
            goto L_0x009c
        L_0x0094:
            boolean r11 = r8.equals(r0)
            if (r11 != 0) goto L_0x009b
            goto L_0x0070
        L_0x009b:
            r1 = 0
        L_0x009c:
            switch(r1) {
                case 0: goto L_0x00ae;
                case 1: goto L_0x00aa;
                case 2: goto L_0x00ae;
                case 3: goto L_0x00a0;
                default: goto L_0x009f;
            }
        L_0x009f:
            goto L_0x00c9
        L_0x00a0:
            boolean r8 = r7.k
            if (r8 != 0) goto L_0x00a7
            r7.U(r9)
        L_0x00a7:
            r7.k = r4
            goto L_0x00c9
        L_0x00aa:
            r7.S()
            goto L_0x00c9
        L_0x00ae:
            if (r9 == 0) goto L_0x00c9
            java.lang.String r10 = "accountId"
            java.lang.String r10 = r9.getString(r10)
            java.lang.String r11 = "accountType"
            java.lang.String r11 = r9.getString(r11)
            java.lang.String r1 = "followSource"
            java.lang.String r9 = r9.getString(r1)
            boolean r8 = android.text.TextUtils.equals(r8, r0)
            r7.B(r10, r11, r9, r8)
        L_0x00c9:
            return r3
        L_0x00ca:
            boolean r8 = super.invoke(r8, r9, r10, r11)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.tab2liveroom.liveroom.a.invoke(com.taobao.tao.flexbox.layoutmanager.ac.d$j, java.lang.String, com.alibaba.fastjson.JSONObject, com.taobao.tao.flexbox.layoutmanager.ac.d$k):boolean");
    }

    @Override // tb.alc
    public void onCleanPreloadData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5a66b50", new Object[]{this});
        } else {
            this.p = null;
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public void onCreate(n nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5fa30cd0", new Object[]{this, nVar});
            return;
        }
        super.onCreate(nVar);
        this.m = new ImmersiveManager(this, nVar.N());
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public YogaMeasureFunction onCreateMeasureFunction() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (YogaMeasureFunction) ipChange.ipc$dispatch("622da8f1", new Object[]{this});
        }
        ImmersiveManager immersiveManager = this.m;
        if (immersiveManager != null) {
            return immersiveManager.f();
        }
        return null;
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.j
    public boolean onHandleTNodeMessage(n nVar, n nVar2, String str, String str2, Map map, hk8 hk8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("abab8f80", new Object[]{this, nVar, nVar2, str, str2, map, hk8Var})).booleanValue();
        }
        return false;
    }

    @Override // tb.alc
    public void onInteractiveMsg(Map map, Map map2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c98c4925", new Object[]{this, map, map2});
            return;
        }
        tfs.e(TAG, "业务接收直播间内发来的互动消息，msg = " + map + ", params = " + map2);
        Iterator it = ((CopyOnWriteArrayList) this.o).iterator();
        while (it.hasNext()) {
            ((f) it.next()).a(map, map2);
        }
    }

    @Override // tb.alc
    public void onLiveDetailSuccess() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f467e5ce", new Object[]{this});
            return;
        }
        com.taobao.android.tab2liveroom.liveroom.topAvatar.a aVar = this.f9504a;
        if (aVar != null) {
            aVar.l(this.g);
        }
    }

    public final void r(Context context, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("127bafea", new Object[]{this, context, view});
        } else {
            this.f9504a.q(new e(), ((p3h) this.viewParams).C0);
        }
    }

    @Override // tb.alc
    public void rootViewHeightChange(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc53b5ef", new Object[]{this, new Boolean(z)});
            return;
        }
        ImmersiveManager immersiveManager = this.m;
        if (immersiveManager != null) {
            immersiveManager.m(z);
        }
    }

    public final boolean s() {
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
        String K = nwv.K(this.node.N());
        if (this.node.N() instanceof Activity) {
            activity = (Activity) this.node.N();
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

    @Override // tb.alc
    public void sendLiveRoomMessage(String str, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("900fca5c", new Object[]{this, str, map});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("type", str);
        hashMap.put("args", map);
        sendMessage(this.node, "onmessage", null, hashMap, null);
    }

    @Override // tb.alc
    public void sendMuteStateMessage(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3765baf6", new Object[]{this, new Boolean(z)});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("mute", Boolean.valueOf(z));
        sendLiveRoomMessage("onMuteChanged", hashMap);
    }

    @Override // tb.alc
    public void sendScrollStateMessage(boolean z, boolean z2, boolean z3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb7a60c2", new Object[]{this, new Boolean(z), new Boolean(z2), new Boolean(z3)});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(VerticalAbsViewHolder.KEY_SCROLL_ENABLE, Boolean.valueOf(z));
        hashMap.put("isAppearCompensate", Boolean.valueOf(z2));
        hashMap.put("isRefreshCompensate", Boolean.valueOf(z3));
        sendLiveRoomMessage("onScrollEnableChanged", hashMap);
    }

    @Override // tb.alc
    public void setImmersiveMode(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15a4ef1", new Object[]{this, new Boolean(z)});
            return;
        }
        ImmersiveManager immersiveManager = this.m;
        if (immersiveManager != null) {
            immersiveManager.n(z);
        }
    }

    @Override // tb.alc
    public void setScrollEnable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8304963b", new Object[]{this, new Boolean(z)});
        } else {
            this.j = z;
        }
    }

    public final void t() {
        com.taobao.android.tab2liveroom.liveroom.topAvatar.a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("854c8164", new Object[]{this});
            return;
        }
        String str = this.f;
        P p = this.viewParams;
        if (!LiveAvatarController.H(str, ((p3h) p).J0, ((p3h) p).G0) && (aVar = this.f9504a) != null) {
            aVar.e();
        }
    }

    public final void u() {
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

    @Override // tb.alc
    public void updateCurrentLiveRoomInfo(VideoInfo videoInfo, String str, Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("109bf462", new Object[]{this, videoInfo, str, bool});
            return;
        }
        this.g = videoInfo;
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("id", str);
        }
        if (bool != null) {
            hashMap.put(yj4.PARAM_IS_LIVE_MUTE, String.valueOf(bool));
        }
        this.f = x(((p3h) this.viewParams).w0, hashMap);
    }

    @Override // tb.alc
    public void updatePageName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("127f43f4", new Object[]{this, str});
        } else {
            od0.D().d().updatePageName(getNode(), str);
        }
    }

    @Override // tb.alc
    public void updatePageProperties(Object obj, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24452d17", new Object[]{this, obj, map});
        } else {
            od0.D().d().updatePageProperties(obj, map);
        }
    }

    public final void v(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1be57841", new Object[]{this, context});
            return;
        }
        try {
            this.b = D();
            this.i.removeAllViews();
            com.taobao.android.tab2liveroom.liveroom.topAvatar.a aVar = this.f9504a;
            if (aVar == null) {
                this.f9504a = new a.c().b(context).i(this.i).f(this.b).k(this.c).e(this).l(((p3h) this.viewParams).y0).c(this.f).j(((p3h) this.viewParams).J0).d(((p3h) this.viewParams).G0).h(((p3h) this.viewParams).x0).a();
            } else {
                aVar.v(this.i, this.b, this.c);
            }
            r(context, this.b);
        } catch (Exception e2) {
            tfs.e(TAG, "initLiveRoomView error: " + e2.getMessage());
        }
    }

    public final void w(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db54260f", new Object[]{this, new Boolean(z)});
        } else if (this.c != null) {
            tfs.g(TAG, "destroyLiveRoomInternal clearLiveRoomObject:" + z);
            this.c.callWatchPlatform(WatchPlatformListenerEnum.openContainer_onDestroy, new Object[0]);
            if (z) {
                this.c = null;
                this.d = null;
            } else if (!TextUtils.isEmpty(this.f)) {
                updateCurrentLiveRoomInfo(this.g, Uri.parse(this.f).getQueryParameter("id"), null);
            }
        }
    }

    /* renamed from: y */
    public p3h generateViewParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (p3h) ipChange.ipc$dispatch("8f048b3b", new Object[]{this});
        }
        return new p3h();
    }

    public final String z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c8c10a4f", new Object[]{this});
        }
        String str = ((p3h) this.viewParams).w0;
        String queryParameter = str != null ? Uri.parse(str).getQueryParameter("liveHomePageType") : null;
        return TextUtils.isEmpty(queryParameter) ? ((p3h) this.viewParams).D0 : queryParameter;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class c implements INavInterceptor {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // com.taobao.taolive.sdk.adapter.nav.INavInterceptor
        public boolean onNavIntercept(Context context, String str, Bundle bundle, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("d49213cb", new Object[]{this, context, str, bundle, new Integer(i), new Integer(i2)})).booleanValue();
            }
            tfs.g(a.TAG, "onNavIntercept, url: " + str + " appear:" + a.k(a.this).z0());
            if (a.l(a.this) && !TextUtils.isEmpty(str)) {
                Uri parse = Uri.parse(str);
                if (a.m(a.this) != null && a.n(a.this).z0() && context == a.o(a.this).N() && x3h.c(parse)) {
                    a.p(a.this, str, parse.getBooleanQueryParameter("forceRefresh", false));
                    return true;
                }
            }
            return false;
        }
    }

    public final boolean I() {
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
        tfs.g(TAG, "查询是否是小窗模式: " + obj);
        return nwv.o(obj, false);
    }

    public final Map K(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("e5031324", new Object[]{this, context});
        }
        P p = this.viewParams;
        Map map = ((p3h) p).x0;
        if ((((p3h) p).x0 != null && !((p3h) p).x0.isEmpty()) || !od0.D().f().J(context) || !akt.p2("enableLiveRoomExtParamsInUrl", true)) {
            return map;
        }
        String I = nwv.I(this.node.V("url"), null);
        if (TextUtils.isEmpty(I)) {
            return map;
        }
        Uri parse = Uri.parse(I);
        if (!TextUtils.equals(parse.getQueryParameter("tabid"), ((p3h) this.viewParams).E0)) {
            return map;
        }
        String queryParameter = parse.getQueryParameter("extParams");
        if (TextUtils.isEmpty(queryParameter)) {
            return map;
        }
        this.k = true;
        JSONObject parseObject = JSON.parseObject(queryParameter);
        nwv.A0(new d(), 3000L);
        return parseObject;
    }

    public final void N() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f3420bb", new Object[]{this});
            return;
        }
        tfs.g(TAG, "onLiveRoomDestroy");
        this.q.removeMessages(1);
        a0();
        Z();
        ImmersiveManager immersiveManager = this.m;
        if (immersiveManager != null) {
            immersiveManager.p();
        }
        pyc v = v2s.o().v();
        if (v != null) {
            v.a(this.s);
        }
        w(true);
        ((CopyOnWriteArrayList) this.o).clear();
    }

    public final void O() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99b24f37", new Object[]{this});
            return;
        }
        tfs.g(TAG, "onLiveRoomPause");
        TaoliveOpenLiveRoom taoliveOpenLiveRoom = this.c;
        if (taoliveOpenLiveRoom != null) {
            taoliveOpenLiveRoom.callWatchPlatform(WatchPlatformListenerEnum.openContainer_onPause, new Object[0]);
            pyc v = v2s.o().v();
            if (v != null) {
                v.a(this.s);
            }
        }
        AutoLoginPlugin autoLoginPlugin = this.e;
        if (autoLoginPlugin != null) {
            autoLoginPlugin.q();
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public FrameLayout onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("f97b5018", new Object[]{this, context});
        }
        tfs.g(TAG, "onCreateView");
        ImmersiveManager immersiveManager = this.m;
        if (immersiveManager != null) {
            immersiveManager.l();
        }
        E();
        String x = x(((p3h) this.viewParams).w0, F(K(context)));
        A();
        this.f = x3h.a(x, this.p);
        FrameLayout frameLayout = new FrameLayout(context);
        this.i = frameLayout;
        return frameLayout;
    }

    public final View D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("6eefb7b0", new Object[]{this});
        }
        LiveRoomEventHandler liveRoomEventHandler = new LiveRoomEventHandler(this);
        this.l = new g3l(this);
        HashMap hashMap = new HashMap();
        Object W = this.node.P().W();
        if (W instanceof Fragment) {
            hashMap.put("goDetailFragment", W);
        }
        hashMap.put("liveHomePageType", z());
        hashMap.put("enableReplayStatusShowLiveEnd", Boolean.valueOf(this.l.a()));
        this.d = qbt.h().b(this.node.N(), TaoliveOpenBizCodeEnum.TaoLiveOpenBizCode_Tab2.toString(), liveRoomEventHandler.v(), liveRoomEventHandler.x(), hashMap);
        qbt.h().g(this.d);
        this.c = qbt.h().c(this.d);
        ViewGroup f2 = qbt.h().f(this.d, this.c, (Activity) this.node.N(), this.f, null);
        TaoliveOpenLiveRoom taoliveOpenLiveRoom = this.c;
        if (taoliveOpenLiveRoom != null) {
            taoliveOpenLiveRoom.callWatchPlatform(WatchPlatformListenerEnum.openContainer_onCreate, new Object[0]);
            liveRoomEventHandler.C();
        }
        wng.f30792a = System.currentTimeMillis();
        wng.b = true;
        return f2;
    }

    public final Map F(Map map) {
        P p;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("f3a7696d", new Object[]{this, map});
        }
        Uri parse = Uri.parse(((p3h) this.viewParams).w0);
        String queryParameter = parse.getQueryParameter("id");
        String queryParameter2 = parse.getQueryParameter("userId");
        String queryParameter3 = parse.getQueryParameter("liveId");
        boolean z2 = map != null && akt.l() && nwv.o(map.get("live_tab_top_item_switch"), false);
        tfs.e(TAG, "interceptQuery, isRedPoint2TopAvatar: " + z2);
        if (!TextUtils.isEmpty(queryParameter) || !TextUtils.isEmpty(queryParameter3) || !TextUtils.isEmpty(queryParameter2)) {
            z = false;
        }
        if (!z2 || !z || (p = this.viewParams) == 0 || !LiveAvatarController.H(((p3h) p).w0, ((p3h) p).J0, ((p3h) p).G0)) {
            return map;
        }
        com.taobao.android.tab2liveroom.liveroom.topAvatar.a aVar = this.f9504a;
        if (aVar != null) {
            aVar.r("query", map);
        }
        HashMap hashMap = new HashMap();
        hashMap.put("live_tab_top_item_switch", "true");
        hashMap.put(yj4.PARAM_NEED_RECOMMEND, "true");
        hashMap.put(yj4.PARAM_UPDATE_ALL_DATA_WHEN_REFRESH, "true");
        return hashMap;
    }

    public final boolean G(Map map, String str) {
        com.taobao.android.tab2liveroom.liveroom.topAvatar.a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e8ba363d", new Object[]{this, map, str})).booleanValue();
        }
        boolean o = map != null ? nwv.o(map.get("live_tab_top_item_switch"), false) : false;
        P p = this.viewParams;
        if (((p3h) p).x0 != null) {
            ((p3h) p).x0.put("live_tab_top_item_switch", Boolean.valueOf(o));
        }
        if (akt.l() && o) {
            P p2 = this.viewParams;
            if (LiveAvatarController.H(str, ((p3h) p2).J0, ((p3h) p2).G0) && (aVar = this.f9504a) != null) {
                aVar.u();
                return true;
            }
        }
        return false;
    }

    public final void L(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        tfs.g(TAG, "onActivityResult " + i + " " + i2);
        TaoliveOpenLiveRoom taoliveOpenLiveRoom = this.c;
        if (taoliveOpenLiveRoom == null) {
            return;
        }
        if (i == 20000) {
            taoliveOpenLiveRoom.callWatchPlatform(WatchPlatformListenerEnum.processGoToDetailAction, new Object[0]);
        } else if (i == 20001) {
            taoliveOpenLiveRoom.callWatchPlatform(WatchPlatformListenerEnum.processGoToBulkDetailAction, new Object[0]);
        } else if (i != 10000) {
        } else {
            if (i2 == 8 || i2 == 1) {
                HashMap hashMap = new HashMap();
                hashMap.put("success", Boolean.valueOf(i2 == 1));
                this.c.callWatchPlatform(WatchPlatformListenerEnum.processAddCartAction, hashMap);
            }
        }
    }

    public final void M(n.g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1753112", new Object[]{this, gVar});
        } else if (this.node.z0()) {
            boolean C = od0.D().f().C();
            if (akt.p2("enableInterceptBackFloatViewShow", true) && H()) {
                gVar.e.put("handled", Boolean.TRUE);
                tfs.g(TAG, "onBackClick回退挽留,isFloatViewShowing");
                u();
            } else if (!C && od0.D().f().a() == getNode().N()) {
                gVar.e.put("handled", Boolean.TRUE);
                tfs.g(TAG, "onBackClick回退挽留");
                setImmersiveMode(false);
                sendLiveRoomMessage("onBack", null);
            }
        }
    }

    public final void P() {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80f6d5ba", new Object[]{this});
            return;
        }
        boolean s = s();
        tfs.g(TAG, "onLiveRoomResume topActivity: " + s);
        this.q.removeMessages(1);
        if (this.c == null || !s) {
            z = false;
        } else {
            z = T();
            if (z) {
                this.c.callWatchPlatform(WatchPlatformListenerEnum.openContainer_onStart, new Object[0]);
            }
            this.c.callWatchPlatform(WatchPlatformListenerEnum.openContainer_onResume, new Object[0]);
            pyc v = v2s.o().v();
            if (v != null) {
                v.d(this.s);
            }
        }
        if (this.c != null) {
            if (z) {
                this.j = true;
            }
            J(true, false);
        }
        com.taobao.android.tab2liveroom.liveroom.topAvatar.a aVar = this.f9504a;
        if (!(aVar == null || aVar.g() == null)) {
            this.f9504a.g().d();
        }
        if (this.e == null) {
            this.e = new AutoLoginPlugin(this.node.N(), this.i, this);
        }
        this.e.l();
    }

    public final void Q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e957d7a3", new Object[]{this});
            return;
        }
        tfs.g(TAG, "onLiveRoomStart");
        this.q.removeMessages(1);
        C(this.node.N());
        if (this.c != null) {
            if (s()) {
                T();
            }
            this.c.callWatchPlatform(WatchPlatformListenerEnum.openContainer_onStart, new Object[0]);
        }
    }

    public final void R(n.g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41738dd8", new Object[]{this, gVar});
            return;
        }
        String s = q.s(gVar);
        tfs.g(TAG, "onLiveRoomStop, type:" + s);
        TaoliveOpenLiveRoom taoliveOpenLiveRoom = this.c;
        if (taoliveOpenLiveRoom != null) {
            taoliveOpenLiveRoom.callWatchPlatform(WatchPlatformListenerEnum.openContainer_onStop, new Object[0]);
            if (akt.b1() && akt.c1()) {
                this.q.removeMessages(1);
                if (!I()) {
                    this.q.sendEmptyMessageDelayed(1, akt.w2("liveRoomMemReleaseDelay", 5000));
                }
            }
            com.taobao.android.tab2liveroom.liveroom.topAvatar.a aVar = this.f9504a;
            if (!(aVar == null || aVar.g() == null)) {
                this.f9504a.g().g();
            }
            HashMap hashMap = new HashMap();
            hashMap.put("type", s);
            this.c.callWatchPlatform(WatchPlatformListenerEnum.onTabUnselected, hashMap);
        }
    }

    public final void S() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad1a5aa", new Object[]{this});
        } else if (this.c != null && this.g != null && !this.f9504a.i()) {
            HashMap hashMap = new HashMap();
            VideoInfo.OfficialLiveInfo officialLiveInfo = this.g.officialLiveInfo;
            if (officialLiveInfo == null || !"official".equals(officialLiveInfo.officialLive)) {
                hashMap.put("liveId", this.g.liveId);
            } else {
                hashMap.put("liveId", this.g.officialLiveInfo.officialLiveId);
            }
            hashMap.put("sourceType", "mixLive");
            VideoInfo.OfficialLiveInfo officialLiveInfo2 = this.g.officialLiveInfo;
            if (officialLiveInfo2 == null || !"official".equals(officialLiveInfo2.officialLive)) {
                AccountInfo accountInfo = this.g.broadCaster;
                if (accountInfo != null) {
                    hashMap.put("accountId", accountInfo.accountId);
                    hashMap.put(LiveAvatarNewFrame.LIVE_AVATAR_ENCODE_ACCOUNT_ID, this.g.broadCaster.encodeAccountId);
                }
            } else {
                hashMap.put("accountId", this.g.officialLiveInfo.accountId);
            }
            this.c.callPlatform(PlatformListenerEnum.needPresentAvatarPage, hashMap);
        }
    }

    public final void V(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86838735", new Object[]{this, str, new Boolean(z)});
            return;
        }
        this.f = str;
        tfs.e(TAG, "初始的url是" + this.f);
        t();
        if (this.c != null) {
            Uri parse = Uri.parse(str);
            HashMap hashMap = new HashMap();
            hashMap.put(NotificationCompat.MessagingStyle.Message.KEY_DATA_URI, parse);
            hashMap.put("forceRefresh", Boolean.valueOf(z));
            hashMap.put("needUT", Boolean.TRUE);
            tfs.f("refreshWithUrl forceRefresh=" + z + " url=" + str);
            this.c.callWatchPlatform(WatchPlatformListenerEnum.refreshByUi, hashMap);
            this.j = true;
            J(false, true);
            return;
        }
        tfs.f("refreshWithUrl fail, forceRefresh=" + z + " url=" + str);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006e, code lost:
        if (r4.equals("onpageappear") == false) goto L_0x0029;
     */
    @Override // com.taobao.tao.flexbox.layoutmanager.core.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onHandleMessage(com.taobao.tao.flexbox.layoutmanager.core.n.g r7) {
        /*
            r6 = this;
            r0 = -1
            r1 = 2
            r2 = 1
            r3 = 0
            com.android.alibaba.ip.runtime.IpChange r4 = com.taobao.android.tab2liveroom.liveroom.a.$ipChange
            boolean r5 = r4 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r5 == 0) goto L_0x001d
            java.lang.String r0 = "1e782cf4"
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r3] = r6
            r1[r2] = r7
            java.lang.Object r7 = r4.ipc$dispatch(r0, r1)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            return r7
        L_0x001d:
            java.lang.String r4 = r7.d
            r4.hashCode()
            int r5 = r4.hashCode()
            switch(r5) {
                case -2055736715: goto L_0x007d;
                case -1307342365: goto L_0x0071;
                case -1263645693: goto L_0x0067;
                case -1012003231: goto L_0x005b;
                case -696134142: goto L_0x004f;
                case 261869451: goto L_0x0043;
                case 1228998971: goto L_0x0037;
                case 1729966319: goto L_0x002b;
                default: goto L_0x0029;
            }
        L_0x0029:
            r1 = -1
            goto L_0x0088
        L_0x002b:
            java.lang.String r1 = "onforcerefresh"
            boolean r1 = r4.equals(r1)
            if (r1 != 0) goto L_0x0035
            goto L_0x0029
        L_0x0035:
            r1 = 7
            goto L_0x0088
        L_0x0037:
            java.lang.String r1 = "ondestroy"
            boolean r1 = r4.equals(r1)
            if (r1 != 0) goto L_0x0041
            goto L_0x0029
        L_0x0041:
            r1 = 6
            goto L_0x0088
        L_0x0043:
            java.lang.String r1 = "onactivityresult"
            boolean r1 = r4.equals(r1)
            if (r1 != 0) goto L_0x004d
            goto L_0x0029
        L_0x004d:
            r1 = 5
            goto L_0x0088
        L_0x004f:
            java.lang.String r1 = "onbackclick"
            boolean r1 = r4.equals(r1)
            if (r1 != 0) goto L_0x0059
            goto L_0x0029
        L_0x0059:
            r1 = 4
            goto L_0x0088
        L_0x005b:
            java.lang.String r1 = "onstop"
            boolean r1 = r4.equals(r1)
            if (r1 != 0) goto L_0x0065
            goto L_0x0029
        L_0x0065:
            r1 = 3
            goto L_0x0088
        L_0x0067:
            java.lang.String r5 = "onpageappear"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x0088
            goto L_0x0029
        L_0x0071:
            java.lang.String r1 = "onstart"
            boolean r1 = r4.equals(r1)
            if (r1 != 0) goto L_0x007b
            goto L_0x0029
        L_0x007b:
            r1 = 1
            goto L_0x0088
        L_0x007d:
            java.lang.String r1 = "onpagedisappear"
            boolean r1 = r4.equals(r1)
            if (r1 != 0) goto L_0x0087
            goto L_0x0029
        L_0x0087:
            r1 = 0
        L_0x0088:
            switch(r1) {
                case 0: goto L_0x00d0;
                case 1: goto L_0x00cc;
                case 2: goto L_0x00c8;
                case 3: goto L_0x00c4;
                case 4: goto L_0x00c0;
                case 5: goto L_0x0098;
                case 6: goto L_0x0094;
                case 7: goto L_0x008c;
                default: goto L_0x008b;
            }
        L_0x008b:
            goto L_0x00d6
        L_0x008c:
            java.lang.String r7 = "onrefresh"
            r0 = 0
            r6.sendLiveRoomMessage(r7, r0)
            return r2
        L_0x0094:
            r6.N()
            goto L_0x00d6
        L_0x0098:
            java.util.Map r1 = r7.e
            java.lang.String r2 = "requestCode"
            java.lang.Object r1 = r1.get(r2)
            int r1 = tb.nwv.t(r1, r0)
            java.util.Map r2 = r7.e
            java.lang.String r4 = "resultCode"
            java.lang.Object r2 = r2.get(r4)
            int r0 = tb.nwv.t(r2, r0)
            java.util.Map r7 = r7.e
            java.lang.String r2 = "data"
            java.lang.Object r7 = r7.get(r2)
            android.content.Intent r7 = (android.content.Intent) r7
            r6.L(r1, r0, r7)
            goto L_0x00d6
        L_0x00c0:
            r6.M(r7)
            goto L_0x00d6
        L_0x00c4:
            r6.R(r7)
            goto L_0x00d6
        L_0x00c8:
            r6.P()
            goto L_0x00d6
        L_0x00cc:
            r6.Q()
            goto L_0x00d6
        L_0x00d0:
            r6.rootViewHeightChange(r2)
            r6.O()
        L_0x00d6:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.tab2liveroom.liveroom.a.onHandleMessage(com.taobao.tao.flexbox.layoutmanager.core.n$g):boolean");
    }
}
