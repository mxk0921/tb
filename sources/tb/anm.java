package tb;

import android.os.SystemClock;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class anm {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final float g = 6.0f;
    public static final float h = 3.0f;
    public static final float i = 1.0f;
    public int b;
    public int c;
    public int d;
    public String e;

    /* renamed from: a  reason: collision with root package name */
    public long f15886a = 0;
    public boolean f = false;

    static {
        t2o.a(468714714);
    }

    public int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3d371e90", new Object[]{this})).intValue();
        }
        return ((int) (((this.d * 1.0f) / 100.0f) * this.c)) - this.b;
    }

    public final boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3b4d541e", new Object[]{this})).booleanValue();
        }
        if (this.d > 95) {
            return true;
        }
        if ((!this.f || !akt.p2("ShortVideo.totalHealthy", true) || zk1.b() == 1) && a() < g * 1000.0f) {
            return false;
        }
        return true;
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("487311a8", new Object[]{this})).booleanValue();
        }
        if (!b() || ((float) (SystemClock.elapsedRealtime() - this.f15886a)) <= i * 1000.0f) {
            return false;
        }
        this.f15886a = SystemClock.elapsedRealtime();
        return true;
    }

    public boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f6d4e2f7", new Object[]{this})).booleanValue();
        }
        if (this.d > 95) {
            return false;
        }
        if ((!this.f || !akt.p2("ShortVideo.totalHealthy", true) || zk1.b() == 1) && a() <= h * 1000.0f) {
            return true;
        }
        return false;
    }

    public void e(String str, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e420c054", new Object[]{this, str, new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        this.b = i2;
        this.c = i3;
        this.d = i4;
        if (!TextUtils.equals(str, this.e)) {
            this.f = false;
        } else if (i3 - i2 <= akt.w2("ShortVideo.totalHealthyValue", 2000)) {
            this.f = true;
        }
        this.e = str;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "PreLoadHealthy{currentPosition=" + this.b + ", total=" + this.c + ", bufferPercent=" + this.d + '}';
    }
}
