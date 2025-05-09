package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class e39 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final e39 INSTANCE = new e39();

    static {
        t2o.a(1007681560);
        t2o.a(1007681568);
    }

    public void a(woh wohVar, l5c l5cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7404780a", new Object[]{this, wohVar, l5cVar});
            return;
        }
        ckf.g(wohVar, "param");
        ckf.g(l5cVar, "callback");
        rdp.INSTANCE.b().c(wohVar, l5cVar);
    }
}
