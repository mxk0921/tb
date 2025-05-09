package com.alipay.android.app.safepaybase.alikeyboard;

import android.graphics.Point;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.umipublish.draft.DraftMediaHelper;

/* compiled from: Taobao */
@MpaasClassInfo(ExportJarName = "unknown", Level = DraftMediaHelper.DraftType.PRODUCT, Product = ":android-phone-wallet-safepaybase")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class AbstractKeyboard {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public ViewGroup keyboardView;
    public OnKeyboardListener onKeyboardListener;

    public Point getRelatePoint(ViewGroup viewGroup, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Point) ipChange.ipc$dispatch("6bc7cb6e", new Object[]{this, viewGroup, view});
        }
        if (viewGroup == null || view == null) {
            return new Point();
        }
        if (view.getParent() == viewGroup) {
            return new Point(view.getLeft(), view.getTop());
        }
        Point relatePoint = getRelatePoint(viewGroup, (View) view.getParent());
        return new Point(relatePoint.x + view.getLeft(), relatePoint.y + view.getTop());
    }

    public View getView() {
        ViewGroup viewGroup;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("576a35e4", new Object[]{this});
        }
        try {
            if (Build.VERSION.SDK_INT >= 29 && (viewGroup = this.keyboardView) != null) {
                viewGroup.setForceDarkAllowed(false);
            }
        } catch (Throwable unused) {
        }
        return this.keyboardView;
    }

    public void onClose() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e155e360", new Object[]{this});
            return;
        }
        OnKeyboardListener onKeyboardListener = this.onKeyboardListener;
        if (onKeyboardListener != null) {
            onKeyboardListener.onClose();
        }
    }

    public void onDel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("abf60c33", new Object[]{this});
            return;
        }
        OnKeyboardListener onKeyboardListener = this.onKeyboardListener;
        if (onKeyboardListener != null) {
            onKeyboardListener.onDel();
        }
    }

    public void onInput(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe21657c", new Object[]{this, str});
            return;
        }
        OnKeyboardListener onKeyboardListener = this.onKeyboardListener;
        if (onKeyboardListener != null) {
            onKeyboardListener.onInput(str);
        }
    }

    public void onOK() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50952b02", new Object[]{this});
            return;
        }
        OnKeyboardListener onKeyboardListener = this.onKeyboardListener;
        if (onKeyboardListener != null) {
            onKeyboardListener.onOK();
        }
    }
}
