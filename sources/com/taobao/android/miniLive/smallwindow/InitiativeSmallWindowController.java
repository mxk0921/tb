package com.taobao.android.miniLive.smallwindow;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.core.content.ContextCompat;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.miniLive.sdk.TBMiniLiveFloatingVideoView;
import com.taobao.android.miniLive.services.mtop.RedPacketRainResponse;
import com.taobao.android.miniLive.smallwindow.InitiativeSmallWindowController;
import com.taobao.android.miniLive.ui.TBMiniLiveFloatController;
import com.taobao.taolive.room.player.standard.window.NormalLiveRoomWindowImpl;
import com.taobao.taolive.sdk.model.common.AccountInfo;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import com.taobao.taolive.sdk.playcontrol.observe.RoomPlayerObserver;
import java.util.HashMap;
import org.json.JSONObject;
import tb.bte;
import tb.cwd;
import tb.efs;
import tb.f3s;
import tb.gjr;
import tb.htn;
import tb.i7c;
import tb.imy;
import tb.iw0;
import tb.jtn;
import tb.o3s;
import tb.pg1;
import tb.r4d;
import tb.s4q;
import tb.s7t;
import tb.sjr;
import tb.so9;
import tb.sya;
import tb.t02;
import tb.t2o;
import tb.tjl;
import tb.ux9;
import tb.v2s;
import tb.v74;
import tb.vx9;
import tb.w4q;
import tb.wua;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class InitiativeSmallWindowController extends t02 implements TBMiniLiveFloatingVideoView.h {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ON_LIVE_START_ACTION = "com.taobao.taolive.start";
    public static final String ON_VIDEO_START_ACTION = "com.taobao.avplayer.start";
    public static final String y = InitiativeSmallWindowController.class.getSimpleName();
    public final RoomPlayerObserver l;
    public final TBMiniLiveFloatingVideoView m;
    public final WindowManager n;
    public final String o;
    public WindowManager.LayoutParams q;
    public final String s;
    public r4d t;
    public i7c u;
    public final s4q v;
    public boolean x;
    public boolean p = false;
    public TBMiniLiveFloatController.ControllerStatus r = TBMiniLiveFloatController.ControllerStatus.loading;
    public final BroadcastReceiver w = new BroadcastReceiver() { // from class: com.taobao.android.miniLive.smallwindow.InitiativeSmallWindowController.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/miniLive/smallwindow/InitiativeSmallWindowController$1");
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                return;
            }
            String action = intent.getAction();
            efs.a(InitiativeSmallWindowController.q(), action);
            boolean booleanExtra = intent.getBooleanExtra("isMute", false);
            if (TextUtils.isEmpty(action) || !action.equals("com.taobao.avplayer.start")) {
                if (!TextUtils.isEmpty(action) && action.equals("com.taobao.taolive.start")) {
                    InitiativeSmallWindowController.this.d("dismiss");
                    if (InitiativeSmallWindowController.r(InitiativeSmallWindowController.this) != null) {
                        InitiativeSmallWindowController.r(InitiativeSmallWindowController.this).c();
                    }
                } else if (!TextUtils.isEmpty(action) && action.equals(NormalLiveRoomWindowImpl.ON_LIVE_CARD_START_ACTION)) {
                    if ("ShopSampleCard".equals(intent.getStringExtra("SubBusinessType")) || !booleanExtra) {
                        InitiativeSmallWindowController.this.d("dismiss");
                        if (InitiativeSmallWindowController.r(InitiativeSmallWindowController.this) != null) {
                            InitiativeSmallWindowController.r(InitiativeSmallWindowController.this).c();
                        }
                    }
                }
            } else if (!booleanExtra) {
                InitiativeSmallWindowController.this.d("dismiss");
                if (InitiativeSmallWindowController.r(InitiativeSmallWindowController.this) != null) {
                    InitiativeSmallWindowController.r(InitiativeSmallWindowController.this).c();
                }
            }
        }
    };

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements TBMiniLiveFloatingVideoView.OnJumpLiveRoomListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f8961a;
        public final /* synthetic */ r4d b;
        public final /* synthetic */ VideoInfo c;

        public a(boolean z, r4d r4dVar, VideoInfo videoInfo) {
            this.f8961a = z;
            this.b = r4dVar;
            this.c = videoInfo;
        }

        @Override // com.taobao.android.miniLive.sdk.TBMiniLiveFloatingVideoView.OnJumpLiveRoomListener
        public void onClick(View view) {
            r4d r4dVar;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            if (this.f8961a && (r4dVar = this.b) != null) {
                new sya(vx9.d()).b(view, this.c, r4dVar.getCurrentPosition());
            }
            InitiativeSmallWindowController.this.w(view, this.c);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b implements jtn.d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // tb.jtn.d
        public void a(RedPacketRainResponse.RedPacketInfo redPacketInfo, JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ce175c6f", new Object[]{this, redPacketInfo, jSONObject});
                return;
            }
            o3s.b(InitiativeSmallWindowController.q(), "onClick");
            htn htnVar = InitiativeSmallWindowController.this.g;
            if (htnVar != null) {
                ((NormalLiveRoomWindowImpl.d) htnVar).a(redPacketInfo, jSONObject);
            }
        }

        @Override // tb.jtn.d
        public void onShow() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("90d5bc03", new Object[]{this});
                return;
            }
            o3s.b(InitiativeSmallWindowController.q(), "onShow");
            w4q w4qVar = InitiativeSmallWindowController.this.b;
            if (w4qVar != null) {
                w4qVar.l();
            }
        }
    }

    static {
        t2o.a(779092059);
        t2o.a(779092028);
    }

    public InitiativeSmallWindowController(Context context, r4d r4dVar, VideoInfo videoInfo, String str, String str2, String str3, String str4, String str5, tjl tjlVar, boolean z, boolean z2) {
        efs.a(y, "Constructor isLiveMute = " + z);
        this.d = tjlVar;
        this.t = r4dVar;
        s4q s4qVar = new s4q(str3);
        this.v = s4qVar;
        t(videoInfo, str3, str4, str5);
        RoomPlayerObserver roomPlayerObserver = new RoomPlayerObserver(imy.c(videoInfo != null ? videoInfo.liveId : "", imy.d(videoInfo)));
        this.l = roomPlayerObserver;
        this.t.D(roomPlayerObserver);
        this.n = (WindowManager) context.getSystemService(pg1.ATOM_EXT_window);
        TBMiniLiveFloatingVideoView tBMiniLiveFloatingVideoView = new TBMiniLiveFloatingVideoView(context, str, str2);
        this.m = tBMiniLiveFloatingVideoView;
        tBMiniLiveFloatingVideoView.setCloseBtnClickListener(new View.OnClickListener() { // from class: tb.c9f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                InitiativeSmallWindowController.this.u(view);
            }
        });
        tBMiniLiveFloatingVideoView.setFloatingVideoViewLifeCycleCallback(this);
        tBMiniLiveFloatingVideoView.setOnViewClickListener(new a(z2, r4dVar, videoInfo));
        this.c = context;
        if (videoInfo != null) {
            this.s = videoInfo.liveId;
        }
        this.o = str;
        boolean z3 = videoInfo != null ? videoInfo.landScape : false;
        gjr.b k = new gjr.b().i(str).l(false).k(false);
        k.j(false);
        tBMiniLiveFloatingVideoView.setTbLiveConfig(k.h());
        r4d r4dVar2 = this.t;
        if (r4dVar2 != null) {
            r4dVar2.setMuted(z);
        }
        tBMiniLiveFloatingVideoView.init(context, null, this.t, s(z3), z3, z);
        if (videoInfo != null) {
            tBMiniLiveFloatingVideoView.setVideoCover(videoInfo.coverImg);
        }
        z(context);
        B();
        s4qVar.e(this.t);
        s4qVar.f(this.b);
        tBMiniLiveFloatingVideoView.setVideoInfo(videoInfo);
        tBMiniLiveFloatingVideoView.setRedPacketRainCallback(new b());
    }

    public static /* synthetic */ Object ipc$super(InitiativeSmallWindowController initiativeSmallWindowController, String str, Object... objArr) {
        if (str.hashCode() == 1498979986) {
            super.d((String) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/miniLive/smallwindow/InitiativeSmallWindowController");
    }

    public static /* synthetic */ String q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7022ea09", new Object[0]);
        }
        return y;
    }

    public static /* synthetic */ i7c r(InitiativeSmallWindowController initiativeSmallWindowController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (i7c) ipChange.ipc$dispatch("18aa095b", new Object[]{initiativeSmallWindowController});
        }
        return initiativeSmallWindowController.u;
    }

    public void A(i7c i7cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4f929d0", new Object[]{this, i7cVar});
        } else {
            this.u = i7cVar;
        }
    }

    public final void B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35950de2", new Object[]{this});
        } else if (this.t != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("switchScene", wua.KEY_SMALL_WINDOW);
            this.t.g(hashMap);
            HashMap hashMap2 = new HashMap();
            hashMap2.put("enterFloating", "1");
            this.t.g(hashMap2);
        }
    }

    public final void C(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6bd8454", new Object[]{this, str});
            return;
        }
        if (v2s.o().A() != null) {
            cwd A = v2s.o().A();
            A.c("updatePlayExValue", "updateExpParamsWhenQuit type = " + str);
        }
        if (this.t != null) {
            if (TextUtils.equals(this.o, "liveroom") || TextUtils.equals(str, "liveroom")) {
                HashMap hashMap = new HashMap();
                hashMap.put("switchScene", "liveRoom");
                this.t.g(hashMap);
            }
            HashMap hashMap2 = new HashMap();
            hashMap2.put("enterFloating", "0");
            this.t.g(hashMap2);
        }
    }

    public final boolean D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b68c6bb2", new Object[]{this})).booleanValue();
        }
        if (Build.VERSION.SDK_INT >= 26) {
            return true;
        }
        return false;
    }

    public final boolean E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("77142181", new Object[]{this})).booleanValue();
        }
        if (Build.VERSION.SDK_INT >= 24) {
            return true;
        }
        try {
            ContextCompat.checkSelfPermission(this.c.getApplicationContext(), "android.permission.SYSTEM_ALERT_WINDOW");
        } catch (NoSuchMethodError unused) {
        }
        return false;
    }

    @Override // com.taobao.android.miniLive.sdk.TBMiniLiveFloatingVideoView.h
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77c4c446", new Object[]{this});
        }
    }

    @Override // tb.t02
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        } else {
            d("dismiss");
        }
    }

    @Override // tb.t02
    public View e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("576a35e4", new Object[]{this});
        }
        TBMiniLiveFloatingVideoView tBMiniLiveFloatingVideoView = this.m;
        if (tBMiniLiveFloatingVideoView != null) {
            return tBMiniLiveFloatingVideoView;
        }
        return null;
    }

    @Override // tb.t02
    public void h(View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0a0aed6", new Object[]{this, onClickListener});
        } else {
            this.e = onClickListener;
        }
    }

    @Override // com.taobao.android.miniLive.sdk.TBMiniLiveFloatingVideoView.h
    public void onMuteBtnClick(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c77e069", new Object[]{this, new Boolean(z)});
            return;
        }
        w4q w4qVar = this.b;
        if (w4qVar != null) {
            w4qVar.k(z);
        }
        so9 so9Var = this.f;
        if (so9Var != null) {
            so9Var.a(z);
        }
    }

    public final void t(VideoInfo videoInfo, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b23a6b1c", new Object[]{this, videoInfo, str, str2, str3});
            return;
        }
        this.b = new w4q();
        if ("SideSlip".equals(str)) {
            this.b.r("slide");
        } else if ("KeyBackDown".equals(str)) {
            this.b.r("close");
        } else {
            this.b.r("zoom");
        }
        w4q w4qVar = this.b;
        w4qVar.q("InitiativeSmallWindowController_" + System.currentTimeMillis());
        if (videoInfo != null) {
            this.b.p(videoInfo.liveId);
            AccountInfo accountInfo = videoInfo.broadCaster;
            if (accountInfo != null) {
                this.b.n(accountInfo.accountId);
            }
            this.b.s(str2);
            this.b.t(String.valueOf(videoInfo.status));
            this.b.o(str3);
        }
    }

    public final /* synthetic */ void u(View view) {
        String str;
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("994abfa2", new Object[]{this, view});
            return;
        }
        s4q s4qVar = this.v;
        if (s4qVar != null) {
            z = s4qVar.b();
        }
        if (z) {
            TBMiniLiveFloatingVideoView tBMiniLiveFloatingVideoView = this.m;
            if (tBMiniLiveFloatingVideoView != null) {
                tBMiniLiveFloatingVideoView.showCloseSwitchTips(new View.OnClickListener() { // from class: tb.d9f
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        InitiativeSmallWindowController.this.v(view2);
                    }
                });
                w4q w4qVar = this.b;
                if (w4qVar != null) {
                    w4qVar.f(this.t);
                    return;
                }
                return;
            }
            return;
        }
        w4q w4qVar2 = this.b;
        if (w4qVar2 != null) {
            w4qVar2.e(this.t);
        }
        d("close");
        i7c i7cVar = this.u;
        if (i7cVar != null) {
            i7cVar.c();
        }
        ux9 d = vx9.d();
        if (d != null) {
            str = d.C();
        } else {
            str = null;
        }
        sjr.g().c("com.taobao.taolive.room.float_view_close", null, str);
    }

    public final /* synthetic */ void v(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f525e684", new Object[]{this, view});
            return;
        }
        w4q w4qVar = this.b;
        if (w4qVar != null) {
            w4qVar.e(this.t);
        }
        d("close");
    }

    public void w(View view, VideoInfo videoInfo) {
        String str;
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52e86e46", new Object[]{this, view, videoInfo});
            return;
        }
        this.m.bringsToFront();
        w4q w4qVar = this.b;
        if (w4qVar != null) {
            r4d r4dVar = this.t;
            if (r4dVar != null) {
                z = r4dVar.isMuted();
            }
            w4qVar.h(z);
        }
        View.OnClickListener onClickListener = this.e;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        } else if (!(v2s.o().v() == null || this.c == null)) {
            if (videoInfo == null || (str = videoInfo.liveId) == null) {
                str = null;
            } else if (videoInfo.isOfficialType()) {
                str = videoInfo.officialLiveInfo.officialLiveId;
            }
            if (!TextUtils.isEmpty(str)) {
                StringBuilder sb = new StringBuilder(v74.a(str));
                sb.append("&entrySource=miniLive&livesource=miniLive&spm=");
                sb.append(this.h);
                sb.append("&trackInfo=");
                sb.append(this.i);
                if (this.t != null) {
                    sb.append("&isLiveMute=");
                    sb.append(this.t.isMuted());
                }
                v2s.o().v().c(view.getContext(), sb.toString(), null, AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL);
            } else {
                return;
            }
        }
        d("liveroom");
    }

    public final void z(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66186083", new Object[]{this, context});
        } else if (context != null) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("com.taobao.taolive.start");
            intentFilter.addAction("com.taobao.avplayer.start");
            intentFilter.addAction(NormalLiveRoomWindowImpl.ON_LIVE_CARD_START_ACTION);
            context.getApplicationContext().registerReceiver(this.w, intentFilter);
        }
    }

    @Override // tb.t02
    public void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59589e92", new Object[]{this, str});
            return;
        }
        super.d(str);
        String str2 = y;
        efs.a(str2, "destroyMiniWindow type " + str + " mBizCode " + this.o + " isAdded " + this.p);
        if (this.p) {
            this.r = TBMiniLiveFloatController.ControllerStatus.destroy;
            this.v.c();
            TBMiniLiveFloatingVideoView tBMiniLiveFloatingVideoView = this.m;
            if (tBMiniLiveFloatingVideoView != null) {
                if (tBMiniLiveFloatingVideoView.getParent() instanceof ViewGroup) {
                    ((ViewGroup) this.m.getParent()).removeView(this.m);
                }
                this.m.removeAllViews();
                this.m.setVisibility(8);
                this.m.destroy();
            }
            C(str);
            r4d r4dVar = this.t;
            if (r4dVar != null) {
                r4dVar.release();
                this.t.destroy();
                this.t = null;
                s7t.j().i();
            }
            w4q w4qVar = this.b;
            if (w4qVar != null) {
                w4qVar.g();
            }
            l();
            y();
            try {
                Context context = this.c;
                if (context != null) {
                    context.getApplicationContext().unregisterReceiver(this.w);
                }
            } catch (Exception e) {
                e.printStackTrace();
                String str3 = y;
                efs.a(str3, "解注册广播失败:" + e.getMessage());
            }
            this.p = false;
        }
    }

    public final WindowManager.LayoutParams s(boolean z) {
        int i;
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WindowManager.LayoutParams) ipChange.ipc$dispatch("c03d3b37", new Object[]{this, new Boolean(z)});
        }
        this.q = new WindowManager.LayoutParams();
        if (this.c instanceof Application) {
            if (D()) {
                this.q.type = 2038;
            } else if (E()) {
                this.q.type = 2003;
            } else {
                this.q.type = 2005;
            }
        }
        WindowManager.LayoutParams layoutParams = this.q;
        layoutParams.format = 1;
        layoutParams.flags |= 262312;
        int h = iw0.h(this.c);
        int e = iw0.e(this.c);
        int a2 = iw0.a(this.c, 12.0f);
        int a3 = iw0.a(this.c, 84.0f);
        if (TextUtils.equals(this.o, "liveroom") || TextUtils.equals(this.o, "zoom")) {
            a2 += (f3s.q() * iw0.e(this.c)) / 750;
            a3 += (f3s.p() * iw0.e(this.c)) / 750;
        }
        this.q.gravity = 51;
        if (f3s.o(this.o)) {
            if (z) {
                i = iw0.a(this.c, 175.0f);
                i2 = iw0.a(this.c, 130.0f);
            } else {
                i = iw0.a(this.c, 129.0f);
                i2 = iw0.a(this.c, 228.0f);
            }
        } else if (z) {
            i = iw0.a(this.c, 160.0f);
            i2 = iw0.a(this.c, 94.0f);
        } else {
            i = iw0.a(this.c, 96.0f);
            i2 = iw0.a(this.c, 173.0f);
        }
        WindowManager.LayoutParams layoutParams2 = this.q;
        layoutParams2.width = i;
        layoutParams2.height = i2;
        if (TextUtils.equals("top-left", null)) {
            this.q.x = (int) Math.max(h * 0.0f, a2);
            this.q.y = (int) Math.max(e * 0.0f, a3);
        } else if (TextUtils.equals("top-right", null)) {
            WindowManager.LayoutParams layoutParams3 = this.q;
            layoutParams3.x = (h - layoutParams3.width) - ((int) Math.max(h * 0.0f, a2));
            this.q.y = (int) Math.max(e * 0.0f, a3);
        } else if (TextUtils.equals("bottom-left", null)) {
            this.q.x = (int) Math.max(h * 0.0f, a2);
            WindowManager.LayoutParams layoutParams4 = this.q;
            layoutParams4.y = (e - layoutParams4.height) - ((int) Math.max(e * 0.0f, a3));
        } else if (TextUtils.equals("bottom-right", null)) {
            WindowManager.LayoutParams layoutParams5 = this.q;
            layoutParams5.x = (h - layoutParams5.width) - ((int) Math.max(h * 0.0f, a2));
            WindowManager.LayoutParams layoutParams6 = this.q;
            layoutParams6.y = (e - layoutParams6.height) - ((int) Math.max(e * 0.0f, a3));
        } else {
            WindowManager.LayoutParams layoutParams7 = this.q;
            layoutParams7.x = (h - layoutParams7.width) - a2;
            layoutParams7.y = (e - layoutParams7.height) - a3;
        }
        return this.q;
    }

    public void x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4410e798", new Object[]{this});
        } else if (!this.x) {
            this.x = true;
            efs.a(y, "onWindowAdded");
            RoomPlayerObserver roomPlayerObserver = this.l;
            if (roomPlayerObserver != null) {
                roomPlayerObserver.B(this.s);
                this.l.C("MiniLive");
                this.l.D(this.o);
                this.l.d();
            }
        }
    }

    public void y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b97c2eb8", new Object[]{this});
        } else if (this.x) {
            this.x = false;
            efs.a(y, "onWindowRemoved");
            RoomPlayerObserver roomPlayerObserver = this.l;
            if (roomPlayerObserver != null) {
                roomPlayerObserver.e();
            }
            this.e = null;
            this.f = null;
        }
    }

    @Override // tb.t02
    public boolean b() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e6e00968", new Object[]{this})).booleanValue();
        }
        efs.a(y, "addMiniView");
        if (this.p) {
            return true;
        }
        this.p = true;
        WindowManager windowManager = this.n;
        if (!(windowManager == null || this.r == TBMiniLiveFloatController.ControllerStatus.destroy)) {
            try {
                windowManager.addView(this.m, this.q);
                i7c i7cVar = this.u;
                if (i7cVar != null) {
                    i7cVar.b();
                }
                x();
                w4q w4qVar = this.b;
                if (w4qVar != null) {
                    if (bte.f()) {
                        str = "close";
                    } else {
                        str = "open";
                    }
                    w4qVar.j(str);
                }
                s4q s4qVar = this.v;
                if (s4qVar != null) {
                    s4qVar.d();
                }
                k();
                return true;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return false;
    }
}
