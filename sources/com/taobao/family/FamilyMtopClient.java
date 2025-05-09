package com.taobao.family;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.Globals;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.RemoteBusiness;
import com.taobao.tao.util.TaoHelper;
import java.util.Map;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.util.ReflectUtil;
import tb.h6j;
import tb.y7t;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class FamilyMtopClient {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String API_NAME_ACCS_CHECK = "mtop.taobao.family.accsCheck";
    public static final String API_NAME_GET_FAMILY_RELATION = "mtop.taobao.family.getFamilyRelation";
    public static final String API_NAME_GET_PENDING_TOKENS = "";
    public static final String API_NAME_SHARE_POP_CHECK = "mtop.taobao.social.pop.get";
    public static final String API_VERSION = "1.0";

    /* renamed from: a  reason: collision with root package name */
    public static final FamilyMtopClient f10509a = new FamilyMtopClient();

    public void a(String str, Map<String, String> map, final h6j h6jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9a62b91", new Object[]{this, str, map, h6jVar});
        } else if (!TextUtils.isEmpty(str) && map != null) {
            MtopRequest mtopRequest = new MtopRequest();
            mtopRequest.setApiName(str);
            mtopRequest.setVersion("1.0");
            mtopRequest.setNeedEcode(false);
            mtopRequest.setData(ReflectUtil.converMapToDataStr(map));
            IRemoteBaseListener iRemoteBaseListener = new IRemoteBaseListener() { // from class: com.taobao.family.FamilyMtopClient.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.tao.remotebusiness.IRemoteListener
                public void onError(int i, MtopResponse mtopResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                    } else if (h6jVar != null && mtopResponse != null) {
                        y7t.a("FamilyManager", "mtop onError: " + mtopResponse.getRetMsg());
                        h6jVar.b(mtopResponse.getDataJsonObject());
                    }
                }

                @Override // com.taobao.tao.remotebusiness.IRemoteListener
                public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                        return;
                    }
                    h6j h6jVar2 = h6jVar;
                    if (h6jVar2 != null && mtopResponse != null) {
                        h6jVar2.a(mtopResponse.getDataJsonObject());
                    }
                }

                @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
                public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                    } else if (h6jVar != null && mtopResponse != null) {
                        y7t.a("FamilyManager", "mtop onSystemError: " + mtopResponse.getRetMsg());
                        h6jVar.b(mtopResponse.getDataJsonObject());
                    }
                }
            };
            RemoteBusiness.init(Globals.getApplication(), TaoHelper.getTTID());
            RemoteBusiness.build(mtopRequest, TaoHelper.getTTID()).registeListener((IRemoteListener) iRemoteBaseListener).startRequest();
        }
    }
}
