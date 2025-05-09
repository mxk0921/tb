package com.taobao.weex.utils.tools;

import android.util.Log;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.WXEnvironment;
import com.taobao.weex.WXSDKInstance;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class TimeCalculator {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String PLATFORM_ANDROID = "Android";
    public static final String TIMELINE_TAG = "timeline";

    /* renamed from: a  reason: collision with root package name */
    public final CopyOnWriteArrayList<LogDetail> f14154a = new CopyOnWriteArrayList<>();

    static {
        t2o.a(985661844);
    }

    public TimeCalculator(WXSDKInstance wXSDKInstance) {
    }

    public void addLog(LogDetail logDetail) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21e531ef", new Object[]{this, logDetail});
        } else if (WXEnvironment.isPerf()) {
            this.f14154a.add(logDetail);
        }
    }

    public LogDetail createLogDetail(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LogDetail) ipChange.ipc$dispatch("76faf933", new Object[]{this, str});
        }
        LogDetail logDetail = new LogDetail();
        logDetail.name(str);
        addLog(logDetail);
        return logDetail;
    }

    public void println() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16573df6", new Object[]{this});
        } else if (WXEnvironment.isPerf()) {
            Iterator<LogDetail> it = this.f14154a.iterator();
            while (it.hasNext()) {
                Log.e(TIMELINE_TAG, JSON.toJSONString(it.next()));
            }
        }
    }
}
