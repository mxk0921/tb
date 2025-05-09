package tb;

import android.app.Activity;
import com.ali.adapt.api.AtlasServiceFinder;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import tb.aj;
import tb.k9r;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class v7r extends fm0 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String BIZ_NAME = "purchase";

    /* renamed from: a  reason: collision with root package name */
    public final Activity f29842a;
    public final bar c;
    public final j9r d;
    public final z8r e;
    public final gfb f;
    public final b8r b = new b8r();
    public final abr g = new abr();

    static {
        t2o.a(708837435);
    }

    public v7r(Activity activity, HashMap<String, Object> hashMap, mud mudVar, jud judVar) {
        this.f29842a = activity;
        this.c = new bar(hashMap);
        this.d = new j9r(activity);
        this.e = new z8r(activity);
        this.f = new s9r(activity, mudVar, judVar);
    }

    public static /* synthetic */ Object ipc$super(v7r v7rVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/purchase/aura/TBBuyConfigurationImpl");
    }

    @Override // tb.zpb
    public aj.a a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (aj.a) ipChange.ipc$dispatch("ab34fe0e", new Object[]{this});
        }
        return this.g;
    }

    @Override // tb.zpb
    public gn0 b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gn0) ipChange.ipc$dispatch("73150a89", new Object[]{this});
        }
        return this.e;
    }

    @Override // tb.zpb
    public so0 c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (so0) ipChange.ipc$dispatch("b30b9b4d", new Object[]{this});
        }
        return this.c;
    }

    @Override // tb.zpb
    public rn0 d(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rn0) ipChange.ipc$dispatch("d05a426c", new Object[]{this, activity});
        }
        return this.d;
    }

    @Override // tb.fm0, tb.zpb
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f307c84e", new Object[]{this});
        } else {
            AtlasServiceFinder.getInstance().registerService(k9r.c.class, "com.taobao.android.taobao-general-purchase", "com.taobao.android.purchase.aura.external.TBBuyExternalRPVerifyService");
        }
    }

    @Override // tb.zpb
    public lm0 f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lm0) ipChange.ipc$dispatch("d6506839", new Object[]{this});
        }
        return this.b;
    }

    @Override // tb.zpb
    public Activity getContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("616f3928", new Object[]{this});
        }
        return this.f29842a;
    }

    @Override // tb.zpb
    public String getPageName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("707fddc9", new Object[]{this});
        }
        return "Page_ConfirmOrder";
    }

    @Override // tb.zpb
    public gfb i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gfb) ipChange.ipc$dispatch("77b034a8", new Object[]{this});
        }
        return this.f;
    }
}
