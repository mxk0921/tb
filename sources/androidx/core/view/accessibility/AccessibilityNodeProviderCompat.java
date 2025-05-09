package androidx.core.view.accessibility;

import android.os.Build;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class AccessibilityNodeProviderCompat {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int HOST_VIEW_ID = -1;
    private final Object mProvider;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class AccessibilityNodeProviderApi26 extends AccessibilityNodeProviderApi19 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public AccessibilityNodeProviderApi26(AccessibilityNodeProviderCompat accessibilityNodeProviderCompat) {
            super(accessibilityNodeProviderCompat);
        }

        public static /* synthetic */ Object ipc$super(AccessibilityNodeProviderApi26 accessibilityNodeProviderApi26, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/core/view/accessibility/AccessibilityNodeProviderCompat$AccessibilityNodeProviderApi26");
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public void addExtraDataToAccessibilityNodeInfo(int i, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("97aa39bc", new Object[]{this, new Integer(i), accessibilityNodeInfo, str, bundle});
            } else {
                this.mCompat.addExtraDataToAccessibilityNodeInfo(i, AccessibilityNodeInfoCompat.wrap(accessibilityNodeInfo), str, bundle);
            }
        }
    }

    public AccessibilityNodeProviderCompat() {
        if (Build.VERSION.SDK_INT >= 26) {
            this.mProvider = new AccessibilityNodeProviderApi26(this);
        } else {
            this.mProvider = new AccessibilityNodeProviderApi19(this);
        }
    }

    public void addExtraDataToAccessibilityNodeInfo(int i, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, String str, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1fd6e48", new Object[]{this, new Integer(i), accessibilityNodeInfoCompat, str, bundle});
        }
    }

    public AccessibilityNodeInfoCompat createAccessibilityNodeInfo(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AccessibilityNodeInfoCompat) ipChange.ipc$dispatch("94f3cbcc", new Object[]{this, new Integer(i)});
        }
        return null;
    }

    public List<AccessibilityNodeInfoCompat> findAccessibilityNodeInfosByText(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("f04aabc7", new Object[]{this, str, new Integer(i)});
        }
        return null;
    }

    public AccessibilityNodeInfoCompat findFocus(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AccessibilityNodeInfoCompat) ipChange.ipc$dispatch("2c4b2189", new Object[]{this, new Integer(i)});
        }
        return null;
    }

    public Object getProvider() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("cdf00484", new Object[]{this});
        }
        return this.mProvider;
    }

    public boolean performAction(int i, int i2, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6acdfd3a", new Object[]{this, new Integer(i), new Integer(i2), bundle})).booleanValue();
        }
        return false;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class AccessibilityNodeProviderApi19 extends AccessibilityNodeProvider {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final AccessibilityNodeProviderCompat mCompat;

        public AccessibilityNodeProviderApi19(AccessibilityNodeProviderCompat accessibilityNodeProviderCompat) {
            this.mCompat = accessibilityNodeProviderCompat;
        }

        public static /* synthetic */ Object ipc$super(AccessibilityNodeProviderApi19 accessibilityNodeProviderApi19, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/core/view/accessibility/AccessibilityNodeProviderCompat$AccessibilityNodeProviderApi19");
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (AccessibilityNodeInfo) ipChange.ipc$dispatch("d7da9558", new Object[]{this, new Integer(i)});
            }
            AccessibilityNodeInfoCompat createAccessibilityNodeInfo = this.mCompat.createAccessibilityNodeInfo(i);
            if (createAccessibilityNodeInfo == null) {
                return null;
            }
            return createAccessibilityNodeInfo.unwrap();
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public AccessibilityNodeInfo findFocus(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (AccessibilityNodeInfo) ipChange.ipc$dispatch("31ede95", new Object[]{this, new Integer(i)});
            }
            AccessibilityNodeInfoCompat findFocus = this.mCompat.findFocus(i);
            if (findFocus == null) {
                return null;
            }
            return findFocus.unwrap();
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public boolean performAction(int i, int i2, Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("6acdfd3a", new Object[]{this, new Integer(i), new Integer(i2), bundle})).booleanValue();
            }
            return this.mCompat.performAction(i, i2, bundle);
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String str, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (List) ipChange.ipc$dispatch("f04aabc7", new Object[]{this, str, new Integer(i)});
            }
            List<AccessibilityNodeInfoCompat> findAccessibilityNodeInfosByText = this.mCompat.findAccessibilityNodeInfosByText(str, i);
            if (findAccessibilityNodeInfosByText == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            int size = findAccessibilityNodeInfosByText.size();
            for (int i2 = 0; i2 < size; i2++) {
                arrayList.add(findAccessibilityNodeInfosByText.get(i2).unwrap());
            }
            return arrayList;
        }
    }

    public AccessibilityNodeProviderCompat(Object obj) {
        this.mProvider = obj;
    }
}
