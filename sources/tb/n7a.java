package tb;

import android.graphics.drawable.Drawable;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import tb.p8o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class n7a implements p8o.c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final WeakReference<z0c> f24555a;

    static {
        t2o.a(295698503);
        t2o.a(806355786);
    }

    public n7a(z0c z0cVar) {
        this.f24555a = new WeakReference<>(z0cVar);
    }

    @Override // tb.p8o.c
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c09162bc", new Object[]{this});
        } else {
            q0h.a("GetDrawablesListener", "onGetFail------");
        }
    }

    @Override // tb.p8o.c
    public void b(ArrayList<Drawable> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7e369f7", new Object[]{this, arrayList});
            return;
        }
        z0c z0cVar = this.f24555a.get();
        if (z0cVar != null) {
            z0cVar.setDrawables(arrayList);
        }
    }
}
