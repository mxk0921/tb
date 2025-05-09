package com.taobao.analysis.flow;

import android.text.TextUtils;
import anet.channel.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.analysis.stat.PageFlowStatistic;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import tb.rp9;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class PageFlowReport {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static volatile PageFlowReport b;

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, rp9> f6225a = new LinkedHashMap<String, rp9>(21, 0.75f, false) { // from class: com.taobao.analysis.flow.PageFlowReport.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/analysis/flow/PageFlowReport$1");
        }

        @Override // java.util.LinkedHashMap
        public boolean removeEldestEntry(Map.Entry<String, rp9> entry) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("6471a6cf", new Object[]{this, entry})).booleanValue();
            }
            if (size() > 20) {
                return true;
            }
            return false;
        }
    };

    public PageFlowReport() {
        AppMonitor.getInstance().register(PageFlowStatistic.class);
    }

    public static PageFlowReport b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PageFlowReport) ipChange.ipc$dispatch("97816871", new Object[0]);
        }
        if (b == null) {
            synchronized (PageFlowReport.class) {
                try {
                    if (b == null) {
                        b = new PageFlowReport();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return b;
    }

    public synchronized void a(String str, long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b0a3585", new Object[]{this, str, new Long(j), new Long(j2)});
            return;
        }
        if (!TextUtils.isEmpty(str) && !(j == 0 && j2 == 0)) {
            rp9 rp9Var = (rp9) ((LinkedHashMap) this.f6225a).get(str);
            if (rp9Var == null) {
                rp9Var = new rp9();
                ((HashMap) this.f6225a).put(str, rp9Var);
            }
            rp9Var.h++;
            rp9Var.f += j;
            rp9Var.g += j2;
        }
    }

    public synchronized void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99140e56", new Object[]{this});
            return;
        }
        for (Map.Entry entry : ((LinkedHashMap) this.f6225a).entrySet()) {
            rp9 rp9Var = (rp9) entry.getValue();
            if (rp9Var != null) {
                long j = rp9Var.i / 1000;
                long j2 = rp9Var.f;
                long j3 = rp9Var.g;
                if (!(j == 0 || (j2 == 0 && j3 == 0))) {
                    AppMonitor.getInstance().commitStat(new PageFlowStatistic((String) entry.getKey(), j2, j3, rp9Var.h, j));
                }
            }
        }
        ((LinkedHashMap) this.f6225a).clear();
    }

    public synchronized void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2100541", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str)) {
            rp9 rp9Var = (rp9) ((LinkedHashMap) this.f6225a).get(str);
            if (rp9Var == null) {
                rp9Var = new rp9();
                ((HashMap) this.f6225a).put(str, rp9Var);
            }
            rp9Var.j = System.currentTimeMillis();
        }
    }

    public synchronized void e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e61d860b", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str)) {
            rp9 rp9Var = (rp9) ((LinkedHashMap) this.f6225a).get(str);
            if (rp9Var != null) {
                if (rp9Var.j != 0) {
                    rp9Var.i += System.currentTimeMillis() - rp9Var.j;
                }
                rp9Var.j = 0L;
            }
        }
    }
}
