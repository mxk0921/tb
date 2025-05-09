package tb;

import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.datamodel.render.AURARenderComponentData;
import com.alibaba.android.aura.service.render.layout.AURARenderContainerAdapter;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class cj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(80740615);
    }

    public static void a(RecyclerView.ViewHolder viewHolder) {
        AURARenderComponent d0;
        AURARenderComponentData aURARenderComponentData;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69dffa15", new Object[]{viewHolder});
        } else if ((viewHolder instanceof AURARenderContainerAdapter.AURAContainerViewHolder) && (d0 = ((AURARenderContainerAdapter.AURAContainerViewHolder) viewHolder).d0()) != null && (aURARenderComponentData = d0.data) != null) {
            Map map = aURARenderComponentData.fields;
            if (map == null) {
                map = new HashMap();
            }
            map.put("asyncStatus", "init");
        }
    }
}
