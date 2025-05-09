package com.taobao.tbdeviceevaluator.jsbridge;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.text.TextUtils;
import com.alibaba.android.aura.taobao.adapter.pageevent.AURAPageEventStrategy;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.adaemon.power.APower;
import org.json.JSONObject;
import tb.kpw;
import tb.lp0;
import tb.m7r;
import tb.nsw;
import tb.qp0;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class AliHADeviceEvaluationBridge extends kpw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(AliHADeviceEvaluationBridge aliHADeviceEvaluationBridge, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tbdeviceevaluator/jsbridge/AliHADeviceEvaluationBridge");
    }

    @Override // tb.kpw
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if ("getPerformanceInfo".equals(str)) {
            return getPerformanceInfo(str2, wVCallBackContext);
        }
        return false;
    }

    private boolean getPerformanceInfo(String str, WVCallBackContext wVCallBackContext) {
        String str2;
        boolean z;
        boolean z2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2563341a", new Object[]{this, str, wVCallBackContext})).booleanValue();
        }
        nsw nswVar = new nsw();
        try {
            str2 = new JSONObject(str).getString("filter");
        } catch (Throwable th) {
            th.printStackTrace();
            str2 = "";
        }
        try {
            if (TextUtils.isEmpty(str2)) {
                z2 = true;
            } else if ("all".equalsIgnoreCase(str2)) {
                z2 = false;
                z = true;
                if (!str2.contains("outline") || z2 || z) {
                    nswVar.a("deviceLevel", Integer.valueOf(qp0.b() + 1));
                    nswVar.a("deviceLevelEasy", Integer.valueOf(lp0.d().f().b + 1));
                    nswVar.a("deviceScore", Float.valueOf(qp0.c()));
                }
                if (!str2.contains("memory") || z) {
                    JSONObject jSONObject = new JSONObject();
                    lp0.d e = lp0.d().e();
                    jSONObject.put("jvmUsedMemory", e.d);
                    jSONObject.put("jvmTotalMemory", e.c);
                    jSONObject.put("nativeUsedMemory", e.f);
                    jSONObject.put("nativeTotalMemory", e.e);
                    jSONObject.put("deviceUsedMemory", e.b);
                    jSONObject.put(m7r.KEY_MONITOR_DEVICE_TOTAL_MEMORY, e.f23478a);
                    jSONObject.put("dalvikPSSMemory", e.g);
                    jSONObject.put("nativePSSMemory", e.h);
                    jSONObject.put("totalPSSMemory", e.i);
                    jSONObject.put("deviceLevel", e.j);
                    jSONObject.put("runtimeLevel", e.k);
                    nswVar.d("memoryInfo", jSONObject);
                }
                if (!str2.contains(APower.TYPE_CPU) || z) {
                    JSONObject jSONObject2 = new JSONObject();
                    lp0.b b = lp0.d().b();
                    jSONObject2.put(AURAPageEventStrategy.FREQUENCY, b.b);
                    jSONObject2.put("cpuUsageOfApp", b.c);
                    jSONObject2.put("cpuUsageOfDevice", b.d);
                    jSONObject2.put("cpuCoreNum", b.f23476a);
                    jSONObject2.put("deviceLevel", b.e);
                    jSONObject2.put("runtimeLevel", b.f);
                    nswVar.d("cpuInfo", jSONObject2);
                }
                if (!str2.contains("opengl") || z) {
                    nswVar.b("openGLVersion", lp0.d().c().d);
                }
                wVCallBackContext.success(nswVar);
                return true;
            } else {
                z2 = false;
            }
            z = false;
            if (!str2.contains("outline")) {
            }
            nswVar.a("deviceLevel", Integer.valueOf(qp0.b() + 1));
            nswVar.a("deviceLevelEasy", Integer.valueOf(lp0.d().f().b + 1));
            nswVar.a("deviceScore", Float.valueOf(qp0.c()));
            if (!str2.contains("memory")) {
            }
            JSONObject jSONObject3 = new JSONObject();
            lp0.d e2 = lp0.d().e();
            jSONObject3.put("jvmUsedMemory", e2.d);
            jSONObject3.put("jvmTotalMemory", e2.c);
            jSONObject3.put("nativeUsedMemory", e2.f);
            jSONObject3.put("nativeTotalMemory", e2.e);
            jSONObject3.put("deviceUsedMemory", e2.b);
            jSONObject3.put(m7r.KEY_MONITOR_DEVICE_TOTAL_MEMORY, e2.f23478a);
            jSONObject3.put("dalvikPSSMemory", e2.g);
            jSONObject3.put("nativePSSMemory", e2.h);
            jSONObject3.put("totalPSSMemory", e2.i);
            jSONObject3.put("deviceLevel", e2.j);
            jSONObject3.put("runtimeLevel", e2.k);
            nswVar.d("memoryInfo", jSONObject3);
            if (!str2.contains(APower.TYPE_CPU)) {
            }
            JSONObject jSONObject22 = new JSONObject();
            lp0.b b2 = lp0.d().b();
            jSONObject22.put(AURAPageEventStrategy.FREQUENCY, b2.b);
            jSONObject22.put("cpuUsageOfApp", b2.c);
            jSONObject22.put("cpuUsageOfDevice", b2.d);
            jSONObject22.put("cpuCoreNum", b2.f23476a);
            jSONObject22.put("deviceLevel", b2.e);
            jSONObject22.put("runtimeLevel", b2.f);
            nswVar.d("cpuInfo", jSONObject22);
            if (!str2.contains("opengl")) {
            }
            nswVar.b("openGLVersion", lp0.d().c().d);
            wVCallBackContext.success(nswVar);
            return true;
        } catch (Throwable th2) {
            nswVar.b("errMsg", th2.getMessage());
            wVCallBackContext.error(nswVar);
            return false;
        }
    }
}
