package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class gtt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public long f20230a;
    public long b;

    static {
        t2o.a(815792961);
    }

    public final long a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fff5e63e", new Object[]{this})).longValue();
        }
        return this.b - this.f20230a;
    }

    public final boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3fef87d", new Object[]{this})).booleanValue();
        }
        if (this.b >= this.f20230a) {
            return true;
        }
        return false;
    }

    public final void c(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da96e9a4", new Object[]{this, new Long(j)});
        } else {
            this.b = j;
        }
    }

    public final void d(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bbcb31fd", new Object[]{this, new Long(j)});
        } else {
            this.f20230a = j;
        }
    }
}
