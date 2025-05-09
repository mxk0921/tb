package tb;

import com.alibaba.android.icart.core.data.DataBizContext;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class cd3 extends lmb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(479199397);
    }

    public static /* synthetic */ Object ipc$super(cd3 cd3Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/icart/core/event/CartRecommendItemClickSubscriber");
    }

    @Override // tb.l12
    public void j(lcu lcuVar) {
        Object obj;
        List<String> items;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fbad8af", new Object[]{this, lcuVar});
            return;
        }
        Object[] objArr = (Object[]) lcuVar.e("extraParams");
        if (!(objArr == null || objArr.length < 2 || (obj = objArr[1]) == null)) {
            String obj2 = obj.toString();
            ArrayList arrayList = new ArrayList();
            IDMComponent componentByName = this.d.getComponentByName(obj2);
            if (componentByName != null) {
                List<IDMComponent> D = cb4.D(componentByName, this.j);
                if (!D.isEmpty()) {
                    for (IDMComponent iDMComponent : D) {
                        arrayList.add(iDMComponent.getKey());
                    }
                }
            }
            DataBizContext.CartGroupContext h = this.k.B().h();
            if (!(h == null || (items = h.getItems()) == null)) {
                boolean contains = items.contains(obj2);
                boolean z = !contains;
                if (!contains) {
                    if (arrayList.isEmpty()) {
                        items.add(0, obj2);
                    } else {
                        items.addAll(0, arrayList);
                    }
                } else if (arrayList.isEmpty()) {
                    items.remove(obj2);
                } else {
                    items.removeAll(arrayList);
                }
                this.j.e().B0();
                boolean z2 = !"groupSelectedItems".equals(this.e.getTag());
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < items.size(); i++) {
                    IDMComponent componentByName2 = this.k.c().getComponentByName(items.get(i));
                    if (componentByName2 != null) {
                        sb.append(componentByName2.getFields().getString("itemId"));
                        sb.append("#");
                    }
                }
                if (sb.toString().endsWith("#")) {
                    sb.delete(sb.length() - 1, sb.length());
                }
                String sb2 = sb.toString();
                juv.b(this.j, "Page_ShoppingCart_RecommendItem_Click", "isChecked=" + z, "isItemClick=" + z2, "checkedItemIds=" + sb2);
            }
        }
    }
}
