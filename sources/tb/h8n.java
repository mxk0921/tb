package tb;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.data.meta.Feature;
import com.taobao.android.detail.ttdetail.data.meta.Item;
import com.taobao.android.detail.ttdetail.data.meta.Params;
import com.taobao.android.detail.ttdetail.data.meta.Seller;
import com.taobao.android.detail.ttdetail.utils.DataUtils;
import com.taobao.android.nav.Nav;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class h8n {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final String[] i = {"ref_wp_pk", "ref_wp_m", "ref_wp_p", "collocation_id", "action_id", "album", "mmtag", "scm", yj4.PARAM_PVID, "spm-cnt", "spm", "pre_item_id", "pre_seller_id", "weitao_user_id", "fromtorelation", "afcflow", "bc_fl_src", "crm_s_src", "action", h1p.LIST_PARAM_KEY, h1p.LIST_TYPE_KEY, "object_id", "object_type", "bdid", "carrier_id"};

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, String> f20474a = new HashMap();
    public final JSONObject b = new JSONObject();
    public Intent c;
    public String d;
    public String e;
    public String f;
    public String g;
    public boolean h;

    public h8n(Intent intent) {
        g(intent);
    }

    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3c08308c", new Object[]{this});
        }
        return this.g;
    }

    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e5d35747", new Object[]{this});
        }
        return this.f;
    }

    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("beb1faf5", new Object[]{this});
        }
        return this.d;
    }

    public String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("455f1212", new Object[]{this});
        }
        return this.e;
    }

    public Map<String, String> e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("d1f61736", new Object[]{this});
        }
        HashMap hashMap = new HashMap(this.f20474a);
        String[] L0 = vbl.L0();
        if (L0 != null) {
            for (String str : L0) {
                if (!TextUtils.isEmpty(str) && !k(str)) {
                    hashMap.remove(str);
                }
            }
        }
        return Collections.unmodifiableMap(hashMap);
    }

    public void g(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("793d454", new Object[]{this, intent});
        } else if (intent != null) {
            String stringExtra = intent.getStringExtra("detailRequestId");
            this.f = stringExtra;
            if (TextUtils.isEmpty(stringExtra)) {
                this.f = String.valueOf(UUID.randomUUID().hashCode());
            }
            this.c = intent;
            String f = mff.f(intent);
            this.d = f;
            this.e = f;
            ((HashMap) this.f20474a).put("item_id", f);
            if (TextUtils.isEmpty(this.d)) {
                tgh.a("itemId为空， url=" + this.c.getDataString());
            }
            intent.getLongExtra(Nav.NAV_TO_URL_START_UPTIME, 0L);
            intent.getLongExtra(Nav.NAV_START_ACTIVITY_UPTIME, 0L);
            Uri data = intent.getData();
            if (data != null) {
                String queryParameter = data.getQueryParameter("clickid");
                this.g = queryParameter;
                if (TextUtils.isEmpty(queryParameter)) {
                    this.g = intent.getStringExtra("clickid");
                }
                this.h = "true".equals(data.getQueryParameter("seckill"));
                l(intent.getExtras());
                m(data);
            }
        } else {
            this.f = String.valueOf(UUID.randomUUID().hashCode());
        }
    }

    public boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e57c1609", new Object[]{this})).booleanValue();
        }
        Uri data = this.c.getData();
        if (data == null) {
            return false;
        }
        return TextUtils.equals("launchAdvertisement", data.getQueryParameter("from"));
    }

    public boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("25dabcd0", new Object[]{this})).booleanValue();
        }
        return this.h;
    }

    public final boolean k(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5cc9fa4e", new Object[]{this, str})).booleanValue();
        }
        List<String> J0 = vbl.J0();
        if (J0 == null || !J0.contains(((HashMap) this.f20474a).get(h1p.LIST_TYPE_KEY)) || !TextUtils.equals(str, h1p.LIST_PARAM_KEY)) {
            return false;
        }
        return true;
    }

    public final void l(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bfdbdde6", new Object[]{this, bundle});
        } else if (bundle != null) {
            for (String str : bundle.keySet()) {
                if (!"referrer".equals(str) && !"transImgUrl".equals(str) && !"transImgRatio".equals(str) && !"transImgType".equals(str)) {
                    this.f20474a.put(str, String.valueOf(bundle.get(str)));
                }
            }
        }
    }

    public final void m(Uri uri) {
        Set<String> queryParameterNames;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb307321", new Object[]{this, uri});
        } else if (!TextUtils.isEmpty(uri.getQuery()) && (queryParameterNames = uri.getQueryParameterNames()) != null && !queryParameterNames.isEmpty()) {
            for (String str : queryParameterNames) {
                if (!"referrer".equals(str)) {
                    this.f20474a.put(str, uri.getQueryParameter(str));
                }
            }
        }
    }

    public void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cbf95502", new Object[]{this});
            return;
        }
        String str = this.e;
        this.d = str;
        ((HashMap) this.f20474a).put("item_id", str);
    }

    public void o(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("122c445", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str)) {
            this.e = str;
            tgh.a("updateRequestItemId=" + this.e);
        }
    }

    public void p(bq6 bq6Var) {
        String str;
        JSONObject trackParams;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12effbe0", new Object[]{this, bq6Var});
        } else if (bq6Var != null) {
            f();
            Params params = (Params) bq6Var.f(Params.class);
            if (!(params == null || (trackParams = params.getTrackParams()) == null)) {
                this.b.putAll(trackParams);
            }
            Feature feature = (Feature) bq6Var.f(Feature.class);
            Item item = (Item) bq6Var.f(Item.class);
            Seller seller = (Seller) bq6Var.f(Seller.class);
            if (item == null) {
                str = "";
            } else if (feature == null || !feature.isOneProductMM()) {
                str = item.getItemId();
            } else {
                str = item.getPlatformItemId();
            }
            JSONObject jSONObject = this.b;
            if (str == null) {
                str = "";
            }
            jSONObject.put("item_id", (Object) str);
            this.b.put("shop_id", (Object) DataUtils.G(seller, ""));
            this.b.put("seller_id", (Object) DataUtils.E(seller, ""));
            String string = PreferenceManager.getDefaultSharedPreferences(mr7.d()).getString("appGuide", "");
            if (!TextUtils.isEmpty(string)) {
                this.b.put("appGuide", (Object) string);
            }
        }
    }

    public boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("48ed1cce", new Object[]{this})).booleanValue();
        }
        Uri data = this.c.getData();
        if (data == null) {
            return false;
        }
        return TextUtils.equals("true", data.getQueryParameter("99tm"));
    }

    public JSONObject f() {
        String[] strArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("f9fb2ba2", new Object[]{this});
        }
        if (this.b.isEmpty()) {
            for (String str : i) {
                String str2 = (String) ((HashMap) this.f20474a).get(str);
                if (str2 != null) {
                    this.b.put(str, (Object) str2);
                }
            }
            String str3 = (String) ((HashMap) this.f20474a).get("track_params");
            if (!TextUtils.isEmpty(str3)) {
                try {
                    this.b.putAll(k3i.a(JSON.parseObject(str3)));
                } catch (Throwable unused) {
                }
            }
        }
        return this.b;
    }

    static {
        t2o.a(912262186);
    }
}
