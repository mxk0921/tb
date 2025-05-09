package com.taobao.infoflow.taobao.subservice.biz.floatviewmonitorservice;

import android.os.Looper;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.subservice.biz.IFloatViewDetectService;
import com.ut.share.business.ShareBusiness;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import tb.cfc;
import tb.fve;
import tb.t2o;
import tb.ysr;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class FloatViewDetectServiceImpl implements IFloatViewDetectService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "FloatViewMonitorService";
    private final List<IFloatViewDetectService.a> listeners = new CopyOnWriteArrayList();

    static {
        t2o.a(491782354);
        t2o.a(488636560);
    }

    private boolean isHasPop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e2f2672c", new Object[]{this})).booleanValue();
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            return true;
        }
        try {
            ysr ysrVar = new ysr();
            if (!ysrVar.d()) {
                fve.e(TAG, "hasPop-> TBPopLayer not InitReady");
                return false;
            }
            boolean c = ysrVar.c();
            fve.e(TAG, "hasPop-> " + c);
            return c;
        } catch (Throwable th) {
            fve.c(TAG, "isHasPop-> error", th);
            return true;
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IFloatViewDetectService
    public void addFloatViewShowListener(IFloatViewDetectService.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c6109ff", new Object[]{this, aVar});
        } else {
            this.listeners.add(aVar);
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onCreateService(cfc cfcVar) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa0061f", new Object[]{this, cfcVar});
            return;
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
        fve.e(TAG, sb.toString());
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onDestroyService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770ac0a1", new Object[]{this});
        } else {
            this.listeners.clear();
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IFloatViewDetectService
    public void removeFloatViewShowListener(IFloatViewDetectService.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6ae49a2", new Object[]{this, aVar});
        } else {
            this.listeners.remove(aVar);
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IFloatViewDetectService
    public String triggerDetect() {
        String str;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("74d55b5e", new Object[]{this});
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
        fve.e(TAG, sb.toString());
        boolean isHasPop = isHasPop();
        fve.e(TAG, "isHasPop->：" + isHasPop);
        if (hasTaoPassword) {
            str2 = "TaoPwd";
        } else if (isHasPop) {
            str2 = "PopLayer";
        } else {
            str2 = "None";
        }
        for (IFloatViewDetectService.a aVar : this.listeners) {
            aVar.a(str2);
        }
        return str2;
    }
}
