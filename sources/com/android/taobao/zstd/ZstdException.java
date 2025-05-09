package com.android.taobao.zstd;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class ZstdException extends RuntimeException {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final long errCode;

    public ZstdException(String str) {
        super(str);
        this.errCode = 0L;
    }

    public static /* synthetic */ Object ipc$super(ZstdException zstdException, String str, Object... objArr) {
        if (str.hashCode() == -926732344) {
            return super.getMessage();
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/android/taobao/zstd/ZstdException");
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c8c32fc8", new Object[]{this});
        }
        if (this.errCode == 0) {
            return super.getMessage();
        }
        return super.getMessage() + " errCode=" + this.errCode;
    }

    public ZstdException(long j) {
        super(Zstd.getErrorMessage(j));
        this.errCode = j;
    }
}
