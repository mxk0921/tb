package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.datamodel.imp.DMComponent;
import com.taobao.android.ultron.datamodel.imp.ExtendBlock;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class db4 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(614465626);
    }

    public static boolean a(u55 u55Var) {
        Map<String, ExtendBlock> y;
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e318fd44", new Object[]{u55Var})).booleanValue();
        }
        if (u55Var == null || (y = u55Var.y()) == null) {
            return false;
        }
        Collection<ExtendBlock> values = y.values();
        if (values != null && !values.isEmpty()) {
            Iterator<ExtendBlock> it = values.iterator();
            if (it == null) {
                return false;
            }
            while (true) {
                if (!it.hasNext()) {
                    z = true;
                    break;
                }
                ExtendBlock next = it.next();
                if (next != null && next.getExtendBlock() != null && !((DMComponent) next.getExtendBlock()).hasMore()) {
                    break;
                }
            }
            kor.a("ComponentBizUtils", "hasMore", "hasMore = " + z);
        }
        return z;
    }
}
