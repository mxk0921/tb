package tb;

import android.app.Activity;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.util.MyUrlEncoder;
import com.ut.mini.UTAnalytics;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class sda {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Activity f27967a;

    static {
        t2o.a(815793008);
    }

    public sda(Activity activity) {
        ckf.g(activity, "activity");
        this.f27967a = activity;
    }

    public static final void c(sda sdaVar, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ba4d3cf", new Object[]{sdaVar, str, str2, str3});
            return;
        }
        ckf.g(sdaVar, "this$0");
        ckf.g(str, "$arg");
        ckf.g(str2, "$key");
        ckf.g(str3, "$type");
        String encod = MyUrlEncoder.encod(sdaVar.f27967a.getIntent().getDataString(), "UTF-8");
        HashMap hashMap = new HashMap();
        hashMap.put("url", encod);
        hashMap.put("spm-cnt", "0.0.0.0");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("gmkey", (Object) str3);
        hashMap.put("_lka", MyUrlEncoder.encod(String.valueOf(jSONObject.put("gokey", (Object) str)), "UTF-8"));
        hashMap.put("weex", "1");
        hashMap.put("autoSend", "1");
        hashMap.put("extendargs", new JSONObject().toString());
        hashMap.put("gokey", str);
        hashMap.put("logkey", str2);
        hashMap.put("isonepage", "0");
        hashMap.put("cna", "");
        hashMap.put("urlpagename", "");
        UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder(encod, ckf.b(str3, "EXP") ? 2201 : 2101, str2, "", "", hashMap).build());
    }

    public final void b(final String str, final String str2, final String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe657036", new Object[]{this, str, str2, str3});
            return;
        }
        ckf.g(str, "key");
        ckf.g(str2, "type");
        ckf.g(str3, "arg");
        le1.a().execute(new Runnable() { // from class: tb.v7z
            @Override // java.lang.Runnable
            public final void run() {
                sda.c(sda.this, str3, str, str2);
            }
        });
    }
}
