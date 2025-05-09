package tb;

import android.os.SystemClock;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ScheduledFuture;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class v0v {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG_UTEVENT = "_UtEvent";

    /* renamed from: a  reason: collision with root package name */
    public final String f29720a;
    public WeakReference<Object> b;
    public String c;
    public String d;
    public String f;
    public String g;
    public String h;
    public List<String> p;
    public List<ScheduledFuture> q;
    public int e = 0;
    public long i = 0;
    public long j = 0;
    public long k = 0;
    public final Map<String, String> l = new HashMap(16);
    public boolean m = false;
    public boolean n = true;
    public boolean o = true;
    public int r = 0;
    public int s = 0;
    public boolean t = true;

    static {
        t2o.a(962593153);
    }

    public v0v(String str) {
        this.f29720a = str;
    }

    @Deprecated
    public synchronized void addSceneName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("153f3a7", new Object[]{this, str});
            return;
        }
        if (this.p == null) {
            this.p = new ArrayList();
        }
        if (!this.p.contains(str)) {
            this.p.add(str);
        }
    }

    @Deprecated
    public synchronized void addScheduledFuture(ScheduledFuture scheduledFuture) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebee564d", new Object[]{this, scheduledFuture});
            return;
        }
        if (this.q == null) {
            this.q = new ArrayList();
        }
        if (!this.q.contains(scheduledFuture)) {
            this.q.add(scheduledFuture);
        }
    }

    public final void b(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f216f641", new Object[]{this, map});
        } else if (map != null) {
            map.remove("PAGE");
            map.remove(oeh.EVENTID);
            map.remove(oeh.ARG1);
            map.remove(oeh.ARG2);
            map.remove(oeh.ARG3);
            map.remove(oeh.ARGS);
        }
    }

    public void begin() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bffb80b0", new Object[]{this});
            return;
        }
        if (this.i <= 0) {
            this.i = System.currentTimeMillis();
        }
        if (this.j <= 0) {
            this.j = SystemClock.elapsedRealtime();
        }
    }

    public synchronized Map<String, String> build() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("ce31e56a", new Object[]{this});
        } else if (this.e <= 0) {
            return null;
        } else {
            HashMap hashMap = new HashMap(this.l);
            hashMap.put(TAG_UTEVENT, "1");
            b(hashMap);
            c(hashMap);
            return hashMap;
        }
    }

    public final void c(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32efc60c", new Object[]{this, map});
        } else if (map != null) {
            int i = this.e;
            if (i >= 0) {
                map.put(oeh.EVENTID, String.valueOf(i));
            }
            String str = this.f;
            if (str != null) {
                map.put("PAGE", str);
            }
            String str2 = this.g;
            if (str2 != null) {
                map.put(oeh.ARG1, str2);
            }
            String str3 = this.h;
            if (str3 != null) {
                map.put(oeh.ARG2, str3);
            }
            map.put(oeh.RECORD_TIMESTAMP, String.valueOf(this.i));
            map.put(oeh.ARG3, String.valueOf(this.k));
        }
    }

    @Deprecated
    public synchronized boolean containScene(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b78680ad", new Object[]{this, str})).booleanValue();
        }
        List<String> list = this.p;
        if (list == null) {
            return false;
        }
        return ((ArrayList) list).contains(str);
    }

    public void end() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a02127e2", new Object[]{this});
        } else if (this.i > 0) {
            if (this.k <= 0) {
                this.k = SystemClock.elapsedRealtime() - this.j;
            }
            a();
        }
    }

    @Deprecated
    public synchronized String get(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f6158a19", new Object[]{this, str});
        } else if ("PAGE".equals(str)) {
            return this.f;
        } else if (oeh.EVENTID.equals(str)) {
            return String.valueOf(this.e);
        } else if (oeh.ARG1.equals(str)) {
            return this.g;
        } else if (oeh.ARG2.equals(str)) {
            return this.h;
        } else if (oeh.ARG3.equals(str)) {
            return String.valueOf(this.k);
        } else if (oeh.RECORD_TIMESTAMP.equals(str)) {
            return String.valueOf(this.i);
        } else {
            return (String) ((HashMap) this.l).get(str);
        }
    }

    public String getArg1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("715cfa88", new Object[]{this});
        }
        return this.g;
    }

    public String getArg2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f7e2b527", new Object[]{this});
        }
        return this.h;
    }

    public String getArg3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7e686fc6", new Object[]{this});
        }
        return String.valueOf(this.k);
    }

    public long getBeginTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6c1f88db", new Object[]{this})).longValue();
        }
        return this.i;
    }

    public String getBizId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d09a5221", new Object[]{this});
        }
        return this.d;
    }

    public Object getContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("e519b5b2", new Object[]{this});
        }
        WeakReference<Object> weakReference = this.b;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public int getEventId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ce275619", new Object[]{this})).intValue();
        }
        return this.e;
    }

    public boolean getH5Pv() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3216c834", new Object[]{this})).booleanValue();
        }
        return this.m;
    }

    public String getKey() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("16c52370", new Object[]{this});
        }
        return this.f29720a;
    }

    @Deprecated
    public synchronized Map<String, String> getLogMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("768d56a", new Object[]{this});
        } else if (this.e <= 0) {
            return null;
        } else {
            HashMap hashMap = new HashMap(this.l);
            b(hashMap);
            c(hashMap);
            return hashMap;
        }
    }

    public String getPageName() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("707fddc9", new Object[]{this}) : this.f;
    }

    public synchronized Map<String, String> getProperties() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("deb64b65", new Object[]{this});
        }
        return new HashMap(this.l);
    }

    public String getScene() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6a7731e3", new Object[]{this});
        }
        return this.c;
    }

    public boolean getToLog() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b096b01e", new Object[]{this})).booleanValue();
        }
        return this.n;
    }

    public boolean getToTrigger() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("61864912", new Object[]{this})).booleanValue();
        }
        return this.o;
    }

    public void setArg1(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ec196ee", new Object[]{this, str});
        } else {
            this.g = str;
        }
    }

    public void setArg2(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98f3302f", new Object[]{this, str});
        } else {
            this.h = str;
        }
    }

    public void setBizId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef8887dd", new Object[]{this, str});
        } else {
            this.d = str;
        }
    }

    public void setContext(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd381fd0", new Object[]{this, obj});
        } else if (obj == null) {
            this.b = null;
        } else {
            this.b = new WeakReference<>(obj);
        }
    }

    public void setEventId(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d0cdca9", new Object[]{this, new Integer(i)});
        } else {
            this.e = i;
        }
    }

    public void setH5Pv(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d16b118", new Object[]{this, new Boolean(z)});
        } else {
            this.m = z;
        }
    }

    public void setPageName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a5935cd", new Object[]{this, str});
        } else {
            this.f = str;
        }
    }

    public void setScene(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9147a05b", new Object[]{this, str});
        } else {
            this.c = str;
        }
    }

    public void setToLog(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90645406", new Object[]{this, new Boolean(z)});
        } else {
            this.n = z;
        }
    }

    public void setToTrigger(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9739f392", new Object[]{this, new Boolean(z)});
        } else {
            this.o = z;
        }
    }

    public String getPageName(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("44afa8ff", new Object[]{this, str}) : this.f;
    }

    public void setScrollPosition(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71e5693f", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        if (this.t) {
            this.r = i;
            this.s = i2;
        } else {
            int i3 = i - this.r;
            int i4 = i2 - this.s;
            setArg2("{" + i3 + "," + i4 + "}");
        }
        this.t = false;
    }

    public final synchronized void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        List<String> list = this.p;
        if (list != null) {
            ((ArrayList) list).clear();
        }
        List<ScheduledFuture> list2 = this.q;
        if (list2 != null) {
            Iterator it = ((ArrayList) list2).iterator();
            while (it.hasNext()) {
                nhh.f("UTEvent", "scheduledFuture.cancel");
                ((ScheduledFuture) it.next()).cancel(false);
            }
            ((ArrayList) this.q).clear();
        }
    }

    public synchronized void updateProperties(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d573d7c2", new Object[]{this, map});
            return;
        }
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                if (!(key instanceof String) || !(value instanceof String)) {
                    nhh.v("UTEvent", "updateProperty key", key, "value", value);
                } else {
                    updateProperty(key, value);
                }
            }
        }
    }

    public synchronized void updateProperty(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1dcdd9", new Object[]{this, str, str2});
            return;
        }
        if (hsq.f(str) || str2 == null) {
            nhh.v("UTEvent", "updateProperty key", str, "value", str2);
        } else {
            ((HashMap) this.l).put(str, str2);
        }
    }
}
