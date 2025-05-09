package tb;

import android.app.Activity;
import android.graphics.Bitmap;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.avplayer.DWInstanceType;
import com.taobao.avplayer.r;
import com.taobao.mediaplay.model.MediaLiveWarmupConfig;
import com.taobao.taobao.R;
import java.util.HashMap;
import java.util.Map;
import tb.atb;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class mer implements atb {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "tbvideosdk";

    /* renamed from: a  reason: collision with root package name */
    public final r f23996a;
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
            mer.r(mer.this, true);
            if (mer.F(mer.this) != null) {
                mer.F(mer.this).onVideoRecycled();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class b implements atb.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final r.a f23998a;

        static {
            t2o.a(468714522);
            t2o.a(468714513);
        }

        public b(Activity activity) {
            this.f23998a = new r.a(activity);
        }

        @Override // tb.atb.a
        public atb.a a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (atb.a) ipChange.ipc$dispatch("b543c5f0", new Object[]{this, new Boolean(z)});
            }
            ir9.b(mer.TAG, "setUseShortAudioFocus: useShortAudioFocus:" + z);
            this.f23998a.V(z);
            return this;
        }

        @Override // tb.atb.a
        public atb.a b(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (atb.a) ipChange.ipc$dispatch("b271d9ee", new Object[]{this, new Boolean(z)});
            }
            ir9.b(mer.TAG, "setReleaseShortFocusWhenPause: releaseShortFocusWhenPause:" + z);
            this.f23998a.M(z);
            return this;
        }

        public atb c(r rVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (atb) ipChange.ipc$dispatch("2a495547", new Object[]{this, rVar});
            }
            return new mer(rVar);
        }

        public atb.a d(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (atb.a) ipChange.ipc$dispatch("d241fb6a", new Object[]{this, str});
            }
            this.f23998a.L(str);
            return this;
        }
    }

    static {
        t2o.a(468714520);
        t2o.a(468714512);
    }

    public mer(r rVar) {
        this.f23996a = rVar;
        rVar.K0(new a());
        if (rVar.K() != null) {
            rVar.K().setTag(R.id.fluid_sdk_tag_is_video_view, Boolean.TRUE);
        }
        ir9.b(TAG, "videotrack video create dwHashCode:" + rVar.hashCode() + " activityHashCode:" + G());
    }

    public static /* synthetic */ eub F(mer merVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (eub) ipChange.ipc$dispatch("67a629dd", new Object[]{merVar});
        }
        return merVar.c;
    }

    public static /* synthetic */ boolean r(mer merVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ae1e8aa9", new Object[]{merVar, new Boolean(z)})).booleanValue();
        }
        merVar.b = z;
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
            this.f23996a.H0(ytbVar);
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
        ViewGroup K;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bfc6032e", new Object[]{this})).intValue();
        }
        r rVar = this.f23996a;
        if (rVar == null || (K = rVar.K()) == null) {
            return 0;
        }
        return K.getContext().hashCode();
    }

    @Override // tb.atb
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("589b5c6a", new Object[]{this});
            return;
        }
        r rVar = this.f23996a;
        if (rVar != null) {
            rVar.u();
        }
    }

    @Override // tb.atb
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d91abe26", new Object[]{this});
            return;
        }
        ir9.b("PickPreloadControllerNew", "TBHighPerformanceDWInstanceProxy：commitEndForMultiplexing，补报12003");
        this.f23996a.w();
    }

    @Override // tb.atb
    public void c(HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9ad02c0", new Object[]{this, hashMap});
        }
    }

    @Override // tb.atb
    public void d(qtb qtbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb970df4", new Object[]{this, qtbVar});
        } else {
            this.f23996a.y0(qtbVar);
        }
    }

    @Override // tb.atb
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        ir9.b(TAG, "videotrack video destroy, dwinstance: " + this.f23996a + " dwHashCode: " + this.f23996a.hashCode() + " activityHashCode:" + G());
        this.f23996a.y();
    }

    @Override // tb.atb
    public void e(HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2e7be85", new Object[]{this, hashMap});
        } else {
            this.f23996a.D0(hashMap);
        }
    }

    @Override // tb.atb
    public void f(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2487bd12", new Object[]{this, new Integer(i), new Integer(i2)});
        } else {
            this.f23996a.m0(i, i2);
        }
    }

    @Override // tb.atb
    public void g(dub dubVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f202f393", new Object[]{this, dubVar});
        } else {
            this.f23996a.r0(dubVar);
        }
    }

    @Override // tb.atb
    public long getDuration() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ed837a85", new Object[]{this})).longValue();
        }
        return this.f23996a.C();
    }

    @Override // tb.atb
    public int getVideoState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("85134b46", new Object[]{this})).intValue();
        }
        return this.f23996a.H();
    }

    @Override // tb.atb
    public ViewGroup getView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("cbb4b1b3", new Object[]{this});
        }
        return this.f23996a.K();
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
            this.f23996a.t0(dWInstanceType);
        }
    }

    @Override // tb.atb
    public void j(aub aubVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c9a1d45", new Object[]{this, aubVar});
        } else {
            this.f23996a.q0(aubVar);
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
            this.f23996a.k0(nj9Var);
        }
    }

    @Override // tb.atb
    public void m(float f, float f2, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12f6043f", new Object[]{this, new Float(f), new Float(f2), new Integer(i), new Integer(i2)});
            return;
        }
        ir9.b(TAG, "volumeFadeInWithCustomParams: beginVol:" + f + " endVol:" + f2 + " fadeInTime" + i);
        this.f23996a.S0(f, f2, i, i2);
    }

    @Override // tb.atb
    public void mute(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4254d4b4", new Object[]{this, new Boolean(z)});
        } else {
            this.f23996a.V(z);
        }
    }

    @Override // tb.atb
    public void n(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5cac726", new Object[]{this, new Boolean(z)});
            return;
        }
        ir9.b(TAG, "setOpenVolumeFadeIn: isFadein:" + z);
        this.f23996a.w0(z);
    }

    @Override // tb.atb
    public Map<String, String> o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("438347ba", new Object[]{this});
        }
        return this.f23996a.F();
    }

    @Override // tb.atb
    public void p(HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30bcd334", new Object[]{this, hashMap});
        } else if (hashMap != null && !hashMap.isEmpty()) {
            this.f23996a.o(hashMap);
        }
    }

    @Override // tb.atb
    public void pauseVideo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf67322c", new Object[]{this});
            return;
        }
        ir9.b(TAG, "videotrack video pauseVideo: " + this.f23996a);
        this.f23996a.W();
    }

    @Override // tb.atb
    public void playVideo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4075d2ae", new Object[]{this});
            return;
        }
        ir9.b(TAG, "videotrack video playVideo: " + this.f23996a);
        this.f23996a.Y();
    }

    @Override // tb.atb
    public void prepareToFirstFrame() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f50cd26", new Object[]{this});
        } else {
            this.f23996a.a0();
        }
    }

    @Override // tb.atb
    public void q(String str, boolean z, HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27a4ec07", new Object[]{this, str, new Boolean(z), hashMap});
        } else {
            this.f23996a.Q0(str, z, hashMap);
        }
    }

    @Override // tb.atb
    public void s(ImageView imageView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab315d39", new Object[]{this, imageView});
        } else {
            this.f23996a.x0(imageView);
        }
    }

    @Override // tb.atb
    public void seekTo(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49645829", new Object[]{this, new Integer(i)});
        } else {
            this.f23996a.d0(i);
        }
    }

    @Override // tb.atb
    public void setBizCode(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d29306ef", new Object[]{this, str});
        } else {
            this.f23996a.i0(str);
        }
    }

    @Override // tb.atb
    public void setPlayRate(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b5e4523", new Object[]{this, new Float(f)});
        } else {
            this.f23996a.z0(f);
        }
    }

    @Override // tb.atb
    public void setVideoLoop(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("127f99d0", new Object[]{this, new Boolean(z)});
        } else {
            this.f23996a.I0(z);
        }
    }

    @Override // tb.atb
    public void setVolume(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3942a77d", new Object[]{this, new Float(f)});
            return;
        }
        ir9.b(TAG, "setVolume volume=" + f);
        this.f23996a.M0(f);
    }

    @Override // tb.atb
    public void start() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810347e9", new Object[]{this});
            return;
        }
        ir9.b(TAG, "videotrack video start: " + this.f23996a);
        this.f23996a.O0();
    }

    @Override // tb.atb
    public String t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("22b0754e", new Object[]{this});
        }
        return this.f23996a.D();
    }

    @Override // tb.atb
    public void u(MediaLiveWarmupConfig mediaLiveWarmupConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36dfca00", new Object[]{this, mediaLiveWarmupConfig});
        }
    }

    @Override // tb.atb
    public void v(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ffa5ae66", new Object[]{this, map});
        } else if (map != null && !map.isEmpty()) {
            this.f23996a.s(map);
        }
    }

    @Override // tb.atb
    public void w(int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbdf700a", new Object[]{this, new Integer(i), new Boolean(z)});
            return;
        }
        ir9.b(TAG, "videotrack video seekto " + i);
        this.f23996a.e0(i, z);
    }

    @Override // tb.atb
    public jgi x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jgi) ipChange.ipc$dispatch("8b32bcbe", new Object[]{this});
        }
        return null;
    }

    @Override // tb.atb
    public boolean y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5b343e7c", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // tb.atb
    public void z(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41f22ae", new Object[]{this, new Boolean(z)});
        } else if (z && !this.e) {
            this.e = true;
            ir9.b(TAG, "controlAudioFocus: 获取音频焦点:" + z);
            this.f23996a.x(z);
        } else if (z) {
            ir9.b(TAG, "controlAudioFocus: 已经获取过音频焦点了:" + z);
        } else {
            this.e = false;
            ir9.b(TAG, "controlAudioFocus: 释放音频焦点:" + z);
            this.f23996a.x(z);
        }
    }
}
