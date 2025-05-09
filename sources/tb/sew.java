package tb;

import android.view.View;
import android.view.ViewParent;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.LinkedList;
import java.util.Queue;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class sew {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final Queue<sew> e = new LinkedList();

    /* renamed from: a  reason: collision with root package name */
    public int f27998a;
    public int b;
    public int c;
    public int d;

    public static sew a(View view, View view2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (sew) ipChange.ipc$dispatch("6efacbf7", new Object[]{view, view2});
        }
        sew sewVar = (sew) ((LinkedList) e).poll();
        if (sewVar == null) {
            sewVar = new sew();
        }
        int[] a2 = qgw.a(view, view2);
        boolean z = view instanceof TextView;
        int max = Math.max(0, a2[0]);
        int min = Math.min(qgw.screenWidth, a2[0] + view.getWidth());
        int max2 = Math.max(0, a2[1]);
        int min2 = Math.min(qgw.screenHeight, a2[1] + view.getHeight());
        sewVar.c = max;
        sewVar.d = min;
        sewVar.f27998a = max2;
        sewVar.b = min2;
        return sewVar;
    }

    public static sew b(View view, View view2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (sew) ipChange.ipc$dispatch("b60a4df", new Object[]{view, view2});
        }
        sew sewVar = (sew) ((LinkedList) e).poll();
        if (sewVar == null) {
            sewVar = new sew();
        }
        ViewParent parent = view.getParent();
        if (!(parent instanceof View)) {
            return sewVar;
        }
        View view3 = (View) parent;
        int[] a2 = qgw.a(view3, view2);
        int max = Math.max(0, a2[1]);
        int i = qgw.screenHeight;
        int min = Math.min(i, a2[1] + view3.getHeight());
        int max2 = Math.max(0, a2[0]);
        int i2 = qgw.screenWidth;
        int min2 = Math.min(i2, a2[0] + view3.getWidth());
        int[] a3 = qgw.a(view, view2);
        boolean z = view instanceof TextView;
        int max3 = Math.max(0, a3[0]);
        int min3 = Math.min(i2, a3[0] + view.getWidth());
        int max4 = Math.max(0, a3[1]);
        int min4 = Math.min(i, a3[1] + view.getHeight());
        sewVar.c = Math.max(max3, max2);
        sewVar.d = Math.min(min3, min2);
        sewVar.f27998a = Math.max(max4, max);
        sewVar.b = Math.min(min4, min);
        if (min3 - max3 <= 0 || min4 - max4 <= 0) {
            sewVar.c = 0;
            sewVar.d = 0;
            sewVar.f27998a = 0;
            sewVar.b = 0;
        }
        return sewVar;
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51af759a", new Object[]{this});
            return;
        }
        LinkedList linkedList = (LinkedList) e;
        if (linkedList.size() < 100) {
            linkedList.add(this);
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "ViewInfo{T=" + this.f27998a + ",B=" + this.b + ",L=" + this.c + ",R=" + this.d + ",null}";
    }
}
