package tb;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamic.tempate.DinamicTemplate;
import com.taobao.android.dinamic.view.CompatibleView;
import com.taobao.android.dinamic.view.DFrameLayout;
import com.taobao.android.dinamic.view.DLinearLayout;
import com.taobao.android.dinamic.view.DLoopLinearLayout;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParser;
import tb.bn7;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class q65 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "DViewGenerator";

    /* renamed from: a  reason: collision with root package name */
    public final String f26533a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ tfw f26534a;
        public final /* synthetic */ long b;

        public a(tfw tfwVar, long j) {
            this.f26534a = tfwVar;
            this.b = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            mm7 b;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            if (tl7.f()) {
                ym7.a(tl7.TAG, "createView template=" + this.f26534a.c() + "consumimg=" + (this.b / 1000000.0d));
            }
            dn7 d = f65.n().d();
            String a2 = q65.a(q65.this);
            DinamicTemplate c = this.f26534a.c();
            boolean f = this.f26534a.f();
            if (this.f26534a.f()) {
                b = null;
            } else {
                b = this.f26534a.b();
            }
            d.e(a2, c, f, b, this.b / 1000000.0d);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ tfw f26535a;
        public final /* synthetic */ long b;

        public b(tfw tfwVar, long j) {
            this.f26535a = tfwVar;
            this.b = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            mm7 b;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            if (tl7.f()) {
                ym7.a(tl7.TAG, "bindData template=" + this.f26535a.c() + "consuming=" + (this.b / 1000000.0d));
            }
            dn7 d = f65.n().d();
            String a2 = q65.a(q65.this);
            DinamicTemplate c = this.f26535a.c();
            boolean e = this.f26535a.e();
            if (this.f26535a.e()) {
                b = null;
            } else {
                b = this.f26535a.b();
            }
            d.d(a2, c, e, b, this.b / 1000000.0d);
        }
    }

    static {
        t2o.a(444596227);
    }

    public q65(String str) {
        this.f26533a = "default";
        new ArrayDeque(16);
        this.f26533a = str;
    }

    public static /* synthetic */ String a(q65 q65Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("75be66d3", new Object[]{q65Var});
        }
        return q65Var.f26533a;
    }

    public static q65 q(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (q65) ipChange.ipc$dispatch("1cc51ea5", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return tl7.c("default").f20313a;
        }
        return tl7.c(str).f20313a;
    }

    public final void b(DinamicTemplate dinamicTemplate) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("363b1937", new Object[]{this, dinamicTemplate});
        } else if (f65.n().c() != null && zm7.a()) {
            f65.n().c().a(this.f26533a, dinamicTemplate);
        }
    }

    public final void c(DinamicTemplate dinamicTemplate) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d607b1", new Object[]{this, dinamicTemplate});
        } else if (f65.n().c() != null && zm7.a()) {
            f65.n().c().b(this.f26533a, dinamicTemplate);
        }
    }

    public tfw e(View view, Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tfw) ipChange.ipc$dispatch("1d7f74f0", new Object[]{this, view, obj, obj2});
        }
        return h(view, obj, false, obj2);
    }

    public final tfw f(bn7 bn7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tfw) ipChange.ipc$dispatch("16fc0f4e", new Object[]{this, bn7Var});
        }
        long nanoTime = System.nanoTime();
        tfw e = bn7Var.e();
        Iterator<View> it = e.a().iterator();
        while (it.hasNext()) {
            View next = it.next();
            try {
                hm7.a(next, bn7Var);
            } catch (Throwable unused) {
                mm7 b2 = e.b();
                b2.a("other", next.getClass() + "bind data failed;");
            }
        }
        n(e, System.nanoTime() - nanoTime);
        return e;
    }

    public void g(ArrayList<View> arrayList, bn7 bn7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5cd9fbf", new Object[]{this, arrayList, bn7Var});
            return;
        }
        Iterator<View> it = arrayList.iterator();
        while (it.hasNext()) {
            View next = it.next();
            try {
                hm7.a(next, bn7Var);
            } catch (Throwable unused) {
                mm7 b2 = bn7Var.e().b();
                b2.a("other", next.getClass() + "bind data failed;");
            }
        }
    }

    public final tfw h(View view, Object obj, boolean z, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tfw) ipChange.ipc$dispatch("641a1f32", new Object[]{this, view, obj, new Boolean(z), obj2});
        }
        if (view == null || obj == null) {
            tfw tfwVar = new tfw(this.f26533a);
            tfwVar.b().a("other", "binddata rootView or data is null");
            return tfwVar;
        }
        int i = jn7.TAG_ROOT_VIEW_RESULT;
        tfw tfwVar2 = (tfw) view.getTag(i);
        if (tfwVar2 == null) {
            View findViewWithTag = view.findViewWithTag("dinamicRootView");
            if (findViewWithTag == null) {
                tfw tfwVar3 = new tfw(this.f26533a);
                tfwVar3.b().a("other", "binddata rootView or data is null");
                return tfwVar3;
            }
            tfwVar2 = (tfw) findViewWithTag.getTag(i);
            if (tfwVar2 == null) {
                tfw tfwVar4 = new tfw(this.f26533a);
                tfwVar4.b().a("other", "binddata rootView or data is null");
                return tfwVar4;
            }
        }
        b(tfwVar2.c());
        bn7.b bVar = new bn7.b();
        bVar.h(obj2);
        bVar.i(this.f26533a);
        bVar.k(tfwVar2);
        bVar.j(obj);
        bVar.g(obj);
        return f(bVar.f());
    }

    public final void i(Context context, View view, View view2, tfw tfwVar, bn7 bn7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0593719", new Object[]{this, context, view, view2, tfwVar, bn7Var});
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            View a2 = tn7.a(context, childAt, tfwVar, bn7Var);
            if (a2 != null) {
                ((ViewGroup) view2).addView(a2, childAt.getLayoutParams());
                if (m(childAt)) {
                    i(context, childAt, a2, tfwVar, bn7Var);
                }
            }
        }
    }

    public tfw j(View view, Context context, bn7 bn7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tfw) ipChange.ipc$dispatch("2e740202", new Object[]{this, view, context, bn7Var});
        }
        tfw tfwVar = new tfw(this.f26533a);
        tfwVar.g(new ArrayList<>(20));
        View a2 = tn7.a(context, view, tfwVar, bn7Var);
        if (a2 == null) {
            tfwVar.i(null);
            return tfwVar;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            a2.setLayoutParams(layoutParams);
        }
        if (!(view instanceof ViewGroup)) {
            tfwVar.i(a2);
            return tfwVar;
        }
        i(context, view, a2, tfwVar, bn7Var);
        tfwVar.i(a2);
        return tfwVar;
    }

    public tfw k(Context context, ViewGroup viewGroup, DinamicTemplate dinamicTemplate) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tfw) ipChange.ipc$dispatch("4468cd43", new Object[]{this, context, viewGroup, dinamicTemplate});
        }
        return l(context, viewGroup, dinamicTemplate, null);
    }

    public tfw l(Context context, ViewGroup viewGroup, DinamicTemplate dinamicTemplate, Object obj) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tfw) ipChange.ipc$dispatch("a6b427", new Object[]{this, context, viewGroup, dinamicTemplate, obj});
        }
        long nanoTime = System.nanoTime();
        if (context == null || dinamicTemplate == null || !dinamicTemplate.checkValid()) {
            tfw tfwVar = new tfw(this.f26533a);
            tfwVar.i(null);
            tfwVar.h(dinamicTemplate);
            mm7 b2 = tfwVar.b();
            if (dinamicTemplate != null) {
                str = dinamicTemplate.toString();
            } else {
                str = "context=null or exactTemplate=null";
            }
            b2.a(mm7.ERROR_CODE_TEMPLATE_INFO_ERROR, str);
            o(tfwVar, System.nanoTime() - nanoTime);
            return tfwVar;
        }
        c(dinamicTemplate);
        String str2 = this.f26533a;
        tfw tfwVar2 = new tfw(str2);
        XmlPullParser a2 = cn7.a(str2, dinamicTemplate, tfwVar2);
        long nanoTime2 = System.nanoTime();
        if (a2 != null) {
            try {
                tfwVar2.h(dinamicTemplate);
                tfwVar2.g(new ArrayList<>(20));
                bn7.b bVar = new bn7.b();
                bVar.k(tfwVar2);
                bVar.i(this.f26533a);
                bVar.h(obj);
                View inflate = um7.b(context, bVar.f()).inflate(a2, (ViewGroup) null);
                if (inflate instanceof CompatibleView) {
                    o(tfwVar2, System.nanoTime() - nanoTime2);
                    return tfwVar2;
                }
                y45.c(inflate, viewGroup);
                en7 en7Var = (en7) inflate.getTag(jn7.PROPERTY_KEY);
                Object obj2 = ((HashMap) en7Var.b).get(em7.b);
                Object obj3 = ((HashMap) en7Var.b).get(em7.c);
                if (obj2 != null) {
                    dinamicTemplate.setCompilerVersion(String.valueOf(obj2));
                } else {
                    dinamicTemplate.setCompilerVersion(em7.f18674a);
                }
                if (obj3 != null) {
                    dinamicTemplate.setInterpreterVersion(String.valueOf(obj3));
                } else {
                    dinamicTemplate.setInterpreterVersion(em7.f18674a);
                }
                inflate.setTag("dinamicRootView");
                inflate.setTag(jn7.TAG_ROOT_VIEW_RESULT, tfwVar2);
                tfwVar2.i(inflate);
                o(tfwVar2, System.nanoTime() - nanoTime2);
                return tfwVar2;
            } catch (Throwable th) {
                tfwVar2.h(dinamicTemplate);
                tfwVar2.b().a("other", "inflateViewFailed");
                ym7.b(TAG, this.f26533a + "infalte dinamic view failed", th);
                o(tfwVar2, System.nanoTime() - nanoTime2);
                return tfwVar2;
            }
        } else {
            tfwVar2.h(dinamicTemplate);
            tfwVar2.b().a(mm7.ERROR_CODE_TEMPLATE_NOT_FOUND, dinamicTemplate.toString());
            o(tfwVar2, System.nanoTime() - nanoTime2);
            return tfwVar2;
        }
    }

    public final void n(tfw tfwVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aab96e3c", new Object[]{this, tfwVar, new Long(j)});
        } else if (f65.n().d() != null && zm7.a()) {
            zm7.b.a(new b(tfwVar, j));
        }
    }

    public final void o(tfw tfwVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76e1ea42", new Object[]{this, tfwVar, new Long(j)});
        } else if (f65.n().d() != null && zm7.a()) {
            zm7.b.a(new a(tfwVar, j));
        }
    }

    public final boolean m(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ae730683", new Object[]{this, view})).booleanValue();
        }
        if ("noneNeedBindChild".equals(view.getTag()) || (view instanceof DLoopLinearLayout)) {
            return false;
        }
        return (view instanceof DLinearLayout) || (view instanceof DFrameLayout);
    }
}
