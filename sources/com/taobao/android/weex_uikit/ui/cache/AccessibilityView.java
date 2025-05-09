package com.taobao.android.weex_uikit.ui.cache;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_uikit.ui.MUSNodeHost;
import com.taobao.android.weex_uikit.ui.UINode;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class AccessibilityView extends View {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final ViewGroup.LayoutParams DUMMY = new ViewGroup.LayoutParams(0, 0);
    private UINode mNode;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                AccessibilityView.access$000(AccessibilityView.this);
            }
        }
    }

    static {
        t2o.a(986710096);
    }

    public AccessibilityView(Context context) {
        super(context);
        setWillNotDraw(true);
        setLayoutParams(DUMMY);
    }

    public static /* synthetic */ void access$000(AccessibilityView accessibilityView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad85fca3", new Object[]{accessibilityView});
        } else {
            accessibilityView.onAccessibilityClick();
        }
    }

    public static void addToParent(MUSNodeHost mUSNodeHost, AccessibilityView accessibilityView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c273996", new Object[]{mUSNodeHost, accessibilityView});
        } else if (accessibilityView != null && accessibilityView.getParent() == null) {
            mUSNodeHost.addAccessibilityView(accessibilityView);
        }
    }

    public static /* synthetic */ Object ipc$super(AccessibilityView accessibilityView, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex_uikit/ui/cache/AccessibilityView");
    }

    private void onAccessibilityClick() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b542b520", new Object[]{this});
            return;
        }
        UINode uINode = this.mNode;
        if (uINode != null) {
            uINode.fireEvent("click", null);
        }
    }

    public static void removeFromParent(MUSNodeHost mUSNodeHost, AccessibilityView accessibilityView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("408f3468", new Object[]{mUSNodeHost, accessibilityView});
        } else if (accessibilityView != null && accessibilityView.getParent() != null) {
            mUSNodeHost.removeAccessibilityView(accessibilityView);
        }
    }

    public void attach() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ad9c84c", new Object[]{this});
            return;
        }
        UINode uINode = this.mNode;
        if (uINode == null) {
            setOnClickListener(null);
            setClickable(false);
        } else if (uINode.hasEvent("click")) {
            setOnClickListener(new a());
        } else {
            setOnClickListener(null);
            setClickable(false);
        }
    }

    public void setNode(UINode uINode) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd3c18dd", new Object[]{this, uINode});
        } else {
            this.mNode = uINode;
        }
    }
}
