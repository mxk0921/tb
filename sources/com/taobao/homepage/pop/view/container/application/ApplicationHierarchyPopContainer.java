package com.taobao.homepage.pop.view.container.application;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.homepage.pop.protocol.model.pop.IPopAnchorViewInfo;
import com.taobao.homepage.pop.protocol.model.pop.IPopData;
import com.taobao.homepage.pop.view.container.BasePopContainer;
import com.taobao.homepage.pop.view.popview.BasePopView;
import com.taobao.taobao.R;
import java.util.HashMap;
import java.util.Map;
import tb.dbd;
import tb.e3b;
import tb.ffx;
import tb.pfw;
import tb.thm;
import tb.vfm;
import tb.xq1;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class ApplicationHierarchyPopContainer extends BasePopContainer {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final Map<String, Dialog> dialogMap = new HashMap();

    public ApplicationHierarchyPopContainer(Context context, pfw pfwVar, int i, e3b e3bVar) {
        super(context, pfwVar, i, e3bVar);
        this.mPopTrigger = new ffx(this, pfwVar, e3bVar);
        if (vfm.a()) {
            setBackgroundColor(Color.parseColor("#3300eedd"));
        }
    }

    private Dialog createDialog(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Dialog) ipChange.ipc$dispatch("f4b83828", new Object[]{this, view});
        }
        Dialog dialog = new Dialog(getContext(), R.style.Dialog_Status_Container);
        dialog.setCancelable(false);
        dialog.setContentView(view);
        Window window = dialog.getWindow();
        if (window != null) {
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            layoutParams.copyFrom(window.getAttributes());
            layoutParams.width = -1;
            layoutParams.height = -1;
            layoutParams.flags = (layoutParams.flags & (-3)) | 262176;
            window.setAttributes(layoutParams);
            enableImmersiveStatusBar(window);
        }
        return dialog;
    }

    private void enableImmersiveStatusBar(Window window) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8f998b7", new Object[]{this, window});
            return;
        }
        window.clearFlags(201326592);
        window.getDecorView().setSystemUiVisibility(9472);
        window.addFlags(Integer.MIN_VALUE);
    }

    public static /* synthetic */ Object ipc$super(ApplicationHierarchyPopContainer applicationHierarchyPopContainer, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -549533083) {
            return super.createPopView((IPopData) objArr[0], (dbd) objArr[1], (View) objArr[2], (IPopAnchorViewInfo) objArr[3], (xq1) objArr[4], (thm) objArr[5]);
        }
        if (hashCode == 1906953347) {
            super.removePopView((String) objArr[0]);
            return null;
        }
        int hashCode2 = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/homepage/pop/view/container/application/ApplicationHierarchyPopContainer");
    }

    @Override // com.taobao.homepage.pop.view.container.BasePopContainer
    public BasePopView createPopView(IPopData iPopData, dbd dbdVar, View view, IPopAnchorViewInfo iPopAnchorViewInfo, xq1 xq1Var, thm thmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BasePopView) ipChange.ipc$dispatch("df3eca65", new Object[]{this, iPopData, dbdVar, view, iPopAnchorViewInfo, xq1Var, thmVar});
        }
        BasePopView createPopView = super.createPopView(iPopData, dbdVar, view, iPopAnchorViewInfo, xq1Var, thmVar);
        if (createPopView != null) {
            removeView(createPopView);
            Dialog createDialog = createDialog(createPopView);
            this.dialogMap.put(iPopData.getBusinessID(), createDialog);
            if ((getContext() instanceof Activity) && !((Activity) getContext()).isFinishing()) {
                createDialog.show();
            }
        }
        return createPopView;
    }

    @Override // com.taobao.homepage.pop.view.container.BasePopContainer
    public void removePopView(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71a9cc83", new Object[]{this, str});
            return;
        }
        super.removePopView(str);
        Dialog remove = this.dialogMap.remove(str);
        if (remove != null) {
            remove.dismiss();
        }
    }
}
