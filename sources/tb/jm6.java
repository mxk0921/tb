package tb;

import android.util.Pair;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class jm6 implements qp8<Integer, WeakReference<View>> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final cxb<iew, exb> f22068a;
    public final float b;
    public final boolean c;

    static {
        t2o.a(444597083);
        t2o.a(444597132);
    }

    public jm6(cxb<iew, exb> cxbVar, float f, boolean z) {
        this.f22068a = cxbVar;
        this.b = Math.min(f, 1.0f);
        this.c = z;
    }

    /* renamed from: a */
    public void d(Integer num, WeakReference<View> weakReference, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bbe5d41d", new Object[]{this, num, weakReference, str});
        } else {
            this.f22068a.f(new iew(num.intValue(), -1L, weakReference), str);
        }
    }

    /* renamed from: b */
    public boolean f(Integer num, WeakReference<View> weakReference, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9a71fdc8", new Object[]{this, num, weakReference, str})).booleanValue();
        }
        return false;
    }

    @Override // tb.gqk
    public void e(List<Pair<Integer, WeakReference<View>>> list, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2559b8b", new Object[]{this, list, str});
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Pair<Integer, WeakReference<View>> pair : list) {
            if (!(pair.first == null || pair.second == null)) {
                arrayList.add(new iew(((Integer) pair.first).intValue(), System.nanoTime(), (WeakReference) pair.second));
            }
        }
        this.f22068a.b(arrayList, str);
    }

    /* renamed from: h */
    public void c(Integer num, WeakReference<View> weakReference, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("411f3de5", new Object[]{this, num, weakReference, str});
        } else {
            this.f22068a.d(new iew(num.intValue(), System.nanoTime(), weakReference), str);
        }
    }

    /* renamed from: i */
    public boolean g(Integer num, WeakReference<View> weakReference, String str, Map<Integer, WeakReference<View>> map) {
        cxb<iew, exb> cxbVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("75a2348e", new Object[]{this, num, weakReference, str, map})).booleanValue();
        }
        View view = weakReference.get();
        if (view == null) {
            return false;
        }
        boolean a2 = zgw.a(view, this.b);
        if (this.c && !a2 && (cxbVar = this.f22068a) != null) {
            cxbVar.f(new iew(num.intValue(), -1L, weakReference), str);
        }
        return a2;
    }
}
