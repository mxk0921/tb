package tb;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.taobao.login4android.broadcast.LoginAction;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public interface f8e {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public interface a {
        void a(f8e f8eVar);

        void b(f8e f8eVar);
    }

    void b();

    boolean c();

    void d(Fragment fragment);

    boolean e();

    boolean f(int i, KeyEvent keyEvent);

    kmb g();

    Activity getActivity();

    String getUTPageName();

    void h();

    void i(LoginAction loginAction);

    boolean isDestroy();

    boolean isResumed();

    boolean isSupportVisible();

    hmb j();

    void onActivityResult(int i, int i2, Intent intent);

    void onCreate(Bundle bundle);

    View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle);

    void onDestroy();

    void onDestroyView();

    void onNewIntent(Intent intent);

    void onPause();

    void onResume();

    void onStart();

    void onStop();

    void onViewCreated(View view, Bundle bundle);

    void onVisible();

    void setInstanceId(String str);
}
