package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.RandomAccess;
import tb.wpd;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class f74<A extends wpd> extends lcf<A> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(766509569);
    }

    public f74(int i) {
        super(i);
    }

    public static /* synthetic */ Object ipc$super(f74 f74Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/newShop/manager/CommonShopContentRenderInstanceController");
    }

    /* renamed from: m */
    public synchronized void j(A a2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b6a0d16", new Object[]{this, a2});
            return;
        }
        ckf.g(a2, "instance");
        h(a2);
    }

    /* renamed from: l */
    public synchronized void a(A a2) {
        int i = 0;
        synchronized (this) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("58c4e1b3", new Object[]{this, a2});
                return;
            }
            ckf.g(a2, "instance");
            if (c(a2)) {
                k(a2);
            } else if (g() < e()) {
                b(a2);
            } else {
                int e = e() - g();
                if (e == 0) {
                    e = 1;
                }
                ArrayList arrayList = new ArrayList();
                Iterator it = f().iterator();
                while (it.hasNext()) {
                    wpd wpdVar = (wpd) it.next();
                    if (i >= e) {
                        break;
                    } else if (!wpdVar.i()) {
                        arrayList.add(wpdVar);
                        i++;
                    }
                }
                RandomAccess f = f();
                if (f != null) {
                    kqu.a(f).removeAll(arrayList);
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        ((wpd) it2.next()).destroyView();
                    }
                    b(a2);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.MutableCollection<T>");
            }
        }
    }
}
