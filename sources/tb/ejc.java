package tb;

import com.taobao.android.label.LabelData;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public interface ejc {
    void enableMove(boolean z);

    @Deprecated
    void enableMoveToOutSide(boolean z);

    void enableRotate(boolean z);

    boolean rotateLabel();

    <T extends LabelData> void updateLabel(T t);
}
