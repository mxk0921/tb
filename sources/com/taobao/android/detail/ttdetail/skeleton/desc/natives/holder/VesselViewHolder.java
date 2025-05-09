package com.taobao.android.detail.ttdetail.skeleton.desc.natives.holder;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.widget.AbsListView;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.common.Constants;
import com.taobao.android.detail.ttdetail.utils.UtUtils;
import com.taobao.vessel.VesselView;
import com.taobao.vessel.utils.VesselType;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import tb.ag9;
import tb.c5x;
import tb.cbo;
import tb.i4w;
import tb.j4w;
import tb.kd7;
import tb.mr7;
import tb.pos;
import tb.q84;
import tb.t2o;
import tb.tgh;
import tb.tq4;
import tb.uu7;
import tb.ux1;
import tb.uyv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class VesselViewHolder extends kd7<j4w> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String PAGE_NAME = "Page_Detail";
    public static final String UT_SHOW_ARG1 = "Page_Detail_Show_ProductDetail";
    public static final String WX_OPTIONS_KEY = "bundleUrl";
    public final FrameLayout h;
    public VesselView i;
    public String j;
    public String k;
    public String m;
    public int n;
    public String p;
    public String q;
    public j4w r;
    public c t;
    public Future<String> u;
    public d v;
    public static final String w = "method";
    public static final String x = Constants.KEY_CONTROL;
    public static final String y = "show";
    public static final String z = "hide";
    public static final String A = "click";
    public String l = "1";
    public int o = 0;
    public final Handler s = new Handler(Looper.getMainLooper());

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements i4w {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.i4w
        public void u2(Map<String, Object> map, cbo cboVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("aef7dc0c", new Object[]{this, map, cboVar});
            } else {
                VesselViewHolder.y(VesselViewHolder.this, map, cboVar);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f6901a;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;
        public final /* synthetic */ String d;

        public b(String str, String str2, String str3, String str4) {
            this.f6901a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            VesselViewHolder vesselViewHolder = VesselViewHolder.this;
            if (vesselViewHolder.f22590a != null) {
                VesselViewHolder.B(vesselViewHolder, this.f6901a, this.b, this.c, this.d);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private String f6902a;
        private VesselType b;

        static {
            t2o.a(912262405);
        }

        public c(String str, VesselType vesselType) {
            this.f6902a = str;
            this.b = vesselType;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            VesselViewHolder vesselViewHolder = VesselViewHolder.this;
            if (vesselViewHolder.f22590a != null) {
                if (this.f6902a == null) {
                    Integer num = 4;
                    VesselViewHolder.C(VesselViewHolder.this, num.toString(), "FILE_READ", "read file error");
                } else if (VesselViewHolder.I(vesselViewHolder) != null && VesselViewHolder.D(VesselViewHolder.this) != null) {
                    VesselViewHolder.I(VesselViewHolder.this).loadData(this.b, this.f6902a, VesselViewHolder.z(VesselViewHolder.this));
                    if (VesselViewHolder.I(VesselViewHolder.this).getParent() == null) {
                        VesselViewHolder.D(VesselViewHolder.this).addView(VesselViewHolder.I(VesselViewHolder.this));
                    }
                    VesselViewHolder.A(VesselViewHolder.this);
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class d extends uu7 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final VesselType f6903a;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ String f6904a;

            public a(String str) {
                this.f6904a = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                String str;
                Integer num;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else if (VesselViewHolder.this.f22590a != null) {
                    if ("md5CheckFail".equals(this.f6904a)) {
                        num = 3;
                        str = "FILE_VALIDATE_MD5";
                    } else {
                        num = 2;
                        str = "FILE_DOWNLOAD";
                    }
                    VesselViewHolder.C(VesselViewHolder.this, num.toString(), str, this.f6904a);
                }
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
        public class b implements Callable<String> {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ File f6905a;

            public b(File file) {
                this.f6905a = file;
            }

            /* renamed from: a */
            public String call() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (String) ipChange.ipc$dispatch("5fe77b5b", new Object[]{this});
                }
                String str = null;
                try {
                    str = ag9.c(this.f6905a.getPath());
                    if (str == null) {
                        ag9.a(this.f6905a.getPath());
                    }
                    VesselViewHolder vesselViewHolder = VesselViewHolder.this;
                    d dVar = d.this;
                    VesselViewHolder.G(vesselViewHolder, new c(str, d.e(dVar)));
                    VesselViewHolder.H(VesselViewHolder.this).post(VesselViewHolder.F(VesselViewHolder.this));
                } catch (Exception e) {
                    tgh.c("Detail-VesselVH", "load desc weex component error.", e);
                }
                return str;
            }
        }

        static {
            t2o.a(912262406);
        }

        public d(VesselType vesselType) {
            this.f6903a = vesselType;
        }

        public static /* synthetic */ VesselType e(d dVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (VesselType) ipChange.ipc$dispatch("5fb585bc", new Object[]{dVar});
            }
            return dVar.f6903a;
        }

        public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/skeleton/desc/natives/holder/VesselViewHolder$VesselDownloadListener");
        }

        @Override // tb.uu7
        public void b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("239cc86e", new Object[]{this, str});
            } else {
                VesselViewHolder.D(VesselViewHolder.this).post(new a(str));
            }
        }

        @Override // tb.uu7
        public void d(File file) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6b6b55e2", new Object[]{this, file});
            } else {
                VesselViewHolder.E(VesselViewHolder.this, pos.b(new b(file)));
            }
        }
    }

    public VesselViewHolder(Context context) {
        super(context);
        this.h = new FrameLayout(context);
        UtUtils.f(19999, "exposure_vesselviewholder", new JSONObject() { // from class: com.taobao.android.detail.ttdetail.skeleton.desc.natives.holder.VesselViewHolder.1
            {
                put("url", (Object) VesselViewHolder.x(VesselViewHolder.this));
            }
        });
    }

    public static /* synthetic */ void A(VesselViewHolder vesselViewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b17c66e", new Object[]{vesselViewHolder});
        } else {
            vesselViewHolder.W();
        }
    }

    public static /* synthetic */ void B(VesselViewHolder vesselViewHolder, String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("169f5428", new Object[]{vesselViewHolder, str, str2, str3, str4});
        } else {
            vesselViewHolder.U(str, str2, str3, str4);
        }
    }

    public static /* synthetic */ void C(VesselViewHolder vesselViewHolder, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bcf001f", new Object[]{vesselViewHolder, str, str2, str3});
        } else {
            vesselViewHolder.V(str, str2, str3);
        }
    }

    public static /* synthetic */ FrameLayout D(VesselViewHolder vesselViewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("b0bee997", new Object[]{vesselViewHolder});
        }
        return vesselViewHolder.h;
    }

    public static /* synthetic */ Future E(VesselViewHolder vesselViewHolder, Future future) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Future) ipChange.ipc$dispatch("fda31c17", new Object[]{vesselViewHolder, future});
        }
        vesselViewHolder.u = future;
        return future;
    }

    public static /* synthetic */ c F(VesselViewHolder vesselViewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("bf74e783", new Object[]{vesselViewHolder});
        }
        return vesselViewHolder.t;
    }

    public static /* synthetic */ c G(VesselViewHolder vesselViewHolder, c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("8d27be48", new Object[]{vesselViewHolder, cVar});
        }
        vesselViewHolder.t = cVar;
        return cVar;
    }

    public static /* synthetic */ Handler H(VesselViewHolder vesselViewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("3f75f300", new Object[]{vesselViewHolder});
        }
        return vesselViewHolder.s;
    }

    public static /* synthetic */ VesselView I(VesselViewHolder vesselViewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (VesselView) ipChange.ipc$dispatch("49cd60bd", new Object[]{vesselViewHolder});
        }
        return vesselViewHolder.i;
    }

    public static /* synthetic */ Object ipc$super(VesselViewHolder vesselViewHolder, String str, Object... objArr) {
        if (str.hashCode() == -1504501726) {
            super.p();
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/skeleton/desc/natives/holder/VesselViewHolder");
    }

    public static /* synthetic */ String x(VesselViewHolder vesselViewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6ece1662", new Object[]{vesselViewHolder});
        }
        return vesselViewHolder.k;
    }

    public static /* synthetic */ void y(VesselViewHolder vesselViewHolder, Map map, cbo cboVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0febfa1", new Object[]{vesselViewHolder, map, cboVar});
        } else {
            vesselViewHolder.a0(map, cboVar);
        }
    }

    public static /* synthetic */ HashMap z(VesselViewHolder vesselViewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("97989590", new Object[]{vesselViewHolder});
        }
        return vesselViewHolder.O();
    }

    public final String J(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("671c7840", new Object[]{this, str, map});
        }
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        StringBuilder sb = new StringBuilder(str);
        if (map != null && map.size() >= 1) {
            Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
            sb.append("?");
            while (it.hasNext()) {
                Map.Entry<String, String> next = it.next();
                sb.append(next.getKey());
                sb.append("=");
                sb.append(next.getValue());
                if (it.hasNext()) {
                    sb.append("&");
                }
            }
        }
        String sb2 = sb.toString();
        String[] split = sb2.split("_wx_tpl=");
        if (split == null || split.length < 2) {
            return sb2;
        }
        return split[1];
    }

    public final void K(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24a53661", new Object[]{this, str, str2, str3, str4});
        } else {
            this.h.post(new b(str, str2, str3, str4));
        }
    }

    /* renamed from: L */
    public boolean g(j4w j4wVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2d85ad40", new Object[]{this, j4wVar})).booleanValue();
        }
        try {
            this.r = j4wVar;
            if (!(this.d == null || j4wVar == null)) {
                if (m(j4wVar)) {
                    this.d.setVisibility(8);
                } else {
                    if (this.d.getVisibility() == 8) {
                        this.d.setVisibility(0);
                    }
                    f(j4wVar);
                    h(j4wVar);
                }
            }
            return true;
        } catch (Exception unused) {
            Y();
            return false;
        }
    }

    public final void M() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7baed91e", new Object[]{this});
            return;
        }
        if (this.i == null) {
            this.i = new VesselView(this.f22590a);
        }
        this.i.setAlpha(1.0f);
        this.i.setBackgroundColor(-1);
        if (!TextUtils.isEmpty(this.r.k)) {
            this.i.setLayoutParams(new FrameLayout.LayoutParams(-1, this.n));
        }
        this.i.setVesselViewCallback(new a());
        this.i.setDowngradeEnable(false);
    }

    /* renamed from: N */
    public void h(j4w j4wVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d674982", new Object[]{this, j4wVar});
        } else if (j4wVar != null) {
            try {
                Q(j4wVar);
                M();
                String str = this.l;
                K(str, this.k, this.j, str);
            } catch (Exception unused) {
                Y();
            }
        }
    }

    public final HashMap<String, Object> O() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("e5fee8be", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        hashMap.put("spm", this.m);
        hashMap.put("sellerId", this.p);
        hashMap.put("itemId", this.q);
        HashMap<String, Object> hashMap2 = new HashMap<>();
        hashMap2.put("bundleUrl", J(this.k, hashMap));
        return hashMap2;
    }

    /* renamed from: P */
    public View j(j4w j4wVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("6fe49712", new Object[]{this, j4wVar});
        }
        this.h.setLayoutParams(new AbsListView.LayoutParams(-1, 0));
        S(this.o);
        this.h.requestLayout();
        return this.h;
    }

    public final void Q(j4w j4wVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90d0b99e", new Object[]{this, j4wVar});
            return;
        }
        this.n = mr7.b(this.f22590a, j4wVar.p);
        this.l = j4wVar.l;
        this.o = j4wVar.o;
        this.m = j4wVar.n;
        this.j = j4wVar.m;
        this.k = j4wVar.k;
        this.p = j4wVar.r;
        this.q = j4wVar.q;
        this.r = j4wVar;
    }

    /* renamed from: R */
    public boolean m(j4w j4wVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cf113306", new Object[]{this, j4wVar})).booleanValue();
        }
        return TextUtils.isEmpty(j4wVar.k);
    }

    public final void S(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c85b4700", new Object[]{this, new Integer(i)});
        } else if (i == 0) {
            this.h.setVisibility(8);
        } else if (i == 1) {
            this.h.setVisibility(0);
        } else if (i != 2) {
            this.h.setVisibility(8);
        } else {
            this.h.setVisibility(8);
        }
    }

    public final void T(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84026903", new Object[]{this, new Integer(i)});
        } else if (i == 0) {
            this.i.setLayoutParams(new FrameLayout.LayoutParams(-1, this.n));
            this.h.setLayoutParams(new AbsListView.LayoutParams(-1, this.n));
            this.h.setVisibility(0);
            this.h.requestLayout();
            w();
        } else if (i == 1) {
            this.i.setLayoutParams(new FrameLayout.LayoutParams(-1, this.n));
            this.h.setLayoutParams(new AbsListView.LayoutParams(-1, this.n));
            this.h.setVisibility(0);
            this.h.requestLayout();
            w();
        } else if (i != 2) {
            this.h.setVisibility(8);
        } else {
            this.i.setLayoutParams(new FrameLayout.LayoutParams(-1, 0));
            this.h.setLayoutParams(new AbsListView.LayoutParams(-1, 0));
            this.h.setVisibility(8);
            this.h.requestLayout();
        }
    }

    public final void V(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fdea167", new Object[]{this, str, str2, str3});
            return;
        }
        this.h.setLayoutParams(new AbsListView.LayoutParams(-1, 0));
        this.h.setVisibility(8);
        this.h.requestLayout();
        tgh.b("Detail-VesselVH", "load desc weex component error." + str);
        if (str != null) {
            tgh.b("Detail-VesselVH", "Error code == ".concat(str));
        }
        if (str2 != null) {
            tgh.b("Detail-VesselVH", "Error code == " + str);
        }
        if (str3 != null) {
            tgh.b("Detail-VesselVH", "Error errorInfo == ".concat(str3));
        }
    }

    public final void W() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8368c920", new Object[]{this});
        } else {
            T(this.o);
        }
    }

    public final void X(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47cd0c98", new Object[]{this, str});
        }
    }

    public final void Y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6daa726", new Object[]{this});
            return;
        }
        this.i.setLayoutParams(new FrameLayout.LayoutParams(-1, 0));
        this.h.setLayoutParams(new AbsListView.LayoutParams(-1, 0));
        this.h.setVisibility(8);
        this.h.requestLayout();
    }

    public final void Z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b5acee1", new Object[]{this});
            return;
        }
        FrameLayout frameLayout = this.h;
        if (frameLayout != null && frameLayout.getVisibility() != 0) {
            this.i.setLayoutParams(new FrameLayout.LayoutParams(-1, this.n));
            this.h.setLayoutParams(new AbsListView.LayoutParams(-1, this.n));
            this.h.setVisibility(0);
            this.h.requestLayout();
            w();
        }
    }

    public final void a0(Map<String, Object> map, cbo cboVar) {
        Object obj;
        Object obj2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14e7e716", new Object[]{this, map, cboVar});
        } else if (map != null) {
            String str = w;
            if (map.containsKey(str) && (obj = map.get(str)) != null && (obj instanceof String)) {
                String str2 = (String) obj;
                if (y.equals(str2)) {
                    Z();
                    cboVar.invoke(new HashMap());
                }
                if (z.equals(str2)) {
                    Y();
                }
                if (A.equals(str2)) {
                    String str3 = x;
                    if (map.containsKey(str3) && (obj2 = map.get(str3)) != null && (obj2 instanceof String)) {
                        X((String) obj2);
                    }
                }
            }
        }
    }

    public final void b0(j4w j4wVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f515aee0", new Object[]{this, j4wVar});
            return;
        }
        ux1 ux1Var = this.e;
        if (ux1Var != null && !j4wVar.e) {
            q84.f(this.f22590a, ux1Var);
            j4wVar.e = true;
        }
    }

    @Override // tb.kd7
    public void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        try {
            Future<String> future = this.u;
            if (future != null) {
                future.cancel(true);
            }
            this.v = null;
            c cVar = this.t;
            if (cVar != null) {
                this.s.removeCallbacks(cVar);
                this.t = null;
            }
            VesselView vesselView = this.i;
            if (vesselView != null) {
                vesselView.onDestroy();
            }
            this.f22590a = null;
        } catch (Exception e) {
            tgh.c("Detail-VesselVH", "VessleView onDestroy异常", e);
        }
        super.p();
    }

    public void w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("892942a4", new Object[]{this});
        } else {
            b0(this.r);
        }
    }

    public final void U(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6023f5c5", new Object[]{this, str, str2, str3, str4});
            return;
        }
        this.h.setVisibility(8);
        VesselType m = uyv.m(str2);
        if (m.equals(VesselType.Web)) {
            Integer num = 1;
            V(num.toString(), "URL_ERROR", "vessel cannot load web");
            return;
        }
        this.v = new d(m);
        new c5x(tq4.d(this.h).getApplicationContext(), str, str3, uyv.n(str2), this.v).j();
    }

    static {
        t2o.a(912262401);
    }
}
