package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Stack;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class qn1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Stack<bib> f26832a = new Stack<>();

    static {
        t2o.a(468713876);
    }

    public boolean a() {
        bib pop;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3773ef55", new Object[]{this})).booleanValue();
        }
        if (!this.f26832a.empty() && (pop = this.f26832a.pop()) != null && pop.onHandleBackKeyEvent()) {
            return true;
        }
        return false;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca5510e", new Object[]{this});
        } else {
            this.f26832a.clear();
        }
    }

    public void c(bib bibVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3cd7daef", new Object[]{this, bibVar});
        } else if (this.f26832a.remove(bibVar)) {
            bibVar.onLoseFocus();
        }
    }

    public void d(bib bibVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44572b3a", new Object[]{this, bibVar});
        } else {
            this.f26832a.push(bibVar);
        }
    }
}
