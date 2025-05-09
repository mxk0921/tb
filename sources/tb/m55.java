package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.f;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class m55 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final int f23777a;
    public final int b;
    public final onf c;
    public final upl d;

    public m55(zzp zzpVar) {
        this.f23777a = 3;
        this.b = 3;
        this.c = zzpVar.e;
        upl uplVar = zzpVar.f;
        this.d = uplVar;
        int i = uplVar.j;
        if (i > 0) {
            this.f23777a = i;
            this.b = i;
        }
    }

    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d09a5221", new Object[]{this});
        }
        upl uplVar = this.d;
        if (uplVar != null) {
            return uplVar.f29547a;
        }
        return "";
    }

    public int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5de380d9", new Object[]{this})).intValue();
        }
        return 0;
    }

    public int c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5824f407", new Object[]{this})).intValue();
        }
        return 10000;
    }

    public int d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4db89faf", new Object[]{this})).intValue();
        }
        long j = this.c.b;
        if (0 == j) {
            return f.DX_ERROR_BIZ_CODE;
        }
        int i = (int) (j / 10);
        if (i > 15000) {
            return i;
        }
        return 15000;
    }

    public boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("17d3a575", new Object[]{this})).booleanValue();
        }
        if (this.f23777a == 1) {
            return true;
        }
        return false;
    }

    public boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("384b1621", new Object[]{this})).booleanValue();
        }
        if (this.b == 1) {
            return true;
        }
        return false;
    }
}
