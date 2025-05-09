package com.uc.webview.export.internal.setup;

import com.uc.webview.base.UCKnownException;

/* compiled from: Taobao */
@Deprecated
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class UCSetupException extends UCKnownException {
    public UCSetupException(int i, String str, Throwable th) {
        super(i, str, th);
    }

    public UCSetupException(int i, String str) {
        this(i, str, null);
    }

    public UCSetupException(Throwable th) {
        this(-1, null, th);
    }
}
