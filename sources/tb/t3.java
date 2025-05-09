package tb;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.taobao.android.autosize.TBDeviceUtils;
import com.taobao.android.nav.Nav;
import com.taobao.android.searchbaseframe.datasource.impl.cell.BaseCellBean;
import com.taobao.android.searchbaseframe.nx3.bean.TemplateBean;
import com.taobao.android.searchbaseframe.util.ListStyle;
import com.taobao.tao.Globals;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.rpc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class t3 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final t3 INSTANCE = new t3();

    /* renamed from: a  reason: collision with root package name */
    public static final HashMap<String, s3> f28447a = new HashMap<>();

    static {
        t2o.a(815792148);
    }

    public final String b(s3 s3Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cacc2334", new Object[]{this, s3Var});
        }
        String valueOf = String.valueOf(System.currentTimeMillis());
        f28447a.put(valueOf, s3Var);
        return valueOf;
    }

    public final s3 c(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (s3) ipChange.ipc$dispatch("1f5b01d3", new Object[]{this, intent});
        }
        ckf.g(intent, CommonCode.Resolution.HAS_RESOLUTION_FROM_APK);
        Bundle extras = intent.getExtras();
        if (extras == null) {
            return null;
        }
        String string = extras.getString("ai_jump_bundle");
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        HashMap<String, s3> hashMap = f28447a;
        ckf.d(string);
        return hashMap.remove(string);
    }

    public final void a(Context context, String str, JSONObject jSONObject, List<? extends BaseCellBean> list, rpc.c cVar, TemplateBean templateBean, ListStyle listStyle, View view) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d0c3032", new Object[]{this, context, str, jSONObject, list, cVar, templateBean, listStyle, view});
            return;
        }
        ckf.g(context, "context");
        ckf.g(str, "query");
        ckf.g(listStyle, "listStyle");
        s3 s3Var = new s3();
        s3Var.i(listStyle);
        s3Var.h(list);
        s3Var.l(cVar);
        s3Var.k(templateBean);
        s3Var.g(view);
        Activity activity = (Activity) context;
        s3Var.j(xyd.a(activity));
        String b = b(s3Var);
        String str2 = "https://web.m.taobao.com/app/taowise/feeds/home";
        if (TBDeviceUtils.p(Globals.getApplication()) || TBDeviceUtils.P(Globals.getApplication())) {
            str2 = Uri.parse(str2).buildUpon().appendQueryParameter(nj7.LARGE_SCREEN_STYLE_KEY, "fullscreen").build().toString();
        }
        Bundle bundle = new Bundle();
        bundle.putString("ai_jump_bundle", b);
        if (jSONObject != null) {
            z = false;
            for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
                if (!(entry.getKey() == null || entry.getValue() == null)) {
                    if (ckf.b(entry.getKey(), "q")) {
                        z = true;
                    }
                    bundle.putString(entry.getKey(), entry.getValue().toString());
                }
            }
        } else {
            z = false;
        }
        if (!z) {
            bundle.putString("q", str);
        }
        Nav.from(context).withExtras(bundle).toUri(str2);
        activity.overridePendingTransition(0, 0);
    }
}
