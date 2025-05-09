package tb;

import android.content.Context;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.binder.BitmapBinder;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class aqz {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f15943a;
    public final View b;
    public Context c;
    public xfb f;
    public BitmapBinder j;
    public tpz k;
    public zpz l;
    public vpz m;
    public rpz n;
    public JSONObject o;
    public int d = -1;
    public int e = -1;
    public boolean g = false;
    public boolean h = false;
    public boolean i = false;

    static {
        t2o.a(352322032);
    }

    public aqz(String str, View view) {
        this.b = view;
        this.f15943a = str;
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e29ebf1a", new Object[]{this})).booleanValue();
        }
        return this.g;
    }

    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("826ffbcf", new Object[]{this});
        }
        return this.f15943a;
    }

    public View c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("9112e9ad", new Object[]{this});
        }
        return this.b;
    }

    public Context d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("e1727078", new Object[]{this});
        }
        Context context = this.c;
        if (context == null) {
            return this.b.getContext();
        }
        return context;
    }

    public void e(zpz zpzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67977d23", new Object[]{this, zpzVar});
        } else {
            this.l = zpzVar;
        }
    }

    public void f(xfb xfbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6aaa65a8", new Object[]{this, xfbVar});
        } else {
            this.f = xfbVar;
        }
    }

    public void g(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a164154", new Object[]{this, context});
        } else {
            this.c = context;
        }
    }

    public aqz h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (aqz) ipChange.ipc$dispatch("d4598476", new Object[]{this});
        }
        return this;
    }

    public void i(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a7cb99f", new Object[]{this, new Integer(i)});
        } else {
            this.e = i;
        }
    }

    public void j(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7209af8", new Object[]{this, new Integer(i)});
        } else {
            this.d = i;
        }
    }
}
