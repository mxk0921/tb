package tb;

import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.topmultitab.service.pulldown.IPullDownService;
import com.taobao.tao.topmultitab.service.searchbar.IHomeSearchBarService;
import com.taobao.tao.topmultitab.service.shake.IShakeService;
import com.taobao.uikit.extend.component.refresh.TBRefreshHeader;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class vkg implements qsd {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_UPDATE_GUANG_GUANG_TABICON = "UpdateGuangGuangTabIconVisibility";
    public static final String KEY_UPDATE_GUANG_GUANG_TABICON_ACTION = "show";

    /* renamed from: a  reason: collision with root package name */
    public final wcc f30069a;
    public final Activity b;
    public final IPullDownService.a c;

    static {
        t2o.a(729810302);
        t2o.a(729810301);
    }

    public vkg(Activity activity, wcc wccVar, IPullDownService.a aVar) {
        this.f30069a = wccVar;
        this.b = activity;
        this.c = aVar;
    }

    @Override // tb.qsd
    public void a(h7p h7pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6028753c", new Object[]{this, h7pVar});
        } else if (h8x.a()) {
            c(h7pVar);
            d();
            g();
            f();
            lps.b();
            e();
            this.c.onExitPullSecondFloor();
            bqa.d("BackToHomeStatusProcessor", "从二楼回首页");
        }
    }

    @Override // tb.qsd
    public boolean b(TBRefreshHeader.RefreshState refreshState, TBRefreshHeader.RefreshState refreshState2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e8a10f5b", new Object[]{this, refreshState, refreshState2})).booleanValue();
        }
        if (refreshState == TBRefreshHeader.RefreshState.SECOND_FLOOR_END && refreshState2 == TBRefreshHeader.RefreshState.NONE) {
            return true;
        }
        return false;
    }

    public final void c(h7p h7pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("103e04ca", new Object[]{this, h7pVar});
            return;
        }
        k7p.a();
        k7p.f("Page_Home", h7pVar.e());
    }

    public final void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("277dc81d", new Object[]{this});
        } else if (TextUtils.equals(f4b.h("homePageBackRequestEnable", "true"), "true")) {
            yyj.e().H(new String[]{yyj.e().f(), yyj.e().k()});
        }
    }

    public final void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3de89c55", new Object[]{this});
            return;
        }
        IHomeSearchBarService iHomeSearchBarService = (IHomeSearchBarService) this.f30069a.a(IHomeSearchBarService.class);
        if (iHomeSearchBarService == null) {
            bqa.d("BackToHomeStatusProcessor", "homeSearchBarService == null");
        } else {
            iHomeSearchBarService.setSearchBarVisibility(0);
        }
    }

    public final void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80910a4b", new Object[]{this});
            return;
        }
        IShakeService iShakeService = (IShakeService) this.f30069a.a(IShakeService.class);
        if (iShakeService != null) {
            iShakeService.startShake();
        }
    }

    public final void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("796280b8", new Object[]{this});
            return;
        }
        Intent intent = new Intent();
        intent.setAction(KEY_UPDATE_GUANG_GUANG_TABICON);
        intent.putExtra("show", true);
        LocalBroadcastManager.getInstance(this.b).sendBroadcast(intent);
    }
}
