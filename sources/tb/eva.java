package tb;

import android.os.Message;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.message_sdk.mtop.heart.HeartbeatReportResponse;
import com.taobao.taolive.message_sdk.mtop.heart.HeartbeatReportResponseData;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import com.taobao.taolive.sdk.adapter.network.NetResponse;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import tb.n1h;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class eva implements b0d, bcc {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static volatile boolean n;

    /* renamed from: a  reason: collision with root package name */
    public long f18838a;
    public long b;
    public iyw c;
    public final c1h d;
    public String e;
    public hva f;
    public pxk j;
    public fva k;
    public HashSet<String> l;
    public boolean h = true;
    public int i = 1;
    public boolean m = true;
    public final List<Long> g = new ArrayList();

    public eva(c1h c1hVar, fva fvaVar) {
        this.d = c1hVar;
        this.b = c1hVar.b.n;
        this.k = fvaVar;
    }

    public static long a(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d9ef1185", new Object[]{bArr})).longValue();
        }
        long j = 0;
        for (int i = 7; i >= 0; i--) {
            j = (j << 8) | (bArr[i] & 255);
        }
        return j;
    }

    public final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3eb92855", new Object[]{this});
            return;
        }
        iyw iywVar = this.c;
        if (iywVar != null) {
            iywVar.removeMessages(1000);
            this.f18838a = 0L;
            this.c = null;
        }
    }

    public final long c() {
        int i;
        boolean z;
        int i2;
        int i3 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f96f4dc7", new Object[]{this})).longValue();
        }
        fva fvaVar = this.k;
        if (fvaVar != null) {
            i = ((n1h.a) fvaVar).b();
        } else {
            i = 0;
        }
        fva fvaVar2 = this.k;
        if (fvaVar2 == null || !((n1h.a) fvaVar2).d()) {
            z = false;
        } else {
            z = true;
        }
        fva fvaVar3 = this.k;
        if (fvaVar3 == null || ((n1h.a) fvaVar3).c()) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        byte[] bArr = new byte[8];
        Arrays.fill(bArr, (byte) 0);
        bArr[0] = (byte) i2;
        bArr[1] = (byte) i;
        if (z) {
            i3 = 2;
        } else if (this.h) {
            i3 = 1;
        }
        this.i = i3;
        bArr[2] = (byte) i3;
        return a(bArr);
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("886dbb1c", new Object[]{this});
            return;
        }
        l();
        i(3L);
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("111bbcb1", new Object[]{this});
            return;
        }
        k();
        i(4L);
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
        } else {
            this.h = false;
        }
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
        } else {
            this.h = true;
        }
    }

    public final void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19f631ef", new Object[]{this});
            return;
        }
        iyw iywVar = this.c;
        if (iywVar != null) {
            iywVar.removeMessages(1000);
            this.c.sendEmptyMessageDelayed(1000, this.d.b.o * 1000);
        }
    }

    @Override // tb.bcc
    public void handleMessage(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
        } else if (!n || !this.m) {
            int i = message.what;
            if (i == 1000) {
                ((ArrayList) this.g).add(Long.valueOf(c()));
                long j = this.f18838a + this.d.b.o;
                this.f18838a = j;
                if (j % this.b == 0) {
                    i(2L);
                } else {
                    this.j.a(this.i);
                }
                h();
            } else if (i == 1001) {
                k();
                i(0L);
            }
        } else {
            k6s.a("eva", "handleMessage return. stopReport: " + n + " ,orangeStopHeartbeatDisable: " + this.m);
        }
    }

    public void j(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("baa84911", new Object[]{this, new Boolean(z)});
            return;
        }
        this.m = z;
        k6s.a("eva", "setOrangeHeartbeatDisable: " + z);
    }

    public final void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f869aed", new Object[]{this});
            return;
        }
        iyw iywVar = this.c;
        if (iywVar != null) {
            iywVar.removeMessages(1000);
            this.c.sendEmptyMessageDelayed(1000, this.d.b.o * 1000);
        }
    }

    public final void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c83c734d", new Object[]{this});
            return;
        }
        iyw iywVar = this.c;
        if (iywVar != null) {
            iywVar.removeMessages(1000);
            this.f18838a = 0L;
        }
    }

    public void m(zqi zqiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("417a7ade", new Object[]{this, zqiVar});
            return;
        }
        this.e = UUID.randomUUID().toString();
        this.f = new hva(this, zqiVar.f32948a);
        this.c = new iyw(this);
        this.j = new pxk();
        k();
        i(0L);
    }

    public void n(zqi zqiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94e2fc97", new Object[]{this, zqiVar});
            return;
        }
        b();
        i(1L);
        this.k = null;
    }

    @Override // tb.b0d
    public void onError(int i, NetResponse netResponse, Object obj) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i), netResponse, obj});
            return;
        }
        k6s.a("eva", "onError[]: code " + i + " netResponse " + netResponse + " Object " + obj);
        String valueOf = String.valueOf(i);
        if (netResponse != null) {
            str = netResponse.toString();
        } else {
            str = "";
        }
        w71.a(w71.MODULE_POINT_HEART, valueOf, str);
    }

    @Override // tb.b0d
    public void onSuccess(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb090915", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
            return;
        }
        if (netBaseOutDo instanceof HeartbeatReportResponse) {
            HeartbeatReportResponseData data = ((HeartbeatReportResponse) netBaseOutDo).getData();
            long j = data.reportInterval;
            if (j > 0) {
                this.b = j;
            }
            n = data.stopReport;
            this.l = null;
            k6s.a("eva", "onSuccess receiveMsgSet: " + this.l + " ,heartbeatInterval: " + this.b + " ,stopReport: " + n);
        }
        w71.b(w71.MODULE_POINT_HEART);
    }

    @Override // tb.b0d
    public void onSystemError(int i, NetResponse netResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9bfdbcd9", new Object[]{this, new Integer(i), netResponse, obj});
        } else {
            onError(i, netResponse, obj);
        }
    }

    public final void i(long j) {
        Map<String, String> a2;
        String[] strArr;
        int i = 2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("897945f5", new Object[]{this, new Long(j)});
        } else if (this.f == null) {
            k6s.a("eva", "reportHeartbeat: mHeartbeatReportBusiness is null, skip reporting.");
        } else {
            this.d.h.a(n && this.m);
            if (!n || !this.m) {
                ArrayList arrayList = new ArrayList(this.g);
                ((ArrayList) this.g).clear();
                pxk pxkVar = this.j;
                if (pxkVar != null) {
                    if (j == 4 || j == 0) {
                        pxkVar.c();
                    }
                    this.j.a(this.i);
                }
                HashMap<String, String> hashMap = new HashMap<>();
                hashMap.put("deviceId", this.d.c);
                fva fvaVar = this.k;
                if (fvaVar == null || !((n1h.a) fvaVar).d()) {
                    i = this.h ? 1 : 0;
                }
                this.i = i;
                hashMap.put("behaviour", String.valueOf(i));
                fva fvaVar2 = this.k;
                if (!(fvaVar2 == null || (a2 = ((n1h.a) fvaVar2).a()) == null)) {
                    for (String str : this.d.b.p) {
                        if (a2.containsKey(str)) {
                            hashMap.put(str, a2.get(str));
                        }
                    }
                }
                HashSet<String> b = this.d.h.b();
                HashSet<String> hashSet = this.l;
                if (hashSet != null) {
                    b.addAll(hashSet);
                    k6s.a("eva", "reportHeartbeat receiveMsg: " + b);
                }
                this.l = b;
                hva hvaVar = this.f;
                if (hvaVar != null) {
                    c1h c1hVar = this.d;
                    int i2 = c1hVar.d;
                    String str2 = c1hVar.e;
                    String str3 = this.e;
                    pxk pxkVar2 = this.j;
                    hvaVar.r(i2, str2, str3, j, arrayList, pxkVar2.b, pxkVar2.c, hashMap, b);
                    k6s.a("eva", "reportHeartbeat[]: " + this.d.d + " " + this.d.e + " " + this.e + " " + j + " " + arrayList + " " + this.j.b + " " + this.j.c + " " + hashMap + " " + b);
                }
                pxk pxkVar3 = this.j;
                if (pxkVar3 != null) {
                    pxkVar3.b();
                    return;
                }
                return;
            }
            k6s.a("eva", "reportHeartbeat return. stopReport: " + n + " ,orangeStopHeartbeatDisable: " + this.m);
        }
    }
}
