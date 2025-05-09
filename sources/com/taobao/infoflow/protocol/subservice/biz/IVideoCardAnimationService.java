package com.taobao.infoflow.protocol.subservice.biz;

import com.alibaba.fastjson.JSONObject;
import com.taobao.infoflow.protocol.subservice.ISubService;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public interface IVideoCardAnimationService extends ISubService {
    public static final String SERVICE_NAME = "VideoCardAnimationService";

    boolean enableShow();

    float getAspectRatio();

    JSONObject getExposureParam();

    String getFirstFrameImagePath();

    String getLocalVideoPath();

    int getTimeOut();

    boolean isMeasureSuccess();

    boolean pageBackRefreshChildView();

    boolean pageBackRefreshRootView();

    void recordFatigue(String str);

    void setMeasureState(boolean z);

    void updatePageBackChildViewRefreshState(boolean z);

    void updatePageBackRootViewRefreshState(boolean z);
}
