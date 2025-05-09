package com.alipay.android.msp.framework.wire;

import com.alipay.android.msp.framework.wire.Message;
import com.alipay.android.msp.framework.wire.Message.Builder;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class BuilderAdapter<B extends Message.Builder> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final Comparator<Field> b = new Comparator<Field>() { // from class: com.alipay.android.msp.framework.wire.BuilderAdapter.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public int compare(Field field, Field field2) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ee5bc7f", new Object[]{this, field, field2})).intValue() : field.getName().compareTo(field2.getName());
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public final List<Field> f3682a = new ArrayList();

    public BuilderAdapter(Class<B> cls) {
        Field[] declaredFields;
        String name = cls.getName();
        try {
            for (Field field : Class.forName(name.substring(0, name.length() - 8), true, cls.getClassLoader()).getDeclaredFields()) {
                ProtoField protoField = (ProtoField) field.getAnnotation(ProtoField.class);
                if (protoField != null && protoField.label() == Message.Label.REQUIRED) {
                    try {
                        this.f3682a.add(cls.getField(field.getName()));
                    } catch (NoSuchFieldException unused) {
                        throw new AssertionError("No builder field found for message field " + field.getName());
                    }
                }
            }
            Collections.sort(this.f3682a, b);
        } catch (ClassNotFoundException unused2) {
            throw new AssertionError("No message class found for builder type ".concat(name));
        }
    }

    public final <B extends Message.Builder> void checkRequiredFields(B b2) {
        List<Field> list = this.f3682a;
        try {
            int size = ((ArrayList) list).size();
            StringBuilder sb = null;
            String str = "";
            for (int i = 0; i < size; i++) {
                Field field = (Field) ((ArrayList) list).get(i);
                if (field.get(b2) == null) {
                    if (sb == null) {
                        sb = new StringBuilder();
                    } else {
                        str = "s";
                    }
                    sb.append("\n  ");
                    sb.append(field.getName());
                }
            }
            if (sb != null) {
                throw new IllegalStateException("Required field" + str + " not set:" + ((Object) sb));
            }
        } catch (IllegalAccessException unused) {
            throw new AssertionError("Unable to access required fields");
        }
    }
}
