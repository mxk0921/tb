package com.alipay.mobile.intelligentdecision.rpc;

import com.alipay.mobile.intelligentdecision.log.DecisionLogcat;
import com.alipay.mobile.intelligentdecision.rpc.biz.IDRpcServiceBizBase;
import com.alipay.mobile.verifyidentity.rpc.RpcException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class IDRpcServiceBiz {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final AtomicBoolean b = new AtomicBoolean(false);

    /* renamed from: a  reason: collision with root package name */
    public final String f4265a = IDRpcServiceBiz.class.getSimpleName();

    public IDConfigResponse config(IDConfigRequest iDConfigRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IDConfigResponse) ipChange.ipc$dispatch("b2908ba9", new Object[]{this, iDConfigRequest});
        }
        AtomicBoolean atomicBoolean = b;
        atomicBoolean.set(true);
        try {
            try {
                IDConfigResponse config = new IDRpcServiceBizBase("").config(iDConfigRequest);
                atomicBoolean.set(false);
                return config;
            } catch (RpcException e) {
                throw e;
            } catch (Exception e2) {
                String str = this.f4265a;
                DecisionLogcat.a(str, "report error:" + e2.getMessage());
                b.set(false);
                return null;
            }
        } catch (Throwable th) {
            b.set(false);
            throw th;
        }
    }

    public IDRpcResponse report(IDRpcRequest iDRpcRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IDRpcResponse) ipChange.ipc$dispatch("15adeccb", new Object[]{this, iDRpcRequest});
        }
        AtomicBoolean atomicBoolean = b;
        atomicBoolean.set(true);
        try {
            try {
                IDRpcResponse report = new IDRpcServiceBizBase("").report(iDRpcRequest);
                atomicBoolean.set(false);
                return report;
            } catch (RpcException e) {
                throw e;
            } catch (Exception e2) {
                String str = this.f4265a;
                DecisionLogcat.a(str, "report error:" + e2.getMessage());
                b.set(false);
                return null;
            }
        } catch (Throwable th) {
            b.set(false);
            throw th;
        }
    }
}
