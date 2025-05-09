package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashSet;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class krr {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static krr b;

    /* renamed from: a  reason: collision with root package name */
    public final HashSet<Context> f22871a = new HashSet<>(4);

    static {
        t2o.a(713031687);
    }

    public krr(Context context) {
        c(context);
    }

    public static void b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{context});
            return;
        }
        if (b == null) {
            b = new krr(context);
        }
        b.a(context);
    }

    public static void e(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66d8e67a", new Object[]{context});
            return;
        }
        krr krrVar = b;
        if (krrVar != null) {
            krrVar.f(context);
        }
    }

    public void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c350a13", new Object[]{this, context});
        } else {
            this.f22871a.add(context);
        }
    }

    public void c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f67ea346", new Object[]{this, context});
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        g8v.INSTANCE.g("NAME_SPACE_BABEL_ORDER");
        d48.INSTANCE.g("NAME_SPACE_BABEL_ORDER");
        c28.INSTANCE.g("NAME_SPACE_BABEL_ORDER");
        y28.INSTANCE.g("NAME_SPACE_BABEL_ORDER");
        b = null;
    }

    public void f(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8277e79", new Object[]{this, context});
            return;
        }
        this.f22871a.remove(context);
        if (this.f22871a.isEmpty()) {
            d();
        }
    }
}
