package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class h91 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final long f20481a;

    public h91() {
        this.f20481a = 0L;
    }

    public long a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cb6537f4", new Object[]{this})).longValue();
        }
        return this.f20481a;
    }

    public h91(long j, long j2) {
        this.f20481a = j2 - j;
    }
}
