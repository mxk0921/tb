package com.taobao.umipublish.extension.windvane.innercall;

import android.content.Intent;
import androidx.fragment.app.Fragment;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class NavWrapperFragment extends Fragment {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public ActivityResult f14076a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface ActivityResult {
        void onActivityResult(int i, int i2, Intent intent);
    }

    static {
        t2o.a(944767219);
    }

    public NavWrapperFragment() {
    }

    public static /* synthetic */ Object ipc$super(NavWrapperFragment navWrapperFragment, String str, Object... objArr) {
        if (str.hashCode() == 1257714799) {
            super.onActivityResult(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), (Intent) objArr[2]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/umipublish/extension/windvane/innercall/NavWrapperFragment");
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        super.onActivityResult(i, i2, intent);
        ActivityResult activityResult = this.f14076a;
        if (activityResult != null) {
            activityResult.onActivityResult(i, i2, intent);
        }
    }

    public void p2(ActivityResult activityResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1beb2fa", new Object[]{this, activityResult});
        } else {
            this.f14076a = activityResult;
        }
    }

    public NavWrapperFragment(ActivityResult activityResult) {
        this.f14076a = activityResult;
    }
}
