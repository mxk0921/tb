package com.nirvana.tools.jsoner;

import com.taobao.media.MediaConstant;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import tb.kwf;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class JsonHelper {

    /* renamed from: a  reason: collision with root package name */
    public static final Type[] f5971a = new Type[0];

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class a implements Serializable, GenericArrayType {

        /* renamed from: a  reason: collision with root package name */
        private final Type f5972a;

        public a(Type type) {
            this.f5972a = JsonHelper.a(type);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof GenericArrayType) || !JsonHelper.d(this, (GenericArrayType) obj)) {
                return false;
            }
            return true;
        }

        @Override // java.lang.reflect.GenericArrayType
        public final Type getGenericComponentType() {
            return this.f5972a;
        }

        public final int hashCode() {
            return this.f5972a.hashCode();
        }

        public final String toString() {
            return JsonHelper.g(this.f5972a) + MediaConstant.DEFALUT_H265_HW_BLACK_LIST_FOR_DEGRADE_H264;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class b implements Serializable, ParameterizedType {

        /* renamed from: a  reason: collision with root package name */
        private final Type f5973a;
        private final Type b;
        private final Type[] c;

        public b(Type type, Type type2, Type... typeArr) {
            Type type3;
            boolean z;
            if (type2 instanceof Class) {
                Class cls = (Class) type2;
                boolean z2 = true;
                if (Modifier.isStatic(cls.getModifiers()) || cls.getEnclosingClass() == null) {
                    z = true;
                } else {
                    z = false;
                }
                if (type == null && !z) {
                    z2 = false;
                }
                kwf.a(z2);
            }
            if (type == null) {
                type3 = null;
            } else {
                type3 = JsonHelper.a(type);
            }
            this.f5973a = type3;
            this.b = JsonHelper.a(type2);
            Type[] typeArr2 = (Type[]) typeArr.clone();
            this.c = typeArr2;
            int length = typeArr2.length;
            for (int i = 0; i < length; i++) {
                kwf.b(this.c[i]);
                JsonHelper.b(this.c[i]);
                Type[] typeArr3 = this.c;
                typeArr3[i] = JsonHelper.a(typeArr3[i]);
            }
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof ParameterizedType) || !JsonHelper.d(this, (ParameterizedType) obj)) {
                return false;
            }
            return true;
        }

        @Override // java.lang.reflect.ParameterizedType
        public final Type[] getActualTypeArguments() {
            return (Type[]) this.c.clone();
        }

        @Override // java.lang.reflect.ParameterizedType
        public final Type getOwnerType() {
            return this.f5973a;
        }

        @Override // java.lang.reflect.ParameterizedType
        public final Type getRawType() {
            return this.b;
        }

        public final int hashCode() {
            return (Arrays.hashCode(this.c) ^ this.b.hashCode()) ^ JsonHelper.f(this.f5973a);
        }

        public final String toString() {
            int length = this.c.length;
            if (length == 0) {
                return JsonHelper.g(this.b);
            }
            StringBuilder sb = new StringBuilder((length + 1) * 30);
            sb.append(JsonHelper.g(this.b));
            sb.append("<");
            sb.append(JsonHelper.g(this.c[0]));
            for (int i = 1; i < length; i++) {
                sb.append(", ");
                sb.append(JsonHelper.g(this.c[i]));
            }
            sb.append(">");
            return sb.toString();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class c implements Serializable, WildcardType {

        /* renamed from: a  reason: collision with root package name */
        private final Type f5974a;
        private final Type b;

        public c(Type[] typeArr, Type[] typeArr2) {
            boolean z;
            boolean z2;
            boolean z3 = true;
            if (typeArr2.length <= 1) {
                z = true;
            } else {
                z = false;
            }
            kwf.a(z);
            if (typeArr.length == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            kwf.a(z2);
            if (typeArr2.length == 1) {
                kwf.b(typeArr2[0]);
                JsonHelper.b(typeArr2[0]);
                kwf.a(typeArr[0] != Object.class ? false : z3);
                this.b = JsonHelper.a(typeArr2[0]);
                this.f5974a = Object.class;
                return;
            }
            kwf.b(typeArr[0]);
            JsonHelper.b(typeArr[0]);
            this.b = null;
            this.f5974a = JsonHelper.a(typeArr[0]);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof WildcardType) || !JsonHelper.d(this, (WildcardType) obj)) {
                return false;
            }
            return true;
        }

        @Override // java.lang.reflect.WildcardType
        public final Type[] getLowerBounds() {
            Type type = this.b;
            return type != null ? new Type[]{type} : JsonHelper.f5971a;
        }

        @Override // java.lang.reflect.WildcardType
        public final Type[] getUpperBounds() {
            return new Type[]{this.f5974a};
        }

        public final int hashCode() {
            int i;
            Type type = this.b;
            if (type != null) {
                i = type.hashCode() + 31;
            } else {
                i = 1;
            }
            return i ^ (this.f5974a.hashCode() + 31);
        }

        public final String toString() {
            StringBuilder sb;
            Type type;
            if (this.b != null) {
                sb = new StringBuilder("? super ");
                type = this.b;
            } else if (this.f5974a == Object.class) {
                return "?";
            } else {
                sb = new StringBuilder("? extends ");
                type = this.f5974a;
            }
            sb.append(JsonHelper.g(type));
            return sb.toString();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [com.nirvana.tools.jsoner.JsonHelper$a] */
    public static Type a(Type type) {
        if (type instanceof Class) {
            Class cls = (Class) type;
            if (cls.isArray()) {
                cls = new a(a(cls.getComponentType()));
            }
            return cls;
        } else if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            return new b(parameterizedType.getOwnerType(), parameterizedType.getRawType(), parameterizedType.getActualTypeArguments());
        } else if (type instanceof GenericArrayType) {
            return new a(((GenericArrayType) type).getGenericComponentType());
        } else {
            if (!(type instanceof WildcardType)) {
                return type;
            }
            WildcardType wildcardType = (WildcardType) type;
            return new c(wildcardType.getUpperBounds(), wildcardType.getLowerBounds());
        }
    }

    public static void b(Type type) {
        boolean z;
        if (!(type instanceof Class) || !((Class) type).isPrimitive()) {
            z = true;
        } else {
            z = false;
        }
        kwf.a(z);
    }

    public static boolean c(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj == null || !obj.equals(obj2)) {
            return false;
        }
        return true;
    }

    public static boolean d(Type type, Type type2) {
        while (type != type2) {
            if (type instanceof Class) {
                return type.equals(type2);
            }
            if (type instanceof ParameterizedType) {
                if (!(type2 instanceof ParameterizedType)) {
                    return false;
                }
                ParameterizedType parameterizedType = (ParameterizedType) type;
                ParameterizedType parameterizedType2 = (ParameterizedType) type2;
                if (!c(parameterizedType.getOwnerType(), parameterizedType2.getOwnerType()) || !parameterizedType.getRawType().equals(parameterizedType2.getRawType()) || !Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments())) {
                    return false;
                }
                return true;
            } else if (type instanceof GenericArrayType) {
                if (!(type2 instanceof GenericArrayType)) {
                    return false;
                }
                type = ((GenericArrayType) type).getGenericComponentType();
                type2 = ((GenericArrayType) type2).getGenericComponentType();
            } else if (type instanceof WildcardType) {
                if (!(type2 instanceof WildcardType)) {
                    return false;
                }
                WildcardType wildcardType = (WildcardType) type;
                WildcardType wildcardType2 = (WildcardType) type2;
                if (!Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) || !Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds())) {
                    return false;
                }
                return true;
            } else if (!(type instanceof TypeVariable) || !(type2 instanceof TypeVariable)) {
                return false;
            } else {
                TypeVariable typeVariable = (TypeVariable) type;
                TypeVariable typeVariable2 = (TypeVariable) type2;
                if (typeVariable.getGenericDeclaration() != typeVariable2.getGenericDeclaration() || !typeVariable.getName().equals(typeVariable2.getName())) {
                    return false;
                }
                return true;
            }
        }
        return true;
    }

    public static Class<?> e(Type type) {
        String str;
        while (!(type instanceof Class)) {
            if (type instanceof ParameterizedType) {
                Type rawType = ((ParameterizedType) type).getRawType();
                kwf.a(rawType instanceof Class);
                return (Class) rawType;
            } else if (type instanceof GenericArrayType) {
                return Array.newInstance(e(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
            } else {
                if (type instanceof TypeVariable) {
                    return Object.class;
                }
                if (type instanceof WildcardType) {
                    type = ((WildcardType) type).getUpperBounds()[0];
                } else {
                    if (type == null) {
                        str = "null";
                    } else {
                        str = type.getClass().getName();
                    }
                    throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + str);
                }
            }
        }
        return (Class) type;
    }

    public static int f(Object obj) {
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public static String g(Type type) {
        if (type instanceof Class) {
            return ((Class) type).getName();
        }
        return type.toString();
    }
}
