package com.taobao.accs.antibrush;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.client.GlobalClientInfo;
import com.taobao.accs.common.Constants;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.UtilityImpl;
import java.util.concurrent.ScheduledFuture;
import tb.kt4;
import tb.o2j;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class AntiBrush {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String ANTI_ATTACK_ACTION = "mtopsdk.mtop.antiattack.checkcode.validate.activity_action";
    private static final String ANTI_ATTACK_RESULT_ACTION = "mtopsdk.extra.antiattack.result.notify.action";
    public static final int STATUS_BRUSH = 419;
    private static final String TAG = "AntiBrush";
    private static String mHost;
    private static volatile boolean mIsInCheckCodeActivity = false;
    private static ScheduledFuture<?> mTimeoutTask;
    private BroadcastReceiver mAntiAttackReceiver = null;
    private Context mContext;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class AntiReceiver extends BroadcastReceiver {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(343932962);
        }

        public static /* synthetic */ Object ipc$super(AntiReceiver antiReceiver, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/accs/antibrush/AntiBrush$AntiReceiver");
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            int i = 0;
            IpChange ipChange = $ipChange;
            try {
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                    return;
                }
                String stringExtra = intent.getStringExtra("Result");
                ALog.e(AntiBrush.TAG, "anti onReceive result: " + stringExtra, new Object[i]);
                i = stringExtra.equalsIgnoreCase("success");
            } catch (Exception e) {
                ALog.e(AntiBrush.TAG, "anti onReceive", e, new Object[i]);
            } finally {
                AntiBrush.onResult(GlobalClientInfo.getContext(), i);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            ALog.e(AntiBrush.TAG, "anti bursh timeout", new Object[0]);
            AntiBrush.onResult(AntiBrush.access$000(AntiBrush.this), false);
        }
    }

    static {
        t2o.a(343932960);
    }

    public AntiBrush(Context context) {
        this.mContext = context.getApplicationContext();
    }

    public static /* synthetic */ Context access$000(AntiBrush antiBrush) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("174da46b", new Object[]{antiBrush});
        }
        return antiBrush.mContext;
    }

    public static void onResult(Context context, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94c22faf", new Object[]{context, new Boolean(z)});
            return;
        }
        mIsInCheckCodeActivity = false;
        Intent intent = new Intent(Constants.ACTION_RECEIVE);
        intent.setPackage(context.getPackageName());
        intent.putExtra("command", 104);
        intent.putExtra(Constants.KEY_ANTI_BRUSH_RET, z);
        o2j.f().e(context, intent);
        ScheduledFuture<?> scheduledFuture = mTimeoutTask;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
            mTimeoutTask = null;
        }
        String str = mHost;
        if (str != null) {
            UtilityImpl.storeCookie(context, kt4.b(str));
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:6|(3:39|8|(4:10|(1:12)(1:13)|14|(2:16|(9:18|(1:20)|23|(1:25)(1:26)|27|37|29|(1:33)|36))))|28|37|29|(2:31|33)|36) */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00c7, code lost:
        r8 = th;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean checkAntiBrush(java.net.URL r8, java.util.Map<java.lang.Integer, java.lang.String> r9) {
        /*
            r7 = this;
            r0 = 1
            r1 = 0
            java.lang.String r2 = "start anti bursh location:"
            com.android.alibaba.ip.runtime.IpChange r3 = com.taobao.accs.antibrush.AntiBrush.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x0022
            java.lang.String r2 = "7e950e33"
            r4 = 3
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r1] = r7
            r4[r0] = r8
            r8 = 2
            r4[r8] = r9
            java.lang.Object r8 = r3.ipc$dispatch(r2, r4)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            return r8
        L_0x0022:
            java.lang.String r3 = "AntiBrush"
            if (r9 == 0) goto L_0x00a4
            android.content.Context r4 = r7.mContext     // Catch: all -> 0x0087
            boolean r4 = com.taobao.accs.utl.UtilityImpl.isForeground(r4)     // Catch: all -> 0x0087
            if (r4 == 0) goto L_0x00a4
            com.taobao.accs.base.TaoBaseService$ExtHeaderType r4 = com.taobao.accs.base.TaoBaseService.ExtHeaderType.TYPE_STATUS     // Catch: all -> 0x0087
            int r4 = r4.ordinal()     // Catch: all -> 0x0087
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: all -> 0x0087
            java.lang.Object r4 = r9.get(r4)     // Catch: all -> 0x0087
            java.lang.String r4 = (java.lang.String) r4     // Catch: all -> 0x0087
            boolean r5 = android.text.TextUtils.isEmpty(r4)     // Catch: all -> 0x0087
            if (r5 == 0) goto L_0x0046
            r4 = 0
            goto L_0x004e
        L_0x0046:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: all -> 0x0087
            int r4 = r4.intValue()     // Catch: all -> 0x0087
        L_0x004e:
            r5 = 419(0x1a3, float:5.87E-43)
            if (r4 != r5) goto L_0x00a4
            com.taobao.accs.base.TaoBaseService$ExtHeaderType r4 = com.taobao.accs.base.TaoBaseService.ExtHeaderType.TYPE_LOCATION     // Catch: all -> 0x0087
            int r4 = r4.ordinal()     // Catch: all -> 0x0087
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: all -> 0x0087
            java.lang.Object r9 = r9.get(r4)     // Catch: all -> 0x0087
            java.lang.String r9 = (java.lang.String) r9     // Catch: all -> 0x0087
            boolean r4 = android.text.TextUtils.isEmpty(r9)     // Catch: all -> 0x0087
            if (r4 != 0) goto L_0x00a4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: all -> 0x0087
            r4.<init>(r2)     // Catch: all -> 0x0087
            r4.append(r9)     // Catch: all -> 0x0087
            java.lang.String r2 = r4.toString()     // Catch: all -> 0x0087
            java.lang.Object[] r4 = new java.lang.Object[r1]     // Catch: all -> 0x0087
            com.taobao.accs.utl.ALog.e(r3, r2, r4)     // Catch: all -> 0x0087
            r7.handleantiBrush(r9)     // Catch: all -> 0x0087
            java.util.concurrent.ScheduledFuture<?> r9 = com.taobao.accs.antibrush.AntiBrush.mTimeoutTask     // Catch: all -> 0x0087
            r2 = 0
            if (r9 == 0) goto L_0x008a
            r9.cancel(r0)     // Catch: all -> 0x0087
            com.taobao.accs.antibrush.AntiBrush.mTimeoutTask = r2     // Catch: all -> 0x0087
            goto L_0x008a
        L_0x0087:
            r8 = move-exception
            r0 = 0
            goto L_0x00c8
        L_0x008a:
            com.taobao.accs.antibrush.AntiBrush$a r9 = new com.taobao.accs.antibrush.AntiBrush$a     // Catch: all -> 0x0087
            r9.<init>()     // Catch: all -> 0x0087
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: all -> 0x0087
            r5 = 60000(0xea60, double:2.9644E-319)
            java.util.concurrent.ScheduledFuture r9 = tb.brt.m(r9, r5, r4)     // Catch: all -> 0x0087
            com.taobao.accs.antibrush.AntiBrush.mTimeoutTask = r9     // Catch: all -> 0x0087
            if (r8 != 0) goto L_0x009d
            goto L_0x00a1
        L_0x009d:
            java.lang.String r2 = r8.getHost()     // Catch: all -> 0x0087
        L_0x00a1:
            com.taobao.accs.antibrush.AntiBrush.mHost = r2     // Catch: all -> 0x0087
            goto L_0x00a5
        L_0x00a4:
            r0 = 0
        L_0x00a5:
            java.lang.String r8 = com.taobao.accs.client.GlobalClientInfo.mCookieSec     // Catch: all -> 0x00c7
            boolean r8 = android.text.TextUtils.isEmpty(r8)     // Catch: all -> 0x00c7
            if (r8 != 0) goto L_0x00d0
            java.lang.String r8 = com.taobao.accs.antibrush.AntiBrush.mHost     // Catch: all -> 0x00c7
            java.lang.String r8 = tb.kt4.b(r8)     // Catch: all -> 0x00c7
            boolean r8 = android.text.TextUtils.isEmpty(r8)     // Catch: all -> 0x00c7
            if (r8 == 0) goto L_0x00d0
            java.lang.String r8 = "cookie invalid, clear"
            java.lang.Object[] r9 = new java.lang.Object[r1]     // Catch: all -> 0x00c7
            com.taobao.accs.utl.ALog.e(r3, r8, r9)     // Catch: all -> 0x00c7
            android.content.Context r8 = r7.mContext     // Catch: all -> 0x00c7
            com.taobao.accs.utl.UtilityImpl.clearCookie(r8)     // Catch: all -> 0x00c7
            goto L_0x00d0
        L_0x00c7:
            r8 = move-exception
        L_0x00c8:
            java.lang.String r9 = "checkAntiBrush error"
            java.lang.Object[] r1 = new java.lang.Object[r1]
            com.taobao.accs.utl.ALog.e(r3, r9, r8, r1)
        L_0x00d0:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.accs.antibrush.AntiBrush.checkAntiBrush(java.net.URL, java.util.Map):boolean");
    }

    private void handleantiBrush(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3842e61", new Object[]{this, str});
        } else if (mIsInCheckCodeActivity) {
            ALog.e(TAG, "handleantiBrush return", "mIsInCheckCodeActivity", Boolean.valueOf(mIsInCheckCodeActivity));
        } else {
            try {
                Intent intent = new Intent();
                intent.setAction(ANTI_ATTACK_ACTION);
                intent.setPackage(this.mContext.getPackageName());
                intent.setFlags(268435456);
                intent.putExtra("Location", str);
                ALog.e(TAG, "handleAntiBrush:", new Object[0]);
                this.mContext.startActivity(intent);
                mIsInCheckCodeActivity = true;
                if (this.mAntiAttackReceiver == null) {
                    this.mAntiAttackReceiver = new AntiReceiver();
                }
                this.mContext.registerReceiver(this.mAntiAttackReceiver, new IntentFilter(ANTI_ATTACK_RESULT_ACTION));
            } catch (Throwable th) {
                ALog.e(TAG, "handleantiBrush", th, new Object[0]);
            }
        }
    }
}
