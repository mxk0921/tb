package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.Thread;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class r1v implements Thread.UncaughtExceptionHandler {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final r1v d = new r1v();
    public static volatile boolean e = false;

    /* renamed from: a  reason: collision with root package name */
    public Thread.UncaughtExceptionHandler f27049a = null;
    public p4e b = null;
    public boolean c = true;

    static {
        t2o.a(962593276);
    }

    public static r1v getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (r1v) ipChange.ipc$dispatch("8d6e0dd4", new Object[0]);
        }
        return d;
    }

    public final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d37d7636", new Object[]{this});
        } else if (this.c) {
            this.f27049a = Thread.getDefaultUncaughtExceptionHandler();
            Thread.setDefaultUncaughtExceptionHandler(this);
            this.c = false;
        }
    }

    public boolean isTurnOff() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("792e7fb3", new Object[]{this})).booleanValue();
        }
        return this.c;
    }

    public void setCrashCaughtListener(p4e p4eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3a767f", new Object[]{this, p4eVar});
        } else {
            this.b = p4eVar;
        }
    }

    public void turnOff() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd39e339", new Object[]{this});
            return;
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f27049a;
        if (uncaughtExceptionHandler != null) {
            Thread.setDefaultUncaughtExceptionHandler(uncaughtExceptionHandler);
            this.f27049a = null;
        }
        this.c = true;
    }

    public void turnOn(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33409765", new Object[]{this, context});
        } else {
            a();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b8, code lost:
        if (r0 != null) goto L_0x00ba;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ba, code lost:
        r0.uncaughtException(r12, r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00be, code lost:
        android.os.Process.killProcess(android.os.Process.myPid());
        java.lang.System.exit(10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00ce, code lost:
        if (r0 == null) goto L_0x00be;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00d1, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:?, code lost:
        return;
     */
    @Override // java.lang.Thread.UncaughtExceptionHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void uncaughtException(java.lang.Thread r12, java.lang.Throwable r13) {
        /*
            Method dump skipped, instructions count: 232
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.r1v.uncaughtException(java.lang.Thread, java.lang.Throwable):void");
    }
}
