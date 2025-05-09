package com.alipay.android.msp.core.context;

import android.content.Context;
import android.os.Binder;
import android.text.TextUtils;
import com.alipay.android.app.IRemoteServiceCallback;
import com.alipay.android.app.safepaylogv2.api.StatisticCollector;
import com.alipay.android.msp.core.AlertIntelligenceEngine;
import com.alipay.android.msp.core.context.MspTradeContext;
import com.alipay.android.msp.framework.db.MspDbManager;
import com.alipay.android.msp.framework.drm.DrmKey;
import com.alipay.android.msp.framework.drm.FastStartActivityHelper;
import com.alipay.android.msp.framework.helper.GlobalHelper;
import com.alipay.android.msp.framework.statisticsv2.StatisticInfo;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorType;
import com.alipay.android.msp.framework.taskscheduler.MonitorRunnable;
import com.alipay.android.msp.framework.taskscheduler.TaskHelper;
import com.alipay.android.msp.pay.CashierSceneDictionary;
import com.alipay.android.msp.pay.callback.IAlipayCallback;
import com.alipay.android.msp.pay.callback.PayProgressCallback;
import com.alipay.android.msp.plugin.manager.PhoneCashierMspEngine;
import com.alipay.android.msp.utils.LogUtil;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class MspContextManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static volatile MspContextManager f;
    public static volatile long lastContextRemoveTime;
    public final Map<Integer, MspContext> e;

    /* renamed from: a  reason: collision with root package name */
    public final Map<Integer, Integer> f3549a = new ConcurrentHashMap();
    public final Map<Integer, IRemoteServiceCallback> c = new ConcurrentHashMap();
    public final Map<Integer, IAlipayCallback> d = new ConcurrentHashMap();
    public final Map<String, PayProgressCallback> b = new ConcurrentHashMap();

    public MspContextManager() {
        PhoneCashierMspEngine.getMspWallet().registerCutPoint();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.e = Collections.synchronizedMap(linkedHashMap);
    }

    public static /* synthetic */ Map access$000(MspContextManager mspContextManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("f701b00b", new Object[]{mspContextManager});
        }
        return mspContextManager.e;
    }

    public static MspContextManager getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MspContextManager) ipChange.ipc$dispatch("15204ef", new Object[0]);
        }
        if (f == null) {
            synchronized (MspContextManager.class) {
                try {
                    if (f == null) {
                        f = new MspContextManager();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f;
    }

    public void addRawBizId(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eafd67ee", new Object[]{this, new Integer(i), new Integer(i2)});
        } else {
            ((ConcurrentHashMap) this.f3549a).put(Integer.valueOf(i), Integer.valueOf(i2));
        }
    }

    public synchronized void clearAllTradeContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1bde22e6", new Object[]{this});
            return;
        }
        for (Integer num : this.e.keySet()) {
            num.intValue();
            MspContext mspContext = this.e.get(num);
            if (mspContext instanceof MspTradeContext) {
                mspContext.exit(0);
            }
        }
    }

    public synchronized void clearFingerPayTask(MspContext mspContext, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49d0f49e", new Object[]{this, mspContext, str});
            return;
        }
        for (Integer num : this.e.keySet()) {
            num.intValue();
            MspContext mspContext2 = this.e.get(num);
            if (mspContext2 instanceof MspTradeContext) {
                MspTradeContext mspTradeContext = (MspTradeContext) mspContext2;
                if (mspContext.getBizId() != mspTradeContext.getBizId() && mspTradeContext.isFingerPay()) {
                    String orderInfo = ((MspTradeContext) mspContext2).getOrderInfo();
                    CashierSceneDictionary.MspSchemePayContext mspSchemePayContext = CashierSceneDictionary.getInstance().getMspSchemePayContext(orderInfo);
                    if (mspSchemePayContext != null && !TextUtils.equals(str, orderInfo)) {
                        mspSchemePayContext.isExitByPay = true;
                    }
                    mspTradeContext.exit(0);
                }
            }
        }
    }

    public IAlipayCallback getAlipayCallbackByCallingPid(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IAlipayCallback) ipChange.ipc$dispatch("d7d8c6aa", new Object[]{this, new Integer(i), new Integer(i2)});
        }
        if (((ConcurrentHashMap) this.d).containsKey(Integer.valueOf(i))) {
            return (IAlipayCallback) ((ConcurrentHashMap) this.d).get(Integer.valueOf(i));
        }
        if (((ConcurrentHashMap) this.d).containsKey(Integer.valueOf(i2))) {
            return (IAlipayCallback) ((ConcurrentHashMap) this.d).get(Integer.valueOf(i2));
        }
        return null;
    }

    public int getBizIdByRaw(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2217eb96", new Object[]{this, new Integer(i)})).intValue();
        }
        if (((ConcurrentHashMap) this.f3549a).containsKey(Integer.valueOf(i))) {
            return ((Integer) ((ConcurrentHashMap) this.f3549a).get(Integer.valueOf(i))).intValue();
        }
        return -1;
    }

    public int getLatestBizId() {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9f55850b", new Object[]{this})).intValue();
        }
        for (Integer num : this.e.keySet()) {
            i = num.intValue();
        }
        LogUtil.record(1, "getLatestBizId", "getLatestBizId = ".concat(String.valueOf(i)));
        return i;
    }

    public MspContext getMspContextByBizId(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MspContext) ipChange.ipc$dispatch("8fe4276c", new Object[]{this, new Integer(i)});
        }
        if (this.e.containsKey(Integer.valueOf(i))) {
            return this.e.get(Integer.valueOf(i));
        }
        return null;
    }

    public Map<Integer, MspContext> getMspContextMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("944558dd", new Object[]{this});
        }
        return this.e;
    }

    public int getPayContextSum() {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c3c952a8", new Object[]{this})).intValue();
        }
        for (Integer num : this.e.keySet()) {
            num.intValue();
            MspContext mspContext = this.e.get(num);
            if ((mspContext instanceof MspTradeContext) && ((MspTradeContext) mspContext).getCurSubContext() == MspTradeContext.SubTradeContext.pay) {
                i++;
            }
        }
        return i;
    }

    public PayProgressCallback getPayProgressCallback(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PayProgressCallback) ipChange.ipc$dispatch("3e98b333", new Object[]{this, str});
        }
        if (((ConcurrentHashMap) this.b).containsKey(str)) {
            return (PayProgressCallback) ((ConcurrentHashMap) this.b).get(str);
        }
        return null;
    }

    public IRemoteServiceCallback getRemoteCallbackById(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IRemoteServiceCallback) ipChange.ipc$dispatch("f87a23db", new Object[]{this, new Integer(i), new Integer(i2)});
        }
        if (((ConcurrentHashMap) this.c).containsKey(Integer.valueOf(i))) {
            return (IRemoteServiceCallback) ((ConcurrentHashMap) this.c).get(Integer.valueOf(i));
        }
        return (IRemoteServiceCallback) ((ConcurrentHashMap) this.c).get(Integer.valueOf(i2));
    }

    public MspContainerContext getRenderContextByBizId(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MspContainerContext) ipChange.ipc$dispatch("f8aab9d5", new Object[]{this, new Integer(i)});
        }
        MspContext mspContextByBizId = getMspContextByBizId(i);
        if (mspContextByBizId instanceof MspContainerContext) {
            return (MspContainerContext) mspContextByBizId;
        }
        return null;
    }

    public MspTradeContext getTradeContextByBizId(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MspTradeContext) ipChange.ipc$dispatch("bd716256", new Object[]{this, new Integer(i)});
        }
        MspContext mspContextByBizId = getMspContextByBizId(i);
        if (mspContextByBizId instanceof MspTradeContext) {
            return (MspTradeContext) mspContextByBizId;
        }
        return null;
    }

    public MspTradeContext getTradeContextByOrderInfo(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MspTradeContext) ipChange.ipc$dispatch("44ea2f05", new Object[]{this, str});
        }
        for (Integer num : this.e.keySet()) {
            num.intValue();
            MspContext mspContext = this.e.get(num);
            if (mspContext instanceof MspTradeContext) {
                MspTradeContext mspTradeContext = (MspTradeContext) mspContext;
                if (TextUtils.equals(str, mspTradeContext.getOrderInfo())) {
                    return mspTradeContext;
                }
            }
        }
        return null;
    }

    public MspTradeContext getTradeContextByPid(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MspTradeContext) ipChange.ipc$dispatch("e49c36f9", new Object[]{this, new Integer(i)});
        }
        for (Integer num : this.e.keySet()) {
            num.intValue();
            MspContext mspContext = this.e.get(num);
            if ((mspContext instanceof MspTradeContext) && mspContext.getCallingPid() == i) {
                return (MspTradeContext) mspContext;
            }
        }
        return null;
    }

    public int getTradeContextSum() {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("688cefe4", new Object[]{this})).intValue();
        }
        for (Integer num : this.e.keySet()) {
            num.intValue();
            if (this.e.get(num) instanceof MspTradeContext) {
                i++;
            }
        }
        return i;
    }

    public void registerCallback(IAlipayCallback iAlipayCallback, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94b12d4b", new Object[]{this, iAlipayCallback, str});
        } else if (str != null) {
            ((ConcurrentHashMap) this.d).put(Integer.valueOf(str.hashCode()), iAlipayCallback);
        } else {
            ((ConcurrentHashMap) this.d).put(Integer.valueOf(Binder.getCallingPid()), iAlipayCallback);
        }
    }

    public void removeRawBizId(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6771eab2", new Object[]{this, new Integer(i)});
        } else {
            ((ConcurrentHashMap) this.f3549a).remove(Integer.valueOf(i));
        }
    }

    public void removeRemoteCallback(IRemoteServiceCallback iRemoteServiceCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2ba439b", new Object[]{this, iRemoteServiceCallback});
        } else if (iRemoteServiceCallback != null && ((ConcurrentHashMap) this.c).containsValue(iRemoteServiceCallback)) {
            for (Map.Entry entry : ((ConcurrentHashMap) this.c).entrySet()) {
                if (entry.getValue() == iRemoteServiceCallback) {
                    LogUtil.record(4, "MspContextManager", "removeRemoteCallback", "entry.getValue():" + entry.getValue());
                    ((ConcurrentHashMap) this.c).remove(entry.getKey());
                }
            }
        }
    }

    public void unregisterAlipayCallback(IAlipayCallback iAlipayCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8176b1e", new Object[]{this, iAlipayCallback});
        } else if (iAlipayCallback != null && ((ConcurrentHashMap) this.d).containsValue(iAlipayCallback)) {
            for (Map.Entry entry : ((ConcurrentHashMap) this.d).entrySet()) {
                if (entry.getValue() == iAlipayCallback) {
                    LogUtil.record(4, "MspContextManager", "removeRemoteCallback", "entry.getValue():" + entry.getValue());
                    ((ConcurrentHashMap) this.d).remove(entry.getKey());
                }
            }
        }
    }

    public void removeMspContextByBizId(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9882574e", new Object[]{this, new Integer(i)});
            return;
        }
        LogUtil.record(2, "MspContextManager:removeMspContextByBizId", "bizId:" + i + " ,size=" + this.e.size());
        MspContext remove = this.e.remove(Integer.valueOf(i));
        if (remove != null && this.e.size() == 0) {
            StatisticCollector.setOnErrorListener(null);
            MonitorRunnable monitorRunnable = new MonitorRunnable(new Runnable() { // from class: com.alipay.android.msp.core.context.MspContextManager.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (MspContextManager.access$000(MspContextManager.this).size() == 0) {
                        MspDbManager.getDbManager().closeDBHelper();
                    }
                }
            }, 15000L);
            Context context = GlobalHelper.getInstance().getContext();
            if (context == null || !FastStartActivityHelper.getBoolConfig(context, DrmKey.GRAY_DELAY_THREAD_RUNNABLE)) {
                TaskHelper.execute(monitorRunnable, 15000L);
            } else {
                TaskHelper.getInstance().executeDelayed(monitorRunnable, 15000L, TaskHelper.ThreadName.UI_CONTEXT);
            }
            PhoneCashierMspEngine.getMspWallet().unRegisterAppBgListener(remove.getContext());
        }
    }

    public void removePayProgressCallback(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7cab1547", new Object[]{this, str});
            return;
        }
        LogUtil.record(2, "MspContextManager:removePayProgressCallback", "order:".concat(String.valueOf(str)));
        if (!TextUtils.isEmpty(str)) {
            ((ConcurrentHashMap) this.b).remove(str);
        }
    }

    public void setPayProgressCallback(String str, PayProgressCallback payProgressCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54342bc5", new Object[]{this, str, payProgressCallback});
            return;
        }
        LogUtil.record(2, "MspContextManager:setPayProgressCallback", "order:" + str + " ，cb=" + payProgressCallback);
        if (!TextUtils.isEmpty(str)) {
            ((ConcurrentHashMap) this.b).put(str, payProgressCallback);
        }
    }

    public void addMspContext(int i, MspContext mspContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b674a4c", new Object[]{this, new Integer(i), mspContext});
            return;
        }
        LogUtil.record(2, "MspContextManager:addMspContext", "bizId:" + i + " ctx=" + mspContext + " ,size=" + this.e.size());
        if (i != 0) {
            this.e.put(Integer.valueOf(i), mspContext);
        }
        if (this.e.size() >= 4) {
            StatisticInfo statisticInfo = mspContext.getStatisticInfo();
            statisticInfo.addError(ErrorType.WARNING, "MspContextTooMuch", i + "-" + this.e.size());
        }
        if (this.e.size() == 1) {
            StatisticCollector.setOnErrorListener(new StatisticCollector.OnAddErrorListener() { // from class: com.alipay.android.msp.core.context.MspContextManager.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.alipay.android.app.safepaylogv2.api.StatisticCollector.OnAddErrorListener
                public void onAddError(String str, String str2, String str3, String str4) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("a5803595", new Object[]{this, str, str2, str3, str4});
                    } else {
                        AlertIntelligenceEngine.onAddGlobalError(str, str2);
                    }
                }
            });
            PhoneCashierMspEngine.getMspWallet().registerAppBgListener(mspContext.getContext());
        }
    }

    public void registerRemoteCallbackByOrderInfo(IRemoteServiceCallback iRemoteServiceCallback, String str) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47a5847d", new Object[]{this, iRemoteServiceCallback, str});
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(Binder.getCallingPid());
        sb.append(" , order is null ? ");
        if (str == null) {
            z = true;
        }
        sb.append(z);
        LogUtil.record(1, "MspContextManager", "registerRemoteCallbackByOrderInfo", sb.toString());
        if (str != null) {
            ((ConcurrentHashMap) this.c).put(Integer.valueOf(str.hashCode()), iRemoteServiceCallback);
        } else {
            ((ConcurrentHashMap) this.c).put(Integer.valueOf(Binder.getCallingPid()), iRemoteServiceCallback);
        }
    }
}
