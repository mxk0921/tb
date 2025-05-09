package tb;

import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.kirinvideoengine.album.AlbumAdapter;
import com.taobao.kirinvideoengine.album.AlbumContainer;
import kotlin.Metadata;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ltb/vj0;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "kirinvideoengine_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class vj0 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final AlbumContainer f30040a;

    static {
        t2o.a(500170763);
    }

    public vj0(Context context) {
        ckf.g(context, "context");
        this.f30040a = new AlbumContainer(context);
    }

    public final void a(AlbumAdapter.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("376365a8", new Object[]{this, bVar});
            return;
        }
        ckf.g(bVar, "itemStateListener");
        this.f30040a.g(bVar);
    }

    public final void b(AlbumAdapter.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("935249c0", new Object[]{this, cVar});
            return;
        }
        ckf.g(cVar, "livePhotoStateListener");
        this.f30040a.h(cVar);
    }

    public final void c(RecyclerView.OnScrollListener onScrollListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0c68c6b", new Object[]{this, onScrollListener});
            return;
        }
        ckf.g(onScrollListener, "scrollListener");
        this.f30040a.f(onScrollListener);
    }

    public final void d(vsk vskVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1390e60", new Object[]{this, vskVar});
            return;
        }
        ckf.g(vskVar, "pageChangedListener");
        this.f30040a.i(vskVar);
    }

    public final int e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("559245ac", new Object[]{this})).intValue();
        }
        return this.f30040a.j();
    }

    public final ay1 f(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ay1) ipChange.ipc$dispatch("8ceee6f7", new Object[]{this, new Integer(i)});
        }
        return this.f30040a.l(i);
    }

    public final int g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b412203e", new Object[]{this})).intValue();
        }
        return this.f30040a.m();
    }

    public final ViewGroup h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("354614a2", new Object[]{this});
        }
        return this.f30040a.k();
    }

    public final void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7fcd8b59", new Object[]{this});
        } else {
            this.f30040a.n();
        }
    }

    public final void j(dk0 dk0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b61f40df", new Object[]{this, dk0Var});
            return;
        }
        ckf.g(dk0Var, "data");
        this.f30040a.q(dk0Var);
    }

    public final void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1b21df1", new Object[]{this});
        } else {
            this.f30040a.r();
        }
    }

    public final void l(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4d0b0c7", new Object[]{this, new Boolean(z)});
        } else {
            this.f30040a.s(z);
        }
    }

    public final void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("778dcd4b", new Object[]{this});
        } else {
            this.f30040a.t();
        }
    }
}
