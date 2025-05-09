package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class ftl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static List<String> f19522a = new ArrayList();

    static {
        t2o.a(665845905);
    }

    public static synchronized String a(String str) {
        synchronized (ftl.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("14c8ee3a", new Object[]{str});
            }
            if (f19522a != null && !TextUtils.isEmpty(str)) {
                ArrayList arrayList = new ArrayList(f19522a);
                for (int i = 0; i < arrayList.size(); i++) {
                    str = str.replace((String) arrayList.get(i), "");
                }
                return str;
            }
            return str;
        }
    }

    public static synchronized void b(List<String> list) {
        ArrayList arrayList;
        synchronized (ftl.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cbca6f3", new Object[]{list});
                return;
            }
            if (list == null) {
                arrayList = null;
            } else {
                arrayList = new ArrayList(list);
            }
            f19522a = arrayList;
        }
    }
}
