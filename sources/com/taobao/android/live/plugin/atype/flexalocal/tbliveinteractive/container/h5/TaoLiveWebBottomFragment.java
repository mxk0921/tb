package com.taobao.android.live.plugin.atype.flexalocal.tbliveinteractive.container.h5;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.GradientDrawable;
import android.net.http.SslError;
import android.os.Bundle;
import android.taobao.windvane.extra.uc.WVUCWebViewClient;
import android.taobao.windvane.standardmodal.WVStandardEventCenter;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.taobao.android.live.plugin.proxy.FlexaLiveX;
import com.taobao.android.live.plugin.proxy.tbliveinteractive.IInteractiveProxy;
import com.taobao.taobao.R;
import com.taobao.taolivecontainer.TBLiveH5Container;
import com.taobao.themis.external.embed.TMSEmbed;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import com.uc.webview.export.SslErrorHandler;
import com.uc.webview.export.WebView;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import tb.b65;
import tb.cwd;
import tb.fkx;
import tb.giv;
import tb.hjr;
import tb.hw0;
import tb.izw;
import tb.nkr;
import tb.nnr;
import tb.o3s;
import tb.pbe;
import tb.s3c;
import tb.sjr;
import tb.t2o;
import tb.ux9;
import tb.uyg;
import tb.v2s;
import tb.v7t;
import tb.vc;
import tb.xkl;
import tb.xud;
import tb.zmr;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class TaoLiveWebBottomFragment extends BottomSheetDialogFragment implements s3c {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public boolean A;
    public zmr S0;
    public ux9 c;
    public WeakReference<com.taobao.android.live.plugin.atype.flexalocal.tbliveinteractive.container.h5.a> d;
    public nkr e;
    public float f;
    public float g;
    public boolean h;
    public boolean i;
    public float j;
    public boolean k;
    public boolean l;
    public int m;
    public boolean n;
    public float p;
    public TBLiveH5Container q;
    public boolean r;
    public RoundedFrameLayout t;
    public BottomSheetBehavior<FrameLayout> u;
    public Intent v;
    public nnr w;
    public long y;
    public boolean z;
    public Integer o = null;
    public String s = "mask";
    public Integer x = 0;
    public final TMSEmbed.a T0 = new c();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements View.OnScrollChangeListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.view.View.OnScrollChangeListener
        public void onScrollChange(View view, int i, int i2, int i3, int i4) {
            boolean z = true;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4ea33e4f", new Object[]{this, view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
                return;
            }
            BottomSheetBehavior v2 = TaoLiveWebBottomFragment.v2(TaoLiveWebBottomFragment.this);
            if (i2 > 0) {
                z = false;
            }
            v2.setHideable(z);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class c extends TMSEmbed.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode == -799572052) {
                super.d();
                return null;
            } else if (hashCode == 2123836685) {
                super.l((String) objArr[0], (String) objArr[1]);
                return null;
            } else {
                int hashCode2 = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/live/plugin/atype/flexalocal/tbliveinteractive/container/h5/TaoLiveWebBottomFragment$3");
            }
        }

        @Override // com.taobao.themis.external.embed.TMSEmbed.a
        public void d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d0577fac", new Object[]{this});
                return;
            }
            super.d();
            if (!TaoLiveWebBottomFragment.k(TaoLiveWebBottomFragment.this)) {
                TaoLiveWebBottomFragment.this.m3();
            }
        }

        @Override // com.taobao.themis.external.embed.TMSEmbed.a
        public void l(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7e972d0d", new Object[]{this, str, str2});
                return;
            }
            super.l(str, str2);
            TaoLiveWebBottomFragment taoLiveWebBottomFragment = TaoLiveWebBottomFragment.this;
            TaoLiveWebBottomFragment.m(taoLiveWebBottomFragment, "error code: " + str + " ,description" + str2);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class d implements IInteractiveProxy.k {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public Context f8680a;
        public ux9 b;
        public com.taobao.android.live.plugin.atype.flexalocal.tbliveinteractive.container.h5.a c;
        public nkr d;
        public boolean j;
        public nnr k;
        public float e = 0.725f;
        public float f = 27.0f;
        public float g = 0.2f;
        public boolean h = true;
        public boolean i = true;
        public float l = 0.9f;
        public boolean m = false;
        public boolean n = false;
        public int o = 0;
        public boolean p = false;
        public Integer q = null;
        public Integer r = null;

        static {
            t2o.a(295699889);
            t2o.a(806355282);
        }

        /* renamed from: e */
        public TaoLiveWebBottomFragment build() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TaoLiveWebBottomFragment) ipChange.ipc$dispatch("9f038784", new Object[]{this});
            }
            TaoLiveWebBottomFragment p = TaoLiveWebBottomFragment.p();
            TaoLiveWebBottomFragment.q(p, this.b);
            TaoLiveWebBottomFragment.a(p, new WeakReference(this.c));
            TaoLiveWebBottomFragment.b(p, this.d);
            TaoLiveWebBottomFragment.c(p, this.e);
            TaoLiveWebBottomFragment.D2(p, this.q);
            TaoLiveWebBottomFragment.d(p, this.r);
            TaoLiveWebBottomFragment.e(p, this.h);
            TaoLiveWebBottomFragment.f(p, hw0.b(this.f8680a, this.f));
            TaoLiveWebBottomFragment.c3(p, this.g);
            TaoLiveWebBottomFragment.g(p, this.i);
            TaoLiveWebBottomFragment.h(p, this.k);
            TaoLiveWebBottomFragment.W2(p, this.j);
            TaoLiveWebBottomFragment.i(p, this.l);
            TaoLiveWebBottomFragment.T2(p, this.m);
            TaoLiveWebBottomFragment.a3(p, this.n);
            TaoLiveWebBottomFragment.j(p, this.o);
            TaoLiveWebBottomFragment.l(p, this.p);
            return p;
        }

        public float f() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("d041faec", new Object[]{this})).floatValue();
            }
            return this.e;
        }

        public d g(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (d) ipChange.ipc$dispatch("8ef4cb18", new Object[]{this, str});
            }
            this.r = Integer.valueOf(Color.parseColor(str));
            return this;
        }

        public d h(com.taobao.android.live.plugin.atype.flexalocal.tbliveinteractive.container.h5.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (d) ipChange.ipc$dispatch("dfdc57fa", new Object[]{this, aVar});
            }
            this.c = aVar;
            return this;
        }

        /* renamed from: i */
        public d c(nkr nkrVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (d) ipChange.ipc$dispatch("685897e4", new Object[]{this, nkrVar});
            }
            this.d = nkrVar;
            return this;
        }

        public d j(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (d) ipChange.ipc$dispatch("cfbc6d92", new Object[]{this, str});
            }
            this.q = Integer.valueOf(Color.parseColor(str));
            return this;
        }

        /* renamed from: k */
        public d a(Context context) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (d) ipChange.ipc$dispatch("28cf5850", new Object[]{this, context});
            }
            this.f8680a = context;
            return this;
        }

        public d l(float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (d) ipChange.ipc$dispatch("f57ed1a4", new Object[]{this, new Float(f)});
            }
            this.f = f;
            return this;
        }

        public d m(float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (d) ipChange.ipc$dispatch("806f9b73", new Object[]{this, new Float(f)});
            }
            this.l = f;
            return this;
        }

        public d n(ux9 ux9Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (d) ipChange.ipc$dispatch("fddfa0af", new Object[]{this, ux9Var});
            }
            this.b = ux9Var;
            return this;
        }

        /* renamed from: o */
        public d b(float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (d) ipChange.ipc$dispatch("7ecc0f44", new Object[]{this, new Float(f)});
            }
            this.e = f;
            return this;
        }

        public d p(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (d) ipChange.ipc$dispatch("c5ec572d", new Object[]{this, new Boolean(z)});
            }
            this.n = z;
            return this;
        }

        public d q(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (d) ipChange.ipc$dispatch("af8acc3e", new Object[]{this, new Boolean(z)});
            }
            this.m = z;
            return this;
        }

        public d r(float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (d) ipChange.ipc$dispatch("823da91e", new Object[]{this, new Float(f)});
            }
            this.g = f;
            return this;
        }

        /* renamed from: s */
        public d d(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (d) ipChange.ipc$dispatch("8fe35b34", new Object[]{this, new Boolean(z)});
            }
            this.h = z;
            return this;
        }

        public d t(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (d) ipChange.ipc$dispatch("a9be448c", new Object[]{this, new Boolean(z)});
            }
            this.i = z;
            return this;
        }

        public d u(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (d) ipChange.ipc$dispatch("c42a76e0", new Object[]{this, new Boolean(z)});
            }
            this.j = z;
            return this;
        }

        public d v(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (d) ipChange.ipc$dispatch("bd94203d", new Object[]{this, new Integer(i)});
            }
            this.o = i;
            return this;
        }

        public d w(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (d) ipChange.ipc$dispatch("f4341efb", new Object[]{this, new Boolean(z)});
            }
            this.p = z;
            return this;
        }

        public d x(nnr nnrVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (d) ipChange.ipc$dispatch("f1e86c5", new Object[]{this, nnrVar});
            }
            this.k = nnrVar;
            return this;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class e extends WVUCWebViewClient {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e(Context context) {
            super(context);
        }

        public static /* synthetic */ Object ipc$super(e eVar, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode == -1262473342) {
                super.onReceivedSslError((WebView) objArr[0], (SslErrorHandler) objArr[1], (SslError) objArr[2]);
                return null;
            } else if (hashCode == -332805219) {
                super.onPageFinished((WebView) objArr[0], (String) objArr[1]);
                return null;
            } else if (hashCode == 1373550412) {
                super.onReceivedError((WebView) objArr[0], ((Number) objArr[1]).intValue(), (String) objArr[2], (String) objArr[3]);
                return null;
            } else {
                int hashCode2 = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/live/plugin/atype/flexalocal/tbliveinteractive/container/h5/TaoLiveWebBottomFragment$4");
            }
        }

        @Override // android.taobao.windvane.extra.uc.WVUCWebViewClient, com.uc.webview.export.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ec29cb9d", new Object[]{this, webView, str});
                return;
            }
            super.onPageFinished(webView, str);
            if (!TaoLiveWebBottomFragment.k(TaoLiveWebBottomFragment.this)) {
                TaoLiveWebBottomFragment.this.m3();
            }
        }

        @Override // android.taobao.windvane.extra.uc.WVUCWebViewClient, com.uc.webview.export.WebViewClient
        public void onReceivedError(WebView webView, int i, String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("51deb74c", new Object[]{this, webView, new Integer(i), str, str2});
                return;
            }
            super.onReceivedError(webView, i, str, str2);
            TaoLiveWebBottomFragment taoLiveWebBottomFragment = TaoLiveWebBottomFragment.this;
            TaoLiveWebBottomFragment.m(taoLiveWebBottomFragment, "error code: " + i + " ,description" + str);
        }

        @Override // android.taobao.windvane.extra.uc.WVUCWebViewClient, com.uc.webview.export.WebViewClient
        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b4c02f82", new Object[]{this, webView, sslErrorHandler, sslError});
                return;
            }
            super.onReceivedSslError(webView, sslErrorHandler, sslError);
            TaoLiveWebBottomFragment taoLiveWebBottomFragment = TaoLiveWebBottomFragment.this;
            TaoLiveWebBottomFragment.m(taoLiveWebBottomFragment, "ssl error" + sslError.toString());
        }
    }

    static {
        t2o.a(295699884);
        t2o.a(806355016);
    }

    public static /* synthetic */ boolean A2(TaoLiveWebBottomFragment taoLiveWebBottomFragment, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f8bd7653", new Object[]{taoLiveWebBottomFragment, new Boolean(z)})).booleanValue();
        }
        taoLiveWebBottomFragment.z = z;
        return z;
    }

    public static /* synthetic */ Integer D2(TaoLiveWebBottomFragment taoLiveWebBottomFragment, Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("857495ca", new Object[]{taoLiveWebBottomFragment, num});
        }
        taoLiveWebBottomFragment.o = num;
        return num;
    }

    public static /* synthetic */ boolean Q2(TaoLiveWebBottomFragment taoLiveWebBottomFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3a455fca", new Object[]{taoLiveWebBottomFragment})).booleanValue();
        }
        return taoLiveWebBottomFragment.k;
    }

    public static /* synthetic */ boolean T2(TaoLiveWebBottomFragment taoLiveWebBottomFragment, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ac368854", new Object[]{taoLiveWebBottomFragment, new Boolean(z)})).booleanValue();
        }
        taoLiveWebBottomFragment.k = z;
        return z;
    }

    public static /* synthetic */ boolean U2(TaoLiveWebBottomFragment taoLiveWebBottomFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("485189a9", new Object[]{taoLiveWebBottomFragment})).booleanValue();
        }
        return taoLiveWebBottomFragment.i;
    }

    public static /* synthetic */ boolean W2(TaoLiveWebBottomFragment taoLiveWebBottomFragment, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5faf9a55", new Object[]{taoLiveWebBottomFragment, new Boolean(z)})).booleanValue();
        }
        taoLiveWebBottomFragment.i = z;
        return z;
    }

    public static /* synthetic */ boolean X2(TaoLiveWebBottomFragment taoLiveWebBottomFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("565db388", new Object[]{taoLiveWebBottomFragment})).booleanValue();
        }
        return taoLiveWebBottomFragment.l;
    }

    public static /* synthetic */ WeakReference a(TaoLiveWebBottomFragment taoLiveWebBottomFragment, WeakReference weakReference) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeakReference) ipChange.ipc$dispatch("e306355", new Object[]{taoLiveWebBottomFragment, weakReference});
        }
        taoLiveWebBottomFragment.d = weakReference;
        return weakReference;
    }

    public static /* synthetic */ boolean a3(TaoLiveWebBottomFragment taoLiveWebBottomFragment, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1328ac56", new Object[]{taoLiveWebBottomFragment, new Boolean(z)})).booleanValue();
        }
        taoLiveWebBottomFragment.l = z;
        return z;
    }

    public static /* synthetic */ nkr b(TaoLiveWebBottomFragment taoLiveWebBottomFragment, nkr nkrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nkr) ipChange.ipc$dispatch("dc4532a0", new Object[]{taoLiveWebBottomFragment, nkrVar});
        }
        taoLiveWebBottomFragment.e = nkrVar;
        return nkrVar;
    }

    public static /* synthetic */ float b3(TaoLiveWebBottomFragment taoLiveWebBottomFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6469dd53", new Object[]{taoLiveWebBottomFragment})).floatValue();
        }
        return taoLiveWebBottomFragment.p;
    }

    public static /* synthetic */ float c(TaoLiveWebBottomFragment taoLiveWebBottomFragment, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7bcb479b", new Object[]{taoLiveWebBottomFragment, new Float(f)})).floatValue();
        }
        taoLiveWebBottomFragment.f = f;
        return f;
    }

    public static /* synthetic */ float c3(TaoLiveWebBottomFragment taoLiveWebBottomFragment, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c6a1732f", new Object[]{taoLiveWebBottomFragment, new Float(f)})).floatValue();
        }
        taoLiveWebBottomFragment.p = f;
        return f;
    }

    public static /* synthetic */ Integer d(TaoLiveWebBottomFragment taoLiveWebBottomFragment, Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("90f47b4b", new Object[]{taoLiveWebBottomFragment, num});
        }
        taoLiveWebBottomFragment.x = num;
        return num;
    }

    public static /* synthetic */ TBLiveH5Container d3(TaoLiveWebBottomFragment taoLiveWebBottomFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBLiveH5Container) ipChange.ipc$dispatch("9eaa8f22", new Object[]{taoLiveWebBottomFragment});
        }
        return taoLiveWebBottomFragment.q;
    }

    public static /* synthetic */ boolean e(TaoLiveWebBottomFragment taoLiveWebBottomFragment, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9636c8c6", new Object[]{taoLiveWebBottomFragment, new Boolean(z)})).booleanValue();
        }
        taoLiveWebBottomFragment.h = z;
        return z;
    }

    public static /* synthetic */ float f(TaoLiveWebBottomFragment taoLiveWebBottomFragment, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("49af8f9f", new Object[]{taoLiveWebBottomFragment, new Float(f)})).floatValue();
        }
        taoLiveWebBottomFragment.g = f;
        return f;
    }

    public static /* synthetic */ boolean g(TaoLiveWebBottomFragment taoLiveWebBottomFragment, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fd28ecc8", new Object[]{taoLiveWebBottomFragment, new Boolean(z)})).booleanValue();
        }
        taoLiveWebBottomFragment.r = z;
        return z;
    }

    public static /* synthetic */ nnr h(TaoLiveWebBottomFragment taoLiveWebBottomFragment, nnr nnrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nnr) ipChange.ipc$dispatch("d9a02fb1", new Object[]{taoLiveWebBottomFragment, nnrVar});
        }
        taoLiveWebBottomFragment.w = nnrVar;
        return nnrVar;
    }

    public static /* synthetic */ float i(TaoLiveWebBottomFragment taoLiveWebBottomFragment, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("641ac5a2", new Object[]{taoLiveWebBottomFragment, new Float(f)})).floatValue();
        }
        taoLiveWebBottomFragment.j = f;
        return f;
    }

    public static /* synthetic */ Object ipc$super(TaoLiveWebBottomFragment taoLiveWebBottomFragment, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -2147180915:
                super.onSaveInstanceState((Bundle) objArr[0]);
                return null;
            case -1512649357:
                super.onResume();
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case 188604040:
                super.onStop();
                return null;
            case 797441118:
                super.onPause();
                return null;
            case 2089880052:
                super.onDismiss((DialogInterface) objArr[0]);
                return null;
            case 2133689546:
                super.onStart();
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/tbliveinteractive/container/h5/TaoLiveWebBottomFragment");
        }
    }

    public static /* synthetic */ int j(TaoLiveWebBottomFragment taoLiveWebBottomFragment, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d0825cfe", new Object[]{taoLiveWebBottomFragment, new Integer(i)})).intValue();
        }
        taoLiveWebBottomFragment.m = i;
        return i;
    }

    public static /* synthetic */ boolean k(TaoLiveWebBottomFragment taoLiveWebBottomFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ff2ab39d", new Object[]{taoLiveWebBottomFragment})).booleanValue();
        }
        return taoLiveWebBottomFragment.n;
    }

    public static /* synthetic */ boolean l(TaoLiveWebBottomFragment taoLiveWebBottomFragment, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("83fbaee1", new Object[]{taoLiveWebBottomFragment, new Boolean(z)})).booleanValue();
        }
        taoLiveWebBottomFragment.n = z;
        return z;
    }

    public static /* synthetic */ void m(TaoLiveWebBottomFragment taoLiveWebBottomFragment, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6cbc9942", new Object[]{taoLiveWebBottomFragment, str});
        } else {
            taoLiveWebBottomFragment.r(str);
        }
    }

    public static /* synthetic */ zmr n(TaoLiveWebBottomFragment taoLiveWebBottomFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (zmr) ipChange.ipc$dispatch("e47d91fa", new Object[]{taoLiveWebBottomFragment});
        }
        return taoLiveWebBottomFragment.S0;
    }

    public static /* synthetic */ TaoLiveWebBottomFragment p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TaoLiveWebBottomFragment) ipChange.ipc$dispatch("2953e30e", new Object[0]);
        }
        return p3();
    }

    public static TaoLiveWebBottomFragment p3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TaoLiveWebBottomFragment) ipChange.ipc$dispatch("886b0ceb", new Object[0]);
        }
        return new TaoLiveWebBottomFragment();
    }

    public static /* synthetic */ ux9 q(TaoLiveWebBottomFragment taoLiveWebBottomFragment, ux9 ux9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ux9) ipChange.ipc$dispatch("9c846959", new Object[]{taoLiveWebBottomFragment, ux9Var});
        }
        taoLiveWebBottomFragment.c = ux9Var;
        return ux9Var;
    }

    public static String u3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2499139f", new Object[0]);
        }
        return TaoLiveWebBottomFragment.class.getSimpleName();
    }

    public static /* synthetic */ BottomSheetBehavior v2(TaoLiveWebBottomFragment taoLiveWebBottomFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BottomSheetBehavior) ipChange.ipc$dispatch("8ed2bb8e", new Object[]{taoLiveWebBottomFragment});
        }
        return taoLiveWebBottomFragment.u;
    }

    @Override // tb.s3c
    public String bizCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("36951559", new Object[]{this});
        }
        return "TaoLiveWebBottomFragment";
    }

    public final void h3(AppCompatDelegate appCompatDelegate) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cfc8416a", new Object[]{this, appCompatDelegate});
        } else if (vc.i(getContext())) {
            new xkl().a(appCompatDelegate, getContext());
        }
    }

    public final boolean i3(AppCompatDelegate appCompatDelegate) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("84124a2a", new Object[]{this, appCompatDelegate})).booleanValue();
        }
        xud xudVar = this.q;
        if (xudVar == null) {
            xudVar = this.S0;
        }
        if (xudVar == null || xudVar.getContainerView() == null) {
            v2s.o().A().c("TLWebBottomFragment", "WebView 为空，dismiss");
            return false;
        }
        if (!xudVar.isDestroied()) {
            View findViewById = appCompatDelegate.findViewById(R.id.content_root);
            if (findViewById instanceof FrameLayout) {
                FrameLayout frameLayout = (FrameLayout) findViewById;
                if (xudVar.getParent() instanceof ViewGroup) {
                    ((ViewGroup) xudVar.getParent()).removeView(xudVar.getContainerView());
                }
                frameLayout.addView(xudVar.getContainerView(), 1);
                xudVar.getContainerView().setId(R.id.web);
                return true;
            }
        }
        return false;
    }

    public final void j3(AppCompatDelegate appCompatDelegate) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f89181b5", new Object[]{this, appCompatDelegate});
            return;
        }
        nnr nnrVar = this.w;
        if (nnrVar != null) {
            View a2 = nnrVar.a();
            View findViewById = appCompatDelegate.findViewById(R.id.content_root);
            if (findViewById instanceof ViewGroup) {
                ((ViewGroup) findViewById).addView(a2, 1);
            }
        }
    }

    public final int k3(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c214ef8a", new Object[]{this, new Integer(i)})).intValue();
        }
        if (!this.h) {
            return l3(i);
        }
        if (this.i) {
            return (int) (i * this.j);
        }
        return l3(i);
    }

    public final int l3(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7daaa9e7", new Object[]{this, new Integer(i)})).intValue();
        }
        return (int) (this.f * i);
    }

    public void m3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("efb6ffe8", new Object[]{this});
            return;
        }
        View findViewById = ((BottomSheetDialog) getDialog()).getDelegate().findViewById(R.id.loading);
        if (findViewById != null && (findViewById.getParent() instanceof ViewGroup)) {
            ((ViewGroup) findViewById.getParent()).removeView(findViewById);
        }
    }

    public String n3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("75af832d", new Object[]{this});
        }
        BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.u;
        if (bottomSheetBehavior == null) {
            return "default";
        }
        if (bottomSheetBehavior.getState() == 4) {
            return "collapsed";
        }
        if (this.u.getState() == 3) {
            return "expand";
        }
        return "default";
    }

    public final void o3(AppCompatDelegate appCompatDelegate) {
        CoordinatorLayout coordinatorLayout;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40d3f596", new Object[]{this, appCompatDelegate});
        } else if (!this.k && (coordinatorLayout = (CoordinatorLayout) appCompatDelegate.findViewById(R.id.coordinator)) != null) {
            LayoutInflater.from(getContext()).inflate(R.layout.alilive_h5_scroll_guide_flexalocal, coordinatorLayout);
        }
    }

    @Override // tb.s3c
    public String[] observeEvents() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("37b2602b", new Object[]{this});
        }
        return new String[]{uyg.EVENT_FULL_SCREEN_APPEAR};
    }

    @Override // tb.s3c
    public String observeUniqueIdentification() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4914bdfe", new Object[]{this});
        }
        ux9 ux9Var = this.c;
        if (ux9Var == null) {
            return null;
        }
        return ux9Var.C();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        nkr nkrVar = this.e;
        if (nkrVar != null) {
            if (nkrVar.g() != null) {
                zmr g = this.e.g();
                this.S0 = g;
                g.f(this.T0);
                this.S0.j(R.id.tag_support_scroll_up, this.i);
                return;
            }
            TBLiveH5Container f = this.e.f();
            this.q = f;
            f.setWebViewClient(new e(getContext()));
            this.q.setTag(R.id.tag_support_scroll_up, Boolean.valueOf(this.i));
        } else if (bundle != null && bundle.containsKey("RESTORED_URL")) {
            cwd A = v2s.o().A();
            A.c("TLWebBottomFragment", "Fragment 重建, 不会上屏 自动销毁, " + bundle.getString("RESTORED_URL"));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        JSONObject jSONObject = new JSONObject();
        if (this.l) {
            if (giv.c().b()) {
                sjr.g().e(uyg.EVENT_MEDIAPLATFORM_SHOW_WIDGETS, "close");
            } else {
                sjr.g().c("com.taobao.taolive.room.recommend.good.card.did.disappear", null, null);
            }
        }
        TBLiveH5Container tBLiveH5Container = this.q;
        if (!(tBLiveH5Container == null && this.w == null)) {
            if (tBLiveH5Container != null) {
                str = tBLiveH5Container.getUrl();
            } else {
                zmr zmrVar = this.S0;
                if (zmrVar != null) {
                    str = zmrVar.b();
                } else {
                    str = this.w.d();
                }
            }
            jSONObject.put("url", (Object) str);
            WeakReference<com.taobao.android.live.plugin.atype.flexalocal.tbliveinteractive.container.h5.a> weakReference = this.d;
            if (!(weakReference == null || weakReference.get() == null)) {
                com.taobao.android.live.plugin.atype.flexalocal.tbliveinteractive.container.h5.a aVar = this.d.get();
                if (!TextUtils.isEmpty(aVar.i)) {
                    this.s = aVar.i;
                }
            }
            jSONObject.put("from", (Object) this.s);
            WVStandardEventCenter.postNotificationToJS("TBLiveWVPlugin.Event.container.close", jSONObject.toString());
            Intent intent = new Intent("TBLiveWVPlugin.Event.container.close");
            intent.addCategory("android.intent.category.DEFAULT");
            intent.putExtra("url", str);
            LocalBroadcastManager.getInstance(getContext()).sendBroadcast(intent);
            new StringBuilder("send BroadCast: ").append(intent.toURI());
        }
        WeakReference<com.taobao.android.live.plugin.atype.flexalocal.tbliveinteractive.container.h5.a> weakReference2 = this.d;
        if (!(weakReference2 == null || weakReference2.get() == null)) {
            this.d.get().b();
        }
        TBLiveH5Container tBLiveH5Container2 = this.q;
        if (tBLiveH5Container2 != null) {
            tBLiveH5Container2.destroy();
            this.q = null;
        }
        zmr zmrVar2 = this.S0;
        if (zmrVar2 != null) {
            zmrVar2.destroy();
            this.S0 = null;
        }
        nnr nnrVar = this.w;
        if (nnrVar != null) {
            nnrVar.e();
        }
        if (hjr.z()) {
            sjr.g().b(this);
        }
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c9109f4", new Object[]{this, dialogInterface});
            return;
        }
        super.onDismiss(dialogInterface);
        TBLiveH5Container tBLiveH5Container = this.q;
        if (tBLiveH5Container != null) {
            tBLiveH5Container.pageDisAppear();
            return;
        }
        zmr zmrVar = this.S0;
        if (zmrVar != null) {
            zmrVar.m();
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80049e8d", new Object[]{this, bundle});
            return;
        }
        super.onSaveInstanceState(bundle);
        TBLiveH5Container tBLiveH5Container = this.q;
        if (tBLiveH5Container != null) {
            bundle.putString("RESTORED_URL", tBLiveH5Container.getUrl());
            return;
        }
        zmr zmrVar = this.S0;
        if (zmrVar != null) {
            bundle.putString("RESTORED_URL", zmrVar.b());
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            return;
        }
        super.onStart();
        TBLiveH5Container tBLiveH5Container = this.q;
        if (tBLiveH5Container != null) {
            tBLiveH5Container.pageAppear();
        }
        zmr zmrVar = this.S0;
        if (zmrVar != null) {
            zmrVar.pageAppear();
        }
        nnr nnrVar = this.w;
        if (nnrVar != null) {
            nnrVar.h();
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
            return;
        }
        super.onStop();
        TBLiveH5Container tBLiveH5Container = this.q;
        if (tBLiveH5Container != null && !tBLiveH5Container.isDestroied()) {
            this.q.pageDisAppear();
        }
        zmr zmrVar = this.S0;
        if (zmrVar != null && !zmrVar.isDestroied()) {
            this.S0.m();
        }
        nnr nnrVar = this.w;
        if (nnrVar != null) {
            nnrVar.i();
        }
    }

    /* renamed from: q3 */
    public BottomSheetDialog onCreateDialog(Bundle bundle) {
        pbe pbeVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BottomSheetDialog) ipChange.ipc$dispatch("26039eba", new Object[]{this, bundle});
        }
        CustomTypeBottomSheetDialog customTypeBottomSheetDialog = new CustomTypeBottomSheetDialog(getContext(), R.style.TaoLiveBottomWebDialogTheme, this);
        AppCompatDelegate delegate = customTypeBottomSheetDialog.getDelegate();
        if (bundle != null) {
            FlexaLiveX.v(getContext());
        }
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.alilive_bottom_web_layout_flexalocal, (ViewGroup) delegate.findViewById(R.id.design_bottom_sheet), false);
        ViewGroup.LayoutParams layoutParams = inflate.getLayoutParams();
        int i = getResources().getDisplayMetrics().heightPixels;
        int k3 = k3(i);
        int l3 = l3(i);
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(-1, k3);
        } else {
            layoutParams.height = k3;
            layoutParams.width = -1;
        }
        inflate.setLayoutParams(layoutParams);
        customTypeBottomSheetDialog.setContentView(inflate);
        if (this.w != null) {
            j3(delegate);
        } else if (!i3(delegate)) {
            v7t.d("TLWebBottomFragment", "WebView has been destroyed");
            dismissAllowingStateLoss();
        }
        t3(customTypeBottomSheetDialog);
        if (!(this.x == null || customTypeBottomSheetDialog.getWindow() == null)) {
            customTypeBottomSheetDialog.getWindow().setBackgroundDrawable(new ColorDrawable(this.x.intValue()));
        }
        BottomSheetBehavior<FrameLayout> from = BottomSheetBehavior.from((FrameLayout) inflate.getParent());
        this.u = from;
        from.setPeekHeight(l3);
        TUrlImageView tUrlImageView = (TUrlImageView) delegate.findViewById(R.id.loading);
        if (tUrlImageView != null) {
            if (this.r) {
                if (this.n) {
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) tUrlImageView.getLayoutParams();
                    layoutParams2.topMargin = b65.a(this.m);
                    tUrlImageView.setLayoutParams(layoutParams2);
                    tUrlImageView.setBackground(getContext().getDrawable(R.drawable.taolive_h5_container_bg_flexalocal));
                } else {
                    tUrlImageView.setImageUrl("https://gw.alicdn.com/imgextra/i1/O1CN01kEjb141PARmuBm9Cd_!!6000000001800-2-tps-750-1244.png");
                }
            } else if (tUrlImageView.getParent() instanceof ViewGroup) {
                ((ViewGroup) tUrlImageView.getParent()).removeView(tUrlImageView);
            }
        }
        zmr zmrVar = this.S0;
        if (!(zmrVar == null || zmrVar.l() == null || (pbeVar = (pbe) this.S0.l().g(pbe.class)) == null || pbeVar.e0() == null)) {
            pbeVar.e0().b(new izw());
        }
        if (this.h) {
            View findViewById = delegate.findViewById(R.id.web);
            if (findViewById != null) {
                findViewById.setOnScrollChangeListener(new a());
            }
            this.u.setBottomSheetCallback(new b(customTypeBottomSheetDialog, delegate, l3, i));
        } else {
            this.u.setHideable(false);
        }
        h3(delegate);
        if (this.i) {
            o3(delegate);
        }
        sjr.g().a(this);
        return customTypeBottomSheetDialog;
    }

    public final void r(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ab8e43d", new Object[]{this, str});
            return;
        }
        v7t.d("TLWebBottomFragment", str);
        dismissAllowingStateLoss();
    }

    public void r3(boolean z) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a1c0d14", new Object[]{this, new Boolean(z)});
            return;
        }
        BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.u;
        if (bottomSheetBehavior != null) {
            if (z) {
                i = 3;
            } else {
                i = 4;
            }
            bottomSheetBehavior.setState(i);
        }
    }

    public void s3(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52b929cb", new Object[]{this, new Boolean(z)});
            return;
        }
        RoundedFrameLayout roundedFrameLayout = this.t;
        if (roundedFrameLayout != null) {
            roundedFrameLayout.setNeedScroll(z);
        }
    }

    public final void t3(BottomSheetDialog bottomSheetDialog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90b14e32", new Object[]{this, bottomSheetDialog});
            return;
        }
        RoundedFrameLayout roundedFrameLayout = (RoundedFrameLayout) bottomSheetDialog.findViewById(R.id.content_root);
        this.t = roundedFrameLayout;
        if (roundedFrameLayout != null) {
            roundedFrameLayout.setSupportScroll(this.i);
            float f = this.g;
            if (f != 0.0f) {
                this.t.setCornerRadii(new float[]{f, f, f, f, 0.0f, 0.0f, 0.0f, 0.0f});
                this.t.setClipChildren(true);
            }
            if (this.o != null) {
                GradientDrawable gradientDrawable = new GradientDrawable();
                float f2 = this.g;
                if (f2 != 0.0f) {
                    gradientDrawable.setCornerRadii(new float[]{f2, f2, f2, f2, 0.0f, 0.0f, 0.0f, 0.0f});
                }
                gradientDrawable.setColor(this.o.intValue());
                this.t.setBackgroundDrawable(gradientDrawable);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b extends BottomSheetBehavior.f {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public int f8679a = -1;
        public boolean b = false;
        public float c = 0.0f;
        public final /* synthetic */ BottomSheetDialog d;
        public final /* synthetic */ AppCompatDelegate e;
        public final /* synthetic */ int f;
        public final /* synthetic */ int g;

        public b(BottomSheetDialog bottomSheetDialog, AppCompatDelegate appCompatDelegate, int i, int i2) {
            this.d = bottomSheetDialog;
            this.e = appCompatDelegate;
            this.f = i;
            this.g = i2;
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/tbliveinteractive/container/h5/TaoLiveWebBottomFragment$2");
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.f
        public void b(View view, int i) {
            boolean z = true;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1bc8f5da", new Object[]{this, view, new Integer(i)});
                return;
            }
            if (TaoLiveWebBottomFragment.U2(TaoLiveWebBottomFragment.this)) {
                if (i != 3) {
                    z = false;
                }
                c(z);
            }
            if (i != 4 || !TaoLiveWebBottomFragment.X2(TaoLiveWebBottomFragment.this)) {
                if (i == 3 && TaoLiveWebBottomFragment.X2(TaoLiveWebBottomFragment.this)) {
                    if (giv.c().b()) {
                        sjr.g().e(uyg.EVENT_MEDIAPLATFORM_HIDE_WIDGETS, "close");
                    } else {
                        sjr.g().c("com.taobao.taolive.room.recommend.good.card.did.appear", null, null);
                    }
                }
            } else if (giv.c().b()) {
                sjr.g().e(uyg.EVENT_MEDIAPLATFORM_SHOW_WIDGETS, "close");
            } else {
                sjr.g().c("com.taobao.taolive.room.recommend.good.card.did.disappear", null, null);
            }
            if (i == 2) {
                if (this.f8679a == -1) {
                    this.f8679a = (this.g - TaoLiveWebBottomFragment.v2(TaoLiveWebBottomFragment.this).getPeekHeight()) + ((int) (this.f * TaoLiveWebBottomFragment.b3(TaoLiveWebBottomFragment.this)));
                }
                if (view.getTop() >= this.f8679a && !this.b) {
                    this.d.cancel();
                }
            } else if (i == 5) {
                this.d.cancel();
            }
        }

        public final void c(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fd8e60d", new Object[]{this, new Boolean(z)});
                return;
            }
            ImageView imageView = (ImageView) this.d.findViewById(R.id.icon_guide);
            TextView textView = (TextView) this.d.findViewById(R.id.tv_guide);
            if (z) {
                TaoLiveWebBottomFragment.A2(TaoLiveWebBottomFragment.this, true);
            }
            if (TaoLiveWebBottomFragment.Q2(TaoLiveWebBottomFragment.this)) {
                if (textView != null) {
                    textView.setVisibility(8);
                }
                if (imageView != null) {
                    imageView.setVisibility(8);
                }
            } else if (z) {
                if (textView != null) {
                    textView.setVisibility(0);
                }
                if (imageView != null) {
                    imageView.setImageResource(R.drawable.alilive_scroll_guide_down_flexalocal);
                }
            } else {
                if (textView != null) {
                    textView.setVisibility(8);
                }
                if (imageView != null) {
                    imageView.setImageResource(R.drawable.alilive_scroll_guide_up_flexalocal);
                }
            }
            if (z) {
                LinearLayout linearLayout = (LinearLayout) this.e.findViewById(R.id.ll_scrooll_guide);
                FrameLayout frameLayout = (FrameLayout) this.e.findViewById(R.id.design_bottom_sheet);
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.e.findViewById(R.id.coordinator);
                if (linearLayout != null && frameLayout != null && (linearLayout.getLayoutParams() instanceof CoordinatorLayout.LayoutParams) && ((CoordinatorLayout.LayoutParams) linearLayout.getLayoutParams()).getBehavior() != null) {
                    ((CoordinatorLayout.LayoutParams) linearLayout.getLayoutParams()).getBehavior().onDependentViewChanged(coordinatorLayout, linearLayout, frameLayout);
                }
            }
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.f
        public void a(View view, float f) {
            boolean z = true;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("af574147", new Object[]{this, view, new Float(f)});
                return;
            }
            new StringBuilder("onSlide: v:").append(f);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("expand", (Object) Boolean.valueOf(((double) f) >= 1.0d));
            String i = fkx.i(jSONObject);
            if (TaoLiveWebBottomFragment.d3(TaoLiveWebBottomFragment.this) != null) {
                WVStandardEventCenter.postNotificationToJS(TaoLiveWebBottomFragment.d3(TaoLiveWebBottomFragment.this), "TBLiveWVPlugin.Event.container.expand", i);
            }
            if (TaoLiveWebBottomFragment.n(TaoLiveWebBottomFragment.this) != null) {
                TaoLiveWebBottomFragment.n(TaoLiveWebBottomFragment.this).g("TBLiveWVPlugin.Event.container.expand", i);
            }
            float abs = Math.abs(f);
            if (abs >= this.c) {
                z = false;
            }
            this.b = z;
            this.c = abs;
        }
    }

    @Override // tb.s3c
    public void onEvent(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3897928", new Object[]{this, str, obj});
            return;
        }
        ux9 ux9Var = this.c;
        if (ux9Var != null && ux9Var.j() != null) {
            boolean z = this.c.j().y;
            if (hjr.t() && z && this.A) {
                if (uyg.EVENT_FULL_SCREEN_APPEAR.equals(str)) {
                    sjr.g().e(uyg.EVENT_CLEAR_SCREEN_IMMERSIVE, "H5ContainerV2");
                    HashMap hashMap = new HashMap();
                    hashMap.put("isMoveUp", "true");
                    hashMap.put("containerHeight", String.valueOf((int) (this.f * hw0.f())));
                    sjr.g().e(uyg.EVENT_LIVE_IMMERSIVE_EXPERIENCE, hashMap);
                }
                this.c.j().y = false;
                o3s.b("TLWebBottomFragment", "返回橱窗弹窗，恢复清屏");
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        super.onPause();
        this.A = false;
        long j = this.y;
        if (!(j == -1 || j == 0)) {
            long currentTimeMillis = System.currentTimeMillis() - this.y;
            HashMap hashMap = new HashMap();
            hashMap.put("stayTime", String.valueOf(currentTimeMillis));
            hashMap.put("supportUpScrollPage", String.valueOf(this.i));
            hashMap.put("useUpScroll", String.valueOf(this.z));
            v2s.o().E().track4Show("Page_TaobaoLiveWatch", "WebViewLayerCloseInfo", hashMap);
        }
        TBLiveH5Container tBLiveH5Container = this.q;
        if (tBLiveH5Container != null && !tBLiveH5Container.isDestroied()) {
            this.q.onPause();
        }
        zmr zmrVar = this.S0;
        if (zmrVar != null && !zmrVar.isDestroied()) {
            this.S0.e();
        }
        nnr nnrVar = this.w;
        if (nnrVar != null) {
            nnrVar.f();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        this.A = true;
        FragmentActivity activity = getActivity();
        if (activity != null) {
            Intent intent = activity.getIntent();
            Intent intent2 = this.v;
            if (intent2 == null) {
                this.v = intent;
            } else if (!TextUtils.equals(intent2.toURI(), intent.toURI())) {
                v2s.o().A().c("TLWebBottomFragment", "半屏容器关闭，Activity Single Instance启动，intent 改变");
                dismissAllowingStateLoss();
                this.y = -1L;
                return;
            }
        }
        this.y = System.currentTimeMillis();
        TBLiveH5Container tBLiveH5Container = this.q;
        if (tBLiveH5Container != null) {
            tBLiveH5Container.onResume();
        }
        zmr zmrVar = this.S0;
        if (zmrVar != null) {
            zmrVar.onResume();
        }
        nnr nnrVar = this.w;
        if (nnrVar != null) {
            nnrVar.g();
        }
    }
}
