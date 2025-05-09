package com.alipay.mobile.verifyidentity.prodmanager;

import android.app.Activity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class TitleBarAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public OnLeftButtonClickListener f4342a;
    public OnRightButtonClickListener b;
    public ImageView c;
    public ImageView d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public interface OnLeftButtonClickListener {
        void a();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public interface OnRightButtonClickListener {
        void a();
    }

    public static /* synthetic */ OnLeftButtonClickListener a(TitleBarAdapter titleBarAdapter) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (OnLeftButtonClickListener) ipChange.ipc$dispatch("5974edce", new Object[]{titleBarAdapter}) : titleBarAdapter.f4342a;
    }

    public static /* synthetic */ OnRightButtonClickListener b(TitleBarAdapter titleBarAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (OnRightButtonClickListener) ipChange.ipc$dispatch("15245ef8", new Object[]{titleBarAdapter});
        }
        return titleBarAdapter.b;
    }

    public final void a(Activity activity, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ea83e50", new Object[]{this, activity, str, new Boolean(z)});
            return;
        }
        this.d = (ImageView) activity.findViewById(R.id.iv_back);
        this.c = (ImageView) activity.findViewById(R.id.iv_help);
        ((TextView) activity.findViewById(R.id.tv_title_name)).setText(str);
        this.d.setOnClickListener(new View.OnClickListener() { // from class: com.alipay.mobile.verifyidentity.prodmanager.TitleBarAdapter.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else if (TitleBarAdapter.a(TitleBarAdapter.this) != null) {
                    TitleBarAdapter.a(TitleBarAdapter.this).a();
                }
            }
        });
        if (z) {
            this.c.setVisibility(0);
            this.c.setImageDrawable(activity.getResources().getDrawable(R.drawable.help_button));
            this.c.setOnClickListener(new View.OnClickListener() { // from class: com.alipay.mobile.verifyidentity.prodmanager.TitleBarAdapter.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    } else if (TitleBarAdapter.b(TitleBarAdapter.this) != null) {
                        TitleBarAdapter.b(TitleBarAdapter.this).a();
                    }
                }
            });
            return;
        }
        this.c.setVisibility(8);
    }
}
