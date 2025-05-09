package tb;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.uikit.extend.component.TBErrorView;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class ogt implements View.OnClickListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ TBErrorView f25381a;
    public final /* synthetic */ pgt b;

    public ogt(pgt pgtVar, TBErrorView tBErrorView) {
        this.b = pgtVar;
        this.f25381a = tBErrorView;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            return;
        }
        pgt.d(this.b, this.f25381a, true);
        pgt pgtVar = this.b;
        pgt.f(pgtVar, pgt.e(pgtVar));
    }
}
