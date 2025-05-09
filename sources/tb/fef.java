package tb;

import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class fef implements z1w<Integer> {
    public static final fef INSTANCE = new fef();

    /* renamed from: b */
    public Integer a(JsonReader jsonReader, float f) throws IOException {
        return Integer.valueOf(Math.round(cxf.g(jsonReader) * f));
    }
}
