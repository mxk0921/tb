package tb;

import android.net.Uri;
import android.taobao.windvane.extra.performance2.WVWPData;
import android.text.TextUtils;
import anet.channel.util.HttpConstant;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.phenix.compat.stat.TBImageFlowMonitor;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Pattern;
import tb.csw;
import tb.orw;
import tb.qrw;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class rrw implements csw, hqw, srw {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final long b;
    public final boolean h;

    /* renamed from: a  reason: collision with root package name */
    public boolean f27575a = true;
    public long c = 0;
    public boolean d = false;
    public String e = "";
    public final HashSet<String> f = new HashSet<>();
    public final ConcurrentHashMap<String, qrw> g = new ConcurrentHashMap<>();

    static {
        t2o.a(989856342);
        t2o.a(989856346);
        t2o.a(989856317);
        t2o.a(989856343);
    }

    public rrw() {
        this.b = 0L;
        this.h = false;
        this.b = System.currentTimeMillis();
        this.h = true;
    }

    public static boolean b(String str, String str2, Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("17c24bae", new Object[]{str, str2, num})).booleanValue();
        }
        boolean z = d().isErrorBlacklist;
        for (orw.a aVar : d().errorRule) {
            String str3 = aVar.url;
            if (!(str3 == null || str == null)) {
                if (aVar.urlPattern == null) {
                    aVar.urlPattern = Pattern.compile(str3);
                }
                if (!aVar.urlPattern.matcher(str).matches()) {
                    continue;
                }
            }
            String str4 = aVar.msg;
            if (!(str4 == null || str2 == null)) {
                if (aVar.msgPattern == null) {
                    aVar.msgPattern = Pattern.compile(str4);
                }
                if (!aVar.msgPattern.matcher(str2).matches()) {
                    continue;
                }
            }
            if (TextUtils.isEmpty(aVar.code) || num == null || aVar.code.equals(num.toString())) {
                return !z;
            }
        }
        return z;
    }

    public static orw d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (orw) ipChange.ipc$dispatch("95fbbcc", new Object[0]);
        }
        return prw.getInstance().config;
    }

    @Override // tb.srw
    public void WebViewWrapType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e985e08e", new Object[]{this, str});
            return;
        }
        if (TextUtils.isEmpty(str)) {
            str = "UnKnow";
        }
        y71.commitWVWrapType(str);
    }

    public final boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("be2ff757", new Object[]{this, str})).booleanValue();
        }
        if (!g() || str == null || h(str)) {
            return false;
        }
        return true;
    }

    @Override // tb.srw
    public void commitCoreInitTime(long j, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62851eb4", new Object[]{this, new Long(j), str});
            return;
        }
        if (TextUtils.isEmpty(str)) {
            str = "UnKnow";
        }
        y71.commitCoreInitTime(j, str);
    }

    @Override // tb.srw
    public void commitCoreTypeByPV(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee480cbc", new Object[]{this, str, str2, str3, str4});
            return;
        }
        if (TextUtils.isEmpty("UnKnow")) {
            str = "UnKnow";
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = "UnKnow";
        }
        y71.commitCoreTypeByPV(str, str2, str3, str4);
    }

    @Override // tb.srw
    public void commitUseWebgl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ff54e1a", new Object[]{this, str});
        } else {
            y71.commitUseWebgl(str);
        }
    }

    @Override // tb.srw
    public void commitWebMultiType(String str, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a0d02a7", new Object[]{this, str, new Integer(i), new Integer(i2)});
        } else {
            y71.commitRenderType(str, i, i2, String.valueOf(yaa.k));
        }
    }

    @Override // tb.srw
    public void commitWebMultiTypeByPV(String str, String str2, String str3, String str4, String str5, String str6) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2dbf54f6", new Object[]{this, str, str2, str3, str4, str5, str6});
            return;
        }
        y71.commitRenderTypeByPV(str, str2, str3, str4, str5, str6);
        v7t.d("WVMonitor", "UC Multi: initRenderType = [" + str + "], successRenderType = [" + str2 + "], renderTypeReason = [" + str3 + "], initGpuType = [" + str4 + "], successGpuType = [" + str5 + "],gpuTypeReason = [" + str6 + "]");
    }

    @Override // tb.srw
    public void commitWhitePageData(WVWPData wVWPData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63a2f7a3", new Object[]{this, wVWPData});
        }
    }

    @Override // tb.csw
    public void didExitAtTime(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f47376", new Object[]{this, str, new Long(j)});
        } else {
            i(str, j, false);
        }
    }

    @Override // tb.csw
    public void didGetResourceStatusCode(String str, int i, int i2, Map<String, String> map, csw.a aVar) {
        qrw.b e;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96c5152d", new Object[]{this, str, new Integer(i), new Integer(i2), map, aVar});
        } else if (h(str)) {
            didGetPageStatusCode(str, i, i2, null, null, null, map, aVar);
        } else if (a(str) && (e = e(str)) != null) {
            e.fromType = i2;
            e.statusCode = i;
            if (map != null) {
                str2 = map.get(HttpConstant.VIA);
            } else {
                str2 = "";
            }
            e.via = str2;
            if (aVar != null && d().stat.netstat) {
                e.netStat = aVar;
            }
        }
    }

    @Override // tb.csw
    public void didGetResourceVerifyCode(String str, long j, long j2, int i, int i2) {
        qrw qrwVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4406529c", new Object[]{this, str, new Long(j), new Long(j2), new Integer(i), new Integer(i2)});
            return;
        }
        ConcurrentHashMap<String, qrw> concurrentHashMap = this.g;
        if (concurrentHashMap != null && (qrwVar = concurrentHashMap.get(this.e)) != null) {
            if (h(str)) {
                if (g() && str != null) {
                    qrw.c cVar = qrwVar.stat;
                    cVar.verifyResTime = j;
                    cVar.verifyTime = j2;
                    cVar.verifyError = i;
                } else {
                    return;
                }
            } else if (a(str)) {
                qrw.b e = e(str);
                e.verifyResTime = j;
                e.verifyTime = j2;
                e.verifyError = i;
            }
            qrw.c cVar2 = qrwVar.stat;
            cVar2.allVerifyTime += j2;
            cVar2.verifyCacheSize = i2;
        }
    }

    @Override // tb.csw
    public void didPageDomLoadAtTime(String str, long j) {
        ConcurrentHashMap<String, qrw> concurrentHashMap;
        qrw qrwVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf31f919", new Object[]{this, str, new Long(j)});
        } else if (g() && str != null && (concurrentHashMap = this.g) != null && (qrwVar = concurrentHashMap.get(str)) != null) {
            long j2 = qrwVar.startTime;
            if (j2 > 0) {
                long j3 = j - j2;
                if (j3 >= d().stat.onDomLoad) {
                    qrwVar.stat.onDomLoad = j3;
                }
            }
        }
    }

    @Override // tb.csw
    public void didPageOccurSelfDefinedEvent(String str, String str2, long j) {
        ConcurrentHashMap<String, qrw> concurrentHashMap;
        qrw qrwVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("934145ee", new Object[]{this, str, str2, new Long(j)});
        } else if (g() && str != null && (concurrentHashMap = this.g) != null && (qrwVar = concurrentHashMap.get(str)) != null) {
            v7t.a("WVMonitor", "domLoad: ".concat(str));
            if (qrwVar.startTime > 0) {
                Map<String, Long> map = qrwVar.args.selfDefine;
                for (Map.Entry<String, Long> entry : map.entrySet()) {
                    map.put(entry.getKey(), Long.valueOf(entry.getValue().longValue() - qrwVar.startTime));
                }
            }
        }
    }

    @Override // tb.csw
    public void didPagePerformanceInfo(String str, String str2) {
        qrw qrwVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b69b858b", new Object[]{this, str, str2});
            return;
        }
        ConcurrentHashMap<String, qrw> concurrentHashMap = this.g;
        if (concurrentHashMap != null && (qrwVar = concurrentHashMap.get(str)) != null) {
            qrwVar.performanceInfo = str2;
        }
    }

    @Override // tb.csw
    public void didPageReceiveFirstByteAtTime(String str, long j) {
        ConcurrentHashMap<String, qrw> concurrentHashMap;
        qrw qrwVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23bd7370", new Object[]{this, str, new Long(j)});
        } else if (g() && str != null && (concurrentHashMap = this.g) != null && (qrwVar = concurrentHashMap.get(str)) != null) {
            v7t.a("WVMonitor", "domLoad: ".concat(str));
            long j2 = qrwVar.startTime;
            if (j2 > 0) {
                qrwVar.stat.firstByteTime = j - j2;
            }
        }
    }

    @Override // tb.csw
    public void didPageStartInFSP(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2a9a29", new Object[]{this, str, new Long(j)});
        } else {
            y71.commitFSPInfo(str, j);
        }
    }

    @Override // tb.csw
    public void didPageStartLoadAtTime(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59da2279", new Object[]{this, str, new Long(j)});
        } else if (g() && str != null && Uri.parse(str) != null && Uri.parse(str).isHierarchical()) {
            v7t.a("WVMonitor", "pageStart: ".concat(str));
            qrw f = f(str);
            if (f != null) {
                f.startTime = j;
                f.url = str;
            }
        }
    }

    @Override // tb.csw
    public void didPerformanceCheckResult(String str, long j, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf89381d", new Object[]{this, str, new Long(j), str2, str3, str4});
        } else {
            y71.commitWebPerfCheckInfo(str, j, str2, str3, str4);
        }
    }

    @Override // tb.csw
    public void didResourceFinishLoadAtTime(String str, long j, String str2, long j2) {
        qrw qrwVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4363c6d", new Object[]{this, str, new Long(j), str2, new Long(j2)});
            return;
        }
        ConcurrentHashMap<String, qrw> concurrentHashMap = this.g;
        if (concurrentHashMap != null && (qrwVar = concurrentHashMap.get(this.e)) != null) {
            try {
                if (a(str)) {
                    qrw.b e = e(str);
                    e.end = j - qrwVar.startTime;
                    e.protocolType = str2;
                    e.tcpTime = j2;
                } else if (h(str)) {
                    qrwVar.protocolType = str2;
                }
            } catch (Exception e2) {
                v7t.n("WVMonitor", "didResourceFinishLoadAtTime Exception : " + e2.getMessage());
            }
        }
    }

    @Override // tb.csw
    public void didResourceStartLoadAtTime(String str, long j) {
        qrw qrwVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49316538", new Object[]{this, str, new Long(j)});
            return;
        }
        ConcurrentHashMap<String, qrw> concurrentHashMap = this.g;
        if (concurrentHashMap != null && (qrwVar = concurrentHashMap.get(this.e)) != null) {
            try {
                if (a(str)) {
                    e(str).start = j - qrwVar.startTime;
                }
            } catch (Exception e) {
                v7t.n("WVMonitor", "didResourceStartLoadAtTime Exception : " + e.getMessage());
            }
        }
    }

    @Override // tb.csw
    public void didWebViewInitAtTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aec56853", new Object[]{this, new Long(j)});
        } else if (g()) {
            this.d = true;
            this.c = j;
        }
    }

    public final qrw.b e(String str) {
        qrw qrwVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qrw.b) ipChange.ipc$dispatch("5231dc3a", new Object[]{this, str});
        }
        ConcurrentHashMap<String, qrw> concurrentHashMap = this.g;
        if (concurrentHashMap == null || (qrwVar = concurrentHashMap.get(this.e)) == null) {
            return null;
        }
        qrw.b bVar = qrwVar.args.resStat.get(str);
        if (bVar != null) {
            return bVar;
        }
        qrw.b createNewResStatInstance = qrw.createNewResStatInstance();
        qrwVar.args.resStat.put(str, createNewResStatInstance);
        return createNewResStatInstance;
    }

    public final qrw f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qrw) ipChange.ipc$dispatch("77b26550", new Object[]{this, str});
        }
        ConcurrentHashMap<String, qrw> concurrentHashMap = this.g;
        if (concurrentHashMap == null) {
            return null;
        }
        qrw qrwVar = concurrentHashMap.get(str);
        if (qrwVar == null) {
            synchronized (rrw.class) {
                if (qrwVar == null) {
                    try {
                        v7t.i("WVMonitor", "monitor data init");
                        qrwVar = new qrw();
                        this.e = str;
                        this.g.put(str, qrwVar);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
        return qrwVar;
    }

    public final boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56f023c2", new Object[]{this})).booleanValue();
        }
        if (yaa.n == null) {
            return false;
        }
        return this.h;
    }

    public final boolean h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b06ae0ae", new Object[]{this, str})).booleanValue();
        }
        if (this.g == null) {
            return false;
        }
        return c(this.e).equals(c(str));
    }

    public final void i(String str, long j, boolean z) {
        ConcurrentHashMap<String, qrw> concurrentHashMap;
        qrw qrwVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa36fce3", new Object[]{this, str, new Long(j), new Boolean(z)});
        } else if (g() && str != null && (concurrentHashMap = this.g) != null && (qrwVar = concurrentHashMap.get(str)) != null) {
            v7t.a("WVMonitor", "pageFinish: ".concat(str));
            long j2 = qrwVar.startTime;
            if (j2 > 0) {
                long j3 = j - j2;
                try {
                    v7t.a("WVMonitor", "url: ".concat(str) + " onLoad time :" + j3);
                    orw d = d();
                    if (d != null && g() && j3 >= d.stat.onLoad) {
                        qrw.c cVar = qrwVar.stat;
                        cVar.onLoad = j3;
                        cVar.finish = z ? 1 : 0;
                        try {
                            Uri parse = Uri.parse(str);
                            if (parse != null && parse.isHierarchical()) {
                                String queryParameter = parse.getQueryParameter("wvAppMonitor");
                                if (!TextUtils.isEmpty(queryParameter)) {
                                    qrwVar.wvAppMonitor = Integer.valueOf(queryParameter).intValue();
                                }
                            }
                        } catch (Exception unused) {
                        }
                        j(str);
                    }
                } catch (Exception unused2) {
                }
            }
            this.g.remove(str);
        }
    }

    public static String c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fdc78937", new Object[]{str});
        }
        if (str == null) {
            return null;
        }
        int indexOf = str.indexOf(63);
        if (indexOf <= 0) {
            indexOf = str.length();
        }
        int indexOf2 = str.indexOf(35);
        if (indexOf2 <= 0) {
            indexOf2 = str.length();
        }
        if (indexOf >= indexOf2) {
            indexOf = indexOf2;
        }
        return str.substring(0, indexOf);
    }

    @Override // tb.csw
    public void didGetPageStatusCode(String str, int i, int i2, String str2, String str3, String str4, Map<String, String> map, csw.a aVar) {
        qrw f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47b2a30c", new Object[]{this, str, new Integer(i), new Integer(i2), str2, str3, str4, map, aVar});
        } else if (g() && str != null && (f = f(str)) != null) {
            qrw.a aVar2 = f.args;
            aVar2.netStat = aVar;
            if (i > 0) {
                aVar2.statusCode = i;
            }
            if (i2 > 1) {
                qrw.c cVar = f.stat;
                if (cVar.fromType <= 1) {
                    cVar.fromType = i2;
                }
            }
            if (!TextUtils.isEmpty(str2)) {
                f.stat.packageAppVersion = str2;
            }
            if (map != null) {
                f.args.via = map.get(TBImageFlowMonitor.VIA);
            }
            if (!TextUtils.isEmpty(str3)) {
                f.stat.packageAppName = str3;
            }
            if (!TextUtils.isEmpty(str4)) {
                f.stat.appSeq = str4;
            }
        }
    }

    @Override // tb.hqw
    public void didOccurJSError(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8eb4f5a1", new Object[]{this, str, str2, str3, str4});
        } else if (g() && str != null && str2 != null && str4 != null && str3 != null) {
            v7t.a("WVMonitor", "reportJsError: " + str + " ///// " + str3 + " ///// " + str2 + " ///// " + str4);
            if (b(str, str2, null)) {
                y71.commitFail(y71.JS_ERROR_POINT, 1, "message=" + str2 + "\nline=" + str4 + "\nfile=" + str3, str);
            }
        }
    }

    @Override // tb.csw
    public void didPageFinishLoadAtTime(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f096138c", new Object[]{this, str, new Long(j)});
        } else if (str != null && Uri.parse(str) != null && Uri.parse(str).isHierarchical()) {
            i(str, j, true);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0059, code lost:
        if (r8.onLoad == 0) goto L_0x0062;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j(java.lang.String r13) {
        /*
            Method dump skipped, instructions count: 242
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.rrw.j(java.lang.String):void");
    }

    @Override // tb.hqw
    public void didOccurNativeError(String str, int i, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74fdf518", new Object[]{this, str, new Integer(i), str2});
        } else if (g() && str != null && str2 != null) {
            v7t.a("WVMonitor", String.format("reportNativeError: %s ///// %s ///// %d", str, str2, Integer.valueOf(i)));
            if (g() && b(str, str2, Integer.valueOf(i))) {
                y71.commitFail(y71.NATIVE_ERROR_POINT, i, String.format("message=%s\ncode=%d", str2, Integer.valueOf(i)), str);
            }
        }
    }
}
