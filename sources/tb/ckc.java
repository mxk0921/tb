package tb;

import com.alibaba.fastjson.JSONObject;
import com.taobao.bootimage.data.BootImageInfo;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public interface ckc {
    void onCreateView(BootImageInfo bootImageInfo, ei2 ei2Var, int i);

    void onDownload(List<JSONObject> list, int i);

    void onStart(List<JSONObject> list, int i);

    void onTerminate(int i, int i2, int i3);

    void onViewShown(ei2 ei2Var, int i);
}
