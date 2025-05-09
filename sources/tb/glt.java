package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class glt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final lvl f20081a;
    public final lvl b;

    static {
        t2o.a(986710179);
    }

    public glt(lvl lvlVar, lvl lvlVar2) {
        this.f20081a = lvlVar;
        this.b = lvlVar2;
    }

    public String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("27a69e58", new Object[]{this, str});
        }
        try {
            lvl lvlVar = this.f20081a;
            if (lvlVar != null) {
                if (lvlVar.f23594a) {
                    return lvlVar.b.matcher(str).replaceAll(this.f20081a.c);
                }
                return lvlVar.b.matcher(str).replaceFirst(this.f20081a.c);
            }
        } catch (Throwable th) {
            dwh.i(th);
        }
        return str;
    }

    public String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("183d584b", new Object[]{this, str});
        }
        try {
            lvl lvlVar = this.b;
            if (lvlVar != null) {
                if (lvlVar.f23594a) {
                    return lvlVar.b.matcher(str).replaceAll(this.b.c);
                }
                return lvlVar.b.matcher(str).replaceFirst(this.b.c);
            }
        } catch (Throwable th) {
            dwh.i(th);
        }
        return str;
    }
}
