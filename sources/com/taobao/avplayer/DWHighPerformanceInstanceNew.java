package com.taobao.avplayer;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.avplayer.playercontrol.DWControllerNew;
import com.taobao.media.DWViewUtil;
import com.taobao.media.MediaSystemUtils;
import com.taobao.mediaplay.MediaPlayControlContext;
import com.taobao.orange.OrangeConfig;
import com.taobao.phenix.intf.event.FailPhenixEvent;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import com.taobao.taobaoavsdk.AVSDKLog;
import com.taobao.taobaoavsdk.InterfaceUsageCounter;
import java.net.URI;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;
import tb.a95;
import tb.asc;
import tb.aub;
import tb.b75;
import tb.ctb;
import tb.cub;
import tb.dub;
import tb.e75;
import tb.eib;
import tb.eub;
import tb.ew0;
import tb.f75;
import tb.feh;
import tb.fsc;
import tb.fub;
import tb.g0d;
import tb.htb;
import tb.jsb;
import tb.ktb;
import tb.nj9;
import tb.psb;
import tb.qsb;
import tb.qtb;
import tb.s8d;
import tb.sj4;
import tb.spl;
import tb.stb;
import tb.t2o;
import tb.tfb;
import tb.tpl;
import tb.utb;
import tb.vtb;
import tb.x75;
import tb.xau;
import tb.y85;
import tb.ytb;
import tb.zsb;
import tb.ztb;
import tv.danmaku.ijk.media.player.IMediaPlayer;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class DWHighPerformanceInstanceNew implements ytb, ctb {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final boolean x = true;

    /* renamed from: a  reason: collision with root package name */
    public FrameLayout f10085a;
    public com.taobao.avplayer.a b;
    public a95 c;
    public final DWContext d;
    public List<asc> e;
    public boolean f;
    public boolean g;
    public nj9 h;
    public cub i;
    public final com.taobao.avplayer.music.a j;
    public jsb k;
    public ImageView l;
    public Boolean m = Boolean.FALSE;
    public final boolean n;
    public final DWControllerNew o;
    public y85 p;
    public final feh q;
    public qtb r;
    public qtb s;
    public boolean t;
    public spl u;
    public ztb v;
    public ytb w;

    /* compiled from: Taobao */
    /* renamed from: com.taobao.avplayer.DWHighPerformanceInstanceNew$7  reason: invalid class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class AnonymousClass7 extends FrameLayout {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public AnonymousClass7(Context context) {
            super(context);
        }

        public static /* synthetic */ Object ipc$super(AnonymousClass7 r2, String str, Object... objArr) {
            if (str.hashCode() == 2075560917) {
                return new Boolean(super.dispatchTouchEvent((MotionEvent) objArr[0]));
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/avplayer/DWHighPerformanceInstanceNew$7");
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("7bb68bd5", new Object[]{this, motionEvent})).booleanValue();
            }
            if (DWHighPerformanceInstanceNew.d(DWHighPerformanceInstanceNew.this)) {
                DWHighPerformanceInstanceNew.e(DWHighPerformanceInstanceNew.this).f(motionEvent);
            }
            super.dispatchTouchEvent(motionEvent);
            return true;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements s8d<FailPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        /* renamed from: a */
        public boolean onHappen(FailPhenixEvent failPhenixEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5fa0e8d0", new Object[]{this, failPhenixEvent})).booleanValue();
            }
            DWHighPerformanceInstanceNew.c(DWHighPerformanceInstanceNew.this, null);
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b implements s8d<SuccPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b(DWHighPerformanceInstanceNew dWHighPerformanceInstanceNew) {
        }

        /* renamed from: a */
        public boolean onHappen(SuccPhenixEvent succPhenixEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("362cccf4", new Object[]{this, succPhenixEvent})).booleanValue();
            }
            return true;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class c implements f75 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // tb.f75
        public void b(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8f691388", new Object[]{this, new Integer(i)});
            } else {
                DWHighPerformanceInstanceNew.this.R(i);
            }
        }

        @Override // tb.f75
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f099ea3d", new Object[]{this});
            } else if (DWHighPerformanceInstanceNew.this.U()) {
                DWHighPerformanceInstanceNew.this.W();
                DWHighPerformanceInstanceNew.f(DWHighPerformanceInstanceNew.this).updatePlayOrPauseButton(false);
            } else {
                DWHighPerformanceInstanceNew.this.O0();
                DWHighPerformanceInstanceNew.f(DWHighPerformanceInstanceNew.this).updatePlayOrPauseButton(true);
            }
        }

        @Override // tb.f75
        public void seekTo(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("49645829", new Object[]{this, new Integer(i)});
            } else {
                DWHighPerformanceInstanceNew.this.d0(i);
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
            } else if (DWHighPerformanceInstanceNew.m(DWHighPerformanceInstanceNew.this) != null) {
                DWHighPerformanceInstanceNew.m(DWHighPerformanceInstanceNew.this).requestLayout();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class e implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                DWHighPerformanceInstanceNew.b(DWHighPerformanceInstanceNew.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static /* synthetic */ class f {
        public static final /* synthetic */ int[] $SwitchMap$com$taobao$avplayer$DWInstanceType;

        static {
            int[] iArr = new int[DWInstanceType.values().length];
            $SwitchMap$com$taobao$avplayer$DWInstanceType = iArr;
            try {
                iArr[DWInstanceType.VIDEO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$taobao$avplayer$DWInstanceType[DWInstanceType.PIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class g implements eib {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final DWHighPerformanceInstanceNew f10090a;

        static {
            t2o.a(452984870);
            t2o.a(452985119);
        }

        public g(DWHighPerformanceInstanceNew dWHighPerformanceInstanceNew) {
            this.f10090a = dWHighPerformanceInstanceNew;
            feh a2 = DWHighPerformanceInstanceNew.a(DWHighPerformanceInstanceNew.this);
            AVSDKLog.e(a2, "BackgroundMusicPlayer mOuterInstance=" + dWHighPerformanceInstanceNew);
        }

        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e32ba67f", new Object[]{this});
                return;
            }
            AVSDKLog.e(DWHighPerformanceInstanceNew.a(DWHighPerformanceInstanceNew.this), "BackgroundMusicPlayer close");
            DWHighPerformanceInstanceNew.k(this.f10090a);
        }

        public DWContext b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DWContext) ipChange.ipc$dispatch("8525c6a8", new Object[]{this});
            }
            return DWHighPerformanceInstanceNew.this.d;
        }

        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6b88b564", new Object[]{this});
                return;
            }
            AVSDKLog.e(DWHighPerformanceInstanceNew.a(DWHighPerformanceInstanceNew.this), "BackgroundMusicPlayer notificationClick");
            if (DWHighPerformanceInstanceNew.l(this.f10090a) != null) {
                DWHighPerformanceInstanceNew.l(this.f10090a).a();
            }
        }

        public void d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c3e715d4", new Object[]{this});
                return;
            }
            AVSDKLog.e(DWHighPerformanceInstanceNew.a(DWHighPerformanceInstanceNew.this), "BackgroundMusicPlayer notificationClose");
            if (DWHighPerformanceInstanceNew.l(this.f10090a) != null) {
                DWHighPerformanceInstanceNew.l(this.f10090a).d();
            }
        }

        public void e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("315dbf7d", new Object[]{this});
                return;
            }
            AVSDKLog.e(DWHighPerformanceInstanceNew.a(DWHighPerformanceInstanceNew.this), "BackgroundMusicPlayer pause");
            DWHighPerformanceInstanceNew.i(this.f10090a);
        }

        public void f() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6fe955bb", new Object[]{this});
                return;
            }
            AVSDKLog.e(DWHighPerformanceInstanceNew.a(DWHighPerformanceInstanceNew.this), "BackgroundMusicPlayer play");
            DWHighPerformanceInstanceNew.g(this.f10090a);
        }

        public void g(int i, boolean z, boolean z2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("81c54c69", new Object[]{this, new Integer(i), new Boolean(z), new Boolean(z2)});
                return;
            }
            AVSDKLog.e(DWHighPerformanceInstanceNew.a(DWHighPerformanceInstanceNew.this), "BackgroundMusicPlayer seekTo");
            DWHighPerformanceInstanceNew.j(this.f10090a, i, z, z2);
        }

        public void h() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3dc45474", new Object[]{this});
                return;
            }
            AVSDKLog.e(DWHighPerformanceInstanceNew.a(DWHighPerformanceInstanceNew.this), "BackgroundMusicPlayer skipToNext");
            if (DWHighPerformanceInstanceNew.l(this.f10090a) != null) {
                DWHighPerformanceInstanceNew.l(this.f10090a).b();
            }
        }

        public void i() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("28111578", new Object[]{this});
                return;
            }
            AVSDKLog.e(DWHighPerformanceInstanceNew.a(DWHighPerformanceInstanceNew.this), "BackgroundMusicPlayer skipToPrevious");
            if (DWHighPerformanceInstanceNew.l(this.f10090a) != null) {
                DWHighPerformanceInstanceNew.l(this.f10090a).c();
            }
        }

        public void j() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("810347e9", new Object[]{this});
                return;
            }
            AVSDKLog.e(DWHighPerformanceInstanceNew.a(DWHighPerformanceInstanceNew.this), "BackgroundMusicPlayer start");
            DWHighPerformanceInstanceNew.h(this.f10090a);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class i {
        public String E;
        public String F;
        public boolean H;
        public DWAspectRatio I;
        public Surface J;
        public JSONObject P;
        public String R;
        public boolean S;
        public boolean T;
        public boolean V;
        public String W;
        public String X;

        /* renamed from: a  reason: collision with root package name */
        public String f10092a;
        public Activity b;
        public Context c;
        public asc c0;
        public String d;
        public String d0;
        public String f;
        public String g;
        public String h;
        public zsb h0;
        public String i;
        public g0d i0;
        public String j;
        public int m;
        public int n;
        public String o;
        public ktb p;
        public vtb q;
        public psb r;
        public qsb s;
        public stb t;
        public utb u;
        public Map<String, String> v;
        public Map<String, String> w;
        public Map<String, String> x;
        public boolean z;
        public long e = -1;
        public int k = 0;
        public int l = 0;
        public boolean y = true;
        public boolean A = true;
        public boolean B = true;
        public boolean C = false;
        public final DWVideoScreenType D = DWVideoScreenType.NORMAL;
        public DWInstanceType K = DWInstanceType.VIDEO;
        public boolean L = true;
        public boolean M = false;
        public boolean N = false;
        public boolean O = false;
        public final float Q = -1.0f;
        public HashMap<String, String> U = new HashMap<>();
        public boolean Y = false;
        public boolean Z = false;
        public boolean a0 = false;
        public boolean b0 = true;
        public boolean e0 = false;
        public boolean f0 = false;
        public boolean g0 = false;

        static {
            t2o.a(452984872);
        }
    }

    static {
        t2o.a(452984861);
        t2o.a(452985011);
        t2o.a(452985037);
    }

    /* JADX WARN: Code restructure failed: missing block: B:73:0x035a, code lost:
        if (r1.mBackgroundAudio != false) goto L_0x035c;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public DWHighPerformanceInstanceNew(com.taobao.avplayer.DWHighPerformanceInstanceNew.i r10) {
        /*
            Method dump skipped, instructions count: 980
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.avplayer.DWHighPerformanceInstanceNew.<init>(com.taobao.avplayer.DWHighPerformanceInstanceNew$i):void");
    }

    public static /* synthetic */ feh a(DWHighPerformanceInstanceNew dWHighPerformanceInstanceNew) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (feh) ipChange.ipc$dispatch("66659f6b", new Object[]{dWHighPerformanceInstanceNew});
        }
        return dWHighPerformanceInstanceNew.q;
    }

    public static /* synthetic */ void b(DWHighPerformanceInstanceNew dWHighPerformanceInstanceNew) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f26a56df", new Object[]{dWHighPerformanceInstanceNew});
        } else {
            dWHighPerformanceInstanceNew.A();
        }
    }

    public static /* synthetic */ ImageView c(DWHighPerformanceInstanceNew dWHighPerformanceInstanceNew, ImageView imageView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ImageView) ipChange.ipc$dispatch("afd79b43", new Object[]{dWHighPerformanceInstanceNew, imageView});
        }
        dWHighPerformanceInstanceNew.l = imageView;
        return imageView;
    }

    public static /* synthetic */ boolean d(DWHighPerformanceInstanceNew dWHighPerformanceInstanceNew) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("17fe5fe4", new Object[]{dWHighPerformanceInstanceNew})).booleanValue();
        }
        return dWHighPerformanceInstanceNew.t;
    }

    public static /* synthetic */ tpl e(DWHighPerformanceInstanceNew dWHighPerformanceInstanceNew) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tpl) ipChange.ipc$dispatch("62fc1813", new Object[]{dWHighPerformanceInstanceNew});
        }
        dWHighPerformanceInstanceNew.getClass();
        return null;
    }

    public static /* synthetic */ DWControllerNew f(DWHighPerformanceInstanceNew dWHighPerformanceInstanceNew) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DWControllerNew) ipChange.ipc$dispatch("bfd769cb", new Object[]{dWHighPerformanceInstanceNew});
        }
        return dWHighPerformanceInstanceNew.o;
    }

    public static /* synthetic */ void g(DWHighPerformanceInstanceNew dWHighPerformanceInstanceNew) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95fc4e73", new Object[]{dWHighPerformanceInstanceNew});
        } else {
            dWHighPerformanceInstanceNew.Z();
        }
    }

    public static /* synthetic */ void h(DWHighPerformanceInstanceNew dWHighPerformanceInstanceNew) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb905774", new Object[]{dWHighPerformanceInstanceNew});
        } else {
            dWHighPerformanceInstanceNew.P0();
        }
    }

    public static /* synthetic */ void i(DWHighPerformanceInstanceNew dWHighPerformanceInstanceNew) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1246075", new Object[]{dWHighPerformanceInstanceNew});
        } else {
            dWHighPerformanceInstanceNew.X();
        }
    }

    public static /* synthetic */ void j(DWHighPerformanceInstanceNew dWHighPerformanceInstanceNew, int i2, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ffeb38d", new Object[]{dWHighPerformanceInstanceNew, new Integer(i2), new Boolean(z), new Boolean(z2)});
        } else {
            dWHighPerformanceInstanceNew.f0(i2, z, z2);
        }
    }

    public static /* synthetic */ void k(DWHighPerformanceInstanceNew dWHighPerformanceInstanceNew) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c4c7277", new Object[]{dWHighPerformanceInstanceNew});
        } else {
            dWHighPerformanceInstanceNew.v();
        }
    }

    public static /* synthetic */ jsb l(DWHighPerformanceInstanceNew dWHighPerformanceInstanceNew) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jsb) ipChange.ipc$dispatch("95a54bd9", new Object[]{dWHighPerformanceInstanceNew});
        }
        return dWHighPerformanceInstanceNew.k;
    }

    public static /* synthetic */ FrameLayout m(DWHighPerformanceInstanceNew dWHighPerformanceInstanceNew) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("661d80c0", new Object[]{dWHighPerformanceInstanceNew});
        }
        return dWHighPerformanceInstanceNew.f10085a;
    }

    public final void A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("396447fa", new Object[]{this});
            return;
        }
        a95 a95Var = this.c;
        if (a95Var != null && a95Var.c() != null) {
            this.c.c().setVisibility(8);
            this.c.b();
            this.c = null;
        }
    }

    public void A0(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d585fd3", new Object[]{this, new Integer(i2)});
            return;
        }
        InterfaceUsageCounter.b().a(InterfaceUsageCounter.InterfaceName.hp_setReadTimeout);
        this.d.mReadTimeout = i2;
    }

    public int B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b656e206", new Object[]{this})).intValue();
        }
        InterfaceUsageCounter.b().a(InterfaceUsageCounter.InterfaceName.hp_getCurrentPosition);
        if (this.b == null || this.d.getVideo() == null) {
            return 0;
        }
        return this.d.getVideo().getCurrentPosition();
    }

    public void B0(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1cdc93e9", new Object[]{this, new Integer(i2)});
            return;
        }
        InterfaceUsageCounter.b().a(InterfaceUsageCounter.InterfaceName.hp_setRetryTime);
        this.d.mRetryTime = i2;
    }

    public long C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ed837a85", new Object[]{this})).longValue();
        }
        InterfaceUsageCounter.b().a(InterfaceUsageCounter.InterfaceName.hp_getDuration);
        DWContext dWContext = this.d;
        if (dWContext == null || dWContext.getVideo() == null) {
            return 0L;
        }
        return this.d.getVideo().getDuration();
    }

    public void C0(qtb qtbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc1ec190", new Object[]{this, qtbVar});
            return;
        }
        InterfaceUsageCounter.b().a(InterfaceUsageCounter.InterfaceName.hp_setRootViewClickListener);
        this.s = qtbVar;
        com.taobao.avplayer.a aVar = this.b;
        if (aVar != null) {
            aVar.r0(qtbVar);
        }
    }

    public String D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("22b0754e", new Object[]{this});
        }
        InterfaceUsageCounter.b().a(InterfaceUsageCounter.InterfaceName.hp_getLogToken);
        DWContext dWContext = this.d;
        if (dWContext != null) {
            return dWContext.getPlayToken();
        }
        return null;
    }

    public void D0(HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2e7be85", new Object[]{this, hashMap});
            return;
        }
        InterfaceUsageCounter.b().a(InterfaceUsageCounter.InterfaceName.hp_setUTParams);
        DWContext dWContext = this.d;
        if (dWContext != null && hashMap != null) {
            dWContext.addUtParams(hashMap);
        }
    }

    public String E() {
        MediaPlayControlContext mediaPlayControlContext;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("854e018c", new Object[]{this});
        }
        InterfaceUsageCounter.b().a(InterfaceUsageCounter.InterfaceName.hp_getMediaPlayUrl);
        DWContext dWContext = this.d;
        if (dWContext == null || (mediaPlayControlContext = dWContext.mPlayContext) == null) {
            return "";
        }
        return mediaPlayControlContext.getVideoUrl();
    }

    public void E0(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a58b880", new Object[]{this, new Integer(i2)});
            return;
        }
        InterfaceUsageCounter.b().a(InterfaceUsageCounter.InterfaceName.hp_setVideoBackgroundColor);
        com.taobao.avplayer.a aVar = this.b;
        if (aVar != null) {
            aVar.s0(i2);
        }
    }

    public Map<String, String> F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("438347ba", new Object[]{this});
        }
        InterfaceUsageCounter.b().a(InterfaceUsageCounter.InterfaceName.hp_getPlayerQos);
        com.taobao.avplayer.a aVar = this.b;
        if (aVar != null) {
            return aVar.Q();
        }
        return null;
    }

    public void F0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a27a7a5", new Object[]{this, str});
            return;
        }
        InterfaceUsageCounter.b().a(InterfaceUsageCounter.InterfaceName.hp_setVideoID);
        if (!this.f) {
            DWContext dWContext = this.d;
            dWContext.mPlayContext.mVideoId = str;
            dWContext.mVideoId = str;
        }
    }

    public int G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("867fcec6", new Object[]{this})).intValue();
        }
        InterfaceUsageCounter.b().a(InterfaceUsageCounter.InterfaceName.hp_getVideoHeight);
        DWContext dWContext = this.d;
        if (dWContext == null || dWContext.getVideo() == null) {
            return 0;
        }
        return this.d.getVideo().getVideoHeight();
    }

    public void G0(ztb ztbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17d7471c", new Object[]{this, ztbVar});
            return;
        }
        InterfaceUsageCounter.b().a(InterfaceUsageCounter.InterfaceName.hp_setVideoLifecycleListener);
        this.v = ztbVar;
    }

    public int H() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("85134b46", new Object[]{this})).intValue();
        }
        InterfaceUsageCounter.b().a(InterfaceUsageCounter.InterfaceName.hp_getVideoState);
        if (this.d.getVideo() == null) {
            return 0;
        }
        return this.d.getVideo().getVideoState();
    }

    public void H0(ytb ytbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd04dc4a", new Object[]{this, ytbVar});
            return;
        }
        InterfaceUsageCounter.b().a(InterfaceUsageCounter.InterfaceName.hp_setVideoLifecycleListener2);
        this.w = ytbVar;
    }

    public String I() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4bd55545", new Object[]{this});
        }
        InterfaceUsageCounter.b().a(InterfaceUsageCounter.InterfaceName.hp_getVideoToken);
        com.taobao.avplayer.a aVar = this.b;
        if (aVar != null) {
            return aVar.T();
        }
        return null;
    }

    public void I0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("127f99d0", new Object[]{this, new Boolean(z)});
            return;
        }
        InterfaceUsageCounter.b().a(InterfaceUsageCounter.InterfaceName.hp_setVideoLoop);
        DWContext dWContext = this.d;
        if (dWContext != null) {
            dWContext.setLooping(z);
        }
        com.taobao.avplayer.a aVar = this.b;
        if (aVar != null) {
            aVar.t0(z);
        }
    }

    public int J() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fe5511fb", new Object[]{this})).intValue();
        }
        InterfaceUsageCounter.b().a(InterfaceUsageCounter.InterfaceName.hp_getVideoWidth);
        DWContext dWContext = this.d;
        if (dWContext == null || dWContext.getVideo() == null) {
            return 0;
        }
        return this.d.getVideo().getVideoWidth();
    }

    public void J0(cub cubVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7cb08e2a", new Object[]{this, cubVar});
            return;
        }
        InterfaceUsageCounter.b().a(InterfaceUsageCounter.InterfaceName.hp_setVideoPlayTimeListener);
        this.i = cubVar;
    }

    public ViewGroup K() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("cbb4b1b3", new Object[]{this});
        }
        InterfaceUsageCounter.b().a(InterfaceUsageCounter.InterfaceName.hp_getView);
        if (this.d.getExternSurface() != null) {
            return null;
        }
        return this.f10085a;
    }

    public void K0(eub eubVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21c5800a", new Object[]{this, eubVar});
            return;
        }
        InterfaceUsageCounter.b().a(InterfaceUsageCounter.InterfaceName.hp_setVideoRecycleListener);
        com.taobao.avplayer.a aVar = this.b;
        if (aVar != null) {
            aVar.u0(eubVar);
        }
    }

    public void L(i iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("852064f2", new Object[]{this, iVar});
        }
    }

    public void L0(fsc fscVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b7ec244", new Object[]{this, fscVar});
            return;
        }
        InterfaceUsageCounter.b().a(InterfaceUsageCounter.InterfaceName.hp_setVideoRecycleListener2);
        com.taobao.avplayer.a aVar = this.b;
        if (aVar != null) {
            aVar.v0(fscVar);
        }
    }

    public void M(i iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ec2657e", new Object[]{this, iVar});
            return;
        }
        InterfaceUsageCounter.b().a(InterfaceUsageCounter.InterfaceName.hp_initControlParams);
        Map<String, String> map = iVar.x;
        if (map != null) {
            this.d.addControlParams(map);
        }
    }

    public void M0(float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3942a77d", new Object[]{this, new Float(f2)});
            return;
        }
        InterfaceUsageCounter.b().a(InterfaceUsageCounter.InterfaceName.hp_setVolume);
        if (f2 >= 0.0f && f2 <= 1.0f) {
            com.taobao.avplayer.a aVar = this.b;
            if (aVar != null) {
                aVar.x0(f2);
            }
            DWContext dWContext = this.d;
            if (dWContext != null) {
                dWContext.setVolume(f2);
            }
        }
    }

    public final void N() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("276d9924", new Object[]{this});
            return;
        }
        this.d.setInstanceType(DWInstanceType.PIC);
        a95 a95Var = new a95(this.d);
        this.c = a95Var;
        a95Var.e(this.r);
        DWContext dWContext = this.d;
        this.f10085a.addView(this.c.c(), new FrameLayout.LayoutParams(dWContext.mWidth, dWContext.mHeight));
    }

    public void O(i iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c88f10d3", new Object[]{this, iVar});
            return;
        }
        InterfaceUsageCounter.b().a(InterfaceUsageCounter.InterfaceName.hp_initPlayExpUTParams);
        Map<String, String> map = iVar.w;
        if (map != null) {
            this.d.addPlayExpUtParams(map);
        }
    }

    public void O0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810347e9", new Object[]{this});
            return;
        }
        InterfaceUsageCounter.b().a(InterfaceUsageCounter.InterfaceName.hp_start);
        AVSDKLog.e(this.q, " start");
        com.taobao.avplayer.music.a aVar = this.j;
        if (aVar != null) {
            aVar.x();
            return;
        }
        y85 y85Var = this.p;
        if (y85Var != null) {
            y85Var.n();
        }
        P0();
        AVSDKLog.e(this.q, " start finished");
    }

    public final void P(i iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a63edbbc", new Object[]{this, iVar});
            return;
        }
        HashMap hashMap = new HashMap();
        if (this.d.mInteractiveId != -1) {
            hashMap.put("interactId", this.d.mInteractiveId + "");
        }
        long j = this.d.mUserId;
        if (j != -1) {
            hashMap.put("userId", String.valueOf(j));
        }
        if (!TextUtils.isEmpty(this.d.mFrom)) {
            hashMap.put("page", this.d.mFrom.toLowerCase());
        }
        if (!TextUtils.isEmpty(this.d.mContentId)) {
            hashMap.put("contentId", this.d.mContentId);
        }
        hashMap.put(xau.PROPERTY_VIDEO_ID, this.d.mVideoId + "");
        hashMap.put("videoSource", this.d.mVideoSource + "");
        hashMap.put("mediaType", "1");
        hashMap.put("playerScene", "highPerformance");
        Map<String, String> map = iVar.v;
        if (map != null) {
            hashMap.putAll(map);
        }
        this.d.addUtParams(hashMap);
    }

    public final void P0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb56e19b", new Object[]{this});
            return;
        }
        InterfaceUsageCounter.b().a(InterfaceUsageCounter.InterfaceName.hp_startInner);
        AVSDKLog.e(this.q, " startInner");
        com.taobao.avplayer.a aVar = this.b;
        if (aVar != null) {
            aVar.z0();
        }
    }

    public void Q0(String str, boolean z, HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27a4ec07", new Object[]{this, str, new Boolean(z), hashMap});
            return;
        }
        InterfaceUsageCounter.b().a(InterfaceUsageCounter.InterfaceName.hp_switchPlayerScene);
        if (this.b == null) {
            return;
        }
        if (hashMap == null) {
            Map<String, String> uTParams = this.d.getUTParams();
            if (uTParams != null) {
                this.b.A0(str, z, uTParams);
                return;
            }
            return;
        }
        DWContext dWContext = this.d;
        if (dWContext != null) {
            dWContext.addUtParams(hashMap);
        }
        this.b.A0(str, z, hashMap);
    }

    public void R(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f691388", new Object[]{this, new Integer(i2)});
            return;
        }
        com.taobao.avplayer.a aVar = this.b;
        if (aVar != null) {
            aVar.W(i2);
        }
    }

    public void R0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e3aad67", new Object[]{this});
            return;
        }
        com.taobao.avplayer.a aVar = this.b;
        if (aVar != null) {
            aVar.B0();
        }
    }

    public boolean S() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("14380eb0", new Object[]{this})).booleanValue();
        }
        InterfaceUsageCounter.b().a(InterfaceUsageCounter.InterfaceName.hp_isFullScreen);
        if (this.d.screenType() == DWVideoScreenType.PORTRAIT_FULL_SCREEN || this.d.screenType() == DWVideoScreenType.LANDSCAPE_FULL_SCREEN) {
            return true;
        }
        return false;
    }

    public void S0(float f2, float f3, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12f6043f", new Object[]{this, new Float(f2), new Float(f3), new Integer(i2), new Integer(i3)});
            return;
        }
        InterfaceUsageCounter.b().a(InterfaceUsageCounter.InterfaceName.hp_volumeFadeInWithCustomParams);
        com.taobao.avplayer.a aVar = this.b;
        if (aVar != null) {
            aVar.D0(f2, f3, i2, i3);
        }
    }

    public boolean T() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("467c96e", new Object[]{this})).booleanValue();
        }
        InterfaceUsageCounter.b().a(InterfaceUsageCounter.InterfaceName.hp_isMute);
        DWContext dWContext = this.d;
        if (dWContext == null || !dWContext.isMute()) {
            return false;
        }
        return true;
    }

    public boolean U() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9a3f2a2f", new Object[]{this})).booleanValue();
        }
        InterfaceUsageCounter.b().a(InterfaceUsageCounter.InterfaceName.hp_isPlaying);
        com.taobao.avplayer.a aVar = this.b;
        if (aVar != null) {
            return aVar.X();
        }
        return false;
    }

    public void V(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4254d4b4", new Object[]{this, new Boolean(z)});
            return;
        }
        InterfaceUsageCounter.b().a(InterfaceUsageCounter.InterfaceName.hp_mute);
        feh fehVar = this.q;
        AVSDKLog.e(fehVar, "DWHighPerformanceInstance this=, mute=" + z);
        this.d.mute(z);
        com.taobao.avplayer.a aVar = this.b;
        if (aVar != null) {
            aVar.Y(z);
        } else {
            AVSDKLog.e(this.q, "DWHighPerformanceInstance this=, mDWHighPerformanceVideoController is null");
        }
    }

    public void W() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf67322c", new Object[]{this});
            return;
        }
        InterfaceUsageCounter.b().a(InterfaceUsageCounter.InterfaceName.hp_pauseVideo);
        com.taobao.avplayer.music.a aVar = this.j;
        if (aVar != null) {
            aVar.p();
        } else {
            X();
        }
    }

    public final void X() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d329e938", new Object[]{this});
            return;
        }
        AVSDKLog.e(this.q, " pauseVideoInner");
        com.taobao.avplayer.a aVar = this.b;
        if (aVar != null) {
            aVar.c0();
        }
    }

    public void Y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4075d2ae", new Object[]{this});
            return;
        }
        InterfaceUsageCounter.b().a(InterfaceUsageCounter.InterfaceName.hp_playVideo);
        com.taobao.avplayer.music.a aVar = this.j;
        if (aVar != null) {
            aVar.r();
        } else {
            Z();
        }
    }

    public final void Z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b01549f6", new Object[]{this});
            return;
        }
        AVSDKLog.e(this.q, " playVideoInner");
        com.taobao.avplayer.a aVar = this.b;
        if (aVar != null) {
            aVar.d0();
        }
    }

    public void a0() {
        com.taobao.avplayer.a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f50cd26", new Object[]{this});
            return;
        }
        InterfaceUsageCounter.b().a(InterfaceUsageCounter.InterfaceName.hp_prepareToFirstFrame);
        if (this.f && (aVar = this.b) != null) {
            aVar.e0();
        }
    }

    public void b0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5a8082e", new Object[]{this});
            return;
        }
        InterfaceUsageCounter.b().a(InterfaceUsageCounter.InterfaceName.hp_refreshScreen);
        if (this.b != null && this.d.getVideo() != null) {
            this.d.getVideo().refreshScreen();
        }
    }

    public void c0(asc ascVar) {
        List<asc> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f2b3f24", new Object[]{this, ascVar});
        } else if (ascVar != null && (list = this.e) != null) {
            list.remove(ascVar);
        }
    }

    public void d0(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49645829", new Object[]{this, new Integer(i2)});
            return;
        }
        InterfaceUsageCounter.b().a(InterfaceUsageCounter.InterfaceName.hp_seekTo);
        com.taobao.avplayer.a aVar = this.b;
        if (aVar != null) {
            aVar.h0(i2);
        }
    }

    public void e0(int i2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3275fcb", new Object[]{this, new Integer(i2), new Boolean(z)});
            return;
        }
        InterfaceUsageCounter.b().a(InterfaceUsageCounter.InterfaceName.hp_seekTo2);
        com.taobao.avplayer.a aVar = this.b;
        if (aVar != null) {
            aVar.i0(i2, z, false);
        }
    }

    public final void f0(int i2, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3f5e279", new Object[]{this, new Integer(i2), new Boolean(z), new Boolean(z2)});
            return;
        }
        feh fehVar = this.q;
        AVSDKLog.e(fehVar, " seekToInner " + i2);
        com.taobao.avplayer.a aVar = this.b;
        if (aVar != null) {
            aVar.i0(i2, z, z2);
        }
    }

    public void g0(Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("939d18e2", new Object[]{this, bitmap});
            return;
        }
        InterfaceUsageCounter.b().a(InterfaceUsageCounter.InterfaceName.hp_setAlbumArtBitmap);
        feh fehVar = this.q;
        AVSDKLog.e(fehVar, " setAlbumArtBitmap " + bitmap);
        this.d.mAlbumArtBitamp = bitmap;
        com.taobao.avplayer.music.a aVar = this.j;
        if (aVar != null) {
            aVar.A();
        }
    }

    public void h0(jsb jsbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("804f4f6a", new Object[]{this, jsbVar});
            return;
        }
        InterfaceUsageCounter.b().a(InterfaceUsageCounter.InterfaceName.hp_setAudioListener);
        this.k = jsbVar;
    }

    public void i0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d29306ef", new Object[]{this, str});
            return;
        }
        InterfaceUsageCounter.b().a(InterfaceUsageCounter.InterfaceName.hp_setBizCode);
        if (!this.f) {
            this.d.mFrom = str;
        }
    }

    public void j0(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fabec0e3", new Object[]{this, new Integer(i2)});
            return;
        }
        InterfaceUsageCounter.b().a(InterfaceUsageCounter.InterfaceName.hp_setConnectTimeout);
        this.d.mConnectTimeout = i2;
    }

    public void k0(nj9 nj9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2ed34d3", new Object[]{this, nj9Var});
            return;
        }
        InterfaceUsageCounter.b().a(InterfaceUsageCounter.InterfaceName.hp_setFirstRenderAdapter);
        DWContext dWContext = this.d;
        if (dWContext != null) {
            if (nj9Var != null) {
                dWContext.setNeedCommitUserToFirstFrame(true);
            } else {
                dWContext.setNeedCommitUserToFirstFrame(false);
            }
        }
        com.taobao.avplayer.a aVar = this.b;
        if (aVar != null) {
            aVar.j0(nj9Var);
        } else {
            this.h = nj9Var;
        }
    }

    public void l0(float f2, float f3, float f4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66bab26e", new Object[]{this, new Float(f2), new Float(f3), new Float(f4)});
            return;
        }
        InterfaceUsageCounter.b().a(InterfaceUsageCounter.InterfaceName.hp_setFov);
        if (this.b != null && this.d.getVideo() != null) {
            this.d.getVideo().setFov(f2, f3, f4);
        }
    }

    public void m0(int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2487bd12", new Object[]{this, new Integer(i2), new Integer(i3)});
            return;
        }
        InterfaceUsageCounter.b().a(InterfaceUsageCounter.InterfaceName.hp_setFrame);
        DWContext dWContext = this.d;
        dWContext.mWidth = i2;
        dWContext.mHeight = i3;
        if (!dWContext.isFloating()) {
            DWContext dWContext2 = this.d;
            dWContext2.mNormalWidth = i2;
            dWContext2.mNormalHeight = i3;
        }
        feh fehVar = this.q;
        AVSDKLog.e(fehVar, " setFrame " + i2 + ", " + i3);
        if (this.b != null && this.f10085a != null) {
            DWContext dWContext3 = this.d;
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(dWContext3.mWidth, dWContext3.mHeight);
            if (this.b.U().getParent() == null) {
                feh fehVar2 = this.q;
                AVSDKLog.e(fehVar2, " setFrame addView, " + i2 + ", " + i3);
                this.f10085a.addView(this.b.U(), layoutParams);
            } else {
                feh fehVar3 = this.q;
                AVSDKLog.e(fehVar3, " setFrame reset, " + i2 + ", " + i3);
                this.b.U().getLayoutParams().width = this.d.mWidth;
                this.b.U().getLayoutParams().height = this.d.mHeight;
            }
            FrameLayout frameLayout = this.f10085a;
            if (frameLayout != null) {
                frameLayout.post(new d());
            }
        }
    }

    public void n(HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0193d6a", new Object[]{this, hashMap});
            return;
        }
        InterfaceUsageCounter.b().a(InterfaceUsageCounter.InterfaceName.hp_addControlParams);
        this.d.addControlParams(hashMap);
    }

    public void n0(int i2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8950038a", new Object[]{this, new Integer(i2), new Boolean(z)});
            return;
        }
        String config = OrangeConfig.getInstance().getConfig("DWInteractive", "gradualVolumeSBTList", "[\"newdetail_main\"]");
        if (TextUtils.isEmpty(this.d.mFrom) || !ew0.n(this.d.mFrom, config)) {
            feh fehVar = this.q;
            AVSDKLog.e(fehVar, "DWHighPerformanceInstanceNew setGradualVolumeWithConfig return, sbt=" + this.d.mFrom);
            return;
        }
        feh fehVar2 = this.q;
        AVSDKLog.e(fehVar2, "DWHighPerformanceInstanceNew setGradualVolumeWithConfig gradualTime=" + i2 + ", switchFadeIn =" + z);
        com.taobao.avplayer.a aVar = this.b;
        if (aVar != null) {
            aVar.k0(i2, z);
        }
    }

    public void o(HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30bcd334", new Object[]{this, hashMap});
            return;
        }
        InterfaceUsageCounter.b().a(InterfaceUsageCounter.InterfaceName.hp_addCustomParams);
        this.d.addCustomParams(hashMap);
    }

    public void o0(htb htbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46bb02b4", new Object[]{this, htbVar});
            return;
        }
        InterfaceUsageCounter.b().a(InterfaceUsageCounter.InterfaceName.hp_setIDWMutedChangeListener);
        com.taobao.avplayer.a aVar = this.b;
        if (aVar != null) {
            aVar.l0(htbVar);
        }
    }

    @Override // tb.ctb
    public void onLifecycleChanged(DWLifecycleType dWLifecycleType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e41106", new Object[]{this, dWLifecycleType});
            return;
        }
        InterfaceUsageCounter.b().a(InterfaceUsageCounter.InterfaceName.hp_onLifecycleChanged);
        feh fehVar = this.q;
        AVSDKLog.e(fehVar, " onLifecycleChanged " + dWLifecycleType);
        if (dWLifecycleType == DWLifecycleType.MID) {
            if (this.c != null) {
                AVSDKLog.e(this.q, " onLifecycleChanged hide cover");
                this.c.c().setVisibility(4);
                return;
            }
            ImageView imageView = this.l;
            if (imageView != null) {
                imageView.setVisibility(4);
            }
        } else if (dWLifecycleType != DWLifecycleType.BEFORE) {
        } else {
            if (this.c != null) {
                AVSDKLog.e(this.q, " onLifecycleChanged hide cover");
                this.c.c().setVisibility(0);
                return;
            }
            ImageView imageView2 = this.l;
            if (imageView2 != null) {
                imageView2.setVisibility(0);
            }
        }
    }

    @Override // tb.ytb
    public void onVideoClose() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24db3403", new Object[]{this});
            return;
        }
        InterfaceUsageCounter.b().a(InterfaceUsageCounter.InterfaceName.hp_onVideoClose);
        ImageView imageView = this.l;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        List<asc> list = this.e;
        if (list != null) {
            for (asc ascVar : list) {
                ascVar.onMediaClose();
            }
        }
        ztb ztbVar = this.v;
        if (ztbVar != null) {
            ztbVar.onVideoClose();
        }
        ytb ytbVar = this.w;
        if (ytbVar != null) {
            ytbVar.onVideoClose();
        }
    }

    @Override // tb.ytb
    public void onVideoComplete() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3c2c53c", new Object[]{this});
            return;
        }
        InterfaceUsageCounter.b().a(InterfaceUsageCounter.InterfaceName.hp_onVideoComplete);
        List<asc> list = this.e;
        if (list != null) {
            Iterator it = ((CopyOnWriteArrayList) list).iterator();
            while (it.hasNext()) {
                ((asc) it.next()).onMediaComplete();
            }
        }
        ztb ztbVar = this.v;
        if (ztbVar != null) {
            ztbVar.onVideoComplete();
        }
        ytb ytbVar = this.w;
        if (ytbVar != null) {
            ytbVar.onVideoComplete();
        }
    }

    @Override // tb.ytb
    public void onVideoError(Object obj, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7a1a1cf", new Object[]{this, obj, new Integer(i2), new Integer(i3)});
            return;
        }
        InterfaceUsageCounter.b().a(InterfaceUsageCounter.InterfaceName.hp_onVideoError);
        feh fehVar = this.q;
        AVSDKLog.e(fehVar, " onVideoError " + i2 + ", " + i3);
        ztb ztbVar = this.v;
        if (ztbVar != null) {
            ztbVar.onVideoError(obj, i2, i3);
        }
        ytb ytbVar = this.w;
        if (ytbVar != null) {
            ytbVar.onVideoError(obj, i2, i3);
        }
        List<asc> list = this.e;
        if (list != null) {
            for (asc ascVar : list) {
                if (obj instanceof IMediaPlayer) {
                    ascVar.onMediaError((IMediaPlayer) obj, i2, i3);
                } else {
                    ascVar.onMediaError(null, i2, i3);
                }
            }
        }
    }

    @Override // tb.ytb
    public void onVideoInfo(Object obj, long j, long j2, long j3, Object obj2) {
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59f3ed73", new Object[]{this, obj, new Long(j), new Long(j2), new Long(j3), obj2});
            return;
        }
        InterfaceUsageCounter.b().a(InterfaceUsageCounter.InterfaceName.hp_onVideoInfo);
        List<asc> list = this.e;
        if (list != null) {
            Iterator it = ((CopyOnWriteArrayList) list).iterator();
            while (it.hasNext()) {
                asc ascVar = (asc) it.next();
                if (obj instanceof asc) {
                    ascVar.onMediaInfo((IMediaPlayer) obj, j, j2, j3, obj2);
                } else {
                    ascVar.onMediaInfo(null, j, j2, j3, obj2);
                }
            }
        }
        if (j == 11000 || j == 3) {
            if (!this.t) {
                this.m = Boolean.TRUE;
            } else {
                throw null;
            }
        } else if (j == 12100 || i2 == 0) {
            ImageView imageView = this.l;
            if (imageView != null) {
                imageView.setVisibility(4);
            }
            y85 y85Var = this.p;
            if (y85Var != null) {
                y85Var.h();
            }
        }
        ztb ztbVar = this.v;
        if (ztbVar != null) {
            ztbVar.onVideoInfo(obj, (int) j, (int) j2);
        }
        ytb ytbVar = this.w;
        if (ytbVar != null) {
            ytbVar.onVideoInfo(obj, j, j2, j3, obj2);
        }
    }

    @Override // tb.ytb
    public void onVideoPause(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee9d05f3", new Object[]{this, new Boolean(z)});
            return;
        }
        InterfaceUsageCounter.b().a(InterfaceUsageCounter.InterfaceName.hp_onVideoPause);
        feh fehVar = this.q;
        AVSDKLog.e(fehVar, " onVideoPause " + z);
        List<asc> list = this.e;
        if (list != null) {
            for (asc ascVar : list) {
                ascVar.onMediaPause(z);
            }
        }
        ztb ztbVar = this.v;
        if (ztbVar != null) {
            ztbVar.onVideoPause(z);
        }
        ytb ytbVar = this.w;
        if (ytbVar != null) {
            ytbVar.onVideoPause(z);
        }
    }

    @Override // tb.ytb
    public void onVideoPlay() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("931007b7", new Object[]{this});
            return;
        }
        InterfaceUsageCounter.b().a(InterfaceUsageCounter.InterfaceName.hp_onVideoPlay);
        AVSDKLog.e(this.q, " onVideoPlay");
        List<asc> list = this.e;
        if (list != null) {
            for (asc ascVar : list) {
                ascVar.onMediaPlay();
            }
        }
        ztb ztbVar = this.v;
        if (ztbVar != null) {
            ztbVar.onVideoPlay();
        }
        ytb ytbVar = this.w;
        if (ytbVar != null) {
            ytbVar.onVideoPlay();
        }
    }

    @Override // tb.ytb
    public void onVideoPrepared(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3faee61c", new Object[]{this, obj});
            return;
        }
        InterfaceUsageCounter.b().a(InterfaceUsageCounter.InterfaceName.hp_onVideoPrepared);
        AVSDKLog.e(this.q, " onVideoPrepared");
        List<asc> list = this.e;
        if (list != null) {
            Iterator it = ((CopyOnWriteArrayList) list).iterator();
            while (it.hasNext()) {
                asc ascVar = (asc) it.next();
                if (obj instanceof IMediaPlayer) {
                    ascVar.onMediaPrepared((IMediaPlayer) obj);
                } else {
                    ascVar.onMediaPrepared(null);
                }
            }
        }
        ztb ztbVar = this.v;
        if (ztbVar != null) {
            ztbVar.onVideoPrepared((IMediaPlayer) obj);
        }
        ytb ytbVar = this.w;
        if (ytbVar != null) {
            ytbVar.onVideoPrepared((IMediaPlayer) obj);
        }
    }

    @Override // tb.ytb
    public void onVideoProgressChanged(int i2, int i3, int i4) {
        long j;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91a8a811", new Object[]{this, new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        InterfaceUsageCounter.b().a(InterfaceUsageCounter.InterfaceName.hp_onVideoProgressChanged);
        List<asc> list = this.e;
        if (list != null) {
            Iterator it = ((CopyOnWriteArrayList) list).iterator();
            while (it.hasNext()) {
                ((asc) it.next()).onMediaProgressChanged(i2, i3, i4);
            }
        }
        if (this.i != null) {
            com.taobao.avplayer.a aVar = this.b;
            if (aVar != null) {
                j = aVar.S();
            } else {
                j = -1;
            }
            this.i.onVideoPlayTimeChanged(j);
        }
        ztb ztbVar = this.v;
        if (ztbVar != null) {
            ztbVar.onVideoProgressChanged(i2, i3, i4);
        }
        ytb ytbVar = this.w;
        if (ytbVar != null) {
            ytbVar.onVideoProgressChanged(i2, i3, i4);
        }
    }

    @Override // tb.ytb
    public void onVideoScreenChanged(DWVideoScreenType dWVideoScreenType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84bd1066", new Object[]{this, dWVideoScreenType});
        } else {
            InterfaceUsageCounter.b().a(InterfaceUsageCounter.InterfaceName.hp_onVideoScreenChanged);
        }
    }

    @Override // tb.ytb
    public void onVideoSeekTo(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd6694ad", new Object[]{this, new Integer(i2)});
            return;
        }
        InterfaceUsageCounter.b().a(InterfaceUsageCounter.InterfaceName.hp_onVideoSeekTo);
        List<asc> list = this.e;
        if (list != null) {
            for (asc ascVar : list) {
                ascVar.onMediaSeekTo(i2);
            }
        }
        ztb ztbVar = this.v;
        if (ztbVar != null) {
            ztbVar.onVideoSeekTo(i2);
        }
        ytb ytbVar = this.w;
        if (ytbVar != null) {
            ytbVar.onVideoSeekTo(i2);
        }
    }

    @Override // tb.ytb
    public void onVideoStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2b2d56d", new Object[]{this});
            return;
        }
        InterfaceUsageCounter.b().a(InterfaceUsageCounter.InterfaceName.hp_onVideoStart);
        AVSDKLog.e(this.q, " onVideoStart");
        List<asc> list = this.e;
        if (list != null) {
            for (asc ascVar : list) {
                ascVar.onMediaStart();
            }
        }
        ztb ztbVar = this.v;
        if (ztbVar != null) {
            ztbVar.onVideoStart();
        }
        ytb ytbVar = this.w;
        if (ytbVar != null) {
            ytbVar.onVideoStart();
        }
    }

    public void p(HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44d20b9f", new Object[]{this, hashMap});
            return;
        }
        InterfaceUsageCounter.b().a(InterfaceUsageCounter.InterfaceName.hp_addPlayExpUtParams);
        this.d.addPlayExpUtParams(hashMap);
    }

    public void p0(asc ascVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94add902", new Object[]{this, ascVar});
            return;
        }
        InterfaceUsageCounter.b().a(InterfaceUsageCounter.InterfaceName.hp_setIMediaPlayLifecycleListener);
        if (ascVar != null) {
            if (this.e == null) {
                this.e = new CopyOnWriteArrayList();
                AVSDKLog.e(this.q, "mMediaPlayLifeCycleListenerList create the CopyOnWriteArrayList");
            }
            if (!this.e.contains(ascVar)) {
                this.e.add(ascVar);
            }
        }
    }

    public void q(HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b65ae46", new Object[]{this, hashMap});
            return;
        }
        InterfaceUsageCounter.b().a(InterfaceUsageCounter.InterfaceName.hp_addUtParams);
        this.d.addUtParams(hashMap);
    }

    public void q0(aub aubVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c9a1d45", new Object[]{this, aubVar});
            return;
        }
        InterfaceUsageCounter.b().a(InterfaceUsageCounter.InterfaceName.hp_setIVideoLoopCompleteListener);
        DWContext dWContext = this.d;
        if (dWContext != null && dWContext.getVideo() != null && aubVar != null) {
            this.d.getVideo().g(aubVar);
        }
    }

    public void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a27cd7", new Object[]{this});
            return;
        }
        InterfaceUsageCounter.b().a(InterfaceUsageCounter.InterfaceName.hp_asyncPrepareVideo);
        com.taobao.avplayer.a aVar = this.b;
        if (aVar != null) {
            aVar.z();
        }
    }

    public void r0(dub dubVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f202f393", new Object[]{this, dubVar});
            return;
        }
        InterfaceUsageCounter.b().a(InterfaceUsageCounter.InterfaceName.hp_setIVideoPreCompleteListener);
        DWContext dWContext = this.d;
        if (dWContext != null && dWContext.getVideo() != null && dubVar != null) {
            this.d.getVideo().k(dubVar);
        }
    }

    public void s(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4f07861", new Object[]{this, map});
            return;
        }
        InterfaceUsageCounter.b().a(InterfaceUsageCounter.InterfaceName.hp_callWithMsg);
        if (map != null) {
            feh fehVar = this.q;
            AVSDKLog.e(fehVar, "callWithMsg " + map);
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                if (sj4.KEY_VIDEO_UPDATE_PARAMS.equals(key) && !TextUtils.isEmpty(value)) {
                    this.d.mDynamicPlayEx = value;
                } else if ("enterFloating".equals(key)) {
                    this.d.mIsFloat = "1".equals(value);
                }
            }
            com.taobao.avplayer.a aVar = this.b;
            if (aVar != null) {
                aVar.A(map);
            }
        }
    }

    public void s0(fub fubVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba7375c5", new Object[]{this, fubVar});
            return;
        }
        InterfaceUsageCounter.b().a(InterfaceUsageCounter.InterfaceName.hp_setIVideoSeekCompleteListener);
        com.taobao.avplayer.a aVar = this.b;
        if (aVar != null) {
            aVar.m0(fubVar);
        }
    }

    public void t0(DWInstanceType dWInstanceType) {
        DWInstanceType dWInstanceType2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a28ef3f", new Object[]{this, dWInstanceType});
            return;
        }
        InterfaceUsageCounter.b().a(InterfaceUsageCounter.InterfaceName.hp_setInstanceType);
        if (dWInstanceType != this.d.getInstanceType()) {
            psb psbVar = this.d.mConfigAdapter;
            String str = "";
            if (psbVar != null) {
                str = ((b75) psbVar).getConfig("DWInteractive", e75.ORANGE_USE_PIC_MODE_BIZCODE, str);
            }
            if (!ew0.n(this.d.mFrom, str)) {
                DWInstanceType instanceType = this.d.getInstanceType();
                DWInstanceType dWInstanceType3 = DWInstanceType.PIC;
                if (instanceType == dWInstanceType3 && dWInstanceType == (dWInstanceType2 = DWInstanceType.VIDEO)) {
                    this.d.setInstanceType(dWInstanceType2);
                    Q();
                } else if (this.d.getInstanceType() == DWInstanceType.VIDEO && dWInstanceType == dWInstanceType3) {
                    this.d.setInstanceType(dWInstanceType3);
                    if (this.c == null) {
                        N();
                    } else {
                        this.b.n0(DWLifecycleType.BEFORE);
                    }
                }
            }
        }
    }

    public void u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("589b5c6a", new Object[]{this});
            return;
        }
        InterfaceUsageCounter.b().a(InterfaceUsageCounter.InterfaceName.hp_closeVideo);
        AVSDKLog.e(this.q, " closeVideo");
        com.taobao.avplayer.music.a aVar = this.j;
        if (aVar != null) {
            aVar.e();
        } else {
            v();
        }
    }

    public void u0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e160672", new Object[]{this, new Boolean(z)});
            return;
        }
        feh fehVar = this.q;
        AVSDKLog.e(fehVar, "DWHighPerformanceInstance setMute:" + z);
        this.d.mute(z);
        com.taobao.avplayer.a aVar = this.b;
        if (aVar != null) {
            aVar.o0(z);
        }
    }

    public final void v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("efcc75ba", new Object[]{this});
            return;
        }
        AVSDKLog.e(this.q, " closeVideoInner");
        com.taobao.avplayer.a aVar = this.b;
        if (aVar != null) {
            aVar.B();
        }
    }

    public void v0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c8d232e", new Object[]{this, new Boolean(z)});
            return;
        }
        InterfaceUsageCounter.b().a(InterfaceUsageCounter.InterfaceName.hp_setNeedCloseUT);
        this.d.setNeedCloseUT(z);
    }

    public void w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d91abe26", new Object[]{this});
            return;
        }
        InterfaceUsageCounter.b().a(InterfaceUsageCounter.InterfaceName.hp_commitEndForMultiplexing);
        com.taobao.avplayer.a aVar = this.b;
        if (aVar != null) {
            aVar.G();
        }
    }

    public void w0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5cac726", new Object[]{this, new Boolean(z)});
            return;
        }
        InterfaceUsageCounter.b().a(InterfaceUsageCounter.InterfaceName.hp_setOpenVolumeFadeIn);
        com.taobao.avplayer.a aVar = this.b;
        if (aVar != null) {
            aVar.p0(z);
        }
    }

    public void x(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41f22ae", new Object[]{this, new Boolean(z)});
            return;
        }
        InterfaceUsageCounter.b().a(InterfaceUsageCounter.InterfaceName.hp_controlAudioFocus);
        com.taobao.avplayer.a aVar = this.b;
        if (aVar != null) {
            aVar.N(z);
        }
    }

    public void x0(ImageView imageView) {
        DWContext dWContext;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab315d39", new Object[]{this, imageView});
            return;
        }
        InterfaceUsageCounter.b().a(InterfaceUsageCounter.InterfaceName.hp_setPicImageView);
        if (this.c == null && (dWContext = this.d) != null && !TextUtils.isEmpty(dWContext.mUsingInterface) && this.d.mUsingInterface.contains("TBPlayer")) {
            a95 a95Var = new a95(this.d);
            this.c = a95Var;
            a95Var.e(this.r);
            DWContext dWContext2 = this.d;
            this.f10085a.addView(this.c.c(), new FrameLayout.LayoutParams(dWContext2.mWidth, dWContext2.mHeight));
        }
        if (!(imageView == null || this.c == null || this.m.booleanValue())) {
            this.c.d(imageView);
        }
        if (this.d.mNeedLoadingUI) {
            y85 y85Var = new y85(this.d);
            this.p = y85Var;
            if (this.f10085a != null && y85Var.g() != null) {
                this.f10085a.addView(this.p.g(), new FrameLayout.LayoutParams(-1, -1, 17));
            }
        }
    }

    public void y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        InterfaceUsageCounter.b().a(InterfaceUsageCounter.InterfaceName.hp_destroy);
        feh fehVar = this.q;
        AVSDKLog.e(fehVar, " destroy " + this.g);
        if (!this.g) {
            ImageView imageView = this.l;
            if (imageView != null) {
                imageView.setImageDrawable(null);
                this.l = null;
            }
            com.taobao.avplayer.music.a aVar = this.j;
            if (aVar != null) {
                this.d.mNeedRequestAudio = true;
                aVar.h(this);
            }
            z();
            this.g = true;
            com.taobao.avplayer.a aVar2 = this.b;
            if (aVar2 != null) {
                aVar2.O();
                this.b = null;
            }
            if (Looper.myLooper() != Looper.getMainLooper()) {
                new Handler(Looper.getMainLooper()).post(new e());
            } else {
                A();
            }
            DWContext dWContext = this.d;
            if (dWContext != null) {
                dWContext.destroy();
            }
            this.f10085a = null;
            this.d.setExternSurface(null);
            this.d.mDisableSurfaceView = false;
        }
    }

    public void y0(qtb qtbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb970df4", new Object[]{this, qtbVar});
            return;
        }
        InterfaceUsageCounter.b().a(InterfaceUsageCounter.InterfaceName.hp_setPicViewClickListener);
        this.r = qtbVar;
        a95 a95Var = this.c;
        if (a95Var != null) {
            a95Var.e(qtbVar);
        }
    }

    public final void z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a02f292", new Object[]{this});
        }
    }

    public void z0(float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b5e4523", new Object[]{this, new Float(f2)});
            return;
        }
        InterfaceUsageCounter.b().a(InterfaceUsageCounter.InterfaceName.hp_setPlayRate);
        com.taobao.avplayer.a aVar = this.b;
        if (aVar != null) {
            aVar.q0(f2);
        }
    }

    public final void Q() {
        DWControllerNew dWControllerNew;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("308b8715", new Object[]{this});
            return;
        }
        this.d.setInstanceType(DWInstanceType.VIDEO);
        if (this.b == null) {
            AVSDKLog.e(this.q, "Create DWHighPerformanceVideoController");
            this.b = new com.taobao.avplayer.a(this.d);
            AVSDKLog.e(this.q, "End DWHighPerformanceVideoController");
            nj9 nj9Var = this.h;
            if (nj9Var != null) {
                this.b.j0(nj9Var);
                this.h = null;
            }
            if (this.f10085a != null) {
                AVSDKLog.e(this.q, "Create mRootView");
                DWContext dWContext = this.d;
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(dWContext.mWidth, dWContext.mHeight);
                feh fehVar = this.q;
                AVSDKLog.e(fehVar, " initVideoMode , " + this.d.mWidth + ", " + this.d.mHeight);
                this.f10085a.addView(this.b.U(), 0, layoutParams);
                ImageView imageView = this.l;
                if (imageView != null) {
                    this.f10085a.addView(imageView, layoutParams);
                    feh fehVar2 = this.q;
                    AVSDKLog.e(fehVar2, "add mCoverImgView=" + this.l + "to the rootview.");
                }
                if (this.n && (dWControllerNew = this.o) != null) {
                    this.f10085a.addView(dWControllerNew.getRootView(), new FrameLayout.LayoutParams(-1, -2, 80));
                }
                if (this.d.mNeedLoadingUI && this.p == null) {
                    y85 y85Var = new y85(this.d);
                    this.p = y85Var;
                    if (this.f10085a == null || y85Var.g() == null) {
                        this.p.g().bringToFront();
                    } else {
                        this.f10085a.addView(this.p.g(), new FrameLayout.LayoutParams(-1, -1, 17));
                    }
                }
                AVSDKLog.e(this.q, "Create mRootView finished and add view");
            }
            this.d.getVideo().l(this);
            qtb qtbVar = this.s;
            if (qtbVar != null) {
                this.b.r0(qtbVar);
            }
            this.b.f0(this);
        }
    }

    public void N0(i iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0df6854", new Object[]{this, iVar});
            return;
        }
        InterfaceUsageCounter.b().a(InterfaceUsageCounter.InterfaceName.hp_setup);
        this.f = true;
        if (!t()) {
            if (MediaSystemUtils.isApkDebuggable()) {
                StringBuilder sb = new StringBuilder(20);
                if (this.d.getUTParams() != null) {
                    for (Map.Entry<String, String> entry : this.d.getUTParams().entrySet()) {
                        sb.append(entry.getKey());
                        sb.append("=");
                        sb.append(entry.getValue());
                        sb.append(";");
                    }
                }
                if (this.d != null) {
                    feh fehVar = this.q;
                    AVSDKLog.e(fehVar, "please set mBizCode , mVideoSource and  mVideoUrl parameters" + ((Object) sb));
                }
            } else if (this.d != null) {
                feh fehVar2 = this.q;
                AVSDKLog.e(fehVar2, "please set mBizCode , mVideoSource and  mVideoUrl parameters" + this.d.mPlayContext.getVideoUrl());
            }
        }
        P(iVar);
        O(iVar);
        M(iVar);
        int i2 = f.$SwitchMap$com$taobao$avplayer$DWInstanceType[this.d.getInstanceType().ordinal()];
        if (i2 == 1) {
            AVSDKLog.e(this.q, "Enter DWHighPerformanceInstanceNew initVideoMode");
            Q();
            AVSDKLog.e(this.q, "End DWHighPerformanceInstanceNew initVideoMode");
        } else if (i2 == 2) {
            AVSDKLog.e(this.q, "Enter DWHighPerformanceInstanceNew initPicMode");
            N();
            AVSDKLog.e(this.q, "End DWHighPerformanceInstanceNew initPicMode");
        }
        V(iVar.y);
    }

    public final boolean t() {
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("63bd6239", new Object[]{this})).booleanValue();
        }
        if (TextUtils.isEmpty(this.d.mFrom) || TextUtils.isEmpty(this.d.mVideoSource) || TextUtils.isEmpty(this.d.mVideoId)) {
            AVSDKLog.e(this.q, "缺少必填参数 bizCode、videoSource、videoId！！");
        }
        if (TextUtils.isEmpty(this.d.mFrom)) {
            this.d.mFrom = "default";
        }
        if (TextUtils.isEmpty(this.d.mVideoSource)) {
            DWContext dWContext = this.d;
            dWContext.mPlayContext.mVideoSource = "TBVideo";
            dWContext.mVideoSource = "TBVideo";
        }
        if (!TextUtils.isEmpty(this.d.mPlayContext.getVideoUrl()) && TextUtils.isEmpty(this.d.getVideoId()) && "TBVideo".equals(this.d.getVideoSource())) {
            try {
                String rawPath = new URI(this.d.mPlayContext.getVideoUrl()).getRawPath();
                int lastIndexOf = rawPath.lastIndexOf(47);
                int lastIndexOf2 = rawPath.lastIndexOf(46);
                if (lastIndexOf >= 0 && lastIndexOf2 >= 0 && (i2 = lastIndexOf + 1) < rawPath.length() && lastIndexOf2 > i2) {
                    DWContext dWContext2 = this.d;
                    MediaPlayControlContext mediaPlayControlContext = dWContext2.mPlayContext;
                    String substring = rawPath.substring(i2, lastIndexOf2);
                    mediaPlayControlContext.mVideoId = substring;
                    dWContext2.mVideoId = substring;
                }
            } catch (Exception unused) {
            }
        }
        return !TextUtils.isEmpty(this.d.mVideoId);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class h {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final i f10091a;
        public String b;

        static {
            t2o.a(452984871);
        }

        public h(Activity activity) {
            i iVar = new i();
            this.f10091a = iVar;
            iVar.b = activity;
            iVar.R = "hpnew";
        }

        public x75 A(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (x75) ipChange.ipc$dispatch("a0ae086a", new Object[]{this, new Boolean(z)});
            }
            this.f10091a.y = z;
            AVSDKLog.e(tfb.MODULE_SDK_PAGE, "DWHighPerformanceInstanceNew Builder, sbt=" + this.f10091a.f + ", setMute=" + this.f10091a.y);
            return new x75(this.f10091a.b);
        }

        public x75 B(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (x75) ipChange.ipc$dispatch("9ca1692e", new Object[]{this, new Boolean(z)});
            }
            this.f10091a.A = z;
            return new x75(this.f10091a.b);
        }

        public x75 C(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (x75) ipChange.ipc$dispatch("4566673a", new Object[]{this, new Boolean(z)});
            }
            this.f10091a.B = z;
            return new x75(this.f10091a.b);
        }

        public h D(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (h) ipChange.ipc$dispatch("5ad2fd63", new Object[]{this, new Boolean(z)});
            }
            this.f10091a.g0 = z;
            return this;
        }

        public x75 E(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (x75) ipChange.ipc$dispatch("e22bced3", new Object[]{this, new Boolean(z)});
            }
            this.f10091a.f0 = z;
            return new x75(this.f10091a.b);
        }

        public x75 F(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (x75) ipChange.ipc$dispatch("79dab1bc", new Object[]{this, new Boolean(z)});
            }
            this.f10091a.e0 = z;
            return new x75(this.f10091a.b);
        }

        public x75 G(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (x75) ipChange.ipc$dispatch("ea6c17ce", new Object[]{this, new Boolean(z)});
            }
            this.f10091a.C = z;
            return new x75(this.f10091a.b);
        }

        public x75 H(g0d g0dVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (x75) ipChange.ipc$dispatch("5b5c6e42", new Object[]{this, g0dVar});
            }
            this.f10091a.i0 = g0dVar;
            return new x75(this.f10091a.b);
        }

        public x75 I(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (x75) ipChange.ipc$dispatch("8542ac8e", new Object[]{this, new Integer(i)});
            }
            this.f10091a.k = i;
            return new x75(this.f10091a.b);
        }

        public x75 J(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (x75) ipChange.ipc$dispatch("20f0c8d6", new Object[]{this, new Boolean(z)});
            }
            this.f10091a.O = z;
            return new x75(this.f10091a.b);
        }

        public x75 K(HashMap<String, String> hashMap) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (x75) ipChange.ipc$dispatch("5bdd20dc", new Object[]{this, hashMap});
            }
            this.f10091a.w = hashMap;
            return new x75(this.f10091a.b);
        }

        public x75 L(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (x75) ipChange.ipc$dispatch("80ce89ce", new Object[]{this, str});
            }
            this.f10091a.f10092a = str;
            return new x75(this.f10091a.b);
        }

        public x75 M(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (x75) ipChange.ipc$dispatch("28b251ca", new Object[]{this, new Boolean(z)});
            }
            this.f10091a.b0 = z;
            return new x75(this.f10091a.b);
        }

        public x75 N(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (x75) ipChange.ipc$dispatch("fbd04e21", new Object[]{this, str});
            }
            this.f10091a.h = str;
            return new x75(this.f10091a.b);
        }

        public x75 O(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (x75) ipChange.ipc$dispatch("b68cee0a", new Object[]{this, new Boolean(z)});
            }
            this.f10091a.N = z;
            return new x75(this.f10091a.b);
        }

        public x75 P(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (x75) ipChange.ipc$dispatch("fbdbe954", new Object[]{this, str});
            }
            this.f10091a.o = str;
            return new x75(this.f10091a.b);
        }

        public x75 Q(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (x75) ipChange.ipc$dispatch("87ad2dd4", new Object[]{this, new Integer(i)});
            }
            this.f10091a.l = i;
            return new x75(this.f10091a.b);
        }

        public x75 R(Surface surface) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (x75) ipChange.ipc$dispatch("31ad251e", new Object[]{this, surface});
            }
            this.f10091a.J = surface;
            return new x75(this.f10091a.b);
        }

        public x75 T(HashMap<String, String> hashMap) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (x75) ipChange.ipc$dispatch("f89b637", new Object[]{this, hashMap});
            }
            this.f10091a.v = hashMap;
            return new x75(this.f10091a.b);
        }

        public h U(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (h) ipChange.ipc$dispatch("64f488fc", new Object[]{this, new Boolean(z)});
            }
            this.f10091a.V = z;
            return this;
        }

        public x75 V(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (x75) ipChange.ipc$dispatch("9717f108", new Object[]{this, new Boolean(z)});
            }
            this.f10091a.a0 = z;
            return new x75(this.f10091a.b);
        }

        public x75 W(long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (x75) ipChange.ipc$dispatch("41347be7", new Object[]{this, new Long(j)});
            }
            this.f10091a.e = j;
            return new x75(this.f10091a.b);
        }

        public x75 X(utb utbVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (x75) ipChange.ipc$dispatch("aed492ce", new Object[]{this, utbVar});
            }
            this.f10091a.u = utbVar;
            return new x75(this.f10091a.b);
        }

        public void Y(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3ad57968", new Object[]{this, str});
            } else {
                this.b = str;
            }
        }

        public x75 Z(DWAspectRatio dWAspectRatio) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (x75) ipChange.ipc$dispatch("88d82dd6", new Object[]{this, dWAspectRatio});
            }
            this.f10091a.I = dWAspectRatio;
            return new x75(this.f10091a.b);
        }

        public DWHighPerformanceInstanceNew a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DWHighPerformanceInstanceNew) ipChange.ipc$dispatch("8da8e12c", new Object[]{this});
            }
            b();
            return new DWHighPerformanceInstanceNew(this.f10091a);
        }

        public x75 a0(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (x75) ipChange.ipc$dispatch("5f111fb9", new Object[]{this, str});
            }
            this.f10091a.X = str;
            return new x75(this.f10091a.b);
        }

        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b30f571", new Object[]{this});
            } else if (!TextUtils.isEmpty(this.b)) {
                i iVar = this.f10091a;
                iVar.R = this.b + "." + this.f10091a.R;
                this.b = "";
            }
        }

        public x75 b0(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (x75) ipChange.ipc$dispatch("ae3eecf7", new Object[]{this, str});
            }
            this.f10091a.j = str;
            return new x75(this.f10091a.b);
        }

        public x75 c(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (x75) ipChange.ipc$dispatch("6f309cef", new Object[]{this, new Boolean(z)});
            }
            this.f10091a.S = z;
            return new x75(this.f10091a.b);
        }

        public x75 c0(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (x75) ipChange.ipc$dispatch("fbb2d3cc", new Object[]{this, new Boolean(z)});
            }
            this.f10091a.H = z;
            return new x75(this.f10091a.b);
        }

        public x75 d(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (x75) ipChange.ipc$dispatch("34a34995", new Object[]{this, new Boolean(z)});
            }
            this.f10091a.T = z;
            return new x75(this.f10091a.b);
        }

        public x75 d0(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (x75) ipChange.ipc$dispatch("3f8cb677", new Object[]{this, str});
            }
            this.f10091a.i = str;
            return new x75(this.f10091a.b);
        }

        public x75 e(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (x75) ipChange.ipc$dispatch("ea8719c2", new Object[]{this, new Boolean(z)});
            }
            this.f10091a.L = z;
            return new x75(this.f10091a.b);
        }

        public x75 e0(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (x75) ipChange.ipc$dispatch("8715b16b", new Object[]{this, str});
            }
            this.f10091a.F = str;
            return new x75(this.f10091a.b);
        }

        public x75 f(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (x75) ipChange.ipc$dispatch("246cb9fa", new Object[]{this, new Boolean(z)});
            }
            this.f10091a.M = z;
            return new x75(this.f10091a.b);
        }

        public x75 f0(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (x75) ipChange.ipc$dispatch("6036b275", new Object[]{this, str});
            }
            this.f10091a.d = str;
            return new x75(this.f10091a.b);
        }

        public x75 g(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (x75) ipChange.ipc$dispatch("7fbddc0d", new Object[]{this, str});
            }
            this.f10091a.f = str;
            return new x75(this.f10091a.b);
        }

        public x75 g0(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (x75) ipChange.ipc$dispatch("d6874f44", new Object[]{this, new Integer(i)});
            }
            if (i <= 0) {
                i = DWViewUtil.getScreenWidth();
            }
            this.f10091a.m = i;
            return new x75(this.f10091a.b);
        }

        public x75 h(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (x75) ipChange.ipc$dispatch("39acdf8f", new Object[]{this, str});
            }
            this.f10091a.g = str;
            return new x75(this.f10091a.b);
        }

        public x75 i(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (x75) ipChange.ipc$dispatch("44e5ee4c", new Object[]{this, str});
            }
            this.f10091a.W = str;
            return new x75(this.f10091a.b);
        }

        public x75 j(psb psbVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (x75) ipChange.ipc$dispatch("85757d12", new Object[]{this, psbVar});
            }
            this.f10091a.r = psbVar;
            return new x75(this.f10091a.b);
        }

        public x75 k(qsb qsbVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (x75) ipChange.ipc$dispatch("9032def0", new Object[]{this, qsbVar});
            }
            this.f10091a.s = qsbVar;
            return new x75(this.f10091a.b);
        }

        public x75 l(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (x75) ipChange.ipc$dispatch("51643139", new Object[]{this, str});
            }
            this.f10091a.E = str;
            return new x75(this.f10091a.b);
        }

        public x75 m(HashMap<String, String> hashMap) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (x75) ipChange.ipc$dispatch("57d18bd1", new Object[]{this, hashMap});
            }
            this.f10091a.x = hashMap;
            return new x75(this.f10091a.b);
        }

        public x75 n(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (x75) ipChange.ipc$dispatch("20dd178a", new Object[]{this, str});
            }
            this.f10091a.d0 = str;
            return new x75(this.f10091a.b);
        }

        public x75 o(stb stbVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (x75) ipChange.ipc$dispatch("b75601f7", new Object[]{this, stbVar});
            }
            this.f10091a.t = stbVar;
            return new x75(this.f10091a.b);
        }

        public x75 p(zsb zsbVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (x75) ipChange.ipc$dispatch("ca2db08f", new Object[]{this, zsbVar});
            }
            this.f10091a.h0 = zsbVar;
            return new x75(this.f10091a.b);
        }

        public x75 q(DWInstanceType dWInstanceType) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (x75) ipChange.ipc$dispatch("ea17170a", new Object[]{this, dWInstanceType});
            }
            this.f10091a.K = dWInstanceType;
            return new x75(this.f10091a.b);
        }

        public x75 r(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (x75) ipChange.ipc$dispatch("bff7147b", new Object[]{this, new Boolean(z)});
            }
            this.f10091a.Y = z;
            return new x75(this.f10091a.b);
        }

        public x75 s(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (x75) ipChange.ipc$dispatch("76381f7c", new Object[]{this, new Boolean(z)});
            }
            this.f10091a.Z = z;
            return new x75(this.f10091a.b);
        }

        public x75 t(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (x75) ipChange.ipc$dispatch("96f600a9", new Object[]{this, new Integer(i)});
            }
            if (i <= 0) {
                i = DWViewUtil.getRealPxByWidth(600.0f);
            }
            this.f10091a.n = i;
            return new x75(this.f10091a.b);
        }

        public x75 u(ktb ktbVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (x75) ipChange.ipc$dispatch("ff6ef0a", new Object[]{this, ktbVar});
            }
            this.f10091a.p = ktbVar;
            return new x75(this.f10091a.b);
        }

        public x75 v(vtb vtbVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (x75) ipChange.ipc$dispatch("952443b0", new Object[]{this, vtbVar});
            }
            this.f10091a.q = vtbVar;
            return new x75(this.f10091a.b);
        }

        public x75 w(asc ascVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (x75) ipChange.ipc$dispatch("57ccafda", new Object[]{this, ascVar});
            }
            this.f10091a.c0 = ascVar;
            return new x75(this.f10091a.b);
        }

        public x75 x(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (x75) ipChange.ipc$dispatch("d4fcb9e1", new Object[]{this, new Boolean(z)});
            }
            this.f10091a.z = z;
            return new x75(this.f10091a.b);
        }

        public x75 y(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (x75) ipChange.ipc$dispatch("ed5b0ffb", new Object[]{this, jSONObject});
            }
            this.f10091a.P = jSONObject;
            return new x75(this.f10091a.b);
        }

        public x75 z(HashMap<String, String> hashMap) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (x75) ipChange.ipc$dispatch("3e832da1", new Object[]{this, hashMap});
            }
            AVSDKLog.e(tfb.MODULE_SDK_PAGE, "DWHighPerformanceInstanceNew Builder setMetaData " + hashMap);
            this.f10091a.U = hashMap;
            return new x75(this.f10091a.b);
        }

        public h(Context context) {
            i iVar = new i();
            this.f10091a = iVar;
            iVar.c = context;
            iVar.R = "hpnew";
        }
    }
}
