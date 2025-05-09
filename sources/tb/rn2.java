package tb;

import com.alibaba.android.ultron.vfw.instance.a;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class rn2 extends bx6 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(157286660);
    }

    public rn2(a.h hVar) {
        super(hVar);
    }

    public static /* synthetic */ Object ipc$super(rn2 rn2Var, String str, Object... objArr) {
        if (str.hashCode() == 2145607250) {
            super.a((List) objArr[0], (et6) objArr[1], (u55) objArr[2]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/ultron/vfw/instance/strategy/BundleLineDataProcessStrategy");
    }

    @Override // tb.bx6, com.alibaba.android.ultron.vfw.instance.a.h
    public void a(List<IDMComponent> list, et6 et6Var, u55 u55Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7fe35e52", new Object[]{this, list, et6Var, u55Var});
            return;
        }
        super.a(list, et6Var, u55Var);
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (IDMComponent iDMComponent : et6Var.c()) {
                if (!(iDMComponent == null || iDMComponent.getFields() == null)) {
                    as6.a(iDMComponent, arrayList);
                }
            }
            et6Var.l(arrayList);
        }
    }
}
