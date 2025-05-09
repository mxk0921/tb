package tb;

import android.text.TextUtils;
import anet.channel.util.HttpConstant;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class z5b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final String[] f32550a = {"img.alicdn.com", "gw.alicdn.com", "mdn.alicdn.com", "picasso.alicdn.com", "cbu01.alicdn.com"};

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0079, code lost:
        if (r3 != false) goto L_0x007b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0080, code lost:
        if (com.taobao.analysis.scene.SceneIdentifier.getDeviceLevel() == 3) goto L_0x0082;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0082, code lost:
        r8 = "_960x960q75.jpg";
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.util.Pair<java.lang.String, java.lang.Boolean> a(java.lang.String r8) {
        /*
            r0 = 0
            r1 = 1
            com.android.alibaba.ip.runtime.IpChange r2 = tb.z5b.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x0015
            java.lang.String r3 = "518e6af6"
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r0] = r8
            java.lang.Object r8 = r2.ipc$dispatch(r3, r1)
            android.util.Pair r8 = (android.util.Pair) r8
            return r8
        L_0x0015:
            android.util.Pair r2 = new android.util.Pair
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            r2.<init>(r8, r3)
            boolean r3 = android.text.TextUtils.isEmpty(r8)
            if (r3 != 0) goto L_0x00be
            java.lang.String r3 = ".jpg"
            boolean r3 = r8.endsWith(r3)
            if (r3 == 0) goto L_0x00be
            java.lang.String r3 = "-cib"
            boolean r3 = r8.contains(r3)
            if (r3 == 0) goto L_0x0034
            goto L_0x00be
        L_0x0034:
            java.lang.String r3 = b(r8)     // Catch: all -> 0x00be
            java.lang.String[] r4 = tb.z5b.f32550a     // Catch: all -> 0x00be
        L_0x003a:
            r5 = 5
            if (r0 >= r5) goto L_0x00be
            r5 = r4[r0]     // Catch: all -> 0x00be
            boolean r6 = android.text.TextUtils.equals(r5, r3)     // Catch: all -> 0x00be
            if (r6 == 0) goto L_0x00bb
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: all -> 0x00be
            r0.<init>(r8)     // Catch: all -> 0x00be
            int r1 = r0.indexOf(r5)     // Catch: all -> 0x00be
            java.lang.String r3 = ".jpg_"
            boolean r3 = r8.contains(r3)     // Catch: all -> 0x00be
            java.lang.String r4 = "_.heic"
            java.lang.String r6 = "heic.alicdn.com"
            if (r3 != 0) goto L_0x0098
            java.lang.String r3 = ".png_"
            boolean r8 = r8.contains(r3)     // Catch: all -> 0x00be
            if (r8 == 0) goto L_0x0063
            goto L_0x0098
        L_0x0063:
            java.lang.String r8 = "_1200x1200q90.jpg"
            tb.s0m r3 = tb.s0m.B()     // Catch: all -> 0x00be
            boolean r3 = r3.Y()     // Catch: all -> 0x00be
            if (r3 == 0) goto L_0x0084
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch: all -> 0x00be
            r7 = 23
            if (r3 < r7) goto L_0x007b
            boolean r3 = tb.zsw.a()     // Catch: all -> 0x00be
            if (r3 == 0) goto L_0x0082
        L_0x007b:
            int r3 = com.taobao.analysis.scene.SceneIdentifier.getDeviceLevel()     // Catch: all -> 0x00be
            r7 = 3
            if (r3 != r7) goto L_0x0084
        L_0x0082:
            java.lang.String r8 = "_960x960q75.jpg"
        L_0x0084:
            int r3 = r5.length()     // Catch: all -> 0x00be
            int r3 = r3 + r1
            java.lang.StringBuilder r0 = r0.replace(r1, r3, r6)     // Catch: all -> 0x00be
            r0.append(r8)     // Catch: all -> 0x00be
            r0.append(r4)     // Catch: all -> 0x00be
            java.lang.String r8 = r0.toString()     // Catch: all -> 0x00be
            goto L_0x00b2
        L_0x0098:
            tb.s0m r8 = tb.s0m.B()     // Catch: all -> 0x00be
            boolean r8 = r8.O()     // Catch: all -> 0x00be
            if (r8 != 0) goto L_0x00ba
            int r8 = r5.length()     // Catch: all -> 0x00be
            int r8 = r8 + r1
            java.lang.StringBuilder r8 = r0.replace(r1, r8, r6)     // Catch: all -> 0x00be
            r8.append(r4)     // Catch: all -> 0x00be
            java.lang.String r8 = r8.toString()     // Catch: all -> 0x00be
        L_0x00b2:
            android.util.Pair r0 = new android.util.Pair     // Catch: all -> 0x00be
            java.lang.Boolean r1 = java.lang.Boolean.TRUE     // Catch: all -> 0x00be
            r0.<init>(r8, r1)     // Catch: all -> 0x00be
            return r0
        L_0x00ba:
            return r2
        L_0x00bb:
            int r0 = r0 + r1
            goto L_0x003a
        L_0x00be:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.z5b.a(java.lang.String):android.util.Pair");
    }

    public static boolean c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6fbf2a7a", new Object[]{str})).booleanValue();
        }
        String b = b(str);
        String[] strArr = f32550a;
        for (int i = 0; i < 5; i++) {
            if (TextUtils.equals(strArr[i], b)) {
                return true;
            }
        }
        return false;
    }

    public static String b(String str) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("18d3b662", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if (str.startsWith(itw.URL_SEPARATOR)) {
            i = 2;
        } else {
            int indexOf = str.indexOf(HttpConstant.SCHEME_SPLIT);
            if (indexOf >= 0) {
                i = indexOf + 3;
            }
        }
        if (i >= str.length()) {
            return "";
        }
        int indexOf2 = str.indexOf(47, i);
        if (indexOf2 < 0) {
            indexOf2 = str.length();
        }
        String substring = str.substring(i, indexOf2);
        return (substring.contains("{") || substring.contains(",") || !substring.contains(".")) ? "" : substring;
    }
}
