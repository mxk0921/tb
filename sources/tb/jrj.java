package tb;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public interface jrj {
    boolean acceptNestedFling(int i);

    boolean acceptNestedScroll(int i);

    boolean dispatchNestedFling(int i);

    boolean dispatchNestedScroll(int i);

    void onParentScrollStatusChange(int i);

    void onParentScrolled(int i, int i2);

    void onScrolledByNestedParent(lrj lrjVar);
}
