package com.taobao.avplayer;

import android.app.Activity;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.Toast;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.avplayer.DWVideoViewController;
import com.taobao.avplayer.core.model.DWStabilityData;
import com.taobao.media.DWViewUtil;
import com.taobao.media.MediaSystemUtils;
import com.taobao.mediaplay.MediaPlayControlContext;
import com.taobao.orange.OrangeConfig;
import com.taobao.tao.flexbox.layoutmanager.player.videodecide.VideoControllerManager;
import com.taobao.taobao.R;
import com.taobao.taobaoavsdk.AVSDKLog;
import com.taobao.taobaoavsdk.CodeUsageCounter;
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
import tb.ctb;
import tb.e75;
import tb.eub;
import tb.ew0;
import tb.gsc;
import tb.htb;
import tb.i85;
import tb.jsc;
import tb.k95;
import tb.l95;
import tb.msb;
import tb.nj9;
import tb.nsb;
import tb.otb;
import tb.psb;
import tb.qmm;
import tb.qtb;
import tb.r95;
import tb.rtb;
import tb.sj4;
import tb.stb;
import tb.t2o;
import tb.tfb;
import tb.ttb;
import tb.vtb;
import tb.xau;
import tb.xsb;
import tb.ytb;
import tb.z5r;
import tb.z75;
import tb.zsb;
import tv.danmaku.ijk.media.player.IMediaPlayer;
import tv.danmaku.ijk.media.player.InnerStartFuncListener;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class f implements ytb, aub, gsc {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public boolean A;
    public boolean B;
    public boolean C;
    public final jsc D;
    public boolean E = false;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;

    /* renamed from: a  reason: collision with root package name */
    public final DWContext f10173a;
    public final FrameLayout b;
    public final DWVideoContainer c;
    public boolean d;
    public boolean e;
    public boolean f;
    public ImageView g;
    public final DWVideoViewController h;
    public final com.taobao.mediaplay.a i;
    public final DWPlayerControlViewController j;
    public final i85 k;
    public DWLifecycleType l;
    public qtb m;
    public final ArrayList<ctb> n;
    public htb o;
    public int p;
    public boolean q;
    public boolean r;
    public String s;
    public final String t;
    public int u;
    public boolean v;
    public boolean w;
    public long x;
    public long y;
    public int z;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements eub {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.eub
        public void onVideoRecycled() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d3803834", new Object[]{this});
                return;
            }
            f.d(f.this, 0L);
            if (!f.p(f.this).c0().C()) {
                return;
            }
            if ((f.p(f.this).c0().k() == 5 || f.p(f.this).c0().k() == 8 || f.p(f.this).c0().k() == 2) && !f.this.z()) {
                f.t(f.this).t();
                f.t(f.this).x();
                f.t(f.this).K();
                if (!f.u(f.this).isHiddenThumbnailPlayBtn() && !f.v(f.this)) {
                    f.t(f.this).T();
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b implements DWVideoViewController.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c3ea132f", new Object[]{this});
                return;
            }
            f.w(f.this, false);
            if (TextUtils.isEmpty(f.u(f.this).mPlayContext.getVideoUrl()) && !f.x(f.this)) {
                f.y(f.this, true);
                f.e(f.this).L(f.a(f.this));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class c implements msb {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(452984957);
            t2o.a(452985003);
        }

        public c() {
        }

        @Override // tb.msb
        public boolean a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("1e474546", new Object[]{this})).booleanValue();
            }
            if (f.p(f.this) != null) {
                return f.p(f.this).h0();
            }
            return false;
        }

        @Override // tb.msb
        public boolean b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("36e441e6", new Object[]{this})).booleanValue();
            }
            if (f.p(f.this) != null) {
                return f.p(f.this).f0();
            }
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class d implements jsc {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(452984958);
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
            f.l(f.this, z);
            f.y(f.this, false);
            if (f.m(f.this)) {
                f.o(f.this);
                f.n(f.this, false);
            }
            if (!TextUtils.isEmpty(f.u(f.this).mPlayContext.getVideoUrl()) || !TextUtils.isEmpty(f.u(f.this).getVideoToken())) {
                try {
                    f.this.D0(false);
                    f.s(f.this);
                } catch (Exception e) {
                    AVSDKLog.e(tfb.MODULE_SDK_PAGE, " DWVideoUrlPickCallBack.onPick## setVideoSource error exception:" + e.getMessage());
                }
                f.r(f.this, String.valueOf(0), "");
                return;
            }
            AVSDKLog.e(tfb.MODULE_SDK_PAGE, "DWVideoUrlPickCallBack.onPick## can not startVideo , url empty");
            if (f.q(f.this) != null) {
                f.q(f.this).post(new a(str));
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ String f10178a;

            public a(String str) {
                this.f10178a = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                String str;
                String str2;
                char c;
                boolean z;
                String str3;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                try {
                    if (!TextUtils.isEmpty(this.f10178a)) {
                        String str4 = this.f10178a;
                        switch (str4.hashCode()) {
                            case 1507424:
                                if (str4.equals("1001")) {
                                    c = 0;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 1507426:
                                if (str4.equals("1003")) {
                                    c = 1;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 1507427:
                                if (str4.equals("1004")) {
                                    c = 2;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 1508389:
                                if (str4.equals(e75.VIDEO_NO_COPYRIGHT_CODE)) {
                                    c = 3;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 1509346:
                                if (str4.equals(e75.VIDEO_SOP_CHECK_CODE)) {
                                    c = 4;
                                    break;
                                }
                                c = 65535;
                                break;
                            case 1596798:
                                if (str4.equals("4002")) {
                                    c = 5;
                                    break;
                                }
                                c = 65535;
                                break;
                            default:
                                c = 65535;
                                break;
                        }
                        if (c == 0) {
                            str3 = f.u(f.this).getActivity().getResources().getString(R.string.dw_tbavsdk_video_error_noexist);
                        } else if (c == 1) {
                            str3 = f.u(f.this).getActivity().getResources().getString(R.string.dw_tbavsdk_video_error_audit_error);
                        } else if (c == 2) {
                            str3 = f.u(f.this).getActivity().getResources().getString(R.string.dw_tbavsdk_error_io);
                        } else if (c == 3) {
                            str3 = f.u(f.this).getActivity().getResources().getString(R.string.dw_tbavsdk_video_error_for_no_copyright);
                        } else if (c == 4) {
                            str3 = f.u(f.this).getActivity().getResources().getString(R.string.dw_tbavsdk_video_sop_check_error);
                            if (MediaSystemUtils.isApkDebuggable() && f.u(f.this) != null) {
                                Toast.makeText(f.u(f.this).getActivity(), "检测到暂无相关播放场景请求参数，请联系@香瓜进行申请", 1).show();
                            }
                        } else if (c != 5) {
                            str3 = f.u(f.this).getActivity().getResources().getString(R.string.dw_tbavsdk_video_error_for_server);
                            z = true;
                            f.g(f.this, !z);
                            f.this.G0(str3, z);
                        } else {
                            str3 = f.u(f.this).getActivity().getResources().getString(R.string.dw_tbavsdk_video_error_for_server);
                            f.g(f.this, true);
                            if (MediaSystemUtils.isApkDebuggable() && f.u(f.this) != null) {
                                Toast.makeText(f.u(f.this).getActivity(), "当前播控信息验签失败，码流被修改，请联系@良谨进行处理", 1).show();
                            }
                        }
                        z = false;
                        f.g(f.this, !z);
                        f.this.G0(str3, z);
                    }
                    f fVar = f.this;
                    String valueOf = String.valueOf(20002);
                    if (TextUtils.isEmpty(this.f10178a)) {
                        str = String.valueOf(1);
                    } else {
                        str = this.f10178a;
                    }
                    fVar.G("videoPlayMtopError", valueOf, str);
                    f fVar2 = f.this;
                    if (TextUtils.isEmpty(this.f10178a)) {
                        str2 = "";
                    } else {
                        str2 = this.f10178a;
                    }
                    f.r(fVar2, "-1", str2);
                    if (f.p(f.this) != null) {
                        f.p(f.this).M0(2000, ew0.u(this.f10178a));
                    }
                    f.w(f.this, false);
                } catch (Exception e) {
                    AVSDKLog.e(tfb.MODULE_SDK_PAGE, " DWVideoUrlPickCallBack.onPick## can not startVideo , url empty and exception" + e.getMessage());
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class e implements bub {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(452984960);
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
            return f.u(f.this).isMute();
        }

        @Override // tb.bub
        public void mute(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4254d4b4", new Object[]{this, new Boolean(z)});
                return;
            }
            f.u(f.this).mute(z);
            f.this.f0(z);
        }
    }

    /* compiled from: Taobao */
    /* renamed from: com.taobao.avplayer.f$f  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class View$OnClickListenerC0537f implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(452984961);
        }

        public View$OnClickListenerC0537f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else if (f.k(f.this) == null || !f.k(f.this).hook()) {
                if (f.u(f.this).screenType() == DWVideoScreenType.PORTRAIT_FULL_SCREEN || f.u(f.this).screenType() == DWVideoScreenType.LANDSCAPE_FULL_SCREEN) {
                    ViewGroup viewGroup = (ViewGroup) f.u(f.this).getActivity().getWindow().getDecorView();
                    if (viewGroup.getSystemUiVisibility() != 4102) {
                        viewGroup.setSystemUiVisibility(4102);
                        return;
                    }
                }
                if (!(f.u(f.this) == null || f.u(f.this).getVideo() == null || (f.u(f.this).getVideo().getVideoState() != 3 && f.u(f.this).getVideo().getVideoState() != 6))) {
                    if (f.p(f.this) != null && f.p(f.this).c0() != null) {
                        if (!(f.p(f.this) == null || f.p(f.this).c0() == null || f.p(f.this).c0().C())) {
                            return;
                        }
                    } else {
                        return;
                    }
                }
                if ((f.j(f.this) == DWLifecycleType.AFTER && f.u(f.this).isNeedBackCover()) || f.j(f.this) == DWLifecycleType.BEFORE || f.v(f.this)) {
                    return;
                }
                if (f.t(f.this).U() || (f.u(f.this).mMuteDisplay && !f.u(f.this).mPlayContext.mEmbed)) {
                    f.t(f.this).q();
                } else {
                    f.t(f.this).N();
                }
            }
        }

        public /* synthetic */ View$OnClickListenerC0537f(f fVar, a aVar) {
            this();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class g implements otb {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(452984962);
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
            f.this.N0();
            f.p(f.this).w0();
        }

        @Override // tb.otb
        public void b(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8f691388", new Object[]{this, new Integer(i)});
            } else if (f.p(f.this).c0() != null && f.p(f.this).c0().s() != 6 && f.p(f.this).c0().s() != 3 && f.p(f.this).c0().s() != 0) {
                f.p(f.this).c0().w(i);
            }
        }

        @Override // tb.otb
        public boolean onPlayRateChanged(float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5c1876bc", new Object[]{this, new Float(f)})).booleanValue();
            }
            if (f.p(f.this).c0() == null || f.p(f.this).c0().s() == 6 || f.p(f.this).c0().s() == 3 || f.p(f.this).c0().s() == 0) {
                return false;
            }
            f.p(f.this).c0().m0(f);
            return true;
        }

        @Override // tb.otb
        public void seekTo(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("49645829", new Object[]{this, new Integer(i)});
            } else if (f.p(f.this).c0() != null && f.p(f.this).c0().s() != 6 && f.p(f.this).c0().s() != 3 && f.p(f.this).c0().s() != 0) {
                f.p(f.this).c0().f0(i);
            }
        }

        public /* synthetic */ g(f fVar, a aVar) {
            this();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class h implements ttb {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(452984963);
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
            DWLifecycleType j = f.j(f.this);
            DWLifecycleType dWLifecycleType = DWLifecycleType.MID;
            if (j != dWLifecycleType) {
                if (aVar.s() == 1) {
                    f fVar = f.this;
                    if (fVar.F) {
                        fVar.y0(dWLifecycleType);
                        aVar.I(null, 12100L, 0L, 0L, null);
                    }
                }
                if (!TextUtils.isEmpty(f.u(f.this).getVideoToken()) && aVar.s() == 1) {
                    f.this.y0(dWLifecycleType);
                    aVar.I(null, 12100L, 0L, 0L, null);
                }
            }
        }

        public /* synthetic */ h(f fVar, a aVar) {
            this();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class i implements DWVideoViewController.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(452984964);
            t2o.a(452984999);
        }

        public i() {
        }

        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("810347e9", new Object[]{this});
                return;
            }
            if (f.u(f.this) != null) {
                AVSDKLog.d(tfb.MODULE_SDK_PAGE, "ProcessVideoStartEvent.start##DWInstance start video ,videoUrl:" + f.u(f.this).mPlayContext.getVideoUrl());
            }
            if ((TextUtils.isEmpty(f.u(f.this).mPlayContext.getVideoUrl()) && !f.x(f.this) && !f.f(f.this)) || f.h(f.this)) {
                f.i(f.this, false);
                f.y(f.this, true);
                f.e(f.this).L(f.a(f.this));
            }
            f.t(f.this).Q();
            f.t(f.this).v();
            f.p(f.this).G0();
        }

        public /* synthetic */ i(f fVar, a aVar) {
            this();
        }
    }

    static {
        t2o.a(452984953);
        t2o.a(452985011);
        t2o.a(452985012);
        t2o.a(774897792);
    }

    public f(DWContext dWContext) {
        this.f = false;
        this.f10173a = dWContext;
        FrameLayout frameLayout = new FrameLayout(dWContext.getActivity());
        this.b = frameLayout;
        DWVideoContainer dWVideoContainer = new DWVideoContainer(dWContext);
        this.c = dWVideoContainer;
        if (dWContext.getInitScreenType() != DWVideoScreenType.NORMAL) {
            dWVideoContainer.setAlpha(0.0f);
        }
        frameLayout.addView(dWVideoContainer, new FrameLayout.LayoutParams(-1, -1, 17));
        this.n = new ArrayList<>();
        psb psbVar = dWContext.mConfigAdapter;
        int i2 = 2;
        int i3 = ew0.i(dWContext.mConfigAdapter, "DWInteractive", dWContext.mFrom, (psbVar == null || !((b75) psbVar).i()) ? 2 : 3);
        psb psbVar2 = dWContext.mConfigAdapter;
        dWContext.mPlayContext.setPlayerType((psbVar2 == null || !ew0.n(Build.MODEL, ((b75) psbVar2).getConfig("DWInteractive", e75.DEGRADE_MEDIA_DEVICE_BLACKLIST, "[\"SM-C5000\",\"TRT-AL00A\",\"TRT-AL00\"]"))) ? i3 : i2);
        DWVideoViewController dWVideoViewController = new DWVideoViewController(dWContext, dWContext.mLoop);
        this.h = dWVideoViewController;
        dWVideoViewController.q0(this);
        dWContext.mPlayContext.mBusinessId = "DWVideo";
        com.taobao.mediaplay.a aVar = new com.taobao.mediaplay.a(dWContext.mPlayContext);
        this.i = aVar;
        d dVar = new d();
        this.D = dVar;
        psb psbVar3 = dWContext.mConfigAdapter;
        if (psbVar3 != null) {
            if (((b75) psbVar3).f(dWContext.mFrom)) {
                AVSDKLog.e(tfb.MODULE_SDK_PAGE, "Do not pickVideoUrl when DW create, mLazyPickUrl turn to true");
                this.f = true;
                dWContext.setVideo(dWVideoViewController);
                dWVideoViewController.t0(new i(this, null));
                o0();
                dWVideoViewController.c0().d0(new a());
                dWVideoContainer.addView(dWVideoViewController.e0(), new FrameLayout.LayoutParams(-1, -1, 17));
                i85 i85Var = new i85(dWContext);
                this.k = i85Var;
                dWVideoContainer.addView(i85Var.b(), new FrameLayout.LayoutParams(-1, -1, 17));
                DWPlayerControlViewController dWPlayerControlViewController = new DWPlayerControlViewController(dWContext);
                this.j = dWPlayerControlViewController;
                dWPlayerControlViewController.F(new c());
                dWPlayerControlViewController.L(new e());
                dWVideoContainer.addView(dWPlayerControlViewController.o(), new FrameLayout.LayoutParams(-1, -1, 17));
                dWContext.setDWToastContainer(new r95(dWPlayerControlViewController.o()));
                if (dWContext.mLoop && dWContext.getVideo() != null) {
                    dWContext.getVideo().g(this);
                }
                n0(i85Var);
                n0(dWPlayerControlViewController);
                n0(dWVideoContainer);
                dWPlayerControlViewController.I(new g(this, null));
                dWVideoContainer.setOnClickListener(new View$OnClickListenerC0537f(this, null));
                dWVideoViewController.v0(new b());
                f0(dWContext.isMute());
                I0(dWContext.isShowInteractive());
                dWContext.getVideo().l(this);
                this.s = l95.b(dWContext.getUserInfoAdapter().getUserId(), dWContext.getUserInfoAdapter().getDeviceId());
                this.t = l95.b(dWContext.getUserInfoAdapter().getUserId(), dWContext.getUserInfoAdapter().getDeviceId());
                CodeUsageCounter.c().a(CodeUsageCounter.componentName.dw_sdk_DWVideoController);
            }
        }
        this.B = true;
        AVSDKLog.e(tfb.MODULE_SDK_PAGE, "Do pickVideoUrl when DW create");
        aVar.L(dVar);
        dWContext.setVideo(dWVideoViewController);
        dWVideoViewController.t0(new i(this, null));
        o0();
        dWVideoViewController.c0().d0(new a());
        dWVideoContainer.addView(dWVideoViewController.e0(), new FrameLayout.LayoutParams(-1, -1, 17));
        i85 i85Var2 = new i85(dWContext);
        this.k = i85Var2;
        dWVideoContainer.addView(i85Var2.b(), new FrameLayout.LayoutParams(-1, -1, 17));
        DWPlayerControlViewController dWPlayerControlViewController2 = new DWPlayerControlViewController(dWContext);
        this.j = dWPlayerControlViewController2;
        dWPlayerControlViewController2.F(new c());
        dWPlayerControlViewController2.L(new e());
        dWVideoContainer.addView(dWPlayerControlViewController2.o(), new FrameLayout.LayoutParams(-1, -1, 17));
        dWContext.setDWToastContainer(new r95(dWPlayerControlViewController2.o()));
        if (dWContext.mLoop) {
            dWContext.getVideo().g(this);
        }
        n0(i85Var2);
        n0(dWPlayerControlViewController2);
        n0(dWVideoContainer);
        dWPlayerControlViewController2.I(new g(this, null));
        dWVideoContainer.setOnClickListener(new View$OnClickListenerC0537f(this, null));
        dWVideoViewController.v0(new b());
        f0(dWContext.isMute());
        I0(dWContext.isShowInteractive());
        dWContext.getVideo().l(this);
        this.s = l95.b(dWContext.getUserInfoAdapter().getUserId(), dWContext.getUserInfoAdapter().getDeviceId());
        this.t = l95.b(dWContext.getUserInfoAdapter().getUserId(), dWContext.getUserInfoAdapter().getDeviceId());
        CodeUsageCounter.c().a(CodeUsageCounter.componentName.dw_sdk_DWVideoController);
    }

    public static /* synthetic */ jsc a(f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jsc) ipChange.ipc$dispatch("b9f29d18", new Object[]{fVar});
        }
        return fVar.D;
    }

    public static /* synthetic */ long d(f fVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a16609ef", new Object[]{fVar, new Long(j)})).longValue();
        }
        fVar.y = j;
        return j;
    }

    public static /* synthetic */ com.taobao.mediaplay.a e(f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.mediaplay.a) ipChange.ipc$dispatch("2388672b", new Object[]{fVar});
        }
        return fVar.i;
    }

    public static /* synthetic */ boolean f(f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3c8f9e5e", new Object[]{fVar})).booleanValue();
        }
        return fVar.v;
    }

    public static /* synthetic */ boolean g(f fVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8aa664c0", new Object[]{fVar, new Boolean(z)})).booleanValue();
        }
        fVar.v = z;
        return z;
    }

    public static /* synthetic */ boolean h(f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f6072bfd", new Object[]{fVar})).booleanValue();
        }
        return fVar.f;
    }

    public static /* synthetic */ boolean i(f fVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("208b01", new Object[]{fVar, new Boolean(z)})).booleanValue();
        }
        fVar.f = z;
        return z;
    }

    public static /* synthetic */ DWLifecycleType j(f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DWLifecycleType) ipChange.ipc$dispatch("65c61fbe", new Object[]{fVar});
        }
        return fVar.l;
    }

    public static /* synthetic */ qtb k(f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qtb) ipChange.ipc$dispatch("3a057ff1", new Object[]{fVar});
        }
        return fVar.m;
    }

    public static /* synthetic */ boolean l(f fVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("608efdc4", new Object[]{fVar, new Boolean(z)})).booleanValue();
        }
        fVar.A = z;
        return z;
    }

    public static /* synthetic */ boolean m(f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dbe56279", new Object[]{fVar})).booleanValue();
        }
        return fVar.C;
    }

    public static /* synthetic */ boolean n(f fVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d6092405", new Object[]{fVar, new Boolean(z)})).booleanValue();
        }
        fVar.C = z;
        return z;
    }

    public static /* synthetic */ void o(f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("955cf014", new Object[]{fVar});
        } else {
            fVar.e0();
        }
    }

    public static /* synthetic */ DWVideoViewController p(f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DWVideoViewController) ipChange.ipc$dispatch("80c4ba78", new Object[]{fVar});
        }
        return fVar.h;
    }

    public static /* synthetic */ FrameLayout q(f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("1edf865b", new Object[]{fVar});
        }
        return fVar.b;
    }

    public static /* synthetic */ void r(f fVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("791533f1", new Object[]{fVar, str, str2});
        } else {
            fVar.M(str, str2);
        }
    }

    public static /* synthetic */ void s(f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f89236fc", new Object[]{fVar});
        } else {
            fVar.C();
        }
    }

    public static /* synthetic */ DWPlayerControlViewController t(f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DWPlayerControlViewController) ipChange.ipc$dispatch("7bdf4076", new Object[]{fVar});
        }
        return fVar.j;
    }

    public static /* synthetic */ DWContext u(f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DWContext) ipChange.ipc$dispatch("5a54d0e3", new Object[]{fVar});
        }
        return fVar.f10173a;
    }

    public static /* synthetic */ boolean v(f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d0950dab", new Object[]{fVar})).booleanValue();
        }
        return fVar.E;
    }

    public static /* synthetic */ boolean w(f fVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d7bd51d6", new Object[]{fVar, new Boolean(z)})).booleanValue();
        }
        fVar.w = z;
        return z;
    }

    public static /* synthetic */ boolean x(f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b6734427", new Object[]{fVar})).booleanValue();
        }
        return fVar.B;
    }

    public static /* synthetic */ boolean y(f fVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4d377817", new Object[]{fVar, new Boolean(z)})).booleanValue();
        }
        fVar.B = z;
        return z;
    }

    public void A(View view, ViewGroup.LayoutParams layoutParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3c9716d", new Object[]{this, view, layoutParams});
            return;
        }
        DWVideoContainer dWVideoContainer = this.c;
        if (dWVideoContainer != null && layoutParams != null) {
            dWVideoContainer.addView(view, layoutParams);
        }
    }

    public void A0(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b5e4523", new Object[]{this, new Float(f)});
        } else if (this.h.c0() != null && this.h.c0().s() != 6 && this.h.c0().s() != 3 && this.h.c0().s() != 0) {
            this.h.c0().m0(f);
        }
    }

    public void B(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f46dce79", new Object[]{this, view});
            return;
        }
        DWPlayerControlViewController dWPlayerControlViewController = this.j;
        if (dWPlayerControlViewController != null) {
            dWPlayerControlViewController.m(view);
        }
    }

    public void B0(qtb qtbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc1ec190", new Object[]{this, qtbVar});
        } else {
            this.m = qtbVar;
        }
    }

    public final void C() {
        DWContext dWContext;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("282316b8", new Object[]{this});
        } else if (this.g == null && (dWContext = this.f10173a) != null && dWContext.getActivity() != null && this.c != null && this.f10173a.getDWConfigObject() != null && this.f10173a.getDWConfigObject().b() != null && !TextUtils.isEmpty(this.f10173a.getDWConfigObject().b().f()) && this.f10173a.getDWConfigObject().b().j() > 0 && this.f10173a.getDWConfigObject().b().i() > 0) {
            if ((this.f10173a.getDWConfigObject().b().m() || this.f10173a.getDWConfigObject().b().l()) && this.f10173a.getDWConfigObject().b().d() > 0 && this.f10173a.getDWConfigObject().b().c() > 0) {
                this.g = new ImageView(this.f10173a.getActivity());
                this.c.addView(this.g, 1, new FrameLayout.LayoutParams(DWViewUtil.dip2px(this.f10173a.getActivity(), this.f10173a.getDWConfigObject().b().j()), DWViewUtil.dip2px(this.f10173a.getActivity(), this.f10173a.getDWConfigObject().b().i())));
                J0(true);
            }
        }
    }

    public void C0(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a58b880", new Object[]{this, new Integer(i2)});
            return;
        }
        DWVideoContainer dWVideoContainer = this.c;
        if (dWVideoContainer != null) {
            dWVideoContainer.setBackgroundColor(i2);
        }
    }

    public final void D(DWContext dWContext, FrameLayout.LayoutParams layoutParams) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        float f;
        float f2;
        String str;
        int i8;
        int i9;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b3f1c74", new Object[]{this, dWContext, layoutParams});
        } else if (dWContext != null && layoutParams != null && dWContext.getActivity() != null) {
            if (dWContext.screenType() == DWVideoScreenType.LANDSCAPE_FULL_SCREEN) {
                i3 = DWViewUtil.getVideoWidthInLandscape(dWContext.getActivity());
                i2 = DWViewUtil.getRealHeightInPx(dWContext.getActivity());
            } else if (dWContext.screenType() == DWVideoScreenType.PORTRAIT_FULL_SCREEN) {
                i3 = DWViewUtil.getRealWithInPx(dWContext.getActivity());
                i2 = DWViewUtil.getVideoWidthInLandscape(dWContext.getActivity());
            } else {
                i3 = dWContext.mWidth;
                i2 = dWContext.mHeight;
            }
            float h2 = dWContext.getVideo().h() / dWContext.getVideo().m();
            float f3 = i3;
            float f4 = i2;
            float f5 = f3 / f4;
            if (h2 > f5) {
                i4 = (int) (f3 / h2);
                i5 = i3;
            } else {
                i5 = (int) (f4 * h2);
                i4 = i2;
            }
            DWVideoScreenType screenType = dWContext.screenType();
            DWVideoScreenType dWVideoScreenType = DWVideoScreenType.NORMAL;
            if (screenType == dWVideoScreenType) {
                i6 = dWContext.getDWConfigObject().b().j();
            } else {
                i6 = dWContext.getDWConfigObject().b().d();
            }
            if (dWContext.screenType() == dWVideoScreenType) {
                i7 = dWContext.getDWConfigObject().b().i();
            } else {
                i7 = dWContext.getDWConfigObject().b().c();
            }
            layoutParams.width = DWViewUtil.dip2px(dWContext.getActivity(), i6);
            layoutParams.height = DWViewUtil.dip2px(dWContext.getActivity(), i7);
            if (dWContext.screenType() == dWVideoScreenType) {
                f = dWContext.getDWConfigObject().b().g();
            } else {
                f = dWContext.getDWConfigObject().b().a();
            }
            if (dWContext.screenType() == dWVideoScreenType) {
                f2 = dWContext.getDWConfigObject().b().h();
            } else {
                f2 = dWContext.getDWConfigObject().b().b();
            }
            if (dWContext.screenType() == dWVideoScreenType) {
                str = dWContext.getDWConfigObject().b().k();
            } else {
                str = dWContext.getDWConfigObject().b().e();
            }
            if (f < 0.0f || f2 < 0.0f || f2 > 1.0f || f > 1.0f || TextUtils.isEmpty(str)) {
                if (dWContext.screenType() == dWVideoScreenType) {
                    i8 = DWViewUtil.dip2px(dWContext.getActivity(), 10.0f);
                } else {
                    i8 = DWViewUtil.dip2px(dWContext.getActivity(), 15.0f);
                }
                layoutParams.rightMargin = i8;
                DWVideoScreenType screenType2 = dWContext.screenType();
                Activity activity = dWContext.getActivity();
                if (screenType2 == dWVideoScreenType) {
                    i9 = DWViewUtil.dip2px(activity, 10.0f);
                } else {
                    i9 = DWViewUtil.dip2px(activity, 15.0f);
                }
                layoutParams.topMargin = i9;
                layoutParams.gravity = 53;
            } else if (str.equalsIgnoreCase("RB")) {
                layoutParams.leftMargin = (int) (i5 * f);
                layoutParams.topMargin = (int) (i4 * f2);
                layoutParams.gravity = 51;
            } else if (str.equalsIgnoreCase("RT")) {
                layoutParams.leftMargin = (int) (i5 * f);
                layoutParams.bottomMargin = (int) (i4 * (1.0f - f2));
                layoutParams.gravity = 83;
            } else if (str.equalsIgnoreCase("LB")) {
                layoutParams.rightMargin = (int) (i5 * (1.0f - f));
                layoutParams.topMargin = (int) (i4 * f2);
                layoutParams.gravity = 53;
            } else if (str.equalsIgnoreCase("LT")) {
                layoutParams.rightMargin = (int) (i5 * (1.0f - f));
                layoutParams.bottomMargin = (int) (i4 * (1.0f - f2));
                layoutParams.gravity = 85;
            }
            if (h2 < f5) {
                int i10 = (i3 - i5) / 2;
                int i11 = layoutParams.gravity;
                if ((i11 & 3) == 3) {
                    layoutParams.leftMargin += i10;
                } else if ((i11 & 5) == 5) {
                    layoutParams.rightMargin += i10;
                }
            } else {
                int i12 = (i4 - i2) / 2;
                int i13 = layoutParams.gravity;
                if ((i13 & 48) == 48) {
                    layoutParams.topMargin -= i12;
                } else if ((i13 & 80) == 80) {
                    layoutParams.bottomMargin -= i12;
                }
            }
        }
    }

    public void D0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25f3b4f9", new Object[]{this, new Boolean(z)});
            return;
        }
        AVSDKLog.e(tfb.MODULE_SDK_PAGE, "mDWVideoViewController setVideoSource , url is " + this.f10173a.mPlayContext.getVideoUrl());
        this.f10173a.addPlayExpUtParams(this.i.A());
        this.h.x0(this.f10173a.mPlayContext.getVideoUrl(), z);
    }

    public void E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a27cd7", new Object[]{this});
            return;
        }
        psb psbVar = this.f10173a.mConfigAdapter;
        String str = "";
        if (psbVar != null) {
            str = ((b75) psbVar).getConfig("DWInteractive", e75.ORANGE_DISABLE_PRELOAD_BIZCODE, str);
        }
        if (!ew0.n(this.f10173a.mFrom, str)) {
            if (this.f) {
                this.f = false;
                this.B = true;
                this.i.L(this.D);
            }
            this.h.Y();
        }
    }

    public void E0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("953f86c7", new Object[]{this});
        } else {
            this.j.M();
        }
    }

    public void F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("589b5c6a", new Object[]{this});
            return;
        }
        this.h.a();
        this.i.O();
    }

    public void F0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dccfe280", new Object[]{this});
            return;
        }
        this.j.O();
        this.E = false;
    }

    public void G0(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c03e5802", new Object[]{this, str, new Boolean(z)});
            return;
        }
        DWPlayerControlViewController dWPlayerControlViewController = this.j;
        if (dWPlayerControlViewController != null) {
            dWPlayerControlViewController.q();
            this.j.v();
            this.j.P(str, z);
        }
    }

    public void H0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36a13c99", new Object[]{this});
        } else {
            this.j.R();
        }
    }

    public void I0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("127138cd", new Object[]{this, new Boolean(z)});
            return;
        }
        i85 i85Var = this.k;
        if (i85Var != null) {
            i85Var.f(z);
        }
        DWPlayerControlViewController dWPlayerControlViewController = this.j;
        if (dWPlayerControlViewController != null) {
            dWPlayerControlViewController.S(z);
        }
    }

    public final void J0(boolean z) {
        DWContext dWContext;
        zsb zsbVar;
        zsb zsbVar2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e68906", new Object[]{this, new Boolean(z)});
        } else if (this.g != null && (dWContext = this.f10173a) != null) {
            if (!z || dWContext.isFloating() || this.f10173a.isMute() || this.l != DWLifecycleType.MID || (this.f10173a.screenType() != DWVideoScreenType.NORMAL ? !this.f10173a.getDWConfigObject().b().l() : !this.f10173a.getDWConfigObject().b().m())) {
                if (this.g.getVisibility() != 8) {
                    this.g.setVisibility(8);
                }
                DWContext dWContext2 = this.f10173a;
                if (dWContext2 != null && (zsbVar = dWContext2.mDWImageAdapter) != null) {
                    ((z75) zsbVar).f(null, this.g);
                    return;
                }
                return;
            }
            if (this.g.getVisibility() != 0) {
                this.g.setVisibility(0);
            }
            DWContext dWContext3 = this.f10173a;
            if (!(dWContext3 == null || (zsbVar2 = dWContext3.mDWImageAdapter) == null)) {
                ((z75) zsbVar2).f(dWContext3.getDWConfigObject().b().f(), this.g);
            }
            D(this.f10173a, (FrameLayout.LayoutParams) this.g.getLayoutParams());
            this.g.requestLayout();
        }
    }

    public void K0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a420d40", new Object[]{this});
            return;
        }
        if (this.f) {
            this.f = false;
            this.B = true;
            this.i.L(this.D);
        }
        this.h.c();
    }

    public void L0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("378fc2c9", new Object[]{this});
            return;
        }
        i85 i85Var = this.k;
        if (!(i85Var == null || i85Var.b() == null)) {
            this.k.b().setVisibility(0);
        }
        DWPlayerControlViewController dWPlayerControlViewController = this.j;
        if (!(dWPlayerControlViewController == null || dWPlayerControlViewController.o() == null)) {
            this.j.o().setVisibility(0);
        }
        J0(true);
    }

    public void M0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a1869d3", new Object[]{this});
            return;
        }
        i85 i85Var = this.k;
        if (!(i85Var == null || i85Var.b() == null)) {
            this.k.b().setVisibility(4);
        }
        DWPlayerControlViewController dWPlayerControlViewController = this.j;
        if (!(dWPlayerControlViewController == null || dWPlayerControlViewController.o() == null)) {
            this.j.o().setVisibility(4);
        }
        J0(false);
    }

    public void N0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e3aad67", new Object[]{this});
        } else {
            this.h.n();
        }
    }

    public void O0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("684668ab", new Object[]{this});
            return;
        }
        i85 i85Var = this.k;
        if (i85Var != null) {
            i85Var.g();
        }
        ImageView imageView = this.g;
        if (imageView != null && this.f10173a != null && imageView.getVisibility() == 0) {
            J0(true);
        }
    }

    public final void Q(boolean z, Map<String, String> map) {
        boolean z2;
        boolean z3 = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("633e152d", new Object[]{this, new Boolean(z), map});
        } else if (!this.d || ((z2 = this.r) && z)) {
            StringBuilder sb = new StringBuilder("DWVideoController commitVideoComplete2 12003 return by !mVideoStarted=");
            sb.append(!this.d);
            sb.append(",(mHasCommitVideoComplete && end)=");
            if (!this.r || !z) {
                z3 = false;
            }
            sb.append(z3);
            AVSDKLog.e(tfb.MODULE_SDK_PAGE, sb.toString());
        } else {
            if (!z2 && z) {
                this.r = true;
            }
            if (z) {
                this.u++;
            }
            N(z, map);
            if (z) {
                this.z = 0;
            }
        }
    }

    public final void R() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c16b8186", new Object[]{this});
            return;
        }
        DWContext dWContext = this.f10173a;
        if (dWContext.mUTAdapter != null && !"TBAudio".equals(dWContext.mVideoSource)) {
            DWContext dWContext2 = this.f10173a;
            dWContext2.mUTAdapter.a("DWVideo", "Button", sj4.PLAY_SCENES, dWContext2.getUTParams(), null);
        }
    }

    public final void S() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a9fd51b", new Object[]{this});
            return;
        }
        DWContext dWContext = this.f10173a;
        if (dWContext.mUTAdapter != null && !"TBAudio".equals(dWContext.mVideoSource)) {
            DWContext dWContext2 = this.f10173a;
            dWContext2.mUTAdapter.a("DWVideo", "Button", "videoWindow", dWContext2.getUTParams(), null);
        }
    }

    public void T() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        I();
        DWVideoViewController dWVideoViewController = this.h;
        if (dWVideoViewController != null) {
            dWVideoViewController.Z();
        }
        DWPlayerControlViewController dWPlayerControlViewController = this.j;
        if (dWPlayerControlViewController != null) {
            dWPlayerControlViewController.n();
        }
        i85 i85Var = this.k;
        if (i85Var != null) {
            i85Var.a();
        }
        ArrayList<ctb> arrayList = this.n;
        if (arrayList != null) {
            arrayList.clear();
        }
        this.i.O();
    }

    public final String U(String str) {
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

    public Map<String, String> V() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("438347ba", new Object[]{this});
        }
        DWVideoViewController dWVideoViewController = this.h;
        if (dWVideoViewController != null) {
            return dWVideoViewController.d0();
        }
        return null;
    }

    public long X() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fe4a14ca", new Object[]{this})).longValue();
        }
        return this.x;
    }

    public View Y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("576a35e4", new Object[]{this});
        }
        return this.b;
    }

    public void Z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("417f1ca2", new Object[]{this});
        } else {
            this.j.p();
        }
    }

    public void a0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8830805", new Object[]{this});
            return;
        }
        this.j.r();
        this.E = true;
    }

    @Override // tb.gsc
    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d4e1dfdf", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public void b0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("183864be", new Object[]{this});
        } else {
            this.j.s();
        }
    }

    @Override // tb.gsc
    public boolean c(int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fe89394e", new Object[]{this, new Integer(i2), new Integer(i3)})).booleanValue();
        }
        String videoDefinition = this.f10173a.mPlayContext.getVideoDefinition();
        if (TextUtils.isEmpty(videoDefinition) || !videoDefinition.contains("266")) {
            return false;
        }
        return h0(i2, i3);
    }

    public void c0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b911c234", new Object[]{this});
        } else {
            this.j.u();
        }
    }

    public void d0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0b7df73", new Object[]{this});
            return;
        }
        DWPlayerControlViewController dWPlayerControlViewController = this.j;
        if (dWPlayerControlViewController != null) {
            dWPlayerControlViewController.w();
        }
    }

    public final void e0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c1a261c", new Object[]{this});
        } else if (this.f10173a.mPlayContext.getVideoUrl() != null && !TextUtils.isEmpty(this.f10173a.mPlayContext.getVideoUrl())) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("bytes", String.valueOf(1048576));
                JSONArray jSONArray = new JSONArray();
                JSONObject jSONObject2 = new JSONObject();
                if (this.f10173a.mPlayContext.isH265()) {
                    jSONObject2.put("encodeType", "h265");
                } else {
                    jSONObject2.put("encodeType", "h264");
                }
                String videoUrl = this.f10173a.mPlayContext.getVideoUrl();
                String U = U(videoUrl);
                StringBuilder sb = new StringBuilder(100);
                if (!TextUtils.isEmpty(U)) {
                    sb.append("cdnIp=" + U);
                }
                if (!TextUtils.isEmpty(this.f10173a.getPlayToken())) {
                    if (!TextUtils.isEmpty(sb)) {
                        sb.append("&");
                    }
                    sb.append("playTokenId=" + this.f10173a.getPlayToken());
                }
                psb psbVar = this.f10173a.mConfigAdapter;
                if (psbVar != null && ((b75) psbVar).j() && this.f10173a.mPlayContext.getVideoLength() > 0 && this.f10173a.mPlayContext.getVideoLength() < 262144000 && this.f10173a.mPlayContext.getVideoLength() != Integer.MAX_VALUE && this.f10173a.mPlayContext.getVideoLength() > 0) {
                    if (!TextUtils.isEmpty(sb)) {
                        sb.append("&");
                    }
                    sb.append("videoLength=" + this.f10173a.mPlayContext.getVideoLength());
                }
                jSONObject2.put("url", ew0.b(videoUrl, sb));
                if (this.f10173a.mPlayContext.getCacheKey() != null && !TextUtils.isEmpty(this.f10173a.mPlayContext.getCacheKey())) {
                    jSONObject2.put(VideoControllerManager.KEY_CACHEKEY, this.f10173a.mPlayContext.getCacheKey());
                }
                jSONArray.put(jSONObject2);
                jSONObject.put("videoInfoList", jSONArray);
                qmm.h(this.f10173a.getActivity(), jSONObject);
            } catch (JSONException unused) {
            }
        }
    }

    public void f0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4254d4b4", new Object[]{this, new Boolean(z)});
            return;
        }
        this.j.B(z);
        this.h.m0(z);
        htb htbVar = this.o;
        if (htbVar != null) {
            htbVar.onMutedChange(z);
        }
        J0(!z);
    }

    public final void g0(DWLifecycleType dWLifecycleType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d483adc", new Object[]{this, dWLifecycleType});
            return;
        }
        Iterator<ctb> it = this.n.iterator();
        while (it.hasNext()) {
            it.next().onLifecycleChanged(dWLifecycleType);
        }
    }

    public void i0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a29e37f", new Object[]{this});
            return;
        }
        DWVideoViewController dWVideoViewController = this.h;
        if (dWVideoViewController != null) {
            dWVideoViewController.a0();
        }
    }

    public void j0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d42dfe7a", new Object[]{this});
            return;
        }
        DWVideoViewController dWVideoViewController = this.h;
        if (dWVideoViewController != null) {
            dWVideoViewController.b0();
        }
    }

    public void k0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf67322c", new Object[]{this});
        } else {
            this.h.pauseVideo();
        }
    }

    public void l0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4075d2ae", new Object[]{this});
        } else {
            this.h.playVideo();
        }
    }

    public void m0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f50cd26", new Object[]{this});
            return;
        }
        psb psbVar = this.f10173a.mConfigAdapter;
        String str = "";
        if (psbVar != null) {
            str = ((b75) psbVar).getConfig("DWInteractive", e75.ORANGE_DISABLE_PRELOAD_BIZCODE, str);
        }
        if (!ew0.n(this.f10173a.mFrom, str)) {
            if (this.f) {
                this.f = false;
                this.B = true;
                this.i.L(this.D);
            }
            this.h.p0();
        }
    }

    public void n0(ctb ctbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbffd053", new Object[]{this, ctbVar});
        } else if (!this.n.contains(ctbVar)) {
            this.n.add(ctbVar);
        }
    }

    public final void o0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5116570c", new Object[]{this});
        } else {
            ((com.taobao.avplayer.player.a) this.h.c0()).w1(new h(this, null));
        }
    }

    @Override // tb.aub
    public void onLoopCompletion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a22ee66", new Object[]{this});
            return;
        }
        J();
        this.d = false;
        this.G = false;
        this.s = l95.b(this.f10173a.getUserInfoAdapter().getUserId(), this.f10173a.getUserInfoAdapter().getDeviceId());
        this.r = false;
        L(null, true);
        P();
        this.y = System.currentTimeMillis();
    }

    @Override // tb.ytb
    public void onVideoClose() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24db3403", new Object[]{this});
            return;
        }
        this.d = false;
        this.G = false;
    }

    @Override // tb.ytb
    public void onVideoComplete() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3c2c53c", new Object[]{this});
            return;
        }
        J();
        this.d = false;
        this.G = false;
        y0(DWLifecycleType.MID_END);
        this.j.K();
        DWLifecycleType dWLifecycleType = DWLifecycleType.AFTER;
        this.l = dWLifecycleType;
        y0(dWLifecycleType);
    }

    @Override // tb.ytb
    public void onVideoError(Object obj, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7a1a1cf", new Object[]{this, obj, new Integer(i2), new Integer(i3)});
            return;
        }
        G("videoPlay", String.valueOf(i2), String.valueOf(i3));
        if (!z()) {
            DWLifecycleType dWLifecycleType = DWLifecycleType.AFTER;
            this.l = dWLifecycleType;
            y0(dWLifecycleType);
        }
        this.j.K();
    }

    @Override // tb.ytb
    public void onVideoInfo(Object obj, long j, long j2, long j3, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59f3ed73", new Object[]{this, obj, new Long(j), new Long(j2), new Long(j3), obj2});
        } else if (3 == j && (obj2 instanceof Map)) {
            this.F = true;
            try {
                O((Map) obj2);
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
        this.y = System.currentTimeMillis();
        this.j.x();
        this.j.J();
        if (this.j.A()) {
            this.j.v();
        }
    }

    @Override // tb.ytb
    public void onVideoPrepared(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3faee61c", new Object[]{this, obj});
        } else {
            this.y = System.currentTimeMillis();
        }
    }

    @Override // tb.ytb
    public void onVideoProgressChanged(int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91a8a811", new Object[]{this, new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        if (this.y != 0) {
            this.x += System.currentTimeMillis() - this.y;
            this.z = (int) (this.z + (System.currentTimeMillis() - this.y));
        }
        this.y = System.currentTimeMillis();
    }

    @Override // tb.ytb
    public void onVideoScreenChanged(DWVideoScreenType dWVideoScreenType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84bd1066", new Object[]{this, dWVideoScreenType});
            return;
        }
        if (dWVideoScreenType == DWVideoScreenType.NORMAL) {
            S();
            if (this.f10173a.isFloatingToggle()) {
                this.f10173a.setFloating(true);
                M0();
            }
        } else {
            this.p++;
            this.c.setAlpha(1.0f);
            R();
            L0();
            this.f10173a.setFloating(false);
        }
        if (this.g != null && this.f10173a != null) {
            J0(true);
        }
    }

    @Override // tb.ytb
    public void onVideoSeekTo(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd6694ad", new Object[]{this, new Integer(i2)});
        }
    }

    @Override // tb.ytb
    public void onVideoStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2b2d56d", new Object[]{this});
            return;
        }
        this.j.J();
        DWVideoContainer dWVideoContainer = this.c;
        if (dWVideoContainer != null) {
            dWVideoContainer.initGesture();
        }
        this.s = l95.b(this.f10173a.getUserInfoAdapter().getUserId(), this.f10173a.getUserInfoAdapter().getDeviceId());
        this.r = false;
        L(null, true);
        P();
        this.y = System.currentTimeMillis();
        H();
    }

    public void p0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc677c9c", new Object[]{this});
            return;
        }
        DWPlayerControlViewController dWPlayerControlViewController = this.j;
        if (dWPlayerControlViewController != null) {
            dWPlayerControlViewController.E();
        }
    }

    public void q0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b79d80ee", new Object[]{this});
        } else {
            this.h.c();
        }
    }

    public void r0(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49645829", new Object[]{this, new Integer(i2)});
        } else {
            this.h.seekTo(i2);
        }
    }

    public void s0(nsb nsbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f84ff1fa", new Object[]{this, nsbVar});
        } else {
            this.j.G(nsbVar);
        }
    }

    public void t0(nj9 nj9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2ed34d3", new Object[]{this, nj9Var});
            return;
        }
        DWVideoViewController dWVideoViewController = this.h;
        if (dWVideoViewController != null) {
            dWVideoViewController.r0(nj9Var);
        }
    }

    public void u0(rtb rtbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4c33a5", new Object[]{this, rtbVar});
        } else {
            this.c.setHookRootViewTouchListener(rtbVar);
        }
    }

    public void v0(xsb xsbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("506d7354", new Object[]{this, xsbVar});
        } else {
            this.j.H(xsbVar);
        }
    }

    public void w0(htb htbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46bb02b4", new Object[]{this, htbVar});
        } else {
            this.o = htbVar;
        }
    }

    public void x0(InnerStartFuncListener innerStartFuncListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("805c05a7", new Object[]{this, innerStartFuncListener});
            return;
        }
        DWVideoViewController dWVideoViewController = this.h;
        if (dWVideoViewController != null) {
            dWVideoViewController.s0(innerStartFuncListener);
        }
    }

    public final void y0(DWLifecycleType dWLifecycleType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d99848d", new Object[]{this, dWLifecycleType});
            return;
        }
        this.l = dWLifecycleType;
        g0(dWLifecycleType);
        if (this.l == DWLifecycleType.MID) {
            AVSDKLog.e(tfb.MODULE_SDK_PAGE, this + ", setLifecycleType " + dWLifecycleType + ", true");
            J0(true);
            return;
        }
        AVSDKLog.e(tfb.MODULE_SDK_PAGE, this + ", setLifecycleType " + dWLifecycleType + ", false");
        J0(false);
    }

    public boolean z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("10a45ecc", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public void z0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5cac726", new Object[]{this, new Boolean(z)});
            return;
        }
        DWVideoViewController dWVideoViewController = this.h;
        if (dWVideoViewController != null) {
            dWVideoViewController.u0(z);
        }
    }

    public final void H() {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb2d4d9a", new Object[]{this});
        } else if (this.f10173a.mDWAlarmAdapter != null) {
            DWStabilityData dWStabilityData = new DWStabilityData();
            StringBuffer stringBuffer = new StringBuffer(100);
            if (this.f10173a.getVideo() != null) {
                stringBuffer.append("bizCode=");
                stringBuffer.append(this.f10173a.mFrom);
                stringBuffer.append(",videoId=");
                stringBuffer.append(this.f10173a.mVideoId);
                stringBuffer.append(",useCache=");
                DWVideoViewController dWVideoViewController = this.h;
                stringBuffer.append(dWVideoViewController != null ? dWVideoViewController.h0() : false);
                stringBuffer.append(",hitCache=");
                DWVideoViewController dWVideoViewController2 = this.h;
                stringBuffer.append(dWVideoViewController2 != null ? dWVideoViewController2.g0() : false);
                stringBuffer.append(",completeHitCache=");
                DWVideoViewController dWVideoViewController3 = this.h;
                if (dWVideoViewController3 != null) {
                    z = dWVideoViewController3.f0();
                }
                stringBuffer.append(z);
                stringBuffer.append(",url=");
                stringBuffer.append(this.f10173a.mPlayContext.getVideoUrl());
                stringBuffer.append(",videoSource=");
                stringBuffer.append(this.f10173a.getVideoSource());
                stringBuffer.append(",playerType=");
                stringBuffer.append(W());
                stringBuffer.append(",usePlayManger=");
                stringBuffer.append(this.A);
                stringBuffer.append(",videoDefinition=");
                stringBuffer.append(this.f10173a.mPlayContext.getVideoDefinition());
                stringBuffer.append(",videoUrlPickDuration=0,useTBNet=");
                stringBuffer.append(String.valueOf(this.f10173a.mPlayContext.isUseTBNet()));
                stringBuffer.append(",useHardwareHevc=");
                stringBuffer.append(String.valueOf(this.f10173a.mPlayContext.isHardwareHevc()));
                stringBuffer.append(",useHardwareAvc=");
                stringBuffer.append(String.valueOf(this.f10173a.mPlayContext.isHardwareAvc()));
                stringBuffer.append(",playToken=");
                stringBuffer.append(String.valueOf(this.f10173a.getPlayToken()));
            }
            dWStabilityData.args = stringBuffer.toString();
            DWContext dWContext = this.f10173a;
            ((k95) dWContext.mDWAlarmAdapter).a(dWContext.getActivity(), "DWVideo", "videoPlay", true, dWStabilityData);
        }
    }

    public final void L(Map<String, String> map, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b1eaa62", new Object[]{this, map, new Boolean(z)});
        } else if (this.f10173a.needFirstPlayUT() || !this.G || true == z) {
            HashMap hashMap = new HashMap();
            if (!this.f10173a.isMute() || this.H) {
                hashMap.put("wifiAuto", "false");
            } else {
                hashMap.put("wifiAuto", "true");
            }
            hashMap.put("mute", Boolean.toString(this.f10173a.isMute()));
            if (map != null) {
                hashMap.putAll(map);
            }
            DWContext dWContext = this.f10173a;
            if (dWContext.mUTAdapter != null && !"TBAudio".equals(dWContext.mVideoSource)) {
                if (!this.f10173a.statInRemoveList("videoFirstPlay")) {
                    DWContext dWContext2 = this.f10173a;
                    dWContext2.mUTAdapter.a("DWVideo", "Button", "videoFirstPlay", dWContext2.getUTParams(), hashMap);
                }
                hashMap.putAll(this.f10173a.getUTParams());
                Uri data = (this.f10173a.getActivity() == null || this.f10173a.getActivity().getIntent() == null) ? null : this.f10173a.getActivity().getIntent().getData();
                if (data != null) {
                    String queryParameter = data.getQueryParameter("spm");
                    if (!TextUtils.isEmpty(queryParameter)) {
                        hashMap.put("spm-url", queryParameter);
                    }
                }
                hashMap.put("play_sid", this.s);
                hashMap.put("barrage", "false");
                hashMap.put("item", String.valueOf(this.f10173a.getShowGoodsList()));
                hashMap.put("instance_playid", this.t);
                hashMap.put("likes", "false");
                hashMap.put("is_live", "0");
                AVSDKLog.e(tfb.MODULE_SDK_PAGE, "DWVideoController commit 12002 at commitFirstPlayUT");
                this.f10173a.mUTAdapter.b(null, null, 12002, (String) hashMap.get(xau.PROPERTY_VIDEO_ID), "", "", hashMap);
            }
            this.G = true;
            this.H = true;
        }
    }

    public final void P() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b65cd2f", new Object[]{this});
        } else if (this.f10173a.needFirstPlayUT() && !this.d) {
            HashMap hashMap = new HashMap();
            if (!this.f10173a.isMute() || this.J) {
                hashMap.put("wifiAuto", "false");
            } else {
                hashMap.put("wifiAuto", "true");
            }
            hashMap.put("mute", Boolean.toString(this.f10173a.isMute()));
            DWContext dWContext = this.f10173a;
            if (dWContext.mUTAdapter != null && !"TBAudio".equals(dWContext.mVideoSource) && !this.f10173a.statInRemoveList("videoRealPlay")) {
                DWContext dWContext2 = this.f10173a;
                dWContext2.mUTAdapter.a("DWVideo", "Button", "videoRealPlay", dWContext2.getUTParams(), hashMap);
            }
            this.d = true;
            this.J = true;
        }
    }

    public final String W() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7136c49d", new Object[]{this});
        }
        DWContext dWContext = this.f10173a;
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
        DWContext dWContext = this.f10173a;
        if (!(dWContext == null || dWContext.mUTAdapter == null || "TBAudio".equals(dWContext.mVideoSource))) {
            HashMap hashMap = new HashMap();
            if (this.f10173a.getVideo() != null) {
                hashMap.put("playTime", String.valueOf(this.x));
            }
            Q(false, hashMap);
        }
        if (!this.f10173a.isMute() && !this.E) {
            this.j.N();
        }
        this.j.K();
    }

    public void G(String str, String str2, String str3) {
        String str4;
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7667b8bd", new Object[]{this, str, str2, str3});
        } else if (!this.w) {
            this.w = true;
            if (this.f10173a.mDWAlarmAdapter != null) {
                DWStabilityData dWStabilityData = new DWStabilityData();
                dWStabilityData.code = str2;
                dWStabilityData.msg = str3;
                StringBuffer stringBuffer = new StringBuffer(100);
                DWContext dWContext = this.f10173a;
                if (!(dWContext == null || dWContext.getVideo() == null)) {
                    stringBuffer.append("bizCode=");
                    stringBuffer.append(this.f10173a.mFrom);
                    stringBuffer.append(",videoId=");
                    stringBuffer.append(this.f10173a.mVideoId);
                    stringBuffer.append(",useCache=");
                    DWVideoViewController dWVideoViewController = this.h;
                    stringBuffer.append(dWVideoViewController != null ? dWVideoViewController.h0() : false);
                    stringBuffer.append(",hitCache=");
                    DWVideoViewController dWVideoViewController2 = this.h;
                    stringBuffer.append(dWVideoViewController2 != null ? dWVideoViewController2.g0() : false);
                    stringBuffer.append(",completeHitCache=");
                    DWVideoViewController dWVideoViewController3 = this.h;
                    if (dWVideoViewController3 != null) {
                        z = dWVideoViewController3.f0();
                    }
                    stringBuffer.append(z);
                    stringBuffer.append(",url=");
                    if (TextUtils.isEmpty(this.f10173a.mPlayContext.getVideoUrl())) {
                        str4 = "";
                    } else {
                        str4 = this.f10173a.mPlayContext.getVideoUrl();
                    }
                    stringBuffer.append(str4);
                    stringBuffer.append(",videoSource=");
                    stringBuffer.append(this.f10173a.getVideoSource());
                    stringBuffer.append(",playerType=");
                    stringBuffer.append(W());
                    stringBuffer.append(",usePlayManger=");
                    stringBuffer.append(this.A);
                    stringBuffer.append(",videoDefinition=");
                    stringBuffer.append(this.f10173a.mPlayContext.getVideoDefinition());
                    stringBuffer.append(",videoUrlPickDuration=0,useTBNet=");
                    stringBuffer.append(String.valueOf(this.f10173a.mPlayContext.isUseTBNet()));
                    stringBuffer.append(",useHardwareHevc=");
                    stringBuffer.append(String.valueOf(this.f10173a.mPlayContext.isHardwareHevc()));
                    stringBuffer.append(",useHardwareAvc=");
                    stringBuffer.append(String.valueOf(this.f10173a.mPlayContext.isHardwareAvc()));
                    stringBuffer.append(",playToken=");
                    stringBuffer.append(String.valueOf(this.f10173a.getPlayToken()));
                }
                dWStabilityData.args = stringBuffer.toString();
                DWContext dWContext2 = this.f10173a;
                stb stbVar = dWContext2.mDWAlarmAdapter;
                Activity activity = dWContext2.getActivity();
                if (TextUtils.isEmpty(str)) {
                    str = "videoPlay";
                }
                ((k95) stbVar).a(activity, "DWVideo", str, false, dWStabilityData);
            }
        }
    }

    public final void I() {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d4811e7", new Object[]{this});
        } else if (!this.f10173a.needCloseUT() || this.e) {
            AVSDKLog.e(tfb.MODULE_SDK_PAGE, "DWVideoController commitCloseUT 12003 return by !mDWContext.needCloseUT()=" + (true ^ this.f10173a.needCloseUT()) + ",mVideoDestroyed=" + this.e);
        } else {
            DWContext dWContext = this.f10173a;
            if (dWContext.mUTAdapter == null || "TBAudio".equals(dWContext.mVideoSource)) {
                StringBuilder sb = new StringBuilder("DWVideoController commitCloseUT 12003 failed with mDWContext.mUTAdapter=");
                if (this.f10173a.mUTAdapter != null) {
                    z = true;
                }
                sb.append(z);
                sb.append(",!DWConstant.AUDIO_SOURCE.equals(mDWContext.mVideoSource)=");
                sb.append(!"TBAudio".equals(this.f10173a.mVideoSource));
                AVSDKLog.e(tfb.MODULE_SDK_PAGE, sb.toString());
            } else {
                HashMap hashMap = new HashMap();
                if (this.f10173a.getVideo() != null) {
                    hashMap.put("closeTime", String.valueOf(this.f10173a.getVideo().getCurrentPosition()));
                    hashMap.put("playTime", String.valueOf(this.x));
                }
                if (!this.f10173a.statInRemoveList("videoClose")) {
                    DWContext dWContext2 = this.f10173a;
                    dWContext2.mUTAdapter.a("DWVideo", "Button", "videoClose", dWContext2.getUTParams(), hashMap);
                }
                Q(true, hashMap);
                this.f10173a.setNeedCloseUT(true);
            }
            this.e = true;
        }
    }

    public final void J() {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4ed336", new Object[]{this});
            return;
        }
        DWContext dWContext = this.f10173a;
        if (dWContext.mUTAdapter == null || "TBAudio".equals(dWContext.mVideoSource)) {
            StringBuilder sb = new StringBuilder("DWVideoController commitCompleteUT 12003 return by (mDWContext.mUTAdapter == null)=");
            if (this.f10173a.mUTAdapter == null) {
                z = true;
            }
            sb.append(z);
            sb.append(",(DWConstant.AUDIO_SOURCE.equals(mDWContext.mVideoSource))=");
            sb.append("TBAudio".equals(this.f10173a.mVideoSource));
            AVSDKLog.e(tfb.MODULE_SDK_PAGE, sb.toString());
            return;
        }
        HashMap hashMap = new HashMap();
        if (this.f10173a.getVideo() != null) {
            hashMap.put("completeTime", String.valueOf(this.f10173a.getVideo().getDuration()));
            hashMap.put("playTime", String.valueOf(this.x));
        }
        if (!this.f10173a.statInRemoveList("videoComplete")) {
            DWContext dWContext2 = this.f10173a;
            dWContext2.mUTAdapter.a("DWVideo", "Button", "videoComplete", dWContext2.getUTParams(), hashMap);
        }
        this.q = true;
        Q(true, hashMap);
        this.q = false;
    }

    public void K() {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d91abe26", new Object[]{this});
        } else if (!this.f10173a.needCloseUT() || this.e) {
            AVSDKLog.e(tfb.MODULE_SDK_PAGE, "DWVideoController commitEndForMultiplexing 12003 return by !mDWContext.needCloseUT()=" + (true ^ this.f10173a.needCloseUT()) + ",mVideoDestroyed=" + this.e);
        } else {
            DWContext dWContext = this.f10173a;
            if (dWContext.mUTAdapter == null || "TBAudio".equals(dWContext.mVideoSource)) {
                StringBuilder sb = new StringBuilder("DWVideoController commitEndForMultiplexing 12003 failed with mDWContext.mUTAdapter=");
                if (this.f10173a.mUTAdapter != null) {
                    z = true;
                }
                sb.append(z);
                sb.append(",!DWConstant.AUDIO_SOURCE.equals(mDWContext.mVideoSource)=");
                sb.append(!"TBAudio".equals(this.f10173a.mVideoSource));
                AVSDKLog.e(tfb.MODULE_SDK_PAGE, sb.toString());
                return;
            }
            HashMap hashMap = new HashMap();
            if (this.f10173a.getVideo() != null) {
                hashMap.put("closeTime", String.valueOf(this.f10173a.getVideo().getCurrentPosition()));
                hashMap.put("playTime", String.valueOf(this.x));
                hashMap.put("commitByActive", "1");
            }
            if (!this.f10173a.statInRemoveList("videoClose")) {
                DWContext dWContext2 = this.f10173a;
                dWContext2.mUTAdapter.a("DWVideo", "Button", "videoClose", dWContext2.getUTParams(), hashMap);
            }
            N(true, hashMap);
            this.f10173a.setNeedCloseUT(true);
            this.q = false;
            this.u = 0;
            this.z = 0;
            this.x = 0L;
        }
    }

    public final void M(String str, String str2) {
        vtb vtbVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("856139ee", new Object[]{this, str, str2});
        } else if (this.f10173a != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("type", String.valueOf(0));
            hashMap.put("error_code", str);
            hashMap.put("from", this.f10173a.mFrom);
            hashMap.put("playScenes", this.f10173a.mPlayScenes);
            hashMap.put("play_scenario", String.valueOf(2));
            hashMap.put("errorMsg", str2);
            Map<String, String> playExpUTParams = this.f10173a.getPlayExpUTParams();
            if (playExpUTParams != null) {
                hashMap.put("pctime", String.valueOf(ew0.u(playExpUTParams.get("pctime"))));
            }
            long currentTimeMillis = System.currentTimeMillis();
            if ((str != "0" || ((int) currentTimeMillis) % 10 < 10) && (vtbVar = this.f10173a.mUTAdapter) != null) {
                vtbVar.b("DWVideo", null, 19997, "pcservice", "", "", hashMap);
            }
        }
    }

    public final void N(boolean z, Map<String, String> map) {
        String str;
        Map<String, String> playExpUTParams;
        boolean z2 = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e71c6e56", new Object[]{this, new Boolean(z), map});
            return;
        }
        DWContext dWContext = this.f10173a;
        if (dWContext.mUTAdapter == null || "TBAudio".equals(dWContext.mVideoSource)) {
            StringBuilder sb = new StringBuilder("DWVideoController commitPlayEndInfo 12003 failed with mDWContext.mUTAdapter=");
            if (this.f10173a.mUTAdapter != null) {
                z2 = true;
            }
            sb.append(z2);
            sb.append(",!DWConstant.AUDIO_SOURCE.equals(mDWContext.mVideoSource)=");
            sb.append(!"TBAudio".equals(this.f10173a.mVideoSource));
            AVSDKLog.e(tfb.MODULE_SDK_PAGE, sb.toString());
            return;
        }
        Uri data = (this.f10173a.getActivity() == null || this.f10173a.getActivity().getIntent() == null) ? null : this.f10173a.getActivity().getIntent().getData();
        if (data != null) {
            String queryParameter = data.getQueryParameter("spm");
            if (!TextUtils.isEmpty(queryParameter)) {
                map.put("spm-url", queryParameter);
            }
        }
        int duration = this.h.getDuration();
        map.put("video_duration", String.valueOf(duration));
        if (duration < 0 || duration > 3600000) {
            AVSDKLog.e(tfb.MODULE_SDK_PAGE, "get video_duration error, video_duration =" + String.valueOf(duration));
        }
        String str2 = "1";
        map.put("complete", this.q ? str2 : "0");
        if (this.p == 0) {
            str2 = "0";
        }
        map.put(abk.FROM_FULL, str2);
        map.put("play_sid", this.s);
        if (z) {
            str = "end";
        } else {
            str = "pause";
        }
        map.put("play_type", str);
        map.put("switchScene", null);
        map.put("play_times", String.valueOf(this.u));
        map.put("instance_playid", this.t);
        map.put("duration_time", String.valueOf(this.z));
        map.put("play_token", this.f10173a.getPlayToken());
        map.put("is_live", "0");
        int i2 = this.z;
        if (i2 < 0 || i2 > 3600000) {
            AVSDKLog.e(tfb.MODULE_SDK_PAGE, "get duration_time error, mDurationTime =" + String.valueOf(this.z) + ", mLatestTime = " + String.valueOf(this.y));
        }
        map.putAll(this.f10173a.getUTParams());
        if (z && (playExpUTParams = this.f10173a.getPlayExpUTParams()) != null) {
            int u = ew0.u(playExpUTParams.get("pctime"));
            if (u > 0) {
                map.put("pctime", "" + u);
            }
            int u2 = ew0.u(playExpUTParams.get("pcerror"));
            map.put("pcerror", "" + u2);
            map.put("resourcePassThroughData", playExpUTParams.get("resourcePassThroughData"));
            map.put("videoPassThroughData", playExpUTParams.get("videoPassThroughData"));
        }
        AVSDKLog.e(tfb.MODULE_SDK_PAGE, "DWVideoController 12003 commit at commitPlayEndInfo");
        this.f10173a.mUTAdapter.b(null, null, IMediaPlayer.MEDIA_INFO_LIVE_DEFINIITON_AUTO_SWITCH_START, map.get(xau.PROPERTY_VIDEO_ID), c2v.getInstance().getCurrentPageName(), map.get("playTime"), map);
    }

    public final void O(Map<String, Long> map) {
        DWContext dWContext;
        int i2;
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("265a59a6", new Object[]{this, map});
        } else if (!this.I && (dWContext = this.f10173a) != null && dWContext.mDWAlarmAdapter != null && map != null && map.get("RENDER_END_TIME") != null && map.get("RENDER_START_TIME") != null) {
            long longValue = map.get("RENDER_END_TIME").longValue() - map.get("RENDER_START_TIME").longValue();
            if (longValue >= 10000 || longValue == 0 || i2 < 0) {
                DWStabilityData dWStabilityData = new DWStabilityData();
                dWStabilityData.args = String.valueOf(longValue);
                DWContext dWContext2 = this.f10173a;
                ((k95) dWContext2.mDWAlarmAdapter).a(dWContext2.getActivity(), "DWVideo", "VideoOutInTime", false, dWStabilityData);
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("player_type", W());
            hashMap.put("videoUrl", this.f10173a.mPlayContext.getVideoUrl());
            DWVideoViewController dWVideoViewController = this.h;
            hashMap.put("useCache", String.valueOf(dWVideoViewController != null ? dWVideoViewController.h0() : false));
            DWVideoViewController dWVideoViewController2 = this.h;
            hashMap.put("hitCache", String.valueOf(dWVideoViewController2 != null ? dWVideoViewController2.g0() : false));
            DWVideoViewController dWVideoViewController3 = this.h;
            if (dWVideoViewController3 != null) {
                z = dWVideoViewController3.f0();
            }
            hashMap.put("completeHitCache", String.valueOf(z));
            hashMap.put("usePlayManger", String.valueOf(this.A));
            hashMap.put("videoDefinition", this.f10173a.mPlayContext.getVideoDefinition());
            hashMap.put("useTBNet", String.valueOf(this.f10173a.mPlayContext.isUseTBNet()));
            hashMap.put("useHardwareHevc", String.valueOf(this.f10173a.mPlayContext.isHardwareHevc()));
            hashMap.put("useHardwareAvc", String.valueOf(this.f10173a.mPlayContext.isHardwareAvc()));
            hashMap.put("playToken", String.valueOf(this.f10173a.getPlayToken()));
            hashMap.putAll(this.f10173a.getUTParams());
            HashMap hashMap2 = new HashMap();
            hashMap2.put("first_frame_start", Double.valueOf(map.get("RENDER_START_TIME").longValue()));
            hashMap2.put("first_frame_end", Double.valueOf(map.get("RENDER_END_TIME").longValue()));
            hashMap2.put("first_frame_render", Double.valueOf(longValue));
            ((k95) this.f10173a.mDWAlarmAdapter).b("DWVideo", "first_frame_render", hashMap, hashMap2);
            if (MediaSystemUtils.isApkDebuggable()) {
                AVSDKLog.d(tfb.MODULE_SDK_PAGE, "--->commitMediaPlayerRender:" + hashMap2.toString() + " dimensionValues:" + hashMap.toString());
            }
            this.I = true;
        }
    }

    public final boolean h0(int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("132ccbc8", new Object[]{this, new Integer(i2), new Integer(i3)})).booleanValue();
        }
        if (!ew0.o(i2, OrangeConfig.getInstance().getConfig("DWInteractive", "vvcRetryErrorLists", "[13001]"))) {
            return false;
        }
        String videoUrl = this.f10173a.mPlayContext.getVideoUrl();
        if (TextUtils.isEmpty(videoUrl)) {
            return false;
        }
        this.i.Z();
        this.i.L(this.D);
        String videoUrl2 = this.f10173a.mPlayContext.getVideoUrl();
        if (TextUtils.isEmpty(videoUrl2) || videoUrl2.equals(videoUrl)) {
            return false;
        }
        this.f10173a.mPlayContext.unselectS266OfPlay();
        MediaPlayControlContext mediaPlayControlContext = this.f10173a.mPlayContext;
        mediaPlayControlContext.setDegradeCode(i2, mediaPlayControlContext.mSelectedUrlName);
        D0(false);
        return true;
    }
}
