package tb;

import android.app.Activity;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class d2v {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final Map<Long, a> f17533a = new ConcurrentHashMap();
    public static final Map<Long, Map<String, String>> b = new ConcurrentHashMap();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class a {
        public ArrayList<Integer> eventIdList;
        public int pageHashCode = 0;
        public ArrayList<String> propertyKeyList;

        static {
            t2o.a(962593171);
        }
    }

    static {
        t2o.a(962593170);
    }

    public static synchronized void a(long j) {
        synchronized (d2v.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d17cb4f0", new Object[]{new Long(j)});
                return;
            }
            try {
                Map<Long, a> map = f17533a;
                if (((ConcurrentHashMap) map).size() > 20) {
                    long j2 = j - 10;
                    Iterator it = ((ConcurrentHashMap) map).entrySet().iterator();
                    while (it.hasNext()) {
                        if (((Long) ((Map.Entry) it.next()).getKey()).longValue() < j2) {
                            it.remove();
                        }
                    }
                }
                Map<Long, Map<String, String>> map2 = b;
                if (((ConcurrentHashMap) map2).size() > 20) {
                    long j3 = j - 10;
                    Iterator it2 = ((ConcurrentHashMap) map2).entrySet().iterator();
                    while (it2.hasNext()) {
                        if (((Long) ((Map.Entry) it2.next()).getKey()).longValue() < j3) {
                            it2.remove();
                        }
                    }
                }
            } catch (Exception e) {
                nhh.h("UTPagePropertiesHelper", e, new Object[0]);
            }
        }
    }

    public static synchronized void setPageSessionPropertiesRule(Activity activity, ArrayList<Integer> arrayList, ArrayList<String> arrayList2) {
        synchronized (d2v.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("11634b0d", new Object[]{activity, arrayList, arrayList2});
            } else if (activity != null) {
                try {
                    long utPvid = l2v.getUtPvid();
                    a aVar = new a();
                    aVar.pageHashCode = activity.hashCode();
                    if (arrayList != null) {
                        aVar.eventIdList = new ArrayList<>(arrayList);
                    } else {
                        aVar.eventIdList = null;
                    }
                    if (arrayList2 != null) {
                        aVar.propertyKeyList = new ArrayList<>(arrayList2);
                    } else {
                        aVar.propertyKeyList = null;
                    }
                    ((ConcurrentHashMap) f17533a).put(Long.valueOf(utPvid), aVar);
                    updatePageProperties(c2v.getInstance().getPageAllProperties(activity));
                    a(utPvid);
                } catch (Exception e) {
                    nhh.h("UTPagePropertiesHelper", e, new Object[0]);
                }
            }
        }
    }

    public static synchronized void updateEventProperties(int i, Map<String, String> map) {
        long utPvid;
        a aVar;
        ArrayList<Integer> arrayList;
        synchronized (d2v.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("db98360d", new Object[]{new Integer(i), map});
                return;
            }
            try {
                utPvid = l2v.getUtPvid();
                aVar = (a) ((ConcurrentHashMap) f17533a).get(Long.valueOf(utPvid));
            } catch (Exception e) {
                nhh.h("UTPagePropertiesHelper", e, new Object[0]);
            }
            if (!(aVar == null || (arrayList = aVar.eventIdList) == null || aVar.propertyKeyList == null || !arrayList.contains(Integer.valueOf(i)))) {
                Map map2 = (Map) ((ConcurrentHashMap) b).get(Long.valueOf(utPvid));
                if (map2 != null) {
                    for (Map.Entry entry : map2.entrySet()) {
                        String str = (String) entry.getKey();
                        if (!map.containsKey(str)) {
                            map.put(str, (String) entry.getValue());
                        }
                    }
                }
            }
        }
    }

    public static synchronized void updatePageProperties(Object obj) {
        long utPvid;
        a aVar;
        Activity activity;
        String str;
        synchronized (d2v.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9a79fcae", new Object[]{obj});
                return;
            }
            try {
                utPvid = l2v.getUtPvid();
                aVar = (a) ((ConcurrentHashMap) f17533a).get(Long.valueOf(utPvid));
            } catch (Exception e) {
                nhh.h("UTPagePropertiesHelper", e, new Object[0]);
            }
            if (!(aVar == null || aVar.eventIdList == null || aVar.propertyKeyList == null)) {
                if (obj instanceof Activity) {
                    activity = (Activity) obj;
                } else {
                    activity = null;
                }
                if (activity != null && aVar.pageHashCode == activity.hashCode()) {
                    Map<String, String> pageAllProperties = c2v.getInstance().getPageAllProperties(activity);
                    if (pageAllProperties == null) {
                        ((ConcurrentHashMap) b).remove(Long.valueOf(utPvid));
                        return;
                    }
                    ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
                    Iterator<String> it = aVar.propertyKeyList.iterator();
                    while (it.hasNext()) {
                        String next = it.next();
                        if (pageAllProperties.containsKey(next) && (str = pageAllProperties.get(next)) != null) {
                            concurrentHashMap.put(next, str);
                        }
                    }
                    ((ConcurrentHashMap) b).put(Long.valueOf(utPvid), concurrentHashMap);
                }
            }
        }
    }
}
