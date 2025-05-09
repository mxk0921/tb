package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.kirinvideoengine.feature.predownload.model.PreDownloadConfig;
import com.taobao.kirinvideoengine.model.MediaModel;
import com.taobao.kirinvideoengine.states.model.KirinVideoStateModel;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class j5g implements m2c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final cxj f21771a;
    public final dh7 b;
    public final PreDownloadConfig c = new PreDownloadConfig(false, 3, 0.8f, 6.0f, 3.0f);
    public final KirinVideoStateModel d = new KirinVideoStateModel();

    static {
        t2o.a(352321655);
        t2o.a(500170797);
    }

    public j5g(cxj cxjVar, dh7 dh7Var) {
        this.f21771a = cxjVar;
        this.b = dh7Var;
    }

    @Override // tb.m2c
    public Context a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("267167ae", new Object[]{this});
        }
        return this.f21771a.i();
    }

    @Override // tb.m2c
    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ff575c78", new Object[]{this});
        }
        return this.f21771a.j().B();
    }

    @Override // tb.m2c
    public PreDownloadConfig c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PreDownloadConfig) ipChange.ipc$dispatch("deba53d3", new Object[]{this, context});
        }
        return this.c;
    }

    @Override // tb.m2c
    public KirinVideoStateModel d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (KirinVideoStateModel) ipChange.ipc$dispatch("80d7b096", new Object[]{this});
        }
        return this.d;
    }

    @Override // tb.m2c
    public List<MediaModel> e(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("448e86a8", new Object[]{this, context});
        }
        return this.b.M().M().a();
    }

    @Override // tb.m2c
    public long f(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b78c00a", new Object[]{this, context})).longValue();
        }
        return this.b.M().F();
    }
}
