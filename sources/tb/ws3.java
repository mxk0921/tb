package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.remoteso.log.RSoLog;
import com.taobao.android.remoteso.resolver2.e;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ws3 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final List<String> f30886a = new ArrayList();

    public static boolean b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6303ac73", new Object[]{str})).booleanValue();
        }
        if (!trq.e(str) || str.length() != 32) {
            return false;
        }
        return true;
    }

    public static boolean c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d6151c1", new Object[]{str})).booleanValue();
        }
        if (!trq.c(str) && str.replace(e.KEY_ABTEST_STORAGE_KEY_SUFFIX, "").replace("_re_Remote", "").length() == 32) {
            return false;
        }
        return true;
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2846277", new Object[]{this, str});
        } else if (trq.e(str)) {
            ((ArrayList) this.f30886a).add(str);
            RSoLog.d("cleaner, addPath, = " + str);
        }
    }

    public List<String> d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("a3f61bd8", new Object[]{this});
        }
        RSoLog.d("cleaner, listUsingPath, = " + this.f30886a);
        return new ArrayList(this.f30886a);
    }
}
