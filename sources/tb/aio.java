package tb;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public interface aio {
    void onMiniWindowClicked();

    void sendAudioMode(int i);

    void sendEnterRoom();

    void sendError(int i, String str);

    void sendFirstRender(String str);

    void sendLeaveRoom();

    void sendNetStat(boolean z);

    void sendRemoteJoin(String str);

    void sendRemoteLeave(String str, String str2);
}
