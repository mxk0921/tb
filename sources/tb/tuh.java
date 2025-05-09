package tb;

import android.os.Looper;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class tuh implements suh, uuh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public boolean f28970a;
    public long b;
    public long c = -1;

    @Override // tb.uuh
    public long a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2959363c", new Object[]{this})).longValue();
        }
        return this.c;
    }

    @Override // tb.uuh
    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("681fc391", new Object[]{this})).booleanValue();
        }
        return this.f28970a;
    }

    @Override // tb.suh
    public suh c() {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (suh) ipChange.ipc$dispatch("ed1e3094", new Object[]{this});
        }
        if (this.c == -1) {
            this.c = cvh.g();
        }
        if (Looper.myLooper() == Looper.getMainLooper()) {
            z = true;
        }
        this.f28970a = z;
        this.b = Thread.currentThread().getId();
        return this;
    }

    @Override // tb.suh
    public uuh d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (uuh) ipChange.ipc$dispatch("d1d9a6c0", new Object[]{this});
        }
        return this;
    }

    public void e(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd6415f0", new Object[]{this, new Long(j)});
        } else {
            this.c = j;
        }
    }

    @Override // tb.uuh
    public long getTid() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("eee3a154", new Object[]{this})).longValue();
        }
        return this.b;
    }
}
