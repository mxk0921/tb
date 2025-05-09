package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class nyj {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_END_TYPE = "ndEndType";
    public static final String KEY_ERROR_MSG = "errMsg";
    public static final String KEY_RESULT_MSG = "resMsg";
    public static final String TAG = "NdMetric";
    public static final String TYPE_NATIVE_MAIN_PIC = "nativeMainPic";
    public static final String TYPE_ON_DESTROY = "onDestroy";
    public static final String TYPE_ON_PAGE_CHANGED = "onPageChanged";
    public static final String TYPE_VIDEO_COVER_PIC = "videoCoverPic";
    public static final String TYPE_VIDEO_FRAME_READY = "videoFrameReady";
    public static final String TYPE_WEEX_RENDER_SUCCESS = "weexRenderSuccess";
    public static volatile nyj d;

    /* renamed from: a  reason: collision with root package name */
    public final ConcurrentHashMap<String, iti> f25032a = new ConcurrentHashMap<>();
    public volatile zoc b;
    public boolean c;

    static {
        t2o.a(352321872);
    }

    public static void H() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62ea57a6", new Object[0]);
        } else {
            z();
        }
    }

    public static String x(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("31f9281c", new Object[]{new Integer(i)});
        }
        if (i == 1) {
            return "1st_ui_refresh";
        }
        if (i == 2) {
            return "2nd_ui_refresh";
        }
        if (i == 3) {
            return "3rd_ui_refresh";
        }
        return i + "_ui_refresh";
    }

    public static nyj z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nyj) ipChange.ipc$dispatch("bb879d26", new Object[0]);
        }
        if (d == null) {
            synchronized (nyj.class) {
                try {
                    if (d == null) {
                        d = new nyj();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return d;
    }

    public String A(String str) {
        zoc zocVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("dd060021", new Object[]{this, str});
        }
        if (str == null) {
            return "NoMeterIdNoNavToken";
        }
        iti itiVar = this.f25032a.get(str);
        if (itiVar == null || (zocVar = itiVar.f21574a) == null) {
            return "NoMeterIdNoHolder";
        }
        String h = zocVar.h();
        if (h != null) {
            return h;
        }
        return "NoMeterIdNull";
    }

    public String B(String str) {
        iti itiVar;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7a32dc30", new Object[]{this, str});
        }
        if (str == null || (itiVar = this.f25032a.get(str)) == null || (str2 = itiVar.f) == null) {
            return null;
        }
        return str2;
    }

    public void C(String str, fvh fvhVar, Long l) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7df6bbe4", new Object[]{this, str, fvhVar, l});
        } else if (str != null && l != null) {
            iti itiVar = new iti();
            zoc zocVar = this.b;
            zoc zocVar2 = null;
            if (zocVar == null) {
                zocVar = huh.h().c("NewDetailPage", "firstScreen", null);
            } else {
                this.b = null;
                txj.e(TAG, "hit meterServiceCache.");
            }
            itiVar.f21574a = zocVar;
            if (byj.e()) {
                txj.e(TAG, "downgradeVideoMetric。视频指标监测已降级。");
            } else {
                zocVar2 = huh.h().c("NewDetailPage", "videoFirstFrame", null);
                itiVar.b = zocVar2;
            }
            if (l.longValue() > 0) {
                itiVar.c = l.longValue();
                zocVar.m(l.longValue());
                zocVar.k("startTimeType", "navToUrlTime");
                if (zocVar2 != null) {
                    zocVar2.m(l.longValue());
                    zocVar2.k("startTimeType", "navToUrlTime");
                }
            } else {
                long g = cvh.g();
                l = Long.valueOf(g);
                itiVar.c = g;
                zocVar.m(g);
                zocVar.k("startTimeType", "ndNavTime");
                if (zocVar2 != null) {
                    zocVar2.m(g);
                    zocVar2.k("startTimeType", "ndNavTime");
                }
            }
            itiVar.d = str;
            if (fvhVar != null) {
                zocVar.r(fvhVar);
            }
            this.f25032a.put(str, itiVar);
            m(itiVar, l.longValue());
        }
    }

    public void D(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2accc451", new Object[]{this, str, new Boolean(z)});
        } else if (str != null) {
            iti itiVar = this.f25032a.get(str);
            if (!(itiVar == null || itiVar.f21574a == null)) {
                n(itiVar, z, cvh.g());
            }
            if (itiVar != null && itiVar.b != null) {
                o(itiVar, z, cvh.g());
            }
        }
    }

    public void F(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32653af8", new Object[]{this, str, str2});
        } else if (str != null) {
            iti itiVar = this.f25032a.get(str);
            i(itiVar, str2);
            j(itiVar, str2);
        }
    }

    public final void G(iti itiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f5eb141", new Object[]{this, itiVar});
            return;
        }
        long j = itiVar.k;
        if (j > 0) {
            long j2 = itiVar.j;
            if (j2 > 0) {
                itiVar.f21574a.k("paintOffset", Long.valueOf(j2 - j));
            }
        }
        long j3 = itiVar.k;
        if (j3 > 0) {
            long j4 = itiVar.i;
            if (j4 > 0) {
                itiVar.f21574a.k("weexOffset", Long.valueOf(j4 - j3));
            }
        }
    }

    public void I(String str, String str2) {
        zoc zocVar;
        zoc zocVar2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7fc225e4", new Object[]{this, str, str2});
        } else if (str != null && str2 != null) {
            iti itiVar = this.f25032a.get(str);
            if (!(itiVar == null || (zocVar2 = itiVar.f21574a) == null)) {
                zocVar2.b(str2);
            }
            if (itiVar != null && (zocVar = itiVar.b) != null) {
                zocVar.b(str2);
            }
        }
    }

    public void J(String str, Object obj, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e5dc130", new Object[]{this, str, obj, str2});
        } else if (str != null && obj != null && str2 != null) {
            zoc zocVar = this.b;
            if (zocVar == null) {
                txj.e(TAG, "endPreTask Error, meterService is null.");
            } else {
                zocVar.l(str, String.valueOf(obj), str2);
            }
        }
    }

    public void K(String str, String str2, Object obj, String str3) {
        iti itiVar;
        zoc zocVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75a64975", new Object[]{this, str, str2, obj, str3});
        } else if (str != null && str2 != null && obj != null && (itiVar = this.f25032a.get(str)) != null && (zocVar = itiVar.f21574a) != null) {
            zocVar.l(str2, String.valueOf(obj), str3);
        }
    }

    public void L(String str, fvh fvhVar) {
        zoc zocVar;
        zoc zocVar2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d99dac9f", new Object[]{this, str, fvhVar});
        } else if (str != null && fvhVar != null) {
            iti itiVar = this.f25032a.get(str);
            if (!(itiVar == null || (zocVar2 = itiVar.f21574a) == null)) {
                zocVar2.r(fvhVar);
            }
            if (itiVar != null && (zocVar = itiVar.b) != null) {
                zocVar.r(fvhVar);
            }
        }
    }

    public void M(String str, String str2, Object obj) {
        zoc zocVar;
        zoc zocVar2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b2f8a26", new Object[]{this, str, str2, obj});
        } else if (str != null && str2 != null && obj != null) {
            iti itiVar = this.f25032a.get(str);
            if (!(itiVar == null || (zocVar2 = itiVar.f21574a) == null)) {
                zocVar2.u(str2, obj);
            }
            if (itiVar != null && (zocVar = itiVar.b) != null) {
                zocVar.u(str2, obj);
            }
        }
    }

    public void N(String str, String str2, Object obj) {
        zoc zocVar;
        zoc zocVar2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58586427", new Object[]{this, str, str2, obj});
        } else if (str != null && str2 != null && obj != null) {
            iti itiVar = this.f25032a.get(str);
            if (!(itiVar == null || (zocVar2 = itiVar.f21574a) == null)) {
                zocVar2.k(str2, obj);
            }
            if (itiVar != null && (zocVar = itiVar.b) != null) {
                zocVar.k(str2, obj);
            }
        }
    }

    public void O(String str, String str2, Object obj, avh avhVar) {
        zoc zocVar;
        zoc zocVar2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d755c52", new Object[]{this, str, str2, obj, avhVar});
        } else if (str != null && str2 != null && obj != null) {
            iti itiVar = this.f25032a.get(str);
            if (!(itiVar == null || (zocVar2 = itiVar.f21574a) == null)) {
                zocVar2.s(str2, obj, avhVar);
            }
            if (itiVar != null && (zocVar = itiVar.b) != null) {
                zocVar.s(str2, obj, avhVar);
            }
        }
    }

    public void P(String str, String str2, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87a4acd0", new Object[]{this, str, str2, obj});
        } else if (str != null && str2 != null && obj != null) {
            h(this.f25032a.get(str), str2, obj);
        }
    }

    public void Q(String str, String str2) {
        iti itiVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b2395ae", new Object[]{this, str, str2});
        } else if (str != null && (itiVar = this.f25032a.get(str)) != null && itiVar.f == null) {
            itiVar.f = str2;
        }
    }

    public String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8e41af70", new Object[]{this, str});
        }
        boolean d2 = byj.d();
        this.c = d2;
        if (d2) {
            txj.e(TAG, "nd beginPreTask is downgrade.");
            return "downgradeTaskName";
        } else if (str == null) {
            return "nullTaskName";
        } else {
            zoc zocVar = this.b;
            if (zocVar == null) {
                zocVar = huh.h().c("NewDetailPage", "firstScreen", null);
                this.b = zocVar;
            }
            if (zocVar == null) {
                return "meterServiceNull";
            }
            return zocVar.p(str);
        }
    }

    public void b(String str, String str2) {
        iti itiVar;
        zoc zocVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cdb564f0", new Object[]{this, str, str2});
        } else if (str != null && str2 != null && (itiVar = this.f25032a.get(str)) != null && (zocVar = itiVar.f21574a) != null) {
            zocVar.g(str2);
        }
    }

    public void c(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9239eeca", new Object[]{this, str, str2});
        } else if (!this.c && str != null && str2 != null) {
            zoc zocVar = this.b;
            if (zocVar == null) {
                txj.e(TAG, "beginStageForPreTaskId Error, meterService is null.");
            } else {
                zocVar.i(str, str2);
            }
        }
    }

    public void d(String str, String str2, String str3) {
        iti itiVar;
        zoc zocVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9bfcdd79", new Object[]{this, str, str2, str3});
        } else if (str != null && str2 != null && str3 != null && (itiVar = this.f25032a.get(str)) != null && (zocVar = itiVar.f21574a) != null) {
            zocVar.i(str2, str3);
        }
    }

    public String e(String str, String str2) {
        zoc zocVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f28461d7", new Object[]{this, str, str2});
        }
        if (str == null || str2 == null) {
            return "nullTaskToken";
        }
        iti itiVar = this.f25032a.get(str);
        if (itiVar == null || (zocVar = itiVar.f21574a) == null) {
            return "noTaskBegin";
        }
        return zocVar.p(str2);
    }

    public String f(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d32664b3", new Object[]{this, str, str2});
        }
        if (this.c) {
            return "downgradeTaskToken";
        }
        if (str == null || str2 == null) {
            return "nullTaskToken";
        }
        zoc zocVar = this.b;
        if (zocVar != null) {
            return zocVar.c(str, str2);
        }
        txj.e(TAG, "beginTaskForPreParentTaskId Error, meterService is null.");
        return "nullService";
    }

    public void g(String str, String str2) {
        iti itiVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73742ee7", new Object[]{this, str, str2});
        } else if (str != null && str2 != null && (itiVar = this.f25032a.get(str)) != null && itiVar.b != null && !itiVar.p) {
            itiVar.b.g(str2);
        }
    }

    public final void h(iti itiVar, String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("339505bc", new Object[]{this, itiVar, str, obj});
        } else if (str != null && obj != null && itiVar != null && itiVar.f21574a != null && str.equals(KEY_END_TYPE)) {
            if (itiVar.e == null) {
                itiVar.e = obj;
                itiVar.f21574a.k(str, obj);
                txj.e(TAG, "NdEndType:First:" + obj);
                return;
            }
            txj.e(TAG, "NdEndType:Skip:" + obj);
        }
    }

    public void k(String str) {
        iti itiVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fdbce5d", new Object[]{this, str});
        } else if (str != null && (itiVar = this.f25032a.get(str)) != null && itiVar.f != null) {
            itiVar.f = "";
        }
    }

    public void l(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c60d430b", new Object[]{this, str});
        } else if (str != null) {
            iti itiVar = this.f25032a.get(str);
            if (!(itiVar == null || itiVar.f21574a == null)) {
                huh.h().f(itiVar.f21574a.h());
            }
            if (!(itiVar == null || itiVar.b == null)) {
                huh.h().f(itiVar.b.h());
            }
            this.f25032a.remove(str);
        }
    }

    public final void m(iti itiVar, long j) {
        zoc zocVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72ea212", new Object[]{this, itiVar, new Long(j)});
        } else if (itiVar != null && (zocVar = itiVar.f21574a) != null) {
            zocVar.d("biz_nav_pre", j);
            itiVar.f21574a.j("biz_nav_pre", true);
            itiVar.f21574a.g("biz_nav");
        }
    }

    public final void n(iti itiVar, boolean z, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fad67f15", new Object[]{this, itiVar, new Boolean(z), new Long(j)});
        } else if (!itiVar.o) {
            itiVar.o = true;
            G(itiVar);
            itiVar.f21574a.e(z, j, String.valueOf(itiVar.e));
        }
    }

    public final void o(iti itiVar, boolean z, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10e07ba", new Object[]{this, itiVar, new Boolean(z), new Long(j)});
        } else if (!itiVar.p && itiVar.b != null) {
            itiVar.p = true;
            itiVar.b.e(z, j, String.valueOf(itiVar.e));
        }
    }

    public void p(String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d22d4c", new Object[]{this, str, str2, new Boolean(z)});
        } else if (!this.c && str != null && str2 != null) {
            zoc zocVar = this.b;
            if (zocVar == null) {
                txj.e(TAG, "endPreTask Error, meterService is null.");
            } else {
                zocVar.f(str, z);
            }
        }
    }

    public void q(String str, String str2, boolean z) {
        iti itiVar;
        zoc zocVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40e47496", new Object[]{this, str, str2, new Boolean(z)});
        } else if (str != null && str2 != null && (itiVar = this.f25032a.get(str)) != null && (zocVar = itiVar.f21574a) != null) {
            zocVar.j(str2, z);
        }
    }

    public void r(String str, String str2, boolean z, long j) {
        iti itiVar;
        zoc zocVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dbaa94ee", new Object[]{this, str, str2, new Boolean(z), new Long(j)});
        } else if (str != null && str2 != null && (itiVar = this.f25032a.get(str)) != null && (zocVar = itiVar.f21574a) != null) {
            zocVar.o(str2, z, j);
        }
    }

    public void s(String str, boolean z, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73753850", new Object[]{this, str, new Boolean(z), str2});
        } else if (!this.c && str != null && str2 != null) {
            zoc zocVar = this.b;
            if (zocVar == null) {
                txj.e(TAG, "endStageForPreTaskId Error, meterService is null.");
            } else {
                zocVar.t(str, z, str2);
            }
        }
    }

    public void t(String str, String str2, boolean z, String str3) {
        iti itiVar;
        zoc zocVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb6aa9dd", new Object[]{this, str, str2, new Boolean(z), str3});
        } else if (str != null && str2 != null && str3 != null && (itiVar = this.f25032a.get(str)) != null && (zocVar = itiVar.f21574a) != null) {
            zocVar.t(str2, z, str3);
        }
    }

    public void u(String str, String str2, String str3, boolean z) {
        iti itiVar;
        zoc zocVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81686f4f", new Object[]{this, str, str2, str3, new Boolean(z)});
        } else if (str != null && str2 != null && str3 != null && (itiVar = this.f25032a.get(str)) != null && (zocVar = itiVar.f21574a) != null) {
            zocVar.f(str2, z);
        }
    }

    public void v(String str, String str2, boolean z, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6e2b0ff", new Object[]{this, str, str2, new Boolean(z), str3});
        } else if (!this.c && str2 != null && str != null) {
            zoc zocVar = this.b;
            if (zocVar == null) {
                txj.e(TAG, "beginTaskForPreParentTaskId Error, meterService is null.");
            } else {
                zocVar.v(str, z, str3);
            }
        }
    }

    public void w(String str, String str2, boolean z) {
        iti itiVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f979775b", new Object[]{this, str, str2, new Boolean(z)});
        } else if (str != null && str2 != null && (itiVar = this.f25032a.get(str)) != null && itiVar.b != null && !itiVar.p) {
            itiVar.b.j(str2, z);
        }
    }

    public iti y(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (iti) ipChange.ipc$dispatch("8abed268", new Object[]{this, str});
        }
        if (str == null) {
            return null;
        }
        return this.f25032a.get(str);
    }

    public final void j(iti itiVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f828230", new Object[]{this, itiVar, str});
        } else if (itiVar != null && itiVar.b != null && TYPE_VIDEO_FRAME_READY.equals(str)) {
            o(itiVar, true, cvh.g());
        }
    }

    public void E(iti itiVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9baefd6f", new Object[]{this, itiVar, new Long(j)});
        } else if (itiVar != null && itiVar.f21574a != null) {
            int i = itiVar.h + 1;
            itiVar.h = i;
            if (i == 1) {
                itiVar.j = j;
                itiVar.l = cvh.g();
                itiVar.j = j;
                itiVar.f21574a.k("paintEndTs", Long.valueOf(j));
                itiVar.f21574a.k("paintCallbackTs", Long.valueOf(itiVar.l));
            }
            if (!itiVar.m) {
                itiVar.f21574a.k("paintStopCount", Integer.valueOf(itiVar.h));
                itiVar.n = true;
            } else if (itiVar.h <= 1) {
                long j2 = itiVar.j;
                long j3 = itiVar.k;
                if (j2 < j3) {
                    itiVar.f21574a.o("first_paint_data", true, j3);
                    n(itiVar, false, itiVar.k);
                    return;
                }
                itiVar.f21574a.o("first_paint_data", true, j2);
                n(itiVar, true, itiVar.j);
            }
        }
    }

    public final void i(iti itiVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8d1d530", new Object[]{this, itiVar, str});
        } else if (itiVar != null && itiVar.f21574a != null) {
            if (TYPE_WEEX_RENDER_SUCCESS.equals(str)) {
                int i = itiVar.g + 1;
                itiVar.g = i;
                if (i == 1) {
                    long g = cvh.g();
                    itiVar.i = g;
                    itiVar.f21574a.k("weexEndTs", Long.valueOf(g));
                }
                txj.e(TAG, "weexStopCount:" + itiVar.g);
                if (!itiVar.m) {
                    itiVar.f21574a.k("weexStopCount", Integer.valueOf(itiVar.g));
                }
            } else if (!itiVar.m) {
                itiVar.m = true;
                long g2 = cvh.g();
                itiVar.k = g2;
                itiVar.f21574a.k("mainEndTs", Long.valueOf(g2));
                if (str != null) {
                    h(itiVar, KEY_END_TYPE, str);
                }
                if (itiVar.n) {
                    n(itiVar, false, itiVar.k);
                } else {
                    itiVar.f21574a.g("first_paint_data");
                }
            }
        }
    }
}
