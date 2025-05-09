package tb;

import android.app.Activity;
import android.graphics.Color;
import android.os.Build;
import android.view.View;
import android.view.Window;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.newresult.base.IrpWidget;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class bnf {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final bnf INSTANCE = new bnf();

    /* renamed from: a  reason: collision with root package name */
    public static final int f16491a = Color.parseColor("#FFFFFF");
    public static final boolean b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a extends zio {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ Window c;
        public final /* synthetic */ int d;
        public final /* synthetic */ View e;
        public final /* synthetic */ boolean f;

        public a(Window window, int i, View view, boolean z) {
            this.c = window;
            this.d = i;
            this.e = view;
            this.f = z;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            if (str.hashCode() == -816534907) {
                super.b((Throwable) objArr[0]);
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/newresult/IrpStatusBarManager$changeStatusBarColor$1");
        }

        @Override // tb.zio
        public void b(Throwable th) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cf54aa85", new Object[]{this, th});
                return;
            }
            ckf.g(th, "e");
            super.b(th);
            agh.c(IrpWidget.TAG, JSON.toJSONString(th));
        }

        @Override // tb.zio
        public void c() {
            int i;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("15c1193f", new Object[]{this});
                return;
            }
            this.c.clearFlags(AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL);
            this.c.addFlags(Integer.MIN_VALUE);
            this.c.setStatusBarColor(this.d);
            View view = this.e;
            if (!this.f || !bnf.INSTANCE.d()) {
                i = 1280;
            } else {
                i = 9472;
            }
            view.setSystemUiVisibility(i);
        }
    }

    static {
        boolean z;
        t2o.a(481297104);
        if (Build.VERSION.SDK_INT >= 23) {
            z = true;
        } else {
            z = false;
        }
        b = z;
    }

    public final void a(Activity activity, float f) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37998215", new Object[]{this, activity, new Float(f)});
            return;
        }
        ckf.g(activity, "activity");
        float e = hfn.e(hfn.b(f, 0.0f), 1.0f);
        int c = c(f16491a, e);
        if (e <= 0.5f) {
            z = false;
        }
        b(activity, c, z);
    }

    public final void b(Activity activity, int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb98d07c", new Object[]{this, activity, new Integer(i), new Boolean(z)});
            return;
        }
        Window window = activity.getWindow();
        View decorView = window.getDecorView();
        ckf.f(decorView, "window.decorView");
        decorView.post(new a(window, i, decorView, z));
    }

    public final int c(int i, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3bfe73d2", new Object[]{this, new Integer(i), new Float(f)})).intValue();
        }
        return Color.argb((int) (((float) Math.max((float) Math.min(f, 1.0d), (double) vu3.b.GEO_NOT_SUPPORT)) * 255), Color.red(i), Color.green(i), Color.blue(i));
    }

    public final boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("339da4cf", new Object[]{this})).booleanValue();
        }
        return b;
    }
}
