package com.alibaba.security.client.smart.core.wukong.report;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.security.ccrc.common.log.Logging;
import com.alibaba.security.ccrc.common.util.JsonUtils;
import com.alibaba.security.ccrc.manager.CcrcContextImpl;
import com.alibaba.security.ccrc.model.Label;
import com.alibaba.security.ccrc.service.build.Ab;
import com.alibaba.security.ccrc.service.build.Bb;
import com.alibaba.security.ccrc.service.build.C1164h;
import com.alibaba.security.ccrc.service.build.C1174ka;
import com.alibaba.security.ccrc.service.build.C1185pa;
import com.alibaba.security.ccrc.service.build.C1187qa;
import com.alibaba.security.ccrc.service.build.C1188ra;
import com.alibaba.security.ccrc.service.build.C1204za;
import com.alibaba.security.ccrc.service.build.yb;
import com.alibaba.security.ccrc.service.model.WukongRiskUploadResult;
import com.alibaba.security.client.smart.core.model.InferContext;
import com.alibaba.security.client.smart.core.track.TrackManager;
import com.alibaba.security.client.smart.core.track.model.TrackLog;
import com.alibaba.security.client.smart.core.wukong.report.NativeRiskReporter;
import com.alibaba.security.client.smart.core.wukong.report.model.RiskPoint;
import com.alibaba.security.wukong.upload.ClientRiskUploadData;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class NativeRiskReporter {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "NativeRiskReporter";

    public static /* synthetic */ void access$000(boolean z, WukongRiskUploadResult.WukongUploadType wukongUploadType, InferContext inferContext, C1185pa paVar, List list, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14fc1272", new Object[]{new Boolean(z), wukongUploadType, inferContext, paVar, list, str});
        } else {
            performRiskUploadCallback(z, wukongUploadType, inferContext, paVar, list, str);
        }
    }

    public static /* synthetic */ void access$100(InferContext inferContext, String str, boolean z, Object obj, String str2, String str3, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4e64218", new Object[]{inferContext, str, new Boolean(z), obj, str2, str3, new Long(j)});
        } else {
            reportRiskEnd(inferContext, str, z, obj, str2, str3, j);
        }
    }

    public static void asyncRiskReport(String str, String str2, String str3) {
        List parseArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a72d6e4", new Object[]{str, str2, str3});
            return;
        }
        InferContext a2 = C1204za.a.f2639a.a(str);
        if (a2 == null) {
            Logging.e(TAG, "asyncRiskReport inferContext is null");
            return;
        }
        C1185pa a3 = C1185pa.a(a2.ccrcCode);
        if (a3 != null && (parseArray = JSON.parseArray(str2, RiskPoint.class)) != null && !parseArray.isEmpty()) {
            new C1164h(CcrcContextImpl.getContext()).a(buildRiskUploadData(a2, str2, str3), new C1187qa(System.currentTimeMillis(), a2, a3, parseArray, str2));
        }
    }

    public static ClientRiskUploadData buildRiskUploadData(InferContext inferContext, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ClientRiskUploadData) ipChange.ipc$dispatch("c56f130f", new Object[]{inferContext, str, str2});
        }
        ClientRiskUploadData clientRiskUploadData = new ClientRiskUploadData(inferContext.ccrcCode);
        clientRiskUploadData.pId = inferContext.pid;
        clientRiskUploadData.riskPointIds = str;
        clientRiskUploadData.sign = str2;
        clientRiskUploadData.context = JsonUtils.toJSONString(inferContext);
        clientRiskUploadData.ts = inferContext.sampleData.getTs();
        clientRiskUploadData.eventId = inferContext.eventId;
        clientRiskUploadData.metaId = inferContext.getMetaId();
        clientRiskUploadData.sampleId = inferContext.getSampleID();
        clientRiskUploadData.riskId = inferContext.getRiskId();
        clientRiskUploadData.extras = JsonUtils.toJSONString(inferContext.getExtras());
        return clientRiskUploadData;
    }

    public static void localRiskReport(String str, String str2) {
        List parseArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("318342c9", new Object[]{str, str2});
            return;
        }
        InferContext a2 = C1204za.a.f2639a.a(str);
        reportRiskEnd(a2, str2, true, null, null, "local", 0L);
        if (a2 == null) {
            Logging.e(TAG, "localRiskReport inferContext is null");
            return;
        }
        C1185pa a3 = C1185pa.a(a2.ccrcCode);
        if (a3 != null && (parseArray = JSON.parseArray(str2, RiskPoint.class)) != null && !parseArray.isEmpty()) {
            performRiskUploadCallback(true, WukongRiskUploadResult.WukongUploadType.WukongRiskUploadTypeLocal, a2, a3, parseArray, "");
            performOldCallback(a2, a3, parseArray);
        }
    }

    public static boolean performPipeWrite(String str, InferContext inferContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3142dd69", new Object[]{str, inferContext})).booleanValue();
        }
        Ab ab = new Ab();
        String str2 = inferContext.ccrcCode;
        ab.f2541a = str2;
        ab.b = inferContext.pid;
        ab.c = inferContext.eventId;
        yb a2 = Bb.a(str2);
        if (a2 == null) {
            return false;
        }
        return a2.writeRiskData(ab, str);
    }

    public static void performRiskUploadCallback(boolean z, WukongRiskUploadResult.WukongUploadType wukongUploadType, InferContext inferContext, C1185pa paVar, List<RiskPoint> list, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5af7814c", new Object[]{new Boolean(z), wukongUploadType, inferContext, paVar, list, str});
            return;
        }
        WukongRiskUploadResult wukongRiskUploadResult = new WukongRiskUploadResult();
        wukongRiskUploadResult.isSuccess = z;
        wukongRiskUploadResult.pid = inferContext.pid;
        wukongRiskUploadResult.ccrcCode = inferContext.ccrcCode;
        wukongRiskUploadResult.errorMsg = str;
        wukongRiskUploadResult.riskPoints = list;
        wukongRiskUploadResult.uploadType = wukongUploadType;
        paVar.a(inferContext, wukongRiskUploadResult);
    }

    public static void reportRiskEnd(final InferContext inferContext, final String str, final boolean z, final Object obj, final String str2, final String str3, final long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a85928f1", new Object[]{inferContext, str, new Boolean(z), obj, str2, str3, new Long(j)});
        } else {
            TrackManager.getExecutor().execute(new Runnable() { // from class: tb.kiz
                @Override // java.lang.Runnable
                public final void run() {
                    NativeRiskReporter.a(InferContext.this, z, obj, str2, str, j, str3);
                }
            });
        }
    }

    public static void syncRiskReport(String str, String str2, String str3, int i) {
        List parseArray;
        String str4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff1a13e0", new Object[]{str, str2, str3, new Integer(i)});
            return;
        }
        InferContext a2 = C1204za.a.f2639a.a(str3);
        if (a2 == null || TextUtils.isEmpty(a2.ccrcCode)) {
            Logging.e(TAG, "syncRiskReport inferContext is null");
            return;
        }
        boolean performPipeWrite = performPipeWrite(str, a2);
        C1185pa a3 = C1185pa.a(a2.ccrcCode);
        if (a3 != null && (parseArray = JSON.parseArray(str2, RiskPoint.class)) != null && !parseArray.isEmpty()) {
            WukongRiskUploadResult.WukongUploadType wukongUploadType = WukongRiskUploadResult.WukongUploadType.WukongRiskUploadTypeSync;
            if (performPipeWrite) {
                str4 = "";
            } else {
                str4 = "pipe write error";
            }
            performRiskUploadCallback(performPipeWrite, wukongUploadType, a2, a3, parseArray, str4);
        }
    }

    public static /* synthetic */ void a(InferContext inferContext, boolean z, Object obj, String str, String str2, long j, String str3) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac696c68", new Object[]{inferContext, new Boolean(z), obj, str, str2, new Long(j), str3});
            return;
        }
        TrackLog.Builder operation = TrackLog.newBuilder().setpId(inferContext.pid).setMetaId(inferContext.getMetaId()).setSampleId(inferContext.getSampleID()).setCcrcCode(inferContext.ccrcCode).setPhase("detect").setOperation(C1174ka.a.f);
        if (!z) {
            i = -1;
        }
        TrackManager.track(operation.setStatus(i).setTag("MTOP").addParam("response", obj).addParam("errorMsg", str).addParam("riskPointIds", str2).addParam("costTime", Long.valueOf(j)).addParam("type", str3).build());
    }

    public static void performOldCallback(InferContext inferContext, C1185pa paVar, List<RiskPoint> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ff67618", new Object[]{inferContext, paVar, list});
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (RiskPoint riskPoint : list) {
            arrayList.add(new Label(riskPoint.riskPointName, "unknown"));
        }
        paVar.a(inferContext, new C1188ra(true, arrayList));
    }
}
