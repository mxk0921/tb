package tb;

import com.alipay.android.msp.constants.MspGlobalDefine;
import com.alipay.android.msp.framework.db.MspDBHelper;
import com.android.alibaba.ip.runtime.IpChange;
import com.ut.mini.UTAnalytics;
import com.ut.mini.UTTracker;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class dcu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static dcu f17731a;
    public static final UTTracker b = UTAnalytics.getInstance().getDefaultTracker();

    static {
        t2o.a(79691897);
    }

    public static dcu a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dcu) ipChange.ipc$dispatch("aa0489e5", new Object[0]);
        }
        if (f17731a == null) {
            synchronized (dcu.class) {
                try {
                    if (f17731a == null) {
                        f17731a = new dcu();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f17731a;
    }

    public void b(b25 b25Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("deb2ffa8", new Object[]{this, b25Var});
        } else if (b25Var == null || !b25Var.a()) {
            ck.g().e("TrackerReporter.reportCustom:model invalid");
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put("sampling", String.valueOf(b25Var.e));
            hashMap.put(MspDBHelper.BizEntry.COLUMN_NAME_PID, b25Var.f);
            hashMap.put("type", b25Var.d);
            hashMap.put("code", b25Var.k);
            hashMap.put("message", b25Var.g);
            Boolean bool = b25Var.l;
            if (bool != null) {
                hashMap.put("success", String.valueOf(bool));
            }
            Integer num = b25Var.m;
            if (num != null) {
                hashMap.put("branch", String.valueOf(num));
            }
            String str = b25Var.n;
            String str2 = "";
            if (str == null) {
                str = str2;
            }
            hashMap.put(iiz.PERF_STAG_TOTAL, str);
            hashMap.put("timing", String.valueOf(b25Var.h));
            String str3 = b25Var.o;
            if (str3 == null) {
                str3 = str2;
            }
            hashMap.put("d1", str3);
            String str4 = b25Var.p;
            if (str4 == null) {
                str4 = str2;
            }
            hashMap.put("d2", str4);
            String str5 = b25Var.q;
            if (str5 == null) {
                str5 = str2;
            }
            hashMap.put("c1", str5);
            String str6 = b25Var.r;
            if (str6 == null) {
                str6 = str2;
            }
            hashMap.put("c2", str6);
            String str7 = b25Var.s;
            if (str7 == null) {
                str7 = str2;
            }
            hashMap.put("c3", str7);
            String str8 = b25Var.t;
            if (str8 == null) {
                str8 = str2;
            }
            hashMap.put("c4", str8);
            String str9 = b25Var.u;
            if (str9 == null) {
                str9 = str2;
            }
            hashMap.put("c5", str9);
            String str10 = b25Var.i;
            if (str10 == null) {
                str10 = str2;
            }
            hashMap.put("collection_url", str10);
            String str11 = b25Var.j;
            if (str11 != null) {
                str2 = str11;
            }
            hashMap.put(MspGlobalDefine.UA, str2);
            b.send(new UTOriginalCustomHitBuilder(b25Var.f31006a, 19999, "/jstracker.3", b25Var.b, b25Var.c, hashMap).build());
        }
    }

    public void c(fi8 fi8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eef7a49c", new Object[]{this, fi8Var});
        } else if (fi8Var == null || !fi8Var.a()) {
            ck.g().e("TrackerReporter.reportError:model invalid");
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put("sampling", String.valueOf(fi8Var.e));
            hashMap.put(MspDBHelper.BizEntry.COLUMN_NAME_PID, fi8Var.f);
            hashMap.put("type", fi8Var.d);
            hashMap.put("message", fi8Var.g);
            String str = fi8Var.k;
            String str2 = "";
            if (str == null) {
                str = str2;
            }
            hashMap.put("fileName", str);
            String str3 = fi8Var.l;
            if (str3 == null) {
                str3 = str2;
            }
            hashMap.put(pg1.ATOM_stack, str3);
            String str4 = fi8Var.m;
            if (str4 == null) {
                str4 = str2;
            }
            hashMap.put(pg1.ATOM_lineNumber, str4);
            String str5 = fi8Var.n;
            if (str5 == null) {
                str5 = str2;
            }
            hashMap.put("columnNumber", str5);
            String str6 = fi8Var.i;
            if (str6 == null) {
                str6 = str2;
            }
            hashMap.put("collection_url", str6);
            String str7 = fi8Var.j;
            if (str7 != null) {
                str2 = str7;
            }
            hashMap.put(MspGlobalDefine.UA, str2);
            b.send(new UTOriginalCustomHitBuilder(fi8Var.f31006a, 19999, "/jstracker.3", fi8Var.b, fi8Var.c, hashMap).build());
        }
    }

    public void d(cyl cylVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53ddb8dc", new Object[]{this, cylVar});
        } else if (cylVar == null || !cylVar.a()) {
            ck.g().e("TrackerReporter.reportPerformance:model invalid");
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put("type", cylVar.d);
            hashMap.put("message", cylVar.g);
            b.send(new UTOriginalCustomHitBuilder(cylVar.f31006a, 19999, "/jstracker.3", cylVar.b, cylVar.c, hashMap).build());
        }
    }
}
