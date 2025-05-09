package com.taobao.login4android.ui;

import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.ali.user.mobile.scan.model.CommonScanResponse;
import com.ali.user.mobile.scan.model.CommonScanResult;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.scan.QrScanFragment;
import com.taobao.taobao.R;
import tb.t2o;

/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class TaobaoQrScanFragment extends QrScanFragment {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int EXPIRED = 14042;

    static {
        t2o.a(517996623);
    }

    public static /* synthetic */ Object ipc$super(TaobaoQrScanFragment taobaoQrScanFragment, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/login4android/ui/TaobaoQrScanFragment");
    }

    @Override // com.taobao.login4android.scan.QrScanFragment
    public boolean handleIntercept(CommonScanResponse commonScanResponse) {
        TextView textView;
        TextView textView2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3b13bceb", new Object[]{this, commonScanResponse})).booleanValue();
        }
        if (commonScanResponse == null || commonScanResponse.code != 14042) {
            return false;
        }
        ImageView imageView = this.mHintImageView;
        if (imageView != null) {
            imageView.setImageResource(R.drawable.aliuser_scancode_error);
        }
        Button button = this.mConfirmButton;
        if (button != null) {
            button.setText(R.string.aliuser_scan_try_again);
            this.mConfirmButton.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.login4android.ui.TaobaoQrScanFragment.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    } else if (TaobaoQrScanFragment.this.getActivity() != null) {
                        TaobaoQrScanFragment.this.getActivity().finish();
                    }
                }
            });
        }
        T t = commonScanResponse.returnValue;
        if (t != 0) {
            String str = ((CommonScanResult) t).titleMsg;
            String str2 = ((CommonScanResult) t).subTitleMsg;
            this.mConfirmMsg = ((CommonScanResult) t).confirmMsg;
            if (!TextUtils.isEmpty(str) && (textView2 = this.mScanTitleTextView) != null) {
                textView2.setText(str);
            }
            if (!TextUtils.isEmpty(str2) && (textView = this.mScanSubTitleView) != null) {
                textView.setText(str2);
            }
        } else {
            TextView textView3 = this.mScanTitleTextView;
            if (textView3 != null) {
                textView3.setText(R.string.aliuser_scan_invalid_token);
            }
            TextView textView4 = this.mScanSubTitleView;
            if (textView4 != null) {
                textView4.setText(R.string.aliuser_scan_invalid_token_hint);
            }
        }
        TextView textView5 = this.mScanSubTitleView;
        if (textView5 != null) {
            textView5.setTextColor(((QrScanFragment) this).mAttachedActivity.getResources().getColor(getSubTitleTextColor(true)));
        }
        return true;
    }
}
