package com.taobao.infoflow.taobao.subservice.biz.loginservice;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.subservice.biz.ILoginService;
import com.taobao.infoflow.protocol.subservice.framework.IContainerDataService;
import com.taobao.infoflow.protocol.subservice.framework.IMainLifecycleService;
import com.taobao.login4android.api.Login;
import com.taobao.login4android.broadcast.LoginAction;
import com.taobao.login4android.broadcast.LoginBroadcastHelper;
import com.taobao.tao.Globals;
import tb.cfc;
import tb.fve;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class TbLoginServiceImpl implements ILoginService {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "LoginServiceImpl";
    private boolean isLoginStateChange;
    private final BroadcastReceiver mBroadcastReceiver = new BroadcastReceiver() { // from class: com.taobao.infoflow.taobao.subservice.biz.loginservice.TbLoginServiceImpl.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/infoflow/taobao/subservice/biz/loginservice/TbLoginServiceImpl$1");
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            } else if (intent != null) {
                String action = intent.getAction();
                if (!TextUtils.isEmpty(action)) {
                    int i = a.$SwitchMap$com$taobao$login4android$broadcast$LoginAction[LoginAction.valueOf(action).ordinal()];
                    if (i == 1) {
                        fve.e(TbLoginServiceImpl.TAG, "登入");
                        TbLoginServiceImpl.access$000(TbLoginServiceImpl.this);
                    } else if (i == 2) {
                        fve.e(TbLoginServiceImpl.TAG, "登出");
                        TbLoginServiceImpl.access$000(TbLoginServiceImpl.this);
                    }
                }
            }
        }
    };
    private cfc mInfoFlowContext;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] $SwitchMap$com$taobao$login4android$broadcast$LoginAction;

        static {
            int[] iArr = new int[LoginAction.values().length];
            $SwitchMap$com$taobao$login4android$broadcast$LoginAction = iArr;
            try {
                iArr[LoginAction.NOTIFY_LOGIN_SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$taobao$login4android$broadcast$LoginAction[LoginAction.NOTIFY_LOGOUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$taobao$login4android$broadcast$LoginAction[LoginAction.NOTIFY_LOGIN_CANCEL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$taobao$login4android$broadcast$LoginAction[LoginAction.NOTIFY_LOGIN_FAILED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static {
        t2o.a(491782410);
        t2o.a(488636571);
    }

    public static /* synthetic */ void access$000(TbLoginServiceImpl tbLoginServiceImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3455482", new Object[]{tbLoginServiceImpl});
        } else {
            tbLoginServiceImpl.processLoginChange();
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

    private void processLoginChange() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39e6aa11", new Object[]{this});
            return;
        }
        this.isLoginStateChange = true;
        if (isContainerVisible(this.mInfoFlowContext)) {
            this.isLoginStateChange = false;
            triggerLogin(this.mInfoFlowContext);
        }
    }

    private boolean triggerLogin(cfc cfcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d32476ac", new Object[]{this, cfcVar})).booleanValue();
        }
        IContainerDataService iContainerDataService = (IContainerDataService) this.mInfoFlowContext.a(IContainerDataService.class);
        if (iContainerDataService != null) {
            return iContainerDataService.triggerEvent("UserLogin", null);
        }
        fve.f(TAG, "dataService == null");
        return false;
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.ILoginService
    public boolean isLogin() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dfb0d96a", new Object[]{this})).booleanValue();
        }
        return true ^ TextUtils.isEmpty(Login.getOldUserId());
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onCreateService(cfc cfcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa0061f", new Object[]{this, cfcVar});
            return;
        }
        this.mInfoFlowContext = cfcVar;
        LoginBroadcastHelper.registerLoginReceiver(Globals.getApplication(), this.mBroadcastReceiver);
    }

    @Override // com.taobao.infoflow.protocol.subservice.ISubService
    public void onDestroyService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770ac0a1", new Object[]{this});
        } else {
            LoginBroadcastHelper.unregisterLoginReceiver(Globals.getApplication(), this.mBroadcastReceiver);
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.ILoginService
    public boolean loginStatusTrigger(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("79608d4", new Object[]{this, new Boolean(z)})).booleanValue();
        }
        if (z) {
            this.isLoginStateChange = false;
            return false;
        } else if (!this.isLoginStateChange) {
            fve.f(TAG, "登录状态未变化");
            return false;
        } else {
            this.isLoginStateChange = false;
            return triggerLogin(this.mInfoFlowContext);
        }
    }
}
