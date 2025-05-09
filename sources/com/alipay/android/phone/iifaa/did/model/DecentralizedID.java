package com.alipay.android.phone.iifaa.did.model;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONField;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class DecentralizedID {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    @JSONField(name = "@context")
    public List<String> context;
    @JSONField(name = "id")
    public String id;
    @JSONField(name = "service")
    public List<String> service;
    @JSONField(name = "verificationMethods")
    public List<VerificationMethod> verificationMethods;

    public static DecentralizedID fromJson(String str) {
        Object parseObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            parseObject = ipChange.ipc$dispatch("fca9f81a", new Object[]{str});
        } else {
            parseObject = JSON.parseObject(str, DecentralizedID.class);
        }
        return (DecentralizedID) parseObject;
    }

    public void addVerificationMethod(VerificationMethod verificationMethod) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb21554a", new Object[]{this, verificationMethod});
            return;
        }
        if (this.verificationMethods == null) {
            this.verificationMethods = new ArrayList();
        }
        if (verificationMethod != null && !this.verificationMethods.contains(verificationMethod)) {
            this.verificationMethods.add(verificationMethod);
        }
    }

    public List<String> getContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("dc3e10c7", new Object[]{this});
        }
        return this.context;
    }

    public String getId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("81e05888", new Object[]{this});
        }
        return this.id;
    }

    public List<String> getService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("d368e601", new Object[]{this});
        }
        return this.service;
    }

    public List<VerificationMethod> getVerificationMethods() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("3e0b335f", new Object[]{this});
        }
        return this.verificationMethods;
    }

    public void setContext(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e5629e5", new Object[]{this, list});
        } else {
            this.context = list;
        }
    }

    public void setId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb80bee", new Object[]{this, str});
        } else {
            this.id = str;
        }
    }

    public void setService(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c85fbeb", new Object[]{this, list});
        } else {
            this.service = list;
        }
    }

    public void setVerificationMethods(List<VerificationMethod> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6d3cc4d", new Object[]{this, list});
        } else {
            this.verificationMethods = list;
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return JSON.toJSONString(this);
    }
}
