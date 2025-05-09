package tb;

import android.text.TextUtils;
import com.alipay.android.phone.wallet.spmtracker.Constant;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.subservice.biz.IRocketSubService;
import com.taobao.infoflow.protocol.subservice.biz.ISmartBackRefreshService;
import com.taobao.infoflow.protocol.subservice.framework.IHostService;
import com.taobao.infoflow.protocol.subservice.framework.IMainLifecycleService;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class b5q {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final List<String> d = Arrays.asList(Constant.KEY_PAGEBACK, "homeTabAppear", "coldStart");

    /* renamed from: a  reason: collision with root package name */
    public final cfc f16193a;
    public final b92 b = new b92();
    public long c;

    public b5q(cfc cfcVar) {
        this.f16193a = cfcVar;
    }

    public long a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7a2c5d0f", new Object[]{this})).longValue();
        }
        return this.c;
    }

    public final boolean b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("872ea3e5", new Object[]{this, str})).booleanValue();
        }
        return d.contains(str);
    }

    public final boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("20cfb33d", new Object[]{this})).booleanValue();
        }
        IRocketSubService iRocketSubService = (IRocketSubService) this.f16193a.a(IRocketSubService.class);
        if (iRocketSubService != null) {
            return !iRocketSubService.isOnRocketState();
        }
        return false;
    }

    public boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2e259a71", new Object[]{this})).booleanValue();
        }
        return this.b.h();
    }

    public boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("69978a", new Object[]{this})).booleanValue();
        }
        return this.b.i();
    }

    public final boolean h(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dda0f1ce", new Object[]{this, str, new Boolean(z)})).booleanValue();
        }
        if (!e() && !z) {
            fve.e("SmartBackRefresher", "is not first screen");
            return false;
        } else if (!i() && !z) {
            fve.e("SmartBackRefresher", "is not at recommend tab");
            return false;
        } else if (!b(str)) {
            fve.e("SmartBackRefresher", "isAllowRequest is false， requestType： " + str);
            return false;
        } else if (!ul4.e(this.f16193a) || z) {
            return true;
        } else {
            fve.e("SmartBackRefresher", "isDataAbandoned is true");
            return false;
        }
    }

    public final boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8818347a", new Object[]{this})).booleanValue();
        }
        if (!d() || !c()) {
            return false;
        }
        return true;
    }

    public void l(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff46bce3", new Object[]{this, str});
            return;
        }
        fve.e("SmartBackRefresher", "onInfoFlowInVisible type : " + str);
        this.c = System.currentTimeMillis() - 1000;
    }

    public Map<String, String> k(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("245f5719", new Object[]{this, str});
        }
        if (!h(str, false)) {
            fve.e("SmartBackRefresher", "不允许携带 Bx 行为数据");
            return null;
        }
        ISmartBackRefreshService iSmartBackRefreshService = (ISmartBackRefreshService) this.f16193a.a(ISmartBackRefreshService.class);
        if (iSmartBackRefreshService == null) {
            fve.e("SmartBackRefresher", "Refresh Service is Null");
            return null;
        }
        boolean isBackgroundToFront = iSmartBackRefreshService.isBackgroundToFront();
        iSmartBackRefreshService.resetCommonStatus();
        return this.b.f(this.c, isBackgroundToFront);
    }

    public final boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("270e7c07", new Object[]{this})).booleanValue();
        }
        boolean a2 = h8x.a();
        boolean z = !a2;
        IHostService iHostService = (IHostService) this.f16193a.a(IHostService.class);
        if (iHostService == null) {
            fve.e(obq.SPLASH_BUSINESS_TAG, "isHostPageOnStackTop-> hostService is null");
            return false;
        }
        u5d j = iHostService.getInvokeCallback().j();
        if (j == null) {
            fve.e(obq.SPLASH_BUSINESS_TAG, "isHostPageOnStackTop-> pageCallback is null");
            return false;
        }
        boolean n = j.n();
        fve.e(obq.SPLASH_BUSINESS_TAG, "isAtHome->： 不在二楼：" + z + " 是首页fragment：" + n);
        return !a2 && n;
    }

    public final boolean d() {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b9b9fc02", new Object[]{this})).booleanValue();
        }
        IMainLifecycleService iMainLifecycleService = (IMainLifecycleService) this.f16193a.a(IMainLifecycleService.class);
        if (iMainLifecycleService != null && iMainLifecycleService.isSelect()) {
            z = true;
        }
        fve.e(obq.SPLASH_BUSINESS_TAG, "isAtRecommendHomeTab-> " + z);
        return z;
    }

    static {
        t2o.a(491782656);
    }

    public Map<String, String> j(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("c234e71a", new Object[]{this, str, new Boolean(z)});
        }
        ISmartBackRefreshService iSmartBackRefreshService = (ISmartBackRefreshService) this.f16193a.a(ISmartBackRefreshService.class);
        if (iSmartBackRefreshService == null) {
            fve.e("SmartBackRefresher", "Refresh Service is Null");
            return null;
        }
        boolean enableOutLinkBackRefresh = iSmartBackRefreshService.enableOutLinkBackRefresh();
        boolean enableOutLinkLockPosition = iSmartBackRefreshService.enableOutLinkLockPosition();
        boolean z2 = TextUtils.equals(str, "coldStart") || iSmartBackRefreshService.isCurrentRefreshByOutLink();
        if (!h(str, z2)) {
            fve.e("SmartBackRefresher", "不允许携带 Bx 行为数据");
            return null;
        }
        String firstCompletelyVisibleBizCode = iSmartBackRefreshService.getFirstCompletelyVisibleBizCode();
        boolean enableSearchClickCheck = iSmartBackRefreshService.enableSearchClickCheck();
        boolean isDirectClickInInfoFlow = iSmartBackRefreshService.isDirectClickInInfoFlow();
        boolean enableIpvBackRefresh = iSmartBackRefreshService.enableIpvBackRefresh();
        boolean enablePaySuccessBackRefresh = iSmartBackRefreshService.enablePaySuccessBackRefresh();
        boolean b = f4b.b("enableIpvBackRefresh", true);
        String[] outLinkItemIdKey = iSmartBackRefreshService.getOutLinkItemIdKey();
        boolean enableSearchBackRefresh = iSmartBackRefreshService.enableSearchBackRefresh();
        iSmartBackRefreshService.resetStatus();
        Map<String, String> e = this.b.e(this.c, firstCompletelyVisibleBizCode, enableSearchBackRefresh, enableSearchClickCheck, enableIpvBackRefresh && b && !isDirectClickInInfoFlow, enableOutLinkBackRefresh && z2, enableOutLinkLockPosition, outLinkItemIdKey, enablePaySuccessBackRefresh, z);
        if (e != null && !e.isEmpty()) {
            iSmartBackRefreshService.setRequestWithBxFeature(true);
        }
        return e;
    }
}
