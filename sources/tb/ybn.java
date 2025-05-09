package tb;

import android.content.Context;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.codetrack.sdk.assets.AssetsDelegate;
import java.io.IOException;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class ybn {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final ybn INSTANCE = new ybn();

    static {
        t2o.a(598737308);
    }

    public static /* synthetic */ boolean b(ybn ybnVar, Context context, String str, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7c79e88", new Object[]{ybnVar, context, str, new Integer(i), obj})).booleanValue();
        }
        if ((i & 1) != 0) {
            context = eiz.INSTANCE.a();
        }
        return ybnVar.a(context, str);
    }

    public static /* synthetic */ List d(ybn ybnVar, Context context, String str, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("37e63df8", new Object[]{ybnVar, context, str, new Integer(i), obj});
        }
        if ((i & 1) != 0) {
            context = eiz.INSTANCE.a();
        }
        if ((i & 2) != 0) {
            str = "";
        }
        return ybnVar.c(context, str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0039, code lost:
        if (r6.length == 0) goto L_0x003b;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a(android.content.Context r6, java.lang.String r7) {
        /*
            r5 = this;
            r0 = 1
            r1 = 0
            com.android.alibaba.ip.runtime.IpChange r2 = tb.ybn.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x001f
            java.lang.String r3 = "d96a5d3f"
            r4 = 3
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r1] = r5
            r4[r0] = r6
            r6 = 2
            r4[r6] = r7
            java.lang.Object r6 = r2.ipc$dispatch(r3, r4)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            return r6
        L_0x001f:
            java.lang.String r2 = "context"
            tb.ckf.g(r6, r2)
            java.lang.String r2 = "folderPath"
            tb.ckf.g(r7, r2)
            android.content.res.AssetManager r6 = r6.getAssets()
            java.lang.String r2 = "context.assets"
            tb.ckf.f(r6, r2)
            java.lang.String[] r6 = com.taobao.codetrack.sdk.assets.AssetsDelegate.proxy_list(r6, r7)     // Catch: IOException -> 0x003d
            if (r6 == 0) goto L_0x003b
            int r6 = r6.length     // Catch: IOException -> 0x003d
            if (r6 != 0) goto L_0x003c
        L_0x003b:
            r1 = 1
        L_0x003c:
            r1 = r1 ^ r0
        L_0x003d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.ybn.a(android.content.Context, java.lang.String):boolean");
    }

    public final List<String> c(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("9c1a7821", new Object[]{this, context, str});
        }
        ckf.g(context, "context");
        ckf.g(str, "assetPath");
        try {
            String[] proxy_list = AssetsDelegate.proxy_list(context.getAssets(), str);
            List<String> i0 = proxy_list == null ? null : ic1.i0(proxy_list);
            return i0 == null ? yz3.i() : i0;
        } catch (IOException e) {
            Log.e("AssetUtils", ckf.p("列出Asset目录失败: ", e.getMessage()));
            return yz3.i();
        }
    }
}
