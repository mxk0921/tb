package com.taobao.mytaobao.pagev2;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import com.taobao.mytaobao.view.MTPtrRecyclerView;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import tb.ckf;
import tb.h3j;
import tb.iln;
import tb.u1a;
import tb.xhv;
import tb.yz3;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Ltb/iln;", "reason", "", "Ltb/h3j;", "list", "Ltb/xhv;", "invoke", "(Ltb/iln;Ljava/util/List;)V", "<anonymous>"}, k = 3, mv = {1, 4, 0})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class MtbBizProxyV2$subscribeDataService$3 extends Lambda implements u1a<iln, List<? extends h3j>, xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ MtbBizProxyV2 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MtbBizProxyV2$subscribeDataService$3(MtbBizProxyV2 mtbBizProxyV2) {
        super(2);
        this.this$0 = mtbBizProxyV2;
    }

    public static /* synthetic */ Object ipc$super(MtbBizProxyV2$subscribeDataService$3 mtbBizProxyV2$subscribeDataService$3, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/mytaobao/pagev2/MtbBizProxyV2$subscribeDataService$3");
    }

    @Override // tb.u1a
    public /* bridge */ /* synthetic */ xhv invoke(iln ilnVar, List<? extends h3j> list) {
        invoke2(ilnVar, (List<h3j>) list);
        return xhv.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(iln ilnVar, List<h3j> list) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a314858f", new Object[]{this, ilnVar, list});
            return;
        }
        ckf.h(ilnVar, "reason");
        ckf.h(list, "list");
        ArrayList arrayList = new ArrayList();
        int size = list.size() - 1;
        boolean z = false;
        for (Object obj : list) {
            i++;
            if (i >= 0) {
                h3j h3jVar = (h3j) obj;
                if (i == size && ckf.b(h3jVar.a(), "weex")) {
                    z = true;
                }
                DXTemplateItem c = h3jVar.c();
                if (c != null && ckf.b(h3jVar.a(), "dinamicx")) {
                    arrayList.add(c);
                }
            } else {
                yz3.p();
                throw null;
            }
        }
        this.this$0.P().b().e(arrayList);
        MTPtrRecyclerView l = this.this$0.l();
        if (l != null) {
            l.v2HasBasement = z;
        }
        if (!z) {
            MtbBizProxyV2.G(this.this$0).v();
        }
    }
}
