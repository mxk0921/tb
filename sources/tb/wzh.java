package tb;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class wzh extends Handler {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(919601220);
    }

    public wzh() {
        super(Looper.getMainLooper());
    }

    public static /* synthetic */ Object ipc$super(wzh wzhVar, String str, Object... objArr) {
        if (str.hashCode() == 40891567) {
            return new Boolean(super.sendMessageAtTime((Message) objArr[0], ((Number) objArr[1]).longValue()));
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/turbo/adapter/impl/image/MainFrontHandler");
    }

    @Override // android.os.Handler
    public boolean sendMessageAtTime(Message message, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("26ff4af", new Object[]{this, message, new Long(j)})).booleanValue();
        }
        ckf.g(message, "msg");
        return super.sendMessageAtTime(message, 0L);
    }
}
