package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class wk8 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EVENT_HIDE_BACK_ICON = "hide_back_icon";
    public static final String EVENT_SET_NAV_BAR_STYLE = "set_nav_bar_style";
    public static final String EVENT_SHOW_BACK_ICON = "show_back_icon";
    public static final String KEY_DATA = "data";
    public static final wk8 INSTANCE = new wk8();

    /* renamed from: a  reason: collision with root package name */
    public static final Map<String, List<l3c>> f30740a = new ConcurrentHashMap();

    static {
        t2o.a(1031798810);
    }

    public final void a(List<String> list, l3c l3cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28a259b7", new Object[]{this, list, l3cVar});
            return;
        }
        List<String> list2 = list;
        if (!(list2 == null || list2.isEmpty() || l3cVar == null)) {
            for (String str : list) {
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) f30740a;
                Object obj = concurrentHashMap.get(str);
                if (obj == null) {
                    obj = new ArrayList();
                    concurrentHashMap.put(str, obj);
                }
                List list3 = (List) obj;
                if (!list3.contains(l3cVar)) {
                    list3.add(l3cVar);
                }
            }
        }
    }

    public final void b(List<String> list, l3c l3cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b47851a", new Object[]{this, list, l3cVar});
            return;
        }
        List<String> list2 = list;
        if (!(list2 == null || list2.isEmpty() || l3cVar == null)) {
            for (String str : list) {
                List list3 = (List) ((ConcurrentHashMap) f30740a).get(str);
                if (list3 != null) {
                    list3.remove(l3cVar);
                }
            }
        }
    }

    public final void c(String str, Map<String, ? extends Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88045422", new Object[]{this, str, map});
            return;
        }
        List<l3c> list = (List) ((ConcurrentHashMap) f30740a).get(str);
        if (list != null) {
            for (l3c l3cVar : list) {
                l3cVar.onEvent(str, map);
            }
        }
    }
}
