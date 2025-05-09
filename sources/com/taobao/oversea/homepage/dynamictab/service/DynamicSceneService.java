package com.taobao.oversea.homepage.dynamictab.service;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.alibaba.ability.localization.Localization;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.core.subservice.biz.sceneservice.SceneServiceImpl;
import com.taobao.login4android.broadcast.LoginAction;
import com.taobao.login4android.broadcast.LoginBroadcastHelper;
import com.taobao.tao.Globals;
import com.taobao.themis.external.embed.TMSEmbed;
import com.taobao.themis.external.embed.TMSEmbedSolutionType;
import com.taobao.themis.external.embed.WebStartParams;
import com.taobao.themis.open.ability.calendar.TMSCalendarBridge;
import com.taobao.uikit.extend.component.TBErrorView;
import mtopsdk.mtop.util.ErrorConstant;
import tb.arq;
import tb.cfc;
import tb.czc;
import tb.dzc;
import tb.e8e;
import tb.fve;
import tb.h2b;
import tb.l58;
import tb.t58;
import tb.vkd;
import tb.vms;
import tb.xrl;
import tb.z6d;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class DynamicSceneService extends SceneServiceImpl {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String DX_BIZ_TYPE = "HomeDynamic";
    private static final String TAG = "DynamicSceneService";
    private cfc mInfoFlowContext;
    private e8e mUtInvoker;
    private dzc naviBarInvoker;
    private l58 rocketInvoker;
    private FrameLayout rootView;
    private TMSEmbed themisIns;
    private String currentUrl = "";
    private String pageKey = "";
    private final int THEMIS_ID = 999;
    private boolean isPageSelected = false;
    private BroadcastReceiver loginReceiver = new BroadcastReceiver() { // from class: com.taobao.oversea.homepage.dynamictab.service.DynamicSceneService.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/oversea/homepage/dynamictab/service/DynamicSceneService$1");
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            } else if (intent != null && !arq.a(intent.getAction())) {
                try {
                    LoginAction valueOf = LoginAction.valueOf(intent.getAction());
                    if (!(valueOf == LoginAction.NOTIFY_LOGIN_SUCCESS || valueOf == LoginAction.NOTIFY_LOGOUT)) {
                        return;
                    }
                    DynamicSceneService.access$000(DynamicSceneService.this);
                } catch (Exception e) {
                    Log.e(DynamicSceneService.TAG, "mReceiver exp. Action: " + intent.getAction(), e);
                }
            }
        }
    };

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements l58.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("88f782f0", new Object[]{this});
            } else {
                DynamicSceneService.access$000(DynamicSceneService.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class b implements dzc {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // tb.dzc
        public JSONObject getSubTabSearchBarData() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSONObject) ipChange.ipc$dispatch("bab9b3d1", new Object[]{this});
            }
            if (!DynamicSceneService.access$100(DynamicSceneService.this)) {
                return null;
            }
            DynamicSceneService.access$200(DynamicSceneService.this);
            return null;
        }
    }

    public static /* synthetic */ void access$000(DynamicSceneService dynamicSceneService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ccce4dd7", new Object[]{dynamicSceneService});
        } else {
            dynamicSceneService.reloadPage();
        }
    }

    public static /* synthetic */ boolean access$100(DynamicSceneService dynamicSceneService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7c789c", new Object[]{dynamicSceneService})).booleanValue();
        }
        return dynamicSceneService.isPageSelected;
    }

    public static /* synthetic */ void access$200(DynamicSceneService dynamicSceneService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("342aa359", new Object[]{dynamicSceneService});
        } else {
            dynamicSceneService.dataProcess();
        }
    }

    private void addThemisVIew() {
        FrameLayout frameLayout;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2a995f3", new Object[]{this});
        } else if (this.themisIns != null && (frameLayout = this.rootView) != null) {
            View findViewById = frameLayout.findViewById(999);
            if (findViewById != null) {
                this.rootView.removeView(findViewById);
            }
            View h = this.themisIns.h();
            h.setId(999);
            this.themisIns.u();
            this.rootView.addView(h);
        }
    }

    private TBErrorView createErrorView(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBErrorView) ipChange.ipc$dispatch("ea8dc90", new Object[]{this, viewGroup});
        }
        TBErrorView tBErrorView = new TBErrorView(viewGroup.getContext());
        tBErrorView.setTitle(ErrorConstant.MappingMsg.NETWORK_MAPPING_MSG);
        tBErrorView.setSubTitle("别紧张，试试看刷新页面~");
        tBErrorView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        tBErrorView.setButtonVisibility(TBErrorView.ButtonType.BUTTON_RIGHT, 8);
        tBErrorView.setButtonVisibility(TBErrorView.ButtonType.BUTTON_LEFT, 8);
        return tBErrorView;
    }

    private void dataProcess() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1bd6fd6c", new Object[]{this});
            return;
        }
        czc a2 = xrl.a(this.mInfoFlowContext);
        if (a2 == null) {
            fve.e(TAG, "naviBarCallback == null");
            return;
        }
        JSONObject subTabSearchBarData = a2.getSubTabSearchBarData();
        if (subTabSearchBarData != null) {
            JSONObject jSONObject = subTabSearchBarData.getJSONObject("ext");
            String string = jSONObject.getString("innerPageUrl");
            String string2 = jSONObject.getString("tabType");
            if (TextUtils.isEmpty(string)) {
                return;
            }
            if ((TMSCalendarBridge.namespace.equals(string2) || vms.PROTOCOL_BIZ_CODE_PHA.equals(string2)) && !pageKeyEqual(string)) {
                initThemis();
                savePageKey(string);
                WebStartParams webStartParams = new WebStartParams();
                webStartParams.setUrl(this.currentUrl);
                this.themisIns.i(webStartParams);
                addThemisVIew();
            }
        }
    }

    private void initThemis() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f1d62fd", new Object[]{this});
            return;
        }
        TMSEmbed tMSEmbed = this.themisIns;
        if (tMSEmbed != null) {
            tMSEmbed.d();
        }
        z6d c = h2b.a().c();
        if (c != null) {
            this.themisIns = new TMSEmbed(c.k1(), TMSEmbedSolutionType.WEB_SINGLE_PAGE);
        }
    }

    public static /* synthetic */ Object ipc$super(DynamicSceneService dynamicSceneService, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1512649357:
                super.onResume();
                return null;
            case 151698896:
                super.onPageSelected();
                return null;
            case 178259487:
                super.onCreateService((cfc) objArr[0]);
                return null;
            case 188604040:
                super.onStop();
                return null;
            case 497921929:
                super.onPageUnSelected();
                return null;
            case 797441118:
                super.onPause();
                return null;
            case 1997193377:
                super.onDestroyService();
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/oversea/homepage/dynamictab/service/DynamicSceneService");
        }
    }

    private boolean pageKeyEqual(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("18061359", new Object[]{this, str})).booleanValue();
        }
        if (arq.a(str)) {
            return false;
        }
        return (str + "-" + Localization.j() + "-" + Localization.h().getLanguage()).equals(this.pageKey);
    }

    private void reloadPage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e22444f", new Object[]{this});
        } else if (this.themisIns != null && !TextUtils.isEmpty(this.pageKey)) {
            WebStartParams webStartParams = new WebStartParams();
            webStartParams.setUrl(this.currentUrl);
            this.themisIns.s(webStartParams, TMSEmbedSolutionType.WEB_SINGLE_PAGE);
        }
    }

    private void savePageKey(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b34ff64", new Object[]{this, str});
            return;
        }
        this.currentUrl = str;
        if (arq.a(str)) {
            this.pageKey = "";
            return;
        }
        this.pageKey = str + "-" + Localization.j() + "-" + Localization.h().getLanguage();
    }

    @Override // com.taobao.infoflow.core.subservice.biz.sceneservice.SceneServiceImpl, com.taobao.infoflow.protocol.subservice.biz.ISceneService
    public View createView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("79a2c742", new Object[]{this, context});
        }
        if (this.rootView == null) {
            this.rootView = new FrameLayout(context);
        }
        initThemis();
        return this.rootView;
    }

    @Override // com.taobao.infoflow.core.subservice.biz.sceneservice.SceneServiceImpl, com.taobao.infoflow.protocol.subservice.biz.ISceneService, tb.ejb
    public dzc getNaviBarInvoker() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dzc) ipChange.ipc$dispatch("93ccde42", new Object[]{this});
        }
        if (this.naviBarInvoker == null) {
            this.naviBarInvoker = new b();
        }
        return this.naviBarInvoker;
    }

    @Override // com.taobao.infoflow.core.subservice.biz.sceneservice.SceneServiceImpl, com.taobao.infoflow.protocol.subservice.biz.ISceneService, tb.ejb
    public vkd getRocketInvoker() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (vkd) ipChange.ipc$dispatch("821d6ece", new Object[]{this});
        }
        if (this.rocketInvoker == null) {
            l58 l58Var = new l58(this.mInfoFlowContext);
            this.rocketInvoker = l58Var;
            l58Var.a(new a());
        }
        return this.rocketInvoker;
    }

    @Override // com.taobao.infoflow.core.subservice.biz.sceneservice.SceneServiceImpl, com.taobao.infoflow.protocol.subservice.biz.ISceneService, tb.ejb
    public e8e getUtInvoker() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e8e) ipChange.ipc$dispatch("fb13fc2e", new Object[]{this});
        }
        if (this.mUtInvoker == null) {
            this.mUtInvoker = new t58(this.mInfoFlowContext);
        }
        return this.mUtInvoker;
    }

    @Override // com.taobao.infoflow.core.subservice.biz.sceneservice.SceneServiceImpl, com.taobao.infoflow.protocol.subservice.ISubService
    public void onCreateService(cfc cfcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa0061f", new Object[]{this, cfcVar});
            return;
        }
        super.onCreateService(cfcVar);
        this.mInfoFlowContext = cfcVar;
        LoginBroadcastHelper.registerLoginReceiver(Globals.getApplication(), this.loginReceiver);
    }

    @Override // com.taobao.infoflow.core.subservice.biz.sceneservice.SceneServiceImpl, com.taobao.infoflow.protocol.subservice.ISubService
    public void onDestroyService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770ac0a1", new Object[]{this});
            return;
        }
        super.onDestroyService();
        this.isPageSelected = false;
        LoginBroadcastHelper.unregisterLoginReceiver(Globals.getApplication(), this.loginReceiver);
    }

    @Override // com.taobao.infoflow.core.subservice.biz.sceneservice.SceneServiceImpl, com.taobao.infoflow.protocol.subservice.biz.ISceneService, tb.zxd
    public void onPageSelected() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90abdd0", new Object[]{this});
            return;
        }
        super.onPageSelected();
        this.isPageSelected = true;
        dataProcess();
        if (TextUtils.isEmpty(this.pageKey) || this.themisIns == null) {
            this.rootView.removeAllViews();
            FrameLayout frameLayout = this.rootView;
            frameLayout.addView(createErrorView(frameLayout));
        } else if (this.rootView.findViewById(999) != null) {
            this.themisIns.p();
        } else {
            addThemisVIew();
        }
    }

    @Override // com.taobao.infoflow.core.subservice.biz.sceneservice.SceneServiceImpl, com.taobao.infoflow.protocol.subservice.biz.ISceneService, tb.zxd
    public void onPageUnSelected() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1dadaf89", new Object[]{this});
            return;
        }
        super.onPageUnSelected();
        this.isPageSelected = false;
        TMSEmbed tMSEmbed = this.themisIns;
        if (tMSEmbed != null) {
            tMSEmbed.q();
        }
    }

    @Override // com.taobao.infoflow.core.subservice.biz.sceneservice.SceneServiceImpl, com.taobao.infoflow.protocol.subservice.biz.ISceneService, tb.h6d
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        super.onPause();
        TMSEmbed tMSEmbed = this.themisIns;
        if (tMSEmbed != null) {
            tMSEmbed.k();
        }
    }

    @Override // com.taobao.infoflow.core.subservice.biz.sceneservice.SceneServiceImpl, com.taobao.infoflow.protocol.subservice.biz.ISceneService, tb.h6d
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        TMSEmbed tMSEmbed = this.themisIns;
        if (tMSEmbed != null) {
            tMSEmbed.m();
        }
        this.isPageSelected = true;
    }

    @Override // com.taobao.infoflow.core.subservice.biz.sceneservice.SceneServiceImpl, com.taobao.infoflow.protocol.subservice.biz.ISceneService, tb.h6d
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
            return;
        }
        super.onStop();
        this.isPageSelected = false;
        TMSEmbed tMSEmbed = this.themisIns;
        if (tMSEmbed != null) {
            tMSEmbed.o();
        }
    }
}
