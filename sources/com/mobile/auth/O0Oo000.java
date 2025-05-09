package com.mobile.auth;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import com.mobile.auth.gatewayauth.ExceptionProcessor;
import com.mobile.auth.gatewayauth.PnsLoggerHandler;
import com.mobile.auth.gatewayauth.model.ConfigRule;
import com.mobile.auth.gatewayauth.model.pns_vendor_query.LimitedInfo;
import com.mobile.auth.gatewayauth.model.pns_vendor_query.UploadRB;
import com.mobile.auth.gatewayauth.utils.O0000Oo0;
import com.nirvana.tools.logger.model.ACMLimitConfig;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.List;
import tb.i1;
import tb.l1;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class O0Oo000 {
    private static volatile O0Oo000 O000000o;
    private i1 O00000Oo;
    private boolean O00000o;
    private boolean O00000o0;
    private OO0O0O O00000oO;
    private HandlerThread O00000oo;
    private Handler O0000O0o;
    private volatile PnsLoggerHandler O0000OOo;
    private List<l1> O0000Oo0;

    private O0Oo000() {
        this.O00000o0 = false;
        this.O00000o = false;
        this.O00000oo = null;
        this.O0000O0o = null;
        this.O0000Oo0 = new ArrayList();
        HandlerThread handlerThread = new HandlerThread("PnsLoggerThread");
        this.O00000oo = handlerThread;
        handlerThread.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: com.mobile.auth.O0Oo000.1
            @Override // java.lang.Thread.UncaughtExceptionHandler
            public void uncaughtException(Thread thread, Throwable th) {
            }
        });
        this.O00000oo.start();
        this.O0000O0o = new Handler(this.O00000oo.getLooper());
    }

    public static O0Oo000 O000000o(Context context) {
        try {
            if (O000000o == null) {
                synchronized (O0Oo000.class) {
                    if (O000000o == null && context != null) {
                        O000000o = new O0Oo000(context);
                    }
                }
            }
            return O000000o;
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return null;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return null;
            }
        }
    }

    public static /* synthetic */ i1 O00000Oo(O0Oo000 o0Oo000) {
        try {
            return o0Oo000.O00000Oo;
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return null;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return null;
            }
        }
    }

    public static /* synthetic */ PnsLoggerHandler O00000o0(O0Oo000 o0Oo000) {
        try {
            return o0Oo000.O0000OOo;
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return null;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return null;
            }
        }
    }

    private String O00000oO(String... strArr) {
        if (strArr != null) {
            try {
                if (strArr.length != 0) {
                    if (strArr.length == 1) {
                        return strArr[0];
                    }
                    StringBuilder sb = new StringBuilder();
                    for (String str : strArr) {
                        sb.append(str);
                    }
                    return sb.toString();
                }
            } catch (Throwable th) {
                try {
                    ExceptionProcessor.processException(th);
                    return null;
                } catch (Throwable th2) {
                    ExceptionProcessor.processException(th2);
                }
            }
        }
        return null;
    }

    private static boolean O00000oo() {
        try {
            int i = i1.UPLOAD_TYPE_MANUAL;
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return false;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return false;
            }
        }
    }

    public void O00000o() {
        try {
            this.O0000O0o.post(new Runnable() { // from class: com.mobile.auth.O0Oo000.7
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        O0Oo000.this.O00000Oo("deleteMonitor:", "delete unupload Monitor");
                        if (O0Oo000.O00000Oo(O0Oo000.this) != null) {
                            O0Oo000.O00000Oo(O0Oo000.this).b(-1);
                        }
                    } catch (Throwable th) {
                        try {
                            ExceptionProcessor.processException(th);
                        } catch (Throwable th2) {
                            ExceptionProcessor.processException(th2);
                        }
                    }
                }
            });
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    public O0Oo000(final Context context) {
        this();
        this.O0000O0o.post(new Runnable() { // from class: com.mobile.auth.O0Oo000.9
            @Override // java.lang.Runnable
            public void run() {
                try {
                    O0Oo000.O00000oO();
                    OO0O0OO oo0o0oo = new OO0O0OO();
                    O0Oo000.O000000o(O0Oo000.this, new OO0O0o0());
                    O0Oo000.O000000o(O0Oo000.this).O000000o(oo0o0oo);
                    O0Oo000.O000000o(O0Oo000.this, new i1(context, O0Oo000.O000000o(O0Oo000.this)));
                    O0Oo000.O00000Oo(O0Oo000.this).i(1);
                    O0Oo000.O00000Oo(O0Oo000.this).e(1L);
                    O0Oo000.O00000Oo(O0Oo000.this).f(100);
                    O0Oo000.O00000Oo(O0Oo000.this).g(0);
                } catch (Throwable th) {
                    try {
                        ExceptionProcessor.processException(th);
                    } catch (Throwable th2) {
                        ExceptionProcessor.processException(th2);
                    }
                }
            }
        });
    }

    public static /* synthetic */ OO0O0O O000000o(O0Oo000 o0Oo000) {
        try {
            return o0Oo000.O00000oO;
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return null;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return null;
            }
        }
    }

    public static /* synthetic */ List O00000oO(O0Oo000 o0Oo000) {
        try {
            return o0Oo000.O0000Oo0;
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return null;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return null;
            }
        }
    }

    public void O00000Oo() {
        try {
            this.O0000O0o.post(new Runnable() { // from class: com.mobile.auth.O0Oo000.5
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        if (!O0Oo000.O00000o(O0Oo000.this) && O0Oo000.O00000Oo(O0Oo000.this) != null) {
                            if (O0Oo000.O00000oO(O0Oo000.this) != null && O0Oo000.O00000oO(O0Oo000.this).size() > 0) {
                                O0Oo000.O00000Oo(O0Oo000.this).c(O0Oo000.O00000oO(O0Oo000.this));
                                O0Oo000.O00000oO(O0Oo000.this).clear();
                                O0Oo000.this.O00000Oo("CacheMonitor:", "uploadFailedMonitor and clear");
                            }
                            O0Oo000.O00000Oo(O0Oo000.this).j();
                        }
                    } catch (Throwable th) {
                        try {
                            ExceptionProcessor.processException(th);
                        } catch (Throwable th2) {
                            ExceptionProcessor.processException(th2);
                        }
                    }
                }
            });
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    public void O00000o(final String... strArr) {
        try {
            this.O0000O0o.post(new Runnable() { // from class: com.mobile.auth.O0Oo000.13
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        String O000000o2 = O0Oo000.O000000o(O0Oo000.this, strArr);
                        PnsLoggerHandler O00000o0 = O0Oo000.O00000o0(O0Oo000.this);
                        if (O00000o0 != null) {
                            O00000o0.error(O000000o2);
                        }
                        O0000Oo0.O00000o0(O000000o2);
                    } catch (Throwable th) {
                        try {
                            ExceptionProcessor.processException(th);
                        } catch (Throwable th2) {
                            ExceptionProcessor.processException(th2);
                        }
                    }
                }
            });
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    public void O00000o0() {
        try {
            this.O0000O0o.post(new Runnable() { // from class: com.mobile.auth.O0Oo000.6
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        O0Oo000.this.O00000Oo("deleteMonitor:", "delete unupload Monitor");
                        if (O0Oo000.O00000Oo(O0Oo000.this) != null) {
                            O0Oo000.O00000Oo(O0Oo000.this).b(2);
                        }
                    } catch (Throwable th) {
                        try {
                            ExceptionProcessor.processException(th);
                        } catch (Throwable th2) {
                            ExceptionProcessor.processException(th2);
                        }
                    }
                }
            });
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    public static /* synthetic */ OO0O0O O000000o(O0Oo000 o0Oo000, OO0O0O oo0o0o) {
        try {
            o0Oo000.O00000oO = oo0o0o;
            return oo0o0o;
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return null;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return null;
            }
        }
    }

    public static /* synthetic */ boolean O00000o(O0Oo000 o0Oo000) {
        try {
            return o0Oo000.O00000o0;
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return false;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return false;
            }
        }
    }

    public static /* synthetic */ boolean O00000oO() {
        try {
            return O00000oo();
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return false;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return false;
            }
        }
    }

    public void O00000Oo(final String... strArr) {
        try {
            this.O0000O0o.post(new Runnable() { // from class: com.mobile.auth.O0Oo000.11
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        String O000000o2 = O0Oo000.O000000o(O0Oo000.this, strArr);
                        PnsLoggerHandler O00000o0 = O0Oo000.O00000o0(O0Oo000.this);
                        if (O00000o0 != null) {
                            O00000o0.debug(O000000o2);
                        }
                        O0000Oo0.O000000o(O000000o2);
                    } catch (Throwable th) {
                        try {
                            ExceptionProcessor.processException(th);
                        } catch (Throwable th2) {
                            ExceptionProcessor.processException(th2);
                        }
                    }
                }
            });
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    public void O00000o0(final String... strArr) {
        try {
            this.O0000O0o.post(new Runnable() { // from class: com.mobile.auth.O0Oo000.12
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        String O000000o2 = O0Oo000.O000000o(O0Oo000.this, strArr);
                        PnsLoggerHandler O00000o0 = O0Oo000.O00000o0(O0Oo000.this);
                        if (O00000o0 != null) {
                            O00000o0.warning(O000000o2);
                        }
                        O0000Oo0.O00000Oo(O000000o2);
                    } catch (Throwable th) {
                        try {
                            ExceptionProcessor.processException(th);
                        } catch (Throwable th2) {
                            ExceptionProcessor.processException(th2);
                        }
                    }
                }
            });
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    public static /* synthetic */ i1 O000000o(O0Oo000 o0Oo000, i1 i1Var) {
        try {
            o0Oo000.O00000Oo = i1Var;
            return i1Var;
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return null;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return null;
            }
        }
    }

    public static /* synthetic */ boolean O00000Oo(O0Oo000 o0Oo000, boolean z) {
        try {
            o0Oo000.O00000o0 = z;
            return z;
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return false;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return false;
            }
        }
    }

    public static /* synthetic */ String O000000o(O0Oo000 o0Oo000, String[] strArr) {
        try {
            return o0Oo000.O00000oO(strArr);
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return null;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return null;
            }
        }
    }

    public static /* synthetic */ List O000000o(O0Oo000 o0Oo000, List list) {
        try {
            o0Oo000.O0000Oo0 = list;
            return list;
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return null;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return null;
            }
        }
    }

    public void O000000o() {
        try {
            this.O0000O0o.post(new Runnable() { // from class: com.mobile.auth.O0Oo000.4
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        if (!O0Oo000.O00000o(O0Oo000.this) && O0Oo000.O00000Oo(O0Oo000.this) != null) {
                            if (O0Oo000.O00000oO(O0Oo000.this) != null && O0Oo000.O00000oO(O0Oo000.this).size() > 0) {
                                O0Oo000.O00000Oo(O0Oo000.this).c(O0Oo000.O00000oO(O0Oo000.this));
                                O0Oo000.O00000oO(O0Oo000.this).clear();
                                O0Oo000.this.O00000Oo("CacheMonitor:", "uploadMonitor and clear");
                            }
                            O0Oo000.O00000Oo(O0Oo000.this).k();
                        }
                    } catch (Throwable th) {
                        try {
                            ExceptionProcessor.processException(th);
                        } catch (Throwable th2) {
                            ExceptionProcessor.processException(th2);
                        }
                    }
                }
            });
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    public void O000000o(PnsLoggerHandler pnsLoggerHandler) {
        try {
            this.O0000OOo = pnsLoggerHandler;
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    public void O000000o(final ConfigRule configRule) {
        try {
            this.O0000O0o.post(new Runnable() { // from class: com.mobile.auth.O0Oo000.3
                /* JADX WARN: Removed duplicated region for block: B:44:0x00ea A[Catch: all -> 0x0062, TryCatch #0 {all -> 0x0062, blocks: (B:3:0x0003, B:5:0x0007, B:8:0x000f, B:10:0x004c, B:12:0x0059, B:13:0x005d, B:16:0x0065, B:18:0x006b, B:21:0x0072, B:23:0x007f, B:24:0x0086, B:25:0x008a, B:27:0x0090, B:29:0x00a2, B:31:0x00a8, B:32:0x00ad, B:34:0x00b9, B:36:0x00bf, B:38:0x00c7, B:39:0x00cf, B:41:0x00dc, B:42:0x00e2, B:44:0x00ea, B:46:0x00f6, B:49:0x0103, B:50:0x0109, B:51:0x010e, B:53:0x0116, B:54:0x0120, B:55:0x0129), top: B:61:0x0003 }] */
                /* JADX WARN: Removed duplicated region for block: B:53:0x0116 A[Catch: all -> 0x0062, TryCatch #0 {all -> 0x0062, blocks: (B:3:0x0003, B:5:0x0007, B:8:0x000f, B:10:0x004c, B:12:0x0059, B:13:0x005d, B:16:0x0065, B:18:0x006b, B:21:0x0072, B:23:0x007f, B:24:0x0086, B:25:0x008a, B:27:0x0090, B:29:0x00a2, B:31:0x00a8, B:32:0x00ad, B:34:0x00b9, B:36:0x00bf, B:38:0x00c7, B:39:0x00cf, B:41:0x00dc, B:42:0x00e2, B:44:0x00ea, B:46:0x00f6, B:49:0x0103, B:50:0x0109, B:51:0x010e, B:53:0x0116, B:54:0x0120, B:55:0x0129), top: B:61:0x0003 }] */
                /* JADX WARN: Removed duplicated region for block: B:54:0x0120 A[Catch: all -> 0x0062, TryCatch #0 {all -> 0x0062, blocks: (B:3:0x0003, B:5:0x0007, B:8:0x000f, B:10:0x004c, B:12:0x0059, B:13:0x005d, B:16:0x0065, B:18:0x006b, B:21:0x0072, B:23:0x007f, B:24:0x0086, B:25:0x008a, B:27:0x0090, B:29:0x00a2, B:31:0x00a8, B:32:0x00ad, B:34:0x00b9, B:36:0x00bf, B:38:0x00c7, B:39:0x00cf, B:41:0x00dc, B:42:0x00e2, B:44:0x00ea, B:46:0x00f6, B:49:0x0103, B:50:0x0109, B:51:0x010e, B:53:0x0116, B:54:0x0120, B:55:0x0129), top: B:61:0x0003 }] */
                /* JADX WARN: Removed duplicated region for block: B:75:? A[RETURN, SYNTHETIC] */
                @Override // java.lang.Runnable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public void run() {
                    /*
                        Method dump skipped, instructions count: 317
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.mobile.auth.O0Oo000.AnonymousClass3.run():void");
                }
            });
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    public void O000000o(final UploadRB uploadRB) {
        try {
            this.O0000O0o.post(new Runnable() { // from class: com.mobile.auth.O0Oo000.2
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        UploadRB uploadRB2 = uploadRB;
                        if (uploadRB2 != null && uploadRB2.getAlibaba_aliqin_psc_info_upload_response() != null && uploadRB.getAlibaba_aliqin_psc_info_upload_response().getResult() != null && uploadRB.getAlibaba_aliqin_psc_info_upload_response().getResult().getModule() != null && uploadRB.getAlibaba_aliqin_psc_info_upload_response().getResult().getModule().getLimited_info() != null && O0Oo000.O00000Oo(O0Oo000.this) != null) {
                            LimitedInfo limited_info = uploadRB.getAlibaba_aliqin_psc_info_upload_response().getResult().getModule().getLimited_info();
                            ACMLimitConfig.b newACMLimitConfig = ACMLimitConfig.newACMLimitConfig();
                            newACMLimitConfig.e("true".equals(limited_info.getIs_limited()));
                            newACMLimitConfig.f(limited_info.getLimit_count());
                            newACMLimitConfig.g(limited_info.getLimit_time_hour());
                            O0Oo000.O00000Oo(O0Oo000.this).d(newACMLimitConfig.d());
                        }
                    } catch (Throwable th) {
                        try {
                            ExceptionProcessor.processException(th);
                        } catch (Throwable th2) {
                            ExceptionProcessor.processException(th2);
                        }
                    }
                }
            });
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    public void O000000o(final String str, final int i) {
        try {
            this.O0000O0o.post(new Runnable() { // from class: com.mobile.auth.O0Oo000.8
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        PnsLoggerHandler O00000o0 = O0Oo000.O00000o0(O0Oo000.this);
                        if (O00000o0 != null) {
                            O00000o0.monitor(str);
                        }
                        O0Oo000.this.O00000Oo("CacheMonitor:", str, "\n Urgency ", String.valueOf(i));
                        if (!O0Oo000.O00000o(O0Oo000.this) && O0Oo000.O00000Oo(O0Oo000.this) != null) {
                            if (O0Oo000.O00000oO(O0Oo000.this) == null) {
                                O0Oo000.O000000o(O0Oo000.this, new ArrayList());
                            }
                            l1 l1Var = new l1(i);
                            l1Var.g(str);
                            O0Oo000.O00000oO(O0Oo000.this).add(l1Var);
                            if (O0Oo000.O00000oO(O0Oo000.this).size() >= 5) {
                                O0Oo000.O00000Oo(O0Oo000.this).c(O0Oo000.O00000oO(O0Oo000.this));
                                O0Oo000.O00000oO(O0Oo000.this).clear();
                            }
                        }
                    } catch (Throwable th) {
                        try {
                            ExceptionProcessor.processException(th);
                        } catch (Throwable th2) {
                            ExceptionProcessor.processException(th2);
                        }
                    }
                }
            });
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    public void O000000o(final String... strArr) {
        try {
            this.O0000O0o.post(new Runnable() { // from class: com.mobile.auth.O0Oo000.10
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        String O000000o2 = O0Oo000.O000000o(O0Oo000.this, strArr);
                        PnsLoggerHandler O00000o0 = O0Oo000.O00000o0(O0Oo000.this);
                        if (O00000o0 != null) {
                            O00000o0.info(O000000o2);
                        }
                        O0000Oo0.O00000o(O000000o2);
                    } catch (Throwable th) {
                        try {
                            ExceptionProcessor.processException(th);
                        } catch (Throwable th2) {
                            ExceptionProcessor.processException(th2);
                        }
                    }
                }
            });
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
            }
        }
    }

    public static /* synthetic */ boolean O000000o(O0Oo000 o0Oo000, boolean z) {
        try {
            o0Oo000.O00000o = z;
            return z;
        } catch (Throwable th) {
            try {
                ExceptionProcessor.processException(th);
                return false;
            } catch (Throwable th2) {
                ExceptionProcessor.processException(th2);
                return false;
            }
        }
    }
}
