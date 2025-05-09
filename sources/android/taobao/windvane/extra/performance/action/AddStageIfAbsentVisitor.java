package android.taobao.windvane.extra.performance.action;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.cce;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class AddStageIfAbsentVisitor extends AddStageVisitor {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(989856000);
    }

    public AddStageIfAbsentVisitor(String str, long j) {
        super(str, j);
    }

    public static /* synthetic */ Object ipc$super(AddStageIfAbsentVisitor addStageIfAbsentVisitor, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in android/taobao/windvane/extra/performance/action/AddStageIfAbsentVisitor");
    }

    @Override // android.taobao.windvane.extra.performance.action.AddStageVisitor, android.taobao.windvane.extra.performance.action.IPerformanceVisitor
    public void accept(cce cceVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("987066e1", new Object[]{this, cceVar});
        } else {
            cceVar.onStageIfAbsent(this.name, this.upTime);
        }
    }
}
