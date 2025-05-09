package tb;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Pair;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.uploader.implement.UploaderManager;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.json.JSONException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class h9y extends stx {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final ArrayList<Pair<Integer, Integer>> e = new ArrayList<>();
    public long f;
    public long g;
    public int h;
    public int i;
    public i5y j;
    public String k;
    public lyx l;
    public volatile kxx m;
    public final z6e n;
    public final mzd o;
    public final Handler p;
    public final int q;
    public final com.uploader.implement.a r;
    public final boolean s;
    public final boolean t;
    public String u;
    public int v;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a implements Handler.Callback {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final int f20491a = a.class.hashCode();
        public final WeakReference<oxx> b;
        public final WeakReference<stx> c;

        public a(stx stxVar, oxx oxxVar) {
            this.c = new WeakReference<>(stxVar);
            this.b = new WeakReference<>(oxxVar);
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            oxx oxxVar;
            stx stxVar;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("282a8c1d", new Object[]{this, message})).booleanValue();
            }
            if (message.what != f20491a || (oxxVar = this.b.get()) == null || (stxVar = this.c.get()) == null) {
                return false;
            }
            stxVar.h(oxxVar, (ytx) message.obj);
            return true;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class b implements ozd {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final Map<String, String> f20492a;
        public final String b;
        public final String c;

        public b(Map<String, String> map, String str, String str2) {
            this.f20492a = map;
            this.c = str;
            this.b = str2;
        }

        @Override // tb.ozd
        public String a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("de71c0fc", new Object[]{this});
            }
            return this.c;
        }

        @Override // tb.ozd
        public String b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("562582df", new Object[]{this});
            }
            return this.b;
        }

        @Override // tb.ozd
        public Map<String, String> getResult() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("7a4b0acf", new Object[]{this});
            }
            return this.f20492a;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final WeakReference<h9y> f20493a;
        private final WeakReference<Looper> b = new WeakReference<>(Looper.myLooper());
        public final Handler.Callback c;

        public c(h9y h9yVar, Handler.Callback callback) {
            this.f20493a = new WeakReference<>(h9yVar);
            this.c = callback;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            h9y h9yVar = this.f20493a.get();
            Looper looper = this.b.get();
            if (looper != null && h9yVar != null) {
                new Handler(looper, this.c).obtainMessage(a.f20491a, h9yVar.L()).sendToTarget();
            }
        }
    }

    public h9y(com.uploader.implement.a aVar, z6e z6eVar, int i, mzd mzdVar, Handler handler, boolean z, boolean z2) {
        super(aVar.c);
        this.r = aVar;
        this.n = z6eVar;
        this.o = mzdVar;
        this.p = handler;
        this.q = i;
        this.s = z;
        this.t = z2;
    }

    public static /* synthetic */ Object ipc$super(h9y h9yVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/uploader/implement/a/i");
    }

    public ytx C(oxx oxxVar, i5y i5yVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ytx) ipChange.ipc$dispatch("285cc050", new Object[]{this, oxxVar, i5yVar, new Boolean(z)});
        }
        try {
            ttx ttxVar = new ttx(this.r);
            if (i5yVar == null) {
                oxxVar.g(ttxVar);
            } else {
                oxxVar.e(i5yVar, ttxVar, z);
            }
            w8y d = ttxVar.d();
            lyx lyxVar = new lyx(true, this.l);
            this.l = lyxVar;
            lyxVar.d = this.m.e;
            this.l.p = this.m.d;
            lyx lyxVar2 = this.l;
            lyxVar2.e = d.f30918a;
            lyxVar2.f = d.b;
            lyxVar2.k = this.m.f;
            this.l.s = this.m.i;
            if (!rtx.d(16)) {
                return null;
            }
            rtx.a(16, "UploaderAction", this.f28273a + " beginDeclare statistics create:" + this.l.hashCode());
            return null;
        } catch (JSONException e) {
            if (rtx.d(16)) {
                rtx.b(16, "UploaderAction", this.f28273a + " onActionBegin", e);
            }
            return new ytx("200", "1", e.toString(), false);
        } catch (Exception e2) {
            if (rtx.d(16)) {
                rtx.b(16, "UploaderAction", this.f28273a + " onActionBegin", e2);
            }
            return new ytx("200", "5", e2.toString(), false);
        }
    }

    public ytx E(oxx oxxVar, i5y i5yVar, ytx ytxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ytx) ipChange.ipc$dispatch("8b79f4ff", new Object[]{this, oxxVar, i5yVar, ytxVar});
        }
        if (this.h >= 4) {
            if (rtx.d(2)) {
                rtx.a(2, "UploaderAction", this.f28273a + " retryDeclare, retry failed, request:" + i5yVar.hashCode() + " error:" + ytxVar + " declareRetryCounter:" + this.h);
            }
            return ytxVar;
        }
        if ("100".equalsIgnoreCase(ytxVar.f24666a) || "400".equalsIgnoreCase(ytxVar.f24666a)) {
            if (rtx.d(8)) {
                rtx.a(8, "UploaderAction", this.f28273a + " onActionRetry, try to connect next, request:" + i5yVar.hashCode());
            }
            this.r.f14547a.i();
            if (rtx.d(8)) {
                rtx.a(8, "UploaderAction", this.f28273a + " ConnectionStrategy, after nextDeclareTarget:" + this.r.f14547a.toString());
            }
        }
        ytx C = C(oxxVar, i5yVar, false);
        if (C == null) {
            this.h++;
            if (rtx.d(2)) {
                rtx.a(2, "UploaderAction", this.f28273a + " onActionRetry, retry, request:" + i5yVar.hashCode() + " declareRetryCounter:" + this.h);
            }
            lyx lyxVar = this.l;
            if (lyxVar != null) {
                lyxVar.r = this.h;
            }
        }
        return C;
    }

    public void G(oxx oxxVar, i5y i5yVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e48358b7", new Object[]{this, oxxVar, i5yVar});
            return;
        }
        if (rtx.d(16)) {
            rtx.a(16, "UploaderAction", this.f28273a + " onConnectBegin, session:" + oxxVar.hashCode() + " request:" + i5yVar.hashCode());
        }
        lyx lyxVar = this.l;
        if (lyxVar != null) {
            lyxVar.n = System.currentTimeMillis();
            if (rtx.d(8)) {
                rtx.a(8, "UploaderAction", this.f28273a + " onConnectBegin statistics:" + this.l.hashCode() + " connectedTimeMillisStart:" + this.l.n);
            }
        }
    }

    public ytx I(oxx oxxVar, i5y i5yVar, ytx ytxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ytx) ipChange.ipc$dispatch("190175e", new Object[]{this, oxxVar, i5yVar, ytxVar});
        }
        if (this.i >= 5) {
            if (rtx.d(2)) {
                rtx.a(2, "UploaderAction", this.f28273a + " retryFile, retry failed, request:" + i5yVar.hashCode() + " error:" + ytxVar + " fileRetryCounter:" + this.i);
            }
            return ytxVar;
        }
        if ("100".equalsIgnoreCase(ytxVar.f24666a)) {
            if (rtx.d(8)) {
                rtx.a(8, "UploaderAction", this.f28273a + " retryFile, try to connect next, request:" + i5yVar.hashCode());
            }
            this.r.f14547a.k();
            if (rtx.d(8)) {
                rtx.a(8, "UploaderAction", this.f28273a + " ConnectionStrategy, after nextUploadTarget:" + this.r.f14547a.toString());
            }
        }
        ytx F = F(oxxVar, i5yVar, false);
        if (F == null) {
            this.i++;
            if (rtx.d(2)) {
                rtx.a(2, "UploaderAction", this.f28273a + " retryFile, request:" + i5yVar.hashCode() + " fileRetryCounter:" + this.i);
            }
            lyx lyxVar = this.l;
            if (lyxVar != null) {
                lyxVar.r = this.i;
            }
        }
        return F;
    }

    public void J(oxx oxxVar, i5y i5yVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ef8f938", new Object[]{this, oxxVar, i5yVar});
            return;
        }
        if (rtx.d(2)) {
            rtx.a(2, "UploaderAction", this.f28273a + " onConnect, session:" + oxxVar.hashCode() + " request:" + i5yVar.hashCode());
        }
        lyx lyxVar = this.l;
        if (lyxVar != null) {
            lyxVar.o = System.currentTimeMillis();
        }
    }

    public Pair<ytx, ? extends Object> K(utx utxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("c8b88f3e", new Object[]{this, utxVar});
        }
        try {
            Object[] objArr = utxVar.c;
            this.r.f14547a.d((String) objArr[0], ((Long) objArr[1]).longValue(), ((Long) objArr[2]).longValue(), (List) objArr[3], (List) objArr[4]);
            if (rtx.d(8)) {
                rtx.a(8, "UploaderAction", this.f28273a + " ConnectionStrategy update:" + this.r.f14547a.toString());
            }
            if (cwx.d()) {
                xrx.d().t();
            }
            o7y.a().g();
            lyx lyxVar = this.l;
            if (lyxVar != null) {
                lyxVar.g = 1;
                lyxVar.q = (String) this.r.f14547a.a().first;
                this.l.m = System.currentTimeMillis();
                this.k = "Declare" + this.l.g();
                if (rtx.d(8)) {
                    rtx.a(8, "UploaderAction", this.f28273a + " retrieveDeclare, statistics:" + this.l.hashCode() + " costTimeMillisEnd:" + this.l.m);
                }
            }
            return new Pair<>(null, null);
        } catch (Exception e) {
            if (rtx.d(4)) {
                rtx.a(4, "UploaderAction", e.toString());
            }
            return new Pair<>(new ytx("200", "8", e.toString(), true), null);
        }
    }

    public void M(oxx oxxVar, i5y i5yVar) {
        long j;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596e99b9", new Object[]{this, oxxVar, i5yVar});
            return;
        }
        lyx lyxVar = this.l;
        if (lyxVar == null || lyxVar.l != 0) {
            j = 0;
        } else {
            j = System.currentTimeMillis();
            this.l.l = j;
        }
        this.j = i5yVar;
        if (rtx.d(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f28273a);
            sb.append(" onSendBegin, session:");
            sb.append(oxxVar.hashCode());
            sb.append(" request and set current:");
            sb.append(i5yVar.hashCode());
            if (j == 0) {
                str = "";
            } else {
                str = " statistics:" + this.l.hashCode() + " costTimeMillisStart:" + j;
            }
            sb.append(str);
            rtx.a(2, "UploaderAction", sb.toString());
        }
    }

    public final z6e N() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (z6e) ipChange.ipc$dispatch("a594b60a", new Object[]{this});
        }
        return this.n;
    }

    public final int O() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5c0f961", new Object[]{this})).intValue();
        }
        return this.q;
    }

    public String P() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5d9eff91", new Object[]{this});
        }
        return this.u;
    }

    public final String Q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e424ba30", new Object[]{this});
        }
        return UUID.randomUUID().toString().replaceAll("-", "");
    }

    @Override // tb.stx
    public Pair<ytx, ? extends Object> b(oxx oxxVar, i5y i5yVar, utx utxVar) {
        String b2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("a23ac687", new Object[]{this, oxxVar, i5yVar, utxVar});
        }
        if (!(this.l == null || (b2 = utxVar.b("divided_length")) == null)) {
            try {
                this.l.c += Integer.parseInt(b2);
            } catch (Exception e) {
                if (rtx.d(2)) {
                    rtx.a(2, "UploaderAction", this.f28273a + e.toString());
                }
            }
        }
        switch (utxVar.a()) {
            case 1:
                return K(utxVar);
            case 2:
                return H(utxVar);
            case 3:
                return B(oxxVar, i5yVar, utxVar);
            case 4:
                return D(utxVar);
            case 5:
                return A(utxVar);
            case 6:
                return y(utxVar);
            default:
                return null;
        }
    }

    @Override // tb.stx
    public ytx d(oxx oxxVar, i5y i5yVar, ytx ytxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ytx) ipChange.ipc$dispatch("9f4db041", new Object[]{this, oxxVar, i5yVar, ytxVar});
        }
        lyx lyxVar = this.l;
        if (lyxVar != null) {
            lyxVar.m = System.currentTimeMillis();
        }
        if (rtx.d(8)) {
            rtx.a(8, "UploaderAction", this.f28273a + " onActionRetry, session:" + oxxVar.hashCode() + " request:" + i5yVar.hashCode());
        }
        if (s() == 2) {
            return I(oxxVar, i5yVar, ytxVar);
        }
        return E(oxxVar, i5yVar, ytxVar);
    }

    @Override // tb.stx
    public ytx e(oxx oxxVar, i5y i5yVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ytx) ipChange.ipc$dispatch("3f54fb4f", new Object[]{this, oxxVar, i5yVar, new Boolean(z)});
        }
        if (s() == 2) {
            return F(oxxVar, i5yVar, z);
        }
        return C(oxxVar, i5yVar, z);
    }

    @Override // tb.stx
    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.j = null;
        this.e.clear();
    }

    @Override // tb.stx
    public void g(int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d36ff2b7", new Object[]{this, new Integer(i), obj});
            return;
        }
        ixx.a(this.p, i, this.n, this.o, obj);
        if (this.l != null) {
            long currentTimeMillis = System.currentTimeMillis();
            if (rtx.d(8)) {
                rtx.a(8, "UploaderAction", this.f28273a + " onActionNotify, notifyType:" + i + " statistics:" + this.l.hashCode() + " costTimeMillisEnd:" + currentTimeMillis);
            }
            if (i != 0) {
                if (i == 1) {
                    lyx lyxVar = this.l;
                    lyxVar.g = 2;
                    lyxVar.C = UploaderManager.b();
                    lyx lyxVar2 = this.l;
                    lyxVar2.m = currentTimeMillis;
                    if (obj != null) {
                        ytx ytxVar = (ytx) obj;
                        lyxVar2.h = ytxVar.f24666a;
                        lyxVar2.i = ytxVar.b;
                    }
                    lyxVar2.g();
                    this.l = null;
                    if (this.s) {
                        xrx.d().k(this.u, true);
                    } else if (cwx.i()) {
                        xrx.d().k(this.u, false);
                    }
                } else if (i == 2) {
                    ytx ytxVar2 = (ytx) obj;
                    lyx lyxVar3 = this.l;
                    lyxVar3.g = 0;
                    lyxVar3.h = ytxVar2.f24666a;
                    lyxVar3.i = ytxVar2.b;
                    lyxVar3.j = ytxVar2.c;
                    lyxVar3.C = UploaderManager.b();
                    lyx lyxVar4 = this.l;
                    lyxVar4.m = currentTimeMillis;
                    lyxVar4.g();
                    this.l = null;
                    if (this.s) {
                        xrx.d().k(this.u, true);
                    } else if (cwx.i()) {
                        xrx.d().k(this.u, false);
                    }
                } else if (i == 3) {
                    Pair pair = (Pair) obj;
                    int intValue = ((Integer) pair.first).intValue();
                    this.g = ((Long) pair.second).longValue();
                    if (this.s) {
                        xrx.d().f(this.u, intValue, this.g, this.l, true);
                    } else if (cwx.i()) {
                        xrx.d().f(this.u, intValue, this.g, this.l, false);
                    }
                } else if (i != 4) {
                    if (i == 7) {
                        this.l.m = currentTimeMillis;
                    }
                } else if (this.s) {
                    xrx.d().j(this.u, this.l, true);
                } else if (cwx.i()) {
                    xrx.d().j(this.u, this.l, false);
                }
            } else if (this.s) {
                xrx.d().k(this.u, true);
            } else if (cwx.i()) {
                xrx.d().k(this.u, false);
            }
        }
    }

    @Override // tb.stx
    public boolean m(oxx oxxVar) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ff054342", new Object[]{this, oxxVar})).booleanValue();
        }
        if (this.m != null) {
            z = false;
        }
        if (z) {
            ewx.a(new c(this, new a(this, oxxVar)));
        }
        return z;
    }

    @Override // tb.stx
    public boolean r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
        }
        Pair<String, Long> a2 = this.r.f14547a.a();
        if (a2 != null && this.r.f14547a.q() && System.currentTimeMillis() < ((Long) a2.second).longValue()) {
            return true;
        }
        return false;
    }

    public void z(oxx oxxVar, i5y i5yVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("836b51ee", new Object[]{this, oxxVar, i5yVar, new Integer(i)});
            return;
        }
        if (rtx.d(2)) {
            rtx.a(2, "UploaderAction", this.f28273a + " onUploading, session:" + oxxVar.hashCode() + " request:" + i5yVar.hashCode() + " fileSizeSent:" + i + ", sendOffset=" + this.f);
        }
        long j = i + i5yVar.b().c;
        this.f = j;
        lyx lyxVar = this.l;
        if (lyxVar != null) {
            lyxVar.b = j;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00f3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.util.Pair<tb.ytx, ? extends java.lang.Object> D(tb.utx r11) {
        /*
            Method dump skipped, instructions count: 303
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.h9y.D(tb.utx):android.util.Pair");
    }

    public Pair<ytx, ? extends Object> H(utx utxVar) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("3b7dddbd", new Object[]{this, utxVar});
        }
        String b2 = utxVar.b("x-arup-process");
        String b3 = utxVar.b("x-arup-resume-offset");
        if (rtx.d(16)) {
            rtx.a(16, "UploaderAction", this.f28273a + " progress:" + b2 + ", offset:" + b3 + ", fileId:" + this.m.d + ", trackId:" + this.m.o);
        }
        try {
            i = Integer.parseInt(b2);
        } catch (Exception e) {
            if (rtx.d(8)) {
                rtx.b(8, "UploaderAction", this.f28273a + "", e);
            }
            i = 0;
        }
        if (i == -1) {
            this.v = 0;
        } else if (i > this.v) {
            this.v = i;
        }
        long j = -1;
        try {
            if (!TextUtils.isEmpty(b3)) {
                j = Integer.parseInt(b3);
            }
        } catch (Exception e2) {
            if (rtx.d(8)) {
                rtx.b(8, "UploaderAction", this.f28273a + "", e2);
            }
        }
        return new Pair<>(null, new Pair(Integer.valueOf(this.v), Long.valueOf(j)));
    }

    @Override // tb.stx
    public Pair<Integer, Integer> a(oxx oxxVar, i5y i5yVar) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("de4566bf", new Object[]{this, oxxVar, i5yVar});
        }
        if (rtx.d(4)) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f28273a);
            sb.append(" onActionDeliver, session:");
            sb.append(oxxVar.hashCode());
            sb.append(" request:");
            sb.append(i5yVar.hashCode());
            sb.append(" currentRequest:");
            i5y i5yVar2 = this.j;
            if (i5yVar2 == null) {
                obj = "null";
            } else {
                obj = Integer.valueOf(i5yVar2.hashCode());
            }
            sb.append(obj);
            rtx.a(4, "UploaderAction", sb.toString());
        }
        if (this.l != null) {
            v8y b2 = i5yVar.b();
            byte[] bArr = b2.f;
            int length = bArr == null ? 0 : bArr.length;
            byte[] bArr2 = b2.g;
            this.l.b = b2.d + length + (bArr2 == null ? 0 : bArr2.length);
        }
        if (this.j != i5yVar) {
            return null;
        }
        this.j = null;
        if (this.e.size() > 0) {
            return this.e.remove(0);
        }
        return null;
    }

    public Pair<ytx, ? extends Object> y(utx utxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("93cdc93a", new Object[]{this, utxVar});
        }
        if (rtx.d(2)) {
            rtx.a(2, "UploaderAction", this.f28273a + " retrieveStatus ,response=" + utxVar);
        }
        String b2 = utxVar.b("x-arup-session-status");
        if (!TextUtils.isEmpty(b2)) {
            return new Pair<>(null, b2);
        }
        return new Pair<>(null, null);
    }

    public Pair<ytx, ? extends Object> B(oxx oxxVar, i5y i5yVar, utx utxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("83470108", new Object[]{this, oxxVar, i5yVar, utxVar});
        }
        String b2 = utxVar.b("x-arup-offset");
        if (TextUtils.isEmpty(b2)) {
            return new Pair<>(new ytx("200", "7", "onReceiveOffset:1", true), null);
        }
        int indexOf = b2.indexOf("=");
        if (indexOf == -1) {
            return new Pair<>(new ytx("200", "7", "onReceiveOffset:2", true), null);
        }
        if (!this.m.d.equals(b2.substring(0, indexOf))) {
            return new Pair<>(new ytx("200", "7", "onReceiveOffset:3", true), null);
        }
        int indexOf2 = b2.indexOf(",");
        int i = indexOf + 1;
        if (indexOf2 <= i || indexOf2 >= b2.length()) {
            return new Pair<>(new ytx("200", "7", "onReceiveOffset:4", true), null);
        }
        try {
            return new Pair<>(null, new Pair(Integer.valueOf(Integer.parseInt(b2.substring(i, indexOf2))), Integer.valueOf(Integer.parseInt(b2.substring(indexOf2 + 1, b2.length())))));
        } catch (Exception e) {
            if (rtx.d(16)) {
                rtx.b(16, "UploaderAction", this.f28273a + " parse offset error.", e);
            }
            return new Pair<>(new ytx("200", "7", e.toString(), true), null);
        }
    }

    public ytx L() {
        int i;
        String str;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ytx) ipChange.ipc$dispatch("985abe82", new Object[]{this});
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (!this.s || !this.t) {
            str = null;
            i = 0;
        } else {
            oet oetVar = ((kk2) this.n).f22724a;
            this.u = oetVar.g;
            this.g = oetVar.e;
            this.l = lyx.a(oetVar.h);
            oet oetVar2 = ((kk2) this.n).f22724a;
            this.v = oetVar2.f;
            i = oetVar2.i + 1;
            str = oetVar2.j;
            if (rtx.d(4)) {
                rtx.a(4, "UploaderAction", this.f28273a + "breakpoint task:{fileId=" + this.u + ", serverRecvOffset=" + this.g + "} task:" + this.n.hashCode());
            }
        }
        if (TextUtils.isEmpty(this.u)) {
            this.u = Q();
        }
        Pair<ytx, kxx> b2 = fzx.b(this.n);
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        Object obj = b2.second;
        if (obj != null) {
            kxx kxxVar = (kxx) obj;
            kxxVar.i = currentTimeMillis2;
            this.m = kxxVar;
            this.m.d = this.u;
            this.m.p = i;
            this.m.n = this.s ? 1 : 0;
        }
        if (this.s && this.t && !TextUtils.isEmpty(str) && !str.equalsIgnoreCase(this.m.g)) {
            if (rtx.d(16)) {
                rtx.a(16, "UploaderAction", this.f28273a + " task md5 has changed, old:" + str + " new:" + this.m.g);
            }
            this.g = 0L;
            this.v = 0;
        }
        if (rtx.d(16)) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f28273a);
            sb.append(" createFileDescription, elapsed:");
            sb.append(currentTimeMillis2);
            sb.append(" error:");
            Object obj2 = b2.first;
            if (obj2 == null) {
                str2 = "";
            } else {
                str2 = ((ytx) obj2).toString();
            }
            sb.append(str2);
            rtx.a(16, "UploaderAction", sb.toString());
        }
        if (this.s) {
            xrx.d().h(this.u, this.n, true, this.m);
            if (i > 0) {
                xrx.d().i(this.u, this.m);
            }
        } else if (cwx.i()) {
            xrx.d().h(this.u, this.n, false, this.m);
        }
        return (ytx) b2.first;
    }

    public Pair<ytx, ? extends Object> A(utx utxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("21087abb", new Object[]{this, utxVar});
        }
        if (rtx.d(2)) {
            rtx.a(2, "UploaderAction", this.f28273a + " onReceiveError ,response=" + utxVar);
        }
        String b2 = utxVar.b("x-arup-error-code");
        String b3 = utxVar.b("x-arup-error-msg");
        try {
            long longValue = Long.valueOf(utxVar.b("x-arup-server-rt")).longValue();
            lyx lyxVar = this.l;
            if (lyxVar != null && longValue > 0) {
                lyxVar.v = longValue;
            }
        } catch (Exception unused) {
        }
        String b4 = utxVar.b("x-arup-server-timestamp");
        if (!TextUtils.isEmpty(b4)) {
            try {
                this.r.f14547a.c(Long.parseLong(b4));
            } catch (Exception e) {
                if (rtx.d(2)) {
                    rtx.a(2, "UploaderAction", this.f28273a + " retrieveError " + e);
                }
                b3 = b3 + " " + e.toString();
            }
        }
        if (q0j.ERROR_CODE_WEEX_RENDER_EXCEPTION.equalsIgnoreCase(b2) || "20021".equalsIgnoreCase(b2) || "20022".equalsIgnoreCase(b2) || "20020".equalsIgnoreCase(b2)) {
            this.r.f14547a.e(false);
        }
        if (fwx.f19590a.contains(b2)) {
            return new Pair<>(new ytx("300", b2, b3, true), null);
        }
        if ("20021".equalsIgnoreCase(b2) || "20022".equalsIgnoreCase(b2) || "20020".equalsIgnoreCase(b2)) {
            return new Pair<>(new ytx("300", "2", b3, true), null);
        }
        return new Pair<>(new ytx("300", b2, b3, false), null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x003b, code lost:
        if (r12 >= 0) goto L_0x0040;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public tb.ytx F(tb.oxx r24, tb.i5y r25, boolean r26) {
        /*
            Method dump skipped, instructions count: 478
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.h9y.F(tb.oxx, tb.i5y, boolean):tb.ytx");
    }

    @Override // tb.stx
    public ytx c(oxx oxxVar, i5y i5yVar, Pair<Integer, Integer> pair) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ytx) ipChange.ipc$dispatch("33562649", new Object[]{this, oxxVar, i5yVar, pair});
        }
        if (this.j != null) {
            this.e.add(pair);
            if (rtx.d(8)) {
                rtx.a(8, "UploaderAction", this.f28273a + " onActionContinue, add offset, session:" + oxxVar.hashCode());
            }
            return null;
        }
        try {
            ezx ezxVar = new ezx(this.r, this.m, "patch", ((Integer) pair.first).intValue(), ((Integer) pair.second).intValue(), false);
            oxxVar.e(i5yVar, ezxVar, true);
            if (!rtx.d(4)) {
                return null;
            }
            rtx.a(4, "UploaderAction", this.f28273a + " onActionContinue, session:" + oxxVar.hashCode() + " send request:" + ezxVar.hashCode());
            return null;
        } catch (UnsupportedEncodingException e) {
            if (rtx.d(16)) {
                rtx.b(16, "UploaderAction", this.f28273a + " onActionContinue", e);
            }
            return new ytx("200", "1", e.toString(), false);
        } catch (Exception e2) {
            if (rtx.d(16)) {
                rtx.b(16, "UploaderAction", this.f28273a + " onActionContinue", e2);
            }
            return new ytx("200", "5", e2.toString(), false);
        }
    }
}
