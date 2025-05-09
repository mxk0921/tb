package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.remoteso.log.RSoLog;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class m0n {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Set<a> f23698a = new CopyOnWriteArraySet();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface a {
        void a(int i);

        String module();
    }

    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8d5884a", new Object[]{this, aVar});
            return;
        }
        RSoLog.d("progress-> registerListener = " + aVar);
        ((CopyOnWriteArraySet) this.f23698a).add(aVar);
    }

    public void b(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac866591", new Object[]{this, aVar});
            return;
        }
        RSoLog.d("progress-> unregisterListener = " + aVar);
        ((CopyOnWriteArraySet) this.f23698a).remove(aVar);
    }

    public void c(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d058bbc", new Object[]{this, str, new Integer(i)});
            return;
        }
        Iterator it = ((CopyOnWriteArraySet) this.f23698a).iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (trq.d(str, aVar.module())) {
                RSoLog.d("progress-> onUpdate, module=" + str + ", updateCallback=" + aVar);
                aVar.a(i);
            }
        }
    }
}
