package com.taobao.themis.inside.adapter;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.adapter.IMegaAdapter;
import kotlin.Metadata;
import tb.a07;
import tb.t2o;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \t2\u00020\u0001:\u0001\nB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/taobao/themis/inside/adapter/TMSMegaAdapter;", "Lcom/taobao/themis/kernel/adapter/IMegaAdapter;", "<init>", "()V", "Ltb/kdb;", "context", "Lcom/taobao/themis/kernel/page/ITMSPage;", "getPageFromAbilityContext", "(Ltb/kdb;)Lcom/taobao/themis/kernel/page/ITMSPage;", "Companion", "a", "themis_inside_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class TMSMegaAdapter implements IMegaAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a {
        static {
            t2o.a(837812297);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    static {
        t2o.a(837812296);
        t2o.a(839909474);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0051 A[Catch: all -> 0x004c, TryCatch #1 {all -> 0x004c, blocks: (B:16:0x003b, B:19:0x0047, B:23:0x0051, B:25:0x0059, B:28:0x0060, B:31:0x006b, B:34:0x0072, B:37:0x0079), top: B:43:0x003b }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0060 A[Catch: all -> 0x004c, TryCatch #1 {all -> 0x004c, blocks: (B:16:0x003b, B:19:0x0047, B:23:0x0051, B:25:0x0059, B:28:0x0060, B:31:0x006b, B:34:0x0072, B:37:0x0079), top: B:43:0x003b }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0087 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x003b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.taobao.themis.kernel.adapter.IMegaAdapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.taobao.themis.kernel.page.ITMSPage getPageFromAbilityContext(tb.kdb r5) {
        /*
            r4 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.themis.inside.adapter.TMSMegaAdapter.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L_0x0018
            java.lang.String r1 = "92e7fd81"
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r4
            r3 = 1
            r2[r3] = r5
            java.lang.Object r5 = r0.ipc$dispatch(r1, r2)
            com.taobao.themis.kernel.page.ITMSPage r5 = (com.taobao.themis.kernel.page.ITMSPage) r5
            return r5
        L_0x0018:
            java.lang.String r0 = "context"
            tb.ckf.g(r5, r0)
            r0 = 0
            android.view.View r1 = r5.k()     // Catch: all -> 0x0036
            boolean r2 = r1 instanceof android.taobao.windvane.extra.uc.WVUCWebView     // Catch: all -> 0x0036
            java.lang.String r3 = "themis_page"
            if (r2 == 0) goto L_0x0038
            android.taobao.windvane.extra.uc.WVUCWebView r1 = (android.taobao.windvane.extra.uc.WVUCWebView) r1     // Catch: all -> 0x0036
            java.lang.Object r1 = r1.getExternalContext(r3)     // Catch: all -> 0x0036
            boolean r2 = r1 instanceof com.taobao.themis.kernel.page.ITMSPage     // Catch: all -> 0x0036
            if (r2 == 0) goto L_0x0038
            com.taobao.themis.kernel.page.ITMSPage r1 = (com.taobao.themis.kernel.page.ITMSPage) r1     // Catch: all -> 0x0036
            goto L_0x0039
        L_0x0036:
            r5 = move-exception
            goto L_0x007f
        L_0x0038:
            r1 = r0
        L_0x0039:
            if (r1 != 0) goto L_0x004f
            java.lang.Class<com.taobao.themis.kernel.adapter.IWeexAdapter> r2 = com.taobao.themis.kernel.adapter.IWeexAdapter.class
            java.lang.Object r2 = tb.p8s.b(r2)     // Catch: all -> 0x004c
            com.taobao.themis.kernel.adapter.IWeexAdapter r2 = (com.taobao.themis.kernel.adapter.IWeexAdapter) r2     // Catch: all -> 0x004c
            if (r2 != 0) goto L_0x0047
            r1 = r0
            goto L_0x004f
        L_0x0047:
            com.taobao.themis.kernel.page.ITMSPage r1 = r2.getTMSPageFromIAbilityContext(r5)     // Catch: all -> 0x004c
            goto L_0x004f
        L_0x004c:
            r5 = move-exception
            r0 = r1
            goto L_0x007f
        L_0x004f:
            if (r1 != 0) goto L_0x005e
            java.lang.Object r2 = r5.m(r3)     // Catch: all -> 0x004c
            boolean r3 = r2 instanceof com.taobao.themis.kernel.page.ITMSPage     // Catch: all -> 0x004c
            if (r3 == 0) goto L_0x005d
            com.taobao.themis.kernel.page.ITMSPage r2 = (com.taobao.themis.kernel.page.ITMSPage) r2     // Catch: all -> 0x004c
            r1 = r2
            goto L_0x005e
        L_0x005d:
            r1 = r0
        L_0x005e:
            if (r1 != 0) goto L_0x0087
            tb.ldb r5 = r5.l()     // Catch: all -> 0x004c
            android.content.Context r5 = r5.getContext()     // Catch: all -> 0x004c
            if (r5 != 0) goto L_0x006b
            goto L_0x007d
        L_0x006b:
            tb.bbs r5 = com.taobao.themis.kernel.utils.TMSInstanceExtKt.i(r5)     // Catch: all -> 0x004c
            if (r5 != 0) goto L_0x0072
            goto L_0x007d
        L_0x0072:
            tb.swd r5 = r5.W()     // Catch: all -> 0x004c
            if (r5 != 0) goto L_0x0079
            goto L_0x007d
        L_0x0079:
            com.taobao.themis.kernel.page.ITMSPage r0 = r5.getTopPage()     // Catch: all -> 0x004c
        L_0x007d:
            r1 = r0
            goto L_0x0087
        L_0x007f:
            java.lang.String r1 = "TMSMegaAdapter"
            java.lang.String r2 = "getPageFromAbilityContext"
            com.taobao.themis.kernel.basic.TMSLogger.c(r1, r2, r5)
            goto L_0x007d
        L_0x0087:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.themis.inside.adapter.TMSMegaAdapter.getPageFromAbilityContext(tb.kdb):com.taobao.themis.kernel.page.ITMSPage");
    }
}
