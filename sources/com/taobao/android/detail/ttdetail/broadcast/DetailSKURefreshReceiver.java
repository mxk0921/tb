package com.taobao.android.detail.ttdetail.broadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import kotlin.Metadata;
import tb.a07;
import tb.b5m;
import tb.ckf;
import tb.e1i;
import tb.hxj;
import tb.jns;
import tb.kns;
import tb.nb4;
import tb.oa4;
import tb.t2o;
import tb.viq;
import tb.wsq;
import tb.yns;
import tb.z4k;
import tb.ze7;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/taobao/android/detail/ttdetail/broadcast/DetailSKURefreshReceiver;", "Landroid/content/BroadcastReceiver;", "Companion", "a", "tt-detail_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class DetailSKURefreshReceiver extends BroadcastReceiver {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final ze7 f6698a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class a {
        static {
            t2o.a(912261344);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(912261343);
    }

    public DetailSKURefreshReceiver(ze7 ze7Var) {
        ckf.h(ze7Var, "detailContext");
        this.f6698a = ze7Var;
    }

    public static /* synthetic */ Object ipc$super(DetailSKURefreshReceiver detailSKURefreshReceiver, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/broadcast/DetailSKURefreshReceiver");
    }

    public final void c(oa4<?> oa4Var, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28db8f37", new Object[]{this, oa4Var, str});
            return;
        }
        nb4 componentData = oa4Var.getComponentData();
        ckf.c(componentData, "component.componentData");
        JSONObject f = componentData.f();
        if (f != null) {
            f.put((JSONObject) "extraText", str);
            f.put((JSONObject) "idSelectedText", "true");
            oa4Var.updateComponent();
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        JSONObject parseObject;
        oa4<?> a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
            return;
        }
        String str = null;
        String stringExtra = intent != null ? intent.getStringExtra(hxj.UNIQID) : null;
        viq i = this.f6698a.i();
        ckf.c(i, "mDetailContext.stateCenter");
        if (TextUtils.equals(stringExtra, i.b())) {
            if (!Boolean.parseBoolean(intent != null ? intent.getStringExtra("onDismiss") : null)) {
                if (intent != null) {
                    str = intent.getStringExtra("selectedTextMap");
                }
                if (!TextUtils.isEmpty(str) && (parseObject = JSON.parseObject(str)) != null) {
                    String b = b(parseObject);
                    if (!TextUtils.isEmpty(b) && (a2 = a()) != null) {
                        c(a2, b);
                    }
                }
            }
        }
    }

    public final <T extends nb4> oa4<?> a() {
        yns s;
        e1i q;
        oa4<?> f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (oa4) ipChange.ipc$dispatch("3a4656eb", new Object[]{this});
        }
        jns jnsVar = (jns) this.f6698a.e().e(kns.PARSER_ID);
        if (!(jnsVar == null || (s = jnsVar.s()) == null || (q = s.q()) == null)) {
            int l = q.l();
            for (int i = 0; i < l; i++) {
                z4k k = q.k(i);
                if (!(k == null || (f = k.f(this.f6698a.d())) == null)) {
                    nb4 componentData = f.getComponentData();
                    ckf.c(componentData, "component.componentData");
                    String j = componentData.j();
                    if (j != null && (wsq.O(j, "detail_v3_sku", false, 2, null) || wsq.O(j, "tbovs_pdp_sku_i18n", false, 2, null))) {
                        return f;
                    }
                }
            }
        }
        return null;
    }

    public final String b(JSONObject jSONObject) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("78a3f267", new Object[]{this, jSONObject});
        }
        if (jSONObject.getBooleanValue("selectedSkuId")) {
            str = b5m.H().localizedString(R.string.tt_detail_sku_selected);
            ckf.c(str, "PlatformEvn.getLocalizat…g.tt_detail_sku_selected)");
        } else {
            str = b5m.H().localizedString(R.string.tt_detail_sku_select);
            ckf.c(str, "PlatformEvn.getLocalizat…ing.tt_detail_sku_select)");
        }
        String concat = str.concat(" ");
        JSONArray jSONArray = jSONObject.getJSONArray("propTextList");
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.size(); i++) {
                concat = concat + jSONArray.getString(i) + " / ";
            }
        }
        JSONArray jSONArray2 = jSONObject.getJSONArray("serviceTextList");
        if (jSONArray2 != null) {
            for (int i2 = 0; i2 < jSONArray2.size(); i2++) {
                concat = concat + jSONArray2.getString(i2) + " / ";
            }
        }
        if (concat.length() <= 3) {
            return concat;
        }
        String substring = concat.substring(0, concat.length() - 3);
        ckf.c(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }
}
