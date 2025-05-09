package tb;

import android.os.SystemClock;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class d7m {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final int e = eps.p();
    public static final int f = eps.q();

    /* renamed from: a  reason: collision with root package name */
    public int f17640a = Integer.MIN_VALUE;
    public boolean b = false;
    public long c = 0;
    public boolean d = false;

    static {
        t2o.a(468714075);
    }

    public int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("84096c44", new Object[]{this})).intValue();
        }
        return this.f17640a;
    }

    public boolean b(int i, int i2, int i3) {
        int i4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f7044d9", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)})).booleanValue();
        }
        if (SystemClock.elapsedRealtime() - this.c > 1000 && this.d) {
            this.c = SystemClock.elapsedRealtime();
            int max = Math.max(((i3 * i2) / 100) - i, 0);
            if (max > e || i2 > 95 || (i3 - i <= 2000 && zk1.b() != 1)) {
                this.b = true;
                i4 = 1;
            } else if (max >= f) {
                this.b = true;
                i4 = 0;
            } else if (this.b) {
                i4 = -1;
            } else {
                i4 = Integer.MIN_VALUE;
            }
            if (!(i4 == this.f17640a || i4 == Integer.MIN_VALUE)) {
                this.f17640a = i4;
                return true;
            }
        }
        return false;
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("727a9da8", new Object[]{this});
            return;
        }
        this.f17640a = Integer.MIN_VALUE;
        this.b = false;
        this.c = 0L;
        this.d = true;
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aeeba070", new Object[]{this});
        } else {
            this.d = false;
        }
    }
}
