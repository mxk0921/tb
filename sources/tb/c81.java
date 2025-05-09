package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.TMSBackPressedType;
import com.taobao.themis.kernel.page.ITMSPage;
import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;
import tb.w5d;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class c81 implements w5d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final ITMSPage f16907a;
    public final PriorityQueue<w5d.c> b = new PriorityQueue<>(10, a.INSTANCE);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a<T> implements Comparator {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final a<T> INSTANCE = new a<>();

        /* renamed from: a */
        public final int compare(w5d.c cVar, w5d.c cVar2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("cffc0775", new Object[]{this, cVar, cVar2})).intValue();
            }
            return cVar2.getPriority() - cVar.getPriority();
        }
    }

    static {
        t2o.a(839909596);
        t2o.a(839909630);
    }

    public c81(ITMSPage iTMSPage) {
        ckf.g(iTMSPage, "page");
        this.f16907a = iTMSPage;
    }

    @Override // tb.w5d
    public void A(w5d.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7365216f", new Object[]{this, cVar});
            return;
        }
        ckf.g(cVar, "interceptor");
        this.b.add(cVar);
    }

    @Override // tb.z5d
    public void G(ITMSPage iTMSPage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fea6c5d4", new Object[]{this, iTMSPage});
        } else {
            w5d.b.b(this, iTMSPage);
        }
    }

    @Override // tb.z5d
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("896696a2", new Object[]{this});
        } else {
            w5d.b.c(this);
        }
    }

    @Override // tb.w5d
    public void c0(w5d.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bad1b412", new Object[]{this, cVar});
            return;
        }
        ckf.g(cVar, "interceptor");
        this.b.remove(cVar);
    }

    @Override // tb.z5d
    public void w0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fc5065a", new Object[]{this});
        } else {
            w5d.b.a(this);
        }
    }

    @Override // tb.w5d
    public boolean C0(TMSBackPressedType tMSBackPressedType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("818a23eb", new Object[]{this, tMSBackPressedType})).booleanValue();
        }
        ckf.g(tMSBackPressedType, "type");
        Iterator<w5d.c> it = this.b.iterator();
        while (it.hasNext()) {
            if (it.next().a(this.f16907a, tMSBackPressedType)) {
                return true;
            }
        }
        return false;
    }
}
