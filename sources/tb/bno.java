package tb;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class bno {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static volatile bno b;

    /* renamed from: a  reason: collision with root package name */
    public final SharedPreferences f16495a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a extends TypeReference<HashMap<String, String>> {
        public a(bno bnoVar) {
        }
    }

    static {
        t2o.a(757071886);
    }

    public bno(Context context) {
        this.f16495a = (context.getApplicationContext() != null ? context.getApplicationContext() : context).getSharedPreferences("tb_minors", 0);
    }

    public static bno a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bno) ipChange.ipc$dispatch("4992305c", new Object[]{context});
        }
        if (b == null) {
            synchronized (bno.class) {
                try {
                    if (b == null) {
                        b = new bno(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return b;
    }

    public Map<String, String> b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("61bf79f6", new Object[]{this, str});
        }
        HashMap hashMap = new HashMap();
        try {
            String string = this.f16495a.getString(str, "");
            if (TextUtils.isEmpty(string)) {
                return hashMap;
            }
            return (Map) JSON.parseObject(string, new a(this), new Feature[0]);
        } catch (Exception e) {
            vhl.b("TBMinorsProtect", "[SPUtil] getMapData error: " + e);
            return hashMap;
        }
    }

    public void c(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86b59e1d", new Object[]{this, str, map});
            return;
        }
        try {
            String jSONString = JSON.toJSONString(map);
            SharedPreferences.Editor edit = this.f16495a.edit();
            edit.putString(str, jSONString);
            edit.apply();
        } catch (Exception e) {
            vhl.b("TBMinorsProtect", "[SPUtil] putMapData error: " + e);
        }
    }
}
