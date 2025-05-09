package tb;

import android.app.Activity;
import android.content.Context;
import com.alibaba.android.icart.core.data.config.RequestConfig;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.opencart.check.CheckHoldManager;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class ob7 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final Map<Context, String> f25276a = new HashMap();
    public static final Map<Context, Long> b = new HashMap();
    public static final Map<Context, Long> c = new HashMap();
    public static final Map<Context, Boolean> d = new HashMap();
    public static final Map<Context, Boolean> e = new HashMap();

    static {
        t2o.a(479199535);
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("504fd2ef", new Object[0]);
        } else {
            CheckHoldManager.i().s(null);
        }
    }

    public static void b(Context context, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7685e2b7", new Object[]{context, new Integer(i)});
        } else if (context != null) {
            ((HashMap) f25276a).remove(context);
            ((HashMap) b).remove(context);
            ((HashMap) c).remove(context);
            ((HashMap) d).remove(context);
            ((HashMap) e).remove(context);
            hav.d("DeleteQueryParamsState", "清除状态:" + i);
        }
    }

    public static void c(fsb fsbVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7384654d", new Object[]{fsbVar, new Integer(i)});
        } else if (fsbVar instanceof u55) {
            b(((u55) fsbVar).E(), i);
        }
    }

    public static void e(u55 u55Var, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8e6e7a4", new Object[]{u55Var, jSONObject});
            return;
        }
        Context E = u55Var.E();
        if (!(E instanceof Activity) || !((Activity) E).isFinishing()) {
            String c2 = zb3.c(jSONObject, "queryParamVersion", "");
            CheckHoldManager.i().s(c2);
            ((HashMap) f25276a).put(E, c2);
            Long b2 = zb3.b(jSONObject, "queryParamExpireTime", 0L);
            ((HashMap) b).put(E, b2);
            ((HashMap) c).put(E, Long.valueOf(System.currentTimeMillis()));
            Boolean bool = Boolean.FALSE;
            Boolean a2 = zb3.a(jSONObject, "enableDeleteQueryParam", bool);
            ((HashMap) d).put(E, a2);
            Boolean a3 = zb3.a(jSONObject, "enableDeleteQueryParamForQuery", bool);
            ((HashMap) e).put(E, a3);
            HashMap hashMap = new HashMap();
            hashMap.put("queryParamVersion", c2);
            hashMap.put("queryParamExpireTime", b2);
            hashMap.put("enableDeleteQueryParam", a2);
            hashMap.put("enableDeleteQueryParamForNextQuery", a3);
            hav.f("DeleteQueryParamsState", "更新QueryParams优化状态", hashMap);
        }
    }

    public static boolean d(RequestConfig requestConfig, fsb fsbVar) {
        Context E;
        Map<Context, Boolean> map;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2b6cc719", new Object[]{requestConfig, fsbVar})).booleanValue();
        }
        if (!(fsbVar instanceof u55) || (E = ((u55) fsbVar).E()) == null) {
            return false;
        }
        Map<String, String> c2 = requestConfig.c();
        if (c2 != null && Boolean.parseBoolean(c2.get(RequestConfig.IS_POP_LAYE_RQUERY))) {
            return false;
        }
        if (RequestConfig.RequestType.QUERY_CART_NEXT_PAGE == requestConfig.i()) {
            map = e;
        } else {
            map = d;
        }
        Boolean bool = (Boolean) ((HashMap) map).get(E);
        if (bool == null) {
            hav.d("DeleteQueryParamsState", "找不到页面对应的queryParams优化开关");
            return false;
        } else if (!bool.booleanValue()) {
            return false;
        } else {
            String str = (String) ((HashMap) f25276a).get(E);
            String j = CheckHoldManager.i().j();
            if (str == null || !str.equals(j)) {
                HashMap hashMap = new HashMap();
                hashMap.put("当前页面版本", str);
                hashMap.put("最新请求版本", j);
                hav.f("DeleteQueryParamsState", "版本不一致，不裁剪queryParams", hashMap);
                return false;
            }
            Long l = (Long) ((HashMap) b).get(E);
            Long l2 = (Long) ((HashMap) c).get(E);
            if (l == null || l2 == null) {
                hav.d("DeleteQueryParamsState", "超时数据为空，不裁剪queryParams");
                return false;
            }
            long currentTimeMillis = System.currentTimeMillis() - l2.longValue();
            if (currentTimeMillis >= l.longValue()) {
                z = false;
            }
            if (!z) {
                HashMap hashMap2 = new HashMap();
                hashMap2.put("超时间隔", l);
                hashMap2.put("开始计算超时的时间", l2);
                hashMap2.put("diff时间", Long.valueOf(currentTimeMillis));
                hav.f("DeleteQueryParamsState", "缓存超时了，不裁剪queryParams", hashMap2);
            }
            return z;
        }
    }
}
