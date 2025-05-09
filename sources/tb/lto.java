package tb;

import android.util.LruCache;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class lto {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final LruCache<String, String> f23560a = new LruCache<>(20);

    static {
        t2o.a(625999895);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean a(java.lang.String r8, java.lang.String r9) {
        /*
            r0 = 1
            r1 = 0
            com.android.alibaba.ip.runtime.IpChange r2 = tb.lto.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x001c
            java.lang.String r3 = "ace4dcc2"
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r1] = r8
            r4[r0] = r9
            java.lang.Object r8 = r2.ipc$dispatch(r3, r4)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            return r8
        L_0x001c:
            boolean r2 = android.text.TextUtils.isEmpty(r9)
            if (r2 == 0) goto L_0x002a
            java.lang.String r8 = "SceneMatcher.paramFilter is empty,check success."
            java.lang.Object[] r9 = new java.lang.Object[r1]
            tb.wdm.d(r8, r9)
            return r0
        L_0x002a:
            boolean r2 = android.text.TextUtils.isEmpty(r8)
            java.lang.String r3 = "}"
            java.lang.String r4 = ""
            java.lang.String r5 = "configCheck"
            if (r2 == 0) goto L_0x004c
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r0 = "SceneMatcher.curUrl is empty,check fail.paramFilter{"
            r8.<init>(r0)
            r8.append(r9)
            r8.append(r3)
            java.lang.String r8 = r8.toString()
            tb.wdm.g(r5, r4, r8)
            return r1
        L_0x004c:
            r2 = 0
            android.util.LruCache<java.lang.String, java.lang.String> r6 = tb.lto.f23560a     // Catch: all -> 0x0067
            java.lang.Object r7 = r6.get(r8)     // Catch: all -> 0x0067
            java.lang.String r7 = (java.lang.String) r7     // Catch: all -> 0x0067
            boolean r2 = android.text.TextUtils.isEmpty(r7)     // Catch: all -> 0x0066
            if (r2 == 0) goto L_0x0071
            java.lang.String r2 = "utf-8"
            java.lang.String r2 = java.net.URLDecoder.decode(r8, r2)     // Catch: all -> 0x0066
            r6.put(r8, r2)     // Catch: all -> 0x0067
            goto L_0x0070
        L_0x0066:
            r2 = r7
        L_0x0067:
            java.lang.String r6 = "SceneMatcher.currentParam:{%s} decode failed"
            java.lang.Object[] r7 = new java.lang.Object[r0]
            r7[r1] = r8
            tb.wdm.d(r6, r7)
        L_0x0070:
            r7 = r2
        L_0x0071:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r2 = "SceneMatcher.after decode:currentParam:{"
            r8.<init>(r2)
            r8.append(r7)
            java.lang.String r2 = "},paramFilter{"
            r8.append(r2)
            r8.append(r9)
            r8.append(r3)
            java.lang.String r8 = r8.toString()
            tb.wdm.g(r5, r4, r8)
            if (r7 != 0) goto L_0x00a5
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r0 = "SceneMatcher.miss.currentParam == null.notContains.paramContain"
            r8.<init>(r0)
            r8.append(r9)
            r8.append(r3)
            java.lang.String r8 = r8.toString()
            tb.wdm.g(r5, r4, r8)
            return r1
        L_0x00a5:
            int r8 = r9.length()
            java.lang.String r1 = "."
            if (r8 <= r0) goto L_0x00dd
            java.lang.String r8 = "@"
            boolean r2 = r9.startsWith(r8)
            if (r2 == 0) goto L_0x00dd
            boolean r8 = r9.endsWith(r8)
            if (r8 == 0) goto L_0x00dd
            int r8 = r9.length()
            int r8 = r8 - r0
            java.lang.String r8 = r9.substring(r0, r8)
            boolean r8 = tb.mem.a(r8, r7)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r0 = "SceneMatcher.byRegex.match="
            r9.<init>(r0)
            r9.append(r8)
            r9.append(r1)
            java.lang.String r9 = r9.toString()
            tb.wdm.g(r5, r4, r9)
            return r8
        L_0x00dd:
            boolean r8 = r7.contains(r9)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r0 = "SceneMatcher.byContains.match="
            r9.<init>(r0)
            r9.append(r8)
            r9.append(r1)
            java.lang.String r9 = r9.toString()
            tb.wdm.g(r5, r4, r9)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.lto.a(java.lang.String, java.lang.String):boolean");
    }
}
