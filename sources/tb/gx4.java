package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class gx4 implements Thread.UncaughtExceptionHandler {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final gx4 c = new gx4();

    /* renamed from: a  reason: collision with root package name */
    public Thread.UncaughtExceptionHandler f20284a;
    public final List<hx4> b = Collections.synchronizedList(new ArrayList());

    static {
        t2o.a(962592913);
    }

    public static gx4 b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gx4) ipChange.ipc$dispatch("bdc3322c", new Object[0]);
        }
        return c;
    }

    public void a(hx4 hx4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ff66b1c", new Object[]{this, hx4Var});
        } else {
            this.b.add(hx4Var);
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        this.f20284a = Thread.getDefaultUncaughtExceptionHandler();
        Thread.setDefaultUncaughtExceptionHandler(this);
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca89fd43", new Object[]{this, thread, th});
            return;
        }
        for (int i = 0; i < this.b.size(); i++) {
            try {
                this.b.get(i).b(thread, th);
            } catch (Throwable unused) {
                uncaughtExceptionHandler = this.f20284a;
                if (uncaughtExceptionHandler == null) {
                    return;
                }
            }
        }
        uncaughtExceptionHandler = this.f20284a;
        if (uncaughtExceptionHandler == null) {
            return;
        }
        uncaughtExceptionHandler.uncaughtException(thread, th);
    }
}
