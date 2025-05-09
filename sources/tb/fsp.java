package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.FluidSDK;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.adapter.IImageAdapter;
import com.taobao.phenix.intf.PhenixCreator;
import com.taobao.tao.Globals;
import tb.kaw;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class fsp extends tzv {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String n = "ShortVideoVCard";
    private static final int o = 838860;
    private static final int p = 0;
    private static final int q = 1;
    private static final int r = 2;
    private static final int s = 3;
    private static final int t = 4;
    private kaw.a f;
    private p1m j;
    private r8e l;
    private String m;
    private static final int u = eps.u();
    private static final int v = eps.v();
    private static final int w = eps.x();
    private static final int x = eps.w();
    private static final int y = eps.A();
    private static final int z = eps.y();
    private static final int A = eps.z();
    private int e = 0;
    private boolean g = false;
    private boolean h = false;
    private int i = 0;
    private h9e k = new a();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements h9e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.h9e
        public void onCancel(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("44139f0a", new Object[]{this, str});
                return;
            }
            fsp fspVar = fsp.this;
            fsp.x(fspVar, "下载取消：" + str);
            fsp.F(fsp.this, 4);
        }

        @Override // tb.h9e
        public void onError(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ac367d3a", new Object[]{this, str});
                return;
            }
            fsp fspVar = fsp.this;
            fsp.x(fspVar, "下载失败：" + str);
            fsp.F(fsp.this, 3);
        }

        @Override // tb.h9e
        public void onProgress(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5ec8f5b0", new Object[]{this, new Integer(i)});
            }
        }

        @Override // tb.h9e
        public void onFinish(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6a105f4a", new Object[]{this, new Integer(i)});
                return;
            }
            fsp.x(fsp.this, "下载成功");
            fsp.F(fsp.this, 2);
        }

        @Override // tb.h9e
        public void onStart(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("938ad014", new Object[]{this, str});
                return;
            }
            fsp.x(fsp.this, "下载开始");
            fsp.F(fsp.this, 1);
        }
    }

    static {
        t2o.a(468713996);
    }

    public fsp(FluidContext fluidContext, com.taobao.android.fluid.framework.data.datamodel.a aVar) {
        super(fluidContext, aVar);
    }

    public static /* synthetic */ int F(fsp fspVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("74cf3260", new Object[]{fspVar, new Integer(i)})).intValue();
        }
        fspVar.e = i;
        return i;
    }

    private void G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43abe5d0", new Object[]{this});
        } else if (this.f != null) {
            kaw.a(this.f29053a.getContext(), this.f);
        }
    }

    private void N(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9dd52d5", new Object[]{this, str});
            return;
        }
        ir9.b(n, this.i + " => " + str);
    }

    private void Q(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b37e01e7", new Object[]{this, new Integer(i)});
            return;
        }
        if (this.e == 0 && !this.g) {
            G();
            this.f = kaw.b(this.f29053a.getContext(), this.b, o, null, this.k, i);
        }
        if (eps.f()) {
            R();
        }
    }

    private void R() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a0c90b5", new Object[]{this});
        } else if (this.j == null) {
            String b = xv4.b(this.f29053a, this.b);
            N("预下载封面:" + b);
            PhenixCreator U = s0m.B().N0(Globals.getApplication()).U(null, b);
            FluidSDK.getImageAdapter();
            U.addLoaderExtra(nd2.BUNDLE_BIZ_CODE, IImageAdapter.IMAGE_ORIGIN_MODE_NORMAL_BIZID);
            this.j = U.fetch();
        }
    }

    private void S(boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32e78051", new Object[]{this, new Boolean(z2)});
        } else {
            this.h = z2;
        }
    }

    public static /* synthetic */ Object ipc$super(fsp fspVar, String str, Object... objArr) {
        if (str.hashCode() == 715537612) {
            super.onRecycle((uq9) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/fluid/framework/card/cards/video/ShortVideoVCard");
    }

    public static /* synthetic */ void x(fsp fspVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1c69943", new Object[]{fspVar, str});
        } else {
            fspVar.N(str);
        }
    }

    public String I() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c5f7e00b", new Object[]{this});
        }
        return this.m;
    }

    public r8e M() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (r8e) ipChange.ipc$dispatch("42367b10", new Object[]{this});
        }
        return this.l;
    }

    public void O(boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("203d5ac6", new Object[]{this, new Boolean(z2)});
            return;
        }
        this.g = z2;
        G();
    }

    public boolean P() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("720f8684", new Object[]{this})).booleanValue();
        }
        return this.h;
    }

    public void T(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83e17bcb", new Object[]{this, str});
        } else {
            this.m = str;
        }
    }

    public void U(r8e r8eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f20ed0b2", new Object[]{this, r8eVar});
        } else {
            this.l = r8eVar;
        }
    }

    @Override // tb.tzv
    public void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("342d6281", new Object[]{this});
            return;
        }
        G();
        p1m p1mVar = this.j;
        if (p1mVar != null) {
            p1mVar.a();
            this.j = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0076, code lost:
        if (r7 <= r8) goto L_0x007a;
     */
    /* JADX WARN: Removed duplicated region for block: B:40:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    @Override // tb.tzv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m(int r6, int r7, com.taobao.android.fluid.framework.preload.cardwarmup.WarmUpReason r8, tb.mxw r9) {
        /*
            r5 = this;
            r0 = 2
            r1 = 1
            r2 = 0
            com.android.alibaba.ip.runtime.IpChange r3 = tb.fsp.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x0028
            java.lang.Integer r4 = new java.lang.Integer
            r4.<init>(r6)
            java.lang.Integer r6 = new java.lang.Integer
            r6.<init>(r7)
            r7 = 5
            java.lang.Object[] r7 = new java.lang.Object[r7]
            r7[r2] = r5
            r7[r1] = r4
            r7[r0] = r6
            r6 = 3
            r7[r6] = r8
            r6 = 4
            r7[r6] = r9
            java.lang.String r6 = "eed6b4f3"
            r3.ipc$dispatch(r6, r7)
            return
        L_0x0028:
            r5.i = r6
            int r6 = r9.a()
            r3 = -1
            if (r6 != r3) goto L_0x0032
            return
        L_0x0032:
            int r6 = r9.b()
            if (r6 != r1) goto L_0x003c
            int r6 = tb.fsp.u
            if (r7 <= r6) goto L_0x0046
        L_0x003c:
            int r6 = r9.b()
            if (r6 != r0) goto L_0x0048
            int r6 = tb.fsp.v
            if (r7 > r6) goto L_0x0048
        L_0x0046:
            r6 = 1
            goto L_0x0049
        L_0x0048:
            r6 = 0
        L_0x0049:
            com.taobao.android.fluid.framework.preload.cardwarmup.WarmUpReason r4 = com.taobao.android.fluid.framework.preload.cardwarmup.WarmUpReason.HEALTHY
            if (r8 != r4) goto L_0x005f
            int r8 = r9.a()
            if (r8 != r1) goto L_0x0056
            int r8 = tb.fsp.x
            goto L_0x0058
        L_0x0056:
            int r8 = tb.fsp.w
        L_0x0058:
            if (r7 > r8) goto L_0x0079
            int r7 = r7 - r1
            int r7 = r7 * 500
            r2 = r7
            goto L_0x007a
        L_0x005f:
            if (r7 > r1) goto L_0x0062
            goto L_0x0079
        L_0x0062:
            int r8 = r9.b()
            if (r8 == 0) goto L_0x0074
            if (r8 == r1) goto L_0x0071
            if (r8 == r0) goto L_0x006e
            r8 = 0
            goto L_0x0076
        L_0x006e:
            int r8 = tb.fsp.A
            goto L_0x0076
        L_0x0071:
            int r8 = tb.fsp.z
            goto L_0x0076
        L_0x0074:
            int r8 = tb.fsp.y
        L_0x0076:
            if (r7 > r8) goto L_0x0079
            goto L_0x007a
        L_0x0079:
            r2 = -1
        L_0x007a:
            r5.S(r6)
            if (r2 < 0) goto L_0x0082
            r5.Q(r2)
        L_0x0082:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.fsp.m(int, int, com.taobao.android.fluid.framework.preload.cardwarmup.WarmUpReason, tb.mxw):void");
    }

    @Override // tb.tzv, tb.wlb
    public void onRecycle(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2aa63ccc", new Object[]{this, uq9Var});
            return;
        }
        super.onRecycle(uq9Var);
        l();
    }
}
