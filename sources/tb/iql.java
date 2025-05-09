package tb;

import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.annotation.JSONType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;

/* compiled from: Taobao */
@JSONType(deserializeFeatures = {JSONReader.Feature.SupportAutoType}, typeName = "java.lang.reflect.ParameterizedType")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class iql implements ParameterizedType {

    /* renamed from: a  reason: collision with root package name */
    public final Type[] f21510a;
    public final Type b;

    public iql(Type type, Type... typeArr) {
        this.b = type;
        this.f21510a = typeArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || iql.class != obj.getClass()) {
            return false;
        }
        iql iqlVar = (iql) obj;
        if (!Arrays.equals(this.f21510a, iqlVar.f21510a)) {
            return false;
        }
        Type type = iqlVar.b;
        Type type2 = this.b;
        if (type2 != null) {
            return type2.equals(type);
        }
        if (type == null) {
            return true;
        }
        return false;
    }

    @Override // java.lang.reflect.ParameterizedType
    public Type[] getActualTypeArguments() {
        return this.f21510a;
    }

    @Override // java.lang.reflect.ParameterizedType
    public Type getOwnerType() {
        return null;
    }

    @Override // java.lang.reflect.ParameterizedType
    public Type getRawType() {
        return this.b;
    }

    public int hashCode() {
        int i;
        int i2 = 0;
        Type[] typeArr = this.f21510a;
        if (typeArr != null) {
            i = Arrays.hashCode(typeArr);
        } else {
            i = 0;
        }
        int i3 = i * 961;
        Type type = this.b;
        if (type != null) {
            i2 = type.hashCode();
        }
        return i3 + i2;
    }
}
