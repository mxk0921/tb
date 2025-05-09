package com.alipay.android.msp.framework.wire;

import com.alipay.android.msp.framework.okio.ByteString;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class UnknownFieldMap {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public Map<Integer, List<FieldValue>> fieldMap;

    /* compiled from: Taobao */
    /* renamed from: com.alipay.android.msp.framework.wire.UnknownFieldMap$1  reason: invalid class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static /* synthetic */ class AnonymousClass1 {
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
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static abstract class FieldValue {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final int f3693a;
        public final WireType b;

        public FieldValue(int i, WireType wireType) {
            this.f3693a = i;
            this.b = wireType;
        }

        public static Fixed32FieldValue fixed32(int i, Integer num) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Fixed32FieldValue) ipChange.ipc$dispatch("e9864f2a", new Object[]{new Integer(i), num});
            }
            return new Fixed32FieldValue(i, num);
        }

        public static Fixed64FieldValue fixed64(int i, Long l) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Fixed64FieldValue) ipChange.ipc$dispatch("34737ea6", new Object[]{new Integer(i), l});
            }
            return new Fixed64FieldValue(i, l);
        }

        public static LengthDelimitedFieldValue lengthDelimited(int i, ByteString byteString) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (LengthDelimitedFieldValue) ipChange.ipc$dispatch("f4647e1b", new Object[]{new Integer(i), byteString});
            }
            return new LengthDelimitedFieldValue(i, byteString);
        }

        public static VarintFieldValue varint(int i, Long l) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (VarintFieldValue) ipChange.ipc$dispatch("141b33fe", new Object[]{new Integer(i), l});
            }
            return new VarintFieldValue(i, l);
        }

        public ByteString getAsBytes() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ByteString) ipChange.ipc$dispatch("fe8373e2", new Object[]{this});
            }
            throw new IllegalStateException();
        }

        public Integer getAsInteger() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Integer) ipChange.ipc$dispatch("14baf564", new Object[]{this});
            }
            throw new IllegalStateException();
        }

        public Long getAsLong() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Long) ipChange.ipc$dispatch("1876166a", new Object[]{this});
            }
            throw new IllegalStateException();
        }

        public abstract int getSerializedSize();

        public int getTag() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("e16722de", new Object[]{this})).intValue();
            }
            return this.f3693a;
        }

        public WireType getWireType() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (WireType) ipChange.ipc$dispatch("2db53a4d", new Object[]{this});
            }
            return this.b;
        }

        public abstract void write(int i, WireOutput wireOutput) throws IOException;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class Fixed32FieldValue extends FieldValue {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final Integer c;

        public Fixed32FieldValue(int i, Integer num) {
            super(i, WireType.FIXED32);
            this.c = num;
        }

        public static /* synthetic */ Object ipc$super(Fixed32FieldValue fixed32FieldValue, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/android/msp/framework/wire/UnknownFieldMap$Fixed32FieldValue");
        }

        @Override // com.alipay.android.msp.framework.wire.UnknownFieldMap.FieldValue
        public final Integer getAsInteger() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Integer) ipChange.ipc$dispatch("14baf564", new Object[]{this});
            }
            return this.c;
        }

        @Override // com.alipay.android.msp.framework.wire.UnknownFieldMap.FieldValue
        public final int getSerializedSize() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("54fff395", new Object[]{this})).intValue();
            }
            return 4;
        }

        @Override // com.alipay.android.msp.framework.wire.UnknownFieldMap.FieldValue
        public final void write(int i, WireOutput wireOutput) throws IOException {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("70b3b609", new Object[]{this, new Integer(i), wireOutput});
                return;
            }
            wireOutput.writeTag(i, WireType.FIXED32);
            wireOutput.writeFixed32(this.c.intValue());
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class Fixed64FieldValue extends FieldValue {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final Long c;

        public Fixed64FieldValue(int i, Long l) {
            super(i, WireType.FIXED64);
            this.c = l;
        }

        public static /* synthetic */ Object ipc$super(Fixed64FieldValue fixed64FieldValue, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/android/msp/framework/wire/UnknownFieldMap$Fixed64FieldValue");
        }

        @Override // com.alipay.android.msp.framework.wire.UnknownFieldMap.FieldValue
        public final Long getAsLong() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Long) ipChange.ipc$dispatch("1876166a", new Object[]{this});
            }
            return this.c;
        }

        @Override // com.alipay.android.msp.framework.wire.UnknownFieldMap.FieldValue
        public final int getSerializedSize() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("54fff395", new Object[]{this})).intValue();
            }
            return 8;
        }

        @Override // com.alipay.android.msp.framework.wire.UnknownFieldMap.FieldValue
        public final void write(int i, WireOutput wireOutput) throws IOException {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("70b3b609", new Object[]{this, new Integer(i), wireOutput});
                return;
            }
            wireOutput.writeTag(i, WireType.FIXED64);
            wireOutput.writeFixed64(this.c.longValue());
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class LengthDelimitedFieldValue extends FieldValue {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final ByteString c;

        public LengthDelimitedFieldValue(int i, ByteString byteString) {
            super(i, WireType.LENGTH_DELIMITED);
            this.c = byteString;
        }

        public static /* synthetic */ Object ipc$super(LengthDelimitedFieldValue lengthDelimitedFieldValue, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/android/msp/framework/wire/UnknownFieldMap$LengthDelimitedFieldValue");
        }

        @Override // com.alipay.android.msp.framework.wire.UnknownFieldMap.FieldValue
        public final ByteString getAsBytes() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ByteString) ipChange.ipc$dispatch("fe8373e2", new Object[]{this});
            }
            return this.c;
        }

        @Override // com.alipay.android.msp.framework.wire.UnknownFieldMap.FieldValue
        public final int getSerializedSize() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("54fff395", new Object[]{this})).intValue();
            }
            return WireOutput.varint32Size(this.c.size()) + this.c.size();
        }

        @Override // com.alipay.android.msp.framework.wire.UnknownFieldMap.FieldValue
        public final void write(int i, WireOutput wireOutput) throws IOException {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("70b3b609", new Object[]{this, new Integer(i), wireOutput});
                return;
            }
            wireOutput.writeTag(i, WireType.LENGTH_DELIMITED);
            wireOutput.writeVarint32(this.c.size());
            wireOutput.writeRawBytes(this.c.toByteArray());
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public enum UnknownFieldType {
        VARINT,
        FIXED32,
        FIXED64,
        LENGTH_DELIMITED;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(UnknownFieldType unknownFieldType, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/android/msp/framework/wire/UnknownFieldMap$UnknownFieldType");
        }

        public static UnknownFieldType of(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (UnknownFieldType) ipChange.ipc$dispatch("fc83ebbe", new Object[]{str});
            }
            if ("varint".equals(str)) {
                return VARINT;
            }
            if ("fixed32".equals(str)) {
                return FIXED32;
            }
            if ("fixed64".equals(str)) {
                return FIXED64;
            }
            if ("length-delimited".equals(str)) {
                return LENGTH_DELIMITED;
            }
            throw new IllegalArgumentException("Unknown type ".concat(String.valueOf(str)));
        }

        public static UnknownFieldType valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (UnknownFieldType) ipChange.ipc$dispatch("130e6c0d", new Object[]{str});
            }
            return (UnknownFieldType) Enum.valueOf(UnknownFieldType.class, str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class VarintFieldValue extends FieldValue {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final Long c;

        public VarintFieldValue(int i, Long l) {
            super(i, WireType.VARINT);
            this.c = l;
        }

        public static /* synthetic */ Object ipc$super(VarintFieldValue varintFieldValue, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/android/msp/framework/wire/UnknownFieldMap$VarintFieldValue");
        }

        @Override // com.alipay.android.msp.framework.wire.UnknownFieldMap.FieldValue
        public final Long getAsLong() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Long) ipChange.ipc$dispatch("1876166a", new Object[]{this});
            }
            return this.c;
        }

        @Override // com.alipay.android.msp.framework.wire.UnknownFieldMap.FieldValue
        public final int getSerializedSize() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("54fff395", new Object[]{this})).intValue();
            }
            return WireOutput.varint64Size(this.c.longValue());
        }

        @Override // com.alipay.android.msp.framework.wire.UnknownFieldMap.FieldValue
        public final void write(int i, WireOutput wireOutput) throws IOException {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("70b3b609", new Object[]{this, new Integer(i), wireOutput});
                return;
            }
            wireOutput.writeTag(i, WireType.VARINT);
            wireOutput.writeVarint64(this.c.longValue());
        }
    }

    public UnknownFieldMap() {
    }

    public static <T> void b(Map<Integer, List<FieldValue>> map, int i, T t, WireType wireType) throws IOException {
        FieldValue fieldValue;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("641f7fb5", new Object[]{map, new Integer(i), t, wireType});
            return;
        }
        List<FieldValue> list = map.get(Integer.valueOf(i));
        if (list == null) {
            list = new ArrayList<>();
            map.put(Integer.valueOf(i), list);
        }
        int i2 = AnonymousClass1.$SwitchMap$com$alipay$android$msp$framework$wire$WireType[wireType.ordinal()];
        if (i2 == 1) {
            fieldValue = FieldValue.varint(i, (Long) t);
        } else if (i2 == 2) {
            fieldValue = FieldValue.fixed32(i, (Integer) t);
        } else if (i2 == 3) {
            fieldValue = FieldValue.fixed64(i, (Long) t);
        } else if (i2 == 4) {
            fieldValue = FieldValue.lengthDelimited(i, (ByteString) t);
        } else {
            throw new IllegalArgumentException("Unsupported wireType = ".concat(String.valueOf(wireType)));
        }
        if (list.size() <= 0 || list.get(0).getWireType() == fieldValue.getWireType()) {
            list.add(fieldValue);
            return;
        }
        WireType wireType2 = fieldValue.getWireType();
        WireType wireType3 = list.get(0).getWireType();
        throw new IOException("Wire type " + wireType2 + " differs from previous type " + wireType3 + " for tag " + i);
    }

    public final Map<Integer, List<FieldValue>> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("60c3500f", new Object[]{this});
        }
        if (this.fieldMap == null) {
            this.fieldMap = new TreeMap();
        }
        return this.fieldMap;
    }

    public final void addFixed32(int i, Integer num) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4893c88d", new Object[]{this, new Integer(i), num});
        } else {
            b(a(), i, num, WireType.FIXED32);
        }
    }

    public final void addFixed64(int i, Long l) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ef6f2ea", new Object[]{this, new Integer(i), l});
        } else {
            b(a(), i, l, WireType.FIXED64);
        }
    }

    public final void addLengthDelimited(int i, ByteString byteString) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38cfd840", new Object[]{this, new Integer(i), byteString});
        } else {
            b(a(), i, byteString, WireType.LENGTH_DELIMITED);
        }
    }

    public final void addVarint(int i, Long l) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c7517d2", new Object[]{this, new Integer(i), l});
        } else {
            b(a(), i, l, WireType.VARINT);
        }
    }

    public final int getSerializedSize() {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("54fff395", new Object[]{this})).intValue();
        }
        Map<Integer, List<FieldValue>> map = this.fieldMap;
        if (map != null) {
            for (Map.Entry<Integer, List<FieldValue>> entry : map.entrySet()) {
                for (FieldValue fieldValue : entry.getValue()) {
                    i = i + WireOutput.varintTagSize(entry.getKey().intValue()) + fieldValue.getSerializedSize();
                }
            }
        }
        return i;
    }

    public final void write(WireOutput wireOutput) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aad7dbd2", new Object[]{this, wireOutput});
            return;
        }
        Map<Integer, List<FieldValue>> map = this.fieldMap;
        if (map != null) {
            for (Map.Entry<Integer, List<FieldValue>> entry : map.entrySet()) {
                int intValue = entry.getKey().intValue();
                for (FieldValue fieldValue : entry.getValue()) {
                    fieldValue.write(intValue, wireOutput);
                }
            }
        }
    }

    public UnknownFieldMap(UnknownFieldMap unknownFieldMap) {
        if (unknownFieldMap.fieldMap != null) {
            a().putAll(unknownFieldMap.fieldMap);
        }
    }
}
