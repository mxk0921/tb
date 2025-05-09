package tb;

import android.app.Activity;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.avplayer.DWAspectRatio;
import com.taobao.avplayer.DWInstanceType;
import com.taobao.avplayer.DWVideoScreenType;
import com.taobao.avplayer.c;
import com.taobao.mediaplay.model.MediaLiveInfo;
import com.taobao.mediaplay.model.MediaLiveWarmupConfig;
import com.uc.webview.export.media.CommandID;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
import tb.qic;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class d85 implements qic {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final c f17646a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class a implements qic.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final c.C0535c f17647a;

        static {
            t2o.a(500170802);
            t2o.a(500170806);
        }

        public a(Activity activity) {
            this.f17647a = new c.C0535c(activity);
        }

        @Override // tb.qic.a
        public qic.a a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (qic.a) ipChange.ipc$dispatch("125798f2", new Object[]{this, new Boolean(z)});
            }
            this.f17647a.y(z);
            return this;
        }

        @Override // tb.qic.a
        public qic.a b(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (qic.a) ipChange.ipc$dispatch("f85acf0", new Object[]{this, new Boolean(z)});
            }
            this.f17647a.s(z);
            return this;
        }

        @Override // tb.qic.a
        public qic.a c(HashMap<String, String> hashMap) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (qic.a) ipChange.ipc$dispatch("4dd3909e", new Object[]{this, hashMap});
            }
            this.f17647a.q(hashMap);
            return this;
        }

        @Override // tb.qic.a
        public qic.a d(DWAspectRatio dWAspectRatio) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (qic.a) ipChange.ipc$dispatch("9b105d64", new Object[]{this, dWAspectRatio});
            }
            this.f17647a.z(dWAspectRatio);
            return this;
        }

        @Override // tb.qic.a
        public qic.a e(HashMap<String, String> hashMap) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (qic.a) ipChange.ipc$dispatch("4af40f63", new Object[]{this, hashMap});
            }
            this.f17647a.x(hashMap);
            return this;
        }

        @Override // tb.qic.a
        public qic.a f(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (qic.a) ipChange.ipc$dispatch("8686a723", new Object[]{this, str});
            }
            this.f17647a.C(str);
            return this;
        }

        @Override // tb.qic.a
        public qic.a g(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (qic.a) ipChange.ipc$dispatch("22fa76c0", new Object[]{this, new Boolean(z)});
            }
            this.f17647a.c(z);
            return this;
        }

        @Override // tb.qic.a
        public qic.a h(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (qic.a) ipChange.ipc$dispatch("70797dab", new Object[]{this, new Boolean(z)});
            }
            this.f17647a.b(z);
            return this;
        }

        @Override // tb.qic.a
        public qic.a i(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (qic.a) ipChange.ipc$dispatch("d51ae29f", new Object[]{this, new Boolean(z)});
            }
            this.f17647a.i(z);
            return this;
        }

        @Override // tb.qic.a
        public qic.a j(DWInstanceType dWInstanceType) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (qic.a) ipChange.ipc$dispatch("de0e5fb0", new Object[]{this, dWInstanceType});
            }
            this.f17647a.h(dWInstanceType);
            return this;
        }

        @Override // tb.qic.a
        public qic.a k(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (qic.a) ipChange.ipc$dispatch("699c8779", new Object[]{this, new Boolean(z)});
            }
            this.f17647a.l(z);
            return this;
        }

        @Override // tb.qic.a
        public qic.a l(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (qic.a) ipChange.ipc$dispatch("6d583dac", new Object[]{this, str});
            }
            this.f17647a.e(str);
            return this;
        }

        @Override // tb.qic.a
        public qic.a m(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (qic.a) ipChange.ipc$dispatch("a911cdfe", new Object[]{this, new Boolean(z)});
            }
            this.f17647a.j(z);
            return this;
        }

        @Override // tb.qic.a
        public qic.a n(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (qic.a) ipChange.ipc$dispatch("2f55ce6c", new Object[]{this, str});
            }
            this.f17647a.r(str);
            return this;
        }

        @Override // tb.qic.a
        public qic.a o(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (qic.a) ipChange.ipc$dispatch("6ad7b0a6", new Object[]{this, new Integer(i)});
            }
            this.f17647a.v(i);
            return this;
        }

        @Override // tb.qic.a
        public qic.a p(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (qic.a) ipChange.ipc$dispatch("ecf2371f", new Object[]{this, jSONObject});
            }
            this.f17647a.m(jSONObject);
            return this;
        }

        @Override // tb.qic.a
        public qic.a q(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (qic.a) ipChange.ipc$dispatch("abc2044e", new Object[]{this, new Integer(i)});
            }
            this.f17647a.t(i);
            return this;
        }

        @Override // tb.qic.a
        public qic.a r(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (qic.a) ipChange.ipc$dispatch("18c3e264", new Object[]{this, new Boolean(z)});
            }
            this.f17647a.p(z);
            return this;
        }

        @Override // tb.qic.a
        public qic.a s(HashMap<String, String> hashMap) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (qic.a) ipChange.ipc$dispatch("76050f89", new Object[]{this, hashMap});
            }
            this.f17647a.g(hashMap);
            return this;
        }

        @Override // tb.qic.a
        public qic.a setBizCode(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (qic.a) ipChange.ipc$dispatch("6b84fdcd", new Object[]{this, str});
            }
            this.f17647a.d(str);
            return this;
        }

        @Override // tb.qic.a
        public qic.a setHeight(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (qic.a) ipChange.ipc$dispatch("c210fbb1", new Object[]{this, new Integer(i)});
            }
            this.f17647a.k(i);
            return this;
        }

        @Override // tb.qic.a
        public qic.a setMute(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (qic.a) ipChange.ipc$dispatch("3b383250", new Object[]{this, new Boolean(z)});
            }
            this.f17647a.n(z);
            return this;
        }

        @Override // tb.qic.a
        public qic.a setVideoId(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (qic.a) ipChange.ipc$dispatch("5ab7e0a3", new Object[]{this, str});
            }
            this.f17647a.A(str);
            return this;
        }

        @Override // tb.qic.a
        public qic.a setVideoUrl(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (qic.a) ipChange.ipc$dispatch("6aff7e65", new Object[]{this, str});
            }
            this.f17647a.D(str);
            return this;
        }

        @Override // tb.qic.a
        public qic.a setWidth(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (qic.a) ipChange.ipc$dispatch("1d2db936", new Object[]{this, new Integer(i)});
            }
            this.f17647a.E(i);
            return this;
        }

        public qic t() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (qic) ipChange.ipc$dispatch("3bc4d4af", new Object[]{this});
            }
            return new d85(this.f17647a.a());
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class b implements ytb {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final ric f17648a;

        static {
            t2o.a(500170803);
            t2o.a(452985011);
        }

        public b(ric ricVar) {
            this.f17648a = ricVar;
        }

        @Override // tb.ytb
        public void onVideoClose() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("24db3403", new Object[]{this});
            } else {
                this.f17648a.onVideoClose();
            }
        }

        @Override // tb.ytb
        public void onVideoComplete() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d3c2c53c", new Object[]{this});
            } else {
                this.f17648a.onVideoComplete();
            }
        }

        @Override // tb.ytb
        public void onVideoError(Object obj, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a7a1a1cf", new Object[]{this, obj, new Integer(i), new Integer(i2)});
            } else {
                this.f17648a.onVideoError(obj, i, i2);
            }
        }

        @Override // tb.ytb
        public void onVideoInfo(Object obj, long j, long j2, long j3, Object obj2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("59f3ed73", new Object[]{this, obj, new Long(j), new Long(j2), new Long(j3), obj2});
            } else {
                this.f17648a.onVideoInfo(obj, j, j2, j3, obj2);
            }
        }

        @Override // tb.ytb
        public void onVideoPause(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ee9d05f3", new Object[]{this, new Boolean(z)});
            } else {
                this.f17648a.onVideoPause(z);
            }
        }

        @Override // tb.ytb
        public void onVideoPlay() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("931007b7", new Object[]{this});
            } else {
                this.f17648a.onVideoPlay();
            }
        }

        @Override // tb.ytb
        public void onVideoPrepared(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3faee61c", new Object[]{this, obj});
            } else {
                this.f17648a.onVideoPrepared(obj);
            }
        }

        @Override // tb.ytb
        public void onVideoProgressChanged(int i, int i2, int i3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("91a8a811", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
            } else {
                this.f17648a.onVideoProgressChanged(i, i2, i3);
            }
        }

        @Override // tb.ytb
        public void onVideoScreenChanged(DWVideoScreenType dWVideoScreenType) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("84bd1066", new Object[]{this, dWVideoScreenType});
            } else {
                this.f17648a.onVideoScreenChanged(dWVideoScreenType);
            }
        }

        @Override // tb.ytb
        public void onVideoSeekTo(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dd6694ad", new Object[]{this, new Integer(i)});
            } else {
                this.f17648a.onVideoSeekTo(i);
            }
        }

        @Override // tb.ytb
        public void onVideoStart() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c2b2d56d", new Object[]{this});
            } else {
                this.f17648a.onVideoStart();
            }
        }
    }

    static {
        t2o.a(500170801);
        t2o.a(500170805);
    }

    public d85(c cVar) {
        this.f17646a = cVar;
    }

    @Override // tb.d9d
    public void A(eub eubVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21c5800a", new Object[]{this, eubVar});
            return;
        }
        c cVar = this.f17646a;
        if (cVar != null) {
            cVar.Y(eubVar);
        }
    }

    @Override // tb.w9d
    public void C(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56d4a6f0", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        c cVar = this.f17646a;
        if (cVar != null) {
            cVar.G(i, i2);
        }
    }

    @Override // tb.l2c
    public void D(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f3f8e34", new Object[]{this, new Float(f)});
            return;
        }
        c cVar = this.f17646a;
        if (cVar != null) {
            cVar.R(f);
        }
    }

    @Override // tb.d9d
    public void E(ric ricVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9305378c", new Object[]{this, ricVar});
        } else if (ricVar != null) {
            b bVar = new b(ricVar);
            c cVar = this.f17646a;
            if (cVar != null) {
                cVar.V(bVar);
            }
        }
    }

    public void F(MediaLiveInfo mediaLiveInfo, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a36608c", new Object[]{this, mediaLiveInfo, str});
            return;
        }
        c cVar = this.f17646a;
        if (cVar != null) {
            cVar.L(mediaLiveInfo, str);
        }
    }

    public void G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cce3884", new Object[]{this});
            return;
        }
        c cVar = this.f17646a;
        if (cVar != null) {
            cVar.a0();
        }
    }

    @Override // tb.w9d
    public View a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("a703e6c9", new Object[]{this});
        }
        c cVar = this.f17646a;
        if (cVar != null) {
            return cVar.p();
        }
        return null;
    }

    @Override // tb.l4e
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d91abe26", new Object[]{this});
            return;
        }
        c cVar = this.f17646a;
        if (cVar != null) {
            cVar.e();
        }
    }

    @Override // tb.l4e
    public void c(HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9ad02c0", new Object[]{this, hashMap});
            return;
        }
        c cVar = this.f17646a;
        if (cVar != null) {
            cVar.Q(hashMap);
        }
    }

    @Override // tb.w9d
    public void d(qtb qtbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb970df4", new Object[]{this, qtbVar});
            return;
        }
        c cVar = this.f17646a;
        if (cVar != null) {
            cVar.P(qtbVar);
        }
    }

    @Override // tb.l4e
    public void e(HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2e7be85", new Object[]{this, hashMap});
            return;
        }
        c cVar = this.f17646a;
        if (cVar != null) {
            cVar.U(hashMap);
        }
    }

    @Override // tb.d9d
    public long f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8c90e80f", new Object[]{this})).longValue();
        }
        c cVar = this.f17646a;
        if (cVar != null) {
            return cVar.i();
        }
        return 0L;
    }

    @Override // tb.d9d
    public void g(dub dubVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f202f393", new Object[]{this, dubVar});
            return;
        }
        c cVar = this.f17646a;
        if (cVar != null) {
            cVar.I(dubVar);
        }
    }

    @Override // tb.d9d
    public int getVideoState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("85134b46", new Object[]{this})).intValue();
        }
        c cVar = this.f17646a;
        if (cVar != null) {
            return cVar.n();
        }
        return 0;
    }

    @Override // tb.w9d
    public Bitmap h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("900dd4f", new Object[]{this});
        }
        return null;
    }

    @Override // tb.w9d
    public void i(DWInstanceType dWInstanceType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a28ef3f", new Object[]{this, dWInstanceType});
            return;
        }
        c cVar = this.f17646a;
        if (cVar != null) {
            cVar.J(dWInstanceType);
        }
    }

    @Override // tb.d9d
    public void j(aub aubVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c9a1d45", new Object[]{this, aubVar});
            return;
        }
        c cVar = this.f17646a;
        if (cVar != null) {
            cVar.H(aubVar);
        }
    }

    @Override // tb.d9d
    public void k(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aececba2", new Object[]{this, new Integer(i)});
        }
    }

    @Override // tb.l4e
    public void l(nj9 nj9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2ed34d3", new Object[]{this, nj9Var});
            return;
        }
        c cVar = this.f17646a;
        if (cVar != null) {
            cVar.F(nj9Var);
        }
    }

    @Override // tb.d9d
    public void m(float f, float f2, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12f6043f", new Object[]{this, new Float(f), new Float(f2), new Integer(i), new Integer(i2)});
            return;
        }
        c cVar = this.f17646a;
        if (cVar != null) {
            cVar.k0(f, f2, i, i2);
        }
    }

    @Override // tb.l4e
    public Map<String, String> o() {
        Map<String, String> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("438347ba", new Object[]{this});
        }
        c cVar = this.f17646a;
        if (cVar != null) {
            map = cVar.l();
        } else {
            map = null;
        }
        if (map == null) {
            return new HashMap();
        }
        return map;
    }

    @Override // tb.l4e
    public void p(HashMap<String, String> hashMap) {
        c cVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30bcd334", new Object[]{this, hashMap});
        } else if (hashMap != null && !hashMap.isEmpty() && (cVar = this.f17646a) != null) {
            cVar.a(hashMap);
        }
    }

    @Override // tb.l4e
    public void q(String str, boolean z, HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27a4ec07", new Object[]{this, str, new Boolean(z), hashMap});
            return;
        }
        c cVar = this.f17646a;
        if (cVar != null) {
            cVar.c0(str, z, hashMap);
        }
    }

    @Override // tb.d9d
    public void r(HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e34cbf4", new Object[]{this, hashMap});
        }
    }

    @Override // tb.w9d
    public void s(ImageView imageView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab315d39", new Object[]{this, imageView});
            return;
        }
        c cVar = this.f17646a;
        if (cVar != null) {
            cVar.O(imageView);
        }
    }

    @Override // tb.d9d
    public void setBizCode(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d29306ef", new Object[]{this, str});
            return;
        }
        c cVar = this.f17646a;
        if (cVar != null) {
            cVar.E(str);
        }
    }

    @Override // tb.l2c
    public void setLooping(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37c734b1", new Object[]{this, new Boolean(z)});
            return;
        }
        c cVar = this.f17646a;
        if (cVar != null) {
            cVar.W(z);
        }
    }

    @Override // tb.l2c
    public void setVolume(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3942a77d", new Object[]{this, new Float(f)});
            return;
        }
        c cVar = this.f17646a;
        if (cVar != null) {
            cVar.Z(f);
        }
    }

    @Override // tb.l4e
    public String t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("22b0754e", new Object[]{this});
        }
        c cVar = this.f17646a;
        if (cVar != null) {
            return cVar.j();
        }
        return null;
    }

    @Override // tb.d9d
    public void u(MediaLiveWarmupConfig mediaLiveWarmupConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36dfca00", new Object[]{this, mediaLiveWarmupConfig});
            return;
        }
        c cVar = this.f17646a;
        if (cVar != null) {
            cVar.l0(mediaLiveWarmupConfig);
        }
    }

    @Override // tb.d9d
    public void v(Map<String, String> map) {
        c cVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ffa5ae66", new Object[]{this, map});
        } else if (map != null && !map.isEmpty() && (cVar = this.f17646a) != null) {
            cVar.c(map);
        }
    }

    @Override // tb.l4e
    public void w(HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75d03a66", new Object[]{this, hashMap});
            return;
        }
        c cVar = this.f17646a;
        if (cVar != null) {
            cVar.b(hashMap);
        }
    }

    @Override // tb.d9d
    public jgi x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jgi) ipChange.ipc$dispatch("8b32bcbe", new Object[]{this});
        }
        c cVar = this.f17646a;
        if (cVar != null) {
            return cVar.k();
        }
        return null;
    }

    @Override // tb.d9d
    public boolean y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5b343e7c", new Object[]{this})).booleanValue();
        }
        c cVar = this.f17646a;
        if (cVar != null) {
            return cVar.d0();
        }
        return false;
    }

    @Override // tb.d9d
    public void z(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41f22ae", new Object[]{this, new Boolean(z)});
            return;
        }
        c cVar = this.f17646a;
        if (cVar != null) {
            cVar.f(z);
        }
    }

    @Override // tb.d9d
    public void close() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e32ba67f", new Object[]{this});
        } else if (this.f17646a != null) {
            azf.d(this, "close", mer.TAG, "videotrack video close");
            this.f17646a.d();
        }
    }

    @Override // tb.d9d
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        } else if (this.f17646a != null) {
            azf.d(this, "destroy", mer.TAG, "videotrack video destroy");
            this.f17646a.g();
        }
    }

    @Override // tb.d9d
    public void pause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("315dbf7d", new Object[]{this});
        } else if (this.f17646a != null) {
            azf.d(this, "pause", mer.TAG, "videotrack video pauseVideo");
            this.f17646a.t();
        }
    }

    @Override // tb.d9d
    public void play() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fe955bb", new Object[]{this});
        } else if (this.f17646a != null) {
            azf.d(this, "play", mer.TAG, "videotrack video playVideo");
            this.f17646a.u();
        }
    }

    @Override // tb.l2c
    public void prepareToFirstFrame() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f50cd26", new Object[]{this});
        } else if (this.f17646a != null) {
            azf.d(this, "prepareToFirstFrame", mer.TAG, "videotrack video prepareToFirstFrame");
            this.f17646a.v();
        }
    }

    @Override // tb.d9d
    public void start() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810347e9", new Object[]{this});
        } else if (this.f17646a != null) {
            azf.d(this, "start", mer.TAG, "videotrack video start");
            this.f17646a.b0();
        }
    }

    @Override // tb.d9d
    public void B(int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3275fcb", new Object[]{this, new Integer(i), new Boolean(z)});
        } else if (this.f17646a != null) {
            azf.d(this, CommandID.seekTo, mer.TAG, "videotrack video seekto " + i);
            this.f17646a.D(i, z);
        }
    }

    @Override // tb.d9d
    public void n(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5cac726", new Object[]{this, new Boolean(z)});
        } else if (this.f17646a != null) {
            azf.d(this, "setOpenVolumeFadeIn", mer.TAG, "videotrack video setOpenVolumeFadeIn=" + z);
            this.f17646a.N(z);
        }
    }

    @Override // tb.d9d
    public void seekTo(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49645829", new Object[]{this, new Integer(i)});
        } else if (this.f17646a != null) {
            azf.d(this, CommandID.seekTo, mer.TAG, "videotrack video seekto " + i);
            this.f17646a.C(i);
        }
    }

    @Override // tb.d9d
    public void setMute(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e160672", new Object[]{this, new Boolean(z)});
        } else if (this.f17646a != null) {
            azf.d(this, "setMute", mer.TAG, "videotrack video mute=" + z);
            this.f17646a.s(z);
        }
    }
}
