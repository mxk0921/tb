package com.taobao.android.detail.ttdetail.handler.fragment;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.fragment.app.FragmentActivity;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.widget.desc.image.DetailImageView;
import com.taobao.taobao.R;
import tb.egr;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class SizingChartFloatFragment extends FloatFragment {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EXTRA_URL = "imageUrl";
    public static String p;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(SizingChartFloatFragment sizingChartFloatFragment) {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            }
        }
    }

    static {
        t2o.a(912262015);
    }

    public static SizingChartFloatFragment D2(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SizingChartFloatFragment) ipChange.ipc$dispatch("4d99bb82", new Object[]{str, str2});
        }
        Bundle bundle = new Bundle();
        bundle.putString(FloatFragment.EXTRA_TITLE, str);
        bundle.putString("imageUrl", str2);
        SizingChartFloatFragment sizingChartFloatFragment = new SizingChartFloatFragment();
        sizingChartFloatFragment.setArguments(bundle);
        return sizingChartFloatFragment;
    }

    public static void E2(FragmentActivity fragmentActivity, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("722066d6", new Object[]{fragmentActivity, str, str2});
        } else if (fragmentActivity != null && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            FloatFragment.C2(fragmentActivity, D2(str, str2));
        }
    }

    public static /* synthetic */ Object ipc$super(SizingChartFloatFragment sizingChartFloatFragment, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -641568046) {
            super.onCreate((Bundle) objArr[0]);
            return null;
        } else if (hashCode == 1860817453) {
            super.onViewCreated((View) objArr[0], (Bundle) objArr[1]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/detail/ttdetail/handler/fragment/SizingChartFloatFragment");
        }
    }

    @Override // com.taobao.android.detail.ttdetail.handler.fragment.FloatFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            p = arguments.getString("imageUrl", "");
        }
    }

    @Override // com.taobao.android.detail.ttdetail.handler.fragment.FloatFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ee9d22d", new Object[]{this, view, bundle});
            return;
        }
        super.onViewCreated(view, bundle);
        this.i.removeView(this.j);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(3, R.id.tv_title);
        layoutParams.addRule(2, R.id.tv_close);
        DetailImageView detailImageView = new DetailImageView(this.d);
        this.i.addView(detailImageView, layoutParams);
        this.i.setOnClickListener(new a(this));
        egr.d().e(p, detailImageView);
    }
}
