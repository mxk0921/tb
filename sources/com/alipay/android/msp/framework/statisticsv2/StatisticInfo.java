package com.alipay.android.msp.framework.statisticsv2;

import android.os.SystemClock;
import android.text.TextUtils;
import com.alipay.android.msp.core.AlertIntelligenceEngine;
import com.alipay.android.msp.core.context.MspContext;
import com.alipay.android.msp.core.context.MspContextManager;
import com.alipay.android.msp.framework.statisticsv2.mechanism.PersistStorage;
import com.alipay.android.msp.framework.statisticsv2.model.StEvent;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorType;
import com.alipay.android.msp.utils.LogUtil;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class StatisticInfo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final Recorder b;
    public final StatisticAgent c;
    public File d;
    public final int f;
    public final PersistStorage.IUpdateCallback e = new PersistStorage.IUpdateCallback() { // from class: com.alipay.android.msp.framework.statisticsv2.StatisticInfo.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.alipay.android.msp.framework.statisticsv2.mechanism.PersistStorage.IUpdateCallback
        public File getFile() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (File) ipChange.ipc$dispatch("88881834", new Object[]{this});
            }
            return StatisticInfo.access$000(StatisticInfo.this);
        }

        @Override // com.alipay.android.msp.framework.statisticsv2.mechanism.PersistStorage.IUpdateCallback
        public void setFile(File file) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d99eb73c", new Object[]{this, file});
            } else {
                StatisticInfo.access$002(StatisticInfo.this, file);
            }
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public final long f3664a = SystemClock.elapsedRealtime();

    static {
        PersistStorage.init();
    }

    public StatisticInfo(int i) {
        try {
            PersistStorage.asyncUploadPreviousRecords();
            this.b = new Recorder(i);
            this.c = new StatisticAgent(i);
            this.f = i;
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
        }
    }

    public static /* synthetic */ File access$000(StatisticInfo statisticInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("b7ac263e", new Object[]{statisticInfo});
        }
        return statisticInfo.d;
    }

    public static /* synthetic */ File access$002(StatisticInfo statisticInfo, File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (File) ipChange.ipc$dispatch("735ec569", new Object[]{statisticInfo, file});
        }
        statisticInfo.d = file;
        return file;
    }

    public void addError(String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f49d433", new Object[]{this, str, str2, th});
            return;
        }
        try {
            this.b.addError(str, str2, th);
            MspContext mspContextByBizId = MspContextManager.getInstance().getMspContextByBizId(this.f);
            if (mspContextByBizId != null) {
                AlertIntelligenceEngine.startAction(mspContextByBizId, "err", str + "_" + str2, null, null);
            }
        } catch (Throwable unused) {
            LogUtil.printExceptionStackTrace(th);
        }
    }

    public void addEvent(StEvent stEvent) {
        Map<String, String> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6cba92f1", new Object[]{this, stEvent});
            return;
        }
        try {
            this.b.addEvent(stEvent);
            MspContext mspContextByBizId = MspContextManager.getInstance().getMspContextByBizId(this.f);
            if (mspContextByBizId != null && stEvent != null && AlertIntelligenceEngine.getInstance().byLogicContext() && (map = stEvent.toMap()) != null) {
                AlertIntelligenceEngine.startAction(mspContextByBizId, "event", map.get("actionType"), map.get("action"), map.get(StEvent.CURRENT_VIEW), null);
            }
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
        }
    }

    public void addPerf(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f4539cf", new Object[]{this, str, str2, str3});
        }
    }

    public String getAttr(Vector vector, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("36342cff", new Object[]{this, vector, str});
        }
        String str2 = Grammar.ATTR_DEFAULT_VALUE;
        try {
            return this.b.getAttr(vector, str);
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
            return str2;
        }
    }

    public String getRecordFormat() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("59daab9b", new Object[]{this});
        }
        return this.b.format();
    }

    public StatisticAgent getStatisticAgent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (StatisticAgent) ipChange.ipc$dispatch("58c7567b", new Object[]{this});
        }
        return this.c;
    }

    public void onStatisticEnd() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21bde071", new Object[]{this});
            return;
        }
        try {
            this.c.addExternalInfo(this.b);
            this.b.submit();
            PersistStorage.asyncDelete(this.e);
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
        }
    }

    public boolean persistCheck(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("19979856", new Object[]{this, file})).booleanValue();
        }
        File file2 = this.d;
        if (file2 == null || file == null || !TextUtils.equals(file2.getAbsolutePath(), file.getAbsolutePath())) {
            return false;
        }
        return true;
    }

    public void persistDelete() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("634d99a6", new Object[]{this});
            return;
        }
        try {
            PersistStorage.asyncDelete(this.e);
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
        }
    }

    public void persistSave() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9db14978", new Object[]{this});
            return;
        }
        try {
            PersistStorage.asyncSave(this.b, this.e);
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
        }
    }

    public void updateAttr(Vector vector, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d00571fe", new Object[]{this, vector, str, str2});
            return;
        }
        try {
            this.b.updateAttr(vector, str, str2);
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
        }
    }

    public void updateBiz(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3abe5c54", new Object[]{this, map});
            return;
        }
        try {
            this.b.updateBiz(map);
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
        }
    }

    public void updateResult(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6be67661", new Object[]{this, str, str2});
            return;
        }
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            LogUtil.record(2, "StatisticInfo#updateResult", TextUtils.isEmpty(str) ? "null" : str);
            this.b.updateResult(str, str2, this.f3664a);
            long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
            LogUtil.record(2, "StatisticInfo#updateResult", "passTime:".concat(String.valueOf(elapsedRealtime2)));
            if (elapsedRealtime2 > 500) {
                this.b.addError(ErrorType.WARNING, "EndCodeRex", String.valueOf(elapsedRealtime2));
            }
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
        }
    }

    public void addError(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4e3624c", new Object[]{this, str, str2, str3});
            return;
        }
        try {
            this.b.addError(str, str2, str3);
            MspContext mspContextByBizId = MspContextManager.getInstance().getMspContextByBizId(this.f);
            if (mspContextByBizId != null) {
                AlertIntelligenceEngine.startAction(mspContextByBizId, "err", str + "_" + str2, str3, null, null);
            }
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
        }
    }
}
