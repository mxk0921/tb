package com.taobao.android.tracker;

import android.app.Activity;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tracker.util.TrackerType;
import tb.acu;
import tb.bcu;
import tb.bll;
import tb.e9x;
import tb.fgc;
import tb.fgh;
import tb.h4v;
import tb.k71;
import tb.o65;
import tb.oif;
import tb.p58;
import tb.t2o;
import tb.x22;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public oif f9679a;
    public final fgc b = new b(this);

    /* compiled from: Taobao */
    /* renamed from: com.taobao.android.tracker.a$a  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class C0499a implements c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Activity f9680a;
        public final /* synthetic */ String b;

        public C0499a(Activity activity, String str) {
            this.f9680a = activity;
            this.b = str;
        }

        @Override // com.taobao.android.tracker.a.c
        public void a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e5ce7f62", new Object[]{this, str});
                return;
            }
            fgh.a("onUpdateConfigEnd");
            Activity activity = this.f9680a;
            if (activity != null) {
                a.this.d(activity, this.b);
                fgh.a("initCustomIntercept  end");
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b implements fgc {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b(a aVar) {
        }

        @Override // tb.fgc
        public void a(String str, View view) {
            acu acuVar;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a2903396", new Object[]{this, str, view});
                return;
            }
            try {
                x22.a();
                String c = x22.c(e9x.a(view));
                if (!TextUtils.isEmpty(c)) {
                    x22.b(x22.a());
                    long a2 = x22.a();
                    o65 g = p58.m().g();
                    if (g != null) {
                        bll i = g.i(c);
                        if (i != null) {
                            acuVar = g.j(i, c, view, TrackerType.TrackerType_Click);
                        } else {
                            return;
                        }
                    } else {
                        acuVar = null;
                    }
                    x22.b(a2);
                    if (acuVar != null) {
                        h4v.a(acuVar);
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
                k71.a("catch_crash", "TrackerManager.onRealClick", "-999", e.getMessage());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface c {
        void a(String str);
    }

    static {
        t2o.a(455081993);
    }

    public static View a(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("75980538", new Object[]{activity});
        }
        if (activity == null) {
            return null;
        }
        try {
            ViewGroup viewGroup = (ViewGroup) activity.findViewById(16908290);
            if (viewGroup != null) {
                return viewGroup;
            }
            return null;
        } catch (Exception e) {
            bcu.b(e.toString());
            return null;
        }
    }

    public static a b(Activity activity) {
        View a2;
        Object tag;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("c74836ef", new Object[]{activity});
        }
        if (activity == null || (a2 = a(activity)) == null || (tag = a2.getTag(-1091013)) == null || !(tag instanceof a)) {
            return null;
        }
        return (a) tag;
    }

    public static void e(Activity activity, a aVar) {
        View a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("456ab961", new Object[]{activity, aVar});
        } else if (activity != null && aVar != null && (a2 = a(activity)) != null) {
            a2.setTag(-1091013, aVar);
        }
    }

    public void c(Activity activity, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("834b6f33", new Object[]{this, activity, str});
            return;
        }
        try {
            o65 g = p58.m().g();
            if (g != null && g.b()) {
                g.o(str, new C0499a(activity, str));
            }
        } catch (Exception e) {
            e.printStackTrace();
            k71.a("catch_crash", "TrackerManager.init", "-999", e.getMessage());
        }
    }

    public void d(Activity activity, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc8e89c4", new Object[]{this, activity, str});
            return;
        }
        bcu.a("TrackerManager:initIntercept");
        if (this.f9679a == null) {
            oif oifVar = new oif();
            this.f9679a = oifVar;
            oifVar.e(this.b);
            this.f9679a.a(activity, str);
        }
    }

    public void f(Activity activity, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89a04bec", new Object[]{this, activity, str});
            return;
        }
        try {
            g(activity);
            if (!TextUtils.isEmpty(str)) {
                Message obtain = Message.obtain();
                obtain.obj = str;
                p58.m().h("action_weex_uninit", obtain);
            }
        } catch (Exception e) {
            k71.a("catch_crash", "TrackerManager.unInit", "-999", e.getMessage());
            e.printStackTrace();
        }
    }

    public final void g(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7faf5061", new Object[]{this, activity});
            return;
        }
        bcu.a("TrackerManager:unInitIntercept");
        oif oifVar = this.f9679a;
        if (oifVar != null) {
            oifVar.e(null);
            this.f9679a.f(activity);
        }
    }
}
