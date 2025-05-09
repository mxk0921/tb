package com.squareup.wire;

import com.squareup.wire.Message;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class a<M extends Message> {
    public static final Comparator<Field> c = new C0306a();

    /* renamed from: a  reason: collision with root package name */
    public final List<Field> f5993a = new ArrayList();
    public final List<Field> b = new ArrayList();

    /* compiled from: Taobao */
    /* renamed from: com.squareup.wire.a$a  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class C0306a implements Comparator<Field> {
        /* renamed from: a */
        public int compare(Field field, Field field2) {
            return field.getName().compareTo(field2.getName());
        }
    }

    public a(Class<M> cls) {
        Field[] declaredFields;
        for (Field field : cls.getDeclaredFields()) {
            ProtoField protoField = (ProtoField) field.getAnnotation(ProtoField.class);
            if (protoField != null) {
                if (protoField.label() == Message.Label.REQUIRED) {
                    try {
                        this.f5993a.add(cls.getField(field.getName()));
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
        Collections.sort(this.f5993a, c);
    }

    public void a(M m) {
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

    public void b(M m) {
        List<Field> list = this.f5993a;
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
