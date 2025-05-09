package com.taobao.android.detail.wrapper.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.FragmentActivity;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.Map;
import tb.acq;
import tb.fyh;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class MacColorActivity extends FragmentActivity {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements fyh.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ List f7071a;
        public final /* synthetic */ String b;

        public a(List list, String str) {
            this.f7071a = list;
            this.b = str;
        }

        public void a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("99807463", new Object[]{this, str});
                return;
            }
            Map map = null;
            for (Map map2 : this.f7071a) {
                String str2 = (String) map2.get("pvId");
                if (!TextUtils.isEmpty(str2) && str2.contains(str)) {
                    map2.put("macVidChanged", "true");
                    map = map2;
                }
            }
            if (map != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("params", (Object) map);
                jSONObject.put("action", (Object) "biz_maccolor");
                jSONObject.put("skuToken", (Object) this.b);
                Intent intent = new Intent();
                intent.setAction("com.taobao.sku.intent.action.transferData");
                intent.putExtra("stringifyData", jSONObject.toJSONString());
                intent.addCategory("android.intent.category.DEFAULT");
                MacColorActivity.this.sendBroadcast(intent);
                MacColorActivity.this.finish();
            }
        }
    }

    static {
        t2o.a(443547654);
    }

    public static /* synthetic */ Object ipc$super(MacColorActivity macColorActivity, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -641568046) {
            super.onCreate((Bundle) objArr[0]);
            return null;
        } else if (hashCode == 514894248) {
            super.attachBaseContext((Context) objArr[0]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/detail/wrapper/activity/MacColorActivity");
        }
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1eb0a9a8", new Object[]{this, context});
            return;
        }
        super.attachBaseContext(context);
        acq.B(context);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        try {
            Map map = (Map) getIntent().getSerializableExtra("fields");
            JSONObject jSONObject = new JSONObject(map);
            List list = (List) map.get("vPropertyList");
            fyh fyhVar = new fyh(this);
            fyhVar.j(jSONObject);
            fyhVar.k((String) map.get("url"), new a(list, (String) ((Map) map.get("queryParams")).get("sku_token")));
        } catch (Exception unused) {
            finish();
        }
    }
}
