package com.alipay.android.msp.framework.wire;

import com.alipay.android.msp.framework.wire.Message;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class Redactor<T extends Message> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final Redactor<?> e = new Redactor<Message>(null, null, null, null) { // from class: com.alipay.android.msp.framework.wire.Redactor.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/android/msp/framework/wire/Redactor$1");
        }

        @Override // com.alipay.android.msp.framework.wire.Redactor
        public Message redact(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Message) ipChange.ipc$dispatch("a0f60a36", new Object[]{this, message});
            }
            return message;
        }
    };
    public static final Map<Class<? extends Message>, Redactor> f = new LinkedHashMap();

    /* renamed from: a  reason: collision with root package name */
    public final Constructor<?> f3691a;
    public final List<Field> b;
    public final List<Field> c;
    public final List<Redactor<?>> d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class FutureRedactor<T extends Message> extends Redactor<T> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public Redactor<T> g;

        public FutureRedactor() {
            super(null, null, null, null);
        }

        public static /* synthetic */ Object ipc$super(FutureRedactor futureRedactor, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/android/msp/framework/wire/Redactor$FutureRedactor");
        }

        @Override // com.alipay.android.msp.framework.wire.Redactor
        public T redact(T t) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (T) ((Message) ipChange.ipc$dispatch("a0f60a36", new Object[]{this, t}));
            }
            Redactor<T> redactor = this.g;
            if (redactor != null) {
                return redactor.redact(t);
            }
            throw new IllegalStateException("Delegate was not set.");
        }

        public void setDelegate(Redactor<T> redactor) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e85ee51c", new Object[]{this, redactor});
            } else {
                this.g = redactor;
            }
        }
    }

    public Redactor(Constructor<?> constructor, List<Field> list, List<Field> list2, List<Redactor<?>> list3) {
        this.f3691a = constructor;
        this.b = list;
        this.c = list2;
        this.d = list3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static synchronized <T extends Message> Redactor<T> get(Class<T> cls) {
        Field[] declaredFields;
        Redactor redactor;
        Redactor<?> redactor2;
        synchronized (Redactor.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Redactor) ipChange.ipc$dispatch("16a15ca4", new Object[]{cls});
            }
            Map<Class<? extends Message>, Redactor> map = f;
            Redactor<T> redactor3 = (Redactor) ((LinkedHashMap) map).get(cls);
            if (redactor3 != null) {
                return redactor3;
            }
            FutureRedactor futureRedactor = new FutureRedactor();
            map.put(cls, futureRedactor);
            try {
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                for (Field field : cls.getDeclaredFields()) {
                    if (!Modifier.isStatic(field.getModifiers())) {
                        ProtoField protoField = (ProtoField) field.getAnnotation(ProtoField.class);
                        if (protoField == null || !protoField.redacted()) {
                            if (Message.class.isAssignableFrom(field.getType()) && (redactor2 = get(field.getType())) != e) {
                                arrayList2.add(field);
                                arrayList3.add(redactor2);
                            }
                        } else if (protoField.label() != Message.Label.REQUIRED) {
                            arrayList.add(field);
                        } else {
                            throw new IllegalArgumentException("Field " + field + " is REQUIRED and cannot be redacted.");
                        }
                    }
                }
                if (!arrayList.isEmpty() || !arrayList2.isEmpty()) {
                    redactor = new Redactor(cls.getConstructor(cls), arrayList, arrayList2, arrayList3);
                } else {
                    redactor = e;
                }
                futureRedactor.setDelegate(redactor);
                f.put(cls, redactor);
                return redactor;
            } catch (RuntimeException e2) {
                throw e2;
            } catch (Exception e3) {
                throw new AssertionError(e3);
            }
        }
    }

    public T redact(T t) {
        List<Field> list = this.c;
        if (t == null) {
            return null;
        }
        try {
            T t2 = (T) ((Message) this.f3691a.newInstance(t));
            for (Field field : this.b) {
                field.set(t2, null);
            }
            for (int i = 0; i < list.size(); i++) {
                Field field2 = list.get(i);
                field2.set(t2, this.d.get(i).redact((Message) field2.get(t2)));
            }
            return t2;
        } catch (Exception e2) {
            throw new AssertionError(e2.getMessage());
        }
    }
}
