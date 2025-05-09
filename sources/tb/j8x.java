package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex.WeexInstance;
import com.taobao.android.weex.WeexMethod;
import com.taobao.android.weex.WeexModule;
import com.taobao.android.weex_framework.bridge.MUSThreadStrategy;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class j8x<T extends WeexModule> implements c7x<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Class<T> f21839a;
    public volatile Map<String, u6x<T>> b;
    public volatile JSONArray c;

    static {
        t2o.a(982515934);
        t2o.a(982515931);
    }

    public j8x(Class<T> cls) {
        this.f21839a = cls;
    }

    @Override // tb.c7x
    public T a(String str, WeexInstance weexInstance) throws Exception {
        return this.f21839a.getConstructor(new Class[0]).newInstance(new Object[0]);
    }

    public final void b() {
        Method[] methods;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6fbae84", new Object[]{this});
            return;
        }
        HashMap hashMap = new HashMap();
        for (Method method : this.f21839a.getMethods()) {
            try {
                c(method, method.getDeclaredAnnotations(), hashMap);
            } catch (Exception e) {
                dwh.h("[MUSModuleManager] extractMethodNames:", e);
            }
        }
        this.b = hashMap;
    }

    public final void c(Method method, Annotation[] annotationArr, Map<String, u6x<T>> map) {
        MUSThreadStrategy mUSThreadStrategy;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9fdbae67", new Object[]{this, method, annotationArr, map});
        } else if (annotationArr != null) {
            for (Annotation annotation : annotationArr) {
                if (annotation != null && (annotation instanceof WeexMethod)) {
                    WeexMethod weexMethod = (WeexMethod) annotation;
                    String alias = weexMethod.alias();
                    if (TextUtils.equals(weexMethod.alias(), "_")) {
                        alias = method.getName();
                    }
                    if (weexMethod.uiThread()) {
                        mUSThreadStrategy = MUSThreadStrategy.UI;
                    } else {
                        mUSThreadStrategy = MUSThreadStrategy.JS;
                    }
                    map.put(alias, new a7x(method, mUSThreadStrategy));
                    return;
                }
            }
        }
    }

    @Override // tb.v6x
    public u6x<T> getMethodInvoker(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (u6x) ipChange.ipc$dispatch("94c1b213", new Object[]{this, str});
        }
        if (this.b == null) {
            b();
        }
        return (u6x) ((HashMap) this.b).get(str);
    }

    @Override // tb.v6x
    public JSONArray getMethods() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("bf232bdb", new Object[]{this});
        }
        if (this.c != null) {
            return this.c;
        }
        if (this.b == null) {
            b();
        }
        Set keySet = ((HashMap) this.b).keySet();
        JSONArray jSONArray = new JSONArray();
        try {
            jSONArray.addAll(keySet);
            this.c = jSONArray;
            return jSONArray;
        } catch (Exception e) {
            dwh.i(e);
            return jSONArray;
        }
    }
}
