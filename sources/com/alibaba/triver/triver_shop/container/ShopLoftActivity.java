package com.alibaba.triver.triver_shop.container;

import android.app.ActionBar;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.constraintlayout.widget.Group;
import androidx.constraintlayout.widget.Guideline;
import androidx.fragment.app.FragmentActivity;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.kernel.common.service.RVAccountService;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.triver.triver_shop.container.shopLoft.ShopLoftComponent;
import com.alibaba.triver.triver_shop.container.shopLoft.ShopLoftViewManager;
import com.alibaba.triver.triver_shop.newShop.event.broadcast.ShopBroadcastController;
import com.alibaba.triver.triver_shop.newShop.ext.ShopExtKt;
import com.alibaba.triver.triver_shop.newShop.manager.SingleActivityInstanceController;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.taobao.R;
import com.taobao.uikit.actionbar.ITBPublicMenu;
import com.taobao.uikit.actionbar.TBPublicMenu;
import com.taobao.uikit.actionbar.TBPublicMenuItem;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import com.ut.mini.UTAnalytics;
import com.ut.share.business.ShareContent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.android.agoo.common.AgooConstants;
import tb.a1v;
import tb.acq;
import tb.aqp;
import tb.brf;
import tb.d1a;
import tb.fee;
import tb.gt9;
import tb.hee;
import tb.jjx;
import tb.kew;
import tb.npp;
import tb.nxq;
import tb.oop;
import tb.pqw;
import tb.r54;
import tb.sqp;
import tb.t2o;
import tb.tsd;
import tb.xhv;
import tb.xpd;
import tb.yfb;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class ShopLoftActivity extends FragmentActivity implements View.OnClickListener, tsd, yfb, fee, hee {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_SHARE_URL_BASE = "https://m.taobao.com/app/shop-conainer/contentlistpage.html";
    public static final String KEY_SHOP_LOFT_BROADCAST_EVENT = "shop_loft_event";
    public static final int[] N = {0, 3, 15, 30};
    public static final SingleActivityInstanceController<ShopLoftActivity> O = new SingleActivityInstanceController<>();
    public final boolean E;
    public final boolean F;

    /* renamed from: a  reason: collision with root package name */
    public ShopLoftComponent f2966a = null;
    public FrameLayout b = null;
    public Guideline c = null;
    public Guideline d = null;
    public ImageView e = null;
    public ImageView f = null;
    public TextView g = null;
    public ViewGroup h = null;
    public TUrlImageView i = null;
    public TUrlImageView j = null;
    public TextView k = null;
    public TextView l = null;
    public ImageView m = null;
    public ImageView n = null;
    public ViewGroup o = null;
    public Group p = null;
    public Group q = null;
    public TBPublicMenu r = null;
    public String s = null;
    public String t = null;
    public String u = null;
    public String v = null;
    public String w = null;
    public String x = null;
    public String y = null;
    public boolean z = false;
    public boolean A = false;
    public boolean B = false;
    public boolean C = false;
    public boolean D = false;
    public final Set<fee> G = new HashSet();
    public final Set<tsd> H = new HashSet();
    public final ShopLoftComponent.c I = new e();
    public final ShopLoftComponent.a J = new f();
    public final oop.a K = new g();
    public final View.OnLayoutChangeListener L = new j();
    public final BroadcastReceiver M = new BroadcastReceiver() { // from class: com.alibaba.triver.triver_shop.container.ShopLoftActivity.12
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(AnonymousClass12 r2, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/container/ShopLoftActivity$12");
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            } else if (intent != null && !ShopLoftActivity.this.isFinishing() && ShopLoftActivity.KEY_SHOP_LOFT_BROADCAST_EVENT.equals(intent.getAction())) {
                String stringExtra = intent.getStringExtra("event");
                if (!TextUtils.isEmpty(stringExtra)) {
                    if (xpd.c.EVENT_ON_HIDE_BAR.equals(stringExtra)) {
                        ShopLoftActivity.E3(ShopLoftActivity.this);
                    }
                    if (xpd.c.EVENT_ON_SHOW_BAR.equals(stringExtra)) {
                        ShopLoftActivity.F3(ShopLoftActivity.this);
                    }
                }
            }
        }
    };

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class a implements TBPublicMenu.TBOnPublicMenuClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ TBPublicMenuItem f2968a;

        public a(TBPublicMenuItem tBPublicMenuItem) {
            this.f2968a = tBPublicMenuItem;
        }

        @Override // com.taobao.uikit.actionbar.TBPublicMenu.TBOnPublicMenuClickListener
        public void onPublicMenuItemClicked(TBPublicMenuItem tBPublicMenuItem) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("478e7772", new Object[]{this, tBPublicMenuItem});
            } else if (this.f2968a == tBPublicMenuItem) {
                ShopLoftActivity.this.b4();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class b implements ITBPublicMenu {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // com.taobao.uikit.actionbar.ITBPublicMenu
        public TBPublicMenu getPublicMenu() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TBPublicMenu) ipChange.ipc$dispatch("1f3d234e", new Object[]{this});
            }
            return null;
        }

        @Override // com.taobao.uikit.actionbar.ITBPublicMenu
        public Bundle pageUserInfo() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Bundle) ipChange.ipc$dispatch("65615653", new Object[]{this});
            }
            Bundle bundle = new Bundle();
            Bundle bundle2 = new Bundle();
            bundle2.putString("from", "shopVideo");
            JSONObject u = ShopLoftActivity.G3(ShopLoftActivity.this).u();
            JSONObject h = brf.h(u, "reportParams");
            if (h == null) {
                if (u != null) {
                    String string = u.getString("outerId");
                    if (string == null) {
                        string = u.getString("id");
                    }
                    bundle2.putString("subjectId", string);
                }
                bundle2.putString("subjectType", "VIDEO");
            } else {
                for (Map.Entry<String, Object> entry : h.entrySet()) {
                    String key = entry.getKey();
                    Object value = entry.getValue();
                    if (!(key == null || value == null)) {
                        bundle2.putString(key, value.toString());
                    }
                }
            }
            bundle.putBundle(jjx.ZZB_BUNDLE_KEY, bundle2);
            return bundle;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                ShopLoftActivity.l3(ShopLoftActivity.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class d extends oop.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/container/ShopLoftActivity$2");
        }

        @Override // tb.oop.a
        public void a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("630464bf", new Object[]{this, new Boolean(z)});
            } else {
                ShopLoftActivity.m3(ShopLoftActivity.this, z);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class e implements ShopLoftComponent.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e() {
        }

        @Override // com.alibaba.triver.triver_shop.container.shopLoft.ShopLoftComponent.c
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("156781e8", new Object[]{this});
                return;
            }
            if (!ShopLoftActivity.G3(ShopLoftActivity.this).E()) {
                kew.B(ShopLoftActivity.H3(ShopLoftActivity.this));
            }
            ShopLoftActivity.I3(ShopLoftActivity.this).setVisibility(8);
            ShopLoftActivity.J3(ShopLoftActivity.this).setVisibility(8);
            ShopLoftActivity.K3(ShopLoftActivity.this).setVisibility(8);
            ShopLoftActivity.L3(ShopLoftActivity.this).setVisibility(0);
            ShopLoftActivity.M3(ShopLoftActivity.this, true);
        }

        @Override // com.alibaba.triver.triver_shop.container.shopLoft.ShopLoftComponent.c
        public void b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bad4250c", new Object[]{this, str});
                return;
            }
            if (!ShopLoftActivity.G3(ShopLoftActivity.this).E()) {
                kew.B(ShopLoftActivity.H3(ShopLoftActivity.this));
            }
            if (ShopLoftViewManager.TYPE_NEW_DETAIL.equals(str)) {
                ShopLoftActivity.L3(ShopLoftActivity.this).setVisibility(8);
                ShopLoftActivity.I3(ShopLoftActivity.this).setVisibility(8);
                ShopLoftActivity.J3(ShopLoftActivity.this).setVisibility(8);
                ShopLoftActivity.K3(ShopLoftActivity.this).setVisibility(8);
            } else {
                ShopLoftActivity.L3(ShopLoftActivity.this).setVisibility(8);
                ShopLoftActivity.I3(ShopLoftActivity.this).setVisibility(0);
                ShopLoftActivity.J3(ShopLoftActivity.this).setVisibility(0);
                if (!ShopLoftActivity.n3(ShopLoftActivity.this)) {
                    ShopLoftActivity.K3(ShopLoftActivity.this).setVisibility(0);
                } else if (!aqp.Companion.T0()) {
                    ShopLoftActivity.K3(ShopLoftActivity.this).setVisibility(4);
                } else {
                    ShopLoftActivity.K3(ShopLoftActivity.this).setVisibility(0);
                }
            }
            if (ShopLoftViewManager.isNewShopLoftStyleType(str)) {
                ShopLoftActivity.K3(ShopLoftActivity.this).setVisibility(8);
                ShopLoftActivity.J3(ShopLoftActivity.this).setVisibility(8);
            }
            ShopLoftActivity.M3(ShopLoftActivity.this, false);
        }

        @Override // com.alibaba.triver.triver_shop.container.shopLoft.ShopLoftComponent.c
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bd14ee5e", new Object[]{this});
            } else {
                ShopLoftActivity.z3(ShopLoftActivity.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class g extends oop.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    Toast.makeText(ShopLoftActivity.this, "关注成功！可在『淘宝首页-关注』 看店铺动态哦", 0).show();
                }
            }
        }

        public g() {
        }

        public static /* synthetic */ Object ipc$super(g gVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/container/ShopLoftActivity$5");
        }

        @Override // tb.oop.a
        public void a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("630464bf", new Object[]{this, new Boolean(z)});
                return;
            }
            ShopLoftActivity.m3(ShopLoftActivity.this, z);
            if (z) {
                ShopLoftActivity.this.runOnUiThread(new a());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class h implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f2976a;

        public h(boolean z) {
            this.f2976a = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            ShopLoftActivity.x3(ShopLoftActivity.this, this.f2976a);
            if (this.f2976a) {
                ShopLoftActivity.K3(ShopLoftActivity.this).setText(gt9.TEXT_FOLLOW_DEFAULT);
            } else {
                ShopLoftActivity.K3(ShopLoftActivity.this).setText("+ 关注");
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class i implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    kew.B(ShopLoftActivity.H3(ShopLoftActivity.this));
                }
            }
        }

        public i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            kew.g0(ShopLoftActivity.H3(ShopLoftActivity.this));
            r54.D(new a(), 5000L);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class j implements View.OnLayoutChangeListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public j() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            WindowInsets rootWindowInsets;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("899df952", new Object[]{this, view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), new Integer(i7), new Integer(i8)});
                return;
            }
            if (Build.VERSION.SDK_INT < 28) {
                ShopLoftActivity.y3(ShopLoftActivity.this).setGuidelineBegin(kew.p(14));
            } else if (r54.t(ShopLoftActivity.this)) {
                ShopLoftActivity shopLoftActivity = ShopLoftActivity.this;
                rootWindowInsets = shopLoftActivity.getWindow().getDecorView().getRootWindowInsets();
                int g = nxq.g(shopLoftActivity, rootWindowInsets);
                npp.a("is cutout screen , " + g);
                int p = g + kew.p(14);
                ShopLoftActivity.y3(ShopLoftActivity.this).setGuidelineBegin(p);
                ShopLoftActivity.A3(ShopLoftActivity.this).setGuidelineBegin(p + kew.p(30));
            } else {
                ShopLoftActivity.y3(ShopLoftActivity.this).setGuidelineBegin(kew.p(14) + kew.p(30));
            }
            ShopLoftActivity.this.getWindow().getDecorView().removeOnLayoutChangeListener(ShopLoftActivity.B3(ShopLoftActivity.this));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class k implements d1a<xhv> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public k() {
        }

        /* renamed from: a */
        public xhv invoke() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (xhv) ipChange.ipc$dispatch("c1e1c5fe", new Object[]{this});
            }
            ShopBroadcastController.f(ShopLoftActivity.this).o(ShopLoftActivity.C3(ShopLoftActivity.this), ShopLoftActivity.D3(ShopLoftActivity.this));
            return xhv.INSTANCE;
        }
    }

    static {
        t2o.a(766509102);
        t2o.a(336592972);
        t2o.a(779093547);
        t2o.a(336592973);
        t2o.a(779093548);
    }

    public ShopLoftActivity() {
        aqp.a aVar = aqp.Companion;
        this.E = aVar.d();
        this.F = aVar.N();
    }

    public static /* synthetic */ Guideline A3(ShopLoftActivity shopLoftActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Guideline) ipChange.ipc$dispatch("a0dfb5ce", new Object[]{shopLoftActivity});
        }
        return shopLoftActivity.d;
    }

    public static /* synthetic */ View.OnLayoutChangeListener B3(ShopLoftActivity shopLoftActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View.OnLayoutChangeListener) ipChange.ipc$dispatch("866d9374", new Object[]{shopLoftActivity});
        }
        return shopLoftActivity.L;
    }

    public static /* synthetic */ String C3(ShopLoftActivity shopLoftActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e0784a72", new Object[]{shopLoftActivity});
        }
        return shopLoftActivity.v;
    }

    public static /* synthetic */ String D3(ShopLoftActivity shopLoftActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("87f42433", new Object[]{shopLoftActivity});
        }
        return shopLoftActivity.w;
    }

    public static /* synthetic */ void E3(ShopLoftActivity shopLoftActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cef542c", new Object[]{shopLoftActivity});
        } else {
            shopLoftActivity.R3();
        }
    }

    public static /* synthetic */ void F3(ShopLoftActivity shopLoftActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c71edc4b", new Object[]{shopLoftActivity});
        } else {
            shopLoftActivity.e4();
        }
    }

    public static /* synthetic */ ShopLoftComponent G3(ShopLoftActivity shopLoftActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ShopLoftComponent) ipChange.ipc$dispatch("559f6948", new Object[]{shopLoftActivity});
        }
        return shopLoftActivity.f2966a;
    }

    public static /* synthetic */ ViewGroup H3(ShopLoftActivity shopLoftActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("4f7251db", new Object[]{shopLoftActivity});
        }
        return shopLoftActivity.h;
    }

    public static /* synthetic */ Group I3(ShopLoftActivity shopLoftActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Group) ipChange.ipc$dispatch("d4cf4016", new Object[]{shopLoftActivity});
        }
        return shopLoftActivity.p;
    }

    public static /* synthetic */ TextView J3(ShopLoftActivity shopLoftActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextView) ipChange.ipc$dispatch("db941fac", new Object[]{shopLoftActivity});
        }
        return shopLoftActivity.l;
    }

    public static /* synthetic */ TextView K3(ShopLoftActivity shopLoftActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextView) ipChange.ipc$dispatch("1384facb", new Object[]{shopLoftActivity});
        }
        return shopLoftActivity.g;
    }

    public static /* synthetic */ Group L3(ShopLoftActivity shopLoftActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Group) ipChange.ipc$dispatch("df662919", new Object[]{shopLoftActivity});
        }
        return shopLoftActivity.q;
    }

    public static /* synthetic */ boolean M3(ShopLoftActivity shopLoftActivity, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d6905de5", new Object[]{shopLoftActivity, new Boolean(z)})).booleanValue();
        }
        shopLoftActivity.B = z;
        return z;
    }

    public static /* synthetic */ Object ipc$super(ShopLoftActivity shopLoftActivity, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1512649357:
                super.onResume();
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case 188604040:
                super.onStop();
                return null;
            case 514894248:
                super.attachBaseContext((Context) objArr[0]);
                return null;
            case 797441118:
                super.onPause();
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/triver/triver_shop/container/ShopLoftActivity");
        }
    }

    public static /* synthetic */ void l3(ShopLoftActivity shopLoftActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("800a6e7e", new Object[]{shopLoftActivity});
        } else {
            shopLoftActivity.O3();
        }
    }

    public static /* synthetic */ void m3(ShopLoftActivity shopLoftActivity, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d058fd7", new Object[]{shopLoftActivity, new Boolean(z)});
        } else {
            shopLoftActivity.g4(z);
        }
    }

    public static /* synthetic */ boolean n3(ShopLoftActivity shopLoftActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d86fb7f3", new Object[]{shopLoftActivity})).booleanValue();
        }
        return shopLoftActivity.z;
    }

    public static /* synthetic */ ViewGroup o3(ShopLoftActivity shopLoftActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("48c3aa47", new Object[]{shopLoftActivity});
        }
        return shopLoftActivity.o;
    }

    public static /* synthetic */ void p3(ShopLoftActivity shopLoftActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("accec82d", new Object[]{shopLoftActivity});
        } else {
            shopLoftActivity.N3();
        }
    }

    public static /* synthetic */ boolean q3(ShopLoftActivity shopLoftActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("16fe5050", new Object[]{shopLoftActivity})).booleanValue();
        }
        return shopLoftActivity.D;
    }

    public static /* synthetic */ boolean r3(ShopLoftActivity shopLoftActivity, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("644b5c0e", new Object[]{shopLoftActivity, new Boolean(z)})).booleanValue();
        }
        shopLoftActivity.D = z;
        return z;
    }

    public static /* synthetic */ String s3(ShopLoftActivity shopLoftActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e7709f95", new Object[]{shopLoftActivity});
        }
        return shopLoftActivity.x;
    }

    public static /* synthetic */ String t3(ShopLoftActivity shopLoftActivity, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("748c7f4d", new Object[]{shopLoftActivity, str});
        }
        shopLoftActivity.x = str;
        return str;
    }

    public static /* synthetic */ void u3(ShopLoftActivity shopLoftActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb5d608a", new Object[]{shopLoftActivity});
        } else {
            shopLoftActivity.T3();
        }
    }

    public static /* synthetic */ boolean v3(ShopLoftActivity shopLoftActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("558ce8ad", new Object[]{shopLoftActivity})).booleanValue();
        }
        return shopLoftActivity.C;
    }

    public static /* synthetic */ ShopLoftComponent.c w3(ShopLoftActivity shopLoftActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ShopLoftComponent.c) ipChange.ipc$dispatch("81b70ee4", new Object[]{shopLoftActivity});
        }
        return shopLoftActivity.I;
    }

    public static /* synthetic */ boolean x3(ShopLoftActivity shopLoftActivity, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("af12c6d3", new Object[]{shopLoftActivity, new Boolean(z)})).booleanValue();
        }
        shopLoftActivity.A = z;
        return z;
    }

    public static /* synthetic */ Guideline y3(ShopLoftActivity shopLoftActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Guideline) ipChange.ipc$dispatch("49d2aeb8", new Object[]{shopLoftActivity});
        }
        return shopLoftActivity.c;
    }

    public static /* synthetic */ void z3(ShopLoftActivity shopLoftActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54697ebc", new Object[]{shopLoftActivity});
        } else {
            shopLoftActivity.d4();
        }
    }

    @Override // tb.tsd
    public void G(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("147e80ea", new Object[]{this, str, jSONObject});
            return;
        }
        Iterator it = ((HashSet) this.H).iterator();
        while (it.hasNext()) {
            ((tsd) it.next()).G(str, jSONObject);
        }
    }

    @Override // tb.hee
    public void I1(fee feeVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a387060e", new Object[]{this, feeVar});
        } else {
            ((HashSet) this.G).add(feeVar);
        }
    }

    public final void N3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f93d73c0", new Object[]{this});
            return;
        }
        kew.B(this.j);
        kew.B(this.k);
    }

    public final void O3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96c2edc0", new Object[]{this});
            return;
        }
        a1v.n("Page_Shop_2Fcontentframe", "Page_Shop_2Fcontentframe_return_exposure", Q3("a2141.b69949920.c1638979320799.d1638979320799"));
        if (this.z) {
            a1v.n("Page_Shop_2Fcontentframe", "Page_Shop_2Fcontentframe_subscribe_exposure", Q3("a2141.b69949920.c1638979522235.d1638979522235"));
        } else {
            a1v.n("Page_Shop_2Fcontentframe", "Page_Shop_2Fcontentframe_shopenter_exposure", Q3("a2141.b69949920.c1638979452785.d1638979452785"));
        }
        a1v.n("Page_Shop_2Fcontentframe", "Page_Shop_2Fcontentframe_more_exposure", Q3("a2141.b69949920.c1638979581592.d1638979581592"));
    }

    public final Bundle P3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bundle) ipChange.ipc$dispatch("30dee63e", new Object[]{this});
        }
        Bundle bundle = new Bundle();
        Intent intent = getIntent();
        if (intent != null) {
            Uri data = intent.getData();
            if (data != null) {
                String queryParameter = data.getQueryParameter("loftData");
                npp.a("shopLoftActivity url : " + data);
                "true".equals(data.getQueryParameter("benefitPop"));
                bundle.putString(AgooConstants.MESSAGE_EXT, data.getQueryParameter(AgooConstants.MESSAGE_EXT));
                bundle.putString("loftData", queryParameter);
                String queryParameter2 = data.getQueryParameter("seller_id");
                if (queryParameter2 == null) {
                    queryParameter2 = data.getQueryParameter("sellerId");
                }
                bundle.putString("seller_id", queryParameter2);
                bundle.putString("first_media_id", data.getQueryParameter("first_media_id"));
                bundle.putString("source", data.getQueryParameter("source"));
                bundle.putString("title", data.getQueryParameter("title"));
                String queryParameter3 = data.getQueryParameter("shop_id");
                if (queryParameter3 == null) {
                    queryParameter3 = data.getQueryParameter("shopId");
                }
                bundle.putString("shop_id", queryParameter3);
                bundle.putString("first_media_scene", data.getQueryParameter("first_media_scene"));
                bundle.putString("entrySpm", data.getQueryParameter("spm"));
                bundle.putString("widgetShareParams", data.getQueryParameter("widgetShareParams"));
                bundle.putString("loftUrl", data.toString());
                this.s = data.getQueryParameter("title");
                this.t = data.getQueryParameter("source");
                this.v = queryParameter3;
                this.u = queryParameter2;
                this.w = data.getQueryParameter("shopInstance_id");
            }
            Bundle extras = intent.getExtras();
            if (extras != null) {
                bundle.putString("initMuteStatus", extras.getString("initMuteStatus"));
            }
        }
        return bundle;
    }

    public final Map<String, String> Q3(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("a98d0e8e", new Object[]{this, str});
        }
        String v = this.f2966a.v();
        if (ShopLoftViewManager.TYPE_LIVE.equals(v)) {
            v = "live";
        } else if (ShopLoftViewManager.TYPE_VIDEO.equals(v)) {
            v = "2FVideo";
        } else if (ShopLoftViewManager.TYPE_MARKET.equals(v)) {
            v = "2FMarket";
        }
        HashMap hashMap = new HashMap();
        hashMap.put("shop_id", this.v);
        hashMap.put("seller_id", this.u);
        hashMap.put("spm", str);
        hashMap.put("tag", v);
        return hashMap;
    }

    public final void R3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3037d43", new Object[]{this});
        } else if (this.B) {
            this.q.setVisibility(8);
        } else {
            this.p.setVisibility(8);
            this.l.setVisibility(8);
            this.g.setVisibility(8);
        }
    }

    @Override // tb.tsd
    public void S0(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee651ff0", new Object[]{this, jSONObject});
            return;
        }
        Iterator it = ((HashSet) this.H).iterator();
        while (it.hasNext()) {
            ((tsd) it.next()).S0(jSONObject);
        }
    }

    public final void S3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6e37be8", new Object[]{this});
        } else {
            this.j.setImageUrl("https://img.alicdn.com/imgextra/i1/O1CN01FgfnlT1jp12NW7WKj_!!6000000004596-1-tps-216-216.gif");
        }
    }

    public final void T3() {
        RVAccountService rVAccountService;
        String userId;
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38b367c0", new Object[]{this});
        } else if (!this.C && (rVAccountService = (RVAccountService) RVProxy.get(RVAccountService.class)) != null && (userId = rVAccountService.getUserId(null)) != null) {
            if (aqp.Companion.J()) {
                z = Y3(userId);
            } else {
                z = X3(userId);
            }
            if (z) {
                f4();
            }
            this.C = true;
        }
    }

    public final void U3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6d127e9", new Object[]{this});
            return;
        }
        TBPublicMenuItem build = new TBPublicMenuItem.Builder().setTitle("ꄪ:分享").build();
        ArrayList<TBPublicMenuItem> arrayList = new ArrayList<>();
        arrayList.add(build);
        this.r.addCustomMenus(arrayList, new a(build));
    }

    public final void V3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("454a38a9", new Object[]{this});
            return;
        }
        boolean equals = "shop".equals(this.t);
        this.z = equals;
        if (equals) {
            this.g.setText("+ 关注");
            oop.b(this, this.u, new d());
            if (!aqp.Companion.T0()) {
                this.g.setVisibility(4);
            }
        }
    }

    public final void W3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce529ddc", new Object[]{this});
            return;
        }
        this.b = (FrameLayout) findViewById(R.id.shop_loft_center_container);
        this.c = (Guideline) findViewById(R.id.shop_loft_statusBarLine);
        this.d = (Guideline) findViewById(R.id.shop_loft_header_bottom_line);
        this.e = (ImageView) findViewById(R.id.shop_loft_back_button);
        this.f = (ImageView) findViewById(R.id.shop_loft_more_button);
        TextView textView = (TextView) findViewById(R.id.shop_loft_title);
        this.l = textView;
        this.g = (TextView) findViewById(R.id.shop_loft_in_shop_button);
        TextView textView2 = (TextView) findViewById(R.id.shop_loft_guid_button);
        this.i = (TUrlImageView) findViewById(R.id.shop_loft_swipe_icon);
        this.h = (ViewGroup) findViewById(R.id.shop_loft_guide_frame);
        this.j = (TUrlImageView) findViewById(R.id.shop_loft_continue_swipe_up_img);
        this.k = (TextView) findViewById(R.id.shop_loft_continue_text);
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.shop_loft_live_more_layout);
        this.m = (ImageView) findViewById(R.id.shop_loft_live_close_button);
        this.n = (ImageView) findViewById(R.id.shop_loft_live_more_button);
        this.p = (Group) findViewById(R.id.shop_loft_common_title_group);
        this.q = (Group) findViewById(R.id.shop_loft_live_controller);
        this.o = (ViewGroup) findViewById(R.id.shop_loft_error_layout);
        this.e.setOnClickListener(this);
        this.f.setOnClickListener(this);
        this.g.setOnClickListener(this);
        this.m.setOnClickListener(this);
        this.n.setOnClickListener(this);
        textView.setText(this.s);
        getWindow().getDecorView().addOnLayoutChangeListener(this.L);
        try {
            View findViewById = this.o.findViewById(R.id.shop_loft_no_data_image);
            if (findViewById instanceof TUrlImageView) {
                ((TUrlImageView) findViewById).setImageUrl("https://gw.alicdn.com/imgextra/i1/O1CN012ByUmB1g6BZhIrRaa_!!6000000004092-0-tps-480-480.jpg");
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public final void Z3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4293886", new Object[]{this});
            return;
        }
        Nav.from(this).toUri("https://shop" + this.v + ".taobao.com?shopFrameworkType=native");
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1eb0a9a8", new Object[]{this, context});
            return;
        }
        super.attachBaseContext(context);
        acq.B(context);
    }

    public void b4() {
        ShareContent y;
        String str;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16ed87fd", new Object[]{this});
            return;
        }
        ShopLoftComponent shopLoftComponent = this.f2966a;
        if (!(shopLoftComponent == null || (y = shopLoftComponent.y()) == null)) {
            y.businessId = "Shop_2F";
            y.templateId = "weex";
            Map<String, String> map = y.extendParams;
            if (map != null) {
                str = map.get("id");
                str2 = map.get("scene");
            } else {
                str = null;
                str2 = null;
            }
            if (str == null || str2 == null) {
                npp.a("firstMediaId = " + str + ", firstMediaScene = " + str2 + ", has null value , can not share");
                return;
            }
            Uri.Builder buildUpon = Uri.parse(KEY_SHARE_URL_BASE).buildUpon();
            buildUpon.appendQueryParameter("seller_id", this.u);
            buildUpon.appendQueryParameter("shop_id", this.v);
            buildUpon.appendQueryParameter("first_media_scene", str2);
            buildUpon.appendQueryParameter("first_media_id", str);
            buildUpon.appendQueryParameter("title", this.s);
            JSONObject z = this.f2966a.z();
            if (z != null) {
                for (Map.Entry<String, Object> entry : z.entrySet()) {
                    String key = entry.getKey();
                    Object value = entry.getValue();
                    if (value != null) {
                        buildUpon.appendQueryParameter(key, value.toString());
                    }
                }
            }
            y.url = buildUpon.build().toString();
            sqp.a(this, y, "");
        }
    }

    public final void c4() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8ade088", new Object[]{this});
        } else if (this.A) {
            oop.c(this, this.u, this.K);
        } else {
            oop.a(this, this.u, this.K);
        }
    }

    public final void d4() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93513095", new Object[]{this});
            return;
        }
        kew.g0(this.j);
        kew.g0(this.k);
    }

    public final void e4() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f75057be", new Object[]{this});
        } else if (this.B) {
            this.q.setVisibility(0);
        } else {
            this.p.setVisibility(0);
            this.l.setVisibility(0);
            if (!this.z) {
                this.g.setVisibility(0);
            } else if (!aqp.Companion.T0()) {
                this.g.setVisibility(4);
            } else {
                this.g.setVisibility(0);
            }
        }
    }

    @Override // tb.yfb
    public void g0(tsd tsdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c530150c", new Object[]{this, tsdVar});
        } else {
            ((HashSet) this.H).add(tsdVar);
        }
    }

    public final void g4(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ac8d4c2", new Object[]{this, new Boolean(z)});
        } else {
            runOnUiThread(new h(z));
        }
    }

    @Override // tb.fee
    public void h(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2962cd0d", new Object[]{this, str, jSONObject});
            return;
        }
        Iterator it = ((HashSet) this.G).iterator();
        while (it.hasNext()) {
            ((fee) it.next()).h(str, jSONObject);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            return;
        }
        if (view == this.e) {
            a1v.m("Page_Shop_2Fcontentframe", "Page_Shop_2Fcontentframe_return_click", Q3("a2141.b69949920.c1638979252920.d1638979252920"));
            finish();
        }
        if (view == this.f) {
            a1v.m("Page_Shop_2Fcontentframe", "Page_Shop_2Fcontentframe_more_click", Q3("a2141.b69949920.c1638979554470.d1638979554470"));
            a4();
        }
        if (view == this.g) {
            if (this.z) {
                a1v.m("Page_Shop_2Fcontentframe", "Page_Shop_2Fcontentframe_subscribe_click", Q3("a2141.b69949920.c1638979495158.d1638979495158"));
                c4();
                return;
            }
            a1v.m("Page_Shop_2Fcontentframe", "Page_Shop_2Fcontentframe_shopenter_click", Q3("a2141.b69949920.c1638979415659.d1638979415659"));
            Z3();
        }
        if (view == this.n) {
            a1v.m("Page_Shop_2Fcontentframe", "Page_Shop_2Fcontentframe_more_click", Q3("a2141.b69949920.c1638979554470.d1638979554470"));
            a4();
        }
        if (view == this.m) {
            a1v.m("Page_Shop_2Fcontentframe", "Page_Shop_2Fcontentframe_return_click", Q3("a2141.b69949920.c1638979252920.d1638979252920"));
            finish();
            r54.E(new k(), 300L);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        O.a(this);
        setContentView(R.layout.activity_shop_loft);
        this.y = UTAnalytics.getInstance().getDefaultTracker().getPageSpmPre(this);
        npp.a("entrySpm : " + this.y);
        UTAnalytics.getInstance().getDefaultTracker().skipPage(this);
        UTAnalytics.getInstance().getDefaultTracker().pageAppearDonotSkip(this);
        Bundle P3 = P3();
        W3();
        S3();
        V3();
        ShopLoftComponent shopLoftComponent = new ShopLoftComponent();
        this.f2966a = shopLoftComponent;
        shopLoftComponent.M(this.J);
        this.f2966a.Q(this.I);
        this.f2966a.B(this, P3);
        this.b.addView(this.f2966a.A());
        ActionBar actionBar = getActionBar();
        if (actionBar != null) {
            actionBar.hide();
        }
        r54.D(new c(), 500L);
        LocalBroadcastManager.getInstance(this).registerReceiver(this.M, new IntentFilter(KEY_SHOP_LOFT_BROADCAST_EVENT));
        boolean q0 = aqp.Companion.q0();
        if (!q0) {
            N3();
        }
        this.f2966a.N(q0);
        try {
            ShopExtKt.n0(this, getIntent().getData());
        } catch (Throwable th) {
            npp.Companion.d(th);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        O.j(this);
        ShopLoftComponent shopLoftComponent = this.f2966a;
        if (shopLoftComponent != null) {
            shopLoftComponent.J();
        }
        ShopBroadcastController.f(this).u();
        LocalBroadcastManager.getInstance(this).unregisterReceiver(this.M);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        this.f2966a.F();
        super.onPause();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        this.f2966a.G();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
            return;
        }
        super.onStop();
        this.f2966a.H();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class f implements ShopLoftComponent.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public f() {
        }

        @Override // com.alibaba.triver.triver_shop.container.shopLoft.ShopLoftComponent.a
        public void a(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("35700a49", new Object[]{this, jSONObject});
            } else if (ShopLoftActivity.s3(ShopLoftActivity.this) == null && !ShopLoftActivity.v3(ShopLoftActivity.this)) {
                ShopLoftActivity.t3(ShopLoftActivity.this, jSONObject.getString("sceneId"));
                if ("663".equals(ShopLoftActivity.s3(ShopLoftActivity.this))) {
                    ShopLoftActivity.w3(ShopLoftActivity.this).b(ShopLoftViewManager.TYPE_NEW_DETAIL);
                }
                ShopLoftActivity shopLoftActivity = ShopLoftActivity.this;
                if (!shopLoftActivity.F) {
                    ShopLoftActivity.u3(shopLoftActivity);
                }
            }
        }

        @Override // com.alibaba.triver.triver_shop.container.shopLoft.ShopLoftComponent.a
        public void b(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("751fd58a", new Object[]{this, new Boolean(z)});
            } else if (z) {
                kew.g0(ShopLoftActivity.o3(ShopLoftActivity.this));
                ShopLoftActivity.p3(ShopLoftActivity.this);
            }
        }

        @Override // com.alibaba.triver.triver_shop.container.shopLoft.ShopLoftComponent.a
        public void c(ArrayList<JSONObject> arrayList) {
            JSONObject jSONObject;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b68ce6e4", new Object[]{this, arrayList});
            } else if (arrayList.size() != 0 && (jSONObject = arrayList.get(0)) != null) {
                kew.B(ShopLoftActivity.o3(ShopLoftActivity.this));
                if (!ShopLoftActivity.q3(ShopLoftActivity.this)) {
                    ShopLoftActivity.t3(ShopLoftActivity.this, jSONObject.getString("sceneId"));
                    ShopLoftActivity shopLoftActivity = ShopLoftActivity.this;
                    if (shopLoftActivity.E) {
                        if (!ShopLoftViewManager.TYPE_LIVE.equals(ShopLoftViewManager.getTypeFromSceneId(ShopLoftActivity.s3(shopLoftActivity)))) {
                            ShopLoftActivity.u3(ShopLoftActivity.this);
                        }
                    } else if ((ShopLoftActivity.s3(shopLoftActivity) == null && !ShopLoftActivity.v3(ShopLoftActivity.this)) || ShopLoftActivity.this.F) {
                        ShopLoftActivity.u3(ShopLoftActivity.this);
                    } else {
                        return;
                    }
                    ShopLoftActivity.r3(ShopLoftActivity.this, true);
                }
            }
        }
    }

    public final void a4() {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28361365", new Object[]{this});
            return;
        }
        this.r = new TBPublicMenu(this, new b());
        String i2 = brf.i(this.f2966a.u(), "ifShowReport");
        if (i2 != null) {
            z = "true".equals(i2);
        }
        if (!z) {
            this.r.removeCustomMenuItemsByType("report");
        }
        U3();
        this.r.show();
    }

    public final void f4() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ecda0ad", new Object[]{this});
            return;
        }
        this.i.setSkipAutoSize(true);
        this.i.setImageUrl("https://gw.alicdn.com/tfs/TB1b3uZhRBh1e4jSZFhXXcC9VXa-540-540.png");
        r54.D(new i(), 500L);
    }

    public final boolean X3(String str) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2c5c8abb", new Object[]{this, str})).booleanValue();
        }
        String q = r54.q(this, "shopLoftActivity", str);
        long M = r54.M(q);
        long currentTimeMillis = System.currentTimeMillis();
        if (!TextUtils.isEmpty(q) && currentTimeMillis - M < pqw.DEFAULT_MAX_AGE) {
            z = false;
        }
        if (z) {
            r54.O(this, "shopLoftActivity", str, Long.toString(currentTimeMillis));
        }
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00bb, code lost:
        if ((r10 - r12) >= (r9[r0] * 86400000)) goto L_0x00c4;
     */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean Y3(java.lang.String r19) {
        /*
            Method dump skipped, instructions count: 238
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.triver.triver_shop.container.ShopLoftActivity.Y3(java.lang.String):boolean");
    }
}
