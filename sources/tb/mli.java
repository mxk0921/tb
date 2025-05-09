package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.themis.kernel.page.ITMSPage;
import com.taobao.uikit.actionbar.TBPublicMenuItem;
import tb.bac;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class mli extends bac.c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(844103699);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mli(ITMSPage iTMSPage) {
        super(iTMSPage);
        ckf.g(iTMSPage, "page");
    }

    public static /* synthetic */ Object ipc$super(mli mliVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/pub/menu/MenuItemAddToDesktop");
    }

    @Override // tb.bac.c
    public int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1ddaaf0b", new Object[]{this})).intValue();
        }
        return R.id.menu_item_addTo_desktop;
    }

    @Override // tb.bac.c
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88f782f0", new Object[]{this});
        } else {
            x2n.a(b().I(), b().L(), r8s.f(b()), r8s.e(b()), b().c0().getStartUrl());
        }
    }

    /* renamed from: f */
    public TBPublicMenuItem d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBPublicMenuItem) ipChange.ipc$dispatch("67fbe3ef", new Object[]{this});
        }
        TBPublicMenuItem build = new TBPublicMenuItem.Builder().setId(a()).setTitle("똊:添加到桌面").build();
        ckf.f(build, "Builder().setId(getId())…tTitle(\"똊:添加到桌面\").build()");
        return build;
    }
}
