package com.taobao.unit.center.sync;

import com.alibaba.security.realidentity.p1;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.unit.center.sync.model.LayoutResponse;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReference;
import tb.ckf;
import tb.dun;
import tb.g1a;
import tb.xhv;
import tb.xyf;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\u0015\u0010\u0004\u001a\u00110\u0000¢\u0006\f\b\u0001\u0012\b\b\u0002\u0012\u0004\b\b(\u0003¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/taobao/unit/center/sync/model/LayoutResponse;", "Lkotlin/ParameterName;", "name", "response", p1.d, "Ltb/xhv;", "invoke", "(Lcom/taobao/unit/center/sync/model/LayoutResponse;)V", "<anonymous>"}, k = 3, mv = {1, 4, 0})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final /* synthetic */ class LayoutSyncManager$checkSync$2 extends FunctionReference implements g1a<LayoutResponse, xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public LayoutSyncManager$checkSync$2(LayoutSyncManager layoutSyncManager) {
        super(1, layoutSyncManager);
    }

    public static /* synthetic */ Object ipc$super(LayoutSyncManager$checkSync$2 layoutSyncManager$checkSync$2, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/unit/center/sync/LayoutSyncManager$checkSync$2");
    }

    @Override // kotlin.jvm.internal.CallableReference, tb.vyf
    public final String getName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this});
        }
        return "remoteSyncSuccessFunc";
    }

    @Override // kotlin.jvm.internal.CallableReference
    public final xyf getOwner() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xyf) ipChange.ipc$dispatch("71b3b10f", new Object[]{this});
        }
        return dun.b(LayoutSyncManager.class);
    }

    @Override // kotlin.jvm.internal.CallableReference
    public final String getSignature() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1f15da37", new Object[]{this});
        }
        return "remoteSyncSuccessFunc(Lcom/taobao/unit/center/sync/model/LayoutResponse;)V";
    }

    @Override // tb.g1a
    public /* bridge */ /* synthetic */ xhv invoke(LayoutResponse layoutResponse) {
        invoke2(layoutResponse);
        return xhv.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(LayoutResponse layoutResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47fbb76b", new Object[]{this, layoutResponse});
            return;
        }
        ckf.h(layoutResponse, p1.d);
        LayoutSyncManager.access$remoteSyncSuccessFunc((LayoutSyncManager) this.receiver, layoutResponse);
    }
}
