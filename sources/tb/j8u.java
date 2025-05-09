package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.nio.charset.Charset;
import org.json.JSONObject;

/* compiled from: Taobao */
@Deprecated
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class j8u {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final char[] f21837a = "0123456789abcdef".toCharArray();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final JSONObject f21838a;
        public final String b;
        public final String c;
        public final String d;

        public a(JSONObject jSONObject, String str, String str2, String str3) {
            this.f21838a = jSONObject;
            this.b = str;
            this.c = str2;
            this.d = str3;
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return "<TplCdnDownloadItem id=" + this.b + " url=" + this.c + " hash=" + this.d + ">";
        }
    }

    public static byte[] a(String str) throws RuntimeException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("81233aeb", new Object[]{str});
        }
        char[] charArray = str.toCharArray();
        if (charArray.length == 32) {
            char[] cArr = new char[32];
            System.arraycopy(charArray, 0, cArr, 16, 16);
            System.arraycopy(charArray, 16, cArr, 0, 16);
            char c = charArray[1];
            char[] cArr2 = new char[32];
            for (int i = 0; i < 32; i++) {
                cArr2[i] = f21837a[(cArr[i] ^ c) % 16];
            }
            char c2 = cArr2[1];
            for (int i2 = 0; i2 < 32; i2++) {
                cArr2[i2] = f21837a[(cArr2[i2] ^ c2) % 16];
            }
            char[] cArr3 = new char[16];
            System.arraycopy(cArr2, 8, cArr3, 0, 16);
            return new String(cArr3).getBytes(Charset.forName("UTF-8"));
        }
        throw new RuntimeException("Wrong hash length: " + charArray.length);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0263 A[LOOP:3: B:93:0x025d->B:95:0x0263, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0298  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object[] b(android.content.Context r20, tb.v1e r21, java.util.Map<java.lang.String, java.lang.String> r22) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 717
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.j8u.b(android.content.Context, tb.v1e, java.util.Map):java.lang.Object[]");
    }
}
