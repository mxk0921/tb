package mtopsdk.mtop.util;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.analysis.scene.SceneIdentifier;
import mtopsdk.common.util.TBSdkLog;
import mtopsdk.mtop.intf.Mtop;
import tb.gz8;
import tb.ktj;
import tb.sz8;
import tb.t2o;
import tb.zzc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class FullTraceHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String MODULE = "mtop";
    private static final String TAG = "mtop.FullTraceHelper";
    private static boolean isAnalysisValid;

    public static void beginAsyncSection(String str, String str2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60aa8876", new Object[]{str, str2, new Integer(i)});
        } else if (isAnalysisValid) {
            sz8.a(str, str2, i);
        }
    }

    public static void beginSection(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aeb3d417", new Object[]{str, str2});
        } else if (isAnalysisValid) {
            sz8.b(str, str2);
        }
    }

    public static void endAsyncSection(String str, String str2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61a63384", new Object[]{str, str2, new Integer(i)});
        } else if (isAnalysisValid) {
            sz8.d(str, str2, i);
        }
    }

    public static void endSection() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1fcca111", new Object[0]);
        } else if (isAnalysisValid) {
            sz8.e();
        }
    }

    public static boolean isLowBuyer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("95f36214", new Object[0])).booleanValue();
        }
        try {
            if (Mtop.mIsFullTrackValid) {
                return SceneIdentifier.isLowBuyer();
            }
        } catch (Exception unused) {
        }
        return false;
    }

    private static void log(Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e0976f1", new Object[]{obj, str});
        } else {
            log(obj, str, "");
        }
    }

    public static void recordFinish(Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e3f77f1", new Object[]{obj, str});
        } else if (isAnalysisValid) {
            log(obj, "bizFinish", str);
        }
    }

    public static void recordReqProcessStart(MtopStatistics mtopStatistics) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("588eb948", new Object[]{mtopStatistics});
            return;
        }
        mtopStatistics.bizReqProcessStart = System.currentTimeMillis();
        if (isAnalysisValid) {
            log(mtopStatistics.openTraceSpan, "bizReqProcessStart");
        }
    }

    public static void recordReqSignFinish(MtopStatistics mtopStatistics) {
        zzc a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8241c45", new Object[]{mtopStatistics});
        } else if (isAnalysisValid && (a2 = ktj.a()) != null) {
            a2.b().b(mtopStatistics.falcoId);
        }
    }

    public static void recordReqSignStart(MtopStatistics mtopStatistics) {
        zzc a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58a4e980", new Object[]{mtopStatistics});
        } else if (isAnalysisValid && (a2 = ktj.a()) != null) {
            a2.b().a(mtopStatistics.falcoId);
        }
    }

    public static void recordReqStart(MtopStatistics mtopStatistics, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ab48987", new Object[]{mtopStatistics, str});
            return;
        }
        mtopStatistics.bizReqStart = System.currentTimeMillis();
        if (isAnalysisValid) {
            Object obj = mtopStatistics.openTraceSpan;
            log(obj, "bizReqStart", "api=" + str);
        }
    }

    public static void recordRspCbDispatch(MtopStatistics mtopStatistics) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d9bea7f", new Object[]{mtopStatistics});
            return;
        }
        mtopStatistics.rspCbDispatch = System.currentTimeMillis();
        if (isAnalysisValid) {
            log(mtopStatistics.openTraceSpan, "bizRspCbDispatch");
        }
    }

    public static void recordRspCbEnd(MtopStatistics mtopStatistics) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71936ac6", new Object[]{mtopStatistics});
            return;
        }
        mtopStatistics.rspCbEnd = System.currentTimeMillis();
        if (isAnalysisValid) {
            log(mtopStatistics.openTraceSpan, "bizRspCbEnd");
        }
    }

    public static void recordRspCbStart(MtopStatistics mtopStatistics) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0c4044d", new Object[]{mtopStatistics});
            return;
        }
        mtopStatistics.rspCbStart = System.currentTimeMillis();
        if (isAnalysisValid) {
            log(mtopStatistics.openTraceSpan, "bizRspCbStart");
        }
    }

    public static void recordRspProcessStart(MtopStatistics mtopStatistics) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96dc0cb9", new Object[]{mtopStatistics});
            return;
        }
        mtopStatistics.bizRspProcessStart = System.currentTimeMillis();
        if (isAnalysisValid) {
            log(mtopStatistics.openTraceSpan, "bizRspProcessStart");
        }
    }

    private static void log(Object obj, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3703267b", new Object[]{obj, str, str2});
        } else if (obj != null) {
            try {
                if (obj instanceof gz8) {
                    StringBuilder sb = new StringBuilder("module=mtop,stage=");
                    sb.append(str);
                    if (!TextUtils.isEmpty(str2)) {
                        sb.append(",content=");
                        sb.append(str2);
                    }
                    ((gz8) obj).A(sb.toString());
                }
            } catch (Throwable unused) {
            }
        }
    }

    static {
        t2o.a(589299996);
        try {
            isAnalysisValid = true;
        } catch (Throwable unused) {
            isAnalysisValid = false;
            TBSdkLog.e(TAG, "FullTraceAnalysis is not fount.");
        }
    }
}
