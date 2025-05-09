package com.taobao.themis.kernel.extension.page;

import androidx.fragment.app.Fragment;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.Lambda;
import tb.d1a;
import tb.mdd;
import tb.qml;
import tb.tll;
import tb.vxm;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class AppAPMPageExtension$mPageProcedure$2 extends Lambda implements d1a<mdd> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ AppAPMPageExtension this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppAPMPageExtension$mPageProcedure$2(AppAPMPageExtension appAPMPageExtension) {
        super(0);
        this.this$0 = appAPMPageExtension;
    }

    public static /* synthetic */ Object ipc$super(AppAPMPageExtension$mPageProcedure$2 appAPMPageExtension$mPageProcedure$2, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/kernel/extension/page/AppAPMPageExtension$mPageProcedure$2");
    }

    @Override // tb.d1a
    public final mdd invoke() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mdd) ipChange.ipc$dispatch("11ca9b62", new Object[]{this});
        }
        Fragment fragment = null;
        if (!qml.z(this.this$0.n())) {
            vxm vxmVar = vxm.b;
            tll pageContext = this.this$0.n().getPageContext();
            if (pageContext != null) {
                fragment = pageContext.getCurrentFragment();
            }
            return vxmVar.j(fragment);
        } else if (this.this$0.n().getInstance().c0().isFragmentContainer()) {
            vxm vxmVar2 = vxm.b;
            tll pageContext2 = this.this$0.n().getPageContext();
            if (pageContext2 != null) {
                fragment = pageContext2.getCurrentFragment();
            }
            return vxmVar2.j(fragment);
        } else {
            tll pageContext3 = this.this$0.n().getPageContext();
            if ((pageContext3 == null ? null : pageContext3.getCurrentFragment()) == null) {
                return vxm.b.a(this.this$0.n().getInstance().I());
            }
            vxm vxmVar3 = vxm.b;
            tll pageContext4 = this.this$0.n().getPageContext();
            if (pageContext4 != null) {
                fragment = pageContext4.getCurrentFragment();
            }
            return vxmVar3.j(fragment);
        }
    }
}
