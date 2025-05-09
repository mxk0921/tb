package tb;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import tb.kov;
import tb.tpu;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class joj implements azc {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public qpu f22120a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a {
        static {
            t2o.a(916455570);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(916455569);
        t2o.a(919601298);
    }

    public final void B(Context context, String str, String str2, Bundle bundle, Bundle bundle2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9a029f3", new Object[]{this, context, str, str2, bundle, bundle2, new Integer(i)});
            return;
        }
        tpu.a aVar = tpu.Companion;
        tpu.a.b(aVar, "NavService", "openURL " + str2, null, 4, null);
        Nav from = Nav.from(context);
        if (bundle != null) {
            from.withExtras(bundle);
        }
        if (bundle2 != null) {
            from.withOptions(bundle2);
        }
        from.withFlags(i);
        if (!(context instanceof Activity) || !r(context)) {
            from.withClassName(context.getPackageName(), str);
        } else {
            from.withClassName(context.getPackageName(), "com.taobao.tao.welcome.Welcome");
        }
        from.toUri(str2);
    }

    @Override // tb.azc
    public void e(Context context, String str, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be6277ce", new Object[]{this, context, str, bundle});
            return;
        }
        ckf.g(context, "context");
        ckf.g(str, "url");
        x(context, str, bundle, null);
    }

    @Override // tb.sod
    public void onCreateService(qpu qpuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9b2eb95", new Object[]{this, qpuVar});
            return;
        }
        ckf.g(qpuVar, "context");
        this.f22120a = qpuVar;
    }

    @Override // tb.sod
    public void onDestroyService(qpu qpuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("673e3e35", new Object[]{this, qpuVar});
        } else {
            ckf.g(qpuVar, "context");
        }
    }

    public final boolean r(Context context) {
        Intent intent;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b7b1864e", new Object[]{this, context})).booleanValue();
        }
        if (context instanceof aaj) {
            intent = ((aaj) context).getOriginIntent();
        } else if (context instanceof Activity) {
            intent = ((Activity) context).getIntent();
        } else {
            intent = null;
        }
        if (intent != null) {
            return bqg.b(intent);
        }
        return false;
    }

    public void x(Context context, String str, Bundle bundle, Bundle bundle2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1620e46", new Object[]{this, context, str, bundle, bundle2});
            return;
        }
        ckf.g(context, "context");
        ckf.g(str, "url");
        if (TextUtils.isEmpty(str)) {
            tpu.a.b(tpu.Companion, "NavService", "url is empty", null, 4, null);
            return;
        }
        boolean L = L(context, str, bundle);
        tpu.a aVar = tpu.Companion;
        tpu.a.b(aVar, "NavService", "openURL " + str + ", push2MultiPageContainer success: " + L, null, 4, null);
        if (!L) {
            tpu.a.b(aVar, "NavService", "未添加到fragment/view中,打开独立Activity:".concat(str), null, 4, null);
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("tnode_has_parsed", true);
            kov.a aVar2 = kov.Companion;
            qpu qpuVar = this.f22120a;
            if (qpuVar != null) {
                if (aVar2.c(Uri.parse(qpuVar.a().n()))) {
                    bundle.putBoolean("stdPopModal", true);
                }
                Nav from = Nav.from(context);
                from.withExtras(bundle);
                if (bundle2 != null) {
                    from.withOptions(bundle2);
                }
                from.toUri(str);
                return;
            }
            ckf.y("engineContext");
            throw null;
        }
    }

    public final boolean L(Context context, String str, Bundle bundle) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a6d2ba7e", new Object[]{this, context, str, bundle})).booleanValue();
        }
        od0 D = od0.D();
        ckf.f(D, "AdapterFactory.instance()");
        yyc r = D.r();
        Pair<Uri, Boolean> c = r.c(context, Uri.parse(str), true, false, false);
        Uri uri = (Uri) c.first;
        String uri2 = uri.toString();
        ckf.f(uri2, "parsedUri.toString()");
        if (((Boolean) c.second).booleanValue()) {
            return true;
        }
        if (akt.h2(context, Uri.parse(str), uri) && (r.b(Uri.parse(uri2)) || r.d(Uri.parse(str)))) {
            qpu qpuVar = this.f22120a;
            if (qpuVar == null) {
                ckf.y("engineContext");
                throw null;
            } else if (qpuVar.a().f() instanceof zcr) {
                qpu qpuVar2 = this.f22120a;
                if (qpuVar2 != null) {
                    Object f = qpuVar2.a().f();
                    if (f != null) {
                        z = ((zcr) f).t(uri2, null, bundle);
                        if (z) {
                            tpu.a aVar = tpu.Companion;
                            tpu.a.b(aVar, "NavService", "tab2场景打开Fragment:" + str, null, 4, null);
                        }
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type com.taobao.tao.flexbox.layoutmanager.container.TBFragmentContainerInterface");
                    }
                } else {
                    ckf.y("engineContext");
                    throw null;
                }
            } else {
                qpu qpuVar3 = this.f22120a;
                if (qpuVar3 == null) {
                    ckf.y("engineContext");
                    throw null;
                } else if (qpuVar3.a().f() instanceof anl) {
                    qpu qpuVar4 = this.f22120a;
                    if (qpuVar4 != null) {
                        Object f2 = qpuVar4.a().f();
                        if (f2 != null) {
                            z = ((anl) f2).getPageContainer().t(uri2, null, bundle);
                            if (z) {
                                tpu.a aVar2 = tpu.Companion;
                                tpu.a.b(aVar2, "NavService", "二级页面打开View:" + str, null, 4, null);
                            }
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type com.taobao.tao.flexbox.layoutmanager.container.PageInterface");
                        }
                    } else {
                        ckf.y("engineContext");
                        throw null;
                    }
                }
            }
        }
        return z;
    }

    @Override // tb.azc
    public void Q(Context context, String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("763fb67f", new Object[]{this, context, str});
            return;
        }
        ckf.g(context, "context");
        ckf.g(str, vaj.KEY_TAB_ID);
        tpu.a.b(tpu.Companion, "NavService", "popTo tabId=".concat(str), null, 4, null);
        qpu qpuVar = this.f22120a;
        if (qpuVar != null) {
            boolean r = qpuVar.a().r();
            if (r) {
                qpu qpuVar2 = this.f22120a;
                if (qpuVar2 != null) {
                    str2 = qpuVar2.a().n();
                } else {
                    ckf.y("engineContext");
                    throw null;
                }
            } else {
                str2 = "https://h5.m.taobao.com/guangguang/index.htm";
            }
            String valueOf = String.valueOf(mnv.Companion.a(Uri.parse(str2), "tabid", str));
            if (r) {
                qpu qpuVar3 = this.f22120a;
                if (qpuVar3 != null) {
                    ((vmd) qpuVar3.getService(vmd.class)).Z(new nuo(nuo.MSG_SELECT_TAB, str, null, 0, null, 24, null));
                    String name = context.getClass().getName();
                    Bundle bundle = new Bundle();
                    bundle.putBoolean(hzc.EXTRA_POP_TO, true);
                    qpu qpuVar4 = this.f22120a;
                    if (qpuVar4 != null) {
                        bundle.putString(hzc.EXTRA_TURBO_ENGINE_TARGET, qpuVar4.getInstanceId());
                        B(context, name, valueOf, bundle, null, 603979776);
                        return;
                    }
                    ckf.y("engineContext");
                    throw null;
                }
                ckf.y("engineContext");
                throw null;
            }
            e(context, valueOf, null);
            return;
        }
        ckf.y("engineContext");
        throw null;
    }
}
