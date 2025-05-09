package kotlin.uuid;

import com.alipay.android.msp.framework.dynfun.TplMsg;
import java.io.Serializable;
import java.util.Comparator;
import kotlin.Metadata;
import kotlin.uuid.Uuid;
import tb.a07;
import tb.ckf;
import tb.kwu;
import tb.tsq;
import tb.u1a;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0007\u0018\u0000 )2\u00060\u0001j\u0002`\u0002:\u0001*B\u0019\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J^\u0010\r\u001a\u00028\u0000\"\u0004\b\u0000\u0010\b26\u0010\f\u001a2\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0004\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00028\u00000\tH\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b\r\u0010\u000eJ^\u0010\u0010\u001a\u00028\u0000\"\u0004\b\u0000\u0010\b26\u0010\f\u001a2\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0004\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00028\u00000\tH\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b\u0010\u0010\u000eJ\u000f\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u0014¢\u0006\u0004\b\u0017\u0010\u0016J\r\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0011H\u0096\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b \u0010!R \u0010\u0004\u001a\u00020\u00038\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010\"\u0012\u0004\b%\u0010&\u001a\u0004\b#\u0010$R \u0010\u0005\u001a\u00020\u00038\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\"\u0012\u0004\b(\u0010&\u001a\u0004\b'\u0010$\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006+"}, d2 = {"Lkotlin/uuid/Uuid;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "mostSignificantBits", "leastSignificantBits", "<init>", "(JJ)V", "T", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "action", "toLongs", "(Ltb/u1a;)Ljava/lang/Object;", "Ltb/kwu;", "toULongs", "", "writeReplace", "()Ljava/lang/Object;", "", "toString", "()Ljava/lang/String;", "toHexString", "", "toByteArray", "()[B", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "J", "getMostSignificantBits", "()J", "getMostSignificantBits$annotations", "()V", "getLeastSignificantBits", "getLeastSignificantBits$annotations", "Companion", "a", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class Uuid implements Serializable {
    public static final int SIZE_BITS = 128;
    public static final int SIZE_BYTES = 16;
    private final long leastSignificantBits;
    private final long mostSignificantBits;
    public static final a Companion = new a(null);
    private static final Uuid NIL = new Uuid(0, 0);
    private static final Comparator<Uuid> LEXICAL_ORDER = new Comparator() { // from class: tb.gzv
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int LEXICAL_ORDER$lambda$0;
            LEXICAL_ORDER$lambda$0 = Uuid.LEXICAL_ORDER$lambda$0((Uuid) obj, (Uuid) obj2);
            return LEXICAL_ORDER$lambda$0;
        }
    };

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static final class a {
        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public final Uuid a(long j, long j2) {
            if (j == 0 && j2 == 0) {
                return b();
            }
            return new Uuid(j, j2);
        }

        public final Uuid b() {
            return Uuid.NIL;
        }

        public a() {
        }
    }

    public Uuid(long j, long j2) {
        this.mostSignificantBits = j;
        this.leastSignificantBits = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int LEXICAL_ORDER$lambda$0(Uuid uuid, Uuid uuid2) {
        int compare;
        int compare2;
        ckf.g(uuid, "a");
        ckf.g(uuid2, TplMsg.VALUE_T_NATIVE_RETURN);
        long j = uuid.mostSignificantBits;
        long j2 = uuid2.mostSignificantBits;
        if (j != j2) {
            compare2 = Long.compare(j ^ Long.MIN_VALUE, j2 ^ Long.MIN_VALUE);
            return compare2;
        }
        compare = Long.compare(uuid.leastSignificantBits ^ Long.MIN_VALUE, uuid2.leastSignificantBits ^ Long.MIN_VALUE);
        return compare;
    }

    private final <T> T toLongs(u1a<? super Long, ? super Long, ? extends T> u1aVar) {
        ckf.g(u1aVar, "action");
        return (T) u1aVar.invoke(Long.valueOf(getMostSignificantBits()), Long.valueOf(getLeastSignificantBits()));
    }

    private final <T> T toULongs(u1a<? super kwu, ? super kwu, ? extends T> u1aVar) {
        ckf.g(u1aVar, "action");
        return (T) u1aVar.invoke(kwu.b(getMostSignificantBits()), kwu.b(getLeastSignificantBits()));
    }

    private final Object writeReplace() {
        return kotlin.uuid.a.a(this);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Uuid)) {
            return false;
        }
        Uuid uuid = (Uuid) obj;
        if (this.mostSignificantBits == uuid.mostSignificantBits && this.leastSignificantBits == uuid.leastSignificantBits) {
            return true;
        }
        return false;
    }

    public final long getLeastSignificantBits() {
        return this.leastSignificantBits;
    }

    public final long getMostSignificantBits() {
        return this.mostSignificantBits;
    }

    public int hashCode() {
        long j = this.mostSignificantBits ^ this.leastSignificantBits;
        return ((int) (j >> 32)) ^ ((int) j);
    }

    public final byte[] toByteArray() {
        byte[] bArr = new byte[16];
        b.c(this.mostSignificantBits, bArr, 0);
        b.c(this.leastSignificantBits, bArr, 8);
        return bArr;
    }

    public final String toHexString() {
        byte[] bArr = new byte[32];
        b.b(this.leastSignificantBits, bArr, 16, 8);
        b.b(this.mostSignificantBits, bArr, 0, 8);
        return tsq.t(bArr);
    }

    public String toString() {
        byte[] bArr = new byte[36];
        b.b(this.leastSignificantBits, bArr, 24, 6);
        bArr[23] = 45;
        b.b(this.leastSignificantBits >>> 48, bArr, 19, 2);
        bArr[18] = 45;
        b.b(this.mostSignificantBits, bArr, 14, 2);
        bArr[13] = 45;
        b.b(this.mostSignificantBits >>> 16, bArr, 9, 2);
        bArr[8] = 45;
        b.b(this.mostSignificantBits >>> 32, bArr, 0, 4);
        return tsq.t(bArr);
    }

    public static /* synthetic */ void getLeastSignificantBits$annotations() {
    }

    public static /* synthetic */ void getMostSignificantBits$annotations() {
    }
}
