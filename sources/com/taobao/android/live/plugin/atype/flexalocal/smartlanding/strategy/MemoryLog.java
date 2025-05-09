package com.taobao.android.live.plugin.atype.flexalocal.smartlanding.strategy;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.smartlanding.business.SmartLandingTask;
import java.io.Serializable;
import java.util.HashMap;
import tb.nib;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class MemoryLog implements nib {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f8660a;
    public final HashMap<String, LogItem> b = new HashMap<>();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class LogItem implements Serializable {
        public int times = 0;
        public long interval = 0;

        static {
            t2o.a(295699739);
        }
    }

    static {
        t2o.a(295699738);
        t2o.a(295699737);
    }

    public MemoryLog(String str) {
        this.f8660a = str;
    }

    @Override // tb.nib
    public void a(SmartLandingTask smartLandingTask) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ad84512", new Object[]{this, smartLandingTask});
        } else if (smartLandingTask != null) {
            String identificationId = smartLandingTask.getIdentificationId(this.f8660a);
            LogItem logItem = this.b.get(identificationId);
            if (logItem == null) {
                logItem = new LogItem();
                this.b.put(identificationId, logItem);
            }
            logItem.times++;
            logItem.interval = System.currentTimeMillis();
            f(smartLandingTask, logItem);
        }
    }

    @Override // tb.nib
    public void b(SmartLandingTask smartLandingTask) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bffd653b", new Object[]{this, smartLandingTask});
        } else if (smartLandingTask != null) {
            String identificationId = smartLandingTask.getIdentificationId(this.f8660a);
            LogItem logItem = this.b.get(identificationId);
            if (logItem == null) {
                logItem = new LogItem();
                this.b.put(identificationId, logItem);
            }
            f(smartLandingTask, logItem);
        }
    }

    @Override // tb.nib
    public boolean c(SmartLandingTask smartLandingTask) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4740343a", new Object[]{this, smartLandingTask})).booleanValue();
        }
        if (smartLandingTask != null) {
            String identificationId = smartLandingTask.getIdentificationId(this.f8660a);
            LogItem logItem = this.b.get(identificationId);
            long currentTimeMillis = System.currentTimeMillis();
            if (logItem == null) {
                logItem = new LogItem();
                this.b.put(identificationId, logItem);
            }
            SmartLandingTask.ShowStrategy showStrategy = smartLandingTask.showStrategy;
            if (showStrategy != null) {
                return d(showStrategy, logItem, currentTimeMillis);
            }
        }
        return false;
    }

    public boolean d(SmartLandingTask.ShowStrategy showStrategy, LogItem logItem, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("24b36bc", new Object[]{this, showStrategy, logItem, new Long(j)})).booleanValue();
        }
        if (showStrategy.interval * 1000 <= j - logItem.interval) {
            return true;
        }
        return false;
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8aded33c", new Object[]{this});
        } else {
            this.b.clear();
        }
    }

    public final void f(SmartLandingTask smartLandingTask, LogItem logItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("960cd10d", new Object[]{this, smartLandingTask, logItem});
        } else if (smartLandingTask != null && smartLandingTask.showStrategy != null && logItem != null) {
            String identificationId = smartLandingTask.getIdentificationId(this.f8660a);
            SmartLandingTask.ShowStrategy showStrategy = smartLandingTask.showStrategy;
            int i = showStrategy.times;
            if (-1 == i) {
                showStrategy.updateShow(identificationId, true);
            } else if (i > logItem.times) {
                showStrategy.updateShow(identificationId, true);
            } else {
                showStrategy.updateShow(identificationId, false);
            }
        }
    }
}
