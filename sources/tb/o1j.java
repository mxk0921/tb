package tb;

import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.alilive.adapter.uikit.AliUrlImageView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import java.util.HashMap;
import tb.kat;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class o1j {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public BaseFrame f25083a;
    public final BaseFrame b;
    public final ViewGroup c;
    public final k0e d;
    public final Context e;
    public TBLiveDataModel f;
    public boolean g;
    public final jyw h;
    public boolean i;
    public final AliUrlImageView j;
    public long k;
    public qat l;
    public fbt m;
    public kat.a n;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements kat.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public BaseFrame a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (BaseFrame) ipChange.ipc$dispatch("5a5b734c", new Object[]{this});
            }
            return o1j.a(o1j.this);
        }

        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f80968ac", new Object[]{this});
            }
        }

        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("106aae78", new Object[]{this});
            }
        }

        public void d(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("67312941", new Object[]{this, str});
            } else {
                o1j.this.e(str);
            }
        }

        public void e(BaseFrame baseFrame) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b1ac1c4", new Object[]{this, baseFrame});
            } else {
                o1j.b(o1j.this, baseFrame);
            }
        }

        public void f(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e6a5e429", new Object[]{this, new Boolean(z)});
            } else {
                o1j.this.getClass();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ux9 f25085a;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;
        public final /* synthetic */ iz1 d;

        public b(ux9 ux9Var, String str, String str2, iz1 iz1Var) {
            this.f25085a = ux9Var;
            this.b = str;
            this.c = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (dxa.b(this.f25085a).l() != null) {
                HashMap hashMap = new HashMap();
                hashMap.put("itemId", this.b);
                hashMap.put("keyPointId", this.c);
                dxa.b(this.f25085a).l().h(hashMap, true, null);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public BaseFrame f25086a;
        public ViewGroup b;
        public k0e c;
        public Context d;
        public TBLiveDataModel e;
        public boolean f;
        public jyw g;
        public boolean h;
        public bxl i;
        public AliUrlImageView j;

        static {
            t2o.a(779092691);
        }

        public static /* synthetic */ BaseFrame a(c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (BaseFrame) ipChange.ipc$dispatch("845016bf", new Object[]{cVar});
            }
            return cVar.f25086a;
        }

        public static /* synthetic */ ViewGroup b(c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ViewGroup) ipChange.ipc$dispatch("4c26900f", new Object[]{cVar});
            }
            return cVar.b;
        }

        public static /* synthetic */ k0e c(c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (k0e) ipChange.ipc$dispatch("a1aba93", new Object[]{cVar});
            }
            return cVar.c;
        }

        public static /* synthetic */ Context d(c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Context) ipChange.ipc$dispatch("5ea03f40", new Object[]{cVar});
            }
            return cVar.d;
        }

        public static /* synthetic */ TBLiveDataModel e(c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TBLiveDataModel) ipChange.ipc$dispatch("22c58a66", new Object[]{cVar});
            }
            return cVar.e;
        }

        public static /* synthetic */ boolean f(c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("53c3354e", new Object[]{cVar})).booleanValue();
            }
            return cVar.f;
        }

        public static /* synthetic */ jyw g(c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (jyw) ipChange.ipc$dispatch("29343ef7", new Object[]{cVar});
            }
            return cVar.g;
        }

        public static /* synthetic */ boolean h(c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("55603250", new Object[]{cVar})).booleanValue();
            }
            return cVar.h;
        }

        public static /* synthetic */ bxl i(c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (bxl) ipChange.ipc$dispatch("db1ad72d", new Object[]{cVar});
            }
            return cVar.i;
        }

        public static /* synthetic */ AliUrlImageView j(c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (AliUrlImageView) ipChange.ipc$dispatch("8af5d2b0", new Object[]{cVar});
            }
            return cVar.j;
        }

        public o1j k() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (o1j) ipChange.ipc$dispatch("e66f1f06", new Object[]{this});
            }
            return new o1j(this);
        }

        public c l(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (c) ipChange.ipc$dispatch("2407e0f0", new Object[]{this, new Boolean(z)});
            }
            this.f = z;
            return this;
        }

        public c m(AliUrlImageView aliUrlImageView) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (c) ipChange.ipc$dispatch("8676243b", new Object[]{this, aliUrlImageView});
            }
            this.j = aliUrlImageView;
            return this;
        }

        public c n(Context context) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (c) ipChange.ipc$dispatch("85dab447", new Object[]{this, context});
            }
            this.d = context;
            return this;
        }

        public c o(jyw jywVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (c) ipChange.ipc$dispatch("4c1f5c12", new Object[]{this, jywVar});
            }
            this.g = jywVar;
            return this;
        }

        public c p(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (c) ipChange.ipc$dispatch("c9bb5218", new Object[]{this, new Boolean(z)});
            }
            this.h = z;
            return this;
        }

        public c q(TBLiveDataModel tBLiveDataModel) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (c) ipChange.ipc$dispatch("5bf1b9c", new Object[]{this, tBLiveDataModel});
            }
            this.e = tBLiveDataModel;
            return this;
        }

        public c r(BaseFrame baseFrame) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (c) ipChange.ipc$dispatch("f6a1e56a", new Object[]{this, baseFrame});
            }
            this.f25086a = baseFrame;
            return this;
        }

        public c s(bxl bxlVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (c) ipChange.ipc$dispatch("8d3da43a", new Object[]{this, bxlVar});
            }
            this.i = bxlVar;
            return this;
        }

        public c t(ViewGroup viewGroup) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (c) ipChange.ipc$dispatch("a77af24e", new Object[]{this, viewGroup});
            }
            this.b = viewGroup;
            return this;
        }

        public c u(k0e k0eVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (c) ipChange.ipc$dispatch("fcee0c5c", new Object[]{this, k0eVar});
            }
            this.c = k0eVar;
            return this;
        }
    }

    static {
        t2o.a(779092688);
    }

    public o1j(c cVar) {
        this.b = c.a(cVar);
        this.c = c.b(cVar);
        this.d = c.c(cVar);
        this.e = c.d(cVar);
        this.f = c.e(cVar);
        this.g = c.f(cVar);
        this.h = c.g(cVar);
        this.i = c.h(cVar);
        c.i(cVar);
        this.j = c.j(cVar);
    }

    public static /* synthetic */ BaseFrame a(o1j o1jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseFrame) ipChange.ipc$dispatch("9916b2e5", new Object[]{o1jVar});
        }
        return o1jVar.f25083a;
    }

    public static /* synthetic */ BaseFrame b(o1j o1jVar, BaseFrame baseFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseFrame) ipChange.ipc$dispatch("f1cb84f7", new Object[]{o1jVar, baseFrame});
        }
        o1jVar.f25083a = baseFrame;
        return baseFrame;
    }

    public BaseFrame c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseFrame) ipChange.ipc$dispatch("1b8aa3bc", new Object[]{this});
        }
        return this.f25083a;
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf922921", new Object[]{this});
            return;
        }
        if (this.n == null) {
            this.n = new a();
        }
        if (this.l == null) {
            this.l = new qat(this.b, this.c, this.d, this.e, this.f, this.g, this.n);
        }
        if (this.m == null) {
            this.m = new fbt(this.b, this.c, this.d, this.e, this.f, this.g, this.n);
        }
    }

    public void e(String str) {
        AliUrlImageView aliUrlImageView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ab3ac5c", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str) && (aliUrlImageView = this.j) != null) {
            aliUrlImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            this.j.setImageUrl(str);
            this.j.setVisibility(0);
        }
    }

    public void f(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91b75a74", new Object[]{this, new Boolean(z)});
            return;
        }
        this.g = z;
        qat qatVar = this.l;
        if (qatVar != null) {
            qatVar.g = z;
        }
        fbt fbtVar = this.m;
        if (fbtVar != null) {
            fbtVar.g = z;
        }
    }

    public void g(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dcb6904c", new Object[]{this, new Boolean(z)});
        } else {
            this.i = z;
        }
    }

    public void h(TBLiveDataModel tBLiveDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db1c448", new Object[]{this, tBLiveDataModel});
        } else {
            this.f = tBLiveDataModel;
        }
    }

    public void i(ux9 ux9Var, VideoInfo videoInfo, String str, String str2, iz1 iz1Var, ux9 ux9Var2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36294512", new Object[]{this, ux9Var, videoInfo, str, str2, iz1Var, ux9Var2});
            return;
        }
        k(ux9Var, z9u.CALC_REPLAY_ENTER, videoInfo);
        if (!this.i) {
            if (!videoInfo.landScape || !videoInfo.publishCommentsUseMtop || !videoInfo.fetchCommentsUseMtop) {
                this.l.d(ux9Var).c(ux9Var);
            } else {
                this.m.e(this.n).f(ux9Var).d().c(ux9Var);
            }
            up6.P0("1", ux9Var2);
            j(str, str2, iz1Var, ux9Var2);
        }
    }

    public final void j(String str, String str2, iz1 iz1Var, ux9 ux9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c358b273", new Object[]{this, str, str2, iz1Var, ux9Var});
            return;
        }
        jyw jywVar = this.h;
        if (jywVar != null) {
            jywVar.post(new b(ux9Var, str, str2, iz1Var));
        }
    }

    public final void k(ux9 ux9Var, String str, VideoInfo videoInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a40291c7", new Object[]{this, ux9Var, str, videoInfo});
        } else if (videoInfo != null) {
            this.k = System.currentTimeMillis();
            HashMap hashMap = new HashMap();
            int i = videoInfo.roomType;
            if (up6.w0(videoInfo, ux9Var)) {
                i = 13;
            }
            String str2 = "0";
            if (videoInfo.broadCaster != null) {
                hashMap.put("accountType", cxg.a(videoInfo.broadCaster.type) + "");
                hashMap.put(z9u.KEY_ACCOUNT_ID, videoInfo.broadCaster.accountId);
                hashMap.put(z9u.KEY_IS_FANS, videoInfo.broadCaster.follow ? "1" : str2);
            }
            hashMap.put("feedId", videoInfo.liveId);
            hashMap.put("feed_id", videoInfo.liveId);
            hashMap.put(z9u.KEY_FEED_TYPE, videoInfo.type + "");
            hashMap.put("from", up6.U(ux9Var));
            hashMap.put("livesource", up6.L(ux9Var));
            hashMap.put(yj4.PARAM_ENTRY_SOURCE, up6.v(ux9Var));
            hashMap.put("roomtype2=", i + "");
            if (videoInfo.landScape) {
                str2 = "1";
            }
            hashMap.put("landscape", str2);
            hashMap.put("deviceLevel", xj7.a() + "");
            hashMap.put("trackInfo", up6.a0(ux9Var));
            hashMap.put(yj4.PARAM_TRACK_LIVEOPRT_ID, up6.K(ux9Var));
            sbu.f(ux9Var, str, hashMap);
        }
    }

    public void l(ux9 ux9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("925ba8db", new Object[]{this, ux9Var});
            return;
        }
        VideoInfo e = cxg.e(this.f);
        if (e != null && e.broadCaster != null && "1".equals(e.roomStatus)) {
            int i = e.roomType;
            if (up6.w0(e, ux9Var)) {
                i = 13;
            }
            sbu.g(ux9Var, z9u.CALC_STAY_TIME, "duration=" + (System.currentTimeMillis() / 1000));
            sbu.g(ux9Var, "TaoLiveLeave", "from=" + up6.U(ux9Var), "livesource=" + up6.L(ux9Var), "entrySource=" + up6.v(ux9Var), "duration=" + (System.currentTimeMillis() - this.k), "deviceLevel=" + xj7.a(), "roomtype2=" + i, "feed_id=" + e.liveId, "feedtype=" + e.type);
        }
    }
}
