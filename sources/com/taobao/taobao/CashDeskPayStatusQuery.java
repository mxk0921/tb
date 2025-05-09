package com.taobao.taobao;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.MtopBusiness;
import com.taobao.taobao.b;
import com.taobao.taobao.utils.CashDeskLog;
import java.util.HashMap;
import mtopsdk.mtop.common.MtopListener;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import tb.bf3;
import tb.vii;
import tb.xhi;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class CashDeskPayStatusQuery implements IRemoteBaseListener {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String API = "mtop.trade.receipt.order.status.query";
    public static final String ERROR_ORDER_CLOSE = "8";
    public static final String ERROR_OTHER = "200";
    public static final String ERROR_WAIT_PAY = "1";
    private static final String KEY_ANY_UNPAID = "anyUnpaid";
    private static final String KEY_ORDER_INFO = "orderInfos";
    private static final String KEY_PAY_STATUS = "payStatus";
    private static final String TAG = "CashDeskPayStatusQuery";
    private boolean isMultiOrder;
    private final Context mContext;
    private final vii mMegaInstance = vii.a();
    private a mRequestListener;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface a {
    }

    public CashDeskPayStatusQuery(Context context) {
        this.mContext = context;
    }

    private JSONObject getBody(MtopResponse mtopResponse) {
        JSONObject jSONObject;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("d16489c4", new Object[]{this, mtopResponse});
        }
        if (mtopResponse.getOriginFastJsonObject() != null) {
            jSONObject = mtopResponse.getOriginFastJsonObject();
        } else {
            if (mtopResponse.getBytedata() == null) {
                str = "";
            } else {
                str = new String(mtopResponse.getBytedata());
            }
            jSONObject = JSON.parseObject(str);
        }
        if (jSONObject != null) {
            return jSONObject.getJSONObject("data");
        }
        CashDeskLog.e(CashDeskLog.TagLevel.CORE, "response is null");
        return null;
    }

    private void handleFailCallback(MtopResponse mtopResponse, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("947fafbf", new Object[]{this, mtopResponse, aVar});
            return;
        }
        ((b.a) aVar).a(mtopResponse.getRetCode(), mtopResponse.getRetMsg());
        bf3.h(bf3.b.o(mtopResponse.getApi(), false).sampling(1.0f));
    }

    @Override // com.taobao.tao.remotebusiness.IRemoteListener
    public void onError(int i, MtopResponse mtopResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
            return;
        }
        xhi.b(this.mMegaInstance);
        handleFailCallback(mtopResponse, this.mRequestListener);
    }

    @Override // com.taobao.tao.remotebusiness.IRemoteListener
    public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
            return;
        }
        xhi.b(this.mMegaInstance);
        try {
            handleSuccessCallback(mtopResponse, this.mRequestListener, this.isMultiOrder);
        } catch (Throwable unused) {
            ((b.a) this.mRequestListener).a(mtopResponse.getRetCode(), mtopResponse.getRetMsg());
        }
    }

    @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
    public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
            return;
        }
        xhi.b(this.mMegaInstance);
        handleFailCallback(mtopResponse, this.mRequestListener);
    }

    private void handleSuccessCallback(MtopResponse mtopResponse, a aVar, boolean z) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c935f40", new Object[]{this, mtopResponse, aVar, new Boolean(z)});
            return;
        }
        JSONObject body = getBody(mtopResponse);
        if (body == null) {
            CashDeskLog.e(CashDeskLog.TagLevel.CORE, "body is null");
            ((b.a) aVar).a(mtopResponse.getRetCode(), mtopResponse.getRetMsg());
            return;
        }
        if ("false".equals(body.getString(KEY_ANY_UNPAID))) {
            CashDeskLog.e(CashDeskLog.TagLevel.CORE, "状态查询成功");
            ((b.a) aVar).b(mtopResponse.getRetMsg());
        } else {
            if (z) {
                str = "1";
            } else {
                str = getStatus(body);
            }
            CashDeskLog.e(CashDeskLog.TagLevel.CORE, "状态查询失败： " + str);
            ((b.a) aVar).a(str, mtopResponse.getRetMsg());
        }
        bf3.h(bf3.b.o(mtopResponse.getApi(), true).sampling(0.01f));
    }

    private String getStatus(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("76bce15f", new Object[]{this, jSONObject});
        }
        JSONArray jSONArray = jSONObject.getJSONArray(KEY_ORDER_INFO);
        if (jSONArray == null || jSONArray.size() != 1) {
            return "1";
        }
        if (jSONArray.getJSONObject(0) == null) {
            CashDeskLog.e(CashDeskLog.TagLevel.CORE, "info is null");
            return "1";
        }
        String string = jSONObject.getString("payStatus");
        return TextUtils.isEmpty(string) ? "1" : string;
    }

    public void startRequest(String str, a aVar) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9cdbd86", new Object[]{this, str, aVar});
        } else if (TextUtils.isEmpty(str)) {
            CashDeskLog.e(CashDeskLog.TagLevel.CORE, "orderIds is null");
        } else {
            xhi.e(this.mMegaInstance, this.mContext);
            if (str.split(",").length > 1) {
                z = true;
            }
            this.isMultiOrder = z;
            this.mRequestListener = aVar;
            MtopRequest mtopRequest = new MtopRequest();
            mtopRequest.setApiName(API);
            mtopRequest.setVersion("1.0");
            HashMap hashMap = new HashMap();
            hashMap.put("orderIds", str);
            hashMap.put("source", "wxPay");
            mtopRequest.dataParams = hashMap;
            mtopRequest.setData(JSON.toJSONString(hashMap));
            MtopBusiness build = MtopBusiness.build(mtopRequest);
            build.supportStreamJson(true);
            build.addListener((MtopListener) this).startRequest();
        }
    }
}
