package com.taobao.infoflow.protocol.subservice.biz.afterbuy;

import com.taobao.infoflow.protocol.model.datamodel.response.IBizDataModel;
import com.taobao.infoflow.protocol.subservice.ISubService;
import com.taobao.infoflow.protocol.subservice.biz.afterbuy.IAddViewCallbackService;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public interface IOrderListPrefetchService extends ISubService {
    public static final String NEED_APPEND_BIZ_PARAMS = "needAppendBizParams";
    public static final String NEED_SAVE_BIZ_PARAMS = "needSaveBizParams";
    public static final String SERVICE_NAME = "IOrderListPrefetchService";

    void consumePrefetchData(int i, IAddViewCallbackService.a aVar);

    IBizDataModel getPrefetchDataModel();

    boolean hasSwitchTab();

    void realOrderListPrefetch();

    void resetSwitchTabStatus();

    void savePrefetchData(IBizDataModel iBizDataModel);
}
