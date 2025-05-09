package com.loc;

import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.storage.StorageManager;
import com.taobao.android.weex_framework.module.builtin.WXStorageModule;
import java.io.File;
import java.lang.reflect.Array;
import java.lang.reflect.Method;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class ak {

    /* renamed from: a  reason: collision with root package name */
    public static final String f5563a = x.c("SYmFja3Vwcw");
    public static final String b = x.c("SLmFkaXU");
    public static final String c = x.c("JIw");

    private static String a(Context context) {
        File externalFilesDir;
        int i = Build.VERSION.SDK_INT;
        if (i >= 31 || (context.getApplicationInfo().targetSdkVersion >= 30 && i >= 30)) {
            externalFilesDir = context.getApplicationContext().getExternalFilesDir("");
        } else {
            StorageManager storageManager = (StorageManager) context.getSystemService(WXStorageModule.NAME);
            try {
                Class<?> cls = Class.forName(x.c("SYW5kcm9pZC5vcy5zdG9yYWdlLlN0b3JhZ2VWb2x1bWU"));
                Method method = storageManager.getClass().getMethod(x.c("FZ2V0Vm9sdW1lTGlzdA"), new Class[0]);
                Method method2 = cls.getMethod(x.c("ZZ2V0UGF0aA"), new Class[0]);
                Method method3 = cls.getMethod(x.c("AaXNSZW1vdmFibGUK"), new Class[0]);
                Object invoke = method.invoke(storageManager, new Object[0]);
                int length = Array.getLength(invoke);
                for (int i2 = 0; i2 < length; i2++) {
                    Object obj = Array.get(invoke, i2);
                    String str = (String) method2.invoke(obj, new Object[0]);
                    if (!((Boolean) method3.invoke(obj, new Object[0])).booleanValue()) {
                        return str;
                    }
                }
                return null;
            } catch (Throwable unused) {
                externalFilesDir = Environment.getExternalStorageDirectory();
            }
        }
        return externalFilesDir.getAbsolutePath();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:(15:18|(1:20)|23|68|24|64|25|(1:27)|(2:71|29)|66|31|60|32|33|34)|64|25|(0)|(0)|66|31|60|32|33|34) */
    /* JADX WARN: Can't wrap try/catch for region: R(13:(15:18|(1:20)|23|68|24|64|25|(1:27)|(2:71|29)|66|31|60|32|33|34)|68|24|64|25|(0)|(0)|66|31|60|32|33|34) */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0089 A[Catch: all -> 0x00a6, TRY_LEAVE, TryCatch #4 {all -> 0x00a6, blocks: (B:25:0x0083, B:27:0x0089), top: B:64:0x0083 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0098 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static synchronized void a(android.content.Context r3, java.lang.String r4, java.lang.String r5) {
        /*
            java.lang.Class<com.loc.ak> r0 = com.loc.ak.class
            monitor-enter(r0)
            if (r3 == 0) goto L_0x00c4
            java.lang.String r1 = "EYW5kcm9pZC5wZXJtaXNzaW9uLldSSVRFX0VYVEVSTkFMX1NUT1JBR0U="
            java.lang.String r1 = com.loc.x.c(r1)     // Catch: all -> 0x009c
            int r1 = r3.checkCallingOrSelfPermission(r1)     // Catch: all -> 0x009c
            if (r1 != 0) goto L_0x00c4
            java.lang.String r1 = "EYW5kcm9pZC5wZXJtaXNzaW9uLlJFQURfRVhURVJOQUxfU1RPUkFHRQ=="
            java.lang.String r1 = com.loc.x.c(r1)     // Catch: all -> 0x009c
            int r1 = r3.checkCallingOrSelfPermission(r1)     // Catch: all -> 0x009c
            if (r1 == 0) goto L_0x001f
            goto L_0x00c4
        L_0x001f:
            java.lang.String r3 = a(r3)     // Catch: all -> 0x009c
            boolean r1 = android.text.TextUtils.isEmpty(r3)     // Catch: all -> 0x009c
            if (r1 == 0) goto L_0x002b
            monitor-exit(r0)
            return
        L_0x002b:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: all -> 0x009c
            r1.<init>()     // Catch: all -> 0x009c
            r1.append(r4)     // Catch: all -> 0x009c
            java.lang.String r4 = com.loc.ak.c     // Catch: all -> 0x009c
            r1.append(r4)     // Catch: all -> 0x009c
            r1.append(r5)     // Catch: all -> 0x009c
            java.lang.String r4 = r1.toString()     // Catch: all -> 0x009c
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: all -> 0x009c
            r5.<init>()     // Catch: all -> 0x009c
            r5.append(r3)     // Catch: all -> 0x009c
            java.lang.String r3 = java.io.File.separator     // Catch: all -> 0x009c
            r5.append(r3)     // Catch: all -> 0x009c
            java.lang.String r3 = com.loc.ak.f5563a     // Catch: all -> 0x009c
            r5.append(r3)     // Catch: all -> 0x009c
            java.lang.String r3 = r5.toString()     // Catch: all -> 0x009c
            java.io.File r5 = new java.io.File     // Catch: all -> 0x009c
            r5.<init>(r3)     // Catch: all -> 0x009c
            java.io.File r3 = new java.io.File     // Catch: all -> 0x009c
            java.lang.String r1 = com.loc.ak.b     // Catch: all -> 0x009c
            r3.<init>(r5, r1)     // Catch: all -> 0x009c
            r1 = 0
            boolean r2 = r5.exists()     // Catch: all -> 0x006f
            if (r2 == 0) goto L_0x0071
            boolean r2 = r5.isDirectory()     // Catch: all -> 0x006f
            if (r2 == 0) goto L_0x0074
            goto L_0x0071
        L_0x006f:
            goto L_0x00ab
        L_0x0071:
            r5.mkdirs()     // Catch: all -> 0x006f
        L_0x0074:
            r3.createNewFile()     // Catch: all -> 0x006f
            java.io.RandomAccessFile r5 = new java.io.RandomAccessFile     // Catch: all -> 0x006f
            java.lang.String r2 = "rws"
            r5.<init>(r3, r2)     // Catch: all -> 0x006f
            java.nio.channels.FileChannel r3 = r5.getChannel()     // Catch: all -> 0x00a8
            java.nio.channels.FileLock r1 = r3.tryLock()     // Catch: all -> 0x00a6
            if (r1 == 0) goto L_0x0096
            java.lang.String r2 = "UTF-8"
            byte[] r4 = r4.getBytes(r2)     // Catch: all -> 0x00a6
            java.nio.ByteBuffer r4 = java.nio.ByteBuffer.wrap(r4)     // Catch: all -> 0x00a6
            r3.write(r4)     // Catch: all -> 0x00a6
        L_0x0096:
            if (r1 == 0) goto L_0x009e
            r1.release()     // Catch: all -> 0x009c, IOException -> 0x009e
            goto L_0x009e
        L_0x009c:
            r3 = move-exception
            goto L_0x00c2
        L_0x009e:
            r3.close()     // Catch: all -> 0x009c, IOException -> 0x00a1
        L_0x00a1:
            r5.close()     // Catch: all -> 0x00a4
        L_0x00a4:
            monitor-exit(r0)
            return
        L_0x00a6:
            goto L_0x00ad
        L_0x00a8:
            r3 = r1
            goto L_0x00ad
        L_0x00ab:
            r3 = r1
            r5 = r3
        L_0x00ad:
            if (r1 == 0) goto L_0x00b4
            r1.release()     // Catch: all -> 0x009c, IOException -> 0x00b3
            goto L_0x00b4
        L_0x00b3:
        L_0x00b4:
            if (r3 == 0) goto L_0x00bb
            r3.close()     // Catch: all -> 0x009c, IOException -> 0x00ba
            goto L_0x00bb
        L_0x00ba:
        L_0x00bb:
            if (r5 == 0) goto L_0x00c0
            r5.close()     // Catch: all -> 0x00c0
        L_0x00c0:
            monitor-exit(r0)
            return
        L_0x00c2:
            monitor-exit(r0)     // Catch: all -> 0x009c
            throw r3
        L_0x00c4:
            monitor-exit(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.loc.ak.a(android.content.Context, java.lang.String, java.lang.String):void");
    }
}
