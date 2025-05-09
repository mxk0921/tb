package com.taobao.taobaoavsdk.Tracer;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobaoavsdk.Tracer.BaseAnalysis;
import tb.iu0;
import tb.t2o;
import tb.z5r;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(774897851);
    }

    public static void a(BaseAnalysis baseAnalysis, boolean z, long j, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c287f69", new Object[]{baseAnalysis, new Boolean(z), new Long(j), new Integer(i)});
        } else if (baseAnalysis != null) {
            if (z) {
                BaseAnalysis.Stage stage = BaseAnalysis.Stage.FIRST_FRAME;
                f(baseAnalysis, stage.name(), String.valueOf(j));
                h(baseAnalysis, stage.name());
                return;
            }
            g(baseAnalysis, BaseAnalysis.Stage.FIRST_FRAME.name(), String.valueOf(i));
        }
    }

    public static void c(BaseAnalysis baseAnalysis) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("946912b", new Object[]{baseAnalysis});
        } else if (baseAnalysis != null) {
            baseAnalysis.k();
        }
    }

    public static void d(BaseAnalysis baseAnalysis, iu0 iu0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b6c26af", new Object[]{baseAnalysis, iu0Var});
        } else if (baseAnalysis != null) {
            baseAnalysis.o(iu0Var);
        }
    }

    public static void e(BaseAnalysis baseAnalysis, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62ba8c63", new Object[]{baseAnalysis, str, str2});
        } else if (baseAnalysis != null) {
            if (!TextUtils.isEmpty(str2)) {
                str = str + "_" + str2;
            }
            baseAnalysis.g(str);
        }
    }

    public static void f(BaseAnalysis baseAnalysis, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bb7efe", new Object[]{baseAnalysis, str, str2});
        } else if (baseAnalysis != null) {
            baseAnalysis.i(str, str2);
        }
    }

    public static void g(BaseAnalysis baseAnalysis, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c43bcf4", new Object[]{baseAnalysis, str, str2});
        } else if (baseAnalysis != null) {
            baseAnalysis.g("failed " + str);
            baseAnalysis.l(str, str2);
        }
    }

    public static void h(BaseAnalysis baseAnalysis, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4f556e", new Object[]{baseAnalysis, str});
        } else if (baseAnalysis != null) {
            baseAnalysis.g("success " + str);
            baseAnalysis.m(str);
        }
    }

    public static void i(BaseAnalysis baseAnalysis, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82eac114", new Object[]{baseAnalysis, str});
        } else if (baseAnalysis != null) {
            baseAnalysis.g("start" + str);
            baseAnalysis.n(str);
        }
    }

    public static void j(BaseAnalysis baseAnalysis, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca6e7198", new Object[]{baseAnalysis, str});
        } else if (baseAnalysis != null) {
            baseAnalysis.n(str);
            if (TextUtils.equals(str, "VIDEO_STALL")) {
                int d = z5r.d();
                double c = z5r.c();
                baseAnalysis.i("quality", String.valueOf(d));
                baseAnalysis.i("bandwidth", String.valueOf(c));
                e(baseAnalysis, "VIDEO_STALL", "quality" + d + "bandwidth" + c);
            }
        }
    }

    public static void b(BaseAnalysis baseAnalysis, int i) {
        iu0 iu0Var;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da7915f5", new Object[]{baseAnalysis, new Integer(i)});
        } else if (baseAnalysis != null) {
            if (i == 0) {
                iu0Var = ((b) baseAnalysis).e();
            } else {
                iu0Var = i == 2 ? ((c) baseAnalysis).e() : null;
            }
            if (iu0Var != null) {
                baseAnalysis.i("index", String.valueOf(iu0Var.f21584a));
                baseAnalysis.i("videoId", iu0Var.g);
                baseAnalysis.i("url", iu0Var.b);
                baseAnalysis.i("SubBusinessId", String.valueOf(iu0Var.h));
                baseAnalysis.i("duration", iu0Var.c);
                baseAnalysis.i("setMute", String.valueOf(iu0Var.d));
                baseAnalysis.i("setLoop", String.valueOf(iu0Var.e));
                baseAnalysis.i("encodeType", String.valueOf(iu0Var.f));
                baseAnalysis.i("quality", iu0Var.o);
                baseAnalysis.i("bandwidth", iu0Var.p);
                baseAnalysis.i("startPos", iu0Var.i);
                baseAnalysis.i("fristRenderTime", iu0Var.j);
                baseAnalysis.i("totalPlayTime", iu0Var.k);
                baseAnalysis.i("videoCodec", iu0Var.l);
                baseAnalysis.i("warmupFlag", String.valueOf(iu0Var.m));
                baseAnalysis.i("useSurfaceView", String.valueOf(iu0Var.n));
            }
            baseAnalysis.j("succeed");
            baseAnalysis.h();
        }
    }
}
