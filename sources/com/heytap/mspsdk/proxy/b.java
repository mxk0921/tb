package com.heytap.mspsdk.proxy;

import android.os.Bundle;
import com.heytap.msp.b;
import java.lang.reflect.InvocationHandler;
import java.util.concurrent.ConcurrentHashMap;
import tb.rwx;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class b<T> {

    /* renamed from: a  reason: collision with root package name */
    public final ConcurrentHashMap f5213a = new ConcurrentHashMap();
    public final Object b = new Object();
    public volatile Bundle c = new Bundle();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final b f5214a = new b();

        static {
            t2o.a(253755435);
        }
    }

    static {
        t2o.a(253755434);
    }

    public b() {
        this.c.putInt("msp_sdk_version_code", 2001018);
        this.c.putString("msp_sdk_verison_name", "2.0.101.8");
        this.c.putString("msp_sdk_calling_pkg", rwx.f().a().getPackageName());
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0048 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ boolean a(com.heytap.mspsdk.proxy.b r4, android.content.Context r5, android.util.Pair r6) {
        /*
            java.lang.String r5 = "ApiProxy"
            r4.getClass()
            r4 = 0
            r0 = 0
            java.lang.String r1 = "com.heytap.mspsdk.guide.MspCoreInstaller"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: Exception -> 0x0037
            java.lang.String r2 = "getInstance"
            java.lang.Class[] r3 = new java.lang.Class[r0]     // Catch: Exception -> 0x002d
            java.lang.reflect.Method r2 = r1.getMethod(r2, r3)     // Catch: Exception -> 0x002d
            java.lang.Object[] r3 = new java.lang.Object[r0]     // Catch: Exception -> 0x002d
            java.lang.Object r2 = r2.invoke(r1, r3)     // Catch: Exception -> 0x002d
            boolean r3 = r2 instanceof tb.ysx     // Catch: Exception -> 0x002d
            if (r3 == 0) goto L_0x0030
            tb.ysx r2 = (tb.ysx) r2     // Catch: Exception -> 0x002d
            tb.rwx r3 = tb.rwx.f()     // Catch: Exception -> 0x002d
            if (r3 == 0) goto L_0x002f
            android.content.Context r4 = tb.rwx.b     // Catch: Exception -> 0x002d
            r2.a(r4, r6)     // Catch: Exception -> 0x002d
            goto L_0x0040
        L_0x002d:
            r4 = move-exception
            goto L_0x003a
        L_0x002f:
            throw r4     // Catch: Exception -> 0x002d
        L_0x0030:
            java.lang.String r4 = "object is not IMspCoreInstaller"
            tb.c3j.b(r5, r4)     // Catch: Exception -> 0x002d
            goto L_0x0040
        L_0x0037:
            r6 = move-exception
            r1 = r4
            r4 = r6
        L_0x003a:
            r4.printStackTrace()
            tb.c3j.c(r5, r4)
        L_0x0040:
            if (r1 != 0) goto L_0x0048
            java.lang.String r4 = "MspCoreInstaller dos not exist"
            tb.c3j.b(r5, r4)
            goto L_0x0049
        L_0x0048:
            r0 = 1
        L_0x0049:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.heytap.mspsdk.proxy.b.a(com.heytap.mspsdk.proxy.b, android.content.Context, android.util.Pair):boolean");
    }

    /* compiled from: Taobao */
    /* renamed from: com.heytap.mspsdk.proxy.b$b  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class C0264b<T> implements InvocationHandler {

        /* renamed from: a  reason: collision with root package name */
        public final T f5215a;

        /* compiled from: Taobao */
        /* renamed from: com.heytap.mspsdk.proxy.b$b$a */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
        public class a extends b.a {
            static {
                t2o.a(253755437);
            }

            public a() {
            }
        }

        /* compiled from: Taobao */
        /* renamed from: com.heytap.mspsdk.proxy.b$b$b  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
        public class RunnableC0265b implements Runnable {
            static {
                t2o.a(253755438);
            }

            public RunnableC0265b() {
            }

            /* JADX WARN: Removed duplicated region for block: B:19:0x009b A[Catch: Exception -> 0x009f, TryCatch #0 {Exception -> 0x009f, blocks: (B:17:0x0093, B:19:0x009b, B:22:0x00a1, B:24:0x00ac, B:25:0x00b2), top: B:28:0x0093 }] */
            /* JADX WARN: Removed duplicated region for block: B:22:0x00a1 A[Catch: Exception -> 0x009f, TryCatch #0 {Exception -> 0x009f, blocks: (B:17:0x0093, B:19:0x009b, B:22:0x00a1, B:24:0x00ac, B:25:0x00b2), top: B:28:0x0093 }] */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public void run() {
                /*
                    r8 = this;
                    java.lang.String r0 = "target_service_intent, "
                    java.lang.String r1 = "target_authority, "
                    com.heytap.mspsdk.proxy.b$b r2 = com.heytap.mspsdk.proxy.b.C0264b.this
                    com.heytap.mspsdk.proxy.b r3 = com.heytap.mspsdk.proxy.b.this
                    r3.getClass()
                    android.content.Intent r4 = new android.content.Intent
                    java.lang.String r5 = "com.heytap.msp.action.CORE"
                    r4.<init>(r5)
                    com.heytap.mspsdk.proxy.a r5 = new com.heytap.mspsdk.proxy.a
                    r6 = 0
                    r5.<init>(r3, r6)
                    android.os.Parcel r3 = android.os.Parcel.obtain()
                    r7 = 0
                    r5.writeToParcel(r3, r7)
                    r3.setDataPosition(r7)
                    android.os.Parcelable$Creator r5 = android.os.ResultReceiver.CREATOR
                    java.lang.Object r5 = r5.createFromParcel(r3)
                    android.os.ResultReceiver r5 = (android.os.ResultReceiver) r5
                    r3.recycle()
                    java.lang.String r3 = "msp_result_receiver"
                    r4.putExtra(r3, r5)
                    T r2 = r2.f5215a
                    boolean r3 = r2 instanceof tb.vyx
                    java.lang.String r5 = "ApiProxy"
                    if (r3 == 0) goto L_0x0068
                    tb.vyx r2 = (tb.vyx) r2
                    java.lang.String r0 = r2.i     // Catch: BridgeExecuteException -> 0x004e
                    boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: BridgeExecuteException -> 0x004e
                    if (r0 == 0) goto L_0x0050
                    android.content.Context r0 = r2.f16066a     // Catch: BridgeExecuteException -> 0x004e
                    r2.h(r0)     // Catch: BridgeExecuteException -> 0x004e
                    goto L_0x0050
                L_0x004e:
                    r0 = move-exception
                    goto L_0x008d
                L_0x0050:
                    java.lang.String r0 = r2.i     // Catch: BridgeExecuteException -> 0x004e
                    java.lang.String r2 = "target_authority"
                    r4.putExtra(r2, r0)     // Catch: BridgeExecuteException -> 0x004e
                    java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: BridgeExecuteException -> 0x004e
                    r2.<init>(r1)     // Catch: BridgeExecuteException -> 0x004e
                    r2.append(r0)     // Catch: BridgeExecuteException -> 0x004e
                    java.lang.String r0 = r2.toString()     // Catch: BridgeExecuteException -> 0x004e
                    tb.c3j.f(r5, r0)     // Catch: BridgeExecuteException -> 0x004e
                    goto L_0x0093
                L_0x0068:
                    boolean r1 = r2 instanceof tb.s3y
                    if (r1 == 0) goto L_0x0093
                    tb.s3y r2 = (tb.s3y) r2
                    android.content.Intent r1 = r2.j()     // Catch: Exception -> 0x008c
                    java.lang.String r2 = "target_service_intent"
                    r4.putExtra(r2, r1)     // Catch: Exception -> 0x008c
                    java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: Exception -> 0x008c
                    r2.<init>(r0)     // Catch: Exception -> 0x008c
                    java.lang.String r0 = r1.toUri(r7)     // Catch: Exception -> 0x008c
                    r2.append(r0)     // Catch: Exception -> 0x008c
                    java.lang.String r0 = r2.toString()     // Catch: Exception -> 0x008c
                    tb.c3j.f(r5, r0)     // Catch: Exception -> 0x008c
                    goto L_0x0093
                L_0x008c:
                    r0 = move-exception
                L_0x008d:
                    r0.printStackTrace()
                    tb.c3j.c(r5, r0)
                L_0x0093:
                    tb.vsx r0 = tb.vsx.a.f30236a     // Catch: Exception -> 0x009f
                    android.app.Activity r0 = r0.a()     // Catch: Exception -> 0x009f
                    if (r0 == 0) goto L_0x00a1
                    r0.startActivity(r4)     // Catch: Exception -> 0x009f
                    goto L_0x00b6
                L_0x009f:
                    r0 = move-exception
                    goto L_0x00b3
                L_0x00a1:
                    r0 = 276824064(0x10800000, float:5.0487098E-29)
                    r4.addFlags(r0)     // Catch: Exception -> 0x009f
                    tb.rwx r0 = tb.rwx.f()     // Catch: Exception -> 0x009f
                    if (r0 == 0) goto L_0x00b2
                    android.content.Context r0 = tb.rwx.b     // Catch: Exception -> 0x009f
                    r0.startActivity(r4)     // Catch: Exception -> 0x009f
                    goto L_0x00b6
                L_0x00b2:
                    throw r6     // Catch: Exception -> 0x009f
                L_0x00b3:
                    tb.c3j.c(r5, r0)
                L_0x00b6:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.heytap.mspsdk.proxy.b.C0264b.RunnableC0265b.run():void");
            }
        }

        static {
            t2o.a(253755436);
        }

        public C0264b(T t) {
            this.f5215a = t;
        }

        /* JADX WARN: Removed duplicated region for block: B:124:0x0348  */
        /* JADX WARN: Removed duplicated region for block: B:126:0x00c0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:86:0x023f  */
        /* JADX WARN: Removed duplicated region for block: B:91:0x025b  */
        /* JADX WARN: Removed duplicated region for block: B:92:0x026a  */
        /* JADX WARN: Removed duplicated region for block: B:94:0x026d  */
        @Override // java.lang.reflect.InvocationHandler
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Object invoke(java.lang.Object r17, java.lang.reflect.Method r18, java.lang.Object[] r19) {
            /*
                Method dump skipped, instructions count: 850
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.heytap.mspsdk.proxy.b.C0264b.invoke(java.lang.Object, java.lang.reflect.Method, java.lang.Object[]):java.lang.Object");
        }
    }
}
