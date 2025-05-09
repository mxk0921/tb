package tb;

import android.app.Activity;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.themis.kernel.adapter.IShareAdapter;
import com.taobao.themis.kernel.page.ITMSPage;
import com.taobao.uikit.actionbar.TBPublicMenuItem;
import tb.bac;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class sli extends bac.c {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final TBPublicMenuItem c = new TBPublicMenuItem.Builder().setId(a()).setTitle("ꄪ:分享").setName(g()).build();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a implements IShareAdapter.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.themis.kernel.adapter.IShareAdapter.a
        public void onCancel(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("44139f0a", new Object[]{this, str});
            } else {
                ckf.g(str, "msg");
            }
        }

        @Override // com.taobao.themis.kernel.adapter.IShareAdapter.a
        public void onFail(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("239cc86e", new Object[]{this, str});
            } else {
                ckf.g(str, "msg");
            }
        }

        @Override // com.taobao.themis.kernel.adapter.IShareAdapter.a
        public void onSuccess(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("37d948b5", new Object[]{this, str});
            } else {
                ckf.g(str, "msg");
            }
        }
    }

    static {
        t2o.a(844103704);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sli(ITMSPage iTMSPage) {
        super(iTMSPage);
        ckf.g(iTMSPage, "page");
    }

    public static /* synthetic */ Object ipc$super(sli sliVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/pub/menu/MenuItemShare");
    }

    @Override // tb.bac.c
    public int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1ddaaf0b", new Object[]{this})).intValue();
        }
        return R.id.menu_item_share;
    }

    @Override // tb.bac.c
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88f782f0", new Object[]{this});
        } else {
            h(c());
        }
    }

    /* renamed from: f */
    public TBPublicMenuItem d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBPublicMenuItem) ipChange.ipc$dispatch("67fbe3ef", new Object[]{this});
        }
        TBPublicMenuItem tBPublicMenuItem = this.c;
        ckf.f(tBPublicMenuItem, "itemData");
        return tBPublicMenuItem;
    }

    public String g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f7ca74bd", new Object[]{this});
        }
        return sbs.INSTANCE.i();
    }

    public final void h(ITMSPage iTMSPage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c57f1c91", new Object[]{this, iTMSPage});
            return;
        }
        npd npdVar = (npd) iTMSPage.getExtension(npd.class);
        IShareAdapter.b K = npdVar == null ? null : npdVar.K();
        if (K != null) {
            Activity I = iTMSPage.getInstance().I();
            ckf.f(I, "page.getInstance().activity");
            ((IShareAdapter) p8s.g(IShareAdapter.class)).share(I, iTMSPage, K, new a());
        }
    }
}
