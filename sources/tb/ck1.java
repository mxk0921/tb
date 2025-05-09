package tb;

import android.text.TextUtils;
import com.ali.user.open.core.util.ParamsConstants;
import com.alibaba.fastjson.JSONArray;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.adapter.IAccountAdapter;
import com.taobao.themis.open.permission.auth.model.ScopeEntity;
import com.taobao.weex.common.Constants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.text.Regex;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class ck1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final ck1 INSTANCE = new ck1();

    static {
        t2o.a(843055312);
        new ConcurrentHashMap();
    }

    public final void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa276026", new Object[]{this, str});
        } else {
            ckf.g(str, ParamsConstants.Key.PARAM_SCENE_CODE);
        }
    }

    public final Boolean c(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("2f91df35", new Object[]{this, str, str2});
        }
        ckf.g(str, "appKey");
        ckf.g(str2, Constants.Name.SCOPE);
        String b = d7p.INSTANCE.b(d(str, str2));
        if (b == null) {
            return null;
        }
        if (wsq.a0(b)) {
            b = null;
        }
        if (b == null) {
            return null;
        }
        return Boolean.valueOf(b.equals("true"));
    }

    public final String d(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("65b02fa3", new Object[]{this, str, str2});
        }
        return m() + "_appid_" + str + "_key_" + str2 + Constants.Name.SCOPE;
    }

    public final String f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("edeb6354", new Object[]{this, str});
        }
        ckf.g(str, "appKey");
        return d7p.INSTANCE.b(g(str));
    }

    public final String g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b8fdcbcb", new Object[]{this, str});
        }
        return m() + "_appid_" + str + "_key_" + str + "token";
    }

    public final String h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f34aa3be", new Object[]{this});
        }
        return ckf.p(m(), "auth_app");
    }

    public final Boolean i(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("6ca34d40", new Object[]{this, str, str2});
        }
        ckf.g(str, "appKey");
        ckf.g(str2, Constants.Name.SCOPE);
        String b = d7p.INSTANCE.b(j(str, str2));
        if (b == null) {
            return null;
        }
        if (wsq.a0(b)) {
            b = null;
        }
        if (b == null) {
            return null;
        }
        return Boolean.valueOf(b.equals("1"));
    }

    public final String k(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("52328ba9", new Object[]{this, str});
        }
        return "key_auth_failure" + str + m();
    }

    public final List<ScopeEntity> l(bbs bbsVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("230dd25c", new Object[]{this, bbsVar, str});
        }
        ckf.g(bbsVar, "instance");
        ckf.g(str, ParamsConstants.Key.PARAM_SCENE_CODE);
        return null;
    }

    public final String m() {
        String userId;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("58ad3b3d", new Object[]{this});
        }
        IAccountAdapter iAccountAdapter = (IAccountAdapter) p8s.b(IAccountAdapter.class);
        return (iAccountAdapter == null || (userId = iAccountAdapter.getUserId(null)) == null) ? "null" : userId;
    }

    public final void n(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eac219e6", new Object[]{this, str, str2});
            return;
        }
        ckf.g(str, "appKey");
        ckf.g(str2, Constants.Name.SCOPE);
        d7p.INSTANCE.d(d(str, str2));
    }

    public final void o(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d127f3de", new Object[]{this, str});
            return;
        }
        ckf.g(str, "appKey");
        d7p.INSTANCE.d(g(str));
    }

    public final void p(bbs bbsVar, String str, List<String> list, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae657d98", new Object[]{this, bbsVar, str, list, new Boolean(z)});
            return;
        }
        ckf.g(bbsVar, "instance");
        ckf.g(str, ParamsConstants.Key.PARAM_SCENE_CODE);
        ckf.g(list, "scopes");
    }

    public final void q(String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("472dd933", new Object[]{this, str, str2, new Boolean(z)});
            return;
        }
        ckf.g(str, "appKey");
        ckf.g(str2, Constants.Name.SCOPE);
        d7p.INSTANCE.c(d(str, str2), String.valueOf(z));
    }

    public final void s(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f14008b7", new Object[]{this, str, str2, str3});
            return;
        }
        ckf.g(str, "appKey");
        ckf.g(str2, "accessToken");
        ckf.g(str3, "expireTime");
        d7p d7pVar = d7p.INSTANCE;
        String g = g(str);
        String jSONString = arf.b(jpu.a("accessToken", str2), jpu.a("expirationTime", str3)).toJSONString();
        ckf.f(jSONString, "buildJSONObject(\n       …         ).toJSONString()");
        d7pVar.c(g, jSONString);
    }

    public final void t(String str, String str2, boolean z) {
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("663192ba", new Object[]{this, str, str2, new Boolean(z)});
            return;
        }
        ckf.g(str, "appKey");
        ckf.g(str2, Constants.Name.SCOPE);
        d7p d7pVar = d7p.INSTANCE;
        String j = j(str, str2);
        if (z) {
            str3 = "1";
        } else {
            str3 = "0";
        }
        d7pVar.c(j, str3);
    }

    public final void u(String str, List<ScopeEntity> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2fd56a9", new Object[]{this, str, list});
            return;
        }
        ckf.g(str, ParamsConstants.Key.PARAM_SCENE_CODE);
        ckf.g(list, "scopes");
    }

    public final List<String> e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("135bd7b2", new Object[]{this, str});
        }
        ckf.g(str, "appId");
        String b = d7p.INSTANCE.b(k(str));
        if (TextUtils.isEmpty(b)) {
            return yz3.i();
        }
        ckf.d(b);
        Object[] array = new Regex(",").split(b, 0).toArray(new String[0]);
        if (array != null) {
            String[] strArr = (String[]) array;
            return new ArrayList(yz3.l(Arrays.copyOf(strArr, strArr.length)));
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
    }

    public final String j(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a41e46ee", new Object[]{this, str, str2});
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append('_');
        String substring = str2.substring(wsq.Y(str2, ".", 0, false, 6, null) + 1);
        ckf.f(substring, "this as java.lang.String).substring(startIndex)");
        sb.append(substring);
        return sb.toString();
    }

    public final void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22abee8a", new Object[]{this, str});
            return;
        }
        ckf.g(str, "appId");
        d7p d7pVar = d7p.INSTANCE;
        JSONArray g = arf.g(d7pVar.b(h()));
        if (g == null) {
            g = new JSONArray();
        }
        g.add(arf.b(jpu.a("appId", str)));
        String h = h();
        String jSONString = g.toJSONString();
        ckf.f(jSONString, "list.toJSONString()");
        d7pVar.c(h, jSONString);
    }

    public final void r(String str, List<String> list) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa559caf", new Object[]{this, str, list});
            return;
        }
        ckf.g(str, "appId");
        ckf.g(list, "scopes");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(e(str));
        linkedHashSet.addAll(list);
        StringBuilder sb = new StringBuilder();
        for (Object obj : linkedHashSet) {
            i++;
            if (i >= 0) {
                sb.append((String) obj);
                if (i != linkedHashSet.size() - 1) {
                    sb.append(",");
                }
            } else {
                yz3.p();
                throw null;
            }
        }
        d7p d7pVar = d7p.INSTANCE;
        String k = k(str);
        String sb2 = sb.toString();
        ckf.f(sb2, "stringBuilder.toString()");
        d7pVar.c(k, sb2);
    }
}
