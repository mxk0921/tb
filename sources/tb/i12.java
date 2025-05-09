package tb;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.infoflow.multitab.nativetab.NativeContainerProvider;
import com.taobao.tao.infoflow.multitab.protocol.IMultiTabPerformanceListener;
import com.taobao.tao.infoflow.multitab.viewprovider.IMultiTabStabilityListener;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class i12 extends nv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public rwc f21029a;
    public final JSONObject b;
    public final IMultiTabPerformanceListener c;
    public final IMultiTabStabilityListener d;
    public final int e;

    static {
        t2o.a(729809470);
    }

    public i12(fdc fdcVar, JSONObject jSONObject, IMultiTabPerformanceListener iMultiTabPerformanceListener, IMultiTabStabilityListener iMultiTabStabilityListener, int i) {
        super(fdcVar);
        this.b = jSONObject;
        this.c = iMultiTabPerformanceListener;
        this.d = iMultiTabStabilityListener;
        this.e = i;
    }

    public static /* synthetic */ Object ipc$super(i12 i12Var, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1819431438:
                super.onAppToBackground();
                return null;
            case -1512649357:
                super.onResume();
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case -1326718709:
                return super.getTabBarButtonShowState();
            case -1061013293:
                super.onAppToFront();
                return null;
            case 151698896:
                super.onPageSelected();
                return null;
            case 188604040:
                super.onStop();
                return null;
            case 258939967:
                return new Boolean(super.isOnRocketState());
            case 413640386:
                super.onCreate();
                return null;
            case 497921929:
                super.onPageUnSelected();
                return null;
            case 606228094:
                super.onPullRefresh();
                return null;
            case 797441118:
                super.onPause();
                return null;
            case 1101850916:
                super.onClickRocket();
                return null;
            case 2133689546:
                super.onStart();
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/infoflow/multitab/subtab/BaseSubMultiTabController");
        }
    }

    @Override // com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public View createView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("79a2c742", new Object[]{this, context});
        }
        rwc a2 = um4.a(this.b);
        this.f21029a = a2;
        if (a2 == null) {
            d9j.c("BaseSubMultiTab", "createView: containerProvider is null");
            return new View(context);
        }
        a2.f(this.c);
        this.f21029a.e(this.e);
        d9j.c("BaseSubMultiTab", "containerProvider createView: ");
        return this.f21029a.d(context, this.b);
    }

    @Override // tb.nv, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public String getTabBarButtonShowState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b0ebe10b", new Object[]{this});
        }
        rwc rwcVar = this.f21029a;
        if (rwcVar == null) {
            return super.getTabBarButtonShowState();
        }
        String tabBarButtonShowState = rwcVar.getTabBarButtonShowState();
        d9j.c("BaseSubMultiTab", "getTabBarButtonShowState：" + tabBarButtonShowState);
        return tabBarButtonShowState;
    }

    @Override // tb.nv, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public boolean isEnablePullReFresh() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b20c9b34", new Object[]{this})).booleanValue();
        }
        rwc rwcVar = this.f21029a;
        if (rwcVar != null) {
            return TextUtils.equals(rwcVar.getContainerType(), NativeContainerProvider.DX_CONTAINER);
        }
        return false;
    }

    @Override // tb.nv, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public boolean isEnableToSecondFloor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8c45f0bb", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // tb.nv, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public boolean isOnRocketState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f6f1c3f", new Object[]{this})).booleanValue();
        }
        rwc rwcVar = this.f21029a;
        if (rwcVar == null) {
            return super.isOnRocketState();
        }
        String tabBarButtonShowState = rwcVar.getTabBarButtonShowState();
        d9j.c("BaseSubMultiTab", "isOnRocketState：" + tabBarButtonShowState);
        return TextUtils.equals(tabBarButtonShowState, "rocket");
    }

    @Override // tb.nv, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public void onAppToBackground() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("938dadf2", new Object[]{this});
            return;
        }
        super.onAppToBackground();
        d9j.c("BaseSubMultiTab", "onAppToBackground: ");
    }

    @Override // tb.nv, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public void onAppToFront() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0c238d3", new Object[]{this});
            return;
        }
        super.onAppToFront();
        d9j.c("BaseSubMultiTab", "onAppToFront: ");
    }

    @Override // tb.nv, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public void onClickRocket() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41ace924", new Object[]{this});
            return;
        }
        super.onClickRocket();
        d9j.c("BaseSubMultiTab", "onClickRocket: ");
        rwc rwcVar = this.f21029a;
        if (rwcVar != null) {
            rwcVar.c();
        }
    }

    @Override // tb.nv, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public void onColdStartResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45e9b853", new Object[]{this});
        }
    }

    @Override // tb.nv, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public void onCreate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18a7a6c2", new Object[]{this});
            return;
        }
        super.onCreate();
        d9j.c("BaseSubMultiTab", "onCreate: ");
    }

    @Override // tb.nv, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        rwc rwcVar = this.f21029a;
        if (rwcVar != null) {
            rwcVar.destroy();
        }
        d9j.c("BaseSubMultiTab", "onDestroy: ");
    }

    @Override // tb.nv, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public void onPageSelected() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90abdd0", new Object[]{this});
            return;
        }
        super.onPageSelected();
        rwc rwcVar = this.f21029a;
        if (rwcVar != null) {
            rwcVar.a();
        }
        d9j.c("BaseSubMultiTab", "onPageSelected: ");
    }

    @Override // tb.nv, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public void onPageUnSelected() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1dadaf89", new Object[]{this});
            return;
        }
        super.onPageUnSelected();
        d9j.c("BaseSubMultiTab", "onPageUnSelected: ");
        rwc rwcVar = this.f21029a;
        if (rwcVar != null) {
            rwcVar.b();
        }
    }

    @Override // tb.nv, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        super.onPause();
        d9j.c("BaseSubMultiTab", "onPause: ");
        rwc rwcVar = this.f21029a;
        if (rwcVar != null) {
            rwcVar.onPause();
        }
    }

    @Override // tb.nv, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public void onPullRefresh() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24224e7e", new Object[]{this});
            return;
        }
        super.onPullRefresh();
        d9j.c("BaseSubMultiTab", "onPullRefresh: ");
        rwc rwcVar = this.f21029a;
        if (rwcVar != null) {
            rwcVar.onPullRefresh();
        }
    }

    @Override // tb.nv, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        d9j.c("BaseSubMultiTab", "onResume: ");
        rwc rwcVar = this.f21029a;
        if (rwcVar != null) {
            rwcVar.onResume();
        }
    }

    @Override // tb.nv, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            return;
        }
        super.onStart();
        d9j.c("BaseSubMultiTab", "onStart: ");
        rwc rwcVar = this.f21029a;
        if (rwcVar != null) {
            rwcVar.onStart();
        }
    }

    @Override // tb.nv, com.taobao.tao.topmultitab.protocol.IHomeSubTabController
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
            return;
        }
        super.onStop();
        d9j.c("BaseSubMultiTab", "onStop: ");
        rwc rwcVar = this.f21029a;
        if (rwcVar != null) {
            rwcVar.onStop();
        }
    }
}
