package com.etao.feimagesearch.pipline.node;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Pair;
import tb.a07;
import tb.t2o;
import tb.yy1;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class ImageTranslateNode extends yy1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final Integer d;
    public volatile Pair<Pair<String, String>, Pair<String, String>> e;
    public volatile boolean f;

    static {
        t2o.a(481297365);
    }

    public /* synthetic */ ImageTranslateNode(Integer num, Pair pair, boolean z, int i, a07 a07Var) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : pair, (i & 4) != 0 ? true : z);
    }

    public static /* synthetic */ Object ipc$super(ImageTranslateNode imageTranslateNode, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/pipline/node/ImageTranslateNode");
    }

    public static final /* synthetic */ Pair o(ImageTranslateNode imageTranslateNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("554716c4", new Object[]{imageTranslateNode});
        }
        return imageTranslateNode.q();
    }

    public static final /* synthetic */ boolean p(ImageTranslateNode imageTranslateNode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("59f1fa9f", new Object[]{imageTranslateNode})).booleanValue();
        }
        return imageTranslateNode.f;
    }

    @Override // tb.yy1
    public String j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5b5601d", new Object[]{this});
        }
        return "ImageTranslate";
    }

    public final Pair<Pair<String, String>, Pair<String, String>> q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("7bcef5c4", new Object[]{this});
        }
        Pair<Pair<String, String>, Pair<String, String>> pair = this.e;
        return pair == null ? new Pair<>(new Pair("自动", "auto"), new Pair("中文", "zh")) : pair;
    }

    public ImageTranslateNode(Integer num, Pair<Pair<String, String>, Pair<String, String>> pair, boolean z) {
        this.d = num;
        this.e = pair;
        this.f = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, java.lang.Integer] */
    /* JADX WARN: Unknown variable types count: 1 */
    @Override // tb.yy1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public tb.x7m k(tb.w7m r11) {
        /*
            r10 = this;
            r0 = 0
            com.android.alibaba.ip.runtime.IpChange r1 = com.etao.feimagesearch.pipline.node.ImageTranslateNode.$ipChange
            boolean r2 = r1 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r2 == 0) goto L_0x0018
            java.lang.String r2 = "826f33b6"
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r0] = r10
            r0 = 1
            r3[r0] = r11
            java.lang.Object r11 = r1.ipc$dispatch(r2, r3)
            tb.x7m r11 = (tb.x7m) r11
            return r11
        L_0x0018:
            java.lang.String r1 = "pipLineDS"
            tb.ckf.g(r11, r1)
            kotlin.jvm.internal.Ref$ObjectRef r1 = new kotlin.jvm.internal.Ref$ObjectRef
            r1.<init>()
            java.lang.Integer r2 = r10.d
            r1.element = r2
            if (r2 != 0) goto L_0x00a6
            android.graphics.Bitmap r2 = r11.h()
            if (r2 != 0) goto L_0x0031
            r2 = 0
            goto L_0x0039
        L_0x0031:
            int r2 = r2.hashCode()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
        L_0x0039:
            r1.element = r2
            if (r2 != 0) goto L_0x0053
            r11 = -18
            java.lang.String r0 = "DetectToken非法"
            r10.m(r11, r0)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r11)
            java.lang.String r3 = "DetectToken非法"
            r4 = 0
            r5 = 4
            r6 = 0
            r1 = r10
            tb.gy8 r11 = tb.yy1.e(r1, r2, r3, r4, r5, r6)
            return r11
        L_0x0053:
            kotlin.Pair<kotlin.Pair<java.lang.String, java.lang.String>, kotlin.Pair<java.lang.String, java.lang.String>> r2 = r10.e
            if (r2 != 0) goto L_0x005d
            kotlin.Pair r2 = r10.q()
            r10.e = r2
        L_0x005d:
            tb.dnf r3 = tb.dnf.INSTANCE
            T r4 = r1.element
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            android.util.Size r5 = r11.f()
            if (r5 != 0) goto L_0x006f
            r5 = 0
            goto L_0x0073
        L_0x006f:
            int r5 = r5.getWidth()
        L_0x0073:
            android.util.Size r6 = r11.f()
            if (r6 != 0) goto L_0x007b
            r6 = 0
            goto L_0x0080
        L_0x007b:
            int r0 = r6.getHeight()
            r6 = r0
        L_0x0080:
            java.lang.String r11 = r11.n()
            if (r11 != 0) goto L_0x0088
            java.lang.String r11 = ""
        L_0x0088:
            r7 = r11
            java.lang.Object r11 = r2.getFirst()
            kotlin.Pair r11 = (kotlin.Pair) r11
            java.lang.Object r11 = r11.getSecond()
            r8 = r11
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r11 = r2.getSecond()
            kotlin.Pair r11 = (kotlin.Pair) r11
            java.lang.Object r11 = r11.getSecond()
            r9 = r11
            java.lang.String r9 = (java.lang.String) r9
            r3.h(r4, r5, r6, r7, r8, r9)
        L_0x00a6:
            T r11 = r1.element
            java.lang.String r11 = java.lang.String.valueOf(r11)
            java.lang.String r0 = "codeDetectToken"
            r10.a(r0, r11)
            tb.bw2 r11 = new tb.bw2
            com.etao.feimagesearch.pipline.node.ImageTranslateNode$process$1 r0 = new com.etao.feimagesearch.pipline.node.ImageTranslateNode$process$1
            r0.<init>(r1, r10)
            r11.<init>(r0)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etao.feimagesearch.pipline.node.ImageTranslateNode.k(tb.w7m):tb.x7m");
    }
}
