package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.subservice.biz.IFirstScreenDataService;
import com.taobao.infoflow.protocol.subservice.framework.IMainFeedsViewService;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class lnn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(486539734);
    }

    public static String a(cfc cfcVar) {
        JSONObject firstScreenExt;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("13df562a", new Object[]{cfcVar});
        }
        IFirstScreenDataService iFirstScreenDataService = (IFirstScreenDataService) cfcVar.a(IFirstScreenDataService.class);
        if (iFirstScreenDataService == null || (firstScreenExt = iFirstScreenDataService.getFirstScreenExt()) == null) {
            return null;
        }
        return firstScreenExt.getString("feedsStartSectionBizCode");
    }

    public static int b(cfc cfcVar) {
        IFirstScreenDataService iFirstScreenDataService;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ed2a47f7", new Object[]{cfcVar})).intValue();
        }
        String a2 = a(cfcVar);
        if (TextUtils.isEmpty(a2)) {
            return -1;
        }
        int c = c(cfcVar, a2);
        if (c != -1 || (iFirstScreenDataService = (IFirstScreenDataService) cfcVar.a(IFirstScreenDataService.class)) == null) {
            return c;
        }
        fve.e("RecommendFirstCardFinder", "未找到首卡，使用首屏服务记录的首卡位置");
        return iFirstScreenDataService.getRecStartIndex();
    }

    public static int c(cfc cfcVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5b96f8c1", new Object[]{cfcVar, str})).intValue();
        }
        IMainFeedsViewService iMainFeedsViewService = (IMainFeedsViewService) cfcVar.a(IMainFeedsViewService.class);
        if (iMainFeedsViewService == null) {
            return -1;
        }
        return iMainFeedsViewService.getPositionBySectionBizCode(str);
    }
}
