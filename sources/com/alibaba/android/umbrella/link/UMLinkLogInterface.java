package com.alibaba.android.umbrella.link;

import com.alibaba.android.umbrella.link.export.TraceLogEventType;
import com.alibaba.android.umbrella.link.export.UMDimKey;
import com.alibaba.android.umbrella.link.export.UMTagKey;
import com.alibaba.android.umbrella.link.export.UmTypeKey;
import java.util.Map;
import tb.ayu;
import tb.cyu;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public interface UMLinkLogInterface {
    void commitFailure(String str, String str2, String str3, String str4, String str5, Map<String, String> map, String str6, String str7);

    void commitFeedback(String str, String str2, UmTypeKey umTypeKey, String str3, String str4);

    void commitSuccess(String str, String str2, String str3, String str4, String str5, Map<String, String> map);

    ayu createLinkId(String str);

    void logBegin(String str, String str2, String str3, ayu ayuVar, Map<UMDimKey, Object> map, cyu cyuVar);

    void logEnd(String str, String str2, String str3, ayu ayuVar, String str4, String str5, Map<UMDimKey, Object> map, cyu cyuVar);

    void logError(String str, String str2, String str3, ayu ayuVar, String str4, String str5, Map<UMDimKey, Object> map, cyu cyuVar);

    void logErrorRawDim(String str, String str2, String str3, ayu ayuVar, String str4, String str5, Map<String, Object> map, cyu cyuVar);

    void logInfo(String str, String str2, String str3, ayu ayuVar, Map<UMDimKey, Object> map, cyu cyuVar);

    void logInfoRawDim(String str, String str2, String str3, ayu ayuVar, Map<String, Object> map, cyu cyuVar);

    void logMtopReq(String str, String str2, ayu ayuVar, String str3, String str4, String str5, Map<UMTagKey, String> map, cyu cyuVar);

    void logMtopResponse(String str, String str2, ayu ayuVar, Object obj, String str3, Map<UMTagKey, String> map, cyu cyuVar);

    void logPageLifecycle(String str, String str2, ayu ayuVar, int i, int i2, String str3, String str4, Map<UMTagKey, String> map, cyu cyuVar);

    void logPageLifecycle2(String str, String str2, ayu ayuVar, String str3, String str4, String str5, String str6, Map<UMTagKey, String> map, cyu cyuVar);

    void logSimpleInfo(String str, String str2, String str3, String str4);

    @Deprecated
    void logUIAction(String str, String str2, ayu ayuVar, int i, String str3, String str4, String str5, Map<UMTagKey, String> map, cyu cyuVar);

    void logUIAction2(String str, String str2, ayu ayuVar, int i, String str3, String str4, String str5, String str6, Map<UMTagKey, String> map, cyu cyuVar);

    void trace(String str, String str2, String str3, String str4, String str5, String str6, TraceLogEventType traceLogEventType, String... strArr);
}
