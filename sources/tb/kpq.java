package tb;

import android.text.TextUtils;
import android.util.Pair;
import anetwork.channel.NetworkCallBack;
import anetwork.channel.NetworkEvent;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import mtopsdk.common.util.HeaderHandlerUtil;
import mtopsdk.common.util.HttpHeaderConstant;
import mtopsdk.common.util.StringUtils;
import mtopsdk.common.util.TBSdkLog;
import mtopsdk.mtop.global.SwitchConfig;
import mtopsdk.mtop.network.StreamNetworkCallbackAdapter;
import mtopsdk.mtop.util.ErrorConstant;
import mtopsdk.mtop.util.JsonUtil;
import mtopsdk.mtop.util.MtopSDKThreadPoolExecutorFactory;
import mtopsdk.network.domain.NetworkStats;
import tb.boo;
import tb.nrf;
import tb.o9o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class kpq implements NetworkCallBack.ResponseCodeListener, NetworkCallBack.ProgressListener, NetworkCallBack.FinishListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public f B;
    public final boolean D;
    public nrf.b E;
    public final zu2 I;
    public final htj J;
    public final String d;
    public final int e;
    public volatile boolean j;
    public int v;
    public boo.a w;
    public byte[] x;
    public int y;
    public Map<String, List<String>> z;

    /* renamed from: a  reason: collision with root package name */
    public final AtomicInteger f22833a = new AtomicInteger(0);
    public final AtomicInteger b = new AtomicInteger(0);
    public final AtomicBoolean c = new AtomicBoolean(false);
    public volatile boolean f = false;
    public volatile boolean g = false;
    public volatile boolean h = false;
    public volatile boolean i = false;
    public volatile long k = 0;
    public volatile long l = 0;
    public volatile long m = 0;
    public volatile long n = 0;
    public volatile long o = 0;
    public volatile long p = 0;
    public volatile long q = 0;
    public final AtomicInteger r = new AtomicInteger(0);
    public final AtomicInteger s = new AtomicInteger(0);
    public final AtomicBoolean t = new AtomicBoolean(false);
    public final AtomicLong u = new AtomicLong(0);
    public ByteArrayOutputStream A = null;
    public String C = "";
    public long F = -1;
    public long G = -1;
    public boolean H = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ NetworkEvent.FinishEvent f22834a;

        public a(NetworkEvent.FinishEvent finishEvent) {
            this.f22834a = finishEvent;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            xvj.b(kpq.a(kpq.this));
            kpq.this.F(this.f22834a);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ byte[] f22835a;

        public b(byte[] bArr) {
            this.f22835a = bArr;
        }

        @Override // java.lang.Runnable
        public void run() {
            int i;
            int max;
            boo.b bVar;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            if (!kpq.c(kpq.this).get()) {
                kpq.p(kpq.this).getAndAdd(1);
            }
            if (!kpq.v(kpq.this).get()) {
                try {
                    if (kpq.w(kpq.this) <= 0) {
                        kpq.x(kpq.this, System.currentTimeMillis());
                    }
                    kpq kpqVar = kpq.this;
                    kpq.z(kpqVar, kpq.A(kpqVar, this.f22835a));
                    if (kpq.B(kpq.this) <= 0) {
                        kpq.C(kpq.this, System.currentTimeMillis());
                    }
                    if (!kpq.D(kpq.this)) {
                        while (true) {
                            int b = boo.b(kpq.E(kpq.this), Math.max(0, (kpq.y(kpq.this) - this.f22835a.length) - 2), kpq.y(kpq.this));
                            if (b != -1) {
                                String d = kpq.d(kpq.this);
                                TBSdkLog.e("mtopsdk.StreamNetworkListenerAdapter", d, "[------findNewlineIndex] index = " + b);
                                if (kpq.e(kpq.this) <= 0 && kpq.B(kpq.this) >= 0) {
                                    kpq.f(kpq.this, System.currentTimeMillis() - kpq.B(kpq.this));
                                }
                                kpq kpqVar2 = kpq.this;
                                kpq.g(kpqVar2, kpq.E(kpqVar2), 0, b);
                                kpq kpqVar3 = kpq.this;
                                kpqVar3.H(kpq.E(kpqVar3), b + 2);
                            } else {
                                return;
                            }
                        }
                    } else {
                        while (true) {
                            if (kpq.h(kpq.this) == null) {
                                kpq.i(kpq.this, new boo.a());
                            }
                            if (kpq.h(kpq.this).c) {
                                i = (kpq.y(kpq.this) - this.f22835a.length) - 1;
                            } else {
                                i = kpq.y(kpq.this) - this.f22835a.length;
                            }
                            max = Math.max(0, i);
                            boo.g(kpq.E(kpq.this), max, kpq.y(kpq.this) - max, kpq.h(kpq.this));
                            int i2 = kpq.h(kpq.this).f16514a;
                            if (i2 == -1) {
                                break;
                            }
                            if (!(kpq.k(kpq.this) == null || (bVar = (boo.b) ((LinkedHashMap) kpq.h(kpq.this).e).get("data: ")) == null)) {
                                kpq.k(kpq.this).b(kpq.E(kpq.this), max, (bVar.b + bVar.c) - max);
                            }
                            String d2 = kpq.d(kpq.this);
                            TBSdkLog.e("mtopsdk.StreamNetworkListenerAdapter", d2, "[------findNewlineIndex] index = " + i2);
                            if (kpq.e(kpq.this) <= 0 && kpq.B(kpq.this) >= 0) {
                                kpq.f(kpq.this, System.currentTimeMillis() - kpq.B(kpq.this));
                            }
                            kpq kpqVar4 = kpq.this;
                            kpq.m(kpqVar4, kpq.E(kpqVar4), kpq.h(kpq.this).e);
                            kpq kpqVar5 = kpq.this;
                            kpqVar5.H(kpq.E(kpqVar5), i2 + 2);
                            kpq.h(kpq.this).a();
                        }
                        if (kpq.j(kpq.this) && kpq.h(kpq.this).b != null && TextUtils.equals(kpq.h(kpq.this).b.f16515a, "data: ")) {
                            if (kpq.k(kpq.this) == null) {
                                TBSdkLog.e("mtopsdk.StreamNetworkListenerAdapter", kpq.d(kpq.this), "[parseStreamData]create json stream chain.");
                                kpq.l(kpq.this, nrf.b());
                                kpq.k(kpq.this).b(kpq.E(kpq.this), kpq.h(kpq.this).b.b, kpq.y(kpq.this) - kpq.h(kpq.this).b.b);
                                return;
                            }
                            kpq.k(kpq.this).b(kpq.E(kpq.this), max, kpq.y(kpq.this) - max);
                        }
                    }
                } catch (Throwable th) {
                    TBSdkLog.e("mtopsdk.StreamNetworkListenerAdapter", kpq.d(kpq.this), "[parseStreamData1]Read data failed.", th);
                    kpq.b(kpq.this, null);
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ byte[] f22836a;

        public c(byte[] bArr) {
            this.f22836a = bArr;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            if (kpq.j(kpq.this)) {
                if (kpq.k(kpq.this) == null) {
                    kpq.l(kpq.this, nrf.b());
                }
                nrf.b k = kpq.k(kpq.this);
                byte[] bArr = this.f22836a;
                k.b(bArr, 0, bArr.length);
            }
            kpq.A(kpq.this, this.f22836a);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public class d extends q9o {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ byte[] b;

        public d(kpq kpqVar, byte[] bArr) {
            this.b = bArr;
        }

        public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in mtopsdk/network/impl/StreamNetworkListenerAdapter$4");
        }

        @Override // tb.q9o
        public InputStream a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (InputStream) ipChange.ipc$dispatch("9a7074b2", new Object[]{this});
            }
            return null;
        }

        @Override // tb.q9o
        public long b() throws IOException {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("905069ba", new Object[]{this})).longValue();
            }
            byte[] bArr = this.b;
            if (bArr != null) {
                return bArr.length;
            }
            return 0L;
        }

        @Override // tb.q9o
        public byte[] c() throws IOException {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (byte[]) ipChange.ipc$dispatch("3e6c8fa1", new Object[]{this});
            }
            return this.b;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public class e implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            jpq jpqVar = new jpq();
            jpqVar.c = kpq.o(kpq.this);
            jpqVar.f22144a = kpq.q(kpq.this).get();
            jpqVar.b = kpq.r(kpq.this).get();
            o9o e = new o9o.b().l(kpq.this.I.request()).g(-9).h(kpq.n(kpq.this)).f(new byte[0]).n(jpqVar).e();
            kpq kpqVar = kpq.this;
            kpqVar.J.onResponse(kpqVar.I, e);
        }
    }

    static {
        t2o.a(589300052);
        t2o.a(607125969);
        t2o.a(607125968);
        t2o.a(607125966);
    }

    public kpq(zu2 zu2Var, htj htjVar, String str, int i) {
        boolean z = false;
        this.e = 10000;
        this.j = false;
        this.I = zu2Var;
        this.J = htjVar;
        this.d = str;
        if (i > 0) {
            this.e = i;
        }
        this.j = SwitchConfig.getInstance().isOptStreamParse();
        if (SwitchConfig.getInstance().isStreamJsonEnable() && zu2Var.request().z && zu2Var.request().A == null) {
            z = true;
        }
        this.D = z;
    }

    public static /* synthetic */ int A(kpq kpqVar, byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("aa3f62a0", new Object[]{kpqVar, bArr})).intValue();
        }
        return kpqVar.S(bArr);
    }

    public static /* synthetic */ long B(kpq kpqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("28244679", new Object[]{kpqVar})).longValue();
        }
        return kpqVar.n;
    }

    public static /* synthetic */ long C(kpq kpqVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("278d12d5", new Object[]{kpqVar, new Long(j)})).longValue();
        }
        kpqVar.n = j;
        return j;
    }

    public static /* synthetic */ boolean D(kpq kpqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b5115da8", new Object[]{kpqVar})).booleanValue();
        }
        return kpqVar.j;
    }

    public static /* synthetic */ byte[] E(kpq kpqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("fdd0247a", new Object[]{kpqVar});
        }
        return kpqVar.x;
    }

    public static /* synthetic */ ByteArrayOutputStream a(kpq kpqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ByteArrayOutputStream) ipChange.ipc$dispatch("7d418867", new Object[]{kpqVar});
        }
        return kpqVar.A;
    }

    public static /* synthetic */ ByteArrayOutputStream b(kpq kpqVar, ByteArrayOutputStream byteArrayOutputStream) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ByteArrayOutputStream) ipChange.ipc$dispatch("26073dc", new Object[]{kpqVar, byteArrayOutputStream});
        }
        kpqVar.A = byteArrayOutputStream;
        return byteArrayOutputStream;
    }

    public static /* synthetic */ AtomicBoolean c(kpq kpqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AtomicBoolean) ipChange.ipc$dispatch("7556434b", new Object[]{kpqVar});
        }
        return kpqVar.t;
    }

    public static /* synthetic */ String d(kpq kpqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("96598323", new Object[]{kpqVar});
        }
        return kpqVar.d;
    }

    public static /* synthetic */ long e(kpq kpqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b2b00630", new Object[]{kpqVar})).longValue();
        }
        return kpqVar.o;
    }

    public static /* synthetic */ long f(kpq kpqVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ee7949fe", new Object[]{kpqVar, new Long(j)})).longValue();
        }
        kpqVar.o = j;
        return j;
    }

    public static /* synthetic */ void g(kpq kpqVar, byte[] bArr, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b23b742", new Object[]{kpqVar, bArr, new Integer(i), new Integer(i2)});
        } else {
            kpqVar.M(bArr, i, i2);
        }
    }

    public static /* synthetic */ boo.a h(kpq kpqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (boo.a) ipChange.ipc$dispatch("28346e52", new Object[]{kpqVar});
        }
        return kpqVar.w;
    }

    public static /* synthetic */ boo.a i(kpq kpqVar, boo.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (boo.a) ipChange.ipc$dispatch("449928de", new Object[]{kpqVar, aVar});
        }
        kpqVar.w = aVar;
        return aVar;
    }

    public static /* synthetic */ boolean j(kpq kpqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("59774b9d", new Object[]{kpqVar})).booleanValue();
        }
        return kpqVar.D;
    }

    public static /* synthetic */ nrf.b k(kpq kpqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nrf.b) ipChange.ipc$dispatch("bbd7085b", new Object[]{kpqVar});
        }
        return kpqVar.E;
    }

    public static /* synthetic */ nrf.b l(kpq kpqVar, nrf.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nrf.b) ipChange.ipc$dispatch("5274bfa0", new Object[]{kpqVar, bVar});
        }
        kpqVar.E = bVar;
        return bVar;
    }

    public static /* synthetic */ void m(kpq kpqVar, byte[] bArr, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d9ceee7", new Object[]{kpqVar, bArr, map});
        } else {
            kpqVar.N(bArr, map);
        }
    }

    public static /* synthetic */ Map n(kpq kpqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("7857718a", new Object[]{kpqVar});
        }
        return kpqVar.z;
    }

    public static /* synthetic */ String o(kpq kpqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("677903ec", new Object[]{kpqVar});
        }
        return kpqVar.C;
    }

    public static /* synthetic */ AtomicInteger p(kpq kpqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AtomicInteger) ipChange.ipc$dispatch("d84b9154", new Object[]{kpqVar});
        }
        return kpqVar.s;
    }

    public static /* synthetic */ AtomicInteger q(kpq kpqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AtomicInteger) ipChange.ipc$dispatch("f3bd0948", new Object[]{kpqVar});
        }
        return kpqVar.f22833a;
    }

    public static /* synthetic */ AtomicInteger r(kpq kpqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AtomicInteger) ipChange.ipc$dispatch("ac49c9a7", new Object[]{kpqVar});
        }
        return kpqVar.b;
    }

    public static /* synthetic */ boolean s(kpq kpqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5052ea20", new Object[]{kpqVar})).booleanValue();
        }
        return kpqVar.h;
    }

    public static /* synthetic */ void t(kpq kpqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd40013b", new Object[]{kpqVar});
        } else {
            kpqVar.J();
        }
    }

    public static /* synthetic */ int u(kpq kpqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6a2d184d", new Object[]{kpqVar})).intValue();
        }
        return kpqVar.e;
    }

    public static /* synthetic */ AtomicBoolean v(kpq kpqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AtomicBoolean) ipChange.ipc$dispatch("e66fc409", new Object[]{kpqVar});
        }
        return kpqVar.c;
    }

    public static /* synthetic */ long w(kpq kpqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("815d011c", new Object[]{kpqVar})).longValue();
        }
        return kpqVar.k;
    }

    public static /* synthetic */ long x(kpq kpqVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f56bac92", new Object[]{kpqVar, new Long(j)})).longValue();
        }
        kpqVar.k = j;
        return j;
    }

    public static /* synthetic */ int y(kpq kpqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e4a183a", new Object[]{kpqVar})).intValue();
        }
        return kpqVar.v;
    }

    public static /* synthetic */ int z(kpq kpqVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6217591", new Object[]{kpqVar, new Integer(i)})).intValue();
        }
        kpqVar.v = i;
        return i;
    }

    public void F(NetworkEvent.FinishEvent finishEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65af56ec", new Object[]{this, finishEvent});
        } else if (this.c.get()) {
            TBSdkLog.e("mtopsdk.StreamNetworkListenerAdapter", this.d, "[callFinish] read timeout finish.");
        } else {
            f fVar = this.B;
            if (fVar != null) {
                fVar.c();
            }
            try {
                long currentTimeMillis = System.currentTimeMillis();
                K(finishEvent);
                if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.DebugEnable)) {
                    String str = this.d;
                    TBSdkLog.d("mtopsdk.StreamNetworkListenerAdapter", str, "[callFinish] execute onFinishTask time[ms] " + (System.currentTimeMillis() - currentTimeMillis));
                }
            } catch (Exception e2) {
                TBSdkLog.e("mtopsdk.StreamNetworkListenerAdapter", this.d, "[callFinish]execute onFinishTask error.", e2);
            }
        }
    }

    public final void G() throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16875340", new Object[]{this});
            return;
        }
        String str = this.d;
        TBSdkLog.e("mtopsdk.StreamNetworkListenerAdapter", str, "[callbackDataAndResetStatus] id: " + this.C);
        this.A.flush();
        byte[] byteArray = this.A.toByteArray();
        L(byteArray, I(byteArray));
        this.A.reset();
        this.i = false;
        if (this.B == null) {
            f fVar = new f(this, null);
            this.B = fVar;
            fVar.b();
        } else if (!this.h) {
            this.B.a();
        }
    }

    public void H(byte[] bArr, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f15b78b2", new Object[]{this, bArr, new Integer(i)});
            return;
        }
        int i2 = this.v;
        if (i >= i2) {
            this.v = 0;
            return;
        }
        int i3 = i2 - i;
        System.arraycopy(bArr, i, bArr, 0, i3);
        this.v = i3;
    }

    public final JSONObject I(byte[] bArr) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("3a3b40ac", new Object[]{this, bArr});
        }
        JSONObject jSONObject2 = null;
        if (this.D) {
            long currentTimeMillis = System.currentTimeMillis();
            nrf.b bVar = this.E;
            if (bVar == null) {
                jSONObject = JsonUtil.parseWithJson2(bArr);
            } else {
                bVar.c();
                try {
                    jSONObject = this.E.d();
                } catch (Exception e2) {
                    this.H = true;
                    TBSdkLog.e("mtopsdk.StreamNetworkListenerAdapter", this.d, "[stream-json]error.", e2);
                    jSONObject = null;
                }
                this.E = null;
            }
            jSONObject2 = jSONObject;
            if (jSONObject2 != null && this.F < 0) {
                this.F = System.currentTimeMillis() - currentTimeMillis;
                if (bArr != null && bArr.length > 0) {
                    this.G = bArr.length;
                }
                TBSdkLog.e("mtopsdk.StreamNetworkListenerAdapter", this.d, "[stream-json]cost = " + this.F + ", size = " + this.G);
            }
        } else if (this.I.request().z && this.I.request().A == null) {
            long currentTimeMillis2 = System.currentTimeMillis();
            jSONObject2 = JsonUtil.parse(bArr);
            if (jSONObject2 != null && this.F < 0) {
                this.F = System.currentTimeMillis() - currentTimeMillis2;
                if (bArr != null && bArr.length > 0) {
                    this.G = bArr.length;
                }
                TBSdkLog.e("mtopsdk.StreamNetworkListenerAdapter", this.d, "[fast-json]cost = " + this.F + ", size = " + this.G);
            }
        }
        return jSONObject2;
    }

    public final void J() {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b64cfe87", new Object[]{this});
            return;
        }
        String str = this.d;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = hashCode();
        }
        MtopSDKThreadPoolExecutorFactory.submitStreamRequestTask(i, new e());
    }

    public void K(NetworkEvent.FinishEvent finishEvent) {
        JSONObject jSONObject;
        byte[] bArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e81116c6", new Object[]{this, finishEvent});
        } else if (this.J == null) {
            TBSdkLog.e("mtopsdk.StreamNetworkListenerAdapter", this.d, "[onFinishTask]networkCallback is null");
        } else {
            jpq jpqVar = null;
            if (!this.f) {
                bArr = this.x;
                if (bArr != null) {
                    int length = bArr.length;
                    int i = this.v;
                    if (length != i) {
                        bArr = Arrays.copyOf(bArr, i);
                    }
                }
                jSONObject = I(bArr);
            } else {
                if (this.A != null) {
                    bArr = new byte[0];
                } else {
                    bArr = null;
                }
                nrf.b bVar = this.E;
                if (bVar != null) {
                    bVar.c();
                    this.E = null;
                }
                jSONObject = null;
            }
            d dVar = new d(this, bArr);
            if (this.f) {
                jpqVar = new jpq();
                jpqVar.f22144a = this.f22833a.get();
                jpqVar.b = this.b.get();
                jpqVar.j = this.q;
            }
            if (this.z == null) {
                this.z = new HashMap();
            }
            if (TextUtils.isEmpty(HeaderHandlerUtil.getSingleHeaderFieldByKey(this.z, HttpHeaderConstant.X_RETCODE))) {
                this.z.put(HttpHeaderConstant.X_RETCODE, new ArrayList(Collections.singleton(ErrorConstant.ERRCODE_SYS_STREAM_UNKNOWN_ERROR)));
            }
            NetworkStats a2 = xb.a(finishEvent.getStatisticData());
            a2.streamParseTime = this.F;
            a2.streamParseSize = this.G;
            a2.streamParseException = this.H;
            this.J.onResponse(this.I, new o9o.b().l(this.I.request()).g(finishEvent.getHttpCode()).i(finishEvent.getDesc()).h(this.z).d(dVar).n(jpqVar).j(jSONObject).m(a2).e());
        }
    }

    public final void L(byte[] bArr, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38096f94", new Object[]{this, bArr, jSONObject});
        } else if (bArr == null || bArr.length == 0) {
            TBSdkLog.e("mtopsdk.StreamNetworkListenerAdapter", this.d, "[onReceiveData] bytes is null.");
        } else if (this.c.get()) {
            TBSdkLog.e("mtopsdk.StreamNetworkListenerAdapter", this.d, "[onReceiveData] read timeout finish.");
        } else if (this.h) {
            bqq a2 = bqq.a(new String(bArr));
            String c2 = a2.c();
            String b2 = a2.b();
            if (this.z == null) {
                this.z = new HashMap();
            }
            if (!TextUtils.isEmpty(c2)) {
                this.z.put(HttpHeaderConstant.X_RETCODE, new ArrayList(Collections.singleton(c2)));
            }
            if (!TextUtils.isEmpty(b2)) {
                this.z.put(HttpHeaderConstant.X_BIN_LENGTH, new ArrayList(Collections.singleton(b2)));
            }
        } else {
            if (this.l <= 0 && this.k > 0) {
                this.l = System.currentTimeMillis() - this.k;
            }
            if (!this.t.get()) {
                this.t.set(true);
            }
            jpq jpqVar = new jpq();
            jpqVar.c = this.C;
            jpqVar.d = this.l;
            jpqVar.e = this.m;
            jpqVar.f = this.r.get();
            jpqVar.h = this.s.get();
            jpqVar.g = this.u.get();
            jpqVar.i = this.o;
            o9o e2 = new o9o.b().l(this.I.request()).g(this.y).h(new HashMap(this.z)).f(bArr).j(jSONObject).n(jpqVar).e();
            htj htjVar = this.J;
            if (htjVar instanceof StreamNetworkCallbackAdapter) {
                ((StreamNetworkCallbackAdapter) htjVar).onReceiveData(e2);
            }
        }
    }

    public final void M(byte[] bArr, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db3235f7", new Object[]{this, bArr, new Integer(i), new Integer(i2)});
            return;
        }
        try {
            long currentTimeMillis = System.currentTimeMillis();
            List<Pair<Integer, Integer>> f2 = boo.f(bArr, i, i2);
            String str = this.d;
            TBSdkLog.e("mtopsdk.StreamNetworkListenerAdapter", str, "[------parseAndCallback] index = " + f2.size());
            if (f2.size() > 0) {
                for (Pair<Integer, Integer> pair : f2) {
                    P(bArr, pair);
                }
                if (this.m <= 0) {
                    this.m = System.currentTimeMillis() - currentTimeMillis;
                }
                G();
            }
        } catch (Throwable th) {
            TBSdkLog.e("mtopsdk.StreamNetworkListenerAdapter", this.d, "[parseAndCallback] failed.", th);
        }
    }

    public final void N(byte[] bArr, Map<String, boo.b> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90a2134e", new Object[]{this, bArr, map});
        } else if (!map.isEmpty()) {
            try {
                long currentTimeMillis = System.currentTimeMillis();
                for (Map.Entry<String, boo.b> entry : map.entrySet()) {
                    boo.b value = entry.getValue();
                    Q(bArr, entry.getKey(), value.b, value.c);
                }
                if (this.m <= 0) {
                    this.m = System.currentTimeMillis() - currentTimeMillis;
                }
                G();
            } catch (Throwable th) {
                TBSdkLog.e("mtopsdk.StreamNetworkListenerAdapter", this.d, "[parseAndCallback] failed.", th);
            }
        }
    }

    public final void O(byte[] bArr) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cdfa6ecb", new Object[]{this, bArr});
            return;
        }
        String str = this.d;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = hashCode();
        }
        MtopSDKThreadPoolExecutorFactory.submitStreamRequestTask(i, new c(bArr));
    }

    public final void P(byte[] bArr, Pair<Integer, Integer> pair) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd199ac2", new Object[]{this, bArr, pair});
            return;
        }
        Pair<String, Pair<Integer, Integer>> c2 = boo.c(bArr, pair);
        if (c2 != null) {
            Pair pair2 = (Pair) c2.second;
            Q(bArr, (String) c2.first, ((Integer) pair2.first).intValue(), ((Integer) pair2.second).intValue());
        }
    }

    public final void Q(byte[] bArr, String str, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fcfc9aa4", new Object[]{this, bArr, str, new Integer(i), new Integer(i2)});
        } else if (TextUtils.equals(str, "id: ")) {
            this.C = new String(bArr, i, i2);
            String str2 = this.d;
            TBSdkLog.e("mtopsdk.StreamNetworkListenerAdapter", str2, "[parseSseProtocol] id: " + this.C);
            this.f22833a.incrementAndGet();
        } else if (TextUtils.equals(str, "event: ")) {
            if (boo.a("trailer".getBytes(), bArr, i, i2)) {
                String str3 = this.d;
                TBSdkLog.e("mtopsdk.StreamNetworkListenerAdapter", str3, "[parseSseProtocol] event trailer: id: " + this.C);
                this.h = true;
                f fVar = this.B;
                if (fVar != null) {
                    fVar.c();
                }
            } else if (boo.a("resp".getBytes(), bArr, i, i2)) {
                String str4 = this.d;
                TBSdkLog.e("mtopsdk.StreamNetworkListenerAdapter", str4, "[parseSseProtocol] event response id: " + this.C);
                this.i = true;
                this.b.incrementAndGet();
            }
        } else if (!TextUtils.equals(str, "data: ")) {
        } else {
            if ((this.i || this.h) && i2 > 0) {
                String str5 = this.d;
                TBSdkLog.e("mtopsdk.StreamNetworkListenerAdapter", str5, "[parseSseProtocol] validate data: id: " + this.C);
                this.A.write(bArr, i, i2);
            }
        }
    }

    public final void R(byte[] bArr) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5518602b", new Object[]{this, bArr});
        } else if (!this.c.get()) {
            if (this.A == null) {
                this.A = new ByteArrayOutputStream(bArr.length);
            }
            String str = this.d;
            if (str != null) {
                i = str.hashCode();
            } else {
                i = hashCode();
            }
            MtopSDKThreadPoolExecutorFactory.submitStreamRequestTask(i, new b(bArr));
        }
    }

    public final int S(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("16687024", new Object[]{this, bArr})).intValue();
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (this.x == null) {
            this.x = new byte[16384];
            this.v = 0;
        }
        int length = this.v + bArr.length;
        if (this.x.length < length) {
            if (!this.t.get()) {
                this.r.getAndAdd(1);
            }
            byte[] bArr2 = new byte[Math.max(length, this.x.length + 16384)];
            byte[] bArr3 = this.x;
            System.arraycopy(bArr3, 0, bArr2, 0, bArr3.length);
            this.x = bArr2;
        }
        System.arraycopy(bArr, 0, this.x, this.v, bArr.length);
        this.v += bArr.length;
        if (!this.t.get()) {
            this.u.getAndAdd(System.currentTimeMillis() - currentTimeMillis);
        }
        return this.v;
    }

    @Override // anetwork.channel.NetworkCallBack.ProgressListener
    public void onDataReceived(NetworkEvent.ProgressEvent progressEvent, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e27ec0e9", new Object[]{this, progressEvent, obj});
            return;
        }
        if (this.p <= 0) {
            this.p = System.currentTimeMillis();
        }
        if (!this.g) {
            this.g = true;
        }
        byte[] copyOf = Arrays.copyOf(progressEvent.getBytedata(), progressEvent.getSize());
        if (!this.f) {
            O(copyOf);
        } else {
            R(copyOf);
        }
    }

    @Override // anetwork.channel.NetworkCallBack.FinishListener
    public void onFinished(NetworkEvent.FinishEvent finishEvent, Object obj) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a00910e8", new Object[]{this, finishEvent, obj});
            return;
        }
        this.q = System.currentTimeMillis() - this.p;
        String str = this.d;
        TBSdkLog.e("mtopsdk.StreamNetworkListenerAdapter", str, "[onFinished] isNeedCallFinish = false, isStreamReceived = " + this.g);
        String str2 = this.d;
        if (str2 != null) {
            i = str2.hashCode();
        } else {
            i = hashCode();
        }
        MtopSDKThreadPoolExecutorFactory.submitStreamRequestTask(i, new a(finishEvent));
    }

    @Override // anetwork.channel.NetworkCallBack.ResponseCodeListener
    public boolean onResponseCode(int i, Map<String, List<String>> map, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("45b007d6", new Object[]{this, new Integer(i), map, obj})).booleanValue();
        }
        this.y = i;
        this.z = map;
        TBSdkLog.e("mtopsdk.StreamNetworkListenerAdapter", this.d, "[onResponseCode]Read head");
        try {
            String singleHeaderFieldByKey = HeaderHandlerUtil.getSingleHeaderFieldByKey(this.z, "content-length");
            if (StringUtils.isBlank(singleHeaderFieldByKey)) {
                singleHeaderFieldByKey = HeaderHandlerUtil.getSingleHeaderFieldByKey(this.z, HttpHeaderConstant.X_BIN_LENGTH);
            }
            if (StringUtils.isNotBlank(singleHeaderFieldByKey)) {
                Integer.parseInt(singleHeaderFieldByKey);
            }
            this.f = TextUtils.equals("1", HeaderHandlerUtil.getSingleHeaderFieldByKey(this.z, "x-used-stream"));
        } catch (Exception unused) {
            TBSdkLog.e("mtopsdk.StreamNetworkListenerAdapter", this.d, "[onResponseCode]parse Response HeaderField ContentLength error ");
        }
        htj htjVar = this.J;
        if (htjVar instanceof StreamNetworkCallbackAdapter) {
            ((StreamNetworkCallbackAdapter) htjVar).onHeader();
        }
        return false;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public class f implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private volatile long f22838a;
        private volatile boolean b;

        static {
            t2o.a(589300058);
        }

        private f() {
            this.f22838a = 0L;
            this.b = false;
        }

        private void d(long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5b9205", new Object[]{this, new Long(j)});
                return;
            }
            this.f22838a = System.currentTimeMillis() + j;
            MtopSDKThreadPoolExecutorFactory.getSsrScheduledExecutorService().schedule(this, j, TimeUnit.MILLISECONDS);
        }

        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fd73a171", new Object[]{this});
            } else {
                this.f22838a = System.currentTimeMillis() + kpq.u(kpq.this);
            }
        }

        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("810347e9", new Object[]{this});
            } else {
                d(kpq.u(kpq.this));
            }
        }

        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6623bb89", new Object[]{this});
            } else {
                this.b = true;
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (!this.b && !kpq.s(kpq.this) && System.currentTimeMillis() >= this.f22838a) {
                kpq.v(kpq.this).set(true);
                TBSdkLog.e("mtopsdk.StreamNetworkListenerAdapter", kpq.d(kpq.this), "[BodyTimeoutChecker] read timeout.");
                kpq.t(kpq.this);
            }
        }

        public /* synthetic */ f(kpq kpqVar, a aVar) {
            this();
        }
    }
}
