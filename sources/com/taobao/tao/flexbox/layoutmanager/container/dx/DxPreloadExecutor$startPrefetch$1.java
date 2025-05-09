package com.taobao.tao.flexbox.layoutmanager.container.dx;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import tb.ckf;
import tb.g1a;
import tb.wnf;
import tb.xhv;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltb/wnf;", AdvanceSetting.NETWORK_TYPE, "Ltb/xhv;", "invoke", "(Ltb/wnf;)V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class DxPreloadExecutor$startPrefetch$1 extends Lambda implements g1a<wnf, xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ List $preloadList;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DxPreloadExecutor$startPrefetch$1(List list) {
        super(1);
        this.$preloadList = list;
    }

    public static /* synthetic */ Object ipc$super(DxPreloadExecutor$startPrefetch$1 dxPreloadExecutor$startPrefetch$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/flexbox/layoutmanager/container/dx/DxPreloadExecutor$startPrefetch$1");
    }

    @Override // tb.g1a
    public /* bridge */ /* synthetic */ xhv invoke(wnf wnfVar) {
        invoke2(wnfVar);
        return xhv.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(wnf wnfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ee790ad", new Object[]{this, wnfVar});
            return;
        }
        ckf.g(wnfVar, AdvanceSetting.NETWORK_TYPE);
        if (wnfVar.b() < 1) {
            List list = this.$preloadList;
            DXTemplateItem dXTemplateItem = new DXTemplateItem();
            dXTemplateItem.f7343a = wnfVar.d();
            dXTemplateItem.b = wnfVar.c();
            dXTemplateItem.c = wnfVar.e();
            xhv xhvVar = xhv.INSTANCE;
            list.add(dXTemplateItem);
        }
    }
}
