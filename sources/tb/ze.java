package tb;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.ut.mini.UTAnalytics;
import com.ut.mini.UTTracker;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public abstract class ze {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Context f32701a;
    public View b;
    public Uri c;
    public final Activity d = new Activity();
    public a e;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface a {
        void a();
    }

    static {
        t2o.a(352321905);
        t2o.a(352321908);
        t2o.a(352321907);
    }

    public ze(Context context) {
        this.f32701a = context;
    }

    public abstract View a();

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        } else {
            c2v.getInstance().pageDestroyed(this.d);
        }
    }

    public a c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("cb25f8b8", new Object[]{this});
        }
        return this.e;
    }

    public View d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("17b33166", new Object[]{this});
        }
        if (this.b == null) {
            this.b = a();
        }
        return this.b;
    }

    public abstract hfw e(cae caeVar);

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("315dbf7d", new Object[]{this});
            return;
        }
        txj.e(txj.TAG_SECOND_PAGE, "二级页pause");
        o();
    }

    public void g(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39a25a3f", new Object[]{this, aVar});
        } else {
            this.e = aVar;
        }
    }

    public abstract void h(Uri uri, View view);

    public void i(Uri uri, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7955735", new Object[]{this, uri, view});
        }
    }

    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("deb96e34", new Object[]{this});
            return;
        }
        txj.e(txj.TAG_SECOND_PAGE, "二级页resume");
        n();
    }

    public void k(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc764036", new Object[]{this, uri});
        } else {
            this.c = uri;
        }
    }

    public void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810347e9", new Object[]{this});
            return;
        }
        txj.e(txj.TAG_SECOND_PAGE, "二级页start");
        h(this.c, this.b);
    }

    public void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6623bb89", new Object[]{this});
            return;
        }
        txj.e(txj.TAG_SECOND_PAGE, "二级页stop");
        i(this.c, this.b);
    }

    public void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c22035b6", new Object[]{this});
        } else if (!TextUtils.isEmpty(null)) {
            txj.e(txj.TAG_SECOND_PAGE, "二级页appear页面埋点");
            UTTracker defaultTracker = UTAnalytics.getInstance().getDefaultTracker();
            defaultTracker.pageAppear(this.d);
            defaultTracker.updatePageName(this.d, null);
            defaultTracker.updatePageProperties(this.d, null);
            defaultTracker.updateNextPageProperties(new HashMap());
        }
    }

    public void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c86e8650", new Object[]{this});
            return;
        }
        txj.e(txj.TAG_SECOND_PAGE, "二级页disappear页面埋点");
        UTAnalytics.getInstance().getDefaultTracker().pageDisAppear(this.d);
    }
}
