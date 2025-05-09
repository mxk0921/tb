package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.riverlogger.inspector.InspectorNativeAgent;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ecf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public long f18470a;

    static {
        t2o.a(649068585);
    }

    public ecf(String str, String str2, String str3) {
        this.f18470a = InspectorNativeAgent.createSession(str, str2, str3);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e32ba67f", new Object[]{this});
        } else {
            b(null);
        }
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9419ce89", new Object[]{this, str});
            return;
        }
        long j = this.f18470a;
        if (j != 0) {
            InspectorNativeAgent.closeSession(j, str);
            this.f18470a = 0L;
        }
    }

    public void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6691f08", new Object[]{this, str});
            return;
        }
        long j = this.f18470a;
        if (j != 0) {
            InspectorNativeAgent.openSession(j, str);
        }
    }

    public void finalize() throws Throwable {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a35321a5", new Object[]{this});
            return;
        }
        b(null);
        super.finalize();
    }
}
