package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.remoteso.index.SoIndexData;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class kc7 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final Map<String, String[]> f22559a = new HashMap();

    public static void a(String str, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90e37def", new Object[]{str, strArr});
        } else {
            ((HashMap) f22559a).put(str, strArr);
        }
    }

    public static void c(String str, List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac5f13f1", new Object[]{str, list});
            return;
        }
        String[] strArr = (String[]) ((HashMap) f22559a).get(str);
        if (strArr != null) {
            for (String str2 : strArr) {
                if (!trq.c(str2) && !list.contains(str2)) {
                    c(str2, list);
                    list.add(str2);
                }
            }
        }
    }

    public List<String> b(String str, SoIndexData soIndexData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("a130a74b", new Object[]{this, str, soIndexData});
        }
        ArrayList arrayList = new ArrayList();
        c(str, arrayList);
        arrayList.add(str);
        return arrayList;
    }
}
