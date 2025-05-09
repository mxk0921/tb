package androidx.databinding.adapters;

import android.widget.TabHost;
import androidx.databinding.InverseBindingListener;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class TabHostBindingAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static int getCurrentTab(TabHost tabHost) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("77b352a9", new Object[]{tabHost})).intValue();
        }
        return tabHost.getCurrentTab();
    }

    public static String getCurrentTabTag(TabHost tabHost) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c61498d4", new Object[]{tabHost});
        }
        return tabHost.getCurrentTabTag();
    }

    public static void setCurrentTab(TabHost tabHost, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d775f481", new Object[]{tabHost, new Integer(i)});
        } else if (tabHost.getCurrentTab() != i) {
            tabHost.setCurrentTab(i);
        }
    }

    public static void setCurrentTabTag(TabHost tabHost, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("942c478a", new Object[]{tabHost, str});
            return;
        }
        String currentTabTag = tabHost.getCurrentTabTag();
        if ((currentTabTag != null && !currentTabTag.equals(str)) || (currentTabTag == null && str != null)) {
            tabHost.setCurrentTabByTag(str);
        }
    }

    public static void setListeners(TabHost tabHost, final TabHost.OnTabChangeListener onTabChangeListener, final InverseBindingListener inverseBindingListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67b254f6", new Object[]{tabHost, onTabChangeListener, inverseBindingListener});
        } else if (inverseBindingListener == null) {
            tabHost.setOnTabChangedListener(onTabChangeListener);
        } else {
            tabHost.setOnTabChangedListener(new TabHost.OnTabChangeListener() { // from class: androidx.databinding.adapters.TabHostBindingAdapter.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.widget.TabHost.OnTabChangeListener
                public void onTabChanged(String str) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7cfa8af", new Object[]{this, str});
                        return;
                    }
                    TabHost.OnTabChangeListener onTabChangeListener2 = onTabChangeListener;
                    if (onTabChangeListener2 != null) {
                        onTabChangeListener2.onTabChanged(str);
                    }
                    inverseBindingListener.onChange();
                }
            });
        }
    }
}
