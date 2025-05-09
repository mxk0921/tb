package com.alipay.mobile.verifyidentity.data;

import com.alipay.mobileic.core.model.rpc.MICRpcResponse;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class ModuleExecuteResult {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public HashMap<String, Object> f4285a;
    public boolean b = false;
    public boolean c = false;
    public String d = "";
    public MICRpcResponse mMICRpcResponse;

    public HashMap<String, Object> getExtInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("e0498ba3", new Object[]{this});
        }
        return this.f4285a;
    }

    public String getLogicModuleName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fcbf817a", new Object[]{this});
        }
        return this.d;
    }

    public MICRpcResponse getMICRpcResponse() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MICRpcResponse) ipChange.ipc$dispatch("6709caaa", new Object[]{this});
        }
        return this.mMICRpcResponse;
    }

    public boolean isFindPay() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("aec7adb0", new Object[]{this})).booleanValue();
        }
        return this.c;
    }

    public boolean isLocalTrans() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8478d3d2", new Object[]{this})).booleanValue();
        }
        return this.b;
    }

    public void setExtInfo(HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6361d37f", new Object[]{this, hashMap});
        } else {
            this.f4285a = hashMap;
        }
    }

    public void setFindAndPay(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d59ce41", new Object[]{this, new Boolean(z)});
        } else {
            this.c = z;
        }
    }

    public void setLocalTrans(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f715528e", new Object[]{this, new Boolean(z)});
        } else {
            this.b = z;
        }
    }

    public void setLogicModuleName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("555882a4", new Object[]{this, str});
        } else {
            this.d = str;
        }
    }

    public void setMICRpcResponse(MICRpcResponse mICRpcResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ad42d36", new Object[]{this, mICRpcResponse});
        } else {
            this.mMICRpcResponse = mICRpcResponse;
        }
    }
}
