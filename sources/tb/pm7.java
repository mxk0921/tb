package tb;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamic.expressionv2.g;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class pm7 implements View.OnClickListener, View.OnLongClickListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final bn7 f26180a;
    public final String b;
    public final en7 c;

    static {
        t2o.a(444596367);
    }

    public pm7(bn7 bn7Var, String str, en7 en7Var) {
        this.f26180a = bn7Var;
        this.b = str;
        this.c = en7Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            return;
        }
        long nanoTime = System.nanoTime();
        try {
            this.f26180a.f(view.getTag(jn7.SUBDATA));
            g.d(view, this.b, this.f26180a);
            ym7.g(this.f26180a.c(), this.c.f18692a, System.nanoTime() - nanoTime);
        } catch (Throwable unused) {
            this.f26180a.e().b().a(mm7.ERROR_CODE_EVENT_HANDLER_EXCEPTION, this.c.f18692a);
            ym7.g(this.f26180a.c(), this.c.f18692a, System.nanoTime() - nanoTime);
        }
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7edba102", new Object[]{this, view})).booleanValue();
        }
        long nanoTime = System.nanoTime();
        try {
            this.f26180a.f(view.getTag(jn7.SUBDATA));
            g.d(view, this.b, this.f26180a);
            ym7.g(this.f26180a.c(), this.c.f18692a, System.nanoTime() - nanoTime);
        } catch (Throwable unused) {
            this.f26180a.e().b().a(mm7.ERROR_CODE_EVENT_HANDLER_EXCEPTION, this.c.f18692a);
            ym7.g(this.f26180a.c(), this.c.f18692a, System.nanoTime() - nanoTime);
        }
        return true;
    }
}
