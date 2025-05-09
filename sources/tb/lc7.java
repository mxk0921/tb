package tb;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public interface lc7<T> {
    void addAsDependencyToAllInitialNodes(T t);

    void addAsDependentOnAllLeafNodes(T t);

    void addDependency(T t, T t2);

    void addIndependent(T t);
}
