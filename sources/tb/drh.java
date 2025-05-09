package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.mrt.task.MRTJob;
import com.taobao.mrt.thread.MRTThreadPriority;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class drh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public int f18029a;
    public final yqh b;
    public final Map<String, brh> c = new HashMap();
    public final AtomicInteger d = new AtomicInteger(0);
    public final String e;
    public final int f;

    static {
        t2o.a(577765439);
    }

    public drh(int i, int i2, String str) {
        this.f18029a = 0;
        this.b = null;
        this.e = str;
        this.f18029a = 0;
        this.f = ((i + i2) + 1) / 2;
        this.b = new lqh();
        b("mrt_", i, MRTThreadPriority.HIGH);
        b("mrt_", i2, MRTThreadPriority.LOW);
    }

    public void a(MRTJob mRTJob) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca6026ed", new Object[]{this, mRTJob});
        } else if (mRTJob != null) {
            ((lqh) this.b).d(mRTJob);
        }
    }

    public final void b(String str, int i, MRTThreadPriority mRTThreadPriority) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7923a2a", new Object[]{this, str, new Integer(i), mRTThreadPriority});
            return;
        }
        for (int i2 = 0; i2 < i; i2++) {
            String str2 = this.e + "-" + this.d.incrementAndGet();
            brh brhVar = new brh(this.b, mRTThreadPriority, this, str2);
            brhVar.start();
            this.c.put(str2, brhVar);
        }
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c996ffe0", new Object[]{this})).booleanValue();
        }
        return ((HashMap) this.c).isEmpty();
    }

    public void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc5e7b99", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str)) {
            synchronized (((lqh) this.b).c()) {
                try {
                    brh brhVar = (brh) ((HashMap) this.c).remove(str);
                    if (brhVar != null) {
                        if (this.f18029a < this.f) {
                            b("mrt_", 1, brhVar.c());
                            this.f18029a++;
                        }
                        brhVar.e();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
