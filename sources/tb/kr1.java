package tb;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.meta.uikit.MetaLayout;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public abstract class kr1 implements kcc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final View f22863a;
    public int b;
    public final boolean c;
    public final zwm d;
    public final int e;
    public float f;
    public ytc g;

    static {
        t2o.a(993001868);
        t2o.a(993001864);
    }

    public kr1(View view, boolean z, zwm zwmVar, int i) {
        this.f = 1.0f;
        this.e = i;
        this.f22863a = view;
        this.c = z;
        this.d = zwmVar;
    }

    @Override // tb.kcc
    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb9c42e6", new Object[]{this, new Integer(i)});
        }
    }

    @Override // tb.kcc
    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2da086e", new Object[]{this, new Integer(i)});
        }
    }

    @Override // tb.kcc
    public int c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("86368875", new Object[]{this})).intValue();
        }
        return this.b;
    }

    @Override // tb.kcc
    public boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("be8e58d9", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public int f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("af5b5a8a", new Object[]{this})).intValue();
        }
        return this.e;
    }

    @Override // tb.kcc
    public void g(MetaLayout metaLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc7c587", new Object[]{this, metaLayout});
        }
    }

    public int getHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4703e217", new Object[]{this})).intValue();
        }
        return this.f22863a.getMeasuredHeight();
    }

    @Override // tb.kcc
    public zwm getPriority() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (zwm) ipChange.ipc$dispatch("2e158f9c", new Object[]{this});
        }
        return this.d;
    }

    public View getView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("576a35e4", new Object[]{this});
        }
        return this.f22863a;
    }

    public float h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("75d7ce26", new Object[]{this})).floatValue();
        }
        return this.f;
    }

    public void i(ytc ytcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af36b523", new Object[]{this, ytcVar});
        } else {
            this.g = ytcVar;
        }
    }

    public void j(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb36b37", new Object[]{this, new Float(f)});
        } else {
            this.f = Math.max(0.0f, f);
        }
    }

    public boolean p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9409b0bc", new Object[]{this})).booleanValue();
        }
        return this.c;
    }

    public kr1(View view, boolean z, zwm zwmVar) {
        this(view, z, zwmVar, 0);
    }
}
