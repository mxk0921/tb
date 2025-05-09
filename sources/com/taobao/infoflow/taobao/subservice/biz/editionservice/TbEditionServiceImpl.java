package com.taobao.infoflow.taobao.subservice.biz.editionservice;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.subservice.biz.IEditionService;
import com.taobao.infoflow.protocol.subservice.framework.IContainerDataService;
import com.taobao.infoflow.protocol.subservice.framework.IMainLifecycleService;
import com.taobao.tao.Globals;
import tb.cfc;
import tb.fve;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class TbEditionServiceImpl implements IEditionService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "TbEditionServiceImpl";
    private final BroadcastReceiver areaChangeReceiver = new BroadcastReceiver() { // from class: com.taobao.infoflow.taobao.subservice.biz.editionservice.TbEditionServiceImpl.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/infoflow/taobao/subservice/biz/editionservice/TbEditionServiceImpl$1");
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                return;
            }
            String action = intent.getAction();
            fve.f(TbEditionServiceImpl.TAG, "areaChangeReceiver : " + action);
            if (TextUtils.equals(action, "EDITON_SWITCHER_EDITTION_CODE_CHANGED")) {
                TbEditionServiceImpl.access$000(TbEditionServiceImpl.this);
            }
        }
    };
    private boolean isAreaChange;
    private cfc mInfoFlowContext;

    static {
        t2o.a(491782323);
        t2o.a(488636554);
    }

    public static /* synthetic */ void access$000(TbEditionServiceImpl tbEditionServiceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92432de2", new Object[]{tbEditionServiceImpl});
        } else {
            tbEditionServiceImpl.processAreaChange();
        }
    }

    private boolean isContainerVisible(cfc cfcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7f742902", new Object[]{this, cfcVar})).booleanValue();
        }
        IMainLifecycleService iMainLifecycleService = (IMainLifecycleService) cfcVar.a(IMainLifecycleService.class);
        if (iMainLifecycleService != null) {
            return iMainLifecycleService.isVisible();
        }
        fve.e(TAG, "isSelect sceneService == null");
        return true;
    }

    private void processAreaChange() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a77dcf3", new Object[]{this});
            return;
        }
        this.isAreaChange = true;
        if (isContainerVisible(this.mInfoFlowContext)) {
            this.isAreaChange = false;
            triggerEdition(this.mInfoFlowContext);
        }
    }

    private void registerAreaChangeReceiver() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67d790b6", new Object[]{this});
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("EDITON_SWITCHER_EDITTION_CODE_CHANGED");
        Globals.getApplication().registerReceiver(this.areaChangeReceiver, intentFilter);
    }

    private boolean triggerEdition(cfc cfcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7fc6dc37", new Object[]{this, cfcVar})).booleanValue();
        }
        IContainerDataService iContainerDataService = (IContainerDataService) this.mInfoFlowContext.a(IContainerDataService.class);
        if (iContainerDataService != null) {
            return iContainerDataService.triggerEvent("EditionSwitch", null);
        }
        fve.f(TAG, "dataService == null");
        return false;
    }

    private void unRegisterAreaChangeReceiver() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c5559af", new Object[]{this});
        } else {
            Globals.getApplication().unregisterReceiver(this.areaChangeReceiver);
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onCreateService(cfc cfcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa0061f", new Object[]{this, cfcVar});
            return;
        }
        this.mInfoFlowContext = cfcVar;
        registerAreaChangeReceiver();
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onDestroyService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770ac0a1", new Object[]{this});
        } else {
            unRegisterAreaChangeReceiver();
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IEditionService
    public boolean editionStatusTrigger(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e84503e9", new Object[]{this, new Boolean(z)})).booleanValue();
        }
        if (z) {
            this.isAreaChange = false;
            return false;
        } else if (!this.isAreaChange) {
            fve.f(TAG, "区域未变化");
            return false;
        } else {
            this.isAreaChange = false;
            return triggerEdition(this.mInfoFlowContext);
        }
    }
}
