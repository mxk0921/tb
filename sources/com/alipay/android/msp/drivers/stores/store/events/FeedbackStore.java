package com.alipay.android.msp.drivers.stores.store.events;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.core.context.MspContext;
import com.alipay.android.msp.core.context.MspContextManager;
import com.alipay.android.msp.core.frame.MspWindowFrame;
import com.alipay.android.msp.drivers.stores.store.LocalEventStore;
import com.alipay.android.msp.framework.helper.GlobalHelper;
import com.alipay.android.msp.plugin.manager.PhoneCashierMspEngine;
import com.alipay.android.msp.utils.EventLogUtil;
import com.alipay.android.msp.utils.EventLogUtilMig;
import com.alipay.android.msp.utils.LogUtil;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_uikit.widget.input.a;
import com.taobao.weex.common.WXConfig;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class FeedbackStore extends LocalEventStore {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public FeedbackStore(int i) {
        super(i);
    }

    public static void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d99648bc", new Object[]{str});
        } else if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject parseObject = JSON.parseObject(str);
                PhoneCashierMspEngine.getMspLog().walletBehaviorLog(parseObject.getString("type"), parseObject.getString("seedId"), parseObject.getString("ucId"), parseObject.getString("bizType"), parseObject.getString(WXConfig.logLevel), parseObject.getString(a.EXTRA_ACTION_ID), parseObject.getString("spmId"), parseObject.getString("param1"), parseObject.getString("param2"), parseObject.getString("param3"), parseObject.getString("param4"));
            } catch (Exception e) {
                LogUtil.printExceptionStackTrace(e);
            }
        }
    }

    public static String createSpmSessionId(int i, MspWindowFrame mspWindowFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bfc3499b", new Object[]{new Integer(i), mspWindowFrame});
        }
        if (mspWindowFrame == null) {
            return null;
        }
        MspContext mspContextByBizId = MspContextManager.getInstance().getMspContextByBizId(i);
        if (mspContextByBizId != null) {
            return mspContextByBizId.getSpmSessionId();
        }
        return "dpCheck_" + String.valueOf(i) + GlobalHelper.getInstance().getUtdid(GlobalHelper.getInstance().getContext()) + "_null";
    }

    public static /* synthetic */ Object ipc$super(FeedbackStore feedbackStore, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/android/msp/drivers/stores/store/events/FeedbackStore");
    }

    public final void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f64af7b", new Object[]{this, str});
            return;
        }
        try {
            if (!TextUtils.isEmpty(str)) {
                JSONObject parseObject = JSON.parseObject(str);
                String string = parseObject.getString("eventId");
                String string2 = parseObject.getString("bizCode");
                boolean booleanValue = parseObject.getBooleanValue("autoBizInfo");
                JSONObject jSONObject = parseObject.getJSONObject("data");
                HashMap hashMap = new HashMap();
                if (jSONObject != null && jSONObject.size() > 0) {
                    for (String str2 : jSONObject.keySet()) {
                        hashMap.put(str2, jSONObject.getString(str2));
                    }
                }
                if (booleanValue) {
                    EventLogUtilMig.appendBizInfoToLogMap(hashMap, this.mMspContext);
                }
                if (TextUtils.isEmpty(string2)) {
                    EventLogUtil.logPayEvent(string, hashMap);
                } else {
                    PhoneCashierMspEngine.getMspLog().walletEventLog(string, string2, hashMap);
                }
            }
        } catch (Exception e) {
            LogUtil.printExceptionStackTrace(e);
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:28:0x00b5
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:90)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:44)
        */
    @Override // com.alipay.android.msp.drivers.stores.store.LocalEventStore
    public java.lang.String onMspAction(com.alipay.android.msp.drivers.actions.EventAction r35, com.alipay.android.msp.drivers.actions.EventAction.MspEvent r36) {
        /*
            Method dump skipped, instructions count: 814
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.android.msp.drivers.stores.store.events.FeedbackStore.onMspAction(com.alipay.android.msp.drivers.actions.EventAction, com.alipay.android.msp.drivers.actions.EventAction$MspEvent):java.lang.String");
    }
}
