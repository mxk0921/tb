package com.taobao.tao.topmultitab.service.data;

import com.taobao.tao.topmultitab.service.base.IHomePageService;
import tb.hqk;
import tb.rtk;
import tb.rvk;
import tb.z9c;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public interface IHomeDataService extends IHomePageService {
    public static final String SERVICE_NAME = "HomeDataService";

    void addDataProcessListener(hqk hqkVar);

    void addOnRequestListener(rtk rtkVar);

    void addOnUiRefreshListener(rvk rvkVar);

    Object getExternalDataByKey(String str, String str2);

    z9c getGlobalExtModel();

    void removeDataProcessListener(hqk hqkVar);

    void removeOnRequestListener(rtk rtkVar);

    void removeOnUiRefreshListener(rvk rvkVar);
}
