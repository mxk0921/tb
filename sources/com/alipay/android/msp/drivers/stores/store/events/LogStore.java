package com.alipay.android.msp.drivers.stores.store.events;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.core.context.MspContext;
import com.alipay.android.msp.core.frame.MspWindowFrame;
import com.alipay.android.msp.core.frame.MspWindowFrameStack;
import com.alipay.android.msp.drivers.actions.EventAction;
import com.alipay.android.msp.drivers.stores.store.LocalEventStore;
import com.alipay.android.msp.framework.statisticsv2.StatisticInfo;
import com.alipay.android.msp.framework.statisticsv2.model.StEvent;
import com.alipay.android.msp.pay.GlobalConstant;
import com.alipay.android.msp.utils.LogUtil;
import com.alipay.mobile.common.logging.api.LoggerFactory;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Iterator;
import tb.k68;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class LogStore extends LocalEventStore {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public LogStore(int i) {
        super(i);
    }

    public static /* synthetic */ Object ipc$super(LogStore logStore, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/android/msp/drivers/stores/store/events/LogStore");
    }

    @Override // com.alipay.android.msp.drivers.stores.store.LocalEventStore
    public String onMspAction(EventAction eventAction, EventAction.MspEvent mspEvent) {
        MspContext mspContext;
        MspContext mspContext2;
        MspContext mspContext3;
        MspWindowFrame findFrameBySender;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("719dcfee", new Object[]{this, eventAction, mspEvent});
        }
        JSONObject actionParamsJson = mspEvent.getActionParamsJson();
        if (actionParamsJson == null || actionParamsJson.size() == 0) {
            LogUtil.i("LogStore", "onMspAction", "logs is empty");
            return null;
        }
        Iterator<String> it = actionParamsJson.keySet().iterator();
        while (true) {
            String str = "";
            if (!it.hasNext()) {
                return str;
            }
            String next = it.next();
            try {
                if (TextUtils.equals(next, "count")) {
                    String string = actionParamsJson.getString(next);
                    if (GlobalConstant.DEBUG) {
                        LoggerFactory.getTraceLogger().debug("Birdnest", string);
                    }
                    if (!TextUtils.isEmpty(string)) {
                        JSONObject parseObject = JSON.parseObject(string);
                        String string2 = parseObject.getString("biz");
                        String string3 = parseObject.getString(k68.KEY_OP);
                        String string4 = parseObject.getString("desc");
                        if (!TextUtils.isEmpty(string2) && !TextUtils.isEmpty(string3) && (mspContext = this.mMspContext) != null) {
                            StatisticInfo statisticInfo = mspContext.getStatisticInfo();
                            String currentWinTpName = this.mMspContext.getCurrentWinTpName();
                            statisticInfo.addEvent(new StEvent(currentWinTpName, string2, string3 + "|" + string4));
                        }
                    }
                } else if (TextUtils.equals(next, "error")) {
                    String string5 = actionParamsJson.getString(next);
                    if (GlobalConstant.DEBUG) {
                        LoggerFactory.getTraceLogger().debug("Birdnest", string5);
                    }
                    if (!TextUtils.isEmpty(string5)) {
                        JSONObject parseObject2 = JSON.parseObject(string5);
                        String string6 = parseObject2.getString("code");
                        String string7 = parseObject2.getString("desc");
                        if (!TextUtils.isEmpty(string6) && (mspContext2 = this.mMspContext) != null) {
                            mspContext2.getStatisticInfo().addError("bn", string6, string7);
                        }
                    }
                } else if (TextUtils.equals(next, "action")) {
                    Object sender = eventAction.getSender();
                    String string8 = actionParamsJson.getString(next);
                    if (GlobalConstant.DEBUG) {
                        LoggerFactory.getTraceLogger().debug("Birdnest", string8);
                    }
                    if (!TextUtils.isEmpty(string8)) {
                        MspContext mspContext4 = this.mMspContext;
                        if (!(mspContext4 == null || this.mMspUIClient == null)) {
                            str = mspContext4.getCurrentWinTpName();
                            MspWindowFrameStack frameStack = this.mMspUIClient.getFrameStack();
                            if (!(frameStack == null || sender == null || (findFrameBySender = frameStack.findFrameBySender(sender)) == null)) {
                                str = findFrameBySender.getTplId();
                            }
                        }
                        JSONObject parseObject3 = JSON.parseObject(string8);
                        String string9 = parseObject3.getString("type");
                        String string10 = parseObject3.getString("name");
                        if (!TextUtils.isEmpty(string9) && !TextUtils.isEmpty(string10) && (mspContext3 = this.mMspContext) != null) {
                            mspContext3.getStatisticInfo().addEvent(new StEvent(str, string9, string10));
                        }
                    }
                }
            } catch (Exception e) {
                LogUtil.printExceptionStackTrace(e);
            }
        }
    }
}
