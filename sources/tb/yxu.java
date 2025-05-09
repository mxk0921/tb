package tb;

import com.alibaba.android.umbrella.link.UMLinkLogInterface;
import com.alibaba.android.umbrella.link.export.TraceLogEventType;
import com.alibaba.android.umbrella.link.export.UMDimKey;
import com.alibaba.android.umbrella.link.export.UMTagKey;
import com.alibaba.android.umbrella.link.export.UmTypeKey;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class yxu implements UMLinkLogInterface {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // com.alibaba.android.umbrella.link.UMLinkLogInterface
    public void commitFailure(String str, String str2, String str3, String str4, String str5, Map<String, String> map, String str6, String str7) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d68fbbcd", new Object[]{this, str, str2, str3, str4, str5, map, str6, str7});
        }
    }

    @Override // com.alibaba.android.umbrella.link.UMLinkLogInterface
    public void commitFeedback(String str, String str2, UmTypeKey umTypeKey, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("691659dd", new Object[]{this, str, str2, umTypeKey, str3, str4});
        }
    }

    @Override // com.alibaba.android.umbrella.link.UMLinkLogInterface
    public void commitSuccess(String str, String str2, String str3, String str4, String str5, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec5cd960", new Object[]{this, str, str2, str3, str4, str5, map});
        }
    }

    @Override // com.alibaba.android.umbrella.link.UMLinkLogInterface
    public ayu createLinkId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ayu) ipChange.ipc$dispatch("6cc113c4", new Object[]{this, str});
        }
        return null;
    }

    @Override // com.alibaba.android.umbrella.link.UMLinkLogInterface
    public void logBegin(String str, String str2, String str3, ayu ayuVar, Map<UMDimKey, Object> map, cyu cyuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22b4d879", new Object[]{this, str, str2, str3, ayuVar, map, cyuVar});
        }
    }

    @Override // com.alibaba.android.umbrella.link.UMLinkLogInterface
    public void logEnd(String str, String str2, String str3, ayu ayuVar, String str4, String str5, Map<UMDimKey, Object> map, cyu cyuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d8fd3f", new Object[]{this, str, str2, str3, ayuVar, str4, str5, map, cyuVar});
        }
    }

    @Override // com.alibaba.android.umbrella.link.UMLinkLogInterface
    public void logError(String str, String str2, String str3, ayu ayuVar, String str4, String str5, Map<UMDimKey, Object> map, cyu cyuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("136a262c", new Object[]{this, str, str2, str3, ayuVar, str4, str5, map, cyuVar});
        }
    }

    @Override // com.alibaba.android.umbrella.link.UMLinkLogInterface
    public void logErrorRawDim(String str, String str2, String str3, ayu ayuVar, String str4, String str5, Map<String, Object> map, cyu cyuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff95d28c", new Object[]{this, str, str2, str3, ayuVar, str4, str5, map, cyuVar});
        }
    }

    @Override // com.alibaba.android.umbrella.link.UMLinkLogInterface
    public void logInfo(String str, String str2, String str3, ayu ayuVar, Map<UMDimKey, Object> map, cyu cyuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6614f406", new Object[]{this, str, str2, str3, ayuVar, map, cyuVar});
        }
    }

    @Override // com.alibaba.android.umbrella.link.UMLinkLogInterface
    public void logInfoRawDim(String str, String str2, String str3, ayu ayuVar, Map<String, Object> map, cyu cyuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a0cc5e6", new Object[]{this, str, str2, str3, ayuVar, map, cyuVar});
        }
    }

    @Override // com.alibaba.android.umbrella.link.UMLinkLogInterface
    public void logMtopReq(String str, String str2, ayu ayuVar, String str3, String str4, String str5, Map<UMTagKey, String> map, cyu cyuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8af135a", new Object[]{this, str, str2, ayuVar, str3, str4, str5, map, cyuVar});
        }
    }

    @Override // com.alibaba.android.umbrella.link.UMLinkLogInterface
    public void logMtopResponse(String str, String str2, ayu ayuVar, Object obj, String str3, Map<UMTagKey, String> map, cyu cyuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39771d", new Object[]{this, str, str2, ayuVar, obj, str3, map, cyuVar});
        }
    }

    @Override // com.alibaba.android.umbrella.link.UMLinkLogInterface
    public void logPageLifecycle(String str, String str2, ayu ayuVar, int i, int i2, String str3, String str4, Map<UMTagKey, String> map, cyu cyuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6abd9b95", new Object[]{this, str, str2, ayuVar, new Integer(i), new Integer(i2), str3, str4, map, cyuVar});
        }
    }

    @Override // com.alibaba.android.umbrella.link.UMLinkLogInterface
    public void logPageLifecycle2(String str, String str2, ayu ayuVar, String str3, String str4, String str5, String str6, Map<UMTagKey, String> map, cyu cyuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1355676d", new Object[]{this, str, str2, ayuVar, str3, str4, str5, str6, map, cyuVar});
        }
    }

    @Override // com.alibaba.android.umbrella.link.UMLinkLogInterface
    public void logSimpleInfo(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("faf0b93", new Object[]{this, str, str2, str3, str4});
        }
    }

    @Override // com.alibaba.android.umbrella.link.UMLinkLogInterface
    public void logUIAction(String str, String str2, ayu ayuVar, int i, String str3, String str4, String str5, Map<UMTagKey, String> map, cyu cyuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dd388e7", new Object[]{this, str, str2, ayuVar, new Integer(i), str3, str4, str5, map, cyuVar});
        }
    }

    @Override // com.alibaba.android.umbrella.link.UMLinkLogInterface
    public void logUIAction2(String str, String str2, ayu ayuVar, int i, String str3, String str4, String str5, String str6, Map<UMTagKey, String> map, cyu cyuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20688ddb", new Object[]{this, str, str2, ayuVar, new Integer(i), str3, str4, str5, str6, map, cyuVar});
        }
    }

    @Override // com.alibaba.android.umbrella.link.UMLinkLogInterface
    public void trace(String str, String str2, String str3, String str4, String str5, String str6, TraceLogEventType traceLogEventType, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1e3476d", new Object[]{this, str, str2, str3, str4, str5, str6, traceLogEventType, strArr});
        }
    }
}
