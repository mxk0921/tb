package com.taobao.themis.inside.adapter;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.network.IMtopInnerAdapter;
import com.taobao.themis.kernel.network.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import tb.ckf;
import tb.g1a;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/taobao/themis/kernel/network/IMtopInnerAdapter$Response;", "response", "Ltb/xhv;", "invoke", "(Lcom/taobao/themis/kernel/network/IMtopInnerAdapter$Response;)V", "<no name provided>"}, k = 3, mv = {1, 6, 0})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class MtopAdapterImpl$requestAsync$1 extends Lambda implements g1a<IMtopInnerAdapter.Response, xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ IMtopInnerAdapter.b $listener;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MtopAdapterImpl$requestAsync$1(IMtopInnerAdapter.b bVar) {
        super(1);
        this.$listener = bVar;
    }

    public static /* synthetic */ Object ipc$super(MtopAdapterImpl$requestAsync$1 mtopAdapterImpl$requestAsync$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/inside/adapter/MtopAdapterImpl$requestAsync$1");
    }

    @Override // tb.g1a
    public /* bridge */ /* synthetic */ xhv invoke(IMtopInnerAdapter.Response response) {
        invoke2(response);
        return xhv.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(IMtopInnerAdapter.Response response) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14f3a00a", new Object[]{this, response});
            return;
        }
        ckf.g(response, "response");
        if (response.getSuccess()) {
            ((a) this.$listener).c(response);
        } else {
            ((a) this.$listener).b(response);
        }
    }
}
