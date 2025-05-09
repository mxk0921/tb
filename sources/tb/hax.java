package tb;

import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public interface hax {
    View a(int i, View view, ViewGroup viewGroup);

    int b();

    View c(View view, ViewGroup viewGroup);

    void registerDataSetObserver(DataSetObserver dataSetObserver);

    void unregisterDataSetObserver(DataSetObserver dataSetObserver);
}
