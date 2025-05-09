package com.alipay.android.phone.iifaa.did.model;

import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class VerificationMethod {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String VM_JWK2020 = "JsonWebKey2020";
    public String controller;
    public String id;
    public String publicKey;
    public PublicKeyJwk publicKeyJwk;
    public int securityLevel;
    public String status;
    public String type;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class CredentialSubject {
    }

    public static String getDerPubKey(VerificationMethod verificationMethod) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4acf4216", new Object[]{verificationMethod});
        }
        if (!VM_JWK2020.equals(verificationMethod.getType()) || verificationMethod.getPublicKeyJwk() == null || !"EC".equals(verificationMethod.getPublicKeyJwk().getKty())) {
            return null;
        }
        return verificationMethod.getPublicKeyJwk().genDerKey();
    }

    public String getController() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e35f62a7", new Object[]{this});
        }
        return this.controller;
    }

    public String getId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("81e05888", new Object[]{this});
        }
        return this.id;
    }

    public String getPublicKey() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("93591e79", new Object[]{this});
        }
        return this.publicKey;
    }

    public PublicKeyJwk getPublicKeyJwk() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PublicKeyJwk) ipChange.ipc$dispatch("6cf04637", new Object[]{this});
        }
        return this.publicKeyJwk;
    }

    public int getSecurityLevel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e97c15e8", new Object[]{this})).intValue();
        }
        return this.securityLevel;
    }

    public String getStatus() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("71829d11", new Object[]{this});
        }
        return this.status;
    }

    public String getType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("13e5e549", new Object[]{this});
        }
        return this.type;
    }

    public void setController(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff7679af", new Object[]{this, str});
        } else {
            this.controller = str;
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

    public void setPublicKey(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a086c85", new Object[]{this, str});
        } else {
            this.publicKey = str;
        }
    }

    public void setPublicKeyJwk(PublicKeyJwk publicKeyJwk) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f690f91", new Object[]{this, publicKeyJwk});
        } else {
            this.publicKeyJwk = publicKeyJwk;
        }
    }

    public void setSecurityLevel(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd329dba", new Object[]{this, new Integer(i)});
        } else {
            this.securityLevel = i;
        }
    }

    public void setStatus(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e7af285", new Object[]{this, str});
        } else {
            this.status = str;
        }
    }

    public void setType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd56044d", new Object[]{this, str});
        } else {
            this.type = str;
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
