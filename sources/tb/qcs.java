package tb;

import android.content.Intent;
import android.graphics.Bitmap;
import android.view.View;
import com.alibaba.fastjson.JSON;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public interface qcs {
    void D0(String str, String str2, JSON json);

    void P(String str, JSON json);

    void X0(String str, JSON json);

    void destroy();

    String f();

    View getView();

    void i0(String str, Object obj);

    Bitmap l();

    void n(String str, String str2);

    void onActivityResult(int i, int i2, Intent intent);

    void onPause();

    void onResume();

    void onStart();

    void onStop();

    void onViewAppear();

    void onViewDisappear();

    void r(byte[] bArr, String str);

    void reload(pcs pcsVar);

    void s();
}
