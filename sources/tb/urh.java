package tb;

import android.text.TextUtils;
import com.taobao.android.msoa.annotation.MSOAServiceDefinition;
import com.taobao.android.msoa.callback.MSOAServiceListener;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class urh {

    /* renamed from: a  reason: collision with root package name */
    public String f29570a;
    public final String b;
    public String c;
    public final String d;
    public final String e;
    public Map<String, Object> f;
    public final int g;
    public long h;
    public MSOAServiceListener i;
    public final String j;
    public final String k;
    public String l;
    public String m;
    public String n;
    public String o;
    public String p;

    public urh(String str, String str2, String str3, String str4, Map<String, Object> map) {
        this(str, str2, str3, str4, map, MSOAServiceDefinition.Platform.NATIVE.value());
    }

    public urh(String str, String str2, String str3, String str4, Map<String, Object> map, int i) {
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = map;
        this.g = i;
        if (TextUtils.isEmpty(str2)) {
            this.c = "1.0";
        }
        this.j = str + "@" + this.c;
        if (TextUtils.isEmpty(str4)) {
            this.k = str3;
            return;
        }
        this.k = str3 + "@" + str4;
    }
}
