package tb;

import android.graphics.Bitmap;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.LinkedList;
import java.util.List;
import java.util.NavigableMap;
import java.util.TreeMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class sie extends i6b<String, bu2> implements xc2 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int CEILING_SIZE_MAX_MULTIPLE = 6;
    public static final String TAG = "ImageCachePool";
    public static final String TAG_POOL = "BitmapPool";
    public static final String TAG_RECYCLE = "ImageRecycle";
    public int p;
    public int q;
    public int r;
    public int s;
    public final Object o = new Object();
    public final NavigableMap<Integer, List<String>> n = new TreeMap();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] $SwitchMap$android$graphics$Bitmap$Config;

        static {
            int[] iArr = new int[Bitmap.Config.values().length];
            $SwitchMap$android$graphics$Bitmap$Config = iArr;
            try {
                iArr[Bitmap.Config.ALPHA_8.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$android$graphics$Bitmap$Config[Bitmap.Config.RGB_565.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$android$graphics$Bitmap$Config[Bitmap.Config.ARGB_4444.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$android$graphics$Bitmap$Config[Bitmap.Config.ARGB_8888.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static {
        t2o.a(620757053);
        t2o.a(620757006);
    }

    public sie(int i, float f) {
        super(i, f);
        fiv.a(TAG, "init with maxSize=%K, hotPercent=%.1f%%", Integer.valueOf(i), Float.valueOf(f * 100.0f));
    }

    public static /* synthetic */ Object ipc$super(sie sieVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -2084926247) {
            return super.get(objArr[0]);
        }
        if (hashCode == -1272099756) {
            super.clear();
            return null;
        }
        int hashCode2 = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/phenix/cache/memory/ImageCacheAndPool");
    }

    public void F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebe9bba9", new Object[]{this});
        } else if (xv8.g(3)) {
            Integer valueOf = Integer.valueOf(this.p);
            Integer valueOf2 = Integer.valueOf(q());
            int i = this.q;
            fiv.a(TAG_POOL, "%K/%K, rate:%.1f%%, hits:%d, misses:%d, count:%d", valueOf, valueOf2, Float.valueOf((i * 100.0f) / (i + this.r)), Integer.valueOf(this.q), Integer.valueOf(this.r), Integer.valueOf(this.s));
        }
    }

    /* renamed from: G */
    public final bu2 get(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bu2) ipChange.ipc$dispatch("f8f11dc", new Object[]{this, str});
        }
        bu2 bu2Var = (bu2) super.get(str);
        h(TAG);
        return bu2Var;
    }

    public final int H(Bitmap.Config config) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5a3db8f3", new Object[]{this, config})).intValue();
        }
        if (config != null) {
            int i = a.$SwitchMap$android$graphics$Bitmap$Config[config.ordinal()];
            if (i == 1) {
                return 1;
            }
            if (i == 2 || i == 3) {
                return 2;
            }
            if (i == 4) {
                return 4;
            }
        }
        return 0;
    }

    /* renamed from: I */
    public int m(bu2 bu2Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b0b29b3e", new Object[]{this, bu2Var})).intValue();
        }
        if (bu2Var == null) {
            return 0;
        }
        return bu2Var.c();
    }

    public final int J(bu2 bu2Var) {
        Bitmap bitmap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8ad31abf", new Object[]{this, bu2Var})).intValue();
        }
        if (!(bu2Var instanceof ojq) || (bitmap = ((ojq) bu2Var).i) == null || bitmap.isRecycled() || !bitmap.isMutable()) {
            return 0;
        }
        return bu2Var.c();
    }

    @Override // tb.i6b, tb.vmh
    public final synchronized void clear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42d4c54", new Object[]{this});
            return;
        }
        super.clear();
        synchronized (this.o) {
            this.p = 0;
            this.s = 0;
            ((TreeMap) this.n).clear();
        }
    }

    @Override // tb.xc2
    public void c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68bcc3b", new Object[]{this, new Integer(i)});
            return;
        }
        E(i);
        fiv.a(TAG_POOL, "set preEvictedMaxSize(maxPoolSize=%K) in ImageCacheAndPool", Integer.valueOf(i));
    }

    /* renamed from: K */
    public void u(boolean z, String str, bu2 bu2Var, boolean z2) {
        List list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a20ee0d", new Object[]{this, new Boolean(z), str, bu2Var, new Boolean(z2)});
            return;
        }
        if (z2) {
            bu2Var.l();
        } else {
            bu2Var.k(z);
        }
        synchronized (this.o) {
            if (!z) {
                try {
                    int J = J(bu2Var);
                    if (J > 0 && (list = (List) ((TreeMap) this.n).get(Integer.valueOf(J))) != null) {
                        if (list.remove(str)) {
                            this.p -= J;
                            this.s--;
                            fiv.a(TAG_POOL, "remove from bitmap pool when not pre-evicted(cache removed=%b), image=%s", Boolean.valueOf(z2), bu2Var);
                        }
                        if (list.isEmpty()) {
                            ((TreeMap) this.n).remove(Integer.valueOf(J));
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // tb.xc2
    public boolean d(bu2 bu2Var) {
        boolean add;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e1236ba3", new Object[]{this, bu2Var})).booleanValue();
        }
        if (!k(bu2Var.b())) {
            fiv.a(TAG_POOL, "cannot put into bitmap pool(cache removed), image=%s", bu2Var);
            return false;
        }
        int J = J(bu2Var);
        if (J <= 0) {
            return false;
        }
        synchronized (this.o) {
            try {
                List list = (List) ((TreeMap) this.n).get(Integer.valueOf(J));
                if (list == null) {
                    list = new LinkedList();
                    ((TreeMap) this.n).put(Integer.valueOf(J), list);
                }
                this.p += J;
                this.s++;
                fiv.a(TAG_POOL, "put into bitmap pool, size=%d, image=%s", Integer.valueOf(J), bu2Var);
                add = list.add(bu2Var.b());
            } catch (Throwable th) {
                throw th;
            }
        }
        return add;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f6  */
    @Override // tb.xc2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.graphics.Bitmap g(int r17, int r18, android.graphics.Bitmap.Config r19) {
        /*
            Method dump skipped, instructions count: 257
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.sie.g(int, int, android.graphics.Bitmap$Config):android.graphics.Bitmap");
    }
}
