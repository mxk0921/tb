package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.model.DXLongSparseArray;
import com.taobao.android.dinamicx.model.DXReadWriteLongSparseArray;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.android.dinamicx_v4.loader.DXExtensionSectionLoader;
import com.taobao.android.dxv4common.logic.dex.DXNativeLogicLoadTask;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class uk6 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final a16 f29429a;
    public final hh5 b;
    public final iw5 c;
    public final em6 d;
    public final pg5 e;
    public final DXExtensionSectionLoader f;
    public final bc5 g;
    public final l06 h;
    public int i = 1000;

    static {
        t2o.a(444597871);
        t2o.a(444597873);
    }

    public uk6(a16 a16Var, hh5 hh5Var, iw5 iw5Var, em6 em6Var, pg5 pg5Var, DXExtensionSectionLoader dXExtensionSectionLoader, bc5 bc5Var, l06 l06Var) {
        this.f29429a = a16Var;
        this.b = hh5Var;
        this.c = iw5Var;
        this.d = em6Var;
        this.e = pg5Var;
        this.f = dXExtensionSectionLoader;
        this.g = bc5Var;
        this.h = l06Var;
    }

    public void a(DXWidgetNode dXWidgetNode, DXReadWriteLongSparseArray<nvb> dXReadWriteLongSparseArray, DXLongSparseArray<ivb> dXLongSparseArray) {
        sl6 sl6Var;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68783a9", new Object[]{this, dXWidgetNode, dXReadWriteLongSparseArray, dXLongSparseArray});
            return;
        }
        if (dXWidgetNode.getDxv4Properties() != null) {
            sl6Var = dXWidgetNode.getDxv4Properties();
        } else {
            sl6 sl6Var2 = new sl6();
            dXWidgetNode.setDxv4Properties(sl6Var2);
            sl6Var = sl6Var2;
        }
        sl6Var.y(dXLongSparseArray);
        sl6Var.A(dXReadWriteLongSparseArray);
        sl6Var.B(this.c.c());
        sl6Var.v(this.b.a());
        sl6Var.w(this.e.a());
    }

    public DXWidgetNode b(lg5 lg5Var, DXRuntimeContext dXRuntimeContext, boolean z, AtomicBoolean atomicBoolean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("4d683594", new Object[]{this, lg5Var, dXRuntimeContext, new Boolean(z), atomicBoolean});
        }
        lg5Var.k(this.f29429a.h());
        DXWidgetNode d = d(lg5Var, null, dXRuntimeContext, atomicBoolean);
        d.getDxv4Properties().L(this.d.a());
        d.getDxv4Properties().z(this.f.a());
        d.getDxv4Properties().u(this.g.a());
        if (this.h.a() == 2) {
            DXNativeLogicLoadTask.asyncLoadData(d);
        } else if (this.h.a() == 0) {
            u16.a(d);
        }
        return d;
    }

    public boolean c(lg5 lg5Var, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a2df0ee7", new Object[]{this, lg5Var, dXRuntimeContext})).booleanValue();
        }
        lg5Var.k(this.f29429a.h());
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x020f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.taobao.android.dinamicx.widget.DXWidgetNode d(tb.lg5 r21, com.taobao.android.dinamicx.widget.DXWidgetNode r22, com.taobao.android.dinamicx.DXRuntimeContext r23, java.util.concurrent.atomic.AtomicBoolean r24) {
        /*
            Method dump skipped, instructions count: 763
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.uk6.d(tb.lg5, com.taobao.android.dinamicx.widget.DXWidgetNode, com.taobao.android.dinamicx.DXRuntimeContext, java.util.concurrent.atomic.AtomicBoolean):com.taobao.android.dinamicx.widget.DXWidgetNode");
    }
}
