package com.alibaba.wireless.security.middletierplugin.open.fc.strategy;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.alibaba.wireless.security.middletierplugin.open.fc.AbstractC0141;
import com.alibaba.wireless.security.middletierplugin.open.fc.C0135;
import com.alibaba.wireless.security.open.middletier.fc.ui.IUIBridge;
import java.util.HashMap;

/* renamed from: com.alibaba.wireless.security.middletierplugin.open.fc.strategy.в  reason: contains not printable characters */
/* loaded from: classes.dex */
public class C0133 extends BroadcastReceiver implements IUIBridge {

    /* renamed from: б  reason: contains not printable characters */
    private static final String f160 = "BXLOG";

    /* renamed from: в  reason: contains not printable characters */
    private static volatile C0133 f161;

    /* renamed from: а  reason: contains not printable characters */
    private HashMap f162 = new HashMap();

    /* renamed from: com.alibaba.wireless.security.middletierplugin.open.fc.strategy.в$а  reason: contains not printable characters */
    /* loaded from: classes.dex */
    class RunnableC0134 implements Runnable {

        /* renamed from: а  reason: contains not printable characters */
        final /* synthetic */ String f163;

        /* renamed from: б  reason: contains not printable characters */
        final /* synthetic */ boolean f164;

        RunnableC0134(String str, boolean z) {
            this.f163 = str;
            this.f164 = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            String str = "==============content================" + this.f163;
            C0135.m131(this.f163, this.f164);
        }
    }

    private C0133() {
    }

    @SuppressLint({"WrongConstant"})
    /* renamed from: а  reason: contains not printable characters */
    public static C0133 m118(Context context) {
        if (f161 == null) {
            synchronized (C0133.class) {
                if (f161 == null) {
                    f161 = new C0133();
                    IntentFilter intentFilter = new IntentFilter(IUIBridge.INTENT_ACTIVITY_CREATE);
                    intentFilter.addAction(IUIBridge.INTENT_ACTIVITY_RESULT);
                    intentFilter.addAction(IUIBridge.INTENT_SEND_LOG);
                    Class<?> cls = Class.forName("com.alibaba.wireless.security.open.middletier.fc.ui.LocalBroadcastManager");
                    cls.getMethod("registerReceiver", BroadcastReceiver.class, IntentFilter.class).invoke(cls.getMethod("getInstance", Context.class).invoke(null, context), f161, intentFilter);
                }
            }
        }
        return f161;
    }

    /* renamed from: г  reason: contains not printable characters */
    private void m119(boolean z, long j) {
        HashMap hashMap = this.f162;
        C0132 r5 = (C0132) hashMap.get("" + j);
        C0135.m134(z, 0, r5 != null ? r5.m99() : null);
    }

    @Override // com.alibaba.wireless.security.open.middletier.fc.ui.IUIBridge
    public void addUIItem(long j, Object obj) {
        HashMap hashMap = this.f162;
        hashMap.put("" + j, obj);
    }

