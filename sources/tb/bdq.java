package tb;

import android.app.PendingIntent;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public abstract class bdq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(676331589);
    }

    public abstract long a();

    public abstract int b();

    public abstract int c();

    public abstract List d();

    public List e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("583692e5", new Object[]{this});
        }
        if (e() != null) {
            return new ArrayList(e());
        }
        return new ArrayList();
    }

    public abstract List<String> f();

    public abstract PendingIntent g();

    public abstract int h();

    public abstract int i();

    public abstract long j();
}
