package tb;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public interface hed {
    boolean isEnablePullReFresh();

    boolean isEnableToSecondFloor();

    void onEnterPullSecondFloor();

    void onExitPullSecondFloor();

    void onPullDistance(int i);

    void onPullRefresh();

    void onRefreshStateChanged(String str, String str2);
}
