package com.alibaba.fastjson.parser;

import com.alibaba.fastjson.annotation.JSONType;
import com.alibaba.fastjson.util.FieldInfo;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class JavaBeanInfo {
    final Constructor<?> creatorConstructor;
    public final String[] creatorConstructorParameters;
    final Constructor<?> defaultConstructor;
    final int defaultConstructorParameterSize;
    final Method factoryMethod;
    final FieldInfo[] fields;
    final JSONType jsonType;
    boolean ordered = false;
    public final int parserFeatures;
    final FieldInfo[] sortedFields;
    final boolean supportBeanToArray;
    public final String typeKey;
    public final String typeName;

    public JavaBeanInfo(Class<?> cls, Constructor<?> constructor, Constructor<?> constructor2, Method method, FieldInfo[] fieldInfoArr, FieldInfo[] fieldInfoArr2, JSONType jSONType, String[] strArr) {
        int i;
        boolean z;
        int i2 = 0;
        this.defaultConstructor = constructor;
        this.creatorConstructor = constructor2;
        this.factoryMethod = method;
        this.fields = fieldInfoArr;
        this.jsonType = jSONType;
        String str = null;
        if (strArr == null || strArr.length != fieldInfoArr.length) {
            this.creatorConstructorParameters = strArr;
        } else {
            this.creatorConstructorParameters = null;
        }
        if (jSONType != null) {
            String typeName = jSONType.typeName();
            this.typeName = typeName.length() <= 0 ? cls.getName() : typeName;
            String typeKey = jSONType.typeKey();
            this.typeKey = typeKey.length() > 0 ? typeKey : str;
            i = 0;
            for (Feature feature : jSONType.parseFeatures()) {
                i |= feature.mask;
            }
        } else {
            this.typeName = cls.getName();
            this.typeKey = null;
            i = 0;
        }
        this.parserFeatures = i;
        if (jSONType != null) {
            Feature[] parseFeatures = jSONType.parseFeatures();
            z = false;
            for (Feature feature2 : parseFeatures) {
                if (feature2 == Feature.SupportArrayToBean) {
                    z = true;
                }
            }
        } else {
            z = false;
        }
        this.supportBeanToArray = z;
        FieldInfo[] computeSortedFields = computeSortedFields(fieldInfoArr, fieldInfoArr2);
        this.sortedFields = !Arrays.equals(fieldInfoArr, computeSortedFields) ? computeSortedFields : fieldInfoArr;
        if (constructor != null) {
            i2 = constructor.getParameterTypes().length;
        } else if (method != null) {
            i2 = method.getParameterTypes().length;
        }
        this.defaultConstructorParameterSize = i2;
    }

    public static boolean addField(List<FieldInfo> list, FieldInfo fieldInfo, boolean z) {
        if (!z) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                FieldInfo fieldInfo2 = list.get(i);
                if (fieldInfo2.name.equals(fieldInfo.name) && (!fieldInfo2.getOnly || fieldInfo.getOnly)) {
                    return false;
                }
            }
        }
        list.add(fieldInfo);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:261:0x064b  */
    /* JADX WARN: Type inference failed for: r0v50, types: [java.lang.reflect.Type[]] */
    /* JADX WARN: Type inference failed for: r0v77, types: [java.lang.reflect.Type[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.alibaba.fastjson.parser.JavaBeanInfo build(java.lang.Class<?> r48, int r49, java.lang.reflect.Type r50, boolean r51, boolean r52, boolean r53, boolean r54, com.alibaba.fastjson.PropertyNamingStrategy r55) {
        /*
            Method dump skipped, instructions count: 2236
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.parser.JavaBeanInfo.build(java.lang.Class, int, java.lang.reflect.Type, boolean, boolean, boolean, boolean, com.alibaba.fastjson.PropertyNamingStrategy):com.alibaba.fastjson.parser.JavaBeanInfo");
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0023, code lost:
        r2 = r2 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.alibaba.fastjson.util.FieldInfo[] computeSortedFields(com.alibaba.fastjson.util.FieldInfo[] r9, com.alibaba.fastjson.util.FieldInfo[] r10) {
        /*
            Method dump skipped, instructions count: 174
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.parser.JavaBeanInfo.computeSortedFields(com.alibaba.fastjson.util.FieldInfo[], com.alibaba.fastjson.util.FieldInfo[]):com.alibaba.fastjson.util.FieldInfo[]");
    }
}
