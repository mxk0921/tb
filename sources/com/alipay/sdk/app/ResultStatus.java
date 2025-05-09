package com.alipay.sdk.app;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.support.api.entity.core.JosStatusCodes;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public enum ResultStatus {
    SUCCEEDED(9000, "处理成功"),
    FAILED(4000, "系统繁忙，请稍后再试"),
    CANCELED(6001, "用户取消"),
    NETWORK_ERROR(6002, "网络连接异常"),
    PARAMS_ERROR(4001, "参数错误"),
    DOUBLE_REQUEST(5000, "重复请求"),
    ALIPAY_NOT_INSTALLED(5001, "未安装支付宝"),
    INVOKE_ALIPAY_FAIL(5002, "拉端失败"),
    PAY_WAITTING(JosStatusCodes.RTN_CODE_COMMON_ERROR, "支付结果确认中");
    
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String memo;
    private int status;

    ResultStatus(int i, String str) {
        this.status = i;
        this.memo = str;
    }

    public static ResultStatus getResultState(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ResultStatus) ipChange.ipc$dispatch("acea4a26", new Object[]{new Integer(i)});
        }
        if (i == 4001) {
            return PARAMS_ERROR;
        }
        if (i == 8000) {
            return PAY_WAITTING;
        }
        if (i == 9000) {
            return SUCCEEDED;
        }
        if (i == 6001) {
            return CANCELED;
        }
        if (i == 6002) {
            return NETWORK_ERROR;
        }
        switch (i) {
            case 5000:
                return DOUBLE_REQUEST;
            case 5001:
                return ALIPAY_NOT_INSTALLED;
            case 5002:
                return INVOKE_ALIPAY_FAIL;
            default:
                return FAILED;
        }
    }

    public static /* synthetic */ Object ipc$super(ResultStatus resultStatus, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/sdk/app/ResultStatus");
    }

    public static ResultStatus valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ResultStatus) ipChange.ipc$dispatch("e2f4d501", new Object[]{str});
        }
        return (ResultStatus) Enum.valueOf(ResultStatus.class, str);
    }

    public final String getMemo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("29191f49", new Object[]{this});
        }
        return this.memo;
    }

    public final int getStatus() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fcf6c362", new Object[]{this})).intValue();
        }
        return this.status;
    }

    public final void setMemo(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e8a0a4d", new Object[]{this, str});
        } else {
            this.memo = str;
        }
    }

    public final void setStatus(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("384790e8", new Object[]{this, new Integer(i)});
        } else {
            this.status = i;
        }
    }
}
