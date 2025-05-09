package com.taobao.informationflowdataservice.dataservice.utils.baseutils.linklog;

import com.alibaba.android.umbrella.link.UMLinkLogInterface;
import com.alibaba.android.umbrella.link.export.UMDimKey;
import com.alibaba.android.umbrella.trace.UmbrellaTracker;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.ayu;
import tb.cyu;
import tb.hdv;
import tb.i65;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class RecommendLinkLogAdapter implements ILinkLogAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "RecommendLinkLogAdapter";
    private static boolean enableUmbrella2 = true;
    private static boolean enableUmbrella2LogInfo = true;
    private UMLinkLogInterface umbrella;

    static {
        t2o.a(487587980);
        t2o.a(487587978);
    }

    public RecommendLinkLogAdapter() {
        try {
            if (checkEnableUmbrella2()) {
                this.umbrella = hdv.a();
            } else {
                i65.c(TAG, "disenableUmbrella2");
            }
        } catch (Throwable unused) {
            i65.c(TAG, "umbrella Fetcher error");
        }
    }

    public static boolean checkEnableUmbrella2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bc10e60e", new Object[0])).booleanValue();
        }
        enableUmbrella2 = true;
        enableUmbrella2LogInfo = true;
        return true;
    }

    @Override // com.taobao.informationflowdataservice.dataservice.utils.baseutils.linklog.ILinkLogAdapter
    public void commitFailure(String str, String str2, String str3, String str4, String str5, Map<String, String> map, String str6, String str7) {
        UMLinkLogInterface uMLinkLogInterface;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d68fbbcd", new Object[]{this, str, str2, str3, str4, str5, map, str6, str7});
            return;
        }
        try {
            if (enableUmbrella2 && (uMLinkLogInterface = this.umbrella) != null) {
                uMLinkLogInterface.commitFailure(str, str2, str3, str4, str5, map, str6, str7);
                return;
            }
            UmbrellaTracker.commitFailureStability(str, str2, str3, str4, str5, map, str6, str7);
        } catch (Throwable th) {
            i65.b(TAG, "commitFailure error", th);
        }
    }

    @Override // com.taobao.informationflowdataservice.dataservice.utils.baseutils.linklog.ILinkLogAdapter
    public void commitSuccess(String str, String str2, String str3, String str4, String str5, Map<String, String> map) {
        UMLinkLogInterface uMLinkLogInterface;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec5cd960", new Object[]{this, str, str2, str3, str4, str5, map});
            return;
        }
        try {
            if (enableUmbrella2 && (uMLinkLogInterface = this.umbrella) != null) {
                uMLinkLogInterface.commitSuccess(str, str2, str3, str4, str5, map);
                return;
            }
            UmbrellaTracker.commitSuccessStability(str, str2, str3, str3, str5, map);
        } catch (Throwable th) {
            i65.b(TAG, "commitSuccess error", th);
        }
    }

    @Override // com.taobao.informationflowdataservice.dataservice.utils.baseutils.linklog.ILinkLogAdapter
    public ayu createLinkId(String str) {
        UMLinkLogInterface uMLinkLogInterface;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ayu) ipChange.ipc$dispatch("6cc113c4", new Object[]{this, str});
        }
        try {
            if (enableUmbrella2 && (uMLinkLogInterface = this.umbrella) != null) {
                return uMLinkLogInterface.createLinkId(str);
            }
            return null;
        } catch (Throwable th) {
            i65.b(TAG, "createLinkId error", th);
            return null;
        }
    }

    @Override // com.taobao.informationflowdataservice.dataservice.utils.baseutils.linklog.ILinkLogAdapter
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
            i65.b(TAG, "logInfo error", th);
        }
    }

    @Override // com.taobao.informationflowdataservice.dataservice.utils.baseutils.linklog.ILinkLogAdapter
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
            i65.b(TAG, "logError error", th);
        }
    }
}
