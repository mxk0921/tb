package tb;

import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;

/* compiled from: Taobao */
@Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 1})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class dgn implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ d1a f17799a;

    public dgn(d1a d1aVar) {
        this.f17799a = d1aVar;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
        } else {
            ckf.f(this.f17799a.invoke(), "invoke(...)");
        }
    }
}
