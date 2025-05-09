package tb;

import com.alibaba.ability.localization.Localization;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.festival.FestivalMgr;
import com.taobao.android.navigationextern.NavigationExternSwitch;
import com.taobao.android.revisionswitch.TBRevisionSwitchManager;
import com.taobao.tao.log.TLog;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class sqs {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public int f28219a;
    public int b;

    public int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("574243a8", new Object[]{this})).intValue();
        }
        return this.b;
    }

    public int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("dc9cc0f", new Object[]{this})).intValue();
        }
        return this.f28219a;
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        e();
        d();
    }

    public void d() {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2918e2c9", new Object[]{this});
            return;
        }
        if ("1".equals(TBRevisionSwitchManager.c().e("elderHome"))) {
            i = 2;
        }
        if (FestivalMgr.i().q() && FestivalMgr.i().y()) {
            i |= 4;
        }
        if (i == 0) {
            i |= 1;
        }
        this.b = i;
        TLog.loge("TabHostVersionAndStyleManager", "onStyleChanged", "currentStyle: " + i);
    }

    public void e() {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8fcb182", new Object[]{this});
            return;
        }
        if (TBRevisionSwitchManager.c().d(bud.KEY_NEW_DISCOVERY_ENABLE)) {
            i = NavigationExternSwitch.B() ? 16 : 8;
        }
        if (!NavigationExternSwitch.y()) {
            i |= 32;
        }
        if (NavigationExternSwitch.o()) {
            i |= 4;
        }
        if (Localization.o()) {
            i |= 2;
        }
        if (i == 0) {
            i |= 1;
        }
        this.f28219a = i;
        TLog.loge("TabHostVersionAndStyleManager", "onVersionChanged", "currentVersion: " + i);
    }
}
