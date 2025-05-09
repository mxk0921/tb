package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class wfe {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final List<xfe> f30666a;
    public final List<xfe> b;
    public boolean c;

    static {
        t2o.a(815792379);
    }

    public wfe(List<xfe> list, List<xfe> list2) {
        ckf.g(list, mh1.PRD_ICON_LIST);
        this.f30666a = list;
        this.b = list2;
    }

    public final List<xfe> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("ac9124bf", new Object[]{this});
        }
        return this.b;
    }

    public final boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d34b413c", new Object[]{this})).booleanValue();
        }
        return this.c;
    }

    public final List<xfe> c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("c93d8393", new Object[]{this});
        }
        return this.f30666a;
    }

    public final void d(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a1a2da8", new Object[]{this, new Boolean(z)});
        } else {
            this.c = z;
        }
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wfe)) {
            return false;
        }
        wfe wfeVar = (wfe) obj;
        if (ckf.b(this.f30666a, wfeVar.f30666a) && ckf.b(this.b, wfeVar.b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        int hashCode = this.f30666a.hashCode() * 31;
        List<xfe> list = this.b;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "IconInfo(iconList=" + this.f30666a + ", adIcons=" + this.b + ')';
    }
}
