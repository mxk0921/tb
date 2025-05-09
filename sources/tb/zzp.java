package tb;

import com.android.alibaba.ip.runtime.IpChange;
import tb.l0j;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class zzp {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public boolean f33127a;
    public int b;
    public String c;
    public String d;
    public onf e;
    public upl f;
    public String g;
    public boolean h;
    public boolean i;
    public a j = new a();
    public l0j.a k;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public int f33128a;
        public int b;

        public a() {
        }

        public boolean a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("97457d43", new Object[]{this})).booleanValue();
            }
            if (zzp.this.f.j > this.f33128a + this.b) {
                return true;
            }
            return false;
        }

        public void b(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ca1e207", new Object[]{this, new Boolean(z)});
            } else if (z) {
                this.f33128a++;
            } else {
                this.b++;
            }
        }
    }

    public zzp a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (zzp) ipChange.ipc$dispatch("70d39818", new Object[]{this});
        }
        zzp zzpVar = new zzp();
        zzpVar.e = this.e;
        zzpVar.f = this.f;
        zzpVar.g = this.g;
        zzpVar.h = this.h;
        return zzpVar;
    }

    public void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("993e9b3e", new Object[]{this, new Boolean(z)});
            return;
        }
        this.b = 0;
        this.c = "";
        this.f33127a = false;
        if (z) {
            this.j = new a();
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
        if (!(obj instanceof zzp)) {
            return false;
        }
        zzp zzpVar = (zzp) obj;
        onf onfVar = this.e;
        if (onfVar == null ? zzpVar.e != null : !onfVar.equals(zzpVar.e)) {
            return false;
        }
        String str = this.g;
        String str2 = zzpVar.g;
        if (str != null) {
            if (str.equals(str2)) {
                return true;
            }
        } else if (str2 == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i;
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        onf onfVar = this.e;
        if (onfVar != null) {
            i = onfVar.hashCode();
        } else {
            i = 0;
        }
        int i3 = i * 31;
        String str = this.g;
        if (str != null) {
            i2 = str.hashCode();
        }
        return i3 + i2;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return super.toString() + "@Task{success=" + this.f33127a + ", errorCode=" + this.b + ", errorMsg='" + this.c + "', item=" + this.e + ", storeDir='" + this.g + "'}";
    }
}
