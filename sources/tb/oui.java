package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.core.utils.lang3.ObjectUtils;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import java.util.Collection;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class oui {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(491782672);
    }

    public static JSONObject a(BaseSectionModel<?> baseSectionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("d5009762", new Object[]{baseSectionModel});
        }
        if (baseSectionModel == null) {
            return null;
        }
        try {
            return baseSectionModel.getExt().getJSONObject("miniAppConfig");
        } catch (Throwable th) {
            fve.c("MiniAppConfigFinder", "findMiniAppConfig json 获取异常 ：" + th.getMessage(), th);
            return null;
        }
    }

    public static JSONObject b(Collection<BaseSectionModel<?>> collection) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("af12514b", new Object[]{collection});
        }
        JSONObject jSONObject = null;
        if (collection == null || collection.isEmpty()) {
            fve.e("MiniAppConfigFinder", "sections is empty");
            return null;
        }
        for (BaseSectionModel<?> baseSectionModel : collection) {
            jSONObject = a(baseSectionModel);
            if (!ObjectUtils.c(jSONObject)) {
                break;
            }
        }
        return jSONObject;
    }
}
