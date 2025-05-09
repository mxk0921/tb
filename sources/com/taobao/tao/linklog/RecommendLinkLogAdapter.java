package com.taobao.tao.linklog;

import android.os.SystemClock;
import com.alibaba.android.umbrella.link.UMLinkLogInterface;
import com.alibaba.android.umbrella.link.export.UMDimKey;
import com.alibaba.android.umbrella.trace.UmbrellaTracker;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.ayu;
import tb.bqa;
import tb.cyu;
import tb.f4b;
import tb.hdv;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class RecommendLinkLogAdapter implements ILinkLogAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "RecommendLinkLogAdapter";
    private static boolean enableUmbrella2LogInfo = true;
    private UMLinkLogInterface umbrella;

    static {
        t2o.a(729809618);
        t2o.a(729809616);
    }

    public RecommendLinkLogAdapter() {
        try {
            long uptimeMillis = SystemClock.uptimeMillis();
            this.umbrella = hdv.a();
            bqa.d("LinkLog", "cos time:" + (SystemClock.uptimeMillis() - uptimeMillis));
        } catch (Throwable unused) {
            bqa.d(TAG, "umbrella Fetcher error");
        }
    }

    public static void checkEnableUmbrella2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc10e60a", new Object[0]);
        } else {
            enableUmbrella2LogInfo = "true".equals(f4b.h("enableUmbrella2loginfo", "true"));
        }
    }

    @Override // com.taobao.tao.linklog.ILinkLogAdapter
    public ayu createLinkId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ayu) ipChange.ipc$dispatch("6cc113c4", new Object[]{this, str});
        }
        try {
            UMLinkLogInterface uMLinkLogInterface = this.umbrella;
            if (uMLinkLogInterface == null) {
                return null;
            }
            return uMLinkLogInterface.createLinkId(str);
        } catch (Throwable th) {
            bqa.b(TAG, "createLinkId error", th);
            return null;
        }
    }

    @Override // com.taobao.tao.linklog.ILinkLogAdapter
    public void logInfo(String str, String str2, String str3, ayu ayuVar, Map<UMDimKey, Object> map, cyu cyuVar) {
        UMLinkLogInterface uMLinkLogInterface;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6614f406", new Object[]{this, str, str2, str3, ayuVar, map, cyuVar});
            return;
        }
        try {
            if (enableUmbrella2LogInfo && (uMLinkLogInterface = this.umbrella) != null) {
                uMLinkLogInterface.logInfo(str, str2, str3, ayuVar, map, cyuVar);
            }
        } catch (Throwable th) {
            bqa.b(TAG, "logInfo error", th);
        }
    }

    @Override // com.taobao.tao.linklog.ILinkLogAdapter
    public void commitFailure(String str, String str2, String str3, String str4, String str5, Map<String, String> map, String str6, String str7) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d68fbbcd", new Object[]{this, str, str2, str3, str4, str5, map, str6, str7});
            return;
        }
        try {
            UMLinkLogInterface uMLinkLogInterface = this.umbrella;
            if (uMLinkLogInterface == null) {
                UmbrellaTracker.commitFailureStability(str, str2, str3, str4, str5, map, str6, str7);
            } else {
                uMLinkLogInterface.commitFailure(str, str2, str3, str4, str5, map, str6, str7);
            }
        } catch (Throwable th) {
            bqa.b(TAG, "commitFailure error", th);
        }
    }

    @Override // com.taobao.tao.linklog.ILinkLogAdapter
    public void commitSuccess(String str, String str2, String str3, String str4, String str5, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec5cd960", new Object[]{this, str, str2, str3, str4, str5, map});
            return;
        }
        try {
            UMLinkLogInterface uMLinkLogInterface = this.umbrella;
            if (uMLinkLogInterface == null) {
                UmbrellaTracker.commitSuccessStability(str, str2, str3, str3, str5, map);
            } else {
                uMLinkLogInterface.commitSuccess(str, str2, str3, str4, str5, map);
            }
        } catch (Throwable th) {
            bqa.b(TAG, "commitSuccess error", th);
        }
    }

    @Override // com.taobao.tao.linklog.ILinkLogAdapter
    public void logError(String str, String str2, String str3, ayu ayuVar, String str4, String str5, Map<UMDimKey, Object> map, cyu cyuVar) {
        UMLinkLogInterface uMLinkLogInterface;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("136a262c", new Object[]{this, str, str2, str3, ayuVar, str4, str5, map, cyuVar});
            return;
        }
        try {
            if (enableUmbrella2LogInfo && (uMLinkLogInterface = this.umbrella) != null) {
                uMLinkLogInterface.logError(str, str2, str3, ayuVar, str4, str5, map, cyuVar);
            }
        } catch (Throwable th) {
            bqa.b(TAG, "logError error", th);
        }
    }
}
