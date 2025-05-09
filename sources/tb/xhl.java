package tb;

import com.alibaba.wireless.security.aopsdk.Invocation;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Iterator;
import java.util.LinkedList;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class xhl {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String MONITOR_MODULE = "TBPrivacyGuard";
    public static final String TAG = "PGReportManager";

    /* renamed from: a  reason: collision with root package name */
    public final LinkedList<jjd> f31403a = new LinkedList<>();

    static {
        t2o.a(757071912);
    }

    public xhl() {
        a();
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        b();
        Iterator<jjd> it = this.f31403a.iterator();
        while (it.hasNext()) {
            it.next().init();
        }
    }

    public final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21b1b72b", new Object[]{this});
            return;
        }
        this.f31403a.add(new pzl());
        this.f31403a.addLast(new skf());
        this.f31403a.size();
    }

    public void c(Invocation invocation) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4675afe", new Object[]{this, invocation});
            return;
        }
        Iterator<jjd> it = this.f31403a.iterator();
        while (it.hasNext()) {
            jjd next = it.next();
            if (next.b(invocation)) {
                next.a(invocation);
                return;
            }
        }
    }
}
