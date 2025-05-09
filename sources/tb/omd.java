package tb;

import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public interface omd<FROM, TO> {
    public static final String TAB_NAME_DEFAULT = "default";

    List<String> a(String str);

    boolean b(String str, String str2, String... strArr);

    void c(rmd<FROM, TO> rmdVar);

    List<String> d(String str, String str2);

    boolean isInit();
}
