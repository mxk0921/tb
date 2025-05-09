package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
final class m0<T> extends k0<T> {
    public m0(String str, int i, long j, String str2, String str3, Method method, Class cls) {
        super(str, i, j, str2, str3, cls, null, method);
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public Object a(T t) {
        Throwable e;
        try {
            return this.j.invoke(t, new Object[0]);
        } catch (IllegalAccessException e2) {
            e = e2;
            throw new JSONException("invoke getter method error, " + this.f2478a, e);
        } catch (IllegalArgumentException e3) {
            e = e3;
            throw new JSONException("invoke getter method error, " + this.f2478a, e);
        } catch (InvocationTargetException e4) {
            e = e4;
            Throwable cause = e.getCause();
            String str = "invoke getter method error, " + this.f2478a;
            if (cause != null) {
                e = cause;
            }
            throw new JSONException(str, e);
        }
    }
}
