package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.monitor.SceneStage;
import java.util.Map;
import tb.qvc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class uvg {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public qvc f29634a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final uvg f29635a = new uvg();

        static {
            t2o.a(806356357);
        }

        public static /* synthetic */ uvg a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (uvg) ipChange.ipc$dispatch("407381c5", new Object[0]);
            }
            return f29635a;
        }
    }

    static {
        t2o.a(806356355);
    }

    public static uvg g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (uvg) ipChange.ipc$dispatch("450912ca", new Object[0]);
        }
        return b.a();
    }

    public void a(String str, SceneStage sceneStage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac784c9c", new Object[]{this, str, sceneStage});
            return;
        }
        String h = h(sceneStage);
        qvc qvcVar = this.f29634a;
        if (qvcVar != null) {
            ((rvc) qvcVar).f(str, h);
        }
    }

    public void b(String str, SceneStage sceneStage, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf9b4369", new Object[]{this, str, sceneStage, map});
            return;
        }
        String h = h(sceneStage);
        qvc qvcVar = this.f29634a;
        if (qvcVar != null) {
            ((rvc) qvcVar).g(str, h, map);
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        qvc qvcVar = this.f29634a;
        if (qvcVar != null) {
            ((rvc) qvcVar).i();
        }
    }

    public void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40a5d150", new Object[]{this, str});
        } else {
            e(str, null);
        }
    }

    public void e(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8cc54035", new Object[]{this, str, map});
        } else {
            f(str, map, null);
        }
    }

    public void f(String str, Map<String, String> map, qvc.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b47f21d", new Object[]{this, str, map, aVar});
            return;
        }
        qvc qvcVar = this.f29634a;
        if (qvcVar != null) {
            ((rvc) qvcVar).j(str, "end", map, aVar);
        }
    }

    public final String h(SceneStage sceneStage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bccded07", new Object[]{this, sceneStage});
        }
        if (sceneStage == null) {
            return "unknown";
        }
        if (sceneStage.equals(SceneStage.SCENE_STAGE_T0)) {
            return lca.STAGE_T0;
        }
        if (sceneStage.equals(SceneStage.SCENE_STAGE_T1)) {
            return lca.STAGE_T1;
        }
        if (sceneStage.equals(SceneStage.SCENE_STAGE_T2)) {
            return lca.STAGE_T2;
        }
        if (sceneStage.equals(SceneStage.SCENE_STAGE_T3)) {
            return lca.STAGE_T3;
        }
        if (sceneStage.equals(SceneStage.SCENE_STAGE_T4)) {
            return lca.STAGE_T4;
        }
        if (sceneStage.equals(SceneStage.SCENE_STAGE_T5)) {
            return lca.STAGE_T5;
        }
        return "unknown";
    }

    public void i(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{this, context});
            return;
        }
        qvc qvcVar = this.f29634a;
        if (qvcVar == null) {
            rvc rvcVar = new rvc();
            this.f29634a = rvcVar;
            rvcVar.p(context);
            return;
        }
        ((rvc) qvcVar).t(context);
    }

    public void j(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45120dfb", new Object[]{this, str});
            return;
        }
        qvc qvcVar = this.f29634a;
        if (qvcVar != null) {
            ((rvc) qvcVar).q(str);
        }
    }

    public void k(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41688d3c", new Object[]{this, str, map});
            return;
        }
        qvc qvcVar = this.f29634a;
        if (qvcVar != null) {
            ((rvc) qvcVar).u(str, "start", map);
        }
    }

    public uvg() {
    }
}
