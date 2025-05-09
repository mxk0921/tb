package com.taobao.live.home.view;

import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.ut.mini.UTAnalytics;
import java.util.Map;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class UTAnalyzeFragment extends Fragment {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(806355515);
    }

    public static /* synthetic */ Object ipc$super(UTAnalyzeFragment uTAnalyzeFragment, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1512649357) {
            super.onResume();
            return null;
        } else if (hashCode == -1010986463) {
            super.setUserVisibleHint(((Boolean) objArr[0]).booleanValue());
            return null;
        } else if (hashCode == 797441118) {
            super.onPause();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/live/home/view/UTAnalyzeFragment");
        }
    }

    public String getUTPageName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("34b6390a", new Object[]{this});
        }
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        super.onPause();
        if (getUserVisibleHint()) {
            u2(true, false);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        if (getUserVisibleHint()) {
            u2(false, true);
        }
        if (r2() && getUserVisibleHint()) {
            String uTPageName = getUTPageName();
            if (!TextUtils.isEmpty(uTPageName)) {
                UTAnalytics.getInstance().getDefaultTracker().pageAppearDonotSkip(getActivity(), uTPageName);
                UTAnalytics.getInstance().getDefaultTracker().updatePageName(getActivity(), uTPageName);
            }
            Map<String, String> p2 = p2();
            if (p2 != null && !p2.isEmpty()) {
                UTAnalytics.getInstance().getDefaultTracker().updatePageProperties(getActivity(), p2);
            }
        }
    }

    public Map<String, String> p2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("16970404", new Object[]{this});
        }
        return null;
    }

    public boolean r2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("615f50a9", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public void s2(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6203bbc0", new Object[]{this, map});
        } else if (map != null) {
            UTAnalytics.getInstance().getDefaultTracker().updateNextPageProperties(map);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3bd9221", new Object[]{this, new Boolean(z)});
            return;
        }
        super.setUserVisibleHint(z);
        u2(false, z);
        if (r2() && z) {
            String uTPageName = getUTPageName();
            if (!TextUtils.isEmpty(uTPageName)) {
                UTAnalytics.getInstance().getDefaultTracker().pageDisAppear(getActivity());
                UTAnalytics.getInstance().getDefaultTracker().pageAppearDonotSkip(getActivity(), uTPageName);
                UTAnalytics.getInstance().getDefaultTracker().updatePageName(getActivity(), uTPageName);
            }
            Map<String, String> p2 = p2();
            if (p2 != null && !p2.isEmpty()) {
                UTAnalytics.getInstance().getDefaultTracker().updatePageProperties(getActivity(), p2);
            }
        }
    }

    public void u2(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70a7dca0", new Object[]{this, new Boolean(z), new Boolean(z2)});
        }
    }
}
