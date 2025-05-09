package com.alipay.android.msp.framework.wire;

import com.alipay.android.msp.framework.okio.ByteString;
import com.alipay.android.msp.framework.wire.MessageAdapter;
import com.alipay.android.msp.framework.wire.UnknownFieldMap;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import tb.pg1;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public abstract class Message {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final Wire d = new Wire(new Class[0]);

    /* renamed from: a  reason: collision with root package name */
    public transient UnknownFieldMap f3688a;
    public transient boolean b;
    public transient int c;
    public transient int hashCode = 0;

    /* compiled from: Taobao */
    /* renamed from: com.alipay.android.msp.framework.wire.Message$1  reason: invalid class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$alipay$android$msp$framework$wire$Message$Datatype;

        static {
            int[] iArr = new int[Datatype.values().length];
            $SwitchMap$com$alipay$android$msp$framework$wire$Message$Datatype = iArr;
            try {
                iArr[Datatype.INT32.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$alipay$android$msp$framework$wire$Message$Datatype[Datatype.INT64.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$alipay$android$msp$framework$wire$Message$Datatype[Datatype.UINT32.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$alipay$android$msp$framework$wire$Message$Datatype[Datatype.UINT64.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$alipay$android$msp$framework$wire$Message$Datatype[Datatype.SINT32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$alipay$android$msp$framework$wire$Message$Datatype[Datatype.SINT64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$alipay$android$msp$framework$wire$Message$Datatype[Datatype.BOOL.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$alipay$android$msp$framework$wire$Message$Datatype[Datatype.ENUM.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$alipay$android$msp$framework$wire$Message$Datatype[Datatype.FIXED32.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$alipay$android$msp$framework$wire$Message$Datatype[Datatype.SFIXED32.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$alipay$android$msp$framework$wire$Message$Datatype[Datatype.FLOAT.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$alipay$android$msp$framework$wire$Message$Datatype[Datatype.FIXED64.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$com$alipay$android$msp$framework$wire$Message$Datatype[Datatype.SFIXED64.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$com$alipay$android$msp$framework$wire$Message$Datatype[Datatype.DOUBLE.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$com$alipay$android$msp$framework$wire$Message$Datatype[Datatype.STRING.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$com$alipay$android$msp$framework$wire$Message$Datatype[Datatype.BYTES.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                $SwitchMap$com$alipay$android$msp$framework$wire$Message$Datatype[Datatype.MESSAGE.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static abstract class Builder<T extends Message> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public UnknownFieldMap unknownFieldMap;

        public Builder() {
        }

        public static <T> List<T> checkForNulls(List<T> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (List) ipChange.ipc$dispatch("ae051244", new Object[]{list});
            }
            if (list != null && !list.isEmpty()) {
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    if (list.get(i) == null) {
                        throw new NullPointerException("Element at index " + i + " is null");
                    }
                }
            }
            return list;
        }

        public void addFixed32(int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9adf1a99", new Object[]{this, new Integer(i), new Integer(i2)});
                return;
            }
            try {
                ensureUnknownFieldMap().addFixed32(i, Integer.valueOf(i2));
            } catch (IOException e) {
                throw new IllegalArgumentException(e.getMessage());
            }
        }

        public void addFixed64(int i, long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c4f1b79", new Object[]{this, new Integer(i), new Long(j)});
                return;
            }
            try {
                ensureUnknownFieldMap().addFixed64(i, Long.valueOf(j));
            } catch (IOException e) {
                throw new IllegalArgumentException(e.getMessage());
            }
        }

        public void addLengthDelimited(int i, ByteString byteString) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("38cfd840", new Object[]{this, new Integer(i), byteString});
                return;
            }
            try {
                ensureUnknownFieldMap().addLengthDelimited(i, byteString);
            } catch (IOException e) {
                throw new IllegalArgumentException(e.getMessage());
            }
        }

        public void addVarint(int i, long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f6f8c391", new Object[]{this, new Integer(i), new Long(j)});
                return;
            }
            try {
                ensureUnknownFieldMap().addVarint(i, Long.valueOf(j));
            } catch (IOException e) {
                throw new IllegalArgumentException(e.getMessage());
            }
        }

        public abstract T build();

        public void checkRequiredFields() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ecfabae7", new Object[]{this});
            } else {
                Message.access$100().builderAdapter(getClass()).checkRequiredFields(this);
            }
        }

        public UnknownFieldMap ensureUnknownFieldMap() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (UnknownFieldMap) ipChange.ipc$dispatch("a95958d7", new Object[]{this});
            }
            if (this.unknownFieldMap == null) {
                this.unknownFieldMap = new UnknownFieldMap();
            }
            return this.unknownFieldMap;
        }

        public Builder(Message message) {
            if (message != null && Message.access$000(message) != null) {
                this.unknownFieldMap = new UnknownFieldMap(Message.access$000(message));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public enum Datatype {
        INT32(1),
        INT64(2),
        UINT32(3),
        UINT64(4),
        SINT32(5),
        SINT64(6),
        BOOL(7),
        ENUM(8),
        STRING(9),
        BYTES(10),
        MESSAGE(11),
        FIXED32(12),
        SFIXED32(13),
        FIXED64(14),
        SFIXED64(15),
        FLOAT(16),
        DOUBLE(17);
        
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final Comparator<Datatype> ORDER_BY_NAME = new Comparator<Datatype>() { // from class: com.alipay.android.msp.framework.wire.Message.Datatype.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public int compare(Datatype datatype, Datatype datatype2) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("26eb55c1", new Object[]{this, datatype, datatype2})).intValue() : datatype.name().compareTo(datatype2.name());
            }
        };
        private static final Map<String, Datatype> TYPES_BY_NAME;
        private final int value;

        static {
            Datatype datatype = INT32;
            Datatype datatype2 = INT64;
            Datatype datatype3 = UINT32;
            Datatype datatype4 = UINT64;
            Datatype datatype5 = SINT32;
            Datatype datatype6 = SINT64;
            Datatype datatype7 = BOOL;
            Datatype datatype8 = ENUM;
            Datatype datatype9 = STRING;
            Datatype datatype10 = BYTES;
            Datatype datatype11 = MESSAGE;
            Datatype datatype12 = FIXED32;
            Datatype datatype13 = SFIXED32;
            Datatype datatype14 = FIXED64;
            Datatype datatype15 = SFIXED64;
            Datatype datatype16 = FLOAT;
            Datatype datatype17 = DOUBLE;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            TYPES_BY_NAME = linkedHashMap;
            linkedHashMap.put("int32", datatype);
            linkedHashMap.put("int64", datatype2);
            linkedHashMap.put("uint32", datatype3);
            linkedHashMap.put("uint64", datatype4);
            linkedHashMap.put("sint32", datatype5);
            linkedHashMap.put("sint64", datatype6);
            linkedHashMap.put("bool", datatype7);
            linkedHashMap.put(pg1.ATOM_enum, datatype8);
            linkedHashMap.put("string", datatype9);
            linkedHashMap.put("bytes", datatype10);
            linkedHashMap.put("message", datatype11);
            linkedHashMap.put("fixed32", datatype12);
            linkedHashMap.put("sfixed32", datatype13);
            linkedHashMap.put("fixed64", datatype14);
            linkedHashMap.put("sfixed64", datatype15);
            linkedHashMap.put("float", datatype16);
            linkedHashMap.put("double", datatype17);
        }

        Datatype(int i) {
            this.value = i;
        }

        public static /* synthetic */ Object ipc$super(Datatype datatype, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/android/msp/framework/wire/Message$Datatype");
        }

        public static Datatype of(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Datatype) ipChange.ipc$dispatch("71a27b1f", new Object[]{str});
            }
            return TYPES_BY_NAME.get(str);
        }

        public static Datatype valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Datatype) ipChange.ipc$dispatch("d7d796e", new Object[]{str});
            }
            return (Datatype) Enum.valueOf(Datatype.class, str);
        }

        public final int value() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("d249f56b", new Object[]{this})).intValue();
            }
            return this.value;
        }

        public final WireType wireType() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (WireType) ipChange.ipc$dispatch("552f6f83", new Object[]{this});
            }
            switch (AnonymousClass1.$SwitchMap$com$alipay$android$msp$framework$wire$Message$Datatype[ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                    return WireType.VARINT;
                case 9:
                case 10:
                case 11:
                    return WireType.FIXED32;
                case 12:
                case 13:
                case 14:
                    return WireType.FIXED64;
                case 15:
                case 16:
                case 17:
                    return WireType.LENGTH_DELIMITED;
                default:
                    throw new AssertionError("No wiretype for datatype ".concat(String.valueOf(this)));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public enum Label {
        REQUIRED(32),
        OPTIONAL(64),
        REPEATED(128),
        PACKED(256);
        
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final Comparator<Label> ORDER_BY_NAME = new Comparator<Label>() { // from class: com.alipay.android.msp.framework.wire.Message.Label.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public int compare(Label label, Label label2) {
                IpChange ipChange = $ipChange;
                return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("22aae23f", new Object[]{this, label, label2})).intValue() : label.name().compareTo(label2.name());
            }
        };
        private final int value;

        Label(int i) {
            this.value = i;
        }

        public static /* synthetic */ Object ipc$super(Label label, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/android/msp/framework/wire/Message$Label");
        }

        public static Label valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Label) ipChange.ipc$dispatch("1cc2e890", new Object[]{str});
            }
            return (Label) Enum.valueOf(Label.class, str);
        }

        public final boolean isPacked() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("89b9d1cd", new Object[]{this})).booleanValue();
            }
            if (this == PACKED) {
                return true;
            }
            return false;
        }

        public final boolean isRepeated() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("63ab694f", new Object[]{this})).booleanValue();
            }
            if (this == REPEATED || this == PACKED) {
                return true;
            }
            return false;
        }

        public final int value() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("d249f56b", new Object[]{this})).intValue();
            }
            return this.value;
        }
    }

    public Message(Message message) {
        UnknownFieldMap unknownFieldMap;
        if (message != null && (unknownFieldMap = message.f3688a) != null) {
            this.f3688a = new UnknownFieldMap(unknownFieldMap);
        }
    }

    public static /* synthetic */ UnknownFieldMap access$000(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UnknownFieldMap) ipChange.ipc$dispatch("eb0450c2", new Object[]{message});
        }
        return message.f3688a;
    }

    public static /* synthetic */ Wire access$100() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Wire) ipChange.ipc$dispatch("b37ad0b", new Object[0]);
        }
        return d;
    }

    public static <T> List<T> copyOf(List<T> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("258a5023", new Object[]{list});
        }
        if (list == null) {
            return null;
        }
        return new ArrayList(list);
    }

    public static <E extends Enum & ProtoEnum> E enumFromInt(Class<E> cls, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (E) ((Enum) ipChange.ipc$dispatch("c31c9e3f", new Object[]{cls, new Integer(i)}));
        }
        return (E) ((Enum) d.enumAdapter(cls).fromInt(i));
    }

    public static <T> List<T> immutableCopyOf(List<T> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("abe9f0c1", new Object[]{list});
        }
        if (list == null) {
            return Collections.emptyList();
        }
        if (list instanceof MessageAdapter.ImmutableList) {
            return list;
        }
        return Collections.unmodifiableList(new ArrayList(list));
    }

    public static <E extends Enum & ProtoEnum> int intFromEnum(E e) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d62d9dee", new Object[]{e})).intValue();
        }
        return d.enumAdapter(e.getClass()).toInt(e);
    }

    public void addFixed32(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9adf1a99", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        try {
            ensureUnknownFieldMap().addFixed32(i, Integer.valueOf(i2));
        } catch (IOException e) {
            throw new IllegalArgumentException(e.getMessage());
        }
    }

    public void addFixed64(int i, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c4f1b79", new Object[]{this, new Integer(i), new Long(j)});
            return;
        }
        try {
            ensureUnknownFieldMap().addFixed64(i, Long.valueOf(j));
        } catch (IOException e) {
            throw new IllegalArgumentException(e.getMessage());
        }
    }

    public void addLengthDelimited(int i, ByteString byteString) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38cfd840", new Object[]{this, new Integer(i), byteString});
            return;
        }
        try {
            ensureUnknownFieldMap().addLengthDelimited(i, byteString);
        } catch (IOException e) {
            throw new IllegalArgumentException(e.getMessage());
        }
    }

    public void addVarint(int i, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6f8c391", new Object[]{this, new Integer(i), new Long(j)});
            return;
        }
        try {
            ensureUnknownFieldMap().addVarint(i, Long.valueOf(j));
        } catch (IOException e) {
            throw new IllegalArgumentException(e.getMessage());
        }
    }

    public void checkAvailability() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42628d8a", new Object[]{this});
            return;
        }
        AvailabilityChecker availabilityChecker = d.availabilityChecker(getClass());
        availabilityChecker.checkRequiredFields(this);
        availabilityChecker.checkForNulls(this);
    }

    public UnknownFieldMap ensureUnknownFieldMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UnknownFieldMap) ipChange.ipc$dispatch("a95958d7", new Object[]{this});
        }
        if (this.f3688a == null) {
            this.f3688a = new UnknownFieldMap();
        }
        return this.f3688a;
    }

    public boolean equals(Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("7b37c282", new Object[]{this, obj, obj2})).booleanValue() : obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public int getSerializedSize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("54fff395", new Object[]{this})).intValue();
        }
        if (!this.b) {
            this.c = d.messageAdapter(getClass()).getSerializedSize(this);
            this.b = true;
        }
        return this.c;
    }

    public int getUnknownFieldsSerializedSize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b899006c", new Object[]{this})).intValue();
        }
        UnknownFieldMap unknownFieldMap = this.f3688a;
        if (unknownFieldMap == null) {
            return 0;
        }
        return unknownFieldMap.getSerializedSize();
    }

    public void setBuilder(Builder builder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac6cee40", new Object[]{this, builder});
            return;
        }
        UnknownFieldMap unknownFieldMap = builder.unknownFieldMap;
        if (unknownFieldMap != null) {
            this.f3688a = new UnknownFieldMap(unknownFieldMap);
        }
    }

    public byte[] toByteArray() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("89c82500", new Object[]{this});
        }
        checkAvailability();
        return d.messageAdapter(getClass()).toByteArray(this);
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return d.messageAdapter(getClass()).toString(this);
    }

    public Collection<List<UnknownFieldMap.FieldValue>> unknownFields() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Collection) ipChange.ipc$dispatch("a7c4385d", new Object[]{this});
        }
        UnknownFieldMap unknownFieldMap = this.f3688a;
        if (unknownFieldMap == null) {
            return Collections.emptySet();
        }
        return unknownFieldMap.fieldMap.values();
    }

    public void writeTo(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4ab66c8", new Object[]{this, bArr});
            return;
        }
        checkAvailability();
        writeTo(bArr, 0, bArr.length);
    }

    public void writeUnknownFieldMap(WireOutput wireOutput) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e17b1400", new Object[]{this, wireOutput});
            return;
        }
        UnknownFieldMap unknownFieldMap = this.f3688a;
        if (unknownFieldMap != null) {
            unknownFieldMap.write(wireOutput);
        }
    }

    public boolean equals(List<?> list, List<?> list2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6fe48cac", new Object[]{this, list, list2})).booleanValue();
        }
        if (list != null && list.isEmpty()) {
            list = null;
        }
        if (list2 != null && list2.isEmpty()) {
            list2 = null;
        }
        return list == list2 || (list != null && list.equals(list2));
    }

    public void writeTo(byte[] bArr, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("677b3528", new Object[]{this, bArr, new Integer(i), new Integer(i2)});
            return;
        }
        checkAvailability();
        try {
            d.messageAdapter(getClass()).write(this, WireOutput.newInstance(bArr, i, i2));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public Message() {
    }
}
