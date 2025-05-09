package tb;

import com.android.alibaba.ip.runtime.IpChange;
import tb.eo7;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class ho7 implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ eo7.s f20778a;
    public final /* synthetic */ l38 b;
    public final /* synthetic */ eo7 c;

    public ho7(eo7 eo7Var, eo7.s sVar, l38 l38Var) {
        this.c = eo7Var;
        this.f20778a = sVar;
        this.b = l38Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        eo7.s sVar = this.f20778a;
        if (sVar != null) {
            sVar.b(this.b, "DxTemplateInfo is invalid");
        }
    }
}
