package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class ovy {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DEFAULT_USERID = "noLogin";

    /* renamed from: a  reason: collision with root package name */
    public static final ReentrantLock f25703a = new ReentrantLock();

    static {
        t2o.a(1007681543);
    }

    public static final /* synthetic */ ReentrantLock a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ReentrantLock) ipChange.ipc$dispatch("65a30838", new Object[0]);
        }
        return f25703a;
    }
}
