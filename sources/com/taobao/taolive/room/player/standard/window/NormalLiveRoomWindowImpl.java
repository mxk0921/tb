package com.taobao.taolive.room.player.standard.window;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.miniLive.services.mtop.RedPacketRainResponse;
import com.taobao.taolive.room.openarchitecture.opencompontent.ability.OpenAbilityCompontentTypeEnum;
import com.taobao.taolive.room.player.standard.state.BaseStatePlayer;
import com.taobao.taolive.sdk.core.interfaces.ISmallWindowStrategy;
import java.util.HashMap;
import org.json.JSONObject;
import tb.air;
import tb.cba;
import tb.cdr;
import tb.cir;
import tb.cmc;
import tb.hgb;
import tb.htn;
import tb.i0m;
import tb.ibt;
import tb.imr;
import tb.itn;
import tb.mmr;
import tb.nqo;
import tb.o3s;
import tb.qvs;
import tb.s3c;
import tb.sjr;
import tb.so9;
import tb.sya;
import tb.t2o;
import tb.up6;
import tb.upr;
import tb.ux9;
import tb.uyg;
import tb.v2s;
import tb.vc;
import tb.vx9;
import tb.w2s;
import tb.wir;
import tb.wov;
import tb.yj4;
import tb.z3s;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class NormalLiveRoomWindowImpl implements cmc, s3c {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ON_LIVE_CARD_START_ACTION = "com.taobao.taolive.card.start";
    public static final String ON_LIVE_START_ACTION = "com.taobao.taolive.start";
    public static final String ON_VIDEO_MUTE_CHANGE_ACTION = "com.taobao.avplayer.muteStateChanged";
    public static final String ON_VIDEO_START_ACTION = "com.taobao.avplayer.start";
    public static final String TYPE_LIVE_ROOM_WINDOW_REPLAY = "replay";

    /* renamed from: a  reason: collision with root package name */
    public hgb.a f13233a;
    public final ux9 b;
    public final Context c;
    public e d;
    public com.taobao.taolive.room.player.standard.manager.a f;
    public ViewGroup i;
    public boolean k;
    public boolean l;
    public ISmallWindowStrategy m;
    public boolean g = false;
    public boolean h = true;
    public boolean j = false;
    public boolean n = false;
    public final BroadcastReceiver o = new BroadcastReceiver() { // from class: com.taobao.taolive.room.player.standard.window.NormalLiveRoomWindowImpl.2
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(AnonymousClass2 r2, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/room/player/standard/window/NormalLiveRoomWindowImpl$2");
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x005c, code lost:
            if (r10.equals("com.taobao.avplayer.muteStateChanged") == false) goto L_0x0054;
         */
        @Override // android.content.BroadcastReceiver
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void onReceive(android.content.Context r10, android.content.Intent r11) {
            /*
                r9 = this;
                r0 = 2
                r1 = 1
                r2 = 0
                com.android.alibaba.ip.runtime.IpChange r3 = com.taobao.taolive.room.player.standard.window.NormalLiveRoomWindowImpl.AnonymousClass2.$ipChange
                boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
                if (r4 == 0) goto L_0x0018
                java.lang.String r4 = "3c04d85a"
                r5 = 3
                java.lang.Object[] r5 = new java.lang.Object[r5]
                r5[r2] = r9
                r5[r1] = r10
                r5[r0] = r11
                r3.ipc$dispatch(r4, r5)
                return
            L_0x0018:
                java.lang.String r10 = r11.getAction()
                if (r10 == 0) goto L_0x00bb
                boolean r3 = android.text.TextUtils.isEmpty(r10)
                if (r3 != 0) goto L_0x00bb
                java.lang.String r3 = "isMute"
                boolean r3 = r11.getBooleanExtra(r3, r2)
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                java.lang.String r5 = "直播未销毁排查 action= "
                r4.<init>(r5)
                r4.append(r10)
                java.lang.String r5 = ",isMute = "
                r4.append(r5)
                r4.append(r3)
                java.lang.String r4 = r4.toString()
                java.lang.String r5 = "NormalLiveRoomWindowImpl"
                tb.cir.a(r5, r4)
                java.lang.String r4 = "TimeMovingPlay"
                java.lang.String r6 = "subBussinessType"
                r7 = -1
                int r8 = r10.hashCode()
                switch(r8) {
                    case -937845795: goto L_0x006a;
                    case -144023305: goto L_0x005f;
                    case 212707137: goto L_0x0056;
                    default: goto L_0x0054;
                }
            L_0x0054:
                r0 = -1
                goto L_0x0074
            L_0x0056:
                java.lang.String r8 = "com.taobao.avplayer.muteStateChanged"
                boolean r10 = r10.equals(r8)
                if (r10 != 0) goto L_0x0074
                goto L_0x0054
            L_0x005f:
                java.lang.String r0 = "com.taobao.taolive.card.start"
                boolean r10 = r10.equals(r0)
                if (r10 != 0) goto L_0x0068
                goto L_0x0054
            L_0x0068:
                r0 = 1
                goto L_0x0074
            L_0x006a:
                java.lang.String r0 = "com.taobao.avplayer.start"
                boolean r10 = r10.equals(r0)
                if (r10 != 0) goto L_0x0073
                goto L_0x0054
            L_0x0073:
                r0 = 0
            L_0x0074:
                switch(r0) {
                    case 0: goto L_0x00a5;
                    case 1: goto L_0x008f;
                    case 2: goto L_0x0078;
                    default: goto L_0x0077;
                }
            L_0x0077:
                goto L_0x00bb
            L_0x0078:
                java.lang.String r10 = r11.getStringExtra(r6)
                java.lang.String r11 = "ON_VIDEO_MUTE_CHANGE_ACTION"
                tb.cir.a(r5, r11)
                boolean r10 = r4.equals(r10)
                if (r10 != 0) goto L_0x00bb
                if (r3 != 0) goto L_0x00bb
                com.taobao.taolive.room.player.standard.window.NormalLiveRoomWindowImpl r10 = com.taobao.taolive.room.player.standard.window.NormalLiveRoomWindowImpl.this
                com.taobao.taolive.room.player.standard.window.NormalLiveRoomWindowImpl.i(r10, r2)
                goto L_0x00bb
            L_0x008f:
                java.lang.String r10 = "SubBusinessType"
                java.lang.String r10 = r11.getStringExtra(r10)
                java.lang.String r11 = "ShopSampleCard"
                boolean r10 = r11.equals(r10)
                if (r10 != 0) goto L_0x009f
                if (r3 != 0) goto L_0x00bb
            L_0x009f:
                com.taobao.taolive.room.player.standard.window.NormalLiveRoomWindowImpl r10 = com.taobao.taolive.room.player.standard.window.NormalLiveRoomWindowImpl.this
                com.taobao.taolive.room.player.standard.window.NormalLiveRoomWindowImpl.i(r10, r1)
                goto L_0x00bb
            L_0x00a5:
                java.lang.String r10 = r11.getStringExtra(r6)
                java.lang.String r11 = "ON_VIDEO_START_ACTION"
                tb.cir.a(r5, r11)
                boolean r10 = r4.equals(r10)
                if (r10 != 0) goto L_0x00bb
                if (r3 != 0) goto L_0x00bb
                com.taobao.taolive.room.player.standard.window.NormalLiveRoomWindowImpl r10 = com.taobao.taolive.room.player.standard.window.NormalLiveRoomWindowImpl.this
                com.taobao.taolive.room.player.standard.window.NormalLiveRoomWindowImpl.i(r10, r2)
            L_0x00bb:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.taobao.taolive.room.player.standard.window.NormalLiveRoomWindowImpl.AnonymousClass2.onReceive(android.content.Context, android.content.Intent):void");
        }
    };
    public final Handler e = new Handler(Looper.getMainLooper());

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements hgb.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.hgb.a
        public void onAppInBackgroud() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1c87472c", new Object[]{this});
                return;
            }
            NormalLiveRoomWindowImpl.h(NormalLiveRoomWindowImpl.this, true);
            if (!z3s.b("KEY_WINDOW_ZOOM_SWITCH", true) && !z3s.b("KEY_WINDOW_OUTSIDE_SWITCH", true) && NormalLiveRoomWindowImpl.this.f()) {
                NormalLiveRoomWindowImpl.this.p();
            }
        }

        @Override // tb.hgb.a
        public void onAppInForeground() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("111bbcb1", new Object[]{this});
            } else {
                NormalLiveRoomWindowImpl.h(NormalLiveRoomWindowImpl.this, false);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class b implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f13236a;
        public final /* synthetic */ String b;

        public b(Context context, String str) {
            this.f13236a = context;
            this.b = str;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            String a2 = wov.a(this.f13236a);
            com.taobao.taolive.room.player.standard.manager.a aVar = NormalLiveRoomWindowImpl.this.f;
            if (aVar == null || aVar.o0() != 2) {
                str = "living";
            } else {
                str = "replay";
            }
            sya syaVar = new sya(vx9.d());
            if (!(vx9.d() instanceof cdr)) {
                a2 = syaVar.d(view, a2);
            } else if (((cdr) vx9.d()).Y0()) {
                String c = syaVar.c(a2);
                if (!TextUtils.isEmpty(c)) {
                    a2 = c;
                }
            }
            if (NormalLiveRoomWindowImpl.j(NormalLiveRoomWindowImpl.this) != null) {
                NormalLiveRoomWindowImpl.j(NormalLiveRoomWindowImpl.this).onSmallWindowClick(view, a2, this.b, str);
                return;
            }
            ISmallWindowStrategy d = imr.b().d();
            if (d != null) {
                d.onSmallWindowClick(view, a2, this.b, str);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class c implements so9 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // tb.so9
        public void a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4921b3d7", new Object[]{this, new Boolean(z)});
                return;
            }
            ux9 ux9Var = NormalLiveRoomWindowImpl.this.b;
            if (ux9Var != null && (ux9Var.j() instanceof cba)) {
                ((cba) NormalLiveRoomWindowImpl.this.b.j()).n0(z);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class d implements htn {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        public void a(RedPacketRainResponse.RedPacketInfo redPacketInfo, JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a579f859", new Object[]{this, redPacketInfo, jSONObject});
            } else {
                itn.a(NormalLiveRoomWindowImpl.this.b, redPacketInfo, jSONObject);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class e implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final String f13239a;
        private final boolean b;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
        public class a implements i0m.b {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            @Override // tb.i0m.b
            public void onDenied() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("b9ed19e1", new Object[]{this});
                    return;
                }
                com.taobao.taolive.room.player.standard.manager.a aVar = NormalLiveRoomWindowImpl.this.f;
                if (aVar != null) {
                    aVar.k();
                }
            }

            @Override // tb.i0m.b
            public void onGranted() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("48392e63", new Object[]{this});
                    return;
                }
                e eVar = e.this;
                NormalLiveRoomWindowImpl.g(NormalLiveRoomWindowImpl.this, e.a(eVar), e.b(e.this));
            }
        }

        static {
            t2o.a(779093212);
        }

        public e(String str, boolean z) {
            this.f13239a = str;
            this.b = z;
        }

        public static /* synthetic */ String a(e eVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("9b5577a7", new Object[]{eVar});
            }
            return eVar.f13239a;
        }

        public static /* synthetic */ boolean b(e eVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5e4e927c", new Object[]{eVar})).booleanValue();
            }
            return eVar.b;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                i0m.b(NormalLiveRoomWindowImpl.this.c, new a());
            }
        }
    }

    static {
        t2o.a(779093206);
        t2o.a(779093204);
        t2o.a(806355016);
    }

    public NormalLiveRoomWindowImpl(ux9 ux9Var, Context context) {
        this.b = ux9Var;
        this.c = context;
        sjr.g().a(this);
        r();
    }

    public static /* synthetic */ void g(NormalLiveRoomWindowImpl normalLiveRoomWindowImpl, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a7823b", new Object[]{normalLiveRoomWindowImpl, str, new Boolean(z)});
        } else {
            normalLiveRoomWindowImpl.A(str, z);
        }
    }

    public static /* synthetic */ boolean h(NormalLiveRoomWindowImpl normalLiveRoomWindowImpl, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1344578c", new Object[]{normalLiveRoomWindowImpl, new Boolean(z)})).booleanValue();
        }
        normalLiveRoomWindowImpl.n = z;
        return z;
    }

    public static /* synthetic */ void i(NormalLiveRoomWindowImpl normalLiveRoomWindowImpl, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e56be907", new Object[]{normalLiveRoomWindowImpl, new Boolean(z)});
        } else {
            normalLiveRoomWindowImpl.m(z);
        }
    }

    public static /* synthetic */ ISmallWindowStrategy j(NormalLiveRoomWindowImpl normalLiveRoomWindowImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ISmallWindowStrategy) ipChange.ipc$dispatch("45daee8e", new Object[]{normalLiveRoomWindowImpl});
        }
        return normalLiveRoomWindowImpl.m;
    }

    public final void A(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f15887", new Object[]{this, str, new Boolean(z)});
        } else if (this.f != null) {
            if (!z(this.c, str, z)) {
                this.f.k();
            } else if (this.f.r0() != null) {
                this.f.r0().removeControllerView();
            }
        }
    }

    @Override // tb.cmc
    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e5912f8", new Object[]{this, new Boolean(z)});
            return;
        }
        this.h = z;
        if (vc.a() && vc.h(this.c)) {
            this.h = false;
        }
    }

    @Override // tb.cmc
    public void b(String str, boolean z, boolean z2, boolean z3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c725c806", new Object[]{this, str, new Boolean(z), new Boolean(z2), new Boolean(z3)});
            return;
        }
        o(str, z, n());
        this.g = false;
    }

    @Override // tb.s3c
    public String bizCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("36951559", new Object[]{this});
        }
        return "NormalLiveRoomWindowImpl";
    }

    @Override // tb.cmc
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("adee7e6f", new Object[]{this});
            return;
        }
        e eVar = this.d;
        if (eVar != null) {
            this.e.removeCallbacks(eVar);
        }
    }

    @Override // tb.cmc
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b22c8539", new Object[]{this});
        } else {
            s(this.c);
        }
    }

    @Override // tb.cmc
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96a48874", new Object[]{this});
            return;
        }
        y();
        com.taobao.taolive.room.player.standard.manager.a aVar = this.f;
        if (aVar != null && aVar.r0() != null) {
            this.f.r0().addControllerView();
        }
    }

    @Override // tb.cmc
    public boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("38cfa69b", new Object[]{this})).booleanValue();
        }
        return this.j;
    }

    public final void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6db0db07", new Object[]{this});
        } else if (wir.a().b() != null) {
            try {
                if (wir.a().b().getView() != null) {
                    wir.a().b().d();
                    wir.a().b().destroy();
                }
            } catch (Exception e2) {
                o3s.c("NormalLiveRoomWindowImpl", "destroyInternalSmallWindow error", e2);
            }
        }
    }

    public final void m(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19ff3e39", new Object[]{this, new Boolean(z)});
            return;
        }
        cir.a("NormalLiveRoomWindowImpl", "直播未销毁排查,VideoViewController destroySmallVideoViewWhenVideoStart");
        if (z || !up6.u0(this.b)) {
            l();
        }
    }

    public final boolean n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e79b1cbb", new Object[]{this})).booleanValue();
        }
        ux9 ux9Var = this.b;
        if (ux9Var == null || ux9Var.A() == null || this.b.A() == null || this.b.A().abilityCompontent == null) {
            return true;
        }
        return ((ibt) this.b.A().abilityCompontent).d(OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_MiniPlayer);
    }

    @Override // tb.s3c
    public String[] observeEvents() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("37b2602b", new Object[]{this});
        }
        return new String[]{uyg.EVENT_MEDIAPLATFORM_DISABLE_SMALLWINDOW, uyg.EVENT_MEDIAPLATFORM_ENABLE_SMALLWINDOW, uyg.EVENT_LINKLIVE_VERIFY_START, uyg.EVENT_LINKLIVE_VERIFY_END};
    }

    @Override // tb.s3c
    public String observeUniqueIdentification() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4914bdfe", new Object[]{this});
        }
        ux9 ux9Var = this.b;
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
        } else if (uyg.EVENT_MEDIAPLATFORM_DISABLE_SMALLWINDOW.equals(str)) {
            this.g = true;
        } else if (uyg.EVENT_MEDIAPLATFORM_ENABLE_SMALLWINDOW.equals(str)) {
            this.g = false;
        } else if (uyg.EVENT_LINKLIVE_VERIFY_START.equals(str)) {
            this.g = true;
        } else if (uyg.EVENT_LINKLIVE_VERIFY_END.equals(str)) {
            this.g = false;
        }
    }

    @Override // tb.cmc
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
        } else {
            this.k = true;
        }
    }

    @Override // tb.cmc
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        this.k = false;
        s(this.c);
    }

    public void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("505d6b3c", new Object[]{this});
        } else if (f()) {
            this.j = false;
            this.n = false;
            cir.a("NormalLiveRoomWindowImpl", "destroySmallWindow");
            k();
        }
    }

    public void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26f3f934", new Object[]{this});
        } else if (this.f13233a == null) {
            this.f13233a = new a();
        }
    }

    public final void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a23169a7", new Object[]{this});
        } else if (qvs.Z()) {
            if (w2s.i(this.c)) {
                o3s.b("NormalLiveRoomWindowImpl", "小窗注册前后台监听发生在activity销毁以后");
                return;
            }
            q();
            if (qvs.Z() && v2s.o().f() != null) {
                v2s.o().f().a(this.f13233a);
            }
        }
    }

    @Override // tb.cmc
    public void setSmallWindowClickListener(ISmallWindowStrategy iSmallWindowStrategy) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("707f1784", new Object[]{this, iSmallWindowStrategy});
        } else {
            this.m = iSmallWindowStrategy;
        }
    }

    public void t(com.taobao.taolive.room.player.standard.manager.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a457841", new Object[]{this, aVar});
        } else {
            this.f = aVar;
        }
    }

    public final void u(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("740dd8df", new Object[]{this, new Integer(i)});
        } else if (wir.a().b() != null && wir.a().b().getView() != null) {
            wir.a().b().getView().setVisibility(i);
            if (8 == i) {
                upr.f29549a = false;
                wir.a().b().destroy();
            }
        }
    }

    public final boolean w(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("306c4cf", new Object[]{this, str})).booleanValue();
        }
        boolean b2 = z3s.b("KEY_WINDOW_ZOOM_SWITCH", true);
        boolean b3 = z3s.b(str, false);
        if (!b2) {
            return b3;
        }
        return z3s.b(str, true);
    }

    public final void x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26bc08e4", new Object[]{this});
            return;
        }
        if (i0m.k()) {
            LocalBroadcastManager.getInstance(this.c).sendBroadcast(new Intent("com.taobao.taolive.sdk.permission.stop"));
        }
        i0m.d();
    }

    public void y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80a5607", new Object[]{this});
        } else if (this.f != null) {
            cir.a("NormalLiveRoomWindowImpl", "VideoViewController toLarge mLiveContextKey = " + this.b.p());
            BaseStatePlayer k0 = this.f.k0();
            itn.b(this.b);
            k();
            if (this.i != null) {
                ViewGroup viewGroup = (ViewGroup) k0.l0().getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(k0.l0());
                }
                ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
                if (nqo.a()) {
                    this.i.addView(k0.l0(), 0, layoutParams);
                } else if (k0.l0() != null) {
                    this.i.addView(k0.l0(), 0, layoutParams);
                }
                if (!k0.y0() && !this.f.C0()) {
                    this.f.l();
                }
                this.f.k1();
                this.j = false;
            }
        }
    }

    public final void B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb491a22", new Object[]{this});
            return;
        }
        try {
            if (this.c != null) {
                o3s.b("NormalLiveRoomWindowImpl", "解注册mExternReceiver");
                this.c.unregisterReceiver(this.o);
            }
            this.l = false;
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public final void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a34c5b32", new Object[]{this});
            return;
        }
        cir.a("NormalLiveRoomWindowImpl", "直播未销毁排查,destroySmallVideoInternal mMediaManager:" + this.f + "，mIsPagePaused:" + this.k);
        if (this.k) {
            u(8);
            com.taobao.taolive.room.player.standard.manager.a aVar = this.f;
            if (aVar != null) {
                aVar.f0(true);
            }
        }
    }

    public final void s(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88ce8cff", new Object[]{this, context});
            return;
        }
        try {
            if (context == null) {
                o3s.b("NormalLiveRoomWindowImpl", "context为null，未注册mExternReceiver");
            } else if (this.l) {
                o3s.b("NormalLiveRoomWindowImpl", "已经注册mExternReceiver，无需重复注册");
            } else {
                o3s.b("NormalLiveRoomWindowImpl", "注册mExternReceiver");
                this.l = true;
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("com.taobao.avplayer.start");
                intentFilter.addAction("com.taobao.taolive.start");
                intentFilter.addAction(ON_LIVE_CARD_START_ACTION);
                intentFilter.addAction("com.taobao.avplayer.muteStateChanged");
                context.registerReceiver(this.o, intentFilter);
            }
        } catch (Throwable th) {
            o3s.c("NormalLiveRoomWindowImpl", "注册mExternReceiver异常", th);
        }
    }

    @Override // tb.cmc
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        cir.a("NormalLiveRoomWindowImpl", "直播未销毁排查 destroy()");
        p();
        t(null);
        this.j = false;
        this.h = true;
        this.g = false;
        sjr.g().b(this);
        x();
        B();
        if (v2s.o().f() != null) {
            v2s.o().f().b(this.f13233a);
        }
        this.n = false;
    }

    public void o(String str, boolean z, boolean z2) {
        boolean canDrawOverlays;
        boolean z3 = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9bb2c5e5", new Object[]{this, str, new Boolean(z), new Boolean(z2)});
            return;
        }
        String p = this.b.p();
        cir.a("NormalLiveRoomWindowImpl", "lifeCycle stop mLiveContextKey = " + p + " id = " + str);
        com.taobao.taolive.room.player.standard.manager.a aVar = this.f;
        boolean z4 = aVar != null && aVar.I0();
        boolean z5 = this.j;
        boolean L0 = qvs.L0();
        boolean z6 = this.g;
        com.taobao.taolive.room.player.standard.manager.a aVar2 = this.f;
        if (aVar2 == null || !aVar2.C0()) {
            z3 = false;
        }
        boolean z7 = this.h;
        boolean v = v();
        cir.a("NormalLiveRoomWindowImpl", "lifeCycle stop check mLiveContextKey = " + p + " smallSettingSwitch = " + v + " enableShowSmallWindowByConfig = " + z2 + " inSmallMode = " + z5 + " mDisableSmallWindow = " + z6 + " mHasCompleted = " + z3 + " inError = " + z4 + " isSmallWindowOrange = " + L0 + " isOpenSmallWindowOnce = " + z);
        if (!z5 && !z6 && !z3 && !z4 && L0 && v && z7 && z && z2) {
            cir.a("NormalLiveRoomWindowImpl", "lifeCycle stop ShowSmallWindow mLiveContextKey = " + p);
            if (Build.VERSION.SDK_INT >= 24) {
                canDrawOverlays = Settings.canDrawOverlays(this.c);
                if (canDrawOverlays) {
                    A(str, false);
                    return;
                }
                IpChange ipChange2 = i0m.$ipChange;
                e eVar = new e(str, false);
                this.d = eVar;
                this.e.postDelayed(eVar, 500L);
                cir.a("NormalLiveRoomWindowImpl", "lifeCycle stop check smallWindow permission mLiveContextKey = " + p);
                return;
            }
            A(str, false);
        } else if (this.j) {
            o3s.b("NormalLiveRoomWindowImpl", "现在正处于小窗模式下,不主动暂停播放器");
        } else {
            com.taobao.taolive.room.player.standard.manager.a aVar3 = this.f;
            if (aVar3 != null) {
                aVar3.k();
            }
        }
    }

    public final boolean v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e2a041e8", new Object[]{this})).booleanValue();
        }
        if (!qvs.Z()) {
            return z3s.b("KEY_WINDOW_ZOOM_SWITCH", true);
        }
        boolean b2 = z3s.b("KEY_WINDOW_ZOOM_SWITCH", false);
        if (this.n) {
            o3s.b("NormalLiveRoomWindowImpl", "退后台小窗，smallSettingSwitch = " + b2);
            return w("KEY_WINDOW_OUTSIDE_SWITCH");
        }
        o3s.b("NormalLiveRoomWindowImpl", "在淘内边看边买小窗，smallSettingSwitch = " + b2);
        return w("KEY_WINDOW_INTERNAL_SWITCH");
    }

    public boolean z(Context context, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b6a70ad9", new Object[]{this, context, str, new Boolean(z)})).booleanValue();
        }
        com.taobao.taolive.room.player.standard.manager.a aVar = this.f;
        if (aVar == null) {
            return false;
        }
        BaseStatePlayer k0 = aVar.k0();
        cir.a("NormalLiveRoomWindowImpl", "VideoViewController toSmall mLiveContextKey = " + this.b.p() + "，player:" + k0);
        if (k0 != null && k0.y0()) {
            this.j = true;
            ViewGroup viewGroup = (ViewGroup) k0.l0().getParent();
            this.i = viewGroup;
            if (viewGroup != null) {
                viewGroup.removeView(k0.l0());
            }
            if (!(wir.a().b() == null || up6.c0(this.b) == null)) {
                HashMap hashMap = new HashMap();
                hashMap.put("liveSource", up6.L(this.b));
                hashMap.put("entryLiveSource", up6.r(this.b));
                hashMap.put("spm", up6.U(this.b));
                hashMap.put("trackInfo", up6.a0(this.b));
                hashMap.put(yj4.PARAM_IS_LIVE_MUTE, String.valueOf(k0.x0()));
                ux9 ux9Var = this.b;
                wir.a().b().b(context, this.f, up6.c0(this.b), z, true, hashMap, ux9Var instanceof air ? ((air) ux9Var).H0() : null);
                wir.a().b().e(new b(context, str));
            }
            mmr.p().G(new c());
            mmr.p().y(new d());
            try {
                wir.a().b().c();
                upr.f29549a = true;
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }
}
