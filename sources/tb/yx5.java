package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class yx5 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public int f32402a;
    public int b;
    public final gh5 c;
    public List<wx5> d;

    static {
        t2o.a(444597913);
    }

    public yx5(gh5 gh5Var) {
        this.c = gh5Var;
    }

    public List<wx5> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("1e74f21c", new Object[]{this});
        }
        return this.d;
    }

    public void c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6b780e9", new Object[]{this, new Integer(i)});
        } else {
            this.b = i;
        }
    }

    public void d(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bbcb2e3c", new Object[]{this, new Integer(i)});
        } else {
            this.f32402a = i;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v3, types: [tb.vx5] */
    /* JADX WARN: Type inference failed for: r12v4, types: [tb.xx5] */
    /* JADX WARN: Unknown variable types count: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean b(tb.lg5 r15) {
        /*
            r14 = this;
            r0 = 0
            r1 = 2
            r2 = 1
            com.android.alibaba.ip.runtime.IpChange r3 = tb.yx5.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x001c
            java.lang.String r4 = "a05386f6"
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r0] = r14
            r1[r2] = r15
            java.lang.Object r15 = r3.ipc$dispatch(r4, r1)
            java.lang.Boolean r15 = (java.lang.Boolean) r15
            boolean r15 = r15.booleanValue()
            return r15
        L_0x001c:
            int r3 = r14.f32402a
            r15.k(r3)
            int r3 = r15.h()
            if (r3 > 0) goto L_0x0028
            return r2
        L_0x0028:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r14.d = r4
            r4 = 0
        L_0x0030:
            if (r4 >= r3) goto L_0x00ac
            byte r7 = r15.e()
            short[] r8 = new short[r7]
            short[] r9 = new short[r7]
            r5 = 0
        L_0x003b:
            if (r5 >= r7) goto L_0x004d
            byte r6 = r15.e()
            short r6 = (short) r6
            r8[r5] = r6
            short r6 = r15.j()
            r9[r5] = r6
            int r5 = r5 + r2
            byte r5 = (byte) r5
            goto L_0x003b
        L_0x004d:
            byte r5 = r15.e()
            int r6 = r15.h()
            if (r6 <= 0) goto L_0x005e
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
        L_0x005c:
            r11 = r10
            goto L_0x0060
        L_0x005e:
            r10 = 0
            goto L_0x005c
        L_0x0060:
            r10 = 0
        L_0x0061:
            if (r10 >= r6) goto L_0x009a
            byte r12 = r15.e()
            if (r12 == r1) goto L_0x008c
            r13 = 3
            if (r12 != r13) goto L_0x0077
            tb.xx5 r12 = new tb.xx5
            r12.<init>(r5)
            tb.gh5 r13 = r14.c
            r12.b(r15, r13)
            goto L_0x0095
        L_0x0077:
            com.taobao.android.dxcommon.expression.DXExprException r15 = new com.taobao.android.dxcommon.expression.DXExprException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "不认识的code类型 "
            r0.<init>(r1)
            r0.append(r12)
            java.lang.String r0 = r0.toString()
            r15.<init>(r0)
            throw r15
        L_0x008c:
            tb.vx5 r12 = new tb.vx5
            int r13 = r15.h()
            r12.<init>(r13)
        L_0x0095:
            r11.add(r12)
            int r10 = r10 + r2
            goto L_0x0061
        L_0x009a:
            tb.wx5 r12 = new tb.wx5
            java.lang.String r6 = ""
            short r10 = (short) r5
            r5 = r12
            r5.<init>(r6, r7, r8, r9, r10, r11)
            java.util.List<tb.wx5> r5 = r14.d
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            r5.add(r12)
            int r4 = r4 + r2
            goto L_0x0030
        L_0x00ac:
            int r0 = r14.b
            int r15 = r15.c()
            int r1 = r14.f32402a
            int r15 = r15 - r1
            if (r0 != r15) goto L_0x00b8
            return r2
        L_0x00b8:
            com.taobao.android.dinamicx_v4.loader.DXLoaderException r15 = new com.taobao.android.dinamicx_v4.loader.DXLoaderException
            java.lang.String r0 = "读取方法区失败，读取的长度跟写入的长度对不上 "
            r15.<init>(r0)
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.yx5.b(tb.lg5):boolean");
    }
}
