package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.sf.datasource.CommonBaseDatasource;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class n1p {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final n1p c = new n1p();

    /* renamed from: a  reason: collision with root package name */
    public String f24449a = "";
    public CommonBaseDatasource b;

    static {
        t2o.a(815792493);
    }

    public static n1p b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (n1p) ipChange.ipc$dispatch("ccc621be", new Object[0]);
        }
        return c;
    }

    public CommonBaseDatasource a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CommonBaseDatasource) ipChange.ipc$dispatch("30d23bb6", new Object[]{this, str});
        }
        if (!TextUtils.equals(str, this.f24449a)) {
            b4p.a("SearchDatasourceManager", "token is invalid");
            return null;
        }
        CommonBaseDatasource commonBaseDatasource = this.b;
        if (commonBaseDatasource == null) {
            b4p.a("SearchDatasourceManager", "there is no live datasource");
            return null;
        }
        this.f24449a = "";
        this.b = null;
        return commonBaseDatasource;
    }

    public String c(CommonBaseDatasource commonBaseDatasource) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("eea155f3", new Object[]{this, commonBaseDatasource});
        }
        this.b = commonBaseDatasource;
        String valueOf = String.valueOf(System.currentTimeMillis());
        this.f24449a = valueOf;
        return valueOf;
    }

    public void d(String str, CommonBaseDatasource commonBaseDatasource) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19b4da57", new Object[]{this, str, commonBaseDatasource});
            return;
        }
        this.b = commonBaseDatasource;
        this.f24449a = str;
    }
}
