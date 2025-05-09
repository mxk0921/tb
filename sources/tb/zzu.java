package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.ut.mini.UTTracker;
import java.util.ArrayList;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class zzu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static boolean f33132a = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a extends g2v {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ int[] val$attentionEventIds;

        public a(int[] iArr) {
            this.val$attentionEventIds = iArr;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/ut/mini/behavior/UTBehavior$1");
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
            return "UTModule";
        }

        @Override // tb.g2v
        public Map<String, String> onEventDispatch(String str, int i, String str2, String str3, String str4, Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("84d56f5f", new Object[]{this, str, new Integer(i), str2, str3, str4, map});
            }
            try {
                return vyi.getInstance().makeTag(map);
            } catch (Exception unused) {
                return null;
            }
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
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/ut/mini/behavior/UTBehavior$2");
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
            return "UTTrigger";
        }

        @Override // tb.g2v
        public Map<String, String> onEventDispatch(String str, int i, String str2, String str3, String str4, Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("84d56f5f", new Object[]{this, str, new Integer(i), str2, str3, str4, map});
            }
            try {
                q3v.getInstance().triggerEventAsync(map);
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
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/ut/mini/behavior/UTBehavior$3");
        }

        @Override // tb.n3v
        public void beginEvent(v0v v0vVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("345e2444", new Object[]{this, v0vVar});
            } else if (v0vVar != null) {
                q3v.getInstance().triggerEventAsync(v0vVar);
            }
        }

        @Override // tb.n3v
        public void endEvent(v0v v0vVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("940650f6", new Object[]{this, v0vVar});
            } else if (v0vVar != null && !v0vVar.getToLog() && v0vVar.getToTrigger()) {
                q3v.getInstance().triggerEventAsync(v0vVar);
            }
        }

        @Override // tb.n3v
        public void pageAppear(UTTracker uTTracker, Object obj, String str, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a716f0db", new Object[]{this, uTTracker, obj, str, new Boolean(z)});
                return;
            }
            v0v eventByKey = y0v.getInstance().getEventByKey(y0v.getInstance().getKeyForObject(obj));
            eventByKey.setEventId(2001);
            eventByKey.setContext(obj);
            eventByKey.setPageName(str);
            y0v.getInstance().beginEvent(eventByKey);
        }

        @Override // tb.n3v
        public void pageDisAppear(UTTracker uTTracker, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2941721f", new Object[]{this, uTTracker, obj});
                return;
            }
            v0v eventByKey = y0v.getInstance().getEventByKey(y0v.getInstance().getKeyForObject(obj));
            eventByKey.setToLog(false);
            eventByKey.setToTrigger(false);
            y0v.getInstance().endEvent(eventByKey);
        }

        @Override // tb.n3v
        public String trackerListenerName() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("1d8246a2", new Object[]{this});
            }
            return "UTTrigger";
        }

        @Override // tb.n3v
        public void updateEvent(v0v v0vVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e2d2ec64", new Object[]{this, v0vVar});
            } else if (v0vVar != null) {
                q3v.getInstance().triggerEventAsync(v0vVar);
            }
        }

        @Override // tb.n3v
        public void updateEventPageName(v0v v0vVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7f5440ca", new Object[]{this, v0vVar});
            } else if (v0vVar != null) {
                q3v.getInstance().triggerEventAsync(v0vVar);
            }
        }

        @Override // tb.n3v
        public void updatePageName(UTTracker uTTracker, Object obj, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("20fa4c9a", new Object[]{this, uTTracker, obj, str});
                return;
            }
            v0v eventByKey = y0v.getInstance().getEventByKey(y0v.getInstance().getKeyForObject(obj));
            eventByKey.setPageName(str);
            y0v.getInstance().updateEventPageName(eventByKey);
        }

        @Override // tb.n3v
        public void updatePageProperties(UTTracker uTTracker, Object obj, Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8d74df5d", new Object[]{this, uTTracker, obj, map});
                return;
            }
            v0v eventByKey = y0v.getInstance().getEventByKey(y0v.getInstance().getKeyForObject(obj));
            eventByKey.updateProperties(map);
            y0v.getInstance().updateEvent(eventByKey);
        }
    }

    static {
        t2o.a(962593183);
    }

    public static void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[0]);
        } else if (!f33132a) {
            f33132a = true;
            nhh.f("UTBehavior", "init");
            b0v.initConfig();
            ArrayList arrayList = new ArrayList();
            arrayList.add(vyi.UT_TAG);
            int[] iArr = {-1};
            i2v.getInstance().registerPlugin(new a(iArr), false, arrayList, null);
            i2v.getInstance().registerPlugin(new b(iArr), false, null, null);
            p3v.getInstance().registerListener(new c());
        }
    }
}
