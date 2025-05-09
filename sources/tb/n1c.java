package tb;

import java.util.LinkedList;
import java.util.List;
import tb.kon;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public interface n1c {
    public static final int WITHOUT_COLLECTION_CONTENT_ORDER = -1;

    boolean dynamicRecommend(aon aonVar);

    LinkedList<kon.h> getFeedbackList();

    boolean reOrderTailUnExposeList(List<String> list);

    void updateNoDynamicRecContents(String str, boolean z);
}
