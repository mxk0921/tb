package tb;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class smt extends wxd {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final String g;
    public TextView h;

    static {
        t2o.a(815792782);
    }

    public smt(String str) {
        this.g = str;
    }

    public static /* synthetic */ Object ipc$super(smt smtVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/musie/tab/TextTab");
    }

    @Override // tb.wxd
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9c6160d", new Object[]{this});
        } else {
            k(true);
        }
    }

    @Override // tb.wxd
    public View d(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("93d55e23", new Object[]{this, context});
        }
        FrameLayout frameLayout = new FrameLayout(context);
        TextView textView = new TextView(context);
        this.h = textView;
        textView.setText(this.g);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        frameLayout.addView(this.h, layoutParams);
        return frameLayout;
    }

    @Override // tb.wxd
    public void e(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71456783", new Object[]{this, new Boolean(z)});
        } else {
            k(false);
        }
    }

    @Override // tb.wxd
    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e4a6b10", new Object[]{this});
        } else {
            k(true);
        }
    }

    public final void k(boolean z) {
        prs prsVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0394652", new Object[]{this, new Boolean(z)});
            return;
        }
        if (this.e.booleanValue()) {
            prsVar = this.d;
        } else {
            prsVar = this.c;
        }
        this.h.setTextColor(prsVar.d());
        float e = (prsVar.e() * 1.0f) / this.c.e();
        this.h.getPaint().setFakeBoldText(prsVar.f());
        if (z) {
            this.h.setTextSize(0, this.c.e());
            g(e, e, false);
            return;
        }
        g(e, e, true);
    }
}
