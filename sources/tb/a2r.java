package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.task.Coordinator;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class a2r extends Coordinator.TaggedRunnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Object f15513a;
    public final /* synthetic */ b2r b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2r(b2r b2rVar, String str, Object obj) {
        super(str);
        this.f15513a = obj;
    }

    public static /* synthetic */ Object ipc$super(a2r a2rVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/launcher/SyncDecorator$1");
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
        } else {
            b2r.a(null, this.f15513a);
        }
    }
}
