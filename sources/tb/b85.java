package tb;

import android.app.Activity;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.avplayer.DWAspectRatio;
import com.taobao.avplayer.DWInstanceType;
import com.taobao.avplayer.c;
import com.taobao.mediaplay.model.MediaLiveWarmupConfig;
import com.taobao.taobao.R;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
import tb.atb;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class b85 implements atb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final c f16240a;
    public boolean b;
    public eub c;
    public boolean d;
    public boolean e = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements eub {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.eub
        public void onVideoRecycled() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d3803834", new Object[]{this});
                return;
            }
            b85.r(b85.this, true);
            if (b85.F(b85.this) != null) {
                b85.F(b85.this).onVideoRecycled();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class b implements atb.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final c.C0535c f16242a;
        public boolean b = false;
        public boolean c = false;
        public boolean d = false;

        static {
            t2o.a(468714506);
            t2o.a(468714513);
        }

        public b(Activity activity) {
            this.f16242a = new c.C0535c(activity);
        }

        @Override // tb.atb.a
        public atb.a a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (atb.a) ipChange.ipc$dispatch("b543c5f0", new Object[]{this, new Boolean(z)});
            }
            ir9.b("DWInstancePlusProxy", "setUseShortAudioFocus:" + z);
            this.f16242a.y(z);
            return this;
        }

        @Override // tb.atb.a
        public atb.a b(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (atb.a) ipChange.ipc$dispatch("b271d9ee", new Object[]{this, new Boolean(z)});
            }
            ir9.b("DWInstancePlusProxy", "setReleaseShortFocusWhenPause: releaseShortFocusWhenPause:" + z);
            this.f16242a.s(z);
            return this;
        }

        public atb c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (atb) ipChange.ipc$dispatch("38bc3e56", new Object[]{this});
            }
            igs.a(s0j.MTS_SUB_STAGE_CREATE_DW_INSTANCE);
            long currentTimeMillis = System.currentTimeMillis();
            b85 b85Var = new b85(this.f16242a.a());
            HashMap<String, String> hashMap = new HashMap<>();
            hashMap.put(atb.EXP_KEY_FULL_PAGE_DW_CREATE_TS, String.valueOf(currentTimeMillis));
            hashMap.put(atb.EXP_KEY_FULL_PAGE_DW_HAS_VIDEO_ID, String.valueOf(this.b));
            hashMap.put(atb.EXP_KEY_FULL_PAGE_DW_HAS_VIDEO_URL, String.valueOf(this.c));
            hashMap.put(atb.EXP_KEY_FULL_PAGE_DW_HAS_VIDEO_RES, String.valueOf(this.d));
            b85Var.c(hashMap);
            igs.c();
            return b85Var;
        }

        public atb d(c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (atb) ipChange.ipc$dispatch("e3406689", new Object[]{this, cVar});
            }
            return new b85(cVar);
        }

        public atb.a e(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (atb.a) ipChange.ipc$dispatch("c5e6a3be", new Object[]{this, new Boolean(z)});
            }
            this.f16242a.c(z);
            return this;
        }

        public atb.a f(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (atb.a) ipChange.ipc$dispatch("e712acb", new Object[]{this, str});
            }
            this.f16242a.d(str);
            return this;
        }

        public atb.a g(HashMap<String, String> hashMap) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (atb.a) ipChange.ipc$dispatch("18f13c87", new Object[]{this, hashMap});
            }
            this.f16242a.g(hashMap);
            return this;
        }

        public atb.a h(DWInstanceType dWInstanceType) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (atb.a) ipChange.ipc$dispatch("80fa8cae", new Object[]{this, dWInstanceType});
            }
            this.f16242a.h(dWInstanceType);
            return this;
        }

        public atb.a i(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (atb.a) ipChange.ipc$dispatch("78070f9d", new Object[]{this, new Boolean(z)});
            }
            ir9.b(mer.TAG, "setDisableSurfaceView， disableSurfaceView=" + z);
            this.f16242a.i(z);
            return this;
        }

        public atb.a j(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (atb.a) ipChange.ipc$dispatch("64fd28af", new Object[]{this, new Integer(i)});
            }
            this.f16242a.k(i);
            return this;
        }

        public atb.a k(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (atb.a) ipChange.ipc$dispatch("c88b477", new Object[]{this, new Boolean(z)});
            }
            this.f16242a.l(z);
            return this;
        }

        public atb.a l(JSONObject jSONObject) {
            boolean z = true;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (atb.a) ipChange.ipc$dispatch("8fde641d", new Object[]{this, jSONObject});
            }
            this.f16242a.m(jSONObject);
            if (jSONObject == null) {
                z = false;
            }
            this.d = z;
            return this;
        }

        public atb.a m(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (atb.a) ipChange.ipc$dispatch("de245f4e", new Object[]{this, new Boolean(z)});
            }
            this.f16242a.n(z);
            return this;
        }

        public atb.a n(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (atb.a) ipChange.ipc$dispatch("bbb00f62", new Object[]{this, new Boolean(z)});
            }
            this.f16242a.p(z);
            return this;
        }

        public atb.a o(HashMap<String, String> hashMap) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (atb.a) ipChange.ipc$dispatch("f0bfbd9c", new Object[]{this, hashMap});
            }
            this.f16242a.q(hashMap);
            return this;
        }

        public atb.a p(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (atb.a) ipChange.ipc$dispatch("d241fb6a", new Object[]{this, str});
            }
            this.f16242a.r(str);
            return this;
        }

        public atb.a q(HashMap<String, String> hashMap) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (atb.a) ipChange.ipc$dispatch("ede03c61", new Object[]{this, hashMap});
            }
            this.f16242a.x(hashMap);
            return this;
        }

        public atb.a r(DWAspectRatio dWAspectRatio) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (atb.a) ipChange.ipc$dispatch("3dfc8a62", new Object[]{this, dWAspectRatio});
            }
            this.f16242a.z(dWAspectRatio);
            return this;
        }

        public atb.a s(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (atb.a) ipChange.ipc$dispatch("fda40da1", new Object[]{this, str});
            }
            this.f16242a.A(str);
            this.b = !TextUtils.isEmpty(str);
            return this;
        }

        public atb.a t(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (atb.a) ipChange.ipc$dispatch("2972d421", new Object[]{this, str});
            }
            this.f16242a.C(str);
            return this;
        }

        public atb.a u(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (atb.a) ipChange.ipc$dispatch("debab63", new Object[]{this, str});
            }
            this.f16242a.D(str);
            this.c = !TextUtils.isEmpty(str);
            return this;
        }

        public atb.a v(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (atb.a) ipChange.ipc$dispatch("c019e634", new Object[]{this, new Integer(i)});
            }
            this.f16242a.E(i);
            return this;
        }
    }

    static {
        t2o.a(468714504);
        t2o.a(468714512);
    }

    public b85(c cVar) {
        this.f16240a = cVar;
        cVar.Y(new a());
        if (cVar.p() != null) {
            cVar.p().setTag(R.id.fluid_sdk_tag_is_video_view, Boolean.TRUE);
        }
        ir9.b(mer.TAG, "videotrack video create dwHashCode:" + cVar.hashCode() + " activityHashCode:" + G());
    }

    public static /* synthetic */ eub F(b85 b85Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (eub) ipChange.ipc$dispatch("3ba5c5df", new Object[]{b85Var});
        }
        return b85Var.c;
    }

    public static /* synthetic */ boolean r(b85 b85Var, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2bf85749", new Object[]{b85Var, new Boolean(z)})).booleanValue();
        }
        b85Var.b = z;
        return z;
    }

    @Override // tb.atb
    public void A(eub eubVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21c5800a", new Object[]{this, eubVar});
        } else {
            this.c = eubVar;
        }
    }

    @Override // tb.atb
    public boolean B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b9d9d686", new Object[]{this})).booleanValue();
        }
        return this.b;
    }

    @Override // tb.atb
    public void C(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe738b19", new Object[]{this, new Boolean(z)});
        } else {
            this.d = z;
        }
    }

    @Override // tb.atb
    public void D(ytb ytbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd04dc4a", new Object[]{this, ytbVar});
        } else {
            this.f16240a.V(ytbVar);
        }
    }

    @Override // tb.atb
    public boolean E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("62e32b57", new Object[]{this})).booleanValue();
        }
        return this.d;
    }

    public final int G() {
        ViewGroup p;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bfc6032e", new Object[]{this})).intValue();
        }
        c cVar = this.f16240a;
        if (cVar == null || (p = cVar.p()) == null) {
            return 0;
        }
        return p.getContext().hashCode();
    }

    public void H(String... strArr) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97f3b62c", new Object[]{this, strArr});
        } else if (strArr != null && strArr.length > 0) {
            HashMap<String, String> hashMap = new HashMap<>();
            while (true) {
                int i2 = i + 1;
                if (i2 < strArr.length) {
                    hashMap.put(strArr[i], strArr[i2]);
                    i += 2;
                } else {
                    c(hashMap);
                    return;
                }
            }
        }
    }

    @Override // tb.atb
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("589b5c6a", new Object[]{this});
            return;
        }
        c cVar = this.f16240a;
        if (cVar != null) {
            cVar.d();
        }
    }

    @Override // tb.atb
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d91abe26", new Object[]{this});
            return;
        }
        ir9.b("PickPreloadControllerNew", "DWInstancePlusProxy：commitEndForMultiplexing，补报12003, :" + this.f16240a);
        this.f16240a.e();
    }

    @Override // tb.atb
    public void c(HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9ad02c0", new Object[]{this, hashMap});
            return;
        }
        if (hashMap == null) {
            hashMap = new HashMap<>();
        }
        g2e s = qau.s();
        if (s != null) {
            hashMap.putAll(s.e());
        }
        sj4.a(hashMap);
        this.f16240a.Q(hashMap);
    }

    @Override // tb.atb
    public void d(qtb qtbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb970df4", new Object[]{this, qtbVar});
        } else {
            this.f16240a.P(qtbVar);
        }
    }

    @Override // tb.atb
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        ir9.b(mer.TAG, "videotrack video destroy, dwinstance: " + this.f16240a + " dwHashCode: " + this.f16240a.hashCode() + " activityHashCode:" + G());
        igs.a("destroyVideo");
        H(atb.EXP_KEY_FULL_PAGE_DW_DESTROY_TS, String.valueOf(System.currentTimeMillis()));
        this.f16240a.g();
        igs.c();
    }

    @Override // tb.atb
    public void e(HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2e7be85", new Object[]{this, hashMap});
            return;
        }
        if (hashMap == null) {
            hashMap = new HashMap<>();
        }
        sj4.a(hashMap);
        this.f16240a.U(hashMap);
    }

    @Override // tb.atb
    public void f(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2487bd12", new Object[]{this, new Integer(i), new Integer(i2)});
        } else {
            this.f16240a.G(i, i2);
        }
    }

    @Override // tb.atb
    public void g(dub dubVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f202f393", new Object[]{this, dubVar});
        } else {
            this.f16240a.I(dubVar);
        }
    }

    @Override // tb.atb
    public long getDuration() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ed837a85", new Object[]{this})).longValue();
        }
        return this.f16240a.i();
    }

    @Override // tb.atb
    public int getVideoState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("85134b46", new Object[]{this})).intValue();
        }
        return this.f16240a.n();
    }

    @Override // tb.atb
    public ViewGroup getView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("cbb4b1b3", new Object[]{this});
        }
        return this.f16240a.p();
    }

    @Override // tb.atb
    public Bitmap h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("900dd4f", new Object[]{this});
        }
        return null;
    }

    @Override // tb.atb
    public void i(DWInstanceType dWInstanceType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a28ef3f", new Object[]{this, dWInstanceType});
        } else {
            this.f16240a.J(dWInstanceType);
        }
    }

    @Override // tb.atb
    public void j(aub aubVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c9a1d45", new Object[]{this, aubVar});
        } else {
            this.f16240a.H(aubVar);
        }
    }

    @Override // tb.atb
    public void k(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aececba2", new Object[]{this, new Integer(i)});
        }
    }

    @Override // tb.atb
    public void l(nj9 nj9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2ed34d3", new Object[]{this, nj9Var});
        } else {
            this.f16240a.F(nj9Var);
        }
    }

    @Override // tb.atb
    public void m(float f, float f2, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12f6043f", new Object[]{this, new Float(f), new Float(f2), new Integer(i), new Integer(i2)});
        } else {
            this.f16240a.k0(f, f2, i, i2);
        }
    }

    @Override // tb.atb
    public void mute(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4254d4b4", new Object[]{this, new Boolean(z)});
            return;
        }
        ir9.b(mer.TAG, "videotrack video mute=" + z + " :" + this.f16240a);
        this.f16240a.s(z);
    }

    @Override // tb.atb
    public void n(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5cac726", new Object[]{this, new Boolean(z)});
            return;
        }
        ir9.b("DWInstancePlusProxy", "setOpenVolumeFadeIn: isFadein:" + z);
        this.f16240a.N(z);
    }

    @Override // tb.atb
    public Map<String, String> o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("438347ba", new Object[]{this});
        }
        return this.f16240a.l();
    }

    @Override // tb.atb
    public void p(HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30bcd334", new Object[]{this, hashMap});
        } else if (hashMap != null && !hashMap.isEmpty()) {
            this.f16240a.a(hashMap);
        }
    }

    @Override // tb.atb
    public void pauseVideo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf67322c", new Object[]{this});
            return;
        }
        ir9.b(mer.TAG, "videotrack video pauseVideo: " + this.f16240a);
        igs.a("pauseVideo");
        this.f16240a.t();
        igs.c();
    }

    @Override // tb.atb
    public void playVideo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4075d2ae", new Object[]{this});
            return;
        }
        ir9.b(mer.TAG, "videotrack video playVideo: " + this.f16240a);
        igs.a("playVideo");
        this.f16240a.u();
        igs.c();
    }

    @Override // tb.atb
    public void prepareToFirstFrame() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f50cd26", new Object[]{this});
            return;
        }
        ir9.b(mer.TAG, "videotrack video prepareToFirstFrame: " + this.f16240a);
        igs.a("prepareToFirstFrame");
        H(atb.EXP_KEY_FULL_PAGE_DW_P2FF_TS, String.valueOf(System.currentTimeMillis()));
        this.f16240a.v();
        igs.c();
    }

    @Override // tb.atb
    public void q(String str, boolean z, HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27a4ec07", new Object[]{this, str, new Boolean(z), hashMap});
        } else {
            this.f16240a.c0(str, z, hashMap);
        }
    }

    @Override // tb.atb
    public void s(ImageView imageView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab315d39", new Object[]{this, imageView});
            return;
        }
        ir9.b(mer.TAG, "setPicImageView()调用，imageView:" + imageView);
        this.f16240a.O(imageView);
    }

    @Override // tb.atb
    public void seekTo(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49645829", new Object[]{this, new Integer(i)});
            return;
        }
        ir9.b(mer.TAG, "videotrack video seekto " + i + " :" + this.f16240a);
        this.f16240a.C(i);
    }

    @Override // tb.atb
    public void setBizCode(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d29306ef", new Object[]{this, str});
        } else {
            this.f16240a.E(str);
        }
    }

    @Override // tb.atb
    public void setPlayRate(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b5e4523", new Object[]{this, new Float(f)});
            return;
        }
        ir9.b(mer.TAG, "setPlayRate playRate=" + f + "  :" + this.f16240a);
        this.f16240a.R(f);
    }

    @Override // tb.atb
    public void setVideoLoop(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("127f99d0", new Object[]{this, new Boolean(z)});
        } else {
            this.f16240a.W(z);
        }
    }

    @Override // tb.atb
    public void setVolume(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3942a77d", new Object[]{this, new Float(f)});
            return;
        }
        ir9.b(mer.TAG, "setVolume volume=" + f + " :" + this.f16240a);
        this.f16240a.Z(f);
    }

    @Override // tb.atb
    public void start() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810347e9", new Object[]{this});
            return;
        }
        ir9.b(mer.TAG, "videotrack video start: " + this.f16240a);
        igs.a("startVideo");
        H(atb.EXP_KEY_FULL_PAGE_DW_START_TS, String.valueOf(System.currentTimeMillis()));
        this.f16240a.b0();
        igs.c();
    }

    @Override // tb.atb
    public String t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("22b0754e", new Object[]{this});
        }
        return this.f16240a.j();
    }

    @Override // tb.atb
    public void u(MediaLiveWarmupConfig mediaLiveWarmupConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36dfca00", new Object[]{this, mediaLiveWarmupConfig});
            return;
        }
        ir9.b("DWInstancePlusProxy", "videotrack video warmupLiveStream: " + mediaLiveWarmupConfig);
        this.f16240a.l0(mediaLiveWarmupConfig);
    }

    @Override // tb.atb
    public void v(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ffa5ae66", new Object[]{this, map});
        } else if (map != null && !map.isEmpty()) {
            this.f16240a.c(map);
        }
    }

    @Override // tb.atb
    public void w(int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbdf700a", new Object[]{this, new Integer(i), new Boolean(z)});
            return;
        }
        ir9.b(mer.TAG, "videotrack video seekto " + i + " :" + this.f16240a);
        this.f16240a.D(i, z);
    }

    @Override // tb.atb
    public jgi x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jgi) ipChange.ipc$dispatch("8b32bcbe", new Object[]{this});
        }
        ir9.b("DWInstancePlusProxy", "getMediaPlayProxyInstance");
        return this.f16240a.k();
    }

    @Override // tb.atb
    public boolean y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5b343e7c", new Object[]{this})).booleanValue();
        }
        ir9.b("DWInstancePlusProxy", "unbindViewProxyFromDWLiveInstance");
        return this.f16240a.d0();
    }

    @Override // tb.atb
    public void z(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41f22ae", new Object[]{this, new Boolean(z)});
        } else if (z && !this.e) {
            this.e = true;
            ir9.b("DWInstancePlusProxy", "controlAudioFocus: 获取音频焦点:" + z);
            this.f16240a.f(z);
        } else if (z) {
            ir9.b("DWInstancePlusProxy", "controlAudioFocus: 已经获取过音频焦点了:" + z);
        } else {
            this.e = false;
            ir9.b("DWInstancePlusProxy", "controlAudioFocus: 释放音频焦点:" + z);
            this.f16240a.f(z);
        }
    }
}
