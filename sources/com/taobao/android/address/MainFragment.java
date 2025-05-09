package com.taobao.android.address;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.alibaba.aliweex.bundle.WeexPageFragment;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.q15;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class MainFragment extends WeexPageFragment {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public View f6290a;

    public static /* synthetic */ Object ipc$super(MainFragment mainFragment, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1589549411) {
            super.onAttach((Context) objArr[0]);
            return null;
        } else if (hashCode == -1126882532) {
            return super.onCreateView((LayoutInflater) objArr[0], (ViewGroup) objArr[1], (Bundle) objArr[2]);
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/address/MainFragment");
        }
    }

    @Override // com.alibaba.aliweex.bundle.WeexPageFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a141669d", new Object[]{this, context});
            return;
        }
        setProgressBarView(new q15());
        super.onAttach(context);
    }

    @Override // com.alibaba.aliweex.bundle.WeexPageFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("bcd5231c", new Object[]{this, layoutInflater, viewGroup, bundle});
        }
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        WeexPopContainer weexPopContainer = (WeexPopContainer) getActivity();
        this.f6290a = onCreateView;
        return onCreateView;
    }
}
