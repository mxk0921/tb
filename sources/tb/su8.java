package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.flybird.deploy.FBTemplateDecider;
import com.flybird.deploy.callback.a;
import java.util.ArrayList;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class su8 implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ mu8 f28278a;
    public final /* synthetic */ a b;
    public final /* synthetic */ FBTemplateDecider c;

    public su8(FBTemplateDecider fBTemplateDecider, mu8 mu8Var, a aVar) {
        this.c = fBTemplateDecider;
        this.b = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        FBTemplateDecider fBTemplateDecider = this.c;
        IpChange ipChange2 = FBTemplateDecider.$ipChange;
        fBTemplateDecider.getClass();
        pgh.h("_triggerIdleUpdateAsync on " + fBTemplateDecider);
        jst.a();
        fBTemplateDecider.b();
        new ArrayList();
        a.C0245a aVar = new a.C0245a();
        fBTemplateDecider.b();
        aVar.deploymentType = fBTemplateDecider.i.b();
        throw null;
    }
}
