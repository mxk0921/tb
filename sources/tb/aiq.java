package tb;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tbuprofen.mock.RuntimeMockUtils;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class aiq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final int[] f15764a = new int[2];
    public final AtomicBoolean b = new AtomicBoolean(false);
    public final AtomicInteger c = new AtomicInteger(0);

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb8c3e4e", new Object[]{this});
        } else if (this.b.get() && this.c.get() <= 1) {
            this.f15764a[this.c.getAndIncrement()] = RuntimeMockUtils.f(134217728L);
        }
    }

    public void b(Context context, b8l b8lVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec85adef", new Object[]{this, context, b8lVar});
        } else if (!this.b.get() && TextUtils.equals(b8lVar.b, b8lVar.f16248a) && t.a(context, "boostrap_adjust_heap_size_v3") && this.b.compareAndSet(false, true)) {
            zrr.d(new xrr());
            RuntimeMockUtils.a(context);
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("730c1fbb", new Object[]{this});
        } else if (this.b.get() && this.c.get() > 0) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < this.c.get(); i++) {
                sb.append(i);
                sb.append("=");
                sb.append(this.f15764a[i]);
                sb.append(",");
            }
            AppMonitor.Counter.commit(erj.MODULE, "boostrap", sb.toString(), 1.0d);
        }
    }
}
