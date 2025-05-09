package com.taobao.login4android.ui;

import android.app.Activity;
import android.app.Dialog;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.TextUtils;
import android.text.method.ScrollingMovementMethod;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import com.ali.user.mobile.app.dataprovider.DataProviderFactory;
import com.ali.user.mobile.base.ui.BaseDialogFragment;
import com.ali.user.mobile.register.ProtocolModel;
import com.ali.user.mobile.utils.DeviceUtils;
import com.ali.user.mobile.utils.ElderUtil;
import com.ali.user.mobile.utils.ProtocolHelper;
import com.ali.user.mobile.utils.UTConstans;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import tb.t2o;

/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class TaobaoRegProtocolDialogFragment extends BaseDialogFragment {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Activity mAttachedActivity;
    public View.OnClickListener mCancelListener;
    public TextView mContentTV;
    public View mContentView;
    public CharSequence mContextText;
    public String mLogoUrl;
    public View.OnClickListener mNagetiveListener;
    public String mNegativeBtnText;
    public String mOneKeyProtocol;
    public String mOneKeyProtocolUrl;
    public View.OnClickListener mPositiveListener;
    public String mPostiveBtnText;
    public TextView mTitleTV;
    public CharSequence mTitleText;
    public boolean needAdaptElder;
    public boolean showXianyu;
    public boolean useOrangeColor;
    public boolean useUnderLine;
    public boolean negativeVisible = true;
    public boolean contentVisible = true;
    public int height = 0;
    public String mPageName = UTConstans.PageName.UT_PAGE_ONEKEY_REG_NEW;
    public boolean first = false;

    static {
        t2o.a(69206287);
    }

    public static /* synthetic */ Object ipc$super(TaobaoRegProtocolDialogFragment taobaoRegProtocolDialogFragment, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case -596517775:
                super.show((FragmentManager) objArr[0], (String) objArr[1]);
                return null;
            case -349229044:
                super.onConfigurationChanged((Configuration) objArr[0]);
                return null;
            case 1330549917:
                super.onAttach((Activity) objArr[0]);
                return null;
            case 2133689546:
                super.onStart();
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/login4android/ui/TaobaoRegProtocolDialogFragment");
        }
    }

    public void generateContent(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6b8fb27", new Object[]{this, view});
            return;
        }
        ProtocolModel protocolModel = ProtocolHelper.getProtocolModel(getActivity(), this.mOneKeyProtocol, this.mOneKeyProtocolUrl, this.first, this.showXianyu);
        if (this.useOrangeColor) {
            protocolModel.protocolItemColor = R.color.aliuser_edittext_bg_color_activated;
        } else {
            protocolModel.protocolItemColor = R.color.aliuser_new_edit_text_color;
        }
        ProtocolHelper.generateProtocol(protocolModel, this.mAttachedActivity, this.mContentTV, this.mPageName, this.useUnderLine);
    }

    public int getLayoutContent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5894a33", new Object[]{this})).intValue();
        }
        return R.layout.aliuser_reg_protocol_dialog_new;
    }

    public String getLogoUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fbe2b42b", new Object[]{this});
        }
        return this.mLogoUrl;
    }

    public void initViews(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b99e0bed", new Object[]{this, view});
        }
    }

    public boolean isNeedAdaptElder() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9edda993", new Object[]{this})).booleanValue();
        }
        return this.needAdaptElder;
    }

    public void needAutoReg(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ad6119e", new Object[]{this, new Boolean(z)});
        } else {
            this.first = z;
        }
    }

    @Override // com.ali.user.mobile.base.ui.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f4e949d", new Object[]{this, activity});
            return;
        }
        super.onAttach(activity);
        this.mAttachedActivity = activity;
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb2f300c", new Object[]{this, configuration});
            return;
        }
        super.onConfigurationChanged(configuration);
        if (DataProviderFactory.getDataProvider().isAdapterPadAndFold()) {
            DeviceUtils.adapterLoginDialogUIOnDevice(getActivity(), getDialog(), this.mContentView, 0.78f);
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
        setStyle(0, R.style.AliUserDialogTheme);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("bcd5231c", new Object[]{this, layoutInflater, viewGroup, bundle});
        }
        getDialog().requestWindowFeature(1);
        View inflate = layoutInflater.inflate(getLayoutContent(), viewGroup);
        this.mContentView = inflate.findViewById(R.id.aliuser_operation_content);
        TextView textView = (TextView) inflate.findViewById(R.id.aliuser_operation_tip);
        this.mTitleTV = textView;
        if (textView != null) {
            textView.setMovementMethod(ScrollingMovementMethod.getInstance());
            if (!TextUtils.isEmpty(this.mTitleText)) {
                this.mTitleTV.setText(this.mTitleText);
            }
        }
        TextView textView2 = (TextView) inflate.findViewById(R.id.aliuser_operation_sencondary_tip);
        this.mContentTV = textView2;
        if (!this.contentVisible) {
            textView2.setVisibility(8);
        } else if (!TextUtils.isEmpty(this.mContextText)) {
            this.mContentTV.setText(this.mContextText);
        } else {
            generateContent(inflate);
        }
        Button button = (Button) inflate.findViewById(R.id.aliuser_operation_agree);
        if (button != null) {
            button.requestFocus();
            button.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.login4android.ui.TaobaoRegProtocolDialogFragment.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                        return;
                    }
                    TaobaoRegProtocolDialogFragment.this.dismissAllowingStateLoss();
                    View.OnClickListener onClickListener = TaobaoRegProtocolDialogFragment.this.mPositiveListener;
                    if (onClickListener != null) {
                        onClickListener.onClick(view);
                    }
                }
            });
            if (!TextUtils.isEmpty(this.mPostiveBtnText)) {
                button.setText(this.mPostiveBtnText);
            }
        }
        Button button2 = (Button) inflate.findViewById(R.id.aliuser_operation_disagree);
        if (button2 != null) {
            button2.setOnClickListener(new View.OnClickListener() { // from class: com.taobao.login4android.ui.TaobaoRegProtocolDialogFragment.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                        return;
                    }
                    TaobaoRegProtocolDialogFragment.this.dismissAllowingStateLoss();
                    View.OnClickListener onClickListener = TaobaoRegProtocolDialogFragment.this.mNagetiveListener;
                    if (onClickListener != null) {
                        onClickListener.onClick(view);
                    }
                }
            });
            if (this.negativeVisible) {
                button2.setVisibility(0);
            } else {
                button2.setVisibility(8);
            }
            if (!TextUtils.isEmpty(this.mNegativeBtnText)) {
                button2.setText(this.mNegativeBtnText);
            }
        }
        if (this.needAdaptElder) {
            ElderUtil.scaleTextSize(this.mTitleTV, this.mContentTV, button, button2);
        }
        setCancelable(false);
        initViews(inflate);
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
        if (DataProviderFactory.getDataProvider().isAdapterPadAndFold()) {
            DeviceUtils.adapterLoginDialogUIOnDevice(getActivity(), getDialog(), this.mContentView, 0.78f);
            return;
        }
        Dialog dialog = getDialog();
        if (dialog != null) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            getActivity().getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            int i = (int) (this.height * displayMetrics.density);
            Window window = dialog.getWindow();
            int i2 = (int) (displayMetrics.widthPixels * 0.78d);
            if (this.height == 0) {
                i = -2;
            }
            window.setLayout(i2, i);
        }
    }

    public void setCancelListener(View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca0a0a02", new Object[]{this, onClickListener});
        } else {
            this.mCancelListener = onClickListener;
        }
    }

    public void setContent(CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("588e9962", new Object[]{this, charSequence});
        } else {
            this.mContextText = charSequence;
        }
    }

    public void setLogoUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87775a13", new Object[]{this, str});
        } else {
            this.mLogoUrl = str;
        }
    }

    public void setNagetive(View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("516f2abb", new Object[]{this, onClickListener});
        } else {
            this.mNagetiveListener = onClickListener;
        }
    }

    public void setNeedAdaptElder(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("602910ed", new Object[]{this, new Boolean(z)});
        } else {
            this.needAdaptElder = z;
        }
    }

    public void setNegativeBtnText(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75200403", new Object[]{this, str});
        } else {
            this.mNegativeBtnText = str;
        }
    }

    public void setNegativeVisible(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bac7ea52", new Object[]{this, new Boolean(z)});
        } else {
            this.negativeVisible = z;
        }
    }

    public void setOneKeyProtocol(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95c89f24", new Object[]{this, str});
        } else {
            this.mOneKeyProtocol = str;
        }
    }

    public void setOneKeyProtocolUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac2e012d", new Object[]{this, str});
        } else {
            this.mOneKeyProtocolUrl = str;
        }
    }

    public void setPageNameSpm(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9be85f65", new Object[]{this, str});
        } else {
            this.mPageName = str;
        }
    }

    public void setPositive(View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac27f977", new Object[]{this, onClickListener});
        } else {
            this.mPositiveListener = onClickListener;
        }
    }

    public void setPostiveBtnText(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("819eb5a4", new Object[]{this, str});
        } else {
            this.mPostiveBtnText = str;
        }
    }

    public void setShowXianyu(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35c7b0f4", new Object[]{this, new Boolean(z)});
        } else {
            this.showXianyu = z;
        }
    }

    public void setTitle(CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70050a41", new Object[]{this, charSequence});
        } else {
            this.mTitleText = charSequence;
        }
    }

    public void setUseOrangeColor(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7f0e5d", new Object[]{this, new Boolean(z)});
        } else {
            this.useOrangeColor = z;
        }
    }

    public void setUseUnderLine(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e157e4e6", new Object[]{this, new Boolean(z)});
        } else {
            this.useUnderLine = z;
        }
    }

    @Override // androidx.fragment.app.DialogFragment
    public void show(FragmentManager fragmentManager, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc71dc71", new Object[]{this, fragmentManager, str});
            return;
        }
        try {
            super.show(fragmentManager, str);
        } catch (IllegalStateException unused) {
        }
    }
}
