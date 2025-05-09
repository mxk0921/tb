package com.taobao.location.common;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.metrickit.event.lifecycle.LifecycleEventSource;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public enum LocationErrorCode {
    SUCCESS(100, "定位成功"),
    FAIL(201, "定位失败"),
    FAIL_ALL(202, "尝试所有定位失败"),
    FAIL_LOCATION_TIMEOUT(203, "定位服务超时"),
    FAIL_INVALID_OPTION(210, "定位参数OPTION不可为空"),
    FAIL_UNAVALIABLE_SERVICE(211, "绑定服务失败, 服务绑定异常"),
    FAIL_INVALID_LOOPER(212, "回调提供的looper不合法"),
    FAIL_BIND_SERVICE_NO_CONTEXT(LifecycleEventSource.ON_FRAGMENT_DESTROYED, "绑定服务失败, context为空"),
    FAIL_BIND_SERVICE_NO_SERVICE_CONNECTION(214, "绑定服务失败, 服务连接为空");
    
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final int code;
    public final String desc;

    LocationErrorCode(int i, String str) {
        this.code = i;
        this.desc = str;
    }

    public static /* synthetic */ Object ipc$super(LocationErrorCode locationErrorCode, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/location/common/LocationErrorCode");
    }

    public static LocationErrorCode valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LocationErrorCode) ipChange.ipc$dispatch("452fdf69", new Object[]{str});
        }
        return (LocationErrorCode) Enum.valueOf(LocationErrorCode.class, str);
    }

    public int getCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("480bb15d", new Object[]{this})).intValue();
        }
        return this.code;
    }

    public String getDesc() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f24b4252", new Object[]{this});
        }
        return this.desc;
    }
}
