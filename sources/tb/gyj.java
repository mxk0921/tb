package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.core.utils.lang3.ObjectUtils;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerInnerDataModel;
import com.taobao.tao.recommend4.recyclerview.RecommendViewPreloadListener;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class gyj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(491782431);
    }

    public static boolean a(IContainerDataModel<?> iContainerDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2ae1316d", new Object[]{iContainerDataModel})).booleanValue();
        }
        boolean a2 = mve.a("enableDefaultOpenNDInstant", true);
        if (iContainerDataModel == null) {
            fve.e("NewDetailPreLoaderSwitch", "enablePreLoadNewDetail containerDataModel is null");
            return a2;
        }
        JSONObject c = c(iContainerDataModel);
        if (ObjectUtils.c(c)) {
            fve.e("NewDetailPreLoaderSwitch", "enablePreLoadNewDetail homeGlobalAbTest is null");
            return a2;
        } else if (c.getBoolean(RecommendViewPreloadListener.KEY_ENABLE_PRE_LOAD_NEW_DETAIL) == null) {
            return a2;
        } else {
            return c.getBooleanValue(RecommendViewPreloadListener.KEY_ENABLE_PRE_LOAD_NEW_DETAIL);
        }
    }

    public static String b(IContainerDataModel<?> iContainerDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("afdbbdac", new Object[]{iContainerDataModel});
        }
        JSONObject c = c(iContainerDataModel);
        if (!ObjectUtils.c(c)) {
            return c.getString("bucket");
        }
        fve.e("NewDetailPreLoaderSwitch", "getBucket homeGlobalAbTest is null");
        return null;
    }

    public static JSONObject c(IContainerDataModel<?> iContainerDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("91e03649", new Object[]{iContainerDataModel});
        }
        if (iContainerDataModel == null) {
            fve.e("NewDetailPreLoaderSwitch", "containerDataModel == null");
            return null;
        }
        IContainerInnerDataModel<?> base = iContainerDataModel.getBase();
        if (base == null) {
            fve.e("NewDetailPreLoaderSwitch", "baseData == null");
            return null;
        }
        JSONObject ext = base.getExt();
        if (ext != null) {
            return ext.getJSONObject("homeGlobalABTest");
        }
        fve.e("NewDetailPreLoaderSwitch", "ext == null");
        return null;
    }
}
