package com.alipay.android.msp.framework.wire;

import com.alipay.android.msp.framework.okio.Source;
import com.alipay.android.msp.framework.wire.Message;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class Wire {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Map<Class<? extends Message>, MessageAdapter<? extends Message>> f3694a;
    public final Map<Class<? extends Message.Builder>, BuilderAdapter<? extends Message.Builder>> b;
    public final Map<Class<? extends ProtoEnum>, EnumAdapter<? extends ProtoEnum>> c;
    public final Map<Class<? extends Message>, AvailabilityChecker<? extends Message>> d;
    public final ExtensionRegistry registry;

    public Wire(Class<?>... clsArr) {
        this(Arrays.asList(clsArr));
    }

    public static <T> T get(T t, T t2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("9a6354bd", new Object[]{t, t2});
        }
        if (t != null) {
            return t;
        }
        return t2;
    }

    public final <M extends Message> M a(WireInput wireInput, Class<M> cls) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (M) ((Message) ipChange.ipc$dispatch("620f2173", new Object[]{this, wireInput, cls}));
        }
        return messageAdapter(cls).read(wireInput);
    }

    public final synchronized <T extends Message> AvailabilityChecker<T> availabilityChecker(Class<T> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AvailabilityChecker) ipChange.ipc$dispatch("4c450090", new Object[]{this, cls});
        }
        AvailabilityChecker<T> availabilityChecker = (AvailabilityChecker) ((LinkedHashMap) this.d).get(cls);
        if (availabilityChecker == null) {
            availabilityChecker = new AvailabilityChecker<>(cls);
            this.d.put(cls, availabilityChecker);
        }
        return availabilityChecker;
    }

    public final synchronized <B extends Message.Builder> BuilderAdapter<B> builderAdapter(Class<B> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BuilderAdapter) ipChange.ipc$dispatch("8841c412", new Object[]{this, cls});
        }
        BuilderAdapter<B> builderAdapter = (BuilderAdapter) ((LinkedHashMap) this.b).get(cls);
        if (builderAdapter == null) {
            builderAdapter = new BuilderAdapter<>(cls);
            this.b.put(cls, builderAdapter);
        }
        return builderAdapter;
    }

    public final synchronized <E extends ProtoEnum> EnumAdapter<E> enumAdapter(Class<E> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (EnumAdapter) ipChange.ipc$dispatch("56af0928", new Object[]{this, cls});
        }
        EnumAdapter<E> enumAdapter = (EnumAdapter) ((LinkedHashMap) this.c).get(cls);
        if (enumAdapter == null) {
            enumAdapter = new EnumAdapter<>(cls);
            this.c.put(cls, enumAdapter);
        }
        return enumAdapter;
    }

    public final synchronized <M extends Message> MessageAdapter<M> messageAdapter(Class<M> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MessageAdapter) ipChange.ipc$dispatch("996b5d92", new Object[]{this, cls});
        }
        MessageAdapter<M> messageAdapter = (MessageAdapter) ((LinkedHashMap) this.f3694a).get(cls);
        if (messageAdapter == null) {
            messageAdapter = new MessageAdapter<>(this, cls);
            this.f3694a.put(cls, messageAdapter);
        }
        return messageAdapter;
    }

    public final <M extends Message> M parseFrom(byte[] bArr, Class<M> cls) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (M) ((Message) ipChange.ipc$dispatch("d7842bd9", new Object[]{this, bArr, cls}));
        }
        Preconditions.checkNotNull(bArr, "bytes");
        Preconditions.checkNotNull(cls, "messageClass");
        M m = (M) a(WireInput.newInstance(bArr), cls);
        m.checkAvailability();
        return m;
    }

    public Wire(List<Class<?>> list) {
        Field[] declaredFields;
        this.f3694a = new LinkedHashMap();
        this.b = new LinkedHashMap();
        this.c = new LinkedHashMap();
        this.d = new LinkedHashMap();
        this.registry = new ExtensionRegistry();
        for (Class<?> cls : list) {
            for (Field field : cls.getDeclaredFields()) {
                if (field.getType().equals(Extension.class)) {
                    try {
                        this.registry.add((Extension) field.get(null));
                    } catch (IllegalAccessException e) {
                        throw new AssertionError(e);
                    }
                }
            }
        }
    }

    public final <M extends Message> M parseFrom(byte[] bArr, int i, int i2, Class<M> cls) throws IOException {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (M) ((Message) ipChange.ipc$dispatch("e50b9e39", new Object[]{this, bArr, new Integer(i), new Integer(i2), cls}));
        }
        Preconditions.checkNotNull(bArr, "bytes");
        Preconditions.checkArgument(i >= 0, "offset < 0");
        Preconditions.checkArgument(i2 >= 0, "count < 0");
        if (i + i2 > bArr.length) {
            z = false;
        }
        Preconditions.checkArgument(z, "offset + count > bytes");
        Preconditions.checkNotNull(cls, "messageClass");
        return (M) a(WireInput.newInstance(bArr, i, i2), cls);
    }

    public final <M extends Message> M parseFrom(InputStream inputStream, Class<M> cls) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (M) ((Message) ipChange.ipc$dispatch("ca0ea815", new Object[]{this, inputStream, cls}));
        }
        Preconditions.checkNotNull(inputStream, "input");
        Preconditions.checkNotNull(cls, "messageClass");
        return (M) a(WireInput.newInstance(inputStream), cls);
    }

    public final <M extends Message> M parseFrom(Source source, Class<M> cls) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (M) ((Message) ipChange.ipc$dispatch("61e87eac", new Object[]{this, source, cls}));
        }
        Preconditions.checkNotNull(source, "input");
        Preconditions.checkNotNull(cls, "messageClass");
        return (M) a(WireInput.newInstance(source), cls);
    }
}
