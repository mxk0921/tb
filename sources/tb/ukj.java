package tb;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.cardview.widget.CardView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.TBDeviceUtils;
import com.taobao.schedule.ViewProxy;
import com.taobao.share.globalmodel.TBShareContent;
import com.taobao.share.multiapp.ShareBizAdapter;
import com.taobao.share.ui.engine.render.PanelWindow;
import com.taobao.share.ui.engine.render.b;
import com.taobao.share.ui.engine.weex.WeexBizView;
import com.taobao.statistic.TBS;
import com.taobao.tao.sharepanel.normal.view.ChannelPanel;
import com.taobao.tao.util.SpUtils;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import tb.lkp;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class ukj implements View.OnClickListener, com.taobao.share.ui.engine.render.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final String l = ukj.class.getSimpleName();

    /* renamed from: a  reason: collision with root package name */
    public View f29437a;
    public WeexBizView b;
    public View c;
    public RelativeLayout d;
    public ChannelPanel e;
    public aip f;
    public WeakReference<Activity> g;
    public LinearLayout h;
    public PanelWindow.b i;
    public boolean j = true;
    public final hpd k;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            TBS.Ext.commitEvent("Button_ClickRules", (Properties) null);
            PanelWindow.b bVar = ukj.this.i;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements WeexBizView.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // com.taobao.share.ui.engine.weex.WeexBizView.a
        public void a(String str, Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d2d1f986", new Object[]{this, str, map});
                return;
            }
            ukj.a();
            ukj.b(ukj.this).clear();
        }

        @Override // com.taobao.share.ui.engine.weex.WeexBizView.a
        public void b(WeexBizView weexBizView) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4e81cc09", new Object[]{this, weexBizView});
                return;
            }
            ukj.a();
            ukj.b(ukj.this).setVisibility(4);
        }

        @Override // com.taobao.share.ui.engine.weex.WeexBizView.a
        public void c(WeexBizView weexBizView, View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4569b455", new Object[]{this, weexBizView, view});
            } else {
                ukj.a();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class c implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            ukj.c(ukj.this).setVisibility(8);
            SpUtils.cacheSaveGuide(SpUtils.START_GUIDE_NEW, true);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class d implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ f8a f29441a;

        public d(f8a f8aVar) {
            this.f29441a = f8aVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            ukj.c(ukj.this).setVisibility(8);
            SpUtils.cacheSaveGuide(SpUtils.SHARE_GUIDE, true);
            this.f29441a.e();
        }
    }

    static {
        t2o.a(666894569);
        t2o.a(667942961);
    }

    public ukj(Activity activity, hpd hpdVar) {
        View f = f(activity);
        this.f29437a = f;
        if (f != null) {
            this.k = hpdVar;
            this.g = new WeakReference<>(activity);
            return;
        }
        throw new RuntimeException("please actualize menu view");
    }

    public static /* synthetic */ String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7022ea09", new Object[0]);
        }
        return l;
    }

    public static /* synthetic */ WeexBizView b(ukj ukjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexBizView) ipChange.ipc$dispatch("2323d45b", new Object[]{ukjVar});
        }
        return ukjVar.b;
    }

    public static /* synthetic */ View c(ukj ukjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("547bd709", new Object[]{ukjVar});
        }
        return ukjVar.c;
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42d4c54", new Object[]{this});
            return;
        }
        WeexBizView weexBizView = this.b;
        if (weexBizView != null) {
            weexBizView.clear();
        }
    }

    public View f(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("6c9f9096", new Object[]{this, activity});
        }
        this.g = new WeakReference<>(activity);
        View inflate = LayoutInflater.from(activity).inflate(R.layout.share_new_menu_layout, (ViewGroup) null);
        this.f29437a = inflate;
        this.c = inflate.findViewById(R.id.share_new_menu_guide);
        this.d = (RelativeLayout) this.f29437a.findViewById(R.id.share_template_merge_layout);
        this.h = (LinearLayout) this.f29437a.findViewById(R.id.ll_share_bottom);
        return this.f29437a;
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae28e211", new Object[]{this});
            return;
        }
        PanelWindow.b bVar = this.i;
        if (bVar != null) {
            ((b.a) bVar).a();
        }
    }

    public ChannelPanel h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ChannelPanel) ipChange.ipc$dispatch("2326723f", new Object[]{this});
        }
        return this.e;
    }

    public aip i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (aip) ipChange.ipc$dispatch("dbbf858d", new Object[]{this});
        }
        return this.f;
    }

    public View j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("942f6f29", new Object[]{this});
        }
        View view = this.f29437a;
        if (view != null) {
            return view;
        }
        return null;
    }

    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96d7f4c5", new Object[]{this});
            return;
        }
        RelativeLayout relativeLayout = (RelativeLayout) this.f29437a.findViewById(R.id.share_new_menu_container_layout);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) relativeLayout.getLayoutParams();
        layoutParams.setMargins(0, 0, 0, lr7.b(gjp.a(), 132));
        relativeLayout.setLayoutParams(layoutParams);
        this.e.k();
    }

    public void l(TBShareContent tBShareContent, gwr gwrVar) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d69a8ab", new Object[]{this, tBShareContent, gwrVar});
            return;
        }
        WeakReference<Activity> weakReference = this.g;
        if (weakReference != null && weakReference.get() != null) {
            Activity activity = this.g.get();
            if (gwrVar == null || TextUtils.isEmpty(gwrVar.f20274a)) {
                this.b.clear();
                this.b.setVisibility(8);
                return;
            }
            ShareBizAdapter instance = ShareBizAdapter.getInstance();
            if (tBShareContent != null) {
                str = tBShareContent.businessId;
            } else {
                str = "";
            }
            upd shareWeexSdk = instance.getShareWeexSdk(str);
            if (shareWeexSdk != null) {
                shareWeexSdk.b();
            }
            if (!n(activity)) {
                WeexBizView weexBizView = new WeexBizView(activity);
                this.b = weexBizView;
                weexBizView.setLayoutParams(new FrameLayout.LayoutParams(-1, lr7.b(activity, 240.0f)));
                ((RelativeLayout) this.f29437a.findViewById(R.id.share_new_menu_container_layout)).addView(this.b, 0);
                this.b.setVisibility(0);
                s(gwrVar.f20274a, tBShareContent);
                this.b.setOnClickListener(new a());
            }
        }
    }

    public boolean m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("db8194ef", new Object[]{this})).booleanValue();
        }
        return this.j;
    }

    public final boolean n(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("541ca7ee", new Object[]{this, context})).booleanValue();
        }
        try {
            if (TBDeviceUtils.G(context)) {
                return true;
            }
            if (TBDeviceUtils.t(context)) {
                return true;
            }
            return false;
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }

    public void o(String str, boolean z) {
        int i;
        boolean z2 = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85bd164c", new Object[]{this, str, new Boolean(z)});
            return;
        }
        WeakReference<Activity> weakReference = this.g;
        if (weakReference != null && weakReference.get() != null) {
            Activity activity = this.g.get();
            aip a2 = bip.a(activity, str);
            this.f = a2;
            if (a2 != null) {
                this.d.addView(((iip) a2).e(activity));
                TBShareContent e = bwr.h().e();
                if (e != null) {
                    TBS.Ext.commitEvent("Page_Share", 19999, "CardShow", e.businessId, null, e.businessId + "," + e.templateId + "," + ShareBizAdapter.getInstance().getLogin().getUserId());
                }
            }
            ChannelPanel channelPanel = new ChannelPanel();
            this.e = channelPanel;
            if (this.f == null) {
                z2 = false;
            }
            channelPanel.n(str, z, z2);
            this.e.m(this.k);
            View h = this.e.h(activity);
            this.h.removeAllViews();
            this.h.addView(h);
            RelativeLayout relativeLayout = (RelativeLayout) this.f29437a.findViewById(R.id.share_new_menu_container_layout);
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) relativeLayout.getLayoutParams();
            if (!z) {
                i = 132;
            } else {
                i = 210;
            }
            layoutParams.setMargins(0, 0, 0, lr7.b(activity, i));
            relativeLayout.setLayoutParams(layoutParams);
            ViewProxy.setOnClickListener(h.findViewById(R.id.tv_cancel_share_common), this);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
        } else if (view.getId() == R.id.tv_cancel_share_common) {
            long currentTimeMillis = System.currentTimeMillis();
            if (this.i != null) {
                g();
                TBShareContent e = bwr.h().e();
                if (e != null) {
                    String str = e.businessId;
                    TBS.Ext.commitEvent("Page_Share", 19999, "Cancel", str, null, e.businessId + "," + e.templateId + "," + (System.currentTimeMillis() - currentTimeMillis) + "," + ShareBizAdapter.getInstance().getLogin().getUserId());
                }
            }
        }
    }

    public void p(PanelWindow.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2bec64f", new Object[]{this, bVar});
        } else {
            this.i = bVar;
        }
    }

    public void q(f8a f8aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38196ac6", new Object[]{this, f8aVar});
            return;
        }
        Application a2 = gjp.a();
        this.c.setVisibility(0);
        TUrlImageView tUrlImageView = (TUrlImageView) this.f29437a.findViewById(R.id.share_new_menu_guide_img_view);
        ((LinearLayout) this.f29437a.findViewById(R.id.share_ll_guide)).setVisibility(8);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) tUrlImageView.getLayoutParams();
        layoutParams.setMargins(lr7.b(a2, 30.0f), 0, lr7.b(a2, 50.0f), lr7.b(a2, 40.0f));
        tUrlImageView.setLayoutParams(layoutParams);
        String b2 = lkp.b.b();
        if (TextUtils.isEmpty(b2)) {
            b2 = "https://img.alicdn.com/tfs/TB1SKoBUG6qK1RjSZFmXXX0PFXa-879-482.png";
        }
        tUrlImageView.setImageUrl(b2);
        ViewProxy.setOnClickListener(this.c, new d(f8aVar));
    }

    public void d(a22 a22Var) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26b4b018", new Object[]{this, a22Var});
            return;
        }
        WeakReference<Activity> weakReference = this.g;
        if (!(weakReference == null || weakReference.get() == null)) {
            Activity activity = this.g.get();
            int width = ((WindowManager) activity.getSystemService(pg1.ATOM_EXT_window)).getDefaultDisplay().getWidth();
            CardView cardView = (CardView) this.f29437a.findViewById(R.id.share_new_menu_container);
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) cardView.getLayoutParams();
            int i2 = (width * 70) / 375;
            if (!n(activity)) {
                i = lr7.b(activity, 65.0f);
            }
            layoutParams.setMargins(i2, i, i2, 30);
            cardView.setLayoutParams(layoutParams);
        }
        aip aipVar = this.f;
        if (aipVar != null) {
            ((iip) aipVar).d(a22Var);
        }
    }

    public void r(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3950c15a", new Object[]{this, str});
        } else if (!SpUtils.getGuide(gjp.a(), SpUtils.START_GUIDE_NEW) && !TextUtils.equals("common", str)) {
            this.c.setVisibility(0);
            TUrlImageView tUrlImageView = (TUrlImageView) this.f29437a.findViewById(R.id.share_new_menu_guide_img_view_new);
            ((LinearLayout) this.f29437a.findViewById(R.id.share_ll_guide)).setVisibility(0);
            String d2 = lkp.b.d();
            if (TextUtils.isEmpty(d2)) {
                d2 = gjp.a().getString(R.string.share_guide_tips);
            }
            tUrlImageView.setImageUrl(d2);
            ViewProxy.setOnClickListener(this.c, new c());
        }
    }

    public final void s(String str, TBShareContent tBShareContent) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd4785ee", new Object[]{this, str, tBShareContent});
            return;
        }
        WeakReference<Activity> weakReference = this.g;
        if (weakReference != null && weakReference.get() != null) {
            Activity activity = this.g.get();
            WeexBizView weexBizView = this.b;
            b bVar = new b();
            if (tBShareContent != null) {
                str2 = tBShareContent.businessId;
            } else {
                str2 = "";
            }
            weexBizView.init(activity, bVar, str2);
            this.b.setVisibility(0);
            HashMap hashMap = new HashMap();
            Map<String, String> map = tBShareContent.extraParams;
            if (map != null) {
                hashMap.putAll(map);
            }
            hashMap.put("bizID", tBShareContent.businessId);
            hashMap.put("url", tBShareContent.url);
            hashMap.put("imageUrl", tBShareContent.imageUrl);
            hashMap.put("title", tBShareContent.title);
            hashMap.put("desc", tBShareContent.description);
            this.b.render(str, hashMap, null);
        }
    }
}
