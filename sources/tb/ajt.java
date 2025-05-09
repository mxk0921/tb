package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class ajt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(157286574);
    }

    public static DXTemplateItem a(o58 o58Var) {
        long j;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXTemplateItem) ipChange.ipc$dispatch("670e04f1", new Object[]{o58Var});
        }
        DXTemplateItem dXTemplateItem = new DXTemplateItem();
        if (o58Var == null) {
            return dXTemplateItem;
        }
        dXTemplateItem.f7343a = o58Var.c;
        try {
            j = Long.parseLong(o58Var.e);
        } catch (NumberFormatException unused) {
            j = -1;
        }
        dXTemplateItem.b = j;
        dXTemplateItem.c = o58Var.d;
        return dXTemplateItem;
    }

    public static o58 b(DXTemplateItem dXTemplateItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (o58) ipChange.ipc$dispatch("75292633", new Object[]{dXTemplateItem});
        }
        o58 o58Var = new o58();
        if (dXTemplateItem == null) {
            return o58Var;
        }
        o58Var.c = dXTemplateItem.f7343a;
        o58Var.e = String.valueOf(dXTemplateItem.b);
        o58Var.d = dXTemplateItem.c;
        return o58Var;
    }

    public static ArrayList<o58> c(List<DXTemplateItem> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("f65139fb", new Object[]{list});
        }
        ArrayList<o58> arrayList = new ArrayList<>();
        if (!(list == null || list.size() == 0)) {
            for (DXTemplateItem dXTemplateItem : list) {
                arrayList.add(b(dXTemplateItem));
            }
        }
        return arrayList;
    }
}
