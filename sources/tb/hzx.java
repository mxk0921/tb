package tb;

import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import com.alibaba.security.ccrc.service.build.C1180n;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class hzx implements lxx, b4y, oxx {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final AtomicInteger i = new AtomicInteger(0);

    /* renamed from: a  reason: collision with root package name */
    public ztx f20994a;
    public final gzx e;
    public final Handler f;
    public final com.uploader.implement.a h;
    public final ArrayList<i5y> b = new ArrayList<>();
    public final ArrayList<b> c = new ArrayList<>();
    public final ArrayList<a> d = new ArrayList<>();
    public final int g = hashCode();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final int f20995a;
        public final hzx b;
        public final Object[] c;

        public a(int i, hzx hzxVar, Object... objArr) {
            this.f20995a = i;
            this.b = hzxVar;
            this.c = objArr;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            switch (this.f20995a) {
                case 1:
                    this.b.x((j5y) this.c[0]);
                    return;
                case 2:
                    this.b.z((j5y) this.c[0]);
                    return;
                case 3:
                    hzx hzxVar = this.b;
                    Object[] objArr = this.c;
                    hzxVar.v((j5y) objArr[0], (ytx) objArr[1]);
                    return;
                case 4:
                    hzx hzxVar2 = this.b;
                    Object[] objArr2 = this.c;
                    hzxVar2.w((j5y) objArr2[0], (g6y) objArr2[1]);
                    return;
                case 5:
                    hzx hzxVar3 = this.b;
                    Object[] objArr3 = this.c;
                    hzxVar3.q((j5y) objArr3[0], ((Integer) objArr3[1]).intValue(), false);
                    return;
                case 6:
                    hzx hzxVar4 = this.b;
                    Object[] objArr4 = this.c;
                    hzxVar4.q((j5y) objArr4[0], ((Integer) objArr4[1]).intValue(), true);
                    return;
                case 7:
                    hzx hzxVar5 = this.b;
                    Object[] objArr5 = this.c;
                    hzxVar5.t((oxx) objArr5[0], (i5y) objArr5[1], (j5y) objArr5[2]);
                    return;
                case 8:
                    this.b.u((j5y) this.c[0]);
                    return;
                default:
                    return;
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final i5y f20996a;
        public final v8y b;
        public final j5y c;
        public boolean d;
        public boolean e;
        public int f;
        public int g;
        public int h;
        public int i;
        public ByteBuffer j;
        public Map<String, String> k;
        public g6y l;
        public ByteBuffer m;

        public b(i5y i5yVar, j5y j5yVar) {
            boolean z;
            this.f20996a = i5yVar;
            v8y b = i5yVar.b();
            this.b = b;
            this.c = j5yVar;
            Map<String, String> map = b.e;
            boolean z2 = true;
            if (map == null || map.size() == 0) {
                z = true;
            } else {
                z = false;
            }
            this.d = z;
            byte[] bArr = b.g;
            if (!(bArr == null || bArr.length == 0)) {
                z2 = false;
            }
            this.e = z2;
        }

        public void a() {
            boolean z;
            boolean z2 = true;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                return;
            }
            Map<String, String> map = this.b.e;
            if (map == null || map.size() == 0) {
                z = true;
            } else {
                z = false;
            }
            this.d = z;
            byte[] bArr = this.b.g;
            if (!(bArr == null || bArr.length == 0)) {
                z2 = false;
            }
            this.e = z2;
            this.g = 0;
            this.f = 0;
            this.h = 0;
            this.j = null;
            this.k = null;
        }

        public boolean b() {
            boolean z;
            boolean z2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue();
            }
            v8y v8yVar = this.b;
            byte[] bArr = v8yVar.f;
            if (bArr == null || this.f == bArr.length) {
                z = true;
            } else {
                z = false;
            }
            if (v8yVar.f29861a == null || this.g == v8yVar.d) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!this.e || !this.d || !z || !z2) {
                return false;
            }
            return true;
        }
    }

    public hzx(com.uploader.implement.a aVar, gzx gzxVar, Looper looper) {
        this.h = aVar;
        this.e = gzxVar;
        this.f = new Handler(looper);
    }

    public static int j(i5y i5yVar, ArrayList<b> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3a2f0d1e", new Object[]{i5yVar, arrayList})).intValue();
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (arrayList.get(i2).f20996a.equals(i5yVar)) {
                return i2;
            }
        }
        return -1;
    }

    public static int k(j5y j5yVar, ArrayList<b> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("73801ddf", new Object[]{j5yVar, arrayList})).intValue();
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (arrayList.get(i2).c.equals(j5yVar)) {
                return i2;
            }
        }
        return -1;
    }

    public static void p(b bVar, g6y g6yVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("401d06d4", new Object[]{bVar, g6yVar});
            return;
        }
        if (bVar.j == null) {
            bVar.j = ByteBuffer.allocate(128);
            bVar.k = g6yVar.f19764a;
        }
        int position = bVar.j.position() + g6yVar.b.length;
        if (bVar.j.capacity() < position) {
            bVar.j.flip();
            bVar.j = ByteBuffer.allocate(position).put(bVar.j);
        }
        bVar.j.put(g6yVar.b);
    }

    public static int r(j5y j5yVar, ArrayList<a> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8d9b9c7e", new Object[]{j5yVar, arrayList})).intValue();
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (arrayList.get(i2).c[0].equals(j5yVar)) {
                return i2;
            }
        }
        return -1;
    }

    public final void A(j5y j5yVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1470682", new Object[]{this, j5yVar});
            return;
        }
        int r = r(j5yVar, this.d);
        if (r != -1) {
            this.f.removeCallbacks(this.d.remove(r));
            if (rtx.d(2)) {
                rtx.a(2, "UploaderSession", this.g + " clearTimeout, connection:" + j5yVar.hashCode());
            }
        } else if (rtx.d(8)) {
            rtx.a(8, "UploaderSession", this.g + " clearTimeout, NO_POSITION, connection:" + j5yVar.hashCode());
        }
    }

    @Override // tb.oxx
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.b.clear();
        this.c.clear();
        for (int size = this.d.size() - 1; size >= 0; size--) {
            this.f.removeCallbacks(this.d.remove(size));
        }
        ((mxx) this.e).g(this);
        if (rtx.d(2)) {
            rtx.a(2, "UploaderSession", this.g + " release");
        }
    }

    @Override // tb.oxx
    public void b(ztx ztxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff04cedf", new Object[]{this, ztxVar});
        } else {
            this.f20994a = ztxVar;
        }
    }

    @Override // tb.lxx
    public void c(j5y j5yVar, int i2) {
        long j;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("431b2c45", new Object[]{this, j5yVar, new Integer(i2)});
            return;
        }
        Handler handler = this.f;
        a aVar = new a(6, this, j5yVar, Integer.valueOf(i2));
        if (this.h.b.enableFlowControl()) {
            j = 100;
        } else {
            j = 0;
        }
        handler.postDelayed(aVar, j);
    }

    @Override // tb.lxx
    public void d(j5y j5yVar, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("803af064", new Object[]{this, j5yVar, new Integer(i2)});
        } else {
            this.f.post(new a(5, this, j5yVar, Integer.valueOf(i2)));
        }
    }

    @Override // tb.oxx
    public void e(i5y i5yVar, i5y i5yVar2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("618fc6be", new Object[]{this, i5yVar, i5yVar2, new Boolean(z)});
            return;
        }
        int indexOf = this.b.indexOf(i5yVar);
        if (indexOf != -1) {
            this.b.set(indexOf, i5yVar2);
            boolean i2 = ((mxx) this.e).i(this, i5yVar, i5yVar2, this, z);
            if (!i2) {
                ((mxx) this.e).j(this, i5yVar, z);
                ((mxx) this.e).h(this, i5yVar2, this);
            }
            if (rtx.d(2)) {
                rtx.a(2, "UploaderSession", this.g + " replace:" + i2 + " waiting request:" + i5yVar.hashCode());
                return;
            }
            return;
        }
        int j = j(i5yVar, this.c);
        if (j == -1) {
            this.b.add(i5yVar2);
            boolean i3 = ((mxx) this.e).i(this, i5yVar, i5yVar2, this, z);
            if (!i3) {
                ((mxx) this.e).j(this, i5yVar, z);
                ((mxx) this.e).h(this, i5yVar2, this);
            }
            if (rtx.d(2)) {
                rtx.a(2, "UploaderSession", this.g + " replace:" + i3 + " request:" + i5yVar.hashCode() + " newRequest:" + i5yVar2.hashCode());
                return;
            }
            return;
        }
        b remove = this.c.remove(j);
        this.b.add(i5yVar2);
        boolean i4 = ((mxx) this.e).i(this, i5yVar, i5yVar2, this, z);
        if (!i4) {
            ((mxx) this.e).j(this, i5yVar, z);
            ((mxx) this.e).h(this, i5yVar2, this);
        }
        int r = r(remove.c, this.d);
        if (r != -1) {
            this.f.removeCallbacks(this.d.remove(r));
        }
        if (rtx.d(2)) {
            rtx.a(2, "UploaderSession", this.g + " replace:" + i4 + " sending request:" + i5yVar.hashCode() + " newRequest:" + i5yVar2.hashCode());
        }
    }

    @Override // tb.lxx
    public void f(j5y j5yVar, g6y g6yVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("527ed7f3", new Object[]{this, j5yVar, g6yVar});
        } else {
            this.f.post(new a(4, this, j5yVar, g6yVar));
        }
    }

    @Override // tb.oxx
    public void g(i5y i5yVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8333ddf", new Object[]{this, i5yVar});
            return;
        }
        this.b.add(i5yVar);
        boolean h = ((mxx) this.e).h(this, i5yVar, this);
        if (rtx.d(2)) {
            rtx.a(2, "UploaderSession", this.g + " send, request:" + i5yVar.hashCode() + " register:" + h);
        }
    }

    @Override // tb.lxx
    public void h(j5y j5yVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9e8167e", new Object[]{this, j5yVar});
        } else {
            this.f.post(new a(1, this, j5yVar));
        }
    }

    @Override // tb.oxx
    public void i(i5y i5yVar, boolean z) {
        boolean z2 = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3530d5", new Object[]{this, i5yVar, new Boolean(z)});
        } else if (!this.b.remove(i5yVar)) {
            int j = j(i5yVar, this.c);
            if (j != -1) {
                boolean j2 = ((mxx) this.e).j(this, i5yVar, z);
                int r = r(this.c.remove(j).c, this.d);
                if (r != -1) {
                    this.f.removeCallbacks(this.d.remove(r));
                }
                if (rtx.d(2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(this.g);
                    sb.append(" cancel, sendingList request");
                    sb.append(i5yVar.hashCode());
                    sb.append(" remove timeout:");
                    if (r == -1) {
                        z2 = false;
                    }
                    sb.append(z2);
                    sb.append(" unregister:");
                    sb.append(j2);
                    rtx.a(2, "UploaderSession", sb.toString());
                }
            } else if (rtx.d(2)) {
                rtx.a(2, "UploaderSession", this.g + " cancel, no sending request:" + i5yVar.hashCode());
            }
        } else if (rtx.d(2)) {
            rtx.a(2, "UploaderSession", this.g + " cancel, waiting request:" + i5yVar.hashCode());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0044, code lost:
        if (r4 > 0) goto L_0x004a;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m(int r13) {
        /*
            Method dump skipped, instructions count: 418
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.hzx.m(int):void");
    }

    public final void n(int i2, ytx ytxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("953f22f3", new Object[]{this, new Integer(i2), ytxVar});
            return;
        }
        b remove = this.c.remove(i2);
        if (rtx.d(2)) {
            rtx.a(2, "UploaderSession", this.g + " notifyError, request:" + remove.f20996a.hashCode());
        }
        ztx ztxVar = this.f20994a;
        if (ztxVar != null) {
            ((stx) ztxVar).q(this, remove.f20996a, ytxVar);
        }
    }

    public void o(oxx oxxVar, i5y i5yVar, j5y j5yVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("903cfc4b", new Object[]{this, oxxVar, i5yVar, j5yVar});
        } else {
            this.f.post(new a(7, this, oxxVar, i5yVar, j5yVar));
        }
    }

    public void q(j5y j5yVar, int i2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("204b0f2f", new Object[]{this, j5yVar, new Integer(i2), new Boolean(z)});
            return;
        }
        int k = k(j5yVar, this.c);
        if (k != -1) {
            b bVar = this.c.get(k);
            boolean b2 = bVar.b();
            if (rtx.d(2)) {
                rtx.a(2, "UploaderSession", this.g + " doSend, begin:" + z + " connection:" + j5yVar.hashCode() + " sendSequence:" + i2 + " isFinished:" + b2);
            }
            if (z) {
                ztx ztxVar = this.f20994a;
                if (ztxVar != null) {
                    ((h9y) ztxVar).z(this, bVar.f20996a, bVar.g);
                }
            } else if (!b2) {
                m(k);
                return;
            } else {
                ztx ztxVar2 = this.f20994a;
                if (ztxVar2 != null) {
                    ((stx) ztxVar2).p(this, bVar.f20996a);
                }
            }
            y(bVar.c, bVar.i);
        } else if (rtx.d(8)) {
            rtx.a(8, "UploaderSession", this.g + " doSend, NO_POSITION, connection:" + j5yVar.hashCode());
        }
    }

    public void t(oxx oxxVar, i5y i5yVar, j5y j5yVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7944c14c", new Object[]{this, oxxVar, i5yVar, j5yVar});
            return;
        }
        boolean remove = this.b.remove(i5yVar);
        boolean z = !remove;
        boolean d = j5yVar.d();
        if (rtx.d(4)) {
            rtx.a(4, "UploaderSession", this.g + " onAvailable.session:" + oxxVar.hashCode() + " request:" + i5yVar.hashCode() + " noWaitingRequest:" + z + " connection:" + j5yVar.hashCode() + " needConnect:" + d + " target:" + i5yVar.a());
        }
        if (remove) {
            j5yVar.b(this);
            this.c.add(new b(i5yVar, j5yVar));
            if (d) {
                ztx ztxVar = this.f20994a;
                if (ztxVar != null) {
                    ((h9y) ztxVar).G(this, i5yVar);
                }
                j5yVar.b();
                return;
            }
            ztx ztxVar2 = this.f20994a;
            if (ztxVar2 != null) {
                ((h9y) ztxVar2).M(this, i5yVar);
            }
            m(this.c.size() - 1);
        }
    }

    public void u(j5y j5yVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77bfd27f", new Object[]{this, j5yVar});
            return;
        }
        this.d.remove(this);
        int k = k(j5yVar, this.c);
        if (k != -1) {
            if (rtx.d(2)) {
                rtx.a(2, "UploaderSession", this.g + " timeout, connection:" + j5yVar.hashCode());
            }
            n(k, new ytx("100", "2", "data send or receive timeout", true));
        } else if (rtx.d(8)) {
            rtx.a(8, "UploaderSession", this.g + " timeout, NO_POSITION, connection:" + j5yVar.hashCode());
        }
    }

    public void v(j5y j5yVar, ytx ytxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("105be3d7", new Object[]{this, j5yVar, ytxVar});
            return;
        }
        int k = k(j5yVar, this.c);
        if (k != -1) {
            if (rtx.d(2)) {
                rtx.a(2, "UploaderSession", this.g + " doError, connection:" + j5yVar.hashCode() + " error:" + ytxVar.toString() + " sendingList.size:" + this.c.size());
            }
            b bVar = this.c.get(k);
            bVar.a();
            A(bVar.c);
            n(k, ytxVar);
        } else if (rtx.d(8)) {
            rtx.a(8, "UploaderSession", this.g + " doError, NO_POSITION, connection:" + j5yVar.hashCode());
        }
    }

    public void x(j5y j5yVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5978e80", new Object[]{this, j5yVar});
            return;
        }
        int k = k(j5yVar, this.c);
        if (k != -1) {
            if (rtx.d(2)) {
                rtx.a(2, "UploaderSession", this.g + " doConnect, connection:" + j5yVar.hashCode());
            }
            ztx ztxVar = this.f20994a;
            if (ztxVar != null) {
                ((h9y) ztxVar).J(this, this.c.get(k).f20996a);
            }
            ztx ztxVar2 = this.f20994a;
            if (ztxVar2 != null) {
                ((h9y) ztxVar2).M(this, this.c.get(k).f20996a);
            }
            m(k);
        } else if (rtx.d(8)) {
            rtx.a(8, "UploaderSession", this.g + " doConnect, NO_POSITION, connection:" + j5yVar.hashCode());
        }
    }

    public final void y(j5y j5yVar, int i2) {
        a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd5ab483", new Object[]{this, j5yVar, new Integer(i2)});
            return;
        }
        int r = r(j5yVar, this.d);
        if (r == -1) {
            aVar = new a(8, this, j5yVar);
            this.d.add(aVar);
        } else {
            aVar = this.d.get(r);
            this.f.removeCallbacks(aVar);
        }
        this.f.postDelayed(aVar, (i2 / C1180n.b) + 30000);
    }

    public void z(j5y j5yVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("736f4a81", new Object[]{this, j5yVar});
            return;
        }
        int k = k(j5yVar, this.c);
        if (k != -1) {
            if (rtx.d(2)) {
                rtx.a(2, "UploaderSession", this.g + " doClose, connection:" + j5yVar.hashCode());
            }
            j5yVar.b(null);
            b bVar = this.c.get(k);
            bVar.a();
            A(bVar.c);
        } else if (rtx.d(8)) {
            rtx.a(8, "UploaderSession", this.g + " doClose, NO_POSITION, connection:" + j5yVar.hashCode());
        }
    }

    public final ytx s(b bVar, ByteBuffer byteBuffer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ytx) ipChange.ipc$dispatch("ceddad1d", new Object[]{this, bVar, byteBuffer});
        }
        byte[] bArr = bVar.b.f;
        int min = Math.min(bArr.length - bVar.f, byteBuffer.remaining());
        if (min < 0) {
            return new ytx("200", "1", "readFromBytes", false);
        }
        byteBuffer.put(bArr, bVar.f, min);
        bVar.f += min;
        return null;
    }

    public void w(j5y j5yVar, g6y g6yVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf47874", new Object[]{this, j5yVar, g6yVar});
            return;
        }
        int k = k(j5yVar, this.c);
        if (k != -1) {
            if (rtx.d(2)) {
                rtx.a(2, "UploaderSession", this.g + " doReceive, sendingList.size:" + this.c.size() + " index:" + k + " connection:" + j5yVar.hashCode() + " data:" + g6yVar.toString());
            }
            b bVar = this.c.get(k);
            y(bVar.c, bVar.i);
            p(bVar, g6yVar);
            ArrayList arrayList = null;
            do {
                Pair<f6y, Integer> a2 = bVar.f20996a.a(bVar.k, bVar.j.array(), bVar.j.arrayOffset(), bVar.j.position());
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(a2);
                if (a2.first == null) {
                    break;
                }
                bVar.j.flip();
                bVar.j.get(new byte[((Integer) a2.second).intValue()], 0, ((Integer) a2.second).intValue());
                bVar.j.compact();
            } while (bVar.j.position() >= 4);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Pair pair = (Pair) it.next();
                Object obj = pair.first;
                if (obj != null) {
                    ztx ztxVar = this.f20994a;
                    if (ztxVar != null) {
                        ((stx) ztxVar).j(this, bVar.f20996a, (f6y) obj);
                    }
                } else if (((Integer) pair.second).intValue() < 0) {
                    n(k, new ytx("400", "2", "response == null && divide < 0", true));
                    return;
                } else {
                    return;
                }
            }
        } else if (rtx.d(8)) {
            rtx.a(8, "UploaderSession", this.g + " doReceive, NO_POSITION, connection:" + j5yVar.hashCode());
        }
    }

    @Override // tb.lxx
    public void a(j5y j5yVar, ytx ytxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55e64356", new Object[]{this, j5yVar, ytxVar});
        } else {
            this.f.post(new a(3, this, j5yVar, ytxVar));
        }
    }

    public final ytx l(b bVar, ByteBuffer byteBuffer) {
        Throwable th;
        Exception e;
        FileInputStream fileInputStream;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ytx) ipChange.ipc$dispatch("2761d35c", new Object[]{this, bVar, byteBuffer});
        }
        v8y v8yVar = bVar.b;
        FileInputStream fileInputStream2 = null;
        if (v8yVar.h != null) {
            long j = v8yVar.c;
            int i2 = bVar.g;
            int i3 = (int) (j + i2);
            int min = (int) Math.min(v8yVar.d - i2, byteBuffer.remaining());
            if (min >= 0) {
                v8y v8yVar2 = bVar.b;
                long j2 = v8yVar2.d;
                byte[] bArr = v8yVar2.h;
                if (j2 <= bArr.length) {
                    byteBuffer.put(bArr, i3, min);
                    bVar.g += min;
                    if (rtx.d(4)) {
                        rtx.a(4, "UploaderSession", this.g + " readFromEntity, from copy:" + min);
                    }
                    return null;
                }
            }
            return new ytx("200", "11", "readFromBytes", false);
        }
        File file = v8yVar.f29861a;
        if (file == null || !file.exists()) {
            return new ytx("200", "3", "file == null || !file.exists()", false);
        }
        long lastModified = file.lastModified();
        if (lastModified != bVar.b.b) {
            if (rtx.d(8)) {
                rtx.a(8, "UploaderSession", this.g + " readFromEntity, file has been modified, origin:" + bVar.b.b + " current:" + lastModified);
            }
            if (0 == lastModified) {
                return new ytx("200", "10", "file.lastModified()==0", false);
            }
            return new ytx("200", "6", "file has been modified", false);
        }
        try {
            try {
                fileInputStream = new FileInputStream(file);
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            int read = fileInputStream.getChannel().read(byteBuffer, bVar.b.c + bVar.g);
            if (read < 0) {
                ytx ytxVar = new ytx("200", "3", "file read failed", false);
                try {
                    fileInputStream.close();
                } catch (IOException e3) {
                    if (rtx.d(8)) {
                        rtx.b(8, "UploaderSession", this.g + " readFromEntity:", e3);
                    }
                }
                return ytxVar;
            }
            int i4 = (int) ((bVar.g + read) - bVar.b.d);
            if (i4 > 0) {
                byteBuffer.position(byteBuffer.position() - i4);
                read -= i4;
            }
            if (read > 0) {
                bVar.g += read;
            }
            try {
                fileInputStream.close();
            } catch (IOException e4) {
                if (rtx.d(8)) {
                    rtx.b(8, "UploaderSession", this.g + " readFromEntity:", e4);
                }
            }
            return null;
        } catch (Exception e5) {
            e = e5;
            fileInputStream2 = fileInputStream;
            ytx ytxVar2 = new ytx("200", "3", e.toString(), false);
            if (fileInputStream2 != null) {
                try {
                    fileInputStream2.close();
                } catch (IOException e6) {
                    if (rtx.d(8)) {
                        rtx.b(8, "UploaderSession", this.g + " readFromEntity:", e6);
                    }
                }
            }
            return ytxVar2;
        } catch (Throwable th3) {
            th = th3;
            fileInputStream2 = fileInputStream;
            if (fileInputStream2 != null) {
                try {
                    fileInputStream2.close();
                } catch (IOException e7) {
                    if (rtx.d(8)) {
                        rtx.b(8, "UploaderSession", this.g + " readFromEntity:", e7);
                    }
                }
            }
            throw th;
        }
    }
}
