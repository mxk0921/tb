package cn.wh.auth.server;

import android.app.Activity;
import android.app.FragmentManager;
import android.content.Intent;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    public final OnWHResultDispatcherFragment f1841a;

    /* compiled from: Taobao */
    /* renamed from: cn.wh.auth.server.a$a  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public interface AbstractC0024a {
        void onActivityResult(int i, int i2, Intent intent);
    }

    public a(Activity activity) {
        this.f1841a = b(activity);
    }

    public final OnWHResultDispatcherFragment a(FragmentManager fragmentManager) {
        return (OnWHResultDispatcherFragment) fragmentManager.findFragmentByTag(OnWHResultDispatcherFragment.TAG);
    }

    public final OnWHResultDispatcherFragment b(Activity activity) {
        FragmentManager fragmentManager = activity.getFragmentManager();
        OnWHResultDispatcherFragment a2 = a(fragmentManager);
        if (a2 != null) {
            return a2;
        }
        OnWHResultDispatcherFragment onWHResultDispatcherFragment = new OnWHResultDispatcherFragment();
        fragmentManager.beginTransaction().add(onWHResultDispatcherFragment, OnWHResultDispatcherFragment.TAG).commitAllowingStateLoss();
        fragmentManager.executePendingTransactions();
        return onWHResultDispatcherFragment;
    }

    public void c(Intent intent, AbstractC0024a aVar) {
        this.f1841a.a(intent, aVar);
    }
}
