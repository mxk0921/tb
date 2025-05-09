package com.taobao.android.dressup.common.component.outer;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.recommend4.manager.d;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import tb.d1a;
import tb.g1c;
import tb.nhd;
import tb.qpu;
import tb.tqm;
import tb.z4a;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltb/nhd;", "kotlin.jvm.PlatformType", "invoke", "()Ltb/nhd;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class DressupListComponent$recommendContainer$2 extends Lambda implements d1a<nhd> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ qpu $turboEngineContext;
    public final /* synthetic */ DressupListComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DressupListComponent$recommendContainer$2(DressupListComponent dressupListComponent, qpu qpuVar) {
        super(0);
        this.this$0 = dressupListComponent;
        this.$turboEngineContext = qpuVar;
    }

    public static /* synthetic */ Object ipc$super(DressupListComponent$recommendContainer$2 dressupListComponent$recommendContainer$2, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dressup/common/component/outer/DressupListComponent$recommendContainer$2");
    }

    @Override // tb.d1a
    public final nhd invoke() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nhd) ipChange.ipc$dispatch("e0ddd3cf", new Object[]{this});
        }
        Map<String, Object> c = this.$turboEngineContext.a().c();
        Object obj = c != null ? c.get(tqm.CONFIG_RECOMMEND_MANAGER) : null;
        g1c g1cVar = (g1c) this.$turboEngineContext.getService(g1c.class);
        DressupListComponent.a(this.this$0, g1cVar.getDressHostService());
        if (obj instanceof nhd) {
            return (nhd) obj;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(g1cVar.getInfoFlowHostServices());
        return d.w((z4a) DressupListComponent.s(this.this$0).get(DressupListComponent.u(this.this$0)), arrayList);
    }
}
