package com.taobao.detail.rate.vivid.presenter;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.detail.rate.mtop.RateListDetailRequest;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.MtopBusiness;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.intf.Mtop;
import tb.orv;
import tb.r7k;
import tb.sgn;
import tb.tgn;
import tb.uhn;
import tb.vgn;
import tb.xgn;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class PreRequestPresenter {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String PAGE_RATE_HISTORY = "shoutao_rate_history_list";
    public static final String PAGE_RATE_LIST = "shoutao_rate_list";
    public static final String PAGE_RATE_SHOP = "shoutao_shop_rate_list";
    public static final String PAGE_RATE_TK = "shoutao_item_tk_rate_list";
    public static final String SOURCE_RATE_HISTORY = "-2";
    public static final String SOURCE_RATE_LIST = "-1";
    public static final String SOURCE_RATE_LIST_WITH_ID = "4";
    public static final String SOURCE_RATE_SHOP = "12";
    public static final String SOURCE_RATE_TK = "13";

    /* renamed from: a  reason: collision with root package name */
    public JSONObject f10376a;
    public boolean b = true;
    public a c;
    public JSONObject d;
    public final sgn e;
    public final boolean f;
    public final boolean g;
    public final tgn h;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public interface a {
        void onFail(String str);

        void onSuccess(JSONObject jSONObject);
    }

    public PreRequestPresenter(boolean z, boolean z2, tgn tgnVar) {
        this.f = z;
        this.g = z2;
        this.h = tgnVar;
        if (z || z2) {
            this.e = new sgn();
        }
    }

    public static /* synthetic */ void a(PreRequestPresenter preRequestPresenter, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4106d7ee", new Object[]{preRequestPresenter, new Boolean(z)});
        } else {
            preRequestPresenter.h(z);
        }
    }

    public static /* synthetic */ boolean b(PreRequestPresenter preRequestPresenter, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b1d3e48f", new Object[]{preRequestPresenter, new Boolean(z)})).booleanValue();
        }
        preRequestPresenter.b = z;
        return z;
    }

    public static /* synthetic */ void c(PreRequestPresenter preRequestPresenter, RateListDetailRequest rateListDetailRequest, MtopResponse mtopResponse, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8ae393", new Object[]{preRequestPresenter, rateListDetailRequest, mtopResponse, new Boolean(z)});
        } else {
            preRequestPresenter.n(rateListDetailRequest, mtopResponse, z);
        }
    }

    public static /* synthetic */ a d(PreRequestPresenter preRequestPresenter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("a205976b", new Object[]{preRequestPresenter});
        }
        return preRequestPresenter.c;
    }

    public static /* synthetic */ void e(PreRequestPresenter preRequestPresenter, JSONObject jSONObject, RateListDetailRequest rateListDetailRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2bf237e", new Object[]{preRequestPresenter, jSONObject, rateListDetailRequest});
        } else {
            preRequestPresenter.g(jSONObject, rateListDetailRequest);
        }
    }

    public static /* synthetic */ JSONObject f(PreRequestPresenter preRequestPresenter, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("ffdd3143", new Object[]{preRequestPresenter, jSONObject});
        }
        preRequestPresenter.d = jSONObject;
        return jSONObject;
    }

    public final void g(JSONObject jSONObject, RateListDetailRequest rateListDetailRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("824560cb", new Object[]{this, jSONObject, rateListDetailRequest});
            return;
        }
        if (xgn.INSTANCE.n()) {
            new orv().d(jSONObject);
        }
        t(rateListDetailRequest, jSONObject);
    }

    public final void h(boolean z) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49addbad", new Object[]{this, new Boolean(z)});
            return;
        }
        if (z) {
            str = tgn.STAGE_START_PRE_REQUEST;
        } else {
            str = tgn.STAGE_END_PRE_REQUEST;
        }
        r7k r7kVar = new r7k(str, System.currentTimeMillis(), new JSONObject());
        tgn tgnVar = this.h;
        if (tgnVar != null) {
            tgnVar.c(str, r7kVar);
        }
    }

    public final JSONObject i(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("3297b0e7", new Object[]{this, jSONObject});
        }
        if (jSONObject != null) {
            return jSONObject;
        }
        return this.f10376a;
    }

    public JSONObject j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("20309c7d", new Object[]{this});
        }
        return this.d;
    }

    public boolean k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d82a2621", new Object[]{this})).booleanValue();
        }
        return this.b;
    }

    public final boolean l(RateListDetailRequest rateListDetailRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3518e634", new Object[]{this, rateListDetailRequest})).booleanValue();
        }
        if (this.g) {
            return s(rateListDetailRequest);
        }
        if (this.f) {
            return r(rateListDetailRequest);
        }
        return false;
    }

    public final void n(RateListDetailRequest rateListDetailRequest, MtopResponse mtopResponse, boolean z) {
        String str;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8669800", new Object[]{this, rateListDetailRequest, mtopResponse, new Boolean(z)});
            return;
        }
        if (mtopResponse != null) {
            str2 = mtopResponse.getRetMsg();
            str = mtopResponse.getRetCode();
        } else {
            str2 = "";
            str = str2;
        }
        if (!z) {
            vgn.a(vgn.RATE_LIST_CODE, str, str2);
        }
        vgn.f(rateListDetailRequest.API_NAME, str, str2, z);
    }

    public void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("447a9796", new Object[]{this});
        } else if (this.f10376a != null) {
            h(true);
            this.b = false;
            final RateListDetailRequest rateListDetailRequest = new RateListDetailRequest();
            m(rateListDetailRequest);
            if (!l(rateListDetailRequest)) {
                MtopBusiness.build(Mtop.instance(null), rateListDetailRequest).registerListener((IRemoteListener) new IRemoteBaseListener() { // from class: com.taobao.detail.rate.vivid.presenter.PreRequestPresenter.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.tao.remotebusiness.IRemoteListener
                    public void onError(int i, MtopResponse mtopResponse, Object obj) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                            return;
                        }
                        PreRequestPresenter.a(PreRequestPresenter.this, false);
                        PreRequestPresenter.b(PreRequestPresenter.this, true);
                        PreRequestPresenter.c(PreRequestPresenter.this, rateListDetailRequest, mtopResponse, false);
                        if (PreRequestPresenter.d(PreRequestPresenter.this) != null) {
                            PreRequestPresenter.d(PreRequestPresenter.this).onFail("onError");
                        }
                    }

                    @Override // com.taobao.tao.remotebusiness.IRemoteListener
                    public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                            return;
                        }
                        PreRequestPresenter.a(PreRequestPresenter.this, false);
                        PreRequestPresenter.b(PreRequestPresenter.this, true);
                        JSONObject parseObject = JSON.parseObject(mtopResponse.getDataJsonObject().toString());
                        PreRequestPresenter.c(PreRequestPresenter.this, rateListDetailRequest, mtopResponse, true);
                        if (parseObject != null && !parseObject.isEmpty()) {
                            PreRequestPresenter.e(PreRequestPresenter.this, parseObject, rateListDetailRequest);
                            PreRequestPresenter.f(PreRequestPresenter.this, parseObject);
                            if (PreRequestPresenter.d(PreRequestPresenter.this) != null) {
                                PreRequestPresenter.d(PreRequestPresenter.this).onSuccess(parseObject);
                            }
                        } else if (PreRequestPresenter.d(PreRequestPresenter.this) != null) {
                            PreRequestPresenter.d(PreRequestPresenter.this).onFail("onDataError");
                        }
                    }

                    @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
                    public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                            return;
                        }
                        PreRequestPresenter.a(PreRequestPresenter.this, false);
                        PreRequestPresenter.b(PreRequestPresenter.this, true);
                        PreRequestPresenter.c(PreRequestPresenter.this, rateListDetailRequest, mtopResponse, false);
                        if (PreRequestPresenter.d(PreRequestPresenter.this) != null) {
                            PreRequestPresenter.d(PreRequestPresenter.this).onFail("onSystemError");
                        }
                    }
                }).reqMethod(MethodEnum.POST).startRequest();
            }
        }
    }

    public void p(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("285787c1", new Object[]{this, jSONObject});
        } else {
            this.f10376a = jSONObject;
        }
    }

    public void q(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b46756b9", new Object[]{this, aVar});
        } else {
            this.c = aVar;
        }
    }

    public final boolean r(RateListDetailRequest rateListDetailRequest) {
        JSONObject a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7808525a", new Object[]{this, rateListDetailRequest})).booleanValue();
        }
        sgn sgnVar = this.e;
        if (sgnVar == null || (a2 = sgnVar.a(rateListDetailRequest)) == null) {
            return false;
        }
        this.b = true;
        this.d = a2;
        if (TextUtils.equals(this.e.c(rateListDetailRequest), "PreRequest")) {
            uhn.a("Page_DetailComments2", "Page_DetailComments2_Pre_Request_Cache_Success");
        }
        return true;
    }

    public final boolean s(RateListDetailRequest rateListDetailRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("26f48e02", new Object[]{this, rateListDetailRequest})).booleanValue();
        }
        sgn sgnVar = this.e;
        if (sgnVar != null) {
            sgnVar.a(rateListDetailRequest);
        }
        return false;
    }

    public final void t(RateListDetailRequest rateListDetailRequest, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("533969ce", new Object[]{this, rateListDetailRequest, jSONObject});
            return;
        }
        sgn sgnVar = this.e;
        if (sgnVar != null) {
            sgnVar.d(rateListDetailRequest, jSONObject);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m(com.taobao.detail.rate.mtop.RateListDetailRequest r25) {
        /*
            Method dump skipped, instructions count: 475
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.detail.rate.vivid.presenter.PreRequestPresenter.m(com.taobao.detail.rate.mtop.RateListDetailRequest):void");
    }
}
