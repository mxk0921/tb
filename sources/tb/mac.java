package tb;

import android.view.ViewGroup;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public interface mac {
    BaseFrame getFrame();

    void hide();

    void setContainer(ViewGroup viewGroup, ViewGroup viewGroup2);

    void setFrameEventListener(oac oacVar);

    void show(boolean z, HashMap<String, String> hashMap, long j, boolean z2);
}
