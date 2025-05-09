package tb;

import android.app.Activity;
import com.alibaba.ut.page.VirtualPageObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class vnl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final Stack<VirtualPageObject> f30127a = new Stack<>();

    public static void a(VirtualPageObject virtualPageObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3e805f7", new Object[]{virtualPageObject});
        } else if (virtualPageObject != null) {
            f30127a.remove(virtualPageObject);
        }
    }

    public static List<VirtualPageObject> b(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("ba53266a", new Object[]{activity});
        }
        ArrayList arrayList = new ArrayList();
        Iterator<VirtualPageObject> it = f30127a.iterator();
        while (it.hasNext()) {
            VirtualPageObject next = it.next();
            next.getClass();
            if (activity.hashCode() == 0) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }
}
