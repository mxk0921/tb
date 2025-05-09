package com.taobao.android.order.bundle.helper;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.order.bundle.base.TBOrderBaseActivity;
import com.taobao.android.order.bundle.base.parallelbiz.ParallelBizValueHelper;
import com.taobao.android.order.bundle.helper.orderplugin.impl.OrderPluginRebuyPopAction;
import com.taobao.android.order.core.a;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.MtopBusiness;
import java.util.HashMap;
import mtopsdk.mtop.common.MtopListener;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import tb.c2u;
import tb.kdl;
import tb.kpw;
import tb.t2o;
import tb.yw;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class WvOrderPlugin extends kpw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String ACTION_OPEN_NOTIFICATION_SETTING = "openNotificationSetting";
    private static final String ACTION_POST_MESSAGE = "postMessage";
    private static a mOrderCoreEngine;
    private final HashMap<String, yw> mPluginAction = new HashMap<>();
    private final HashMap<String, Class<? extends yw>> mPluginActionClazz;

    static {
        t2o.a(713031810);
    }

    public WvOrderPlugin() {
        HashMap<String, Class<? extends yw>> hashMap = new HashMap<>();
        this.mPluginActionClazz = hashMap;
        hashMap.put(OrderPluginRebuyPopAction.KEY_ACTION, OrderPluginRebuyPopAction.class);
    }

    private yw getPluginAction(String str) {
        Exception e;
        yw ywVar;
        if (str == null) {
            return null;
        }
        yw ywVar2 = this.mPluginAction.get(str);
        if (ywVar2 != null) {
            return ywVar2;
        }
        Class<? extends yw> cls = this.mPluginActionClazz.get(str);
        if (cls == null) {
            return null;
        }
        try {
            ywVar = (yw) cls.newInstance();
        } catch (Exception e2) {
            e = e2;
        }
        try {
            this.mPluginAction.put(str, ywVar);
            return ywVar;
        } catch (Exception e3) {
            e = e3;
            ywVar2 = ywVar;
            e.printStackTrace();
            return ywVar2;
        }
    }

    public static /* synthetic */ Object ipc$super(WvOrderPlugin wvOrderPlugin, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/order/bundle/helper/WvOrderPlugin");
    }

    public static void release() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca5510e", new Object[0]);
        } else {
            mOrderCoreEngine = null;
        }
    }

    public static void setOrderEngine(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("823ea439", new Object[]{aVar});
        } else {
            mOrderCoreEngine = aVar;
        }
    }

    private void sendSyncMtbMtop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("480244c7", new Object[]{this});
            return;
        }
        MtopRequest mtopRequest = new MtopRequest();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("virtualCategory", (Object) "market");
        jSONObject.put("openReject", (Object) "true");
        jSONObject.put("recallScene", (Object) "logistics_recall");
        JSONArray jSONArray = new JSONArray();
        jSONArray.add("logistics");
        jSONObject.put("openPushSceneCodes", (Object) jSONArray.toJSONString());
        JSONArray jSONArray2 = new JSONArray();
        jSONArray2.add("notLogistics");
        jSONObject.put("closePushSceneCodes", (Object) jSONArray2.toJSONString());
        mtopRequest.setData(jSONObject.toJSONString());
        mtopRequest.setApiName("mtop.taobao.alimp.bentley.pushrecall.set");
        mtopRequest.setVersion("1.0");
        MtopBusiness build = MtopBusiness.build(mtopRequest);
        build.reqMethod(MethodEnum.GET);
        mtopRequest.setNeedEcode(true);
        build.addListener((MtopListener) new IRemoteBaseListener() { // from class: com.taobao.android.order.bundle.helper.WvOrderPlugin.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                }
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                }
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
            public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                }
            }
        });
        build.startRequest();
    }

    @Override // tb.kpw
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        yw pluginAction = getPluginAction(str);
        if (pluginAction != null && pluginAction.a(this.mContext, this.mWebView, str2, wVCallBackContext)) {
            if (wVCallBackContext != null) {
                wVCallBackContext.success();
            }
            return true;
        } else if (ACTION_OPEN_NOTIFICATION_SETTING.equals(str)) {
            try {
                jSONObject = JSON.parseObject(str2);
                try {
                    if ("true".equals(jSONObject.get("isSycnMtb"))) {
                        sendSyncMtbMtop();
                    }
                } catch (Exception unused) {
                }
            } catch (Exception unused2) {
                jSONObject = null;
            }
            Intent f = c2u.f(this.mContext);
            Context context = this.mContext;
            if (context instanceof TBOrderBaseActivity) {
                ((Activity) context).startActivityForResult(f, 1001);
                ParallelBizValueHelper.PageType p3 = ((TBOrderBaseActivity) this.mContext).p3();
                com.taobao.android.order.bundle.base.parallelbiz.a.b(p3, p3 + "_Click_Open_Notification_Setting", jSONObject);
            } else {
                context.startActivity(f);
            }
            if (wVCallBackContext != null) {
                wVCallBackContext.success();
            }
            return true;
        } else if (!ACTION_POST_MESSAGE.equals(str)) {
            return false;
        } else {
            if (mOrderCoreEngine != null) {
                JSONObject a2 = kdl.a(str2);
                if (a2 == null) {
                    return false;
                }
                mOrderCoreEngine.j(a2.getString("action"), a2.getJSONObject("params"));
            }
            if (wVCallBackContext != null) {
                wVCallBackContext.success();
            }
            return true;
        }
    }
}
