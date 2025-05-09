package com.taobao.android.detail.alittdetail.share;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.alittdetail.share.ShareUtils;
import com.taobao.android.detail.ttdetail.data.meta.Item;
import com.taobao.android.detail.ttdetail.handler.event.RuntimeAbilityParam;
import com.taobao.android.detail.ttdetail.utils.DataUtils;
import java.util.Locale;
import tb.ir;
import tb.r4l;
import tb.t2o;
import tb.ze7;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class a extends r4l {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EVENT_TYPE = "openShare";
    public static final String EVENT_TYPE_ALTERNATIVE = "share";
    public final ze7 b;

    static {
        t2o.a(354418776);
    }

    public a(Context context, ze7 ze7Var) {
        super(context, ze7Var);
        this.b = ze7Var;
    }

    public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/alittdetail/share/OpenTaobaoShareImplementor");
    }

    @Override // tb.r4l, tb.zre
    public boolean a(ir irVar, RuntimeAbilityParam... runtimeAbilityParamArr) {
        String str;
        String str2;
        JSONObject jSONObject;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5228eae5", new Object[]{this, irVar, runtimeAbilityParamArr})).booleanValue();
        }
        if (irVar == null) {
            return false;
        }
        JSONObject a2 = irVar.a();
        if (c(runtimeAbilityParamArr)) {
            ShareUtils.d(this.b, a2, b(runtimeAbilityParamArr));
            return true;
        }
        if (a2 != null) {
            String string = a2.getString("iconType");
            if (!TextUtils.isEmpty(string)) {
                try {
                    i = Integer.parseInt(string);
                } catch (Throwable unused) {
                }
            }
        }
        ShareUtils.b e = new ShareUtils.b().e("想告诉谁");
        if (a2 == null || (jSONObject = a2.getJSONObject("detailShareParams")) == null) {
            str2 = "";
            str = str2;
        } else {
            str2 = jSONObject.getString("share_businessId");
            jSONObject.remove("share_businessId");
            str = jSONObject.getString("share_imageUrl");
            jSONObject.remove("share_imageUrl");
            e.f(jSONObject);
        }
        if (4 == i) {
            Locale locale = Locale.CHINA;
            String x = DataUtils.x((Item) this.b.e().f(Item.class), "");
            e.b("我剁手都要买的宝贝（" + x + "），快来和我一起瓜分红包").d("true").a("baobeixiangqingfenxiang");
        }
        if (TextUtils.isEmpty(e.b) && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str)) {
            e.a(str2).c(str);
        }
        ShareUtils.e(this.b, e);
        return true;
    }

    public final View b(RuntimeAbilityParam... runtimeAbilityParamArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("25f592e8", new Object[]{this, runtimeAbilityParamArr});
        }
        if (runtimeAbilityParamArr == null) {
            return null;
        }
        for (RuntimeAbilityParam runtimeAbilityParam : runtimeAbilityParamArr) {
            if ("shareContainer".equals(runtimeAbilityParam.getKey())) {
                Object value = runtimeAbilityParam.getValue();
                if (value instanceof View) {
                    return (View) value;
                }
            }
        }
        return null;
    }

    public final boolean c(RuntimeAbilityParam... runtimeAbilityParamArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3c6f6167", new Object[]{this, runtimeAbilityParamArr})).booleanValue();
        }
        if (runtimeAbilityParamArr == null) {
            return false;
        }
        for (RuntimeAbilityParam runtimeAbilityParam : runtimeAbilityParamArr) {
            if ("shareFromSku".equals(runtimeAbilityParam.getKey())) {
                Object value = runtimeAbilityParam.getValue();
                if (value instanceof Boolean) {
                    return ((Boolean) value).booleanValue();
                }
            }
        }
        return false;
    }
}
