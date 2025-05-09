package com.taobao.tao.linklog;

import com.alibaba.android.umbrella.link.export.UMDimKey;
import java.io.Serializable;
import java.util.Map;
import tb.ayu;
import tb.cyu;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public interface ILinkLogAdapter extends Serializable {
    void commitFailure(String str, String str2, String str3, String str4, String str5, Map<String, String> map, String str6, String str7);

    void commitSuccess(String str, String str2, String str3, String str4, String str5, Map<String, String> map);

    ayu createLinkId(String str);

    void logError(String str, String str2, String str3, ayu ayuVar, String str4, String str5, Map<UMDimKey, Object> map, cyu cyuVar);

    void logInfo(String str, String str2, String str3, ayu ayuVar, Map<UMDimKey, Object> map, cyu cyuVar);
}
