package com.taobao.android.litecreator.sdk.nav;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.ability.localization.Localization;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.sdk.nav.LCNavInterceptor;
import com.taobao.android.nav.Nav;
import com.taobao.tao.Globals;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.MtopBusiness;
import com.taobao.taobao.R;
import java.util.Set;
import kotlin.Metadata;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.intf.Mtop;
import tb.ckf;
import tb.dnu;
import tb.eag;
import tb.ebg;
import tb.lvc;
import tb.wsq;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 0})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class LCNavInterceptor$nav$1 implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ LCNavInterceptor f8320a;
    public final /* synthetic */ Intent b;
    public final /* synthetic */ Context c;

    public LCNavInterceptor$nav$1(LCNavInterceptor lCNavInterceptor, Intent intent, Context context) {
        this.f8320a = lCNavInterceptor;
        this.b = intent;
        this.c = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Set<String> queryParameterNames;
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        Uri data = this.b.getData();
        JSONObject jSONObject = new JSONObject();
        if (!(data == null || (queryParameterNames = data.getQueryParameterNames()) == null)) {
            boolean z2 = false;
            for (String str : queryParameterNames) {
                String queryParameter = data.getQueryParameter(str);
                if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(queryParameter)) {
                    jSONObject.put((JSONObject) str, queryParameter);
                }
                ckf.f(str, "key");
                if (wsq.O(str, LCNavInterceptor.a(this.f8320a), false, 2, null) && !LCNavInterceptor.b(this.f8320a).contains(str)) {
                    z2 = true;
                }
            }
            z = z2;
        }
        if (z) {
            ebg.k(Globals.getApplication(), eag.a());
            lvc e = this.f8320a.e();
            if (e != null) {
                lvc.a.b(e, "short_chain_failed", "no_supported_args", this.f8320a.f(), null, this.f8320a.f(), null, 40, null);
            }
        }
        IRemoteBaseListener lCNavInterceptor$nav$1$listener$1 = new IRemoteBaseListener() { // from class: com.taobao.android.litecreator.sdk.nav.LCNavInterceptor$nav$1$listener$1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* compiled from: Taobao */
            @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 0})
            /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
            public static final class a implements Runnable {
                public static volatile transient /* synthetic */ IpChange $ipChange;
                public final /* synthetic */ MtopResponse b;

                public a(MtopResponse mtopResponse) {
                    this.b = mtopResponse;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    String string = this.b.getDataJsonObject().getString("status");
                    if (string != null) {
                        int hashCode = string.hashCode();
                        if (hashCode != 48) {
                            if (hashCode == 49 && string.equals("1")) {
                                String string2 = this.b.getDataJsonObject().getString("actionUrl");
                                Nav.from(LCNavInterceptor$nav$1.this.c).toUri(Uri.parse(string2));
                                lvc e = LCNavInterceptor$nav$1.this.f8320a.e();
                                if (e != null) {
                                    lvc.a.b(e, "short_chain_failed", "no_permission", string2, null, string2, null, 40, null);
                                    return;
                                }
                                return;
                            }
                        } else if (string.equals("0")) {
                            org.json.JSONObject jSONObject = this.b.getDataJsonObject().getJSONObject("publishParams");
                            LCNavInterceptor lCNavInterceptor = LCNavInterceptor$nav$1.this.f8320a;
                            ckf.f(jSONObject, "publishConfig");
                            lCNavInterceptor.d(jSONObject, LCNavInterceptor$nav$1.this.c);
                            return;
                        }
                    }
                    LCNavInterceptor$nav$1 lCNavInterceptor$nav$1 = LCNavInterceptor$nav$1.this;
                    LCNavInterceptor lCNavInterceptor2 = lCNavInterceptor$nav$1.f8320a;
                    Context context = lCNavInterceptor$nav$1.c;
                    String q = Localization.q(R.string.gg_pub_system_error_retry_1);
                    ckf.f(q, "Localization.localizedSt…pub_system_error_retry_1)");
                    lCNavInterceptor2.j(context, q);
                    String str = "other_" + this.b.getRetCode() + '_' + this.b.getRetMsg();
                    lvc e2 = LCNavInterceptor$nav$1.this.f8320a.e();
                    if (e2 != null) {
                        lvc.a.b(e2, "short_chain_failed", str, LCNavInterceptor$nav$1.this.f8320a.f(), null, LCNavInterceptor$nav$1.this.f8320a.f(), null, 40, null);
                    }
                }
            }

            /* compiled from: Taobao */
            @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 0})
            /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
            public static final class b implements Runnable {
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public b() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    LCNavInterceptor$nav$1 lCNavInterceptor$nav$1 = LCNavInterceptor$nav$1.this;
                    LCNavInterceptor lCNavInterceptor = lCNavInterceptor$nav$1.f8320a;
                    Context context = lCNavInterceptor$nav$1.c;
                    String q = Localization.q(R.string.gg_pub_system_error_retry_1);
                    ckf.f(q, "Localization.localizedSt…pub_system_error_retry_1)");
                    lCNavInterceptor.j(context, q);
                }
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                    return;
                }
                LCNavInterceptor$nav$1 lCNavInterceptor$nav$1 = LCNavInterceptor$nav$1.this;
                lCNavInterceptor$nav$1.f8320a.g(lCNavInterceptor$nav$1.c);
                LCNavInterceptor$nav$1 lCNavInterceptor$nav$12 = LCNavInterceptor$nav$1.this;
                LCNavInterceptor lCNavInterceptor = lCNavInterceptor$nav$12.f8320a;
                Context context = lCNavInterceptor$nav$12.c;
                String q = Localization.q(R.string.gg_pub_system_error_retry_1);
                ckf.f(q, "Localization.localizedSt…pub_system_error_retry_1)");
                lCNavInterceptor.j(context, q);
                StringBuilder sb = new StringBuilder("other_");
                String str2 = null;
                sb.append(mtopResponse != null ? mtopResponse.getRetCode() : null);
                sb.append('_');
                if (mtopResponse != null) {
                    str2 = mtopResponse.getRetMsg();
                }
                sb.append(str2);
                String sb2 = sb.toString();
                lvc e2 = LCNavInterceptor$nav$1.this.f8320a.e();
                if (e2 != null) {
                    lvc.a.b(e2, "short_chain_failed", sb2, LCNavInterceptor$nav$1.this.f8320a.f(), null, LCNavInterceptor$nav$1.this.f8320a.f(), null, 40, null);
                }
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                    return;
                }
                ckf.g(mtopResponse, "mtopResponse");
                LCNavInterceptor$nav$1 lCNavInterceptor$nav$1 = LCNavInterceptor$nav$1.this;
                lCNavInterceptor$nav$1.f8320a.g(lCNavInterceptor$nav$1.c);
                dnu.b(new a(mtopResponse), new b());
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
            public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                    return;
                }
                LCNavInterceptor$nav$1 lCNavInterceptor$nav$1 = LCNavInterceptor$nav$1.this;
                lCNavInterceptor$nav$1.f8320a.g(lCNavInterceptor$nav$1.c);
                LCNavInterceptor$nav$1 lCNavInterceptor$nav$12 = LCNavInterceptor$nav$1.this;
                LCNavInterceptor lCNavInterceptor = lCNavInterceptor$nav$12.f8320a;
                Context context = lCNavInterceptor$nav$12.c;
                String q = Localization.q(R.string.gg_pub_system_error_retry_1);
                ckf.f(q, "Localization.localizedSt…pub_system_error_retry_1)");
                lCNavInterceptor.j(context, q);
                StringBuilder sb = new StringBuilder("other_");
                String str2 = null;
                sb.append(mtopResponse != null ? mtopResponse.getRetCode() : null);
                sb.append('_');
                if (mtopResponse != null) {
                    str2 = mtopResponse.getRetMsg();
                }
                sb.append(str2);
                String sb2 = sb.toString();
                lvc e2 = LCNavInterceptor$nav$1.this.f8320a.e();
                if (e2 != null) {
                    lvc.a.b(e2, "short_chain_failed", sb2, LCNavInterceptor$nav$1.this.f8320a.f(), null, LCNavInterceptor$nav$1.this.f8320a.f(), null, 40, null);
                }
            }
        };
        this.f8320a.i(this.c);
        MtopBusiness.build(Mtop.instance((String) null, Globals.getApplication()), new LCNavInterceptor.PublishConfigRequest(jSONObject)).registerListener((IRemoteListener) lCNavInterceptor$nav$1$listener$1).reqMethod(MethodEnum.POST).startRequest();
    }
}
