package tb;

import android.util.SparseArray;
import android.util.SparseIntArray;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import java.util.ArrayList;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class bsn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final SparseArray<ArrayList<DXWidgetNode>> f16604a = new SparseArray<>();
    public final SparseIntArray b = new SparseIntArray();

    static {
        t2o.a(444597463);
    }

    public DXWidgetNode a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXWidgetNode) ipChange.ipc$dispatch("f75caf0f", new Object[]{this, new Integer(i)});
        }
        ArrayList<DXWidgetNode> arrayList = this.f16604a.get(i);
        if (arrayList == null || arrayList.isEmpty()) {
            return null;
        }
        int size = arrayList.size() - 1;
        DXWidgetNode dXWidgetNode = arrayList.get(size);
        arrayList.remove(size);
        return dXWidgetNode;
    }

    public final ArrayList<DXWidgetNode> b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("c332b9ba", new Object[]{this, new Integer(i)});
        }
        ArrayList<DXWidgetNode> arrayList = this.f16604a.get(i);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            this.f16604a.put(i, arrayList);
            if (this.b.indexOfKey(i) < 0) {
                this.b.put(i, 10);
            }
        }
        return arrayList;
    }

    public void c(int i, DXWidgetNode dXWidgetNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("715280b8", new Object[]{this, new Integer(i), dXWidgetNode});
            return;
        }
        ArrayList<DXWidgetNode> b = b(i);
        if (this.b.get(i) > b.size()) {
            b.add(dXWidgetNode);
        }
    }
}
