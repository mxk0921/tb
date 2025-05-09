package com.taobao.avplayer;

import android.app.Activity;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.Toast;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.avplayer.b;
import com.taobao.avplayer.core.model.DWStabilityData;
import com.taobao.media.DWViewUtil;
import com.taobao.media.MediaSystemUtils;
import com.taobao.mediaplay.MediaPlayControlContext;
import com.taobao.orange.OrangeConfig;
import com.taobao.tao.flexbox.layoutmanager.player.videodecide.VideoControllerManager;
import com.taobao.taobaoavsdk.AVSDKLog;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import tb.abk;
import tb.aub;
import tb.b75;
import tb.bub;
import tb.c2v;
import tb.c32;
import tb.ctb;
import tb.e75;
import tb.eub;
import tb.ew0;
import tb.feh;
import tb.fsc;
import tb.fub;
import tb.gsc;
import tb.htb;
import tb.jsc;
import tb.k95;
import tb.l95;
import tb.nj9;
import tb.otb;
import tb.psb;
import tb.qmm;
import tb.qtb;
import tb.stb;
import tb.t2o;
import tb.tfb;
import tb.ttb;
import tb.vtb;
import tb.xau;
import tb.ytb;
import tb.z5r;
import tb.z75;
import tb.zsb;
import tv.danmaku.ijk.media.player.IMediaPlayer;
import tv.danmaku.ijk.media.player.InnerStartFuncListener;
import tv.danmaku.ijk.media.player.InnerStartFuncListenerImpl;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class a implements ytb, aub, gsc {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public boolean A;
    public String B = null;
    public boolean C = true;
    public final d D;
    public final feh E;
    public boolean F;
    public InnerStartFuncListener G;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;

    /* renamed from: a  reason: collision with root package name */
    public final DWContext f10110a;
    public final FrameLayout b;
    public final DWVideoContainer c;
    public boolean d;
    public boolean e;
    public boolean f;
    public ImageView g;
    public final com.taobao.avplayer.b h;
    public final DWPlayerControlViewController i;
    public final com.taobao.mediaplay.a j;
    public DWLifecycleType k;
    public qtb l;
    public final ArrayList<ctb> m;
    public htb n;
    public boolean o;
    public boolean p;
    public String q;
    public String r;
    public int s;
    public boolean t;
    public long u;
    public long v;
    public int w;
    public boolean x;
    public boolean y;
    public boolean z;

    /* compiled from: Taobao */
    /* renamed from: com.taobao.avplayer.a$a  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class C0532a implements b.e0 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public C0532a(a aVar) {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b implements eub {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // tb.eub
        public void onVideoRecycled() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d3803834", new Object[]{this});
                return;
            }
            a.u(a.this, 0L);
            if (!a.t(a.this).j0().C()) {
                return;
            }
            if ((a.t(a.this).j0().k() == 5 || a.t(a.this).j0().k() == 8 || a.t(a.this).j0().k() == 2) && !a.this.w() && a.s(a.this) != null) {
                a.s(a.this).t();
                a.s(a.this).x();
                a.s(a.this).K();
                if (!a.a(a.this).isHiddenThumbnailPlayBtn() && !a.v(a.this)) {
                    a.s(a.this).T();
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class c implements b.f0 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c3ea132f", new Object[]{this});
                return;
            }
            a.f(a.this, false);
            if (TextUtils.isEmpty(a.a(a.this).mPlayContext.getVideoUrl()) && !a.d(a.this)) {
                a.e(a.this, true);
                a.r(a.this).L(a.q(a.this));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class d implements jsc {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(452984879);
            t2o.a(774897701);
        }

        public d() {
        }

        @Override // tb.jsc
        public void onPick(boolean z, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fcc46917", new Object[]{this, new Boolean(z), str});
                return;
            }
            a.j(a.this, z);
            a.e(a.this, false);
            if (a.k(a.this)) {
                a.m(a.this);
                a.l(a.this, false);
            }
            if (!TextUtils.isEmpty(a.a(a.this).mPlayContext.getVideoUrl()) || !TextUtils.isEmpty(a.a(a.this).getVideoToken())) {
                try {
                    a.this.w0(false);
                    a.p(a.this);
                } catch (Exception e) {
                    feh h = a.h(a.this);
                    AVSDKLog.e(h, " DWVideoUrlPickCallBack.onPick## setVideoSource error exception:" + e.getMessage());
                }
                a.n(a.this, String.valueOf(0), "");
                return;
            }
            AVSDKLog.e(a.h(a.this), " DWVideoUrlPickCallBack.onPick## can not startVideo ,  url empty");
            new Handler(Looper.getMainLooper()).post(new RunnableC0533a(str));
        }

        /* compiled from: Taobao */
        /* renamed from: com.taobao.avplayer.a$d$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
        public class RunnableC0533a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ String f10114a;

            public RunnableC0533a(String str) {
                this.f10114a = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                String str;
                String str2;
                char c;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                try {
                    if (!TextUtils.isEmpty(this.f10114a)) {
                        String str3 = this.f10114a;
                        switch (str3.hashCode()) {
                            case 1507424:
                                if (str3.equals("1001")) {
                                    c = 0;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 1507426:
                                if (str3.equals("1003")) {
                                    c = 1;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 1507427:
                                if (str3.equals("1004")) {
                                    c = 2;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 1508389:
                                if (str3.equals(e75.VIDEO_NO_COPYRIGHT_CODE)) {
                                    c = 3;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 1509346:
                                if (str3.equals(e75.VIDEO_SOP_CHECK_CODE)) {
                                    c = 4;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 1596798:
                                if (str3.equals("4002")) {
                                    c = 5;
                                    break;
                                }
                                c = 65535;
                                break;
                            default:
                                c = 65535;
                                break;
                        }
                        if (c == 0 || c == 1 || c == 2 || c == 3) {
                            a.o(a.this, true);
                        } else if (c == 4) {
                            a.o(a.this, true);
                            if (MediaSystemUtils.isApkDebuggable() && a.a(a.this) != null) {
                                Toast.makeText(a.a(a.this).getActivity(), "检测到暂无相关播放场景请求参数，请联系@香瓜进行申请", 1).show();
                            }
                        } else if (c == 5) {
                            a.o(a.this, true);
                            if (MediaSystemUtils.isApkDebuggable() && a.a(a.this) != null) {
                                Toast.makeText(a.a(a.this).getActivity(), "当前播控信息验签失败，码流被修改，请联系@良谨进行处理", 1).show();
                            }
                        }
                    }
                    a aVar = a.this;
                    String valueOf = String.valueOf(20002);
                    if (TextUtils.isEmpty(this.f10114a)) {
                        str = String.valueOf(1);
                    } else {
                        str = this.f10114a;
                    }
                    aVar.C("videoPlayMtopError", valueOf, str);
                    a aVar2 = a.this;
                    if (TextUtils.isEmpty(this.f10114a)) {
                        str2 = "";
                    } else {
                        str2 = this.f10114a;
                    }
                    a.n(aVar2, "-1", str2);
                    if (a.t(a.this) != null) {
                        a.t(a.this).a1(2000, ew0.u(this.f10114a));
                    }
                    a.f(a.this, false);
                } catch (Exception e) {
                    feh h = a.h(a.this);
                    AVSDKLog.e(h, " DWVideoUrlPickCallBack.onPick## can not startVideo , url empty and exception" + e.getMessage());
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class e implements bub {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(452984881);
            t2o.a(452985013);
        }

        public e() {
        }

        @Override // tb.bub
        public boolean isMuted() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("8b8d0a6c", new Object[]{this})).booleanValue();
            }
            return a.a(a.this).isMute();
        }

        @Override // tb.bub
        public void mute(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4254d4b4", new Object[]{this, new Boolean(z)});
                return;
            }
            a.a(a.this).mute(z);
            a.this.Y(z);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class f implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(452984882);
        }

        public f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else if (a.i(a.this) == null || !a.i(a.this).hook()) {
                if (a.a(a.this).screenType() == DWVideoScreenType.PORTRAIT_FULL_SCREEN || a.a(a.this).screenType() == DWVideoScreenType.LANDSCAPE_FULL_SCREEN) {
                    ViewGroup viewGroup = (ViewGroup) a.a(a.this).getActivity().getWindow().getDecorView();
                    if (viewGroup.getSystemUiVisibility() != 4102) {
                        viewGroup.setSystemUiVisibility(4102);
                        return;
                    }
                }
                if (!(a.a(a.this) == null || a.a(a.this).getVideo() == null || (a.a(a.this).getVideo().getVideoState() != 3 && a.a(a.this).getVideo().getVideoState() != 6))) {
                    if (a.t(a.this) != null && a.t(a.this).j0() != null) {
                        if (!(a.t(a.this) == null || a.t(a.this).j0() == null || a.t(a.this).j0().C())) {
                            return;
                        }
                    } else {
                        return;
                    }
                }
                if ((a.g(a.this) == DWLifecycleType.AFTER && a.a(a.this).isNeedBackCover()) || a.g(a.this) == DWLifecycleType.BEFORE || a.v(a.this) || a.s(a.this) == null) {
                    return;
                }
                if (!a.s(a.this).U()) {
                    a.s(a.this).O();
                    if (a.a(a.this).screenType() == DWVideoScreenType.NORMAL) {
                        a.s(a.this).p();
                        return;
                    }
                    return;
                }
                a.s(a.this).r();
            }
        }

        public /* synthetic */ f(a aVar, C0532a aVar2) {
            this();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class g implements otb {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(452984883);
            t2o.a(452985172);
        }

        public g() {
        }

        @Override // tb.otb
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9d2fc8f1", new Object[]{this});
                return;
            }
            a.this.B0();
            a.t(a.this).I0();
        }

        @Override // tb.otb
        public void b(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8f691388", new Object[]{this, new Integer(i)});
            } else if (a.t(a.this).j0() != null && a.t(a.this).j0().s() != 6 && a.t(a.this).j0().s() != 3 && a.t(a.this).j0().s() != 0) {
                a.t(a.this).j0().w(i);
            }
        }

        @Override // tb.otb
        public boolean onPlayRateChanged(float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5c1876bc", new Object[]{this, new Float(f)})).booleanValue();
            }
            if (a.t(a.this).j0() == null || a.t(a.this).j0().s() == 6 || a.t(a.this).j0().s() == 3 || a.t(a.this).j0().s() == 0) {
                return false;
            }
            a.t(a.this).j0().m0(f);
            return true;
        }

        @Override // tb.otb
        public void seekTo(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("49645829", new Object[]{this, new Integer(i)});
            } else if (a.t(a.this).j0() != null && a.t(a.this).j0().s() != 6 && a.t(a.this).j0().s() != 3 && a.t(a.this).j0().s() != 0) {
                a.t(a.this).j0().f0(i);
            }
        }

        public /* synthetic */ g(a aVar, C0532a aVar2) {
            this();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class h implements ttb {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(452984884);
            t2o.a(452985049);
        }

        public h() {
        }

        @Override // tb.ttb
        public void a(com.taobao.avplayer.player.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("27bf8fb2", new Object[]{this, aVar});
                return;
            }
            DWLifecycleType g = a.g(a.this);
            DWLifecycleType dWLifecycleType = DWLifecycleType.MID;
            if (g != dWLifecycleType) {
                if (aVar.s() == 1) {
                    a aVar2 = a.this;
                    if (aVar2.F) {
                        aVar2.n0(dWLifecycleType);
                        AVSDKLog.e(a.h(a.this), " updated and notify 12100");
                        aVar.I(null, 12100L, 0L, 0L, null);
                    }
                }
                if (!TextUtils.isEmpty(a.a(a.this).getVideoToken()) && aVar.s() == 1) {
                    a.this.n0(dWLifecycleType);
                    AVSDKLog.e(a.h(a.this), " updated and notify 12100");
                    aVar.I(null, 12100L, 0L, 0L, null);
                }
            }
        }

        public /* synthetic */ h(a aVar, C0532a aVar2) {
            this();
        }
    }

    static {
        t2o.a(452984874);
        t2o.a(452985011);
        t2o.a(452985012);
        t2o.a(774897792);
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01bb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public a(com.taobao.avplayer.DWContext r13) {
        /*
            Method dump skipped, instructions count: 594
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.avplayer.a.<init>(com.taobao.avplayer.DWContext):void");
    }

    public static /* synthetic */ DWContext a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DWContext) ipChange.ipc$dispatch("50b6649f", new Object[]{aVar});
        }
        return aVar.f10110a;
    }

    public static /* synthetic */ boolean d(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("280a549", new Object[]{aVar})).booleanValue();
        }
        return aVar.z;
    }

    public static /* synthetic */ boolean e(a aVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("599c4cf1", new Object[]{aVar, new Boolean(z)})).booleanValue();
        }
        aVar.z = z;
        return z;
    }

    public static /* synthetic */ boolean f(a aVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("41f86681", new Object[]{aVar, new Boolean(z)})).booleanValue();
        }
        aVar.t = z;
        return z;
    }

    public static /* synthetic */ DWLifecycleType g(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DWLifecycleType) ipChange.ipc$dispatch("ad7bdd5d", new Object[]{aVar});
        }
        return aVar.k;
    }

    public static /* synthetic */ feh h(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (feh) ipChange.ipc$dispatch("ba9d7533", new Object[]{aVar});
        }
        return aVar.E;
    }

    public static /* synthetic */ qtb i(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qtb) ipChange.ipc$dispatch("99e4f773", new Object[]{aVar});
        }
        return aVar.l;
    }

    public static /* synthetic */ boolean j(a aVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2730949c", new Object[]{aVar, new Boolean(z)})).booleanValue();
        }
        aVar.y = z;
        return z;
    }

    public static /* synthetic */ boolean k(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3734dcbf", new Object[]{aVar})).booleanValue();
        }
        return aVar.A;
    }

    public static /* synthetic */ boolean l(a aVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bb6f043b", new Object[]{aVar, new Boolean(z)})).booleanValue();
        }
        aVar.A = z;
        return z;
    }

    public static /* synthetic */ void m(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1aa7d3c", new Object[]{aVar});
        } else {
            aVar.V();
        }
    }

    public static /* synthetic */ void n(a aVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc673c66", new Object[]{aVar, str, str2});
        } else {
            aVar.I(str, str2);
        }
    }

    public static /* synthetic */ boolean o(a aVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("eddabc90", new Object[]{aVar, new Boolean(z)})).booleanValue();
        }
        aVar.x = z;
        return z;
    }

    public static /* synthetic */ void p(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b23be8d3", new Object[]{aVar});
        } else {
            aVar.x();
        }
    }

    public static /* synthetic */ d q(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("75f8eaa", new Object[]{aVar});
        }
        return aVar.D;
    }

    public static /* synthetic */ com.taobao.mediaplay.a r(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.mediaplay.a) ipChange.ipc$dispatch("2150281e", new Object[]{aVar});
        }
        return aVar.j;
    }

    public static /* synthetic */ DWPlayerControlViewController s(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DWPlayerControlViewController) ipChange.ipc$dispatch("46fd1b97", new Object[]{aVar});
        }
        return aVar.i;
    }

    public static /* synthetic */ com.taobao.avplayer.b t(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.avplayer.b) ipChange.ipc$dispatch("a05d5367", new Object[]{aVar});
        }
        return aVar.h;
    }

    public static /* synthetic */ long u(a aVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("67511e2a", new Object[]{aVar, new Long(j)})).longValue();
        }
        aVar.v = j;
        return j;
    }

    public static /* synthetic */ boolean v(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d62da951", new Object[]{aVar})).booleanValue();
        }
        aVar.getClass();
        return false;
    }

    public void A(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4f07861", new Object[]{this, map});
        } else {
            this.h.g0(map);
        }
    }

    public void B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("589b5c6a", new Object[]{this});
            return;
        }
        this.h.a();
        this.j.O();
    }

    public void B0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e3aad67", new Object[]{this});
        } else {
            this.h.n();
        }
    }

    public final void C0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9a4777a", new Object[]{this});
        } else if (this.v != 0) {
            this.u += System.currentTimeMillis() - this.v;
            this.w = (int) (this.w + (System.currentTimeMillis() - this.v));
            this.v = System.currentTimeMillis();
        }
    }

    public void D0(float f2, float f3, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12f6043f", new Object[]{this, new Float(f2), new Float(f3), new Integer(i), new Integer(i2)});
            return;
        }
        com.taobao.avplayer.b bVar = this.h;
        if (bVar != null) {
            bVar.c1(f2, f3, i, i2);
        }
    }

    public final void M(boolean z, Map<String, String> map) {
        boolean z2;
        boolean z3 = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("633e152d", new Object[]{this, new Boolean(z), map});
        } else if (!this.d || ((z2 = this.p) && z)) {
            feh fehVar = this.E;
            StringBuilder sb = new StringBuilder("DWHPVideoController commitVideoComplete2 12003 return by !mVideoStarted=");
            sb.append(!this.d);
            sb.append(",(mHasCommitVideoComplete && end)=");
            if (!this.p || !z) {
                z3 = false;
            }
            sb.append(z3);
            AVSDKLog.e(fehVar, sb.toString());
        } else {
            if (!z2 && z) {
                this.p = true;
            }
            if (z) {
                this.s++;
            }
            J(z, map);
            if (z) {
                this.w = 0;
            }
        }
    }

    public void N(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41f22ae", new Object[]{this, new Boolean(z)});
        } else {
            this.h.h0(z);
        }
    }

    public void O() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        E();
        com.taobao.avplayer.b bVar = this.h;
        if (bVar != null) {
            bVar.i0();
        }
        DWPlayerControlViewController dWPlayerControlViewController = this.i;
        if (dWPlayerControlViewController != null) {
            dWPlayerControlViewController.n();
        }
        ArrayList<ctb> arrayList = this.m;
        if (arrayList != null) {
            arrayList.clear();
        }
        this.j.O();
    }

    public final String P(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7e74c3f1", new Object[]{this, str});
        }
        if (str == null) {
            return null;
        }
        try {
            if (str.startsWith("http:")) {
                return z5r.g(str, true);
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    public Map<String, String> Q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("438347ba", new Object[]{this});
        }
        com.taobao.avplayer.b bVar = this.h;
        if (bVar != null) {
            return bVar.k0();
        }
        return null;
    }

    public long S() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fe4a14ca", new Object[]{this})).longValue();
        }
        return this.u;
    }

    public String T() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4bd55545", new Object[]{this});
        }
        com.taobao.avplayer.b bVar = this.h;
        if (bVar != null) {
            return bVar.l0();
        }
        return null;
    }

    public View U() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("576a35e4", new Object[]{this});
        }
        return this.b;
    }

    public final void V() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c1a261c", new Object[]{this});
        } else if (this.f10110a.mPlayContext.getVideoUrl() != null && !TextUtils.isEmpty(this.f10110a.mPlayContext.getVideoUrl())) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("bytes", String.valueOf(1048576));
                JSONArray jSONArray = new JSONArray();
                JSONObject jSONObject2 = new JSONObject();
                if (this.f10110a.mPlayContext.isH265()) {
                    jSONObject2.put("encodeType", "h265");
                } else {
                    jSONObject2.put("encodeType", "h264");
                }
                String videoUrl = this.f10110a.mPlayContext.getVideoUrl();
                String P = P(videoUrl);
                StringBuilder sb = new StringBuilder(100);
                if (!TextUtils.isEmpty(P)) {
                    sb.append("cdnIp=" + P);
                }
                if (!TextUtils.isEmpty(this.f10110a.getPlayToken())) {
                    if (!TextUtils.isEmpty(sb)) {
                        sb.append("&");
                    }
                    sb.append("playTokenId=" + this.f10110a.getPlayToken());
                }
                psb psbVar = this.f10110a.mConfigAdapter;
                if (psbVar != null && ((b75) psbVar).j() && this.f10110a.mPlayContext.getVideoLength() > 0 && this.f10110a.mPlayContext.getVideoLength() < 262144000 && this.f10110a.mPlayContext.getVideoLength() != Integer.MAX_VALUE && this.f10110a.mPlayContext.getVideoLength() > 0) {
                    if (!TextUtils.isEmpty(sb)) {
                        sb.append("&");
                    }
                    sb.append("videoLength=" + this.f10110a.mPlayContext.getVideoLength());
                }
                jSONObject2.put("url", ew0.b(videoUrl, sb));
                if (this.f10110a.mPlayContext.getCacheKey() != null && !TextUtils.isEmpty(this.f10110a.mPlayContext.getCacheKey())) {
                    jSONObject2.put(VideoControllerManager.KEY_CACHEKEY, this.f10110a.mPlayContext.getCacheKey());
                }
                jSONArray.put(jSONObject2);
                jSONObject.put("videoInfoList", jSONArray);
                qmm.h(this.f10110a.getActivity(), jSONObject);
            } catch (JSONException unused) {
            }
        }
    }

    public void W(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f691388", new Object[]{this, new Integer(i)});
        } else {
            this.h.b(i);
        }
    }

    public boolean X() {
        com.taobao.avplayer.player.a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9a3f2a2f", new Object[]{this})).booleanValue();
        }
        com.taobao.avplayer.b bVar = this.h;
        if (bVar == null || (aVar = (com.taobao.avplayer.player.a) bVar.j0()) == null) {
            return false;
        }
        return aVar.isPlaying();
    }

    public void Y(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4254d4b4", new Object[]{this, new Boolean(z)});
            return;
        }
        this.h.u0(z);
        htb htbVar = this.n;
        if (htbVar != null) {
            htbVar.onMutedChange(z);
        }
        y0(!z);
    }

    public final void Z(DWLifecycleType dWLifecycleType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d483adc", new Object[]{this, dWLifecycleType});
            return;
        }
        Iterator<ctb> it = this.m.iterator();
        while (it.hasNext()) {
            it.next().onLifecycleChanged(dWLifecycleType);
        }
    }

    @Override // tb.gsc
    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d4e1dfdf", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // tb.gsc
    public boolean c(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fe89394e", new Object[]{this, new Integer(i), new Integer(i2)})).booleanValue();
        }
        feh fehVar = this.E;
        AVSDKLog.e(fehVar, ", onMediaRetry what：" + i);
        String videoDefinition = this.f10110a.mPlayContext.getVideoDefinition();
        if (!TextUtils.isEmpty(videoDefinition) && videoDefinition.contains("266")) {
            return b0(i, i2);
        }
        if ((i != -5 && i != -110) || !this.C) {
            return false;
        }
        this.C = false;
        return a0(i, i2);
    }

    public void c0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf67322c", new Object[]{this});
        } else {
            this.h.pauseVideo();
        }
    }

    public void d0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4075d2ae", new Object[]{this});
        } else {
            this.h.playVideo();
        }
    }

    public void e0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f50cd26", new Object[]{this});
            return;
        }
        psb psbVar = this.f10110a.mConfigAdapter;
        String str = "";
        if (psbVar != null) {
            str = ((b75) psbVar).getConfig("DWInteractive", e75.ORANGE_DISABLE_PRELOAD_BIZCODE, str);
        }
        if (!ew0.n(this.f10110a.mFrom, str)) {
            if (this.f) {
                this.f = false;
                this.z = true;
                this.j.L(this.D);
            }
            feh fehVar = this.E;
            AVSDKLog.e(fehVar, "HDR prepareToFirstFrame videoID " + this.f10110a.mPlayContext.mVideoId + " videoIsHDR " + this.f10110a.mPlayContext.getVideoIsHDR());
            if (!this.f10110a.mPlayContext.getVideoIsHDR()) {
                this.h.x0();
            }
        }
    }

    public void f0(ctb ctbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbffd053", new Object[]{this, ctbVar});
        } else if (!this.m.contains(ctbVar)) {
            this.m.add(ctbVar);
        }
    }

    public final void g0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5116570c", new Object[]{this});
        } else {
            ((com.taobao.avplayer.player.a) this.h.j0()).w1(new h(this, null));
        }
    }

    public void h0(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49645829", new Object[]{this, new Integer(i)});
        } else {
            this.h.seekTo(i);
        }
    }

    public void i0(int i, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81c54c69", new Object[]{this, new Integer(i), new Boolean(z), new Boolean(z2)});
        } else {
            this.h.z0(i, z, z2);
        }
    }

    public void j0(nj9 nj9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2ed34d3", new Object[]{this, nj9Var});
            return;
        }
        com.taobao.avplayer.b bVar = this.h;
        if (bVar != null) {
            bVar.A0(nj9Var);
        }
    }

    public void k0(int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8950038a", new Object[]{this, new Integer(i), new Boolean(z)});
            return;
        }
        com.taobao.avplayer.b bVar = this.h;
        if (bVar != null) {
            bVar.B0(i, z);
        }
    }

    public void l0(htb htbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46bb02b4", new Object[]{this, htbVar});
        } else {
            this.n = htbVar;
        }
    }

    public void m0(fub fubVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba7375c5", new Object[]{this, fubVar});
        } else {
            this.h.C0(fubVar);
        }
    }

    public final void n0(DWLifecycleType dWLifecycleType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d99848d", new Object[]{this, dWLifecycleType});
            return;
        }
        this.k = dWLifecycleType;
        Z(dWLifecycleType);
        if (this.k == DWLifecycleType.MID) {
            feh fehVar = this.E;
            AVSDKLog.e(fehVar, ", setLifecycleType " + dWLifecycleType + ", true");
            y0(true);
            return;
        }
        feh fehVar2 = this.E;
        AVSDKLog.e(fehVar2, ", setLifecycleType " + dWLifecycleType + ", false");
        y0(false);
    }

    public void o0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e160672", new Object[]{this, new Boolean(z)});
            return;
        }
        com.taobao.avplayer.b bVar = this.h;
        if (bVar != null) {
            bVar.E0(z);
        }
    }

    @Override // tb.aub
    public void onLoopCompletion() {
        com.taobao.avplayer.b bVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a22ee66", new Object[]{this});
            return;
        }
        F();
        this.d = false;
        this.H = false;
        if (!this.f10110a.mPauseInBackground || (bVar = this.h) == null || !bVar.j0().B()) {
            this.q = l95.b(this.f10110a.getUserInfoAdapter().getUserId(), this.f10110a.getUserInfoAdapter().getDeviceId());
            this.p = false;
            H(null, true);
            L();
            this.v = System.currentTimeMillis();
        }
    }

    @Override // tb.ytb
    public void onVideoClose() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24db3403", new Object[]{this});
            return;
        }
        this.d = false;
        this.H = false;
    }

    @Override // tb.ytb
    public void onVideoComplete() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3c2c53c", new Object[]{this});
            return;
        }
        F();
        this.d = false;
        this.H = false;
        n0(DWLifecycleType.MID_END);
        DWLifecycleType dWLifecycleType = DWLifecycleType.AFTER;
        this.k = dWLifecycleType;
        n0(dWLifecycleType);
        DWPlayerControlViewController dWPlayerControlViewController = this.i;
        if (dWPlayerControlViewController != null) {
            dWPlayerControlViewController.K();
        }
    }

    @Override // tb.ytb
    public void onVideoError(Object obj, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7a1a1cf", new Object[]{this, obj, new Integer(i), new Integer(i2)});
            return;
        }
        C("videoPlay", String.valueOf(i), String.valueOf(i2));
        DWLifecycleType dWLifecycleType = DWLifecycleType.AFTER;
        this.k = dWLifecycleType;
        n0(dWLifecycleType);
        DWPlayerControlViewController dWPlayerControlViewController = this.i;
        if (dWPlayerControlViewController != null) {
            dWPlayerControlViewController.K();
        }
    }

    @Override // tb.ytb
    public void onVideoInfo(Object obj, long j, long j2, long j3, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59f3ed73", new Object[]{this, obj, new Long(j), new Long(j2), new Long(j3), obj2});
        } else if (3 == j && (obj2 instanceof Map)) {
            this.F = true;
            try {
                K((Map) obj2);
            } catch (Exception unused) {
            }
        }
    }

    @Override // tb.ytb
    public void onVideoPlay() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("931007b7", new Object[]{this});
            return;
        }
        DWVideoContainer dWVideoContainer = this.c;
        if (dWVideoContainer != null) {
            dWVideoContainer.initGesture();
        }
        this.v = System.currentTimeMillis();
        DWPlayerControlViewController dWPlayerControlViewController = this.i;
        if (dWPlayerControlViewController != null) {
            dWPlayerControlViewController.x();
            this.i.J();
            if (this.i.A()) {
                this.i.v();
            }
        }
    }

    @Override // tb.ytb
    public void onVideoPrepared(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3faee61c", new Object[]{this, obj});
        } else {
            this.v = System.currentTimeMillis();
        }
    }

    @Override // tb.ytb
    public void onVideoProgressChanged(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91a8a811", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
            return;
        }
        if (this.v != 0) {
            this.u += System.currentTimeMillis() - this.v;
            this.w = (int) (this.w + (System.currentTimeMillis() - this.v));
        }
        this.v = System.currentTimeMillis();
    }

    @Override // tb.ytb
    public void onVideoScreenChanged(DWVideoScreenType dWVideoScreenType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84bd1066", new Object[]{this, dWVideoScreenType});
        } else if (dWVideoScreenType != DWVideoScreenType.NORMAL) {
            this.c.setAlpha(1.0f);
        }
    }

    @Override // tb.ytb
    public void onVideoSeekTo(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd6694ad", new Object[]{this, new Integer(i)});
        }
    }

    @Override // tb.ytb
    public void onVideoStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2b2d56d", new Object[]{this});
            return;
        }
        DWPlayerControlViewController dWPlayerControlViewController = this.i;
        if (dWPlayerControlViewController != null) {
            dWPlayerControlViewController.J();
        }
        DWVideoContainer dWVideoContainer = this.c;
        if (dWVideoContainer != null) {
            dWVideoContainer.initGesture();
        }
        this.q = l95.b(this.f10110a.getUserInfoAdapter().getUserId(), this.f10110a.getUserInfoAdapter().getDeviceId());
        this.p = false;
        H(null, true);
        L();
        this.v = System.currentTimeMillis();
        D();
    }

    public void p0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5cac726", new Object[]{this, new Boolean(z)});
            return;
        }
        com.taobao.avplayer.b bVar = this.h;
        if (bVar != null) {
            bVar.G0(z);
        }
    }

    public void q0(float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b5e4523", new Object[]{this, new Float(f2)});
            return;
        }
        c32 j0 = this.h.j0();
        if (j0 != null && j0.s() != 6 && j0.s() != 3 && j0.s() != 0) {
            j0.m0(f2);
        }
    }

    public void r0(qtb qtbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc1ec190", new Object[]{this, qtbVar});
            return;
        }
        this.l = qtbVar;
        FrameLayout frameLayout = this.b;
        if (frameLayout != null) {
            frameLayout.setOnClickListener(new f(this, null));
        }
    }

    public void s0(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a58b880", new Object[]{this, new Integer(i)});
            return;
        }
        DWVideoContainer dWVideoContainer = this.c;
        if (dWVideoContainer != null) {
            dWVideoContainer.setBackgroundColor(i);
        }
    }

    public void t0(boolean z) {
        DWContext dWContext;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("127f99d0", new Object[]{this, new Boolean(z)});
            return;
        }
        if (!(!z || (dWContext = this.f10110a) == null || dWContext.getVideo() == null)) {
            this.f10110a.getVideo().g(this);
        }
        com.taobao.avplayer.b bVar = this.h;
        if (bVar != null) {
            bVar.J0(z);
        }
    }

    public void u0(eub eubVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21c5800a", new Object[]{this, eubVar});
            return;
        }
        com.taobao.avplayer.b bVar = this.h;
        if (bVar != null && bVar.j0() != null) {
            this.h.j0().d0(eubVar);
        }
    }

    public void v0(fsc fscVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61d312e0", new Object[]{this, fscVar});
            return;
        }
        com.taobao.avplayer.b bVar = this.h;
        if (bVar != null && bVar.j0() != null) {
            this.h.j0().e0(fscVar);
        }
    }

    public boolean w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("10a45ecc", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public void w0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25f3b4f9", new Object[]{this, new Boolean(z)});
            return;
        }
        this.f10110a.addPlayExpUtParams(this.j.A());
        this.h.K0(this.f10110a.mPlayContext.getVideoUrl(), z);
    }

    public final void x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("282316b8", new Object[]{this});
            return;
        }
        DWContext dWContext = this.f10110a;
        if (dWContext != null && dWContext.getActivity() != null && this.b != null && this.f10110a.getDWConfigObject() != null && this.f10110a.getDWConfigObject().b() != null && !TextUtils.isEmpty(this.f10110a.getDWConfigObject().b().f()) && this.f10110a.getDWConfigObject().b().j() > 0 && this.f10110a.getDWConfigObject().b().i() > 0) {
            if ((this.f10110a.getDWConfigObject().b().m() || this.f10110a.getDWConfigObject().b().l()) && this.f10110a.getDWConfigObject().b().d() > 0 && this.f10110a.getDWConfigObject().b().c() > 0) {
                this.g = new ImageView(this.f10110a.getActivity());
                this.b.addView(this.g, 1, new FrameLayout.LayoutParams(DWViewUtil.dip2px(this.f10110a.getActivity(), this.f10110a.getDWConfigObject().b().j()), DWViewUtil.dip2px(this.f10110a.getActivity(), this.f10110a.getDWConfigObject().b().i())));
                y0(true);
            }
        }
    }

    public void x0(float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3942a77d", new Object[]{this, new Float(f2)});
            return;
        }
        com.taobao.avplayer.b bVar = this.h;
        if (bVar != null) {
            bVar.L0(f2);
        }
    }

    public final void y(DWContext dWContext, FrameLayout.LayoutParams layoutParams) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        float f2;
        float f3;
        String str;
        int i7;
        int i8;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b3f1c74", new Object[]{this, dWContext, layoutParams});
        } else if (dWContext != null && layoutParams != null && dWContext.getActivity() != null) {
            if (dWContext.screenType() == DWVideoScreenType.LANDSCAPE_FULL_SCREEN) {
                i2 = DWViewUtil.getVideoWidthInLandscape(dWContext.getActivity());
                i = DWViewUtil.getRealWithInPx(dWContext.getActivity());
            } else if (dWContext.screenType() == DWVideoScreenType.PORTRAIT_FULL_SCREEN) {
                i2 = DWViewUtil.getRealWithInPx(dWContext.getActivity());
                i = DWViewUtil.getVideoWidthInLandscape(dWContext.getActivity());
            } else {
                i2 = dWContext.mWidth;
                i = dWContext.mHeight;
            }
            float h2 = dWContext.getVideo().h() / dWContext.getVideo().m();
            float f4 = i2;
            float f5 = i;
            float f6 = f4 / f5;
            if (h2 > f6) {
                i3 = (int) (f4 / h2);
                i4 = i2;
            } else {
                i4 = (int) (f5 * h2);
                i3 = i;
            }
            DWVideoScreenType screenType = dWContext.screenType();
            DWVideoScreenType dWVideoScreenType = DWVideoScreenType.NORMAL;
            if (screenType == dWVideoScreenType) {
                i5 = dWContext.getDWConfigObject().b().j();
            } else {
                i5 = dWContext.getDWConfigObject().b().d();
            }
            if (dWContext.screenType() == dWVideoScreenType) {
                i6 = dWContext.getDWConfigObject().b().i();
            } else {
                i6 = dWContext.getDWConfigObject().b().c();
            }
            layoutParams.width = DWViewUtil.dip2px(dWContext.getActivity(), i5);
            layoutParams.height = DWViewUtil.dip2px(dWContext.getActivity(), i6);
            if (dWContext.screenType() == dWVideoScreenType) {
                f2 = dWContext.getDWConfigObject().b().g();
            } else {
                f2 = dWContext.getDWConfigObject().b().a();
            }
            if (dWContext.screenType() == dWVideoScreenType) {
                f3 = dWContext.getDWConfigObject().b().h();
            } else {
                f3 = dWContext.getDWConfigObject().b().b();
            }
            if (dWContext.screenType() == dWVideoScreenType) {
                str = dWContext.getDWConfigObject().b().k();
            } else {
                str = dWContext.getDWConfigObject().b().e();
            }
            if (f2 < 0.0f || f3 < 0.0f || f3 > 1.0f || f2 > 1.0f || TextUtils.isEmpty(str)) {
                if (dWContext.screenType() == dWVideoScreenType) {
                    i7 = DWViewUtil.dip2px(dWContext.getActivity(), 10.0f);
                } else {
                    i7 = DWViewUtil.dip2px(dWContext.getActivity(), 15.0f);
                }
                layoutParams.rightMargin = i7;
                DWVideoScreenType screenType2 = dWContext.screenType();
                Activity activity = dWContext.getActivity();
                if (screenType2 == dWVideoScreenType) {
                    i8 = DWViewUtil.dip2px(activity, 10.0f);
                } else {
                    i8 = DWViewUtil.dip2px(activity, 15.0f);
                }
                layoutParams.topMargin = i8;
                layoutParams.gravity = 53;
            } else if (str.equalsIgnoreCase("RB")) {
                layoutParams.leftMargin = (int) (i4 * f2);
                layoutParams.topMargin = (int) (i3 * f3);
                layoutParams.gravity = 51;
            } else if (str.equalsIgnoreCase("RT")) {
                layoutParams.leftMargin = (int) (i4 * f2);
                layoutParams.bottomMargin = (int) (i3 * (1.0f - f3));
                layoutParams.gravity = 83;
            } else if (str.equalsIgnoreCase("LB")) {
                layoutParams.rightMargin = (int) (i4 * (1.0f - f2));
                layoutParams.topMargin = (int) (i3 * f3);
                layoutParams.gravity = 53;
            } else if (str.equalsIgnoreCase("LT")) {
                layoutParams.rightMargin = (int) (i4 * (1.0f - f2));
                layoutParams.bottomMargin = (int) (i3 * (1.0f - f3));
                layoutParams.gravity = 85;
            }
            if (h2 < f6) {
                int i9 = (i2 - i4) / 2;
                int i10 = layoutParams.gravity;
                if ((i10 & 3) == 3) {
                    layoutParams.leftMargin += i9;
                } else if ((i10 & 5) == 5) {
                    layoutParams.rightMargin += i9;
                }
            } else {
                int i11 = (i3 - i) / 2;
                int i12 = layoutParams.gravity;
                if ((i12 & 48) == 48) {
                    layoutParams.topMargin -= i11;
                } else if ((i12 & 80) == 80) {
                    layoutParams.bottomMargin -= i11;
                }
            }
        }
    }

    public final void y0(boolean z) {
        DWContext dWContext;
        zsb zsbVar;
        zsb zsbVar2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e68906", new Object[]{this, new Boolean(z)});
        } else if (this.g != null && (dWContext = this.f10110a) != null) {
            if (!z || dWContext.isFloating() || this.f10110a.isMute() || this.k != DWLifecycleType.MID || (this.f10110a.screenType() != DWVideoScreenType.NORMAL ? !this.f10110a.getDWConfigObject().b().l() : !this.f10110a.getDWConfigObject().b().m())) {
                if (this.g.getVisibility() != 8) {
                    this.g.setVisibility(8);
                }
                DWContext dWContext2 = this.f10110a;
                if (dWContext2 != null && (zsbVar = dWContext2.mDWImageAdapter) != null) {
                    ((z75) zsbVar).f(null, this.g);
                    return;
                }
                return;
            }
            if (this.g.getVisibility() != 0) {
                this.g.setVisibility(0);
            }
            DWContext dWContext3 = this.f10110a;
            if (!(dWContext3 == null || (zsbVar2 = dWContext3.mDWImageAdapter) == null)) {
                ((z75) zsbVar2).f(dWContext3.getDWConfigObject().b().f(), this.g);
            }
            y(this.f10110a, (FrameLayout.LayoutParams) this.g.getLayoutParams());
            this.g.requestLayout();
        }
    }

    public void z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a27cd7", new Object[]{this});
            return;
        }
        psb psbVar = this.f10110a.mConfigAdapter;
        String str = "";
        if (psbVar != null) {
            str = ((b75) psbVar).getConfig("DWInteractive", e75.ORANGE_DISABLE_PRELOAD_BIZCODE, str);
        }
        if (!ew0.n(this.f10110a.mFrom, str)) {
            if (this.f) {
                this.f = false;
                this.z = true;
                this.j.L(this.D);
            }
            this.h.f0();
        }
    }

    public void z0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a420d40", new Object[]{this});
            return;
        }
        if (this.G == null) {
            InnerStartFuncListenerImpl innerStartFuncListenerImpl = new InnerStartFuncListenerImpl();
            this.G = innerStartFuncListenerImpl;
            this.h.D0(innerStartFuncListenerImpl);
        }
        if ((TextUtils.isEmpty(this.f10110a.mPlayContext.getVideoUrl()) && !this.z && !this.x) || this.f) {
            this.f = false;
            this.z = true;
            this.j.L(this.D);
        }
        this.h.c();
    }

    public final void D() {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb2d4d9a", new Object[]{this});
        } else if (this.f10110a.mDWAlarmAdapter != null) {
            DWStabilityData dWStabilityData = new DWStabilityData();
            StringBuffer stringBuffer = new StringBuffer(100);
            if (this.f10110a.getVideo() != null) {
                stringBuffer.append("bizCode=");
                stringBuffer.append(this.f10110a.mFrom);
                stringBuffer.append(",videoId=");
                stringBuffer.append(this.f10110a.mVideoId);
                stringBuffer.append(",useCache=");
                com.taobao.avplayer.b bVar = this.h;
                stringBuffer.append(bVar != null ? bVar.p0() : false);
                stringBuffer.append(",hitCache=");
                com.taobao.avplayer.b bVar2 = this.h;
                stringBuffer.append(bVar2 != null ? bVar2.o0() : false);
                stringBuffer.append(",completeHitCache=");
                com.taobao.avplayer.b bVar3 = this.h;
                if (bVar3 != null) {
                    z = bVar3.n0();
                }
                stringBuffer.append(z);
                stringBuffer.append(",url=");
                stringBuffer.append(this.f10110a.mPlayContext.getVideoUrl());
                stringBuffer.append(",videoSource=");
                stringBuffer.append(this.f10110a.getVideoSource());
                stringBuffer.append(",playerType=");
                stringBuffer.append(R());
                stringBuffer.append(",usePlayManger=");
                stringBuffer.append(this.y);
                stringBuffer.append(",videoDefinition=");
                stringBuffer.append(this.f10110a.mPlayContext.getVideoDefinition());
                stringBuffer.append(",videoUrlPickDuration=0,useTBNet=");
                stringBuffer.append(String.valueOf(this.f10110a.mPlayContext.isUseTBNet()));
                stringBuffer.append(",useHardwareHevc=");
                stringBuffer.append(String.valueOf(this.f10110a.mPlayContext.isHardwareHevc()));
                stringBuffer.append(",useHardwareAvc=");
                stringBuffer.append(String.valueOf(this.f10110a.mPlayContext.isHardwareAvc()));
                stringBuffer.append(",playToken=");
                stringBuffer.append(String.valueOf(this.f10110a.getPlayToken()));
            }
            dWStabilityData.args = stringBuffer.toString();
            DWContext dWContext = this.f10110a;
            ((k95) dWContext.mDWAlarmAdapter).a(dWContext.getActivity(), "DWVideo", "videoPlay", true, dWStabilityData);
        }
    }

    public final void H(Map<String, String> map, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b1eaa62", new Object[]{this, map, new Boolean(z)});
        } else if (this.f10110a.getActivity() != null) {
            if (this.f10110a.needFirstPlayUT() || !this.H || true == z) {
                HashMap hashMap = new HashMap();
                if (!this.f10110a.isMute() || this.I) {
                    hashMap.put("wifiAuto", "false");
                } else {
                    hashMap.put("wifiAuto", "true");
                }
                hashMap.put("mute", Boolean.toString(this.f10110a.isMute()));
                if (map != null) {
                    hashMap.putAll(map);
                }
                DWContext dWContext = this.f10110a;
                if (dWContext.mUTAdapter != null && !"TBAudio".equals(dWContext.mVideoSource)) {
                    if (!this.f10110a.statInRemoveList("videoFirstPlay")) {
                        DWContext dWContext2 = this.f10110a;
                        dWContext2.mUTAdapter.a("DWVideo", "Button", "videoFirstPlay", dWContext2.getUTParams(), hashMap);
                    }
                    hashMap.putAll(this.f10110a.getUTParams());
                    Uri data = (this.f10110a.getActivity() == null || this.f10110a.getActivity().getIntent() == null) ? null : this.f10110a.getActivity().getIntent().getData();
                    if (data != null) {
                        String queryParameter = data.getQueryParameter("spm");
                        if (!TextUtils.isEmpty(queryParameter)) {
                            hashMap.put("spm-url", queryParameter);
                        }
                    }
                    hashMap.put("play_sid", this.q);
                    hashMap.put("barrage", "false");
                    hashMap.put("item", String.valueOf(this.f10110a.getShowGoodsList()));
                    hashMap.put("instance_playid", this.r);
                    hashMap.put("likes", "false");
                    hashMap.put("is_live", "0");
                    AVSDKLog.e(this.E, "DWHPVideoController commit 12002 at commitFirstPlayUT");
                    this.f10110a.mUTAdapter.b(null, null, 12002, (String) hashMap.get(xau.PROPERTY_VIDEO_ID), "", "", hashMap);
                }
                this.H = true;
                this.I = true;
            }
        }
    }

    public final void L() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b65cd2f", new Object[]{this});
        } else if (this.f10110a.needFirstPlayUT() && !this.d) {
            HashMap hashMap = new HashMap();
            if (!this.f10110a.isMute() || this.K) {
                hashMap.put("wifiAuto", "false");
            } else {
                hashMap.put("wifiAuto", "true");
            }
            hashMap.put("mute", Boolean.toString(this.f10110a.isMute()));
            DWContext dWContext = this.f10110a;
            if (dWContext.mUTAdapter != null && !"TBAudio".equals(dWContext.mVideoSource) && !this.f10110a.statInRemoveList("videoRealPlay")) {
                DWContext dWContext2 = this.f10110a;
                dWContext2.mUTAdapter.a("DWVideo", "Button", "videoRealPlay", dWContext2.getUTParams(), hashMap);
            }
            this.d = true;
            this.K = true;
        }
    }

    public final String R() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7136c49d", new Object[]{this});
        }
        DWContext dWContext = this.f10110a;
        if (dWContext == null) {
            return "";
        }
        int playerType = dWContext.mPlayContext.getPlayerType();
        if (playerType == 1) {
            return "ijkPlayer";
        }
        if (playerType != 3) {
            return "mediaPlayer";
        }
        return "taobaoPlayer";
    }

    @Override // tb.ytb
    public void onVideoPause(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee9d05f3", new Object[]{this, new Boolean(z)});
            return;
        }
        DWContext dWContext = this.f10110a;
        if (!(dWContext == null || dWContext.mUTAdapter == null || "TBAudio".equals(dWContext.mVideoSource))) {
            HashMap hashMap = new HashMap();
            if (this.f10110a.getVideo() != null) {
                hashMap.put("playTime", String.valueOf(this.u));
            }
            M(false, hashMap);
        }
        if (this.i != null) {
            if (!this.f10110a.isMute()) {
                this.i.N();
            }
            this.i.K();
        }
    }

    public void A0(String str, boolean z, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1207fd9", new Object[]{this, str, new Boolean(z), map});
            return;
        }
        if (str != null) {
            this.B = str;
        } else {
            this.B = "default";
        }
        DWContext dWContext = this.f10110a;
        dWContext.mSwitchScene = this.B;
        dWContext.mSwitchSceneTime = System.currentTimeMillis();
        HashMap hashMap = new HashMap();
        hashMap.put("switchScene", this.B);
        A(hashMap);
        C0();
        HashMap hashMap2 = new HashMap();
        if (this.f10110a.getVideo() != null) {
            hashMap2.put("completeTime", String.valueOf(this.f10110a.getVideo().getDuration()));
            hashMap2.put("playTime", String.valueOf(this.u));
        }
        this.o = true;
        this.s++;
        J(true, hashMap2);
        this.u = 0L;
        this.s = 0;
        this.o = false;
        this.q = l95.b(this.f10110a.getUserInfoAdapter().getUserId(), this.f10110a.getUserInfoAdapter().getDeviceId());
        this.r = l95.b(this.f10110a.getUserInfoAdapter().getUserId(), this.f10110a.getUserInfoAdapter().getDeviceId());
        H(null, z);
    }

    public void C(String str, String str2, String str3) {
        String str4;
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7667b8bd", new Object[]{this, str, str2, str3});
        } else if (!this.t) {
            this.t = true;
            if (this.f10110a.mDWAlarmAdapter != null) {
                DWStabilityData dWStabilityData = new DWStabilityData();
                dWStabilityData.code = str2;
                dWStabilityData.msg = str3;
                StringBuffer stringBuffer = new StringBuffer(100);
                DWContext dWContext = this.f10110a;
                if (!(dWContext == null || dWContext.getVideo() == null)) {
                    stringBuffer.append("bizCode=");
                    stringBuffer.append(this.f10110a.mFrom);
                    stringBuffer.append(",videoId=");
                    stringBuffer.append(this.f10110a.mVideoId);
                    stringBuffer.append(",useCache=");
                    com.taobao.avplayer.b bVar = this.h;
                    stringBuffer.append(bVar != null ? bVar.p0() : false);
                    stringBuffer.append(",hitCache=");
                    com.taobao.avplayer.b bVar2 = this.h;
                    stringBuffer.append(bVar2 != null ? bVar2.o0() : false);
                    stringBuffer.append(",completeHitCache=");
                    com.taobao.avplayer.b bVar3 = this.h;
                    if (bVar3 != null) {
                        z = bVar3.n0();
                    }
                    stringBuffer.append(z);
                    stringBuffer.append(",url=");
                    if (TextUtils.isEmpty(this.f10110a.mPlayContext.getVideoUrl())) {
                        str4 = "";
                    } else {
                        str4 = this.f10110a.mPlayContext.getVideoUrl();
                    }
                    stringBuffer.append(str4);
                    stringBuffer.append(",videoSource=");
                    stringBuffer.append(this.f10110a.getVideoSource());
                    stringBuffer.append(",playerType=");
                    stringBuffer.append(R());
                    stringBuffer.append(",usePlayManger=");
                    stringBuffer.append(this.y);
                    stringBuffer.append(",videoDefinition=");
                    stringBuffer.append(this.f10110a.mPlayContext.getVideoDefinition());
                    stringBuffer.append(",videoUrlPickDuration=0,useTBNet=");
                    stringBuffer.append(String.valueOf(this.f10110a.mPlayContext.isUseTBNet()));
                    stringBuffer.append(",useHardwareHevc=");
                    stringBuffer.append(String.valueOf(this.f10110a.mPlayContext.isHardwareHevc()));
                    stringBuffer.append(",useHardwareAvc=");
                    stringBuffer.append(String.valueOf(this.f10110a.mPlayContext.isHardwareAvc()));
                    stringBuffer.append(",playToken=");
                    stringBuffer.append(String.valueOf(this.f10110a.getPlayToken()));
                }
                dWStabilityData.args = stringBuffer.toString();
                DWContext dWContext2 = this.f10110a;
                stb stbVar = dWContext2.mDWAlarmAdapter;
                Activity activity = dWContext2.getActivity();
                if (TextUtils.isEmpty(str)) {
                    str = "videoPlay";
                }
                ((k95) stbVar).a(activity, "DWVideo", str, false, dWStabilityData);
            }
        }
    }

    public final void E() {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d4811e7", new Object[]{this});
        } else if (!this.f10110a.needCloseUT() || this.e) {
            feh fehVar = this.E;
            AVSDKLog.e(fehVar, "DWHPVideoController commitCloseUT 12003 return by !mDWContext.needCloseUT()=" + (true ^ this.f10110a.needCloseUT()) + ",mVideoDestroyed=" + this.e);
        } else {
            DWContext dWContext = this.f10110a;
            if (dWContext.mUTAdapter == null || "TBAudio".equals(dWContext.mVideoSource)) {
                feh fehVar2 = this.E;
                StringBuilder sb = new StringBuilder("DWHPVideoController commitCloseUT 12003 failed with mDWContext.mUTAdapter=");
                if (this.f10110a.mUTAdapter != null) {
                    z = true;
                }
                sb.append(z);
                sb.append(",!DWConstant.AUDIO_SOURCE.equals(mDWContext.mVideoSource)=");
                sb.append(!"TBAudio".equals(this.f10110a.mVideoSource));
                AVSDKLog.e(fehVar2, sb.toString());
            } else {
                HashMap hashMap = new HashMap();
                if (this.f10110a.getVideo() != null) {
                    hashMap.put("closeTime", String.valueOf(this.f10110a.getVideo().getCurrentPosition()));
                    hashMap.put("playTime", String.valueOf(this.u));
                }
                if (!this.f10110a.statInRemoveList("videoClose")) {
                    DWContext dWContext2 = this.f10110a;
                    dWContext2.mUTAdapter.a("DWVideo", "Button", "videoClose", dWContext2.getUTParams(), hashMap);
                }
                M(true, hashMap);
                this.f10110a.setNeedCloseUT(true);
            }
            this.e = true;
        }
    }

    public final void F() {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4ed336", new Object[]{this});
            return;
        }
        DWContext dWContext = this.f10110a;
        if (dWContext.mUTAdapter == null || "TBAudio".equals(dWContext.mVideoSource)) {
            feh fehVar = this.E;
            StringBuilder sb = new StringBuilder("DWHPVideoController commitCompleteUT 12003 return by (mDWContext.mUTAdapter == null)=");
            if (this.f10110a.mUTAdapter == null) {
                z = true;
            }
            sb.append(z);
            sb.append(",(DWConstant.AUDIO_SOURCE.equals(mDWContext.mVideoSource))=");
            sb.append("TBAudio".equals(this.f10110a.mVideoSource));
            AVSDKLog.e(fehVar, sb.toString());
            return;
        }
        HashMap hashMap = new HashMap();
        if (this.f10110a.getVideo() != null) {
            hashMap.put("completeTime", String.valueOf(this.f10110a.getVideo().getDuration()));
            hashMap.put("playTime", String.valueOf(this.u));
        }
        if (!this.f10110a.statInRemoveList("videoComplete")) {
            DWContext dWContext2 = this.f10110a;
            dWContext2.mUTAdapter.a("DWVideo", "Button", "videoComplete", dWContext2.getUTParams(), hashMap);
        }
        this.o = true;
        M(true, hashMap);
        this.o = false;
    }

    public void G() {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d91abe26", new Object[]{this});
            return;
        }
        feh fehVar = this.E;
        StringBuilder sb = new StringBuilder("DWHPVideoController commitEndForMultiplexing 12003 return by !mDWContext.needCloseUT()=");
        sb.append(!this.f10110a.needCloseUT());
        sb.append(",mVideoDestroyed=");
        sb.append(this.e);
        AVSDKLog.e(fehVar, sb.toString());
        if (this.f10110a.needCloseUT() && !this.e) {
            DWContext dWContext = this.f10110a;
            if (dWContext.mUTAdapter == null || "TBAudio".equals(dWContext.mVideoSource)) {
                feh fehVar2 = this.E;
                StringBuilder sb2 = new StringBuilder("DWHPVideoController commitEndForMultiplexing 12003 failed with mDWContext.mUTAdapter=");
                if (this.f10110a.mUTAdapter != null) {
                    z = true;
                }
                sb2.append(z);
                sb2.append(",!DWConstant.AUDIO_SOURCE.equals(mDWContext.mVideoSource)=");
                sb2.append(!"TBAudio".equals(this.f10110a.mVideoSource));
                AVSDKLog.e(fehVar2, sb2.toString());
                return;
            }
            HashMap hashMap = new HashMap();
            if (this.f10110a.getVideo() != null) {
                hashMap.put("closeTime", String.valueOf(this.f10110a.getVideo().getCurrentPosition()));
                hashMap.put("playTime", String.valueOf(this.u));
                hashMap.put("commitByActive", "1");
            }
            if (!this.f10110a.statInRemoveList("videoClose")) {
                DWContext dWContext2 = this.f10110a;
                dWContext2.mUTAdapter.a("DWVideo", "Button", "videoClose", dWContext2.getUTParams(), hashMap);
            }
            J(true, hashMap);
            this.f10110a.setNeedCloseUT(true);
            this.o = false;
            this.s = 0;
            this.w = 0;
            this.u = 0L;
        }
    }

    public final void I(String str, String str2) {
        vtb vtbVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("856139ee", new Object[]{this, str, str2});
        } else if (this.f10110a != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("type", String.valueOf(0));
            hashMap.put("error_code", str);
            hashMap.put("from", this.f10110a.mFrom);
            hashMap.put("playScenes", this.f10110a.mPlayScenes);
            hashMap.put("play_scenario", String.valueOf(2));
            hashMap.put("errorMsg", str2);
            Map<String, String> playExpUTParams = this.f10110a.getPlayExpUTParams();
            if (playExpUTParams != null) {
                hashMap.put("pctime", String.valueOf(ew0.u(playExpUTParams.get("pctime"))));
            }
            long currentTimeMillis = System.currentTimeMillis();
            if ((str != "0" || ((int) currentTimeMillis) % 10 < 10) && (vtbVar = this.f10110a.mUTAdapter) != null) {
                vtbVar.b("DWVideo", null, 19997, "pcservice", "", "", hashMap);
            }
        }
    }

    public final void J(boolean z, Map<String, String> map) {
        String str;
        String str2;
        Map<String, String> playExpUTParams;
        boolean z2 = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e71c6e56", new Object[]{this, new Boolean(z), map});
        } else if (this.f10110a.getActivity() != null) {
            DWContext dWContext = this.f10110a;
            if (dWContext.mUTAdapter == null || "TBAudio".equals(dWContext.mVideoSource)) {
                feh fehVar = this.E;
                StringBuilder sb = new StringBuilder("DWHPVideoController commitPlayEndInfo 12003 failed with mDWContext.mUTAdapter=");
                if (this.f10110a.mUTAdapter != null) {
                    z2 = true;
                }
                sb.append(z2);
                sb.append(",!DWConstant.AUDIO_SOURCE.equals(mDWContext.mVideoSource)=");
                sb.append(true ^ "TBAudio".equals(this.f10110a.mVideoSource));
                AVSDKLog.e(fehVar, sb.toString());
                return;
            }
            Uri data = (this.f10110a.getActivity() == null || this.f10110a.getActivity().getIntent() == null) ? null : this.f10110a.getActivity().getIntent().getData();
            if (data != null) {
                String queryParameter = data.getQueryParameter("spm");
                if (!TextUtils.isEmpty(queryParameter)) {
                    map.put("spm-url", queryParameter);
                }
            }
            int duration = this.h.getDuration();
            map.put("video_duration", String.valueOf(duration));
            if (duration < 0 || duration > 3600000) {
                feh fehVar2 = this.E;
                AVSDKLog.e(fehVar2, "get video_duration error, video_duration =" + String.valueOf(duration));
            }
            if (this.o) {
                str = "1";
            } else {
                str = "0";
            }
            map.put("complete", str);
            map.put(abk.FROM_FULL, "0");
            map.put("play_sid", this.q);
            if (z) {
                str2 = "end";
            } else {
                str2 = "pause";
            }
            map.put("play_type", str2);
            map.put("switchScene", "default");
            map.put("play_times", String.valueOf(this.s));
            map.put("instance_playid", this.r);
            map.put("duration_time", String.valueOf(this.w));
            map.put("play_token", this.f10110a.getPlayToken());
            map.put("is_live", "0");
            int i = this.w;
            if (i < 0 || i > 3600000) {
                feh fehVar3 = this.E;
                AVSDKLog.e(fehVar3, "get duration_time error, mDurationTime =" + String.valueOf(this.w) + ", mLatestTime = " + String.valueOf(this.v));
            }
            map.putAll(this.f10110a.getUTParams());
            if (z && (playExpUTParams = this.f10110a.getPlayExpUTParams()) != null) {
                int u = ew0.u(playExpUTParams.get("pctime"));
                if (u > 0) {
                    map.put("pctime", "" + u);
                }
                int u2 = ew0.u(playExpUTParams.get("pcerror"));
                map.put("pcerror", "" + u2);
                map.put("resourcePassThroughData", playExpUTParams.get("resourcePassThroughData"));
                map.put("videoPassThroughData", playExpUTParams.get("videoPassThroughData"));
            }
            AVSDKLog.e(this.E, "DWHPVideoController 12003 commit at commitPlayEndInfo");
            this.f10110a.mUTAdapter.b(null, null, IMediaPlayer.MEDIA_INFO_LIVE_DEFINIITON_AUTO_SWITCH_START, map.get(xau.PROPERTY_VIDEO_ID), c2v.getInstance().getCurrentPageName(), map.get("playTime"), map);
        }
    }

    public final void K(Map<String, Long> map) {
        DWContext dWContext;
        int i;
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("265a59a6", new Object[]{this, map});
        } else if (!this.J && (dWContext = this.f10110a) != null && dWContext.mDWAlarmAdapter != null && map != null && map.get("RENDER_END_TIME") != null && map.get("RENDER_START_TIME") != null) {
            long longValue = map.get("RENDER_END_TIME").longValue() - map.get("RENDER_START_TIME").longValue();
            if (longValue >= 10000 || longValue == 0 || i < 0) {
                DWStabilityData dWStabilityData = new DWStabilityData();
                dWStabilityData.args = String.valueOf(longValue);
                DWContext dWContext2 = this.f10110a;
                ((k95) dWContext2.mDWAlarmAdapter).a(dWContext2.getActivity(), "DWVideo", "VideoOutInTime", false, dWStabilityData);
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("player_type", R());
            hashMap.put("videoUrl", this.f10110a.mPlayContext.getVideoUrl());
            com.taobao.avplayer.b bVar = this.h;
            hashMap.put("useCache", String.valueOf(bVar != null ? bVar.p0() : false));
            com.taobao.avplayer.b bVar2 = this.h;
            hashMap.put("hitCache", String.valueOf(bVar2 != null ? bVar2.o0() : false));
            com.taobao.avplayer.b bVar3 = this.h;
            if (bVar3 != null) {
                z = bVar3.n0();
            }
            hashMap.put("completeHitCache", String.valueOf(z));
            hashMap.put("usePlayManger", String.valueOf(this.y));
            hashMap.put("videoDefinition", this.f10110a.mPlayContext.getVideoDefinition());
            hashMap.put("useTBNet", String.valueOf(this.f10110a.mPlayContext.isUseTBNet()));
            hashMap.put("useHardwareHevc", String.valueOf(this.f10110a.mPlayContext.isHardwareHevc()));
            hashMap.put("useHardwareAvc", String.valueOf(this.f10110a.mPlayContext.isHardwareAvc()));
            hashMap.put("playToken", String.valueOf(this.f10110a.getPlayToken()));
            hashMap.putAll(this.f10110a.getUTParams());
            HashMap hashMap2 = new HashMap();
            hashMap2.put("first_frame_start", Double.valueOf(map.get("RENDER_START_TIME").longValue()));
            hashMap2.put("first_frame_end", Double.valueOf(map.get("RENDER_END_TIME").longValue()));
            hashMap2.put("first_frame_render", Double.valueOf(longValue));
            ((k95) this.f10110a.mDWAlarmAdapter).b("DWVideo", "first_frame_render", hashMap, hashMap2);
            if (MediaSystemUtils.isApkDebuggable()) {
                AVSDKLog.d(tfb.MODULE_SDK_PAGE, "--->commitMediaPlayerRender:" + hashMap2.toString() + " dimensionValues:" + hashMap.toString());
            }
            this.J = true;
        }
    }

    public final boolean a0(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ccfdffe6", new Object[]{this, new Integer(i), new Integer(i2)})).booleanValue();
        }
        if (!ew0.s(OrangeConfig.getInstance().getConfig("DWInteractive", "enableRetryWhenErrorCode", "true"))) {
            return false;
        }
        String videoUrl = this.f10110a.mPlayContext.getVideoUrl();
        feh fehVar = this.E;
        AVSDKLog.e(fehVar, ", onMediaRetryForTimeOut oldUrl：" + videoUrl);
        if (TextUtils.isEmpty(videoUrl)) {
            return false;
        }
        w0(false);
        return true;
    }

    public final boolean b0(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("132ccbc8", new Object[]{this, new Integer(i), new Integer(i2)})).booleanValue();
        }
        if (!ew0.o(i, OrangeConfig.getInstance().getConfig("DWInteractive", "vvcRetryErrorLists", "[13001]"))) {
            return false;
        }
        String videoUrl = this.f10110a.mPlayContext.getVideoUrl();
        if (TextUtils.isEmpty(videoUrl)) {
            return false;
        }
        this.j.Z();
        this.j.L(this.D);
        String videoUrl2 = this.f10110a.mPlayContext.getVideoUrl();
        if (TextUtils.isEmpty(videoUrl2) || videoUrl2.equals(videoUrl)) {
            return false;
        }
        this.f10110a.mPlayContext.unselectS266OfPlay();
        MediaPlayControlContext mediaPlayControlContext = this.f10110a.mPlayContext;
        mediaPlayControlContext.setDegradeCode(i, mediaPlayControlContext.mSelectedUrlName);
        w0(false);
        return true;
    }
}
