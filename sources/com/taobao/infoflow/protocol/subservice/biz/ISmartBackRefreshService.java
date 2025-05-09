package com.taobao.infoflow.protocol.subservice.biz;

import com.taobao.infoflow.protocol.subservice.ISubService;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public interface ISmartBackRefreshService extends ISubService {
    public static final String SERVICE_NAME = "ISearchBackSmartRefreshService";

    boolean enableBaseRefresh();

    boolean enableIpvBackRefresh();

    boolean enableNormalBackRefresh();

    boolean enableOutLinkBackRefresh();

    boolean enableOutLinkLockPosition();

    boolean enablePaySuccessBackRefresh();

    boolean enableSearchBackRefresh();

    boolean enableSearchClickCheck();

    String getFirstCompletelyVisibleBizCode();

    String[] getOutLinkItemIdKey();

    boolean isBackgroundToFront();

    boolean isCurrentRefreshByOutLink();

    boolean isDirectClickInInfoFlow();

    boolean isDirectClickInInfoFlowForCommon();

    void resetCommonStatus();

    void resetStatus();

    void setDirectClickInInfoFlow(boolean z);

    void setRequestWithBxFeature(boolean z);
}
