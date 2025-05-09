package com.zoloz.android.phone.zdoc.fragment;

import androidx.fragment.app.Fragment;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class BaseFragment extends Fragment {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(245366949);
    }

    public static /* synthetic */ Object ipc$super(BaseFragment baseFragment, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/zoloz/android/phone/zdoc/fragment/BaseFragment");
    }

    public boolean onBackPressed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("88afc67", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public void onRestart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c630bb7", new Object[]{this});
        }
    }

    public void runOnUiThread(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec6b7f2d", new Object[]{this, runnable});
        } else {
            getActivity().runOnUiThread(runnable);
        }
    }
}
