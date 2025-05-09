package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.bridge.MUSThreadStrategy;
import com.taobao.android.weex_framework.module.MUSModule;
import com.taobao.android.weex_framework.ui.MUSMethod;
import com.taobao.media.MediaConstant;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class dyp<T extends MUSModule> implements jyi<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Class<T> f18163a;
    public volatile Map<String, cwh<T>> b;

    static {
        t2o.a(982516097);
        t2o.a(982516096);
    }

    public dyp(Class<T> cls) {
        this.f18163a = cls;
    }

    @Override // tb.jyi
    public T c(String str, MUSDKInstance mUSDKInstance) throws Exception {
        return this.f18163a.getConstructor(String.class, MUSDKInstance.class).newInstance(str, mUSDKInstance);
    }

    public final void d() {
        Method[] methods;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6fbae84", new Object[]{this});
            return;
        }
        HashMap hashMap = new HashMap();
        for (Method method : this.f18163a.getMethods()) {
            try {
                e(method, method.getDeclaredAnnotations(), hashMap);
            } catch (Exception e) {
                dwh.h("[MUSModuleManager] extractMethodNames:", e);
            }
        }
        this.b = hashMap;
    }

    public final void e(Method method, Annotation[] annotationArr, Map<String, cwh<T>> map) {
        MUSThreadStrategy mUSThreadStrategy;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9fdbae67", new Object[]{this, method, annotationArr, map});
        } else if (annotationArr != null) {
            for (Annotation annotation : annotationArr) {
                if (annotation != null && (annotation instanceof MUSMethod)) {
                    MUSMethod mUSMethod = (MUSMethod) annotation;
                    String alias = mUSMethod.alias();
                    if (TextUtils.equals(mUSMethod.alias(), "_")) {
                        alias = method.getName();
                    }
                    if (mUSMethod.uiThread()) {
                        mUSThreadStrategy = MUSThreadStrategy.UI;
                    } else {
                        mUSThreadStrategy = MUSThreadStrategy.JS;
                    }
                    map.put(alias, new fwh(method, mUSThreadStrategy));
                    return;
                }
            }
        }
    }

    @Override // tb.vtf
    public cwh<T> getMethodInvoker(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cwh) ipChange.ipc$dispatch("e339d05f", new Object[]{this, str});
        }
        if (this.b == null) {
            d();
        }
        return (cwh) ((HashMap) this.b).get(str);
    }

    @Override // tb.vtf
    public String getMethods() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("615a6cfd", new Object[]{this});
        }
        if (this.b == null) {
            d();
        }
        Set keySet = ((HashMap) this.b).keySet();
        try {
            JSONArray jSONArray = new JSONArray();
            jSONArray.addAll(keySet);
            return jSONArray.toJSONString();
        } catch (Exception e) {
            dwh.i(e);
            return MediaConstant.DEFALUT_H265_HW_BLACK_LIST_FOR_DEGRADE_H264;
        }
    }
}
