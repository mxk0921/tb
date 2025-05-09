package com.zoloz.android.phone.zdoc.fragment;

import android.view.View;
import com.alipay.mobile.security.bio.service.BioServiceManager;
import com.alipay.zoloz.toyger.algorithm.TGFrame;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.ap.zlz.toyger.zdoc.ToygerDocBlobConfig;
import com.zoloz.android.phone.zdoc.ui.UIState;
import java.util.HashMap;
import tb.hl7;
import tb.oz2;
import tb.t2o;
import tb.upx;
import tb.v5u;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class ZdocCaptureFragment extends BaseDocFragment {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private boolean isCaptured = false;
    private TGFrame mTGFrame;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            ZdocCaptureFragment zdocCaptureFragment = ZdocCaptureFragment.this;
            zdocCaptureFragment.mRecordManager.g(zdocCaptureFragment.mCurrentState.toString(), "take_photo");
            ZdocCaptureFragment.access$002(ZdocCaptureFragment.this, true);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public class b implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            ZdocCaptureFragment zdocCaptureFragment = ZdocCaptureFragment.this;
            zdocCaptureFragment.mRecordManager.g(zdocCaptureFragment.mCurrentState.toString(), upx.PHOTO_CONFIRM);
            ZdocCaptureFragment.this.updateUI(UIState.UPLOADING);
            ZdocCaptureFragment.this.upLoadImage();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public class c implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            ZdocCaptureFragment zdocCaptureFragment = ZdocCaptureFragment.this;
            zdocCaptureFragment.mRecordManager.g(zdocCaptureFragment.mCurrentState.toString(), upx.PHOTO_CANCEL);
            ZdocCaptureFragment.this.updateUI(UIState.CAPTURE);
        }
    }

    static {
        t2o.a(245366951);
    }

    public static /* synthetic */ boolean access$002(ZdocCaptureFragment zdocCaptureFragment, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("180eab3e", new Object[]{zdocCaptureFragment, new Boolean(z)})).booleanValue();
        }
        zdocCaptureFragment.isCaptured = z;
        return z;
    }

    public static /* synthetic */ Object ipc$super(ZdocCaptureFragment zdocCaptureFragment, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -2122722378:
                super.onPreviewFrame((oz2) objArr[0]);
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case -833446436:
                super.initView();
                return null;
            case 563903297:
                super.upLoadImage();
                return null;
            case 698124677:
                super.handleCapture();
                return null;
            case 1281559479:
                super.onRestart();
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/zoloz/android/phone/zdoc/fragment/ZdocCaptureFragment");
        }
    }

    private void record(String str) {
        upx upxVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ecfa2422", new Object[]{this, str});
            return;
        }
        BioServiceManager currentInstance = BioServiceManager.getCurrentInstance();
        if (currentInstance != null && (upxVar = (upx) currentInstance.getBioService(upx.class)) != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("module", "toyger");
            upxVar.write(str, hashMap);
        }
    }

    @Override // com.zoloz.android.phone.zdoc.fragment.BaseDocFragment
    public void handleCapture() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("299c8985", new Object[]{this});
            return;
        }
        super.handleCapture();
        this.isCaptured = false;
        this.mPhotoImageView.setVisibility(8);
    }

    @Override // com.zoloz.android.phone.zdoc.fragment.BaseCameraPermissionFragment
    public void initView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce529ddc", new Object[]{this});
            return;
        }
        super.initView();
        this.mMessageView.setOnTakePhotoListener(new a());
        this.mMessageView.setOnConfirmListener(new b());
        this.mMessageView.setOnReTakePhotoListener(new c());
    }

    @Override // com.zoloz.android.phone.zdoc.fragment.BaseDocFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        this.mTGFrame = null;
    }

    @Override // com.zoloz.android.phone.zdoc.fragment.BaseDocFragment, tb.zkb
    public void onPreviewFrame(oz2 oz2Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8179d3b6", new Object[]{this, oz2Var});
            return;
        }
        super.onPreviewFrame(oz2Var);
        if (this.isCaptured) {
            this.mTGFrame = createTGFrame(oz2Var);
            this.isCaptured = false;
            updateUI(UIState.USER_CONFIRM);
        }
    }

    @Override // com.zoloz.android.phone.zdoc.fragment.BaseFragment
    public void onRestart() {
        hl7 hl7Var;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c630bb7", new Object[]{this});
            return;
        }
        super.onRestart();
        if (hasCameraPermission() && (hl7Var = this.mDialogHelper) != null && !hl7Var.i()) {
            UIState uIState = this.mCurrentState;
            UIState uIState2 = UIState.CAPTURE;
            if (uIState == uIState2) {
                updateUI(uIState2);
            }
        }
    }

    @Override // com.zoloz.android.phone.zdoc.fragment.BaseDocFragment
    public void upLoadImage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("219c7b41", new Object[]{this});
            return;
        }
        if (this.mTGFrame != null) {
            ToygerDocBlobConfig toygerDocBlobConfig = new ToygerDocBlobConfig();
            toygerDocBlobConfig.ratio = this.mZdocRemoteConfig.getRatio();
            toygerDocBlobConfig.pageNo = this.mCurrentPageNumber;
            toygerDocBlobConfig.pubkey = this.mUploadManager.c();
            record(upx.ZTECH_ENTER);
            toygerDocBlobConfig.docType = this.mZdocRemoteConfig.getModules().get(Math.min(this.mCurrentPageNumberIndex, this.mZdocRemoteConfig.getModules().size() - 1)).getColl().getDocType();
            HashMap<String, Object> a2 = v5u.a(this.mTGFrame, toygerDocBlobConfig, mappingToPic(this.mDefaultMaskView.getDocFrame()), 1, this.mBisToken, String.valueOf(this.mCurrentRetryTimes));
            this.mContent = (byte[]) a2.get("content");
            this.mKey = (byte[]) a2.get("key");
            this.mIsUTF8 = ((Boolean) a2.get("isUTF8")).booleanValue();
        }
        super.upLoadImage();
    }
}
