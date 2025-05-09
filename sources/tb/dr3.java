package tb;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.common.Constants;
import tb.wr3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class dr3 extends phw<Void, ImageView, Void> implements wr3.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final wr3 f18025a;
    public boolean b = false;

    static {
        t2o.a(993001720);
        t2o.a(993001727);
    }

    public dr3(Activity activity, ude udeVar, ViewGroup viewGroup, vfw vfwVar) {
        super(activity, udeVar, null, viewGroup, vfwVar);
        if (c().e().a() || c().e().b()) {
            wr3 wr3Var = new wr3(this, c());
            this.f18025a = wr3Var;
            wr3Var.m(this);
            wr3Var.l(activity, c().d().b);
        }
    }

    public static /* synthetic */ Object ipc$super(dr3 dr3Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/searchbaseframe/chitu/ChiTuWidget");
    }

    @Override // tb.wr3.b
    public void M(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14ce588a", new Object[]{this, view});
            return;
        }
        vfw setter = getSetter();
        if (setter != null) {
            setter.a(view);
        }
    }

    @Override // tb.wr3.b
    public void e0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d6e2aa", new Object[]{this});
        } else {
            attachToContainer();
        }
    }

    @Override // tb.abx
    public String getLogTag() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("55d7c1cd", new Object[]{this});
        }
        return "ChiTuWidget";
    }

    /* renamed from: q2 */
    public ImageView onCreateView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ImageView) ipChange.ipc$dispatch("8a4f1fe9", new Object[]{this});
        }
        wr3 wr3Var = this.f18025a;
        if (wr3Var == null) {
            return null;
        }
        return wr3Var.j();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Class.forName("com.taobao.android.xsearchplugin.debugger.XSDebuggerTool").getDeclaredMethod("pop", nde.class).invoke(null, dr3.this.getRoot());
            } catch (Throwable unused) {
                dr3.this.c().l().d("XSDebuggerTool", "no debugger");
            }
        }
    }

    @Override // tb.wr3.b
    public void e2() {
        if (!this.b) {
            this.b = true;
            try {
                Class.forName("com.taobao.android.xsearchplugin.debugger.XSDebuggerTool").getDeclaredMethod(Constants.Event.SLOT_LIFECYCLE.ATTACH, nde.class).invoke(null, getRoot());
            } catch (Throwable unused) {
                c().l().d("XSDebuggerTool", "no debugger");
            }
        }
        ((ImageView) getView()).post(new a());
    }

    public static void s2(yko ykoVar, Activity activity, String str, String str2, String str3) {
        try {
            Class.forName("com.taobao.android.xsearchplugin.debugger.codeview.XSDCodeView").getDeclaredMethod("attachToActivity", yko.class, Activity.class, xmx.class).invoke(null, ykoVar, activity, new xmx(str, str2, str3));
        } catch (Throwable th) {
            ykoVar.l().e("XSDebuggerTool", "no source view", th);
        }
    }
}
