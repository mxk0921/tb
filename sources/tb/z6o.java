package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.remoteso.index.SoIndexData;
import com.taobao.android.remoteso.index.SoInfo2;
import com.taobao.android.remoteso.log.RSoLog;
import java.lang.reflect.Array;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class z6o {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final String[][] g;

    /* renamed from: a  reason: collision with root package name */
    public final String f32574a;
    public final SoIndexData.SoFileInfo b;
    public final SoInfo2 c;
    public final unq e;
    public volatile String d = "default";
    public boolean f = false;

    public z6o(String str, SoIndexData.SoFileInfo soFileInfo, SoInfo2 soInfo2) {
        this.f32574a = str;
        this.b = soFileInfo;
        this.c = soInfo2;
        this.e = new unq(str);
    }

    public static z6o i(String str, SoIndexData.SoFileInfo soFileInfo, SoInfo2 soInfo2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (z6o) ipChange.ipc$dispatch("6665ed81", new Object[]{str, soFileInfo, soInfo2});
        }
        return new z6o(str, soFileInfo, soInfo2);
    }

    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("df3302d9", new Object[]{this});
        }
        return this.b.getFrom();
    }

    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3ff65cbf", new Object[]{this});
        }
        return this.f32574a;
    }

    public String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("91115b1", new Object[]{this});
        }
        return this.b.getMd5();
    }

    public String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2fd687a", new Object[]{this});
        }
        return this.d;
    }

    public unq f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (unq) ipChange.ipc$dispatch("ad786fd3", new Object[]{this});
        }
        return this.e;
    }

    public String g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4afdd683", new Object[]{this});
        }
        return this.b.getUri();
    }

    public boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("eefe0183", new Object[]{this})).booleanValue();
        }
        return this.f;
    }

    public SoIndexData.SoFileInfo j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SoIndexData.SoFileInfo) ipChange.ipc$dispatch("1a38954c", new Object[]{this});
        }
        return this.b;
    }

    public SoInfo2 k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SoInfo2) ipChange.ipc$dispatch("22c40e48", new Object[]{this});
        }
        return this.c;
    }

    public void l(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c89c326d", new Object[]{this, new Boolean(z)});
        } else {
            this.f = z;
        }
    }

    public void m(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9883ca4", new Object[]{this, str});
        } else {
            this.d = str;
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "ResolveReq2{libName='" + this.f32574a + "', soFileInfo=" + this.b + ", soInfo2=" + this.c + '}';
    }

    static {
        String[][] strArr = (String[][]) Array.newInstance(String.class, 8, 2);
        g = strArr;
        strArr[0][0] = "O1CN-v7alibucheif.so";
        strArr[0][1] = "libucheif.so";
        String[] strArr2 = strArr[1];
        strArr2[0] = "O1CN-v8libucheif.so";
        strArr2[1] = "libucheif.so";
        String[] strArr3 = strArr[2];
        strArr3[0] = "O1CN-v7alibucheif_alpha.so";
        strArr3[1] = "libucheif_alpha.so";
        String[] strArr4 = strArr[3];
        strArr4[0] = "O1CN-v8alibucheif_alpha.so";
        strArr4[1] = "libucheif_alpha.so";
        String[] strArr5 = strArr[4];
        strArr5[0] = "O1CN-v7alibpexavif.so";
        strArr5[1] = "libpexavif.so";
        String[] strArr6 = strArr[5];
        strArr6[0] = "O1CN-v8alibpexavif.so";
        strArr6[1] = "libpexavif.so";
        String[] strArr7 = strArr[6];
        strArr7[0] = "O1CN-v1-v7alibucheif_alpha.so";
        strArr7[1] = "libucheif_alpha.so";
        String[] strArr8 = strArr[7];
        strArr8[0] = "O1CN-v1-v8alibucheif_alpha.so";
        strArr8[1] = "libucheif_alpha.so";
    }

    public String c() {
        String[][] strArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("145bf97d", new Object[]{this});
        }
        String d = uos.d(this.b.getUri());
        for (String[] strArr2 : g) {
            if (trq.d(strArr2[0], d)) {
                RSoLog.d("req2 -> hit fileNameMapping , use " + strArr2[1]);
                return strArr2[1];
            }
        }
        return d;
    }
}
