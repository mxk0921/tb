package com.alibaba.android.umbrella.link;

import android.util.Log;
import com.alibaba.android.umbrella.link.export.TraceLogEventType;
import com.alibaba.android.umbrella.link.export.UMDimKey;
import com.alibaba.android.umbrella.link.export.UMTagKey;
import com.alibaba.android.umbrella.link.export.UmTypeKey;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import mtopsdk.mtop.domain.MtopResponse;
import tb.ayu;
import tb.cyu;
import tb.d71;
import tb.org;
import tb.wxu;
import tb.xxu;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class UMLinkLogImp implements UMLinkLogInterface {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "umbrella";

    @Override // com.alibaba.android.umbrella.link.UMLinkLogInterface
    public void commitFailure(String str, String str2, String str3, String str4, String str5, Map<String, String> map, String str6, String str7) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d68fbbcd", new Object[]{this, str, str2, str3, str4, str5, map, str6, str7});
            return;
        }
        try {
            Log.e(TAG, str4 + " commitFailure");
            xxu.a(str, str2, str3, str4, str5, map, str6, str7);
        } catch (Throwable th) {
            d71.c(th, d71.POINT_COMMIT_FAILURE, str4, str5, str, str6);
        }
    }

    @Override // com.alibaba.android.umbrella.link.UMLinkLogInterface
    public void commitFeedback(String str, String str2, UmTypeKey umTypeKey, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("691659dd", new Object[]{this, str, str2, umTypeKey, str3, str4});
            return;
        }
        try {
            Log.e(TAG, str + " commitFeedback");
            xxu.b(str, str2, umTypeKey, str3, str4);
        } catch (Throwable th) {
            d71.c(th, d71.POINT_COMMIT_FAILURE, str, null, null, null);
        }
    }

    @Override // com.alibaba.android.umbrella.link.UMLinkLogInterface
    public void commitSuccess(String str, String str2, String str3, String str4, String str5, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec5cd960", new Object[]{this, str, str2, str3, str4, str5, map});
            return;
        }
        try {
            xxu.c(str, str2, str3, str4, str5, map);
        } catch (Throwable th) {
            d71.c(th, d71.POINT_COMMIT_SUCCESS, str4, str5, str, "");
        }
    }

    @Override // com.alibaba.android.umbrella.link.UMLinkLogInterface
    public ayu createLinkId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ayu) ipChange.ipc$dispatch("6cc113c4", new Object[]{this, str});
        }
        Log.e(TAG, "createLinkId");
        return new ayu(wxu.a(str));
    }

    @Override // com.alibaba.android.umbrella.link.UMLinkLogInterface
    public void logBegin(String str, String str2, String str3, ayu ayuVar, Map<UMDimKey, Object> map, cyu cyuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22b4d879", new Object[]{this, str, str2, str3, ayuVar, map, cyuVar});
            return;
        }
        try {
            xxu.f(str, str2, str3, ayuVar, map, cyuVar);
        } catch (Throwable th) {
            d71.c(th, d71.POINT_LOG, str, str2, str3, "");
        }
    }

    @Override // com.alibaba.android.umbrella.link.UMLinkLogInterface
    public void logEnd(String str, String str2, String str3, ayu ayuVar, String str4, String str5, Map<UMDimKey, Object> map, cyu cyuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d8fd3f", new Object[]{this, str, str2, str3, ayuVar, str4, str5, map, cyuVar});
            return;
        }
        try {
            xxu.g(str, str2, str3, ayuVar, str4, str5, map, cyuVar);
        } catch (Throwable th) {
            d71.c(th, d71.POINT_LOG, str, str2, str3, str4);
        }
    }

    @Override // com.alibaba.android.umbrella.link.UMLinkLogInterface
    public void logError(String str, String str2, String str3, ayu ayuVar, String str4, String str5, Map<UMDimKey, Object> map, cyu cyuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("136a262c", new Object[]{this, str, str2, str3, ayuVar, str4, str5, map, cyuVar});
            return;
        }
        try {
            Log.e(TAG, str + " logError");
            xxu.h(str, str2, str3, ayuVar, str4, str5, map, cyuVar);
        } catch (Throwable th) {
            d71.c(th, d71.POINT_LOG, str, str2, str3, str4);
        }
    }

    @Override // com.alibaba.android.umbrella.link.UMLinkLogInterface
    public void logInfo(String str, String str2, String str3, ayu ayuVar, Map<UMDimKey, Object> map, cyu cyuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6614f406", new Object[]{this, str, str2, str3, ayuVar, map, cyuVar});
            return;
        }
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" logInfo");
            xxu.i(str, str2, str3, ayuVar, map, cyuVar);
        } catch (Throwable th) {
            d71.c(th, d71.POINT_LOG, str, str2, str3, "");
        }
    }

    @Override // com.alibaba.android.umbrella.link.UMLinkLogInterface
    public void logInfoRawDim(String str, String str2, String str3, ayu ayuVar, Map<String, Object> map, cyu cyuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a0cc5e6", new Object[]{this, str, str2, str3, ayuVar, map, cyuVar});
            return;
        }
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" logInfoRawDim");
            xxu.i(str, str2, str3, ayuVar, UMDimKey.convertRawMap(map), cyuVar);
        } catch (Throwable th) {
            d71.c(th, d71.POINT_LOG, str, str2, str3, "");
        }
    }

    @Override // com.alibaba.android.umbrella.link.UMLinkLogInterface
    public void logMtopReq(String str, String str2, ayu ayuVar, String str3, String str4, String str5, Map<UMTagKey, String> map, cyu cyuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8af135a", new Object[]{this, str, str2, ayuVar, str3, str4, str5, map, cyuVar});
            return;
        }
        try {
            xxu.j(str, str2, ayuVar, str3, str4, str5, map, cyuVar);
        } catch (Throwable th) {
            d71.c(th, d71.POINT_LOG, str, str2, "Mtop", "");
        }
    }

    @Override // com.alibaba.android.umbrella.link.UMLinkLogInterface
    public void logMtopResponse(String str, String str2, ayu ayuVar, Object obj, String str3, Map<UMTagKey, String> map, cyu cyuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39771d", new Object[]{this, str, str2, ayuVar, obj, str3, map, cyuVar});
            return;
        }
        try {
            if (obj instanceof MtopResponse) {
                xxu.k(str, str2, ayuVar, (MtopResponse) obj, str3, map, cyuVar);
            }
        } catch (Throwable th) {
            d71.c(th, d71.POINT_LOG, str, str2, "Mtop", "");
        }
    }

    @Override // com.alibaba.android.umbrella.link.UMLinkLogInterface
    public void logPageLifecycle2(String str, String str2, ayu ayuVar, String str3, String str4, String str5, String str6, Map<UMTagKey, String> map, cyu cyuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1355676d", new Object[]{this, str, str2, ayuVar, str3, str4, str5, str6, map, cyuVar});
            return;
        }
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" logPageLifecycle2");
            xxu.l(str, str2, ayuVar, str3, str4, str5, str6, map, cyuVar);
        } catch (Throwable th) {
            d71.c(th, d71.POINT_LOG, str, str2, "Page", str5);
        }
    }

    @Override // com.alibaba.android.umbrella.link.UMLinkLogInterface
    public void logSimpleInfo(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("faf0b93", new Object[]{this, str, str2, str3, str4});
            return;
        }
        try {
            xxu.m(str, str2, str3, str4);
        } catch (Throwable th) {
            d71.c(th, d71.POINT_LOG, str, str2, str3, "");
        }
    }

    @Override // com.alibaba.android.umbrella.link.UMLinkLogInterface
    public void trace(String str, String str2, String str3, String str4, String str5, String str6, TraceLogEventType traceLogEventType, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1e3476d", new Object[]{this, str, str2, str3, str4, str5, str6, traceLogEventType, strArr});
            return;
        }
        try {
            Log.e(TAG, str + " trace");
            org.c(str, str2, str3, str4, str5, str6, traceLogEventType, strArr);
        } catch (Throwable th) {
            d71.c(th, d71.POINT_COMMIT_FAILURE, str, null, null, null);
        }
    }

    @Override // com.alibaba.android.umbrella.link.UMLinkLogInterface
    public void logErrorRawDim(String str, String str2, String str3, ayu ayuVar, String str4, String str5, Map<String, Object> map, cyu cyuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff95d28c", new Object[]{this, str, str2, str3, ayuVar, str4, str5, map, cyuVar});
            return;
        }
        try {
            Log.e(TAG, str + " logErrorRawDim");
            xxu.h(str, str2, str3, ayuVar, str4, str5, UMDimKey.convertRawMap(map), cyuVar);
        } catch (Throwable th) {
            d71.c(th, d71.POINT_LOG, str, str2, str3, str4);
        }
    }

    @Override // com.alibaba.android.umbrella.link.UMLinkLogInterface
    public void logPageLifecycle(String str, String str2, ayu ayuVar, int i, int i2, String str3, String str4, Map<UMTagKey, String> map, cyu cyuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6abd9b95", new Object[]{this, str, str2, ayuVar, new Integer(i), new Integer(i2), str3, str4, map, cyuVar});
            return;
        }
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" logPageLifecycle");
            xxu.l(str, str2, ayuVar, String.valueOf(i), String.valueOf(i2), str3, str4, map, cyuVar);
        } catch (Throwable th) {
            d71.c(th, d71.POINT_LOG, str, str2, "Page", str3);
        }
    }

    @Override // com.alibaba.android.umbrella.link.UMLinkLogInterface
    public void logUIAction(String str, String str2, ayu ayuVar, int i, String str3, String str4, String str5, Map<UMTagKey, String> map, cyu cyuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dd388e7", new Object[]{this, str, str2, ayuVar, new Integer(i), str3, str4, str5, map, cyuVar});
            return;
        }
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" logUIAction");
            xxu.n(str, str2, ayuVar, String.valueOf(i), "", str3, str4, str5, map, cyuVar);
        } catch (Throwable th) {
            d71.c(th, d71.POINT_LOG, str, str2, "UIEvent", "");
        }
    }

    @Override // com.alibaba.android.umbrella.link.UMLinkLogInterface
    public void logUIAction2(String str, String str2, ayu ayuVar, int i, String str3, String str4, String str5, String str6, Map<UMTagKey, String> map, cyu cyuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20688ddb", new Object[]{this, str, str2, ayuVar, new Integer(i), str3, str4, str5, str6, map, cyuVar});
            return;
        }
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" logUIAction2");
            xxu.n(str, str2, ayuVar, String.valueOf(i), str3, str4, str5, str6, map, cyuVar);
        } catch (Throwable th) {
            d71.c(th, d71.POINT_LOG, str, str2, "UIEvent", "");
        }
    }
}
