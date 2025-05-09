package tb;

import android.content.DialogInterface;
import android.view.View;
import com.alibaba.fastjson.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public interface gkc {
    void b(JSONObject jSONObject, int i);

    void c(Object[] objArr);

    void d(JSONObject jSONObject, View view);

    void e(JSONObject jSONObject, View view);

    void onDismiss(DialogInterface dialogInterface);

    void onPageScrollStateChanged(int i);

    void onPageScrolled(int i, float f, int i2);

    void onShow(DialogInterface dialogInterface);
}
