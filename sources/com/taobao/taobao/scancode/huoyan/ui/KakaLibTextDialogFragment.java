package com.taobao.taobao.scancode.huoyan.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import tb.t2o;
import tb.vbm;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class KakaLibTextDialogFragment extends KaDialogFragment {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(760217767);
    }

    public static /* synthetic */ Object ipc$super(KakaLibTextDialogFragment kakaLibTextDialogFragment, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taobao/scancode/huoyan/ui/KakaLibTextDialogFragment");
    }

    public static KakaLibTextDialogFragment u2(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (KakaLibTextDialogFragment) ipChange.ipc$dispatch("1b3237e8", new Object[]{str});
        }
        KakaLibTextDialogFragment kakaLibTextDialogFragment = new KakaLibTextDialogFragment();
        Bundle bundle = new Bundle();
        bundle.putString(vbm.TYPE_TEXT, str);
        kakaLibTextDialogFragment.setArguments(bundle);
        return kakaLibTextDialogFragment;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("bcd5231c", new Object[]{this, layoutInflater, viewGroup, bundle});
        }
        String string = getArguments().getString(vbm.TYPE_TEXT);
        View inflate = layoutInflater.inflate(R.layout.kakalib_one_text_msg_dialog, viewGroup, false);
        ((TextView) inflate.findViewById(R.id.aaa)).setText(string);
        return inflate;
    }
}
