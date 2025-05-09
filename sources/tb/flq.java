package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.collections.a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class flq extends zy1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f19393a = "TBFavoriteStatusChanged";
    public final String b = "TBFavoriteStatusCacheInitComplete";

    static {
        t2o.a(1007681544);
    }

    public static /* synthetic */ Object ipc$super(flq flqVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/favorite/StatusPluginImpl");
    }

    @Override // tb.zy1
    public void b(xoh xohVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("709956ce", new Object[]{this, xohVar});
            return;
        }
        ckf.g(xohVar, "params");
        rdp.INSTANCE.a().b(xohVar.a(), xohVar.c());
    }

    @Override // tb.zy1
    public void c(xoh xohVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70b5afcf", new Object[]{this, xohVar});
            return;
        }
        ckf.g(xohVar, "params");
        rdp.INSTANCE.a().a(xohVar.a(), xohVar.c());
    }

    @Override // tb.zy1
    public void d(l29 l29Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e6c567f", new Object[]{this, l29Var});
            return;
        }
        l4s.INSTANCE.e("onLoadDiskCacheEnd:send ACTION_FAV_STATE_LOAD_COMPLETE");
        bl2.INSTANCE.d(this.b, "__APP__", a.k(jpu.a("type", "ITEM"), jpu.a("actionType", "loadDiskCache")));
    }

    @Override // tb.zy1
    public void e(boolean z, l29 l29Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a537a24", new Object[]{this, new Boolean(z), l29Var});
        } else if (z) {
            l4s.INSTANCE.c(null, "onRebaseStatusEnd: send ACTION_FAV_STATE_LOAD_COMPLETE");
            bl2.INSTANCE.d(this.b, "__APP__", a.k(jpu.a("type", "ITEM"), jpu.a("actionType", "rebase")));
        }
    }

    @Override // tb.zy1
    public void a(boolean z, xoh xohVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc2e1f04", new Object[]{this, new Boolean(z), xohVar});
            return;
        }
        ckf.g(xohVar, "params");
        if (z) {
            l4s l4sVar = l4s.INSTANCE;
            l4sVar.c(null, "onAddFavoriteEnd: send ACTION_FAV_STATE_CHANGE  biz=" + xohVar.a());
            bl2.INSTANCE.d(this.f19393a, "__APP__", a.k(jpu.a("type", "ITEM"), jpu.a("id", xohVar.c()), jpu.a("isFavorite", Boolean.TRUE), jpu.a("favoriteCount", rdp.INSTANCE.a().c(xohVar))));
            return;
        }
        rdp.INSTANCE.a().a(xohVar.a(), xohVar.c());
    }

    @Override // tb.zy1
    public void f(boolean z, xoh xohVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f56002a3", new Object[]{this, new Boolean(z), xohVar});
            return;
        }
        ckf.g(xohVar, "params");
        String c = xohVar.c();
        if (z) {
            l4s l4sVar = l4s.INSTANCE;
            l4sVar.e("onRemoveFavoriteEnd: send ACTION_FAV_STATE_CHANGE biz=" + xohVar.a());
            bl2.INSTANCE.d(this.f19393a, "__APP__", a.k(jpu.a("type", "ITEM"), jpu.a("id", xohVar.c()), jpu.a("isFavorite", Boolean.FALSE), jpu.a("favoriteCount", rdp.INSTANCE.a().c(xohVar))));
            return;
        }
        rdp.INSTANCE.a().b(xohVar.a(), c);
    }
}
