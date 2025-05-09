package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.fuo;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class k2k extends fuo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final k2k b = new k2k();

    /* renamed from: a  reason: collision with root package name */
    public static final riw f22364a = new wko("RxNewThreadScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx2.newthread-priority", 5).intValue())));

    public static k2k a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (k2k) ipChange.ipc$dispatch("ae6c6715", new Object[0]);
        }
        return b;
    }

    public static /* synthetic */ Object ipc$super(k2k k2kVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/virtual_thread/rxjava/schedulers/NewVirtualThreadScheduler");
    }

    public fuo.c createWorker() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fuo.c) ipChange.ipc$dispatch("c24fc352", new Object[]{this});
        }
        return new c2k(f22364a);
    }

    static {
        t2o.a(973078539);
    }
}
