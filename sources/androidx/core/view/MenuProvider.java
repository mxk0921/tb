package androidx.core.view;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public interface MenuProvider {
    void onCreateMenu(Menu menu, MenuInflater menuInflater);

    void onMenuClosed(Menu menu);

    boolean onMenuItemSelected(MenuItem menuItem);

    void onPrepareMenu(Menu menu);
}
