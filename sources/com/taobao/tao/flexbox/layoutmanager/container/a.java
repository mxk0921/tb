package com.taobao.tao.flexbox.layoutmanager.container;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* renamed from: com.taobao.tao.flexbox.layoutmanager.container.a$a  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface AbstractC0688a {
        boolean a(boolean z);

        void b(Map map);

        void c(MainDexContainerFragment mainDexContainerFragment);

        void d(String str, Uri uri);

        ViewGroup getView();

        void onActivityResult(int i, int i2, Intent intent);

        void onAttach(Context context);

        void onCreate(Bundle bundle);

        void onCurrentTabClicked();

        void onDetach();

        void onPause();

        void onResume();

        void onStart();

        void onStop();
    }

    static {
        t2o.a(502268252);
    }

    public static AbstractC0688a a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AbstractC0688a) ipChange.ipc$dispatch("c9311ee3", new Object[0]);
        }
        return new NativeTab2Container();
    }
}
