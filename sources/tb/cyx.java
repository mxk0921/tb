package tb;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public interface cyx<T> {
    void onComplete();

    void onError(Throwable th);

    void onNext(T t);

    void onSubscribe(tzx tzxVar);
}
