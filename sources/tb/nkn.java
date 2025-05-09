package tb;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.alipay.birdnest.util.UiUtil;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class nkn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f24796a;
    public final JSONObject b = new JSONObject();
    public boolean c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;

    static {
        t2o.a(352322214);
    }

    public final String a(JSONObject jSONObject, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("92f98a9f", new Object[]{this, jSONObject, str, str2});
        }
        String string = jSONObject.getString(str);
        if (TextUtils.isEmpty(string)) {
            this.b.put(str2, (Object) "");
            return string;
        }
        this.b.put(str2, (Object) string);
        return string;
    }

    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("496d68d9", new Object[]{this});
        }
        return this.i;
    }

    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c36953d4", new Object[]{this});
        }
        return this.e;
    }

    public String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2a97e606", new Object[]{this});
        }
        return this.f;
    }

    public String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fed59c43", new Object[]{this});
        }
        return this.d;
    }

    public JSONObject f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("5a41fbaa", new Object[]{this});
        }
        return this.b;
    }

    public String g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a7100c1e", new Object[]{this});
        }
        return this.g;
    }

    public boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4051b7a5", new Object[]{this})).booleanValue();
        }
        return this.c;
    }

    public void k(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1efead1d", new Object[]{this, new Integer(i)});
        } else {
            this.b.put(UiUtil.INPUT_TYPE_VALUE_NUM, (Object) String.valueOf(i));
        }
    }

    public boolean m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("733a5913", new Object[]{this})).booleanValue();
        }
        return TextUtils.isEmpty(this.f24796a);
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "RRP{mRootCategoryId='" + this.f24796a + "', mRealtimeConfig=" + this.b + ", mParseSuccess=" + this.c + ", mParseErrorMsg='" + this.d + "', mFeedToken='" + this.e + "', mNid='" + this.f + "', mRealtimeType='" + this.g + "', mNidFrom='" + this.h + "'}";
    }

    public static nkn j(Context context, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nkn) ipChange.ipc$dispatch("33a2c375", new Object[]{context, intent});
        }
        nkn nknVar = new nkn();
        JSONObject jSONObject = (JSONObject) intent.getSerializableExtra("event");
        JSONObject jSONObject2 = (JSONObject) intent.getSerializableExtra("feature");
        if (jSONObject == null) {
            nknVar.d = "eventNotFound";
            return nknVar;
        }
        JSONObject jSONObject3 = jSONObject.getJSONObject("bizArgsMap");
        if (jSONObject3 == null) {
            nknVar.d = "bizArgsMapNotFound";
            return nknVar;
        } else if (jSONObject2 == null) {
            nknVar.d = "featureNotFound";
            return nknVar;
        } else {
            String string = jSONObject2.getString("token");
            if (TextUtils.isEmpty(string)) {
                string = jSONObject3.getString("feedToken");
            }
            if (!h(nknVar, jSONObject3, jSONObject2)) {
                return nknVar;
            }
            nknVar.e = string;
            nknVar.g = nknVar.a(jSONObject2, "realtimeType", "type");
            nknVar.i = nknVar.a(jSONObject2, "cardNum", "cardnum");
            nknVar.a(jSONObject2, "itemId", "item_id");
            nknVar.a(jSONObject2, "contentId", "content_id");
            nknVar.a(jSONObject2, "cateId", "categoryId");
            nknVar.a(jSONObject2, "sellerId", "seller_id");
            String string2 = jSONObject3.getString("rootCategoryId");
            if (TextUtils.isEmpty(string2)) {
                string2 = jSONObject2.getString("rootCategoryId");
            }
            if (nknVar.l(string2)) {
                txj.e(txj.TAG_REALTIME, "实时插卡，成功从 bizArgsMap 或 feature 中获取到 rootCategoryId:" + string2);
            } else {
                txj.e(txj.TAG_REALTIME, "警告:实时插卡，无法从 bizArgsMap 和 feature 获取到 rootCategoryId");
            }
            nknVar.c = true;
            return nknVar;
        }
    }

    public boolean l(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("941c013f", new Object[]{this, str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            str = this.f24796a;
        }
        if (str == null) {
            str = "";
        }
        this.f24796a = str;
        this.b.put("rootCategoryId", (Object) str);
        return !TextUtils.isEmpty(str);
    }

    public static boolean h(nkn nknVar, JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("22ab687d", new Object[]{nknVar, jSONObject, jSONObject2})).booleanValue();
        }
        String string = jSONObject2.getString("itemId");
        String string2 = jSONObject2.getString("nid");
        nknVar.h = "feature.nid";
        if (TextUtils.isEmpty(string2)) {
            string2 = jSONObject.getString("nid");
            nknVar.h = "bizArgsMap.nid";
            txj.e(txj.TAG_REALTIME, "警告:实时插卡无法从 feature 中取到 nid 参数，尝试读取 bizArgsMap 为:" + string2);
        }
        if (TextUtils.isEmpty(string2)) {
            nknVar.h = "feature.itemId";
            if (TextUtils.isEmpty(string)) {
                txj.e(txj.TAG_REALTIME, "异常:实时插卡无法从 feature 和 bizArgsMap 中取 nid 参数。并且 feature.itemId 也为空。");
                nknVar.d = "nidAndItemIdNotFound";
                return false;
            }
            txj.e(txj.TAG_REALTIME, "警告:实时插卡无法从 feature 和 bizArgsMap 中取 nid 参数。已使用 feature.itemId 代替:" + string);
        } else {
            string = string2;
        }
        nknVar.f = string;
        return true;
    }
}
