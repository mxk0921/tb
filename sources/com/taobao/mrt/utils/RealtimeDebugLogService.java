package com.taobao.mrt.utils;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.mrt.mtop.DataSender;
import com.taobao.mrt.service.LogService;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tlog.adapter.AdapterForTLog;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopResponse;
import tb.k4j;
import tb.m09;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class RealtimeDebugLogService implements LogService {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final k4j b = new k4j("mtop.taobao.daidebug.insertlog", "1.0", false, false, null, Map.class, MethodEnum.POST);
    public static final SimpleDateFormat c = new SimpleDateFormat("MM-dd HH:mm:ss.SSS");
    public static final BlockingQueue<b> d = new LinkedBlockingQueue();
    public static final AtomicBoolean e = new AtomicBoolean(false);

    /* renamed from: a  reason: collision with root package name */
    public String f11142a = null;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f11143a;

        public a(String str) {
            this.f11143a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                RealtimeDebugLogService.a(RealtimeDebugLogService.this);
            } catch (Exception e) {
                AdapterForTLog.loge(this.f11143a, e.getMessage(), e);
            }
            RealtimeDebugLogService.b().set(false);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public String f11144a;
        public String b;
        public String c;

        static {
            t2o.a(577765450);
        }

        public b() {
        }

        public /* synthetic */ b(a aVar) {
            this();
        }
    }

    public static /* synthetic */ void a(RealtimeDebugLogService realtimeDebugLogService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ee4977f", new Object[]{realtimeDebugLogService});
        } else {
            realtimeDebugLogService.c();
        }
    }

    public static /* synthetic */ AtomicBoolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AtomicBoolean) ipChange.ipc$dispatch("ba126bf9", new Object[0]);
        }
        return e;
    }

    public final synchronized void c() {
        boolean z = true;
        synchronized (this) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2fcbdf46", new Object[]{this});
                return;
            }
            try {
                StringBuilder sb = new StringBuilder();
                String str = null;
                String str2 = null;
                while (z) {
                    b bVar = (b) ((LinkedBlockingQueue) d).poll(2L, TimeUnit.SECONDS);
                    if (bVar == null) {
                        z = false;
                    } else if (!TextUtils.equals(str2, bVar.f11144a) || !TextUtils.equals(str, bVar.b)) {
                        if (sb.length() > 0) {
                            f(str, str2, sb.toString());
                            sb.delete(0, sb.length());
                        }
                        String str3 = bVar.f11144a;
                        String str4 = bVar.b;
                        sb.append(bVar.c);
                        str2 = str3;
                        str = str4;
                    } else {
                        if (sb.length() > 0) {
                            sb.append("\n");
                        }
                        sb.append(bVar.c);
                        if (sb.length() > 2000) {
                            f(bVar.b, bVar.f11144a, sb.toString());
                            sb.delete(0, sb.length());
                        }
                    }
                }
                if (sb.length() > 0) {
                    f(str, str2, sb.toString());
                }
            } catch (InterruptedException unused) {
            }
        }
    }

    public void d(LogService.LogSource logSource, LogService.LogLevel logLevel, String str, String str2, Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a365375b", new Object[]{this, logSource, logLevel, str, str2, th});
        } else {
            e(logSource, logLevel, str, str2, th);
        }
    }

    public final void f(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46c64ec1", new Object[]{this, str, str2, str3});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("debugId", this.f11142a);
        hashMap.put("type", str2);
        hashMap.put(m09.TASK_TYPE_LEVEL, str);
        hashMap.put("content", str3);
        DataSender.a().b(b, hashMap, new IRemoteBaseListener() { // from class: com.taobao.mrt.utils.RealtimeDebugLogService.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                } else {
                    new StringBuilder("onError, response=").append(mtopResponse);
                }
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                } else {
                    new StringBuilder("onSuccess, response=").append(mtopResponse);
                }
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
            public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                } else {
                    new StringBuilder("onSystemError, response=").append(mtopResponse);
                }
            }
        });
    }

    public void g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("648aa560", new Object[]{this, str});
        } else {
            this.f11142a = str;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00a4 A[Catch: all -> 0x0064, TryCatch #0 {all -> 0x0064, blocks: (B:6:0x0023, B:9:0x0050, B:12:0x0055, B:14:0x0059, B:17:0x0067, B:19:0x006b, B:20:0x0075, B:22:0x0079, B:23:0x0082, B:25:0x0086, B:26:0x0090, B:27:0x0096, B:28:0x009b, B:30:0x00a4, B:31:0x00aa, B:33:0x00ae, B:34:0x00b4, B:35:0x00b9, B:37:0x00c1, B:38:0x00cd, B:40:0x00e6), top: B:43:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00aa A[Catch: all -> 0x0064, TryCatch #0 {all -> 0x0064, blocks: (B:6:0x0023, B:9:0x0050, B:12:0x0055, B:14:0x0059, B:17:0x0067, B:19:0x006b, B:20:0x0075, B:22:0x0079, B:23:0x0082, B:25:0x0086, B:26:0x0090, B:27:0x0096, B:28:0x009b, B:30:0x00a4, B:31:0x00aa, B:33:0x00ae, B:34:0x00b4, B:35:0x00b9, B:37:0x00c1, B:38:0x00cd, B:40:0x00e6), top: B:43:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c1 A[Catch: all -> 0x0064, TryCatch #0 {all -> 0x0064, blocks: (B:6:0x0023, B:9:0x0050, B:12:0x0055, B:14:0x0059, B:17:0x0067, B:19:0x006b, B:20:0x0075, B:22:0x0079, B:23:0x0082, B:25:0x0086, B:26:0x0090, B:27:0x0096, B:28:0x009b, B:30:0x00a4, B:31:0x00aa, B:33:0x00ae, B:34:0x00b4, B:35:0x00b9, B:37:0x00c1, B:38:0x00cd, B:40:0x00e6), top: B:43:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e6 A[Catch: all -> 0x0064, TRY_LEAVE, TryCatch #0 {all -> 0x0064, blocks: (B:6:0x0023, B:9:0x0050, B:12:0x0055, B:14:0x0059, B:17:0x0067, B:19:0x006b, B:20:0x0075, B:22:0x0079, B:23:0x0082, B:25:0x0086, B:26:0x0090, B:27:0x0096, B:28:0x009b, B:30:0x00a4, B:31:0x00aa, B:33:0x00ae, B:34:0x00b4, B:35:0x00b9, B:37:0x00c1, B:38:0x00cd, B:40:0x00e6), top: B:43:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(com.taobao.mrt.service.LogService.LogSource r9, com.taobao.mrt.service.LogService.LogLevel r10, java.lang.String r11, java.lang.String r12, java.lang.Throwable r13) {
        /*
            Method dump skipped, instructions count: 251
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.mrt.utils.RealtimeDebugLogService.e(com.taobao.mrt.service.LogService$LogSource, com.taobao.mrt.service.LogService$LogLevel, java.lang.String, java.lang.String, java.lang.Throwable):void");
    }

    static {
        t2o.a(577765447);
        t2o.a(577765403);
    }
}
