package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class nex {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_SECTION_TYPE = "sectionType";
    public static final String TYPE_WIND_VANE_CARD = "windvaneCard";

    static {
        t2o.a(487588008);
    }

    public static boolean a(BaseSectionModel<?> baseSectionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("26f56c97", new Object[]{baseSectionModel})).booleanValue();
        }
        if (baseSectionModel == null) {
            return false;
        }
        JSONObject ext = baseSectionModel.getExt();
        return (ext != null && TextUtils.equals(ext.getString(KEY_SECTION_TYPE), TYPE_WIND_VANE_CARD)) || (baseSectionModel.getSubSection() != null && baseSectionModel.getSubSection().getWindvaneOverlay() != null);
    }
}
