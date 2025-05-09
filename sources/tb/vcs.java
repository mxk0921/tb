package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class vcs {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int COMPLETE_INITED = 2;
    public static final int INITIALIZING = 0;
    public static final int NECESSARY_INITED = 1;

    /* renamed from: a  reason: collision with root package name */
    public static volatile List<a> f29923a = new ArrayList();
    public static volatile AtomicInteger b = new AtomicInteger(0);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface a {
        void a();

        void b();
    }

    static {
        t2o.a(837812248);
    }

    public static synchronized void a() {
        synchronized (vcs.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("12836fd8", new Object[0]);
                return;
            }
            if (b.get() == 1) {
                b.set(2);
                Iterator it = ((ArrayList) f29923a).iterator();
                while (it.hasNext()) {
                    ((a) it.next()).a();
                }
            }
        }
    }

    public static synchronized void b() {
        synchronized (vcs.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a3476cf4", new Object[0]);
                return;
            }
            if (b.get() == 0) {
                b.set(1);
                Iterator it = ((ArrayList) f29923a).iterator();
                while (it.hasNext()) {
                    ((a) it.next()).b();
                }
            }
        }
    }
}
