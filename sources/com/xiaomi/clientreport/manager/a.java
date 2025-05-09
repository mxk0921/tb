package com.xiaomi.clientreport.manager;

import android.content.Context;
import com.ali.user.open.ucc.UccResultCode;
import com.xiaomi.channel.commonutils.logger.b;
import com.xiaomi.clientreport.data.Config;
import com.xiaomi.clientreport.data.EventClientReport;
import com.xiaomi.clientreport.data.PerfClientReport;
import com.xiaomi.clientreport.processor.IEventProcessor;
import com.xiaomi.clientreport.processor.IPerfProcessor;
import com.xiaomi.push.ah;
import com.xiaomi.push.bm;
import com.xiaomi.push.bn;
import com.xiaomi.push.bo;
import com.xiaomi.push.bp;
import com.xiaomi.push.bq;
import com.xiaomi.push.bt;
import com.xiaomi.push.j;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private static final int f14682a;

    /* renamed from: a  reason: collision with other field name */
    private static volatile a f640a;

    /* renamed from: a  reason: collision with other field name */
    private Context f641a;

    /* renamed from: a  reason: collision with other field name */
    private Config f642a;

    /* renamed from: a  reason: collision with other field name */
    private IEventProcessor f643a;

    /* renamed from: a  reason: collision with other field name */
    private IPerfProcessor f644a;

    /* renamed from: a  reason: collision with other field name */
    private String f645a;

    /* renamed from: a  reason: collision with other field name */
    private ExecutorService f647a = Executors.newSingleThreadExecutor();

    /* renamed from: a  reason: collision with other field name */
    private HashMap<String, HashMap<String, com.xiaomi.clientreport.data.a>> f646a = new HashMap<>();
    private HashMap<String, ArrayList<com.xiaomi.clientreport.data.a>> b = new HashMap<>();

    static {
        int i;
        if (j.m868a()) {
            i = 30;
        } else {
            i = 10;
        }
        f14682a = i;
    }

    private a(Context context) {
        this.f641a = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int a() {
        HashMap<String, ArrayList<com.xiaomi.clientreport.data.a>> hashMap = this.b;
        if (hashMap == null) {
            return 0;
        }
        int i = 0;
        for (String str : hashMap.keySet()) {
            ArrayList<com.xiaomi.clientreport.data.a> arrayList = this.b.get(str);
            i += arrayList != null ? arrayList.size() : 0;
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int b() {
        HashMap<String, HashMap<String, com.xiaomi.clientreport.data.a>> hashMap = this.f646a;
        int i = 0;
        if (hashMap != null) {
            for (String str : hashMap.keySet()) {
                HashMap<String, com.xiaomi.clientreport.data.a> hashMap2 = this.f646a.get(str);
                if (hashMap2 != null) {
                    for (String str2 : hashMap2.keySet()) {
                        com.xiaomi.clientreport.data.a aVar = hashMap2.get(str2);
                        if (aVar instanceof PerfClientReport) {
                            i = (int) (i + ((PerfClientReport) aVar).perfCounts);
                        }
                    }
                }
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        try {
            this.f643a.b();
        } catch (Exception e) {
            b.d("we: " + e.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        try {
            this.f644a.b();
        } catch (Exception e) {
            b.d("wp: " + e.getMessage());
        }
    }

    private void f() {
        if (a(this.f641a).m417a().isEventUploadSwitchOpen()) {
            bn bnVar = new bn(this.f641a);
            int eventUploadFrequency = (int) a(this.f641a).m417a().getEventUploadFrequency();
            if (eventUploadFrequency < 1800) {
                eventUploadFrequency = UccResultCode.NO_ACTION_BIND_FAILED;
            }
            if (System.currentTimeMillis() - bt.a(this.f641a).a("sp_client_report_status", "event_last_upload_time", 0L) > eventUploadFrequency * 1000) {
                ah.a(this.f641a).a(new h(this, bnVar), 10);
            }
            synchronized (a.class) {
                try {
                    if (!ah.a(this.f641a).a((ah.a) bnVar, eventUploadFrequency)) {
                        ah.a(this.f641a).m483a("100886");
                        ah.a(this.f641a).a((ah.a) bnVar, eventUploadFrequency);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    private void g() {
        if (a(this.f641a).m417a().isPerfUploadSwitchOpen()) {
            bo boVar = new bo(this.f641a);
            int perfUploadFrequency = (int) a(this.f641a).m417a().getPerfUploadFrequency();
            if (perfUploadFrequency < 1800) {
                perfUploadFrequency = UccResultCode.NO_ACTION_BIND_FAILED;
            }
            if (System.currentTimeMillis() - bt.a(this.f641a).a("sp_client_report_status", "perf_last_upload_time", 0L) > perfUploadFrequency * 1000) {
                ah.a(this.f641a).a(new i(this, boVar), 15);
            }
            synchronized (a.class) {
                try {
                    if (!ah.a(this.f641a).a((ah.a) boVar, perfUploadFrequency)) {
                        ah.a(this.f641a).m483a("100887");
                        ah.a(this.f641a).a((ah.a) boVar, perfUploadFrequency);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public void c() {
        if (m417a().isPerfUploadSwitchOpen()) {
            bp bpVar = new bp();
            bpVar.a(this.f644a);
            bpVar.a(this.f641a);
            this.f647a.execute(bpVar);
        }
    }

    /* renamed from: a  reason: collision with other method in class */
    public synchronized Config m417a() {
        try {
            if (this.f642a == null) {
                this.f642a = Config.defaultConfig(this.f641a);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f642a;
    }

    /* renamed from: b  reason: collision with other method in class */
    public void m419b() {
        if (m417a().isEventUploadSwitchOpen()) {
            bp bpVar = new bp();
            bpVar.a(this.f641a);
            bpVar.a(this.f643a);
            this.f647a.execute(bpVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(EventClientReport eventClientReport) {
        IEventProcessor iEventProcessor = this.f643a;
        if (iEventProcessor != null) {
            iEventProcessor.mo420a(eventClientReport);
            if (a() >= 10) {
                d();
                ah.a(this.f641a).m483a("100888");
                return;
            }
            a(new d(this), f14682a);
        }
    }

    public EventClientReport a(int i, String str) {
        EventClientReport eventClientReport = new EventClientReport();
        eventClientReport.eventContent = str;
        eventClientReport.eventTime = System.currentTimeMillis();
        eventClientReport.eventType = i;
        eventClientReport.eventId = bm.a(6);
        eventClientReport.production = 1000;
        eventClientReport.reportType = 1001;
        eventClientReport.clientInterfaceId = "E100004";
        eventClientReport.setAppPackageName(this.f641a.getPackageName());
        eventClientReport.setSdkVersion(this.f645a);
        return eventClientReport;
    }

    public static a a(Context context) {
        if (f640a == null) {
            synchronized (a.class) {
                try {
                    if (f640a == null) {
                        f640a = new a(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f640a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(PerfClientReport perfClientReport) {
        IPerfProcessor iPerfProcessor = this.f644a;
        if (iPerfProcessor != null) {
            iPerfProcessor.mo420a(perfClientReport);
            if (b() >= 10) {
                e();
                ah.a(this.f641a).m483a("100889");
                return;
            }
            a(new f(this), f14682a);
        }
    }

    /* renamed from: a  reason: collision with other method in class */
    public void m418a() {
        a(this.f641a).f();
        a(this.f641a).g();
    }

    public void a(Config config, IEventProcessor iEventProcessor, IPerfProcessor iPerfProcessor) {
        this.f642a = config;
        this.f643a = iEventProcessor;
        this.f644a = iPerfProcessor;
        iEventProcessor.setEventMap(this.b);
        this.f644a.setPerfMap(this.f646a);
    }

    public void a(EventClientReport eventClientReport) {
        if (m417a().isEventUploadSwitchOpen()) {
            this.f647a.execute(new b(this, eventClientReport));
        }
    }

    public void a(PerfClientReport perfClientReport) {
        if (m417a().isPerfUploadSwitchOpen()) {
            this.f647a.execute(new c(this, perfClientReport));
        }
    }

    private void a(ah.a aVar, int i) {
        ah.a(this.f641a).b(aVar, i);
    }

    public void a(String str) {
        this.f645a = str;
    }

    public void a(boolean z, boolean z2, long j, long j2) {
        Config config = this.f642a;
        if (config == null) {
            return;
        }
        if (z != config.isEventUploadSwitchOpen() || z2 != this.f642a.isPerfUploadSwitchOpen() || j != this.f642a.getEventUploadFrequency() || j2 != this.f642a.getPerfUploadFrequency()) {
            long eventUploadFrequency = this.f642a.getEventUploadFrequency();
            long perfUploadFrequency = this.f642a.getPerfUploadFrequency();
            Config build = Config.getBuilder().setAESKey(bq.a(this.f641a)).setEventEncrypted(this.f642a.isEventEncrypted()).setEventUploadSwitchOpen(z).setEventUploadFrequency(j).setPerfUploadSwitchOpen(z2).setPerfUploadFrequency(j2).build(this.f641a);
            this.f642a = build;
            if (!build.isEventUploadSwitchOpen()) {
                ah.a(this.f641a).m483a("100886");
            } else if (eventUploadFrequency != build.getEventUploadFrequency()) {
                b.c(this.f641a.getPackageName() + "reset event job " + build.getEventUploadFrequency());
                f();
            }
            if (!this.f642a.isPerfUploadSwitchOpen()) {
                ah.a(this.f641a).m483a("100887");
            } else if (perfUploadFrequency != build.getPerfUploadFrequency()) {
                b.c(this.f641a.getPackageName() + " reset perf job " + build.getPerfUploadFrequency());
                g();
            }
        }
    }
}
