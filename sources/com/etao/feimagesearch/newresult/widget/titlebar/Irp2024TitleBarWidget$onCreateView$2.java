package com.etao.feimagesearch.newresult.widget.titlebar;

import androidx.fragment.app.FragmentActivity;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import tb.ckf;
import tb.p9j;
import tb.u1a;
import tb.xhv;
import tb.ylf;
import tb.zmf;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class Irp2024TitleBarWidget$onCreateView$2 extends Lambda implements u1a<p9j, Integer, xhv> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ Irp2024TitleBarWidget this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Irp2024TitleBarWidget$onCreateView$2(Irp2024TitleBarWidget irp2024TitleBarWidget) {
        super(2);
        this.this$0 = irp2024TitleBarWidget;
    }

    public static /* synthetic */ Object ipc$super(Irp2024TitleBarWidget$onCreateView$2 irp2024TitleBarWidget$onCreateView$2, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/newresult/widget/titlebar/Irp2024TitleBarWidget$onCreateView$2");
    }

    @Override // tb.u1a
    public /* bridge */ /* synthetic */ xhv invoke(p9j p9jVar, Integer num) {
        invoke(p9jVar, num.intValue());
        return xhv.INSTANCE;
    }

    public final void invoke(p9j p9jVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("348fefa6", new Object[]{this, p9jVar, new Integer(i)});
            return;
        }
        ckf.g(p9jVar, "bean");
        if (p9jVar.a()) {
            zmf.a r = this.this$0.W().r(p9jVar.b);
            if (r != null) {
                zmf.g().d((FragmentActivity) this.this$0.E(), r);
                return;
            }
            return;
        }
        ylf.a m0 = this.this$0.m0();
        if (m0 != null) {
            m0.p(p9jVar);
        }
        Irp2024TitleBarWidget.K0(this.this$0, p9jVar.f25964a);
    }
}
