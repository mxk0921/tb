package com.taobao.phenix.compat.mtop;

import com.taobao.phenix.loader.network.NetworkResponseException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class MtopConnectTimeoutException extends NetworkResponseException {
    public MtopConnectTimeoutException(int i) {
        super(0, "Connect Server Timeout", i, null);
    }
}
