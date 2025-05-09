package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class esm implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ dsm f18796a;

    public esm(dsm dsmVar) {
        this.f18796a = dsmVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
        } else if (!dsm.a(this.f18796a).isEmpty()) {
            for (ocd ocdVar : dsm.a(this.f18796a)) {
                ocdVar.cancel();
            }
        }
    }
}
