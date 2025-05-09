package tb;

import android.app.Activity;
import android.content.Intent;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.taobao.android.purchase.aura.ability.AbilityParams;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public interface nud extends jud, lud {
    void F(FragmentActivity fragmentActivity);

    void N1(FragmentActivity fragmentActivity, int i, int i2, Intent intent);

    void P0(Activity activity);

    void V(FragmentActivity fragmentActivity);

    void c1(FragmentActivity fragmentActivity, ViewGroup viewGroup);

    void f0();

    String getBizId();

    AbilityParams getPopConfig();

    void lazyInit();

    void m2();

    void t2(FragmentActivity fragmentActivity);
}
