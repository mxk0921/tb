package com.alipay.mobile.verifyidentity.ui;

import android.view.View;
import android.widget.AdapterView;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class APViewEventHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static ClickListenerWrapper f4462a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public interface ClickListenerWrapper {
        View.OnClickListener wrap(View.OnClickListener onClickListener);

        AdapterView.OnItemClickListener wrap(AdapterView.OnItemClickListener onItemClickListener);
    }

    public static void setWrapper(ClickListenerWrapper clickListenerWrapper) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c9bda27", new Object[]{clickListenerWrapper});
        } else {
            f4462a = clickListenerWrapper;
        }
    }

    public static View.OnClickListener wrapClickListener(View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View.OnClickListener) ipChange.ipc$dispatch("cbb3ef49", new Object[]{onClickListener});
        }
        ClickListenerWrapper clickListenerWrapper = f4462a;
        if (clickListenerWrapper == null) {
            return onClickListener;
        }
        return clickListenerWrapper.wrap(onClickListener);
    }

    public static AdapterView.OnItemClickListener wrapItemClickListener(AdapterView.OnItemClickListener onItemClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AdapterView.OnItemClickListener) ipChange.ipc$dispatch("60e60470", new Object[]{onItemClickListener});
        }
        ClickListenerWrapper clickListenerWrapper = f4462a;
        if (clickListenerWrapper == null) {
            return onItemClickListener;
        }
        return clickListenerWrapper.wrap(onItemClickListener);
    }
}
