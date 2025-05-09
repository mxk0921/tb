package com.taobao.tao.log.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.LogLevel;
import com.taobao.tao.log.TLogNative;
import com.taobao.tao.log.utils.TLogMultiProcessReceiver;
import java.util.Map;
import tb.e6s;
import tb.n6s;
import tb.s4s;
import tb.t2o;
import tb.u5s;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class TLogMultiProcessReceiver extends BroadcastReceiver {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(767557740);
    }

    public static /* synthetic */ Object ipc$super(TLogMultiProcessReceiver tLogMultiProcessReceiver, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/log/utils/TLogMultiProcessReceiver");
    }

    public final void b(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96e5d9b4", new Object[]{this, intent});
        } else if (intent != null) {
            Log.e("TLogProcessReceiver", "TLog MultiProcess changeLogLevel");
            try {
                s4s.e().g((LogLevel) intent.getSerializableExtra(u5s.PARAM_LOG_LEVEL));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public final void c(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f3b29ec", new Object[]{this, intent});
        } else if (intent != null) {
            Log.e("TLogProcessReceiver", "TLog MultiProcess changeModuleLevel");
            try {
                String stringExtra = intent.getStringExtra(u5s.PARAM_MODULE_LEVEL);
                if ("off".equals(stringExtra)) {
                    s4s.e().c();
                } else {
                    Map<String, LogLevel> i = n6s.i(stringExtra);
                    if (i != null && i.size() > 0) {
                        s4s.e().b(i);
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public final void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc909627", new Object[]{this});
            return;
        }
        try {
            Log.e("TLogProcessReceiver", "TLog MultiProcess flushLog");
            TLogNative.appenderFlushData(false);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, final Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
        } else if (!u5s.a(context)) {
            Log.e("TLogProcessReceiver", "The TLogMultiProcessNotify is disable");
        } else if (intent != null && intent.getAction() != null) {
            e6s.d().c(new Runnable() { // from class: tb.t5s
                @Override // java.lang.Runnable
                public final void run() {
                    TLogMultiProcessReceiver.this.e(intent);
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0071 A[Catch: Exception -> 0x004a, TRY_LEAVE, TryCatch #0 {Exception -> 0x004a, blocks: (B:6:0x0015, B:9:0x0027, B:16:0x003f, B:21:0x004c, B:24:0x0056, B:32:0x0069, B:33:0x006d, B:34:0x0071), top: B:37:0x0015 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* synthetic */ void e(android.content.Intent r8) {
        /*
            r7 = this;
            r0 = 1
            r1 = 0
            r2 = 2
            com.android.alibaba.ip.runtime.IpChange r3 = com.taobao.tao.log.utils.TLogMultiProcessReceiver.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x0015
            java.lang.String r4 = "b406d6f7"
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r1] = r7
            r2[r0] = r8
            r3.ipc$dispatch(r4, r2)
            return
        L_0x0015:
            r8.getAction()     // Catch: Exception -> 0x004a
            java.lang.String r3 = "tlog_pid"
            r4 = -1
            int r3 = r8.getIntExtra(r3, r4)     // Catch: Exception -> 0x004a
            int r5 = android.os.Process.myPid()     // Catch: Exception -> 0x004a
            if (r5 != r3) goto L_0x0027
            return
        L_0x0027:
            java.lang.String r3 = r8.getAction()     // Catch: Exception -> 0x004a
            int r5 = r3.hashCode()     // Catch: Exception -> 0x004a
            r6 = -836891243(0xffffffffce1e0d95, float:-6.6292256E8)
            if (r5 == r6) goto L_0x0056
            r6 = -730623461(0xffffffffd473921b, float:-4.18451318E12)
            if (r5 == r6) goto L_0x004c
            r1 = -268762717(0xffffffffeffb01a3, float:-1.5536543E29)
            if (r5 == r1) goto L_0x003f
            goto L_0x0061
        L_0x003f:
            java.lang.String r1 = "com.taobao.tao.log.change.modulelevel"
            boolean r1 = r3.equals(r1)     // Catch: Exception -> 0x004a
            if (r1 == 0) goto L_0x0061
            r1 = 2
            goto L_0x0062
        L_0x004a:
            r8 = move-exception
            goto L_0x0075
        L_0x004c:
            java.lang.String r5 = "com.taobao.tao.log.flush"
            boolean r3 = r3.equals(r5)     // Catch: Exception -> 0x004a
            if (r3 == 0) goto L_0x0061
            goto L_0x0062
        L_0x0056:
            java.lang.String r1 = "com.taobao.tao.log.change.loglevel"
            boolean r1 = r3.equals(r1)     // Catch: Exception -> 0x004a
            if (r1 == 0) goto L_0x0061
            r1 = 1
            goto L_0x0062
        L_0x0061:
            r1 = -1
        L_0x0062:
            if (r1 == 0) goto L_0x0071
            if (r1 == r0) goto L_0x006d
            if (r1 == r2) goto L_0x0069
            goto L_0x0078
        L_0x0069:
            r7.c(r8)     // Catch: Exception -> 0x004a
            goto L_0x0078
        L_0x006d:
            r7.b(r8)     // Catch: Exception -> 0x004a
            goto L_0x0078
        L_0x0071:
            r7.d()     // Catch: Exception -> 0x004a
            goto L_0x0078
        L_0x0075:
            r8.printStackTrace()
        L_0x0078:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.tao.log.utils.TLogMultiProcessReceiver.e(android.content.Intent):void");
    }
}
