package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.subservice.ISubService;
import com.taobao.infoflow.taobao.subservice.base.configservice.TbHomeConfigService;
import com.taobao.infoflow.taobao.subservice.base.jsbridgeservice.JsBridgeServiceImpl;
import com.taobao.infoflow.taobao.subservice.biz.aiservice.impl.AiServiceImpl;
import com.taobao.infoflow.taobao.subservice.biz.cachereqbizparamsservice.CacheReqBizParamsServiceImpl;
import com.taobao.infoflow.taobao.subservice.biz.screenshotservice.ScreenShotServiceImpl;
import com.taobao.infoflow.taobao.subservice.biz.sharedataservice.SharedDataServiceImpl;
import com.taobao.infoflow.taobao.subservice.biz.smartrtservice.SmartRtService;
import com.taobao.infoflow.taobao.subservice.biz.videoplaycontrollerservice.VideoPlayControllerServiceImpl;
import com.taobao.infoflow.taobao.subservice.framework.greyfilterservice.GreyFilterServiceImpl;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class mgt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(491782634);
    }

    public static List<ISubService> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("115fb90", new Object[0]);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new TbHomeConfigService());
        arrayList.add(new JsBridgeServiceImpl());
        arrayList.add(new SharedDataServiceImpl());
        arrayList.add(new CacheReqBizParamsServiceImpl());
        arrayList.add(new SmartRtService());
        if (!cve.b()) {
            arrayList.add(new AiServiceImpl());
            arrayList.add(new VideoPlayControllerServiceImpl());
        }
        arrayList.add(new GreyFilterServiceImpl());
        arrayList.add(new ScreenShotServiceImpl());
        return arrayList;
    }
}
