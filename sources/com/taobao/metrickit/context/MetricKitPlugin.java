package com.taobao.metrickit.context;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.common.Constants;
import tb.kpw;
import tb.l1r;
import tb.nsw;
import tb.rw4;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class MetricKitPlugin extends kpw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ACTION_GET_NUMBER_OF_CPUCORES = "getNumberOfCPUCores";
    public static final String ACTION_SET_MEMORY_REPEAT_INTERVAL = "setMemoryRepeatInterval";
    public static final String NAME = "MetricKitPlugin";

    private void getNumberOfCPUCores(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94718350", new Object[]{this, str, wVCallBackContext});
            return;
        }
        nsw nswVar = new nsw();
        nswVar.a("numberOfCPUCores", Integer.valueOf(rw4.d()));
        wVCallBackContext.success(nswVar);
    }

    public static /* synthetic */ Object ipc$super(MetricKitPlugin metricKitPlugin, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/metrickit/context/MetricKitPlugin");
    }

    private void setMemoryRepeatInterval(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a3fdf1", new Object[]{this, str, wVCallBackContext});
            return;
        }
        long longValue = JSON.parseObject(str).getLong(Constants.Name.INTERVAL).longValue();
        if (longValue > 0) {
            l1r.j(l1r.CONFIG_MEMORY_REPEAT_INTERVAL, longValue);
            nsw nswVar = new nsw();
            nswVar.b("result", "添加成功，重启/前后台切换后生效～");
            wVCallBackContext.success(nswVar);
            return;
        }
        nsw nswVar2 = new nsw();
        nswVar2.b("result", "添加失败，请检查配置！");
        wVCallBackContext.error(nswVar2);
    }

    @Override // tb.kpw
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if (ACTION_SET_MEMORY_REPEAT_INTERVAL.equals(str)) {
            setMemoryRepeatInterval(str2, wVCallBackContext);
        } else if (ACTION_GET_NUMBER_OF_CPUCORES.equals(str)) {
            getNumberOfCPUCores(str2, wVCallBackContext);
        }
        return false;
    }
}
