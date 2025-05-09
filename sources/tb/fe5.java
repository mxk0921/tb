package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.model.DXLongSparseArray;
import com.taobao.android.dinamicx.widget.DXOCRImageViewWidgetNode;
import com.taobao.android.dinamicx.widget.d;
import com.taobao.android.dinamicx.widget.i;
import com.taobao.android.dinamicx.widget.l;
import com.taobao.android.dinamicx.widget.z;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class fe5 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public DXLongSparseArray<lxb> f19229a;
    public final lxb b = new le5();
    public final lxb c = new me5();

    static {
        t2o.a(444597725);
    }

    public fe5() {
        c();
    }

    public lxb a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lxb) ipChange.ipc$dispatch("8af6d9a3", new Object[]{this});
        }
        return this.b;
    }

    public lxb b(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lxb) ipChange.ipc$dispatch("e2b20a33", new Object[]{this, new Long(j)});
        }
        DXLongSparseArray<lxb> dXLongSparseArray = this.f19229a;
        if (dXLongSparseArray != null) {
            return dXLongSparseArray.get(j);
        }
        return null;
    }

    public final void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e73869c0", new Object[]{this});
            return;
        }
        DXLongSparseArray<lxb> dXLongSparseArray = new DXLongSparseArray<>(50);
        this.f19229a = dXLongSparseArray;
        dXLongSparseArray.put(29525406863L, this.b);
        this.f19229a.put(4596163952226405054L, this.b);
        this.f19229a.put(-3496644918488563383L, this.b);
        this.f19229a.put(d.DX_WIDGET_ANIMATEDVIEW, this.b);
        this.f19229a.put(di6.DXTEXTINPUTVIEW_TEXTINPUTVIEW, this.b);
        this.f19229a.put(ef5.DXCALENDARVIEW_CALENDARVIEW, this.b);
        this.f19229a.put(p38.DXTEXTVIEW_TEXTVIEW, this.c);
        this.f19229a.put(6637736565700605658L, this.c);
        this.f19229a.put(-7675176749284896753L, this.c);
        this.f19229a.put(7821310614898040L, this.c);
        this.f19229a.put(7700670404894374791L, this.c);
        this.f19229a.put(8840950490744612256L, this.c);
        this.f19229a.put(8095935013984139892L, this.c);
        this.f19229a.put(5971992526290704869L, this.c);
        this.f19229a.put(2372426597927978788L, this.c);
        this.f19229a.put(-7401881896881775333L, this.c);
        this.f19229a.put(i.DX_GRID_LAYOUT, this.c);
        this.f19229a.put(my5.DXGRIDITEM_GRIDITEM, this.c);
        this.f19229a.put(-4224482009255257824L, this.c);
        this.f19229a.put(l.DXLOOPVIEWLAYOUT_LOOPVIEWLAYOUT, this.b);
        this.f19229a.put(z.DX_WIDGET_ID, this.b);
        this.f19229a.put(DXOCRImageViewWidgetNode.DXOCRIMAGEVIEW_OCRIMAGEVIEW, this.b);
    }
}
