package com.alipay.android.phone.iifaa.did.rpc.model;

import com.alipay.android.phone.iifaa.did.common.DigitalEnvelopeModel;
import java.io.Serializable;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class CredentialRpcData implements Serializable {
    public static final String ACTION_BOTH = "both";
    public static final String ACTION_DISCLOSE = "disclose";
    public static final String ACTION_FETCH = "fetch";
    public String action;
    public ServiceProviderModel spConfig;
    public DigitalEnvelopeModel vcData;
}
