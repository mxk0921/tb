package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.task.Coordinator;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class be1 extends Coordinator.TaggedRunnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Object f16341a;
    public final /* synthetic */ ce1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public be1(ce1 ce1Var, String str, Object obj) {
        super(str);
        this.f16341a = obj;
    }

    public static /* synthetic */ Object ipc$super(be1 be1Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/launcher/AsyncDecorator$1");
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
        } else {
            ce1.a(null, this.f16341a);
        }
    }
}
