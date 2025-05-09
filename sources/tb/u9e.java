package tb;

import android.view.View;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public interface u9e {
    boolean hasArrivedBottomEdge();

    boolean hasArrivedTopEdge();

    void keepBottom();

    void keepTop();

    void removeFooterView(View view);

    void removeHeaderView(View view);

    void setFooterView(View view);

    void setHeadView(View view);

    void trigger();
}
