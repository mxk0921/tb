package tb;

import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.ut.mini.behavior.data.DataType;
import com.ut.mini.behavior.trigger.Scene;
import com.ut.mini.behavior.trigger.TriggerConfig;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class bgu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Object f16378a;
    public TriggerConfig b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final bgu f16379a = new bgu();

        static {
            t2o.a(962593265);
        }

        public static /* synthetic */ bgu access$100() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (bgu) ipChange.ipc$dispatch("e851298b", new Object[0]);
            }
            return f16379a;
        }
    }

    static {
        t2o.a(962593263);
    }

    public static bgu getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bgu) ipChange.ipc$dispatch("c37e5de5", new Object[0]);
        }
        return b.access$100();
    }

    public List<Scene> getSceneList() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("7f935cc", new Object[]{this});
        }
        synchronized (this.f16378a) {
            try {
                TriggerConfig triggerConfig = this.b;
                if (triggerConfig != null && b0v.enableSample(triggerConfig.enableSample)) {
                    return this.b.sceneList;
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void init(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60dc73a1", new Object[]{this, str});
        } else if (hsq.f(str)) {
            this.b = null;
        } else {
            try {
                this.b = (TriggerConfig) JSON.parseObject(str, TriggerConfig.class);
            } catch (Exception e) {
                nhh.h("TriggerMgr", e, new Object[0]);
            }
        }
    }

    public boolean triggerEvent(Scene scene, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("40bcf6ff", new Object[]{this, scene, map})).booleanValue();
        }
        synchronized (this.f16378a) {
            TriggerConfig triggerConfig = this.b;
            if (triggerConfig != null && b0v.enableSample(triggerConfig.enableSample)) {
                if (scene == null || scene.event == null || !DataType.Event.getValue().equals(scene.event.type)) {
                    return false;
                }
                return lq8.getInstance().evaluateData(scene.event.data, map);
            }
            return false;
        }
    }

    public bgu() {
        this.f16378a = new Object();
    }

    public void init(TriggerConfig triggerConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e4ed54a", new Object[]{this, triggerConfig});
            return;
        }
        synchronized (this.f16378a) {
            this.b = triggerConfig;
        }
    }

    public boolean triggerEvent(Scene scene, v0v v0vVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cddae3b6", new Object[]{this, scene, v0vVar})).booleanValue();
        }
        synchronized (this.f16378a) {
            TriggerConfig triggerConfig = this.b;
            if (triggerConfig != null && b0v.enableSample(triggerConfig.enableSample)) {
                if (scene == null || scene.event == null || !DataType.Begin.getValue().equals(scene.event.type)) {
                    return false;
                }
                return lq8.getInstance().evaluateData(scene.event.data, v0vVar);
            }
            return false;
        }
    }
}
