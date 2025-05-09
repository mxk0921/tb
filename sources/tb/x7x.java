package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class x7x {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public z4a f31200a;
    public String b;
    public String c;
    public Map<?, ?> d;
    public boolean e;

    static {
        t2o.a(729810021);
    }

    public x7x(String str) {
        e(str);
    }

    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("67b7a95", new Object[]{this});
        }
        return this.b;
    }

    public z4a b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (z4a) ipChange.ipc$dispatch("4ac9b2ee", new Object[]{this});
        }
        return this.f31200a;
    }

    public Map<?, ?> c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("a6a6cfb4", new Object[]{this});
        }
        return this.d;
    }

    public String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2a8fef97", new Object[]{this});
        }
        return this.c;
    }

    public final void e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7f6d007", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str)) {
            JSONObject parseObject = JSON.parseObject(str);
            this.f31200a = z4a.d(parseObject.getString("channel"));
            this.b = parseObject.getString("api");
            this.c = parseObject.getString("version");
            this.e = a3b.o(parseObject.getString("showLoading"));
            String string = parseObject.getString("queryParams");
            try {
                if (!TextUtils.isEmpty(string)) {
                    this.d = (Map) JSON.parseObject(string, Map.class);
                }
            } catch (Throwable unused) {
                fve.e("WeexRecommendBizParams", "queryParamsStr parse error , queryParamsStr :" + string);
            }
        }
    }

    public boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a258d600", new Object[]{this})).booleanValue();
        }
        return this.e;
    }
}
