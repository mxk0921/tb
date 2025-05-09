package tb;

import android.content.res.Resources;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.Globals;
import com.taobao.tao.util.Constants;
import com.taobao.taobao.R;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class d6p extends xnv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String[] f17623a;
    public final String[] b;
    public int c = -1;
    public g1x d;

    static {
        t2o.a(815792547);
    }

    public d6p() {
        Resources resources = Globals.getApplication().getResources();
        this.f17623a = resources.getString(R.string.tbsearch_sharshops_callback_result).split(";");
        this.b = resources.getString(R.string.tbsearch_shop_detail_url_regularExpression).split(";");
    }

    public static /* synthetic */ Object ipc$super(d6p d6pVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/mmd/onesearch/SearchUrlFilter");
    }

    @Override // tb.xnv
    public boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fdb16d40", new Object[]{this, str})).booleanValue();
        }
        b4p.a("lx", "SearchUrlFilter=" + str);
        int i = this.c;
        if (i == 0) {
            f(str);
            return true;
        } else if (i == 1) {
            f(str);
            return true;
        } else if (i != 2) {
            f(str);
            return true;
        } else if (Constants.isRegularIndex(str, this.f17623a)) {
            if (e(str).trim().equals("1")) {
                g1x g1xVar = this.d;
                if (g1xVar != null) {
                    ((gmo) g1xVar).d();
                }
            } else {
                g1x g1xVar2 = this.d;
                if (g1xVar2 != null) {
                    ((gmo) g1xVar2).c();
                }
            }
            return true;
        } else if (Constants.isRegularIndex(str, this.b)) {
            g1x g1xVar3 = this.d;
            if (g1xVar3 != null) {
                ((gmo) g1xVar3).f(str);
            }
            return true;
        } else {
            f(str);
            return true;
        }
    }

    @Override // tb.xnv
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17a440c0", new Object[]{this});
            return;
        }
        g1x g1xVar = this.d;
        if (g1xVar != null) {
            ((gmo) g1xVar).g();
        }
    }

    @Override // tb.xnv
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2c42789", new Object[]{this});
            return;
        }
        g1x g1xVar = this.d;
        if (g1xVar != null) {
            ((gmo) g1xVar).h();
        }
    }

    @Override // tb.xnv
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8515761a", new Object[]{this});
            return;
        }
        g1x g1xVar = this.d;
        if (g1xVar != null) {
            ((gmo) g1xVar).i();
        }
    }

    public final String e(String str) {
        int indexOf;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("87783190", new Object[]{this, str});
        }
        if (str == null || str.trim().length() <= 0 || (indexOf = str.indexOf("data=")) == -1) {
            return "";
        }
        String substring = str.substring(indexOf);
        int indexOf2 = substring.indexOf("&");
        if (indexOf2 != -1) {
            return substring.substring(5, indexOf2);
        }
        return substring.substring(5);
    }

    public final void f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78156ae6", new Object[]{this, str});
            return;
        }
        g1x g1xVar = this.d;
        if (g1xVar != null) {
            ((gmo) g1xVar).e(str);
        }
    }

    public void g(g1x g1xVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c69a638", new Object[]{this, g1xVar});
        } else {
            this.d = g1xVar;
        }
    }
}
