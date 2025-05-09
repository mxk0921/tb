package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.remoteso.api.RSoException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class abn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f15644a;
    public final String b;
    public final String c;
    public final unq d;
    public final RSoException e;

    public abn(String str, String str2, String str3, unq unqVar, RSoException rSoException) {
        this.f15644a = str;
        this.b = str2;
        this.c = str3;
        this.d = unqVar;
        this.e = rSoException;
    }

    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("99cac83d", new Object[]{this});
        }
        return this.b;
    }

    public RSoException b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RSoException) ipChange.ipc$dispatch("1c9a7f15", new Object[]{this});
        }
        return this.e;
    }

    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5395c8ea", new Object[]{this});
        }
        return this.c;
    }

    public String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3ff65cbf", new Object[]{this});
        }
        return this.f15644a;
    }

    public String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e0acf657", new Object[]{this});
        }
        if (trq.e(this.c)) {
            return this.c;
        }
        return "empty_path";
    }

    public unq f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (unq) ipChange.ipc$dispatch("ad786fd3", new Object[]{this});
        }
        return this.d;
    }

    public boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cf9d3e97", new Object[]{this})).booleanValue();
        }
        if (this.e == null) {
            return true;
        }
        return false;
    }
}
