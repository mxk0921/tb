package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tinct.ITinctOperater;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class tm2 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String HOME_BUCKETS = "home_buckets";

    /* renamed from: a  reason: collision with root package name */
    public String f28794a;

    static {
        t2o.a(729809860);
    }

    public static String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d59c8946", new Object[0]);
        }
        return m0b.c().getSharedPreferences("home_buckets_key", 0).getString(HOME_BUCKETS, "");
    }

    public final String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e8aa72c5", new Object[]{this});
        }
        if (!TextUtils.isEmpty(this.f28794a)) {
            return this.f28794a;
        }
        return m0b.c().getSharedPreferences("home_buckets_key", 0).getString(HOME_BUCKETS, "");
    }

    public void c(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e22d4ba", new Object[]{this, jSONObject});
        } else if (jSONObject == null || jSONObject.getString(HOME_BUCKETS) == null) {
            ITinctOperater.getInstance().markBatchTouchStoneUsed("Page_Home", b());
        } else {
            d(jSONObject.getString(HOME_BUCKETS));
            ITinctOperater.getInstance().markBatchTouchStoneUsed("Page_Home", jSONObject.getString(HOME_BUCKETS));
        }
    }

    public final void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8e40132", new Object[]{this, str});
            return;
        }
        this.f28794a = str;
        m0b.c().getSharedPreferences("home_buckets_key", 0).edit().putString(HOME_BUCKETS, str).apply();
    }
}
