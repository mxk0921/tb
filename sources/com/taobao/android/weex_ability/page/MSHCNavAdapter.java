package com.taobao.android.weex_ability.page;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_ability.page.a;
import java.util.ArrayList;
import java.util.List;
import tb.dsh;
import tb.dwh;
import tb.e5x;
import tb.lq0;
import tb.qrh;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public abstract class MSHCNavAdapter extends qrh {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CONFIG_GROUP_WEEX_HC = "group_weex_hc";
    public static final String CONFIG_KEY_WEEX_MAIN_HC_DOMAIN = "weex_main_hc_domain";
    public static final String e = "clickrightitem";
    public static final String f = "clickmoreitem";
    public static final String g = "clickcenteritem";
    public b b = null;
    public b c = null;
    public List<b> d = null;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public enum NavigatorType {
        TITLE,
        MORE_ITEM,
        CLEAR_MORE_ITEM,
        RIGHT_ITEM,
        CLEAR_RIGHT_ITEM;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(NavigatorType navigatorType, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex_ability/page/MSHCNavAdapter$NavigatorType");
        }

        public static NavigatorType valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (NavigatorType) ipChange.ipc$dispatch("eb757c60", new Object[]{str});
            }
            return (NavigatorType) Enum.valueOf(NavigatorType.class, str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] $SwitchMap$com$taobao$android$weex_ability$page$MSHCNavAdapter$NavigatorType;

        static {
            int[] iArr = new int[NavigatorType.values().length];
            $SwitchMap$com$taobao$android$weex_ability$page$MSHCNavAdapter$NavigatorType = iArr;
            try {
                iArr[NavigatorType.RIGHT_ITEM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$taobao$android$weex_ability$page$MSHCNavAdapter$NavigatorType[NavigatorType.CLEAR_RIGHT_ITEM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$taobao$android$weex_ability$page$MSHCNavAdapter$NavigatorType[NavigatorType.TITLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static {
        t2o.a(980418659);
        t2o.a(980418655);
    }

    public MSHCNavAdapter(FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    public static /* synthetic */ Object ipc$super(MSHCNavAdapter mSHCNavAdapter, String str, Object... objArr) {
        if (str.hashCode() == -1983604863) {
            mSHCNavAdapter.o();
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex_ability/page/MSHCNavAdapter");
    }

    public final boolean A(NavigatorType navigatorType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d000d3ec", new Object[]{this, navigatorType})).booleanValue();
        }
        int i = a.$SwitchMap$com$taobao$android$weex_ability$page$MSHCNavAdapter$NavigatorType[navigatorType.ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            return z();
        }
        return true;
    }

    @Override // com.taobao.android.weex_ability.page.a
    public lq0 g(com.taobao.android.weex_framework.a aVar, JSONObject jSONObject, a.AbstractC0517a aVar2) {
        MUSPageFragment mUSPageFragment;
        FragmentManager supportFragmentManager;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lq0) ipChange.ipc$dispatch("42169ac7", new Object[]{this, aVar, jSONObject, aVar2});
        }
        boolean w = w(jSONObject.toJSONString());
        if (p() == null || (supportFragmentManager = p().getSupportFragmentManager()) == null) {
            mUSPageFragment = null;
        } else {
            mUSPageFragment = (MUSPageFragment) supportFragmentManager.findFragmentByTag("ali_mus_fragment_tag");
        }
        if (w || mUSPageFragment == null) {
            z = w;
        } else if (jSONObject.size() > 0) {
            mUSPageFragment.J2(aVar2);
        } else {
            mUSPageFragment.J2(null);
        }
        if (!z) {
            return new lq0("MUS_FAILED", "");
        }
        return null;
    }

    @Override // com.taobao.android.weex_ability.page.a
    public lq0 h(com.taobao.android.weex_framework.a aVar, JSONObject jSONObject, a.AbstractC0517a aVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lq0) ipChange.ipc$dispatch("1dca9295", new Object[]{this, aVar, jSONObject, aVar2});
        }
        if (!x(jSONObject.toJSONString(), aVar2)) {
            return new lq0("WX_ERROR", "");
        }
        return null;
    }

    @Override // com.taobao.android.weex_ability.page.a
    public lq0 i(com.taobao.android.weex_framework.a aVar, JSONObject jSONObject, a.AbstractC0517a aVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lq0) ipChange.ipc$dispatch("771221d8", new Object[]{this, aVar, jSONObject, aVar2});
        }
        if (!y(jSONObject.toJSONString(), aVar2)) {
            return new lq0();
        }
        return null;
    }

    @Override // com.taobao.android.weex_ability.page.a
    public lq0 k(com.taobao.android.weex_framework.a aVar, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lq0) ipChange.ipc$dispatch("5402abc1", new Object[]{this, aVar, jSONObject});
        }
        if (!A(NavigatorType.TITLE)) {
            return new lq0("WX_FAILED", "can not set Navigator");
        }
        String string = jSONObject.getString("title");
        String string2 = jSONObject.getString("icon");
        this.c = new b();
        if (!TextUtils.isEmpty(string2)) {
            if (!q(string2)) {
                return new lq0("MUS_FAILED", "schemeerror");
            }
            this.c.e = string2;
            p().invalidateOptionsMenu();
            return null;
        } else if (TextUtils.isEmpty(string)) {
            return new lq0("MUS_FAILED", "paramerror");
        } else {
            this.c.d = string;
            p().invalidateOptionsMenu();
            return null;
        }
    }

    public boolean r(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3bac709a", new Object[]{this, str})).booleanValue();
        }
        if (!A(NavigatorType.CLEAR_MORE_ITEM)) {
            return false;
        }
        List<b> list = this.d;
        if (list == null) {
            this.d = new ArrayList();
        } else {
            list.clear();
        }
        p().invalidateOptionsMenu();
        return false;
    }

    public MUSPageFragment s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MUSPageFragment) ipChange.ipc$dispatch("dc18f49", new Object[]{this});
        }
        Fragment findFragmentByTag = p().getSupportFragmentManager().findFragmentByTag("ali_mus_fragment_tag");
        if (findFragmentByTag instanceof MUSPageFragment) {
            return (MUSPageFragment) findFragmentByTag;
        }
        return null;
    }

    public List<b> t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("3613e5c3", new Object[]{this});
        }
        return this.d;
    }

    public b u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("53f35511", new Object[]{this});
        }
        return this.b;
    }

    public b v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("b1d51e55", new Object[]{this});
        }
        return this.c;
    }

    public boolean w(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("37e9da61", new Object[]{this, str})).booleanValue();
        }
        return false;
    }

    public final boolean q(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("539713a2", new Object[]{this, str})).booleanValue();
        }
        String scheme = Uri.parse(str).getScheme();
        if (!TextUtils.isEmpty(scheme)) {
            String lowerCase = scheme.toLowerCase();
            if (lowerCase.equals("http") || lowerCase.equals("https") || lowerCase.equals("data") || lowerCase.equals("local")) {
                return true;
            }
        }
        return false;
    }

    public final boolean x(String str, a.AbstractC0517a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dfa8308f", new Object[]{this, str, aVar})).booleanValue();
        }
        if (A(NavigatorType.MORE_ITEM) && !TextUtils.isEmpty(str)) {
            try {
                List<b> list = this.d;
                if (list == null) {
                    this.d = new ArrayList();
                } else {
                    list.clear();
                }
                if (aVar != null) {
                    JSONObject parseObject = JSON.parseObject(str);
                    if (parseObject.size() == 0) {
                        r("");
                        return true;
                    }
                    JSONArray jSONArray = parseObject.getJSONArray("items");
                    if (jSONArray == null || jSONArray.size() <= 0) {
                        b bVar = new b();
                        bVar.g = aVar;
                        String string = parseObject.getString("icon");
                        String string2 = parseObject.getString("title");
                        String string3 = parseObject.getString("iconFontName");
                        if (!TextUtils.isEmpty(string)) {
                            bVar.e = string;
                        }
                        if (!TextUtils.isEmpty(string3)) {
                            bVar.b(p(), string3);
                        }
                        if (!TextUtils.isEmpty(string2)) {
                            bVar.d(string2);
                        }
                        Intent intent = new Intent();
                        bVar.f = intent;
                        intent.putExtra("index", 0);
                        this.d.add(bVar);
                        p().invalidateOptionsMenu();
                        return true;
                    }
                    for (int i = 0; i < jSONArray.size(); i++) {
                        JSONObject jSONObject = jSONArray.getJSONObject(i);
                        String string4 = jSONObject.getString("title");
                        String string5 = jSONObject.getString("icon");
                        b bVar2 = new b();
                        bVar2.g = aVar;
                        Intent intent2 = new Intent();
                        bVar2.f = intent2;
                        intent2.putExtra("index", i);
                        if (!TextUtils.isEmpty(string5)) {
                            bVar2.e = string5;
                        }
                        if (!TextUtils.isEmpty(string4)) {
                            bVar2.d(string4);
                        }
                        if (!q(bVar2.e)) {
                            return false;
                        }
                        this.d.add(bVar2);
                    }
                    p().supportInvalidateOptionsMenu();
                    return true;
                }
                JSONObject parseObject2 = JSON.parseObject(str);
                if (parseObject2.size() == 0) {
                    r("");
                    return true;
                }
                JSONArray jSONArray2 = parseObject2.getJSONArray("items");
                if (jSONArray2 != null && jSONArray2.size() > 0) {
                    for (int i2 = 0; i2 < jSONArray2.size(); i2++) {
                        JSONObject jSONObject2 = jSONArray2.getJSONObject(i2);
                        b bVar3 = new b();
                        String string6 = jSONObject2.getString("text");
                        if (!TextUtils.isEmpty(string6)) {
                            bVar3.d = string6;
                            boolean booleanValue = jSONObject2.getBooleanValue("fromNative");
                            boolean booleanValue2 = jSONObject2.getBooleanValue("iconFont");
                            String string7 = jSONObject2.getString("icon");
                            if (!booleanValue) {
                                bVar3.a(string7, dsh.a(p()));
                            } else if (booleanValue2) {
                                bVar3.b(p(), string7);
                            } else {
                                bVar3.c(string7);
                            }
                            Intent intent3 = new Intent();
                            bVar3.f = intent3;
                            intent3.putExtra("index", i2);
                            this.d.add(bVar3);
                        }
                    }
                }
                p().invalidateOptionsMenu();
                return true;
            } catch (Exception e2) {
                dwh.f("WebAppInterface", "setNavBarRightItem: param parse to JSON error, param=" + e2.getMessage());
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x00f4, code lost:
        if (r7.b.b(p(), r9) >= 0) goto L_0x00f6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean y(java.lang.String r8, com.taobao.android.weex_ability.page.a.AbstractC0517a r9) {
        /*
            Method dump skipped, instructions count: 309
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.weex_ability.page.MSHCNavAdapter.y(java.lang.String, com.taobao.android.weex_ability.page.a$a):boolean");
    }

    public boolean z() {
        String[] split;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("823b61f3", new Object[]{this})).booleanValue();
        }
        try {
            String config = e5x.b().a().getConfig("group_weex_hc", "weex_main_hc_domain", "");
            if (!TextUtils.isEmpty(config)) {
                for (String str : config.split(",")) {
                    String originalUrl = s().getOriginalUrl();
                    if (!TextUtils.isEmpty(originalUrl) && originalUrl.contains(str)) {
                        return false;
                    }
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return true;
    }
}
