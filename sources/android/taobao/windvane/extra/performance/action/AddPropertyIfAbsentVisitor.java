package android.taobao.windvane.extra.performance.action;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.cce;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class AddPropertyIfAbsentVisitor extends AddPropertyVisitor {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(989855998);
    }

    public AddPropertyIfAbsentVisitor(String str, Object obj) {
        super(str, obj);
    }

    public static /* synthetic */ Object ipc$super(AddPropertyIfAbsentVisitor addPropertyIfAbsentVisitor, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in android/taobao/windvane/extra/performance/action/AddPropertyIfAbsentVisitor");
    }

    @Override // android.taobao.windvane.extra.performance.action.AddPropertyVisitor, android.taobao.windvane.extra.performance.action.IPerformanceVisitor
    public void accept(cce cceVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("987066e1", new Object[]{this, cceVar});
        } else {
            cceVar.onPropertyIfAbsent(this.name, this.value);
        }
    }
}
