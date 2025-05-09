package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.uploader.implement.a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public abstract class wtx {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f30918a;
    public final int b;
    public final String c;
    public final int d;
    public final boolean e;

    public wtx(String str, int i, String str2, int i2, boolean z) {
        this.f30918a = str;
        this.b = i;
        this.c = str2;
        this.d = i2;
        this.e = z;
    }

    public abstract j5y a(a aVar);

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wtx)) {
            return false;
        }
        wtx wtxVar = (wtx) obj;
        if (this.b != wtxVar.b || this.d != wtxVar.d || this.e != wtxVar.e) {
            return false;
        }
        String str = this.f30918a;
        if (str == null ? wtxVar.f30918a != null : !str.equals(wtxVar.f30918a)) {
            return false;
        }
        String str2 = this.c;
        String str3 = wtxVar.c;
        if (str2 != null) {
            if (str2.equals(str3)) {
                return true;
            }
        } else if (str3 == null) {
            return true;
        }
        return false;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "ConnectionTarget{address='" + this.f30918a + "', port=" + this.b + ", proxyIp='" + this.c + "', proxyPort=" + this.d + ", isLongLived=" + this.e + '}';
    }
}
