package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.flybird.deploy.FBTemplateDecider;
import com.flybird.deploy.callback.a;
import com.flybird.deploy.model.FBSimpleTplInfo;
import com.flybird.deploy.model.FBUpdatePolicy$DeploymentType;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class ou8 implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ FBSimpleTplInfo f25660a;
    public final /* synthetic */ qt8 b;
    public final /* synthetic */ a c;
    public final /* synthetic */ FBTemplateDecider d;

    public ou8(FBTemplateDecider fBTemplateDecider, FBSimpleTplInfo fBSimpleTplInfo, qt8 qt8Var, a aVar) {
        this.d = fBTemplateDecider;
        this.f25660a = fBSimpleTplInfo;
        this.c = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        FBTemplateDecider fBTemplateDecider = this.d;
        FBSimpleTplInfo fBSimpleTplInfo = this.f25660a;
        IpChange ipChange2 = FBTemplateDecider.$ipChange;
        fBTemplateDecider.getClass();
        pgh.h("_updateAndGetTplInfoBasicAsyncBlocking called on " + fBTemplateDecider + " tplInfo: " + fBSimpleTplInfo + " options: null");
        jst.a();
        fBTemplateDecider.b();
        a.C0245a aVar = new a.C0245a();
        fBSimpleTplInfo.b();
        aVar.deploymentType = FBUpdatePolicy$DeploymentType.BasicDeployment;
        aVar.requests.add(fBSimpleTplInfo);
        throw null;
    }
}
