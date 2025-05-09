package tb;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.android.aura.AURAFlowData;
import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.datamodel.render.AURARenderComponentContainer;
import com.alibaba.android.aura.taobao.adapter.extension.userMotion.model.UserMotionConfig;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
@AURAExtensionImpl(code = "aura.impl.component.lifeCycle.userMotion")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class no implements lcb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public nbb f24853a;
    public UserMotionConfig b;
    public JSONObject c;
    public fsv d;
    public List<gsv> e;
    public final Map<String, b> f = new HashMap();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public int f24854a;
        public final long b;

        static {
            t2o.a(81789217);
        }

        public b() {
            this.f24854a = 0;
            this.b = System.currentTimeMillis();
        }
    }

    static {
        t2o.a(81789215);
        t2o.a(80740551);
    }

    public final void B(AURARenderComponent aURARenderComponent, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d033cfe8", new Object[]{this, aURARenderComponent, new Integer(i)});
            return;
        }
        csv a2 = csv.a(aURARenderComponent, i);
        fsv fsvVar = this.d;
        if (fsvVar != null) {
            fsvVar.a(a2);
        }
    }

    @Override // tb.lcb
    public View C0(AURARenderComponentContainer aURARenderComponentContainer, ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("159ea598", new Object[]{this, aURARenderComponentContainer, viewGroup, new Integer(i)});
        }
        return null;
    }

    @Override // tb.kcb
    public void E(RecyclerView.ViewHolder viewHolder, int i, AURARenderComponent aURARenderComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7df0d417", new Object[]{this, viewHolder, new Integer(i), aURARenderComponent});
            return;
        }
        int r = r();
        if (cw6.b()) {
            rbb g = ck.g();
            g.c("AURAUserMotionComponentLifeCycleExtension", h9z.EVENT_ON_APPEAR, "componentKey:" + aURARenderComponent.key + ",appearFrom:" + r);
        }
        if (!TextUtils.isEmpty(aURARenderComponent.key)) {
            b bVar = new b();
            bVar.f24854a = r;
            ((HashMap) this.f).put(aURARenderComponent.key, bVar);
        }
        isv.a(this.f24853a, this.b, aURARenderComponent, this.c, r);
        B(aURARenderComponent, r);
    }

    public final void L(AURARenderComponent aURARenderComponent, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d73403b2", new Object[]{this, aURARenderComponent, new Integer(i)});
            return;
        }
        esv a2 = esv.a(aURARenderComponent, i);
        fsv fsvVar = this.d;
        if (fsvVar != null) {
            fsvVar.a(a2);
        }
    }

    @Override // tb.lcb
    public boolean c0(AURARenderComponent aURARenderComponent, View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("90bcce3c", new Object[]{this, aURARenderComponent, view, new Integer(i)})).booleanValue();
        }
        return false;
    }

    @Override // tb.lcb
    public void l0(AURARenderComponentContainer aURARenderComponentContainer, ViewGroup viewGroup, View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c52be7df", new Object[]{this, aURARenderComponentContainer, viewGroup, view, new Integer(i)});
        }
    }

    @Override // tb.ybb
    public void onCreate(lo loVar, yi yiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe8206ca", new Object[]{this, loVar, yiVar});
        } else {
            this.f24853a = loVar.c();
        }
    }

    @Override // tb.lbb
    public void onDataChanged(AURAFlowData aURAFlowData, AURAGlobalData aURAGlobalData, hbb hbbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bab53acc", new Object[]{this, aURAFlowData, aURAGlobalData, hbbVar});
            return;
        }
        this.b = (UserMotionConfig) aURAGlobalData.get("userMotionConfig", UserMotionConfig.class);
        this.c = (JSONObject) aURAGlobalData.get("userMotionCommonArgs", JSONObject.class);
        fsv fsvVar = (fsv) aURAGlobalData.get("userMotionRecorder", fsv.class);
        this.d = fsvVar;
        if (fsvVar == null) {
            fsv fsvVar2 = new fsv();
            this.d = fsvVar2;
            aURAGlobalData.update("userMotionRecorder", fsvVar2);
        }
        List<gsv> list = (List) aURAGlobalData.get("userMotionScrollDistancePeriodCache", List.class);
        this.e = list;
        if (list == null) {
            ArrayList arrayList = new ArrayList();
            this.e = arrayList;
            aURAGlobalData.update("userMotionScrollDistancePeriodCache", arrayList);
        }
    }

    @Override // tb.ybb
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        }
    }

    public final int r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c93ccff0", new Object[]{this})).intValue();
        }
        List<gsv> list = this.e;
        if (list == null || list.isEmpty()) {
            return 0;
        }
        gsv gsvVar = this.e.get(this.e.size() - 1);
        if (gsvVar != null) {
            int i = gsvVar.f20202a;
            if (i > 0) {
                return 5;
            }
            if (i < 0) {
                return 4;
            }
            int i2 = gsvVar.b;
            if (i2 > 0) {
                return 3;
            }
            if (i2 < 0) {
                return 2;
            }
        }
        return 1;
    }

    @Override // tb.lcb
    public void u(AURARenderComponent aURARenderComponent, View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("359fa8fc", new Object[]{this, aURARenderComponent, view, new Integer(i)});
        }
    }

    public final int x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("426aa9c1", new Object[]{this})).intValue();
        }
        List<gsv> list = this.e;
        if (list == null || list.isEmpty()) {
            return 0;
        }
        gsv gsvVar = this.e.get(this.e.size() - 1);
        if (gsvVar != null) {
            int i = gsvVar.f20202a;
            if (i > 0) {
                return 4;
            }
            if (i < 0) {
                return 5;
            }
            int i2 = gsvVar.b;
            if (i2 > 0) {
                return 2;
            }
            if (i2 < 0) {
                return 3;
            }
        }
        return 1;
    }

    @Override // tb.kcb
    public void N(RecyclerView.ViewHolder viewHolder, int i, AURARenderComponent aURARenderComponent) {
        long j;
        int i2;
        b bVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f3c8047", new Object[]{this, viewHolder, new Integer(i), aURARenderComponent});
            return;
        }
        int x = x();
        if (cw6.b()) {
            rbb g = ck.g();
            g.c("AURAUserMotionComponentLifeCycleExtension", "onDisappear", "componentKey:" + aURARenderComponent.key + ",disappearTo:" + x);
        }
        if (TextUtils.isEmpty(aURARenderComponent.key) || (bVar = (b) ((HashMap) this.f).get(aURARenderComponent.key)) == null) {
            j = 0;
            i2 = 0;
        } else {
            int i3 = bVar.f24854a;
            j = System.currentTimeMillis() - bVar.b;
            i2 = i3;
        }
        isv.c(this.f24853a, this.b, aURARenderComponent, this.c, i2, x, j);
        L(aURARenderComponent, x);
    }
}
