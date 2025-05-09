package com.taobao.runtimepermission.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.alibaba.ability.localization.Localization;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import tb.ndh;
import tb.ok8;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class PermissionBizManagerTipLayout extends FrameLayout implements View.OnClickListener {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int EVENT_BACK_2_PERMISSION_REQ = 10003;
    private static final String TAG = "PermissionBizTip";
    private ok8 mEventListener;

    public PermissionBizManagerTipLayout(Context context) {
        this(context, null);
    }

    private void init(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{this, context});
            return;
        }
        LayoutInflater.from(context).inflate(R.layout.layout_biz_permission_manage_tip, this);
        ((ImageView) findViewById(R.id.go_back)).setOnClickListener(this);
        ((TextView) findViewById(R.id.manager_permission_title_text)).setText(Localization.q(R.string.taobao_app_1040_1_23516));
        ((TextView) findViewById(R.id.manager_permission_explain_text)).setText(Localization.q(R.string.taobao_app_1040_1_23517));
    }

    public static /* synthetic */ Object ipc$super(PermissionBizManagerTipLayout permissionBizManagerTipLayout, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/runtimepermission/view/PermissionBizManagerTipLayout");
    }

    private void onEvent(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fef3fc41", new Object[]{this, new Integer(i)});
            return;
        }
        ok8 ok8Var = this.mEventListener;
        if (ok8Var == null) {
            ndh.a(TAG, "onEvent: event listener is empty, is right?");
        } else {
            ok8Var.onEvent(i);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            return;
        }
        int id = view.getId();
        if (id == R.id.go_back) {
            onEvent(10003);
            return;
        }
        ndh.a(TAG, "onClick: handle with unknown view id " + id);
    }

    public void setEventListener(ok8 ok8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b26c44", new Object[]{this, ok8Var});
        } else {
            this.mEventListener = ok8Var;
        }
    }

    public PermissionBizManagerTipLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PermissionBizManagerTipLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init(context);
    }
}
