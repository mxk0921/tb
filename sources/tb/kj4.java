package tb;

import androidx.exifinterface.media.ExifInterface;
import java.io.File;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public interface kj4 {
    public static final String DATABASE_PATH;
    public static final String MODEL_PATH;
    public static final String PYTHON_PATH;
    public static final String ROOT_PATH;

    static {
        StringBuilder sb = new StringBuilder();
        String str = File.separator;
        sb.append(str);
        sb.append("DAI");
        String sb2 = sb.toString();
        ROOT_PATH = sb2;
        MODEL_PATH = sb2 + str + ExifInterface.TAG_MODEL;
        DATABASE_PATH = sb2 + str + "Database";
        PYTHON_PATH = sb2 + str + "Utlink";
    }
}
