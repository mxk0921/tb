package com.taobao.android.dressup.common.component.layout;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dressup.common.model.PageModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import tb.byb;
import tb.d1a;
import tb.qpu;

/* compiled from: Taobao */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 4, 1})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class CommonListLayoutComponent$pageBusinessId$2 extends Lambda implements d1a<String> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ qpu $turboEngineContext;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommonListLayoutComponent$pageBusinessId$2(qpu qpuVar) {
        super(0);
        this.$turboEngineContext = qpuVar;
    }

    public static /* synthetic */ Object ipc$super(CommonListLayoutComponent$pageBusinessId$2 commonListLayoutComponent$pageBusinessId$2, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dressup/common/component/layout/CommonListLayoutComponent$pageBusinessId$2");
    }

    @Override // tb.d1a
    public final String invoke() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4d5ae581", new Object[]{this});
        }
        Object s = ((byb) this.$turboEngineContext.getService(byb.class)).s();
        if (s != null) {
            String businessId = ((PageModel) s).getBusinessId();
            return businessId != null ? businessId : "";
        }
        throw new NullPointerException("null cannot be cast to non-null type com.taobao.android.dressup.common.model.PageModel");
    }
}
