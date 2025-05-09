package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class xio implements hbp {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String d = "RunnableDelegate";

    /* renamed from: a  reason: collision with root package name */
    private final String f31412a;
    private final Runnable b;
    private boolean c = false;

    private xio(String str, Runnable runnable) {
        this.f31412a = str;
        this.b = runnable;
    }

    public static Runnable a(String str, Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Runnable) ipChange.ipc$dispatch("38103329", new Object[]{str, runnable});
        }
        return new xio(str, runnable);
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof xio) {
            return this.b.equals(((xio) obj).b);
        }
        if (obj instanceof Runnable) {
            return this.b.equals(obj);
        }
        return false;
    }

    public int hashCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        return this.b.hashCode();
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        if (this.c) {
            whh.a(d, "TaskLifeCycle#" + this.f31412a + " already ran before");
            return;
        }
        try {
            whh.a(d, "TaskLifeCycle#" + this.f31412a + " begin to run");
            w35.a(this.f31412a);
            this.b.run();
        } finally {
            w35.c();
            this.c = true;
            whh.a(d, "TaskLifeCycle#" + this.f31412a + " finished");
        }
    }
}
