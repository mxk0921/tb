package tb;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.datamodel.render.AURARenderComponentData;
import com.alibaba.android.aura.datamodel.render.AURARenderComponentLayout;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class sn0 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(301990078);
    }

    public static int a(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7b4c9037", new Object[]{recyclerView})).intValue();
        }
        if (recyclerView == null) {
            return -1;
        }
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (!(layoutManager instanceof LinearLayoutManager)) {
            return -1;
        }
        return ((LinearLayoutManager) layoutManager).findLastVisibleItemPosition();
    }

    public static int b(List<AURARenderComponent> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b5e0d4f4", new Object[]{list})).intValue();
        }
        if (bh.a(list)) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            if (c(list.get(i2))) {
                i++;
            }
        }
        return i;
    }

    public static boolean c(AURARenderComponent aURARenderComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3bd83f0d", new Object[]{aURARenderComponent})).booleanValue();
        }
        if (aURARenderComponent == null) {
            return false;
        }
        if (d(aURARenderComponent) || e(aURARenderComponent)) {
            return true;
        }
        AURARenderComponent aURARenderComponent2 = aURARenderComponent.parent;
        if (aURARenderComponent2 == null) {
            return false;
        }
        return c(aURARenderComponent2);
    }

    public static boolean d(AURARenderComponent aURARenderComponent) {
        AURARenderComponentData aURARenderComponentData;
        Map<String, Object> map;
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("50717a2d", new Object[]{aURARenderComponent})).booleanValue();
        }
        if (aURARenderComponent == null || (aURARenderComponentData = aURARenderComponent.data) == null || (map = aURARenderComponentData.fields) == null || (obj = map.get("isFloat")) == null) {
            return false;
        }
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        }
        if (obj instanceof String) {
            return Boolean.parseBoolean((String) obj);
        }
        return false;
    }

    public static boolean e(AURARenderComponent aURARenderComponent) {
        AURARenderComponentData aURARenderComponentData;
        AURARenderComponentLayout aURARenderComponentLayout;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f0f6bd0e", new Object[]{aURARenderComponent})).booleanValue();
        }
        return (aURARenderComponent == null || (aURARenderComponentData = aURARenderComponent.data) == null || (aURARenderComponentLayout = aURARenderComponentData.layout) == null || !"sticky".equalsIgnoreCase(aURARenderComponentLayout.type)) ? false : true;
    }
}
