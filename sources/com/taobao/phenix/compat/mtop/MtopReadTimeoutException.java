package com.taobao.phenix.compat.mtop;

import com.taobao.phenix.loader.network.NetworkResponseException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class MtopReadTimeoutException extends NetworkResponseException {
    public MtopReadTimeoutException() {
        super(200, "Read Stream Timeout");
    }
}
