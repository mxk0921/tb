package com.taobao.share.core.share;

import android.os.RemoteException;
import android.text.TextUtils;
import com.alibaba.ability.localization.Localization;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.tools.ir.runtime.ApplicationInvoker;
import com.taobao.android.service.AidlService;
import com.taobao.share.aidl.IShareBusiness;
import com.taobao.share.core.share.interceptor.LoginInterceptor;
import com.taobao.share.core.share.mtop.TBShareActivityInfoService;
import com.taobao.share.globalmodel.TBShareContent;
import com.taobao.share.multiapp.ShareBizAdapter;
import com.taobao.statistic.TBS;
import com.taobao.tao.TaobaoApplication;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import tb.bwr;
import tb.fwr;
import tb.gjq;
import tb.ipd;
import tb.kkp;
import tb.lwr;
import tb.mip;
import tb.t2o;
import tb.to4;
import tb.uvp;
import tb.y3r;
import tb.zip;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class ShareBusinessService extends AidlService<IShareBusiness, ShareBusinessBinder> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "ShareBusinessService";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class ShareBusinessBinder extends IShareBusiness.Stub {
        static {
            t2o.a(664797262);
        }

        public ShareBusinessBinder() {
        }

        @Override // com.taobao.share.aidl.IShareBusiness
        public boolean share(List<String> list, String str) throws RemoteException {
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            kkp e = kkp.e();
            e.a(kkp.KEY_SHAREPANELBUSINESSSERVICESTART);
            try {
                TBShareContent a2 = zip.a(str);
                ShareBusinessService.a(new ArrayList(list), a2);
                TBS.Ext.commitEvent("Share_Exception", 19999, "sharedata", "info", Localization.q(R.string.taobao_app_1010_1_18274), JSON.toJSONString(a2));
                e.a(kkp.KEY_SHAREPANELBUSINESSSERVICEEND);
                return true;
            } catch (Throwable th) {
                th.printStackTrace();
                fwr.b(ShareBusinessService.TAG, "ShareBusinessService.share err:" + th.getMessage());
                HashMap hashMap = new HashMap();
                hashMap.put("error", th.getMessage());
                hashMap.put("shareContentJson", str);
                return false;
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class a implements TBShareActivityInfoService.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ kkp f11751a;
        public final /* synthetic */ ipd b;
        public final /* synthetic */ ArrayList c;

        public a(kkp kkpVar, ipd ipdVar, ArrayList arrayList) {
            this.f11751a = kkpVar;
            this.b = ipdVar;
            this.c = arrayList;
        }

        @Override // com.taobao.share.core.share.mtop.TBShareActivityInfoService.a
        public void a(TBShareContent tBShareContent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("249b36fa", new Object[]{this, tBShareContent});
                return;
            }
            this.f11751a.a(kkp.KEY_SHAREPANELRENDERPANELACTIVITYINFOSTART);
            this.b.getSharePanel().renderSharePanel(this.c, tBShareContent);
            this.f11751a.a(kkp.KEY_SHAREPANELRENDERPANELACTIVITYINFOEND);
        }
    }

    static {
        t2o.a(664797260);
    }

    public ShareBusinessService() {
        ApplicationInvoker.getInstance("com.taobao.clipboard_share").invoke("com.taobao.share.core.ContactsApplication", TaobaoApplication.sApplication);
    }

    public static void a(ArrayList<String> arrayList, TBShareContent tBShareContent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6abaede", new Object[]{arrayList, tBShareContent});
            return;
        }
        kkp e = kkp.e();
        e.a(kkp.KEY_SHAREPANELDOSHARESTART);
        String a2 = lwr.a();
        ShareBizAdapter.getInstance().initShareAdapter();
        if (new com.taobao.share.core.share.interceptor.a(arrayList, tBShareContent, a2).b(new gjq()).a(new LoginInterceptor()).a(new uvp()).b(new to4()).a(new y3r()).c()) {
            fwr.c(TAG, "return doShared : isHasIntercept true");
            return;
        }
        if (tBShareContent != null) {
            String str = tBShareContent.businessId;
            String str2 = tBShareContent.detailSharePosition;
            TBS.Ext.commitEvent("Page_Share", 19999, "PrepareShare", str, str2, tBShareContent.businessId + "," + tBShareContent.templateId + "," + ShareBizAdapter.getInstance().getLogin().getUserId() + "," + bwr.h().m() + ",suId=" + tBShareContent.suId);
        }
        ipd shareEngine = ShareBizAdapter.getInstance().getShareEngine();
        boolean n = mip.n();
        e.a(kkp.KEY_SHAREPANELDOSHAREEND);
        if (!n) {
            new TBShareActivityInfoService().a(new a(e, shareEngine, arrayList), tBShareContent);
            return;
        }
        e.a(kkp.KEY_SHAREPANELRENDERPANELSTART);
        shareEngine.getSharePanel().renderSharePanel(arrayList, tBShareContent);
        e.a(kkp.KEY_SHAREPANELRENDERPANELEND);
    }

    public static /* synthetic */ Object ipc$super(ShareBusinessService shareBusinessService, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/share/core/share/ShareBusinessService");
    }
}
