package tb;

import com.airbnb.lottie.model.content.MergePaths;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.taobao.media.MediaConstant;
import java.io.IOException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class ami {

    /* renamed from: a  reason: collision with root package name */
    public static final JsonReader.a f15835a = JsonReader.a.a("nm", "mm", MediaConstant.DEFINITION_HD);

    public static MergePaths a(JsonReader jsonReader) throws IOException {
        String str = null;
        MergePaths.MergePathsMode mergePathsMode = null;
        boolean z = false;
        while (jsonReader.F()) {
            int C0 = jsonReader.C0(f15835a);
            if (C0 == 0) {
                str = jsonReader.i0();
            } else if (C0 == 1) {
                mergePathsMode = MergePaths.MergePathsMode.forId(jsonReader.c0());
            } else if (C0 != 2) {
                jsonReader.D0();
                jsonReader.E0();
            } else {
                z = jsonReader.L();
            }
        }
        return new MergePaths(str, mergePathsMode, z);
    }
}
