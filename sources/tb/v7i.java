package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Objects;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class v7i extends px1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final int f;
    public String g;

    static {
        t2o.a(782237803);
    }

    public v7i(String str, int i) {
        this.f26370a = str;
        this.f = i;
    }

    public static /* synthetic */ Object ipc$super(v7i v7iVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taopai/material/request/materialdetail/MaterialDetailParams");
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || v7i.class != obj.getClass()) {
            return false;
        }
        v7i v7iVar = (v7i) obj;
        if (j() == v7iVar.j() && p() == v7iVar.p() && Objects.equals(i(), v7iVar.i())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        return Objects.hash(Integer.valueOf(j()), Integer.valueOf(p()), i());
    }

    public String i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d53c00b1", new Object[]{this});
        }
        return this.g;
    }

    public int j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("eee3a153", new Object[]{this})).intValue();
        }
        return this.f;
    }

    public void l(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c84364d", new Object[]{this, str});
        } else {
            this.g = str;
        }
    }

    public int p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2d6bc1c", new Object[]{this})).intValue();
        }
        return 0;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "{tid=" + this.f + ", version=0, name='" + this.g + "', bizLine='" + this.f26370a + "', bizScene='" + this.b + "', clientVer=" + this.c + '}';
    }

    public v7i(int i) {
        this.f = i;
    }
}
