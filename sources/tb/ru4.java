package tb;

import java.util.Collection;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class ru4 {

    /* renamed from: a  reason: collision with root package name */
    public static final Collection<pu4> f27612a = dcp.y(acp.d(qu4.a()));

    public static final Collection<pu4> a() {
        return f27612a;
    }

    public static final void b(Throwable th) {
        Thread currentThread = Thread.currentThread();
        currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
    }
}
