package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class pxk {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public long f26375a;
    public long b;
    public long c;

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e43be35e", new Object[]{this, new Integer(i)});
            return;
        }
        long serverTime = v2s.o().C().getServerTime();
        if (i > 0) {
            long j = this.f26375a;
            if (j > 0) {
                long j2 = serverTime - j;
                this.b += j2;
                this.c += j2;
            }
        }
        this.f26375a = serverTime;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("678806af", new Object[]{this});
        } else {
            this.b = 0L;
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788e6256", new Object[]{this});
        } else {
            this.f26375a = 0L;
        }
    }
}
