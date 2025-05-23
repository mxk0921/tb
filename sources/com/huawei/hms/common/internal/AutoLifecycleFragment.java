package com.huawei.hms.common.internal;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;
import android.util.SparseArray;
import com.huawei.hms.api.HuaweiApiClient;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class AutoLifecycleFragment extends Fragment {

    /* renamed from: a  reason: collision with root package name */
    private final SparseArray<a> f5305a = new SparseArray<>();
    private boolean b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final HuaweiApiClient f5306a;
        protected final int b;

        public a(int i, HuaweiApiClient huaweiApiClient) {
            this.f5306a = huaweiApiClient;
            this.b = i;
        }

        public void a() {
            this.f5306a.disconnect();
        }
    }

    public static AutoLifecycleFragment getInstance(Activity activity) {
        Preconditions.checkMainThread("Must be called on the main thread");
        try {
            AutoLifecycleFragment autoLifecycleFragment = (AutoLifecycleFragment) activity.getFragmentManager().findFragmentByTag("HmsAutoLifecycleFrag");
            FragmentManager fragmentManager = activity.getFragmentManager();
            if (autoLifecycleFragment != null) {
                return autoLifecycleFragment;
            }
            AutoLifecycleFragment autoLifecycleFragment2 = new AutoLifecycleFragment();
            fragmentManager.beginTransaction().add(autoLifecycleFragment2, "HmsAutoLifecycleFrag").commitAllowingStateLoss();
            fragmentManager.executePendingTransactions();
            return autoLifecycleFragment2;
        } catch (ClassCastException e) {
            throw new IllegalStateException("Fragment with tag HmsAutoLifecycleFrag is not a AutoLifecycleFragment", e);
        }
    }

    @Override // android.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // android.app.Fragment
    public void onStart() {
        super.onStart();
        this.b = true;
        for (int i = 0; i < this.f5305a.size(); i++) {
            this.f5305a.valueAt(i).f5306a.connect((Activity) null);
        }
    }

    @Override // android.app.Fragment
    public void onStop() {
        super.onStop();
        this.b = false;
        for (int i = 0; i < this.f5305a.size(); i++) {
            this.f5305a.valueAt(i).f5306a.disconnect();
        }
    }

    public void startAutoMange(int i, HuaweiApiClient huaweiApiClient) {
        boolean z;
        Preconditions.checkNotNull(huaweiApiClient, "HuaweiApiClient instance cannot be null");
        if (this.f5305a.indexOfKey(i) < 0) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkState(z, "Already managing a HuaweiApiClient with this clientId: " + i);
        this.f5305a.put(i, new a(i, huaweiApiClient));
        if (this.b) {
            huaweiApiClient.connect((Activity) null);
        }
    }

    public void stopAutoManage(int i) {
        a aVar = this.f5305a.get(i);
        this.f5305a.remove(i);
        if (aVar != null) {
            aVar.a();
        }
    }
}
