package com.alipay.sdk.m.b;

import com.huawei.hms.support.api.entity.core.JosStatusCodes;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public enum b {
    SUCCEEDED(9000, "处理成功"),
    FAILED(4000, "系统繁忙，请稍后再试"),
    CANCELED(6001, "用户取消"),
    NETWORK_ERROR(6002, "网络连接异常"),
    ACTIVITY_NOT_START_EXIT(6007, "支付未完成"),
    PARAMS_ERROR(4001, "参数错误"),
    DOUBLE_REQUEST(5000, "重复请求"),
    PAY_WAITTING(JosStatusCodes.RTN_CODE_COMMON_ERROR, "支付结果确认中");
    

    /* renamed from: a  reason: collision with root package name */
    private int f4521a;
    private String b;

    b(int i, String str) {
        this.f4521a = i;
        this.b = str;
    }

    public void a(String str) {
        this.b = str;
    }

    public void b(int i) {
        this.f4521a = i;
    }

    public String a() {
        return this.b;
    }

    public int b() {
        return this.f4521a;
    }

    public static b a(int i) {
        if (i == 4001) {
            return PARAMS_ERROR;
        }
        if (i == 5000) {
            return DOUBLE_REQUEST;
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
        if (i != 6002) {
            return FAILED;
        }
        return NETWORK_ERROR;
    }
}
