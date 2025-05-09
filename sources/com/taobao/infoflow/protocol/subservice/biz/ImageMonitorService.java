package com.taobao.infoflow.protocol.subservice.biz;

import com.taobao.infoflow.protocol.model.datamodel.response.IContainerInnerDataModel;
import com.taobao.infoflow.protocol.subservice.ISubService;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public interface ImageMonitorService extends ISubService {
    public static final String SERVICE_NAME = "ImageMonitorService";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public interface a {
        void a(boolean z);
    }

    void addImageLoadListener(a aVar);

    int getImageCount(boolean z);

    long getImageLoadTimestamp(boolean z);

    boolean isNeedMonitor(String str);

    boolean isStarted();

    void onImageViewDraw(String str);

    void registerFirstPageUrls(IContainerInnerDataModel<?> iContainerInnerDataModel);

    void removeImageLoadListener(a aVar);
}
