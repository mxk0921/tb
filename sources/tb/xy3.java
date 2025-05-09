package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.favoritesdk.content.response.CollectContentResponseData;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class xy3 implements ljd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public hs6 f31676a;
    public String b = null;
    public String c = null;
    public String d = null;
    public String e = null;
    public String f = null;
    public int g;

    static {
        t2o.a(463470598);
        t2o.a(463470657);
    }

    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4ca4090", new Object[]{this, new Integer(i)});
        } else {
            this.g = i;
        }
    }

    public void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8e660c9", new Object[]{this, str});
        } else {
            this.b = str;
        }
    }

    public void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8614b05", new Object[]{this, str});
        } else {
            this.e = str;
        }
    }

    public void e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a285194b", new Object[]{this, str});
        } else {
            this.f = str;
        }
    }

    public void f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c0599d8", new Object[]{this, str});
        } else {
            this.d = str;
        }
    }

    public void g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c820927", new Object[]{this, str});
        } else {
            this.c = str;
        }
    }

    @Override // tb.ljd
    public hs6 a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hs6) ipChange.ipc$dispatch("11f65278", new Object[]{this});
        }
        hs6 hs6Var = this.f31676a;
        if (hs6Var != null) {
            return hs6Var;
        }
        qzo qzoVar = new qzo();
        qzoVar.h("mtop.taobao.mercury.collectContent");
        qzoVar.i("2.0");
        qzoVar.m(CollectContentResponseData.class);
        qzoVar.j(true);
        qzoVar.k("contentUrl", this.b).k("title", this.c).k("picUrl", this.d).k("outItemId", this.f).k("bizId", Integer.valueOf(this.g)).k("note", this.e);
        hs6 a2 = ls6.a(qzoVar);
        this.f31676a = a2;
        return a2;
    }
}
