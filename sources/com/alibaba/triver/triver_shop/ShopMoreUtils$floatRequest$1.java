package com.alibaba.triver.triver_shop;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import java.nio.charset.Charset;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopResponse;
import tb.brf;
import tb.ckf;
import tb.npp;
import tb.r54;
import tb.u1a;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class ShopMoreUtils$floatRequest$1 implements IRemoteBaseListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final /* synthetic */ u1a<Integer, JSONObject, xhv> $callback;

    /* JADX WARN: Multi-variable type inference failed */
    public ShopMoreUtils$floatRequest$1(u1a<? super Integer, ? super JSONObject, xhv> u1aVar) {
        this.$callback = u1aVar;
    }

    @Override // com.taobao.tao.remotebusiness.IRemoteListener
    public void onError(int i, MtopResponse mtopResponse, Object obj) {
        byte[] bytedata;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
            return;
        }
        npp.a aVar = npp.Companion;
        String str = null;
        if (!(mtopResponse == null || (bytedata = mtopResponse.getBytedata()) == null)) {
            Charset defaultCharset = Charset.defaultCharset();
            ckf.f(defaultCharset, "defaultCharset()");
            str = new String(bytedata, defaultCharset);
        }
        aVar.a(ckf.p("hover.fetch onError : ", str));
    }

    @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
    public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
        byte[] bytedata;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
            return;
        }
        npp.a aVar = npp.Companion;
        String str = null;
        if (!(mtopResponse == null || (bytedata = mtopResponse.getBytedata()) == null)) {
            Charset defaultCharset = Charset.defaultCharset();
            ckf.f(defaultCharset, "defaultCharset()");
            str = new String(bytedata, defaultCharset);
        }
        aVar.a(ckf.p("hover.fetch systemError : ", str));
    }

    @Override // com.taobao.tao.remotebusiness.IRemoteListener
    public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
            return;
        }
        byte[] bArr = null;
        npp.Companion.a(ckf.p("hover.fetch success : ", r54.K(mtopResponse == null ? null : mtopResponse.getBytedata())));
        if (mtopResponse != null) {
            bArr = mtopResponse.getBytedata();
        }
        JSONObject l = brf.l(bArr);
        if (l != null) {
            JSONObject jSONObject = l.getJSONObject("data");
            ckf.f(jSONObject, "data");
            Number number = 0;
            Object obj2 = jSONObject.get("maxCount");
            if (obj2 instanceof Integer) {
                number = obj2;
            }
            int intValue = number.intValue();
            JSONObject jSONObject2 = jSONObject.getJSONObject("moduleConfigs");
            u1a<Integer, JSONObject, xhv> u1aVar = this.$callback;
            if (u1aVar != null) {
                Integer valueOf = Integer.valueOf(intValue);
                ckf.f(jSONObject2, "moduleConfigs");
                u1aVar.invoke(valueOf, jSONObject2);
            }
        }
    }
}
