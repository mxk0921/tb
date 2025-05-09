package com.alipay.android.msp.framework.wire;

import com.alipay.android.msp.framework.okio.ByteString;
import com.alipay.android.msp.framework.wire.Message;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.GenericDeclaration;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.Set;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class MessageAdapter<M extends Message> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final Wire kc;
    private final Map<String, Integer> kd = new LinkedHashMap();
    private final TagMap<FieldInfo> ke;
    private final Class<M> messageType;

    /* compiled from: Taobao */
    /* renamed from: com.alipay.android.msp.framework.wire.MessageAdapter$1  reason: invalid class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$alipay$android$msp$framework$wire$Message$Datatype;
        public static final /* synthetic */ int[] $SwitchMap$com$alipay$android$msp$framework$wire$WireType;

        static {
            int[] iArr = new int[WireType.values().length];
            $SwitchMap$com$alipay$android$msp$framework$wire$WireType = iArr;
            try {
                iArr[WireType.VARINT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$alipay$android$msp$framework$wire$WireType[WireType.FIXED32.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$alipay$android$msp$framework$wire$WireType[WireType.FIXED64.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$alipay$android$msp$framework$wire$WireType[WireType.LENGTH_DELIMITED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$alipay$android$msp$framework$wire$WireType[WireType.START_GROUP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$alipay$android$msp$framework$wire$WireType[WireType.END_GROUP.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr2 = new int[Message.Datatype.values().length];
            $SwitchMap$com$alipay$android$msp$framework$wire$Message$Datatype = iArr2;
            try {
                iArr2[Message.Datatype.INT32.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$alipay$android$msp$framework$wire$Message$Datatype[Message.Datatype.INT64.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$alipay$android$msp$framework$wire$Message$Datatype[Message.Datatype.UINT64.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$alipay$android$msp$framework$wire$Message$Datatype[Message.Datatype.UINT32.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$alipay$android$msp$framework$wire$Message$Datatype[Message.Datatype.SINT32.ordinal()] = 5;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$alipay$android$msp$framework$wire$Message$Datatype[Message.Datatype.SINT64.ordinal()] = 6;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$com$alipay$android$msp$framework$wire$Message$Datatype[Message.Datatype.BOOL.ordinal()] = 7;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$com$alipay$android$msp$framework$wire$Message$Datatype[Message.Datatype.ENUM.ordinal()] = 8;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$com$alipay$android$msp$framework$wire$Message$Datatype[Message.Datatype.STRING.ordinal()] = 9;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$com$alipay$android$msp$framework$wire$Message$Datatype[Message.Datatype.BYTES.ordinal()] = 10;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                $SwitchMap$com$alipay$android$msp$framework$wire$Message$Datatype[Message.Datatype.MESSAGE.ordinal()] = 11;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                $SwitchMap$com$alipay$android$msp$framework$wire$Message$Datatype[Message.Datatype.FIXED32.ordinal()] = 12;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                $SwitchMap$com$alipay$android$msp$framework$wire$Message$Datatype[Message.Datatype.SFIXED32.ordinal()] = 13;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                $SwitchMap$com$alipay$android$msp$framework$wire$Message$Datatype[Message.Datatype.FLOAT.ordinal()] = 14;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                $SwitchMap$com$alipay$android$msp$framework$wire$Message$Datatype[Message.Datatype.FIXED64.ordinal()] = 15;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                $SwitchMap$com$alipay$android$msp$framework$wire$Message$Datatype[Message.Datatype.SFIXED64.ordinal()] = 16;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                $SwitchMap$com$alipay$android$msp$framework$wire$Message$Datatype[Message.Datatype.DOUBLE.ordinal()] = 17;
            } catch (NoSuchFieldError unused23) {
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class FieldInfo {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final Field f3689a;
        public final Field b;
        public final Message.Datatype datatype;
        public EnumAdapter<? extends ProtoEnum> enumAdapter;
        public final Class<? extends ProtoEnum> enumType;
        public final Message.Label label;
        public MessageAdapter<? extends Message> messageAdapter;
        public final Class<? extends Message> messageType;
        public final String name;
        public final boolean redacted;
        public final int tag;

        public /* synthetic */ FieldInfo(int i, String str, Message.Datatype datatype, Message.Label label, boolean z, Class cls, Field field, Field field2, AnonymousClass1 r9) {
            this(i, str, datatype, label, z, cls, field, field2);
        }

        public static /* synthetic */ Field access$000(FieldInfo fieldInfo) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Field) ipChange.ipc$dispatch("7dfba23a", new Object[]{fieldInfo});
            }
            return fieldInfo.f3689a;
        }

        public static /* synthetic */ Field access$100(FieldInfo fieldInfo) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Field) ipChange.ipc$dispatch("a641e27b", new Object[]{fieldInfo});
            }
            return fieldInfo.b;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public FieldInfo(int i, String str, Message.Datatype datatype, Message.Label label, boolean z, Class<?> cls, Field field, Field field2) {
            this.tag = i;
            this.name = str;
            this.datatype = datatype;
            this.label = label;
            this.redacted = z;
            if (datatype == Message.Datatype.ENUM) {
                this.enumType = cls;
                this.messageType = null;
            } else if (datatype == Message.Datatype.MESSAGE) {
                this.messageType = cls;
                this.enumType = null;
            } else {
                this.enumType = null;
                this.messageType = null;
            }
            this.f3689a = field;
            this.b = field2;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class ImmutableList<T> extends AbstractList<T> implements Serializable, Cloneable, RandomAccess {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final List<T> list = new ArrayList();

        public static /* synthetic */ List access$400(ImmutableList immutableList) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (List) ipChange.ipc$dispatch("e32567de", new Object[]{immutableList});
            }
            return immutableList.list;
        }

        public static /* synthetic */ Object ipc$super(ImmutableList immutableList, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/android/msp/framework/wire/MessageAdapter$ImmutableList");
        }

        public Object clone() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("78b3604e", new Object[]{this});
            }
            return this;
        }

        @Override // java.util.AbstractList, java.util.List
        public T get(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (T) ipChange.ipc$dispatch("bb5c862c", new Object[]{this, new Integer(i)});
            }
            return this.list.get(i);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("32697bfb", new Object[]{this})).intValue();
            }
            return this.list.size();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class Storage {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public Map<Integer, ImmutableList<Object>> f3690a;

        public Storage() {
        }

        public void add(int i, Object obj) {
            ImmutableList<Object> immutableList;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1dab3277", new Object[]{this, new Integer(i), obj});
                return;
            }
            Map<Integer, ImmutableList<Object>> map = this.f3690a;
            if (map == null) {
                immutableList = null;
            } else {
                immutableList = map.get(Integer.valueOf(i));
            }
            if (immutableList == null) {
                immutableList = new ImmutableList<>();
                if (this.f3690a == null) {
                    this.f3690a = new LinkedHashMap();
                }
                this.f3690a.put(Integer.valueOf(i), immutableList);
            }
            ImmutableList.access$400(immutableList).add(obj);
        }

        public List<Object> get(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (List) ipChange.ipc$dispatch("640eb7c1", new Object[]{this, new Integer(i)});
            }
            Map<Integer, ImmutableList<Object>> map = this.f3690a;
            if (map == null) {
                return null;
            }
            return (List) ((LinkedHashMap) map).get(Integer.valueOf(i));
        }

        public Set<Integer> getTags() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Set) ipChange.ipc$dispatch("6c8b9f05", new Object[]{this});
            }
            Map<Integer, ImmutableList<Object>> map = this.f3690a;
            if (map == null) {
                return Collections.emptySet();
            }
            return ((LinkedHashMap) map).keySet();
        }

        public /* synthetic */ Storage(AnonymousClass1 r1) {
            this();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0074, code lost:
        if (java.lang.Enum.class.isAssignableFrom(r10) != false) goto L_0x0056;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a4, code lost:
        if (com.alipay.android.msp.framework.wire.Message.class.isAssignableFrom(r10) != false) goto L_0x0056;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public MessageAdapter(com.alipay.android.msp.framework.wire.Wire r19, java.lang.Class<M> r20) {
        /*
            r18 = this;
            r0 = r18
            r18.<init>()
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            r0.kd = r1
            r1 = r19
            r0.kc = r1
            r1 = r20
            r0.messageType = r1
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            java.lang.reflect.Field[] r1 = r20.getDeclaredFields()
            int r3 = r1.length
            r4 = 0
            r5 = 0
        L_0x0020:
            if (r5 >= r3) goto L_0x00d4
            r13 = r1[r5]
            java.lang.Class<com.alipay.android.msp.framework.wire.ProtoField> r6 = com.alipay.android.msp.framework.wire.ProtoField.class
            java.lang.annotation.Annotation r6 = r13.getAnnotation(r6)
            com.alipay.android.msp.framework.wire.ProtoField r6 = (com.alipay.android.msp.framework.wire.ProtoField) r6
            if (r6 == 0) goto L_0x00cb
            int r7 = r6.tag()
            java.lang.String r8 = r13.getName()
            java.util.Map<java.lang.String, java.lang.Integer> r9 = r0.kd
            java.lang.Integer r10 = java.lang.Integer.valueOf(r7)
            r9.put(r8, r10)
            com.alipay.android.msp.framework.wire.Message$Datatype r9 = r6.type()
            com.alipay.android.msp.framework.wire.Message$Datatype r10 = com.alipay.android.msp.framework.wire.Message.Datatype.ENUM
            java.lang.Class<java.util.List> r11 = java.util.List.class
            r12 = 0
            if (r9 != r10) goto L_0x0077
            java.lang.Class r10 = r13.getType()
            java.lang.Class<java.lang.Enum> r14 = java.lang.Enum.class
            boolean r15 = r14.isAssignableFrom(r10)
            if (r15 == 0) goto L_0x0058
        L_0x0056:
            r12 = r10
            goto L_0x00a7
        L_0x0058:
            boolean r10 = r11.isAssignableFrom(r10)
            if (r10 == 0) goto L_0x00a7
            java.lang.reflect.Type r10 = r13.getGenericType()
            java.lang.reflect.ParameterizedType r10 = (java.lang.reflect.ParameterizedType) r10
            java.lang.reflect.Type[] r10 = r10.getActualTypeArguments()
            r10 = r10[r4]
            boolean r11 = r10 instanceof java.lang.Class
            if (r11 == 0) goto L_0x00a7
            java.lang.Class r10 = (java.lang.Class) r10
            boolean r11 = r14.isAssignableFrom(r10)
            if (r11 == 0) goto L_0x00a7
            goto L_0x0056
        L_0x0077:
            com.alipay.android.msp.framework.wire.Message$Datatype r10 = com.alipay.android.msp.framework.wire.Message.Datatype.MESSAGE
            if (r9 != r10) goto L_0x00a7
            java.lang.Class r10 = r13.getType()
            java.lang.Class<com.alipay.android.msp.framework.wire.Message> r14 = com.alipay.android.msp.framework.wire.Message.class
            boolean r15 = r14.isAssignableFrom(r10)
            if (r15 == 0) goto L_0x0088
            goto L_0x0056
        L_0x0088:
            boolean r10 = r11.isAssignableFrom(r10)
            if (r10 == 0) goto L_0x00a7
            java.lang.reflect.Type r10 = r13.getGenericType()
            java.lang.reflect.ParameterizedType r10 = (java.lang.reflect.ParameterizedType) r10
            java.lang.reflect.Type[] r10 = r10.getActualTypeArguments()
            r10 = r10[r4]
            boolean r11 = r10 instanceof java.lang.Class
            if (r11 == 0) goto L_0x00a7
            java.lang.Class r10 = (java.lang.Class) r10
            boolean r11 = r14.isAssignableFrom(r10)
            if (r11 == 0) goto L_0x00a7
            goto L_0x0056
        L_0x00a7:
            java.lang.Integer r15 = java.lang.Integer.valueOf(r7)
            com.alipay.android.msp.framework.wire.MessageAdapter$FieldInfo r14 = new com.alipay.android.msp.framework.wire.MessageAdapter$FieldInfo
            com.alipay.android.msp.framework.wire.Message$Label r10 = r6.label()
            boolean r11 = r6.redacted()
            java.lang.reflect.Field r16 = r0.G(r8)
            r17 = 0
            r6 = r14
            r4 = r14
            r14 = r16
            r20 = r1
            r1 = r15
            r15 = r17
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r2.put(r1, r4)
            goto L_0x00cd
        L_0x00cb:
            r20 = r1
        L_0x00cd:
            int r5 = r5 + 1
            r1 = r20
            r4 = 0
            goto L_0x0020
        L_0x00d4:
            com.alipay.android.msp.framework.wire.TagMap r1 = com.alipay.android.msp.framework.wire.TagMap.of(r2)
            r0.ke = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.android.msp.framework.wire.MessageAdapter.<init>(com.alipay.android.msp.framework.wire.Wire, java.lang.Class):void");
    }

    private Field G(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Field) ipChange.ipc$dispatch("6b64fe95", new Object[]{this, str});
        }
        try {
            return this.messageType.getField(str);
        } catch (NoSuchFieldException unused) {
            throw new AssertionError("No builder field " + this.messageType.getName() + "." + str);
        }
    }

    private static int H(String str) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b4ce54cc", new Object[]{str})).intValue();
        }
        int length = str.length();
        int i2 = 0;
        while (i < length) {
            char charAt = str.charAt(i);
            if (charAt <= 127) {
                i2++;
            } else if (charAt <= 2047) {
                i2 += 2;
            } else if (Character.isHighSurrogate(charAt)) {
                i2 += 4;
                i++;
            } else {
                i2 += 3;
            }
            i++;
        }
        return i2;
    }

    private int a(List<?> list, int i, Message.Datatype datatype) {
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2ec2cdae", new Object[]{this, list, new Integer(i), datatype})).intValue();
        }
        Iterator<?> it = list.iterator();
        while (it.hasNext()) {
            i2 += a(i, it.next(), datatype);
        }
        return i2;
    }

    private int b(List<?> list, int i, Message.Datatype datatype) {
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("47c41f4d", new Object[]{this, list, new Integer(i), datatype})).intValue();
        }
        Iterator<?> it = list.iterator();
        while (it.hasNext()) {
            i2 += a(it.next(), datatype);
        }
        return WireOutput.varint32Size(WireOutput.makeTag(i, WireType.LENGTH_DELIMITED)) + WireOutput.varint32Size(i2) + i2;
    }

    private Extension<ExtendableMessage<?>, ?> getExtension(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Extension) ipChange.ipc$dispatch("c4620302", new Object[]{this, new Integer(i)});
        }
        ExtensionRegistry extensionRegistry = this.kc.registry;
        if (extensionRegistry == null) {
            return null;
        }
        return extensionRegistry.getExtension(this.messageType, i);
    }

    public final FieldInfo getField(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FieldInfo) ipChange.ipc$dispatch("976c35e7", new Object[]{this, str});
        }
        Integer num = this.kd.get(str);
        if (num == null) {
            return null;
        }
        return this.ke.get(num.intValue());
    }

    public final Object getFieldValue(M m, FieldInfo fieldInfo) {
        if (FieldInfo.access$000(fieldInfo) != null) {
            try {
                return FieldInfo.access$000(fieldInfo).get(m);
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            }
        } else {
            throw new AssertionError("Field is not of type \"Message\"");
        }
    }

    public final Collection<FieldInfo> getFields() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Collection) ipChange.ipc$dispatch("624ef3d1", new Object[]{this});
        }
        return this.ke.values();
    }

    public final int getSerializedSize(M m) {
        ExtensionMap<T> extensionMap;
        int a2;
        int a3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5554868", new Object[]{this, m})).intValue();
        }
        int i = 0;
        for (FieldInfo fieldInfo : getFields()) {
            Object fieldValue = getFieldValue(m, fieldInfo);
            if (fieldValue != null) {
                int i2 = fieldInfo.tag;
                Message.Datatype datatype = fieldInfo.datatype;
                Message.Label label = fieldInfo.label;
                if (!label.isRepeated()) {
                    a3 = a(i2, fieldValue, datatype);
                } else if (label.isPacked()) {
                    a3 = b((List) fieldValue, i2, datatype);
                } else {
                    a3 = a((List) fieldValue, i2, datatype);
                }
                i += a3;
            }
        }
        if ((m instanceof ExtendableMessage) && (extensionMap = ((ExtendableMessage) m).extensionMap) != 0) {
            int i3 = 0;
            for (int i4 = 0; i4 < extensionMap.size(); i4++) {
                Extension extension = extensionMap.getExtension(i4);
                Object extensionValue = extensionMap.getExtensionValue(i4);
                int tag = extension.getTag();
                Message.Datatype datatype2 = extension.getDatatype();
                Message.Label label2 = extension.getLabel();
                if (!label2.isRepeated()) {
                    a2 = a(tag, extensionValue, datatype2);
                } else if (label2.isPacked()) {
                    a2 = b((List) extensionValue, tag, datatype2);
                } else {
                    a2 = a((List) extensionValue, tag, datatype2);
                }
                i3 += a2;
            }
            i += i3;
        }
        return i + m.getUnknownFieldsSerializedSize();
    }

    public final M read(WireInput wireInput) throws IOException {
        Message.Label label;
        Message.Datatype datatype;
        Extension<ExtendableMessage<?>, ?> extension;
        try {
            M newInstance = this.messageType.newInstance();
            Storage storage = new Storage(null);
            while (true) {
                int readTag = wireInput.readTag();
                int i = readTag >> 3;
                WireType valueOf = WireType.valueOf(readTag);
                if (i == 0) {
                    for (Integer num : storage.getTags()) {
                        int intValue = num.intValue();
                        if (this.ke.containsKey(intValue)) {
                            setBuilderField(newInstance, intValue, storage.get(intValue));
                        } else {
                            ((ExtendableMessage) newInstance).setExtension(getExtension(intValue), storage.get(intValue));
                        }
                    }
                    return newInstance;
                }
                FieldInfo fieldInfo = this.ke.get(i);
                if (fieldInfo != null) {
                    Message.Datatype datatype2 = fieldInfo.datatype;
                    label = fieldInfo.label;
                    datatype = datatype2;
                    extension = null;
                } else {
                    Extension<ExtendableMessage<?>, ?> extension2 = getExtension(i);
                    if (extension2 == null) {
                        switch (AnonymousClass1.$SwitchMap$com$alipay$android$msp$framework$wire$WireType[valueOf.ordinal()]) {
                            case 1:
                                newInstance.ensureUnknownFieldMap().addVarint(i, Long.valueOf(wireInput.readVarint64()));
                                continue;
                            case 2:
                                newInstance.ensureUnknownFieldMap().addFixed32(i, Integer.valueOf(wireInput.readFixed32()));
                                continue;
                            case 3:
                                newInstance.ensureUnknownFieldMap().addFixed64(i, Long.valueOf(wireInput.readFixed64()));
                                continue;
                            case 4:
                                newInstance.ensureUnknownFieldMap().addLengthDelimited(i, wireInput.readBytes(wireInput.readVarint32()));
                                continue;
                            case 5:
                                wireInput.skipGroup();
                                continue;
                            case 6:
                                break;
                            default:
                                throw new RuntimeException("Unsupported wire type: ".concat(String.valueOf(valueOf)));
                        }
                    } else {
                        Message.Datatype datatype3 = extension2.getDatatype();
                        extension = extension2;
                        label = extension2.getLabel();
                        datatype = datatype3;
                    }
                }
                if (!label.isPacked() || valueOf != WireType.LENGTH_DELIMITED) {
                    Object a2 = a(wireInput, i, datatype);
                    if (datatype == Message.Datatype.ENUM && (a2 instanceof Integer)) {
                        newInstance.addVarint(i, ((Integer) a2).intValue());
                    } else if (label.isRepeated()) {
                        storage.add(i, a2);
                    } else if (extension != null) {
                        ((ExtendableMessage) newInstance).setExtension(extension, a2);
                    } else {
                        setBuilderField(newInstance, i, a2);
                    }
                } else {
                    int readVarint32 = wireInput.readVarint32();
                    long position = wireInput.getPosition();
                    int pushLimit = wireInput.pushLimit(readVarint32);
                    while (true) {
                        long j = readVarint32 + position;
                        if (wireInput.getPosition() < j) {
                            Object a3 = a(wireInput, i, datatype);
                            if (datatype != Message.Datatype.ENUM || !(a3 instanceof Integer)) {
                                storage.add(i, a3);
                            } else {
                                newInstance.addVarint(i, ((Integer) a3).intValue());
                            }
                        } else {
                            wireInput.popLimit(pushLimit);
                            if (wireInput.getPosition() != j) {
                                throw new IOException("Packed data had wrong length!");
                            }
                        }
                    }
                }
            }
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e2) {
            throw new RuntimeException(e2);
        }
    }

    public final void setBuilderField(M m, int i, Object obj) {
        try {
            FieldInfo.access$100(this.ke.get(i)).set(m, obj);
        } catch (IllegalAccessException e) {
            throw new AssertionError(e);
        }
    }

    public final byte[] toByteArray(M m) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("cac1dce3", new Object[]{this, m});
        }
        byte[] bArr = new byte[getSerializedSize(m)];
        try {
            write(m, WireOutput.newInstance(bArr));
            return bArr;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public final String toString(M m) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("731bca1c", new Object[]{this, m});
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.messageType.getSimpleName());
        sb.append("{");
        String str = "";
        for (FieldInfo fieldInfo : getFields()) {
            Object fieldValue = getFieldValue(m, fieldInfo);
            if (fieldValue != null) {
                sb.append(str);
                sb.append(fieldInfo.name);
                sb.append("=");
                if (fieldInfo.redacted) {
                    fieldValue = "██";
                }
                sb.append(fieldValue);
                str = ", ";
            }
        }
        if (m instanceof ExtendableMessage) {
            sb.append(str);
            sb.append("{extensions=");
            sb.append(((ExtendableMessage) m).extensionsToString());
            sb.append("}");
        }
        sb.append("}");
        return sb.toString();
    }

    public final void write(M m, WireOutput wireOutput) throws IOException {
        ExtensionMap<T> extensionMap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7942a4dd", new Object[]{this, m, wireOutput});
            return;
        }
        for (FieldInfo fieldInfo : getFields()) {
            Object fieldValue = getFieldValue(m, fieldInfo);
            if (fieldValue != null) {
                int i = fieldInfo.tag;
                Message.Datatype datatype = fieldInfo.datatype;
                Message.Label label = fieldInfo.label;
                if (!label.isRepeated()) {
                    a(wireOutput, i, fieldValue, datatype);
                } else if (label.isPacked()) {
                    b(wireOutput, (List) fieldValue, i, datatype);
                } else {
                    a(wireOutput, (List) fieldValue, i, datatype);
                }
            }
        }
        if ((m instanceof ExtendableMessage) && (extensionMap = ((ExtendableMessage) m).extensionMap) != 0) {
            for (int i2 = 0; i2 < extensionMap.size(); i2++) {
                Extension extension = extensionMap.getExtension(i2);
                Object extensionValue = extensionMap.getExtensionValue(i2);
                int tag = extension.getTag();
                Message.Datatype datatype2 = extension.getDatatype();
                Message.Label label2 = extension.getLabel();
                if (!label2.isRepeated()) {
                    a(wireOutput, tag, extensionValue, datatype2);
                } else if (label2.isPacked()) {
                    b(wireOutput, (List) extensionValue, tag, datatype2);
                } else {
                    a(wireOutput, (List) extensionValue, tag, datatype2);
                }
            }
        }
        m.writeUnknownFieldMap(wireOutput);
    }

    private void a(WireOutput wireOutput, List<?> list, int i, Message.Datatype datatype) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5dbc4cf", new Object[]{this, wireOutput, list, new Integer(i), datatype});
            return;
        }
        Iterator<?> it = list.iterator();
        while (it.hasNext()) {
            a(wireOutput, i, it.next(), datatype);
        }
    }

    public final Extension<ExtendableMessage<?>, ?> getExtension(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Extension) ipChange.ipc$dispatch("805a04e9", new Object[]{this, str});
        }
        ExtensionRegistry extensionRegistry = this.kc.registry;
        if (extensionRegistry == null) {
            return null;
        }
        return extensionRegistry.getExtension(this.messageType, str);
    }

    private int a(int i, Object obj, Message.Datatype datatype) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("4203a09b", new Object[]{this, new Integer(i), obj, datatype})).intValue() : WireOutput.varintTagSize(i) + a(obj, datatype);
    }

    private void b(WireOutput wireOutput, List<?> list, int i, Message.Datatype datatype) throws IOException {
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b46e50ae", new Object[]{this, wireOutput, list, new Integer(i), datatype});
            return;
        }
        Iterator<?> it = list.iterator();
        while (it.hasNext()) {
            i2 += a(it.next(), datatype);
        }
        wireOutput.writeTag(i, WireType.LENGTH_DELIMITED);
        wireOutput.writeVarint32(i2);
        Iterator<?> it2 = list.iterator();
        while (it2.hasNext()) {
            a(wireOutput, it2.next(), datatype);
        }
    }

    private int a(Object obj, Message.Datatype datatype) {
        int H;
        int varint32Size;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1158b528", new Object[]{this, obj, datatype})).intValue();
        }
        switch (AnonymousClass1.$SwitchMap$com$alipay$android$msp$framework$wire$Message$Datatype[datatype.ordinal()]) {
            case 1:
                return WireOutput.int32Size(((Integer) obj).intValue());
            case 2:
            case 3:
                return WireOutput.varint64Size(((Long) obj).longValue());
            case 4:
                return WireOutput.varint32Size(((Integer) obj).intValue());
            case 5:
                return WireOutput.varint32Size(WireOutput.zigZag32(((Integer) obj).intValue()));
            case 6:
                return WireOutput.varint64Size(WireOutput.zigZag64(((Long) obj).longValue()));
            case 7:
                return 1;
            case 8:
                return a((MessageAdapter<M>) ((ProtoEnum) obj));
            case 9:
                H = H((String) obj);
                varint32Size = WireOutput.varint32Size(H);
                break;
            case 10:
                H = ((ByteString) obj).size();
                varint32Size = WireOutput.varint32Size(H);
                break;
            case 11:
                return a((Message) obj);
            case 12:
            case 13:
            case 14:
                return 4;
            case 15:
            case 16:
            case 17:
                return 8;
            default:
                throw new RuntimeException();
        }
        return varint32Size + H;
    }

    private <E extends ProtoEnum> int a(E e) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("fd86c120", new Object[]{this, e})).intValue() : WireOutput.varint32Size(this.kc.enumAdapter(e.getClass()).toInt(e));
    }

    private static <M extends Message> int a(M m) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4e0302e2", new Object[]{m})).intValue();
        }
        int serializedSize = m.getSerializedSize();
        return WireOutput.varint32Size(serializedSize) + serializedSize;
    }

    private void a(WireOutput wireOutput, int i, Object obj, Message.Datatype datatype) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76bb22bc", new Object[]{this, wireOutput, new Integer(i), obj, datatype});
            return;
        }
        wireOutput.writeTag(i, datatype.wireType());
        a(wireOutput, obj, datatype);
    }

    private void a(WireOutput wireOutput, Object obj, Message.Datatype datatype) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d5ea0a1", new Object[]{this, wireOutput, obj, datatype});
            return;
        }
        switch (AnonymousClass1.$SwitchMap$com$alipay$android$msp$framework$wire$Message$Datatype[datatype.ordinal()]) {
            case 1:
                wireOutput.writeSignedVarint32(((Integer) obj).intValue());
                return;
            case 2:
            case 3:
                wireOutput.writeVarint64(((Long) obj).longValue());
                return;
            case 4:
                wireOutput.writeVarint32(((Integer) obj).intValue());
                return;
            case 5:
                wireOutput.writeVarint32(WireOutput.zigZag32(((Integer) obj).intValue()));
                return;
            case 6:
                wireOutput.writeVarint64(WireOutput.zigZag64(((Long) obj).longValue()));
                return;
            case 7:
                wireOutput.writeRawByte(((Boolean) obj).booleanValue() ? 1 : 0);
                return;
            case 8:
                a((MessageAdapter<M>) ((ProtoEnum) obj), wireOutput);
                return;
            case 9:
                byte[] bytes = ((String) obj).getBytes("UTF-8");
                wireOutput.writeVarint32(bytes.length);
                wireOutput.writeRawBytes(bytes);
                return;
            case 10:
                ByteString byteString = (ByteString) obj;
                wireOutput.writeVarint32(byteString.size());
                wireOutput.writeRawBytes(byteString.toByteArray());
                return;
            case 11:
                a((MessageAdapter<M>) ((Message) obj), wireOutput);
                return;
            case 12:
            case 13:
                wireOutput.writeFixed32(((Integer) obj).intValue());
                return;
            case 14:
                wireOutput.writeFixed32(Float.floatToIntBits(((Float) obj).floatValue()));
                return;
            case 15:
            case 16:
                wireOutput.writeFixed64(((Long) obj).longValue());
                return;
            case 17:
                wireOutput.writeFixed64(Double.doubleToLongBits(((Double) obj).doubleValue()));
                return;
            default:
                throw new RuntimeException();
        }
    }

    private <M extends Message> void a(M m, WireOutput wireOutput) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61fc959b", new Object[]{this, m, wireOutput});
            return;
        }
        wireOutput.writeVarint32(m.getSerializedSize());
        this.kc.messageAdapter(m.getClass()).write(m, wireOutput);
    }

    private <E extends ProtoEnum> void a(E e, WireOutput wireOutput) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26860859", new Object[]{this, e, wireOutput});
        } else {
            wireOutput.writeVarint32(this.kc.enumAdapter(e.getClass()).toInt(e));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Object a(WireInput wireInput, int i, Message.Datatype datatype) throws IOException {
        EnumAdapter<? extends ProtoEnum> enumAdapter;
        Extension<ExtendableMessage<?>, ?> extension;
        MessageAdapter<? extends Message> messageAdapter;
        Extension<ExtendableMessage<?>, ?> extension2;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("5d2ab3ef", new Object[]{this, wireInput, new Integer(i), datatype});
        }
        GenericDeclaration genericDeclaration = null;
        switch (AnonymousClass1.$SwitchMap$com$alipay$android$msp$framework$wire$Message$Datatype[datatype.ordinal()]) {
            case 1:
            case 4:
                return Integer.valueOf(wireInput.readVarint32());
            case 2:
            case 3:
                return Long.valueOf(wireInput.readVarint64());
            case 5:
                return Integer.valueOf(WireInput.decodeZigZag32(wireInput.readVarint32()));
            case 6:
                return Long.valueOf(WireInput.decodeZigZag64(wireInput.readVarint64()));
            case 7:
                if (wireInput.readVarint32() == 0) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 8:
                FieldInfo fieldInfo = this.ke.get(i);
                if (fieldInfo == null || (enumAdapter = fieldInfo.enumAdapter) == null) {
                    Wire wire = this.kc;
                    FieldInfo fieldInfo2 = this.ke.get(i);
                    if (fieldInfo2 != null) {
                        genericDeclaration = fieldInfo2.enumType;
                    }
                    if (genericDeclaration == null && (extension = getExtension(i)) != null) {
                        genericDeclaration = extension.getEnumType();
                    }
                    enumAdapter = wire.enumAdapter(genericDeclaration);
                    if (fieldInfo != null) {
                        fieldInfo.enumAdapter = enumAdapter;
                    }
                }
                int readVarint32 = wireInput.readVarint32();
                try {
                    return enumAdapter.fromInt(readVarint32);
                } catch (IllegalArgumentException unused) {
                    return Integer.valueOf(readVarint32);
                }
            case 9:
                return wireInput.readString();
            case 10:
                return wireInput.readBytes();
            case 11:
                int readVarint322 = wireInput.readVarint32();
                if (wireInput.recursionDepth < 64) {
                    int pushLimit = wireInput.pushLimit(readVarint322);
                    wireInput.recursionDepth++;
                    FieldInfo fieldInfo3 = this.ke.get(i);
                    if (fieldInfo3 == null || (messageAdapter = fieldInfo3.messageAdapter) == null) {
                        Wire wire2 = this.kc;
                        FieldInfo fieldInfo4 = this.ke.get(i);
                        if (fieldInfo4 != null) {
                            genericDeclaration = fieldInfo4.messageType;
                        }
                        if (genericDeclaration == null && (extension2 = getExtension(i)) != null) {
                            genericDeclaration = extension2.getMessageType();
                        }
                        messageAdapter = wire2.messageAdapter(genericDeclaration);
                        if (fieldInfo3 != null) {
                            fieldInfo3.messageAdapter = messageAdapter;
                        }
                    }
                    Message read = messageAdapter.read(wireInput);
                    wireInput.checkLastTagWas(0);
                    wireInput.recursionDepth--;
                    wireInput.popLimit(pushLimit);
                    return read;
                }
                throw new IOException("Wire recursion limit exceeded");
            case 12:
            case 13:
                return Integer.valueOf(wireInput.readFixed32());
            case 14:
                return Float.valueOf(Float.intBitsToFloat(wireInput.readFixed32()));
            case 15:
            case 16:
                return Long.valueOf(wireInput.readFixed64());
            case 17:
                return Double.valueOf(Double.longBitsToDouble(wireInput.readFixed64()));
            default:
                throw new RuntimeException();
        }
    }
}
