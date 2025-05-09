package tb;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public interface t1c extends qod {
    void addChangeVersionListener(s1c s1cVar);

    void doChangeVersion(s78 s78Var, t7l t7lVar);

    boolean isSpecifyVersionCode(String str);

    void onVersionResponse(t78 t78Var);

    a3w queryCurrentVersionInfo();

    void removeChangeVersionListener(s1c s1cVar);
}
