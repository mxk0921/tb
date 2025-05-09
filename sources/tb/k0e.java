package tb;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.ui.media.playercontrol.PlayerController2;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public interface k0e extends mmh {
    void f(TBLiveDataModel tBLiveDataModel, String str, String str2);

    PlayerController2 g();

    View getContentView();

    void j(String str, Context context, boolean z, boolean z2, bxl bxlVar, String str2, String str3, fxa fxaVar, ux9 ux9Var);

    void v(ViewGroup.LayoutParams layoutParams);

    void w(int i);

    void y();

    void z(FrameLayout.LayoutParams layoutParams, String str);
}
