package com.taobao.android.tbabilitykit.dx.webview;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.a07;
import tb.m8;
import tb.t2o;
import tb.tk6;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class DXWebViewAbilityAbility extends m8<tk6> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion = new a(null);
    public static final String DXWEBVIEWABILITY = "-3676317293436189901";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a {
        static {
            t2o.a(786432097);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(786432095);
    }

    public static /* synthetic */ Object ipc$super(DXWebViewAbilityAbility dXWebViewAbilityAbility, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/tbabilitykit/dx/webview/DXWebViewAbilityAbility");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0075  */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public tb.c8<?> f(final tb.n8 r9, final tb.tk6 r10, final tb.u8 r11) {
        /*
            r8 = this;
            r0 = 2
            r1 = 0
            com.android.alibaba.ip.runtime.IpChange r2 = com.taobao.android.tbabilitykit.dx.webview.DXWebViewAbilityAbility.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x001e
            java.lang.String r3 = "f0bde67e"
            r4 = 4
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r1] = r8
            r1 = 1
            r4[r1] = r9
            r4[r0] = r10
            r9 = 3
            r4[r9] = r11
            java.lang.Object r9 = r2.ipc$dispatch(r3, r4)
            tb.c8 r9 = (tb.c8) r9
            return r9
        L_0x001e:
            if (r9 == 0) goto L_0x00d5
            java.lang.String r2 = "targetNodeId"
            java.lang.String r2 = r9.i(r2)
            java.lang.String r3 = "action"
            java.lang.String r3 = r9.i(r3)
            boolean r4 = android.text.TextUtils.isEmpty(r2)
            r5 = -1999(0xfffffffffffff831, float:NaN)
            if (r4 != 0) goto L_0x00c8
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            if (r4 == 0) goto L_0x003d
            goto L_0x00c8
        L_0x003d:
            r4 = 0
            if (r10 == 0) goto L_0x006b
            com.taobao.android.dinamicx.widget.DXWidgetNode r6 = r10.q()
            if (r6 == 0) goto L_0x006b
            java.lang.String r7 = r6.getUserId()
            boolean r7 = tb.tsq.y(r2, r7, r1, r0, r4)
            if (r7 == 0) goto L_0x0051
            goto L_0x006c
        L_0x0051:
            com.taobao.android.dinamicx.widget.DXWidgetNode r7 = r6.queryWidgetNodeByUserId(r2)
            if (r7 == 0) goto L_0x0059
            r6 = r7
            goto L_0x006c
        L_0x0059:
            com.taobao.android.dinamicx.DXRuntimeContext r6 = r6.getDXRuntimeContext()
            if (r6 == 0) goto L_0x006b
            com.taobao.android.dinamicx.widget.DXWidgetNode r6 = r6.H()
            if (r6 == 0) goto L_0x006b
            com.taobao.android.dinamicx.widget.DXWidgetNode r2 = r6.queryWidgetNodeByUserId(r2)
            r6 = r2
            goto L_0x006c
        L_0x006b:
            r6 = r4
        L_0x006c:
            boolean r2 = r6 instanceof com.taobao.android.dinamicx.widget.DXWebViewWidgetNode
            if (r2 != 0) goto L_0x0071
            r6 = r4
        L_0x0071:
            com.taobao.android.dinamicx.widget.DXWebViewWidgetNode r6 = (com.taobao.android.dinamicx.widget.DXWebViewWidgetNode) r6
            if (r6 == 0) goto L_0x00d5
            java.lang.String r2 = "reload"
            boolean r2 = tb.tsq.y(r3, r2, r1, r0, r4)
            if (r2 == 0) goto L_0x0082
            r6.E()
            goto L_0x00d5
        L_0x0082:
            java.lang.String r2 = "loadUrl"
            boolean r2 = tb.tsq.y(r3, r2, r1, r0, r4)
            if (r2 == 0) goto L_0x0096
            java.lang.String r10 = "url"
            java.lang.String r9 = r9.i(r10)
            r6.C(r9)
            goto L_0x00d5
        L_0x0096:
            java.lang.String r2 = "destroy"
            boolean r2 = tb.tsq.y(r3, r2, r1, r0, r4)
            if (r2 == 0) goto L_0x00a2
            r6.destroy()
            goto L_0x00d5
        L_0x00a2:
            java.lang.String r2 = "callJS"
            boolean r0 = tb.tsq.y(r3, r2, r1, r0, r4)
            if (r0 == 0) goto L_0x00d5
            java.lang.String r0 = "functionName"
            java.lang.String r0 = r9.i(r0)
            if (r0 == 0) goto L_0x00bb
            com.taobao.android.tbabilitykit.dx.webview.DXWebViewAbilityAbility$onExecuteWithData$$inlined$let$lambda$1 r1 = new com.taobao.android.tbabilitykit.dx.webview.DXWebViewAbilityAbility$onExecuteWithData$$inlined$let$lambda$1
            r1.<init>()
            r6.z(r0, r1)
            goto L_0x00d5
        L_0x00bb:
            tb.b8 r9 = new tb.b8
            tb.a8 r10 = new tb.a8
            java.lang.String r11 = "TsWebViewAbilityAbility callJS no functionName"
            r10.<init>(r5, r11)
            r9.<init>(r10, r1)
            return r9
        L_0x00c8:
            tb.b8 r9 = new tb.b8
            tb.a8 r10 = new tb.a8
            java.lang.String r11 = "TsWebViewAbilityAbility empty userId or type or akCtx"
            r10.<init>(r5, r11)
            r9.<init>(r10, r1)
            return r9
        L_0x00d5:
            tb.f8 r9 = new tb.f8
            r9.<init>()
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.tbabilitykit.dx.webview.DXWebViewAbilityAbility.f(tb.n8, tb.tk6, tb.u8):tb.c8");
    }
}
