package com.squareup.wire;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import okio.ByteString;
import tb.jix;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class UnknownFieldMap {

    /* renamed from: a  reason: collision with root package name */
    public Map<Integer, List<b>> f5990a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public enum UnknownFieldType {
        VARINT,
        FIXED32,
        FIXED64,
        LENGTH_DELIMITED;

        public static UnknownFieldType of(String str) {
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
            throw new IllegalArgumentException("Unknown type " + str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f5991a;

        static {
            int[] iArr = new int[WireType.values().length];
            f5991a = iArr;
            try {
                iArr[WireType.VARINT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f5991a[WireType.FIXED32.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f5991a[WireType.FIXED64.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f5991a[WireType.LENGTH_DELIMITED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static abstract class b {

        /* renamed from: a  reason: collision with root package name */
        public final WireType f5992a;

        public b(int i, WireType wireType) {
            this.f5992a = wireType;
        }

        public static c a(int i, Integer num) {
            return new c(i, num);
        }

        public static d b(int i, Long l) {
            return new d(i, l);
        }

        public static e e(int i, ByteString byteString) {
            return new e(i, byteString);
        }

        public static f f(int i, Long l) {
            return new f(i, l);
        }

        public abstract int c();

        public WireType d() {
            return this.f5992a;
        }

        public abstract void g(int i, jix jixVar) throws IOException;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class c extends b {
        public final Integer b;

        public c(int i, Integer num) {
            super(i, WireType.FIXED32);
            this.b = num;
        }

        @Override // com.squareup.wire.UnknownFieldMap.b
        public int c() {
            return 4;
        }

        @Override // com.squareup.wire.UnknownFieldMap.b
        public void g(int i, jix jixVar) throws IOException {
            jixVar.o(i, WireType.FIXED32);
            jixVar.h(this.b.intValue());
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class d extends b {
        public final Long b;

        public d(int i, Long l) {
            super(i, WireType.FIXED64);
            this.b = l;
        }

        @Override // com.squareup.wire.UnknownFieldMap.b
        public int c() {
            return 8;
        }

        @Override // com.squareup.wire.UnknownFieldMap.b
        public void g(int i, jix jixVar) throws IOException {
            jixVar.o(i, WireType.FIXED64);
            jixVar.i(this.b.longValue());
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class e extends b {
        public final ByteString b;

        public e(int i, ByteString byteString) {
            super(i, WireType.LENGTH_DELIMITED);
            this.b = byteString;
        }

        @Override // com.squareup.wire.UnknownFieldMap.b
        public int c() {
            ByteString byteString = this.b;
            return jix.e(byteString.size()) + byteString.size();
        }

        @Override // com.squareup.wire.UnknownFieldMap.b
        public void g(int i, jix jixVar) throws IOException {
            jixVar.o(i, WireType.LENGTH_DELIMITED);
            ByteString byteString = this.b;
            jixVar.p(byteString.size());
            jixVar.l(byteString.toByteArray());
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class f extends b {
        public final Long b;

        public f(int i, Long l) {
            super(i, WireType.VARINT);
            this.b = l;
        }

        @Override // com.squareup.wire.UnknownFieldMap.b
        public int c() {
            return jix.f(this.b.longValue());
        }

        @Override // com.squareup.wire.UnknownFieldMap.b
        public void g(int i, jix jixVar) throws IOException {
            jixVar.o(i, WireType.VARINT);
            jixVar.q(this.b.longValue());
        }
    }

    public UnknownFieldMap() {
    }

    public final <T> void a(Map<Integer, List<b>> map, int i, T t, WireType wireType) throws IOException {
        b bVar;
        List<b> list = map.get(Integer.valueOf(i));
        if (list == null) {
            list = new ArrayList<>();
            map.put(Integer.valueOf(i), list);
        }
        int i2 = a.f5991a[wireType.ordinal()];
        if (i2 == 1) {
            bVar = b.f(i, (Long) t);
        } else if (i2 == 2) {
            bVar = b.a(i, (Integer) t);
        } else if (i2 == 3) {
            bVar = b.b(i, (Long) t);
        } else if (i2 == 4) {
            bVar = b.e(i, (ByteString) t);
        } else {
            throw new IllegalArgumentException("Unsupported wireType = " + wireType);
        }
        if (list.size() <= 0 || list.get(0).d() == bVar.d()) {
            list.add(bVar);
            return;
        }
        WireType d2 = bVar.d();
        WireType d3 = list.get(0).d();
        throw new IOException("Wire type " + d2 + " differs from previous type " + d3 + " for tag " + i);
    }

    public void b(int i, Integer num) throws IOException {
        a(f(), i, num, WireType.FIXED32);
    }

    public void c(int i, Long l) throws IOException {
        a(f(), i, l, WireType.FIXED64);
    }

    public void d(int i, ByteString byteString) throws IOException {
        a(f(), i, byteString, WireType.LENGTH_DELIMITED);
    }

    public void e(int i, Long l) throws IOException {
        a(f(), i, l, WireType.VARINT);
    }

    public final Map<Integer, List<b>> f() {
        if (this.f5990a == null) {
            this.f5990a = new TreeMap();
        }
        return this.f5990a;
    }

    public int g() {
        Map<Integer, List<b>> map = this.f5990a;
        int i = 0;
        if (map != null) {
            for (Map.Entry entry : ((TreeMap) map).entrySet()) {
                for (b bVar : (List) entry.getValue()) {
                    i = i + jix.g(((Integer) entry.getKey()).intValue()) + bVar.c();
                }
            }
        }
        return i;
    }

    public void h(jix jixVar) throws IOException {
        Map<Integer, List<b>> map = this.f5990a;
        if (map != null) {
            for (Map.Entry entry : ((TreeMap) map).entrySet()) {
                int intValue = ((Integer) entry.getKey()).intValue();
                for (b bVar : (List) entry.getValue()) {
                    bVar.g(intValue, jixVar);
                }
            }
        }
    }

    public UnknownFieldMap(UnknownFieldMap unknownFieldMap) {
        if (unknownFieldMap.f5990a != null) {
            f().putAll(unknownFieldMap.f5990a);
        }
    }
}
