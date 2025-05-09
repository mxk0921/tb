package com.alipay.android.msp.framework.assist;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.constants.MspFlybirdDefine;
import com.alipay.android.msp.core.clients.MspWindowClient;
import com.alipay.android.msp.core.context.MspContext;
import com.alipay.android.msp.core.context.MspContextManager;
import com.alipay.android.msp.core.frame.MspWindowFrame;
import com.alipay.android.msp.drivers.stores.store.events.FeedbackStore;
import com.alipay.android.msp.framework.statistics.SpmWrapper;
import com.alipay.android.msp.framework.taskscheduler.TaskHelper;
import com.alipay.android.msp.log.PageInfo;
import com.alipay.android.msp.plugin.engine.ILogEngine;
import com.alipay.android.msp.plugin.manager.PhoneCashierMspEngine;
import com.alipay.android.msp.utils.LogUtil;
import com.alipay.mobile.common.logging.api.antevent.AntEvent;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class MspLogImpl implements ILogEngine {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ String access$000(MspLogImpl mspLogImpl, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3f4e5223", new Object[]{mspLogImpl, str});
        }
        return mspLogImpl.a(str);
    }

    public final String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8183bd64", new Object[]{this, str});
        }
        if (TextUtils.equals("SHOW", str)) {
            return "AdShow";
        }
        if (TextUtils.equals("CLICK", str)) {
            return "AdClick";
        }
        if (TextUtils.equals("CLOSE", str)) {
            return "AdClose";
        }
        return str;
    }

    @Override // com.alipay.android.msp.plugin.engine.ILogEngine
    public String getChinfoChainUUID() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8881da66", new Object[]{this});
        }
        return null;
    }

    @Override // com.alipay.android.msp.plugin.engine.ILogEngine
    public PageInfo getCurrentReferPageInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PageInfo) ipChange.ipc$dispatch("edc03cae", new Object[]{this});
        }
        return null;
    }

    @Override // com.alipay.android.msp.plugin.engine.ILogEngine
    public String getSpmSessionId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8dc1a662", new Object[]{this});
        }
        return "";
    }

    @Override // com.alipay.android.msp.plugin.engine.ILogEngine
    public void userFeedback(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3420f95", new Object[]{this, str, str2, str3});
        }
    }

    @Override // com.alipay.android.msp.plugin.engine.ILogEngine
    public void userFeedbackForServer(final String str, final String str2, final String str3, boolean z, boolean z2, boolean z3, Map<String, String> map, Context context, final String str4, final String str5, final JSONObject jSONObject, final int i, Map<String, String> map2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92e459a8", new Object[]{this, str, str2, str3, new Boolean(z), new Boolean(z2), new Boolean(z3), map, context, str4, str5, jSONObject, new Integer(i), map2});
        } else {
            TaskHelper.execute(new Runnable() { // from class: com.alipay.android.msp.framework.assist.MspLogImpl.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    MspWindowClient mspWindowClient;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        String access$000 = MspLogImpl.access$000(MspLogImpl.this, str3);
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("spaceObjectId", (Object) str2);
                        jSONObject2.put("behavior", (Object) access$000);
                        jSONObject2.put("userId", (Object) str5);
                        jSONObject2.put(MspFlybirdDefine.FLYBIRD_FEEDBACK_SPACECODE, (Object) str);
                        jSONObject2.put("extInfos", (Object) jSONObject);
                        JSONArray jSONArray = new JSONArray();
                        jSONArray.add(jSONObject2);
                        PhoneCashierMspEngine.getMspUtils().executeRpc(false, "alipay.cdp.space.feedbackNoLogin", jSONArray.toString(), -1, null);
                        MspContext mspContextByBizId = MspContextManager.getInstance().getMspContextByBizId(i);
                        MspWindowFrame topTplOrNativeFrame = (mspContextByBizId == null || (mspWindowClient = (MspWindowClient) mspContextByBizId.getMspUIClient()) == null) ? null : mspWindowClient.getFrameStack().getTopTplOrNativeFrame();
                        String createSpmSessionId = FeedbackStore.createSpmSessionId(i, topTplOrNativeFrame);
                        StringBuilder sb = new StringBuilder();
                        sb.append("spaceCode=");
                        sb.append(str);
                        sb.append("^");
                        sb.append("objectId=");
                        sb.append(str3);
                        sb.append("^");
                        sb.append("behavior=");
                        sb.append(str3);
                        sb.append("^");
                        sb.append("spmId=");
                        sb.append(str4);
                        JSONObject jSONObject3 = jSONObject;
                        if (jSONObject3 != null) {
                            for (String str6 : jSONObject3.keySet()) {
                                String string = jSONObject.getString(str6);
                                sb.append("^");
                                sb.append(str6);
                                sb.append("=");
                                sb.append(string);
                            }
                        }
                        if (TextUtils.equals("SHOW", str3)) {
                            SpmWrapper.onPageExposure(topTplOrNativeFrame, str4, "", "", createSpmSessionId, sb.toString(), i);
                        } else if (TextUtils.equals("CLICK", str3)) {
                            SpmWrapper.onPageClick(topTplOrNativeFrame, str4, "", createSpmSessionId, sb.toString(), i);
                        }
                    } catch (Throwable th) {
                        LogUtil.printExceptionStackTrace(th);
                    }
                }
            });
        }
    }

    @Override // com.alipay.android.msp.plugin.engine.ILogEngine
    public void walletBehaviorLog(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("392340e", new Object[]{this, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11});
        }
    }

    @Override // com.alipay.android.msp.plugin.engine.ILogEngine
    public void walletEventLog(String str, String str2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44938347", new Object[]{this, str, str2, map});
            return;
        }
        try {
            AntEvent.Builder builder = new AntEvent.Builder();
            builder.setEventID(str);
            builder.setBizType(str2);
            builder.setLoggerLevel(2);
            if (map != null) {
                for (String str3 : map.keySet()) {
                    builder.addExtParam(str3, map.get(str3));
                }
            }
            builder.build().send();
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
        }
    }

    @Override // com.alipay.android.msp.plugin.engine.ILogEngine
    public void walletSpmTrack(Object obj, String str, String str2, String str3, String str4, Map<String, String> map, String str5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("368a90", new Object[]{this, obj, str, str2, str3, str4, map, str5});
        }
    }
}
