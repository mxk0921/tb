package com.taobao.live.ubee.core;

import android.util.Log;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.live.ubee.mtop.report.ReportConfigData;
import com.taobao.live.ubee.mtop.report.ReportConfigRequest;
import com.taobao.live.ubee.mtop.report.ReportConfigResponse;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopResponse;
import tb.t2o;
import tb.zjx;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class ReportConfigManager {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "ReportConfigManager";

    /* renamed from: a  reason: collision with root package name */
    public static ReportConfigData f10999a;
    public static long b;

    static {
        t2o.a(779092252);
    }

    public static /* synthetic */ long a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e1550f5f", new Object[]{new Long(j)})).longValue();
        }
        b = j;
        return j;
    }

    public static /* synthetic */ ReportConfigData b(ReportConfigData reportConfigData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ReportConfigData) ipChange.ipc$dispatch("5c940ac", new Object[]{reportConfigData});
        }
        f10999a = reportConfigData;
        return reportConfigData;
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b62c9e41", new Object[]{this});
        } else if (!g()) {
            d();
        }
    }

    public final void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ffde289", new Object[]{this});
        } else {
            zjx.a(new ReportConfigRequest(), new IRemoteBaseListener() { // from class: com.taobao.live.ubee.core.ReportConfigManager.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.tao.remotebusiness.IRemoteListener
                public void onError(int i, MtopResponse mtopResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                    } else if (mtopResponse != null) {
                        Log.e(ReportConfigManager.TAG, "onError: errorMsg = " + mtopResponse.getRetMsg() + "  errorCode = " + mtopResponse.getRetCode());
                    }
                }

                @Override // com.taobao.tao.remotebusiness.IRemoteListener
                public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                    } else if (baseOutDo instanceof ReportConfigResponse) {
                        ReportConfigManager.a(System.currentTimeMillis());
                        ReportConfigManager.b(((ReportConfigResponse) baseOutDo).getData());
                    }
                }

                @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
                public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                    } else if (mtopResponse != null) {
                        Log.e(ReportConfigManager.TAG, "onSystemError: errorMsg = " + mtopResponse.getRetMsg() + "  errorCode = " + mtopResponse.getRetCode());
                    }
                }
            }, ReportConfigResponse.class);
        }
    }

    public JSONObject e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("3f3a3ddf", new Object[]{this});
        }
        ReportConfigData reportConfigData = f10999a;
        if (reportConfigData != null) {
            return reportConfigData.config;
        }
        return null;
    }

    public JSONObject f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("fca228a9", new Object[]{this});
        }
        ReportConfigData reportConfigData = f10999a;
        if (reportConfigData != null) {
            return reportConfigData.data;
        }
        return null;
    }

    public final boolean g() {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6bdf00ef", new Object[]{this})).booleanValue();
        }
        ReportConfigData reportConfigData = f10999a;
        if (!(reportConfigData == null || (jSONObject = reportConfigData.config) == null)) {
            long longValue = jSONObject.getLongValue("delay");
            long currentTimeMillis = System.currentTimeMillis() - b;
            Log.e(TAG, "interval = " + currentTimeMillis);
            if (currentTimeMillis < longValue * 1000) {
                return true;
            }
        }
        return false;
    }
}
