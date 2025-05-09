package tb;

import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.avplayer.DWInstanceType;
import com.taobao.avplayer.DWVideoScreenType;
import com.taobao.kirinvideoengine.model.EngineModel;
import com.taobao.kirinvideoengine.model.MediaModel;
import com.taobao.mediaplay.model.MediaLiveWarmupConfig;
import com.taobao.taobao.R;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class d5g implements atb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public boolean f17593a;
    public final qic b;
    public final i5g c;
    public eub d;
    public boolean e;
    public boolean f = false;

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
            d5g.r(d5g.this, true);
            if (d5g.F(d5g.this) != null) {
                d5g.F(d5g.this).onVideoRecycled();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class b implements k5g {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final ytb f17595a;

        static {
            t2o.a(468714517);
            t2o.a(500170813);
        }

        public b(ytb ytbVar) {
            this.f17595a = ytbVar;
        }

        @Override // tb.k5g
        public void a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f118b844", new Object[]{this, str});
            }
        }

        @Override // tb.k5g
        public void b(Object obj, long j, long j2, long j3, Object obj2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6b4505ee", new Object[]{this, obj, new Long(j), new Long(j2), new Long(j3), obj2});
            } else {
                this.f17595a.onVideoInfo(obj, j, j2, j3, obj2);
            }
        }

        @Override // tb.k5g
        public void onVideoClose() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("24db3403", new Object[]{this});
            } else {
                this.f17595a.onVideoClose();
            }
        }

        @Override // tb.k5g
        public void onVideoComplete() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d3c2c53c", new Object[]{this});
            } else {
                this.f17595a.onVideoComplete();
            }
        }

        @Override // tb.k5g
        public void onVideoError(Object obj, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a7a1a1cf", new Object[]{this, obj, new Integer(i), new Integer(i2)});
            } else {
                this.f17595a.onVideoError(obj, i, i2);
            }
        }

        @Override // tb.k5g
        public void onVideoPause(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ee9d05f3", new Object[]{this, new Boolean(z)});
            } else {
                this.f17595a.onVideoPause(z);
            }
        }

        @Override // tb.k5g
        public void onVideoPlay() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("931007b7", new Object[]{this});
            } else {
                this.f17595a.onVideoPlay();
            }
        }

        @Override // tb.k5g
        public void onVideoPrepared(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3faee61c", new Object[]{this, obj});
            } else {
                this.f17595a.onVideoPrepared(obj);
            }
        }

        @Override // tb.k5g
        public void onVideoProgressChanged(int i, int i2, int i3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("91a8a811", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
            } else {
                this.f17595a.onVideoProgressChanged(i, i2, i3);
            }
        }

        @Override // tb.k5g
        public void onVideoScreenChanged(DWVideoScreenType dWVideoScreenType) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("84bd1066", new Object[]{this, dWVideoScreenType});
            } else {
                this.f17595a.onVideoScreenChanged(dWVideoScreenType);
            }
        }

        @Override // tb.k5g
        public void onVideoSeekTo(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dd6694ad", new Object[]{this, new Integer(i)});
            } else {
                this.f17595a.onVideoSeekTo(i);
            }
        }

        @Override // tb.k5g
        public void onVideoStart() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c2b2d56d", new Object[]{this});
            } else {
                this.f17595a.onVideoStart();
            }
        }
    }

    static {
        t2o.a(468714515);
        t2o.a(468714512);
    }

    public d5g(qic qicVar, i5g i5gVar, EngineModel engineModel) {
        boolean z;
        boolean z2;
        MediaModel mediaModel;
        MediaModel mediaModel2;
        MediaModel mediaModel3;
        boolean z3 = false;
        this.b = qicVar;
        this.c = i5gVar;
        qicVar.A(new a());
        if (qicVar.a() != null) {
            qicVar.a().setTag(R.id.fluid_sdk_tag_is_video_view, Boolean.TRUE);
        }
        long currentTimeMillis = System.currentTimeMillis();
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put(atb.EXP_KEY_FULL_PAGE_DW_CREATE_TS, String.valueOf(currentTimeMillis));
        if (engineModel == null || (mediaModel3 = engineModel.mediaModel) == null || TextUtils.isEmpty(mediaModel3.videoId)) {
            z = false;
        } else {
            z = true;
        }
        hashMap.put(atb.EXP_KEY_FULL_PAGE_DW_HAS_VIDEO_ID, String.valueOf(z));
        if (engineModel == null || (mediaModel2 = engineModel.mediaModel) == null || TextUtils.isEmpty(mediaModel2.videoUrl)) {
            z2 = false;
        } else {
            z2 = true;
        }
        hashMap.put(atb.EXP_KEY_FULL_PAGE_DW_HAS_VIDEO_URL, String.valueOf(z2));
        if (!(engineModel == null || (mediaModel = engineModel.mediaModel) == null || mediaModel.videoResourceObj == null)) {
            z3 = true;
        }
        hashMap.put(atb.EXP_KEY_FULL_PAGE_DW_HAS_VIDEO_RES, String.valueOf(z3));
        c(hashMap);
    }

    public static /* synthetic */ eub F(d5g d5gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (eub) ipChange.ipc$dispatch("5d1c2016", new Object[]{d5gVar});
        }
        return d5gVar.d;
    }

    public static /* synthetic */ boolean r(d5g d5gVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9f7c1090", new Object[]{d5gVar, new Boolean(z)})).booleanValue();
        }
        d5gVar.f17593a = z;
        return z;
    }

    @Override // tb.atb
    public void A(eub eubVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21c5800a", new Object[]{this, eubVar});
        } else {
            this.d = eubVar;
        }
    }

    @Override // tb.atb
    public boolean B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b9d9d686", new Object[]{this})).booleanValue();
        }
        return this.f17593a;
    }

    @Override // tb.atb
    public void C(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe738b19", new Object[]{this, new Boolean(z)});
        } else {
            this.e = z;
        }
    }

    @Override // tb.atb
    public void D(ytb ytbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd04dc4a", new Object[]{this, ytbVar});
        } else if (ytbVar != null) {
            this.c.o(new b(ytbVar));
        }
    }

    @Override // tb.atb
    public boolean E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("62e32b57", new Object[]{this})).booleanValue();
        }
        return this.e;
    }

    public void G(String... strArr) {
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
        qic qicVar = this.b;
        if (qicVar != null) {
            qicVar.close();
        }
    }

    @Override // tb.atb
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d91abe26", new Object[]{this});
        } else {
            this.b.b();
        }
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
        this.b.c(hashMap);
    }

    @Override // tb.atb
    public void d(qtb qtbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb970df4", new Object[]{this, qtbVar});
        } else {
            this.b.d(qtbVar);
        }
    }

    @Override // tb.atb
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        G(atb.EXP_KEY_FULL_PAGE_DW_DESTROY_TS, String.valueOf(System.currentTimeMillis()));
        this.b.destroy();
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
        this.b.w(hashMap);
    }

    @Override // tb.atb
    public void f(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2487bd12", new Object[]{this, new Integer(i), new Integer(i2)});
        } else {
            this.b.C(i, i2);
        }
    }

    @Override // tb.atb
    public void g(dub dubVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f202f393", new Object[]{this, dubVar});
        } else {
            this.b.g(dubVar);
        }
    }

    @Override // tb.atb
    public long getDuration() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ed837a85", new Object[]{this})).longValue();
        }
        return this.b.f();
    }

    @Override // tb.atb
    public int getVideoState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("85134b46", new Object[]{this})).intValue();
        }
        return this.b.getVideoState();
    }

    @Override // tb.atb
    public ViewGroup getView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("cbb4b1b3", new Object[]{this});
        }
        return (ViewGroup) this.b.a();
    }

    @Override // tb.atb
    public Bitmap h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("900dd4f", new Object[]{this});
        }
        return this.b.h();
    }

    @Override // tb.atb
    public void i(DWInstanceType dWInstanceType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a28ef3f", new Object[]{this, dWInstanceType});
        } else {
            this.b.i(dWInstanceType);
        }
    }

    @Override // tb.atb
    public void j(aub aubVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c9a1d45", new Object[]{this, aubVar});
        } else {
            this.b.j(aubVar);
        }
    }

    @Override // tb.atb
    public void k(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aececba2", new Object[]{this, new Integer(i)});
        } else {
            this.b.k(i);
        }
    }

    @Override // tb.atb
    public void l(nj9 nj9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2ed34d3", new Object[]{this, nj9Var});
        } else {
            this.b.l(nj9Var);
        }
    }

    @Override // tb.atb
    public void m(float f, float f2, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12f6043f", new Object[]{this, new Float(f), new Float(f2), new Integer(i), new Integer(i2)});
        } else {
            this.b.m(f, f2, i, i2);
        }
    }

    @Override // tb.atb
    public void mute(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4254d4b4", new Object[]{this, new Boolean(z)});
        } else {
            this.b.setMute(z);
        }
    }

    @Override // tb.atb
    public void n(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5cac726", new Object[]{this, new Boolean(z)});
        } else {
            this.b.n(z);
        }
    }

    @Override // tb.atb
    public Map<String, String> o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("438347ba", new Object[]{this});
        }
        return this.b.o();
    }

    @Override // tb.atb
    public void p(HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30bcd334", new Object[]{this, hashMap});
        } else if (hashMap != null && !hashMap.isEmpty()) {
            this.b.p(hashMap);
        }
    }

    @Override // tb.atb
    public void pauseVideo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf67322c", new Object[]{this});
        } else {
            this.b.pause();
        }
    }

    @Override // tb.atb
    public void playVideo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4075d2ae", new Object[]{this});
        } else {
            this.b.play();
        }
    }

    @Override // tb.atb
    public void prepareToFirstFrame() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f50cd26", new Object[]{this});
            return;
        }
        G(atb.EXP_KEY_FULL_PAGE_DW_P2FF_TS, String.valueOf(System.currentTimeMillis()));
        this.b.prepareToFirstFrame();
    }

    @Override // tb.atb
    public void q(String str, boolean z, HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27a4ec07", new Object[]{this, str, new Boolean(z), hashMap});
        } else {
            this.b.q(str, z, hashMap);
        }
    }

    @Override // tb.atb
    public void s(ImageView imageView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab315d39", new Object[]{this, imageView});
        } else {
            this.b.s(imageView);
        }
    }

    @Override // tb.atb
    public void seekTo(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49645829", new Object[]{this, new Integer(i)});
        } else {
            this.b.seekTo(i);
        }
    }

    @Override // tb.atb
    public void setBizCode(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d29306ef", new Object[]{this, str});
        } else {
            this.b.setBizCode(str);
        }
    }

    @Override // tb.atb
    public void setPlayRate(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b5e4523", new Object[]{this, new Float(f)});
        } else {
            this.b.D(f);
        }
    }

    @Override // tb.atb
    public void setVideoLoop(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("127f99d0", new Object[]{this, new Boolean(z)});
        } else {
            this.b.setLooping(z);
        }
    }

    @Override // tb.atb
    public void setVolume(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3942a77d", new Object[]{this, new Float(f)});
        } else {
            this.b.setVolume(f);
        }
    }

    @Override // tb.atb
    public void start() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810347e9", new Object[]{this});
            return;
        }
        G(atb.EXP_KEY_FULL_PAGE_DW_START_TS, String.valueOf(System.currentTimeMillis()));
        this.b.start();
    }

    @Override // tb.atb
    public String t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("22b0754e", new Object[]{this});
        }
        return this.b.t();
    }

    @Override // tb.atb
    public void u(MediaLiveWarmupConfig mediaLiveWarmupConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36dfca00", new Object[]{this, mediaLiveWarmupConfig});
        } else {
            this.b.u(mediaLiveWarmupConfig);
        }
    }

    @Override // tb.atb
    public void v(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ffa5ae66", new Object[]{this, map});
        } else if (map != null && !map.isEmpty()) {
            this.b.v(map);
        }
    }

    @Override // tb.atb
    public void w(int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbdf700a", new Object[]{this, new Integer(i), new Boolean(z)});
        } else {
            this.b.B(i, z);
        }
    }

    @Override // tb.atb
    public jgi x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jgi) ipChange.ipc$dispatch("8b32bcbe", new Object[]{this});
        }
        return this.b.x();
    }

    @Override // tb.atb
    public boolean y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5b343e7c", new Object[]{this})).booleanValue();
        }
        return this.b.y();
    }

    @Override // tb.atb
    public void z(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41f22ae", new Object[]{this, new Boolean(z)});
        } else if (z && !this.f) {
            this.f = true;
            ir9.b("KirinDWInstanceProxy", "controlAudioFocus: 获取音频焦点:" + z);
            this.b.z(z);
        } else if (z) {
            ir9.b("KirinDWInstanceProxy", "controlAudioFocus: 已经获取过音频焦点了:" + z);
        } else {
            this.f = false;
            ir9.b("KirinDWInstanceProxy", "controlAudioFocus: 释放音频焦点:" + z);
            this.b.z(z);
        }
    }
}
