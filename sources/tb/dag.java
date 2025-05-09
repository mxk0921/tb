package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.codetrack.sdk.assets.AssetsDelegate;
import com.taobao.tao.Globals;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class dag {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final String c = muu.b;
    public static final Map<String, dag> d = new HashMap();

    /* renamed from: a  reason: collision with root package name */
    public boolean f17679a = false;
    public JSONObject b;

    static {
        t2o.a(511705168);
    }

    public dag(String str) {
        ((HashMap) d).put(str, this);
        a(str);
    }

    public static dag b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dag) ipChange.ipc$dispatch("805f3763", new Object[0]);
        }
        return c(c);
    }

    public static dag c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dag) ipChange.ipc$dispatch("5f345259", new Object[]{str});
        }
        HashMap hashMap = (HashMap) d;
        if (hashMap.containsKey(str)) {
            return (dag) hashMap.get(str);
        }
        return new dag(str);
    }

    public final String d(String str) {
        Throwable th;
        IOException e;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4e14b50d", new Object[]{this, str});
        }
        String str2 = "router/router_" + str + q2s.JSON;
        StringBuilder sb = new StringBuilder();
        BufferedReader bufferedReader = null;
        try {
            try {
                BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(AssetsDelegate.proxy_open(Globals.getApplication().getAssets(), str2)));
                while (true) {
                    try {
                        String readLine = bufferedReader2.readLine();
                        if (readLine == null) {
                            break;
                        }
                        sb.append(readLine);
                    } catch (IOException e2) {
                        e = e2;
                        bufferedReader = bufferedReader2;
                        e.printStackTrace();
                        cg9.u(bufferedReader);
                        return sb.toString();
                    } catch (Throwable th2) {
                        th = th2;
                        bufferedReader = bufferedReader2;
                        cg9.u(bufferedReader);
                        throw th;
                    }
                }
                cg9.u(bufferedReader2);
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (IOException e3) {
            e = e3;
        }
        return sb.toString();
    }

    public String e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("36ae9f2a", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str) || this.b == null) {
            return null;
        }
        if (this.f17679a && (TextUtils.equals(str, "PUBLISH_PATH") || TextUtils.equals(str, "PUBLISH_PATH_DIRECT"))) {
            str = "PUBLISH_WEEX_PATH";
        }
        return this.b.getString(str);
    }

    public void f(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1650d823", new Object[]{this, new Boolean(z)});
        } else {
            this.f17679a = z;
        }
    }

    public final void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ae15208", new Object[]{this, str});
            return;
        }
        String d2 = d(str);
        if (TextUtils.isEmpty(d2)) {
            odg.c("LCRouter", "cann't read router. bizId:" + str);
            d2 = d(muu.b);
            if (TextUtils.isEmpty(d2)) {
                odg.c("LCRouter", "cann't read router, default bizId is invalid, cur bizId:" + str);
                return;
            }
        }
        try {
            this.b = JSON.parseObject(d2);
            odg.d("LCRouter", "parse router sucess. bizId:" + str);
        } catch (Throwable unused) {
            odg.c("LCRouter", "parse router failed!. bizId:" + str);
        }
    }
}
