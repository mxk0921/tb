package tb;

import android.content.Context;
import com.alibaba.ability.hub.AbilityHubAdapter;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.homepage.pop.utils.PopConst;
import java.lang.ref.WeakReference;
import tb.ldb;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class zq implements ldb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f32940a;
    public WeakReference<Context> b;
    public Object c;
    public AbilityHubAdapter d;
    public final String e;

    static {
        t2o.a(144703521);
        t2o.a(144703526);
    }

    public zq(String str) {
        this(str, null, 2, null);
    }

    @Override // tb.ldb
    public ldb a(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ldb) ipChange.ipc$dispatch("4b197025", new Object[]{this, context}) : ldb.a.c(this, context);
    }

    @Override // tb.ldb
    public void b(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd7dee76", new Object[]{this, obj});
        } else {
            this.c = obj;
        }
    }

    @Override // tb.ldb
    public void c(AbilityHubAdapter abilityHubAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dca8dce9", new Object[]{this, abilityHubAdapter});
        } else {
            this.d = abilityHubAdapter;
        }
    }

    @Override // tb.ldb
    public void d(WeakReference<Context> weakReference) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21e9e5d1", new Object[]{this, weakReference});
        } else {
            this.b = weakReference;
        }
    }

    @Override // tb.ldb
    public WeakReference<Context> e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeakReference) ipChange.ipc$dispatch("d18ab92f", new Object[]{this});
        }
        return this.b;
    }

    public <T> T f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("46f5941f", new Object[]{this});
        }
        return (T) ldb.a.b(this);
    }

    @Override // tb.ldb
    public AbilityHubAdapter getAdapter() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AbilityHubAdapter) ipChange.ipc$dispatch("4e9624d", new Object[]{this});
        }
        return this.d;
    }

    @Override // tb.ldb
    public String getBusinessID() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("883dfac8", new Object[]{this});
        }
        return this.e;
    }

    @Override // tb.ldb
    public Context getContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("e1727078", new Object[]{this});
        }
        return ldb.a.a(this);
    }

    @Override // tb.ldb
    public String getNamespace() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("79c37174", new Object[]{this});
        }
        return this.f32940a;
    }

    public ldb h(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ldb) ipChange.ipc$dispatch("3a23da0c", new Object[]{this, obj});
        }
        return ldb.a.d(this, obj);
    }

    public zq(String str, String str2) {
        ckf.g(str, PopConst.BRIDGE_KEY_BUSINESS_ID);
        ckf.g(str2, "nsp");
        this.e = str;
        String lowerCase = str2.toLowerCase();
        ckf.f(lowerCase, "(this as java.lang.String).toLowerCase()");
        this.f32940a = lowerCase;
    }

    @Override // tb.ldb
    public Object a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("4498abe4", new Object[]{this}) : this.c;
    }

    public /* synthetic */ zq(String str, String str2, int i, a07 a07Var) {
        this(str, (i & 2) != 0 ? "" : str2);
    }
}
