package com.alipay.android.msp.framework.statisticsv2;

import com.alipay.android.app.safepaylogv2.api.StatisticCollector;
import com.alipay.android.msp.core.AlertIntelligenceEngine;
import com.alipay.android.msp.core.context.MspContext;
import com.alipay.android.msp.core.context.MspContextManager;
import com.alipay.android.msp.framework.statisticsv2.model.StEvent;
import com.alipay.android.msp.framework.statisticsv2.model.StWindow;
import com.alipay.android.msp.utils.LogUtil;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import tb.pg1;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class StatisticAgent {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final int f3663a;

    public StatisticAgent(int i) {
        this.f3663a = i;
    }

    public final void a(Recorder recorder, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74a17f32", new Object[]{this, recorder, obj});
            return;
        }
        List<Map<String, String>> errorList = StatisticCollector.getErrorList(obj);
        List<Map<String, String>> countList = StatisticCollector.getCountList(obj);
        List<Map<String, String>> performanceList = StatisticCollector.getPerformanceList(obj);
        List<Map<String, String>> windowList = StatisticCollector.getWindowList(obj);
        for (Map<String, String> map : errorList) {
            b(recorder, "error", map);
        }
        for (Map<String, String> map2 : countList) {
            b(recorder, "count", map2);
        }
        for (Map<String, String> map3 : performanceList) {
            b(recorder, "performance", map3);
        }
        for (Map<String, String> map4 : windowList) {
            b(recorder, pg1.ATOM_EXT_window, map4);
        }
        StatisticCollector.clearInstance(obj);
    }

    public synchronized void addExternalInfo(Recorder recorder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("867eb74f", new Object[]{this, recorder});
            return;
        }
        if (this.f3663a != -1) {
            a(recorder, this);
        }
        a(recorder, StatisticCollector.GLOBAL_AGENT);
    }

    public final void b(Recorder recorder, String str, Map<String, String> map) {
        char c = 2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4981be65", new Object[]{this, recorder, str, map});
            return;
        }
        try {
            String lowerCase = str.toLowerCase(Locale.CHINA);
            switch (lowerCase.hashCode()) {
                case -1480388560:
                    if (lowerCase.equals("performance")) {
                        break;
                    }
                    c = 65535;
                    break;
                case -787751952:
                    if (lowerCase.equals(pg1.ATOM_EXT_window)) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 94851343:
                    if (lowerCase.equals("count")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 96784904:
                    if (lowerCase.equals("error")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            if (c == 0) {
                recorder.addExternalError(map.get("errorType"), map.get("errorCode"), map.get("errorMsg"), map.get("errorTime"));
                MspContext mspContextByBizId = MspContextManager.getInstance().getMspContextByBizId(this.f3663a);
                if (mspContextByBizId != null) {
                    AlertIntelligenceEngine.startAction(mspContextByBizId, "err", map.get("errorCode"), null, null);
                }
            } else if (c != 1) {
                if (c == 3) {
                    recorder.addWindow(new StWindow(map.get(StWindow.WIN_NAME), map.get("netType"), map.get(StWindow.UPDATE_TYPE), map.get("status"), map.get(StWindow.UPDATE_TIME), map.get(StWindow.WINDOW_TIME)));
                }
            } else if (map != null) {
                for (String str2 : map.keySet()) {
                    recorder.addEvent(new StEvent("", str2, map.get(str2)));
                }
            }
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
        }
    }
}
