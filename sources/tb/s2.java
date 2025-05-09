package tb;

import android.content.Context;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class s2 {
    public InputStream b;

    /* renamed from: a  reason: collision with root package name */
    public final p2 f27749a = p2.UNKNOWN;
    public final Map<String, String> c = new HashMap();
    public final List<ddp> d = new ArrayList();

    public r2 a(Context context) {
        return new uwx(context, null, this.f27749a, this.b, this.c, this.d, null);
    }

    public s2 b(InputStream inputStream) {
        this.b = inputStream;
        return this;
    }
}
