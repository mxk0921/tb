package com.zoloz.android.phone.zdoc.fragment;

import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.hardware.Camera;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.alibaba.fastjson.JSON;
import com.alibaba.security.realidentity.ui.view.ALBiometricsActivityParentView;
import com.alibaba.wireless.security.SecExceptionCode;
import com.alipay.mobile.security.bio.service.BioAppDescription;
import com.alipay.mobile.security.bio.service.BioServiceManager;
import com.alipay.mobile.security.bio.service.BioUploadCallBack;
import com.alipay.mobile.security.bio.service.BioUploadResult;
import com.alipay.mobile.security.bio.service.BioUploadService;
import com.alipay.mobile.security.bio.utils.BioLog;
import com.alipay.mobile.security.bio.utils.StringUtil;
import com.alipay.zoloz.toyger.algorithm.TGFrame;
import com.alipay.zoloz.toyger.blob.BitmapHelper;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.zoloz.android.phone.zdoc.R;
import com.zoloz.android.phone.zdoc.camera.widget.CameraSurfaceView;
import com.zoloz.android.phone.zdoc.module.CollModule;
import com.zoloz.android.phone.zdoc.module.ZdocRemoteConfig;
import com.zoloz.android.phone.zdoc.ui.BaseMaskView;
import com.zoloz.android.phone.zdoc.ui.IMessageView;
import com.zoloz.android.phone.zdoc.ui.UIState;
import java.util.HashMap;
import tb.aj7;
import tb.alb;
import tb.glv;
import tb.hl7;
import tb.mxt;
import tb.oz2;
import tb.t2o;
import tb.tpx;
import tb.upx;
import tb.uyl;
import tb.vpx;
import tb.w5i;
import tb.wuu;
import tb.xz8;
import tb.zkb;
import zoloz.ap.com.toolkit.ui.TitleBar;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class BaseDocFragment extends BaseCameraPermissionFragment implements zkb {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "ZdocCaptureActivity";
    public BioAppDescription mBioAppDescription;
    public BioUploadService mBioUploadService;
    public String mBisToken;
    public alb mCameraInterface;
    public CameraSurfaceView mCameraSurfaceView;
    public byte[] mContent;
    public int mCurrentPageNumber;
    public int mCurrentPageNumberIndex;
    public int mCurrentRetryTimes;
    public BaseMaskView mDefaultMaskView;
    public hl7 mDialogHelper;
    public String mDocType;
    public boolean mIsUTF8;
    public byte[] mKey;
    public int mMaxRetryTimes;
    public IMessageView mMessageView;
    public ImageView mPhotoImageView;
    public tpx mRecordManager;
    public TitleBar mTitleBar;
    public int mUiType;
    public glv mUploadManager;
    public ZdocRemoteConfig mZdocRemoteConfig;
    private Handler mMainThreadHandler = new Handler(Looper.getMainLooper());
    public boolean mShowFrame = false;
    public UIState mCurrentState = UIState.CAPTURE;
    public boolean needRecordImageSize = true;
    public TGFrame currTgFrame = null;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public class a implements DialogInterface.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                return;
            }
            dialogInterface.dismiss();
            BaseDocFragment.this.mRecordManager.d(upx.NETWORK_ERROR, Integer.toString(1));
            BaseDocFragment.this.updateUI(UIState.UPLOADING);
            BaseDocFragment.this.upLoadImage();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public class b implements DialogInterface.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                return;
            }
            dialogInterface.dismiss();
            BaseDocFragment.this.mRecordManager.d(upx.NETWORK_ERROR, Integer.toString(0));
            BaseDocFragment.this.responseWithCode(SecExceptionCode.SEC_ERROR_STA_STORE_ILLEGEL_KEY, null);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public class c implements DialogInterface.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ BioUploadResult f15144a;

        public c(BioUploadResult bioUploadResult) {
            this.f15144a = bioUploadResult;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                return;
            }
            dialogInterface.dismiss();
            BaseDocFragment.this.mRecordManager.d(upx.OVER_THRESHOLD_ERROR, Integer.toString(1));
            BaseDocFragment.this.responseWithCode(209, this.f15144a);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public class d implements DialogInterface.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ UIState f15145a;

        public d(UIState uIState) {
            this.f15145a = uIState;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                return;
            }
            dialogInterface.dismiss();
            BaseDocFragment.this.mRecordManager.d(upx.ACTIVE_EXIT, Integer.toString(1));
            UIState uIState = this.f15145a;
            UIState uIState2 = UIState.CAPTURE;
            if (uIState == uIState2) {
                BaseDocFragment.this.updateUI(uIState2);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public class e implements DialogInterface.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                return;
            }
            dialogInterface.dismiss();
            BaseDocFragment.this.mRecordManager.d(upx.ACTIVE_EXIT, Integer.toString(0));
            BaseDocFragment.this.responseWithCode(301, null);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public class f implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            BaseDocFragment baseDocFragment = BaseDocFragment.this;
            baseDocFragment.mRecordManager.g(baseDocFragment.mCurrentState.toString(), upx.GO_BACK);
            BaseDocFragment.access$200(BaseDocFragment.this);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static /* synthetic */ class g {
        public static final /* synthetic */ int[] $SwitchMap$com$zoloz$android$phone$zdoc$ui$UIState;

        static {
            int[] iArr = new int[UIState.values().length];
            $SwitchMap$com$zoloz$android$phone$zdoc$ui$UIState = iArr;
            try {
                iArr[UIState.CAPTURE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$zoloz$android$phone$zdoc$ui$UIState[UIState.SCANNING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$zoloz$android$phone$zdoc$ui$UIState[UIState.SCAN_TASK_OK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$zoloz$android$phone$zdoc$ui$UIState[UIState.USER_CONFIRM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$zoloz$android$phone$zdoc$ui$UIState[UIState.UPLOADING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$zoloz$android$phone$zdoc$ui$UIState[UIState.UPLOAD_END_SUCCESS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$zoloz$android$phone$zdoc$ui$UIState[UIState.UPLOAD_END_FAIL.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$zoloz$android$phone$zdoc$ui$UIState[UIState.ALERT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public class h implements DialogInterface.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public h() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                return;
            }
            BaseDocFragment.this.mRecordManager.d(upx.SYSTEM_EXCEPTION_ERROR, Integer.toString(1));
            dialogInterface.dismiss();
            BaseDocFragment.this.responseWithCode(205, null);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public class i implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ double f15149a;
        public final /* synthetic */ double b;

        public i(double d, double d2) {
            this.f15149a = d;
            this.b = d2;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                BaseDocFragment.this.adjustPreview(this.f15149a, this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public class j implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ TGFrame f15150a;

        public j(TGFrame tGFrame) {
            this.f15150a = tGFrame;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                BaseDocFragment.this.showPreviewImg(this.f15150a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public class k implements DialogInterface.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ uyl f15151a;

        public k(BaseDocFragment baseDocFragment, uyl uylVar) {
            this.f15151a = uylVar;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
            } else {
                this.f15151a.execute();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public class l implements DialogInterface.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public l() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                return;
            }
            dialogInterface.dismiss();
            BaseDocFragment.this.mRecordManager.d(upx.CAMERA_ERROR, Integer.toString(1));
            BaseDocFragment.this.responseWithCode(100, null);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public class m implements BioUploadCallBack {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ BioUploadResult f15154a;

            public a(BioUploadResult bioUploadResult) {
                this.f15154a = bioUploadResult;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                hl7 hl7Var = BaseDocFragment.this.mDialogHelper;
                if (hl7Var != null) {
                    hl7Var.g();
                }
                BaseDocFragment.this.responseWithCode(500, this.f15154a);
            }
        }

        public m() {
        }

        public boolean onResponse(BioUploadResult bioUploadResult) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("97c3fce", new Object[]{this, bioUploadResult})).booleanValue();
            }
            if (bioUploadResult.validationRetCode == 2006) {
                bioUploadResult.productRetCode = 2001;
            }
            BaseDocFragment.this.mRecordManager.f();
            int i = bioUploadResult.productRetCode;
            if (i == 1001) {
                BaseDocFragment.this.mRecordManager.j(1, 1, 1001);
                BaseDocFragment.this.updateUI(UIState.UPLOAD_END_SUCCESS);
                new Handler().postDelayed(new a(bioUploadResult), 800L);
            } else if (i == 1002) {
                BaseDocFragment.this.handleSuccContinue();
            } else if (i == 2001) {
                BaseDocFragment.this.mRecordManager.j(1, 0, i);
                BaseDocFragment.this.updateUI(UIState.UPLOAD_END_FAIL);
                BaseDocFragment.this.failQuit(bioUploadResult);
            } else if (i == 2002) {
                BaseDocFragment.access$100(BaseDocFragment.this, bioUploadResult);
            } else if (i == 3001 || i == 3002) {
                BaseDocFragment.access$000(BaseDocFragment.this, bioUploadResult.subMsg);
            } else {
                BaseDocFragment.this.mRecordManager.j(1, 0, i);
                BaseDocFragment.this.updateUI(UIState.UPLOAD_END_FAIL);
                BaseDocFragment.this.updateUI(UIState.ALERT);
                BaseDocFragment.this.alertSystemError();
            }
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public class n implements DialogInterface.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public n() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                return;
            }
            BaseDocFragment.this.mCurrentRetryTimes++;
            dialogInterface.dismiss();
            BaseDocFragment.this.mRecordManager.d(upx.SERVER_QUALITY_ERROR, Integer.toString(1));
            BaseDocFragment.this.retry();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public class o implements DialogInterface.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public o() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                return;
            }
            dialogInterface.dismiss();
            BaseDocFragment.this.mRecordManager.d(upx.SERVER_QUALITY_ERROR, Integer.toString(0));
            BaseDocFragment.this.responseWithCode(301, null);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public class p implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public p() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            BaseDocFragment.this.updateUI(UIState.CAPTURE);
            BaseDocFragment.this.formatConfigs();
            BioLog.i("zdoc  mToygerDocService.config");
        }
    }

    static {
        t2o.a(245366931);
        t2o.a(245366902);
    }

    public static /* synthetic */ void access$000(BaseDocFragment baseDocFragment, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af624a87", new Object[]{baseDocFragment, str});
        } else {
            baseDocFragment.handleNetWorkError(str);
        }
    }

    public static /* synthetic */ void access$100(BaseDocFragment baseDocFragment, BioUploadResult bioUploadResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("470fd69f", new Object[]{baseDocFragment, bioUploadResult});
        } else {
            baseDocFragment.handleFailRetry(bioUploadResult);
        }
    }

    public static /* synthetic */ void access$200(BaseDocFragment baseDocFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24bea53b", new Object[]{baseDocFragment});
        } else {
            baseDocFragment.interrupt();
        }
    }

    private int findBackCameraId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9bc469fa", new Object[]{this})).intValue();
        }
        try {
            int numberOfCameras = Camera.getNumberOfCameras();
            Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
            for (int i2 = 0; i2 < numberOfCameras; i2++) {
                Camera.getCameraInfo(i2, cameraInfo);
                if (cameraInfo.facing == 0) {
                    return i2;
                }
            }
        } catch (RuntimeException e2) {
            BioLog.e(e2);
            this.mRecordManager.b("camera not found");
        }
        return 0;
    }

    private void handleFailRetry(BioUploadResult bioUploadResult) {
        char c2 = 1;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba85566c", new Object[]{this, bioUploadResult});
        } else if (bioUploadResult.extParams != null) {
            HashMap hashMap = new HashMap(bioUploadResult.extParams);
            this.mRecordManager.j(1, 0, 2002);
            updateUI(UIState.UPLOAD_END_FAIL);
            this.mRecordManager.l();
            this.mRecordManager.c(upx.SERVER_QUALITY_ERROR);
            hl7 hl7Var = this.mDialogHelper;
            if (hl7Var != null && !hl7Var.i()) {
                updateUI(UIState.ALERT);
                if (this.mCurrentRetryTimes < this.mMaxRetryTimes) {
                    String string = getString(R.string.zdoc_unknow_title);
                    String string2 = getString(R.string.zdoc_unknow_msg);
                    try {
                        String str = (String) JSON.parseObject((String) hashMap.get("clientExtInfo")).get("detectCode");
                        if (!StringUtil.isNullorEmpty(str)) {
                            switch (str.hashCode()) {
                                case -2003602871:
                                    if (str.equals("IMPERFECT")) {
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case -1437569509:
                                    if (str.equals("NO_FACE")) {
                                        c2 = 4;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case -1143378681:
                                    if (str.equals("EXPOSURE")) {
                                        c2 = 3;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case 2041959:
                                    if (str.equals("BLUR")) {
                                        c2 = 2;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case 228486029:
                                    if (str.equals("WRONG_DOCUMENT")) {
                                        c2 = 5;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case 666915289:
                                    if (str.equals("NO_DOCUMENT")) {
                                        c2 = 0;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case 735991061:
                                    if (str.equals("EXPIRED_DOCUMENT")) {
                                        c2 = 6;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                default:
                                    c2 = 65535;
                                    break;
                            }
                            switch (c2) {
                                case 0:
                                    string = getString(R.string.zdoc_no_document_title);
                                    string2 = getString(R.string.zdoc_no_document_msg);
                                    break;
                                case 1:
                                    string = getString(R.string.zdoc_imperfect_title);
                                    string2 = getString(R.string.zdoc_imperfect_msg);
                                    break;
                                case 2:
                                    string = getString(R.string.zdoc_blur_title);
                                    string2 = getString(R.string.zdoc_blur_msg);
                                    break;
                                case 3:
                                    string = getString(R.string.zdoc_exposure_title);
                                    string2 = getString(R.string.zdoc_exposure_msg);
                                    break;
                                case 4:
                                    string = getString(R.string.zdoc_noface_title);
                                    string2 = getString(R.string.zdoc_noface_msg);
                                    break;
                                case 5:
                                    string = getString(R.string.zdoc_wrong_document_title);
                                    string2 = getString(R.string.zdoc_wrong_document_msg);
                                    break;
                                case 6:
                                    string = getString(R.string.zdoc_expired_document_title);
                                    string2 = getString(R.string.zdoc_expired_document_msg);
                                    break;
                            }
                        }
                    } catch (Exception unused) {
                    }
                    this.mDialogHelper.d(string, string2, getString(R.string.zdoc_dialog_retry), new n(), getString(R.string.zdoc_dialog_close), new o());
                    return;
                }
                failQuit(null);
            }
        }
    }

    private void handleNetWorkError(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("621a4fb3", new Object[]{this, str});
            return;
        }
        this.mRecordManager.j(0, 0, 999);
        updateUI(UIState.UPLOAD_END_FAIL);
        this.mRecordManager.c(upx.NETWORK_ERROR);
        hl7 hl7Var = this.mDialogHelper;
        if (hl7Var != null && !hl7Var.i()) {
            updateUI(UIState.ALERT);
            this.mDialogHelper.d(getString(R.string.network_error_title), getString(R.string.network_error_msg), getString(R.string.network_error_retry), new a(), getString(R.string.network_error_exit), new b());
        }
    }

    private void handleScanTaskOK() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1093ccd", new Object[]{this});
        } else {
            this.mShowFrame = true;
        }
    }

    private void initUpload() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2804d738", new Object[]{this});
        } else if (this.mBioAppDescription != null && this.mZdocRemoteConfig != null) {
            glv glvVar = new glv(getActivity(), this.mBioAppDescription, this.mZdocRemoteConfig);
            this.mUploadManager = glvVar;
            glvVar.d();
            if (BioServiceManager.getCurrentInstance() == null) {
                BioLog.e(new IllegalStateException("null == BioServiceManager.getCurrentInstance()"));
                getActivity().finish();
                return;
            }
            BioUploadService bioUploadService = (BioUploadService) BioServiceManager.getCurrentInstance().getBioService(BioUploadService.class);
            this.mBioUploadService = bioUploadService;
            bioUploadService.clearUp();
            this.mBioUploadService.addCallBack(new m());
        }
    }

    private void interrupt() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("363cc96a", new Object[]{this});
            return;
        }
        hl7 hl7Var = this.mDialogHelper;
        if (hl7Var != null && !hl7Var.i()) {
            this.mRecordManager.c(upx.ACTIVE_EXIT);
            UIState uIState = this.mCurrentState;
            updateUI(UIState.ALERT);
            this.mDialogHelper.d(getString(R.string.zdoc_user_cancel_title), getString(R.string.zdoc_user_cancel_msg), getString(R.string.zdoc_user_cancel_stay), new d(uIState), getString(R.string.zdoc_user_cancel_quit), new e());
        }
    }

    public static /* synthetic */ Object ipc$super(BaseDocFragment baseDocFragment, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1504501726) {
            super.onDestroy();
            return null;
        } else if (hashCode == -641568046) {
            super.onCreate((Bundle) objArr[0]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/zoloz/android/phone/zdoc/fragment/BaseDocFragment");
        }
    }

    public void adjustPreview(double d2, double d3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec7e6d00", new Object[]{this, new Double(d2), new Double(d3)});
            return;
        }
        CameraSurfaceView cameraSurfaceView = this.mCameraSurfaceView;
        if (cameraSurfaceView != null) {
            ViewGroup.LayoutParams layoutParams = cameraSurfaceView.getLayoutParams();
            ViewGroup.LayoutParams layoutParams2 = this.mPhotoImageView.getLayoutParams();
            int width = this.mCameraSurfaceView.getWidth();
            int height = this.mCameraSurfaceView.getHeight();
            int i2 = (int) ((width / d2) * d3);
            if (i2 >= height) {
                layoutParams.height = i2;
                layoutParams2.height = i2;
            } else {
                int i3 = (int) ((height / d3) * d2);
                if (i3 >= width) {
                    layoutParams.width = i3;
                    layoutParams2.width = i3;
                }
            }
            this.mCameraSurfaceView.setLayoutParams(layoutParams);
            this.mPhotoImageView.setLayoutParams(layoutParams2);
        }
    }

    @Override // com.zoloz.android.phone.zdoc.fragment.BaseCameraPermissionFragment
    public void alertCameraNoPermissionDialog(uyl uylVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aff18b68", new Object[]{this, uylVar});
            return;
        }
        tpx tpxVar = this.mRecordManager;
        if (tpxVar != null) {
            tpxVar.e(0);
        }
        if (this.mDialogHelper == null) {
            this.mDialogHelper = new hl7(getActivity());
        }
        this.mDialogHelper.d(getString(R.string.zdoc_camera_permission_title), getString(R.string.zdoc_camera_permission_msg), getString(R.string.zdoc_camera_permission_settings), new k(this, uylVar), getString(R.string.zdoc_camera_permission_not_allow), new l());
    }

    @Override // com.zoloz.android.phone.zdoc.fragment.BaseCameraPermissionFragment
    public void alertSystemError() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9559024", new Object[]{this});
            return;
        }
        hl7 hl7Var = this.mDialogHelper;
        if (hl7Var != null && !hl7Var.i()) {
            this.mRecordManager.c(upx.SYSTEM_EXCEPTION_ERROR);
            this.mDialogHelper.d(getString(R.string.system_error_title), getString(R.string.system_error_msg), getString(R.string.system_error_got_it), new h(), null, null);
        }
    }

    public TGFrame createTGFrame(oz2 oz2Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TGFrame) ipChange.ipc$dispatch("3e111bfc", new Object[]{this, oz2Var});
        }
        TGFrame tGFrame = new TGFrame();
        tGFrame.data = oz2Var.a().array();
        tGFrame.width = oz2Var.c();
        tGFrame.height = oz2Var.b();
        tGFrame.frameMode = 0;
        tGFrame.rotation = CameraSurfaceView.getCameraImpl(getContext()).getCameraViewRotation() % 360;
        return tGFrame;
    }

    public void failQuit(BioUploadResult bioUploadResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17e17d97", new Object[]{this, bioUploadResult});
            return;
        }
        this.mRecordManager.c(upx.OVER_THRESHOLD_ERROR);
        this.mRecordManager.i();
        hl7 hl7Var = this.mDialogHelper;
        if (hl7Var != null) {
            hl7Var.d(getString(R.string.zdoc_retry_max_title), getString(R.string.zdoc_retry_max_msg), getString(R.string.zdoc_retry_max_got_it), new c(bioUploadResult), null, null);
        }
    }

    public void formatConfigs() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62a42901", new Object[]{this});
            return;
        }
        ZdocRemoteConfig zdocRemoteConfig = this.mZdocRemoteConfig;
        if (zdocRemoteConfig != null) {
            CollModule coll = zdocRemoteConfig.getModules().get(this.mCurrentPageNumberIndex).getColl();
            this.mUiType = coll.getUiType();
            this.mDocType = coll.getDocType();
            this.mCurrentPageNumber = coll.getPageNo();
            this.mCurrentRetryTimes = 0;
            this.mMaxRetryTimes = coll.getRetryLimit();
            this.mRecordManager.m(this.mCurrentPageNumber);
        }
    }

    public aj7 getCurrentDeviceSetting() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (aj7) ipChange.ipc$dispatch("8c89ad0a", new Object[]{this});
        }
        aj7 aj7Var = new aj7();
        aj7Var.g(false);
        aj7Var.h(findBackCameraId());
        return aj7Var;
    }

    @Override // com.zoloz.android.phone.zdoc.fragment.BaseCameraPermissionFragment
    public int getLayoutId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bf537e55", new Object[]{this})).intValue();
        }
        return wuu.d(getActivity(), this.mUiType, this.mDocType, this.mCurrentPageNumber);
    }

    public void handleAlert(UIState uIState) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d5c722f", new Object[]{this, uIState});
        } else if (uIState == UIState.CAPTURE) {
            this.mShowFrame = true;
            this.mRecordManager.f();
        }
    }

    public void handleCapture() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("299c8985", new Object[]{this});
            return;
        }
        hl7 hl7Var = this.mDialogHelper;
        if (hl7Var != null) {
            hl7Var.g();
        }
        this.mPhotoImageView.setVisibility(4);
        this.mCameraSurfaceView.setVisibility(0);
    }

    public void handleSuccContinue() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0c17358", new Object[]{this});
            return;
        }
        hl7 hl7Var = this.mDialogHelper;
        if (hl7Var != null) {
            hl7Var.g();
        }
        this.mCurrentRetryTimes = 0;
        this.mRecordManager.j(1, 1, 1002);
        updateUI(UIState.UPLOAD_END_SUCCESS);
        int i2 = this.mCurrentPageNumberIndex + 1;
        this.mCurrentPageNumberIndex = i2;
        if (i2 < this.mZdocRemoteConfig.getModules().size()) {
            new Handler().postDelayed(new p(), 1000L);
        } else {
            this.mCurrentPageNumberIndex--;
        }
    }

    public void handleUploading() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54dcbd00", new Object[]{this});
            return;
        }
        hl7 hl7Var = this.mDialogHelper;
        if (hl7Var != null) {
            hl7Var.l("", false, null, true);
        }
    }

    public void handleUserConfirm() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c063f34", new Object[]{this});
        } else {
            this.mShowFrame = true;
        }
    }

    public void hotReloadUI() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("acdd2ce1", new Object[]{this});
            return;
        }
        new mxt(this.mTitleBar).a();
        new w5i(this.mDefaultMaskView).a();
    }

    public void initData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1ae4861", new Object[]{this});
            return;
        }
        this.mBioAppDescription = getArguments().getSerializable(ALBiometricsActivityParentView.p);
        ZdocRemoteConfig zdocRemoteConfig = (ZdocRemoteConfig) getArguments().getSerializable("config");
        this.mZdocRemoteConfig = zdocRemoteConfig;
        BioAppDescription bioAppDescription = this.mBioAppDescription;
        if (bioAppDescription != null && zdocRemoteConfig != null) {
            this.mBisToken = bioAppDescription.getBistoken();
        }
    }

    public Rect mappingToPic(Rect rect) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Rect) ipChange.ipc$dispatch("998fab3a", new Object[]{this, rect});
        }
        int colorHeight = CameraSurfaceView.getCameraImpl(getActivity()).getColorHeight();
        int colorWidth = CameraSurfaceView.getCameraImpl(getActivity()).getColorWidth();
        if (colorHeight >= colorWidth) {
            colorWidth = colorHeight;
            colorHeight = colorWidth;
        }
        int height = this.mCameraSurfaceView.getHeight();
        int width = this.mCameraSurfaceView.getWidth();
        int width2 = (width - this.mDefaultMaskView.getWidth()) / 2;
        int height2 = (height - this.mDefaultMaskView.getHeight()) / 2;
        Rect rect2 = new Rect(rect.left + width2, rect.top + height2, rect.right + width2, rect.bottom + height2);
        float f2 = colorHeight / width;
        BioLog.i("mappingToPic leftx =" + rect2.left + "rightX =" + rect2.right + "leftY =" + rect2.top + "rightY =" + rect2.bottom + "imagewidth =" + colorHeight + "imageheight =" + colorWidth + "screenwidth =" + width + "screenheight =" + height + "ratioH =" + f2);
        rect2.left = (int) (((float) rect2.left) * f2);
        float f3 = (((float) colorWidth) - (((float) height) * f2)) / 2.0f;
        rect2.top = (int) ((((float) rect2.top) * f2) + f3);
        rect2.right = (int) (((float) rect2.right) * f2);
        rect2.bottom = (int) ((f2 * ((float) rect2.bottom)) + f3);
        BioLog.i("mappingToPic leftx =" + rect2.left + "rightX =" + rect2.right + "leftY =" + rect2.top + "rightY =" + rect2.bottom + "imagewidth =" + colorHeight + "imageheight =" + colorWidth + "screenwidth =" + width + "screenheight =" + height);
        return rect2;
    }

    @Override // com.zoloz.android.phone.zdoc.fragment.BaseFragment
    public boolean onBackPressed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("88afc67", new Object[]{this})).booleanValue();
        }
        interrupt();
        return true;
    }

    @Override // com.zoloz.android.phone.zdoc.fragment.BaseCameraPermissionFragment
    public void onCameraInit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f680bb9b", new Object[]{this});
            return;
        }
        alb cameraImpl = CameraSurfaceView.getCameraImpl(getActivity());
        this.mCameraInterface = cameraImpl;
        if (cameraImpl != null) {
            cameraImpl.b(this);
            this.mCameraInterface.a(getCurrentDeviceSetting());
        } else {
            alertSystemError();
        }
        CameraSurfaceView cameraSurfaceView = this.mCameraSurfaceView;
        if (cameraSurfaceView != null) {
            cameraSurfaceView.setCameraCallback(this);
            this.mCameraSurfaceView.setVisibility(0);
            updateUI(UIState.CAPTURE);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        if (BioServiceManager.getCurrentInstance() == null) {
            BioLog.e(new IllegalStateException("null == BioServiceManager.getCurrentInstance()"));
            getActivity().finish();
            return;
        }
        initData();
        initUpload();
        this.mCurrentPageNumberIndex = 0;
        this.mRecordManager = new tpx();
        formatConfigs();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        this.mCurrentPageNumberIndex = 0;
        this.mCurrentPageNumber = 0;
        this.mCurrentRetryTimes = 0;
        this.mContent = null;
        this.mKey = null;
        IMessageView iMessageView = this.mMessageView;
        if (iMessageView != null) {
            iMessageView.clearClickListener();
        }
        TitleBar titleBar = this.mTitleBar;
        if (titleBar != null) {
            titleBar.setClickListener(null);
        }
        hl7 hl7Var = this.mDialogHelper;
        if (hl7Var != null) {
            hl7Var.h();
            this.mDialogHelper.j();
            this.mDialogHelper = null;
        }
        alb albVar = this.mCameraInterface;
        if (albVar != null) {
            albVar.releaseCamera();
        }
        if (this.mUploadManager != null) {
            this.mUploadManager = null;
        }
        this.mBioUploadService = null;
        tpx tpxVar = this.mRecordManager;
        if (tpxVar != null) {
            tpxVar.a();
        }
        super.onDestroy();
    }

    @Override // tb.zkb
    public void onError(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25ce1193", new Object[]{this, new Integer(i2)});
        } else if (i2 == -1) {
            this.mCameraSurfaceView.setVisibility(4);
            checkCameraPermission();
        } else if (i2 != 0) {
            this.mCameraSurfaceView.setVisibility(4);
            alertSystemError();
        }
    }

    @Override // com.zoloz.android.phone.zdoc.fragment.BaseCameraPermissionFragment
    public void onInitView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4395295b", new Object[]{this});
            return;
        }
        this.mDialogHelper = new hl7(getActivity());
        this.mCameraSurfaceView = (CameraSurfaceView) findViewById(R.id.surface);
        this.mPhotoImageView = (ImageView) findViewById(R.id.iv_photo);
        this.mTitleBar = (TitleBar) findViewById(R.id.layout_titlebar);
        IMessageView iMessageView = (IMessageView) findViewById(R.id.layout_message);
        this.mMessageView = iMessageView;
        ZdocRemoteConfig zdocRemoteConfig = this.mZdocRemoteConfig;
        if (zdocRemoteConfig != null) {
            iMessageView.updateUI(UIState.CAPTURE, zdocRemoteConfig.getShowPowerByZoloz(), -1);
        }
        this.mTitleBar.setClickListener(new f());
        BaseMaskView baseMaskView = (BaseMaskView) findViewById(R.id.layout_mask_view);
        this.mDefaultMaskView = baseMaskView;
        baseMaskView.setLayerType(1, null);
        if (this.mBioAppDescription == null || this.mZdocRemoteConfig == null) {
            alertSystemError();
        }
        hotReloadUI();
    }

    @Override // tb.zkb
    public void onPreviewFrame(oz2 oz2Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8179d3b6", new Object[]{this, oz2Var});
            return;
        }
        if (this.mShowFrame) {
            TGFrame tGFrame = this.currTgFrame;
            if (tGFrame == null) {
                tGFrame = createTGFrame(oz2Var);
            }
            runOnUiThread(new j(tGFrame));
            this.mShowFrame = false;
        }
        BioLog.i("recordImageSize " + oz2Var.c() + " " + oz2Var.b());
        if (this.needRecordImageSize) {
            this.mRecordManager.h(oz2Var.c(), oz2Var.b());
            this.needRecordImageSize = false;
        }
    }

    @Override // tb.zkb
    public void onSurfaceChanged(double d2, double d3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("641eb30d", new Object[]{this, new Double(d2), new Double(d3)});
        } else {
            this.mMainThreadHandler.post(new i(d2, d3));
        }
    }

    @Override // tb.zkb
    public void onSurfaceCreated() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8a0fcc1", new Object[]{this});
        } else {
            this.mRecordManager.e(1);
        }
    }

    @Override // tb.zkb
    public void onSurfaceDestroyed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("931706f2", new Object[]{this});
        }
    }

    public void onWindowFocusChanged(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097302", new Object[]{this, new Boolean(z)});
        } else if (z && getActivity() != null && !getActivity().isFinishing()) {
            this.mMessageView.setUiLocation(this.mUiType, this.mDocType, this.mCurrentPageNumber, this.mCameraSurfaceView.getHeight(), this.mDefaultMaskView.getTipsBottomMargin(), this.mDefaultMaskView.getInvisibleHeight());
        }
    }

    public void responseWithCode(int i2, BioUploadResult bioUploadResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b99f45ab", new Object[]{this, new Integer(i2), bioUploadResult});
            return;
        }
        vpx vpxVar = new vpx();
        vpxVar.b = i2;
        vpxVar.c = bioUploadResult;
        xz8.a().c(vpxVar);
    }

    public void retry() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3ea132f", new Object[]{this});
        } else {
            updateUI(UIState.CAPTURE);
        }
    }

    public void showPreviewImg(TGFrame tGFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be0f4e7d", new Object[]{this, tGFrame});
            return;
        }
        try {
            this.mPhotoImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            Bitmap rotateBitmap = BitmapHelper.rotateBitmap(BitmapHelper.bytes2Bitmap(tGFrame.data, tGFrame.width, tGFrame.height, tGFrame.frameMode), tGFrame.rotation);
            if (rotateBitmap != null) {
                this.mPhotoImageView.setImageBitmap(BitmapHelper.resize(rotateBitmap, (int) (rotateBitmap.getWidth() * 0.8f), (int) (rotateBitmap.getHeight() * 0.8f)));
                this.mPhotoImageView.setVisibility(0);
            }
        } catch (OutOfMemoryError unused) {
            this.mRecordManager.b("zdoc_out_of_memory");
            System.gc();
        }
    }

    public void upLoadImage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("219c7b41", new Object[]{this});
            return;
        }
        byte[] bArr = this.mContent;
        if (bArr != null) {
            this.mRecordManager.k(bArr.length);
            glv glvVar = this.mUploadManager;
            if (glvVar != null) {
                glvVar.f(this.mCurrentRetryTimes);
                this.mUploadManager.g(this.mContent, this.mKey, this.mIsUTF8);
                return;
            }
            return;
        }
        alertSystemError();
    }

    public void updateUI(UIState uIState) {
        IMessageView iMessageView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ced99bc6", new Object[]{this, uIState});
            return;
        }
        switch (g.$SwitchMap$com$zoloz$android$phone$zdoc$ui$UIState[uIState.ordinal()]) {
            case 1:
            case 2:
                handleCapture();
                break;
            case 3:
                handleScanTaskOK();
                break;
            case 4:
                handleUserConfirm();
                break;
            case 5:
                handleUploading();
                break;
            case 6:
                hl7 hl7Var = this.mDialogHelper;
                if (hl7Var != null) {
                    hl7Var.m(false, null);
                    break;
                }
                break;
            case 7:
                hl7 hl7Var2 = this.mDialogHelper;
                if (hl7Var2 != null) {
                    hl7Var2.g();
                    break;
                }
                break;
            case 8:
                handleAlert(this.mCurrentState);
                break;
        }
        this.mCurrentState = uIState;
        ZdocRemoteConfig zdocRemoteConfig = this.mZdocRemoteConfig;
        if (zdocRemoteConfig != null && (iMessageView = this.mMessageView) != null) {
            iMessageView.updateUI(uIState, zdocRemoteConfig.getShowPowerByZoloz(), -1);
        }
    }
}
