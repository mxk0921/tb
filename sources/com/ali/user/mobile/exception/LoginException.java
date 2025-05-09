package com.ali.user.mobile.exception;

import com.ali.user.mobile.rpc.RpcResponse;
import com.ali.user.mobile.utils.ResourceUtil;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class LoginException<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int code;
    private String message;
    private RpcResponse<T> orinResponse;

    static {
        t2o.a(68157485);
    }

    public LoginException(int i, String str, RpcResponse<T> rpcResponse) {
        ResourceUtil.getNetworkError();
        this.code = i;
        this.message = str;
        this.orinResponse = rpcResponse;
    }

    public int getCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("480bb15d", new Object[]{this})).intValue();
        }
        return this.code;
    }

    public String getMsg() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a817838e", new Object[]{this});
        }
        return this.message;
    }

    public RpcResponse<T> getOrinResponse() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RpcResponse) ipChange.ipc$dispatch("b24de103", new Object[]{this});
        }
        return this.orinResponse;
    }

    public LoginException(int i, String str) {
        ResourceUtil.getNetworkError();
        this.code = i;
        this.message = str;
    }
}
