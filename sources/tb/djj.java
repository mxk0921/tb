package tb;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.alibaba.android.bindingx.core.a;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import tb.bb2;
import tb.kd5;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class djj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public bb2 f17867a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a implements bmj {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(djj djjVar) {
        }

        @Override // tb.bmj
        public View a(View view, String str) {
            int i;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (View) ipChange.ipc$dispatch("21670ce2", new Object[]{this, view, str});
            }
            if (view == null || TextUtils.isEmpty(str)) {
                return null;
            }
            try {
                i = Integer.parseInt(str);
            } catch (Throwable unused) {
                Context context = view.getContext();
                i = context.getResources().getIdentifier(str, "id", context.getPackageName());
            }
            if (i > 0) {
                return view.findViewById(i);
            }
            return null;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class b implements a.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b(djj djjVar) {
        }

        @Override // com.alibaba.android.bindingx.core.a.c
        public double a(double d, Object... objArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("d30f9d0e", new Object[]{this, new Double(d), objArr})).doubleValue();
            }
            return d;
        }

        @Override // com.alibaba.android.bindingx.core.a.c
        public double b(double d, Object... objArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("671cd02a", new Object[]{this, new Double(d), objArr})).doubleValue();
            }
            return d;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class c implements a.f {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c(djj djjVar) {
        }

        @Override // com.alibaba.android.bindingx.core.a.f
        public void a(View view, String str, Object obj, a.c cVar, Map<String, Object> map, Object... objArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("da6c6fb7", new Object[]{this, view, str, obj, cVar, map, objArr});
            } else {
                dmj.e(str).a(view, str, obj, cVar, map);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class d implements bb2.h<i3c, Context, com.alibaba.android.bindingx.core.a> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d(djj djjVar) {
        }

        /* renamed from: b */
        public i3c a(Context context, com.alibaba.android.bindingx.core.a aVar, Object... objArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (i3c) ipChange.ipc$dispatch("451cd0e1", new Object[]{this, context, aVar, objArr});
            }
            return new jb2(context, aVar, objArr);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class e implements bb2.g {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ gjj f17868a;

        public e(djj djjVar, gjj gjjVar) {
            this.f17868a = gjjVar;
        }

        @Override // tb.bb2.g
        public void callback(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7c9c6f28", new Object[]{this, obj});
                return;
            }
            gjj gjjVar = this.f17868a;
            if (gjjVar != null && (obj instanceof Map)) {
                ((kd5.a) gjjVar).a((Map) obj);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class f implements a.e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final bmj f17869a;

        public f(bmj bmjVar) {
            this.f17869a = bmjVar;
        }

        @Override // com.alibaba.android.bindingx.core.a.e
        public View a(String str, Object... objArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (View) ipChange.ipc$dispatch("9738d72d", new Object[]{this, str, objArr});
            }
            if (objArr == null || objArr.length <= 0) {
                return null;
            }
            Object obj = objArr[0];
            if (!(obj instanceof View)) {
                return null;
            }
            return this.f17869a.a((View) obj, str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class g implements a.f {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final lyc f17870a;

        public g(lyc lycVar) {
            this.f17870a = lycVar;
        }

        @Override // com.alibaba.android.bindingx.core.a.f
        public void a(View view, String str, Object obj, a.c cVar, Map<String, Object> map, Object... objArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("da6c6fb7", new Object[]{this, view, str, obj, cVar, map, objArr});
                return;
            }
            lyc lycVar = this.f17870a;
            if (lycVar != null) {
                lycVar.a(view, str, obj, cVar, map);
            }
        }
    }

    public djj(bmj bmjVar, a.c cVar, lyc lycVar, a.d dVar) {
        a.f fVar;
        k21.b("dx", null);
        bmjVar = bmjVar == null ? new a(this) : bmjVar;
        cVar = cVar == null ? new b(this) : cVar;
        if (lycVar == null) {
            fVar = new c(this);
        } else {
            fVar = new g(lycVar);
        }
        bb2 bb2Var = new bb2(c(new f(bmjVar), cVar, fVar, dVar));
        this.f17867a = bb2Var;
        bb2Var.l("scroll", new d(this));
    }

    public static djj b(bmj bmjVar, a.c cVar, lyc lycVar, a.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (djj) ipChange.ipc$dispatch("38c610c8", new Object[]{bmjVar, cVar, lycVar, dVar});
        }
        return new djj(bmjVar, cVar, lycVar, dVar);
    }

    public final com.alibaba.android.bindingx.core.a c(a.e eVar, a.c cVar, a.f fVar, a.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.alibaba.android.bindingx.core.a) ipChange.ipc$dispatch("d107a911", new Object[]{this, eVar, cVar, fVar, dVar});
        }
        return new a.b().d(eVar).b(cVar).e(fVar).c(dVar).a();
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        bb2 bb2Var = this.f17867a;
        if (bb2Var != null) {
            bb2Var.f();
            this.f17867a = null;
            dmj.d();
        }
    }

    public void e(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c175de08", new Object[]{this, map});
            return;
        }
        bb2 bb2Var = this.f17867a;
        if (bb2Var != null) {
            bb2Var.h(map);
        }
    }

    public Map<String, Object> a(View view, Map<String, Object> map, gjj gjjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("96e2d09e", new Object[]{this, view, map, gjjVar});
        }
        if (view == null) {
            gfh.b("params invalid. view is null");
            return Collections.emptyMap();
        }
        if (map == null) {
            map = Collections.emptyMap();
        }
        String c2 = this.f17867a.c(view.getContext(), null, map, new e(this, gjjVar), view);
        HashMap hashMap = new HashMap(2);
        hashMap.put("token", c2);
        hashMap.put("eventType", pxv.h(map, "eventType"));
        return hashMap;
    }
}
