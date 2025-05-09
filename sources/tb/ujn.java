package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class ujn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final List<j3c> f29419a;
    public final ucm b;

    static {
        t2o.a(729808986);
    }

    public ujn(ucm ucmVar) {
        ArrayList arrayList = new ArrayList();
        this.f29419a = arrayList;
        this.b = ucmVar;
        arrayList.add(new igm());
        arrayList.add(new vcm());
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b183fc01", new Object[]{this});
            return;
        }
        Iterator it = ((ArrayList) this.f29419a).iterator();
        while (it.hasNext() && !((j3c) it.next()).a(this.b)) {
        }
    }
}
