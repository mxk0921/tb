package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class etq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final ArrayList<String> f18810a = new ArrayList<>();

    static {
        t2o.a(970981391);
    }

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce35fee5", new Object[]{str});
            return;
        }
        synchronized (etq.class) {
            try {
                ArrayList<String> arrayList = f18810a;
                if (!arrayList.contains(str)) {
                    arrayList.add(str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static String b() {
        String obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f6a75558", new Object[0]);
        }
        synchronized (etq.class) {
            obj = f18810a.toString();
        }
        return obj;
    }
}
