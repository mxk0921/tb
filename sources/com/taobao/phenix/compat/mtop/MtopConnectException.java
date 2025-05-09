package com.taobao.phenix.compat.mtop;

import com.taobao.phenix.loader.network.NetworkResponseException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class MtopConnectException extends NetworkResponseException {
    public MtopConnectException(int i) {
        super(0, "connect exception", i, null);
    }
}
