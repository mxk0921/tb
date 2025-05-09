package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.data.IDataService;
import com.taobao.android.fluid.framework.data.datamodel.a;
import com.taobao.android.fluid.framework.scene.ISceneConfigService;
import com.taobao.kirinvideoengine.feature.predownload.model.PreDownloadConfig;
import com.taobao.kirinvideoengine.model.MediaModel;
import com.taobao.kirinvideoengine.states.model.KirinVideoStateModel;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class e5g implements m2c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final FluidContext f18292a;
    public final List<MediaModel> d = new ArrayList();
    public long e = 0;
    public final PreDownloadConfig b = new PreDownloadConfig(false, 3, 0.8f, 6.0f, 3.0f);
    public final KirinVideoStateModel c = new KirinVideoStateModel();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements mkc {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ pep f18293a;

        public a(pep pepVar) {
            this.f18293a = pepVar;
        }

        @Override // tb.mkc
        public void onListDataAdd(List<com.taobao.android.fluid.framework.data.datamodel.a> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ddce9d32", new Object[]{this, list});
            }
        }

        @Override // tb.mkc
        public void onListDataChange(List<com.taobao.android.fluid.framework.data.datamodel.a> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("54cd90ef", new Object[]{this, list});
            } else if (list != null) {
                e5g.h(e5g.this);
                ir9.b("KirinEngineDelegate", "onListDataChange translate to mediaModel； mediaSetDataList size： " + list.size() + "; mListIdentifier=" + e5g.g(e5g.this));
                e5g.i(e5g.this).clear();
                for (com.taobao.android.fluid.framework.data.datamodel.a aVar : list) {
                    try {
                        a.d e = aVar.e();
                        a.e K = e.K();
                        MediaModel G = K != null ? new MediaModel.b(K.t()).d0(K.l()).f0(K.w()).e0("").c0(sj4.PLAY_SCENES).W(this.f18293a.c).Y(this.f18293a.b).J(e.f()).T("DWVideo").G() : null;
                        e5g.i(e5g.this).add(G);
                        ir9.b("KirinEngineDelegate", "onListDataChange translate to mediaModel； mediaModel=： " + G + "; id=" + e.f() + " type=" + e.N());
                    } catch (Throwable th) {
                        th.printStackTrace();
                        ir9.b("KirinEngineDelegate", "onListDataChange translate to mediaModel； error： " + th.getMessage());
                    }
                }
            }
        }
    }

    static {
        t2o.a(468714518);
        t2o.a(500170797);
    }

    public e5g(FluidContext fluidContext) {
        this.f18292a = fluidContext;
        ((IDataService) fluidContext.getService(IDataService.class)).addListDataChangeListener(new a(((ISceneConfigService) fluidContext.getService(ISceneConfigService.class)).getSessionParams()));
    }

    public static /* synthetic */ long g(e5g e5gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e8343011", new Object[]{e5gVar})).longValue();
        }
        return e5gVar.e;
    }

    public static /* synthetic */ long h(e5g e5gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b03ebd09", new Object[]{e5gVar})).longValue();
        }
        long j = e5gVar.e;
        e5gVar.e = 1 + j;
        return j;
    }

    public static /* synthetic */ List i(e5g e5gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("793804cb", new Object[]{e5gVar});
        }
        return e5gVar.d;
    }

    @Override // tb.m2c
    public Context a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("267167ae", new Object[]{this});
        }
        return this.f18292a.getContext();
    }

    @Override // tb.m2c
    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ff575c78", new Object[]{this});
        }
        return this.f18292a.getInstanceId();
    }

    @Override // tb.m2c
    public PreDownloadConfig c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PreDownloadConfig) ipChange.ipc$dispatch("deba53d3", new Object[]{this, context});
        }
        return this.b;
    }

    @Override // tb.m2c
    public KirinVideoStateModel d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (KirinVideoStateModel) ipChange.ipc$dispatch("80d7b096", new Object[]{this});
        }
        return this.c;
    }

    @Override // tb.m2c
    public List<MediaModel> e(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("448e86a8", new Object[]{this, context});
        }
        return this.d;
    }

    @Override // tb.m2c
    public long f(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b78c00a", new Object[]{this, context})).longValue();
        }
        return this.e;
    }
}
