package com.taobao.android.live.plugin.atype.flexalocal.tbliveinteractive.container.h5;

import android.content.Context;
import android.os.Bundle;
import android.view.Window;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import tb.t2o;
import tb.y7t;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class CustomTypeBottomSheetDialog extends BottomSheetDialog {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final TaoLiveWebBottomFragment f8677a;

    static {
        t2o.a(295699869);
    }

    public CustomTypeBottomSheetDialog(Context context) {
        super(context);
    }

    public static /* synthetic */ Object ipc$super(CustomTypeBottomSheetDialog customTypeBottomSheetDialog, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -641568046) {
            super.onCreate((Bundle) objArr[0]);
            return null;
        } else if (hashCode == -451962688) {
            super.onRestoreInstanceState((Bundle) objArr[0]);
            return null;
        } else if (hashCode == 359041003) {
            return super.onSaveInstanceState();
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/live/plugin/atype/flexalocal/tbliveinteractive/container/h5/CustomTypeBottomSheetDialog");
        }
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetDialog, androidx.appcompat.app.AppCompatDialog, androidx.activity.ComponentDialog, android.app.Dialog
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            window.setType(1000);
            window.clearFlags(2);
        }
    }

    @Override // android.app.Dialog
    public void onRestoreInstanceState(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e50f98c0", new Object[]{this, bundle});
            return;
        }
        super.onRestoreInstanceState(bundle);
        if (bundle.containsKey("TaoLiveBottomWebFragment:shouldRestore") && bundle.getBoolean("TaoLiveBottomWebFragment:shouldRestore")) {
            y7t.a("CustomBottomDialog", "Activity 自动恢复或切换横竖屏取消上屏!");
            TaoLiveWebBottomFragment taoLiveWebBottomFragment = this.f8677a;
            if (taoLiveWebBottomFragment != null) {
                taoLiveWebBottomFragment.dismissAllowingStateLoss();
            }
        }
    }

    public CustomTypeBottomSheetDialog(Context context, int i, TaoLiveWebBottomFragment taoLiveWebBottomFragment) {
        super(context, i);
        this.f8677a = taoLiveWebBottomFragment;
    }

    @Override // androidx.activity.ComponentDialog, android.app.Dialog
    public Bundle onSaveInstanceState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bundle) ipChange.ipc$dispatch("156687eb", new Object[]{this});
        }
        Bundle onSaveInstanceState = super.onSaveInstanceState();
        if (onSaveInstanceState.containsKey("android:dialogShowing") && onSaveInstanceState.getBoolean("android:dialogShowing")) {
            onSaveInstanceState.remove("android:dialogHierarchy");
            onSaveInstanceState.putBoolean("TaoLiveBottomWebFragment:shouldRestore", true);
            y7t.a("CustomBottomDialog", "取消：TaoLiveWebBottomFragment 自动重建! 防止上屏");
        }
        return onSaveInstanceState;
    }
}
