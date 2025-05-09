package tb;

import android.text.TextUtils;
import com.alibaba.android.ultron.vfw.instance.a;
import com.alibaba.android.ultron.vfw.perf.asynccomponent.PreloadAsyncComponent;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.android.ultron.common.utils.UnifyLog;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class tnf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final List<String> f28823a = new ArrayList();
    public final Set<IDMComponent> b = new LinkedHashSet();
    public boolean c = false;

    static {
        t2o.a(157286664);
    }

    public void a(IDMComponent iDMComponent, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14674f79", new Object[]{this, iDMComponent, aVar});
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        List<gsb> list = iDMComponent.getEventMap().get("createItem");
        if (!(list == null || ((ArrayList) this.f28823a).contains(iDMComponent.getKey()))) {
            UnifyLog.n(PreloadAsyncComponent.TAG, "ItemCreateStrategy.buildCreateItemEventAndSend" + iDMComponent.getKey());
            ((ArrayList) this.f28823a).add(iDMComponent.getKey());
            for (int i = 0; i < list.size(); i++) {
                gsb gsbVar = list.get(i);
                if (gsbVar != null) {
                    String type = gsbVar.getType();
                    if (!TextUtils.isEmpty(type)) {
                        b8v t = aVar.getEventHandler().e().t(type);
                        t.p(iDMComponent);
                        t.A("createItem");
                        t.r(gsbVar);
                        aVar.getEventHandler().k(t);
                    }
                }
            }
            UnifyLog.n(PreloadAsyncComponent.TAG, "buildCreateItemEventAndSend " + iDMComponent.getKey() + " cost " + (System.currentTimeMillis() - currentTimeMillis));
        }
    }

    public void b(List<IDMComponent> list, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e58c4f91", new Object[]{this, list, aVar});
            return;
        }
        for (IDMComponent iDMComponent : list) {
            if (!(iDMComponent == null || iDMComponent.getEventMap() == null || iDMComponent.getEventMap().get("createItem") == null || ((ArrayList) this.f28823a).contains(iDMComponent.getKey()))) {
                this.b.add(iDMComponent);
            }
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dd02409", new Object[]{this});
        } else {
            ((ArrayList) this.f28823a).clear();
        }
    }

    public void c(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("225b725d", new Object[]{this, aVar});
        } else if (!this.c) {
            if (this.b.isEmpty()) {
                UnifyLog.d(PreloadAsyncComponent.TAG, "lazyLoadAllOnce mLazyCreateComponentList isEmpty");
                return;
            }
            this.c = true;
            UnifyLog.d(PreloadAsyncComponent.TAG, "ItemCreateStrategy", "lazyLoadAllOnce");
            long currentTimeMillis = System.currentTimeMillis();
            for (IDMComponent iDMComponent : this.b) {
                a(iDMComponent, aVar);
            }
            UnifyLog.d(PreloadAsyncComponent.TAG, "lazyLoadAllOnce cost " + (System.currentTimeMillis() - currentTimeMillis) + "ms, count is " + this.b.size());
        }
    }
}
