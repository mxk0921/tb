package com.taobao.pha.tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tscheduleprotocol.RenderScheduleProtocol;
import com.taobao.android.tscheduleprotocol.ScheduleProtocolCallback;
import java.util.Map;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class PreRenderProtocolImpl implements RenderScheduleProtocol {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(619708679);
    }

    private boolean enablePreRender() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fc614161", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // com.taobao.android.tscheduleprotocol.RenderScheduleProtocol
    public boolean clearPreloadedInstances() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e1648b2e", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // com.taobao.android.tscheduleprotocol.RenderScheduleProtocol
    public boolean preCreateInstanceWithUrl(Context context, String str, ScheduleProtocolCallback scheduleProtocolCallback, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("17ad6e11", new Object[]{this, context, str, scheduleProtocolCallback, map})).booleanValue();
        }
        return false;
    }

    @Override // com.taobao.android.tscheduleprotocol.RenderScheduleProtocol
    public boolean preloadWithUrl(Context context, String str, ScheduleProtocolCallback scheduleProtocolCallback, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1a9a9666", new Object[]{this, context, str, scheduleProtocolCallback, map})).booleanValue();
        }
        return false;
    }

    @Override // com.taobao.android.tscheduleprotocol.RenderScheduleProtocol
    public boolean removePreloadedInstance(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b0cc56ce", new Object[]{this, str})).booleanValue();
        }
        return false;
    }
}
