package com.taobao.android.live.plugin.atype.flexalocal.utils;

import android.view.View;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.utils.newutils.TLiveAccessibilityUtils;
import tb.t2o;

/* compiled from: Taobao */
@Deprecated
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class AccessibilityUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(295700121);
    }

    public static void a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb5de279", new Object[]{view});
        } else {
            TLiveAccessibilityUtils.a(view);
        }
    }

    public static void b(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4317fdb4", new Object[]{view});
        } else if (view != null) {
            ViewCompat.setAccessibilityDelegate(view, new AccessibilityDelegateCompat() { // from class: com.taobao.android.live.plugin.atype.flexalocal.utils.AccessibilityUtils.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
                    if (str.hashCode() == -672710132) {
                        super.onInitializeAccessibilityNodeInfo((View) objArr[0], (AccessibilityNodeInfoCompat) objArr[1]);
                        return null;
                    }
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/utils/AccessibilityUtils$1");
                }

                @Override // androidx.core.view.AccessibilityDelegateCompat
                public void onInitializeAccessibilityNodeInfo(View view2, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d7e7420c", new Object[]{this, view2, accessibilityNodeInfoCompat});
                        return;
                    }
                    super.onInitializeAccessibilityNodeInfo(view2, accessibilityNodeInfoCompat);
                    if (accessibilityNodeInfoCompat != null) {
                        accessibilityNodeInfoCompat.setRoleDescription("编辑框");
                    }
                }
            });
        }
    }
}
