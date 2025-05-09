package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.recommend4.manager.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class ron {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static List<String> f27512a = null;
    public static List<String> b = null;

    static {
        t2o.a(729809936);
    }

    public static boolean a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6750d577", new Object[]{aVar})).booleanValue();
        }
        if (aVar == null || aVar.getContainerType() == null) {
            return false;
        }
        return b(aVar.getContainerType());
    }

    public static boolean b(z4a z4aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cbf78419", new Object[]{z4aVar})).booleanValue();
        }
        if (b == null) {
            b = new ArrayList();
            String f = f4b.f();
            if (!TextUtils.isEmpty(f)) {
                ((ArrayList) b).addAll(Arrays.asList(f.split(",")));
            }
        }
        List<String> list = b;
        if (list == null || z4aVar == null || !((ArrayList) list).contains(z4aVar.b)) {
            return false;
        }
        return true;
    }

    public static boolean c(z4a z4aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("671f1a1", new Object[]{z4aVar})).booleanValue();
        }
        if (f27512a == null) {
            f27512a = new ArrayList();
            String g = f4b.g();
            if (!TextUtils.isEmpty(g)) {
                ((ArrayList) f27512a).addAll(Arrays.asList(g.split(",")));
            }
        }
        if (f27512a != null && z4aVar != null && z4aVar.b.equals("cart")) {
            return ((ArrayList) f27512a).contains("cartWindVane");
        }
        List<String> list = f27512a;
        if (list == null || z4aVar == null || !((ArrayList) list).contains(z4aVar.b)) {
            return false;
        }
        return true;
    }

    public static boolean d(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e57bf5bb", new Object[]{aVar})).booleanValue();
        }
        if (aVar == null || aVar.getContainerType() == null) {
            return false;
        }
        return c(aVar.getContainerType());
    }
}
