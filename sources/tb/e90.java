package tb;

import android.os.Build;
import android.os.PowerManager;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.adaemon.g;
import com.taobao.orange.candidate.VersionCompare;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import mtopsdk.common.util.SymbolExpUtil;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class e90 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final Map<String, List<v80>> f18365a = new ConcurrentHashMap();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ byte[] f18366a;

        public a(byte[] bArr) {
            this.f18366a = bArr;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                String a2 = e90.a(this.f18366a);
                if (!TextUtils.isEmpty(a2)) {
                    e90.c(a2, 0);
                }
            } catch (Throwable th) {
                s55.h("ActionChains", "parse err", th, new Object[0]);
            }
        }
    }

    static {
        t2o.a(349175901);
    }

    public static /* synthetic */ String a(byte[] bArr) throws Throwable {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b04205e2", new Object[]{bArr});
        }
        return d(bArr);
    }

    public static void c(String str, int i) {
        List list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fdc3ff7d", new Object[]{str, new Integer(i)});
        } else if (TextUtils.isEmpty(str) || (list = (List) ((ConcurrentHashMap) f18365a).get(str)) == null) {
        } else {
            if (list.size() > i) {
                ((v80) list.get(i)).a();
            } else {
                s55.i("ActionChains", "execute end", "chainId", str);
            }
        }
    }

    public static void e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39af3815", new Object[]{str});
        } else if (!TextUtils.isEmpty(str)) {
            ((ConcurrentHashMap) f18365a).remove(str);
        }
    }

    public static void f(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c2d59d9", new Object[]{bArr});
        } else if (bArr != null) {
            mf.b().execute(new a(bArr));
        }
    }

    public static String d(byte[] bArr) throws Throwable {
        v80 v80Var;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("82ae5abf", new Object[]{bArr});
        }
        JSONObject jSONObject = new JSONObject(new String(bArr));
        int optInt = jSONObject.optInt("version");
        if (optInt != 1) {
            s55.i("ActionChains", "parseDataProtocol, not support version", "version", Integer.valueOf(optInt));
            return null;
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("contentList");
        if (optJSONArray == null || optJSONArray.length() == 0) {
            s55.i("ActionChains", "parseDataProtocol, empty contentList", new Object[0]);
            return null;
        }
        for (int i = 0; i < optJSONArray.length(); i++) {
            JSONObject optJSONObject = optJSONArray.optJSONObject(i);
            String optString = optJSONObject.optString("id");
            if (optJSONObject.optLong("expire") < System.currentTimeMillis()) {
                s55.i("ActionChains", "parseDataProtocol, expire", new Object[0]);
            } else if (b(optJSONObject.optJSONObject("condition"))) {
                JSONArray optJSONArray2 = optJSONObject.optJSONArray("chains");
                if (optJSONArray2 == null || optJSONArray2.length() == 0) {
                    s55.i("ActionChains", "parseDataProtocol, empty chain", new Object[0]);
                } else {
                    CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
                    int i2 = 0;
                    while (true) {
                        if (i2 >= optJSONArray2.length()) {
                            break;
                        }
                        JSONObject optJSONObject2 = optJSONArray2.optJSONObject(i2);
                        String optString2 = optJSONObject2.optString("name");
                        if ("start_svc".equals(optString2)) {
                            v80Var = new qhq(optString, i2);
                        } else if ("restart_channel".equals(optString2)) {
                            v80Var = new oao(optString, i2);
                        } else {
                            v80Var = "launch_tb".equals(optString2) ? new ugg(optString, i2) : null;
                        }
                        if (v80Var == null) {
                            copyOnWriteArrayList.clear();
                            break;
                        }
                        String optString3 = optJSONObject2.optString("data");
                        if (!TextUtils.isEmpty(optString3)) {
                            v80Var.d(optString3);
                        }
                        copyOnWriteArrayList.add(v80Var);
                        i2++;
                    }
                    if (copyOnWriteArrayList.size() > 0) {
                        ((ConcurrentHashMap) f18365a).put(optString, copyOnWriteArrayList);
                        return optString;
                    }
                }
            } else {
                continue;
            }
        }
        s55.i("ActionChains", "parseDataProtocol, empty action list", new Object[0]);
        return null;
    }

    public static boolean b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("202cae08", new Object[]{jSONObject})).booleanValue();
        }
        if (jSONObject != null) {
            try {
                if (jSONObject.has("brand") && !Build.BRAND.equals(jSONObject.optString("brand"))) {
                    s55.i("ActionChains", "checkCondition, different brand", new Object[0]);
                    return false;
                } else if (jSONObject.has("keeplive") && g.P() != jSONObject.optBoolean("keeplive")) {
                    s55.i("ActionChains", "checkCondition, not keepalive", new Object[0]);
                    return false;
                } else if (jSONObject.has(lca.STAGE_INTERACTIVE) && jSONObject.optBoolean(lca.STAGE_INTERACTIVE, false) && !((PowerManager) g.l().getSystemService("power")).isInteractive()) {
                    s55.i("ActionChains", "checkCondition, screen off", new Object[0]);
                    return false;
                } else if (jSONObject.has("appversion")) {
                    VersionCompare versionCompare = new VersionCompare();
                    String k = g.k();
                    String[] split = jSONObject.optString("appversion").split(SymbolExpUtil.SYMBOL_VERTICALBAR);
                    String str = split[0];
                    if (!TextUtils.isEmpty(str) && str.contains("-")) {
                        String[] split2 = str.split("-");
                        if (split2.length != 2) {
                            s55.i("ActionChains", "checkCondition, app version range err", new Object[0]);
                            return false;
                        }
                        String str2 = split2[0];
                        String str3 = split2[1];
                        if (!"*".equals(str2) && versionCompare.less(k, str2)) {
                            s55.i("ActionChains", "checkCondition, app version less", "start", str2);
                            return false;
                        } else if (!"*".equals(str3) && versionCompare.greater(k, str3)) {
                            s55.i("ActionChains", "checkCondition, app version greater", "end", str3);
                            return false;
                        } else if (split.length == 2) {
                            str = split[1];
                        } else {
                            str = "";
                        }
                    }
                    if (!TextUtils.isEmpty(str)) {
                        boolean z = split.length == 1;
                        List asList = Arrays.asList(str.split(","));
                        if (z) {
                            if (!asList.contains(k)) {
                                s55.i("ActionChains", "checkCondition, app version not allowed", new Object[0]);
                                return false;
                            }
                        } else if (asList.contains(k)) {
                            s55.i("ActionChains", "checkCondition, app version blocked", new Object[0]);
                            return false;
                        }
                    }
                }
            } catch (Throwable th) {
                s55.h("ActionChains", "checkCondition err", th, new Object[0]);
            }
        }
        return true;
    }
}
