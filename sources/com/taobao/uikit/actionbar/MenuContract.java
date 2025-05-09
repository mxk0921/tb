package com.taobao.uikit.actionbar;

import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class MenuContract {
    public static final int CUSTOMS = 2;
    public static final int DEFAULT = 1;
    public static final int SHARE = 0;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface ActionBarBasePresenter {
        void close();

        void notifyMenuChanged();

        void pause();

        void show(TBActionView tBActionView);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface ActionBarBaseView {
        void addMenuAdapter(int i, PublicMenuAdapterV2 publicMenuAdapterV2);

        void close();

        void notifyMenuChanged();

        void onPause();

        void registerOnDismissListener(OnDismissListener onDismissListener);

        void show(TBActionView tBActionView);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface OnDismissListener {
        void onDismiss(ActionBarBaseView actionBarBaseView);
    }

    static {
        t2o.a(927989774);
    }
}
