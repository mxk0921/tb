package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class ywm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final StringBuilder f32394a = new StringBuilder();

    public ywm a(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ywm) ipChange.ipc$dispatch("e7155034", new Object[]{this, obj});
        }
        this.f32394a.append(obj);
        return this;
    }

    public ywm b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ywm) ipChange.ipc$dispatch("d721f677", new Object[]{this, str});
        }
        StringBuilder sb = this.f32394a;
        sb.append("+ --------------------------------------------------------------------------------------------");
        sb.append("\n");
        StringBuilder sb2 = this.f32394a;
        sb2.append("| ");
        sb2.append(str);
        sb2.append(" :");
        sb2.append("\n");
        return this;
    }

    public ywm c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ywm) ipChange.ipc$dispatch("f7c33e52", new Object[]{this});
        }
        this.f32394a.append("\n");
        return this;
    }

    public ywm d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ywm) ipChange.ipc$dispatch("4f2bbe35", new Object[]{this});
        }
        this.f32394a.append("\t");
        return this;
    }

    public ywm e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ywm) ipChange.ipc$dispatch("93eacf04", new Object[]{this});
        }
        this.f32394a.append("**********************************************************************************************");
        return this;
    }

    public ywm f(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ywm) ipChange.ipc$dispatch("d8205783", new Object[]{this, str, str2});
        }
        StringBuilder sb = this.f32394a;
        sb.append("| ");
        sb.append("  -> ");
        sb.append(str);
        sb.append("\t= ");
        sb.append(str2);
        sb.append("\n");
        return this;
    }

    public ywm g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ywm) ipChange.ipc$dispatch("81444d4a", new Object[]{this});
        }
        StringBuilder sb = this.f32394a;
        sb.append("| ");
        sb.append("  -> ");
        return this;
    }

    public ywm h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ywm) ipChange.ipc$dispatch("97e0c507", new Object[]{this, str});
        }
        StringBuilder sb = this.f32394a;
        sb.append("****************************************** ");
        sb.append(str);
        sb.append(" *****************************************");
        sb.append("\n");
        return this;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return this.f32394a.toString();
    }
}
