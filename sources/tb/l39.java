package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.adapterimpl.favorite.business.FavoriteResponseData;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import com.taobao.taolive.sdk.adapter.network.NetResponse;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import tb.lh6;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class l39 implements n5c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final List<u29> f23084a = new CopyOnWriteArrayList();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements b0d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ c39 f23085a;
        public final /* synthetic */ sqk b;

        public a(c39 c39Var, sqk sqkVar) {
            this.f23085a = c39Var;
            this.b = sqkVar;
        }

        @Override // tb.b0d
        public void onError(int i, NetResponse netResponse, Object obj) {
            String str;
            String str2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i), netResponse, obj});
            } else if (this.b != null) {
                if (netResponse != null) {
                    str = netResponse.getRetCode();
                } else {
                    str = "0";
                }
                if (netResponse != null) {
                    str2 = netResponse.getRetMsg();
                } else {
                    str2 = "服务出错了";
                }
                ((lh6.a) this.b).a(str, str2);
            }
        }

        @Override // tb.b0d
        public void onSuccess(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fb090915", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
                return;
            }
            FavoriteResponseData favoriteResponseData = (FavoriteResponseData) netBaseOutDo.getData();
            if (favoriteResponseData.retCode == 1) {
                i39 i39Var = new i39();
                i39Var.f21067a = this.f23085a.f16815a;
                i39Var.b = true;
                sqk sqkVar = this.b;
                if (sqkVar != null) {
                    ((lh6.a) sqkVar).b(i39Var);
                }
                l39.d(l39.this, i39Var);
                return;
            }
            sqk sqkVar2 = this.b;
            if (sqkVar2 != null) {
                ((lh6.a) sqkVar2).a("" + favoriteResponseData.retCode, favoriteResponseData.retTitle);
            }
        }

        @Override // tb.b0d
        public void onSystemError(int i, NetResponse netResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9bfdbcd9", new Object[]{this, new Integer(i), netResponse, obj});
            } else {
                onError(i, netResponse, obj);
            }
        }
    }

    static {
        t2o.a(779092284);
        t2o.a(806355892);
    }

    public static /* synthetic */ void d(l39 l39Var, i39 i39Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2510bfc", new Object[]{l39Var, i39Var});
        } else {
            l39Var.e(i39Var);
        }
    }

    @Override // tb.n5c
    public void a(u29 u29Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7b3c82d", new Object[]{this, u29Var});
        } else if (u29Var != null && !((CopyOnWriteArrayList) this.f23084a).contains(u29Var)) {
            ((CopyOnWriteArrayList) this.f23084a).add(u29Var);
        }
    }

    @Override // tb.n5c
    public void b(c39 c39Var, sqk sqkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab194c41", new Object[]{this, c39Var, sqkVar});
        } else {
            new r29(new a(c39Var, sqkVar)).K(c39Var.f16815a);
        }
    }

    @Override // tb.n5c
    public void c(u29 u29Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("404bca50", new Object[]{this, u29Var});
        } else if (u29Var != null) {
            ((CopyOnWriteArrayList) this.f23084a).remove(u29Var);
        }
    }

    public final void e(i39 i39Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c6389c8", new Object[]{this, i39Var});
            return;
        }
        t29 t29Var = new t29();
        t29Var.f28423a = i39Var.f21067a;
        t29Var.b = i39Var.b;
        Iterator it = ((CopyOnWriteArrayList) this.f23084a).iterator();
        while (it.hasNext()) {
            ((u29) it.next()).onFavoriteChange(t29Var);
        }
    }
}
