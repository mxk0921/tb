package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.topmultitab.protocol.IHomeSubTabController;
import tb.hhc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class kps {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final hhc f22839a;
    public final hhc.a b;
    public final fdc c;
    public final IHomeSubTabController d;
    public String e = kis.TAO;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements hhc.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.hhc.a
        public String a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("70020a6e", new Object[]{this});
            }
            return "updateNavigationTabBarButtonStatus";
        }

        @Override // tb.hhc.a
        public void b(String str, JSONObject jSONObject, hhc.a.AbstractC0939a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d2afe60b", new Object[]{this, str, jSONObject, aVar});
            } else if (jSONObject == null || jSONObject.isEmpty()) {
                ((mvf) aVar).c("bridge params is empty");
            } else {
                if (TextUtils.equals("rocket", jSONObject.getString("status"))) {
                    kps.b(kps.this).I(kps.a(kps.this), "rocket");
                    kps.c(kps.this, "rocket");
                    fve.e("TabBarButtonService", "前端通知变更小火箭状态为ROCKET");
                } else {
                    kps.b(kps.this).I(kps.a(kps.this), kis.TAO);
                    kps.c(kps.this, kis.TAO);
                    fve.e("TabBarButtonService", "前端通知变更小火箭状态为TAO");
                }
                ((mvf) aVar).d("update success");
            }
        }
    }

    static {
        t2o.a(490733606);
    }

    public kps(hhc hhcVar, fdc fdcVar, IHomeSubTabController iHomeSubTabController) {
        this.f22839a = hhcVar;
        this.c = fdcVar;
        this.d = iHomeSubTabController;
        hhc.a d = d();
        this.b = d;
        hhcVar.a(d);
    }

    public static /* synthetic */ IHomeSubTabController a(kps kpsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IHomeSubTabController) ipChange.ipc$dispatch("51987d4d", new Object[]{kpsVar});
        }
        return kpsVar.d;
    }

    public static /* synthetic */ fdc b(kps kpsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fdc) ipChange.ipc$dispatch("5cc2970e", new Object[]{kpsVar});
        }
        return kpsVar.c;
    }

    public static /* synthetic */ String c(kps kpsVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("78ef7c56", new Object[]{kpsVar, str});
        }
        kpsVar.e = str;
        return str;
    }

    public final hhc.a d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hhc.a) ipChange.ipc$dispatch("860febfe", new Object[]{this});
        }
        return new a();
    }

    public String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b0ebe10b", new Object[]{this});
        }
        return this.e;
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770ac0a1", new Object[]{this});
        } else {
            this.f22839a.b(this.b);
        }
    }
}
