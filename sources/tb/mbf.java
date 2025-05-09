package tb;

import android.app.Activity;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import androidx.collection.ArrayMap;
import com.ali.adapt.api.AliAdaptServiceManager;
import com.ali.adapt.api.AliServiceFindedCallback;
import com.alibaba.ability.localization.Localization;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.api.Login;
import com.taobao.search.mmd.datasource.bean.AuctionBaseBean;
import com.taobao.search.sf.datasource.CommonBaseDatasource;
import com.taobao.taobao.R;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class mbf extends fx1<AuctionBaseBean> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final ay4<x02, mbf> CREATOR = new a();
    public AuctionBaseBean e;
    public TextView f;
    public final pud g;
    public final pud h;
    public final oud i;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements ay4<x02, mbf> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: b */
        public mbf a(x02 x02Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (mbf) ipChange.ipc$dispatch("1f6fdf59", new Object[]{this, x02Var});
            }
            return new mbf(x02Var.f31046a, x02Var.b, (b64) x02Var.c, x02Var.d, x02Var.e, null);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements pud {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // tb.pud
        public void onFavError(int i, String str, String str2, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8ec19c20", new Object[]{this, new Integer(i), str, str2, obj});
                return;
            }
            mbf.y2(mbf.this).isCollected = false;
            Toast.makeText(mbf.this.getActivity(), Localization.q(R.string.app_favorite_fail), 0).show();
        }

        @Override // tb.pud
        public void onFavSuccess(int i, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8ede1cb1", new Object[]{this, new Integer(i), obj});
                return;
            }
            mbf.y2(mbf.this).isCollected = true;
            Toast.makeText(mbf.this.getActivity(), Localization.q(R.string.app_congratulations_collection_success), 0).show();
        }

        @Override // tb.pud
        public void onFavSystemError(int i, String str, String str2, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2b61856f", new Object[]{this, new Integer(i), str, str2, obj});
                return;
            }
            mbf.y2(mbf.this).isCollected = false;
            Toast.makeText(mbf.this.getActivity(), Localization.q(R.string.app_favorite_fail), 0).show();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class c implements pud {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // tb.pud
        public void onFavError(int i, String str, String str2, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8ec19c20", new Object[]{this, new Integer(i), str, str2, obj});
                return;
            }
            mbf.z2(mbf.this, true);
            Toast.makeText(mbf.this.getActivity(), Localization.q(R.string.app_cancel_favorite_fail), 0).show();
        }

        @Override // tb.pud
        public void onFavSuccess(int i, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8ede1cb1", new Object[]{this, new Integer(i), obj});
                return;
            }
            mbf.y2(mbf.this).isCollected = false;
            Toast.makeText(mbf.this.getActivity(), Localization.q(R.string.app_cancel_favorite_fail), 0).show();
        }

        @Override // tb.pud
        public void onFavSystemError(int i, String str, String str2, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2b61856f", new Object[]{this, new Integer(i), str, str2, obj});
                return;
            }
            mbf.z2(mbf.this, true);
            Toast.makeText(mbf.this.getActivity(), Localization.q(R.string.app_cancel_favorite_fail), 0).show();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class d implements oud {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // tb.oud
        public void a(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("59f658c7", new Object[]{this, str, str2});
            }
        }

        @Override // tb.oud
        public void b(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("72e2cbd8", new Object[]{this, str, str2});
            }
        }

        @Override // tb.oud
        public void c(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ddda67e6", new Object[]{this, new Boolean(z)});
            } else if (mbf.y2(mbf.this) != null) {
                mbf.y2(mbf.this).isCollected = z;
                mbf mbfVar = mbf.this;
                mbfVar.s2(mbf.A2(mbfVar), z, Localization.q(R.string.app_already_collected), "#ff5000", Localization.q(R.string.app_favorite), "#051b28");
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class e implements AliServiceFindedCallback<rud> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f23916a;

        public e(String str) {
            this.f23916a = str;
        }

        /* renamed from: a */
        public void onServiceFinded(rud rudVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a3980e35", new Object[]{this, rudVar});
            } else if (rudVar == null) {
                b4p.a("InshopSearchLongPressLayer", "favorite service is null");
            } else {
                rudVar.setBizCode("search_app");
                rudVar.isFavoriteItem(this.f23916a, mbf.B2(mbf.this));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class f implements AliServiceFindedCallback<rud> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f23917a;

        public f(String str) {
            this.f23917a = str;
        }

        /* renamed from: a */
        public void onServiceFinded(rud rudVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a3980e35", new Object[]{this, rudVar});
            } else if (rudVar == null) {
                b4p.a("InshopSearchLongPressLayer", "favorite service is null");
            } else {
                rudVar.setBizCode("search_app");
                rudVar.addFavoriteItem(this.f23917a, mbf.C2(mbf.this));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class g implements AliServiceFindedCallback<rud> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f23918a;

        public g(String str) {
            this.f23918a = str;
        }

        /* renamed from: a */
        public void onServiceFinded(rud rudVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a3980e35", new Object[]{this, rudVar});
            } else if (rudVar == null) {
                b4p.a("InshopSearchLongPressLayer", "favorite service is null");
            } else {
                rudVar.setBizCode("search_app");
                rudVar.deleteFavoriteItem(this.f23918a, mbf.D2(mbf.this));
            }
        }
    }

    static {
        t2o.a(815793613);
    }

    public /* synthetic */ mbf(Activity activity, ude udeVar, b64 b64Var, ViewGroup viewGroup, vfw vfwVar, a aVar) {
        this(activity, udeVar, b64Var, viewGroup, vfwVar);
    }

    public static /* synthetic */ TextView A2(mbf mbfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextView) ipChange.ipc$dispatch("1f61333d", new Object[]{mbfVar});
        }
        return mbfVar.f;
    }

    public static /* synthetic */ oud B2(mbf mbfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (oud) ipChange.ipc$dispatch("8552ddd1", new Object[]{mbfVar});
        }
        return mbfVar.i;
    }

    public static /* synthetic */ pud C2(mbf mbfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (pud) ipChange.ipc$dispatch("455727df", new Object[]{mbfVar});
        }
        return mbfVar.g;
    }

    public static /* synthetic */ pud D2(mbf mbfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (pud) ipChange.ipc$dispatch("7ddff5e0", new Object[]{mbfVar});
        }
        return mbfVar.h;
    }

    public static /* synthetic */ Object ipc$super(mbf mbfVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/sf/widgets/list/layer/longpress/InshopSearchLongPressLayerWidget");
    }

    public static /* synthetic */ AuctionBaseBean y2(mbf mbfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AuctionBaseBean) ipChange.ipc$dispatch("107ecbe8", new Object[]{mbfVar});
        }
        return mbfVar.e;
    }

    public static /* synthetic */ void z2(mbf mbfVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd21c6cc", new Object[]{mbfVar, new Boolean(z)});
        } else {
            mbfVar.I2(z);
        }
    }

    public final void E2(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15399c2e", new Object[]{this, str});
        } else {
            AliAdaptServiceManager.getInstance().findAliAdaptService(rud.class, new f(str));
        }
    }

    public final void F2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("631bfe5e", new Object[]{this});
            return;
        }
        AuctionBaseBean auctionBaseBean = this.e;
        if (auctionBaseBean.isCollected) {
            H2(auctionBaseBean.itemId);
        } else {
            E2(auctionBaseBean.itemId);
        }
    }

    public final void G2(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b17f9a55", new Object[]{this, str});
        } else {
            AliAdaptServiceManager.getInstance().findAliAdaptService(rud.class, new e(str));
        }
    }

    public final void H2(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3b6072b", new Object[]{this, str});
        } else {
            AliAdaptServiceManager.getInstance().findAliAdaptService(rud.class, new g(str));
        }
    }

    public final void I2(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86bff520", new Object[]{this, new Boolean(z)});
        } else {
            s2(this.f, z, Localization.q(R.string.app_already_collected), "#ff5000", Localization.q(R.string.app_favorite), "#051b28");
        }
    }

    public final void J2(AuctionBaseBean auctionBaseBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0488cad", new Object[]{this, auctionBaseBean});
        } else if (!auctionBaseBean.isCollected) {
            this.f = t2(Localization.q(R.string.app_favorite), -1, -1, -16777216, this);
        } else {
            this.f = t2(Localization.q(R.string.app_already_collected), -1, -1, Color.parseColor("#051b28"), this);
        }
    }

    public void K2(AuctionBaseBean auctionBaseBean, ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db1af3a5", new Object[]{this, auctionBaseBean, viewGroup});
            return;
        }
        w2();
        this.e = auctionBaseBean;
        G2(auctionBaseBean.itemId);
        J2(auctionBaseBean);
        q2(viewGroup);
        x2();
    }

    @Override // tb.abx
    public String getLogTag() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("55d7c1cd", new Object[]{this});
        }
        return "InshopSearchLongPressLayer";
    }

    public void onEventMainThread(zxo zxoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("858b8879", new Object[]{this, zxoVar});
        } else {
            w2();
        }
    }

    public mbf(Activity activity, ude udeVar, b64 b64Var, ViewGroup viewGroup, vfw vfwVar) {
        super(activity, udeVar, b64Var, viewGroup, vfwVar);
        this.g = new b();
        this.h = new c();
        this.i = new d();
        subscribeScopeEvent(this, "childPageWidget");
        getModel().e().subscribe(this);
    }

    @Override // tb.fx1, android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
        } else if (!(view instanceof TextView)) {
            w2();
        } else if (TextUtils.isEmpty(Login.getSid())) {
            Login.login(true);
        } else {
            CommonBaseDatasource e2 = getModel().e();
            String charSequence = ((TextView) view).getText().toString();
            int i = R.string.app_favorite;
            if (TextUtils.equals(charSequence, Localization.q(i)) || TextUtils.equals(charSequence, Localization.q(R.string.app_already_collected))) {
                s2(this.f, !this.e.isCollected, Localization.q(R.string.app_already_collected), "#ff5000", Localization.q(i), "#051b28");
                F2();
                ArrayMap arrayMap = new ArrayMap();
                arrayMap.put("item_id", this.e.itemId);
                arrayMap.put("seller_id", e2.getParamValue("sellerId"));
                if (this.e.isCollected) {
                    sen.f("MoreFavoriteCancel", arrayMap);
                } else {
                    sen.f("MoreFavorite", arrayMap);
                }
            }
        }
    }

    public void onEventMainThread(u2p u2pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa51d788", new Object[]{this, u2pVar});
        } else if (u2pVar.b()) {
            w2();
        }
    }
}
