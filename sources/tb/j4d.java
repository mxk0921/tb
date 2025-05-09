package tb;

import com.taobao.infoflow.protocol.model.datamodel.response.IBizDataModel;
import com.taobao.infoflow.protocol.subservice.biz.afterbuy.IAddViewCallbackService;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public interface j4d {
    void consumePrefetchData(int i, IAddViewCallbackService.a aVar);

    IBizDataModel getPrefetchDataModel();

    boolean hasSwitchTab();

    void realOrderListPrefetch();

    void resetSwitchTabStatus();
}
