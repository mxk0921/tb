package com.alipay.android.msp.framework.wire;

import com.alipay.android.msp.framework.wire.Message;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class AvailabilityChecker<M extends Message> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final Comparator<Field> c = new Comparator<Field>() { // from class: com.alipay.android.msp.framework.wire.AvailabilityChecker.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public int compare(Field field, Field field2) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ee5bc7f", new Object[]{this, field, field2})).intValue() : field.getName().compareTo(field2.getName());
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public final List<Field> f3681a = new ArrayList();
    public final List<Field> b = new ArrayList();

    public AvailabilityChecker(Class<M> cls) {
        Field[] declaredFields;
        for (Field field : cls.getDeclaredFields()) {
            ProtoField protoField = (ProtoField) field.getAnnotation(ProtoField.class);
            if (protoField != null) {
                if (protoField.label() == Message.Label.REQUIRED) {
                    try {
                        this.f3681a.add(cls.getField(field.getName()));
                    } catch (NoSuchFieldException unused) {
                        throw new AssertionError("No message field found for message field " + field.getName());
                    }
                }
                if (protoField.label() == Message.Label.REPEATED) {
                    try {
                        this.b.add(cls.getField(field.getName()));
                    } catch (NoSuchFieldException unused2) {
                        throw new AssertionError("No message field found for message field " + field.getName());
                    }
                } else {
                    continue;
                }
            }
        }
        Collections.sort(this.f3681a, c);
    }

    public final void checkForNulls(M m) {
        Iterator it = ((ArrayList) this.b).iterator();
        while (it.hasNext()) {
            Field field = (Field) it.next();
            try {
                List list = (List) field.get(m);
                if (list == null) {
                    field.set(m, Collections.emptyList());
                } else if (!list.isEmpty()) {
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        if (list.get(i) == null) {
                            throw new NullPointerException(String.format("Element at index %d of field %s is null", Integer.valueOf(i), field.getName()));
                        }
                    }
                    continue;
                } else {
                    continue;
                }
            } catch (IllegalAccessException unused) {
                throw new AssertionError("Unable to access required fields");
            } catch (IllegalArgumentException unused2) {
                throw new AssertionError("Unable to access required fields");
            }
        }
    }

    public final void checkRequiredFields(M m) {
        List<Field> list = this.f3681a;
        try {
            int size = ((ArrayList) list).size();
            StringBuilder sb = null;
            String str = "";
            for (int i = 0; i < size; i++) {
                Field field = (Field) ((ArrayList) list).get(i);
                if (field.get(m) == null) {
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
