package com.taobao.android.editionswitcher.boarding;

import android.os.Handler;
import android.os.Looper;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.ability.localization.Localization;
import com.alibaba.fastjson.JSON;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.editionswitcher.LocationCallBack;
import com.taobao.android.editionswitcher.SwitcheFatigue;
import com.taobao.android.editionswitcher.api.EditionApi;
import com.taobao.android.editionswitcher.boarding.LocaleModel;
import com.taobao.android.editionswitcher.boarding.PopWindowView;
import com.taobao.statistic.TBS;
import com.taobao.tao.Globals;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import tb.o78;
import tb.rah;
import tb.t2o;
import tb.x4d;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class d implements c {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static LocaleModel h = null;
    public static boolean i = false;

    /* renamed from: a  reason: collision with root package name */
    public LocaleModel.LocaleData f7634a;
    public LocaleModel.LocaleData b;
    public final com.taobao.android.editionswitcher.boarding.b e;
    public CentralAsiaAdapter g;
    public List<LocaleModel.LocaleData> c = new ArrayList();
    public Map<String, List<LocaleModel.LocaleData>> d = new HashMap();
    public final List<LocaleModel.LocaleData> f = new ArrayList();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements x4d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* renamed from: com.taobao.android.editionswitcher.boarding.d$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
        public class RunnableC0410a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public RunnableC0410a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    d.c(d.this).m1(false);
                }
            }
        }

        public a() {
        }

        @Override // tb.x4d
        public void a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("53320208", new Object[]{this, new Boolean(z)});
                return;
            }
            d.c(d.this).hideLoading();
            if ("others".equalsIgnoreCase(d.this.f7634a.key)) {
                LocaleModel localeModel = d.h;
                if (localeModel == null) {
                    d.this.b = new LocaleModel.LocaleData("zh", "zh");
                    d.this.f7634a = new LocaleModel.LocaleData(o78.CHINA_MAINLAND, o78.CHINA_MAINLAND);
                    d.h = LocaleModel.getDefault();
                    d.d(d.this);
                    return;
                }
                LocaleModel.SiteLangModel siteLangModel = localeModel.currentCountryInfo;
                if (siteLangModel.i18nBlackIp) {
                    d dVar = d.this;
                    dVar.b.key = "zh";
                    dVar.f7634a.key = o78.CHINA_MAINLAND;
                    LocationCallBack.c(Globals.getApplication(), "GLOBAL", null);
                    d.d(d.this);
                } else if (o78.CHINA_MAINLAND.equalsIgnoreCase(siteLangModel.site)) {
                    d dVar2 = d.this;
                    dVar2.b.key = "zh";
                    dVar2.f7634a.key = o78.CHINA_MAINLAND;
                    d.d(dVar2);
                } else {
                    new Handler(Looper.getMainLooper()).post(new RunnableC0410a());
                }
            } else {
                LocaleModel localeModel2 = d.h;
                if (localeModel2 == null) {
                    d.this.b = new LocaleModel.LocaleData("zh", "zh");
                    d.h = LocaleModel.getDefault();
                } else {
                    LocaleModel.SiteLangModel siteLangModel2 = localeModel2.currentCountryInfo;
                    if (siteLangModel2.i18nBlackIp) {
                        d.this.b.key = "zh";
                        LocationCallBack.c(Globals.getApplication(), "GLOBAL", null);
                    } else if (!localeModel2.localBoardingI18nEnable) {
                        if (siteLangModel2.i18nEnable) {
                            d.this.b.key = "en";
                        } else {
                            d.this.b.key = "zh";
                        }
                    }
                }
                LocationCallBack.c(Globals.getApplication(), d.h.currentCountryInfo.site, null);
                d.d(d.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements PopWindowView.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // com.taobao.android.editionswitcher.boarding.PopWindowView.c
        public void a(LocaleModel.LocaleData localeData) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1fbb2132", new Object[]{this, localeData});
                return;
            }
            d dVar = d.this;
            dVar.f7634a = localeData;
            dVar.b = new LocaleModel.LocaleData("ru", "");
        }
    }

    static {
        t2o.a(456130652);
        t2o.a(456130632);
    }

    public d(com.taobao.android.editionswitcher.boarding.b bVar, boolean z) {
        this.e = bVar;
        l(z);
    }

    public static /* synthetic */ com.taobao.android.editionswitcher.boarding.b c(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.editionswitcher.boarding.b) ipChange.ipc$dispatch("7d49ec9a", new Object[]{dVar});
        }
        return dVar.e;
    }

    public static /* synthetic */ void d(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee7f5767", new Object[]{dVar});
        } else {
            dVar.m();
        }
    }

    @Override // com.taobao.android.editionswitcher.boarding.c
    public void a(LocaleModel.LocaleData localeData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5479ccd7", new Object[]{this, localeData});
            return;
        }
        this.b = localeData;
        for (LocaleModel.LocaleData localeData2 : (List) ((HashMap) this.d).get(this.f7634a.key)) {
            if (localeData2.key.equals(localeData.key)) {
                localeData2.selected = true;
            } else {
                localeData2.selected = false;
            }
        }
        this.e.W(this.f7634a.value, this.b.value);
    }

    @Override // com.taobao.android.editionswitcher.boarding.c
    public void b(LocaleModel.LocaleData localeData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3af66c7", new Object[]{this, localeData});
            return;
        }
        this.f7634a = localeData;
        Iterator it = ((ArrayList) this.c).iterator();
        while (it.hasNext()) {
            LocaleModel.LocaleData localeData2 = (LocaleModel.LocaleData) it.next();
            if (localeData.key.equals(localeData2.key)) {
                localeData2.selected = true;
            } else {
                localeData2.selected = false;
            }
        }
        for (LocaleModel.LocaleData localeData3 : (List) ((HashMap) this.d).get(this.f7634a.key)) {
            if (localeData3.isDefault) {
                this.b = localeData3;
                localeData3.selected = true;
            } else {
                localeData3.selected = false;
            }
        }
        this.e.W(this.f7634a.value, this.b.value);
    }

    public void e(boolean z) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94c46385", new Object[]{this, new Boolean(z)});
        } else if (z) {
            this.e.showLoading();
            TBS.Ext.commitEvent(EditionApi.d, 2101, "investigate", "ruSelected", this.f7634a.key);
            EditionApi editionApi = new EditionApi();
            a aVar = new a();
            if ("others".equalsIgnoreCase(this.f7634a.key)) {
                str = "";
            } else {
                str = this.f7634a.key;
            }
            editionApi.e(aVar, 3000L, str);
        } else {
            m();
        }
    }

    public List<LocaleModel.LocaleData> f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("6f578ef8", new Object[]{this});
        }
        return this.c;
    }

    public LocaleModel.LocaleData g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LocaleModel.LocaleData) ipChange.ipc$dispatch("87985f49", new Object[]{this});
        }
        return this.f7634a;
    }

    public LocaleModel.LocaleData h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LocaleModel.LocaleData) ipChange.ipc$dispatch("3960d6dd", new Object[]{this});
        }
        return this.b;
    }

    public List<LocaleModel.LocaleData> i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("cdd5e574", new Object[]{this});
        }
        return this.d.get(this.f7634a.key);
    }

    public final void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a05faee", new Object[]{this});
        } else {
            this.e.Z0();
        }
    }

    public void k(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90b8ec03", new Object[]{this, recyclerView});
            return;
        }
        CentralAsiaAdapter centralAsiaAdapter = new CentralAsiaAdapter(this.f);
        this.g = centralAsiaAdapter;
        centralAsiaAdapter.Q(new b());
        recyclerView.setAdapter(this.g);
    }

    public final void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("697772e0", new Object[]{this});
            return;
        }
        if (!this.f7634a.key.equals(h.currentCountryInfo.site)) {
            LocationCallBack.c(Globals.getApplication(), this.f7634a.key, null);
        }
        Localization.t(rah.b(this.b.key), this.f7634a.key);
        TBS.Ext.commitEvent("Page_LocalBoarding", 2101, "submitClick", null, null, "selectedEdition=" + this.f7634a.key + ",selectedLang=" + this.b.key);
        if (!o78.CHINA_MAINLAND.equals(this.f7634a.key)) {
            EditionApi.g(this.f7634a.key, o78.CHINA_MAINLAND, o78.SWITCH_TYPE_BOARD);
        }
        SwitcheFatigue.forceMute = true;
        j();
    }

    public final void l(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("441b7693", new Object[]{this, new Boolean(z)});
        } else if (z) {
            ((ArrayList) this.f).clear();
            ((ArrayList) this.f).add(new LocaleModel.LocaleData("KZ", "Казахстан", true, R.drawable.ovs_i18n_flag_kz));
            ((ArrayList) this.f).add(new LocaleModel.LocaleData("MN", "Монголия", false, R.drawable.ovs_i18n_flag_mn));
            ((ArrayList) this.f).add(new LocaleModel.LocaleData("UZ", "Узбекистан", false, R.drawable.ovs_i18n_flag_uz));
            ((ArrayList) this.f).add(new LocaleModel.LocaleData("KG", "Кыргызстан", false, R.drawable.ovs_i18n_flag_kg));
            ((ArrayList) this.f).add(new LocaleModel.LocaleData("GE", "Грузия", false, R.drawable.ovs_i18n_flag_ge));
            ((ArrayList) this.f).add(new LocaleModel.LocaleData("others", "Пpoчee", false, R.drawable.ovs_i18n_flag_others));
            this.f7634a = (LocaleModel.LocaleData) ((ArrayList) this.f).get(0);
            this.b = new LocaleModel.LocaleData("ru", "");
            TBS.Ext.commitEvent("Page_LocalBoarding", 2001);
            TBS.Ext.commitEvent(EditionApi.d, 2101, "investigate", "showRuBoarding");
        } else {
            if (h == null) {
                h = LocaleModel.getDefault();
                AppMonitor.Alarm.commitSuccess("Page_LocalBoarding", "defaultData");
            }
            LocaleModel.PromoteText promoteText = h.promoteText;
            if (promoteText != null) {
                this.e.b1(promoteText);
            }
            LocationCallBack.c(Globals.getApplication(), h.currentCountryInfo.site, null);
            LocaleModel.SiteLangModel siteLangModel = h.currentCountryInfo;
            LocaleModel.LocaleData localeData = new LocaleModel.LocaleData("en_US", "English");
            Iterator<LocaleModel.LangModel> it = siteLangModel.langs.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                LocaleModel.LangModel next = it.next();
                if (next.defaultLang) {
                    localeData.key = next.lang;
                    localeData.value = next.langName;
                    break;
                }
            }
            this.c = new ArrayList();
            this.d = new HashMap();
            for (LocaleModel.SiteLangModel siteLangModel2 : h.countryInfo) {
                LocaleModel.LocaleData localeData2 = new LocaleModel.LocaleData(siteLangModel2.site, siteLangModel2.siteName.get(localeData.key));
                if (siteLangModel2.site.equalsIgnoreCase(siteLangModel.site)) {
                    localeData2.selected = true;
                }
                ((ArrayList) this.c).add(localeData2);
                ArrayList arrayList = new ArrayList();
                for (LocaleModel.LangModel langModel : siteLangModel2.langs) {
                    LocaleModel.LocaleData localeData3 = new LocaleModel.LocaleData(langModel.lang, langModel.langName, langModel.defaultLang);
                    if (localeData.key.equalsIgnoreCase(localeData3.key)) {
                        localeData3.selected = true;
                    }
                    arrayList.add(localeData3);
                }
                ((HashMap) this.d).put(siteLangModel2.site, arrayList);
            }
            this.f7634a = new LocaleModel.LocaleData(siteLangModel.site, siteLangModel.siteName.get(localeData.key));
            this.b = localeData;
            TBS.Ext.commitEvent("Page_LocalBoarding", 2001, null, null, null, "selectedEdition=" + this.f7634a.key + ",selectedLang=" + this.b.key + ",pageData=" + JSON.toJSONString(h));
            TBS.Ext.commitEvent(EditionApi.d, 2101, "investigate", "ShowBoarding");
            this.e.W(this.f7634a.value, this.b.value);
        }
    }
}
