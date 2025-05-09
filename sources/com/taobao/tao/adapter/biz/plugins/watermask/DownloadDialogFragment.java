package com.taobao.tao.adapter.biz.plugins.watermask;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.schedule.ViewProxy;
import com.taobao.tao.adapter.biz.plugins.watermask.view.CircleProgressBar;
import com.taobao.taobao.R;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class DownloadDialogFragment extends DialogFragment {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public CircleProgressBar f11893a;
    public int c;
    public TextView d;
    public String e;
    public View.OnClickListener f;

    static {
        t2o.a(793772098);
    }

    public static /* synthetic */ Object ipc$super(DownloadDialogFragment downloadDialogFragment, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case -596517775:
                super.show((FragmentManager) objArr[0], (String) objArr[1]);
                return null;
            case 937454072:
                super.dismissAllowingStateLoss();
                return null;
            case 2133689546:
                super.onStart();
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/adapter/biz/plugins/watermask/DownloadDialogFragment");
        }
    }

    @Override // androidx.fragment.app.DialogFragment
    public void dismissAllowingStateLoss() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37e069f8", new Object[]{this});
        } else if (getFragmentManager() != null) {
            super.dismissAllowingStateLoss();
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        setStyle(1, R.style.CommonProgress);
        setCancelable(false);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("bcd5231c", new Object[]{this, layoutInflater, viewGroup, bundle});
        }
        getDialog().getWindow().requestFeature(1);
        getDialog().setCanceledOnTouchOutside(false);
        View inflate = layoutInflater.inflate(R.layout.layout_video_download_dialog, viewGroup, false);
        p2(inflate);
        return inflate;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            return;
        }
        super.onStart();
        Window window = getDialog().getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.dimAmount = 0.8f;
        attributes.width = -1;
        attributes.height = -2;
        attributes.gravity = 17;
        window.setAttributes(attributes);
        window.setNavigationBarColor(-16777216);
    }

    public final void p2(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("817b6229", new Object[]{this, view});
            return;
        }
        View findViewById = view.findViewById(R.id.btn_cancel);
        this.d = (TextView) view.findViewById(R.id.tv_trans_hint);
        this.f11893a = (CircleProgressBar) view.findViewById(R.id.pb_transing_progress);
        ViewProxy.setOnClickListener(findViewById, this.f);
        this.d.setText(this.e);
        this.f11893a.setProgress(this.c);
    }

    public void r2(View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c34501e3", new Object[]{this, onClickListener});
        } else {
            this.f = onClickListener;
        }
    }

    public void s2(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28975706", new Object[]{this, new Integer(i)});
            return;
        }
        CircleProgressBar circleProgressBar = this.f11893a;
        if (circleProgressBar != null) {
            circleProgressBar.setProgress(i);
        } else {
            this.c = i;
        }
    }

    @Override // androidx.fragment.app.DialogFragment
    public void show(FragmentManager fragmentManager, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc71dc71", new Object[]{this, fragmentManager, str});
            return;
        }
        fragmentManager.beginTransaction().remove(this).commitAllowingStateLoss();
        super.show(fragmentManager, str);
    }

    public void u2(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1dbc2b4", new Object[]{this, str});
            return;
        }
        TextView textView = this.d;
        if (textView != null) {
            textView.setText(str);
        } else {
            this.e = str;
        }
    }
}
