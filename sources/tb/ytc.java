package tb;

import android.view.View;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public interface ytc extends kcc {
    public static final String TYPE_FOLD = "fold";
    public static final String TYPE_HALF_STICKY = "halfSticky";
    public static final String TYPE_HALF_STICKY_SEARCHBAR = "halfStickyBar";
    public static final String TYPE_LIST = "list";
    public static final String TYPE_STICKY = "sticky";

    int f();

    int getHeight();

    View getView();

    boolean p();

    boolean q();
}
