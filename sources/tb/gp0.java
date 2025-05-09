package tb;

import android.content.Context;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.h;
import tb.iy5;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class gp0 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static boolean f20139a;

    public static void a(Context context, iy5.b bVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d0a5a7", new Object[]{context, bVar, new Boolean(z)});
        } else if (!f20139a) {
            if (bVar != null) {
                bVar.v0(new ap0());
                bVar.r0(new cp0());
                bVar.f0(new zo0());
                bVar.N(new jc5());
                bVar.p0(new ma6());
                bVar.b0(new h());
                bVar.t0(new zk6());
            }
            b(context, bVar, true, z);
            f20139a = true;
        }
    }

    public static void b(Context context, iy5.b bVar, boolean z, boolean z2) {
        boolean z3 = true;
        boolean z4 = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3844c20d", new Object[]{context, bVar, new Boolean(z), new Boolean(z2)});
            return;
        }
        if (z) {
            try {
                c(context, z2);
            } catch (Exception e) {
                Log.e("DinamicException", "AliDinamicX v2 init failed", e);
            }
        }
        try {
            if (bVar != null) {
                bVar.Y(z2);
                iy5 K = bVar.K();
                if (K.o == null) {
                    bVar.v0(new ap0());
                    z4 = true;
                }
                if (K.q == null) {
                    bVar.r0(new cp0());
                    z4 = true;
                }
                if (K.m == null) {
                    bVar.N(new jc5());
                    z4 = true;
                }
                if (K.n == null) {
                    bVar.p0(new ma6());
                    z4 = true;
                }
                if (K.l == null) {
                    bVar.b0(new h());
                    z4 = true;
                }
                if (K.N == null) {
                    bVar.t0(new zk6());
                    z4 = true;
                }
                if (K.A == null) {
                    bVar.f0(new zo0());
                } else {
                    z3 = z4;
                }
                if (z3) {
                    K = bVar.K();
                }
                DinamicXEngine.i0(context, K);
                return;
            }
            DinamicXEngine.i0(context, null);
        } catch (Exception e2) {
            Log.e("DinamicException", "AliDinamicX registerView failed", e2);
        }
    }

    public static void c(Context context, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e1b07f", new Object[]{context, new Boolean(z)});
            return;
        }
        tl7.e(context.getApplicationContext(), z);
        f65.n().h(new o7b());
        f65.n().i(new cq0());
        f65.n().e(new n71());
        f65.n().l(new lyn());
    }

    public static void d(Context context, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca011b0f", new Object[]{context, new Boolean(z)});
            return;
        }
        try {
            c(context, z);
        } catch (Exception e) {
            Log.e("DinamicException", "AliDinamicX v2 init failed", e);
        }
    }

    public static void e(Context context, iy5.b bVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32273b14", new Object[]{context, bVar, new Boolean(z)});
        } else if (!f20139a) {
            if (bVar != null) {
                bVar.v0(new ap0());
                bVar.r0(new cp0());
                bVar.N(new jc5());
                bVar.p0(new ma6());
                bVar.b0(new h());
                bVar.t0(new zk6());
            }
            b(context, bVar, false, z);
            f20139a = true;
        }
    }
}
