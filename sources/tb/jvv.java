package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavir.config.BHRTaskConfigBase;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class jvv {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static volatile jvv c;

    /* renamed from: a  reason: collision with root package name */
    public long f22249a;
    public long b;

    public static jvv b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jvv) ipChange.ipc$dispatch("b34d6821", new Object[0]);
        }
        if (c == null) {
            synchronized (jvv.class) {
                try {
                    if (c == null) {
                        c = new jvv();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return c;
    }

    public synchronized void a(long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53fe10cb", new Object[]{this, new Long(j), new Long(j2)});
            return;
        }
        this.f22249a += j;
        this.b += j2;
    }

    public synchronized void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa9ffee6", new Object[]{this});
            return;
        }
        bzp.b().a(BHRTaskConfigBase.TYPE_CONFIG_UT, true, null, null, null, null, this.f22249a, this.b);
        this.f22249a = 0L;
        this.b = 0L;
    }
}
