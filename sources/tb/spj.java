package tb;

import android.app.Activity;
import android.text.TextUtils;
import com.alibaba.ability.localization.Localization;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import com.taobao.share.globalmodel.TBShareContent;
import com.taobao.share.multiapp.ShareBizAdapter;
import com.taobao.share.ui.engine.friend.ContactInfo;
import com.taobao.statistic.TBS;
import com.taobao.tao.channel.ChannelProvider;
import com.taobao.taobao.R;
import com.taobao.uikit.actionbar.TBPublicMenu;
import com.taobao.uikit.actionbar.TBPublicMenuItem;
import com.ut.share.business.ShareBusiness;
import com.ut.share.business.ShareContent;
import com.ut.share.business.ShareTargetType;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.eqb;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class spj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public TBPublicMenuItem f28199a;
    public WeakReference<TBPublicMenu> b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements TBPublicMenu.InitShareCallBack {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // com.taobao.uikit.actionbar.TBPublicMenu.InitShareCallBack
        public void callBack(Activity activity, TBPublicMenu tBPublicMenu, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d45d1617", new Object[]{this, activity, tBPublicMenu, obj});
            } else if (!Localization.p()) {
                spj.a(spj.this, activity, tBPublicMenu, obj);
            } else {
                spj.b(spj.this, activity, tBPublicMenu, obj);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements ChannelProvider.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ rip f28201a;
        public final /* synthetic */ TBPublicMenu b;
        public final /* synthetic */ JSONObject c;
        public final /* synthetic */ ArrayList d;
        public final /* synthetic */ Map e;

        public b(rip ripVar, TBPublicMenu tBPublicMenu, JSONObject jSONObject, ArrayList arrayList, Map map) {
            this.f28201a = ripVar;
            this.b = tBPublicMenu;
            this.c = jSONObject;
            this.d = arrayList;
            this.e = map;
        }

        @Override // com.taobao.tao.channel.ChannelProvider.c
        public void onConfigData(TBShareContent tBShareContent, li3 li3Var, String str, int i, boolean z, String str2, String str3, String str4) {
            String str5;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d70378cc", new Object[]{this, tBShareContent, li3Var, str, new Integer(i), new Boolean(z), str2, str3, str4});
                return;
            }
            List<ma4> d = ChannelProvider.n().d(li3Var.i(), this.f28201a, false);
            this.b.cleanShareMenus();
            for (ma4 ma4Var : d) {
                if (ma4Var instanceof mi3) {
                    mi3 mi3Var = (mi3) ma4Var;
                    JSONObject jSONObject = this.c;
                    if (jSONObject != null) {
                        str5 = jSONObject.getString(mi3Var.g().k());
                    } else {
                        str5 = null;
                    }
                    if (TextUtils.isEmpty(str5)) {
                        str5 = mi3Var.g().e();
                    }
                    TBPublicMenuItem.Builder icon = new TBPublicMenuItem.Builder().setTitle(mi3Var.g().g()).setIcon(str5);
                    String j = mi3Var.g().j();
                    if (!TextUtils.isEmpty(j)) {
                        icon.setImageTipUri(j);
                        icon.setMessageMode(TBPublicMenuItem.MessageMode.IMG_TIPS);
                    }
                    this.d.add(icon.build());
                    this.e.put(mi3Var.g().g(), mi3Var);
                }
            }
            spj.c(spj.this, this.b, this.d);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class c implements TBPublicMenu.OnShareMenuItemExposedListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Map f28202a;
        public final /* synthetic */ ShareContent b;

        public c(Map map, ShareContent shareContent) {
            this.f28202a = map;
            this.b = shareContent;
        }

        @Override // com.taobao.uikit.actionbar.TBPublicMenu.OnShareMenuItemExposedListener
        public void onShareMenuItemExposed(TBPublicMenuItem tBPublicMenuItem, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a494933b", new Object[]{this, tBPublicMenuItem, str});
            } else {
                spj.d(spj.this, tBPublicMenuItem, (ma4) this.f28202a.get(tBPublicMenuItem.getTitle()), this.b, 2);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class d implements TBPublicMenu.TBOnPublicMenuClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Map f28203a;
        public final /* synthetic */ ShareContent b;
        public final /* synthetic */ Activity c;

        public d(Map map, ShareContent shareContent, Activity activity) {
            this.f28203a = map;
            this.b = shareContent;
            this.c = activity;
        }

        @Override // com.taobao.uikit.actionbar.TBPublicMenu.TBOnPublicMenuClickListener
        public void onPublicMenuItemClicked(TBPublicMenuItem tBPublicMenuItem) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("478e7772", new Object[]{this, tBPublicMenuItem});
                return;
            }
            ma4 ma4Var = (ma4) this.f28203a.get(tBPublicMenuItem.getTitle());
            spj.d(spj.this, tBPublicMenuItem, ma4Var, this.b, 1);
            if (tBPublicMenuItem == spj.e(spj.this)) {
                Map<String, Object> map = this.b.templateParams;
                if (map != null) {
                    map.remove("singleTarget");
                }
                ShareBusiness.share(this.c, this.b);
                TBS.Ext.commitEvent("Page_Access", 2101, "Page_Access_more", this.b.businessId, (Object) null);
            } else if (ma4Var != null) {
                ShareContent shareContent = this.b;
                if (shareContent.templateParams == null) {
                    shareContent.templateParams = new HashMap();
                }
                this.b.templateParams.put("singleTarget", ma4Var.b());
                ShareBusiness.share(this.c, this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class e implements ChannelProvider.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ rip f28204a;
        public final /* synthetic */ TBPublicMenu b;
        public final /* synthetic */ ArrayList c;
        public final /* synthetic */ JSONObject d;
        public final /* synthetic */ ArrayList e;
        public final /* synthetic */ Map f;

        public e(rip ripVar, TBPublicMenu tBPublicMenu, ArrayList arrayList, JSONObject jSONObject, ArrayList arrayList2, Map map) {
            this.f28204a = ripVar;
            this.b = tBPublicMenu;
            this.c = arrayList;
            this.d = jSONObject;
            this.e = arrayList2;
            this.f = map;
        }

        @Override // com.taobao.tao.channel.ChannelProvider.c
        public void onConfigData(TBShareContent tBShareContent, li3 li3Var, String str, int i, boolean z, String str2, String str3, String str4) {
            String str5;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d70378cc", new Object[]{this, tBShareContent, li3Var, str, new Integer(i), new Boolean(z), str2, str3, str4});
                return;
            }
            List<ma4> d = ChannelProvider.n().d(li3Var.i(), this.f28204a, false);
            this.b.cleanShareMenus();
            for (ma4 ma4Var : d) {
                if (ma4Var instanceof mi3) {
                    mi3 mi3Var = (mi3) ma4Var;
                    if (this.c.contains(mi3Var.g().k())) {
                        JSONObject jSONObject = this.d;
                        if (jSONObject != null) {
                            str5 = jSONObject.getString(mi3Var.g().k());
                        } else {
                            str5 = null;
                        }
                        if (TextUtils.isEmpty(str5)) {
                            str5 = mi3Var.g().e();
                        }
                        TBPublicMenuItem.Builder icon = new TBPublicMenuItem.Builder().setTitle(mi3Var.g().g()).setIcon(str5);
                        String j = mi3Var.g().j();
                        if (!TextUtils.isEmpty(j)) {
                            icon.setImageTipUri(j);
                            icon.setMessageMode(TBPublicMenuItem.MessageMode.IMG_TIPS);
                        }
                        this.e.add(icon.build());
                        this.f.put(mi3Var.g().g(), mi3Var);
                    }
                }
            }
            spj.c(spj.this, this.b, this.e);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class f implements eqb.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ArrayList f28205a;
        public final /* synthetic */ Map b;
        public final /* synthetic */ TBPublicMenu c;

        public f(ArrayList arrayList, Map map, TBPublicMenu tBPublicMenu) {
            this.f28205a = arrayList;
            this.b = map;
            this.c = tBPublicMenu;
        }

        @Override // tb.eqb.a
        public void a(String str) {
            List parseArray;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bd374b32", new Object[]{this, str});
                return;
            }
            JSONObject parseObject = JSON.parseObject(str);
            if (!(parseObject == null || parseObject.getJSONObject("data") == null || parseObject.getJSONObject("data").getJSONArray("contacts") == null || parseObject.getJSONObject("data").getJSONArray("contacts").isEmpty() || (parseArray = JSON.parseArray(parseObject.getJSONObject("data").getString("contacts"), ContactInfo.class)) == null || parseArray.isEmpty())) {
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < parseArray.size(); i++) {
                    ContactInfo contactInfo = (ContactInfo) parseArray.get(i);
                    contactInfo.setPosition(String.valueOf(i));
                    rk4 rk4Var = new rk4();
                    rk4Var.d = contactInfo;
                    arrayList.add(rk4Var);
                    String config = OrangeConfig.getInstance().getConfig("android_share_bizconfig", "TBPublicShareUserDefaultIcon", "https://gw.alicdn.com/imgextra/i1/O1CN014yqM2I26fc1KAMdZc_!!6000000007689-2-tps-144-144.png");
                    if (!TextUtils.isEmpty(contactInfo.getHeadUrl())) {
                        config = contactInfo.getHeadUrl();
                    }
                    this.f28205a.add(new TBPublicMenuItem.Builder().setTitle(contactInfo.getDisplayName()).setIcon(config).build());
                    this.b.put(contactInfo.getDisplayName(), rk4Var);
                }
                if (arrayList.size() != 0) {
                    spj.c(spj.this, this.c, this.f28205a);
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class g implements TBPublicMenu.OnShareMenuItemExposedListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Map f28206a;
        public final /* synthetic */ ShareContent b;

        public g(Map map, ShareContent shareContent) {
            this.f28206a = map;
            this.b = shareContent;
        }

        @Override // com.taobao.uikit.actionbar.TBPublicMenu.OnShareMenuItemExposedListener
        public void onShareMenuItemExposed(TBPublicMenuItem tBPublicMenuItem, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a494933b", new Object[]{this, tBPublicMenuItem, str});
            } else {
                spj.d(spj.this, tBPublicMenuItem, (ma4) this.f28206a.get(tBPublicMenuItem.getTitle()), this.b, 2);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class h implements TBPublicMenu.TBOnPublicMenuClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Map f28207a;
        public final /* synthetic */ ShareContent b;
        public final /* synthetic */ eqb c;
        public final /* synthetic */ Activity d;

        public h(Map map, ShareContent shareContent, eqb eqbVar, Activity activity) {
            this.f28207a = map;
            this.b = shareContent;
            this.c = eqbVar;
            this.d = activity;
        }

        @Override // com.taobao.uikit.actionbar.TBPublicMenu.TBOnPublicMenuClickListener
        public void onPublicMenuItemClicked(TBPublicMenuItem tBPublicMenuItem) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("478e7772", new Object[]{this, tBPublicMenuItem});
                return;
            }
            ma4 ma4Var = (ma4) this.f28207a.get(tBPublicMenuItem.getTitle());
            spj.d(spj.this, tBPublicMenuItem, ma4Var, this.b, 1);
            eqb eqbVar = this.c;
            if (eqbVar != null) {
                eqbVar.a();
            }
            if (tBPublicMenuItem == spj.e(spj.this)) {
                Map<String, Object> map = this.b.templateParams;
                if (map != null) {
                    map.remove("singleTarget");
                }
                ShareBusiness.share(this.d, this.b);
                TBS.Ext.commitEvent("Page_Access", 2101, "Page_Access_more", this.b.businessId, (Object) null);
            } else if (ma4Var instanceof rk4) {
                jkp a2 = jkp.a();
                f3w.c("2");
                try {
                    a2.b(((rk4) ma4Var).d);
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            } else if (ma4Var != null) {
                ShareContent shareContent = this.b;
                if (shareContent.templateParams == null) {
                    shareContent.templateParams = new HashMap();
                }
                this.b.templateParams.put("singleTarget", ma4Var.b());
                ShareBusiness.share(this.d, this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class i {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final spj f28208a = new spj(null);

        static {
            t2o.a(793772077);
        }

        public static /* synthetic */ spj a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (spj) ipChange.ipc$dispatch("f112012c", new Object[0]);
            }
            return f28208a;
        }
    }

    static {
        t2o.a(793772068);
    }

    public /* synthetic */ spj(a aVar) {
        this();
    }

    public static /* synthetic */ void a(spj spjVar, Activity activity, TBPublicMenu tBPublicMenu, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28cc481c", new Object[]{spjVar, activity, tBPublicMenu, obj});
        } else {
            spjVar.l(activity, tBPublicMenu, obj);
        }
    }

    public static /* synthetic */ void b(spj spjVar, Activity activity, TBPublicMenu tBPublicMenu, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d4912bb", new Object[]{spjVar, activity, tBPublicMenu, obj});
        } else {
            spjVar.k(activity, tBPublicMenu, obj);
        }
    }

    public static /* synthetic */ void c(spj spjVar, TBPublicMenu tBPublicMenu, ArrayList arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("192e1c5a", new Object[]{spjVar, tBPublicMenu, arrayList});
        } else {
            spjVar.j(tBPublicMenu, arrayList);
        }
    }

    public static /* synthetic */ void d(spj spjVar, TBPublicMenuItem tBPublicMenuItem, ma4 ma4Var, ShareContent shareContent, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("160c4c91", new Object[]{spjVar, tBPublicMenuItem, ma4Var, shareContent, new Integer(i2)});
        } else {
            spjVar.m(tBPublicMenuItem, ma4Var, shareContent, i2);
        }
    }

    public static /* synthetic */ TBPublicMenuItem e(spj spjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBPublicMenuItem) ipChange.ipc$dispatch("273adee1", new Object[]{spjVar});
        }
        return spjVar.f28199a;
    }

    public static spj f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (spj) ipChange.ipc$dispatch("38f0e912", new Object[0]);
        }
        return i.a();
    }

    public final TBPublicMenuItem g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBPublicMenuItem) ipChange.ipc$dispatch("d5233a4", new Object[]{this});
        }
        if (this.f28199a == null) {
            TBPublicMenuItem tBPublicMenuItem = new TBPublicMenuItem();
            this.f28199a = tBPublicMenuItem;
            tBPublicMenuItem.setTitle(Localization.q(R.string.share_app_more_options));
            this.f28199a.setIconUrl("https://gw.alicdn.com/imgextra/i1/O1CN01D9KDkl21GM66mou9D_!!6000000006957-2-tps-192-192.png");
        }
        return this.f28199a;
    }

    public final ShareContent h(Activity activity, ShareContent shareContent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ShareContent) ipChange.ipc$dispatch("12606253", new Object[]{this, activity, shareContent});
        }
        if (!(activity == null || activity.getIntent() == null || activity.getIntent().getData() == null)) {
            if (shareContent == null) {
                shareContent = new ShareContent();
                shareContent.businessId = "common";
                shareContent.title = OrangeConfig.getInstance().getConfig("android_share_bizconfig", "TBPublicShareTitle", Localization.q(R.string.taobao_app_1010_1_18157));
                shareContent.description = OrangeConfig.getInstance().getConfig("android_share_bizconfig", "TBPublicShareDesc", Localization.q(R.string.taobao_app_1010_1_18161));
                shareContent.url = activity.getIntent().getData().toString();
            }
            bwr.h().r(new WeakReference<>(activity), zip.a(JSON.toJSONString((Object) ShareBusiness.parseShareContent(shareContent), true)));
        }
        return shareContent;
    }

    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0708ff0", new Object[]{this});
        } else {
            TBPublicMenu.registerInitShareCallBack(new a());
        }
    }

    public final void j(TBPublicMenu tBPublicMenu, ArrayList<TBPublicMenuItem> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22142fb", new Object[]{this, tBPublicMenu, arrayList});
            return;
        }
        tBPublicMenu.cleanShareMenus();
        ArrayList arrayList2 = new ArrayList(arrayList);
        arrayList2.add(g());
        tBPublicMenu.addShareMenus(arrayList2);
        tBPublicMenu.notifyMenuChanged();
    }

    public spj() {
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0080  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m(com.taobao.uikit.actionbar.TBPublicMenuItem r12, tb.ma4 r13, com.ut.share.business.ShareContent r14, int r15) {
        /*
            r11 = this;
            r0 = 2
            r1 = 1
            com.android.alibaba.ip.runtime.IpChange r2 = tb.spj.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x0023
            java.lang.Integer r3 = new java.lang.Integer
            r3.<init>(r15)
            r15 = 5
            java.lang.Object[] r15 = new java.lang.Object[r15]
            r4 = 0
            r15[r4] = r11
            r15[r1] = r12
            r15[r0] = r13
            r12 = 3
            r15[r12] = r14
            r12 = 4
            r15[r12] = r3
            java.lang.String r12 = "473e0264"
            r2.ipc$dispatch(r12, r15)
            return
        L_0x0023:
            if (r12 != 0) goto L_0x0026
            return
        L_0x0026:
            com.taobao.uikit.actionbar.TBPublicMenuItem r2 = r11.f28199a
            r3 = 0
            if (r12 != r2) goto L_0x0030
            java.lang.String r12 = "more"
        L_0x002e:
            r13 = r3
            goto L_0x0050
        L_0x0030:
            boolean r12 = r13 instanceof tb.rk4
            if (r12 == 0) goto L_0x0047
            tb.rk4 r13 = (tb.rk4) r13
            com.taobao.share.ui.engine.friend.ContactInfo r12 = r13.d
            if (r12 != 0) goto L_0x003c
            r12 = r3
            goto L_0x0040
        L_0x003c:
            java.lang.String r12 = r12.getBizSubType()
        L_0x0040:
            java.lang.String r13 = "taoFriend"
            r10 = r13
            r13 = r12
            r12 = r10
            goto L_0x0050
        L_0x0047:
            if (r13 != 0) goto L_0x004b
            r12 = r3
            goto L_0x002e
        L_0x004b:
            java.lang.String r12 = r13.b()
            goto L_0x002e
        L_0x0050:
            if (r14 != 0) goto L_0x0054
        L_0x0052:
            r7 = r3
            goto L_0x0057
        L_0x0054:
            java.lang.String r3 = r14.businessId
            goto L_0x0052
        L_0x0057:
            java.lang.String r14 = ""
            if (r12 != 0) goto L_0x005c
            r12 = r14
        L_0x005c:
            java.lang.String r2 = "type="
            java.lang.String r12 = r2.concat(r12)
            if (r13 != 0) goto L_0x0066
            r13 = r14
        L_0x0066:
            java.lang.String r14 = "bizSubType="
            java.lang.String r13 = r14.concat(r13)
            if (r15 == r1) goto L_0x0080
            if (r15 == r0) goto L_0x0071
            goto L_0x008e
        L_0x0071:
            r8 = 0
            java.lang.String[] r9 = new java.lang.String[]{r12, r13}
            java.lang.String r4 = "GlobalNavigation"
            r5 = 2201(0x899, float:3.084E-42)
            java.lang.String r6 = "GlobalNavigation_Button-ExposureItem"
            com.taobao.statistic.TBS.Ext.commitEvent(r4, r5, r6, r7, r8, r9)
            goto L_0x008e
        L_0x0080:
            r8 = 0
            java.lang.String[] r9 = new java.lang.String[]{r12, r13}
            java.lang.String r4 = "GlobalNavigation"
            r5 = 2101(0x835, float:2.944E-42)
            java.lang.String r6 = "GlobalNavigation_Button-ClickItem"
            com.taobao.statistic.TBS.Ext.commitEvent(r4, r5, r6, r7, r8, r9)
        L_0x008e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.spj.m(com.taobao.uikit.actionbar.TBPublicMenuItem, tb.ma4, com.ut.share.business.ShareContent, int):void");
    }

    public final void k(Activity activity, TBPublicMenu tBPublicMenu, Object obj) {
        HashMap hashMap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61565681", new Object[]{this, activity, tBPublicMenu, obj});
        } else if (activity != null && activity.getIntent() != null && activity.getIntent().getData() != null && tBPublicMenu != null && (obj instanceof ShareContent)) {
            ShareContent shareContent = (ShareContent) obj;
            if (!shareContent.businessId.startsWith("ShareGlobalNavigation_")) {
                shareContent.businessId = "ShareGlobalNavigation_" + shareContent.businessId;
            }
            ShareContent h2 = h(activity, shareContent);
            TBShareContent e2 = bwr.h().e();
            ArrayList arrayList = new ArrayList();
            List parseArray = JSON.parseArray(OrangeConfig.getInstance().getConfig("android_share_bizconfig", "TBPublicShareItemList", ""), String.class);
            if (parseArray == null || parseArray.isEmpty()) {
                arrayList.add(ShareTargetType.Share2Copy.getValue());
                arrayList.add(ShareTargetType.Share2HUABAO.getValue());
                arrayList.add(ShareTargetType.Share2Weixin.getValue());
                arrayList.add(ShareTargetType.Share2QQ.getValue());
                if ("true".equals(OrangeConfig.getInstance().getConfig("android_share_bizconfig", "TBPublicShareTYQ", "true"))) {
                    arrayList.add(ShareTargetType.Share2TYQ.getValue());
                }
            } else {
                arrayList.addAll(parseArray);
            }
            whp whpVar = new whp();
            rip ripVar = new rip();
            ripVar.d(whpVar);
            ripVar.c(e2);
            ArrayList arrayList2 = new ArrayList();
            HashMap hashMap2 = new HashMap();
            ChannelProvider.n().j(e2, new e(ripVar, tBPublicMenu, arrayList, JSON.parseObject(OrangeConfig.getInstance().getConfig("android_share_bizconfig", "TBPublicShareToolsIconConfig", "{\"copy\":\"https://gw.alicdn.com/imgextra/i2/O1CN01dCbyFl1lyIEzcuYjO_!!6000000004887-2-tps-192-192.png\",\"huabao\":\"https://gw.alicdn.com/imgextra/i3/O1CN01fWtPl81wlQtZJjltX_!!6000000006348-2-tps-192-192.png\"}")), arrayList2, hashMap2), false);
            eqb contactsInfoProvider = ShareBizAdapter.getInstance().getContactsInfoProvider();
            if ("true".equals(OrangeConfig.getInstance().getConfig("android_share_bizconfig", "TBPublicShareShowFriends", "true"))) {
                if (contactsInfoProvider != null) {
                    contactsInfoProvider.a();
                }
                hashMap = hashMap2;
                lz9.a(null, new f(arrayList2, hashMap, tBPublicMenu));
            } else {
                hashMap = hashMap2;
            }
            TBS.Ext.commitEvent("Page_Access", 2201, "Page_Access_more", h2.businessId, (Object) null);
            WeakReference<TBPublicMenu> weakReference = this.b;
            if (weakReference != null && weakReference.get() == tBPublicMenu) {
                if ("true".equals(OrangeConfig.getInstance().getConfig("android_share_bizconfig", "fixMenuNotRefreshIssue", "true"))) {
                    tBPublicMenu.clearShareMenuListeners();
                } else {
                    return;
                }
            }
            this.b = new WeakReference<>(tBPublicMenu);
            tBPublicMenu.setOnShareMenuItemExposedListener(new g(hashMap, h2));
            tBPublicMenu.addOnShareMenuClickListener(new h(hashMap, h2, contactsInfoProvider, activity));
        } else if (tBPublicMenu != null && obj == null) {
            tBPublicMenu.cleanShareMenus();
        }
    }

    public final void l(Activity activity, TBPublicMenu tBPublicMenu, Object obj) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b418939", new Object[]{this, activity, tBPublicMenu, obj});
        } else if (activity != null && activity.getIntent() != null && activity.getIntent().getData() != null && tBPublicMenu != null && (obj instanceof ShareContent)) {
            ShareContent shareContent = (ShareContent) obj;
            if (!shareContent.businessId.startsWith("ShareGlobalNavigation_")) {
                shareContent.businessId = "ShareGlobalNavigation_" + shareContent.businessId;
            }
            if (Localization.o() && !Localization.p() && (str = shareContent.businessId) != null) {
                if (!str.contains("_" + Localization.j())) {
                    shareContent.businessId += "_" + Localization.j();
                }
            }
            ShareContent h2 = h(activity, shareContent);
            TBShareContent e2 = bwr.h().e();
            whp whpVar = new whp();
            rip ripVar = new rip();
            ripVar.d(whpVar);
            ripVar.c(e2);
            ArrayList arrayList = new ArrayList();
            HashMap hashMap = new HashMap();
            ChannelProvider.n().j(e2, new b(ripVar, tBPublicMenu, JSON.parseObject(OrangeConfig.getInstance().getConfig("android_share_bizconfig", "TBPublicShareToolsIconConfig", "{\"copy\":\"https://gw.alicdn.com/imgextra/i2/O1CN01dCbyFl1lyIEzcuYjO_!!6000000004887-2-tps-192-192.png\",\"huabao\":\"https://gw.alicdn.com/imgextra/i3/O1CN01fWtPl81wlQtZJjltX_!!6000000006348-2-tps-192-192.png\"}")), arrayList, hashMap), false);
            TBS.Ext.commitEvent("Page_Access", 2201, "Page_Access_more", h2.businessId, (Object) null);
            WeakReference<TBPublicMenu> weakReference = this.b;
            if (weakReference != null && weakReference.get() == tBPublicMenu) {
                if ("true".equals(OrangeConfig.getInstance().getConfig("android_share_bizconfig", "fixMenuNotRefreshIssue", "true"))) {
                    tBPublicMenu.clearShareMenuListeners();
                } else {
                    return;
                }
            }
            this.b = new WeakReference<>(tBPublicMenu);
            tBPublicMenu.setOnShareMenuItemExposedListener(new c(hashMap, h2));
            tBPublicMenu.addOnShareMenuClickListener(new d(hashMap, h2, activity));
        }
    }
}
