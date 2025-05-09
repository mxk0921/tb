package com.taobao.android.miniLive.ui;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import androidx.core.content.ContextCompat;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.miniLive.model.BroadcasterInfo;
import com.taobao.android.miniLive.model.SimpleLiveInfo;
import com.taobao.android.miniLive.sdk.TBMiniLiveFloatingVideoView;
import com.taobao.taolive.room.player.preload.instance.PreloadParams;
import com.taobao.taolive.room.player.standard.window.NormalLiveRoomWindowImpl;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import com.taobao.taolive.sdk.playcontrol.observe.RoomPlayerObserver;
import com.taobao.taolive.sdk.ui.media.IMediaPlayer;
import com.uc.webview.export.media.CommandID;
import com.uc.webview.export.media.MessageID;
import java.util.HashMap;
import java.util.Map;
import tb.cwd;
import tb.cyg;
import tb.e7m;
import tb.efs;
import tb.ejr;
import tb.f3s;
import tb.fkx;
import tb.i7c;
import tb.imy;
import tb.io9;
import tb.iw0;
import tb.mxg;
import tb.o3s;
import tb.obu;
import tb.pg1;
import tb.r4d;
import tb.rg0;
import tb.s7t;
import tb.sj4;
import tb.sjr;
import tb.so9;
import tb.t2o;
import tb.t4q;
import tb.tfi;
import tb.ufi;
import tb.up6;
import tb.ux9;
import tb.v2s;
import tb.v3s;
import tb.vx9;
import tb.w4q;
import tb.yj4;
import tb.zqq;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class TBMiniLiveFloatController implements cyg.b, TBMiniLiveFloatingVideoView.h {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String F = TBMiniLiveFloatController.class.getSimpleName();
    public static final String ON_LIVE_START_ACTION = "com.taobao.taolive.start";
    public static final String ON_VIDEO_START_ACTION = "com.taobao.avplayer.start";
    public long A;
    public WindowManager B;
    public i7c C;
    public boolean E;

    /* renamed from: a  reason: collision with root package name */
    public Context f8971a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String h;
    public float i;
    public float j;
    public View.OnClickListener k;
    public io9 l;
    public so9 m;
    public String o;
    public final long p;
    public final RoomPlayerObserver q;
    public TBMiniLiveFloatingVideoView r;
    public cyg v;
    public WindowManager.LayoutParams w;
    public SimpleLiveInfo x;
    public r4d y;
    public boolean g = true;
    public boolean t = false;
    public final BroadcastReceiver u = new BroadcastReceiver() { // from class: com.taobao.android.miniLive.ui.TBMiniLiveFloatController.3
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(AnonymousClass3 r2, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/miniLive/ui/TBMiniLiveFloatController$3");
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                return;
            }
            String action = intent.getAction();
            efs.a(TBMiniLiveFloatController.v(), action);
            boolean booleanExtra = intent.getBooleanExtra("isMute", false);
            if (TextUtils.isEmpty(action) || !action.equals("com.taobao.avplayer.start")) {
                if (!TextUtils.isEmpty(action) && action.equals("com.taobao.taolive.start")) {
                    TBMiniLiveFloatController.this.A("dismiss");
                    if (TBMiniLiveFloatController.p(TBMiniLiveFloatController.this) != null) {
                        TBMiniLiveFloatController.p(TBMiniLiveFloatController.this).c();
                    }
                } else if (!TextUtils.isEmpty(action) && action.equals(NormalLiveRoomWindowImpl.ON_LIVE_CARD_START_ACTION)) {
                    if ("ShopSampleCard".equals(intent.getStringExtra("SubBusinessType")) || !booleanExtra) {
                        TBMiniLiveFloatController.this.A("dismiss");
                        if (TBMiniLiveFloatController.p(TBMiniLiveFloatController.this) != null) {
                            TBMiniLiveFloatController.p(TBMiniLiveFloatController.this).c();
                        }
                    }
                }
            } else if (!booleanExtra) {
                TBMiniLiveFloatController.this.A("dismiss");
                if (TBMiniLiveFloatController.p(TBMiniLiveFloatController.this) != null) {
                    TBMiniLiveFloatController.p(TBMiniLiveFloatController.this).c();
                }
            }
        }
    };
    public boolean z = false;
    public ControllerStatus D = ControllerStatus.loading;
    public final boolean n = true;
    public final w4q s = new w4q();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public enum ControllerStatus {
        loading,
        start,
        pause,
        error,
        destroy;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(ControllerStatus controllerStatus, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/miniLive/ui/TBMiniLiveFloatController$ControllerStatus");
        }

        public static ControllerStatus valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ControllerStatus) ipChange.ipc$dispatch("b6d04f9d", new Object[]{str});
            }
            return (ControllerStatus) Enum.valueOf(ControllerStatus.class, str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements e7m {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.e7m
        public void onInstallReadyRetry() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("68affaa8", new Object[]{this});
            }
        }

        @Override // tb.e7m
        public void onNotInstallPlayError() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("638f1674", new Object[]{this});
                return;
            }
            TBMiniLiveFloatController.this.A("dismiss");
            efs.a("TBMiniLiveController", "onNotInstallPlayError");
            if (TBMiniLiveFloatController.p(TBMiniLiveFloatController.this) != null) {
                TBMiniLiveFloatController.p(TBMiniLiveFloatController.this).a();
            }
            TBMiniLiveFloatController.n(TBMiniLiveFloatController.this, ControllerStatus.error);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            if (TBMiniLiveFloatController.b(TBMiniLiveFloatController.this) != null) {
                TBMiniLiveFloatController.b(TBMiniLiveFloatController.this).e(TBMiniLiveFloatController.c(TBMiniLiveFloatController.this));
            }
            if (TBMiniLiveFloatController.o(TBMiniLiveFloatController.this) != null) {
                TBMiniLiveFloatController.o(TBMiniLiveFloatController.this).a(new HashMap());
            }
            TBMiniLiveFloatController.this.A("close");
            if (TBMiniLiveFloatController.p(TBMiniLiveFloatController.this) != null) {
                TBMiniLiveFloatController.p(TBMiniLiveFloatController.this).c();
            }
            obu.b(TBMiniLiveFloatController.q(TBMiniLiveFloatController.this), "Close", TBMiniLiveFloatController.r(TBMiniLiveFloatController.this), TBMiniLiveFloatController.s(TBMiniLiveFloatController.this));
            if (view != null && view.getContext() != null) {
                f3s.A(view.getContext().getApplicationContext());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class c implements TBMiniLiveFloatingVideoView.OnJumpLiveRoomListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // com.taobao.android.miniLive.sdk.TBMiniLiveFloatingVideoView.OnJumpLiveRoomListener
        public void onClick(View view) {
            boolean z;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            if (TBMiniLiveFloatController.b(TBMiniLiveFloatController.this) != null) {
                w4q b = TBMiniLiveFloatController.b(TBMiniLiveFloatController.this);
                if (TBMiniLiveFloatController.c(TBMiniLiveFloatController.this) != null) {
                    z = TBMiniLiveFloatController.c(TBMiniLiveFloatController.this).isMuted();
                } else {
                    z = TBMiniLiveFloatController.t(TBMiniLiveFloatController.this);
                }
                b.h(z);
            }
            if (TBMiniLiveFloatController.u(TBMiniLiveFloatController.this) != null) {
                TBMiniLiveFloatController.u(TBMiniLiveFloatController.this).onClick(view);
            } else {
                String v = TBMiniLiveFloatController.v();
                o3s.b(v, "小窗点击事件,mediaPlayer:" + TBMiniLiveFloatController.c(TBMiniLiveFloatController.this));
                if (!(v2s.o().v() == null || TBMiniLiveFloatController.d(TBMiniLiveFloatController.this) == null)) {
                    StringBuilder sb = new StringBuilder();
                    if (!TextUtils.isEmpty(TBMiniLiveFloatController.f(TBMiniLiveFloatController.this))) {
                        sb.append(TBMiniLiveFloatController.f(TBMiniLiveFloatController.this));
                    }
                    if (TextUtils.isEmpty(sb)) {
                        sb.append(f3s.l());
                        sb.append("&id=");
                        sb.append(TBMiniLiveFloatController.g(TBMiniLiveFloatController.this));
                    }
                    if (!TextUtils.isEmpty(TBMiniLiveFloatController.r(TBMiniLiveFloatController.this)) && sb.indexOf(yj4.PARAM_ENTRY_SOURCE) == -1) {
                        sb.append("&entrySource=");
                        sb.append(TBMiniLiveFloatController.r(TBMiniLiveFloatController.this));
                    }
                    sb.append("&isLiveMute=");
                    sb.append(TBMiniLiveFloatController.t(TBMiniLiveFloatController.this));
                    if (TBMiniLiveFloatController.h(TBMiniLiveFloatController.this) && !TextUtils.isEmpty(TBMiniLiveFloatController.i(TBMiniLiveFloatController.this))) {
                        sb.append("&playViewToken=");
                        sb.append(TBMiniLiveFloatController.i(TBMiniLiveFloatController.this));
                    }
                    Bundle bundle = new Bundle();
                    if (f3s.x()) {
                        if (TBMiniLiveFloatController.c(TBMiniLiveFloatController.this) != null && TextUtils.equals(TBMiniLiveFloatController.c(TBMiniLiveFloatController.this).c(), PreloadParams.PlayerType.LIVE_ZOOM_WINDOW_TYPE)) {
                            String K = TBMiniLiveFloatController.c(TBMiniLiveFloatController.this).K();
                            String v2 = TBMiniLiveFloatController.v();
                            o3s.b(v2, "边看边买小窗，拼接playerToken实现秒开,token:" + K);
                            if (!TextUtils.isEmpty(K)) {
                                sb.append("&playerToken=");
                                sb.append(K);
                            }
                        }
                        if (TBMiniLiveFloatController.q(TBMiniLiveFloatController.this) != null) {
                            bundle.putString(yj4.PARAM_MEDIA_INFO, fkx.i(mxg.a((JSONObject) JSON.toJSON(TBMiniLiveFloatController.q(TBMiniLiveFloatController.this)))));
                        }
                        TBMiniLiveFloatController.v();
                    } else {
                        TBMiniLiveFloatController.v();
                    }
                    v2s.o().v().c(TBMiniLiveFloatController.d(TBMiniLiveFloatController.this), sb.toString(), bundle, AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL);
                }
            }
            TBMiniLiveFloatController.this.A("liveroom");
            if (TBMiniLiveFloatController.q(TBMiniLiveFloatController.this) != null) {
                obu.c(TBMiniLiveFloatController.q(TBMiniLiveFloatController.this), "FloatWindow", TBMiniLiveFloatController.r(TBMiniLiveFloatController.this), TBMiniLiveFloatController.s(TBMiniLiveFloatController.this), TBMiniLiveFloatController.j(TBMiniLiveFloatController.this));
            } else if (TBMiniLiveFloatController.k(TBMiniLiveFloatController.this) != null) {
                obu.d(TBMiniLiveFloatController.k(TBMiniLiveFloatController.this), "FloatWindow", TBMiniLiveFloatController.r(TBMiniLiveFloatController.this), TBMiniLiveFloatController.s(TBMiniLiveFloatController.this), TBMiniLiveFloatController.j(TBMiniLiveFloatController.this));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            TBMiniLiveFloatController.v();
            if (TBMiniLiveFloatController.c(TBMiniLiveFloatController.this) != null) {
                TBMiniLiveFloatController.c(TBMiniLiveFloatController.this).release();
                if (!TBMiniLiveFloatController.l(TBMiniLiveFloatController.this)) {
                    TBMiniLiveFloatController.c(TBMiniLiveFloatController.this).destroy();
                    TBMiniLiveFloatController.e(TBMiniLiveFloatController.this, null);
                }
            }
            s7t.j().i();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class e implements IMediaPlayer.i {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e() {
        }

        @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer.i
        public void onStart(IMediaPlayer iMediaPlayer) {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cb76ac0", new Object[]{this, iMediaPlayer});
            } else if (TBMiniLiveFloatController.m(TBMiniLiveFloatController.this) != ControllerStatus.destroy) {
                boolean w = TBMiniLiveFloatController.this.w();
                if (!(TBMiniLiveFloatController.b(TBMiniLiveFloatController.this) == null || iMediaPlayer == null)) {
                    w4q b = TBMiniLiveFloatController.b(TBMiniLiveFloatController.this);
                    if (iMediaPlayer.isMuted()) {
                        str = "close";
                    } else {
                        str = "open";
                    }
                    b.j(str);
                }
                if (!w) {
                    TBMiniLiveFloatController.n(TBMiniLiveFloatController.this, ControllerStatus.error);
                    TBMiniLiveFloatController.this.z();
                } else {
                    TBMiniLiveFloatController.n(TBMiniLiveFloatController.this, ControllerStatus.start);
                }
                efs.a("TBMiniLiveController", "onStart addMiniView " + w);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class f implements IMediaPlayer.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public f() {
        }

        @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer.b
        public void onCompletion(IMediaPlayer iMediaPlayer) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9b380e18", new Object[]{this, iMediaPlayer});
            } else if (TBMiniLiveFloatController.m(TBMiniLiveFloatController.this) != ControllerStatus.destroy) {
                TBMiniLiveFloatController.this.A("dismiss");
                efs.a("TBMiniLiveController", MessageID.onCompletion);
                if (TBMiniLiveFloatController.p(TBMiniLiveFloatController.this) != null) {
                    TBMiniLiveFloatController.p(TBMiniLiveFloatController.this).a();
                }
                TBMiniLiveFloatController.n(TBMiniLiveFloatController.this, ControllerStatus.pause);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class g implements IMediaPlayer.f {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public g() {
        }

        @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer.f
        public void onPause(IMediaPlayer iMediaPlayer) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e1f7bf54", new Object[]{this, iMediaPlayer});
            } else if (TBMiniLiveFloatController.m(TBMiniLiveFloatController.this) != ControllerStatus.destroy) {
                TBMiniLiveFloatController.n(TBMiniLiveFloatController.this, ControllerStatus.pause);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class h implements IMediaPlayer.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public h() {
        }

        @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer.c
        public boolean onError(IMediaPlayer iMediaPlayer, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("1e2c1ca", new Object[]{this, iMediaPlayer, new Integer(i), new Integer(i2)})).booleanValue();
            }
            if (TBMiniLiveFloatController.m(TBMiniLiveFloatController.this) == ControllerStatus.destroy) {
                return false;
            }
            TBMiniLiveFloatController.this.I(i);
            TBMiniLiveFloatController.this.A("dismiss");
            efs.a("TBMiniLiveController", "onError i = " + i + " i1 = " + i2);
            if (TBMiniLiveFloatController.p(TBMiniLiveFloatController.this) != null) {
                TBMiniLiveFloatController.p(TBMiniLiveFloatController.this).a();
            }
            TBMiniLiveFloatController.n(TBMiniLiveFloatController.this, ControllerStatus.error);
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class i implements IMediaPlayer.e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public i() {
        }

        @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer.e
        public boolean onInfo(IMediaPlayer iMediaPlayer, long j, long j2, long j3, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5622e1ba", new Object[]{this, iMediaPlayer, new Long(j), new Long(j2), new Long(j3), obj})).booleanValue();
            }
            if (j == 3) {
                TBMiniLiveFloatController.this.J();
            }
            return false;
        }
    }

    static {
        t2o.a(779092086);
        t2o.a(779092033);
        t2o.a(779092028);
    }

    public TBMiniLiveFloatController(Context context, String str, String str2, String str3, String str4, Map<String, String> map) {
        this.p = -1L;
        this.B = (WindowManager) context.getSystemService(pg1.ATOM_EXT_window);
        this.q = new RoomPlayerObserver(imy.c(str, null));
        P(context, str, str2, str3, str4, map);
        this.p = System.currentTimeMillis();
    }

    public static /* synthetic */ w4q b(TBMiniLiveFloatController tBMiniLiveFloatController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (w4q) ipChange.ipc$dispatch("f21109ab", new Object[]{tBMiniLiveFloatController});
        }
        return tBMiniLiveFloatController.s;
    }

    public static /* synthetic */ r4d c(TBMiniLiveFloatController tBMiniLiveFloatController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (r4d) ipChange.ipc$dispatch("ef5fb7e6", new Object[]{tBMiniLiveFloatController});
        }
        return tBMiniLiveFloatController.y;
    }

    public static /* synthetic */ Context d(TBMiniLiveFloatController tBMiniLiveFloatController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("1b710b88", new Object[]{tBMiniLiveFloatController});
        }
        return tBMiniLiveFloatController.f8971a;
    }

    public static /* synthetic */ r4d e(TBMiniLiveFloatController tBMiniLiveFloatController, r4d r4dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (r4d) ipChange.ipc$dispatch("7356a74", new Object[]{tBMiniLiveFloatController, r4dVar});
        }
        tBMiniLiveFloatController.y = r4dVar;
        return r4dVar;
    }

    public static /* synthetic */ String f(TBMiniLiveFloatController tBMiniLiveFloatController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4750b42f", new Object[]{tBMiniLiveFloatController});
        }
        return tBMiniLiveFloatController.e;
    }

    public static /* synthetic */ String g(TBMiniLiveFloatController tBMiniLiveFloatController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("76021e4e", new Object[]{tBMiniLiveFloatController});
        }
        return tBMiniLiveFloatController.d;
    }

    public static /* synthetic */ boolean h(TBMiniLiveFloatController tBMiniLiveFloatController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4cbc497", new Object[]{tBMiniLiveFloatController})).booleanValue();
        }
        return tBMiniLiveFloatController.n;
    }

    public static /* synthetic */ String i(TBMiniLiveFloatController tBMiniLiveFloatController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d364f28c", new Object[]{tBMiniLiveFloatController});
        }
        return tBMiniLiveFloatController.o;
    }

    public static /* synthetic */ String j(TBMiniLiveFloatController tBMiniLiveFloatController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2165cab", new Object[]{tBMiniLiveFloatController});
        }
        return tBMiniLiveFloatController.f;
    }

    public static /* synthetic */ VideoInfo k(TBMiniLiveFloatController tBMiniLiveFloatController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (VideoInfo) ipChange.ipc$dispatch("ee73ed93", new Object[]{tBMiniLiveFloatController});
        }
        tBMiniLiveFloatController.getClass();
        return null;
    }

    public static /* synthetic */ boolean l(TBMiniLiveFloatController tBMiniLiveFloatController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3bc9a49b", new Object[]{tBMiniLiveFloatController})).booleanValue();
        }
        tBMiniLiveFloatController.getClass();
        return false;
    }

    public static /* synthetic */ ControllerStatus m(TBMiniLiveFloatController tBMiniLiveFloatController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ControllerStatus) ipChange.ipc$dispatch("78b4b9bc", new Object[]{tBMiniLiveFloatController});
        }
        return tBMiniLiveFloatController.D;
    }

    public static /* synthetic */ ControllerStatus n(TBMiniLiveFloatController tBMiniLiveFloatController, ControllerStatus controllerStatus) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ControllerStatus) ipChange.ipc$dispatch("63f9ff7e", new Object[]{tBMiniLiveFloatController, controllerStatus});
        }
        tBMiniLiveFloatController.D = controllerStatus;
        return controllerStatus;
    }

    public static /* synthetic */ io9 o(TBMiniLiveFloatController tBMiniLiveFloatController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (io9) ipChange.ipc$dispatch("9f8bf672", new Object[]{tBMiniLiveFloatController});
        }
        return tBMiniLiveFloatController.l;
    }

    public static /* synthetic */ i7c p(TBMiniLiveFloatController tBMiniLiveFloatController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (i7c) ipChange.ipc$dispatch("a4595b0a", new Object[]{tBMiniLiveFloatController});
        }
        return tBMiniLiveFloatController.C;
    }

    public static /* synthetic */ SimpleLiveInfo q(TBMiniLiveFloatController tBMiniLiveFloatController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SimpleLiveInfo) ipChange.ipc$dispatch("9adf44d5", new Object[]{tBMiniLiveFloatController});
        }
        return tBMiniLiveFloatController.x;
    }

    public static /* synthetic */ String r(TBMiniLiveFloatController tBMiniLiveFloatController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("868153a", new Object[]{tBMiniLiveFloatController});
        }
        return tBMiniLiveFloatController.b;
    }

    public static /* synthetic */ String s(TBMiniLiveFloatController tBMiniLiveFloatController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("37197f59", new Object[]{tBMiniLiveFloatController});
        }
        return tBMiniLiveFloatController.c;
    }

    public static /* synthetic */ boolean t(TBMiniLiveFloatController tBMiniLiveFloatController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("93c6602c", new Object[]{tBMiniLiveFloatController})).booleanValue();
        }
        return tBMiniLiveFloatController.g;
    }

    public static /* synthetic */ View.OnClickListener u(TBMiniLiveFloatController tBMiniLiveFloatController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View.OnClickListener) ipChange.ipc$dispatch("ea094152", new Object[]{tBMiniLiveFloatController});
        }
        return tBMiniLiveFloatController.k;
    }

    public static /* synthetic */ String v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4c30efe0", new Object[0]);
        }
        return F;
    }

    public final void B(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7339fd15", new Object[]{this, str});
            return;
        }
        if (this.v == null) {
            this.v = new cyg();
        }
        this.v.b(str, this.b, this);
    }

    public String C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("826ffbcf", new Object[]{this});
        }
        return this.b;
    }

    public ControllerStatus D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ControllerStatus) ipChange.ipc$dispatch("49e9fe0f", new Object[]{this});
        }
        return this.D;
    }

    public final r4d F(PreloadParams preloadParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (r4d) ipChange.ipc$dispatch("855113c6", new Object[]{this, preloadParams});
        }
        t4q t4qVar = new t4q(preloadParams);
        t4qVar.I();
        t4qVar.z(new e());
        t4qVar.s(new f());
        t4qVar.q(new g());
        t4qVar.d(new h());
        t4qVar.f(new i());
        t4qVar.v(new a());
        return t4qVar;
    }

    public View G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("576a35e4", new Object[]{this});
        }
        TBMiniLiveFloatingVideoView tBMiniLiveFloatingVideoView = this.r;
        if (tBMiniLiveFloatingVideoView != null) {
            return tBMiniLiveFloatingVideoView;
        }
        return null;
    }

    public boolean H() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9a3f2a2f", new Object[]{this})).booleanValue();
        }
        r4d r4dVar = this.y;
        if (r4dVar == null || !r4dVar.isPlaying()) {
            return false;
        }
        return true;
    }

    public void I(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7cc7814", new Object[]{this, new Integer(i2)});
            return;
        }
        efs.a("TBMiniLiveFloatController", "onPlayerError");
        RoomPlayerObserver roomPlayerObserver = this.q;
        if (roomPlayerObserver != null) {
            roomPlayerObserver.p(i2);
        }
    }

    public void J() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b15be864", new Object[]{this});
            return;
        }
        efs.a("TBMiniLiveFloatController", "onPlayerFirstFrame");
        RoomPlayerObserver roomPlayerObserver = this.q;
        if (roomPlayerObserver != null) {
            roomPlayerObserver.q();
            r4d r4dVar = this.y;
            if (r4dVar != null) {
                this.q.E(r4dVar.b());
                this.q.I(this.y.a());
            }
        }
    }

    public final void M(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66186083", new Object[]{this, context});
        } else if (context != null) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("com.taobao.taolive.start");
            intentFilter.addAction("com.taobao.avplayer.start");
            intentFilter.addAction(NormalLiveRoomWindowImpl.ON_LIVE_CARD_START_ACTION);
            context.getApplicationContext().registerReceiver(this.u, intentFilter);
        }
    }

    public final void O() {
        String str;
        ViewParent parent;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cea116c4", new Object[]{this});
            return;
        }
        TBMiniLiveFloatingVideoView tBMiniLiveFloatingVideoView = this.r;
        if (!(tBMiniLiveFloatingVideoView == null || (parent = tBMiniLiveFloatingVideoView.getParent()) == null || !(parent instanceof ViewGroup))) {
            ((ViewGroup) parent).removeView(this.r);
        }
        WindowManager windowManager = this.B;
        if (windowManager != null) {
            windowManager.removeView(this.r);
        }
        L();
        ux9 d2 = vx9.d();
        if (d2 != null) {
            str = d2.C();
        } else {
            str = null;
        }
        sjr.g().c("com.taobao.taolive.room.float_view_add_to_live_room", null, str);
    }

    public void Q(io9 io9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e069bb6", new Object[]{this, io9Var});
        } else {
            this.l = io9Var;
        }
    }

    public void R(so9 so9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d153b76", new Object[]{this, so9Var});
        } else {
            this.m = so9Var;
        }
    }

    public void S(i7c i7cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4f929d0", new Object[]{this, i7cVar});
        } else {
            this.C = i7cVar;
        }
    }

    public void T(View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0a0aed6", new Object[]{this, onClickListener});
        } else {
            this.k = onClickListener;
        }
    }

    public void U() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("777cfc3d", new Object[]{this});
            return;
        }
        r4d r4dVar = this.y;
        if (r4dVar == null) {
            efs.a("TBMiniLiveFloating", "mediaPlayer is null");
        } else {
            r4dVar.m();
        }
    }

    public final void V() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed282294", new Object[]{this});
        } else if (this.y != null) {
            HashMap hashMap = new HashMap();
            String str = this.x.liveConfigForStream;
            if (str != null) {
                hashMap.put("__livePushControlInfo", str);
            }
            this.y.g(hashMap);
            HashMap hashMap2 = new HashMap();
            hashMap2.put("enterFloating", "1");
            this.y.g(hashMap2);
            String str2 = this.b;
            if (str2 == null) {
                str2 = "";
            }
            HashMap hashMap3 = new HashMap();
            String str3 = "entryLiveSource=" + str2 + ",videoActionType=init,vod_scenario=smallWindow";
            if (v2s.o().A() != null) {
                v2s.o().A().c("updatePlayExValue", "shop2F updatePlayExValue = " + str3);
            }
            hashMap3.put(sj4.KEY_VIDEO_UPDATE_PARAMS, str3);
            this.y.g(hashMap3);
        }
    }

    public final void W(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6bd8454", new Object[]{this, str});
            return;
        }
        if (v2s.o().A() != null) {
            cwd A = v2s.o().A();
            A.c("updatePlayExValue", "updateExpParamsWhenQuit type = " + str);
        }
        if (this.y != null) {
            if (TextUtils.equals(this.b, "liveroom") || TextUtils.equals(str, "liveroom")) {
                HashMap hashMap = new HashMap();
                hashMap.put("switchScene", "liveRoom");
                this.y.g(hashMap);
            }
            HashMap hashMap2 = new HashMap();
            hashMap2.put("enterFloating", "0");
            this.y.g(hashMap2);
        }
    }

    public void X(int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a685a45", new Object[]{this, new Integer(i2), new Integer(i3)});
            return;
        }
        TBMiniLiveFloatingVideoView tBMiniLiveFloatingVideoView = this.r;
        if (tBMiniLiveFloatingVideoView != null) {
            tBMiniLiveFloatingVideoView.updateViewPositionOffset(i2, i3);
        }
    }

    public final boolean Y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b68c6bb2", new Object[]{this})).booleanValue();
        }
        if (Build.VERSION.SDK_INT >= 26) {
            return true;
        }
        return false;
    }

    public final boolean Z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("77142181", new Object[]{this})).booleanValue();
        }
        if (Build.VERSION.SDK_INT >= 24) {
            return true;
        }
        try {
            ContextCompat.checkSelfPermission(this.f8971a.getApplicationContext(), "android.permission.SYSTEM_ALERT_WINDOW");
        } catch (NoSuchMethodError unused) {
        }
        return false;
    }

    @Override // com.taobao.android.miniLive.sdk.TBMiniLiveFloatingVideoView.h
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77c4c446", new Object[]{this});
        } else {
            L();
        }
    }

    @Override // tb.cyg.b
    public void onError(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb5434c", new Object[]{this, obj});
            return;
        }
        this.x = null;
        this.t = false;
        z();
        efs.a("TBLiveService", "network onError");
    }

    @Override // com.taobao.android.miniLive.sdk.TBMiniLiveFloatingVideoView.h
    public void onMuteBtnClick(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c77e069", new Object[]{this, new Boolean(z)});
            return;
        }
        this.g = z;
        w4q w4qVar = this.s;
        if (w4qVar != null) {
            w4qVar.k(z);
        }
        so9 so9Var = this.m;
        if (so9Var != null) {
            so9Var.a(z);
        }
    }

    @Override // tb.cyg.b
    public void onSuccess(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea580ec7", new Object[]{this, obj});
            return;
        }
        efs.a("TBLiveService", "TBMiniLiveFloatController onSuccess");
        if (this.B == null) {
            z();
            return;
        }
        if (this.r != null && (obj instanceof SimpleLiveInfo)) {
            SimpleLiveInfo simpleLiveInfo = (SimpleLiveInfo) obj;
            this.x = simpleLiveInfo;
            if (simpleLiveInfo.roomStatus == 1 && simpleLiveInfo.streamStatus == 1) {
                y(this.f8971a);
            } else {
                z();
                return;
            }
        }
        this.t = false;
    }

    public boolean w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e6e00968", new Object[]{this})).booleanValue();
        }
        if (vx9.d() != null && ejr.e() && up6.u0(vx9.d()) && up6.z0(vx9.d())) {
            efs.a(F, "addMiniView isUserCloseSmallWindow");
            return false;
        } else if (this.z) {
            efs.a(F, "addMiniView isAdded = true");
            return true;
        } else {
            this.z = true;
            if (!(this.B == null || this.D == ControllerStatus.destroy)) {
                try {
                    this.A = SystemClock.uptimeMillis();
                    this.B.addView(this.r, this.w);
                    K();
                    SimpleLiveInfo simpleLiveInfo = this.x;
                    if (simpleLiveInfo != null) {
                        obu.f(simpleLiveInfo, "Show-FloatWindow", this.b, this.c, this.f);
                    }
                    i7c i7cVar = this.C;
                    if (i7cVar != null) {
                        i7cVar.b();
                    }
                    efs.a(F, "addMiniView");
                    return true;
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
            return false;
        }
    }

    public final void x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3e89f37", new Object[]{this});
        } else if (this.s != null) {
            if ("shop".equals(this.b)) {
                this.s.r("shop2F_bigcard");
            } else if ("detail".equals(this.b)) {
                this.s.r("Detail");
            }
            w4q w4qVar = this.s;
            w4qVar.q("TBMiniLiveFloatController_" + System.currentTimeMillis());
            SimpleLiveInfo simpleLiveInfo = this.x;
            if (simpleLiveInfo != null) {
                this.s.p(simpleLiveInfo.liveId);
                BroadcasterInfo broadcasterInfo = this.x.broadCaster;
                if (broadcasterInfo != null) {
                    this.s.n(broadcasterInfo.accountId);
                }
                this.s.t("0");
            }
        }
    }

    public final void y(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8598497c", new Object[]{this, context});
        } else if (this.x != null) {
            x();
            this.o = tfi.g();
            ufi ufiVar = new ufi();
            ufiVar.f29342a = this.o;
            PreloadParams G = new PreloadParams.a(context).c0(this.x).d0(this.p).f0(ufiVar).X(this.q).F(this.b).M(v3s.a()).O(v3s.b()).N(this.g).G();
            if (this.y == null) {
                this.y = F(G);
                V();
            }
            SimpleLiveInfo simpleLiveInfo = this.x;
            this.d = simpleLiveInfo.liveId;
            this.r.init(this.f8971a, simpleLiveInfo, this.y, E(simpleLiveInfo.landScape), this.x.landScape, this.g);
            this.r.setVideoCover(this.x.coverImg);
            if (this.x.roomStatus == 1) {
                U();
            }
        }
    }

    public void z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        A("dismiss");
        try {
            this.D = ControllerStatus.destroy;
            cyg cygVar = this.v;
            if (cygVar != null) {
                cygVar.c(true);
            }
            TBMiniLiveFloatingVideoView tBMiniLiveFloatingVideoView = this.r;
            if (tBMiniLiveFloatingVideoView != null) {
                WindowManager windowManager = this.B;
                if (windowManager != null) {
                    try {
                        windowManager.removeView(tBMiniLiveFloatingVideoView);
                        L();
                    } catch (Exception unused) {
                    }
                    this.B = null;
                }
                this.r.destroy();
                this.r = null;
            }
            Context context = this.f8971a;
            if (context != null) {
                context.getApplicationContext().unregisterReceiver(this.u);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public final WindowManager.LayoutParams E(boolean z) {
        int i2;
        int i3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WindowManager.LayoutParams) ipChange.ipc$dispatch("c03d3b37", new Object[]{this, new Boolean(z)});
        }
        this.w = new WindowManager.LayoutParams();
        if (this.f8971a instanceof Application) {
            if (Y()) {
                this.w.type = 2038;
            } else if (Z()) {
                this.w.type = 2003;
            } else {
                this.w.type = 2005;
            }
        }
        WindowManager.LayoutParams layoutParams = this.w;
        layoutParams.format = 1;
        layoutParams.flags |= 262312;
        int h2 = iw0.h(this.f8971a);
        int e2 = iw0.e(this.f8971a);
        int a2 = iw0.a(this.f8971a, 12.0f);
        int a3 = iw0.a(this.f8971a, 84.0f);
        if (TextUtils.equals(this.b, "liveroom") || TextUtils.equals(this.b, "zoom")) {
            a2 += (f3s.q() * iw0.e(this.f8971a)) / 750;
            a3 += (f3s.p() * iw0.e(this.f8971a)) / 750;
        }
        this.w.gravity = 51;
        if (f3s.o(this.b)) {
            if (z) {
                i2 = iw0.a(this.f8971a, 175.0f);
                i3 = iw0.a(this.f8971a, 130.0f);
            } else {
                i2 = iw0.a(this.f8971a, 129.0f);
                i3 = iw0.a(this.f8971a, 228.0f);
            }
        } else if (z) {
            i2 = iw0.a(this.f8971a, 160.0f);
            i3 = iw0.a(this.f8971a, 94.0f);
        } else {
            i2 = iw0.a(this.f8971a, 96.0f);
            i3 = iw0.a(this.f8971a, 173.0f);
        }
        WindowManager.LayoutParams layoutParams2 = this.w;
        layoutParams2.width = i2;
        layoutParams2.height = i3;
        if (TextUtils.equals("top-left", this.h)) {
            this.w.x = (int) Math.max(h2 * this.i, a2);
            this.w.y = (int) Math.max(e2 * this.j, a3);
        } else if (TextUtils.equals("top-right", this.h)) {
            WindowManager.LayoutParams layoutParams3 = this.w;
            layoutParams3.x = (h2 - layoutParams3.width) - ((int) Math.max(h2 * this.i, a2));
            this.w.y = (int) Math.max(e2 * this.j, a3);
        } else if (TextUtils.equals("bottom-left", this.h)) {
            this.w.x = (int) Math.max(h2 * this.i, a2);
            WindowManager.LayoutParams layoutParams4 = this.w;
            layoutParams4.y = (e2 - layoutParams4.height) - ((int) Math.max(e2 * this.j, a3));
        } else if (TextUtils.equals("bottom-right", this.h)) {
            WindowManager.LayoutParams layoutParams5 = this.w;
            layoutParams5.x = (h2 - layoutParams5.width) - ((int) Math.max(h2 * this.i, a2));
            WindowManager.LayoutParams layoutParams6 = this.w;
            layoutParams6.y = (e2 - layoutParams6.height) - ((int) Math.max(e2 * this.j, a3));
        } else {
            WindowManager.LayoutParams layoutParams7 = this.w;
            layoutParams7.x = (h2 - layoutParams7.width) - a2;
            layoutParams7.y = (e2 - layoutParams7.height) - a3;
        }
        return this.w;
    }

    public void K() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4410e798", new Object[]{this});
        } else if (!this.E) {
            this.E = true;
            efs.a("TBMiniLiveFloatController", "onWindowAdded");
            RoomPlayerObserver roomPlayerObserver = this.q;
            if (roomPlayerObserver != null) {
                roomPlayerObserver.B(this.d);
                this.q.C("MiniLive");
                this.q.D(this.b);
                this.q.d();
            }
        }
    }

    public void L() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b97c2eb8", new Object[]{this});
        } else if (this.E) {
            this.E = false;
            efs.a("TBMiniLiveFloatController", "onWindowRemoved");
            RoomPlayerObserver roomPlayerObserver = this.q;
            if (roomPlayerObserver != null) {
                roomPlayerObserver.e();
            }
            this.k = null;
            this.l = null;
        }
    }

    public void A(String str) {
        TBMiniLiveFloatingVideoView tBMiniLiveFloatingVideoView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59589e92", new Object[]{this, str});
            return;
        }
        String str2 = F;
        efs.a(str2, "destroyMiniWindow type " + str + " mBizCode " + this.b + " isAdded " + this.z + " isGlobal false");
        this.D = ControllerStatus.destroy;
        cyg cygVar = this.v;
        if (cygVar != null) {
            cygVar.c(true);
        }
        if (this.z && (tBMiniLiveFloatingVideoView = this.r) != null) {
            if (tBMiniLiveFloatingVideoView.getParent() instanceof ViewGroup) {
                ((ViewGroup) this.r.getParent()).removeView(this.r);
            }
            this.r.removeAllViews();
            this.r.setVisibility(8);
            this.r.destroy();
            HashMap hashMap = new HashMap();
            if (v2s.o().u() != null) {
                hashMap.put("userId", v2s.o().u().getUserId());
            }
            if (this.A > 0) {
                hashMap.put("exposureTime", String.valueOf(((float) (SystemClock.uptimeMillis() - this.A)) / 1000.0f));
                hashMap.put("type", str);
                if (!TextUtils.isEmpty(this.c)) {
                    hashMap.put("algParams", this.c);
                }
                obu.a(this.b, "FloatWindowExposure", hashMap);
                this.A = 0L;
            }
        }
        W(str);
        if (TextUtils.equals("halfGoodDetail", str)) {
            O();
            return;
        }
        if (this.y != null) {
            if (TextUtils.equals(this.b, "zoom")) {
                this.y.release();
                this.y.destroy();
                this.y = null;
                s7t.j().i();
            } else if (TextUtils.equals(this.b, "liveroom")) {
                if (!TextUtils.equals(str, "liveroom")) {
                    this.y.pause();
                }
            } else if (!TextUtils.equals(str, "liveroom")) {
                this.y.pause();
                r4d r4dVar = this.y;
                if (r4dVar != null) {
                    r4dVar.release();
                    this.y.destroy();
                    this.y = null;
                }
                s7t.j().i();
            } else if (!this.n) {
                this.y.pause();
                new Handler(this.f8971a.getMainLooper()).postDelayed(new d(), 1000L);
            }
        }
        this.t = false;
        this.z = false;
    }

    public boolean N() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("811cccb", new Object[]{this})).booleanValue();
        }
        if (!ejr.e() || !up6.u0(vx9.d()) || !up6.z0(vx9.d())) {
            try {
                TBMiniLiveFloatingVideoView tBMiniLiveFloatingVideoView = this.r;
                if (tBMiniLiveFloatingVideoView != null) {
                    if (tBMiniLiveFloatingVideoView.getParent() instanceof ViewGroup) {
                        ((ViewGroup) this.r.getParent()).removeView(this.r);
                    }
                    this.r.removeAllViews();
                    this.r.setVisibility(8);
                    WindowManager windowManager = this.B;
                    if (windowManager != null) {
                        windowManager.removeView(this.r);
                    }
                    L();
                    this.r.destroy();
                    HashMap hashMap = new HashMap();
                    if (v2s.o().u() != null) {
                        hashMap.put("userId", v2s.o().u().getUserId());
                    }
                    if (this.A > 0) {
                        hashMap.put("exposureTime", String.valueOf(((float) (SystemClock.uptimeMillis() - this.A)) / 1000.0f));
                        hashMap.put("type", this.b);
                        if (!TextUtils.isEmpty(this.c)) {
                            hashMap.put("algParams", this.c);
                        }
                        obu.a(this.b, "FloatWindowExposure", hashMap);
                        this.A = 0L;
                    }
                }
                if ("shop".equals(this.b)) {
                    efs.a(F, "removeMiniView shop destroy player");
                    r4d r4dVar = this.y;
                    if (r4dVar != null) {
                        r4dVar.release();
                        this.y.destroy();
                    }
                }
                this.t = false;
                this.z = false;
                return true;
            } catch (Exception e2) {
                e2.printStackTrace();
                return false;
            }
        } else {
            efs.a("TBLiveService", "addMiniView isUserCloseSmallWindow");
            return false;
        }
    }

    public void P(Context context, String str, String str2, String str3, String str4, Map<String, String> map) {
        JSONObject d2;
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb922103", new Object[]{this, context, str, str2, str3, str4, map});
        } else if (!this.t) {
            this.t = true;
            this.f8971a = context;
            this.b = str2;
            this.c = str3;
            if (map != null) {
                if (map.containsKey(rg0.JUMP_URL)) {
                    String valueOf = String.valueOf(map.get(rg0.JUMP_URL));
                    this.e = valueOf;
                    Uri parse = Uri.parse(valueOf);
                    if (parse != null) {
                        this.f = parse.getQueryParameter("spm");
                    }
                }
                if (map.containsKey("position") && (d2 = fkx.d(String.valueOf(map.get("position")))) != null) {
                    this.h = d2.getString("style");
                    this.i = zqq.e(d2.getString("padding-x"));
                    this.j = zqq.e(d2.getString("padding-y"));
                }
                if (map.containsKey("mute")) {
                    this.g = true ^ "NONMUTE".equals(map.get("mute"));
                }
                if (map.containsKey("playType")) {
                    z = "CLICK".equals(map.get("playType"));
                }
            }
            TBMiniLiveFloatingVideoView tBMiniLiveFloatingVideoView = new TBMiniLiveFloatingVideoView(context, str2, str3);
            this.r = tBMiniLiveFloatingVideoView;
            tBMiniLiveFloatingVideoView.setFloatingVideoViewLifeCycleCallback(this);
            this.r.setClickPlay(z);
            this.r.setCloseBtnClickListener(new b());
            this.r.setOnViewClickListener(new c());
            if (TextUtils.equals(str4, pg1.ATOM_EXT_window)) {
                efs.a("TBLiveService", CommandID.setDataSource);
                B(str);
            }
            M(context);
        }
    }
}
