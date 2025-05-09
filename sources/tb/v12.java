package tb;

import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewParent;
import androidx.fragment.app.Fragment;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSubItemModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerDataModel;
import com.taobao.infoflow.protocol.model.datamodel.response.IContainerInnerDataModel;
import com.taobao.infoflow.protocol.subservice.biz.IDxItemClickService;
import com.taobao.infoflow.protocol.subservice.biz.IGlobalSceneUtPassService;
import com.taobao.infoflow.protocol.subservice.biz.IUserExperienceCheckService;
import com.taobao.infoflow.protocol.subservice.framework.IContainerDataService;
import com.taobao.infoflow.protocol.subservice.framework.IHostService;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import tb.hfc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public abstract class v12 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_NAV_REQUEST_CODE = "info_flow_nav_request_code";

    /* renamed from: a  reason: collision with root package name */
    public final cfc f29729a;
    public long b = 0;
    public List<String> c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class a implements hfc.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final Bundle f29730a;
        public final int b;
        public final Fragment c;
        public boolean d;

        static {
            t2o.a(486539321);
            t2o.a(486539309);
        }

        public a(Bundle bundle, Bundle bundle2, int i, Fragment fragment) {
            this.f29730a = bundle2;
            this.b = i;
            this.c = fragment;
        }

        @Override // tb.hfc.b
        public Fragment a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Fragment) ipChange.ipc$dispatch("bc1dab59", new Object[]{this});
            }
            return this.c;
        }

        @Override // tb.hfc.b
        public Bundle b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Bundle) ipChange.ipc$dispatch("d234f1f3", new Object[]{this});
            }
            return null;
        }

        @Override // tb.hfc.b
        public boolean c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("1b50d93f", new Object[]{this})).booleanValue();
            }
            return this.d;
        }

        public void d(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("34fb4e37", new Object[]{this, new Boolean(z)});
            } else {
                this.d = z;
            }
        }

        @Override // tb.hfc.b
        public Bundle getExtras() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Bundle) ipChange.ipc$dispatch("66060624", new Object[]{this});
            }
            return this.f29730a;
        }

        @Override // tb.hfc.b
        public int getRequestCode() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("4ae49d60", new Object[]{this})).intValue();
            }
            return this.b;
        }
    }

    static {
        t2o.a(486539320);
    }

    public v12(cfc cfcVar) {
        this.f29729a = cfcVar;
    }

    public final void a(BaseSectionModel<?> baseSectionModel, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec4a6635", new Object[]{this, baseSectionModel, bundle});
            return;
        }
        JSONObject ext = baseSectionModel.getExt();
        if (ext != null) {
            if (TextUtils.equals("1", ext.getString(jtv.S_ARGS_IS_CLIENT_CACHE))) {
                bundle.putString(jtv.S_ARGS_IS_CLIENT_CACHE, "1");
                fve.e("AbsTapEventProcess", "isClientCachetrue");
            }
            if (TextUtils.equals("1", ext.getString("requestNewDetailFlag"))) {
                bundle.putString("requestNewDetailFlag", "true");
            }
            String string = ext.getString("requestNewDetailTime");
            if (string != null) {
                bundle.putString("requestNewDetailTime", string);
            }
            String string2 = ext.getString(oga.KEY_PRICE);
            if (string2 != null) {
                bundle.putString(oga.KEY_PRICE, string2);
            }
            String string3 = ext.getString(oga.KEY_MAIN_TITLE);
            if (string3 != null) {
                bundle.putString(oga.KEY_MAIN_TITLE, string3);
            }
            String string4 = ext.getString(oga.KEY_MAIN_IMAGE_URL);
            if (string4 != null) {
                bundle.putString(oga.KEY_MAIN_IMAGE_URL, string4);
            }
        }
        Object b = kr8.b("item.0.ext.targetType", baseSectionModel);
        if (b instanceof String) {
            bundle.putString("targetType", (String) b);
            fve.e("AbsTapEventProcess", "targetType: " + b);
        }
    }

    public final void b(View view, BaseSectionModel<?> baseSectionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c46f7b79", new Object[]{this, view, baseSectionModel});
            return;
        }
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            wsn.a(baseSectionModel, (View) parent);
        }
    }

    public void d(BaseSectionModel<?> baseSectionModel, BaseSubItemModel baseSubItemModel, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1596985", new Object[]{this, baseSectionModel, baseSubItemModel, view});
        } else if (SystemClock.uptimeMillis() - this.b >= 800) {
            this.b = SystemClock.uptimeMillis();
            String targetUrl = baseSubItemModel.getTargetUrl();
            if (TextUtils.isEmpty(targetUrl)) {
                e(baseSectionModel, targetUrl);
                return;
            }
            String a2 = hov.a(targetUrl, baseSectionModel.getSectionBizCode());
            if (bve.h()) {
                fve.e("AbsTapEventProcess", "the utLogMap has been stored");
                z73.f(baseSectionModel);
            }
            k(baseSectionModel, baseSubItemModel, a2, view);
            l(baseSectionModel, baseSubItemModel, view);
            p(baseSectionModel, baseSubItemModel, view);
            r(baseSectionModel, baseSubItemModel, view);
            q(baseSectionModel);
        }
    }

    public void e(BaseSectionModel<?> baseSectionModel, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b9d22ba", new Object[]{this, baseSectionModel, str});
            return;
        }
        String sectionBizCode = baseSectionModel.getSectionBizCode();
        String containerId = this.f29729a.getContainerType().getContainerId();
        zue zueVar = new zue(containerId, "clickNav", 3001, "errorTargetUrl", "sectionBizCode: " + sectionBizCode + " url is " + str);
        ive.a(zueVar);
        StringBuilder sb = new StringBuilder("error: ");
        sb.append(zueVar.toString());
        fve.e("AbsTapEventProcess", sb.toString());
    }

    public final Context f(View view) {
        Context b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("ca099919", new Object[]{this, view});
        }
        Context context = view.getContext();
        if (!(context instanceof bew) || (b = ((bew) context).b()) == null) {
            return context;
        }
        return b;
    }

    public final Fragment g(cfc cfcVar) {
        IHostService iHostService;
        u5d j;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Fragment) ipChange.ipc$dispatch("d3ff323", new Object[]{this, cfcVar});
        }
        if (cfcVar == null || (iHostService = (IHostService) cfcVar.a(IHostService.class)) == null || (j = iHostService.getInvokeCallback().j()) == null) {
            return null;
        }
        return j.a();
    }

    public cfc h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cfc) ipChange.ipc$dispatch("b1bd3794", new Object[]{this});
        }
        return this.f29729a;
    }

    public final Context i(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("f044b888", new Object[]{this, view});
        }
        IHostService iHostService = (IHostService) this.f29729a.a(IHostService.class);
        if (iHostService == null) {
            return f(view);
        }
        u5d j = iHostService.getInvokeCallback().j();
        if (j == null) {
            return f(view);
        }
        Context f = j.f();
        if (f == null) {
            return f(view);
        }
        return f;
    }

    public final boolean j(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("61acc07a", new Object[]{this, str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (this.c == null) {
            this.c = new ArrayList();
            String h = f4b.h("homepageNavSimpleProcessorUrls", "");
            if (TextUtils.isEmpty(h)) {
                return false;
            }
            String[] split = h.split(",");
            if (split.length > 0) {
                this.c.addAll(Arrays.asList(split));
            }
        }
        for (String str2 : this.c) {
            if (str.contains(str2)) {
                return true;
            }
        }
        return false;
    }

    public final void l(BaseSectionModel<?> baseSectionModel, BaseSubItemModel baseSubItemModel, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("beb9a015", new Object[]{this, baseSectionModel, baseSubItemModel, view});
            return;
        }
        IDxItemClickService iDxItemClickService = (IDxItemClickService) this.f29729a.a(IDxItemClickService.class);
        if (iDxItemClickService != null) {
            iDxItemClickService.click(baseSectionModel, baseSubItemModel, view);
        }
    }

    public final void m(BaseSectionModel<?> baseSectionModel, BaseSubItemModel baseSubItemModel, Bundle bundle, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc943dd5", new Object[]{this, baseSectionModel, baseSubItemModel, bundle, str});
            return;
        }
        IDxItemClickService iDxItemClickService = (IDxItemClickService) this.f29729a.a(IDxItemClickService.class);
        if (iDxItemClickService != null) {
            iDxItemClickService.onNav(baseSectionModel, baseSubItemModel, bundle, str);
        }
    }

    public final void n(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad70e197", new Object[]{this, new Boolean(z)});
            return;
        }
        IDxItemClickService iDxItemClickService = (IDxItemClickService) this.f29729a.a(IDxItemClickService.class);
        if (iDxItemClickService != null) {
            iDxItemClickService.onNavFinished(z);
        }
    }

    public final Bundle o(BaseSubItemModel baseSubItemModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bundle) ipChange.ipc$dispatch("185da3bf", new Object[]{this, baseSubItemModel});
        }
        JSONObject ext = baseSubItemModel.getExt();
        Bundle bundle = new Bundle();
        if (ext != null) {
            String string = ext.getString(fnm.KEY_TARGET_PARAMS);
            if (!TextUtils.isEmpty(string)) {
                bundle.putSerializable(fnm.KEY_TARGET_PARAMS, string);
            }
        }
        return bundle;
    }

    public abstract void p(BaseSectionModel<?> baseSectionModel, BaseSubItemModel baseSubItemModel, View view);

    public final void q(BaseSectionModel<?> baseSectionModel) {
        IUserExperienceCheckService iUserExperienceCheckService;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("391435c2", new Object[]{this, baseSectionModel});
            return;
        }
        cfc cfcVar = this.f29729a;
        if (cfcVar != null && (iUserExperienceCheckService = (IUserExperienceCheckService) cfcVar.a(IUserExperienceCheckService.class)) != null) {
            iUserExperienceCheckService.startExperienceCheckTask(baseSectionModel, IUserExperienceCheckService.CheckOccasion.CLICK);
        }
    }

    public void r(BaseSectionModel<?> baseSectionModel, BaseSubItemModel baseSubItemModel, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("acc11bcd", new Object[]{this, baseSectionModel, baseSubItemModel, view});
            return;
        }
        IGlobalSceneUtPassService iGlobalSceneUtPassService = (IGlobalSceneUtPassService) this.f29729a.a(IGlobalSceneUtPassService.class);
        if (iGlobalSceneUtPassService != null) {
            iGlobalSceneUtPassService.onClick(baseSubItemModel);
        }
    }

    public final boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("17ae28d3", new Object[]{this})).booleanValue();
        }
        cfc cfcVar = this.f29729a;
        if (cfcVar == null) {
            fve.e("AbsTapEventProcess", "LowBatteryNdQuickJump:Error: mInfoFlowContext is null.");
            return false;
        }
        IContainerDataService iContainerDataService = (IContainerDataService) cfcVar.a(IContainerDataService.class);
        if (iContainerDataService == null) {
            fve.e("AbsTapEventProcess", "LowBatteryNdQuickJump:Error: dataService is null.");
            return false;
        }
        IContainerDataModel containerData = iContainerDataService.getContainerData();
        if (containerData == null) {
            fve.e("AbsTapEventProcess", "LowBatteryNdQuickJump:Error: dataModel is null.");
            return false;
        }
        IContainerInnerDataModel base = containerData.getBase();
        if (base == null) {
            fve.e("AbsTapEventProcess", "LowBatteryNdQuickJump:Error: innerDataModel is null.");
            return false;
        }
        JSONObject ext = base.getExt();
        if (ext == null) {
            fve.e("AbsTapEventProcess", "LowBatteryNdQuickJump:Error: globalExt is null.");
            return false;
        }
        boolean j = bve.j(ext, "lowBatteryNdQuickJump", false);
        if (j) {
            fve.e("AbsTapEventProcess", "LowBatteryNdQuickJump:SuccessServer");
        } else {
            fve.e("AbsTapEventProcess", "LowBatteryNdQuickJump:SkipServer");
        }
        return j;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void k(com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel<?> r25, com.taobao.infoflow.protocol.model.datamodel.card.BaseSubItemModel r26, java.lang.String r27, android.view.View r28) {
        /*
            Method dump skipped, instructions count: 465
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.v12.k(com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel, com.taobao.infoflow.protocol.model.datamodel.card.BaseSubItemModel, java.lang.String, android.view.View):void");
    }
}
