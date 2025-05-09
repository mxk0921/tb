package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.ut.mini.UTTracker;
import com.ut.mini.behavior.UTEventId;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class r0v {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static boolean f27040a = false;
    public static final r0v b = new r0v();
    public static Context c = null;
    public static w00 d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            r0v.access$000().createTable("dc_ut_scene_node");
            r0v.access$000().createTable("dc_ut_pv_node");
            r0v.access$000().createTable("dc_ut_tap_node");
            r0v.access$000().createTable("dc_ut_expose_node");
            r0v.access$000().createTable("dc_ut_other_node");
            r0v.access$000().createTable("dc_ut_scroll_node");
            r0v.access$000().createTable("dc_ut_edge");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class b extends g2v {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ int[] val$attentionEventIds;

        public b(int[] iArr) {
            this.val$attentionEventIds = iArr;
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/ut/mini/behavior/edgecomputing/datacollector/UTDataCollector$2");
        }

        @Override // tb.g2v
        public int[] getAttentionEventIds() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (int[]) ipChange.ipc$dispatch("873e4cb7", new Object[]{this});
            }
            return this.val$attentionEventIds;
        }

        @Override // tb.g2v
        public String getPluginName() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("fd12a725", new Object[]{this});
            }
            return "UTDataCollector";
        }

        @Override // tb.g2v
        public Map<String, String> onEventDispatch(String str, int i, String str2, String str3, String str4, Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("84d56f5f", new Object[]{this, str, new Integer(i), str2, str3, str4, map});
            }
            try {
                dqv.commitLog(map);
                return null;
            } catch (Exception unused) {
                return null;
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class c extends n3v {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/ut/mini/behavior/edgecomputing/datacollector/UTDataCollector$3");
        }

        @Override // tb.n3v
        public void beginEvent(v0v v0vVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("345e2444", new Object[]{this, v0vVar});
            } else if (v0vVar != null && v0vVar.getEventId() == UTEventId.SCROLL.getEventId()) {
                dqv.commitBeginScroll(v0vVar.getLogMap());
            }
        }

        @Override // tb.n3v
        public void beginScene(String str, Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fb3d8d51", new Object[]{this, str, map});
            } else {
                dqv.commitEnterScene(str, map);
            }
        }

        @Override // tb.n3v
        public void endEvent(v0v v0vVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("940650f6", new Object[]{this, v0vVar});
            } else if (v0vVar != null && v0vVar.getEventId() == UTEventId.SCROLL.getEventId()) {
                dqv.commitEndScroll(v0vVar.getLogMap());
            }
        }

        @Override // tb.n3v
        public void endScene(String str, Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7b1e3f03", new Object[]{this, str, map});
            } else {
                dqv.commitLeaveScene(str, map);
            }
        }

        @Override // tb.n3v
        public void pageAppear(UTTracker uTTracker, Object obj, String str, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a716f0db", new Object[]{this, uTTracker, obj, str, new Boolean(z)});
            } else {
                dqv.commitEnter(obj, str);
            }
        }

        @Override // tb.n3v
        public void pageDisAppearEnd(UTTracker uTTracker, Object obj, Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5f6fd959", new Object[]{this, uTTracker, obj, map});
            } else {
                dqv.commitLeave(obj, map);
            }
        }

        @Override // tb.n3v
        public void sessionTimeout() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("17d804f2", new Object[]{this});
            } else {
                gba.session_id = String.valueOf(System.currentTimeMillis());
            }
        }

        @Override // tb.n3v
        public String trackerListenerName() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("1d8246a2", new Object[]{this});
            }
            return "UTDataCollector";
        }

        @Override // tb.n3v
        public void updatePageName(UTTracker uTTracker, Object obj, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("20fa4c9a", new Object[]{this, uTTracker, obj, str});
            } else {
                dqv.updatePvName(obj, str);
            }
        }

        @Override // tb.n3v
        public void updatePagePropertiesEnd(UTTracker uTTracker, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c913703", new Object[]{this, uTTracker, obj});
            } else {
                dqv.commitUpdateProperties(obj, uTTracker.getPageProperties(obj));
            }
        }

        @Override // tb.n3v
        public void updateScene(String str, Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c9272571", new Object[]{this, str, map});
            } else {
                dqv.commitUpdateSceneProperties(str, map);
            }
        }
    }

    static {
        t2o.a(962593211);
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[0]);
            return;
        }
        i2v.getInstance().registerPlugin(new b(new int[]{-1}), false, null, null);
        p3v.getInstance().registerListener(new c());
    }

    public static /* synthetic */ w00 access$000() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (w00) ipChange.ipc$dispatch("c3e8fa5b", new Object[0]);
        }
        return d;
    }

    public static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dde1359c", new Object[0]);
        } else {
            s0v.postRunnable(new a());
        }
    }

    public static r0v getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (r0v) ipChange.ipc$dispatch("618b42ba", new Object[0]);
        }
        return b;
    }

    public static void init(Context context, w00 w00Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26e37ac3", new Object[]{context, w00Var});
        } else if (!f27040a && context != null && w00Var != null) {
            c = context;
            d = w00Var;
            b();
            a();
            gba.cold_start_id = wu3.c().e();
            gba.session_id = String.valueOf(System.currentTimeMillis());
            f27040a = true;
        }
    }

    public Context getContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("e1727078", new Object[]{this});
        }
        return c;
    }

    public w00 getDataCollectorAdapter() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (w00) ipChange.ipc$dispatch("a98386ad", new Object[]{this});
        }
        return d;
    }
}
