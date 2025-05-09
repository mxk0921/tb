package tb;

import com.taobao.ptr.PullBase;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public interface v4n {
    int getPullDirection();

    boolean isReadyForPullEnd();

    boolean isReadyForPullStart();

    void onPullAdapterAdded(PullBase pullBase);

    void onPullAdapterRemoved(PullBase pullBase);
}
