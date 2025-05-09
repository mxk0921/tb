package com.taobao.android.turbo.subpage.component.dx;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import tb.ckf;
import tb.unf;
import tb.w1a;
import tb.xhv;
import tb.yz3;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Ltb/unf;", "itemData", "", "<anonymous parameter 1>", "", "strategy", "Ltb/xhv;", "invoke", "(Ltb/unf;ZI)V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class DxContainer$updateListener$1 extends Lambda implements w1a<unf, Boolean, Integer, xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ DxContainer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DxContainer$updateListener$1(DxContainer dxContainer) {
        super(3);
        this.this$0 = dxContainer;
    }

    public static /* synthetic */ Object ipc$super(DxContainer$updateListener$1 dxContainer$updateListener$1, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/turbo/subpage/component/dx/DxContainer$updateListener$1");
    }

    @Override // tb.w1a
    public /* bridge */ /* synthetic */ xhv invoke(unf unfVar, Boolean bool, Integer num) {
        invoke(unfVar, bool.booleanValue(), num.intValue());
        return xhv.INSTANCE;
    }

    public final void invoke(unf unfVar, boolean z, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("caf9b4bb", new Object[]{this, unfVar, new Boolean(z), new Integer(i)});
            return;
        }
        ckf.g(unfVar, "itemData");
        if (!ckf.b(unfVar.d(), DxContainer.f(this.this$0))) {
            return;
        }
        if (i == 1) {
            DinamicXEngine g = DxContainer.g(this.this$0);
            if (g != null) {
                DXTemplateItem dXTemplateItem = new DXTemplateItem();
                dXTemplateItem.f7343a = unfVar.d();
                dXTemplateItem.b = unfVar.c();
                dXTemplateItem.c = unfVar.e();
                xhv xhvVar = xhv.INSTANCE;
                g.p(yz3.m(dXTemplateItem));
            }
        } else if (i == 2) {
            DxContainer.i(this.this$0, null);
            DxContainer dxContainer = this.this$0;
            dxContainer.o(DxContainer.c(dxContainer), DxContainer.d(this.this$0), unfVar.d(), DxContainer.e(this.this$0), null);
        }
    }
}
