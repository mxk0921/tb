package tb;

import android.graphics.Rect;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Size;
import android.view.SurfaceView;
import android.view.View;
import com.alibaba.marvel.Const;
import com.alibaba.marvel.Editor;
import com.alibaba.marvel.Marvel;
import com.alibaba.marvel.MeEditor;
import com.alibaba.marvel.Project;
import com.alibaba.marvel.Viewer;
import com.alibaba.marvel.exporter.DraftExporter;
import com.alibaba.marvel.java.ExportMonitor;
import com.alibaba.marvel.java.OnFrameUpdateListener;
import com.alibaba.marvel.java.OnStatListener;
import com.alibaba.marvel.java.ScaleType;
import com.alibaba.marvel.java.SourceType;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.sdk.editor.data.AiQuality;
import com.taobao.android.litecreator.sdk.editor.data.Canvas;
import com.taobao.android.litecreator.sdk.editor.data.Cut;
import com.taobao.android.litecreator.sdk.editor.data.EditorInfo;
import com.taobao.android.litecreator.sdk.editor.data.Filter;
import com.taobao.android.litecreator.sdk.editor.data.Media;
import com.taobao.android.litecreator.sdk.editor.data.MediaClips;
import com.taobao.android.litecreator.sdk.editor.data.Music;
import com.taobao.android.litecreator.sdk.editor.data.Operation;
import com.taobao.android.litecreator.sdk.editor.data.Paster;
import com.taobao.android.litecreator.sdk.editor.data.Resource;
import com.taobao.android.litecreator.sdk.editor.data.Sticker;
import com.taobao.android.litecreator.sdk.editor.data.Video;
import com.taobao.android.litecreator.sdk.editor.data.VideoEditInfo;
import com.taobao.android.litecreator.sdk.editor.data.Volume;
import com.taobao.android.litecreator.sdk.editor.data.base.Beauty;
import com.taobao.android.litecreator.util.MarvelFrameIntervalHelper;
import com.taobao.tao.Globals;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import tb.b9e;
import tb.ltl;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class u6w extends a32 implements b9e, tqc {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int DELAY_MILLIS = 1000;
    public Viewer A;
    public boolean B;
    public String C;
    public int D;
    public String E;
    public String F;
    public String G;
    public String H;
    public long I;
    public long J;
    public ArrayList<String> K;
    public final ArrayList<String> L;
    public final String M;
    public List<b9e.a> N;
    public b9e.b O;
    public final ArrayList<b9e.c> P;
    public final ArrayList<tdd> Q;
    public boolean R;
    public final List<Media> S;
    public boolean T;
    public String U;
    public boolean V;
    public boolean W;
    public boolean X;
    public float Y;
    public float Z;
    public long a0;
    public ltl.a b0;
    public ltl c0;
    public boolean d0;
    public final q2d<Filter> e0;
    public final q2d<Cut> f0;
    public final q2d<Music> g0;
    public final q2d<Volume> h0;
    public final q2d<Sticker> i0;
    public final q2d<List<Paster>> j0;
    public final q2d<AiQuality> k0;
    public final q2d<Beauty> l0;
    public final Runnable m0;
    public x4 n0;
    public v62 o0;
    public boolean p0;
    public final String q;
    public boolean q0;
    public final long r;
    public final ExportMonitor r0;
    public final boolean s;
    public final Media t;
    public final boolean u;
    public Handler v;
    public View w;
    public Editor x;
    public MeEditor y;
    public Project z;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements ExportMonitor {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* renamed from: tb.u6w$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
        public class RunnableC1067a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public RunnableC1067a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                u6w u6wVar = u6w.this;
                if (u6w.G0(u6wVar, u6w.D0(u6wVar), u6w.E0(u6w.this))) {
                    u6w.F0(u6w.this, false);
                }
            }
        }

        public a() {
        }

        public void onCancel() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("379d4540", new Object[]{this});
            } else {
                u6w.I0(u6w.this);
            }
        }

        public void onComplete() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5cbffcbf", new Object[]{this});
            } else {
                trt.c(new RunnableC1067a());
            }
        }

        public void onError(String str, String str2, int i, String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9c8c7f09", new Object[]{this, str, str2, new Integer(i), str3});
            } else {
                u6w.H0(u6w.this, str3, String.valueOf(i));
            }
        }

        public void onProgress(float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5ec8ea6d", new Object[]{this, new Float(f)});
            }
        }

        public void onStart() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            } else {
                u6w.C0(u6w.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements OnStatListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        public void onStat(String str, Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2921a3e1", new Object[]{this, str, map});
            } else if (u6w.J0(u6w.this) != null) {
                u6w.J0(u6w.this).onStat(str, map);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class c implements OnFrameUpdateListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ long f29189a;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else if (!u6w.K0(u6w.this)) {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    c cVar = c.this;
                    long j = elapsedRealtime - cVar.f29189a;
                    if (u6w.J0(u6w.this) != null) {
                        u6w.J0(u6w.this).a(j);
                    }
                    u6w.L0(u6w.this, true);
                }
            }
        }

        public c(long j) {
            this.f29189a = j;
        }

        public void onFrameUpdate() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d6b6e23e", new Object[]{this});
            } else {
                trt.c(new a());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
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
            u6w u6wVar = u6w.this;
            u6w.G0(u6wVar, u6w.D0(u6wVar), false);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class e extends vmq {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e(tqc tqcVar) {
            super(tqcVar);
        }

        public static /* synthetic */ Object ipc$super(e eVar, String str, Object... objArr) {
            if (str.hashCode() == 51533695) {
                super.b((String) objArr[0], (Paster) objArr[1]);
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/litecreator/sdk/editor/VideoEditor$17");
        }

        @Override // tb.vmq
        public long A() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("e13e9bc3", new Object[]{this})).longValue();
            }
            return u6w.this.F();
        }

        @Override // tb.vmq, tb.ltl.b, tb.ltl.a
        public void b(String str, Paster paster) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("312577f", new Object[]{this, str, paster});
                return;
            }
            super.b(str, paster);
            u6w.P0(u6w.this).removeCallbacks(u6w.Q0(u6w.this));
            u6w.P0(u6w.this).postDelayed(u6w.Q0(u6w.this), 1000L);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class f implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            u6w u6wVar = u6w.this;
            u6w.R0(u6wVar, u6wVar.getVideos());
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class g implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Project f29193a;

        public g(Project project) {
            this.f29193a = project;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                this.f29193a.destroy();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class h implements q2d<Filter> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public h() {
        }

        @Override // tb.q2d
        public void a(p1c<Filter> p1cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("189432f6", new Object[]{this, p1cVar});
            } else {
                u6w.z0(u6w.this, p1cVar.get());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class i implements q2d<Cut> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public i() {
        }

        @Override // tb.q2d
        public void a(p1c<Cut> p1cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("189432f6", new Object[]{this, p1cVar});
            } else {
                u6w.A0(u6w.this, p1cVar.get());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class j implements q2d<Music> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public j() {
        }

        @Override // tb.q2d
        public void a(p1c<Music> p1cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("189432f6", new Object[]{this, p1cVar});
            } else {
                u6w.N0(u6w.this, p1cVar.get());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class k implements q2d<Volume> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public k() {
        }

        @Override // tb.q2d
        public void a(p1c<Volume> p1cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("189432f6", new Object[]{this, p1cVar});
            } else {
                u6w.S0(u6w.this, p1cVar.get());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class l implements q2d<Sticker> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public l() {
        }

        @Override // tb.q2d
        public void a(p1c<Sticker> p1cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("189432f6", new Object[]{this, p1cVar});
            } else {
                u6w.T0(u6w.this, p1cVar.get());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class m implements q2d<List<Paster>> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public m() {
        }

        @Override // tb.q2d
        public void a(p1c<List<Paster>> p1cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("189432f6", new Object[]{this, p1cVar});
            } else {
                u6w.U0(u6w.this, p1cVar.get());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class n implements q2d<AiQuality> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public n() {
        }

        @Override // tb.q2d
        public void a(p1c<AiQuality> p1cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("189432f6", new Object[]{this, p1cVar});
            } else {
                u6w.V0(u6w.this, p1cVar.get());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class o implements q2d<Beauty> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public o() {
        }

        @Override // tb.q2d
        public void a(p1c<Beauty> p1cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("189432f6", new Object[]{this, p1cVar});
            } else {
                u6w.W0(u6w.this, p1cVar.get());
            }
        }
    }

    static {
        t2o.a(511705393);
        t2o.a(511705370);
        t2o.a(511705473);
    }

    public u6w(Project project, List<Video> list, List<Media> list2, Media media, EditorInfo editorInfo, long j2) {
        super(list, editorInfo);
        VideoEditInfo videoEditInfo;
        this.L = new ArrayList<>();
        this.P = new ArrayList<>();
        this.Q = new ArrayList<>();
        this.U = "none";
        this.V = false;
        this.W = true;
        this.a0 = 0L;
        this.d0 = true;
        this.e0 = new h();
        this.f0 = new i();
        this.g0 = new j();
        this.h0 = new k();
        this.i0 = new l();
        this.j0 = new m();
        this.k0 = new n();
        this.l0 = new o();
        this.m0 = new p();
        this.q0 = false;
        this.r0 = new a();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.a0 = j2;
        Resource resource = editorInfo.resource;
        if (resource != null) {
            this.s = true;
            this.q = resource.type;
            if (!TextUtils.isEmpty(resource.draftPath)) {
                String str = editorInfo.resource.draftPath;
                this.s = false;
            } else {
                i8g.j(Globals.getApplication(), "json");
            }
            if (project == null) {
                this.z = Marvel.createProject();
            } else {
                this.z = project;
            }
            this.x = this.z.getEditor();
            this.y = this.z.getMeEditor();
            Viewer viewer = this.z.getViewer();
            this.A = viewer;
            if (!this.s) {
                this.r = viewer.getDurationUs();
            }
            this.v = new Handler(Looper.getMainLooper());
            this.z.setOnStatListener(new b());
            this.A.setOnFrameUpdateListener(new c(elapsedRealtime));
            if (this.s) {
                C1(true);
            } else {
                for (Video video : getVideos()) {
                    this.L.add(video.clipId);
                }
                w1();
                if (media != null) {
                    this.t = media;
                    this.u = true;
                    ArrayList<String> arrayList = new ArrayList<>();
                    this.K = arrayList;
                    arrayList.add(media.clipId);
                } else {
                    this.u = false;
                    this.S = list2;
                }
            }
            this.M = i8g.j(Globals.getApplication(), q2s.JSON);
            B1();
            Operation operation = editorInfo.operation;
            if (!(operation == null || (videoEditInfo = operation.videoEditInfo) == null)) {
                x0(videoEditInfo);
            }
        }
        y0(F());
    }

    public static /* synthetic */ void A0(u6w u6wVar, Cut cut) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f01e8813", new Object[]{u6wVar, cut});
        } else {
            u6wVar.a2(cut);
        }
    }

    public static /* synthetic */ void B0(u6w u6wVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1fc4286", new Object[]{u6wVar, str});
        } else {
            u6wVar.U1(str);
        }
    }

    public static /* synthetic */ void C0(u6w u6wVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bdb7f5b", new Object[]{u6wVar});
        } else {
            u6wVar.Q1();
        }
    }

    public static /* synthetic */ String D0(u6w u6wVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d4f098e6", new Object[]{u6wVar});
        }
        return u6wVar.q1();
    }

    public static /* synthetic */ boolean E0(u6w u6wVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b4585e9d", new Object[]{u6wVar})).booleanValue();
        }
        return u6wVar.R;
    }

    public static /* synthetic */ boolean F0(u6w u6wVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4b9f6861", new Object[]{u6wVar, new Boolean(z)})).booleanValue();
        }
        u6wVar.R = z;
        return z;
    }

    public static /* synthetic */ boolean G0(u6w u6wVar, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f721916", new Object[]{u6wVar, str, new Boolean(z)})).booleanValue();
        }
        return u6wVar.O1(str, z);
    }

    public static /* synthetic */ void H0(u6w u6wVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a610936b", new Object[]{u6wVar, str, str2});
        } else {
            u6wVar.P1(str, str2);
        }
    }

    public static /* synthetic */ void I0(u6w u6wVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7113ad76", new Object[]{u6wVar});
        } else {
            u6wVar.N1();
        }
    }

    public static /* synthetic */ b9e.b J0(u6w u6wVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b9e.b) ipChange.ipc$dispatch("ca40b698", new Object[]{u6wVar});
        }
        return u6wVar.O;
    }

    public static /* synthetic */ boolean K0(u6w u6wVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("99908cb8", new Object[]{u6wVar})).booleanValue();
        }
        return u6wVar.T;
    }

    public static /* synthetic */ boolean L0(u6w u6wVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d6cfda6", new Object[]{u6wVar, new Boolean(z)})).booleanValue();
        }
        u6wVar.T = z;
        return z;
    }

    public static /* synthetic */ Viewer M0(u6w u6wVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Viewer) ipChange.ipc$dispatch("f269d623", new Object[]{u6wVar});
        }
        return u6wVar.A;
    }

    public static /* synthetic */ void N0(u6w u6wVar, Music music) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e86c106f", new Object[]{u6wVar, music});
        } else {
            u6wVar.e2(music);
        }
    }

    public static /* synthetic */ ArrayList O0(u6w u6wVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("d33a9757", new Object[]{u6wVar});
        }
        return u6wVar.Q;
    }

    public static /* synthetic */ Handler P0(u6w u6wVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("cbaa6daa", new Object[]{u6wVar});
        }
        return u6wVar.v;
    }

    public static /* synthetic */ Runnable Q0(u6w u6wVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Runnable) ipChange.ipc$dispatch("91b2ba79", new Object[]{u6wVar});
        }
        return u6wVar.m0;
    }

    public static /* synthetic */ void R0(u6w u6wVar, List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b797bcb", new Object[]{u6wVar, list});
        } else {
            u6wVar.E1(list);
        }
    }

    public static /* synthetic */ void S0(u6w u6wVar, Volume volume) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dbb3ca83", new Object[]{u6wVar, volume});
        } else {
            u6wVar.h2(volume);
        }
    }

    public static /* synthetic */ void T0(u6w u6wVar, Sticker sticker) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9324095", new Object[]{u6wVar, sticker});
        } else {
            u6wVar.g2(sticker);
        }
    }

    public static /* synthetic */ void U0(u6w u6wVar, List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8bd94d7", new Object[]{u6wVar, list});
        } else {
            u6wVar.f2(list);
        }
    }

    public static /* synthetic */ void V0(u6w u6wVar, AiQuality aiQuality) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("218b8319", new Object[]{u6wVar, aiQuality});
        } else {
            u6wVar.Y1(aiQuality);
        }
    }

    public static /* synthetic */ void W0(u6w u6wVar, Beauty beauty) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6adc355", new Object[]{u6wVar, beauty});
        } else {
            u6wVar.Z1(beauty);
        }
    }

    public static /* synthetic */ boolean X0(u6w u6wVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4572e2c7", new Object[]{u6wVar})).booleanValue();
        }
        return u6wVar.L1();
    }

    public static /* synthetic */ boolean Y0(u6w u6wVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d9b15266", new Object[]{u6wVar})).booleanValue();
        }
        return u6wVar.q0;
    }

    public static /* synthetic */ boolean Z0(u6w u6wVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d164edb8", new Object[]{u6wVar, new Boolean(z)})).booleanValue();
        }
        u6wVar.q0 = z;
        return z;
    }

    public static /* synthetic */ Object ipc$super(u6w u6wVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/litecreator/sdk/editor/VideoEditor");
    }

    public static /* synthetic */ void z0(u6w u6wVar, Filter filter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ffba4e2", new Object[]{u6wVar, filter});
        } else {
            u6wVar.c2(filter);
        }
    }

    public final void A1(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f07c1d6e", new Object[]{this, str});
            return;
        }
        Project createProject = Marvel.createProject(str);
        this.z = createProject;
        this.x = createProject.getEditor();
        this.y = this.z.getMeEditor();
        C1(true);
        this.A = this.z.getViewer();
        this.v = new Handler(Looper.getMainLooper());
    }

    public final void B1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c54136ec", new Object[]{this});
            return;
        }
        DraftExporter draftExporter = new DraftExporter();
        draftExporter.setOutputPath(q1());
        draftExporter.setMonitor(this.r0);
        this.z.export(draftExporter);
    }

    public final void C1(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78e211f2", new Object[]{this, new Boolean(z)});
        } else if (z) {
            long currentTimeMillis = System.currentTimeMillis();
            E1(getVideos());
            StringBuilder sb = new StringBuilder("initTrack: addMainClip cost=");
            sb.append(System.currentTimeMillis() - currentTimeMillis);
            sb.append(" ");
        } else {
            View view = this.w;
            if (view != null) {
                view.post(new f());
            }
        }
    }

    public final void D1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6118ac9", new Object[]{this});
            return;
        }
        View view = this.w;
        if (!(view instanceof SurfaceView)) {
            odg.c("VideoEditor", "initViewer: mDisplayView is not SurfaceView!!!");
            return;
        }
        this.A.attachTo((SurfaceView) view);
        this.A.setOnPrepareListener(new v6w(this));
        this.B = false;
        if (this.X) {
            MarvelFrameIntervalHelper.c(this.A, this.Z, this.Y, 0);
        }
        this.A.prepare();
        this.A.setOnCompleteListener(new w6w(this));
        this.A.setOnProgressListener(new x6w(this));
        this.y.transact();
    }

    @Override // tb.v8e
    public long F() {
        long j2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("df7baba3", new Object[]{this})).longValue();
        }
        if (!this.s) {
            return this.r;
        }
        long j3 = 0;
        if (getVideos() == null || getVideos().size() <= 0) {
            j2 = 0;
        } else {
            long j4 = 0;
            for (Video video : getVideos()) {
                long j5 = video.clipEndTimeUs;
                if (j5 > j3) {
                    long j6 = video.clipStartTimeUs;
                    if (j5 - j6 < video.durationMs * 1000) {
                        j4 += (j5 - j6) / 1000;
                        j3 = 0;
                    }
                }
                j4 += video.durationMs;
                j3 = 0;
            }
            j2 = j4;
        }
        return j2 * 1000;
    }

    public final boolean F1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9c646c43", new Object[]{this})).booleanValue();
        }
        return this.W;
    }

    @Override // tb.b9e
    public void G(b9e.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3be2658", new Object[]{this, aVar});
            return;
        }
        if (this.N == null) {
            this.N = new ArrayList();
        }
        this.N.add(aVar);
    }

    public final boolean G1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("add2eb18", new Object[]{this})).booleanValue();
        }
        if (!M1(this.q) || !F1() || L1()) {
            return false;
        }
        return true;
    }

    public final boolean H1(Filter filter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8ff97bd8", new Object[]{this, filter})).booleanValue();
        }
        if (filter.filterId != this.D) {
            return true;
        }
        return false;
    }

    public final boolean I1(Music music) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6d6ebe68", new Object[]{this, music})).booleanValue();
        }
        if (this.I == music.startClipTime && this.J == music.endClipTime) {
            return false;
        }
        return true;
    }

    @Override // tb.b9e
    public void J(b9e.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8ece067", new Object[]{this, bVar});
        } else {
            this.O = bVar;
        }
    }

    public final boolean J1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a8ffdb35", new Object[]{this})).booleanValue();
        }
        return eag.N();
    }

    public final boolean K1(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a93ba9c0", new Object[]{this, new Boolean(z)})).booleanValue();
        }
        if (z != this.W) {
            return true;
        }
        return false;
    }

    public final boolean L1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d05eed73", new Object[]{this})).booleanValue();
        }
        List<Paster> u = u();
        if (u == null) {
            return false;
        }
        for (Paster paster : u) {
            if (i5i.j(paster, this)) {
                return true;
            }
        }
        return false;
    }

    @Override // tb.v8e
    public boolean M() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3279d163", new Object[]{this})).booleanValue();
        }
        return F1();
    }

    public final void N1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13fa70cd", new Object[]{this});
            return;
        }
        List<b9e.a> list = this.N;
        if (list != null && !((ArrayList) list).isEmpty()) {
            Iterator it = ((ArrayList) this.N).iterator();
            while (it.hasNext()) {
                ((b9e.a) it.next()).onCancel();
            }
        }
    }

    public final boolean O1(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("949b5c2", new Object[]{this, str, new Boolean(z)})).booleanValue();
        }
        List<b9e.a> list = this.N;
        if (list == null || ((ArrayList) list).isEmpty()) {
            return false;
        }
        Iterator it = ((ArrayList) this.N).iterator();
        while (it.hasNext()) {
            ((b9e.a) it.next()).a(str, z);
        }
        return true;
    }

    public final void P1(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b9d8dd7", new Object[]{this, str, str2});
            return;
        }
        List<b9e.a> list = this.N;
        if (list != null && !((ArrayList) list).isEmpty()) {
            Iterator it = ((ArrayList) this.N).iterator();
            while (it.hasNext()) {
                ((b9e.a) it.next()).onError(str, str2);
            }
        }
    }

    public final void Q1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9e6339d", new Object[]{this});
            return;
        }
        List<b9e.a> list = this.N;
        if (list != null && !((ArrayList) list).isEmpty()) {
            Iterator it = ((ArrayList) this.N).iterator();
            while (it.hasNext()) {
                ((b9e.a) it.next()).onStart();
            }
        }
    }

    public final void R1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("caf8efcb", new Object[]{this});
            return;
        }
        Iterator<b9e.c> it = this.P.iterator();
        while (it.hasNext()) {
            it.next().b(this.B);
        }
    }

    public final void S1(float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36919b58", new Object[]{this, new Float(f2)});
            return;
        }
        Iterator<b9e.c> it = this.P.iterator();
        while (it.hasNext()) {
            it.next().a(f2);
        }
    }

    @Override // tb.b9e
    public void T(tdd tddVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8bdb55c", new Object[]{this, tddVar});
        } else if (tddVar != null && !this.Q.contains(tddVar)) {
            this.Q.add(tddVar);
        }
    }

    public final void T1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2a5eba7", new Object[]{this});
            return;
        }
        this.b0 = new e(this);
        ltl ltlVar = new ltl();
        this.c0 = ltlVar;
        ltlVar.d(this.b0);
    }

    @Override // tb.v8e
    public void U(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6f6954f", new Object[]{this, new Boolean(z)});
        } else {
            this.y.forbidNotify(z);
        }
    }

    @Override // tb.v8e
    public b9e V() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b9e) ipChange.ipc$dispatch("4467888d", new Object[]{this});
        }
        return this;
    }

    public void V1(float f2, Const.SeekFlag seekFlag) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9742bfe7", new Object[]{this, new Float(f2), seekFlag});
        } else if (this.A != null) {
            Cut O = O();
            if (O == null) {
                this.A.seekTo(((float) F()) * f2, seekFlag);
            } else {
                this.A.seekTo(((float) (O.endTime - O.startTime)) * f2, seekFlag);
            }
            S1(f2);
        }
    }

    public void W1(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dde290b5", new Object[]{this, str});
            return;
        }
        this.U = str;
        if (getVideos() != null) {
            for (Video video : getVideos()) {
                z1(video.clipId);
            }
        }
    }

    public void X1(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71d7c423", new Object[]{this, new Boolean(z)});
        } else {
            this.V = z;
        }
    }

    @Override // tb.v8e
    public void Y(Media media) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28389340", new Object[]{this, media});
        } else if (media != null) {
            String str = media.clipId;
            if (this.L.contains(str)) {
                this.y.setSourceStartTimeUs(str, media.sourceStartTimeUs);
                this.y.setSourceEndTimeUs(str, media.sourceEndTimeUs);
                media.clipStartTimeUs = this.y.getClipStartTimeUs(str);
                long clipEndTimeUs = this.y.getClipEndTimeUs(str);
                media.clipEndTimeUs = clipEndTimeUs;
                media.clipDurationMs = clipEndTimeUs - media.clipStartTimeUs;
            }
        }
    }

    public final void Y1(AiQuality aiQuality) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("159fda09", new Object[]{this, aiQuality});
            return;
        }
        x4 x4Var = this.n0;
        if (x4Var != null) {
            x4Var.d(aiQuality, this.L);
        }
    }

    @Override // tb.v8e
    public void Z(boolean z, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2de5972e", new Object[]{this, new Boolean(z), new Float(f2)});
            return;
        }
        this.X = z;
        this.Y = f2;
    }

    public final void Z1(Beauty beauty) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ece478dd", new Object[]{this, beauty});
            return;
        }
        v62 v62Var = this.o0;
        if (v62Var != null) {
            v62Var.e(beauty, this.L);
        }
    }

    public final boolean a1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f63da6bf", new Object[]{this})).booleanValue();
        }
        return muu.v(this.q);
    }

    public final void a2(Cut cut) {
        long j2;
        long j3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f86e8469", new Object[]{this, cut});
        } else if (this.y != null) {
            if (cut == null) {
                j2 = F();
                j3 = 0;
            } else {
                j3 = cut.startTime;
                j2 = cut.endTime;
            }
            long max = Math.max(0L, j3);
            long min = Math.min(F(), j2);
            if (!M1(this.q) && (!this.V || !a1())) {
                if (!eag.L() || this.s) {
                    u1(max, min);
                } else {
                    v1(max, min);
                }
            }
            d2(cut);
        }
    }

    public final void b1(Music music) {
        int i2;
        long j2;
        int i3 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef273854", new Object[]{this, music});
        } else if (music != null) {
            long j3 = music.startClipTime * 1000;
            long j4 = music.endClipTime * 1000;
            this.I = j3;
            this.J = j4;
            this.K = new ArrayList<>();
            long F = F() / 1000;
            Cut O = O();
            if (O != null) {
                F = O.getDuration() / 1000;
            }
            long j5 = music.cutDuration;
            if (j5 <= 0 || F <= 0 || j5 >= F) {
                String addMusicClip = this.y.addMusicClip("", music.path, 0L, j3, j4);
                this.G = this.y.getClipParentId(addMusicClip);
                this.K.add(addMusicClip);
                return;
            }
            int ceil = (int) Math.ceil((((float) F) * 1.0f) / ((float) j5));
            while (i3 < ceil) {
                long j6 = music.cutDuration * 1000 * i3;
                if (i3 == 0) {
                    j2 = j4;
                    i2 = ceil;
                    String addMusicClip2 = this.y.addMusicClip("", music.path, j6, j3, j2);
                    this.G = this.y.getClipParentId(addMusicClip2);
                    this.K.add(addMusicClip2);
                } else {
                    j2 = j4;
                    i2 = ceil;
                    this.K.add(this.y.addMusicClip(this.G, music.path, j6, j3, j2));
                }
                i3++;
                j4 = j2;
                ceil = i2;
            }
        }
    }

    public final void b2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad0b74ad", new Object[]{this});
            return;
        }
        Cut O = O();
        if (O == null) {
            O = new Cut();
        }
        O.startTime = 0L;
        O.endTime = F();
        K(O);
    }

    @Override // tb.v8e
    public void c0(List<Video> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c281939", new Object[]{this, list});
            return;
        }
        Iterator<String> it = this.L.iterator();
        while (it.hasNext()) {
            String next = it.next();
            if (!TextUtils.isEmpty(next)) {
                this.y.deleteClip(next);
            }
        }
        getVideos().clear();
        getVideos().addAll(list);
        E1(list);
        b2();
    }

    public final void c1(Filter filter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74746743", new Object[]{this, filter});
        } else if (filter.srcDirPath != null && this.y != null) {
            if (H1(filter)) {
                if (!TextUtils.isEmpty(this.C)) {
                    this.y.deleteClip(this.C);
                }
                this.C = this.y.addLookupClip("", filter.srcDirPath, 0L, F());
            }
            this.D = filter.filterId;
            this.y.setLookupIntensity(this.C, filter.level / 100.0f);
        }
    }

    public final void c2(Filter filter) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e6df465", new Object[]{this, filter});
        } else if (filter == null) {
            i1();
        } else if (filter.srcDirPath != null && this.y != null && filter.isVisibilityChange()) {
            Iterator<String> it = this.L.iterator();
            while (it.hasNext()) {
                String next = it.next();
                MeEditor meEditor = this.y;
                if (filter.visibilityValue == 1) {
                    z = true;
                } else {
                    z = false;
                }
                meEditor.setLookupVisibility(next, z);
            }
            filter.resetVisibility();
        } else if (G1()) {
            d1(filter);
        } else {
            c1(filter);
        }
    }

    @Override // tb.prc
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f04c258", new Object[]{this});
            return;
        }
        this.w = null;
        b(this.e0);
        b(this.f0);
        b(this.g0);
        b(this.h0);
        b(this.i0);
        b(this.j0);
        b(this.k0);
        b(this.l0);
    }

    public final void d1(Filter filter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38243233", new Object[]{this, filter});
        } else if (filter.srcDirPath != null && this.y != null) {
            if (H1(filter)) {
                Iterator<String> it = this.L.iterator();
                while (it.hasNext()) {
                    String next = it.next();
                    this.y.removeLookup(next);
                    this.y.setLookupPath(next, filter.srcDirPath);
                }
            }
            this.D = filter.filterId;
            float f2 = filter.level / 100.0f;
            Iterator<String> it2 = this.L.iterator();
            while (it2.hasNext()) {
                this.y.setLookupIntensity(it2.next(), f2);
            }
        }
    }

    @Override // tb.v8e
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        Viewer viewer = this.A;
        if (viewer != null) {
            viewer.stop();
            this.A.destroy();
        }
        Editor editor = this.x;
        if (editor != null) {
            editor.destroy();
        }
        Project project = this.z;
        if (project != null) {
            trt.g(new g(project));
        }
        this.x = null;
        this.A = null;
        this.z = null;
        this.y = null;
    }

    public final void e2(Music music) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20ae5549", new Object[]{this, music});
        } else if (this.u) {
            String str = this.K.get(0);
            if (music == null || TextUtils.isEmpty(music.musicId)) {
                this.y.changeClipRes(str, "", 0L, 0L);
            } else {
                music.musicClipId = str;
                long j2 = music.startClipTime * 1000;
                this.y.changeClipRes(str, music.path, j2, j2 + (this.t.durationMs * 1000));
            }
            a().isInputMusic = true;
        } else if (music == null || TextUtils.isEmpty(music.uniqueId())) {
            f1();
        } else {
            if (!music.uniqueId().equalsIgnoreCase(this.H)) {
                f1();
                b1(music);
            } else if (I1(music)) {
                f1();
                b1(music);
            }
            this.H = music.uniqueId();
        }
    }

    @Override // tb.v8e
    public void f(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e18e6d7", new Object[]{this, new Boolean(z)});
        } else {
            this.p0 = z;
        }
    }

    public final void f1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("faebcf40", new Object[]{this});
            return;
        }
        ArrayList<String> arrayList = this.K;
        if (arrayList != null) {
            if (arrayList.size() > 0) {
                Iterator<String> it = this.K.iterator();
                while (it.hasNext()) {
                    this.y.deleteClip(it.next());
                }
            }
            this.K.clear();
        }
        this.H = "";
    }

    public final void f2(List<Paster> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45b59f03", new Object[]{this, list});
        } else if (this.y != null && list != null) {
            this.c0.b(list);
        }
    }

    @Override // tb.b9e
    public void g(tdd tddVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e8b2fd9", new Object[]{this, tddVar});
        } else {
            this.Q.remove(tddVar);
        }
    }

    public final void g1() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5e5e1c", new Object[]{this});
            return;
        }
        MeEditor meEditor = this.y;
        if (meEditor != null && (str = this.C) != null) {
            meEditor.deleteClip(str);
            this.D = -1;
            this.C = "";
        }
    }

    public final void g2(Sticker sticker) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f121f09", new Object[]{this, sticker});
        } else if (sticker == null) {
            String str = this.E;
            if (str != null) {
                this.y.deleteClip(str);
                this.E = null;
                this.F = "";
            }
        } else if (new File(sticker.path).exists() && !sticker.resId.equalsIgnoreCase(this.F)) {
            MeEditor meEditor = this.y;
            if (meEditor != null) {
                String str2 = this.E;
                if (str2 != null) {
                    meEditor.deleteClip(str2);
                    this.E = null;
                    this.F = "";
                }
                this.E = this.y.addExtensionClip("", sticker.path, 0L, F(), "RaceSticker", SourceType.kSourceTexture, 0L);
            }
            this.F = sticker.resId;
        }
    }

    @Override // tb.prc
    public void h(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c93713a1", new Object[]{this, view});
            return;
        }
        this.w = view;
        c(this.e0);
        c(this.f0);
        c(this.g0);
        c(this.h0);
        c(this.i0);
        c(this.j0);
        c(this.k0);
        c(this.l0);
        T1();
        c2(getFilter());
        a2(O());
        e2(W());
        h2(getVolume());
        g2(d0());
        f2(u());
        Y1(I());
        Z1(n());
        D1();
    }

    @Override // tb.tqc
    public MeEditor h0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MeEditor) ipChange.ipc$dispatch("ad5367bf", new Object[]{this});
        }
        return this.y;
    }

    public final void h1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84a7b25a", new Object[]{this});
        } else if (this.y != null && this.L.size() > 0) {
            Iterator<String> it = this.L.iterator();
            while (it.hasNext()) {
                this.y.removeLookup(it.next());
            }
            this.D = -1;
        }
    }

    public final void h2(Volume volume) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d01354a1", new Object[]{this, volume});
        } else if (volume != null) {
            ArrayList<String> arrayList = this.L;
            if (arrayList != null && arrayList.size() > 0) {
                Iterator<String> it = this.L.iterator();
                while (it.hasNext()) {
                    this.y.setClipVolume(it.next(), volume.originVolume * volume.originScaleValue);
                }
            }
            List<Media> list = this.S;
            if (list != null && list.size() > 0) {
                for (Media media : this.S) {
                    if (media != null) {
                        this.y.setClipVolume(media.clipId, volume.originVolume);
                    }
                }
            }
            ArrayList<String> arrayList2 = this.K;
            if (arrayList2 != null && arrayList2.size() > 0) {
                Iterator<String> it2 = this.K.iterator();
                while (it2.hasNext()) {
                    this.y.setClipVolume(it2.next(), volume.musicVolume);
                }
            }
        }
    }

    @Override // tb.b9e
    public void i0(float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49644ce6", new Object[]{this, new Float(f2)});
        } else {
            V1(f2, Const.SeekFlag.SeekGoing);
        }
    }

    public final void i1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22a2bc04", new Object[]{this});
            return;
        }
        g1();
        h1();
    }

    @Override // tb.b9e
    public boolean isPlaying() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9a3f2a2f", new Object[]{this})).booleanValue();
        }
        return this.B;
    }

    @Override // tb.v8e
    public void j0(Media media) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a4182f2", new Object[]{this, media});
            return;
        }
        i5i.d(this.y, media.clipId, media.subClipId, media.clipExtendInfo, media.path, media.sourceStartTimeUs, media.sourceEndTimeUs);
    }

    public int j1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("89b7150f", new Object[]{this})).intValue();
        }
        MeEditor meEditor = this.y;
        if (meEditor != null) {
            return meEditor.getCanvasHeight();
        }
        return 0;
    }

    public Rect k1() {
        int i2;
        int i3 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Rect) ipChange.ipc$dispatch("aa8b5362", new Object[]{this});
        }
        int width = this.w.getWidth();
        int height = this.w.getHeight();
        int canvasWidth = this.y.getCanvasWidth();
        int canvasHeight = this.y.getCanvasHeight();
        if (canvasWidth == 0) {
            return new Rect();
        }
        Rect rect = new Rect();
        this.w.getHitRect(rect);
        float f2 = canvasWidth;
        int i4 = (int) (((width * canvasHeight) * 1.0f) / f2);
        int i5 = (int) (((height - i4) * 1.0f) / 2.0f);
        float f3 = canvasHeight;
        float f4 = height;
        if ((f2 * 1.0f) / f3 < (width * 1.0f) / f4) {
            i3 = (int) ((width - i2) / 2.0f);
            width = (int) (((f4 * 1.0f) * f2) / f3);
            i5 = 0;
        } else {
            height = i4;
        }
        Rect rect2 = new Rect(i3, i5, width + i3, height + i5);
        rect2.offset(rect.left, rect.top);
        return rect2;
    }

    public int l1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8e502514", new Object[]{this})).intValue();
        }
        int width = this.w.getWidth();
        int height = this.w.getHeight();
        int canvasWidth = this.y.getCanvasWidth();
        int canvasHeight = this.y.getCanvasHeight();
        if (canvasHeight == 0 || height == 0) {
            return 0;
        }
        float f2 = canvasWidth;
        float f3 = height;
        if ((f2 * 1.0f) / canvasHeight < (width * 1.0f) / f3) {
            return this.w.getTop();
        }
        return this.w.getTop() + ((int) ((f3 - (((width * canvasHeight) * 1.0f) / f2)) / 2.0f));
    }

    @Override // tb.v8e
    public void m(float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56ab043f", new Object[]{this, new Float(f2)});
        } else {
            this.Z = f2;
        }
    }

    @Override // tb.v8e
    public Size m0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Size) ipChange.ipc$dispatch("593df2f9", new Object[]{this});
        }
        MeEditor meEditor = this.y;
        if (meEditor != null) {
            return new Size(meEditor.getCanvasWidth(), this.y.getCanvasHeight());
        }
        return null;
    }

    public int m1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("dd675e92", new Object[]{this})).intValue();
        }
        MeEditor meEditor = this.y;
        if (meEditor != null) {
            return meEditor.getCanvasWidth();
        }
        return 0;
    }

    public float n1(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7468bf4e", new Object[]{this, str})).floatValue();
        }
        MeEditor meEditor = this.y;
        if (meEditor != null) {
            return meEditor.getContentHeight(str);
        }
        return 0.0f;
    }

    @Override // tb.tqc
    public Project o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Project) ipChange.ipc$dispatch("6d8f5dd1", new Object[]{this});
        }
        return this.z;
    }

    @Override // tb.v8e
    public void o0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d1826b5", new Object[]{this, new Boolean(z)});
        } else {
            this.d0 = z;
        }
    }

    public float o1(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e02e021", new Object[]{this, str})).floatValue();
        }
        MeEditor meEditor = this.y;
        if (meEditor != null) {
            return meEditor.getContentWidth(str);
        }
        return 0.0f;
    }

    @Override // tb.b9e
    public void p(b9e.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43cb3be6", new Object[]{this, cVar});
        } else if (cVar != null && !this.P.contains(cVar)) {
            this.P.add(cVar);
        }
    }

    @Override // tb.v8e
    public boolean p0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("32a75463", new Object[]{this})).booleanValue();
        }
        return this.p0;
    }

    public Rect p1() {
        int i2;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Rect) ipChange.ipc$dispatch("5cf39097", new Object[]{this});
        }
        ArrayList<String> arrayList = this.L;
        if (arrayList == null || arrayList.size() <= 0) {
            return new Rect();
        }
        String str = this.L.get(0);
        int width = this.w.getWidth();
        int height = this.w.getHeight();
        int canvasWidth = this.y.getCanvasWidth();
        int canvasHeight = this.y.getCanvasHeight();
        float contentWidth = this.y.getContentWidth(str);
        float contentHeight = this.y.getContentHeight(str);
        float positionX = this.y.getPositionX(str);
        float positionY = this.y.getPositionY(str);
        float f2 = canvasWidth;
        int i3 = (int) (((width * canvasHeight) * 1.0f) / f2);
        float f3 = canvasHeight;
        float f4 = height;
        if ((f2 * 1.0f) / f3 < (width * 1.0f) / f4) {
            i2 = (int) (((f4 * 1.0f) * f2) / f3);
            i3 = height;
        } else {
            i2 = width;
            z = false;
        }
        float f5 = i2;
        int i4 = (int) (contentWidth * f5);
        float f6 = i3;
        int i5 = (int) (contentHeight * f6);
        int i6 = (int) (((height - i5) / 2.0f) + (f6 * positionY));
        int i7 = (int) (f5 * positionX);
        if (z) {
            i7 = (int) (i7 + ((width - i2) / 2.0f));
        }
        Rect rect = new Rect(i7, i6, i4 + i7, i5 + i6);
        rect.offset(this.w.getLeft(), this.w.getTop());
        return rect;
    }

    @Override // tb.b9e
    public void pause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("315dbf7d", new Object[]{this});
            return;
        }
        Viewer viewer = this.A;
        if (viewer != null) {
            viewer.pause();
            this.B = false;
            R1();
        }
    }

    @Override // tb.b9e
    public void q0(b9e.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("230d2e49", new Object[]{this, cVar});
        } else {
            this.P.remove(cVar);
        }
    }

    public final String q1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1fd652ea", new Object[]{this});
        }
        return this.M;
    }

    public MeEditor r1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MeEditor) ipChange.ipc$dispatch("e644eaf0", new Object[]{this});
        }
        return this.y;
    }

    @Override // tb.b9e
    public void restart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2fd48316", new Object[]{this});
            return;
        }
        Viewer viewer = this.A;
        if (viewer != null) {
            viewer.seekTo(this.a0, Const.SeekFlag.SeekGoing);
            this.a0 = 0L;
            this.A.start();
            this.B = true;
            R1();
        }
    }

    @Override // tb.prc
    public List<Video> s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("20b94ebb", new Object[]{this});
        }
        return getVideos();
    }

    public Project s1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Project) ipChange.ipc$dispatch("107833a", new Object[]{this});
        }
        return this.z;
    }

    @Override // tb.v8e
    public void setCanvasSize(int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12f97a62", new Object[]{this, new Integer(i2), new Integer(i3)});
            return;
        }
        MeEditor meEditor = this.y;
        if (meEditor != null) {
            meEditor.setCanvasSize(i2, i3);
        }
    }

    @Override // tb.b9e
    public void start() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810347e9", new Object[]{this});
            return;
        }
        Viewer viewer = this.A;
        if (viewer != null) {
            long j2 = this.a0;
            if (j2 > 0) {
                viewer.seekTo(j2, Const.SeekFlag.SeekGoing);
            }
            this.A.start();
            this.B = true;
            R1();
        }
    }

    @Override // tb.tqc
    public uqc t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (uqc) ipChange.ipc$dispatch("fc1e3350", new Object[]{this});
        }
        return null;
    }

    /* renamed from: t1 */
    public Video l0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Video) ipChange.ipc$dispatch("6ec10051", new Object[]{this});
        }
        return y();
    }

    public final void u1(long j2, long j3) {
        long j4 = j2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41e69652", new Object[]{this, new Long(j4), new Long(j3)});
            return;
        }
        List<Video> videos = getVideos();
        if (videos != null && videos.size() > 0) {
            int i2 = -1;
            long j5 = 0;
            long j6 = 0;
            int i3 = 0;
            int i4 = -1;
            for (Video video : videos) {
                long j7 = video.durationMs * 1000;
                j6 += j7;
                if (j4 > j6) {
                    this.y.setSourceStartTimeUs(this.L.get(i3), 0L);
                    this.y.setSourceEndTimeUs(this.L.get(i3), j7);
                } else if (i4 == i2) {
                    if (i3 > 0) {
                        for (int i5 = 0; i5 < i3; i5++) {
                            this.y.setSourceStartTimeUs(this.L.get(i5), j5);
                            this.y.setSourceEndTimeUs(this.L.get(i5), j5);
                        }
                    }
                    this.y.setSourceStartTimeUs(this.L.get(i3), j7 - (j6 - j4));
                    this.y.setSourceEndTimeUs(this.L.get(i3), j7);
                    i4 = i3;
                }
                if (j3 <= j6) {
                    this.y.setSourceEndTimeUs(this.L.get(i3), j7 - (j6 - j3));
                    while (true) {
                        i3++;
                        if (i3 < this.L.size()) {
                            this.y.setSourceStartTimeUs(this.L.get(i3), 0L);
                            this.y.setSourceEndTimeUs(this.L.get(i3), 0L);
                        } else {
                            return;
                        }
                    }
                } else {
                    this.y.setSourceEndTimeUs(this.L.get(i3), j7);
                    i3++;
                    j4 = j2;
                    j5 = 0;
                    i2 = -1;
                }
            }
        }
    }

    @Override // tb.tqc
    public Viewer v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Viewer) ipChange.ipc$dispatch("9f3b9c5f", new Object[]{this});
        }
        return this.A;
    }

    public final void w1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7bb316ad", new Object[]{this});
        } else if (this.n0 == null) {
            x4 x4Var = new x4();
            this.n0 = x4Var;
            x4Var.c(this.y);
        }
    }

    @Override // tb.v8e
    public void x(MediaClips mediaClips) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47e76c5e", new Object[]{this, mediaClips});
        } else if (a() instanceof VideoEditInfo) {
            a().mediaClips = mediaClips;
        }
    }

    public final Size x1() {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Size) ipChange.ipc$dispatch("53fbbed2", new Object[]{this});
        }
        Video y = y();
        int displayWidth = y.getDisplayWidth();
        int displayHeight = y.getDisplayHeight();
        if (!this.d0) {
            return new Size(displayWidth, displayHeight);
        }
        if (displayWidth / displayHeight >= 0.5625f) {
            if (displayWidth > eag.o()) {
                z = true;
            }
            if (z) {
                displayWidth = 1080;
            } else {
                displayWidth = 720;
            }
            if (z) {
                displayHeight = 1920;
            } else {
                displayHeight = 1280;
            }
        }
        return new Size(displayWidth, displayHeight);
    }

    public final void y1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6533634", new Object[]{this});
        } else if (this.o0 == null) {
            v62 v62Var = new v62();
            this.o0 = v62Var;
            v62Var.c(this.y, null);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class p implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public p() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            boolean X0 = u6w.X0(u6w.this);
            odg.d("VideoEditor", "run: mCheck layoutOutsideOfMedia=" + X0);
            if (u6w.Y0(u6w.this) != X0) {
                u6w.B0(u6w.this, "layoutOutsideOfMedia");
            }
            u6w.Z0(u6w.this, X0);
        }
    }

    public final void d2(Cut cut) {
        Size size;
        String str;
        Canvas canvas;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd9e51f7", new Object[]{this, cut});
            return;
        }
        boolean z = this.W;
        if (M1(this.q)) {
            size = e1(getVideos());
        } else {
            Size x1 = x1();
            this.W = true;
            size = x1;
        }
        if (cut == null || (canvas = cut.canvas) == null) {
            if (M1(this.q)) {
                if (F1()) {
                    str = "none";
                } else {
                    str = "max";
                }
                W1(str);
            }
            this.y.setCanvasSize(size.getWidth(), size.getHeight());
            if (this.s) {
                this.y.setCanvasScaleType(ScaleType.kCenterInside);
            }
        } else {
            canvas.width = size.getWidth();
            long height = size.getHeight();
            canvas.height = height;
            this.y.setCanvasSize((int) canvas.width, (int) height);
            if (this.s) {
                this.y.setCanvasScaleType(ScaleType.kCenterInside);
            }
            Iterator<String> it = this.L.iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (TextUtils.isEmpty(canvas.bgPath)) {
                    this.y.setCanvasBackground(next, canvas.bgColor);
                } else if (cg9.l(canvas.bgPath)) {
                    this.y.setCanvasBackground(next, canvas.bgPath);
                }
                this.y.setPosition(next, canvas.xPosition, canvas.yPosition);
            }
        }
        if (K1(z)) {
            U1("lastResolutionSame");
        }
    }

    public static boolean M1(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5ed34fc", new Object[]{str})).booleanValue();
        }
        return TextUtils.equals(str, Resource.TYPE_DEFAULT_MULTI) || TextUtils.equals(str, Resource.TYPE_RECORD_MULTI);
    }

    public final void U1(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1eb74242", new Object[]{this, str});
        } else if (getFilter() != null) {
            odg.d("VideoEditor", "run: mCheck=======reloadFilter() scene=" + str);
            i1();
            c2(getFilter());
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003d, code lost:
        if (r3.equals("low") == false) goto L_0x0028;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void z1(java.lang.String r7) {
        /*
            r6 = this;
            r0 = 1
            r1 = 0
            r2 = 2
            com.android.alibaba.ip.runtime.IpChange r3 = tb.u6w.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x0015
            java.lang.String r4 = "3856f4ba"
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r1] = r6
            r2[r0] = r7
            r3.ipc$dispatch(r4, r2)
            return
        L_0x0015:
            boolean r3 = r6.J1()
            if (r3 == 0) goto L_0x005e
            java.lang.String r3 = r6.U
            r3.hashCode()
            r4 = -1
            int r5 = r3.hashCode()
            switch(r5) {
                case -1078030475: goto L_0x0040;
                case 107348: goto L_0x0036;
                case 107876: goto L_0x002a;
                default: goto L_0x0028;
            }
        L_0x0028:
            r0 = -1
            goto L_0x004b
        L_0x002a:
            java.lang.String r0 = "max"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x0034
            goto L_0x0028
        L_0x0034:
            r0 = 2
            goto L_0x004b
        L_0x0036:
            java.lang.String r1 = "low"
            boolean r1 = r3.equals(r1)
            if (r1 != 0) goto L_0x004b
            goto L_0x0028
        L_0x0040:
            java.lang.String r0 = "medium"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x004a
            goto L_0x0028
        L_0x004a:
            r0 = 0
        L_0x004b:
            switch(r0) {
                case 0: goto L_0x0057;
                case 1: goto L_0x0054;
                case 2: goto L_0x0051;
                default: goto L_0x004e;
            }
        L_0x004e:
            com.alibaba.marvel.java.BackgroundBlurType r0 = com.alibaba.marvel.java.BackgroundBlurType.kNone
            goto L_0x0059
        L_0x0051:
            com.alibaba.marvel.java.BackgroundBlurType r0 = com.alibaba.marvel.java.BackgroundBlurType.kBlurMax
            goto L_0x0059
        L_0x0054:
            com.alibaba.marvel.java.BackgroundBlurType r0 = com.alibaba.marvel.java.BackgroundBlurType.kBlurLow
            goto L_0x0059
        L_0x0057:
            com.alibaba.marvel.java.BackgroundBlurType r0 = com.alibaba.marvel.java.BackgroundBlurType.kBlurMedium
        L_0x0059:
            com.alibaba.marvel.MeEditor r1 = r6.y
            r1.setCanvasBackground(r7, r0)
        L_0x005e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.u6w.z1(java.lang.String):void");
    }

    public final void E1(List<? extends Media> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb346a4", new Object[]{this, list});
        } else if (list != null && list.size() >= 1) {
            this.L.clear();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            boolean z = true;
            for (Media media : list) {
                long j2 = media.sourceStartTimeUs;
                long j3 = media.sourceEndTimeUs;
                long j4 = media.durationMs * 1000;
                if (j3 <= 0) {
                    j3 = j4;
                }
                String addMainClip = this.y.addMainClip(media.path, j2 < 0 ? 0L : j2, j3 > j4 ? j4 : j3);
                media.clipId = addMainClip;
                this.L.add(addMainClip);
                if (TextUtils.isEmpty(addMainClip)) {
                    z = false;
                }
            }
            long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
            HashMap hashMap = new HashMap();
            hashMap.put("media_size", Integer.valueOf(list.size()));
            n9g.b("edit.video", "add_main_clips", elapsedRealtime2, z, hashMap);
            w1();
            y1();
        }
    }

    public final Size e1(List<Video> list) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Size) ipChange.ipc$dispatch("fd6d84ca", new Object[]{this, list});
        }
        int i2 = 720;
        Size size = new Size(720, 1280);
        if (list == null || list.size() == 0) {
            n9g.a("Video.Editor", "mul_canvas_size_invalid", "mainMediaResList == null or size == 0", null);
            return size;
        }
        ArrayList arrayList = new ArrayList();
        int i3 = 0;
        int i4 = 0;
        for (Video video : list) {
            if (video == null || video.getDisplayHeight() == 0) {
                odg.c("VideoEditor", "video == null || video.getDisplayHeight() == 0, " + video);
                n9g.a("Video.Editor", "mul_canvas_size_invalid", "video == null or video.getDisplayHeight() == 0", null);
            } else {
                int displayHeight = video.getDisplayHeight();
                float displayWidth = (video.getDisplayWidth() * 1.0f) / displayHeight;
                if (displayHeight > i3) {
                    i4 = video.getDisplayWidth();
                    i3 = displayHeight;
                }
                arrayList.add(Float.valueOf(displayWidth));
            }
        }
        if (arrayList.size() <= 0) {
            return size;
        }
        Collections.sort(arrayList);
        Float f2 = (Float) arrayList.get(0);
        this.W = f2.compareTo((Float) arrayList.get(arrayList.size() - 1)) == 0;
        if (f2.compareTo(Float.valueOf(0.5625f)) >= 0) {
            if (i4 <= eag.o()) {
                z = false;
            }
            if (z) {
                i2 = 1080;
            }
            i3 = z ? 1920 : 1280;
        } else if (i4 < 720) {
            i3 = (int) (720 / f2.floatValue());
        } else {
            i2 = (int) (i3 * f2.floatValue());
        }
        return new Size(i2, i3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00bf, code lost:
        if (r14 > r28) goto L_0x00a1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void v1(long r26, long r28) {
        /*
            Method dump skipped, instructions count: 225
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.u6w.v1(long, long):void");
    }

    public u6w(Video video, VideoEditInfo videoEditInfo) {
        super(video, videoEditInfo);
        this.L = new ArrayList<>();
        this.P = new ArrayList<>();
        this.Q = new ArrayList<>();
        this.U = "none";
        this.V = false;
        this.W = true;
        this.a0 = 0L;
        this.d0 = true;
        this.e0 = new h();
        this.f0 = new i();
        this.g0 = new j();
        this.h0 = new k();
        this.i0 = new l();
        this.j0 = new m();
        this.k0 = new n();
        this.l0 = new o();
        this.m0 = new p();
        this.q0 = false;
        this.r0 = new a();
        this.s = true;
        A1(Environment.getExternalStorageDirectory().getAbsolutePath() + "/Marvel/Draft/" + System.currentTimeMillis() + "/draft.json");
        y0(F());
    }
}
