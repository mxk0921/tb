package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class fpx {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static fpx b;

    /* renamed from: a  reason: collision with root package name */
    public final AtomicBoolean f19460a = new AtomicBoolean(false);

    static {
        t2o.a(989856491);
    }

    public static fpx a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fpx) ipChange.ipc$dispatch("ee4892e2", new Object[0]);
        }
        if (b == null) {
            synchronized (fpx.class) {
                try {
                    if (b == null) {
                        b = new fpx();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return b;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
        } else if (!this.f19460a.get() && mpw.a().b() && this.f19460a.compareAndSet(false, true)) {
            v7t.i("ZCache", "未初始化ZCache so，需要先初始化");
            try {
                ppx.b();
            } catch (Throwable th) {
                this.f19460a.set(false);
                v7t.d("ZCache", "初始化ZCache so失败");
                th.printStackTrace();
            }
        }
    }
}
