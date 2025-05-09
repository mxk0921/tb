package com.alipay.android.msp.framework.statisticsv2.model;

import android.os.SystemClock;
import android.text.TextUtils;
import com.alipay.android.msp.framework.statisticsv2.Grammar;
import com.alipay.android.msp.utils.LogUtil;
import com.alipay.android.msp.utils.ThreadSafeDateFormat;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import tb.f7l;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class StEvent implements IModel, IUpdateContinuous {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ACTION = "action";
    public static final String ACTION_TYPE = "actionType";
    public static final String CONTENT_IGNORE = "";
    public static final String CONVERT_TIME = "convertTime";
    public static final String CURRENT_VIEW = "currentView";
    public static final String EVENT_TIME = "eventTime";
    public static final String FILL_DATE_TIME = "fillDateTime";
    public static final String NET_COST = "netCost";
    public static final String PARSE_TIME = "parseTime";
    public static final String PRE_TIME = "preTime";
    public static final String RECV_MSG = "recvMsg";
    public static final String SEND_MSG = "sendMsg";
    public static final String SERVER_COST = "serverCost";
    public static final String SHOW_TIME = "showTime";
    public static final String SHOW_WIN = "showWin";

    /* renamed from: a  reason: collision with root package name */
    public long[] f3669a;
    public final Map<String, String> b;

    public StEvent() {
        this.b = new HashMap(32);
        updateEventTime();
    }

    public static String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7d5327ad", new Object[]{str});
        }
        if (str == null || !str.startsWith("QUICKPAY@")) {
            return str;
        }
        return str.replace("QUICKPAY@", "");
    }

    public static boolean c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("327e438f", new Object[]{str})).booleanValue();
        }
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, Grammar.ATTR_DEFAULT_VALUE)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x009d, code lost:
        if (r9.equals("action") == false) goto L_0x0028;
     */
    @Override // com.alipay.android.msp.framework.statisticsv2.model.IUpdateContinuous
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onStatistic(java.lang.String r9, java.lang.String r10) {
        /*
            Method dump skipped, instructions count: 442
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.android.msp.framework.statisticsv2.model.StEvent.onStatistic(java.lang.String, java.lang.String):void");
    }

    public void putInfo(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cdc14d78", new Object[]{this, str, str2});
        } else {
            this.b.put(str, str2);
        }
    }

    @Override // com.alipay.android.msp.framework.statisticsv2.model.IModel
    public Map<String, String> toMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("2dd9d11d", new Object[]{this});
        }
        return this.b;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder();
        for (String str : this.b.keySet()) {
            sb.append(f7l.BRACKET_START_STR + str + "," + this.b.get(str) + ") ");
        }
        return "StEvent{StInfo=" + sb.toString() + '}';
    }

    public void updateEventTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f328b45", new Object[]{this});
            return;
        }
        this.b.put(EVENT_TIME, ThreadSafeDateFormat.format(new Date(), "HH:mm:ss:SSS"));
        a("eventStart");
    }

    public StEvent clone() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (StEvent) ipChange.ipc$dispatch("4ec555c5", new Object[]{this}) : new StEvent(this);
    }

    public StEvent(String str, String str2, String str3) {
        HashMap hashMap = new HashMap(32);
        this.b = hashMap;
        hashMap.clear();
        hashMap.put(CURRENT_VIEW, b(str));
        hashMap.put("actionType", str2);
        hashMap.put("action", str3);
        updateEventTime();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void a(String str) {
        String str2;
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad732412", new Object[]{this, str});
            return;
        }
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1833086944:
                if (str.equals(PARSE_TIME)) {
                    c = 0;
                    break;
                }
                break;
            case -1083976928:
                if (str.equals(CONVERT_TIME)) {
                    c = 1;
                    break;
                }
                break;
            case -338830486:
                if (str.equals(SHOW_TIME)) {
                    c = 2;
                    break;
                }
                break;
            case 757421630:
                if (str.equals(FILL_DATE_TIME)) {
                    c = 3;
                    break;
                }
                break;
            case 973271528:
                if (str.equals("eventStart")) {
                    c = 4;
                    break;
                }
                break;
            case 1082770363:
                if (str.equals(RECV_MSG)) {
                    c = 5;
                    break;
                }
                break;
            case 1979896537:
                if (str.equals(SEND_MSG)) {
                    c = 6;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                this.f3669a[4] = SystemClock.elapsedRealtime();
                if (this.f3669a[3] != 0) {
                    StringBuilder sb = new StringBuilder();
                    long[] jArr = this.f3669a;
                    sb.append(jArr[4] - jArr[3]);
                    str2 = sb.toString();
                    str3 = str;
                    break;
                }
                str2 = null;
                str3 = str;
            case 1:
                this.f3669a[3] = SystemClock.elapsedRealtime();
                if (this.f3669a[2] != 0) {
                    StringBuilder sb2 = new StringBuilder();
                    long[] jArr2 = this.f3669a;
                    sb2.append(jArr2[3] - jArr2[2]);
                    str2 = sb2.toString();
                } else {
                    StringBuilder sb3 = new StringBuilder();
                    long[] jArr3 = this.f3669a;
                    sb3.append(jArr3[3] - jArr3[0]);
                    str2 = sb3.toString();
                }
                str3 = str;
                break;
            case 2:
                this.f3669a[6] = SystemClock.elapsedRealtime();
                if (this.f3669a[5] != 0) {
                    StringBuilder sb4 = new StringBuilder();
                    long[] jArr4 = this.f3669a;
                    sb4.append(jArr4[6] - jArr4[5]);
                    str2 = sb4.toString();
                    str3 = str;
                    break;
                }
                str2 = null;
                str3 = str;
            case 3:
                this.f3669a[5] = SystemClock.elapsedRealtime();
                if (this.f3669a[4] != 0) {
                    StringBuilder sb5 = new StringBuilder();
                    long[] jArr5 = this.f3669a;
                    sb5.append(jArr5[5] - jArr5[4]);
                    str2 = sb5.toString();
                    str3 = str;
                    break;
                }
                str2 = null;
                str3 = str;
            case 4:
                long[] jArr6 = new long[7];
                this.f3669a = jArr6;
                jArr6[0] = SystemClock.elapsedRealtime();
                str2 = null;
                str3 = str;
                break;
            case 5:
                this.f3669a[2] = SystemClock.elapsedRealtime();
                StringBuilder sb6 = new StringBuilder();
                long[] jArr7 = this.f3669a;
                sb6.append(jArr7[2] - jArr7[1]);
                str2 = sb6.toString();
                str3 = NET_COST;
                break;
            case 6:
                this.f3669a[1] = SystemClock.elapsedRealtime();
                StringBuilder sb7 = new StringBuilder();
                long[] jArr8 = this.f3669a;
                sb7.append(jArr8[1] - jArr8[0]);
                str2 = sb7.toString();
                str3 = PRE_TIME;
                break;
            default:
                str2 = null;
                str3 = str;
                break;
        }
        if (str2 != null) {
            this.b.put(str3, str2);
        }
    }

    public StEvent(StEvent stEvent) {
        HashMap hashMap = new HashMap(32);
        this.b = hashMap;
        if (stEvent != null) {
            try {
                long[] jArr = stEvent.f3669a;
                long[] jArr2 = new long[7];
                this.f3669a = jArr2;
                System.arraycopy(jArr, 0, jArr2, 0, jArr.length);
                Map<String, String> map = stEvent.toMap();
                hashMap.clear();
                if (map != null) {
                    for (Map.Entry<String, String> entry : map.entrySet()) {
                        this.b.put(entry.getKey(), entry.getValue());
                    }
                }
            } catch (Throwable th) {
                LogUtil.printExceptionStackTrace(th);
            }
        }
    }
}
