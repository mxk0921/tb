package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.ConcurrentLinkedQueue;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class op0 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static volatile op0 b;

    /* renamed from: a  reason: collision with root package name */
    public final ConcurrentLinkedQueue<String> f25539a = new ConcurrentLinkedQueue<>();

    public static op0 c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (op0) ipChange.ipc$dispatch("3783faf7", new Object[0]);
        }
        if (b == null) {
            synchronized (op0.class) {
                try {
                    if (b == null) {
                        b = new op0();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return b;
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb659422", new Object[]{this, str});
        } else if (str == null) {
            this.f25539a.add("");
        } else {
            this.f25539a.add(str);
        }
    }

    public Object[] b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Object[]) ipChange.ipc$dispatch("94805eb6", new Object[]{this});
        }
        return this.f25539a.toArray();
    }
}
