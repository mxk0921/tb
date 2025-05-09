package tb;

import android.os.SystemClock;
import com.android.alibaba.ip.runtime.IpChange;
import com.flybird.support.basics.AppContextHolder;
import java.util.concurrent.TimeUnit;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class gwt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final long f20276a = SystemClock.elapsedRealtimeNanos();
    public boolean b = false;

    public static void b(gwt gwtVar, TimeUnit timeUnit, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("768b96", new Object[]{gwtVar, timeUnit, str, str2});
            return;
        }
        gwtVar.a();
        long convert = timeUnit.convert(gwtVar.e(), TimeUnit.NANOSECONDS);
        if (AppContextHolder.b) {
            pgh.b(str, str2 + " (" + convert + " " + timeUnit.name() + f7l.BRACKET_END_STR);
        }
    }

    public static gwt c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gwt) ipChange.ipc$dispatch("c9dd7577", new Object[0]);
        }
        return new gwt();
    }

    public static void d(gwt gwtVar, TimeUnit timeUnit, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40a17257", new Object[]{gwtVar, timeUnit, str, str2});
            return;
        }
        gwtVar.a();
        long convert = timeUnit.convert(gwtVar.e(), TimeUnit.NANOSECONDS);
        pgh.i(str, str2 + " (" + convert + " " + timeUnit.name() + f7l.BRACKET_END_STR);
    }

    public static void f(gwt gwtVar, TimeUnit timeUnit, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80cc5918", new Object[]{gwtVar, timeUnit, str, str2});
            return;
        }
        gwtVar.a();
        long convert = timeUnit.convert(SystemClock.elapsedRealtimeNanos() - gwtVar.f20276a, TimeUnit.NANOSECONDS);
        pgh.i(str, str2 + " (" + convert + " " + timeUnit.name() + ") ...");
    }

    public final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (this.b && AppContextHolder.b) {
            throw new RuntimeException("Timing already used!");
        }
    }

    public final long e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5889b5e", new Object[]{this})).longValue();
        }
        this.b = true;
        return SystemClock.elapsedRealtimeNanos() - this.f20276a;
    }
}
