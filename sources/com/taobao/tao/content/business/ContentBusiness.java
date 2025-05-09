package com.taobao.tao.content.business;

import android.text.TextUtils;
import android.util.Log;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.RemoteBusiness;
import mtopsdk.common.util.StringUtils;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import tb.jh4;
import tb.rb;
import tb.t2o;
import tb.zn2;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class ContentBusiness {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(701497351);
    }

    public static /* synthetic */ void a(ContentBusiness contentBusiness, ContentBusinessModel contentBusinessModel, MtopRequest mtopRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("425c4fcb", new Object[]{contentBusiness, contentBusinessModel, mtopRequest});
        } else {
            contentBusiness.e(contentBusinessModel, mtopRequest);
        }
    }

    public static /* synthetic */ void b(ContentBusiness contentBusiness, MtopResponse mtopResponse, ContentBusinessModel contentBusinessModel, MtopRequest mtopRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56cc62e7", new Object[]{contentBusiness, mtopResponse, contentBusinessModel, mtopRequest});
        } else {
            contentBusiness.f(mtopResponse, contentBusinessModel, mtopRequest);
        }
    }

    public final IRemoteBaseListener c(final ContentBusinessModel contentBusinessModel, final MtopRequest mtopRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IRemoteBaseListener) ipChange.ipc$dispatch("f7101733", new Object[]{this, contentBusinessModel, mtopRequest});
        }
        return new IRemoteBaseListener() { // from class: com.taobao.tao.content.business.ContentBusiness.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                    return;
                }
                if (mtopResponse != null) {
                    zn2.a(contentBusinessModel.url, mtopResponse.getRetCode(), mtopResponse.getRetMsg(), mtopRequest.dataParams, contentBusinessModel.source);
                } else {
                    ContentBusinessModel contentBusinessModel2 = contentBusinessModel;
                    zn2.a(contentBusinessModel2.url, "-1", "mtopResponse is null", mtopRequest.dataParams, contentBusinessModel2.source);
                }
                ContentBusiness.a(ContentBusiness.this, contentBusinessModel, mtopRequest);
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                    return;
                }
                ContentBusinessModel contentBusinessModel2 = contentBusinessModel;
                zn2.b(contentBusinessModel2.url, mtopRequest.dataParams, contentBusinessModel2.source);
                ContentBusiness.b(ContentBusiness.this, mtopResponse, contentBusinessModel, mtopRequest);
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
            public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                    return;
                }
                if (mtopResponse != null) {
                    zn2.a(contentBusinessModel.url, mtopResponse.getRetCode(), mtopResponse.getRetMsg(), mtopRequest.dataParams, contentBusinessModel.source);
                } else {
                    ContentBusinessModel contentBusinessModel2 = contentBusinessModel;
                    zn2.a(contentBusinessModel2.url, "-1", "mtopResponse is null", mtopRequest.dataParams, contentBusinessModel2.source);
                }
                ContentBusiness.a(ContentBusiness.this, contentBusinessModel, mtopRequest);
            }
        };
    }

    public final void d(ContentBusinessModel contentBusinessModel, MtopRequest mtopRequest, boolean z) {
        IRemoteBaseListener iRemoteBaseListener;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0151872", new Object[]{this, contentBusinessModel, mtopRequest, new Boolean(z)});
            return;
        }
        if (z) {
            iRemoteBaseListener = null;
        } else {
            iRemoteBaseListener = c(contentBusinessModel, mtopRequest);
        }
        RemoteBusiness bizId = RemoteBusiness.build(mtopRequest).registeListener((IRemoteListener) iRemoteBaseListener).reqContext((Object) this).setBizId(59);
        bizId.reqMethod(MethodEnum.POST);
        bizId.startRequest(0, null);
    }

    public final void e(ContentBusinessModel contentBusinessModel, MtopRequest mtopRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5338f1a5", new Object[]{this, contentBusinessModel, mtopRequest});
        } else if (jh4.d()) {
            Log.e("ContentBusiness", "retryOnce重试一次");
            d(contentBusinessModel, mtopRequest, true);
        }
    }

    public final void f(MtopResponse mtopResponse, ContentBusinessModel contentBusinessModel, MtopRequest mtopRequest) {
        JSONObject parseObject;
        String[] split;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("601d36a8", new Object[]{this, mtopResponse, contentBusinessModel, mtopRequest});
        } else if (jh4.d() && mtopResponse != null && (parseObject = JSON.parseObject(new String(mtopResponse.getBytedata()))) != null) {
            JSONArray jSONArray = parseObject.getJSONArray(rb.RESULT_KEY);
            int size = jSONArray.size();
            String[] strArr = new String[size];
            for (int i = 0; i < size; i++) {
                strArr[i] = jSONArray.getString(i);
            }
            if (size > 0) {
                String str = strArr[0];
                if (StringUtils.isNotBlank(str) && (split = str.split("::")) != null && split.length > 1 && !TextUtils.equals(split[0], "SUCCESS")) {
                    e(contentBusinessModel, mtopRequest);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x018b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void g(final com.taobao.tao.content.business.ContentBusinessModel r12, final com.taobao.tao.remotebusiness.IRemoteBaseListener r13) {
        /*
            Method dump skipped, instructions count: 445
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.tao.content.business.ContentBusiness.g(com.taobao.tao.content.business.ContentBusinessModel, com.taobao.tao.remotebusiness.IRemoteBaseListener):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:77:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:96:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v1, types: [mtopsdk.mtop.domain.BaseOutDo, mtopsdk.mtop.domain.MtopResponse, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Unknown variable types count: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void h(final com.taobao.tao.content.business.ContentBusinessModel r22, com.taobao.tao.remotebusiness.IRemoteBaseListener r23) {
        /*
            Method dump skipped, instructions count: 799
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.tao.content.business.ContentBusiness.h(com.taobao.tao.content.business.ContentBusinessModel, com.taobao.tao.remotebusiness.IRemoteBaseListener):void");
    }
}
