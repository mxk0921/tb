package com.taobao.tao.tbmainfragment;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.taobao.tao.tbmainfragment.anim.FragmentAnimator;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import tb.pxq;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public interface ISupportFragment {
    public static final int RESULT_OK = -1;
    public static final int SINGLETASK = 2;
    public static final int SINGLETOP = 1;
    public static final int STANDARD = 0;

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public @interface LaunchMode {
    }

    Fragment asFragment();

    pxq getSupportDelegate();

    boolean isSupportVisible();

    FragmentAnimator onCreateFragmentAnimator();

    void onNewBundle(Bundle bundle);

    void onSupportInvisible();

    void onSupportVisible();
}
