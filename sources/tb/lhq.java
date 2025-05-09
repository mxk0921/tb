package tb;

import android.app.Activity;
import android.content.Intent;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.topmultitab.service.searchbar.IHomeSearchBarService;
import com.taobao.uikit.extend.component.refresh.TBRefreshHeader;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class lhq implements qsd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Activity f23346a;
    public final cfc b;

    static {
        t2o.a(729810305);
        t2o.a(729810301);
    }

    public lhq(Activity activity, wcc wccVar) {
        this.f23346a = activity;
        this.b = wccVar;
    }

    @Override // tb.qsd
    public void a(h7p h7pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6028753c", new Object[]{this, h7pVar});
            return;
        }
        d();
        c();
        lps.a();
        bqa.d("StartEnterSecondFloorStatusProcessor", "开始进入二楼");
    }

    @Override // tb.qsd
    public boolean b(TBRefreshHeader.RefreshState refreshState, TBRefreshHeader.RefreshState refreshState2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e8a10f5b", new Object[]{this, refreshState, refreshState2})).booleanValue();
        }
        if (refreshState2 == TBRefreshHeader.RefreshState.SECOND_FLOOR_START) {
            return true;
        }
        return false;
    }

    public final void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea283230", new Object[]{this});
            return;
        }
        IHomeSearchBarService iHomeSearchBarService = (IHomeSearchBarService) this.b.a(IHomeSearchBarService.class);
        if (iHomeSearchBarService == null) {
            bqa.d("StartEnterSecondFloorStatusProcessor", "homeSearchBarService == null");
        } else {
            iHomeSearchBarService.setSearchBarVisibility(8);
        }
    }

    public final void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21c80b93", new Object[]{this});
            return;
        }
        Intent intent = new Intent();
        intent.setAction(vkg.KEY_UPDATE_GUANG_GUANG_TABICON);
        intent.putExtra("show", false);
        LocalBroadcastManager.getInstance(this.f23346a).sendBroadcast(intent);
    }
}
