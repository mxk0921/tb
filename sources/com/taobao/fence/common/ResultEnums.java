package com.taobao.fence.common;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.mobile.auth.gatewayauth.ResultCode;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public enum ResultEnums {
    SUCCESS(0, ResultCode.MSG_SUCCESS),
    SYS_FAIL(100, "系统服务异常"),
    MAIN_THREAD_FAIL(101, "请不要在主线程调用接口"),
    PARAMETER_FAIL(101, "参数异常"),
    NOT_EXSIT_UUID(102, "缺少uuid参数"),
    REMOTE_ERROR(103, "远程服务异常"),
    LOCATOIN_FAIL(200, "定位失败"),
    LOCATOIN_NOT_OPEN(201, "系统位置服务未打开"),
    WIFI_NOT_OPEN(301, "系统WIFI未打开"),
    IBEACON_NOT_OPEN(401, "系统蓝牙设备未打开"),
    NOT_SUPPORT_IBEACON(402, "系统不支持IBEACON");
    
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final int code;
    public final String message;

    ResultEnums(int i, String str) {
        this.code = i;
        this.message = str;
    }

    public static /* synthetic */ Object ipc$super(ResultEnums resultEnums, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/fence/common/ResultEnums");
    }

    public static ResultEnums valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ResultEnums) ipChange.ipc$dispatch("c1f72da8", new Object[]{str});
        }
        return (ResultEnums) Enum.valueOf(ResultEnums.class, str);
    }
}
