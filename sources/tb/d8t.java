package tb;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.taolive.sdk.adapter.nav.INavInterceptor;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class d8t implements pyc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public INavInterceptor f17653a = null;

    static {
        t2o.a(779092365);
        t2o.a(806355925);
    }

    @Override // tb.pyc
    public boolean a(Context context, String str, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("18090ad3", new Object[]{this, context, str, bundle})).booleanValue();
        }
        if (!TextUtils.isEmpty(str)) {
            str = e(str, "fromLiveRoom=1");
        }
        INavInterceptor iNavInterceptor = this.f17653a;
        if (iNavInterceptor == null || !iNavInterceptor.onNavIntercept(context, str, bundle, 0, 0)) {
            return Nav.from(context).withExtras(bundle).toUri(str);
        }
        return false;
    }

    @Override // tb.pyc
    public void b(Context context, String str, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("280a0aac", new Object[]{this, context, str, bundle});
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            str = e(str, "fromLiveRoom=1");
        }
        INavInterceptor iNavInterceptor = this.f17653a;
        if (iNavInterceptor == null || !iNavInterceptor.onNavIntercept(context, str, bundle, 0, 0)) {
            Nav.from(context).withExtras(bundle).toUri(str);
        }
    }

    @Override // tb.pyc
    public void c(Context context, String str, Bundle bundle, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d937bdd7", new Object[]{this, context, str, bundle, new Integer(i)});
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            str = e(str, "fromLiveRoom=1");
        }
        INavInterceptor iNavInterceptor = this.f17653a;
        if (iNavInterceptor == null || !iNavInterceptor.onNavIntercept(context, str, bundle, i, 0)) {
            Nav.from(context).withFlags(i).withExtras(bundle).toUri(str);
        }
    }

    @Override // tb.pyc
    public void d(INavInterceptor iNavInterceptor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3749c1e3", new Object[]{this, iNavInterceptor});
        } else {
            this.f17653a = iNavInterceptor;
        }
    }

    public final String e(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a95bf765", new Object[]{this, str, str2});
        }
        int indexOf = str.indexOf("?");
        int length = str.length();
        if (indexOf <= -1) {
            return str + "?" + str2;
        } else if (length - 1 == indexOf) {
            return str + str2;
        } else {
            return str + "&" + str2;
        }
    }

    @Override // tb.pyc
    public void a(INavInterceptor iNavInterceptor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a7ff386", new Object[]{this, iNavInterceptor});
        } else {
            this.f17653a = null;
        }
    }
}
