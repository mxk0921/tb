package tb;

import android.taobao.windvane.util.MimeTypeEnum;
import android.text.TextUtils;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class lrw {

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, List<String>> f23536a;
    public final byte[] b;
    public final String c;
    public final long d;
    public final long e;
    public final long f;
    public final String g;

    static {
        t2o.a(989855770);
    }

    public lrw(String str, Map<String, List<String>> map, byte[] bArr, long j, long j2) {
        List<String> list;
        this.b = null;
        this.f = 0L;
        this.g = MimeTypeEnum.HTML.getMimeType();
        this.c = str;
        this.d = j;
        this.b = bArr;
        this.f23536a = map;
        if (map != null && map.containsKey("Content-Type") && (list = map.get("Content-Type")) != null && list.size() > 0) {
            String str2 = list.get(0);
            if (!TextUtils.isEmpty(str2)) {
                this.g = str2.split(";")[0];
            }
        }
        this.f = System.currentTimeMillis();
        this.e = j2;
    }
}
