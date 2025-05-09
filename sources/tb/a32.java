package tb;

import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.sdk.editor.data.AiQuality;
import com.taobao.android.litecreator.sdk.editor.data.Cut;
import com.taobao.android.litecreator.sdk.editor.data.EditorInfo;
import com.taobao.android.litecreator.sdk.editor.data.Filter;
import com.taobao.android.litecreator.sdk.editor.data.Music;
import com.taobao.android.litecreator.sdk.editor.data.Paster;
import com.taobao.android.litecreator.sdk.editor.data.RichLabel;
import com.taobao.android.litecreator.sdk.editor.data.Sticker;
import com.taobao.android.litecreator.sdk.editor.data.Video;
import com.taobao.android.litecreator.sdk.editor.data.VideoEditInfo;
import com.taobao.android.litecreator.sdk.editor.data.Volume;
import com.taobao.android.litecreator.sdk.editor.data.base.Beauty;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public abstract class a32 implements v8e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Video f15521a;
    public final List<Video> b;
    public bjc c;
    public srb d;
    public y6c e;
    public fxc f;
    public sae g;
    public xsd h;
    public x7d i;
    public ueb j;
    public xib k;
    public final HashMap<Object, p1c> l = new HashMap<>();
    public final Stack<u1c> m = new Stack<>();
    public VideoEditInfo n;
    public VideoEditInfo o;
    public long p;

    static {
        t2o.a(511705331);
        t2o.a(511705368);
    }

    public a32(Video video, VideoEditInfo videoEditInfo) {
        this.f15521a = video;
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        arrayList.add(video);
        w0();
        x0(videoEditInfo);
    }

    @Override // tb.bjc
    public List<RichLabel> C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("889b35cb", new Object[]{this});
        }
        return this.c.C();
    }

    @Override // tb.u1c
    public /* synthetic */ p1c D() {
        return null;
    }

    @Override // tb.bjc
    public void E(RichLabel richLabel, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("141f4afe", new Object[]{this, richLabel, new Integer(i)});
            return;
        }
        this.m.push(this.c);
        this.c.E(richLabel, i);
    }

    @Override // tb.x7d
    public void H(Paster paster, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bbae4cc", new Object[]{this, paster, new Integer(i)});
        } else {
            this.i.H(paster, i);
        }
    }

    @Override // tb.ueb
    public AiQuality I() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AiQuality) ipChange.ipc$dispatch("4910c222", new Object[]{this});
        }
        return this.j.I();
    }

    @Override // tb.srb
    public void K(Cut cut) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db23ad30", new Object[]{this, cut});
            return;
        }
        this.m.push(this.d);
        this.d.K(cut);
    }

    @Override // tb.bjc
    public void L(RichLabel richLabel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3400dcd", new Object[]{this, richLabel});
            return;
        }
        this.m.push(this.c);
        this.c.L(richLabel);
    }

    @Override // tb.y6c
    public void N() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7571aa2c", new Object[]{this});
            return;
        }
        this.m.push(this.e);
        this.e.N();
    }

    @Override // tb.srb
    public Cut O() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Cut) ipChange.ipc$dispatch("2424227e", new Object[]{this});
        }
        return this.d.O();
    }

    @Override // tb.x7d
    public void P(List<Paster> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92004a64", new Object[]{this, list});
        } else {
            this.i.P(list);
        }
    }

    @Override // tb.x7d
    public void R(Paster paster) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc752c3f", new Object[]{this, paster});
        } else {
            this.i.R(paster);
        }
    }

    @Override // tb.fxc
    public void S(Music music) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df83c290", new Object[]{this, music});
            return;
        }
        this.m.push(this.f);
        this.f.S(music);
    }

    @Override // tb.fxc
    public Music W() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Music) ipChange.ipc$dispatch("7b827cc6", new Object[]{this});
        }
        return this.f.W();
    }

    @Override // tb.x7d
    public List<Paster> X() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("75448117", new Object[]{this});
        }
        return this.i.X();
    }

    @Override // tb.ueb
    public void a0(AiQuality aiQuality) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71b31050", new Object[]{this, aiQuality});
        } else {
            this.j.a0(aiQuality);
        }
    }

    @Override // tb.prc
    public <T> void b(q2d<T> q2dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67c5163", new Object[]{this, q2dVar});
            return;
        }
        p1c<T> v0 = v0(q2dVar);
        if (v0 != null) {
            v0.b(q2dVar);
        }
    }

    @Override // tb.bjc
    public void b0(RichLabel richLabel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5810f70a", new Object[]{this, richLabel});
            return;
        }
        this.m.push(this.c);
        this.c.b0(richLabel);
    }

    @Override // tb.prc
    public <T> void c(q2d<T> q2dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c455f526", new Object[]{this, q2dVar});
            return;
        }
        p1c<T> v0 = v0(q2dVar);
        if (v0 != null) {
            v0.c(q2dVar);
        }
    }

    @Override // tb.xsd
    public Sticker d0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Sticker) ipChange.ipc$dispatch("cf7b9116", new Object[]{this});
        }
        return this.h.d0();
    }

    @Override // tb.xib
    public void e0(Beauty beauty) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73fdddb6", new Object[]{this, beauty});
        } else {
            this.k.e0(beauty);
        }
    }

    @Override // tb.fxc
    public void g0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c31f085f", new Object[]{this});
        } else {
            this.f.g0();
        }
    }

    @Override // tb.y6c
    public Filter getFilter() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Filter) ipChange.ipc$dispatch("e77accf2", new Object[]{this});
        }
        return this.e.getFilter();
    }

    @Override // tb.v8e
    public List<Video> getVideos() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("4cb8c1d2", new Object[]{this});
        }
        return this.b;
    }

    @Override // tb.sae
    public Volume getVolume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Volume) ipChange.ipc$dispatch("ece212b2", new Object[]{this});
        }
        return this.g.getVolume();
    }

    @Override // tb.v8e
    public VideoEditInfo k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (VideoEditInfo) ipChange.ipc$dispatch("e92eb53b", new Object[]{this});
        }
        return this.n;
    }

    @Override // tb.y6c
    public void l(Filter filter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d9d2bec", new Object[]{this, filter});
            return;
        }
        this.m.push(this.e);
        this.e.l(filter);
    }

    @Override // tb.xib
    public Beauty n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Beauty) ipChange.ipc$dispatch("d9f08c6e", new Object[]{this});
        }
        return this.k.n();
    }

    @Override // tb.x7d
    public void q(Paster paster) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91f940bc", new Object[]{this, paster});
        } else {
            this.i.q(paster);
        }
    }

    @Override // tb.ueb
    public void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4a27f71", new Object[]{this});
        } else {
            this.j.r();
        }
    }

    public final void r0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7914bc38", new Object[]{this});
            return;
        }
        s0(this.c);
        s0(this.e);
        s0(this.d);
        s0(this.f);
        s0(this.g);
        s0(this.h);
        s0(this.i);
        s0(this.j);
        s0(this.k);
    }

    public final void s0(u1c u1cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("334df9fb", new Object[]{this, u1cVar});
        } else if (u1cVar instanceof hu1) {
            p1c D = ((hu1) u1cVar).D();
            Class u0 = u0(u1cVar.getClass().getGenericSuperclass());
            if (u0 != null) {
                this.l.put(u0, D);
            }
        }
    }

    public final void t0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2e99f91", new Object[]{this});
            return;
        }
        this.e = (y6c) b88.a(wh9.class);
        this.c = (bjc) b88.a(nfg.class);
        this.d = (srb) b88.a(s25.class);
        this.f = (fxc) b88.a(vcj.class);
        this.g = (sae) b88.a(jow.class);
        this.h = (xsd) b88.a(wmq.class);
        this.i = (x7d) b88.a(mtl.class);
        this.j = (ueb) b88.a(si0.class);
        this.k = (xib) b88.a(l62.class);
    }

    @Override // tb.x7d
    public List<Paster> u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("72734642", new Object[]{this});
        }
        return this.i.u();
    }

    public final Class u0(Type type) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("3895ee34", new Object[]{this, type});
        }
        if (type instanceof Class) {
            return (Class) type;
        }
        if (!(type instanceof ParameterizedType)) {
            return null;
        }
        ParameterizedType parameterizedType = (ParameterizedType) type;
        if (parameterizedType.getActualTypeArguments().length > 0) {
            return u0(parameterizedType.getActualTypeArguments()[0]);
        }
        return null;
    }

    public final <T> p1c<T> v0(q2d<T> q2dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (p1c) ipChange.ipc$dispatch("7be60d06", new Object[]{this, q2dVar});
        }
        p1c<T> p1cVar = this.l.get(u0(q2dVar.getClass().getGenericInterfaces()[0]));
        if (p1cVar == null) {
            return null;
        }
        return p1cVar;
    }

    @Override // tb.sae
    public void w(Volume volume) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f428c28", new Object[]{this, volume});
            return;
        }
        this.m.push(this.g);
        this.g.w(volume);
    }

    public final void w0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        t0();
        r0();
    }

    public void x0(VideoEditInfo videoEditInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9b78065", new Object[]{this, videoEditInfo});
            return;
        }
        this.n = (VideoEditInfo) JSON.parseObject(JSON.toJSONString(videoEditInfo), VideoEditInfo.class);
        if (videoEditInfo != null) {
            if (videoEditInfo.filter != null) {
                this.l.get(Filter.class).set(videoEditInfo.filter);
            }
            if (videoEditInfo.labels != null) {
                this.l.get(RichLabel.class).set(videoEditInfo.labels);
            }
            if (videoEditInfo.cut != null) {
                this.l.get(Cut.class).set(videoEditInfo.cut);
            }
            if (videoEditInfo.music != null) {
                this.l.get(Music.class).set(videoEditInfo.music);
            }
            if (videoEditInfo.volume != null) {
                this.l.get(Volume.class).set(videoEditInfo.volume);
            }
            if (videoEditInfo.sticker != null) {
                this.l.get(Sticker.class).set(videoEditInfo.sticker);
            }
            if (videoEditInfo.pasters != null) {
                this.l.get(Paster.class).set(videoEditInfo.pasters);
            }
            if (videoEditInfo.aiQuality != null) {
                this.l.get(AiQuality.class).set(videoEditInfo.aiQuality);
            }
            if (videoEditInfo.beauty != null) {
                this.l.get(Beauty.class).set(videoEditInfo.beauty);
            }
        }
    }

    @Override // tb.v8e
    public Video y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Video) ipChange.ipc$dispatch("e97f9a", new Object[]{this});
        }
        return this.f15521a;
    }

    public void y0(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63b55e7f", new Object[]{this, new Long(j)});
        } else {
            this.p = j;
        }
    }

    @Override // tb.v8e, tb.prc
    public VideoEditInfo a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (VideoEditInfo) ipChange.ipc$dispatch("c1017e39", new Object[]{this});
        }
        VideoEditInfo videoEditInfo = this.o;
        if (videoEditInfo == null) {
            videoEditInfo = new VideoEditInfo();
        }
        videoEditInfo.cut = O();
        videoEditInfo.filter = getFilter();
        videoEditInfo.labels = C();
        videoEditInfo.music = W();
        videoEditInfo.volume = getVolume();
        videoEditInfo.sticker = d0();
        videoEditInfo.pasters = u();
        videoEditInfo.video = y();
        videoEditInfo.medias = getVideos();
        videoEditInfo.aiQuality = I();
        videoEditInfo.beauty = n();
        videoEditInfo.videoOriginDurationUs = this.p;
        this.o = videoEditInfo;
        return videoEditInfo;
    }

    public a32(List<Video> list, EditorInfo editorInfo) {
        this.b = list;
        this.f15521a = list.get(0);
        w0();
    }

    @Override // tb.prc
    public /* synthetic */ void e(Video video) {
    }
}
