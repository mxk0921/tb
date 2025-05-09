package com.alipay.android.msp.pay.results;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.support.api.entity.core.JosStatusCodes;
import tv.danmaku.ijk.media.player.TaobaoMediaPlayer;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public enum ResultStatus {
    SUCCEEDED(9000, "支付成功"),
    FAILED(4000, "系统繁忙，请稍后再试"),
    PARAMS_ERROR(4001, "参数错误"),
    CANCELED(6001, "支付未完成"),
    NETWORK_ERROR(6002, "网络连接异常"),
    PAY_NETWORK_ERROR(6004, "支付网络连接异常"),
    PAY_IGNORE_CODE(6006, "支付正常退出，业务无需关注结果码"),
    ACTIVITY_NOT_START_EXIT(6007, "支付未完成"),
    PAY_EXCEPTION_CODE(7001, "支付被动退出，业务无需关注结果码"),
    PAY_WAITING(JosStatusCodes.RTN_CODE_COMMON_ERROR, "支付结果确认中"),
    FRONT_CHANNEL_SEL(10000, "前置渠道切换成功"),
    START_ACTIVITY_FAILED(TaobaoMediaPlayer.FFP_PROP_INT64_DISABLE_HLS_DISCON, "外部商户远程启动支付页面失败");
    
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
            return (ResultStatus) ipChange.ipc$dispatch("df2537c4", new Object[]{new Integer(i)});
        }
        if (i == 4001) {
            return PARAMS_ERROR;
        }
        if (i == 6004) {
            return PAY_NETWORK_ERROR;
        }
        if (i == 6006) {
            return PAY_IGNORE_CODE;
        }
        if (i == 8000) {
            return PAY_WAITING;
        }
        if (i == 9000) {
            return SUCCEEDED;
        }
        if (i == 10000) {
            return FRONT_CHANNEL_SEL;
        }
        if (i == 17000) {
            return START_ACTIVITY_FAILED;
        }
        if (i == 6001) {
            return CANCELED;
        }
        if (i != 6002) {
            return FAILED;
        }
        return NETWORK_ERROR;
    }

    public static /* synthetic */ Object ipc$super(ResultStatus resultStatus, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/android/msp/pay/results/ResultStatus");
    }

    public static ResultStatus valueOf(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ResultStatus) ipChange.ipc$dispatch("542cac9f", new Object[]{str});
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
