package tb;

import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.datamodel.render.AURARenderComponentContainer;
import com.alibaba.android.aura.datamodel.render.AURARenderComponentData;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class vwu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(80740543);
    }

    public static DXTemplateItem a(AURARenderComponent aURARenderComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXTemplateItem) ipChange.ipc$dispatch("70a6e81e", new Object[]{aURARenderComponent});
        }
        AURARenderComponentData aURARenderComponentData = aURARenderComponent.data;
        if (aURARenderComponentData == null) {
            return null;
        }
        return b(aURARenderComponentData.container);
    }

    public static DXTemplateItem b(AURARenderComponentContainer aURARenderComponentContainer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXTemplateItem) ipChange.ipc$dispatch("a011b811", new Object[]{aURARenderComponentContainer});
        }
        if (aURARenderComponentContainer == null || !dm.f17906a.equals(aURARenderComponentContainer.containerType)) {
            return null;
        }
        DXTemplateItem dXTemplateItem = new DXTemplateItem();
        dXTemplateItem.f7343a = aURARenderComponentContainer.name;
        dXTemplateItem.c = aURARenderComponentContainer.url;
        dXTemplateItem.f = aURARenderComponentContainer.isPreset;
        try {
            dXTemplateItem.b = Long.parseLong(aURARenderComponentContainer.version);
        } catch (NumberFormatException e) {
            dXTemplateItem.b = 1L;
            ck.g().b("UMFDXTemplateItemConverter", "convert", e.getMessage());
        }
        return dXTemplateItem;
    }

    public static List<DXTemplateItem> c(List<AURARenderComponent> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("690a7d3c", new Object[]{list});
        }
        ArrayList arrayList = null;
        for (AURARenderComponent aURARenderComponent : list) {
            DXTemplateItem a2 = a(aURARenderComponent);
            if (a2 != null) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(a2);
            }
        }
        return arrayList;
    }
}
