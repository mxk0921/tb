package com.huawei.hms.framework.network.grs;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.alipay.mobile.common.transport.utils.HeaderConstant;
import com.huawei.hms.framework.common.ExecutorsUtils;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.StringUtils;
import com.huawei.hms.framework.network.grs.f.b;
import com.huawei.hms.framework.network.grs.g.g;
import com.huawei.hms.framework.network.grs.g.h;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class c {
    private static final String i = "c";
    private static final ExecutorService j = ExecutorsUtils.newSingleThreadExecutor("GRS_GrsClient-Init");
    private static long k = 0;

    /* renamed from: a  reason: collision with root package name */
    private GrsBaseInfo f5335a;
    private Context b;
    private g c;
    private com.huawei.hms.framework.network.grs.e.a d;
    private com.huawei.hms.framework.network.grs.e.c e;
    private com.huawei.hms.framework.network.grs.e.c f;
    private com.huawei.hms.framework.network.grs.a g;
    private FutureTask<Boolean> h;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements Callable<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f5336a;
        final /* synthetic */ GrsBaseInfo b;

        public a(Context context, GrsBaseInfo grsBaseInfo) {
            this.f5336a = context;
            this.b = grsBaseInfo;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.concurrent.Callable
        public Boolean call() {
            c.this.c = new g();
            c cVar = c.this;
            Context context = this.f5336a;
            cVar.e = new com.huawei.hms.framework.network.grs.e.c(context, GrsApp.getInstance().getBrand("_") + "share_pre_grs_conf_");
            c cVar2 = c.this;
            Context context2 = this.f5336a;
            cVar2.f = new com.huawei.hms.framework.network.grs.e.c(context2, GrsApp.getInstance().getBrand("_") + "share_pre_grs_services_");
            c cVar3 = c.this;
            cVar3.d = new com.huawei.hms.framework.network.grs.e.a(cVar3.e, c.this.f, c.this.c);
            c cVar4 = c.this;
            cVar4.g = new com.huawei.hms.framework.network.grs.a(cVar4.f5335a, c.this.d, c.this.c, c.this.f);
            if (b.a(this.f5336a.getPackageName()) == null) {
                new b(this.f5336a, true);
            }
            String c = new com.huawei.hms.framework.network.grs.g.j.c(this.b, this.f5336a).c();
            String str = c.i;
            Logger.v(str, "scan serviceSet is: " + c);
            String a2 = c.this.f.a("services", "");
            String a3 = h.a(a2, c);
            if (!TextUtils.isEmpty(a3)) {
                c.this.f.b("services", a3);
                String str2 = c.i;
                Logger.i(str2, "postList is:" + StringUtils.anonymizeMessage(a3));
                String str3 = c.i;
                Logger.i(str3, "currentServices:" + StringUtils.anonymizeMessage(a2));
                if (!a3.equals(a2)) {
                    c.this.c.a(c.this.f5335a.getGrsParasKey(true, true, this.f5336a));
                    c.this.c.a(new com.huawei.hms.framework.network.grs.g.j.c(this.b, this.f5336a), null, null, c.this.f, c.this.f5335a.getQueryTimeout());
                }
            }
            long elapsedRealtime = SystemClock.elapsedRealtime() - c.k;
            if (c.k == 0 || TimeUnit.MILLISECONDS.toHours(elapsedRealtime) > 24) {
                Logger.i(c.i, "Try to clear unUsed sp data.");
                long unused = c.k = SystemClock.elapsedRealtime();
                c cVar5 = c.this;
                cVar5.a(cVar5.e.a());
            }
            c.this.d.b(this.b, this.f5336a);
            return Boolean.TRUE;
        }
    }

    public c(Context context, GrsBaseInfo grsBaseInfo) {
        this.h = null;
        this.b = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        a(grsBaseInfo);
        GrsBaseInfo grsBaseInfo2 = this.f5335a;
        FutureTask<Boolean> futureTask = new FutureTask<>(new a(this.b, grsBaseInfo2));
        this.h = futureTask;
        j.execute(futureTask);
        Logger.i(i, "GrsClient Instance is init, GRS SDK version: %s, GrsBaseInfoParam: app_name=%s, reg_country=%s, ser_country=%s, issue_country=%s ,queryTimeout=%d", com.huawei.hms.framework.network.grs.h.a.a(), grsBaseInfo2.getAppName(), grsBaseInfo.getRegCountry(), grsBaseInfo.getSerCountry(), grsBaseInfo.getIssueCountry(), Integer.valueOf(grsBaseInfo.getQueryTimeout()));
    }

    public c(GrsBaseInfo grsBaseInfo) {
        this.h = null;
        a(grsBaseInfo);
    }

    private boolean e() {
        String str;
        String str2;
        Throwable e;
        FutureTask<Boolean> futureTask = this.h;
        if (futureTask == null) {
            return false;
        }
        try {
            return futureTask.get(8L, TimeUnit.SECONDS).booleanValue();
        } catch (InterruptedException e2) {
            e = e2;
            str2 = i;
            str = "init compute task interrupted.";
            Logger.w(str2, str, e);
            return false;
        } catch (CancellationException unused) {
            Logger.i(i, "init compute task canceled.");
            return false;
        } catch (ExecutionException e3) {
            e = e3;
            str2 = i;
            str = "init compute task failed.";
            Logger.w(str2, str, e);
            return false;
        } catch (TimeoutException unused2) {
            Logger.w(i, "init compute task timed out");
            return false;
        } catch (Exception e4) {
            e = e4;
            str2 = i;
            str = "init compute task occur unknown Exception";
            Logger.w(str2, str, e);
            return false;
        }
    }

    public boolean b() {
        GrsBaseInfo grsBaseInfo;
        Context context;
        if (!e() || (grsBaseInfo = this.f5335a) == null || (context = this.b) == null) {
            return false;
        }
        this.d.a(grsBaseInfo, context);
        return true;
    }

    private boolean b(long j2) {
        return System.currentTimeMillis() - j2 <= 604800000;
    }

    public String a(String str, String str2, int i2) {
        if (this.f5335a == null || str == null || str2 == null) {
            Logger.w(i, "invalid para!");
            return null;
        } else if (e()) {
            return this.g.a(str, str2, this.b, i2);
        } else {
            return null;
        }
    }

    public Map<String, String> a(String str, int i2) {
        if (this.f5335a != null && str != null) {
            return e() ? this.g.a(str, this.b, i2) : new HashMap();
        }
        Logger.w(i, "invalid para!");
        return new HashMap();
    }

    public void a() {
        if (e()) {
            String grsParasKey = this.f5335a.getGrsParasKey(true, true, this.b);
            this.e.a(grsParasKey);
            com.huawei.hms.framework.network.grs.e.c cVar = this.e;
            cVar.a(grsParasKey + "time");
            com.huawei.hms.framework.network.grs.e.c cVar2 = this.e;
            cVar2.a(grsParasKey + HeaderConstant.HEADER_KEY_ETAG);
            this.c.a(grsParasKey);
        }
    }

    private void a(GrsBaseInfo grsBaseInfo) {
        try {
            this.f5335a = grsBaseInfo.clone();
        } catch (CloneNotSupportedException e) {
            Logger.w(i, "GrsClient catch CloneNotSupportedException", e);
            this.f5335a = grsBaseInfo.copy();
        }
    }

    public void a(String str, IQueryUrlsCallBack iQueryUrlsCallBack, int i2) {
        if (iQueryUrlsCallBack == null) {
            Logger.w(i, "IQueryUrlsCallBack is must not null for process continue.");
        } else if (this.f5335a == null || str == null) {
            iQueryUrlsCallBack.onCallBackFail(-6);
        } else if (e()) {
            this.g.a(str, iQueryUrlsCallBack, this.b, i2);
        } else {
            Logger.i(i, "grs init task has not completed.");
            iQueryUrlsCallBack.onCallBackFail(-7);
        }
    }

    public void a(String str, String str2, IQueryUrlCallBack iQueryUrlCallBack, int i2) {
        if (iQueryUrlCallBack == null) {
            Logger.w(i, "IQueryUrlCallBack is must not null for process continue.");
        } else if (this.f5335a == null || str == null || str2 == null) {
            iQueryUrlCallBack.onCallBackFail(-6);
        } else if (e()) {
            this.g.a(str, str2, iQueryUrlCallBack, this.b, i2);
        } else {
            Logger.i(i, "grs init task has not completed.");
            iQueryUrlCallBack.onCallBackFail(-7);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Map<String, ?> map) {
        if (map == null || map.isEmpty()) {
            Logger.v(i, "sp's content is empty.");
            return;
        }
        Set<String> keySet = map.keySet();
        for (String str : keySet) {
            if (str.endsWith(this.b.getPackageName() + "time")) {
                String a2 = this.e.a(str, "");
                long j2 = 0;
                if (!TextUtils.isEmpty(a2) && a2.matches("\\d+")) {
                    try {
                        j2 = Long.parseLong(a2);
                    } catch (NumberFormatException e) {
                        Logger.w(i, "convert expire time from String to Long catch NumberFormatException.", e);
                    }
                }
                String substring = str.substring(0, str.length() - 4);
                String str2 = substring + HeaderConstant.HEADER_KEY_ETAG;
                if (!b(j2) || !keySet.contains(substring) || !keySet.contains(str2)) {
                    Logger.i(i, "init interface auto clear some invalid sp's data: ".concat(str));
                    this.e.a(substring);
                    this.e.a(str);
                    this.e.a(str2);
                }
            }
        }
    }

    public boolean a(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass() || !(obj instanceof c)) {
            return false;
        }
        return this.f5335a.compare(((c) obj).f5335a);
    }
}
