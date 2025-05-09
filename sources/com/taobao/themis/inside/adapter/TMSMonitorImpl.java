package com.taobao.themis.inside.adapter;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alibaba.mtl.appmonitor.model.Dimension;
import com.alibaba.mtl.appmonitor.model.DimensionSet;
import com.alibaba.mtl.appmonitor.model.DimensionValueSet;
import com.alibaba.mtl.appmonitor.model.Measure;
import com.alibaba.mtl.appmonitor.model.MeasureSet;
import com.alibaba.mtl.appmonitor.model.MeasureValueSet;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.adapter.IMonitorAdapter;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.executor.ExecutorType;
import com.taobao.themis.kernel.executor.IExecutorService;
import java.util.concurrent.CopyOnWriteArrayList;
import tb.p8s;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class TMSMonitorImpl implements IMonitorAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final CopyOnWriteArrayList<String> f13544a = new CopyOnWriteArrayList<>();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f13545a;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;
        public final /* synthetic */ String d;
        public final /* synthetic */ String e;
        public final /* synthetic */ String f;

        public a(boolean z, String str, String str2, String str3, String str4, String str5) {
            this.f13545a = z;
            this.b = str;
            this.c = str2;
            this.d = str3;
            this.e = str4;
            this.f = str5;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                if (this.f13545a) {
                    AppMonitor.Alarm.commitSuccess(this.b, this.c, this.d);
                } else {
                    AppMonitor.Alarm.commitFail(this.b, this.c, this.d, this.e, this.f);
                }
            } catch (Throwable th) {
                TMSLogger.c("TMSMonitorImpl", "", th);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ JSONObject f13546a;
        public final /* synthetic */ JSONObject b;
        public final /* synthetic */ String c;
        public final /* synthetic */ String d;

        public b(JSONObject jSONObject, JSONObject jSONObject2, String str, String str2) {
            this.f13546a = jSONObject;
            this.b = jSONObject2;
            this.c = str;
            this.d = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                JSONObject jSONObject = this.f13546a;
                if (!(jSONObject == null || jSONObject.size() < 1 || this.b == null)) {
                    DimensionSet create = DimensionSet.create();
                    DimensionValueSet create2 = DimensionValueSet.create();
                    for (String str : this.f13546a.keySet()) {
                        create.addDimension(new Dimension(str));
                        create2.setValue(str, this.f13546a.getString(str));
                    }
                    MeasureSet create3 = MeasureSet.create();
                    MeasureValueSet create4 = MeasureValueSet.create();
                    for (String str2 : this.b.keySet()) {
                        create3.addMeasure(new Measure(str2));
                        create4.setValue(str2, this.b.getDoubleValue(str2));
                    }
                    String str3 = this.c + "_" + this.d;
                    if (!TMSMonitorImpl.access$000(TMSMonitorImpl.this).contains(str3)) {
                        AppMonitor.register(this.c, this.d, create3, create, true);
                        TMSMonitorImpl.access$000(TMSMonitorImpl.this).add(str3);
                    }
                    AppMonitor.Stat.commit(this.c, this.d, create2, create4);
                }
            } catch (Throwable th) {
                TMSLogger.c("TMSMonitorImpl", "", th);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f13547a;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;
        public final /* synthetic */ int d;

        public c(String str, String str2, String str3, int i) {
            this.f13547a = str;
            this.b = str2;
            this.c = str3;
            this.d = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                AppMonitor.Counter.commit(this.f13547a, this.b, this.c, this.d);
            } catch (Throwable th) {
                TMSLogger.c("TMSMonitorImpl", "", th);
            }
        }
    }

    static {
        t2o.a(837812298);
        t2o.a(839909475);
    }

    public static /* synthetic */ CopyOnWriteArrayList access$000(TMSMonitorImpl tMSMonitorImpl) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CopyOnWriteArrayList) ipChange.ipc$dispatch("a4ca8cda", new Object[]{tMSMonitorImpl});
        }
        return tMSMonitorImpl.f13544a;
    }

    @Override // com.taobao.themis.kernel.adapter.IMonitorAdapter
    public void trackAlarm(boolean z, String str, String str2, String str3, String str4, String str5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a3bf059", new Object[]{this, new Boolean(z), str, str2, str3, str4, str5});
        } else {
            ((IExecutorService) p8s.b(IExecutorService.class)).getExecutor(ExecutorType.IDLE).execute(new a(z, str, str2, str5, str3, str4));
        }
    }

    @Override // com.taobao.themis.kernel.adapter.IMonitorAdapter
    public void trackCounter(String str, String str2, int i, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79fec741", new Object[]{this, str, str2, new Integer(i), str3});
        } else {
            ((IExecutorService) p8s.b(IExecutorService.class)).getExecutor(ExecutorType.IDLE).execute(new c(str, str2, str3, i));
        }
    }

    @Override // com.taobao.themis.kernel.adapter.IMonitorAdapter
    public void trackStat(String str, String str2, JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a50b04da", new Object[]{this, str, str2, jSONObject, jSONObject2});
        } else {
            ((IExecutorService) p8s.b(IExecutorService.class)).getExecutor(ExecutorType.IDLE).execute(new b(jSONObject, jSONObject2, str, str2));
        }
    }
}
