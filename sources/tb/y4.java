package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taopai.business.project.Project;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class y4 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public vd4 f31837a;
    public Project b;

    static {
        t2o.a(511705105);
    }

    public y4(vd4 vd4Var, Project project) {
        a(vd4Var, project);
    }

    public void a(vd4 vd4Var, Project project) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("defe0463", new Object[]{this, vd4Var, project});
            return;
        }
        this.f31837a = vd4Var;
        this.b = project;
    }

    public void b(boolean z) {
        Project project;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("183c4dc8", new Object[]{this, new Boolean(z)});
            return;
        }
        vd4 vd4Var = this.f31837a;
        if (vd4Var != null && (project = this.b) != null) {
            q0n.n(vd4Var, project, z);
        }
    }
}
