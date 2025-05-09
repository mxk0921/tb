package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.room.openarchitecture.listener.PlatformListenerEnum;
import com.taobao.taolive.room.openarchitecture.single.OpenSingleViewContainer;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class y5l implements a4d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final w3d f31870a;

    static {
        t2o.a(779093054);
        t2o.a(806355747);
    }

    public y5l(w3d w3dVar) {
        this.f31870a = w3dVar;
    }

    @Override // tb.a4d
    public void a(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("256b668f", new Object[]{this, obj});
        } else if (this.f31870a != null) {
            if (pvs.k0()) {
                w3d w3dVar = this.f31870a;
                if ((w3dVar instanceof OpenSingleViewContainer) && ((OpenSingleViewContainer) w3dVar).o()) {
                    HashMap<String, String> hashMap = new HashMap<>();
                    hashMap.put("needClearData", "true");
                    this.f31870a.getOpenArchEntityAdapter().j("scrollContainerLifecycle", this.f31870a.getRecModel(), this.f31870a.getFrameContext(), true, hashMap);
                    f(null);
                    return;
                }
            }
            if (!this.f31870a.getOpenArchEntityAdapter().i(PlatformListenerEnum.onResume, "activityLifecycle", new HashMap())) {
                this.f31870a.onResume();
            }
        }
    }

    @Override // tb.a4d
    public void b(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6dd4d0ba", new Object[]{this, obj});
            return;
        }
        w3d w3dVar = this.f31870a;
        if (w3dVar != null && !w3dVar.getOpenArchEntityAdapter().i(PlatformListenerEnum.onPause, "activityLifecycle", new HashMap())) {
            this.f31870a.onPause();
        }
    }

    @Override // tb.a4d
    public void c(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c65e4775", new Object[]{this, obj});
            return;
        }
        w3d w3dVar = this.f31870a;
        if (w3dVar != null && !w3dVar.getOpenArchEntityAdapter().i(PlatformListenerEnum.onWillDisappear, "scrollContainerLifecycle", new HashMap())) {
            this.f31870a.onWillDisappear();
        }
    }

    @Override // tb.a4d
    public void e(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6499cb69", new Object[]{this, obj});
            return;
        }
        w3d w3dVar = this.f31870a;
        if (w3dVar != null && !w3dVar.getOpenArchEntityAdapter().j("scrollContainerLifecycle", this.f31870a.getRecModel(), this.f31870a.getFrameContext(), true, null)) {
            this.f31870a.onWillAppear();
        }
    }

    @Override // tb.a4d
    public void h(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68ac2a1e", new Object[]{this, obj});
        } else if (this.f31870a != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("LifeCycleNativeParams", obj);
            if (!this.f31870a.getOpenArchEntityAdapter().i(PlatformListenerEnum.onCreate, "activityLifecycle", hashMap)) {
                this.f31870a.initParams(obj);
            }
        }
    }

    @Override // tb.a4d
    public void i(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1123d118", new Object[]{this, obj});
            return;
        }
        w3d w3dVar = this.f31870a;
        if (w3dVar != null) {
            w3dVar.onDestroy();
            if (!this.f31870a.getOpenArchEntityAdapter().i(PlatformListenerEnum.onDestory, "activityLifecycle", new HashMap())) {
                this.f31870a.onDestroy();
            }
        }
    }

    @Override // tb.a4d
    public void onStart(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46099626", new Object[]{this, obj});
            return;
        }
        w3d w3dVar = this.f31870a;
        if (w3dVar != null) {
            w3dVar.onStart();
        }
    }

    @Override // tb.a4d
    public void d(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61b179c6", new Object[]{this, obj});
            return;
        }
        w3d w3dVar = this.f31870a;
        if (w3dVar != null && !w3dVar.getOpenArchEntityAdapter().h("scrollContainerLifecycle", true)) {
            this.f31870a.onDidDisappear();
        }
    }

    @Override // tb.a4d
    public void f(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4bd722b8", new Object[]{this, obj});
            return;
        }
        w3d w3dVar = this.f31870a;
        if (w3dVar != null && !w3dVar.getOpenArchEntityAdapter().g("scrollContainerLifecycle", this.f31870a.getRecModel(), this.f31870a.getFrameContext(), true)) {
            this.f31870a.onDidAppear();
        }
    }

    @Override // tb.a4d
    public void g(Object obj) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce8a3c64", new Object[]{this, obj});
            return;
        }
        if (obj instanceof Map) {
            Object obj2 = ((Map) obj).get("showSmallWindow");
            if (obj2 instanceof String) {
                z = yqq.h((String) obj2);
            }
        }
        if (this.f31870a != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("isOpenSmallWindowOnce", Boolean.valueOf(z));
            if (!this.f31870a.getOpenArchEntityAdapter().i(PlatformListenerEnum.onStop, "activityLifecycle", hashMap)) {
                this.f31870a.onStop(z);
            }
        }
    }
}
