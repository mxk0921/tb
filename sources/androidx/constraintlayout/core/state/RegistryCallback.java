package androidx.constraintlayout.core.state;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public interface RegistryCallback {
    String currentLayoutInformation();

    String currentMotionScene();

    long getLastModified();

    void onDimensions(int i, int i2);

    void onNewMotionScene(String str);

    void onProgress(float f);

    void setDrawDebug(int i);

    void setLayoutInformationMode(int i);
}
