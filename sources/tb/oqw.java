package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.UnsupportedEncodingException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class oqw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final char DIVISION = '~';

    /* renamed from: a  reason: collision with root package name */
    public long f25584a;
    public long b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public long h;
    public boolean i = true;

    static {
        t2o.a(989855766);
    }

    public byte[] a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("28fe01c1", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder();
        long j = this.f25584a;
        if (j > 0) {
            sb.append(j);
        } else {
            sb.append("0000000000000");
        }
        if (this.i) {
            sb.append(DIVISION);
        } else {
            sb.append('_');
        }
        long j2 = this.b;
        if (j2 > 0) {
            sb.append(j2);
        } else {
            sb.append("0000000000000");
        }
        if (this.i) {
            sb.append(DIVISION);
        } else {
            sb.append('_');
        }
        String str = this.c;
        if (str == null) {
            sb.append("");
        } else {
            sb.append(str);
        }
        if (this.i) {
            sb.append(DIVISION);
        } else {
            sb.append('_');
        }
        String str2 = this.e;
        if (str2 == null) {
            sb.append("");
        } else {
            sb.append(str2);
        }
        if (this.i) {
            sb.append(DIVISION);
        } else {
            sb.append('_');
        }
        String str3 = this.d;
        if (str3 == null) {
            sb.append("");
        } else {
            sb.append(str3);
        }
        if (this.i) {
            sb.append(DIVISION);
        } else {
            sb.append('_');
        }
        String str4 = this.f;
        if (str4 == null) {
            sb.append("");
        } else {
            sb.append(str4);
        }
        if (this.i) {
            sb.append(DIVISION);
        } else {
            sb.append('_');
        }
        if (TextUtils.isEmpty(this.g)) {
            sb.append("utf-8");
        } else {
            sb.append(this.g);
        }
        if (v7t.h()) {
            v7t.a("FileInfo", "composeFileInfoStr:" + ((Object) sb));
        }
        try {
            return sb.toString().getBytes("UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return null;
        }
    }

    public oqw b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (oqw) ipChange.ipc$dispatch("ab197bec", new Object[]{this});
        }
        if (oqw.class.equals(oqw.class)) {
            return this;
        }
        oqw oqwVar = new oqw();
        oqwVar.f25584a = this.f25584a;
        oqwVar.b = this.b;
        oqwVar.c = this.c;
        oqwVar.d = this.d;
        oqwVar.e = this.e;
        oqwVar.f = this.f;
        oqwVar.g = this.g;
        oqwVar.h = this.h;
        oqwVar.i = this.i;
        return oqwVar;
    }
}
