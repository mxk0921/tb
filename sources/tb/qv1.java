package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.sdk.editor.data.Adjust;
import com.taobao.android.litecreator.sdk.editor.data.AiQuality;
import com.taobao.android.litecreator.sdk.editor.data.Crop;
import com.taobao.android.litecreator.sdk.editor.data.Filter;
import com.taobao.android.litecreator.sdk.editor.data.Image;
import com.taobao.android.litecreator.sdk.editor.data.ImageEditInfo;
import com.taobao.android.litecreator.sdk.editor.data.Music;
import com.taobao.android.litecreator.sdk.editor.data.Paster;
import com.taobao.android.litecreator.sdk.editor.data.Resource;
import com.taobao.android.litecreator.sdk.editor.data.RichLabel;
import com.taobao.android.litecreator.sdk.editor.data.TemplateInfo;
import com.taobao.android.litecreator.sdk.editor.data.Volume;
import com.taobao.android.litecreator.sdk.editor.data.base.Beauty;
import com.taobao.android.litecreator.sdk.editor.data.base.EditableBean;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public abstract class qv1 implements ydc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public boolean f26946a;
    public Image b;
    public final yke c;
    @Inject
    public bjc d;
    @Inject
    public prb e;
    @Inject
    public x7d f;
    @Inject
    public y6c g;
    @Inject
    public ueb h;
    @Inject
    public fxc i;
    @Inject
    public sae j;
    @Inject
    public fyp k;
    @Inject
    public xib l;
    @Inject
    public qeb m;
    public final Map<Class<? extends EditableBean>, u1c> n = new HashMap();
    @Inject
    public uzd o;
    public TemplateInfo p;

    static {
        t2o.a(511705329);
        t2o.a(511705359);
    }

    public qv1(yke ykeVar, Image image, ImageEditInfo imageEditInfo) {
        TemplateInfo templateInfo;
        this.c = ykeVar;
        this.b = image;
        if (imageEditInfo != null) {
            templateInfo = imageEditInfo.templateInfo;
        } else {
            templateInfo = null;
        }
        this.p = templateInfo;
        this.f26946a = g(imageEditInfo);
        J();
        i0(imageEditInfo);
    }

    @Override // tb.qeb
    public Adjust A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Adjust) ipChange.ipc$dispatch("a43eb512", new Object[]{this});
        }
        return this.m.A();
    }

    @Override // tb.ydc
    public boolean B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("910c0892", new Object[]{this})).booleanValue();
        }
        return this.f26946a;
    }

    @Override // tb.bjc
    public List<RichLabel> C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("889b35cb", new Object[]{this});
        }
        return this.d.C();
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
        } else {
            this.d.E(richLabel, i);
        }
    }

    /* renamed from: G */
    public Image l0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Image) ipChange.ipc$dispatch("58c90771", new Object[]{this});
        }
        return this.b;
    }

    @Override // tb.x7d
    public void H(Paster paster, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bbae4cc", new Object[]{this, paster, new Integer(i)});
        } else {
            this.f.H(paster, i);
        }
    }

    @Override // tb.ueb
    public AiQuality I() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AiQuality) ipChange.ipc$dispatch("4910c222", new Object[]{this});
        }
        return this.h.I();
    }

    public final void J() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3612d7dc", new Object[]{this});
            return;
        }
        yke ykeVar = this.c;
        if (ykeVar != null) {
            ykeVar.a(this);
        } else {
            go6.c().a(this);
        }
        this.n.put(RichLabel.class, this.d);
        this.n.put(Crop.class, this.e);
        this.n.put(Paster.class, this.f);
        this.n.put(Filter.class, this.g);
        this.n.put(AiQuality.class, this.h);
        this.n.put(Music.class, this.i);
        this.n.put(Volume.class, this.j);
        this.n.put(TemplateInfo.class, this.o);
        this.n.put(Beauty.class, this.l);
        this.n.put(Adjust.class, this.m);
    }

    @Override // tb.bjc
    public void L(RichLabel richLabel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3400dcd", new Object[]{this, richLabel});
        } else {
            this.d.L(richLabel);
        }
    }

    @Override // tb.y6c
    public void N() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7571aa2c", new Object[]{this});
        } else {
            this.g.N();
        }
    }

    @Override // tb.x7d
    public void P(List<Paster> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92004a64", new Object[]{this, list});
        } else {
            this.f.P(list);
        }
    }

    @Override // tb.qeb
    public void Q(Adjust adjust) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28830dfe", new Object[]{this, adjust});
        } else {
            this.m.Q(adjust);
        }
    }

    @Override // tb.x7d
    public void R(Paster paster) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc752c3f", new Object[]{this, paster});
        } else {
            this.f.R(paster);
        }
    }

    @Override // tb.fxc
    public void S(Music music) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df83c290", new Object[]{this, music});
        } else {
            this.i.S(music);
        }
    }

    @Override // tb.fxc
    public Music W() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Music) ipChange.ipc$dispatch("7b827cc6", new Object[]{this});
        }
        return this.i.W();
    }

    @Override // tb.x7d
    public List<Paster> X() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("75448117", new Object[]{this});
        }
        return this.f.X();
    }

    @Override // tb.ueb
    public void a0(AiQuality aiQuality) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71b31050", new Object[]{this, aiQuality});
        } else {
            this.h.a0(aiQuality);
        }
    }

    @Override // tb.prc
    public <T> void b(q2d<T> q2dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67c5163", new Object[]{this, q2dVar});
            return;
        }
        p1c<T> p = p(q2dVar);
        if (p != null) {
            p.b(q2dVar);
        }
    }

    @Override // tb.bjc
    public void b0(RichLabel richLabel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5810f70a", new Object[]{this, richLabel});
        } else {
            this.d.b0(richLabel);
        }
    }

    @Override // tb.prc
    public <T> void c(q2d<T> q2dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c455f526", new Object[]{this, q2dVar});
            return;
        }
        p1c<T> p = p(q2dVar);
        if (p != null) {
            p.c(q2dVar);
        }
    }

    public void d(Image image) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d8d14dc", new Object[]{this, image});
        }
    }

    @Override // tb.xib
    public void e0(Beauty beauty) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73fdddb6", new Object[]{this, beauty});
        } else {
            this.l.e0(beauty);
        }
    }

    @Override // tb.uzd
    public TemplateInfo f0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TemplateInfo) ipChange.ipc$dispatch("3c4f7732", new Object[]{this});
        }
        return this.o.f0();
    }

    @Override // tb.fxc
    public void g0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c31f085f", new Object[]{this});
        } else {
            this.i.g0();
        }
    }

    @Override // tb.y6c
    public Filter getFilter() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Filter) ipChange.ipc$dispatch("e77accf2", new Object[]{this});
        }
        return this.g.getFilter();
    }

    @Override // tb.sae
    public Volume getVolume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Volume) ipChange.ipc$dispatch("ece212b2", new Object[]{this});
        }
        return this.j.getVolume();
    }

    public final void i0(ImageEditInfo imageEditInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f71e6b7", new Object[]{this, imageEditInfo});
        } else if (imageEditInfo != null) {
            if (!B()) {
                this.g.D().set(imageEditInfo.filter);
                this.f.D().set(imageEditInfo.pasters);
                this.d.D().set(imageEditInfo.labels);
                this.e.D().set(imageEditInfo.crop);
                this.h.D().set(imageEditInfo.aiQuality);
                this.i.D().set(imageEditInfo.music);
                this.l.D().set(imageEditInfo.beauty);
                this.m.D().set(imageEditInfo.adjust);
                return;
            }
            this.o.D().set(imageEditInfo.templateInfo);
            List<Paster> list = imageEditInfo.pasters;
            ArrayList arrayList = new ArrayList();
            if (list != null) {
                for (Paster paster : list) {
                    if (paster.isInTemplate) {
                        arrayList.add(paster);
                    } else {
                        paster.isInDraft = true;
                    }
                }
                list.removeAll(arrayList);
            }
            this.f.D().set(imageEditInfo.pasters);
            Filter filter = imageEditInfo.filter;
            if (filter != null) {
                filter.isInDraft = true;
            }
            this.g.D().set(imageEditInfo.filter);
            AiQuality aiQuality = imageEditInfo.aiQuality;
            if (aiQuality != null) {
                aiQuality.isInDraft = true;
            }
            this.h.D().set(imageEditInfo.aiQuality);
            this.d.D().set(imageEditInfo.labels);
            this.e.D().set(imageEditInfo.crop);
            this.i.D().set(imageEditInfo.music);
            this.l.D().set(imageEditInfo.beauty);
            this.m.D().set(imageEditInfo.adjust);
        }
    }

    @Override // tb.uzd
    public void j(TemplateInfo templateInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9af2aecc", new Object[]{this, templateInfo});
        } else {
            this.o.j(templateInfo);
        }
    }

    @Override // tb.prb
    public void k0(Crop crop) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79a0d03c", new Object[]{this, crop});
        } else {
            this.e.k0(crop);
        }
    }

    @Override // tb.y6c
    public void l(Filter filter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d9d2bec", new Object[]{this, filter});
        } else {
            this.g.l(filter);
        }
    }

    @Override // tb.xib
    public Beauty n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Beauty) ipChange.ipc$dispatch("d9f08c6e", new Object[]{this});
        }
        return this.l.n();
    }

    @Override // tb.prb
    public Crop n0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Crop) ipChange.ipc$dispatch("a88af100", new Object[]{this});
        }
        return this.e.n0();
    }

    public final <T> p1c<T> p(q2d<T> q2dVar) {
        p1c<T> p1cVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (p1c) ipChange.ipc$dispatch("7be60d06", new Object[]{this, q2dVar});
        }
        u1c u1cVar = this.n.get(y88.a(q2dVar.getClass().getGenericInterfaces()[0]));
        if (u1cVar != null) {
            p1cVar = u1cVar.D();
        } else {
            p1cVar = null;
        }
        if (p1cVar == null) {
            return null;
        }
        return p1cVar;
    }

    @Override // tb.x7d
    public void q(Paster paster) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91f940bc", new Object[]{this, paster});
        } else {
            this.f.q(paster);
        }
    }

    /* renamed from: q0 */
    public void e(Image image) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27c3b899", new Object[]{this, image});
            return;
        }
        this.b = image;
        d(image);
    }

    @Override // tb.ueb
    public void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4a27f71", new Object[]{this});
        } else {
            this.h.r();
        }
    }

    @Override // tb.prc
    public /* synthetic */ List<Image> s() {
        return nrc.a(this);
    }

    @Override // tb.x7d
    public List<Paster> u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("72734642", new Object[]{this});
        }
        return this.f.u();
    }

    @Override // tb.sae
    public void w(Volume volume) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f428c28", new Object[]{this, volume});
        } else {
            this.j.w(volume);
        }
    }

    public void z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("704b93c", new Object[]{this});
        } else {
            this.o.z();
        }
    }

    @Override // tb.ydc, tb.prc
    public ImageEditInfo a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ImageEditInfo) ipChange.ipc$dispatch("8aa06559", new Object[]{this});
        }
        ImageEditInfo imageEditInfo = new ImageEditInfo();
        imageEditInfo.crop = n0();
        imageEditInfo.filter = getFilter();
        imageEditInfo.labels = C();
        imageEditInfo.pasters = u();
        imageEditInfo.aiQuality = I();
        imageEditInfo.music = W();
        imageEditInfo.volume = getVolume();
        imageEditInfo.templateInfo = f0();
        imageEditInfo.beauty = n();
        imageEditInfo.adjust = A();
        return imageEditInfo;
    }

    public final boolean g(ImageEditInfo imageEditInfo) {
        TemplateInfo templateInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2ac85c25", new Object[]{this, imageEditInfo})).booleanValue();
        }
        return imageEditInfo != null && (templateInfo = imageEditInfo.templateInfo) != null && cg9.l(templateInfo.draftPath) && (TextUtils.equals(imageEditInfo.templateInfo.resourceType, Resource.TYPE_TEMPLATE_IMG) || TextUtils.equals(imageEditInfo.templateInfo.resourceType, Resource.TYPE_TEMPLATE_TEXT_IMAGE));
    }
}
