package tb;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.livehome.plugin.atype.flexalocal.business.search.TaoLiveHotWordResponse;
import com.taobao.android.livehome.plugin.atype.flexalocal.business.search.TaoLiveHotwordResponseData;
import com.taobao.android.livehome.plugin.atype.flexalocal.business.search.TaoliveSearchHotWords;
import com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.controller.TabManager;
import com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.view.TextBannerView;
import com.taobao.android.nav.Nav;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.taobao.R;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopResponse;
import tb.mbu;
import tb.nvs;
import tb.o1b;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class o1b extends t0b {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final LinearLayout e;
    public final Context f;
    public final Activity g;
    public final b0h h;
    public TextBannerView i;
    public TextView j;
    public TaoLiveHotwordResponseData k;
    public TabManager.TabUp l;
    public boolean m;
    public final b0e n = new a();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements b0e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.b0e
        public void b(Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6823922", new Object[]{this, map});
            } else if (map != null) {
                o1b.h(o1b.this, 0, map);
            }
        }

        @Override // tb.b0e
        public void a(Map<String, String> map, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7179c2bb", new Object[]{this, map, new Integer(i)});
                return;
            }
            o1b o1bVar = o1b.this;
            if (!o1b.e(o1bVar, o1b.d(o1bVar), "搜索")) {
                o1b.p(o1b.this, 0, map);
            }
        }
    }

    static {
        t2o.a(310378730);
    }

    public o1b(Context context, Activity activity, LinearLayout linearLayout, b0h b0hVar) {
        super(activity, context, linearLayout, b0hVar);
        this.f = context;
        this.g = activity;
        this.e = linearLayout;
        this.h = b0hVar;
        w();
    }

    public static /* synthetic */ Activity d(o1b o1bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("bb66c928", new Object[]{o1bVar});
        }
        return o1bVar.g;
    }

    public static /* synthetic */ boolean e(o1b o1bVar, Activity activity, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b989ef21", new Object[]{o1bVar, activity, str})).booleanValue();
        }
        return o1bVar.r(activity, str);
    }

    public static /* synthetic */ void f(o1b o1bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fba60bef", new Object[]{o1bVar});
        } else {
            o1bVar.D();
        }
    }

    public static /* synthetic */ b0h g(o1b o1bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b0h) ipChange.ipc$dispatch("58bdb795", new Object[]{o1bVar});
        }
        return o1bVar.h;
    }

    public static /* synthetic */ void h(o1b o1bVar, int i, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5f6d013", new Object[]{o1bVar, new Integer(i), map});
        } else {
            o1bVar.E(i, map);
        }
    }

    public static /* synthetic */ TaoLiveHotwordResponseData i(o1b o1bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TaoLiveHotwordResponseData) ipChange.ipc$dispatch("aea7e52a", new Object[]{o1bVar});
        }
        return o1bVar.k;
    }

    public static /* synthetic */ Object ipc$super(o1b o1bVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/livehome/plugin/atype/flexalocal/homepage2/fragment/main/component/HomeMainSearchView");
    }

    public static /* synthetic */ TaoLiveHotwordResponseData j(o1b o1bVar, TaoLiveHotwordResponseData taoLiveHotwordResponseData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TaoLiveHotwordResponseData) ipChange.ipc$dispatch("59fb2f52", new Object[]{o1bVar, taoLiveHotwordResponseData});
        }
        o1bVar.k = taoLiveHotwordResponseData;
        return taoLiveHotwordResponseData;
    }

    public static /* synthetic */ TextBannerView k(o1b o1bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextBannerView) ipChange.ipc$dispatch("e983f944", new Object[]{o1bVar});
        }
        return o1bVar.i;
    }

    public static /* synthetic */ Context l(o1b o1bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("79de5c7c", new Object[]{o1bVar});
        }
        return o1bVar.f;
    }

    public static /* synthetic */ void m(o1b o1bVar, Context context, String str, String str2, String str3, String str4, TaoliveSearchHotWords.RightInfo rightInfo, String str5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("580e146d", new Object[]{o1bVar, context, str, str2, str3, str4, rightInfo, str5});
        } else {
            o1bVar.u(context, str, str2, str3, str4, rightInfo, str5);
        }
    }

    public static /* synthetic */ void n(o1b o1bVar, int i, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a30a43a8", new Object[]{o1bVar, new Integer(i), map});
        } else {
            o1bVar.A(i, map);
        }
    }

    public static /* synthetic */ void o(o1b o1bVar, Context context, String str, String str2, String str3, String str4, TaoliveSearchHotWords.RightInfo rightInfo, String str5, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad35e45", new Object[]{o1bVar, context, str, str2, str3, str4, rightInfo, str5, new Boolean(z)});
        } else {
            o1bVar.t(context, str, str2, str3, str4, rightInfo, str5, z);
        }
    }

    public static /* synthetic */ void p(o1b o1bVar, int i, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a8823aa", new Object[]{o1bVar, new Integer(i), map});
        } else {
            o1bVar.B(i, map);
        }
    }

    public static /* synthetic */ boolean q(o1b o1bVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b1ad42d", new Object[]{o1bVar, new Boolean(z)})).booleanValue();
        }
        o1bVar.m = z;
        return z;
    }

    public final void A(int i, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("843f191c", new Object[]{this, new Integer(i), map});
            return;
        }
        TabManager.TabUp tabUp = this.l;
        if (tabUp != null) {
            Map<String, String> s = s(tabUp.spm);
            if (map != null) {
                s.putAll(map);
            }
            p9m.c("searchbutton", s);
        }
    }

    public final void B(int i, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48526688", new Object[]{this, new Integer(i), map});
            return;
        }
        TabManager.TabUp tabUp = this.l;
        if (tabUp != null) {
            Map<String, String> s = s(tabUp.spm);
            if (map != null) {
                s.putAll(map);
            }
            p9m.c("searchbox", s);
        }
    }

    public final void C(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("725127b8", new Object[]{this, new Integer(i)});
            return;
        }
        TabManager.TabUp tabUp = this.l;
        if (tabUp != null) {
            p9m.g("Show-searchbox", s(tabUp.spm));
        }
    }

    public final void D() {
        TextBannerView textBannerView;
        String str;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85c0a39b", new Object[]{this});
            return;
        }
        TaoLiveHotwordResponseData taoLiveHotwordResponseData = this.k;
        if (!(taoLiveHotwordResponseData == null || (str = taoLiveHotwordResponseData.hotWords) == null)) {
            taoLiveHotwordResponseData.hotWordsData = (TaoliveSearchHotWords) JSON.parseObject(str, TaoliveSearchHotWords.class);
            TaoliveSearchHotWords taoliveSearchHotWords = this.k.hotWordsData;
            if (!(taoliveSearchHotWords == null || (str2 = taoliveSearchHotWords.word) == null)) {
                G(str2);
            }
        }
        TaoLiveHotwordResponseData taoLiveHotwordResponseData2 = this.k;
        if (taoLiveHotwordResponseData2 != null && taoLiveHotwordResponseData2.hotWordsList != null) {
            v();
            TaoLiveHotwordResponseData taoLiveHotwordResponseData3 = this.k;
            taoLiveHotwordResponseData3.hotWordsDataList = y(taoLiveHotwordResponseData3.hotWordsList);
            List<TaoliveSearchHotWords> list = this.k.hotWordsDataList;
            if (list != null && (textBannerView = this.i) != null) {
                textBannerView.setWithLabelDatas(list);
            }
        }
    }

    public final void E(int i, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("828d7377", new Object[]{this, new Integer(i), map});
            return;
        }
        TabManager.TabUp tabUp = this.l;
        if (tabUp != null) {
            Map<String, String> s = s(tabUp.spm);
            s.putAll(map);
            p9m.g("Show-shaded_word", s);
        }
    }

    public void F(TabManager.TabUp tabUp) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9709ec8", new Object[]{this, tabUp});
        } else {
            this.l = tabUp;
        }
    }

    public void G(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99319ba2", new Object[]{this, str});
            return;
        }
        TextBannerView textBannerView = this.i;
        if (textBannerView != null) {
            textBannerView.setVisibility(8);
        }
        TextView textView = this.j;
        if (textView != null) {
            textView.setVisibility(0);
            this.j.setText(str);
        }
    }

    public final Map<String, String> s(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("43de2332", new Object[]{this, str});
        }
        HashMap hashMap = new HashMap();
        hashMap.put("spm-cnt", str);
        b0h b0hVar = this.h;
        if (b0hVar != null) {
            hashMap.put("entryLiveSource", b0hVar.f);
            hashMap.put("entrySpm", this.h.g);
        }
        return hashMap;
    }

    public final void t(Context context, String str, String str2, String str3, String str4, TaoliveSearchHotWords.RightInfo rightInfo, String str5, boolean z) {
        String str6;
        String str7;
        JSONObject parseObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e5e903a", new Object[]{this, context, str, str2, str3, str4, rightInfo, str5, new Boolean(z)});
        } else if (!TextUtils.isEmpty(str)) {
            Bundle bundle = new Bundle();
            bundle.putString(TaoliveSearchHotWords.TYPE_WORD, str2);
            bundle.putString("type", str3);
            bundle.putString("url", str4);
            if (str.contains("?")) {
                str6 = str.concat("&search_entry=jingxuan");
            } else {
                str6 = str.concat("?search_entry=jingxuan");
            }
            if (z) {
                if (!TextUtils.isEmpty(str2)) {
                    str6 = str6 + "&keyword=" + Uri.encode(str2);
                }
                str7 = str6 + "&fcc_match_query=path&path=result";
            } else {
                str7 = str6 + "&fcc_match_query=path&path=middle";
            }
            if (!TextUtils.isEmpty(str2)) {
                str7 = str7 + "&word=" + Uri.encode(str2);
            }
            if (!TextUtils.isEmpty(str3)) {
                str7 = str7 + "&type=" + Uri.encode(str3);
            }
            if (rightInfo != null) {
                str7 = str7 + "&rightInfo=" + Uri.encode(JSON.toJSONString(rightInfo));
            }
            if (!TextUtils.isEmpty(str)) {
                str7 = str7 + "&url=" + Uri.encode(str4);
            }
            String str8 = str7 + "&androidKeyboard=true";
            if (!TextUtils.isEmpty(str5) && (parseObject = JSON.parseObject(str5)) != null && !parseObject.isEmpty()) {
                if (nvs.u0()) {
                    parseObject.remove("utLogMap");
                }
                str8 = str8 + "&searchUtParams=" + Uri.encode(parseObject.toJSONString());
            }
            Nav.from(context).withExtras(bundle).toUri(str8);
        }
    }

    public final void u(Context context, String str, String str2, String str3, String str4, TaoliveSearchHotWords.RightInfo rightInfo, String str5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1241b527", new Object[]{this, context, str, str2, str3, str4, rightInfo, str5});
        } else if (!TextUtils.isEmpty(str4)) {
            Nav.from(context).toUri(str4);
        } else {
            t(context, str, str2, str3, str4, rightInfo, str5, true);
        }
    }

    public void v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("adbb42f3", new Object[]{this});
            return;
        }
        TextView textView = this.j;
        if (textView != null) {
            textView.setVisibility(8);
        }
    }

    public final void w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2944104", new Object[]{this});
            return;
        }
        LinearLayout linearLayout = this.e;
        if (linearLayout != null) {
            TextBannerView textBannerView = (TextBannerView) linearLayout.findViewById(R.id.live_search_new_hints);
            this.i = textBannerView;
            textBannerView.setItemListener(this.n);
            b0h b0hVar = this.h;
            if (b0hVar != null && p0.g(b0hVar.t())) {
                this.i.setNewSingleChannel(true);
            }
            this.j = (TextView) this.e.findViewById(R.id.search_default_hint);
            TextView textView = (TextView) this.e.findViewById(R.id.search_btn);
            if (textView != null) {
                textView.setOnClickListener(new m1b(this));
            }
            this.e.setOnClickListener(new n1b(this));
            C(0);
        }
    }

    public void x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
        } else if (this.m && nvs.a() && p0.b()) {
            z();
        }
    }

    public final List<TaoliveSearchHotWords> y(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("9a060b9", new Object[]{this, str});
        }
        if (str == null) {
            return null;
        }
        return JSON.parseArray(str, TaoliveSearchHotWords.class);
    }

    public void z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17700648", new Object[]{this});
        } else {
            new qws(new IRemoteBaseListener() { // from class: com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.main.component.HomeMainSearchView$3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.tao.remotebusiness.IRemoteListener
                public void onError(int i, MtopResponse mtopResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                        return;
                    }
                    o1b.this.G(nvs.k0());
                    mbu.d("requestError", "firstRequest", mtopResponse, o1b.g(o1b.this));
                }

                @Override // com.taobao.tao.remotebusiness.IRemoteListener
                public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                        return;
                    }
                    o1b.q(o1b.this, true);
                    if ((baseOutDo instanceof TaoLiveHotWordResponse) && (baseOutDo.getData() instanceof TaoLiveHotwordResponseData)) {
                        o1b.j(o1b.this, ((TaoLiveHotWordResponse) baseOutDo).getData());
                        o1b.f(o1b.this);
                        mbu.d("RequestSuccess", "firstRequest", mtopResponse, o1b.g(o1b.this));
                    }
                }

                @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
                public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                    } else {
                        onError(i, mtopResponse, obj);
                    }
                }
            }).j(this.h, this.g);
        }
    }

    public final boolean r(Activity activity, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ffcc4531", new Object[]{this, activity, str})).booleanValue();
        }
        try {
            if (!xpr.y(this.g)) {
                return false;
            }
            Locale.getDefault();
            Toast.makeText(activity, "当前处于未成年人模式中，无法使用" + str + "功能", 1).show();
            return true;
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }
}
