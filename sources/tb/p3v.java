package tb;

import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.analytics.core.config.UTClientConfigMgr;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.ut.mini.UTTracker;
import com.ut.mini.module.trackerlistener.UTTrackerListenerConfig;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class p3v {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static p3v d;
    public UTTrackerListenerConfig c = null;

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, n3v> f25862a = new ConcurrentHashMap();
    public final Map<String, n3v> b = new ConcurrentHashMap();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements UTClientConfigMgr.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // com.alibaba.analytics.core.config.UTClientConfigMgr.a
        public String getKey() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("16c52370", new Object[]{this});
            }
            return "trackerListener";
        }

        @Override // com.alibaba.analytics.core.config.UTClientConfigMgr.a
        public void onChange(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5bfd17c0", new Object[]{this, str});
            } else {
                p3v.access$000(p3v.this, str);
            }
        }
    }

    static {
        t2o.a(962593324);
    }

    public p3v() {
        UTClientConfigMgr.c().e(new a());
    }

    public static /* synthetic */ void access$000(p3v p3vVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54fa4db9", new Object[]{p3vVar, str});
        } else {
            p3vVar.c(str);
        }
    }

    public static p3v getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (p3v) ipChange.ipc$dispatch("d937db08", new Object[0]);
        }
        if (d == null) {
            synchronized (p3v.class) {
                try {
                    if (d == null) {
                        d = new p3v();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return d;
    }

    public final boolean a(int[] iArr, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8acb9345", new Object[]{this, iArr, new Integer(i)})).booleanValue();
        }
        if (iArr != null) {
            if (iArr[0] == -1) {
                return true;
            }
            for (int i2 : iArr) {
                if (i2 == i) {
                    return true;
                }
            }
        }
        return false;
    }

    public void addExposureViewToCommit(String str, String str2, String str3, String str4, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e457d457", new Object[]{this, str, str2, str3, str4, map});
            return;
        }
        try {
            for (Map.Entry entry : ((ConcurrentHashMap) this.b).entrySet()) {
                n3v n3vVar = (n3v) entry.getValue();
                if (n3vVar != null) {
                    n3vVar.addExposureViewToCommit(str, str2, str3, str4, map);
                }
            }
        } catch (Throwable unused) {
            nhh.i("UTTrackerListenerMgr", new Object[0]);
        }
    }

    public final boolean b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("11215629", new Object[]{this, str})).booleanValue();
        }
        UTTrackerListenerConfig uTTrackerListenerConfig = this.c;
        if (uTTrackerListenerConfig == null) {
            return true;
        }
        List<String> open = uTTrackerListenerConfig.getOpen();
        if (open != null && open.contains(str)) {
            return true;
        }
        List<String> close = this.c.getClose();
        if (close != null && close.contains(str)) {
            return false;
        }
        String other = this.c.getOther();
        if (TextUtils.isEmpty(other) || !other.equals("close")) {
            return true;
        }
        return false;
    }

    public void beginEvent(v0v v0vVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("345e2444", new Object[]{this, v0vVar});
            return;
        }
        try {
            for (Map.Entry entry : ((ConcurrentHashMap) this.b).entrySet()) {
                n3v n3vVar = (n3v) entry.getValue();
                if (n3vVar != null) {
                    n3vVar.beginEvent(v0vVar);
                }
            }
        } catch (Throwable unused) {
            nhh.i("UTTrackerListenerMgr", new Object[0]);
        }
    }

    public void beginScene(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb3d8d51", new Object[]{this, str, map});
            return;
        }
        try {
            for (Map.Entry entry : ((ConcurrentHashMap) this.b).entrySet()) {
                n3v n3vVar = (n3v) entry.getValue();
                if (n3vVar != null) {
                    n3vVar.beginScene(str, map);
                }
            }
        } catch (Throwable unused) {
            nhh.i("UTTrackerListenerMgr", new Object[0]);
        }
    }

    public final synchronized void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("768f747a", new Object[]{this, str});
            return;
        }
        try {
            this.c = (UTTrackerListenerConfig) JSON.parseObject(str, UTTrackerListenerConfig.class);
        } catch (Exception unused) {
            this.c = null;
        }
        for (Map.Entry entry : ((ConcurrentHashMap) this.f25862a).entrySet()) {
            String str2 = (String) entry.getKey();
            if (!b(str2)) {
                ((ConcurrentHashMap) this.b).remove(str2);
            } else if (!((ConcurrentHashMap) this.b).containsKey(str2)) {
                ((ConcurrentHashMap) this.b).put(str2, (n3v) entry.getValue());
            }
        }
    }

    public void endEvent(v0v v0vVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("940650f6", new Object[]{this, v0vVar});
            return;
        }
        try {
            for (Map.Entry entry : ((ConcurrentHashMap) this.b).entrySet()) {
                n3v n3vVar = (n3v) entry.getValue();
                if (n3vVar != null) {
                    n3vVar.endEvent(v0vVar);
                }
            }
        } catch (Throwable unused) {
            nhh.i("UTTrackerListenerMgr", new Object[0]);
        }
    }

    public void endScene(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b1e3f03", new Object[]{this, str, map});
            return;
        }
        try {
            for (Map.Entry entry : ((ConcurrentHashMap) this.b).entrySet()) {
                n3v n3vVar = (n3v) entry.getValue();
                if (n3vVar != null) {
                    n3vVar.endScene(str, map);
                }
            }
        } catch (Throwable unused) {
            nhh.i("UTTrackerListenerMgr", new Object[0]);
        }
    }

    public void pageAppear(UTTracker uTTracker, Object obj, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a716f0db", new Object[]{this, uTTracker, obj, str, new Boolean(z)});
            return;
        }
        try {
            for (Map.Entry entry : ((ConcurrentHashMap) this.b).entrySet()) {
                n3v n3vVar = (n3v) entry.getValue();
                if (n3vVar != null) {
                    n3vVar.pageAppear(uTTracker, obj, str, z);
                }
            }
        } catch (Throwable unused) {
            nhh.i("UTTrackerListenerMgr", new Object[0]);
        }
    }

    public void pageDisAppear(UTTracker uTTracker, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2941721f", new Object[]{this, uTTracker, obj});
            return;
        }
        try {
            for (Map.Entry entry : ((ConcurrentHashMap) this.b).entrySet()) {
                n3v n3vVar = (n3v) entry.getValue();
                if (n3vVar != null) {
                    n3vVar.pageDisAppear(uTTracker, obj);
                }
            }
        } catch (Throwable unused) {
            nhh.i("UTTrackerListenerMgr", new Object[0]);
        }
    }

    public void pageDisAppearEnd(UTTracker uTTracker, Object obj, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f6fd959", new Object[]{this, uTTracker, obj, map});
            return;
        }
        try {
            for (Map.Entry entry : ((ConcurrentHashMap) this.b).entrySet()) {
                n3v n3vVar = (n3v) entry.getValue();
                if (n3vVar != null) {
                    n3vVar.pageDisAppearEnd(uTTracker, obj, map);
                }
            }
        } catch (Throwable unused) {
            nhh.i("UTTrackerListenerMgr", new Object[0]);
        }
    }

    public synchronized void registerListener(n3v n3vVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f9a0a10", new Object[]{this, n3vVar});
            return;
        }
        if (n3vVar != null) {
            String trackerListenerName = n3vVar.trackerListenerName();
            if (!TextUtils.isEmpty(trackerListenerName) && !((ConcurrentHashMap) this.f25862a).containsKey(trackerListenerName)) {
                ((ConcurrentHashMap) this.f25862a).put(trackerListenerName, n3vVar);
                if (b(trackerListenerName)) {
                    ((ConcurrentHashMap) this.b).put(trackerListenerName, n3vVar);
                }
            }
        }
    }

    public void send(UTTracker uTTracker, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("132284b6", new Object[]{this, uTTracker, map});
            return;
        }
        try {
            for (Map.Entry entry : ((ConcurrentHashMap) this.b).entrySet()) {
                n3v n3vVar = (n3v) entry.getValue();
                if (n3vVar != null) {
                    n3vVar.send(uTTracker, map);
                }
            }
        } catch (Throwable unused) {
            nhh.i("UTTrackerListenerMgr", new Object[0]);
        }
    }

    public void sendEvent(Map<String, String> map, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5345997", new Object[]{this, map, new Integer(i)});
            return;
        }
        try {
            for (Map.Entry entry : ((ConcurrentHashMap) this.b).entrySet()) {
                n3v n3vVar = (n3v) entry.getValue();
                if (n3vVar != null && a(n3vVar.getAttentionEventIdsForSendEvent(), i)) {
                    n3vVar.sendEvent(map);
                }
            }
        } catch (Throwable unused) {
            nhh.i("UTTrackerListenerMgr", new Object[0]);
        }
    }

    public void sessionTimeout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17d804f2", new Object[]{this});
            return;
        }
        try {
            for (Map.Entry entry : ((ConcurrentHashMap) this.b).entrySet()) {
                n3v n3vVar = (n3v) entry.getValue();
                if (n3vVar != null) {
                    n3vVar.sessionTimeout();
                }
            }
        } catch (Throwable unused) {
            nhh.i("UTTrackerListenerMgr", new Object[0]);
        }
    }

    public void skipPage(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48ec0ed1", new Object[]{this, obj});
            return;
        }
        try {
            for (Map.Entry entry : ((ConcurrentHashMap) this.b).entrySet()) {
                n3v n3vVar = (n3v) entry.getValue();
                if (n3vVar != null) {
                    n3vVar.skipPage(obj);
                }
            }
        } catch (Throwable unused) {
            nhh.i("UTTrackerListenerMgr", new Object[0]);
        }
    }

    public synchronized void unregisterListener(n3v n3vVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9082569", new Object[]{this, n3vVar});
            return;
        }
        if (n3vVar != null) {
            String trackerListenerName = n3vVar.trackerListenerName();
            if (!TextUtils.isEmpty(trackerListenerName)) {
                ((ConcurrentHashMap) this.f25862a).remove(trackerListenerName);
                ((ConcurrentHashMap) this.b).remove(trackerListenerName);
            }
        }
    }

    public void updateEvent(v0v v0vVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2d2ec64", new Object[]{this, v0vVar});
            return;
        }
        try {
            for (Map.Entry entry : ((ConcurrentHashMap) this.b).entrySet()) {
                n3v n3vVar = (n3v) entry.getValue();
                if (n3vVar != null) {
                    n3vVar.updateEvent(v0vVar);
                }
            }
        } catch (Throwable unused) {
            nhh.i("UTTrackerListenerMgr", new Object[0]);
        }
    }

    public void updateEventPageName(v0v v0vVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f5440ca", new Object[]{this, v0vVar});
            return;
        }
        try {
            for (Map.Entry entry : ((ConcurrentHashMap) this.b).entrySet()) {
                n3v n3vVar = (n3v) entry.getValue();
                if (n3vVar != null) {
                    n3vVar.updateEventPageName(v0vVar);
                }
            }
        } catch (Throwable unused) {
            nhh.i("UTTrackerListenerMgr", new Object[0]);
        }
    }

    public void updateNextPageProperties(UTTracker uTTracker, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b15c54c", new Object[]{this, uTTracker, map});
            return;
        }
        try {
            for (Map.Entry entry : ((ConcurrentHashMap) this.b).entrySet()) {
                n3v n3vVar = (n3v) entry.getValue();
                if (n3vVar != null) {
                    n3vVar.updateNextPageProperties(uTTracker, map);
                }
            }
        } catch (Throwable unused) {
            nhh.i("UTTrackerListenerMgr", new Object[0]);
        }
    }

    public void updateNextPageUtparam(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30ce5d14", new Object[]{this, str});
            return;
        }
        try {
            for (Map.Entry entry : ((ConcurrentHashMap) this.b).entrySet()) {
                n3v n3vVar = (n3v) entry.getValue();
                if (n3vVar != null) {
                    n3vVar.updateNextPageUtparam(str);
                }
            }
        } catch (Throwable unused) {
            nhh.i("UTTrackerListenerMgr", new Object[0]);
        }
    }

    public void updatePageName(UTTracker uTTracker, Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20fa4c9a", new Object[]{this, uTTracker, obj, str});
            return;
        }
        try {
            for (Map.Entry entry : ((ConcurrentHashMap) this.b).entrySet()) {
                n3v n3vVar = (n3v) entry.getValue();
                if (n3vVar != null) {
                    n3vVar.updatePageName(uTTracker, obj, str);
                }
            }
        } catch (Throwable unused) {
            nhh.i("UTTrackerListenerMgr", new Object[0]);
        }
    }

    public void updatePageProperties(UTTracker uTTracker, Object obj, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d74df5d", new Object[]{this, uTTracker, obj, map});
            return;
        }
        try {
            for (Map.Entry entry : ((ConcurrentHashMap) this.b).entrySet()) {
                n3v n3vVar = (n3v) entry.getValue();
                if (n3vVar != null) {
                    n3vVar.updatePageProperties(uTTracker, obj, map);
                }
            }
        } catch (Throwable unused) {
            nhh.i("UTTrackerListenerMgr", new Object[0]);
        }
    }

    public void updatePagePropertiesEnd(UTTracker uTTracker, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c913703", new Object[]{this, uTTracker, obj});
            return;
        }
        try {
            for (Map.Entry entry : ((ConcurrentHashMap) this.b).entrySet()) {
                n3v n3vVar = (n3v) entry.getValue();
                if (n3vVar != null) {
                    n3vVar.updatePagePropertiesEnd(uTTracker, obj);
                }
            }
        } catch (Throwable unused) {
            nhh.i("UTTrackerListenerMgr", new Object[0]);
        }
    }

    public void updatePageStatus(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8add622d", new Object[]{this, obj});
            return;
        }
        try {
            for (Map.Entry entry : ((ConcurrentHashMap) this.b).entrySet()) {
                n3v n3vVar = (n3v) entry.getValue();
                if (n3vVar != null) {
                    n3vVar.updatePageStatus(obj);
                }
            }
        } catch (Throwable unused) {
            nhh.i("UTTrackerListenerMgr", new Object[0]);
        }
    }

    public void updatePageUrl(Object obj, Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db943cd", new Object[]{this, obj, uri});
            return;
        }
        try {
            for (Map.Entry entry : ((ConcurrentHashMap) this.b).entrySet()) {
                n3v n3vVar = (n3v) entry.getValue();
                if (n3vVar != null) {
                    if (uri != null) {
                        n3vVar.updatePageUrl(obj, uri.toString());
                    } else {
                        n3vVar.updatePageUrl(obj, "");
                    }
                }
            }
        } catch (Throwable unused) {
            nhh.i("UTTrackerListenerMgr", new Object[0]);
        }
    }

    public void updatePageUtparam(Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c541ce3", new Object[]{this, obj, str});
            return;
        }
        try {
            for (Map.Entry entry : ((ConcurrentHashMap) this.b).entrySet()) {
                n3v n3vVar = (n3v) entry.getValue();
                if (n3vVar != null) {
                    n3vVar.updatePageUtparam(obj, str);
                }
            }
        } catch (Throwable unused) {
            nhh.i("UTTrackerListenerMgr", new Object[0]);
        }
    }

    public void updateScene(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9272571", new Object[]{this, str, map});
            return;
        }
        try {
            for (Map.Entry entry : ((ConcurrentHashMap) this.b).entrySet()) {
                n3v n3vVar = (n3v) entry.getValue();
                if (n3vVar != null) {
                    n3vVar.updateScene(str, map);
                }
            }
        } catch (Throwable unused) {
            nhh.i("UTTrackerListenerMgr", new Object[0]);
        }
    }

    public void viewBecomeVisible(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c7619ab", new Object[]{this, str, str2, str3});
            return;
        }
        try {
            for (Map.Entry entry : ((ConcurrentHashMap) this.b).entrySet()) {
                n3v n3vVar = (n3v) entry.getValue();
                if (n3vVar != null) {
                    n3vVar.viewBecomeVisible(str, str2, str3);
                }
            }
        } catch (Throwable unused) {
            nhh.i("UTTrackerListenerMgr", new Object[0]);
        }
    }
}
