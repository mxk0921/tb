package tb;

import com.alibaba.android.icart.core.QueryParamsManager;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class ens {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f18703a = "detail";
    public String b = QueryParamsManager.DEFAULT_CART_FROM;

    static {
        t2o.a(912262933);
    }

    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7a73b0a4", new Object[]{this});
        }
        return this.b;
    }

    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ff064f93", new Object[]{this});
        }
        return this.f18703a;
    }

    public int c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("806b5975", new Object[]{this})).intValue();
        }
        return 0;
    }

    public int d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bdf7e551", new Object[]{this})).intValue();
        }
        return 0;
    }

    public int e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3e6d4646", new Object[]{this})).intValue();
        }
        return 0;
    }

    public boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("643943a4", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public ens g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ens) ipChange.ipc$dispatch("85178c99", new Object[]{this, str});
        }
        this.b = str;
        return this;
    }

    public ens h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ens) ipChange.ipc$dispatch("5ac0010a", new Object[]{this, str});
        }
        this.f18703a = str;
        return this;
    }
}
