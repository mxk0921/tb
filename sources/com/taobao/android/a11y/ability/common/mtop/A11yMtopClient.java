package com.taobao.android.a11y.ability.common.mtop;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.MtopBusiness;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import tb.b;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class A11yMtopClient<T, V> implements IRemoteBaseListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private A11yMtopRequest<V> a11yMtopRequest;
    private b<T> listener;
    private Class<T> responseDataClass;

    static {
        t2o.a(335544321);
        t2o.a(589299719);
    }

    public A11yMtopClient(A11yMtopRequest<V> a11yMtopRequest, b<T> bVar, Class<T> cls) {
        this.a11yMtopRequest = a11yMtopRequest;
        this.listener = bVar;
        this.responseDataClass = cls;
    }

    public void execute() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e48bb97c", new Object[]{this});
        } else {
            MtopBusiness.build((MtopRequest) this.a11yMtopRequest).reqMethod(MethodEnum.POST).registerListener((IRemoteListener) this).startRequest();
        }
    }

    @Override // com.taobao.tao.remotebusiness.IRemoteListener
    public void onError(int i, MtopResponse mtopResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
            return;
        }
        b<T> bVar = this.listener;
        if (bVar != null) {
            bVar.a(mtopResponse);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.taobao.tao.remotebusiness.IRemoteListener
    public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
        JSONObject parseObject;
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
        } else if (mtopResponse.getBytedata() != null) {
            String str = new String(mtopResponse.getBytedata());
            if (!TextUtils.isEmpty(str) && (parseObject = JSON.parseObject(str)) != null && (jSONObject = parseObject.getJSONObject("data")) != null) {
                Object parseObject2 = JSON.parseObject(jSONObject.toJSONString(), this.responseDataClass);
                b<T> bVar = this.listener;
                if (bVar != 0) {
                    bVar.b(parseObject2);
                }
            }
        }
    }

    @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
    public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
            return;
        }
        b<T> bVar = this.listener;
        if (bVar != null) {
            bVar.a(mtopResponse);
        }
    }
}
