package com.xiaomi.push.service;

import android.content.Context;
import com.xiaomi.push.ig;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class cc implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Context f15094a;

    /* renamed from: a  reason: collision with other field name */
    final /* synthetic */ ig f1618a;

    public cc(Context context, ig igVar) {
        this.f15094a = context;
        this.f1618a = igVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Throwable, java.io.IOException] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Throwable, java.io.IOException] */
    /* JADX WARN: Unknown variable types count: 2 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void run() {
        /*
            r5 = this;
            java.lang.Object r0 = com.xiaomi.push.service.cb.f15093a
            monitor-enter(r0)
            r1 = 0
            java.io.File r2 = new java.io.File     // Catch: all -> 0x0046, Exception -> 0x0049
            android.content.Context r3 = r5.f15094a     // Catch: all -> 0x0046, Exception -> 0x0049
            java.io.File r3 = r3.getFilesDir()     // Catch: all -> 0x0046, Exception -> 0x0049
            java.lang.String r4 = "tiny_data.lock"
            r2.<init>(r3, r4)     // Catch: all -> 0x0046, Exception -> 0x0049
            com.xiaomi.push.x.m1105a(r2)     // Catch: all -> 0x0046, Exception -> 0x0049
            java.io.RandomAccessFile r3 = new java.io.RandomAccessFile     // Catch: all -> 0x0046, Exception -> 0x0049
            java.lang.String r4 = "rw"
            r3.<init>(r2, r4)     // Catch: all -> 0x0046, Exception -> 0x0049
            java.nio.channels.FileChannel r2 = r3.getChannel()     // Catch: all -> 0x0042, Exception -> 0x0044
            java.nio.channels.FileLock r1 = r2.lock()     // Catch: all -> 0x0042, Exception -> 0x0044
            android.content.Context r2 = r5.f15094a     // Catch: all -> 0x0042, Exception -> 0x0044
            com.xiaomi.push.ig r4 = r5.f1618a     // Catch: all -> 0x0042, Exception -> 0x0044
            com.xiaomi.push.service.cb.b(r2, r4)     // Catch: all -> 0x0042, Exception -> 0x0044
            if (r1 == 0) goto L_0x003e
            boolean r2 = r1.isValid()     // Catch: all -> 0x0038
            if (r2 == 0) goto L_0x003e
            r1.release()     // Catch: all -> 0x0038, IOException -> 0x003a
            goto L_0x003e
        L_0x0038:
            r1 = move-exception
            goto L_0x0075
        L_0x003a:
            r1 = move-exception
            com.xiaomi.channel.commonutils.logger.b.a(r1)     // Catch: all -> 0x0038
        L_0x003e:
            com.xiaomi.push.x.a(r3)     // Catch: all -> 0x0038
            goto L_0x005f
        L_0x0042:
            r2 = move-exception
            goto L_0x0061
        L_0x0044:
            r2 = move-exception
            goto L_0x004b
        L_0x0046:
            r2 = move-exception
            r3 = r1
            goto L_0x0061
        L_0x0049:
            r2 = move-exception
            r3 = r1
        L_0x004b:
            com.xiaomi.channel.commonutils.logger.b.a(r2)     // Catch: all -> 0x0042
            if (r1 == 0) goto L_0x003e
            boolean r2 = r1.isValid()     // Catch: all -> 0x0038
            if (r2 == 0) goto L_0x003e
            r1.release()     // Catch: all -> 0x0038, IOException -> 0x005a
            goto L_0x003e
        L_0x005a:
            r1 = move-exception
            com.xiaomi.channel.commonutils.logger.b.a(r1)     // Catch: all -> 0x0038
            goto L_0x003e
        L_0x005f:
            monitor-exit(r0)     // Catch: all -> 0x0038
            return
        L_0x0061:
            if (r1 == 0) goto L_0x0071
            boolean r4 = r1.isValid()     // Catch: all -> 0x0038
            if (r4 == 0) goto L_0x0071
            r1.release()     // Catch: all -> 0x0038, IOException -> 0x006d
            goto L_0x0071
        L_0x006d:
            r1 = move-exception
            com.xiaomi.channel.commonutils.logger.b.a(r1)     // Catch: all -> 0x0038
        L_0x0071:
            com.xiaomi.push.x.a(r3)     // Catch: all -> 0x0038
            throw r2     // Catch: all -> 0x0038
        L_0x0075:
            monitor-exit(r0)     // Catch: all -> 0x0038
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.service.cc.run():void");
    }
}