    @Override // com.alibaba.wireless.security.open.middletier.fc.ui.IUIBridge
    public void clearTimeoutItem(long j) {
        String str = "" + j;
        if (this.f162.containsKey(str)) {
            String str2 = "[UIBridge][clearTimeoutItem] start activity-timeout: SessionID: " + j + " not start the activity !!!";
            C0132 r3 = (C0132) this.f162.get(str);
            C0135.m136(AbstractC0141.f226, 0, 0L, "", "Clearactivitystarttimeoutitem", "", "" + j, r3.m99(), r3.m113() ? 7 : 1, false);
            String str3 = "[UIBridge][clearTimeoutItem] start activity-timeout: SessionID: " + j + "   BXUserReport: Clearactivitystarttimeoutitem";
            C0135.m134(r3.m113(), 3, r3.m99());
            this.f162.clear();
            StrategyCenter.m90(j, 2, true, null);
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        StringBuilder sb;
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[UIBridge][onReceive] SessionID: ");
        String str2 = "";
        sb2.append(intent != null ? Long.valueOf(intent.getLongExtra(IUIBridge.KEY_SESSION_ID, 0L)) : str2);
        sb2.append("BXUserReport: onReceive BRCAST : ");
        if (intent != null) {
            str2 = intent.getAction();
        }
        sb2.append(str2);
        sb2.toString();
        if (intent != null) {
            String action = intent.getAction();
            int i = 0;
            boolean booleanExtra = intent.getBooleanExtra(IUIBridge.KEY_IS_SAMPLE, false);
            String stringExtra = intent.getStringExtra(IUIBridge.KEY_UI_LOG);
            if (stringExtra != null) {
                C0135.m135(stringExtra);
            }
            String str3 = "[UIBridge] @@@@@ isSample=" + booleanExtra + " and intent=" + intent.toString();
            if (IUIBridge.INTENT_ACTIVITY_CREATE.equals(action)) {
                long longExtra = intent.getLongExtra(IUIBridge.KEY_SESSION_ID, 0L);
                removeUIItem(longExtra);
                m119(booleanExtra, longExtra);
                sb = new StringBuilder();
                sb.append("[UIBridge][onReceive] SessionID: ");
                sb.append(intent.getLongExtra(IUIBridge.KEY_SESSION_ID, 0L));
                str = " create";
            } else if (IUIBridge.INTENT_ACTIVITY_RESULT.equals(action)) {
                long longExtra2 = intent.getLongExtra(IUIBridge.KEY_SESSION_ID, 0L);
                StrategyCenter.m90(longExtra2, intent.getIntExtra(IUIBridge.KEY_UI_RESULT, 0), true, null);
                m119(booleanExtra, longExtra2);
                sb = new StringBuilder();
                sb.append("[UIBridge][onReceive] SessionID: ");
                sb.append(intent.getLongExtra(IUIBridge.KEY_SESSION_ID, 0L));
                str = " activity_result";
            } else if (IUIBridge.INTENT_SEND_LOG.equals(action)) {
                String stringExtra2 = intent.getStringExtra(IUIBridge.KEY_UI_LOG);
                int intExtra = intent.getIntExtra(IUIBridge.KEY_UI_LOG_WAY, 0);
                if ((intExtra & 2) == 2) {
                    C0135.m129(stringExtra2);
                }
                String str4 = "[UIBridge][onReceive] SessionID: " + intent.getLongExtra(IUIBridge.KEY_SESSION_ID, 0L) + " send log";
                if ((intExtra & 4) == 4 && C0135.f168 != null) {
                    C0135.f168.post(new RunnableC0134(stringExtra2, intent.getBooleanExtra(IUIBridge.KEY_UI_LOG_SEND, false)));
                }
                String stringExtra3 = intent.getStringExtra(IUIBridge.KEY_UI_INFO);
                String str5 = "[UIBridge][onReceive] sendlog =" + stringExtra3;
                if (stringExtra3 != null) {
                    String[] split = stringExtra3.split("&");
                    if (split == null || split.length < 2) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(" list length=");
                        if (split != null) {
                            i = split.length;
                        }
                        sb3.append(i);
                        sb3.toString();
                        return;
                    }
                    int parseInt = Integer.parseInt(split[0]);
                    String str6 = split[1];
                    String str7 = " status=" + parseInt + " bxuuid=" + str6;
                    C0135.m134(booleanExtra, parseInt, str6);
                    return;
                }
                return;
            } else {
                return;
            }
            sb.append(str);
            sb.toString();
        }
    }

    @Override // com.alibaba.wireless.security.open.middletier.fc.ui.IUIBridge
    public void removeUIItem(long j) {
        String str = "[UIBridge][removeUIItem] SessionID: " + j + "   BXUserReport: removeactivitystartitem";
        if (this.f162.containsKey("" + j)) {
            this.f162.clear();
        }
    }

    /* renamed from: б  reason: contains not printable characters */
    public C0132 m120(long j) {
        return (C0132) this.f162.get("" + j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0045 A[Catch: all -> 0x0052, TRY_ENTER, TRY_LEAVE, TryCatch #2 {Exception -> 0x00e4, blocks: (B:3:0x0007, B:28:0x005a, B:29:0x0062, B:31:0x00ba, B:32:0x00bf, B:26:0x0045), top: B:51:0x0007 }] */
    /* renamed from: в  reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m121(android.content.Context r20, com.alibaba.wireless.security.middletierplugin.open.fc.strategy.C0132 r21) {
        /*
            Method dump skipped, instructions count: 319
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.wireless.security.middletierplugin.open.fc.strategy.C0133.m121(android.content.Context, com.alibaba.wireless.security.middletierplugin.open.fc.strategy.б):void");
    }
}
