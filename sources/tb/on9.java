package tb;

import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class on9 implements z1w<Float> {
    public static final on9 INSTANCE = new on9();

    /* renamed from: b */
    public Float a(JsonReader jsonReader, float f) throws IOException {
        return Float.valueOf(cxf.g(jsonReader) * f);
    }
}
