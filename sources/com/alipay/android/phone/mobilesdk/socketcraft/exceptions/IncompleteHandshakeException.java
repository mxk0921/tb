package com.alipay.android.phone.mobilesdk.socketcraft.exceptions;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class IncompleteHandshakeException extends RuntimeException {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final long serialVersionUID = 7906596804233893092L;
    private int newsize;

    public IncompleteHandshakeException(int i) {
        this.newsize = i;
    }

    public static /* synthetic */ Object ipc$super(IncompleteHandshakeException incompleteHandshakeException, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/android/phone/mobilesdk/socketcraft/exceptions/IncompleteHandshakeException");
    }

    public int getPreferedSize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("58faa340", new Object[]{this})).intValue();
        }
        return this.newsize;
    }

    public IncompleteHandshakeException() {
        this.newsize = 0;
    }
}
