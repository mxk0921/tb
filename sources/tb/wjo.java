package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class wjo implements igv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final x0s f30733a;

    public wjo(x0s x0sVar) {
        this.f30733a = x0sVar;
    }

    @Override // tb.igv
    public boolean a(Thread thread, Throwable th) {
        String message;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b744395", new Object[]{this, thread, th})).booleanValue();
        }
        return o1r.a(this.f30733a.g()).b("IgnoreRxException", true) && "io.reactivex.internal.util.ExceptionHelper$1".equals(th.getClass().getName()) && (message = th.getMessage()) != null && message.contains("No further exceptions");
    }
}
