package com.taobao.message.kit.util;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class BizTagUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public interface BizTag {
        int bizId();

        String bizName();

        String dxSubBizType();
    }

    static {
        t2o.a(529530974);
    }

    public static BizTag getBizTag(Context context) {
        FragmentManager supportFragmentManager;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BizTag) ipChange.ipc$dispatch("e74ad22c", new Object[]{context});
        }
        if (context instanceof BizTag) {
            return (BizTag) context;
        }
        if (!(context instanceof FragmentActivity) || (supportFragmentManager = ((FragmentActivity) context).getSupportFragmentManager()) == null) {
            return null;
        }
        for (Fragment fragment : supportFragmentManager.getFragments()) {
            if (fragment instanceof BizTag) {
                return (BizTag) fragment;
            }
        }
        return null;
    }
}
