package com.taobao.phenix.loader.network;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.f7l;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class NetworkResponseException extends RuntimeException {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final int mExtraCode;
    private final int mHttpCode;

    static {
        t2o.a(620757122);
    }

    public NetworkResponseException(int i, String str, int i2, Throwable th) {
        super(str, th);
        this.mHttpCode = i;
        this.mExtraCode = i2;
    }

    public static /* synthetic */ Object ipc$super(NetworkResponseException networkResponseException, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/phenix/loader/network/NetworkResponseException");
    }

    public int getExtraCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b0a61861", new Object[]{this})).intValue();
        }
        return this.mExtraCode;
    }

    public int getHttpCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("58026b05", new Object[]{this})).intValue();
        }
        return this.mHttpCode;
    }

    @Override // java.lang.Throwable
    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return getClass().getName() + "(httpCode=" + this.mHttpCode + ", extraCode=" + this.mExtraCode + ", desc=" + getMessage() + f7l.BRACKET_END_STR;
    }

    public NetworkResponseException(int i, String str) {
        this(i, str, 0, null);
    }
}
