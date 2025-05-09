package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.iz;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class zun extends m6v {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final a j;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public interface a {
    }

    static {
        t2o.a(156237843);
    }

    public zun(a aVar) {
        this.j = aVar;
    }

    public static /* synthetic */ Object ipc$super(zun zunVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/ultron/ext/event/RefreshPageV2Subscriber");
    }

    @Override // tb.m6v
    public void F(b8v b8vVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("146e2815", new Object[]{this, b8vVar});
            return;
        }
        a aVar = this.j;
        if (aVar != null) {
            ((iz.a) aVar).a(b8vVar);
        } else if (b8vVar.n() instanceof com.alibaba.android.ultron.vfw.instance.a) {
            ((com.alibaba.android.ultron.vfw.instance.a) b8vVar.n()).X(127);
        }
    }
}
