package tb;

import android.graphics.Color;
import android.net.Uri;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.themis.kernel.adapter.IUserTrackerAdapter;
import com.taobao.themis.kernel.container.Window;
import com.taobao.themis.kernel.page.ITMSPage;
import com.taobao.themis.kernel.solution.TMSSolutionType;
import com.taobao.uikit.actionbar.TBPublicMenuItem;
import java.util.HashMap;
import kotlin.collections.a;
import tb.bac;
import tb.rwd;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class nli extends bac.c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(844103700);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nli(ITMSPage iTMSPage) {
        super(iTMSPage);
        ckf.g(iTMSPage, "page");
    }

    public static /* synthetic */ Object ipc$super(nli nliVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/pub/menu/MenuItemAuthSetting");
    }

    @Override // tb.bac.c
    public int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1ddaaf0b", new Object[]{this})).intValue();
        }
        return R.id.menu_item_auth_setting;
    }

    /* renamed from: f */
    public TBPublicMenuItem d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBPublicMenuItem) ipChange.ipc$dispatch("67fbe3ef", new Object[]{this});
        }
        TBPublicMenuItem build = new TBPublicMenuItem.Builder().setId(a()).setTitle("ꄚ:授权管理").build();
        ckf.f(build, "Builder()\n        .setId…etTitle(\"ꄚ:授权管理\").build()");
        return build;
    }

    @Override // tb.bac.c
    public void e() {
        Window.Orientation orientation;
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88f782f0", new Object[]{this});
            return;
        }
        String b = t8s.b();
        ckf.f(b, "getAuthUrl()");
        Uri build = ies.g(b).buildUpon().appendQueryParameter("appId", b().L()).appendQueryParameter("frameTempType", "pubArea").build();
        if (b().a0() == TMSSolutionType.MINIGAME) {
            z = true;
        }
        rwd V = b().V();
        ckf.f(V, "mInstance.pageFactory");
        String uri = build.toString();
        ckf.f(uri, "uri.toString()");
        int parseColor = Color.parseColor(why.DEFAULT_MASK_BACKGROUND_COLOR);
        int requestedOrientation = b().I().getRequestedOrientation();
        if (requestedOrientation == 0) {
            orientation = Window.Orientation.LANDSCAPE;
        } else if (requestedOrientation != 1) {
            orientation = Window.Orientation.PORTRAIT;
        } else {
            orientation = Window.Orientation.PORTRAIT;
        }
        b().W().a(rwd.a.a(V, uri, new Window(null, null, null, null, Integer.valueOf(parseColor), Boolean.FALSE, null, null, Boolean.valueOf(z), null, orientation, Boolean.valueOf(z), null, null, null, null, null, 127695, null), null, null, 8, null));
        HashMap hashMap = new HashMap();
        String L = b().L();
        ckf.f(L, "mInstance.appId");
        hashMap.put("miniapp_id", L);
        IUserTrackerAdapter iUserTrackerAdapter = (IUserTrackerAdapter) p8s.b(IUserTrackerAdapter.class);
        if (iUserTrackerAdapter != null) {
            iUserTrackerAdapter.customAdvance("2101", "TRVTbApiPage", "TRVGlobalAuthManager", "", "", a.r(hashMap), null);
        }
    }
}
