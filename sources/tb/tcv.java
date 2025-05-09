package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class tcv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final List<String> f28641a = new ArrayList();

    static {
        t2o.a(157286561);
    }

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a4b45dc", new Object[]{str});
            return;
        }
        List<String> list = f28641a;
        if (!((ArrayList) list).contains(str)) {
            ((ArrayList) list).add(str);
        }
    }

    public static boolean b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("45c3f0e9", new Object[]{str})).booleanValue();
        }
        if (str == null) {
            return false;
        }
        return ((ArrayList) f28641a).contains(str);
    }
}
