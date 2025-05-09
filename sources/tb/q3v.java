package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.ut.mini.behavior.trigger.Scene;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledFuture;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class q3v {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final kvv f26495a;
    public final Map<String, List<r3v>> b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ Map val$logMap;

        public a(Map map) {
            this.val$logMap = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                q3v.access$200(q3v.this, this.val$logMap);
            } catch (Throwable unused) {
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ v0v val$utEvent;

        public b(v0v v0vVar) {
            this.val$utEvent = v0vVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                q3v.access$300(q3v.this, this.val$utEvent);
            } catch (Throwable unused) {
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ String val$triggerName;

        public c(String str) {
            this.val$triggerName = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                q3v.access$400(q3v.this, this.val$triggerName);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final q3v f26496a = new q3v(null);

        static {
            t2o.a(962593194);
        }

        public static /* synthetic */ q3v access$100() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (q3v) ipChange.ipc$dispatch("70f964db", new Object[0]);
            }
            return f26496a;
        }
    }

    static {
        t2o.a(962593190);
    }

    public /* synthetic */ q3v(a aVar) {
        this();
    }

    public static /* synthetic */ void access$200(q3v q3vVar, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92d4928f", new Object[]{q3vVar, map});
        } else {
            q3vVar.c(map);
        }
    }

    public static /* synthetic */ void access$300(q3v q3vVar, v0v v0vVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3b04ba5", new Object[]{q3vVar, v0vVar});
        } else {
            q3vVar.d(v0vVar);
        }
    }

    public static /* synthetic */ void access$400(q3v q3vVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f5fb082", new Object[]{q3vVar, str});
        } else {
            q3vVar.a(str);
        }
    }

    public static q3v getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (q3v) ipChange.ipc$dispatch("cec10341", new Object[0]);
        }
        return d.access$100();
    }

    public final void c(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b24ed1c", new Object[]{this, map});
            return;
        }
        List<Scene> sceneList = bgu.getInstance().getSceneList();
        if (sceneList != null) {
            for (Scene scene : sceneList) {
                if (bgu.getInstance().triggerEvent(scene, map)) {
                    a(scene.name);
                }
            }
        }
    }

    public final void d(v0v v0vVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d9ffd13", new Object[]{this, v0vVar});
            return;
        }
        List<Scene> sceneList = bgu.getInstance().getSceneList();
        if (sceneList != null) {
            for (Scene scene : sceneList) {
                if (v0vVar.containScene(scene.name)) {
                    nhh.f("UTTrigger", "containScene", scene.name);
                } else if (bgu.getInstance().triggerEvent(scene, v0vVar)) {
                    b(scene.name, scene.condition, v0vVar);
                }
            }
        }
    }

    public synchronized void registerTrigger(String str, r3v r3vVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ead074ed", new Object[]{this, str, r3vVar});
            return;
        }
        if (!TextUtils.isEmpty(str) && r3vVar != null) {
            List list = (List) ((ConcurrentHashMap) this.b).get(str);
            if (list == null) {
                list = new ArrayList();
                ((ConcurrentHashMap) this.b).put(str, list);
            }
            if (!list.contains(r3vVar)) {
                list.add(r3vVar);
            }
        }
    }

    public void triggerEventAsync(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f67ea04", new Object[]{this, map});
        } else if (this.f26495a != null && map != null) {
            this.f26495a.b(new a(map));
        }
    }

    public synchronized void unRegisterTrigger(String str, r3v r3vVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5411ed4", new Object[]{this, str, r3vVar});
            return;
        }
        if (!TextUtils.isEmpty(str) && r3vVar != null) {
            List list = (List) ((ConcurrentHashMap) this.b).get(str);
            if (list != null) {
                list.remove(r3vVar);
            }
        }
    }

    public q3v() {
        try {
            this.f26495a = new kvv();
        } catch (Exception unused) {
        }
        this.b = new ConcurrentHashMap();
    }

    public final synchronized void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7a7fa8d", new Object[]{this, str});
            return;
        }
        try {
            List<r3v> list = (List) ((ConcurrentHashMap) this.b).get(str);
            nhh.f("UTTrigger", "triggerObserver", str);
            if (list != null) {
                for (r3v r3vVar : list) {
                    r3vVar.onTrigger(str);
                }
            }
        } catch (Throwable unused) {
        }
    }

    public void triggerEventAsync(v0v v0vVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b5babfb", new Object[]{this, v0vVar});
        } else if (this.f26495a != null && v0vVar != null) {
            this.f26495a.b(new b(v0vVar));
        }
    }

    public final synchronized void b(String str, String str2, v0v v0vVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c544e205", new Object[]{this, str, str2, v0vVar});
        } else if (v0vVar != null) {
            v0vVar.addSceneName(str);
            if (hsq.f(str2)) {
                a(str);
            } else if (str2.startsWith("delay")) {
                try {
                    int parseInt = Integer.parseInt(str2.substring(6));
                    ScheduledFuture d2 = zdt.c().d(null, new c(str), parseInt);
                    nhh.f("UTTrigger", "triggerObserverDelay", str, com.taobao.android.weex_uikit.widget.video.c.ATTR_DELAY_TIME, Integer.valueOf(parseInt));
                    v0vVar.addScheduledFuture(d2);
                } catch (Exception unused) {
                }
            }
        }
    }
}
