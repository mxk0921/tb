package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.detail.rate.view.SkuDialog;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class r2q implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ SkuDialog f27071a;

    public r2q(SkuDialog skuDialog) {
        this.f27071a = skuDialog;
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
        } else if (SkuDialog.C2(this.f27071a) != null) {
            SkuDialog.C2(this.f27071a).init();
        }
    }
}
