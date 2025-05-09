package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.iz;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class c6h extends m6v {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final a j;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public interface a {
    }

    static {
        t2o.a(153092106);
    }

    public c6h(a aVar) {
        this.j = aVar;
    }

    public static /* synthetic */ Object ipc$super(c6h c6hVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/ultron/common/page/LoadDataSubscriber");
    }

    @Override // tb.m6v
    public void F(b8v b8vVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("146e2815", new Object[]{this, b8vVar});
            return;
        }
        D(b8vVar);
        if (b8vVar.n() instanceof com.alibaba.android.ultron.vfw.instance.a) {
            com.alibaba.android.ultron.vfw.instance.a aVar = (com.alibaba.android.ultron.vfw.instance.a) b8vVar.n();
            JSONObject k = b8vVar.k(m6v.KEY_EVENT_CHAIN_DATA);
            if (k != null) {
                aVar.e0(k, null);
            }
            a aVar2 = this.j;
            if (aVar2 != null) {
                ((iz.b) aVar2).a(k);
            }
        }
    }
}
