package tb;

import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.taobao.taolive.sdk.core.interfaces.ISmallWindowStrategy;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public interface jyd extends y3d {
    Map<String, String> D(String str);

    String E();

    void H();

    void J();

    boolean d();

    void e(View.OnClickListener onClickListener);

    boolean g();

    cba getGlobalContext();

    RecyclerView getRecyclerView();

    ViewGroup getView();

    void h(boolean z);

    void i(utk utkVar);

    boolean isDestroyed();

    void j(boolean z);

    void k(boolean z);

    void o(u0v u0vVar);

    void onConfigurationChanged(Configuration configuration);

    void onCreate();

    void onDestroy();

    boolean onKeyDown(int i, KeyEvent keyEvent);

    void onLowMemory();

    void onPause();

    void onResume();

    void onStart();

    void onStop();

    void onStop(boolean z);

    void onTrimMemory(int i);

    void r();

    View s(boolean z);

    void setSmallWindowClickListener(ISmallWindowStrategy iSmallWindowStrategy);

    void t(Uri uri, boolean z, boolean z2);

    void u();

    void v(View.OnClickListener onClickListener);

    void x();

    void y(Intent intent, boolean z);

    void z(muk mukVar);
}
