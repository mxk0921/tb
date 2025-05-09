package com.alibaba.wireless.aliprivacyext.http;

import android.content.Context;
import com.alibaba.wireless.aliprivacyext.http.annotations.Api;
import com.android.alibaba.ip.runtime.IpChange;
import mtopsdk.mtop.common.MtopCallback;
import mtopsdk.mtop.common.MtopFinishEvent;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.intf.Mtop;
import mtopsdk.mtop.intf.MtopBuilder;
import mtopsdk.mtop.util.ReflectUtil;
import org.json.JSONObject;
import tb.g01;
import tb.g7b;
import tb.mwx;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class MTopHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class a implements MtopCallback.MtopFinishListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ g7b f3386a;

        public a(g7b g7bVar) {
            this.f3386a = g7bVar;
        }

        @Override // mtopsdk.mtop.common.MtopCallback.MtopFinishListener
        public void onFinished(MtopFinishEvent mtopFinishEvent, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("732e17e0", new Object[]{this, mtopFinishEvent, obj});
                return;
            }
            g7b g7bVar = this.f3386a;
            if (g7bVar == null) {
                return;
            }
            if (mtopFinishEvent == null) {
                g7bVar.b(null);
                return;
            }
            MtopResponse mtopResponse = mtopFinishEvent.getMtopResponse();
            if (mtopResponse == null) {
                this.f3386a.b(null);
                return;
            }
            JSONObject dataJsonObject = mtopResponse.getDataJsonObject();
            String retCode = mtopResponse.getRetCode();
            String retMsg = mtopResponse.getRetMsg();
            com.alibaba.wireless.aliprivacyext.http.model.response.a aVar = new com.alibaba.wireless.aliprivacyext.http.model.response.a();
            if (dataJsonObject != null) {
                aVar.setData(dataJsonObject.toString());
            }
            aVar.setRetCode(retCode);
            aVar.setRetMsg(retMsg);
            String a2 = MTopHelper.a();
            g01.a(a2, "response:" + mwx.e(aVar));
            if (mtopResponse.isApiSuccess()) {
                this.f3386a.a(aVar);
            } else {
                this.f3386a.b(aVar);
            }
        }
    }

    public static /* synthetic */ String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7022ea09", new Object[0]);
        }
        return "MTopHelper";
    }

    public static Mtop c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Mtop) ipChange.ipc$dispatch("ea711001", new Object[]{context});
        }
        return Mtop.instance(context.getApplicationContext());
    }

    public static void b(Context context, Object obj, g7b g7bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cbaf90a", new Object[]{context, obj, g7bVar});
            return;
        }
        Mtop c = c(context);
        MtopRequest convertToMtopRequest = ReflectUtil.convertToMtopRequest(obj);
        Api api = (Api) obj.getClass().getAnnotation(Api.class);
        if (api == null) {
            g01.a("MTopHelper", "api not exist");
            return;
        }
        g01.a("MTopHelper", "api:" + api.name());
        convertToMtopRequest.setApiName(api.name());
        convertToMtopRequest.setVersion("1.0");
        convertToMtopRequest.setNeedEcode(true);
        MtopBuilder build = c.build(convertToMtopRequest, (String) null);
        g01.a("MTopHelper", "request:" + mwx.e(obj));
        build.useWua().addListener(new a(g7bVar)).reqMethod(api.method()).asyncRequest();
    }
}
