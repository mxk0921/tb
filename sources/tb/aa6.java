package tb;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.f;
import com.taobao.android.dinamicx.videoc.expose.impl.RecyclerViewZone;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class aa6 implements RecyclerViewZone.b<Integer, WeakReference<View>> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int ORIENTATION_IDLE = 0;
    public static final int ORIENTATION_SCROLL_TO_BOTTOM = 1;
    public static final int ORIENTATION_SCROLL_TO_TOP = -1;

    /* renamed from: a  reason: collision with root package name */
    public final cxb<iew, exb> f15623a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public int f;
    public int g;
    public final String h;

    static {
        t2o.a(444597082);
        t2o.a(444597143);
    }

    public aa6(cxb<iew, exb> cxbVar, String str) {
        this(cxbVar, false, false, false, false, str);
    }

    @Override // com.taobao.android.dinamicx.videoc.expose.impl.RecyclerViewZone.b
    public void a(h4c<Integer, WeakReference<View>> h4cVar, String str, RecyclerView recyclerView, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b84f2e5e", new Object[]{this, h4cVar, str, recyclerView, new Integer(i), new Integer(i2)});
            return;
        }
        this.f = i;
        this.g = i2;
    }

    @Override // com.taobao.android.dinamicx.videoc.expose.impl.RecyclerViewZone.b
    public void b(h4c<Integer, WeakReference<View>> h4cVar, String str, RecyclerView recyclerView, View view) {
        View view2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5376cb78", new Object[]{this, h4cVar, str, recyclerView, view});
            return;
        }
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        if (childAdapterPosition != -1) {
            h4cVar.m(Integer.valueOf(childAdapterPosition), str);
            if (this.c) {
                h4cVar.f(Integer.valueOf(childAdapterPosition), str, false);
                cxb<iew, exb> cxbVar = this.f15623a;
                if (cxbVar != null) {
                    cxbVar.a(new iew(childAdapterPosition, -1L, new WeakReference(view)), str, false);
                    return;
                }
                return;
            }
            h4cVar.e(Integer.valueOf(childAdapterPosition), str);
        } else if (this.f15623a != null) {
            for (Integer num : h4cVar.h().keySet()) {
                if (zg5.T2()) {
                    try {
                        view2 = recyclerView.getLayoutManager().findViewByPosition(num.intValue());
                    } catch (Throwable th) {
                        xv5.b(th);
                        f fVar = new f(this.h);
                        fVar.c = new ArrayList();
                        ((ArrayList) fVar.c).add(new f.a("DX_Video_Control", "DX_Video_Control_Find_View_Position", f.DX_ERROR_VIDEOC_FIND_VIEW_POSITION));
                        ic5.p(fVar);
                        view2 = null;
                    }
                } else {
                    view2 = recyclerView.getLayoutManager().findViewByPosition(num.intValue());
                }
                if (view2 == null || recyclerView.getChildAdapterPosition(view2) != num.intValue()) {
                    h4cVar.f(num, str, false);
                } else {
                    h4cVar.j(num, new WeakReference<>(view2));
                }
            }
            this.f15623a.c(str);
            if (this.e) {
                h(h4cVar, str);
            } else {
                h4cVar.c(str);
            }
        }
    }

    public void h(h4c<Integer, WeakReference<View>> h4cVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64cbcc80", new Object[]{this, h4cVar, str});
            return;
        }
        ArrayList arrayList = new ArrayList(h4cVar.g().keySet());
        if (!arrayList.isEmpty()) {
            Collections.sort(arrayList);
            if (i() == -1) {
                Collections.reverse(arrayList);
            }
            h4cVar.k(str, arrayList);
        }
    }

    public int i() {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d817a207", new Object[]{this})).intValue();
        }
        int i2 = this.f;
        if (i2 != 0 || (i = this.g) == 0) {
            if (this.g != 0 || i2 == 0) {
                return 0;
            }
            if (i2 > 0) {
                return 1;
            }
            return -1;
        } else if (i > 0) {
            return 1;
        } else {
            return -1;
        }
    }

    public void j(h4c<Integer, WeakReference<View>> h4cVar, String str, RecyclerView recyclerView, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15f2352a", new Object[]{this, h4cVar, str, recyclerView, view});
            return;
        }
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        WeakReference<View> weakReference = new WeakReference<>(view);
        h4cVar.j(Integer.valueOf(childAdapterPosition), weakReference);
        if (!this.c) {
            h4cVar.l(Integer.valueOf(childAdapterPosition), weakReference, str);
        }
    }

    public void k(h4c<Integer, WeakReference<View>> h4cVar, String str, RecyclerView recyclerView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("198897ee", new Object[]{this, h4cVar, str, recyclerView, new Integer(i)});
        } else if (this.b || i != 0) {
        } else {
            if (!this.d) {
                h4cVar.d();
            } else if (this.e) {
                h(h4cVar, str);
            } else {
                h4cVar.i(str);
            }
        }
    }

    public aa6(cxb<iew, exb> cxbVar, boolean z, boolean z2, boolean z3, boolean z4, String str) {
        this.f = 0;
        this.g = 0;
        this.f15623a = cxbVar;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        this.h = str;
    }
}
