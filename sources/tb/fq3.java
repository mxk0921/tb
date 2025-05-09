package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.android.ultron.common.utils.UnifyLog;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class fq3 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(479199574);
    }

    public static void b(zxb zxbVar, fsb fsbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e69d6741", new Object[]{zxbVar, fsbVar});
        } else {
            a(fsbVar);
        }
    }

    public static boolean a(fsb fsbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2f9249da", new Object[]{fsbVar})).booleanValue();
        }
        if (fsbVar == null) {
            return false;
        }
        u55 u55Var = (u55) fsbVar;
        List<IDMComponent> components = fsbVar.getComponents();
        if (components != null && !components.isEmpty()) {
            return true;
        }
        UnifyLog.m(c9x.CART_BIZ_NAME, "CheckDataUtils", "NotFoundAnyComponent", "structure=" + u55Var.M());
        UnifyLog.m(c9x.CART_BIZ_NAME, "CheckDataUtils", "NotFoundAnyComponent", "data=" + u55Var.r());
        UnifyLog.m(c9x.CART_BIZ_NAME, "CheckDataUtils", "NotFoundAnyComponent", "componentMap=" + u55Var.p());
        lbq.a(c9x.CART_BIZ_NAME, "dataIntegrality", "NotFoundAnyComponent", "未发现任何组件");
        return false;
    }
}
