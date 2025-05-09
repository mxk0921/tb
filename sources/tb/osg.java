package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class osg implements lp2 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final Comparator<byte[]> BUF_COMPARATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public final List<byte[]> f25617a = new LinkedList();
    public final List<byte[]> b = new ArrayList(64);
    public int c = 0;
    public int d;
    public int e;
    public int f;
    public int g;
    public final int h;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a implements Comparator<byte[]> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        public int compare(byte[] bArr, byte[] bArr2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("da6744ad", new Object[]{this, bArr, bArr2})).intValue();
            }
            return bArr.length - bArr2.length;
        }
    }

    static {
        t2o.a(620757024);
    }

    public osg(int i) {
        this.h = i;
    }

    public final void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("730c1fbb", new Object[]{this});
        } else if (xv8.g(3)) {
            fiv.a("BytesPool", "%d/%d , puts:%d, misses:%d, hits:%d, evicts:%d", Integer.valueOf(this.c), Integer.valueOf(this.h), Integer.valueOf(this.e), Integer.valueOf(this.f), Integer.valueOf(this.d), Integer.valueOf(this.g));
        }
    }

    @Override // tb.lp2
    public void clear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42d4c54", new Object[]{this});
        } else {
            d(0);
        }
    }

    public final synchronized void d(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e052507a", new Object[]{this, new Integer(i)});
            return;
        }
        while (this.c > i) {
            byte[] bArr = (byte[]) ((LinkedList) this.f25617a).remove(0);
            ((ArrayList) this.b).remove(bArr);
            this.c -= bArr.length;
            this.g++;
        }
    }

    @Override // tb.lp2
    public synchronized void b(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78abba55", new Object[]{this, bArr});
            return;
        }
        if (bArr != null && bArr.length <= this.h && !((LinkedList) this.f25617a).contains(bArr)) {
            this.e++;
            ((LinkedList) this.f25617a).add(bArr);
            int binarySearch = Collections.binarySearch(this.b, bArr, BUF_COMPARATOR);
            if (binarySearch < 0) {
                binarySearch = (-binarySearch) - 1;
            }
            ((ArrayList) this.b).add(binarySearch, bArr);
            this.c += bArr.length;
            d(this.h);
            fiv.a("BytesPool", "release a buffer into pool, length=%d", Integer.valueOf(bArr.length));
        }
    }

    @Override // tb.lp2
    public synchronized byte[] a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("d2e2525d", new Object[]{this, new Integer(i)});
        }
        for (int i2 = 0; i2 < ((ArrayList) this.b).size(); i2++) {
            byte[] bArr = (byte[]) ((ArrayList) this.b).get(i2);
            if (bArr.length >= i) {
                this.c -= bArr.length;
                ((ArrayList) this.b).remove(i2);
                ((LinkedList) this.f25617a).remove(bArr);
                this.d++;
                fiv.a("BytesPool", "success get buffer from pool, request=%d, result=%d", Integer.valueOf(i), Integer.valueOf(bArr.length));
                c();
                return bArr;
            }
        }
        this.f++;
        fiv.a("BytesPool", "failed get buffer from pool, request=%d", Integer.valueOf(i));
        c();
        return new byte[i];
    }
}
