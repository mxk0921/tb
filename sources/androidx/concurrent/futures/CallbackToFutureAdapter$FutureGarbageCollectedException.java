package androidx.concurrent.futures;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class CallbackToFutureAdapter$FutureGarbageCollectedException extends Throwable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public CallbackToFutureAdapter$FutureGarbageCollectedException(String str) {
        super(str);
    }

    public static /* synthetic */ Object ipc$super(CallbackToFutureAdapter$FutureGarbageCollectedException callbackToFutureAdapter$FutureGarbageCollectedException, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/concurrent/futures/CallbackToFutureAdapter$FutureGarbageCollectedException");
    }

    @Override // java.lang.Throwable
    public synchronized Throwable fillInStackTrace() {
        IpChange ipChange = $ipChange;
        if (!(ipChange instanceof IpChange)) {
            return this;
        }
        return (Throwable) ipChange.ipc$dispatch("6c8bc0b1", new Object[]{this});
    }
}
