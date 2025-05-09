package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.ut.mini.UTAnalytics;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class y0v {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, v0v> f31772a;
    public int b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements Comparator<Map.Entry<String, v0v>> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public int compare(Map.Entry<String, v0v> entry, Map.Entry<String, v0v> entry2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("51cd4c3f", new Object[]{this, entry, entry2})).intValue();
            }
            v0v value = entry.getValue();
            v0v value2 = entry2.getValue();
            if (value == null || value2 == null || value.getBeginTime() > value2.getBeginTime()) {
                return 1;
            }
            return value.getBeginTime() < value2.getBeginTime() ? -1 : 0;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final y0v f31773a = new y0v(null);

        static {
            t2o.a(962593156);
        }

        public static /* synthetic */ y0v access$100() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (y0v) ipChange.ipc$dispatch("9a5561a", new Object[0]);
            }
            return f31773a;
        }
    }

    static {
        t2o.a(962593154);
    }

    public /* synthetic */ y0v(a aVar) {
        this();
    }

    public static y0v getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (y0v) ipChange.ipc$dispatch("cb181780", new Object[0]);
        }
        return b.access$100();
    }

    public final synchronized void a() {
        int i = 0;
        synchronized (this) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a9632e5e", new Object[]{this});
                return;
            }
            ArrayList arrayList = new ArrayList(((ConcurrentHashMap) this.f31772a).entrySet());
            Collections.sort(arrayList, new a());
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((ConcurrentHashMap) this.f31772a).remove((String) ((Map.Entry) it.next()).getKey());
                this.b--;
                i++;
                if (i >= 50) {
                    return;
                }
            }
        }
    }

    public synchronized void endEvent(v0v v0vVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("940650f6", new Object[]{this, v0vVar});
            return;
        }
        if (v0vVar != null && ((ConcurrentHashMap) this.f31772a).containsKey(v0vVar.getKey())) {
            ((ConcurrentHashMap) this.f31772a).remove(v0vVar.getKey());
            this.b--;
            v0vVar.end();
            p3v.getInstance().endEvent(v0vVar);
            if (v0vVar.getEventId() >= 0 && v0vVar.getToLog()) {
                UTAnalytics.getInstance().getDefaultTracker().send(v0vVar.build());
            }
        }
    }

    public synchronized void endEventByKey(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3097511a", new Object[]{this, str});
            return;
        }
        if (((ConcurrentHashMap) this.f31772a).containsKey(str)) {
            endEvent(getEventByKey(str));
        }
    }

    public synchronized v0v getEventByKey(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (v0v) ipChange.ipc$dispatch("6299ae81", new Object[]{this, str});
        }
        v0v v0vVar = (v0v) ((ConcurrentHashMap) this.f31772a).get(str);
        if (v0vVar != null) {
            return v0vVar;
        }
        return new v0v(str);
    }

    public String getKeyForObject(Object obj) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cf5ac53e", new Object[]{this, obj});
        }
        if (obj == null) {
            return null;
        }
        if (obj instanceof String) {
            str = (String) obj;
        } else {
            str = obj.getClass().getSimpleName();
        }
        int hashCode = obj.hashCode();
        return str + hashCode;
    }

    public synchronized void sendAndBeginEvent(v0v v0vVar, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("772b3e50", new Object[]{this, v0vVar, map});
            return;
        }
        if (map != null) {
            map.put(v0v.TAG_UTEVENT, "1");
            UTAnalytics.getInstance().getDefaultTracker().send(map);
        }
        if (v0vVar != null) {
            v0vVar.setToLog(false);
            v0vVar.setToTrigger(false);
            beginEvent(v0vVar);
        }
    }

    public synchronized void updateEvent(v0v v0vVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2d2ec64", new Object[]{this, v0vVar});
            return;
        }
        if (v0vVar != null && ((ConcurrentHashMap) this.f31772a).containsKey(v0vVar.getKey())) {
            p3v.getInstance().updateEvent(v0vVar);
        }
    }

    public synchronized void updateEventPageName(v0v v0vVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f5440ca", new Object[]{this, v0vVar});
            return;
        }
        if (v0vVar != null && ((ConcurrentHashMap) this.f31772a).containsKey(v0vVar.getKey())) {
            p3v.getInstance().updateEventPageName(v0vVar);
        }
    }

    public y0v() {
        this.b = 0;
        this.f31772a = new ConcurrentHashMap();
    }

    public synchronized void beginEvent(v0v v0vVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("345e2444", new Object[]{this, v0vVar});
        } else if (v0vVar != null) {
            String key = v0vVar.getKey();
            if (!hsq.f(key)) {
                if (!((ConcurrentHashMap) this.f31772a).containsKey(key)) {
                    this.b++;
                } else if (!v0vVar.getH5Pv()) {
                    return;
                }
                v0vVar.begin();
                ((ConcurrentHashMap) this.f31772a).put(key, v0vVar);
                p3v.getInstance().beginEvent(v0vVar);
                if (this.b > 500) {
                    long currentTimeMillis = System.currentTimeMillis();
                    a();
                    nhh.v("UTEventTracker", "removeOldEvent cost", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
                }
            }
        }
    }
}
