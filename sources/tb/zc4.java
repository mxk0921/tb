package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class zc4 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(83886310);
    }

    public static List<IDMComponent> a(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("de840806", new Object[]{iDMComponent});
        }
        if (iDMComponent == null || iDMComponent.getChildren() == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (IDMComponent iDMComponent2 : iDMComponent.getChildren()) {
            if (iDMComponent2 != null) {
                arrayList.add(iDMComponent2);
                List<IDMComponent> a2 = a(iDMComponent2);
                if (a2 != null) {
                    arrayList.addAll(a2);
                }
            }
        }
        return arrayList;
    }
}
