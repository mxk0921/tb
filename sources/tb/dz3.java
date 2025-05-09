package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class dz3 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final CharSequence f18169a;
    public final String b;
    public final String c;
    public final int d;
    public final String e;
    public final boolean f;
    public final boolean g;
    public String h;
    public int i;
    public int j;

    static {
        t2o.a(468713743);
    }

    public dz3(CharSequence charSequence, String str, String str2, String str3, int i, boolean z, boolean z2) {
        this.f18169a = charSequence;
        this.b = str;
        this.c = str2;
        this.e = str3;
        this.d = i;
        this.f = z;
        this.g = z2;
    }

    public int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("230fd418", new Object[]{this})).intValue();
        }
        return this.d;
    }

    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("60a39a92", new Object[]{this});
        }
        return this.b;
    }

    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("75cd89af", new Object[]{this});
        }
        return this.c;
    }

    public String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2a97e606", new Object[]{this});
        }
        return this.e;
    }

    public CharSequence e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CharSequence) ipChange.ipc$dispatch("1db95d71", new Object[]{this});
        }
        return this.f18169a;
    }

    public boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("74f42c41", new Object[]{this})).booleanValue();
        }
        return this.f;
    }

    public boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d4521f5f", new Object[]{this})).booleanValue();
        }
        return this.g;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "CollectionCell{title='" + ((Object) this.f18169a) + "', subtitle='" + this.b + "', imageUrl='" + this.c + "', collectionIndex=" + this.d + ", nid='" + this.e + "', isFree=" + this.f + ", isLocked=" + this.g + ", tagUrl='" + this.h + "', tagWidth=" + this.i + ", tagheight=" + this.j + '}';
    }
}
