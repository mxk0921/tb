package tb;

import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.util.TypeUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.ability.base.annotation.BindingParam;
import com.taobao.themis.kernel.ability.invoker.binder.BindException;
import com.taobao.themis.kernel.basic.TMSLogger;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class wpl<T> implements ya2<BindingParam, T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final JSONObject f30842a;

    static {
        t2o.a(839909451);
        t2o.a(839909449);
    }

    public wpl(JSONObject jSONObject) {
        this.f30842a = jSONObject;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public T bind(Class<T> cls, BindingParam bindingParam) throws BindException {
        String[] strArr;
        JSONException e;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("bff98295", new Object[]{this, cls, bindingParam});
        }
        if (bindingParam.value().length <= 0) {
            strArr = bindingParam.name();
        } else {
            strArr = bindingParam.value();
        }
        if (strArr.length > 0) {
            String str = null;
            try {
                int length = strArr.length;
                String str2 = null;
                int i = 0;
                while (i < length) {
                    try {
                        str2 = strArr[i];
                        JSONObject jSONObject = this.f30842a;
                        str = str;
                        str = str;
                        if (!(jSONObject == null || str2 == null)) {
                            str = str;
                            if (jSONObject.containsKey(str2)) {
                                str = (T) this.f30842a.getObject(str2, cls);
                            }
                        }
                        if (str != null) {
                            break;
                        }
                        i++;
                        str = str;
                    } catch (JSONException e2) {
                        e = e2;
                        str = str2;
                        TMSLogger.c("ParamBinder", "Binding targetType: " + cls + " with: " + this.f30842a + " key: " + str + " exception!", e);
                        throw new BindException(e.getMessage());
                    }
                }
                if (str != null) {
                    return (T) str;
                }
                if (bindingParam.required()) {
                    throw new BindException(strArr[0] + " param is missing!");
                } else if (!cls.isPrimitive()) {
                    return cls == String.class ? (T) TypeUtils.castToJavaBean(bindingParam.stringDefault(), cls) : (T) str;
                } else {
                    if (cls == Boolean.TYPE) {
                        return (T) TypeUtils.castToJavaBean(Boolean.valueOf(bindingParam.booleanDefault()), cls);
                    }
                    if (cls == Integer.TYPE) {
                        return (T) TypeUtils.castToJavaBean(Integer.valueOf(bindingParam.intDefault()), cls);
                    }
                    if (cls == Float.TYPE) {
                        return (T) TypeUtils.castToJavaBean(Float.valueOf(bindingParam.floatDefault()), cls);
                    }
                    if (cls == Double.TYPE) {
                        return (T) TypeUtils.castToJavaBean(Double.valueOf(bindingParam.doubleDefault()), cls);
                    }
                    return cls == Long.TYPE ? (T) TypeUtils.castToJavaBean(Long.valueOf(bindingParam.longDefault()), cls) : (T) str;
                }
            } catch (JSONException e3) {
                e = e3;
            }
        } else {
            throw new BindException("bind key is null");
        }
    }
}
