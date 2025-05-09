package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.ExecutorService;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class n35<T, R> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final eft<T, R> f24481a;

    public n35(ExecutorService executorService) {
        this(executorService, null);
    }

    public eft<T, R> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (eft) ipChange.ipc$dispatch("b6f26a8d", new Object[]{this});
        }
        return this.f24481a;
    }

    public n35(ExecutorService executorService, fft<T, R> fftVar) {
        this.f24481a = new gft(executorService, fftVar);
    }
}
