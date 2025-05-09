package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONException;
import java.lang.reflect.Field;
import tb.opf;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
final class h extends g {
    public h(String str, int i, long j, String str2, String str3, Field field, Class cls) {
        super(str, i, j, str2, str3, cls, cls, field, null);
    }

    public boolean S(Object obj) {
        Throwable e;
        if (obj != null) {
            try {
                long j = this.k;
                if (j != -1) {
                    return opf.UNSAFE.getBoolean(obj, j);
                }
                return this.i.getBoolean(obj);
            } catch (IllegalAccessException e2) {
                e = e2;
                throw new JSONException("field.get error, " + this.f2478a, e);
            } catch (IllegalArgumentException e3) {
                e = e3;
                throw new JSONException("field.get error, " + this.f2478a, e);
            }
        } else {
            throw new JSONException("field.get error, " + this.f2478a);
        }
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public Object a(Object obj) {
        return Boolean.valueOf(S(obj));
    }
}
