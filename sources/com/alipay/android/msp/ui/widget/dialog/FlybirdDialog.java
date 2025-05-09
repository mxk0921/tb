package com.alipay.android.msp.ui.widget.dialog;

import android.app.Dialog;
import android.content.Context;
import com.alipay.android.msp.language.LanguageHelper;
import com.alipay.android.msp.utils.LogUtil;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public abstract class FlybirdDialog {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public interface DialogCallback {
        void onCallback(String str, int i, int i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Dialog showDialogV1(Context context, String str, String str2, List<FlybirdDialogEventDesc> list) {
        FlybirdDialogMultiBtn flybirdDialogMultiBtn;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Dialog) ipChange.ipc$dispatch("87bd4029", new Object[]{context, str, str2, list});
        }
        if (list == null) {
            list = new ArrayList<>();
        }
        LogUtil.record(2, "FlybirdDialog:showDialog", "title=" + str + " ,msg=" + str2 + " , event=" + list.size());
        if (list.size() == 0) {
            list.add(new FlybirdDialogEventDesc(LanguageHelper.localizedStringForKey("alipay_ensure", context.getResources().getString(R.string.alipay_ensure), new Object[0]), null));
        }
        if (list.size() == 1) {
            FlybirdDialogOneBtn flybirdDialogOneBtn = new FlybirdDialogOneBtn(context);
            flybirdDialogOneBtn.setTitle(str);
            flybirdDialogOneBtn.setOneMessage(str2);
            flybirdDialogOneBtn.setOnClickText(list.get(0).mText);
            flybirdDialogOneBtn.setOnClickListener(list.get(0).mListener);
            flybirdDialogMultiBtn = flybirdDialogOneBtn;
        } else if (list.size() == 2) {
            FlybirdDialogDoubleBtn flybirdDialogDoubleBtn = new FlybirdDialogDoubleBtn(context);
            flybirdDialogDoubleBtn.setTitle(str);
            flybirdDialogDoubleBtn.setOneMessage(str2);
            flybirdDialogDoubleBtn.setLeftOnClickText(list.get(0).mText);
            flybirdDialogDoubleBtn.setLeftOnClickListener(list.get(0).mListener);
            flybirdDialogDoubleBtn.setRightOnClickText(list.get(1).mText);
            flybirdDialogDoubleBtn.setRightOnClickListener(list.get(1).mListener);
            flybirdDialogMultiBtn = flybirdDialogDoubleBtn;
        } else {
            FlybirdDialogMultiBtn flybirdDialogMultiBtn2 = new FlybirdDialogMultiBtn(context);
            flybirdDialogMultiBtn2.setTitle(str);
            flybirdDialogMultiBtn2.setOneMessage(str2);
            flybirdDialogMultiBtn2.setOnClickEvents(list);
            flybirdDialogMultiBtn = flybirdDialogMultiBtn2;
        }
        try {
            flybirdDialogMultiBtn.show();
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
        }
        return flybirdDialogMultiBtn;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0098  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.app.Dialog showDialogV2(final android.content.Context r10, java.lang.String r11, java.lang.String r12, java.util.List<com.alipay.android.msp.ui.widget.dialog.FlybirdDialogEventDesc> r13) {
        /*
            r0 = 2
            r1 = 0
            r2 = 1
            com.android.alibaba.ip.runtime.IpChange r3 = com.alipay.android.msp.ui.widget.dialog.FlybirdDialog.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x001e
            java.lang.String r4 = "e0c88baa"
            r5 = 4
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r5[r1] = r10
            r5[r2] = r11
            r5[r0] = r12
            r10 = 3
            r5[r10] = r13
            java.lang.Object r10 = r3.ipc$dispatch(r4, r5)
            android.app.Dialog r10 = (android.app.Dialog) r10
            return r10
        L_0x001e:
            if (r10 == 0) goto L_0x0032
            com.alipay.android.msp.framework.drm.DrmManager r3 = com.alipay.android.msp.framework.drm.DrmManager.getInstance(r10)
            java.lang.String r4 = "gray_dialog_remove_error_code"
            boolean r3 = r3.isGray(r4, r1, r10)
            if (r3 == 0) goto L_0x0032
            android.app.Dialog r10 = showDialogV1(r10, r11, r12, r13)
            return r10
        L_0x0032:
            r3 = 0
            java.lang.String r4 = ".*\\((.+)\\)"
            java.util.regex.Pattern r4 = java.util.regex.Pattern.compile(r4)     // Catch: all -> 0x006d
            java.util.regex.Matcher r4 = r4.matcher(r12)     // Catch: all -> 0x006d
            boolean r5 = r4.find()     // Catch: all -> 0x006d
            if (r5 == 0) goto L_0x0071
            int r4 = r4.end()     // Catch: all -> 0x006d
            java.lang.String r5 = "("
            int r5 = r12.lastIndexOf(r5)     // Catch: all -> 0x006d
            int r6 = r5 + 1
            int r2 = r4 + (-1)
            java.lang.String r3 = r12.substring(r6, r2)     // Catch: all -> 0x006d
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: all -> 0x006d
            r2.<init>()     // Catch: all -> 0x006d
            java.lang.String r1 = r12.substring(r1, r5)     // Catch: all -> 0x006d
            r2.append(r1)     // Catch: all -> 0x006d
            java.lang.String r1 = r12.substring(r4)     // Catch: all -> 0x006d
            r2.append(r1)     // Catch: all -> 0x006d
            java.lang.String r1 = r2.toString()     // Catch: all -> 0x006d
            goto L_0x0072
        L_0x006d:
            r1 = move-exception
            com.alipay.android.msp.utils.LogUtil.printExceptionStackTrace(r1)
        L_0x0071:
            r1 = r12
        L_0x0072:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = "title="
            r2.<init>(r4)
            r2.append(r11)
            java.lang.String r4 = " ,msg="
            r2.append(r4)
            r2.append(r12)
            java.lang.String r12 = r2.toString()
            java.lang.String r2 = "FlybirdDialog:showDialogV2"
            com.alipay.android.msp.utils.LogUtil.record(r0, r2, r12)
            android.app.Dialog r11 = showDialogV1(r10, r11, r1, r13)
            boolean r12 = android.text.TextUtils.isEmpty(r3)
            if (r12 != 0) goto L_0x00e5
            android.widget.TextView r8 = new android.widget.TextView
            r8.<init>(r10)
            r8.setText(r3)
            android.content.res.Resources r12 = r10.getResources()
            int r13 = com.taobao.taobao.R.color.mini_error_code
            int r12 = r12.getColor(r13)
            r8.setTextColor(r12)
            r12 = 17
            r8.setGravity(r12)
            android.view.Window r12 = r11.getWindow()
            if (r12 == 0) goto L_0x00db
            android.view.Window r12 = r11.getWindow()
            android.view.View r7 = r12.getDecorView()
            int r12 = com.taobao.taobao.R.id.flybird_dialog_layout
            android.view.View r12 = r11.findViewById(r12)
            android.view.ViewGroup r12 = (android.view.ViewGroup) r12
            boolean r13 = r7 instanceof android.widget.FrameLayout
            if (r13 == 0) goto L_0x00e5
            if (r12 == 0) goto L_0x00e5
            com.alipay.android.msp.ui.widget.dialog.FlybirdDialog$1 r13 = new com.alipay.android.msp.ui.widget.dialog.FlybirdDialog$1
            r4 = r13
            r5 = r10
            r6 = r12
            r9 = r11
            r4.<init>()
            r12.post(r13)
            goto L_0x00e5
        L_0x00db:
            android.view.ViewGroup$LayoutParams r10 = new android.view.ViewGroup$LayoutParams
            r12 = -1
            r13 = -2
            r10.<init>(r12, r13)
            r11.addContentView(r8, r10)
        L_0x00e5:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.android.msp.ui.widget.dialog.FlybirdDialog.showDialogV2(android.content.Context, java.lang.String, java.lang.String, java.util.List):android.app.Dialog");
    }
}
