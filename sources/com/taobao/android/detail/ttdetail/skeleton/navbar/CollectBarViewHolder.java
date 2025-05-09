package com.taobao.android.detail.ttdetail.skeleton.navbar;

import android.content.Context;
import android.text.TextUtils;
import android.widget.Toast;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.handler.event.RuntimeAbilityParam;
import com.taobao.android.detail.ttdetail.widget.desc.TIconFontTextView;
import com.taobao.taobao.R;
import java.util.HashMap;
import java.util.Map;
import mtopsdk.mtop.util.ErrorConstant;
import tb.b5m;
import tb.bw7;
import tb.q84;
import tb.rc7;
import tb.t2o;
import tb.tgh;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class CollectBarViewHolder {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String COLLECTED_ICON_TEXT = "뀛";
    public static final String UNCOLLECTED_ICON_TEXT = "뀚";
    public Map<String, String> d;
    public final Context e;
    public String f;
    public TIconFontTextView g;
    public TaoDetailActionBarV3 h;

    /* renamed from: a  reason: collision with root package name */
    public final String f6918a = b5m.H().localizedString(R.string.tt_detail_not_login);
    public final String b = b5m.H().localizedString(R.string.tt_detail_app_congratulations_collection_success);
    public final String c = b5m.H().localizedString(R.string.tt_detail_app_cancel_collection_success);
    public final b5m.p i = new a();
    public final b5m.p j = new b5m.p() { // from class: com.taobao.android.detail.ttdetail.skeleton.navbar.CollectBarViewHolder.2
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.b5m.p
        public void onFailure(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cccc2dc6", new Object[]{this, str, str2});
                return;
            }
            Toast.makeText(CollectBarViewHolder.d(CollectBarViewHolder.this), str2, 0).show();
            tgh.b("CollectBarViewHolder", "mQueryCollectOnClickCallback onQueryFailed errorMsg " + str2);
        }

        @Override // tb.b5m.p
        public void onSuccess(final boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4b8f9489", new Object[]{this, new Boolean(z)});
                return;
            }
            if (z) {
                b5m.D().c(CollectBarViewHolder.b(CollectBarViewHolder.this), CollectBarViewHolder.this.l);
            } else {
                b5m.D().d(CollectBarViewHolder.b(CollectBarViewHolder.this), CollectBarViewHolder.c(CollectBarViewHolder.this), CollectBarViewHolder.this.k);
            }
            q84.f(CollectBarViewHolder.d(CollectBarViewHolder.this), new rc7("userTrack", new JSONObject() { // from class: com.taobao.android.detail.ttdetail.skeleton.navbar.CollectBarViewHolder.2.1
                {
                    put("eventId", "2101");
                    put("arg1", "Page_Detail_Button-AddToFavorite");
                    put("args", (Object) new JSONObject() { // from class: com.taobao.android.detail.ttdetail.skeleton.navbar.CollectBarViewHolder.2.1.1
                        {
                            String str;
                            put("spm", "a2141.7631564.addfavorite");
                            put("position", "Navigation");
                            if (z) {
                                str = "canceled";
                            } else {
                                str = "add";
                            }
                            put("status", (Object) str);
                        }
                    });
                }
            }, new RuntimeAbilityParam[0]));
        }
    };
    public final b5m.k k = new b();
    public final b5m.k l = new c();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements b5m.p {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.b5m.p
        public void onFailure(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cccc2dc6", new Object[]{this, str, str2});
                return;
            }
            tgh.b("CollectBarViewHolder", "mQueryCollectOnClickCallback onQueryFailed onQueryFailed errorMsg" + str2);
        }

        @Override // tb.b5m.p
        public void onSuccess(boolean z) {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4b8f9489", new Object[]{this, new Boolean(z)});
                return;
            }
            if (CollectBarViewHolder.a(CollectBarViewHolder.this) != null) {
                TIconFontTextView a2 = CollectBarViewHolder.a(CollectBarViewHolder.this);
                if (z) {
                    str = CollectBarViewHolder.COLLECTED_ICON_TEXT;
                } else {
                    str = CollectBarViewHolder.UNCOLLECTED_ICON_TEXT;
                }
                a2.setText(str);
            }
            CollectBarViewHolder.this.k();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b implements b5m.k {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // tb.b5m.k
        public void onFailure(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cccc2dc6", new Object[]{this, str, str2});
                return;
            }
            if (ErrorConstant.isSessionInvalid(str) || TextUtils.equals(str, "ANDROID_SYS_LOGIN_CANCEL")) {
                CollectBarViewHolder collectBarViewHolder = CollectBarViewHolder.this;
                CollectBarViewHolder.f(collectBarViewHolder, CollectBarViewHolder.g(collectBarViewHolder));
            } else if (b5m.H().isI18nEdition()) {
                CollectBarViewHolder.f(CollectBarViewHolder.this, b5m.H().localizedString(R.string.tt_detail_collet_failed));
            } else {
                CollectBarViewHolder.f(CollectBarViewHolder.this, str2);
            }
            HashMap hashMap = new HashMap();
            hashMap.put("errorCode", str);
            hashMap.put("errorMsg", str2);
            hashMap.put("itemId", CollectBarViewHolder.b(CollectBarViewHolder.this));
            bw7.b(hashMap, -100012, "导航栏添加收藏失败");
            tgh.b("CollectBarViewHolder", "mAddCollectCallback onAddFailed errorMsg:" + str2);
        }

        @Override // tb.b5m.k
        public void onSuccess() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d0e393ab", new Object[]{this});
                return;
            }
            CollectBarViewHolder collectBarViewHolder = CollectBarViewHolder.this;
            CollectBarViewHolder.f(collectBarViewHolder, CollectBarViewHolder.e(collectBarViewHolder));
            if (CollectBarViewHolder.a(CollectBarViewHolder.this) != null) {
                CollectBarViewHolder.a(CollectBarViewHolder.this).setText(CollectBarViewHolder.COLLECTED_ICON_TEXT);
            }
            CollectBarViewHolder.this.k();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class c implements b5m.k {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // tb.b5m.k
        public void onFailure(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cccc2dc6", new Object[]{this, str, str2});
                return;
            }
            if (ErrorConstant.isSessionInvalid(str) || TextUtils.equals(str, "ANDROID_SYS_LOGIN_CANCEL")) {
                CollectBarViewHolder collectBarViewHolder = CollectBarViewHolder.this;
                CollectBarViewHolder.f(collectBarViewHolder, CollectBarViewHolder.g(collectBarViewHolder));
            } else if (b5m.H().isI18nEdition()) {
                CollectBarViewHolder.f(CollectBarViewHolder.this, b5m.H().localizedString(R.string.tt_detail_cancel_collet_failed));
            } else {
                CollectBarViewHolder.f(CollectBarViewHolder.this, str2);
            }
            HashMap hashMap = new HashMap();
            hashMap.put("errorCode", str);
            hashMap.put("errorMsg", str2);
            hashMap.put("itemId", CollectBarViewHolder.b(CollectBarViewHolder.this));
            bw7.b(hashMap, -100013, "导航栏取消收藏失败");
            tgh.b("CollectBarViewHolder", "mCancelCollectCallback onCancelFailed errorMsg:" + str2);
        }

        @Override // tb.b5m.k
        public void onSuccess() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d0e393ab", new Object[]{this});
                return;
            }
            CollectBarViewHolder collectBarViewHolder = CollectBarViewHolder.this;
            CollectBarViewHolder.f(collectBarViewHolder, CollectBarViewHolder.h(collectBarViewHolder));
            if (CollectBarViewHolder.a(CollectBarViewHolder.this) != null) {
                CollectBarViewHolder.a(CollectBarViewHolder.this).setText(CollectBarViewHolder.UNCOLLECTED_ICON_TEXT);
            }
            CollectBarViewHolder.this.k();
        }
    }

    static {
        t2o.a(912262577);
    }

    public CollectBarViewHolder(Context context, String str) {
        this.e = context;
        this.f = str;
    }

    public static /* synthetic */ TIconFontTextView a(CollectBarViewHolder collectBarViewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TIconFontTextView) ipChange.ipc$dispatch("d5e8e45d", new Object[]{collectBarViewHolder});
        }
        return collectBarViewHolder.g;
    }

    public static /* synthetic */ String b(CollectBarViewHolder collectBarViewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("67401061", new Object[]{collectBarViewHolder});
        }
        return collectBarViewHolder.f;
    }

    public static /* synthetic */ Map c(CollectBarViewHolder collectBarViewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("18d2a9b3", new Object[]{collectBarViewHolder});
        }
        return collectBarViewHolder.d;
    }

    public static /* synthetic */ Context d(CollectBarViewHolder collectBarViewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("7293a9d5", new Object[]{collectBarViewHolder});
        }
        return collectBarViewHolder.e;
    }

    public static /* synthetic */ String e(CollectBarViewHolder collectBarViewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f665ac64", new Object[]{collectBarViewHolder});
        }
        return collectBarViewHolder.b;
    }

    public static /* synthetic */ void f(CollectBarViewHolder collectBarViewHolder, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("423fb6a5", new Object[]{collectBarViewHolder, str});
        } else {
            collectBarViewHolder.p(str);
        }
    }

    public static /* synthetic */ String g(CollectBarViewHolder collectBarViewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("55d41466", new Object[]{collectBarViewHolder});
        }
        return collectBarViewHolder.f6918a;
    }

    public static /* synthetic */ String h(CollectBarViewHolder collectBarViewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("858b4867", new Object[]{collectBarViewHolder});
        }
        return collectBarViewHolder.c;
    }

    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cef17e4e", new Object[]{this});
        } else {
            b5m.D().e(this.f, this.j);
        }
    }

    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79345661", new Object[]{this});
        } else {
            b5m.D().e(this.f, this.i);
        }
    }

    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb498961", new Object[]{this});
            return;
        }
        TaoDetailActionBarV3 taoDetailActionBarV3 = this.h;
        if (taoDetailActionBarV3 != null) {
            this.h.changeItemChildrenTran(taoDetailActionBarV3.getTransparency());
        }
    }

    public void l(TIconFontTextView tIconFontTextView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac5d88bd", new Object[]{this, tIconFontTextView});
        } else {
            this.g = tIconFontTextView;
        }
    }

    public void m(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d72d134", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str)) {
            this.f = str;
        }
    }

    public void n(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b375f0df", new Object[]{this, map});
        } else {
            this.d = map;
        }
    }

    public void o(TaoDetailActionBarV3 taoDetailActionBarV3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("130dbfba", new Object[]{this, taoDetailActionBarV3});
        } else {
            this.h = taoDetailActionBarV3;
        }
    }

    public final void p(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1afc03b", new Object[]{this, str});
        } else {
            Toast.makeText(this.e, str, 0).show();
        }
    }
}
