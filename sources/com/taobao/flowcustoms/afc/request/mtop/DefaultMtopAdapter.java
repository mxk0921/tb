package com.taobao.flowcustoms.afc.request.mtop;

import android.os.Handler;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.flowcustoms.afc.AfcCustomSdk;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.MtopBusiness;
import java.util.Map;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.intf.Mtop;
import mtopsdk.mtop.util.ReflectUtil;
import org.json.JSONObject;
import tb.i4j;
import tb.i6j;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class DefaultMtopAdapter extends i4j {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(467664961);
    }

    public static /* synthetic */ Object ipc$super(DefaultMtopAdapter defaultMtopAdapter, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/flowcustoms/afc/request/mtop/DefaultMtopAdapter");
    }

    @Override // tb.i4j
    public void d(String str, String str2, Map<String, String> map, boolean z, final i6j i6jVar, Handler handler, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58b32322", new Object[]{this, str, str2, map, new Boolean(z), i6jVar, handler, new Integer(i)});
        } else if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && map != null) {
            a(map);
            MtopRequest mtopRequest = new MtopRequest();
            mtopRequest.setApiName(str);
            mtopRequest.setVersion(str2);
            mtopRequest.setNeedEcode(z);
            mtopRequest.setData(ReflectUtil.converMapToDataStr(map));
            IRemoteBaseListener iRemoteBaseListener = new IRemoteBaseListener() { // from class: com.taobao.flowcustoms.afc.request.mtop.DefaultMtopAdapter.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.tao.remotebusiness.IRemoteListener
                public void onError(int i2, MtopResponse mtopResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i2), mtopResponse, obj});
                        return;
                    }
                    i6j i6jVar2 = i6jVar;
                    if (i6jVar2 != null && mtopResponse != null) {
                        JSONObject dataJsonObject = mtopResponse.getDataJsonObject();
                        i6jVar2.b(dataJsonObject, "错误信息：" + mtopResponse.getRetMsg() + " === 错误映射码：" + mtopResponse.getMappingCode() + " === 网络请求状态码：" + mtopResponse.getResponseCode());
                    }
                }

                @Override // com.taobao.tao.remotebusiness.IRemoteListener
                public void onSuccess(int i2, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i2), mtopResponse, baseOutDo, obj});
                        return;
                    }
                    i6j i6jVar2 = i6jVar;
                    if (i6jVar2 != null && mtopResponse != null) {
                        i6jVar2.a(mtopResponse.getDataJsonObject());
                    }
                }

                @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
                public void onSystemError(int i2, MtopResponse mtopResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i2), mtopResponse, obj});
                        return;
                    }
                    i6j i6jVar2 = i6jVar;
                    if (i6jVar2 != null && mtopResponse != null) {
                        JSONObject dataJsonObject = mtopResponse.getDataJsonObject();
                        i6jVar2.b(dataJsonObject, "错误信息：" + mtopResponse.getRetMsg() + " === 错误映射码：" + mtopResponse.getMappingCode() + " === 网络请求状态码：" + mtopResponse.getResponseCode());
                    }
                }
            };
            Mtop instance = Mtop.instance(AfcCustomSdk.h().d, AfcCustomSdk.h().f10563a);
            if (handler != null) {
                MtopBusiness.build(instance, mtopRequest).registerListener((IRemoteListener) iRemoteBaseListener).setConnectionTimeoutMilliSecond(i).handler(handler).startRequest();
            } else {
                MtopBusiness.build(instance, mtopRequest).registerListener((IRemoteListener) iRemoteBaseListener).setConnectionTimeoutMilliSecond(i).startRequest();
            }
        }
    }
}
