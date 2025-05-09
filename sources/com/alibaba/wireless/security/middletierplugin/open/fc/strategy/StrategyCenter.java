package com.alibaba.wireless.security.middletierplugin.open.fc.strategy;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import com.alibaba.wireless.security.SecExceptionCode;
import com.alibaba.wireless.security.middletierplugin.open.fc.AbstractC0141;
import com.alibaba.wireless.security.middletierplugin.open.fc.C0135;
import com.alibaba.wireless.security.middletierplugin.open.fc.C0137;
import com.alibaba.wireless.security.middletierplugin.open.fc.C0139;
import com.alibaba.wireless.security.middletierplugin.open.fc.C0142;
import com.alibaba.wireless.security.middletierplugin.open.fc.strategy.C0129;
import com.alibaba.wireless.security.open.middletier.fc.IFCComponent;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class StrategyCenter {

    /* renamed from: ж  reason: contains not printable characters */
    private static HashMap<Long, C0132> f93 = null;

    /* renamed from: з  reason: contains not printable characters */
    private static Object f94 = new Object();

    /* renamed from: и  reason: contains not printable characters */
    private static Handler f95 = null;

    /* renamed from: й  reason: contains not printable characters */
    static volatile int f96 = 0;

    /* renamed from: к  reason: contains not printable characters */
    static volatile int f97 = 0;

    /* renamed from: ё  reason: contains not printable characters */
    private static final String f98 = "BXLOG";

    /* renamed from: а  reason: contains not printable characters */
    private Context f99;

    /* renamed from: б  reason: contains not printable characters */
    private C0133 f100;

    /* renamed from: в  reason: contains not printable characters */
    private String f101 = IFCComponent.KEY_LOGIN_MODULE;

    /* renamed from: г  reason: contains not printable characters */
    private volatile int f102 = 0;

    /* renamed from: д  reason: contains not printable characters */
    private volatile long f103;

    /* renamed from: е  reason: contains not printable characters */
    private volatile int f104;

    /* renamed from: com.alibaba.wireless.security.middletierplugin.open.fc.strategy.StrategyCenter$а  reason: contains not printable characters */
    /* loaded from: classes.dex */
    class RunnableC0125 implements Runnable {
        RunnableC0125() {
        }

        @Override // java.lang.Runnable
        public void run() {
            int i = C0135.m133();
            if ((i == 6 || i == 7) && StrategyCenter.f96 < 10) {
                StrategyCenter.f95.postDelayed(this, 30000L);
                StrategyCenter.f96++;
                return;
            }
            C0135.m122();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.alibaba.wireless.security.middletierplugin.open.fc.strategy.StrategyCenter$б  reason: contains not printable characters */
    /* loaded from: classes.dex */
    public class RunnableC0126 implements Runnable {

        /* renamed from: а  reason: contains not printable characters */
        final /* synthetic */ long f106;

        RunnableC0126(long j) {
            this.f106 = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                int i = C0135.m125();
                if (i == 2) {
                    StrategyCenter.f95.postDelayed(this, 3000L);
                } else {
                    String str = "[StrategyCenter][processFCContent] start activity-timeout-check: backgroudState=" + i + " app not in background we start check now";
                    StrategyCenter.this.f100.clearTimeoutItem(this.f106);
                }
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.alibaba.wireless.security.middletierplugin.open.fc.strategy.StrategyCenter$в  reason: contains not printable characters */
    /* loaded from: classes.dex */
    public class RunnableC0127 implements Runnable {

        /* renamed from: а  reason: contains not printable characters */
        final /* synthetic */ long f108;

        /* renamed from: б  reason: contains not printable characters */
        final /* synthetic */ boolean f109;

        /* renamed from: в  reason: contains not printable characters */
        final /* synthetic */ String f110;

        /* renamed from: г  reason: contains not printable characters */
        final /* synthetic */ boolean f111;

        /* renamed from: д  reason: contains not printable characters */
        final /* synthetic */ int f112;

        RunnableC0127(long j, boolean z, String str, boolean z2, int i) {
            this.f108 = j;
            this.f109 = z;
            this.f110 = str;
            this.f111 = z2;
            this.f112 = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (StrategyCenter.f94) {
                String str = "[StrategyCenter][processFCContent] api-timeout-thread: check enter and sessionId=" + this.f108;
                if (StrategyCenter.f93 != null && StrategyCenter.f93.containsKey(Long.valueOf(this.f108))) {
                    C0135.m134(this.f109, 4, this.f110);
                    StrategyCenter.m91(this.f108, 8, this.f111, null);
                    C0135.m136(AbstractC0141.f225, 0, 0L, "", "Apitimeout", "" + this.f112, "" + this.f108, this.f110, this.f109 ? 7 : 1, false);
                    String str2 = "[StrategyCenter][processFCContent] api-timeout-thread: SesseionID: " + this.f108 + "   BXUserReport: Apitimeout=";
                }
                C0135.m134(this.f109, 0, this.f110);
                int i = C0135.m133();
                if ((i == 6 || i == 7) && StrategyCenter.f97 < 10) {
                    StrategyCenter.f95.postDelayed(this, 3000L);
                    StrategyCenter.f97++;
                }
            }
        }
    }

    /* renamed from: com.alibaba.wireless.security.middletierplugin.open.fc.strategy.StrategyCenter$г  reason: contains not printable characters */
    /* loaded from: classes.dex */
    static class RunnableC0128 implements Runnable {

        /* renamed from: а  reason: contains not printable characters */
        final /* synthetic */ int f114;

        /* renamed from: б  reason: contains not printable characters */
        final /* synthetic */ long f115;

        /* renamed from: в  reason: contains not printable characters */
        final /* synthetic */ boolean f116;

        /* renamed from: г  reason: contains not printable characters */
        final /* synthetic */ HashMap f117;

        RunnableC0128(int i, long j, boolean z, HashMap hashMap) {
            this.f114 = i;
            this.f115 = j;
            this.f116 = z;
            this.f117 = hashMap;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (StrategyCenter.f94) {
                try {
                    if (this.f114 == 1) {
                        if (Build.VERSION.SDK_INT < 21) {
                            CookieSyncManager.getInstance().sync();
                        } else {
                            CookieManager.getInstance().flush();
                        }
                    }
                } catch (Exception e) {
                    String str = "[StrategyCenter][processStrategyList] CookieManager : " + e.getMessage();
                }
                StrategyCenter.m91(this.f115, this.f114, this.f116, this.f117);
            }
        }
    }

    public StrategyCenter(Context context, HashMap hashMap) {
        this.f99 = null;
        this.f100 = null;
        this.f103 = 0L;
        this.f104 = 0;
        this.f99 = context;
        try {
            f93 = new HashMap<>();
            this.f100 = C0133.m118(context.getApplicationContext());
            HandlerThread handlerThread = new HandlerThread("FC-StrategyCenter");
            handlerThread.start();
            f95 = new Handler(handlerThread.getLooper());
            if (hashMap != null && hashMap.containsKey(this.f101)) {
                C0139.m143(((Boolean) hashMap.get(this.f101)).booleanValue());
            }
            f95.postDelayed(new RunnableC0125(), 10000L);
        } catch (Exception e) {
            this.f104 = SecExceptionCode.SEC_ERROR_MIDDLE_TIER_INIT_FAILED;
            String message = e.getMessage();
            StringBuilder sb = new StringBuilder();
            sb.append("mUIBrige=");
            String str = "0";
            sb.append(this.f100 == null ? str : "1");
            sb.append(",mHandler=");
            sb.append(f95 != null ? "1" : str);
            C0135.m136(AbstractC0141.f218, 0, 7L, message, "Strategycenter", sb.toString(), C0139.m140() ? "true" : "false", "", 1, false);
        }
        this.f103 = System.currentTimeMillis();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: д  reason: contains not printable characters */
    public static void m90(long j, int i, boolean z, HashMap hashMap) {
        RunnableC0128 r6 = new RunnableC0128(i, j, z, hashMap);
        Handler handler = f95;
        if (handler != null) {
            handler.post(r6);
        }
    }

    /* renamed from: е  reason: contains not printable characters */
    static void m91(long j, int i, boolean z, HashMap hashMap) {
        StringBuilder sb;
        C0129.EnumC0130 r0;
        HashMap hashMap2 = hashMap;
        try {
            String str = "[StrategyCenter][processStrategyListLocked] enter sessionid=" + j + " and uiResult=" + i + " processAll=" + z + " extraInfo=" + hashMap2;
            String str2 = " mAction=";
            String str3 = "result_extra";
            boolean z2 = true;
            if (!z) {
                C0132 r11 = f93.get(Long.valueOf(j));
                if (r11 == null || r11.m95(true)) {
                    sb = new StringBuilder();
                    sb.append("[StrategyCenter][processStrategyListLocked] Error: not find the sessionId=");
                    sb.append(j);
                    sb.append(" to process single one");
                } else {
                    String str4 = "[StrategyCenter][processStrategyListLocked] find the sessionId=" + j + " and process single one";
                    C0129.EnumC0130 r1 = C0129.EnumC0130.FAIL;
                    if (i == 1) {
                        C0142.m145(AbstractC0141.f229);
                        r0 = r11.m117();
                    } else if (i == 4) {
                        C0142.m145(AbstractC0141.f230);
                        r0 = C0129.EnumC0130.CANCEL;
                    } else if (i == 8) {
                        C0142.m145(AbstractC0141.f232);
                        r0 = C0129.EnumC0130.TIMEOUT;
                    } else {
                        C0142.m145(AbstractC0141.f231);
                        r0 = C0129.EnumC0130.FAIL;
                    }
                    if (hashMap != null) {
                        r11.m102().put(str3, hashMap);
                    }
                    String str5 = "[StrategyCenter][processStrategyListLocked] onStrategy3 sessionId=" + j + str2 + r11.m117() + " subAction=" + r11.m101() + " extra=" + r11.m102();
                    r11.m105().onStrategy(j, r0, r11.m101(), r11.m102());
                    if (r11.m115()) {
                        C0135.m136(AbstractC0141.f227, 0, 0L, "", "Processstrategylistlockedonatrategysingleself", "" + r0.m92() + "|" + r11.m101() + "|" + (r11.m102() == null ? "" : r11.m102().toString()), "" + j, r11.m99(), r11.m113() ? 7 : 1, true);
                        String str6 = "[StrategyCenter][processStrategyListLocked] SesseionID: " + j + "   BXUserReport: Processstrategylistlockedonatrategysingleself";
                    }
                    C0142.m145(AbstractC0141.f227);
                    f93.remove(Long.valueOf(j));
                    return;
                }
            } else if (f93.get(Long.valueOf(j)) != null) {
                String str7 = "[StrategyCenter][processStrategyListLocked] find the sessionId=" + j + " and process all session";
                Iterator<Long> it = f93.keySet().iterator();
                while (it.hasNext()) {
                    Long next = it.next();
                    C0132 r14 = f93.get(next);
                    String str8 = "[StrategyCenter][processStrategyListLocked] key=" + next;
                    if (!r14.m95(z2)) {
                        C0129.EnumC0130 r112 = C0129.EnumC0130.FAIL;
                        if (i == z2) {
                            C0142.m145(AbstractC0141.f229);
                            r112 = r14.m117();
                        } else if (i == 4) {
                            C0142.m145(AbstractC0141.f230);
                            r112 = C0129.EnumC0130.CANCEL;
                        } else if (i == 8) {
                            C0142.m145(AbstractC0141.f232);
                            r112 = C0129.EnumC0130.TIMEOUT;
                        } else {
                            C0142.m145(AbstractC0141.f231);
                        }
                        if (hashMap2 != null) {
                            r14.m102().put(str3, hashMap2);
                        }
                        if (i != z2) {
                            C0139.m142(r14);
                        }
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("[StrategyCenter][processStrategyListLocked] onStrategy1 key=");
                        sb2.append(next);
                        sb2.append(str2);
                        sb2.append(r112);
                        sb2.append(" item=");
                        str2 = str2;
                        str3 = str3;
                        sb2.append(r14.m101());
                        sb2.append(" extra=");
                        sb2.append(r14.m102());
                        sb2.toString();
                        r14.m105().onStrategy(next.longValue(), r112, r14.m101(), r14.m102());
                        if (r14.m115()) {
                            String hashMap3 = r14.m102() == null ? "" : r14.m102().toString();
                            String str9 = next.longValue() == j ? "Processstrategylistlockedonstrategyallself" : "Processstrategylistlockedonstrategyallother";
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append("");
                            sb3.append(r112.m92());
                            sb3.append("|");
                            it = it;
                            sb3.append(r14.m101());
                            sb3.append("|");
                            sb3.append(hashMap3);
                            C0135.m136(AbstractC0141.f227, 0, 0L, "", str9, sb3.toString(), "" + j, r14.m99(), r14.m113() ? 7 : 1, true);
                            String str10 = "[StrategyCenter][processStrategyListLocked] SesseionID: " + j + "   BXUserReport: Processstrategylistlockedonstrategyallself";
                        } else {
                            it = it;
                        }
                        C0142.m145(AbstractC0141.f227);
                    } else {
                        it = it;
                        str2 = str2;
                        str3 = str3;
                    }
                    hashMap2 = hashMap;
                    z2 = true;
                }
                f93.clear();
                return;
            } else {
                C0142.m145(AbstractC0141.f222);
                sb = new StringBuilder();
                sb.append("[StrategyCenter][processStrategyListLocked] Error: not find the sessionId=");
                sb.append(j);
                sb.append(" to process all");
            }
            sb.toString();
        } catch (Exception e) {
            C0135.m136(AbstractC0141.f222, SecExceptionCode.SEC_ERROR_MIDDLE_TIER_INIT_FAILED, 0L, "" + e.getMessage(), "Processstrategylistlockedexception", null, "" + j, null, 3, false);
            String str11 = "[StrategyCenter][processStrategyListLocked] Exception SesseionID: " + j + "   BXUserReport: Processstrategylistlockedexception";
            String str12 = "[StrategyCenter][processStrategyListLocked] Exception=" + e.getMessage();
            C0142.m145(AbstractC0141.f222);
            f93.clear();
        }
    }

    public boolean needFCProcessOrNot(int i, HashMap hashMap) {
        return i == C0137.EnumC0138.NC.m137() || i == C0137.EnumC0138.FL.m137() || i == C0137.EnumC0138.SG.m137();
    }

    public boolean needFCProcessOrNotV2(int i, String str) {
        if (str == null || str.length() <= 0) {
            return false;
        }
        try {
            int i2 = new JSONObject(str).getInt("httpCode");
            if (!(i2 == C0137.EnumC0138.NC.m137() || i2 == C0137.EnumC0138.FL.m137())) {
                if (i2 != C0137.EnumC0138.SG.m137()) {
                    return false;
                }
            }
            return true;
        } catch (Exception e) {
            String str2 = "needFCProcessOrNot Exception: " + e.getMessage();
            return false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00c8, code lost:
        if (com.alibaba.wireless.security.middletierplugin.open.fc.C0139.m140() == false) goto L_0x00d2;
     */
    /* JADX WARN: Removed duplicated region for block: B:116:0x038c A[Catch: Exception -> 0x0393, TRY_ENTER, TRY_LEAVE, TryCatch #8 {Exception -> 0x0393, blocks: (B:108:0x02f1, B:116:0x038c), top: B:158:0x02f1 }] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x03a9  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x03ac  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x03fa  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x03fd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void processFCContent(int r32, java.util.HashMap r33, com.alibaba.wireless.security.middletierplugin.open.fc.strategy.IStrategyCallback r34, int r35) {
        /*
            Method dump skipped, instructions count: 1057
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.wireless.security.middletierplugin.open.fc.strategy.StrategyCenter.processFCContent(int, java.util.HashMap, com.alibaba.wireless.security.middletierplugin.open.fc.strategy.IStrategyCallback, int):void");
    }

    public void processFCContentV2(String str, IStrategyCallback iStrategyCallback) {
        if (str != null && str.length() > 0) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                int i = jSONObject.getInt("httpCode");
                String string = jSONObject.getString("header");
                if (string != null) {
                    processFCContent(i, C0139.m138(new JSONObject(string)), iStrategyCallback, 0);
                }
            } catch (Exception e) {
                String str2 = "[StrategyCenter][processFCContentV2] Exception: " + e.getMessage();
            }
        }
    }
}
