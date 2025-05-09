package com.ali.user.mobile.ui.widget;

import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class WidgetExtension {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public Class<?> fullyCustomizeGuideFragment;
    public Class<?> fullyCustomizedMultiAccountFragment;
    public Class<?> fullyCustomizedScanFragment;
    public Class<?> userLoginActivity;

    static {
        t2o.a(68157631);
    }

    public Class<?> getFullyCustomiedScanFragment() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("57dfd0c4", new Object[]{this});
        }
        return this.fullyCustomizedScanFragment;
    }

    public Class<?> getFullyCustomizeGuideFragment() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("f56d1fd1", new Object[]{this});
        }
        return this.fullyCustomizeGuideFragment;
    }

    public Class<?> getFullyCustomizedMultiAccountFragment() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("5ed99b2d", new Object[]{this});
        }
        return this.fullyCustomizedMultiAccountFragment;
    }

    public Class<?> getUserLoginActivity() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("4da4b08b", new Object[]{this});
        }
        return this.userLoginActivity;
    }

    public void setFullyCustomizeGuideFragment(Class<?> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0b511a5", new Object[]{this, cls});
        } else {
            this.fullyCustomizeGuideFragment = cls;
        }
    }

    public void setFullyCustomizedScanFragment(Class<?> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7cdd81a0", new Object[]{this, cls});
        } else {
            this.fullyCustomizedScanFragment = cls;
        }
    }
}
