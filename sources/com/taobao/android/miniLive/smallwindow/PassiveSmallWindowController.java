package com.taobao.android.miniLive.smallwindow;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import androidx.core.content.ContextCompat;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.miniLive.sdk.TBMiniLiveFloatingVideoView;
import com.taobao.android.miniLive.services.mtop.RedPacketRainResponse;
import com.taobao.android.miniLive.ui.TBMiniLiveFloatController;
import com.taobao.taolive.room.player.standard.window.NormalLiveRoomWindowImpl;
import com.taobao.taolive.room.service.IPlayPublicService;
import com.taobao.taolive.sdk.model.common.AccountInfo;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import com.taobao.taolive.sdk.playcontrol.observe.RoomPlayerObserver;
import java.util.HashMap;
import org.json.JSONObject;
import tb.bte;
import tb.cwd;
import tb.efs;
import tb.ejr;
import tb.f3s;
import tb.gjr;
import tb.htn;
import tb.i7c;
import tb.imy;
import tb.io9;
import tb.iw0;
import tb.jtn;
import tb.o3s;
import tb.obu;
import tb.pg1;
import tb.sjr;
import tb.so9;
import tb.t02;
import tb.t2o;
import tb.tjl;
import tb.up6;
import tb.ux9;
import tb.v2s;
import tb.v74;
import tb.vx9;
import tb.w4q;
import tb.wua;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class PassiveSmallWindowController extends t02 implements TBMiniLiveFloatingVideoView.h {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ON_LIVE_START_ACTION = "com.taobao.taolive.start";
    public static final String ON_VIDEO_START_ACTION = "com.taobao.avplayer.start";
    public static final String z = TBMiniLiveFloatController.class.getSimpleName();
    public final RoomPlayerObserver l;
    public final TBMiniLiveFloatingVideoView m;
    public final WindowManager n;
    public final String o;
    public final String p;
    public WindowManager.LayoutParams r;
    public long t;
    public final String u;
    public i7c v;
    public final IPlayPublicService w;
    public boolean y;
    public boolean q = false;
    public TBMiniLiveFloatController.ControllerStatus s = TBMiniLiveFloatController.ControllerStatus.loading;
    public final BroadcastReceiver x = new BroadcastReceiver() { // from class: com.taobao.android.miniLive.smallwindow.PassiveSmallWindowController.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/miniLive/smallwindow/PassiveSmallWindowController$1");
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                return;
            }
            String action = intent.getAction();
            efs.a(PassiveSmallWindowController.o(), action);
            boolean booleanExtra = intent.getBooleanExtra("isMute", false);
            if (TextUtils.isEmpty(action) || !action.equals("com.taobao.avplayer.start")) {
                if (!TextUtils.isEmpty(action) && action.equals("com.taobao.taolive.start")) {
                    PassiveSmallWindowController.this.d("dismiss");
                    if (PassiveSmallWindowController.p(PassiveSmallWindowController.this) != null) {
                        PassiveSmallWindowController.p(PassiveSmallWindowController.this).c();
                    }
                } else if (!TextUtils.isEmpty(action) && action.equals(NormalLiveRoomWindowImpl.ON_LIVE_CARD_START_ACTION)) {
                    String stringExtra = intent.getStringExtra("SubBusinessType");
                    if ("TimeMovingPlay".equals(stringExtra) || "ShopSampleCard".equals(stringExtra) || !booleanExtra) {
                        PassiveSmallWindowController.this.d("dismiss");
                        if (PassiveSmallWindowController.p(PassiveSmallWindowController.this) != null) {
                            PassiveSmallWindowController.p(PassiveSmallWindowController.this).c();
                        }
                    }
                }
            } else if (!booleanExtra) {
                PassiveSmallWindowController.this.d("dismiss");
                if (PassiveSmallWindowController.p(PassiveSmallWindowController.this) != null) {
                    PassiveSmallWindowController.p(PassiveSmallWindowController.this).c();
                }
            }
        }
    };

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            PassiveSmallWindowController passiveSmallWindowController = PassiveSmallWindowController.this;
            w4q w4qVar = passiveSmallWindowController.b;
            if (w4qVar != null) {
                w4qVar.d(PassiveSmallWindowController.q(passiveSmallWindowController));
            }
            if (PassiveSmallWindowController.r(PassiveSmallWindowController.this) != null) {
                PassiveSmallWindowController.r(PassiveSmallWindowController.this).a(new HashMap());
            }
            if (up6.u0(vx9.d())) {
                PassiveSmallWindowController.this.d("halfGoodDetail");
            } else {
                PassiveSmallWindowController.this.d("close");
            }
            if (PassiveSmallWindowController.p(PassiveSmallWindowController.this) != null) {
                PassiveSmallWindowController.p(PassiveSmallWindowController.this).c();
            }
            ux9 d = vx9.d();
            if (d != null) {
                str = d.C();
            } else {
                str = null;
            }
            sjr.g().c("com.taobao.taolive.room.float_view_close", null, str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b implements TBMiniLiveFloatingVideoView.OnJumpLiveRoomListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ VideoInfo f8965a;

        public b(VideoInfo videoInfo) {
            this.f8965a = videoInfo;
        }

        @Override // com.taobao.android.miniLive.sdk.TBMiniLiveFloatingVideoView.OnJumpLiveRoomListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                PassiveSmallWindowController.this.u(view, this.f8965a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class c implements jtn.d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // tb.jtn.d
        public void a(RedPacketRainResponse.RedPacketInfo redPacketInfo, JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ce175c6f", new Object[]{this, redPacketInfo, jSONObject});
                return;
            }
            o3s.b(PassiveSmallWindowController.o(), "onClick");
            htn htnVar = PassiveSmallWindowController.this.g;
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
            o3s.b(PassiveSmallWindowController.o(), "onShow");
            w4q w4qVar = PassiveSmallWindowController.this.b;
            if (w4qVar != null) {
                w4qVar.l();
            }
        }
    }

    static {
        t2o.a(779092063);
        t2o.a(779092028);
    }

    public static /* synthetic */ Object ipc$super(PassiveSmallWindowController passiveSmallWindowController, String str, Object... objArr) {
        if (str.hashCode() == 1498979986) {
            super.d((String) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/miniLive/smallwindow/PassiveSmallWindowController");
    }

    public static /* synthetic */ String o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7022ea09", new Object[0]);
        }
        return z;
    }

    public static /* synthetic */ i7c p(PassiveSmallWindowController passiveSmallWindowController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (i7c) ipChange.ipc$dispatch("9be3ac04", new Object[]{passiveSmallWindowController});
        }
        return passiveSmallWindowController.v;
    }

    public static /* synthetic */ IPlayPublicService q(PassiveSmallWindowController passiveSmallWindowController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IPlayPublicService) ipChange.ipc$dispatch("462a66b1", new Object[]{passiveSmallWindowController});
        }
        return passiveSmallWindowController.w;
    }

    public static /* synthetic */ io9 r(PassiveSmallWindowController passiveSmallWindowController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (io9) ipChange.ipc$dispatch("fd7f67bb", new Object[]{passiveSmallWindowController});
        }
        passiveSmallWindowController.getClass();
        return null;
    }

    public void A(i7c i7cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4f929d0", new Object[]{this, i7cVar});
        } else {
            this.v = i7cVar;
        }
    }

    public final void B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35950de2", new Object[]{this});
        } else if (this.w != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("switchScene", wua.KEY_SMALL_WINDOW);
            this.w.g(hashMap);
            HashMap hashMap2 = new HashMap();
            hashMap2.put("enterFloating", "1");
            this.w.g(hashMap2);
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
        if (this.w != null) {
            if (TextUtils.equals(this.o, "liveroom") || TextUtils.equals(str, "liveroom")) {
                HashMap hashMap = new HashMap();
                hashMap.put("switchScene", "liveRoom");
                this.w.g(hashMap);
            }
            HashMap hashMap2 = new HashMap();
            hashMap2.put("enterFloating", "0");
            this.w.g(hashMap2);
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
    public void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59589e92", new Object[]{this, str});
            return;
        }
        super.d(str);
        String str2 = z;
        efs.a(str2, "destroyMiniWindow type " + str + " mBizCode " + this.o + " isAdded " + this.q);
        if (this.q) {
            this.s = TBMiniLiveFloatController.ControllerStatus.destroy;
            TBMiniLiveFloatingVideoView tBMiniLiveFloatingVideoView = this.m;
            if (tBMiniLiveFloatingVideoView != null) {
                if (tBMiniLiveFloatingVideoView.getParent() instanceof ViewGroup) {
                    ((ViewGroup) this.m.getParent()).removeView(this.m);
                }
                this.m.removeAllViews();
                this.m.setVisibility(8);
                this.m.destroy();
            }
            l();
            y(str);
            C(str);
            if (TextUtils.equals("halfGoodDetail", str)) {
                z();
                return;
            }
            if (this.w != null && !TextUtils.equals(str, "liveroom")) {
                this.w.k();
            }
            w4q w4qVar = this.b;
            if (w4qVar != null) {
                w4qVar.g();
            }
            w();
            try {
                Context context = this.c;
                if (context != null) {
                    context.getApplicationContext().unregisterReceiver(this.x);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            this.q = false;
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
    public void onMuteBtnClick(boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c77e069", new Object[]{this, new Boolean(z2)});
            return;
        }
        w4q w4qVar = this.b;
        if (w4qVar != null) {
            w4qVar.k(z2);
        }
        so9 so9Var = this.f;
        if (so9Var != null) {
            so9Var.a(z2);
        }
    }

    public final void t(VideoInfo videoInfo, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b8351d2", new Object[]{this, videoInfo, str, str2});
            return;
        }
        w4q w4qVar = new w4q();
        this.b = w4qVar;
        w4qVar.r("pocket");
        w4q w4qVar2 = this.b;
        w4qVar2.q("PassiveSmallWindowController_" + System.currentTimeMillis());
        if (videoInfo != null) {
            this.b.p(videoInfo.liveId);
            AccountInfo accountInfo = videoInfo.broadCaster;
            if (accountInfo != null) {
                this.b.n(accountInfo.accountId);
            }
            this.b.s(str);
            this.b.t(String.valueOf(videoInfo.status));
            this.b.o(str2);
        }
    }

    public void u(View view, VideoInfo videoInfo) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52e86e46", new Object[]{this, view, videoInfo});
            return;
        }
        this.m.bringsToFront();
        w4q w4qVar = this.b;
        if (w4qVar != null) {
            w4qVar.h(this.w.isMuted());
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
                if (this.w != null) {
                    sb.append("&isLiveMute=");
                    sb.append(this.w.isMuted());
                }
                v2s.o().v().c(view.getContext(), sb.toString(), null, AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL);
            } else {
                return;
            }
        }
        d("liveroom");
    }

    public final void x(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66186083", new Object[]{this, context});
        } else if (context != null) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("com.taobao.taolive.start");
            intentFilter.addAction("com.taobao.avplayer.start");
            intentFilter.addAction(NormalLiveRoomWindowImpl.ON_LIVE_CARD_START_ACTION);
            context.getApplicationContext().registerReceiver(this.x, intentFilter);
        }
    }

    public final void y(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5ca6b1d", new Object[]{this, str});
            return;
        }
        HashMap hashMap = new HashMap();
        if (v2s.o().u() != null) {
            hashMap.put("userId", v2s.o().u().getUserId());
        }
        if (this.t > 0) {
            hashMap.put("exposureTime", String.valueOf(((float) (SystemClock.uptimeMillis() - this.t)) / 1000.0f));
            hashMap.put("type", str);
            if (!TextUtils.isEmpty(this.p)) {
                hashMap.put("algParams", this.p);
            }
            obu.a(this.o, "FloatWindowExposure", hashMap);
            this.t = 0L;
        }
    }

    public final void z() {
        ViewParent parent;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cea116c4", new Object[]{this});
            return;
        }
        TBMiniLiveFloatingVideoView tBMiniLiveFloatingVideoView = this.m;
        if (!(tBMiniLiveFloatingVideoView == null || (parent = tBMiniLiveFloatingVideoView.getParent()) == null || !(parent instanceof ViewGroup))) {
            ((ViewGroup) parent).removeView(this.m);
        }
        WindowManager windowManager = this.n;
        if (windowManager != null) {
            windowManager.removeView(this.m);
        }
        w();
        sjr.g().e("com.taobao.taolive.room.float_view_add_to_live_room", null);
    }

    public final WindowManager.LayoutParams s(boolean z2) {
        int i;
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WindowManager.LayoutParams) ipChange.ipc$dispatch("c03d3b37", new Object[]{this, new Boolean(z2)});
        }
        this.r = new WindowManager.LayoutParams();
        if (this.c instanceof Application) {
            if (D()) {
                this.r.type = 2038;
            } else if (E()) {
                this.r.type = 2003;
            } else {
                this.r.type = 2005;
            }
        }
        WindowManager.LayoutParams layoutParams = this.r;
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
        this.r.gravity = 51;
        if (f3s.o(this.o)) {
            if (z2) {
                i = iw0.a(this.c, 175.0f);
                i2 = iw0.a(this.c, 130.0f);
            } else {
                i = iw0.a(this.c, 129.0f);
                i2 = iw0.a(this.c, 228.0f);
            }
        } else if (z2) {
            i = iw0.a(this.c, 160.0f);
            i2 = iw0.a(this.c, 94.0f);
        } else {
            i = iw0.a(this.c, 96.0f);
            i2 = iw0.a(this.c, 173.0f);
        }
        WindowManager.LayoutParams layoutParams2 = this.r;
        layoutParams2.width = i;
        layoutParams2.height = i2;
        if (TextUtils.equals("top-left", null)) {
            this.r.x = (int) Math.max(h * 0.0f, a2);
            this.r.y = (int) Math.max(e * 0.0f, a3);
        } else if (TextUtils.equals("top-right", null)) {
            WindowManager.LayoutParams layoutParams3 = this.r;
            layoutParams3.x = (h - layoutParams3.width) - ((int) Math.max(h * 0.0f, a2));
            this.r.y = (int) Math.max(e * 0.0f, a3);
        } else if (TextUtils.equals("bottom-left", null)) {
            this.r.x = (int) Math.max(h * 0.0f, a2);
            WindowManager.LayoutParams layoutParams4 = this.r;
            layoutParams4.y = (e - layoutParams4.height) - ((int) Math.max(e * 0.0f, a3));
        } else if (TextUtils.equals("bottom-right", null)) {
            WindowManager.LayoutParams layoutParams5 = this.r;
            layoutParams5.x = (h - layoutParams5.width) - ((int) Math.max(h * 0.0f, a2));
            WindowManager.LayoutParams layoutParams6 = this.r;
            layoutParams6.y = (e - layoutParams6.height) - ((int) Math.max(e * 0.0f, a3));
        } else {
            WindowManager.LayoutParams layoutParams7 = this.r;
            layoutParams7.x = (h - layoutParams7.width) - a2;
            layoutParams7.y = (e - layoutParams7.height) - a3;
        }
        return this.r;
    }

    public void v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4410e798", new Object[]{this});
        } else if (!this.y) {
            this.y = true;
            efs.a("TBMiniLiveFloatController", "onWindowAdded");
            this.w.o(true);
            RoomPlayerObserver roomPlayerObserver = this.l;
            if (roomPlayerObserver != null) {
                roomPlayerObserver.B(this.u);
                this.l.C("MiniLive");
                this.l.D(this.o);
                this.l.d();
            }
        }
    }

    public void w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b97c2eb8", new Object[]{this});
        } else if (this.y) {
            this.y = false;
            efs.a("TBMiniLiveFloatController", "onWindowRemoved");
            this.w.o(false);
            RoomPlayerObserver roomPlayerObserver = this.l;
            if (roomPlayerObserver != null) {
                roomPlayerObserver.e();
            }
            this.e = null;
            this.f = null;
            w4q w4qVar = this.b;
            if (w4qVar != null) {
                w4qVar.g();
            }
        }
    }

    @Override // tb.t02
    public boolean b() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e6e00968", new Object[]{this})).booleanValue();
        }
        if (vx9.d() != null && ejr.e() && up6.u0(vx9.d()) && up6.z0(vx9.d())) {
            efs.a("TBLiveService", "addMiniView isUserCloseSmallWindow");
            return false;
        } else if (this.q) {
            return true;
        } else {
            this.q = true;
            if (!(this.n == null || this.s == TBMiniLiveFloatController.ControllerStatus.destroy)) {
                try {
                    this.t = SystemClock.uptimeMillis();
                    this.n.addView(this.m, this.r);
                    k();
                    v();
                    i7c i7cVar = this.v;
                    if (i7cVar != null) {
                        i7cVar.b();
                    }
                    w4q w4qVar = this.b;
                    if (w4qVar != null) {
                        if (bte.f()) {
                            str = "close";
                        } else {
                            str = "open";
                        }
                        w4qVar.j(str);
                    }
                    efs.a(z, "addMiniView");
                    return true;
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            return false;
        }
    }

    public PassiveSmallWindowController(Context context, IPlayPublicService iPlayPublicService, VideoInfo videoInfo, String str, String str2, String str3, String str4, tjl tjlVar, boolean z2) {
        String str5;
        efs.a(z, "Constructor isLiveMute = " + z2);
        if (videoInfo != null) {
            str5 = videoInfo.liveId;
        } else {
            str5 = "";
        }
        this.l = new RoomPlayerObserver(imy.c(str5, imy.d(videoInfo)));
        this.d = tjlVar;
        t(videoInfo, str3, str4);
        this.n = (WindowManager) context.getSystemService(pg1.ATOM_EXT_window);
        TBMiniLiveFloatingVideoView tBMiniLiveFloatingVideoView = new TBMiniLiveFloatingVideoView(context, str, str2);
        this.m = tBMiniLiveFloatingVideoView;
        tBMiniLiveFloatingVideoView.setCloseBtnClickListener(new a());
        tBMiniLiveFloatingVideoView.setFloatingVideoViewLifeCycleCallback(this);
        tBMiniLiveFloatingVideoView.setOnViewClickListener(new b(videoInfo));
        this.w = iPlayPublicService;
        this.c = context;
        if (videoInfo != null) {
            this.u = videoInfo.liveId;
        }
        this.o = str;
        this.p = str2;
        boolean z3 = videoInfo != null ? videoInfo.landScape : false;
        gjr.b k = new gjr.b().i(str).l(false).k(false);
        k.j(false);
        tBMiniLiveFloatingVideoView.setTbLiveConfig(k.h());
        tBMiniLiveFloatingVideoView.init(context, null, iPlayPublicService, s(z3), z3, z2);
        x(context);
        B();
        this.d = tjlVar;
        tBMiniLiveFloatingVideoView.setVideoInfo(videoInfo);
        tBMiniLiveFloatingVideoView.setRedPacketRainCallback(new c());
    }
}
