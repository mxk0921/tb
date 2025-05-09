package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamic.tempate.DTemplateManager;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class gyi {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public q65 f20313a;
    public DTemplateManager b;

    static {
        t2o.a(444596241);
    }

    public static gyi a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gyi) ipChange.ipc$dispatch("8f4df384", new Object[]{str});
        }
        if (eb5.D()) {
            qn7.a();
        }
        gyi gyiVar = new gyi();
        gyiVar.f20313a = new q65(str);
        gyiVar.b = new DTemplateManager(str);
        return gyiVar;
    }
}
