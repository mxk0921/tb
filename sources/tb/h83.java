package tb;

import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.subservice.framework.IHostService;
import com.taobao.infoflow.protocol.subservice.framework.IMainFeedsViewService;
import com.taobao.informationflowdataservice.dataservice.core.datasource.model.card.SectionModel;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class h83 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(491782863);
    }

    public static int a(List<SectionModel> list) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("24ed6f8", new Object[]{list})).intValue();
        }
        if (list == null) {
            fve.e("CardFinder", "findSliderDataPosition->  originalDataSet == null");
            return -1;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            SectionModel sectionModel = list.get(i);
            if (!(sectionModel == null || (jSONObject = sectionModel.getJSONObject("ext")) == null || !jSONObject.getBooleanValue("isBannerCard"))) {
                return i;
            }
        }
        return -1;
    }

    public static boolean b(cfc cfcVar, IMainFeedsViewService<?> iMainFeedsViewService, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2f0355be", new Object[]{cfcVar, iMainFeedsViewService, new Integer(i)})).booleanValue();
        }
        View findItemViewByPosition = iMainFeedsViewService.findItemViewByPosition(i);
        if (findItemViewByPosition == null) {
            fve.e("CardFinder", "view is null");
            return false;
        }
        IHostService iHostService = (IHostService) cfcVar.a(IHostService.class);
        if (iHostService == null) {
            fve.e("CardFinder", "hostService is null");
            return false;
        }
        czc i2 = iHostService.getInvokeCallback().i();
        if (i2 == null) {
            fve.e("CardFinder", "naviBarCallback is null");
            return false;
        }
        float c = i2.c();
        if (c < 0.0f) {
            fve.e("CardFinder", "searchBarHeight < 0 , searchBarHeight : " + c);
            return false;
        }
        int[] iArr = new int[2];
        findItemViewByPosition.getLocationInWindow(iArr);
        return ((float) iArr[1]) > c;
    }
}
