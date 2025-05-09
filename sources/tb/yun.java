package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.gav;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class yun extends n6v {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final a j;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public interface a {
    }

    static {
        t2o.a(614465555);
    }

    public yun(a aVar) {
        this.j = aVar;
    }

    public static /* synthetic */ Object ipc$super(yun yunVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/ultron/event/ext/RefreshPageV2Subscriber");
    }

    @Override // tb.n6v
    public String B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f4e47c3c", new Object[]{this});
        }
        return "5273961824614203275";
    }

    @Override // tb.n6v
    public void I(b8v b8vVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("146e2815", new Object[]{this, b8vVar});
            return;
        }
        a aVar = this.j;
        if (aVar != null) {
            ((gav.c) aVar).a(b8vVar);
        } else if (b8vVar.n() instanceof com.alibaba.android.ultron.vfw.instance.a) {
            ((com.alibaba.android.ultron.vfw.instance.a) b8vVar.n()).X(127);
        }
    }
}
