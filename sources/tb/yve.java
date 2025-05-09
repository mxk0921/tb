package tb;

import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public interface yve {
    void addChild(yve yveVar);

    List<yve> children();

    String getName();

    long getSize();

    boolean isDirectory();

    yve parent();

    String path();

    void setSize(long j);

    int type();
}
