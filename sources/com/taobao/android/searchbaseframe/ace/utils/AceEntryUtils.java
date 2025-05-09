package com.taobao.android.searchbaseframe.ace.utils;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.widget.Toast;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.tools.bundleInfo.BundleInfoManager;
import com.taobao.android.searchbaseframe.ace.utils.AceEntryUtils;
import com.taobao.search.ace.AceActivity;
import com.taobao.search.ace.AcePanelActivity;
import com.taobao.tao.Globals;
import tb.bcq;
import tb.c4p;
import tb.ckf;
import tb.d1a;
import tb.f8b;
import tb.gvk;
import tb.j3p;
import tb.nsj;
import tb.r7b;
import tb.rqk;
import tb.t2o;
import tb.ucq;
import tb.vcq;
import tb.xcq;
import tb.xhv;
import tb.yko;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class AceEntryUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final AceEntryUtils INSTANCE = new AceEntryUtils();

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f9328a = true;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a extends f8b.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ d1a<xhv> f9329a;
        public final /* synthetic */ d1a<xhv> b;

        public a(d1a<xhv> d1aVar, d1a<xhv> d1aVar2) {
            this.f9329a = d1aVar;
            this.b = d1aVar2;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/searchbaseframe/ace/utils/AceEntryUtils$checkAceAccessibility$1");
        }

        @Override // tb.f8b.b
        public void a(nsj nsjVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d34fd645", new Object[]{this, nsjVar});
            } else {
                this.b.invoke();
            }
        }

        @Override // tb.f8b.b
        public void b(nsj nsjVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dfadf5c0", new Object[]{this, nsjVar});
                return;
            }
            ckf.g(nsjVar, "bean");
            this.f9329a.invoke();
        }
    }

    static {
        t2o.a(993001624);
    }

    public static final void n(String str, d1a d1aVar, Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf020841", new Object[]{str, d1aVar, num});
            return;
        }
        ckf.g(str, "$bundleName");
        ckf.g(d1aVar, "$action");
        c4p.m("AceEntryUtils", "install ace remote success");
        try {
            bcq.a().g(Globals.getApplication(), false, str);
            d1aVar.invoke();
        } catch (Throwable th) {
            c4p.o("AceEntryUtils", "exec action failed", th);
        }
    }

    public static final void o(Exception exc) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27ad2440", new Object[]{exc});
        } else {
            c4p.o("AceEntryUtils", "install ace remote failed", exc);
        }
    }

    public static final xhv p(final Context context, final Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("c7984475", new Object[]{context, uri});
        }
        ckf.g(context, "$context");
        INSTANCE.d(new d1a() { // from class: tb.uue
            @Override // tb.d1a
            public final Object invoke() {
                xhv q;
                q = AceEntryUtils.q(context, uri);
                return q;
            }
        });
        return xhv.INSTANCE;
    }

    public static final xhv q(Context context, Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("deb5e70c", new Object[]{context, uri});
        }
        ckf.g(context, "$context");
        Intent intent = new Intent(context, AceActivity.class);
        intent.setData(uri);
        context.startActivity(intent);
        return xhv.INSTANCE;
    }

    public static final xhv s(final Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("d1c7d01f", new Object[]{context});
        }
        ckf.g(context, "$context");
        INSTANCE.d(new d1a() { // from class: tb.hyh
            @Override // tb.d1a
            public final Object invoke() {
                xhv t;
                t = AceEntryUtils.t(context);
                return t;
            }
        });
        return xhv.INSTANCE;
    }

    public static final xhv t(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("e0e2ff87", new Object[]{context});
        }
        ckf.g(context, "$context");
        context.startActivity(new Intent(context, AcePanelActivity.class));
        return xhv.INSTANCE;
    }

    public final void b(d1a<xhv> d1aVar, d1a<xhv> d1aVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8013888", new Object[]{this, d1aVar, d1aVar2});
            return;
        }
        yko g = j3p.g();
        if (g == null) {
            d1aVar2.invoke();
        } else if (g.g().isDebug()) {
            d1aVar.invoke();
        } else {
            f8b.c(g, new r7b(g.d().c), new a(d1aVar, d1aVar2));
        }
    }

    public final boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f8672277", new Object[]{this})).booleanValue();
        }
        return f9328a;
    }

    public final void d(final d1a<xhv> d1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28dcc30d", new Object[]{this, d1aVar});
            return;
        }
        ucq a2 = vcq.a(Globals.getApplication());
        if (BundleInfoManager.instance().getDynamicFeatureInfo("android_ace_wrapper") == null) {
            d1aVar.invoke();
        } else if (BundleInfoManager.instance().getDynamicFeatureInfo("android_ace_wrapper") == null || !a2.f().contains("android_ace_wrapper")) {
            vcq.a(Globals.getApplication()).c(xcq.c().l("android_ace_wrapper").n()).c(new gvk("android_ace_wrapper", d1aVar) { // from class: tb.mjj

                /* renamed from: a  reason: collision with root package name */
                public final /* synthetic */ d1a f24084a;

                {
                    this.f24084a = d1aVar;
                }

                @Override // tb.gvk
                public final void onSuccess(Object obj) {
                    AceEntryUtils.n("android_ace_wrapper", this.f24084a, (Integer) obj);
                }
            }).b(new rqk() { // from class: tb.i2k
                @Override // tb.rqk
                public final void onFailure(Exception exc) {
                    AceEntryUtils.o(exc);
                }
            });
        } else {
            d1aVar.invoke();
        }
    }

    public final void e(final Context context, final Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce5d5c4e", new Object[]{this, context, uri});
            return;
        }
        ckf.g(context, "context");
        b(new d1a() { // from class: tb.itc
            @Override // tb.d1a
            public final Object invoke() {
                xhv p;
                p = AceEntryUtils.p(context, uri);
                return p;
            }
        }, new d1a() { // from class: tb.y9d
            @Override // tb.d1a
            public final Object invoke() {
                xhv r;
                r = AceEntryUtils.r(context);
                return r;
            }
        });
    }

    public final void f(final Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3daa4b87", new Object[]{this, context});
            return;
        }
        ckf.g(context, "context");
        b(new d1a() { // from class: tb.lld
            @Override // tb.d1a
            public final Object invoke() {
                xhv s;
                s = AceEntryUtils.s(context);
                return s;
            }
        }, new d1a() { // from class: tb.tue
            @Override // tb.d1a
            public final Object invoke() {
                xhv u;
                u = AceEntryUtils.u(context);
                return u;
            }
        });
    }

    public static final xhv r(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("b8d4528f", new Object[]{context});
        }
        ckf.g(context, "$context");
        Toast.makeText(context, "请在内网环境下使用", 0).show();
        return xhv.INSTANCE;
    }

    public static final xhv u(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("d92d053e", new Object[]{context});
        }
        ckf.g(context, "$context");
        Toast.makeText(context, "请在内网环境下使用", 0).show();
        return xhv.INSTANCE;
    }
}
