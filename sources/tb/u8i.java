package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Objects;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class u8i extends px1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final int f;
    public final int g;
    public final String h;
    public final String i;
    public final long j;
    public String k;
    public String l;

    static {
        t2o.a(782237812);
    }

    public u8i(String str, int i, int i2, String str2, String str3) {
        this(str, i, i2, str2, str3, -1L);
    }

    public static /* synthetic */ Object ipc$super(u8i u8iVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taopai/material/request/materialfile/MaterialFileParams");
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || u8i.class != obj.getClass()) {
            return false;
        }
        u8i u8iVar = (u8i) obj;
        if (m() == u8iVar.m() && p() == u8iVar.p() && l() == u8iVar.l() && Objects.equals(n(), u8iVar.n()) && Objects.equals(o(), u8iVar.o())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        return Objects.hash(Integer.valueOf(m()), Integer.valueOf(p()), n(), o(), Long.valueOf(l()));
    }

    public String j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("787e7f7c", new Object[]{this});
        }
        return this.k;
    }

    public String k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1bcb7a22", new Object[]{this});
        }
        return this.l;
    }

    public long l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fc80adce", new Object[]{this})).longValue();
        }
        return this.j;
    }

    public int m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a85c0071", new Object[]{this})).intValue();
        }
        return this.f;
    }

    public String n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("12a13f40", new Object[]{this});
        }
        return this.h;
    }

    public String o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("de8f0660", new Object[]{this});
        }
        return this.i;
    }

    public int p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2d6bc1c", new Object[]{this})).intValue();
        }
        return this.g;
    }

    public void q(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("222eca7a", new Object[]{this, str});
        } else {
            this.k = str;
        }
    }

    public void r(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8812494", new Object[]{this, str});
        } else {
            this.l = str;
        }
    }

    public String s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5c81897a", new Object[]{this});
        }
        return null;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "materialType=" + this.f + ", version=" + this.g + ", tid='" + this.h + "', url='" + this.i + "', lastModifyTime=" + this.j + ", fileName='" + this.k;
    }

    public u8i(String str, int i, int i2, String str2, String str3, long j) {
        this.f26370a = str;
        this.f = i;
        this.g = i2;
        this.h = str2;
        this.i = str3;
        this.j = j;
    }

    public u8i(int i, int i2, String str, String str2) {
        this.f = i;
        this.g = i2;
        this.h = str;
        this.i = str2;
    }
}
