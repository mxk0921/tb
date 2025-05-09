package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail2.core.framework.view.feeds.VerticalAbsViewHolder;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class bjw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public boolean f16437a;
    public String b = "none";
    public int c = -1;
    public int d = -1;
    public VerticalAbsViewHolder e;

    static {
        t2o.a(352321967);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42d4c54", new Object[]{this});
            return;
        }
        this.f16437a = false;
        this.c = -1;
        this.b = "none";
        this.d = -1;
        this.e = null;
    }

    public int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b656e206", new Object[]{this})).intValue();
        }
        return this.c;
    }

    public VerticalAbsViewHolder c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (VerticalAbsViewHolder) ipChange.ipc$dispatch("b8490a3e", new Object[]{this});
        }
        return this.e;
    }

    public String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("68510af2", new Object[]{this});
        }
        return this.b;
    }

    public int e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("379b350", new Object[]{this})).intValue();
        }
        return this.d;
    }

    public void f(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ed9025c", new Object[]{this, new Integer(i)});
        } else {
            this.c = i;
        }
    }

    public void g(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ce4fdfc", new Object[]{this, new Boolean(z)});
        } else {
            this.f16437a = z;
        }
    }

    public void h(VerticalAbsViewHolder verticalAbsViewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee42d298", new Object[]{this, verticalAbsViewHolder});
        } else {
            this.e = verticalAbsViewHolder;
        }
    }

    public void i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8d3dc2c", new Object[]{this, str});
        } else {
            this.b = str;
        }
    }

    public void j(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66a68e52", new Object[]{this, new Integer(i)});
        } else {
            this.d = i;
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "VisibilityData{isDragging=" + this.f16437a + ", startUp='" + this.b + "', currentPosition=" + this.c + ", willDisplayItemPosition=" + this.d + ", lastVisibleViewHolder=" + this.e + '}';
    }
}
