package com.alibaba.security.realidentity.ui.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class RPTopBar extends RelativeLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public View f2883a;
    public ViewGroup b;
    public TextView c;

    public RPTopBar(Context context) {
        this(context, null);
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.f2883a = ((LayoutInflater) getContext().getSystemService("layout_inflater")).inflate(R.layout.rp_alrealidentity_top_bar, (ViewGroup) null);
        addView(this.f2883a, new LinearLayout.LayoutParams(-1, -1));
        this.b = (ViewGroup) this.f2883a.findViewById(R.id.left);
        this.c = (TextView) this.f2883a.findViewById(R.id.tv_title);
        setClickable(true);
    }

    public static /* synthetic */ Object ipc$super(RPTopBar rPTopBar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/security/realidentity/ui/widgets/RPTopBar");
    }

    public ViewGroup getIvLeftParent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("291f461a", new Object[]{this});
        }
        return this.b;
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c047129", new Object[]{this, new Integer(i)});
        } else {
            this.f2883a.setBackgroundColor(i);
        }
    }

    public void setTitle(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c820927", new Object[]{this, str});
        } else {
            this.c.setText(str);
        }
    }

    public RPTopBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RPTopBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a();
    }
}
