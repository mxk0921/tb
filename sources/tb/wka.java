package tb;

import android.app.Application;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class wka implements w24 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final List<w24> f30742a = new ArrayList();

    @Override // tb.w24
    public void a(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8140e3", new Object[]{this, application});
            return;
        }
        Iterator it = ((ArrayList) this.f30742a).iterator();
        while (it.hasNext()) {
            try {
                ((w24) it.next()).a(application);
            } catch (Throwable unused) {
            }
        }
    }

    public wka b(w24 w24Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (wka) ipChange.ipc$dispatch("3c6f5091", new Object[]{this, w24Var});
        }
        ((ArrayList) this.f30742a).add(w24Var);
        return this;
    }
}
