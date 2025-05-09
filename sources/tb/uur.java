package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class uur {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String MODULE_NAME = "TBQuality";
    public static final uur b = new uur();
    public static final AtomicBoolean c = new AtomicBoolean(false);

    /* renamed from: a  reason: collision with root package name */
    public final kr4 f29624a = new kr4();

    static {
        t2o.a(634388482);
    }

    public static uur a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (uur) ipChange.ipc$dispatch("11760ec5", new Object[0]);
        }
        return b;
    }

    public void b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{this, context});
        } else if (c.compareAndSet(false, true)) {
            this.f29624a.b(context);
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810347e9", new Object[]{this});
        } else {
            this.f29624a.d();
        }
    }
}
