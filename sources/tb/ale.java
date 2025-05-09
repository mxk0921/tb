package tb;

import android.content.res.Resources;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.Size;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import com.alibaba.marvel.Const;
import com.alibaba.marvel.MeEditor;
import com.alibaba.marvel.Project;
import com.alibaba.marvel.TemplateEditor;
import com.alibaba.marvel.Viewer;
import com.alibaba.marvel.java.OnFirstFrameListener;
import com.alibaba.marvel.java.ResourceInspector;
import com.alibaba.marvel.java.ScaleType;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.base.data.ImageBean;
import com.taobao.android.litecreator.sdk.editor.data.Adjust;
import com.taobao.android.litecreator.sdk.editor.data.AiQuality;
import com.taobao.android.litecreator.sdk.editor.data.Crop;
import com.taobao.android.litecreator.sdk.editor.data.Filter;
import com.taobao.android.litecreator.sdk.editor.data.Image;
import com.taobao.android.litecreator.sdk.editor.data.ImageEditInfo;
import com.taobao.android.litecreator.sdk.editor.data.Music;
import com.taobao.android.litecreator.sdk.editor.data.Paster;
import com.taobao.android.litecreator.sdk.editor.data.Resource;
import com.taobao.android.litecreator.sdk.editor.data.TemplateInfo;
import com.taobao.android.litecreator.sdk.editor.data.Transform;
import com.taobao.android.litecreator.sdk.editor.data.base.Beauty;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import tb.b9e;
import tb.ltl;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ale extends qv1 implements tqc {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long IMAGE_CLIP_DURATION_US = 3000000;
    public final q2d<Crop> A;
    public final q2d<AiQuality> B;
    public final q2d<List<Paster>> C;
    public final q2d<Music> D;
    public final q2d<Beauty> E;
    public final q2d<Adjust> F;
    public final q2d<TemplateInfo> G;
    public String H;
    public int I;
    public x4 J;
    public v62 K;
    public iie L;
    public final ArrayList<String> M;
    public final ltl.a N;
    public final ltl O;
    public TemplateEditor P;
    public boolean Q;
    public final ResourceInspector R;
    public final Size q;
    public SurfaceView r;
    public final uqc s;
    public Project t;
    public Project u;
    public MeEditor v;
    public Viewer w;
    public Rect x;
    public b9e.b y;
    public final q2d<Filter> z;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a extends vmq {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(ale aleVar, tqc tqcVar) {
            super(tqcVar);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/litecreator/sdk/editor/ImageEditorV2$10");
        }

        @Override // tb.vmq
        public long A() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("e13e9bc3", new Object[]{this})).longValue();
            }
            return ale.IMAGE_CLIP_DURATION_US;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements OnFirstFrameListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        public void onDraw() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("73be92ca", new Object[]{this});
            } else if (ale.z0(ale.this) != null) {
                ale.z0(ale.this).a(-1L);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class c implements q2d<Filter> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // tb.q2d
        public void a(p1c<Filter> p1cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("189432f6", new Object[]{this, p1cVar});
            } else {
                ale.r0(ale.this, p1cVar.get());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class d implements q2d<Crop> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // tb.q2d
        public void a(p1c<Crop> p1cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("189432f6", new Object[]{this, p1cVar});
            } else {
                ale.s0(ale.this, p1cVar.get());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class e implements q2d<AiQuality> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e() {
        }

        @Override // tb.q2d
        public void a(p1c<AiQuality> p1cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("189432f6", new Object[]{this, p1cVar});
            } else {
                ale.t0(ale.this, p1cVar.get());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class f implements q2d<List<Paster>> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public f() {
        }

        @Override // tb.q2d
        public void a(p1c<List<Paster>> p1cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("189432f6", new Object[]{this, p1cVar});
            } else {
                ale.u0(ale.this, p1cVar.get());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class g implements q2d<Music> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public g() {
        }

        @Override // tb.q2d
        public void a(p1c<Music> p1cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("189432f6", new Object[]{this, p1cVar});
            } else {
                ale.v0(ale.this, p1cVar.get());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class h implements q2d<Beauty> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public h() {
        }

        @Override // tb.q2d
        public void a(p1c<Beauty> p1cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("189432f6", new Object[]{this, p1cVar});
            } else {
                ale.w0(ale.this, p1cVar.get());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class i implements q2d<Adjust> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public i() {
        }

        @Override // tb.q2d
        public void a(p1c<Adjust> p1cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("189432f6", new Object[]{this, p1cVar});
            } else {
                ale.x0(ale.this, p1cVar.get());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class j implements q2d<TemplateInfo> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public j() {
        }

        @Override // tb.q2d
        public void a(p1c<TemplateInfo> p1cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("189432f6", new Object[]{this, p1cVar});
            } else {
                ale.y0(ale.this, p1cVar.get());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class k implements ResourceInspector {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public k(ale aleVar) {
        }

        public ResourceInspector.Ret onResourceInspect(Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ResourceInspector.Ret) ipChange.ipc$dispatch("bea897c0", new Object[]{this, map});
            }
            com.taobao.android.litecreator.modules.template.b.f(map);
            return ResourceInspector.Ret.Pass;
        }
    }

    static {
        t2o.a(511705377);
        t2o.a(511705473);
    }

    public ale(uqc uqcVar, yke ykeVar, Image image, ImageEditInfo imageEditInfo) {
        this(uqcVar, ykeVar, image, null, imageEditInfo);
    }

    public static /* synthetic */ Object ipc$super(ale aleVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1969199783) {
            return super.a();
        }
        if (hashCode == 117750076) {
            super.z();
            return null;
        }
        int hashCode2 = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/litecreator/sdk/editor/ImageEditorV2");
    }

    public static /* synthetic */ void r0(ale aleVar, Filter filter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3376de1e", new Object[]{aleVar, filter});
        } else {
            aleVar.d1(filter);
        }
    }

    public static /* synthetic */ void s0(ale aleVar, Crop crop) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5fc7bd07", new Object[]{aleVar, crop});
        } else {
            aleVar.C0(crop);
        }
    }

    public static /* synthetic */ void t0(ale aleVar, AiQuality aiQuality) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b5f0d61", new Object[]{aleVar, aiQuality});
        } else {
            aleVar.A0(aiQuality);
        }
    }

    public static /* synthetic */ void u0(ale aleVar, List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a31bb09d", new Object[]{aleVar, list});
        } else {
            aleVar.G0(list);
        }
    }

    public static /* synthetic */ void v0(ale aleVar, Music music) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28769571", new Object[]{aleVar, music});
        } else {
            aleVar.F0(music);
        }
    }

    public static /* synthetic */ void w0(ale aleVar, Beauty beauty) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b8f369b", new Object[]{aleVar, beauty});
        } else {
            aleVar.B0(beauty);
        }
    }

    public static /* synthetic */ void x0(ale aleVar, Adjust adjust) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa24362d", new Object[]{aleVar, adjust});
        } else {
            aleVar.E0(adjust);
        }
    }

    public static /* synthetic */ void y0(ale aleVar, TemplateInfo templateInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83687855", new Object[]{aleVar, templateInfo});
        } else {
            aleVar.H0(templateInfo);
        }
    }

    public static /* synthetic */ b9e.b z0(ale aleVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b9e.b) ipChange.ipc$dispatch("9e28de6", new Object[]{aleVar});
        }
        return aleVar.y;
    }

    public final void A0(AiQuality aiQuality) {
        x4 x4Var;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c623e3c4", new Object[]{this, aiQuality});
        } else if ((aiQuality == null || !aiQuality.isInDraft) && (x4Var = this.J) != null) {
            x4Var.d(aiQuality, this.M);
        }
    }

    public final void B0(Beauty beauty) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("452acbc2", new Object[]{this, beauty});
            return;
        }
        if (this.K == null) {
            this.K = new v62();
        }
        this.K.c(this.v, this.P);
        this.K.e(beauty, this.M);
    }

    public final void C0(Crop crop) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc69a4b0", new Object[]{this, crop});
        } else if (crop != null && crop.rect != null) {
            String K0 = K0();
            if (!TextUtils.isEmpty(K0)) {
                if (R0(crop)) {
                    Size I0 = I0();
                    this.v.setCanvasSize(I0.getWidth(), I0.getHeight());
                    odg.c("ImageEditorV2", "applyCrop: setCanvasSize " + I0.getWidth() + " " + I0.getHeight());
                }
                this.x = crop.rect;
                b1(K0, crop);
            }
        }
    }

    public final void D0(Filter filter) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee3ea660", new Object[]{this, filter});
        } else if (!filter.isInDraft && filter.srcDirPath != null && this.v != null) {
            if (filter.isVisibilityChange()) {
                MeEditor meEditor = this.v;
                String str = this.H;
                if (filter.visibilityValue != 1) {
                    z = false;
                }
                meEditor.setLookupVisibility(str, z);
                filter.resetVisibility();
                return;
            }
            if (S0(filter)) {
                if (!TextUtils.isEmpty(this.H)) {
                    this.v.deleteClip(this.H);
                }
                this.H = this.v.addLookupClip("", filter.srcDirPath, 0L, F());
            }
            this.I = filter.filterId;
            this.v.setLookupIntensity(this.H, filter.level / 100.0f);
        }
    }

    public final void E0(Adjust adjust) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32033d33", new Object[]{this, adjust});
            return;
        }
        if (this.L == null) {
            iie iieVar = new iie();
            this.L = iieVar;
            iieVar.b(this.v);
        }
        this.L.c(adjust, this.M);
    }

    public long F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("df7baba3", new Object[]{this})).longValue();
        }
        Viewer viewer = this.w;
        if (viewer != null) {
            return viewer.getDurationUs();
        }
        return IMAGE_CLIP_DURATION_US;
    }

    public final void F0(Music music) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3694a04", new Object[]{this, music});
        } else if (music == null || TextUtils.isEmpty(music.path)) {
            this.k.c("");
        } else {
            this.k.c(music.path);
        }
    }

    public final void G0(List<Paster> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5225d53e", new Object[]{this, list});
            return;
        }
        if (list != null) {
            for (Paster paster : list) {
                paster.endTimeUs = IMAGE_CLIP_DURATION_US;
            }
        }
        this.O.b(list);
    }

    public final void H0(TemplateInfo templateInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("670aa64e", new Object[]{this, templateInfo});
        } else if (templateInfo != null) {
            if (templateInfo.isDirty) {
                this.M.clear();
                this.f26946a = true;
                if (this.t == null) {
                    this.t = this.u;
                }
                this.u = this.s.b();
                this.p = templateInfo;
                this.Q = false;
                c1();
                this.p.isDirty = false;
                v62 v62Var = this.K;
                if (v62Var != null) {
                    v62Var.d();
                }
            }
            if (templateInfo.isContentDirty) {
                this.p.templateContent = templateInfo.templateContent;
                e1();
            }
        }
    }

    public Size I0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Size) ipChange.ipc$dispatch("ff652709", new Object[]{this});
        }
        Size size = this.q;
        if (size != null && size.getWidth() > 0 && this.q.getHeight() > 0) {
            return this.q;
        }
        int i2 = Resources.getSystem().getDisplayMetrics().widthPixels;
        return new Size(i2, (int) (((l0().getDisplayHeight() * i2) * 1.0f) / l0().getDisplayWidth()));
    }

    public final void J0() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52e7485f", new Object[]{this});
            return;
        }
        MeEditor meEditor = this.v;
        if (meEditor != null && (str = this.H) != null) {
            meEditor.deleteClip(str);
            this.I = -1;
            this.H = "";
        }
    }

    public final String K0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2b2c656b", new Object[]{this});
        }
        if (this.M.size() > 0) {
            return this.M.get(0);
        }
        return "";
    }

    public TemplateEditor L0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TemplateEditor) ipChange.ipc$dispatch("ec56ff3f", new Object[]{this});
        }
        return this.P;
    }

    public void M0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7bb316ad", new Object[]{this});
            return;
        }
        x4 x4Var = new x4();
        this.J = x4Var;
        x4Var.c(this.v);
    }

    public void N0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9bd54a4", new Object[]{this});
            return;
        }
        MeEditor meEditor = this.v;
        if (meEditor != null) {
            meEditor.getCoreEditor().setProject(this.u);
            return;
        }
        MeEditor c2 = this.s.c();
        this.v = c2;
        c2.getCoreEditor().setProject(this.u);
        this.v.transact();
    }

    public final void O0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("416eea85", new Object[]{this});
            return;
        }
        TemplateInfo templateInfo = this.p;
        if (templateInfo != null && TextUtils.equals(templateInfo.resourceType, Resource.TYPE_TEMPLATE_TEXT_IMAGE)) {
            e1();
            l0().width = this.v.getCanvasWidth();
            l0().height = this.v.getCanvasHeight();
        }
    }

    public void P0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6118ac9", new Object[]{this});
        } else if (this.r != null) {
            Viewer viewer = this.w;
            if (viewer != null) {
                viewer.setProject(this.u);
                return;
            }
            Viewer g2 = this.s.g();
            this.w = g2;
            g2.setProject(this.u);
            this.w.attachTo(this.r);
            this.w.setFrameInterval(16);
            this.w.setOnFirstFrameListener(new b());
        }
    }

    public void Q0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9357fac5", new Object[]{this});
            return;
        }
        U0();
        N0();
        P0();
        M0();
        Z0();
        V0();
        O0();
    }

    public final boolean R0(Crop crop) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5fc8ed9f", new Object[]{this, crop})).booleanValue();
        }
        if (this.x == null || (crop.rect.width() == this.x.width() && crop.rect.height() == this.x.height())) {
            return false;
        }
        return true;
    }

    public final boolean S0(Filter filter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8ff97bd8", new Object[]{this, filter})).booleanValue();
        }
        if (filter.filterId != this.I) {
            return true;
        }
        return false;
    }

    public void T0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6417925a", new Object[]{this});
        } else {
            U0();
        }
    }

    public void U0() {
        TemplateInfo templateInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18ddd60d", new Object[]{this});
        } else if (!this.Q && (templateInfo = this.p) != null) {
            this.u.load(templateInfo.draftPath, this.R);
            TemplateEditor templateEditor = new TemplateEditor(this.u.getApp());
            this.P = templateEditor;
            templateEditor.setProject(this.u);
            if (this.p.metaJsonPath != null) {
                File file = new File(this.p.metaJsonPath);
                if (file.exists()) {
                    this.u.loadTemplateMetaInfo(file.getPath());
                }
            }
            this.Q = true;
        }
    }

    public final void V0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b329ea00", new Object[]{this});
            return;
        }
        Viewer viewer = this.w;
        if (viewer != null) {
            viewer.prepare();
        }
    }

    public void W0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2f0d7ae", new Object[]{this});
            return;
        }
        odg.b(RPCDataItems.SWITCH_TAG_LOG, "aYou thumbnailL focus onDestroy, releaseMarvelEnv");
        Viewer viewer = this.w;
        if (viewer != null) {
            viewer.attachTo((TextureView) null);
            this.w.stop();
            this.s.f(this.w);
            this.w = null;
        }
        MeEditor meEditor = this.v;
        if (meEditor != null) {
            this.s.e(meEditor);
            this.v = null;
        }
    }

    public final void X0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e0aeba", new Object[]{this});
            return;
        }
        TemplateInfo templateInfo = this.p;
        if (templateInfo != null && !TextUtils.isEmpty(templateInfo.singleHolderPath)) {
            ImageBean k2 = kuu.k(this.p.singleHolderPath);
            Image image = this.b;
            image.width = k2.width;
            image.height = k2.height;
            image.path = k2.path;
            image.rotation = k2.rotate;
        }
    }

    public final void Y0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e629cc0d", new Object[]{this});
            return;
        }
        d1(getFilter());
        C0(n0());
        A0(I());
        G0(X());
        F0(W());
        B0(n());
        E0(A());
    }

    public void a1(b9e.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98b45468", new Object[]{this, bVar});
        } else {
            this.y = bVar;
        }
    }

    public final void c1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8c7ab80", new Object[]{this});
            return;
        }
        Viewer viewer = this.w;
        if (viewer != null) {
            viewer.stop();
        }
        Q0();
        this.w.seekTo(1000L, Const.SeekFlag.SeekEnd);
    }

    @Override // tb.prc
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f04c258", new Object[]{this});
            return;
        }
        this.r = null;
        b(this.z);
        b(this.A);
        b(this.B);
        b(this.C);
        b(this.D);
        b(this.E);
        b(this.F);
        b(this.G);
        W0();
    }

    public final void d1(Filter filter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e6df465", new Object[]{this, filter});
        } else if (filter == null) {
            J0();
        } else {
            D0(filter);
        }
    }

    public final void e1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8d5ab6c", new Object[]{this});
            return;
        }
        TemplateInfo templateInfo = this.p;
        if (templateInfo != null) {
            this.P.setTemplateTextVariable("editable_text", templateInfo.templateContent);
            this.P.applyTemplateTextVariable();
        }
    }

    @Override // tb.prc
    public void h(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c93713a1", new Object[]{this, view});
            return;
        }
        this.r = (SurfaceView) view;
        c(this.z);
        c(this.A);
        c(this.B);
        c(this.C);
        c(this.D);
        c(this.E);
        c(this.F);
        c(this.G);
        Q0();
    }

    @Override // tb.tqc
    public MeEditor h0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MeEditor) ipChange.ipc$dispatch("ad5367bf", new Object[]{this});
        }
        return this.v;
    }

    @Override // tb.ydc
    public SurfaceView i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SurfaceView) ipChange.ipc$dispatch("27ea5fa5", new Object[]{this});
        }
        return this.r;
    }

    @Override // tb.tqc
    public Project o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Project) ipChange.ipc$dispatch("6d8f5dd1", new Object[]{this});
        }
        return this.u;
    }

    @Override // tb.tqc
    public uqc t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (uqc) ipChange.ipc$dispatch("fc1e3350", new Object[]{this});
        }
        return this.s;
    }

    @Override // tb.tqc
    public Viewer v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Viewer) ipChange.ipc$dispatch("9f3b9c5f", new Object[]{this});
        }
        return this.w;
    }

    @Override // tb.qv1, tb.uzd
    public void z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("704b93c", new Object[]{this});
            return;
        }
        super.z();
        if (this.p != null) {
            this.f26946a = false;
            X0();
            Viewer viewer = this.w;
            if (viewer != null) {
                viewer.stop();
            }
            Project project = this.t;
            if (project == null) {
                project = this.s.b();
            }
            this.u = project;
            Q0();
            this.w.seekTo(1000L, Const.SeekFlag.SeekEnd);
        }
    }

    public ale(uqc uqcVar, Image image, Size size, ImageEditInfo imageEditInfo) {
        this(uqcVar, null, image, size, imageEditInfo);
    }

    @Override // tb.qv1, tb.ydc, tb.prc
    public ImageEditInfo a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ImageEditInfo) ipChange.ipc$dispatch("8aa06559", new Object[]{this});
        }
        ImageEditInfo a2 = super.a();
        a2.version = 1;
        return a2;
    }

    public ale(uqc uqcVar, yke ykeVar, Image image, Size size, ImageEditInfo imageEditInfo) {
        super(ykeVar, image, imageEditInfo);
        this.x = new Rect();
        this.z = new c();
        this.A = new d();
        this.B = new e();
        this.C = new f();
        this.D = new g();
        this.E = new h();
        this.F = new i();
        this.G = new j();
        this.M = new ArrayList<>();
        this.O = null;
        this.R = new k(this);
        this.s = uqcVar;
        this.q = size;
        this.u = uqcVar.b();
        this.O = new ltl(new a(this, this));
    }

    public void Z0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("859cbd80", new Object[]{this});
            return;
        }
        if (!B()) {
            odg.c("ImageEditorV2", "restoreEditInfoIfNeed: main clip------> ");
            if (this.M.size() <= 0) {
                Size I0 = I0();
                String addMainClip = this.v.addMainClip(l0().path, 0L, (long) IMAGE_CLIP_DURATION_US);
                this.v.setCanvasSize(I0.getWidth(), I0.getHeight());
                this.v.setCanvasScaleType(ScaleType.kCenterCrop);
                odg.c("ImageEditorV2", "restoreEditInfoIfNeed: setCanvasSize " + I0.getWidth() + " " + I0.getHeight());
                this.M.add(addMainClip);
            } else {
                return;
            }
        }
        if (!this.Q) {
            Y0();
        }
    }

    public final void b1(String str, Crop crop) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5e5d4f2", new Object[]{this, str, crop});
            return;
        }
        int originDisplayWidth = l0().getOriginDisplayWidth();
        int originDisplayHeight = l0().getOriginDisplayHeight();
        Transform transform = crop.transform;
        float f2 = originDisplayWidth;
        float f3 = transform.unRotateOffsetX / f2;
        float f4 = originDisplayHeight;
        float f5 = transform.unRotateOffsetY / f4;
        float width = (((crop.rect.width() * 1.0f) * transform.sampleSize) / transform.scale) / f2;
        float height = (((crop.rect.height() * crop.transform.sampleSize) * 1.0f) / transform.scale) / f4;
        odg.c("ImageEditorV2", "startCrop: cropWidth=" + width + " cropHeight=" + height);
        this.v.setClipCrop(str, f3, f5, width, height, -((float) ((transform.rotate / 180.0f) * 3.141592653589793d)), true);
    }
}
