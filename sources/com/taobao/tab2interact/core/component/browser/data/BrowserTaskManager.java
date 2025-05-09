package com.taobao.tab2interact.core.component.browser.data;

import android.text.TextUtils;
import android.util.Pair;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tab2interact.core.component.browser.data.BrowserBadgeModel;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.HashMap;
import java.util.Map;
import tb.j0r;
import tb.t2o;
import tb.vgh;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class BrowserTaskManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, String> f11811a = new HashMap();
    public final Map<String, Map<String, String>> b = new HashMap();
    public String c = "browse_task_normal";

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public @interface BROWSE_TASK_STATE_DEF {
    }

    static {
        t2o.a(689963054);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42d4c54", new Object[]{this});
            return;
        }
        this.c = "browse_task_normal";
        ((HashMap) this.f11811a).clear();
        ((HashMap) this.b).clear();
    }

    public Map<String, String> b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("e3fd6893", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str)) {
            str = "browse_task_normal";
        }
        return (Map) ((HashMap) this.b).get(str);
    }

    public String c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5d35c43", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str)) {
            str = "browse_task_normal";
        }
        String str2 = (String) ((HashMap) this.f11811a).get(str);
        return str2 == null ? "unknown" : str2;
    }

    public String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("508d4df3", new Object[]{this});
        }
        Map<String, String> b = b(this.c);
        if (b != null) {
            return b.get("extParams");
        }
        return null;
    }

    public String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c117d508", new Object[]{this});
        }
        return this.c;
    }

    public String f(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4b0b512b", new Object[]{this, map});
        }
        if (map == null || !map.containsKey("extParams")) {
            return null;
        }
        try {
            String string = JSON.parseObject(map.get("extParams")).getString("browserTaskType");
            if (TextUtils.isEmpty(string)) {
                return null;
            }
            if (j0r.q().contains(string)) {
                return string;
            }
            return null;
        } catch (Exception e) {
            vgh.d(this, "BrowserTaskManager", "尝试获链接特殊任务名字异常", e);
            return null;
        }
    }

    public boolean g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9a06a5c1", new Object[]{this, str})).booleanValue();
        }
        return "browse_task_normal".equals(str);
    }

    public void h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3b03a85", new Object[]{this, str});
            return;
        }
        if (TextUtils.isEmpty(str)) {
            str = "browse_task_normal";
        }
        this.c = str;
        vgh.c(this, "BrowserTaskManager", "当前正在执行的浏览任务类型设为:" + this.c);
    }

    public Pair<String, Boolean> j(BrowserBadgeModel browserBadgeModel) {
        String str;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("59bd7062", new Object[]{this, browserBadgeModel});
        }
        if (browserBadgeModel == null) {
            return null;
        }
        BrowserBadgeModel.a aVar = browserBadgeModel.g;
        if (aVar == null) {
            str = "browse_task_normal";
        } else {
            str = aVar.f11808a;
        }
        if (browserBadgeModel.d) {
            str2 = "finish";
        } else {
            str2 = "inProgress";
        }
        boolean k = k(str, str2);
        if (k) {
            h(str);
        }
        return new Pair<>(str, Boolean.valueOf(k));
    }

    public boolean k(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8db727b8", new Object[]{this, str, str2})).booleanValue();
        }
        return !str2.equals((String) ((HashMap) this.f11811a).put(str, str2));
    }

    public boolean i(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("956a3aac", new Object[]{this, map})).booleanValue();
        }
        String f = f(map);
        if (TextUtils.isEmpty(f) || "finish".equals(((HashMap) this.f11811a).get(f))) {
            return false;
        }
        ((HashMap) this.b).put(f, map);
        vgh.c(this, "BrowserTaskManager", "尝试更新任务" + f + "的页面query成功:" + map);
        return true;
    }
}
