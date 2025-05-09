package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.LinkedList;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class edl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final LinkedList<gav> f18501a = new LinkedList<>();

    static {
        t2o.a(713031797);
    }

    public static gav a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gav) ipChange.ipc$dispatch("5c412d62", new Object[0]);
        }
        return f18501a.peek();
    }

    public static gav b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gav) ipChange.ipc$dispatch("dce5358", new Object[0]);
        }
        LinkedList<gav> linkedList = f18501a;
        if (linkedList.size() > 0) {
            return linkedList.pop();
        }
        return null;
    }

    public static void c(gav gavVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e1a07e1", new Object[]{gavVar});
        } else {
            f18501a.push(gavVar);
        }
    }
}
