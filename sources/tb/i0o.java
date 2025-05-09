package tb;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class i0o {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static i0o h;

    /* renamed from: a  reason: collision with root package name */
    public final HashMap<View, String> f21019a = new HashMap<>();
    public final HashMap<String, cik> b = new HashMap<>();
    public final String c = "";
    public final String d = "common";
    public final String e = "default_detail";
    public String f = "default_detail";
    public final ViewGroup.OnHierarchyChangeListener g = new a();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements ViewGroup.OnHierarchyChangeListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewAdded(View view, View view2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c61913e5", new Object[]{this, view, view2});
            } else if (view2 instanceof ViewGroup) {
                i0o i0oVar = i0o.this;
                i0o.b(i0oVar, (ViewGroup) view2, i0o.a(i0oVar));
            } else {
                i0o i0oVar2 = i0o.this;
                i0o.c(i0oVar2, view2, i0o.a(i0oVar2));
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewRemoved(View view, View view2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b61353c5", new Object[]{this, view, view2});
            }
        }
    }

    static {
        t2o.a(1039138842);
        t2o.a(1039138832);
    }

    public i0o() {
        g(EditText.class.getName(), new i78());
        g(ImageView.class.getName(), new cqe());
        g(Button.class.getName(), new eo2());
        g(ImageButton.class.getName(), new qie());
        g(LinearLayout.class.getName(), new spg());
        g(RelativeLayout.class.getName(), new rwn());
        g(TextView.class.getName(), new zmt());
        g(ListView.class.getName(), new avg());
        g(View.class.getName(), new qfw());
    }

    public static /* synthetic */ String a(i0o i0oVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("59078e1a", new Object[]{i0oVar});
        }
        return i0oVar.c;
    }

    public static /* synthetic */ void b(i0o i0oVar, ViewGroup viewGroup, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("852d90d0", new Object[]{i0oVar, viewGroup, str});
        } else {
            i0oVar.f(viewGroup, str);
        }
    }

    public static /* synthetic */ void c(i0o i0oVar, View view, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("338afd4", new Object[]{i0oVar, view, str});
        } else {
            i0oVar.h(view, str);
        }
    }

    public static i0o e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (i0o) ipChange.ipc$dispatch("adc95ad3", new Object[0]);
        }
        if (h == null) {
            h = new i0o();
        }
        return h;
    }

    public final String d(Class cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("21281577", new Object[]{this, cls});
        }
        String name = cls.getName();
        if (name.equals("Object")) {
            return "";
        }
        if (this.b.containsKey(name)) {
            return name;
        }
        return d(cls.getSuperclass());
    }

    public final synchronized void f(ViewGroup viewGroup, String str) {
        synchronized (this) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("83ee1565", new Object[]{this, viewGroup, str});
            } else if (!this.f21019a.containsKey(viewGroup)) {
                h(viewGroup, str);
                viewGroup.setOnHierarchyChangeListener(this.g);
                for (int i = 0; i <= viewGroup.getChildCount(); i++) {
                    View childAt = viewGroup.getChildAt(i);
                    if (childAt != null) {
                        if (childAt instanceof ViewGroup) {
                            f((ViewGroup) childAt, str);
                        } else if (!this.f21019a.containsKey(viewGroup)) {
                            h(childAt, str);
                        } else {
                            return;
                        }
                    }
                }
            }
        }
    }

    public void g(String str, cik cikVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cdb21b60", new Object[]{this, str, cikVar});
        } else {
            this.b.put(str, cikVar);
        }
    }

    public final void h(View view, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7946a51f", new Object[]{this, view, str});
        }
    }

    public final void i(Object obj, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0a6da4d", new Object[]{this, obj, str, str2});
        } else {
            j(obj, str, str2, null);
        }
    }

    public final void j(Object obj, String str, String str2, cjd cjdVar) {
        cik cikVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0bc0048", new Object[]{this, obj, str, str2, cjdVar});
        } else if (obj != null) {
            String d = d(obj.getClass());
            if (!TextUtils.isEmpty(d) && this.b.containsKey(d) && (cikVar = this.b.get(d)) != null) {
                cikVar.a(obj, str, str2, cjdVar, this.f);
            }
        }
    }

    public void k(View view, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97965826", new Object[]{this, view, str, str2, str3});
        } else if (view != null) {
            if (TextUtils.isEmpty(str3)) {
                this.f = this.e;
            } else if (!str3.equals(this.f)) {
                this.f = str3;
            }
            if (TextUtils.isEmpty(str2) || ntq.i().h(this.f) == null || !ntq.i().h(this.f).contains(str2)) {
                str2 = this.d;
            }
            try {
                if (ntq.i().k(this.f).containsKey(str)) {
                    i(view, str2, str);
                } else if (ntq.i().g(str2, e().f) != null && ntq.i().g(str2, e().f).containsKey(str)) {
                    i(view, str2, str);
                }
            } catch (Throwable th) {
                mgh.b(th);
            }
        }
    }
}
