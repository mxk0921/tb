package tb;

import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.RectF;
import android.text.TextUtils;
import android.util.Size;
import android.util.SparseArray;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONField;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import kotlin.jvm.JvmStatic;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class rk1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public String f27433a;
    @JSONField(serialize = false)
    private List<String> actions;
    public String b;
    public Long c;
    public Long d;
    @JSONField(serialize = false)
    public Bitmap detectBitmap;
    public List<RectF> e;
    public List<RectF> f;
    public String g;
    public int h;
    public boolean i;
    public String j;
    public String k;
    public RectF l;
    @JSONField(serialize = false)
    private List<Integer> labels;
    public String m;
    @JSONField(serialize = false)
    private List<Double> scores;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(481297029);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        @JvmStatic
        public final rk1 a(Bitmap bitmap, Long l) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (rk1) ipChange.ipc$dispatch("717d3f52", new Object[]{this, bitmap, l});
            }
            ckf.g(bitmap, "detectBitmap");
            rk1 rk1Var = new rk1(null);
            rk1Var.y(l);
            rk1Var.B(bitmap);
            return rk1Var;
        }

        /* JADX WARN: Removed duplicated region for block: B:35:0x00c6 A[Catch: Exception -> 0x0099, TRY_LEAVE, TryCatch #1 {Exception -> 0x0099, blocks: (B:13:0x0043, B:16:0x0079, B:20:0x0087, B:21:0x008b, B:23:0x0090, B:27:0x009c, B:30:0x00a5, B:33:0x00ae, B:35:0x00c6), top: B:78:0x0043 }] */
        @kotlin.jvm.JvmStatic
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final tb.rk1 b(java.lang.String r23, java.lang.String r24, android.graphics.Bitmap r25, java.lang.Long r26, java.util.Map<java.lang.String, ? extends java.lang.Object> r27) {
            /*
                Method dump skipped, instructions count: 612
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: tb.rk1.a.b(java.lang.String, java.lang.String, android.graphics.Bitmap, java.lang.Long, java.util.Map):tb.rk1");
        }

        public a() {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class b {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final b INSTANCE = new b();
        public static final int TYPE_BACK = 3;
        public static final int TYPE_DECODE = 1;
        public static final int TYPE_DECODE_HARD = 5;
        public static final int TYPE_DEFAULT = -1;
        public static final int TYPE_FOCUS = 0;
        public static final int TYPE_OTHER_FACE = 6;
        public static final int TYPE_READY = 4;
        public static final int TYPE_TAG = 2;

        static {
            t2o.a(481297031);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @JvmStatic
        public static final SparseArray<String> a() {
            int e;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (SparseArray) ipChange.ipc$dispatch("a4cf3f2b", new Object[0]);
            }
            SparseArray<String> sparseArray = new SparseArray<>();
            String C3 = lg4.C3();
            if (TextUtils.isEmpty(C3)) {
                sparseArray.put(0, "请对准想搜的物品");
                sparseArray.put(1, "检测到条码，解码中");
                sparseArray.put(2, "对准商品正面识别更准");
                sparseArray.put(3, "对准正面拍，结果更准");
                sparseArray.put(4, "识别到商品，即将拉起结果页");
                sparseArray.put(5, "请再靠近一点，或查看【解码帮助】");
                sparseArray.put(6, "对准商品正面识别更准");
            } else {
                ckf.f(C3, "configString");
                for (String str : wsq.z0(C3, new String[]{";"}, false, 0, 6, null)) {
                    List z0 = wsq.z0(str, new String[]{":"}, false, 0, 6, null);
                    if (z0.size() == 2 && (e = qrl.e((String) z0.get(0), -1)) >= 0) {
                        sparseArray.put(e, z0.get(1));
                    }
                }
            }
            return sparseArray;
        }
    }

    static {
        t2o.a(481297028);
    }

    public /* synthetic */ rk1(a07 a07Var) {
        this();
    }

    public final void A(List<RectF> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a588dd03", new Object[]{this, list});
        } else {
            this.e = list;
        }
    }

    public final void B(Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1217dcd3", new Object[]{this, bitmap});
            return;
        }
        ckf.g(bitmap, "<set-?>");
        this.detectBitmap = bitmap;
    }

    public final void C(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30a3342d", new Object[]{this, str});
        } else {
            this.j = str;
        }
    }

    public final void D(List<Integer> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55444ff9", new Object[]{this, list});
        } else {
            this.labels = list;
        }
    }

    public final void E(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb255c2d", new Object[]{this, str});
        } else {
            this.k = str;
        }
    }

    public final void F(RectF rectF) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("827310e4", new Object[]{this, rectF});
        } else {
            this.l = rectF;
        }
    }

    public final void G(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4fcd0b3d", new Object[]{this, str});
        } else {
            this.g = str;
        }
    }

    public final void H(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4a7cb3e", new Object[]{this, str});
        }
    }

    public final void I(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f064e85", new Object[]{this, new Integer(i)});
        } else {
            this.h = i;
        }
    }

    public final void J(List<Double> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d871f1b", new Object[]{this, list});
        } else {
            this.scores = list;
        }
    }

    public final void K(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5ef5988", new Object[]{this, str});
        } else {
            this.b = str;
        }
    }

    public final void L(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cebea143", new Object[]{this, str});
        } else {
            this.f27433a = str;
        }
    }

    public final void M(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4bc7c4a", new Object[]{this, str});
        } else {
            this.m = str;
        }
    }

    public final List<RectF> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("870627fd", new Object[]{this});
        }
        return this.f;
    }

    public final Long b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Long) ipChange.ipc$dispatch("d0265fb3", new Object[]{this});
        }
        return this.d;
    }

    public final Long c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Long) ipChange.ipc$dispatch("5b0d31fe", new Object[]{this});
        }
        return this.c;
    }

    public final boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f38a2aa8", new Object[]{this})).booleanValue();
        }
        return this.i;
    }

    public final Bitmap e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("21aff28d", new Object[]{this});
        }
        Bitmap bitmap = this.detectBitmap;
        if (bitmap != null) {
            return bitmap;
        }
        ckf.y("detectBitmap");
        throw null;
    }

    public final String f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4ff2c1d1", new Object[]{this});
        }
        return this.j;
    }

    public final Point g(Size size) {
        RectF rectF;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Point) ipChange.ipc$dispatch("84fef39b", new Object[]{this, size});
        }
        if (size == null || (rectF = this.l) == null) {
            return null;
        }
        RectF rectF2 = new RectF(rectF.left * size.getWidth(), rectF.top * size.getHeight(), rectF.right * size.getWidth(), rectF.bottom * size.getHeight());
        return new Point((int) rectF2.centerX(), (int) rectF2.centerY());
    }

    public final List<Integer> h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("889b35cb", new Object[]{this});
        }
        return this.labels;
    }

    public final String i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e12b3869", new Object[]{this});
        }
        return this.k;
    }

    public final RectF j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RectF) ipChange.ipc$dispatch("6cae56c0", new Object[]{this});
        }
        return this.l;
    }

    public final String k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("30496759", new Object[]{this});
        }
        return this.g;
    }

    public final int l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("181912bd", new Object[]{this})).intValue();
        }
        return this.h;
    }

    public final List<Double> m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("5f10fa69", new Object[]{this});
        }
        return this.scores;
    }

    public final String n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("dd627216", new Object[]{this});
        }
        return this.b;
    }

    public final String o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d0a42b93", new Object[]{this});
        }
        return this.f27433a;
    }

    public final String p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f3b18214", new Object[]{this});
        }
        return this.m;
    }

    public final String q(SparseArray<String> sparseArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("edcccee2", new Object[]{this, sparseArray});
        }
        ckf.g(sparseArray, "tipConfig");
        String str = sparseArray.get(this.h);
        return str == null ? "" : str;
    }

    public final int r(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("38d4cc31", new Object[]{this, new Float(f)})).intValue();
        }
        RectF rectF = this.l;
        if (rectF == null) {
            return -1;
        }
        float width = rectF.width() * rectF.height();
        if (width <= 0.0f || width > 1.0f) {
            return -1;
        }
        float centerX = rectF.centerX();
        float centerY = rectF.centerY();
        float f2 = 1 - 0.05f;
        return (int) Math.min(Math.min(Math.min((centerX - 0.05f) / (centerX - rectF.left), (f2 - centerX) / (rectF.right - centerX)), Math.min((centerY - 0.05f) / (centerY - rectF.top), (f2 - centerY) / (rectF.bottom - centerY))), (float) Math.sqrt(f / width));
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0034, code lost:
        if (r2.equals(tb.sk1.OLD_ALGORITHM_CODE) == false) goto L_0x0044;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003d, code lost:
        if (r2.equals(tb.sk1.INVALID_RESULT_CODE) == false) goto L_0x0044;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0042, code lost:
        if (r4.l != null) goto L_0x005c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005c, code lost:
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean s() {
        /*
            r4 = this;
            r0 = 0
            r1 = 1
            com.android.alibaba.ip.runtime.IpChange r2 = tb.rk1.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x0019
            java.lang.String r3 = "ea845f58"
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r0] = r4
            java.lang.Object r0 = r2.ipc$dispatch(r3, r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L_0x0019:
            java.lang.String r2 = r4.g
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 == 0) goto L_0x0022
            return r1
        L_0x0022:
            java.lang.String r2 = r4.g
            if (r2 == 0) goto L_0x0044
            int r3 = r2.hashCode()
            switch(r3) {
                case 1906701455: goto L_0x0046;
                case 1906701456: goto L_0x0037;
                case 1906701457: goto L_0x002e;
                default: goto L_0x002d;
            }
        L_0x002d:
            goto L_0x0044
        L_0x002e:
            java.lang.String r3 = "A00002"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x0040
            goto L_0x0044
        L_0x0037:
            java.lang.String r3 = "A00001"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x0040
            goto L_0x0044
        L_0x0040:
            android.graphics.RectF r2 = r4.l
            if (r2 != 0) goto L_0x005c
        L_0x0044:
            r0 = 1
            goto L_0x005c
        L_0x0046:
            java.lang.String r3 = "A00000"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x004f
            goto L_0x0044
        L_0x004f:
            java.util.List<android.graphics.RectF> r2 = r4.f
            java.util.Collection r2 = (java.util.Collection) r2
            if (r2 == 0) goto L_0x0044
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x005c
            goto L_0x0044
        L_0x005c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.rk1.s():boolean");
    }

    public final boolean t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6a4d61da", new Object[]{this})).booleanValue();
        }
        return ckf.b(this.g, sk1.NEW_ALGORITHM_CODE);
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        String jSONString = JSON.toJSONString(this);
        ckf.f(jSONString, "toJSONString(this)");
        return jSONString;
    }

    public final boolean u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4347d904", new Object[]{this})).booleanValue();
        }
        if (this.h >= 0 || !s()) {
            return true;
        }
        return false;
    }

    public final void v(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2b28a33", new Object[]{this, list});
        } else {
            this.actions = list;
        }
    }

    public final void w(List<RectF> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e45466f", new Object[]{this, list});
        } else {
            this.f = list;
        }
    }

    public final void x(Long l) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("124a8f6d", new Object[]{this, l});
        } else {
            this.d = l;
        }
    }

    public final void y(Long l) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3497f82", new Object[]{this, l});
        } else {
            this.c = l;
        }
    }

    public final void z(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("abe02abc", new Object[]{this, new Boolean(z)});
        } else {
            this.i = z;
        }
    }

    public rk1() {
        this.h = -1;
    }
}
