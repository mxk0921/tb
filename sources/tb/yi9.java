package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.core.exception.InfoFlowRuntimeException;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseItemModel;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSubItemModel;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSubSectionModel;
import com.taobao.infoflow.protocol.subservice.framework.IContainerDataService;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class yi9 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final IContainerDataService<?> f32112a;

    static {
        t2o.a(491782661);
    }

    public yi9(IContainerDataService<?> iContainerDataService) {
        this.f32112a = iContainerDataService;
    }

    public final JSONObject a(BaseSectionModel<?> baseSectionModel, String str, String str2) {
        JSONObject a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("26aa58b4", new Object[]{this, baseSectionModel, str, str2});
        }
        if (baseSectionModel == null) {
            return null;
        }
        JSONObject c = c(baseSectionModel, str, str2);
        if (c != null) {
            return c;
        }
        BaseSubSectionModel subSection = baseSectionModel.getSubSection();
        if (subSection == null) {
            return null;
        }
        for (Object obj : subSection.values()) {
            if ((obj instanceof JSONObject) && (a2 = a(this.f32112a.createBaseSectionModel((JSONObject) obj), str, str2)) != null) {
                return a2;
            }
        }
        return null;
    }

    public JSONObject b(BaseSectionModel<?> baseSectionModel, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("7e7e3f9a", new Object[]{this, baseSectionModel, str, str2});
        }
        try {
            return a(baseSectionModel, str, str2);
        } catch (InfoFlowRuntimeException e) {
            fve.e("FindSmartContentInfoHandler", "findSmartContentInfo error. " + e.getMessage());
            return null;
        }
    }

    public final JSONObject c(BaseSectionModel<?> baseSectionModel, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("77a877a", new Object[]{this, baseSectionModel, str, str2});
        }
        BaseItemModel item = baseSectionModel.getItem();
        if (item == null) {
            return null;
        }
        int itemCount = item.getItemCount();
        for (int i = 0; i < itemCount; i++) {
            JSONObject d = d(item.getBaseItemModel(i), str, str2);
            if (d != null) {
                return d;
            }
        }
        return null;
    }

    public final JSONObject d(BaseSubItemModel baseSubItemModel, String str, String str2) {
        JSONObject smartContent;
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("e7c49735", new Object[]{this, baseSubItemModel, str, str2});
        }
        if (baseSubItemModel == null || (smartContent = baseSubItemModel.getSmartContent()) == null || (jSONObject = smartContent.getJSONObject(str)) == null || !TextUtils.equals(str2, jSONObject.getString("id"))) {
            return null;
        }
        return jSONObject;
    }
}
