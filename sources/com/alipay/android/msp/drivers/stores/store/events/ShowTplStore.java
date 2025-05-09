package com.alipay.android.msp.drivers.stores.store.events;

import android.text.TextUtils;
import android.util.Base64;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.constants.MspFlybirdDefine;
import com.alipay.android.msp.core.clients.MspUIClient;
import com.alipay.android.msp.core.frame.MspWindowFrame;
import com.alipay.android.msp.core.frame.MspWindowFrameStack;
import com.alipay.android.msp.drivers.actions.EventAction;
import com.alipay.android.msp.drivers.actions.MspEventTypes;
import com.alipay.android.msp.drivers.stores.store.LocalEventStore;
import com.alipay.android.msp.framework.statisticsv2.model.StEvent;
import com.alipay.android.msp.utils.LogUtil;
import com.alipay.android.msp.utils.Utils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class ShowTplStore extends LocalEventStore {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public ShowTplStore(int i) {
        super(i);
    }

    public static /* synthetic */ Object ipc$super(ShowTplStore showTplStore, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/android/msp/drivers/stores/store/events/ShowTplStore");
    }

    @Override // com.alipay.android.msp.drivers.stores.store.LocalEventStore
    public String onMspAction(EventAction eventAction, EventAction.MspEvent mspEvent) {
        MspWindowFrameStack frameStack;
        MspWindowFrameStack frameStack2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("719dcfee", new Object[]{this, eventAction, mspEvent});
        }
        MspUIClient mspUIClient = this.mMspUIClient;
        if (mspUIClient == null || mspUIClient.getCurrentPresenter() == null || this.mMspUIClient.getCurrentPresenter().getIView() == null) {
            return null;
        }
        String[] actionParamsArray = mspEvent.getActionParamsArray();
        JSONObject actionParamsJson = mspEvent.getActionParamsJson();
        if (actionParamsJson != null) {
            StEvent stEvent = this.mStEvent;
            stEvent.onStatistic("action", MspEventTypes.ACTION_STRING_SHOWTPL + Utils.truncateString(actionParamsJson.toJSONString(), 50));
        }
        if (actionParamsArray != null && actionParamsArray.length > 0) {
            try {
                MspWindowFrame mspWindowFrame = new MspWindowFrame();
                mspWindowFrame.setStatisticEvent(this.mStEvent);
                mspWindowFrame.setTplId(actionParamsArray[0]);
                if (actionParamsArray.length > 1) {
                    mspWindowFrame.setTplString(new String(Base64.decode(actionParamsArray[1], 2)));
                }
                if (actionParamsArray.length > 2) {
                    mspWindowFrame.setTemplateContentData(JSON.parseObject(new String(Base64.decode(actionParamsArray[2], 2))));
                } else {
                    mspWindowFrame.setTemplateContentData(new JSONObject());
                }
                mspWindowFrame.setWindowType(11);
                MspUIClient mspUIClient2 = this.mMspUIClient;
                if (mspUIClient2 == null || (frameStack2 = mspUIClient2.getFrameStack()) == null) {
                    return "";
                }
                frameStack2.pushFrame(mspWindowFrame);
                return "";
            } catch (Throwable th) {
                LogUtil.printExceptionStackTrace(th);
                return "";
            }
        } else if (actionParamsJson == null) {
            return "";
        } else {
            try {
                String string = actionParamsJson.getString(MspFlybirdDefine.FLYBIRD_TEMPLATE_ID);
                String string2 = actionParamsJson.getString("tpl");
                String string3 = actionParamsJson.getString("data");
                String string4 = actionParamsJson.getString("noback");
                MspWindowFrame mspWindowFrame2 = new MspWindowFrame();
                mspWindowFrame2.setStatisticEvent(this.mStEvent);
                mspWindowFrame2.setTplId(string);
                if (!TextUtils.isEmpty(string2)) {
                    mspWindowFrame2.setTplString(new String(Base64.decode(string2, 2)));
                }
                if (!TextUtils.isEmpty(string3)) {
                    mspWindowFrame2.setTemplateContentData(JSON.parseObject(new String(Base64.decode(string3, 2))));
                } else {
                    mspWindowFrame2.setTemplateContentData(new JSONObject());
                }
                mspWindowFrame2.setNoBackTag(Integer.parseInt(string4));
                mspWindowFrame2.setWindowType(11);
                MspUIClient mspUIClient3 = this.mMspUIClient;
                if (mspUIClient3 == null || (frameStack = mspUIClient3.getFrameStack()) == null) {
                    return "";
                }
                frameStack.pushFrame(mspWindowFrame2);
                return "";
            } catch (Throwable th2) {
                LogUtil.printExceptionStackTrace(th2);
                return "";
            }
        }
    }
}
