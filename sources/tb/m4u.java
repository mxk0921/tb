package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.subservice.biz.IFloatViewDetectService;
import com.taobao.infoflow.protocol.subservice.framework.IHostService;
import com.taobao.infoflow.protocol.subservice.framework.IMainLifecycleService;
import com.ut.share.business.ShareBusiness;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class m4u implements n1e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final cfc f23776a;

    static {
        t2o.a(491782724);
        t2o.a(491782720);
    }

    public m4u(cfc cfcVar) {
        this.f23776a = cfcVar;
    }

    public boolean b() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6b8a2580", new Object[]{this})).booleanValue();
        }
        boolean hasTaoPassword = ShareBusiness.getInstance().hasTaoPassword();
        StringBuilder sb = new StringBuilder("hasTaoPwd-> ");
        if (hasTaoPassword) {
            str = "有";
        } else {
            str = "没有";
        }
        sb.append(str);
        sb.append("淘口令");
        fve.e(obq.SPLASH_BUSINESS_TAG, sb.toString());
        return hasTaoPassword;
    }

    public boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bda0e116", new Object[]{this})).booleanValue();
        }
        return c();
    }

    public boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("11db6d21", new Object[]{this})).booleanValue();
        }
        if (!f() || !c()) {
            return false;
        }
        return true;
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("61876a62", new Object[]{this})).booleanValue();
        }
        IFloatViewDetectService iFloatViewDetectService = (IFloatViewDetectService) this.f23776a.a(IFloatViewDetectService.class);
        if (iFloatViewDetectService == null) {
            fve.e(obq.SPLASH_BUSINESS_TAG, "isHasPop->floatViewDetectService null");
            return true;
        }
        String triggerDetect = iFloatViewDetectService.triggerDetect();
        boolean equals = true ^ TextUtils.equals(triggerDetect, "None");
        fve.e(obq.SPLASH_BUSINESS_TAG, "isHasPop->result：" + triggerDetect + ",isHasPop" + equals);
        return equals;
    }

    public boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("58c4938", new Object[]{this})).booleanValue();
        }
        IHostService iHostService = (IHostService) this.f23776a.a(IHostService.class);
        if (iHostService == null) {
            fve.e(obq.SPLASH_BUSINESS_TAG, "isHostPageOnStackTop-> hostService is null");
            return false;
        }
        u5d j = iHostService.getInvokeCallback().j();
        if (j != null) {
            return j.n();
        }
        fve.e(obq.SPLASH_BUSINESS_TAG, "isHostPageOnStackTop-> pageCallback is null");
        return false;
    }

    public final boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("270e7c07", new Object[]{this})).booleanValue();
        }
        boolean a2 = h8x.a();
        boolean g = g();
        StringBuilder sb = new StringBuilder("isAtHome->： 不在二楼：");
        sb.append(!a2);
        sb.append(" 是首页fragment：");
        sb.append(g);
        fve.e(obq.SPLASH_BUSINESS_TAG, sb.toString());
        return !a2 && g;
    }

    public final boolean f() {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b9b9fc02", new Object[]{this})).booleanValue();
        }
        IMainLifecycleService iMainLifecycleService = (IMainLifecycleService) this.f23776a.a(IMainLifecycleService.class);
        if (iMainLifecycleService != null && iMainLifecycleService.isSelect()) {
            z = true;
        }
        fve.e(obq.SPLASH_BUSINESS_TAG, "isAtRecommendHomeTab-> " + z);
        return z;
    }
}
