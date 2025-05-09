package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class cuj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f17330a;
    public final int b;
    public final HashMap<String, String> c;
    public final String d;
    public final String e;

    static {
        t2o.a(996147211);
    }

    public cuj(String str, int i, HashMap<String, String> hashMap, String str2, String str3) {
        this.f17330a = str;
        this.b = i;
        this.c = hashMap;
        this.d = str2;
        this.e = str3;
    }

    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d09a5221", new Object[]{this});
        }
        return this.e;
    }

    public HashMap<String, String> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("2c5cf76d", new Object[]{this});
        }
        return this.c;
    }

    public int c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5e838025", new Object[]{this})).intValue();
        }
        return this.b;
    }

    public String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9afc202f", new Object[]{this});
        }
        return this.d;
    }

    public String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("de8f0660", new Object[]{this});
        }
        return this.f17330a;
    }
}
