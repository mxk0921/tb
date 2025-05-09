package com.squareup.wire;

import com.squareup.wire.MessageAdapter;
import com.squareup.wire.UnknownFieldMap;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import okio.ByteString;
import tb.jix;
import tb.k1n;
import tb.pg1;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public abstract class Message {
    private static final c WIRE = new c(new Class[0]);
    private transient int cachedSerializedSize;
    protected transient int hashCode = 0;
    private transient boolean haveCachedSerializedSize;
    private transient UnknownFieldMap unknownFields;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
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
        
        public static final Comparator<Datatype> ORDER_BY_NAME = new a();
        private static final Map<String, Datatype> TYPES_BY_NAME;
        private final int value;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
        public static class a implements Comparator<Datatype> {
            /* renamed from: a */
            public int compare(Datatype datatype, Datatype datatype2) {
                return datatype.name().compareTo(datatype2.name());
            }
        }

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

        public static Datatype of(String str) {
            return TYPES_BY_NAME.get(str);
        }

        public int value() {
            return this.value;
        }

        public WireType wireType() {
            switch (a.f5985a[ordinal()]) {
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
                    throw new AssertionError("No wiretype for datatype " + this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public enum Label {
        REQUIRED(32),
        OPTIONAL(64),
        REPEATED(128),
        PACKED(256);
        
        public static final Comparator<Label> ORDER_BY_NAME = new a();
        private final int value;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
        public static class a implements Comparator<Label> {
            /* renamed from: a */
            public int compare(Label label, Label label2) {
                return label.name().compareTo(label2.name());
            }
        }

        Label(int i) {
            this.value = i;
        }

        public boolean isPacked() {
            if (this == PACKED) {
                return true;
            }
            return false;
        }

        public boolean isRepeated() {
            if (this == REPEATED || this == PACKED) {
                return true;
            }
            return false;
        }

        public int value() {
            return this.value;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f5985a;

        static {
            int[] iArr = new int[Datatype.values().length];
            f5985a = iArr;
            try {
                iArr[Datatype.INT32.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f5985a[Datatype.INT64.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f5985a[Datatype.UINT32.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f5985a[Datatype.UINT64.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f5985a[Datatype.SINT32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f5985a[Datatype.SINT64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f5985a[Datatype.BOOL.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f5985a[Datatype.ENUM.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f5985a[Datatype.FIXED32.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f5985a[Datatype.SFIXED32.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f5985a[Datatype.FLOAT.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f5985a[Datatype.FIXED64.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f5985a[Datatype.SFIXED64.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f5985a[Datatype.DOUBLE.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f5985a[Datatype.STRING.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f5985a[Datatype.BYTES.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f5985a[Datatype.MESSAGE.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static abstract class b<T extends Message> {
    }

    public Message(Message message) {
        UnknownFieldMap unknownFieldMap;
        if (message != null && (unknownFieldMap = message.unknownFields) != null) {
            this.unknownFields = new UnknownFieldMap(unknownFieldMap);
        }
    }

    public static <T> List<T> copyOf(List<T> list) {
        if (list == null) {
            return null;
        }
        return new ArrayList(list);
    }

    public static <E extends Enum & k1n> E enumFromInt(Class<E> cls, int i) {
        return (E) ((Enum) WIRE.b(cls).a(i));
    }

    public static <T> List<T> immutableCopyOf(List<T> list) {
        if (list == null) {
            return Collections.emptyList();
        }
        if (list instanceof MessageAdapter.ImmutableList) {
            return list;
        }
        return Collections.unmodifiableList(new ArrayList(list));
    }

    public static <E extends Enum & k1n> int intFromEnum(E e) {
        return WIRE.b(e.getClass()).b(e);
    }

    private void write(jix jixVar) {
        try {
            WIRE.c(getClass()).B(this, jixVar);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void addFixed32(int i, int i2) {
        try {
            ensureUnknownFieldMap().b(i, Integer.valueOf(i2));
        } catch (IOException e) {
            throw new IllegalArgumentException(e.getMessage());
        }
    }

    public void addFixed64(int i, long j) {
        try {
            ensureUnknownFieldMap().c(i, Long.valueOf(j));
        } catch (IOException e) {
            throw new IllegalArgumentException(e.getMessage());
        }
    }

    public void addLengthDelimited(int i, ByteString byteString) {
        try {
            ensureUnknownFieldMap().d(i, byteString);
        } catch (IOException e) {
            throw new IllegalArgumentException(e.getMessage());
        }
    }

    public void addVarint(int i, long j) {
        try {
            ensureUnknownFieldMap().e(i, Long.valueOf(j));
        } catch (IOException e) {
            throw new IllegalArgumentException(e.getMessage());
        }
    }

    public void checkAvailability() {
        com.squareup.wire.a a2 = WIRE.a(getClass());
        a2.b(this);
        a2.a(this);
    }

    public UnknownFieldMap ensureUnknownFieldMap() {
        if (this.unknownFields == null) {
            this.unknownFields = new UnknownFieldMap();
        }
        return this.unknownFields;
    }

    public boolean equals(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public int getSerializedSize() {
        if (!this.haveCachedSerializedSize) {
            this.cachedSerializedSize = WIRE.c(getClass()).q(this);
            this.haveCachedSerializedSize = true;
        }
        return this.cachedSerializedSize;
    }

    public int getUnknownFieldsSerializedSize() {
        UnknownFieldMap unknownFieldMap = this.unknownFields;
        if (unknownFieldMap == null) {
            return 0;
        }
        return unknownFieldMap.g();
    }

    public void invalidCachedSerializedSize() {
        this.haveCachedSerializedSize = false;
    }

    public void setBuilder(b bVar) {
        throw null;
    }

    public byte[] toByteArray() {
        checkAvailability();
        return WIRE.c(getClass()).y(this);
    }

    public String toString() {
        return WIRE.c(getClass()).z(this);
    }

    public Collection<List<UnknownFieldMap.b>> unknownFields() {
        UnknownFieldMap unknownFieldMap = this.unknownFields;
        if (unknownFieldMap == null) {
            return Collections.emptySet();
        }
        return ((TreeMap) unknownFieldMap.f5990a).values();
    }

    public void writeTo(byte[] bArr) {
        checkAvailability();
        writeTo(bArr, 0, bArr.length);
    }

    public void writeUnknownFieldMap(jix jixVar) throws IOException {
        UnknownFieldMap unknownFieldMap = this.unknownFields;
        if (unknownFieldMap != null) {
            unknownFieldMap.h(jixVar);
        }
    }

    public boolean equals(List<?> list, List<?> list2) {
        if (list != null && list.isEmpty()) {
            list = null;
        }
        if (list2 != null && list2.isEmpty()) {
            list2 = null;
        }
        return list == list2 || (list != null && list.equals(list2));
    }

    public void writeTo(byte[] bArr, int i, int i2) {
        checkAvailability();
        write(jix.d(bArr, i, i2));
    }

    public Message() {
    }
}
