package tb;

import android.util.Log;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamic.tempate.DinamicTemplate;
import java.io.File;
import java.lang.reflect.Constructor;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class alo extends w20 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Constructor<?> f15827a;

    static {
        t2o.a(444596359);
    }

    public alo() {
        b();
    }

    public static /* synthetic */ Object ipc$super(alo aloVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamic/parser/SDCardFileParser");
    }

    public final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        try {
            Constructor<?> constructor = Class.forName("android.content.res.XmlBlock").getConstructor(byte[].class);
            this.f15827a = constructor;
            constructor.setAccessible(true);
        } catch (Exception e) {
            Log.e("Home.FileParser", "Fail to get XmlBlock", e);
        }
    }

    public boolean c(DinamicTemplate dinamicTemplate) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d561ae6", new Object[]{this, dinamicTemplate})).booleanValue();
        }
        return new File("/sdcard/com.taobao.taobao/home", dinamicTemplate.name).exists();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x006e A[Catch: Exception -> 0x0071, TRY_LEAVE, TryCatch #1 {Exception -> 0x0071, blocks: (B:19:0x0056, B:21:0x006e), top: B:28:0x0056 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public org.xmlpull.v1.XmlPullParser d(java.lang.String r6, com.taobao.android.dinamic.tempate.DinamicTemplate r7, tb.tfw r8) {
        /*
            r5 = this;
            r6 = 0
            java.lang.String r0 = "Home.FileParser"
            java.lang.reflect.Constructor<?> r1 = r5.f15827a
            r2 = 0
            if (r1 != 0) goto L_0x0009
            return r2
        L_0x0009:
            java.lang.String r1 = r7.name
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L_0x0012
            return r2
        L_0x0012:
            java.io.File r1 = new java.io.File     // Catch: Exception -> 0x002b
            java.lang.String r3 = "/sdcard/com.taobao.taobao/home"
            java.lang.String r4 = r7.name     // Catch: Exception -> 0x002b
            r1.<init>(r3, r4)     // Catch: Exception -> 0x002b
            boolean r3 = r1.exists()     // Catch: Exception -> 0x002b
            if (r3 == 0) goto L_0x003f
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch: Exception -> 0x002b
            r3.<init>(r1)     // Catch: Exception -> 0x002b
            byte[] r1 = tb.g2d.a(r3)     // Catch: Exception -> 0x002b
            goto L_0x0040
        L_0x002b:
            r1 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Fail to read sdcard layout: "
            r3.<init>(r4)
            java.lang.String r4 = r7.name
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            android.util.Log.e(r0, r3, r1)
        L_0x003f:
            r1 = r2
        L_0x0040:
            byte[] r8 = r5.a(r1, r8)
            if (r8 == 0) goto L_0x0085
            int r1 = r8.length
            if (r1 != 0) goto L_0x004a
            goto L_0x0085
        L_0x004a:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "File parser is applied: "
            r1.<init>(r3)
            java.lang.String r3 = r7.name
            r1.append(r3)
            java.lang.reflect.Constructor<?> r1 = r5.f15827a     // Catch: Exception -> 0x0071
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: Exception -> 0x0071
            r3[r6] = r8     // Catch: Exception -> 0x0071
            java.lang.Object r8 = r1.newInstance(r3)     // Catch: Exception -> 0x0071
            java.lang.String r1 = "newParser"
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch: Exception -> 0x0071
            java.lang.Object r6 = tb.bun.b(r8, r1, r6)     // Catch: Exception -> 0x0071
            boolean r8 = r6 instanceof android.content.res.XmlResourceParser     // Catch: Exception -> 0x0071
            if (r8 == 0) goto L_0x0085
            android.content.res.XmlResourceParser r6 = (android.content.res.XmlResourceParser) r6     // Catch: Exception -> 0x0071
            return r6
        L_0x0071:
            r6 = move-exception
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r1 = "New sdcard parser exception: "
            r8.<init>(r1)
            java.lang.String r7 = r7.name
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            android.util.Log.e(r0, r7, r6)
        L_0x0085:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.alo.d(java.lang.String, com.taobao.android.dinamic.tempate.DinamicTemplate, tb.tfw):org.xmlpull.v1.XmlPullParser");
    }
}
