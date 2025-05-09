package tb;

import android.app.Activity;
import android.os.Vibrator;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.uikit.extend.component.refresh.TBRefreshHeader;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class xtm implements qsd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final joq f31599a;
    public final Activity b;

    static {
        t2o.a(729810303);
        t2o.a(729810301);
    }

    public xtm(joq joqVar, Activity activity) {
        this.f31599a = joqVar;
        this.b = activity;
    }

    @Override // tb.qsd
    public boolean b(TBRefreshHeader.RefreshState refreshState, TBRefreshHeader.RefreshState refreshState2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e8a10f5b", new Object[]{this, refreshState, refreshState2})).booleanValue();
        }
        if (refreshState == TBRefreshHeader.RefreshState.RELEASE_TO_REFRESH && refreshState2 == TBRefreshHeader.RefreshState.PREPARE_TO_SECOND_FLOOR) {
            return true;
        }
        return false;
    }

    public final void c() {
        Activity activity;
        Vibrator vibrator;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aed5aa76", new Object[]{this});
        } else if (h8x.b() && (activity = this.b) != null && (vibrator = (Vibrator) activity.getSystemService("vibrator")) != null) {
            vibrator.vibrate(50L);
        }
    }

    @Override // tb.qsd
    public void a(h7p h7pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6028753c", new Object[]{this, h7pVar});
            return;
        }
        c();
        this.f31599a.j(0, "second_floor_fetch_mtop_event", null);
        bqa.d("PrepareToSecondFloorStatusProcessor", "当前是准备进入二楼状态");
    }
}
