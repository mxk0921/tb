package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.skeleton.desc.natives.DescNativeController;
import com.taobao.android.detail.ttdetail.widget.listview.DetailListView;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class wc7 implements DetailListView.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f30609a;
    public final /* synthetic */ DescNativeController b;

    public wc7(DescNativeController descNativeController, int i) {
        this.b = descNativeController;
        this.f30609a = i;
    }

    @Override // com.taobao.android.detail.ttdetail.widget.listview.DetailListView.b
    public void a(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48fdabc4", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        DescNativeController.s(this.b, i, i2);
        if (DescNativeController.D(this.b) != 0 && DescNativeController.F(this.b) && DescNativeController.G(this.b) && !DescNativeController.H(this.b) && DescNativeController.I(this.b) && DescNativeController.D(this.b) > DescNativeController.K(this.b) * this.f30609a && DescNativeController.D(this.b) - i <= DescNativeController.K(this.b) * this.f30609a && DescNativeController.L(this.b) != null) {
            DescNativeController.L(this.b).a();
            DescNativeController.J(this.b, false);
            tgh.b(DescNativeController.TAG, "onScrollYChange newY=" + i + ", totalHeight=" + DescNativeController.D(this.b));
        }
    }
}
