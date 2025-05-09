package tb;

import android.util.Pair;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.util.MessageNavProcessorV2;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class xpj {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final xpj CATEGORY_TAB_EN;
    public static final List<Pair> DEFAULT_TAB_BAR_CONFIG;
    public static final xpj DEFAULT_TB_MAIN_TAB;
    public static final xpj DefaultCartTab;
    public static final xpj DefaultGuangGuangTab;
    public static final xpj DefaultMessageTab;
    public static final List<Pair> EDLP_ELDER_HOME_TAB_BAR_CONFIG;
    public static final List<Pair> ELDER_HOME_TAB_BAR_CONFIG;
    public static final List<Pair> I18N_EN_TAB_BAR_CONFIG;
    public static final List<Pair> I18N_MALAY_TAB_BAR_CONFIG;
    public static final List<Pair> I18N_RUSSIA_TAB_BAR_CONFIG;
    public static final List<Pair> I18N_TAB_BAR_CONFIG;
    public static final List<Pair> I18N_THAI_TAB_BAR_CONFIG;
    public static final xpj NEW_TB_MAIN_TAB;
    public static final xpj SEARCH_TAB;
    public static final HashMap<String, Integer> TAB_BAR_TITLE_CONFIG;

    /* renamed from: a  reason: collision with root package name */
    public int f31517a;
    public String b;
    public Object c;
    public Object d;
    public int e;
    public String f;
    public String g;
    public String h;
    public String i;
    public String j;
    public String k;
    public String l;
    public String m;
    public boolean n;
    public int o;
    public int p;
    public String q;
    public int r;
    public static final xpj DISCOVERY_TAB = new b().q(1).r("发现").k(Integer.valueOf(R.drawable.uik_nav_descovery_selected)).m(Integer.valueOf(R.drawable.uik_nav_descovery_normal)).l(0).s("http://h5.m.taobao.com/tmgdiscovery/main.html").g("com.taobao.wetao.home.WeTaoMainActivity").i("com.taobao.oversea.discovery.TmgDiscoveryFragment").f("com.taobao.oversea.discovery").p("a2141.1.tabbar.discovery").o("Page_TabVC").h("Button-TMGJDiscover").n(false).e("discovery").a();
    public static final xpj EDLP_EDLP_TAB = new b().q(2).r("领福利").k(Integer.valueOf(R.drawable.uik_nav_edlp_selected)).m(Integer.valueOf(R.drawable.uik_nav_edlp_normal)).l(0).s("taobao://edlp/root").g("com.taobao.wetao.home.WeTaoMainActivity").i("com.taobao.edlp.LowPriceFragment").p("a2141.1.tabbar.edlp").o("Page_TabVC").h("Button-Edlp").n(true).e(a68.TAG).a();
    public static final xpj CATEGORY_TAB_CH = new b().q(1).r("分类").k(Integer.valueOf(R.drawable.uik_nav_category_selected_ch)).m(Integer.valueOf(R.drawable.uik_nav_category_normal_ch)).l(0).s("https://h5.m.taobao.com/tmgi18n/categorytab.html").g("com.taobao.wetao.home.WeTaoMainActivity").i("com.taobao.oversea.category.TmgCategoryFragment").f("com.taobao.oversea.category").p("a2141.1.tabbar.i18ncategory").o("Page_TabVC").h("Button-TMGCategory").n(false).e("tmgcategory").a();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final xpj f31518a = new xpj();

        public xpj a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (xpj) ipChange.ipc$dispatch("492625ab", new Object[]{this});
            }
            if (xpj.a(this.f31518a) != -1 && xpj.n(this.f31518a) != null && xpj.p(this.f31518a) != null && xpj.r(this.f31518a) != null && xpj.t(this.f31518a) != -1 && xpj.v(this.f31518a) != null && xpj.x(this.f31518a) != null && xpj.z(this.f31518a) != null && xpj.b(this.f31518a) != null && xpj.e(this.f31518a) != null && xpj.g(this.f31518a) != null) {
                return this.f31518a;
            }
            throw new IllegalArgumentException("navigation bar not enough parameters");
        }

        public xpj b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (xpj) ipChange.ipc$dispatch("bc19ba19", new Object[]{this});
            }
            if (xpj.a(this.f31518a) != -1 && xpj.n(this.f31518a) != null && xpj.p(this.f31518a) != null && xpj.r(this.f31518a) != null && xpj.t(this.f31518a) != -1) {
                return this.f31518a;
            }
            throw new IllegalArgumentException("navigation bar not enough parameters");
        }

        public b c(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("d8d7c1cb", new Object[]{this, new Integer(i)});
            }
            xpj.l(this.f31518a, i);
            return this;
        }

        public b d(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("85b3164b", new Object[]{this, new Integer(i)});
            }
            xpj.k(this.f31518a, i);
            return this;
        }

        public b e(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("2f0616ec", new Object[]{this, str});
            }
            xpj.j(this.f31518a, str);
            return this;
        }

        public b f(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("652cbc20", new Object[]{this, str});
            }
            xpj.B(this.f31518a, str);
            return this;
        }

        public b g(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("e49b9cf6", new Object[]{this, str});
            }
            xpj.y(this.f31518a, str);
            return this;
        }

        public b h(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("f69dd7b1", new Object[]{this, str});
            }
            xpj.h(this.f31518a, str);
            return this;
        }

        public b i(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("be722292", new Object[]{this, str});
            }
            xpj.A(this.f31518a, str);
            return this;
        }

        public b j(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("5d734ea2", new Object[]{this, new Integer(i)});
            }
            xpj.m(this.f31518a, i);
            return this;
        }

        public b k(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("1df59a27", new Object[]{this, obj});
            }
            xpj.s(this.f31518a, obj);
            return this;
        }

        public b l(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("9b87d6e1", new Object[]{this, new Integer(i)});
            }
            xpj.u(this.f31518a, i);
            return this;
        }

        public b m(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("eef484e", new Object[]{this, obj});
            }
            xpj.q(this.f31518a, obj);
            return this;
        }

        public b n(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("bf75af84", new Object[]{this, new Boolean(z)});
            }
            xpj.i(this.f31518a, z);
            return this;
        }

        public b o(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("fff071b3", new Object[]{this, str});
            }
            xpj.f(this.f31518a, str);
            return this;
        }

        public b p(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("4f86adee", new Object[]{this, str});
            }
            xpj.c(this.f31518a, str);
            return this;
        }

        public b q(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("beaf7bcb", new Object[]{this, new Integer(i)});
            }
            xpj.d(this.f31518a, i);
            return this;
        }

        public b r(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("15a62161", new Object[]{this, str});
            }
            xpj.o(this.f31518a, str);
            return this;
        }

        public b s(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("2aa3daa", new Object[]{this, str});
            }
            xpj.w(this.f31518a, str);
            return this;
        }
    }

    static {
        b r = new b().q(1).r("逛逛");
        int i = R.drawable.uik_nav_guangguang_selected;
        b k = r.k(Integer.valueOf(i));
        int i2 = R.drawable.uik_nav_guangguang_normal;
        DefaultGuangGuangTab = k.m(Integer.valueOf(i2)).l(0).s("https://h5.m.taobao.com/guangguang/index.htm").g("com.taobao.wetao.home.WeTaoMainActivity").i("com.taobao.wetao.home.GuangGuangTnodeMainFragment").f("com.taobao.allspark").p("a2141.1.tabbar.guangguang").o("Page_TabVC").h("Button-guangguang").n(false).e("tab2").a();
        b r2 = new b().q(2).r("消息");
        int i3 = R.drawable.uik_nav_message_selected;
        b k2 = r2.k(Integer.valueOf(i3));
        int i4 = R.drawable.uik_nav_message_normal;
        DefaultMessageTab = k2.m(Integer.valueOf(i4)).l(0).s(MessageNavProcessorV2.ROUTE_URL_MESSAGETAB).g("com.taobao.message.category.MsgCenterCategoryTabActivity").i("com.taobao.message.conversation.MessageTabFragment").f("com.taobao.wangxin").p("a2141.1.tabbar.ocean").o("Page_TabVC").h("Button-Message").n(true).e("message").a();
        b r3 = new b().q(3).r("购物车");
        int i5 = R.drawable.uik_nav_cart_selected;
        b k3 = r3.k(Integer.valueOf(i5));
        int i6 = R.drawable.uik_nav_cart_normal;
        DefaultCartTab = k3.m(Integer.valueOf(i6)).l(0).s("http://h5.m.taobao.com/awp/base/newcart.htm").g("com.taobao.android.trade.cart.CartTabActivity").i("com.taobao.android.icart.UltronICartFragment").f("com.taobao.android.newtrade").p("a2141.1.tabbar.shoppingcart").o("Page_TabVC").h("Button-ShoppingCart").n(true).e("cart").a();
        ArrayList arrayList = new ArrayList();
        ELDER_HOME_TAB_BAR_CONFIG = arrayList;
        ArrayList arrayList2 = new ArrayList();
        EDLP_ELDER_HOME_TAB_BAR_CONFIG = arrayList2;
        ArrayList arrayList3 = new ArrayList();
        I18N_EN_TAB_BAR_CONFIG = arrayList3;
        ArrayList arrayList4 = new ArrayList();
        I18N_TAB_BAR_CONFIG = arrayList4;
        ArrayList arrayList5 = new ArrayList();
        I18N_RUSSIA_TAB_BAR_CONFIG = arrayList5;
        ArrayList arrayList6 = new ArrayList();
        I18N_THAI_TAB_BAR_CONFIG = arrayList6;
        ArrayList arrayList7 = new ArrayList();
        I18N_MALAY_TAB_BAR_CONFIG = arrayList7;
        HashMap<String, Integer> hashMap = new HashMap<>();
        TAB_BAR_TITLE_CONFIG = hashMap;
        ArrayList arrayList8 = new ArrayList();
        DEFAULT_TAB_BAR_CONFIG = arrayList8;
        int i7 = R.drawable.uik_nav_home_normal_elder;
        Integer valueOf = Integer.valueOf(i7);
        int i8 = R.drawable.uik_nav_home_selected_elder;
        arrayList.add(Pair.create(valueOf, Integer.valueOf(i8)));
        int i9 = R.drawable.uik_nav_guangguang_normal_elder;
        Integer valueOf2 = Integer.valueOf(i9);
        int i10 = R.drawable.uik_nav_guangguang_selected_elder;
        arrayList.add(Pair.create(valueOf2, Integer.valueOf(i10)));
        arrayList.add(Pair.create(Integer.valueOf(R.drawable.uik_nav_message_normal_elder), Integer.valueOf(R.drawable.uik_nav_message_selected_elder)));
        int i11 = R.drawable.uik_nav_cart_normal_elder;
        Integer valueOf3 = Integer.valueOf(i11);
        int i12 = R.drawable.uik_nav_cart_selected_elder;
        arrayList.add(Pair.create(valueOf3, Integer.valueOf(i12)));
        int i13 = R.drawable.uik_nav_my_normal_elder;
        Integer valueOf4 = Integer.valueOf(i13);
        int i14 = R.drawable.uik_nav_my_selected_elder;
        arrayList.add(Pair.create(valueOf4, Integer.valueOf(i14)));
        arrayList2.add(Pair.create(Integer.valueOf(i7), Integer.valueOf(i8)));
        arrayList2.add(Pair.create(Integer.valueOf(i9), Integer.valueOf(i10)));
        arrayList2.add(Pair.create(Integer.valueOf(R.drawable.uik_nav_edlp_elder), Integer.valueOf(R.drawable.uik_nav_edlp_elder_selected)));
        arrayList2.add(Pair.create(Integer.valueOf(i11), Integer.valueOf(i12)));
        arrayList2.add(Pair.create(Integer.valueOf(i13), Integer.valueOf(i14)));
        arrayList3.add(Pair.create(Integer.valueOf(R.drawable.uik_nav_home_normal_en), Integer.valueOf(R.drawable.uik_nav_home_selected_en)));
        int i15 = R.drawable.uik_nav_category_normal_en;
        Integer valueOf5 = Integer.valueOf(i15);
        int i16 = R.drawable.uik_nav_category_selected_en;
        arrayList3.add(Pair.create(valueOf5, Integer.valueOf(i16)));
        int i17 = R.drawable.uik_nav_search_normal_en;
        Integer valueOf6 = Integer.valueOf(i17);
        int i18 = R.drawable.uik_nav_search_selected_en;
        arrayList3.add(Pair.create(valueOf6, Integer.valueOf(i18)));
        arrayList3.add(Pair.create(Integer.valueOf(R.drawable.uik_nav_cart_normal_en), Integer.valueOf(R.drawable.uik_nav_cart_selected_en)));
        arrayList3.add(Pair.create(Integer.valueOf(R.drawable.uik_nav_my_normal_en), Integer.valueOf(R.drawable.uik_nav_my_selected_en)));
        arrayList4.add(Pair.create(Integer.valueOf(R.drawable.uik_nav_home_normal_i18n), Integer.valueOf(R.drawable.uik_nav_home_selected_i18n)));
        arrayList4.add(Pair.create(Integer.valueOf(R.drawable.uik_nav_category_normal_i18n), Integer.valueOf(R.drawable.uik_nav_category_selected_i18n)));
        arrayList4.add(Pair.create(Integer.valueOf(R.drawable.uik_nav_search_normal_i18n), Integer.valueOf(R.drawable.uik_nav_search_selected_i18n)));
        arrayList4.add(Pair.create(Integer.valueOf(R.drawable.uik_nav_cart_normal_i18n), Integer.valueOf(R.drawable.uik_nav_cart_selected_i18n)));
        arrayList4.add(Pair.create(Integer.valueOf(R.drawable.uik_nav_my_normal_i18n), Integer.valueOf(R.drawable.uik_nav_my_selected_i18n)));
        arrayList5.add(Pair.create(Integer.valueOf(R.drawable.uik_nav_home_normal_ru), Integer.valueOf(R.drawable.uik_nav_home_selected_ru)));
        arrayList5.add(Pair.create(Integer.valueOf(R.drawable.uik_nav_category_normal_ru), Integer.valueOf(R.drawable.uik_nav_category_selected_ru)));
        arrayList5.add(Pair.create(Integer.valueOf(R.drawable.uik_nav_search_normal_ru), Integer.valueOf(R.drawable.uik_nav_search_selected_ru)));
        arrayList5.add(Pair.create(Integer.valueOf(R.drawable.uik_nav_cart_normal_ru), Integer.valueOf(R.drawable.uik_nav_cart_selected_ru)));
        arrayList5.add(Pair.create(Integer.valueOf(R.drawable.uik_nav_my_normal_ru), Integer.valueOf(R.drawable.uik_nav_my_selected_ru)));
        arrayList7.add(Pair.create(Integer.valueOf(R.drawable.uik_nav_home_normal_malay), Integer.valueOf(R.drawable.uik_nav_home_selected_malay)));
        arrayList7.add(Pair.create(Integer.valueOf(R.drawable.uik_nav_category_normal_malay), Integer.valueOf(R.drawable.uik_nav_category_selected_malay)));
        arrayList7.add(Pair.create(Integer.valueOf(R.drawable.uik_nav_search_normal_malay), Integer.valueOf(R.drawable.uik_nav_search_selected_malay)));
        arrayList7.add(Pair.create(Integer.valueOf(R.drawable.uik_nav_cart_normal_malay), Integer.valueOf(R.drawable.uik_nav_cart_selected_malay)));
        arrayList7.add(Pair.create(Integer.valueOf(R.drawable.uik_nav_my_normal_malay), Integer.valueOf(R.drawable.uik_nav_my_selected_malay)));
        arrayList6.add(Pair.create(Integer.valueOf(R.drawable.uik_nav_home_normal_thai), Integer.valueOf(R.drawable.uik_nav_home_selected_thai)));
        arrayList6.add(Pair.create(Integer.valueOf(R.drawable.uik_nav_category_normal_thai), Integer.valueOf(R.drawable.uik_nav_category_selected_thai)));
        arrayList6.add(Pair.create(Integer.valueOf(R.drawable.uik_nav_search_normal_thai), Integer.valueOf(R.drawable.uik_nav_search_selected_thai)));
        arrayList6.add(Pair.create(Integer.valueOf(R.drawable.uik_nav_cart_normal_thai), Integer.valueOf(R.drawable.uik_nav_cart_selected_thai)));
        arrayList6.add(Pair.create(Integer.valueOf(R.drawable.uik_nav_my_normal_thai), Integer.valueOf(R.drawable.uik_nav_my_selected_thai)));
        hashMap.put("homePage", Integer.valueOf(R.string.taobao_app_1012_1_36560));
        hashMap.put("cart", Integer.valueOf(R.string.taobao_app_1012_1_36563));
        hashMap.put("mytaobao", Integer.valueOf(R.string.taobao_app_1012_1_36565));
        hashMap.put("tmgcategory", Integer.valueOf(R.string.taobao_app_1012_1_36561));
        hashMap.put("tmgpailitao", Integer.valueOf(R.string.taobao_app_1012_1_36562));
        int i19 = R.drawable.uik_nav_home_normal;
        Integer valueOf7 = Integer.valueOf(i19);
        int i20 = R.drawable.uik_nav_home_selected;
        arrayList8.add(Pair.create(valueOf7, Integer.valueOf(i20)));
        arrayList8.add(Pair.create(Integer.valueOf(i2), Integer.valueOf(i)));
        arrayList8.add(Pair.create(Integer.valueOf(i4), Integer.valueOf(i3)));
        arrayList8.add(Pair.create(Integer.valueOf(i6), Integer.valueOf(i5)));
        arrayList8.add(Pair.create(Integer.valueOf(R.drawable.uik_nav_my_normal), Integer.valueOf(R.drawable.uik_nav_my_selected)));
        NEW_TB_MAIN_TAB = new b().q(0).r("首页").k(Integer.valueOf(i20)).m(Integer.valueOf(i19)).l(0).s("http://m.taobao.com/index.htm").g("com.taobao.tao.homepage.MainActivity3").i("com.taobao.android.home.HomeFragment").p("a2141.1.tabbar.homepage").o("Page_TabVC").h("Button-Home").n(false).e("homePage").a();
        DEFAULT_TB_MAIN_TAB = new b().q(0).r("首页").k(Integer.valueOf(i20)).m(Integer.valueOf(i19)).l(0).s("http://m.taobao.com/index.htm").g("com.taobao.tao.homepage.MainActivity3").i("com.taobao.tao.homepage.HomepageFragment").p("a2141.1.tabbar.homepage").o("Page_TabVC").h("Button-Home").n(false).e("homePage").a();
        CATEGORY_TAB_EN = new b().q(1).r("Category").k(Integer.valueOf(i16)).m(Integer.valueOf(i15)).l(0).s("https://h5.m.taobao.com/tmgi18n/categorytab.html").g("com.taobao.wetao.home.WeTaoMainActivity").i("com.taobao.oversea.category.TmgCategoryFragment").f("com.taobao.oversea.category").p("a2141.1.tabbar.i18ncategory").o("Page_TabVC").h("Button-TMGCategory").n(false).e("tmgcategory").a();
        SEARCH_TAB = new b().q(2).r(z9u.SEARCH_ENTRANCE_CLICK).k(Integer.valueOf(i18)).m(Integer.valueOf(i17)).l(0).s("https://h5.m.taobao.com/tusou/camera_tabbar?scene=autodetect").g("com.taobao.wetao.home.WeTaoMainActivity").i("com.etao.feimagesearch.capture.CaptureFragment").f("com.taobao.oversea.capture").p("a2141.1.tabbar.i18npailitao").o("Page_TabVC").h("Button-TMGpailitao").n(false).e("tmgpailitao").a();
    }

    public static /* synthetic */ String A(xpj xpjVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b0738951", new Object[]{xpjVar, str});
        }
        xpjVar.h = str;
        return str;
    }

    public static /* synthetic */ String B(xpj xpjVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cf2dc112", new Object[]{xpjVar, str});
        }
        xpjVar.i = str;
        return str;
    }

    public static /* synthetic */ int a(xpj xpjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6b0daa41", new Object[]{xpjVar})).intValue();
        }
        return xpjVar.f31517a;
    }

    public static /* synthetic */ String b(xpj xpjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f891a080", new Object[]{xpjVar});
        }
        return xpjVar.j;
    }

    public static /* synthetic */ String c(xpj xpjVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cccf33f8", new Object[]{xpjVar, str});
        }
        xpjVar.j = str;
        return str;
    }

    public static /* synthetic */ int d(xpj xpjVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ddc71aea", new Object[]{xpjVar, new Integer(i)})).intValue();
        }
        xpjVar.f31517a = i;
        return i;
    }

    public static /* synthetic */ String e(xpj xpjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d90af681", new Object[]{xpjVar});
        }
        return xpjVar.k;
    }

    public static /* synthetic */ String f(xpj xpjVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("eb896bb9", new Object[]{xpjVar, str});
        }
        xpjVar.k = str;
        return str;
    }

    public static /* synthetic */ String g(xpj xpjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b9844c82", new Object[]{xpjVar});
        }
        return xpjVar.l;
    }

    public static /* synthetic */ String h(xpj xpjVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a43a37a", new Object[]{xpjVar, str});
        }
        xpjVar.l = str;
        return str;
    }

    public static /* synthetic */ boolean i(xpj xpjVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("21498f3d", new Object[]{xpjVar, new Boolean(z)})).booleanValue();
        }
        xpjVar.n = z;
        return z;
    }

    public static /* synthetic */ String j(xpj xpjVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("47b812fc", new Object[]{xpjVar, str});
        }
        xpjVar.m = str;
        return str;
    }

    public static /* synthetic */ int k(xpj xpjVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bcc83f5d", new Object[]{xpjVar, new Integer(i)})).intValue();
        }
        xpjVar.o = i;
        return i;
    }

    public static /* synthetic */ int l(xpj xpjVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a87b75e", new Object[]{xpjVar, new Integer(i)})).intValue();
        }
        xpjVar.p = i;
        return i;
    }

    public static /* synthetic */ int m(xpj xpjVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("58472f5f", new Object[]{xpjVar, new Integer(i)})).intValue();
        }
        xpjVar.r = i;
        return i;
    }

    public static /* synthetic */ String n(xpj xpjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5ee1c613", new Object[]{xpjVar});
        }
        return xpjVar.b;
    }

    public static /* synthetic */ String o(xpj xpjVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f8163acb", new Object[]{xpjVar, str});
        }
        xpjVar.b = str;
        return str;
    }

    public static /* synthetic */ Object p(xpj xpjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("4c983ea6", new Object[]{xpjVar});
        }
        return xpjVar.c;
    }

    public static /* synthetic */ Object q(xpj xpjVar, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("a475754c", new Object[]{xpjVar, obj});
        }
        xpjVar.c = obj;
        return obj;
    }

    public static /* synthetic */ Object r(xpj xpjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("2d1194a7", new Object[]{xpjVar});
        }
        return xpjVar.d;
    }

    public static /* synthetic */ Object s(xpj xpjVar, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("c32fad0d", new Object[]{xpjVar, obj});
        }
        xpjVar.d = obj;
        return obj;
    }

    public static /* synthetic */ int t(xpj xpjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6491b9bd", new Object[]{xpjVar})).intValue();
        }
        return xpjVar.e;
    }

    public static /* synthetic */ int u(xpj xpjVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("14c4faee", new Object[]{xpjVar, new Integer(i)})).intValue();
        }
        xpjVar.e = i;
        return i;
    }

    public static /* synthetic */ String v(xpj xpjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e0c71e17", new Object[]{xpjVar});
        }
        return xpjVar.f;
    }

    public static /* synthetic */ String w(xpj xpjVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("72ff19cf", new Object[]{xpjVar, str});
        }
        xpjVar.f = str;
        return str;
    }

    public static /* synthetic */ String x(xpj xpjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c1407418", new Object[]{xpjVar});
        }
        return xpjVar.g;
    }

    public static /* synthetic */ String y(xpj xpjVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("91b95190", new Object[]{xpjVar, str});
        }
        xpjVar.g = str;
        return str;
    }

    public static /* synthetic */ String z(xpj xpjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a1b9ca19", new Object[]{xpjVar});
        }
        return xpjVar.h;
    }

    public int C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cdb0b8ad", new Object[]{this})).intValue();
        }
        return this.p;
    }

    public int D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4beb20d", new Object[]{this})).intValue();
        }
        return this.o;
    }

    public String E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9c07dca2", new Object[]{this});
        }
        return this.m;
    }

    public String F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8616acb6", new Object[]{this});
        }
        return this.i;
    }

    public String G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("68ef37ac", new Object[]{this});
        }
        return this.g;
    }

    public String H() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3fd8d1e7", new Object[]{this});
        }
        return this.l;
    }

    public String I() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("80c4b428", new Object[]{this});
        }
        return this.h;
    }

    public int J() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e2aa0f04", new Object[]{this})).intValue();
        }
        return this.r;
    }

    public String K() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c52806cf", new Object[]{this});
        }
        return this.q;
    }

    public Object L() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("29af2321", new Object[]{this});
        }
        return this.d;
    }

    public String M() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b35fba6a", new Object[]{this});
        }
        return I() + "_nav_selected";
    }

    public int N() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("99f890c3", new Object[]{this})).intValue();
        }
        return this.e;
    }

    public Object O() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("13fbc6c8", new Object[]{this});
        }
        return this.c;
    }

    public String P() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("99d43291", new Object[]{this});
        }
        return I() + "_nav_unselected";
    }

    public String Q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("707fddc9", new Object[]{this});
        }
        return this.k;
    }

    public String R() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8bf3b984", new Object[]{this});
        }
        return this.j;
    }

    public int S() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("13749ead", new Object[]{this})).intValue();
        }
        return this.f31517a;
    }

    public String T() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5267f97", new Object[]{this});
        }
        return this.b;
    }

    public String U() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("de8f0660", new Object[]{this});
        }
        return this.f;
    }

    public boolean V() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4272ce74", new Object[]{this})).booleanValue();
        }
        return this.n;
    }

    public boolean W(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fa2cb788", new Object[]{this, new Integer(i), new Integer(i2)})).booleanValue();
        }
        if ((i & this.o) == 0 || (this.p & i2) == 0) {
            return false;
        }
        return true;
    }

    public void X(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36ab90fd", new Object[]{this, new Integer(i)});
        } else {
            this.p = i;
        }
    }

    public void Y(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42e4cd35", new Object[]{this, new Integer(i)});
        } else {
            this.o = i;
        }
    }

    public void Z(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f82c087", new Object[]{this, str});
        } else {
            this.q = str;
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "NavigationTabConfig{tabIndex=" + this.f31517a + ", title='" + this.b + "', iconUnSelected=" + this.c + ", iconSelected=" + this.d + ", iconType=" + this.e + ", url='" + this.f + "', className='" + this.g + "', fragmentName='" + this.h + "', bundleName='" + this.i + "', spmUrl='" + this.j + "', pageName='" + this.k + "', controlName='" + this.l + "', bizType='" + this.m + "', needLogin=" + this.n + ", applyTabHostVersion=" + this.o + ", applyStyleType=" + this.p + ", iconId='" + this.q + "'}";
    }

    public xpj() {
        this.o = 1;
        this.p = 1;
        this.r = 6;
    }
}
