package tb;

import android.os.SystemClock;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class qon {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public long b = -1;

    /* renamed from: a  reason: collision with root package name */
    public final long f26857a = SystemClock.uptimeMillis();

    static {
        t2o.a(729810087);
    }

    public qon(String str) {
    }

    public long a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("79833cb7", new Object[]{this})).longValue();
        }
        long j = this.b;
        if (j < 0) {
            return -1L;
        }
        return j - this.f26857a;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62f29fbe", new Object[]{this});
        } else {
            this.b = SystemClock.uptimeMillis();
        }
    }
}
