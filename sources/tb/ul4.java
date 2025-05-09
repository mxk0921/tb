package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerInnerDataModel;
import com.taobao.infoflow.protocol.subservice.framework.IContainerDataService;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class ul4 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(486539735);
    }

    public static JSONObject a(cfc cfcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("874b0e5f", new Object[]{cfcVar});
        }
        IContainerDataService iContainerDataService = (IContainerDataService) cfcVar.a(IContainerDataService.class);
        if (iContainerDataService == null) {
            fve.e("ContainerDataUtils", "dataService == null");
            return null;
        }
        IContainerDataModel containerData = iContainerDataService.getContainerData();
        if (containerData == null) {
            fve.e("ContainerDataUtils", "containerDataModel == null");
            return null;
        }
        IContainerInnerDataModel base = containerData.getBase();
        if (base != null) {
            return base.getExt();
        }
        fve.e("ContainerDataUtils", "baseData == null");
        return null;
    }

    public static int b(IContainerDataModel<?> iContainerDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5fef0813", new Object[]{iContainerDataModel})).intValue();
        }
        if (iContainerDataModel == null || iContainerDataModel.getBase() == null || iContainerDataModel.getBase().getPageParams() == null) {
            return -1;
        }
        return iContainerDataModel.getBase().getPageParams().getPageNum();
    }

    public static JSONObject c(cfc cfcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("61dff04e", new Object[]{cfcVar});
        }
        JSONObject a2 = a(cfcVar);
        if (a2 != null) {
            return a2.getJSONObject("homeGlobalABTest");
        }
        fve.e("ContainerDataUtils", "ext == null");
        return null;
    }

    public static List<BaseSectionModel> d(cfc cfcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("e2d6aa", new Object[]{cfcVar});
        }
        IContainerDataService iContainerDataService = (IContainerDataService) cfcVar.a(IContainerDataService.class);
        if (iContainerDataService == null) {
            fve.e("ContainerDataUtils", "containerDataService == null");
            return null;
        }
        IContainerDataModel containerData = iContainerDataService.getContainerData();
        if (containerData != null) {
            return containerData.getTotalData();
        }
        fve.e("ContainerDataUtils", "containerData == null");
        return null;
    }

    public static boolean e(cfc cfcVar) {
        IContainerDataModel containerData;
        IContainerInnerDataModel base;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f2ea029d", new Object[]{cfcVar})).booleanValue();
        }
        IContainerDataService iContainerDataService = (IContainerDataService) cfcVar.a(IContainerDataService.class);
        if (iContainerDataService == null || (containerData = iContainerDataService.getContainerData()) == null || (base = containerData.getBase()) == null) {
            return false;
        }
        return base.isAbandoned();
    }

    public static boolean f(IContainerDataModel<?> iContainerDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("64b466", new Object[]{iContainerDataModel})).booleanValue();
        }
        if (b(iContainerDataModel) == 0) {
            return true;
        }
        return false;
    }

    public static boolean g(IContainerDataModel<?> iContainerDataModel) {
        IContainerInnerDataModel<?> base;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e3cf713e", new Object[]{iContainerDataModel})).booleanValue();
        }
        if (iContainerDataModel == null || (base = iContainerDataModel.getBase()) == null) {
            return false;
        }
        return base.isRemote();
    }
}
