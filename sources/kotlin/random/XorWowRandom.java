package kotlin.random;

import com.alipay.mobile.common.transportext.amnet.AmnetConstant;
import com.taobao.search.sf.util.tlog.TLogTracker;
import java.io.Serializable;
import kotlin.Metadata;
import tb.a07;
import tb.uen;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0014\b\u0000\u0018\u0000 \u00162\u00020\u00012\u00060\u0002j\u0002`\u0003:\u0001\u0017B9\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fB\u0019\b\u0010\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\u0006\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0015R\u0016\u0010\u0006\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0015R\u0016\u0010\u0007\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u0015R\u0016\u0010\b\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u0015R\u0016\u0010\t\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u0015R\u0016\u0010\n\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u0015¨\u0006\u0018"}, d2 = {"Lkotlin/random/XorWowRandom;", "Lkotlin/random/Random;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "x", "y", AmnetConstant.VAL_SUPPORT_ZSTD, "w", "v", "addend", "<init>", "(IIIIII)V", "seed1", "seed2", "(II)V", "nextInt", "()I", "bitCount", "nextBits", "(I)I", TLogTracker.LEVEL_INFO, "Companion", "a", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public final class XorWowRandom extends Random implements Serializable {
    private static final a Companion = new a(null);
    private static final long serialVersionUID = 0;
    private int addend;
    private int v;
    private int w;
    private int x;
    private int y;
    private int z;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static final class a {
        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    public XorWowRandom(int i, int i2, int i3, int i4, int i5, int i6) {
        this.x = i;
        this.y = i2;
        this.z = i3;
        this.w = i4;
        this.v = i5;
        this.addend = i6;
        if ((i | i2 | i3 | i4 | i5) != 0) {
            for (int i7 = 0; i7 < 64; i7++) {
                nextInt();
            }
            return;
        }
        throw new IllegalArgumentException("Initial state must have at least one non-zero element.");
    }

    @Override // kotlin.random.Random
    public int nextBits(int i) {
        return uen.g(nextInt(), i);
    }

    @Override // kotlin.random.Random
    public int nextInt() {
        int i = this.x;
        int i2 = i ^ (i >>> 2);
        this.x = this.y;
        this.y = this.z;
        this.z = this.w;
        int i3 = this.v;
        this.w = i3;
        int i4 = ((i2 ^ (i2 << 1)) ^ i3) ^ (i3 << 4);
        this.v = i4;
        int i5 = this.addend + 362437;
        this.addend = i5;
        return i4 + i5;
    }

    public XorWowRandom(int i, int i2) {
        this(i, i2, 0, 0, ~i, (i << 10) ^ (i2 >>> 4));
    }
}
