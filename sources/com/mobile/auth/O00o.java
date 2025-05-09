package com.mobile.auth;

import com.alipay.android.msp.utils.ExceptionUtils;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class O00o {
    private int O000000o;
    private String O00000Oo;

    private O00o(int i, String str) {
        this.O000000o = i;
        this.O00000Oo = str;
    }

    public int O000000o() {
        return this.O000000o;
    }

    public String O00000Oo() {
        return this.O00000Oo;
    }

    public static O00o O000000o(int i) {
        switch (i) {
            case 102102:
                return new O00o(102102, "网络异常");
            case 102223:
                return new O00o(102223, ExceptionUtils.ERROR_MSG_DATA_ERROR);
            case 102508:
                return new O00o(102508, "数据网络切换失败");
            case 200025:
                return new O00o(200025, "登录超时");
            case 200039:
                return new O00o(200039, "电信取号接口失败");
            case 200050:
                return new O00o(200050, "EOF异常");
            default:
                return new O00o(i, "网络异常");
        }
    }
}
