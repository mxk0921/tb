package tb;

import android.view.View;
import android.widget.FrameLayout;
import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.datamodel.render.AURARenderComponentContainer;
import com.alibaba.android.aura.datamodel.render.AURARenderComponentData;
import com.alibaba.android.umf.node.service.parse.state.RenderComponent;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXEngineConfig;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.f;
import com.taobao.android.dinamicx.s;
import java.util.Map;
import tb.rh;

/* compiled from: Taobao */
@AURAExtensionImpl(code = hj.CODE)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class hj extends mt {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CODE = "aura.impl.render.creator.freeNode";
    public static final String TAG = "AURAFreeNodeFreeNodeExtension";
    public Map<String, jcb> d;
    public s e;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a implements rh.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ AURARenderComponent f20676a;
        public final /* synthetic */ jcb b;
        public final /* synthetic */ bt c;
        public final /* synthetic */ rh d;

        public a(AURARenderComponent aURARenderComponent, jcb jcbVar, bt btVar, rh rhVar) {
            this.f20676a = aURARenderComponent;
            this.b = jcbVar;
            this.c = btVar;
            this.d = rhVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r5v5, types: [android.view.View] */
        public void a(DXRootView dXRootView) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("be61b808", new Object[]{this, dXRootView});
                return;
            }
            AURARenderComponentData aURARenderComponentData = this.f20676a.data;
            if (aURARenderComponentData == null || aURARenderComponentData.container == null) {
                ck.g().b(hj.TAG, "createView", "dxRootView is null");
                return;
            }
            DXRootView dXRootView2 = dXRootView;
            if (th.c()) {
                dXRootView2 = bn6.a(dXRootView, vwu.b(this.f20676a.data.container));
            }
            FrameLayout frameLayout = new FrameLayout(hj.m0(hj.this).f());
            this.b.g(this.f20676a, dXRootView2, 0);
            frameLayout.addView(dXRootView2);
            this.c.m0(frameLayout);
            this.d.g();
        }

        public void b(String str, f fVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ebb1f406", new Object[]{this, str, fVar});
            } else {
                this.d.g();
            }
        }
    }

    static {
        t2o.a(81789112);
    }

    public static /* synthetic */ Object ipc$super(hj hjVar, String str, Object... objArr) {
        if (str.hashCode() == -25033014) {
            super.onCreate((lo) objArr[0], (yi) objArr[1]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/aura/taobao/adapter/extension/freenode/AURAFreeNodeFreeNodeExtension");
    }

    public static /* synthetic */ lo m0(hj hjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lo) ipChange.ipc$dispatch("8afbd30e", new Object[]{hjVar});
        }
        return hjVar.B();
    }

    public final void J0(AURARenderComponent aURARenderComponent, bt btVar, jcb jcbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee64e97a", new Object[]{this, aURARenderComponent, btVar, jcbVar});
        } else if (dm.f17906a.equals(aURARenderComponent.getContainerType())) {
            rh M0 = M0();
            if (M0 == null) {
                ck.g().b(TAG, "createView", "dxViewWrapper is null");
            } else {
                M0.f(new a(aURARenderComponent, jcbVar, btVar, M0), vwu.a(aURARenderComponent));
            }
        } else {
            AURARenderComponentContainer L0 = L0(aURARenderComponent);
            if (L0 == null) {
                ck.g().b(TAG, "createView", "componentContainer is null");
                return;
            }
            FrameLayout frameLayout = new FrameLayout(B().f());
            View f = jcbVar.f(frameLayout, L0);
            jcbVar.g(aURARenderComponent, f, 0);
            frameLayout.addView(f);
            btVar.m0(frameLayout);
        }
    }

    public final void K0(AURAGlobalData aURAGlobalData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edd44c42", new Object[]{this, aURAGlobalData});
            return;
        }
        s sVar = (s) aURAGlobalData.get("auraRenderDxEngine", s.class);
        this.e = sVar;
        if (sVar == null) {
            s sVar2 = new s(new DXEngineConfig(B().d()));
            this.e = sVar2;
            sVar2.s(38447420286L, new ph());
            this.e.s(7023701163946200378L, new oh());
            aURAGlobalData.update("auraRenderDxEngine", this.e);
        }
    }

    @Override // tb.mt
    public void L(Map<String, jcb> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("746db75a", new Object[]{this, map});
            return;
        }
        this.d = map;
        O0();
    }

    public final AURARenderComponentContainer L0(AURARenderComponent aURARenderComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AURARenderComponentContainer) ipChange.ipc$dispatch("a7cb1e4f", new Object[]{this, aURARenderComponent});
        }
        if (aURARenderComponent == null) {
            ck.g().b(TAG, "getContainerInfo", "componentContainer is null");
            return null;
        }
        AURARenderComponentData aURARenderComponentData = aURARenderComponent.data;
        if (aURARenderComponentData != null) {
            return aURARenderComponentData.container;
        }
        ck.g().b(TAG, "getContainerInfo", f4w.LOAD_DATA_NULL);
        return null;
    }

    public final rh M0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rh) ipChange.ipc$dispatch("249c41d4", new Object[]{this});
        }
        K0(x());
        if (this.e != null) {
            return new rh(B().f(), this.e.k());
        }
        return null;
    }

    public final AURARenderComponent N0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AURARenderComponent) ipChange.ipc$dispatch("dd70270d", new Object[]{this, str});
        }
        Map map = (Map) x().get("aura_global_data_free_node", Map.class);
        if (map == null) {
            ck.g().b(TAG, "getContainerInfo", "freeNodes is null");
            return null;
        }
        for (Map.Entry entry : map.entrySet()) {
            RenderComponent renderComponent = (RenderComponent) entry.getValue();
            if (str.equals(entry.getKey())) {
                AURARenderComponent aURARenderComponent = new AURARenderComponent();
                aURARenderComponent.key = renderComponent.getKey();
                aURARenderComponent.data = fxu.d(renderComponent);
                return aURARenderComponent;
            }
        }
        return null;
    }

    public final void O0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c99da7ea", new Object[]{this});
            return;
        }
        for (bt btVar : r().f(bt.class)) {
            String L = btVar.L();
            if (L == null) {
                ck.g().b(TAG, "refreshContentView", "position is null");
                return;
            }
            AURARenderComponent N0 = N0(L);
            if (N0 == null) {
                ck.g().b(TAG, "refreshContentView", "renderComponent is null");
                return;
            }
            jcb jcbVar = this.d.get(N0.getContainerType());
            if (jcbVar == null) {
                ck.g().b(TAG, "refreshContentView", "renderCreator is null");
                return;
            }
            J0(N0, btVar, jcbVar);
        }
    }

    @Override // tb.mt, tb.ybb
    public void onCreate(lo loVar, yi yiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe8206ca", new Object[]{this, loVar, yiVar});
        } else {
            super.onCreate(loVar, yiVar);
        }
    }
}
