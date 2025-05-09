package com.uc.webview.base;

import android.text.TextUtils;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class UCKnownException extends RuntimeException {
    public static final int CODE_DEFAULT = -1;
    private int mCode;
    private String mCodeDescription;
    private String mMessage;

    public UCKnownException(ErrorCode errorCode, String str, Throwable th) {
        this(errorCode.code, str, th);
        this.mCodeDescription = errorCode.toString();
    }

    public final int errCode() {
        return this.mCode;
    }

    public final String errCodeDescription() {
        return this.mCodeDescription;
    }

    public final String errMsg() {
        return this.mMessage;
    }

    public final Throwable getRootCause() {
        Throwable th = this;
        while (th.getCause() != null && th.getCause() != th) {
            th = th.getCause();
        }
        return th;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.mCode);
        if (!TextUtils.isEmpty(this.mCodeDescription)) {
            sb.append(":");
            sb.append(this.mCodeDescription);
        }
        sb.append(":");
        sb.append(super.toString());
        return sb.toString();
    }

    public UCKnownException(int i, String str, Throwable th) {
        super(TextUtils.isEmpty(str) ? String.valueOf(i) : str, th);
        this.mCodeDescription = null;
        this.mMessage = null;
        this.mCode = i;
        this.mMessage = TextUtils.isEmpty(str) ? String.valueOf(this.mCode) : str;
        if (this.mCode == -1) {
            while (th != null) {
                if (th instanceof UCKnownException) {
                    UCKnownException uCKnownException = (UCKnownException) th;
                    this.mCode = uCKnownException.mCode;
                    this.mCodeDescription = uCKnownException.mCodeDescription;
                    if (TextUtils.isEmpty(this.mMessage)) {
                        this.mMessage = uCKnownException.mMessage;
                        return;
                    }
                    return;
                } else if (th.getCause() != null && th.getCause() != th) {
                    th = th.getCause();
                } else {
                    return;
                }
            }
        }
    }

    public UCKnownException(Throwable th) {
        this(-1, (String) null, th);
    }
}
