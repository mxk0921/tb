package com.alipay.android.phone.mobilesdk.socketcraft.exceptions;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class InvalidDataException extends Exception {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final long serialVersionUID = 3731842424390998726L;
    private int closecode;

    public InvalidDataException(int i) {
        this.closecode = i;
    }

    public static /* synthetic */ Object ipc$super(InvalidDataException invalidDataException, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/android/phone/mobilesdk/socketcraft/exceptions/InvalidDataException");
    }

    public int getCloseCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d42ffa49", new Object[]{this})).intValue();
        }
        return this.closecode;
    }

    public InvalidDataException(int i, String str) {
        super(str);
        this.closecode = i;
    }

    public InvalidDataException(int i, Throwable th) {
        super(th);
        this.closecode = i;
    }

    public InvalidDataException(int i, String str, Throwable th) {
        super(str, th);
        this.closecode = i;
    }
}
