package tb;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.wireless.aliprivacyext.recommendation.e;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.Login;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class muz {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Context f24326a;
    public String b;

    public muz(Context context) {
        this.f24326a = context;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            this.b = null;
        }
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            this.b = str;
        }
    }

    public final String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this});
        }
        try {
            if (!TextUtils.isEmpty(this.b)) {
                return this.b;
            }
            if (Login.checkSessionValid()) {
                return Login.getUserId();
            }
            return hxm.l(this.f24326a);
        } catch (Throwable unused) {
            return null;
        }
    }

    public Context d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("c833dc62", new Object[]{this});
        }
        return this.f24326a;
    }

    public final e e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e) ipChange.ipc$dispatch("51343645", new Object[]{this});
        }
        String c = c();
        if (TextUtils.isEmpty(c)) {
            return e.NO_UID;
        }
        if (!hxm.c(this.f24326a, c)) {
            return e.INVALID;
        }
        if (hxm.e(this.f24326a, c)) {
            return e.OPEN;
        }
        return e.CLOSE;
    }

    public e f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e) ipChange.ipc$dispatch("76c83f46", new Object[]{this});
        }
        if (this.f24326a == null) {
            g01.c("RecommendHeaderGenerator", "mContext is null");
            return e.INVALID;
        } else if (h()) {
            return g();
        } else {
            return e();
        }
    }

    public final e g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e) ipChange.ipc$dispatch("9c5c4847", new Object[]{this});
        }
        if (!h()) {
            return e.INVALID;
        }
        if (hxm.s(this.f24326a)) {
            return e.OPEN;
        }
        return e.CLOSE;
    }

    public final boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c0f972", new Object[]{this})).booleanValue();
        }
        return hxm.d(this.f24326a);
    }
}
