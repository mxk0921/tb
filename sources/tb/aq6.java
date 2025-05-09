package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.core.subservice.framework.container.mainfeeds.recycleview.adapter.RecycleViewHolder;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class aq6 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(486539669);
    }

    public static void a(BaseSectionModel<?> baseSectionModel) {
        JSONObject ext;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e763ecc", new Object[]{baseSectionModel});
        } else if (baseSectionModel != null && (ext = baseSectionModel.getExt()) != null) {
            ext.put("nativeForceBindData", (Object) "1");
        }
    }

    public static void b(BaseSectionModel<?> baseSectionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b0a3d94", new Object[]{baseSectionModel});
            return;
        }
        JSONObject ext = baseSectionModel.getExt();
        if (ext != null) {
            ext.remove("nativeForceBindData");
        }
    }

    public static boolean c(BaseSectionModel<?> baseSectionModel, RecycleViewHolder recycleViewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7169e2d2", new Object[]{baseSectionModel, recycleViewHolder})).booleanValue();
        }
        if (recycleViewHolder.getData() != baseSectionModel) {
            return true;
        }
        JSONObject ext = baseSectionModel.getExt();
        return ext != null && ext.containsKey("nativeForceBindData");
    }
}
