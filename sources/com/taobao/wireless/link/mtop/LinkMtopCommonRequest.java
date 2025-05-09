package com.taobao.wireless.link.mtop;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
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
import tb.irg;
import tb.m7r;
import tb.t2o;
import tb.xrg;
import tb.ypg;
import tb.zpg;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class LinkMtopCommonRequest extends zpg {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(1030750293);
    }

    public static /* synthetic */ Object ipc$super(LinkMtopCommonRequest linkMtopCommonRequest, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/wireless/link/mtop/LinkMtopCommonRequest");
    }

    @Override // tb.zpg
    public void d(String str, String str2, Map<String, String> map, boolean z, boolean z2, boolean z3, final xrg xrgVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("209d7237", new Object[]{this, str, str2, map, new Boolean(z), new Boolean(z2), new Boolean(z3), xrgVar});
        } else if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && map != null) {
            a(map);
            MtopRequest mtopRequest = new MtopRequest();
            mtopRequest.setApiName(str);
            mtopRequest.setVersion(str2);
            mtopRequest.setNeedEcode(z);
            mtopRequest.setData(ReflectUtil.convertMapToDataStr(map));
            IRemoteBaseListener iRemoteBaseListener = new IRemoteBaseListener() { // from class: com.taobao.wireless.link.mtop.LinkMtopCommonRequest.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.tao.remotebusiness.IRemoteListener
                public void onError(int i, MtopResponse mtopResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                        return;
                    }
                    xrg xrgVar2 = xrgVar;
                    if (xrgVar2 != null && mtopResponse != null) {
                        JSONObject dataJsonObject = mtopResponse.getDataJsonObject();
                        xrgVar2.b(dataJsonObject, "错误信息：" + mtopResponse.getRetMsg() + " === 错误映射码：" + mtopResponse.getMappingCode() + " === 网络请求状态码：" + mtopResponse.getResponseCode());
                    }
                }

                @Override // com.taobao.tao.remotebusiness.IRemoteListener
                public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                        return;
                    }
                    xrg xrgVar2 = xrgVar;
                    if (xrgVar2 != null && mtopResponse != null) {
                        xrgVar2.a(mtopResponse.getDataJsonObject());
                    }
                }

                @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
                public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                        return;
                    }
                    xrg xrgVar2 = xrgVar;
                    if (xrgVar2 != null && mtopResponse != null) {
                        JSONObject dataJsonObject = mtopResponse.getDataJsonObject();
                        xrgVar2.b(dataJsonObject, "错误信息：" + mtopResponse.getRetMsg() + " === 错误映射码：" + mtopResponse.getMappingCode() + " === 网络请求状态码：" + mtopResponse.getResponseCode());
                    }
                }
            };
            MtopBusiness build = MtopBusiness.build(Mtop.instance(Mtop.Id.INNER, ypg.e().f32260a), mtopRequest);
            if (z2) {
                build.useWua();
            }
            if (z3) {
                build.setBizId(m7r.ACTIONBAR_MENU_LIST);
            }
            build.setConnectionTimeoutMilliSecond(5000).setSocketTimeoutMilliSecond(5000).registerListener((IRemoteListener) iRemoteBaseListener).startRequest();
            irg.a("link_tag", "NetRequestImp === requestData: 开始进行接口请求: " + str);
        }
    }
}
