package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.remoteso.api.RSoException;
import com.taobao.android.remoteso.index.SoIndexData;
import java.io.File;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class a7o {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final z6o f15586a;
    public final String b;
    public String c;
    public final RSoException d;
    public String e = "default";

    public a7o(z6o z6oVar, String str, String str2, RSoException rSoException) {
        this.f15586a = z6oVar;
        this.b = str;
        this.c = str2;
        this.d = rSoException;
    }

    public static a7o a(z6o z6oVar, String str, RSoException rSoException) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a7o) ipChange.ipc$dispatch("4e329ffb", new Object[]{z6oVar, str, rSoException});
        }
        return new a7o(z6oVar, null, str, rSoException);
    }

    public static a7o k(z6o z6oVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a7o) ipChange.ipc$dispatch("3871f00d", new Object[]{z6oVar, str, str2});
        }
        return new a7o(z6oVar, str, str2, null);
    }

    public RSoException b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RSoException) ipChange.ipc$dispatch("1c9a7f15", new Object[]{this});
        }
        return this.d;
    }

    public SoIndexData.SoFileInfo c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SoIndexData.SoFileInfo) ipChange.ipc$dispatch("53af0199", new Object[]{this});
        }
        return this.f15586a.j();
    }

    public String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e1702316", new Object[]{this});
        }
        return this.b;
    }

    public String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3ff65cbf", new Object[]{this});
        }
        return this.f15586a.b();
    }

    public String f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("25c59068", new Object[]{this});
        }
        if (!trq.c(this.b)) {
            return this.b;
        }
        throw new RuntimeException("libFullPath is empty, this = " + this);
    }

    public z6o g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (z6o) ipChange.ipc$dispatch("f3c7363d", new Object[]{this});
        }
        return this.f15586a;
    }

    public String h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e0edc079", new Object[]{this});
        }
        return this.c;
    }

    public String i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("af3bbe28", new Object[]{this});
        }
        return this.e;
    }

    public boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6049a784", new Object[]{this})).booleanValue();
        }
        try {
            if (this.d == null && !trq.c(this.b)) {
                return new File(this.b).exists();
            }
            return false;
        } catch (Throwable th) {
            rbn.g("ResolveResult.isSuccess", th);
            return false;
        }
    }

    public a7o l(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a7o) ipChange.ipc$dispatch("6f1ace46", new Object[]{this, str});
        }
        this.c = str;
        return this;
    }

    public a7o m(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a7o) ipChange.ipc$dispatch("a282fbf7", new Object[]{this, str});
        }
        this.e = str;
        return this;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "ResolveResult{libName='" + this.f15586a.b() + "', libFullPath='" + this.b + "', resolveFrom='" + this.c + "', exception=" + this.d + ", resolveSource='" + this.e + "'}";
    }
}
