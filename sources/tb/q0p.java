package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.tao.topmultitab.service.searchbar.impl.searchview.SearchBarView;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class q0p implements snd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final SearchBarView f26433a;
    public boolean b = f0p.a();
    public final wcc c;
    public snd d;

    static {
        t2o.a(729810333);
        t2o.a(729810348);
    }

    public q0p(wcc wccVar, SearchBarView searchBarView) {
        this.f26433a = searchBarView;
        this.c = wccVar;
    }

    @Override // tb.snd
    public void a(JSONObject jSONObject, wcc wccVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("adc45d9e", new Object[]{this, jSONObject, wccVar});
        } else {
            f().a(jSONObject, wccVar);
        }
    }

    @Override // tb.snd
    public void b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ff2ea91", new Object[]{this, jSONObject});
        } else {
            f().b(jSONObject);
        }
    }

    @Override // tb.snd
    public void c(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb0f0d65", new Object[]{this, jSONObject});
        } else {
            f().c(jSONObject);
        }
    }

    @Override // tb.snd
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6dadc00", new Object[]{this});
        } else {
            f().d();
        }
    }

    @Override // tb.snd
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        } else {
            this.d.destroy();
        }
    }

    public final snd e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (snd) ipChange.ipc$dispatch("64fd0a14", new Object[]{this});
        }
        if (this.b) {
            return new g4q(this.c, this.f26433a);
        }
        return new rok(this.c, this.f26433a);
    }

    public final snd f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (snd) ipChange.ipc$dispatch("42e54c6e", new Object[]{this});
        }
        boolean a2 = f0p.a();
        if (a2 == this.b) {
            if (this.d == null) {
                this.d = e();
            }
            return this.d;
        }
        this.b = a2;
        snd sndVar = this.d;
        if (sndVar != null) {
            sndVar.destroy();
        }
        snd e = e();
        this.d = e;
        return e;
    }

    @Override // tb.snd
    public DXRootView getDX3SearchView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRootView) ipChange.ipc$dispatch("62c6355a", new Object[]{this});
        }
        return f().getDX3SearchView();
    }

    @Override // tb.snd
    public Object getValueFromSearchBarData(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("2ad6f931", new Object[]{this, str});
        }
        return f().getValueFromSearchBarData(str);
    }

    @Override // tb.snd
    public boolean isDX3SearchViewReady() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("71f603cc", new Object[]{this})).booleanValue();
        }
        return f().isDX3SearchViewReady();
    }

    @Override // tb.snd
    public void partialRefreshWidgetNode(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d2f7eb1", new Object[]{this, str});
        } else {
            f().partialRefreshWidgetNode(str);
        }
    }
}
