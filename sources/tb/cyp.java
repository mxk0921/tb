package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tbmobilesmartapi.core.SceneContext;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class cyp implements fng {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public SceneContext sceneContext;

    static {
        t2o.a(809500674);
        t2o.a(809500681);
    }

    public static cyp initForScene(SceneContext sceneContext) {
        cyp cypVar;
        String str = sceneContext.f13393a;
        try {
            cypVar = (cyp) Class.forName("com.taobao.tbmobilesmart.core.MobileAIContext").newInstance();
        } catch (Throwable unused) {
            cypVar = null;
        }
        if (cypVar == null) {
            cypVar = new cyp();
        }
        cypVar.initContext(sceneContext);
        return cypVar;
    }

    public void initContext(SceneContext sceneContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb8f0983", new Object[]{this, sceneContext});
        }
    }

    public <T extends tod> T obtainServicesInstance(Class<T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ((tod) ipChange.ipc$dispatch("e75d6dce", new Object[]{this, cls}));
        }
        return null;
    }

    @Override // tb.fng
    public void onCreate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18a7a6c2", new Object[]{this});
        }
    }

    @Override // tb.fng
    public void onRelese() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a87f304", new Object[]{this});
        }
    }

    @Override // tb.fng
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
        }
    }

    @Override // tb.fng
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
        }
    }

    public boolean putServicesInstance(tod todVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b863c93b", new Object[]{this, todVar})).booleanValue();
        }
        return false;
    }

    public void releaseSceneContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf94c8b1", new Object[]{this});
        }
    }
}
