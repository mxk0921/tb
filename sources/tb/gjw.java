package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class gjw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f20050a;
    public int b;
    public final String c;

    static {
        t2o.a(329252973);
    }

    public gjw(String str, int i, String str2) {
        this.f20050a = str;
        this.b = i;
        this.c = str2;
    }

    public static gjw a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gjw) ipChange.ipc$dispatch("c89e7a4a", new Object[]{str, str2});
        }
        return new gjw(str, 1, str2);
    }

    public static gjw b(String str, int i, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gjw) ipChange.ipc$dispatch("1092f509", new Object[]{str, new Integer(i), str2});
        }
        return new gjw(str, i, str2);
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || gjw.class != obj.getClass()) {
            return false;
        }
        gjw gjwVar = (gjw) obj;
        if (!this.f20050a.equals(gjwVar.f20050a) || !this.c.equals(gjwVar.c)) {
            return false;
        }
        return true;
    }
}
