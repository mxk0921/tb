package tb;

import android.net.Uri;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.themis.kernel.container.Window;
import com.taobao.themis.kernel.page.ITMSPage;
import com.taobao.themis.kernel.solution.TMSSolutionType;
import com.taobao.uikit.actionbar.TBPublicMenuItem;
import tb.bac;
import tb.rwd;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class lli extends bac.c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(844103698);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lli(ITMSPage iTMSPage) {
        super(iTMSPage);
        ckf.g(iTMSPage, "page");
    }

    public static /* synthetic */ Object ipc$super(lli lliVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/pub/menu/MenuItemAbout");
    }

    @Override // tb.bac.c
    public int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1ddaaf0b", new Object[]{this})).intValue();
        }
        return R.id.menu_item_about;
    }

    /* renamed from: f */
    public TBPublicMenuItem d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBPublicMenuItem) ipChange.ipc$dispatch("67fbe3ef", new Object[]{this});
        }
        TBPublicMenuItem build = new TBPublicMenuItem.Builder().setId(a()).setTitle("뤊:关于").build();
        ckf.f(build, "Builder().setId(getId()).setTitle(\"뤊:关于\").build()");
        return build;
    }

    @Override // tb.bac.c
    public void e() {
        Window.Orientation orientation;
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88f782f0", new Object[]{this});
        } else if (!TextUtils.isEmpty(b().L())) {
            Uri build = ies.g(q9s.V2()).buildUpon().appendQueryParameter("appId", b().L()).appendQueryParameter("newContainer", String.valueOf(t8s.d(ies.g(b().c0().getStartUrl())))).appendQueryParameter("isThemis", "true").appendQueryParameter("frameTempType", "pubArea").appendQueryParameter("developerVersion", r8s.i(b())).build();
            if (b().a0() == TMSSolutionType.MINIGAME) {
                z = true;
            }
            rwd V = b().V();
            ckf.f(V, "mInstance.pageFactory");
            String uri = build.toString();
            ckf.f(uri, "uri.toString()");
            int requestedOrientation = b().I().getRequestedOrientation();
            if (requestedOrientation == 0) {
                orientation = Window.Orientation.LANDSCAPE;
            } else if (requestedOrientation != 1) {
                orientation = Window.Orientation.PORTRAIT;
            } else {
                orientation = Window.Orientation.PORTRAIT;
            }
            b().W().a(rwd.a.a(V, uri, new Window(null, null, null, null, null, null, null, null, Boolean.valueOf(z), null, orientation, Boolean.valueOf(z), null, null, null, null, null, 127743, null), null, null, 8, null));
        }
    }
}
