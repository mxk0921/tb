package com.alibaba.flexa.compat;

import android.content.Context;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import tb.acq;
import tb.b4d;
import tb.caq;
import tb.cto;
import tb.d57;
import tb.d62;
import tb.dl9;
import tb.dto;
import tb.eto;
import tb.fl9;
import tb.gd1;
import tb.i07;
import tb.icq;
import tb.jdq;
import tb.jvc;
import tb.k47;
import tb.khb;
import tb.l0c;
import tb.ps3;
import tb.qcq;
import tb.t67;
import tb.trd;
import tb.urd;
import tb.wnc;
import tb.ym1;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Context f2482a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final Context f2483a;
        public qcq b;
        public boolean c;
        public jvc d;
        public boolean e;
        public boolean f;
        public boolean g;

        public a a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("f8831ead", new Object[]{this});
            }
            return new a(this.f2483a, null, this.b, null, this.d, this.c, this.f, this.e, this.g, null);
        }

        public b b(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("18fc4af8", new Object[]{this, new Boolean(z)});
            }
            this.g = z;
            return this;
        }

        public b c(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("6bb8f161", new Object[]{this, new Boolean(z)});
            }
            this.f = z;
            return this;
        }

        public b d(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("9a3b9aa1", new Object[]{this, new Boolean(z)});
            }
            this.e = z;
            return this;
        }

        public b e(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("eff425ea", new Object[]{this, new Boolean(z)});
            }
            this.c = z;
            return this;
        }

        public b f(jvc jvcVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("5def1924", new Object[]{this, jvcVar});
            }
            this.d = jvcVar;
            return this;
        }

        public b g(qcq qcqVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("d742942b", new Object[]{this, qcqVar});
            }
            this.b = qcqVar;
            return this;
        }

        public b(Context context) {
            this.e = true;
            this.f2483a = context;
        }
    }

    public a(Context context, l0c l0cVar, qcq qcqVar, wnc wncVar, jvc jvcVar, boolean z, boolean z2, boolean z3, boolean z4, String str) {
        if (context != null) {
            this.f2482a = context;
            TextUtils.isEmpty(str);
            if (l0cVar == null) {
                d62.c(l0c.class, i07.class, Context.class);
            } else {
                d62.d(l0c.class, l0cVar);
            }
            if (qcqVar == null) {
                d62.d(qcq.class, new icq());
            } else {
                d62.d(qcq.class, qcqVar);
            }
            if (wncVar == null) {
                try {
                    d62.c(wnc.class, dl9.class, String.class);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } else {
                d62.d(wnc.class, wncVar);
            }
            if (jvcVar == null) {
                try {
                    d62.c(jvc.class, jdq.class, new Class[0]);
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            } else {
                d62.d(jvc.class, jvcVar);
            }
            d62.c(urd.class, ym1.class, new Class[0]);
            d62.c(khb.class, gd1.class, new Class[0]);
            d62.c(trd.class, t67.class, new Class[0]);
            eto.b(new d57());
            caq.b(new ps3());
            cto.b(new dto());
            fl9 fl9Var = new fl9();
            fl9Var.c(new k47());
            d62.d(b4d.class, fl9Var);
            acq.Q(context, z, z2, z3, z4);
            return;
        }
        throw new IllegalStateException("Context can not be null!");
    }

    public static b b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("3ca5ea65", new Object[]{context});
        }
        return new b(context);
    }

    public Context a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("e1727078", new Object[]{this});
        }
        return this.f2482a;
    }
}
