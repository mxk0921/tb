package tb;

import com.android.alibaba.ip.runtime.IpChange;
import tb.eo7;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class fo7 implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ eo7.s f19436a;
    public final /* synthetic */ eo7 b;

    public fo7(eo7 eo7Var, eo7.s sVar) {
        this.b = eo7Var;
        this.f19436a = sVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        eo7.s sVar = this.f19436a;
        if (sVar != null) {
            sVar.b(null, "DxTemplateInfos is null");
        }
    }
}
