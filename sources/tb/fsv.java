package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class fsv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final List<pz> f19514a = new CopyOnWriteArrayList();

    static {
        t2o.a(81789219);
    }

    public void a(pz pzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9a7fc91", new Object[]{this, pzVar});
        } else if (pzVar != null) {
            ((CopyOnWriteArrayList) this.f19514a).add(pzVar);
        }
    }
}
