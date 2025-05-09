package com.alipay.mobile.verifyidentity.module.menu.ui;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import com.alibaba.fastjson.JSON;
import com.alipay.mobile.verifyidentity.common.Constants;
import com.alipay.mobile.verifyidentity.common.ModuleConstants;
import com.alipay.mobile.verifyidentity.data.DefaultModuleResult;
import com.alipay.mobile.verifyidentity.data.ModuleExecuteResult;
import com.alipay.mobile.verifyidentity.engine.MicroModuleContext;
import com.alipay.mobile.verifyidentity.log.BehaviourIdEnum;
import com.alipay.mobile.verifyidentity.log.VerifyBehavorLogger;
import com.alipay.mobile.verifyidentity.log.VerifyLogCat;
import com.alipay.mobile.verifyidentity.module.MicroModule;
import com.alipay.mobile.verifyidentity.module.internal.password.pay.PayPwdModule;
import com.alipay.mobile.verifyidentity.module.menu.MenuModule;
import com.alipay.mobile.verifyidentity.module.menu.data.MenuData;
import com.alipay.mobile.verifyidentity.module.menu.data.MenuDataExtra;
import com.alipay.mobile.verifyidentity.module.menu.data.MenuItem;
import com.alipay.mobile.verifyidentity.module.menu.data.MenuMacan;
import com.alipay.mobile.verifyidentity.rpc.RpcException;
import com.alipay.mobile.verifyidentity.rpc.biz.MICRpcServiceBiz;
import com.alipay.mobile.verifyidentity.ui.BaseVerifyActivity;
import com.alipay.mobileic.core.model.rpc.MICRpcRequest;
import com.alipay.mobileic.core.model.rpc.MICRpcResponse;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import java.util.HashMap;
import java.util.List;
import tb.acq;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class MenuActivity extends BaseVerifyActivity {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public MenuDataExtra N;
    public LinearLayout O;
    public ScrollView P;
    public boolean Q;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class MenuClickRpc implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private String f4324a;
        private String b;

        public MenuClickRpc(String str, String str2) {
            this.f4324a = str;
            this.b = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                MenuActivity.this.showProgressDialog("");
                MICRpcRequest mICRpcRequest = new MICRpcRequest();
                if (MenuActivity.access$400(MenuActivity.this)) {
                    mICRpcRequest.module = this.b;
                } else if (!TextUtils.isEmpty(this.f4324a)) {
                    mICRpcRequest.module = ModuleConstants.VI_MODULE_NAME_INIT;
                } else {
                    mICRpcRequest.module = ModuleConstants.VI_MODULE_VERIFY_INIT;
                }
                mICRpcRequest.verifyId = MenuActivity.access$500(MenuActivity.this).getVerifyId();
                mICRpcRequest.token = this.f4324a;
                MICRpcResponse dispatch = new MICRpcServiceBiz().dispatch(mICRpcRequest);
                MenuActivity.this.dismissProgressDialog();
                MenuActivity.access$600(MenuActivity.this, dispatch);
            } catch (RpcException e) {
                MenuActivity.this.dismissProgressDialog();
                throw e;
            }
        }
    }

    public static /* synthetic */ MicroModule access$000(MenuActivity menuActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MicroModule) ipChange.ipc$dispatch("853472ce", new Object[]{menuActivity});
        }
        return menuActivity.mModule;
    }

    public static /* synthetic */ MicroModule access$100(MenuActivity menuActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MicroModule) ipChange.ipc$dispatch("13bff3cf", new Object[]{menuActivity});
        }
        return menuActivity.mModule;
    }

    public static /* synthetic */ MicroModule access$200(MenuActivity menuActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MicroModule) ipChange.ipc$dispatch("a24b74d0", new Object[]{menuActivity});
        }
        return menuActivity.mModule;
    }

    public static /* synthetic */ MicroModuleContext access$300(MenuActivity menuActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MicroModuleContext) ipChange.ipc$dispatch("8617a70c", new Object[]{menuActivity});
        }
        return menuActivity.mMicroModuleContext;
    }

    public static /* synthetic */ boolean access$400(MenuActivity menuActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c72cdf14", new Object[]{menuActivity})).booleanValue();
        }
        return menuActivity.Q;
    }

    public static /* synthetic */ MicroModule access$500(MenuActivity menuActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MicroModule) ipChange.ipc$dispatch("4dedf7d3", new Object[]{menuActivity});
        }
        return menuActivity.mModule;
    }

    public static /* synthetic */ void access$600(MenuActivity menuActivity, MICRpcResponse mICRpcResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba2c186c", new Object[]{menuActivity, mICRpcResponse});
            return;
        }
        VerifyLogCat.d("MenuActivity", "processRpcResult");
        ModuleExecuteResult moduleExecuteResult = new ModuleExecuteResult();
        moduleExecuteResult.setMICRpcResponse(mICRpcResponse);
        menuActivity.mMicroModuleContext.notifyAndFinishModule(menuActivity.mModule.getVerifyId(), menuActivity.mModule.getToken(), menuActivity.mModule.getModuleName(), moduleExecuteResult);
    }

    public static /* synthetic */ Object ipc$super(MenuActivity menuActivity, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -641568046) {
            super.onCreate((Bundle) objArr[0]);
            return null;
        } else if (hashCode == 514894248) {
            super.attachBaseContext((Context) objArr[0]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/alipay/mobile/verifyidentity/module/menu/ui/MenuActivity");
        }
    }

    public final void a(MenuData menuData) {
        List<MenuItem> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39e4e258", new Object[]{this, menuData});
        } else if (menuData == null || (list = menuData.menu) == null || list.size() <= 0) {
            VerifyLogCat.w("MenuActivity", "mMenuData is not legal");
            notifyError();
        } else {
            this.O.addView(new MenuListView(this, menuData));
        }
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1eb0a9a8", new Object[]{this, context});
            return;
        }
        super.attachBaseContext(context);
        acq.B(context);
    }

    public MenuClickRpc getMenuClickRpc(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MenuClickRpc) ipChange.ipc$dispatch("d64acd98", new Object[]{this, str, str2});
        }
        return new MenuClickRpc(str, str2);
    }

    public void notifyError() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b87bd46", new Object[]{this});
        } else {
            this.mMicroModuleContext.notifyAndFinishModule(this.mModule.getVerifyId(), this.mModule.getToken(), this.mModule.getModuleName(), new DefaultModuleResult("2002"));
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88afc63", new Object[]{this});
        } else {
            alert("", getResources().getString(R.string.menu_quit_message), getResources().getString(R.string.verifyidentity_confirm), new DialogInterface.OnClickListener() { // from class: com.alipay.mobile.verifyidentity.module.menu.ui.MenuActivity.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                    } else {
                        MenuActivity.access$300(MenuActivity.this).notifyAndFinishModule(MenuActivity.access$000(MenuActivity.this).getVerifyId(), MenuActivity.access$100(MenuActivity.this).getToken(), MenuActivity.access$200(MenuActivity.this).getModuleName(), new DefaultModuleResult("1003"));
                    }
                }
            }, getResources().getString(R.string.give_up), new DialogInterface.OnClickListener() { // from class: com.alipay.mobile.verifyidentity.module.menu.ui.MenuActivity.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                    }
                }
            });
        }
    }

    public void writePwdBehavorLog(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d15438a", new Object[]{this, str, str2, str3});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("module", ModuleConstants.VI_MODULE_MENU);
        hashMap.put("code", str2);
        hashMap.put("source", str3);
        VerifyBehavorLogger.logBehavor(BehaviourIdEnum.EVENT, str, Constants.VI_ENGINE_APPID, "aavv", this.mModule.getToken(), this.mModule.getVerifyId(), null, hashMap);
    }

    @Override // com.alipay.mobile.verifyidentity.ui.BaseVerifyActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        setContentView(R.layout.verify_menu_activity);
        this.O = (LinearLayout) findViewById(R.id.list_root);
        this.P = (ScrollView) findViewById(R.id.scroll_view_root);
        if (getIntent() == null) {
            notifyError();
        } else {
            String stringExtra = getIntent().getStringExtra(MenuModule.ModuleData);
            if (TextUtils.isEmpty(stringExtra)) {
                notifyError();
            } else {
                boolean booleanExtra = getIntent().getBooleanExtra(PayPwdModule.IS_IPAY, false);
                this.Q = booleanExtra;
                if (booleanExtra) {
                    writePwdBehavorLog("UC-MobileIC-20190606-6", "VIEW_MENU", "wallet_macao");
                    MenuMacan menuMacan = (MenuMacan) JSON.parseObject(stringExtra, MenuMacan.class);
                    MenuDataExtra menuDataExtra = new MenuDataExtra();
                    this.N = menuDataExtra;
                    menuDataExtra.title = menuMacan.form_title;
                    menuDataExtra.menu = menuMacan.methods;
                } else {
                    writePwdBehavorLog("UC-MobileIC-20190606-6", "VIEW_MENU", "wallet_cn");
                    this.N = (MenuDataExtra) JSON.parseObject(stringExtra, MenuDataExtra.class);
                }
            }
        }
        MenuData menuData = new MenuData();
        MenuDataExtra menuDataExtra2 = this.N;
        menuData.title = menuDataExtra2.title;
        menuData.menu = menuDataExtra2.menu;
        a(menuData);
        List<MenuData> list = this.N.innerMenu;
        if (list == null) {
            VerifyLogCat.i("MenuActivity", "no extra list needed to be shown.");
            return;
        }
        for (MenuData menuData2 : list) {
            a(menuData2);
        }
        this.P.smoothScrollTo(0, 20);
    }
}
