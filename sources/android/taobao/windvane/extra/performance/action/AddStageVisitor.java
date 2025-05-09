package android.taobao.windvane.extra.performance.action;

import com.android.alibaba.ip.runtime.IpChange;
import tb.cce;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class AddStageVisitor implements IPerformanceVisitor {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final String name;
    public long upTime;

    static {
        t2o.a(989856001);
        t2o.a(989856002);
    }

    public AddStageVisitor(String str, long j) {
        this.name = str;
        this.upTime = j;
    }

    @Override // android.taobao.windvane.extra.performance.action.IPerformanceVisitor
    public void accept(cce cceVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("987066e1", new Object[]{this, cceVar});
        } else {
            cceVar.onStage(this.name, this.upTime);
        }
    }
}
