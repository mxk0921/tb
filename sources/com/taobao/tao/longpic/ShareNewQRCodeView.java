package com.taobao.tao.longpic;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.os.AsyncTask;
import android.os.Environment;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import android.preference.PreferenceManager;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.widget.Toast;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.ability.localization.Localization;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.task.Coordinator;
import com.taobao.phenix.intf.event.FailPhenixEvent;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import com.taobao.schedule.ViewProxy;
import com.taobao.share.globalmodel.TBShareContent;
import com.taobao.share.multiapp.ShareBizAdapter;
import com.taobao.share.taopassword.constants.TPTargetType;
import com.taobao.statistic.TBS;
import com.taobao.tao.log.TLog;
import com.taobao.tao.longpic.SnapshotTargetView;
import com.taobao.tao.util.BitmapUtil;
import com.taobao.taobao.R;
import com.taobao.taobao.scancode.encode.aidlservice.BitmapHolder;
import com.taobao.taobao.scancode.encode.aidlservice.EncodeCallback;
import com.taobao.taobao.scancode.encode.aidlservice.EncodeError;
import com.taobao.taobao.scancode.encode.aidlservice.MaSizeType;
import com.taobao.uikit.extend.feature.view.TIconFontTextView;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import com.taobao.umipublish.draft.DraftManager;
import com.ut.share.business.ShareBusiness;
import com.ut.share.business.ShareTargetType;
import com.ut.share.data.ShareData;
import com.ut.share.utils.ShareUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import mtopsdk.common.util.SymbolExpUtil;
import tb.a0m;
import tb.blo;
import tb.bwr;
import tb.hhi;
import tb.hjp;
import tb.hwr;
import tb.iy4;
import tb.kwr;
import tb.lkp;
import tb.lr7;
import tb.lwm;
import tb.md8;
import tb.nd8;
import tb.p0u;
import tb.pg1;
import tb.s0m;
import tb.s8d;
import tb.t2o;
import tb.tn1;
import tb.vi3;
import tb.z6n;
import tb.zoe;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class ShareNewQRCodeView implements PopupWindow.OnDismissListener {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TEXT_COLOR = "color";
    private static final String TEXT_INFO = "content";
    private static final String TEXT_SIZE = "size";
    private static final int TEXT_SIZE_BIG = 18;
    private static final int TEXT_SIZE_NORMAL = 16;
    private static final int TEXT_SIZE_SMALL = 12;
    private static final String TYPE = "type";
    private LinearLayout bottomViews;
    private Animation dismissAnimation;
    private FrameLayout frameLayout;
    private LayoutInflater inflater;
    private LinearLayout linearLayout;
    private u listener;
    private Context mContext;
    private TextView mCopyRightView;
    private PopupWindow mPopupWindow;
    private Bitmap mQRBitmap;
    private TUrlImageView mQRCodeLogoView;
    private View mQRCodeView;
    private TextView mQrCodeDesp1View;
    private TextView mQrCodeDesp2View;
    private TextView mQrTipsTextView;
    private String mShareUrl;
    private View mView;
    private View progressLayout;
    private Animation showAnimation;
    private static String GEN3_CODE_WHITE_BG_URL = "https://gw.alicdn.com/tfs/TB1pLH_ewMPMeJjy1XdXXasrXXa-520-520.png";
    public static String TAO_LOGO_URL = "https://gw.alicdn.com/tfs/TB17ir_ewMPMeJjy1XdXXasrXXa-200-200.png";
    private static String QR_BASE_WIDTH = "baseWidth";
    private static String QR_TEMPLATE = "template";
    private static String[] QR_PARAMS = {"top", "left", "width", "height"};
    private static String QR_TOP = "top";
    private static String QR_LEFT = "left";
    private static String QR_WIDTH = "width";
    private static String QR_HEIGHT = "height";
    private static String QR_URL = "url";
    private boolean mGetBitmapFinish = false;
    private ArrayList<ImageView> qrImageViews = new ArrayList<>();
    private String taoLongPicCode = "qrcode";
    private String isSuperUser = "0";
    private boolean isShowShareDialog = false;
    private boolean isDoShareProgress = false;
    private SnapshotTargetView.b shareListener = new f();
    private Handler mHandler = new Handler(Looper.getMainLooper());

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements s8d<SuccPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f12503a;

        public a(int i) {
            this.f12503a = i;
        }

        /* renamed from: a */
        public boolean onHappen(SuccPhenixEvent succPhenixEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("362cccf4", new Object[]{this, succPhenixEvent})).booleanValue();
            }
            if (succPhenixEvent.getDrawable() != null && !succPhenixEvent.isIntermediate()) {
                Bitmap bitmap = succPhenixEvent.getDrawable().getBitmap();
                float density = (bitmap.getDensity() * 1.0f) / 320.0f;
                if (density > 0.0f) {
                    Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, (int) (bitmap.getWidth() * density), (int) (bitmap.getHeight() * density), true);
                    if (createScaledBitmap != bitmap && !bitmap.isRecycled()) {
                        bitmap.recycle();
                    }
                    ShareNewQRCodeView.access$800(ShareNewQRCodeView.this, this.f12503a, createScaledBitmap);
                } else {
                    ShareNewQRCodeView.access$800(ShareNewQRCodeView.this, this.f12503a, bitmap);
                }
            }
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class c implements s8d<FailPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f12505a;
        public final /* synthetic */ int b;
        public final /* synthetic */ EncodeCallback c;

        public c(String str, int i, EncodeCallback encodeCallback) {
            this.f12505a = str;
            this.b = i;
            this.c = encodeCallback;
        }

        /* renamed from: a */
        public boolean onHappen(FailPhenixEvent failPhenixEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5fa0e8d0", new Object[]{this, failPhenixEvent})).booleanValue();
            }
            ShareNewQRCodeView.access$1300(ShareNewQRCodeView.this, this.f12505a, this.b, this.c, null);
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class d implements s8d<SuccPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f12506a;
        public final /* synthetic */ int b;
        public final /* synthetic */ EncodeCallback c;

        public d(String str, int i, EncodeCallback encodeCallback) {
            this.f12506a = str;
            this.b = i;
            this.c = encodeCallback;
        }

        /* renamed from: a */
        public boolean onHappen(SuccPhenixEvent succPhenixEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("362cccf4", new Object[]{this, succPhenixEvent})).booleanValue();
            }
            if (succPhenixEvent.getDrawable() != null && !succPhenixEvent.isIntermediate()) {
                ShareNewQRCodeView.access$1300(ShareNewQRCodeView.this, this.f12506a, this.b, this.c, succPhenixEvent.getDrawable().getBitmap());
            }
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class e implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Bitmap f12507a;
        public final /* synthetic */ String b;
        public final /* synthetic */ EncodeCallback c;
        public final /* synthetic */ int d;

        public e(Bitmap bitmap, String str, EncodeCallback encodeCallback, int i) {
            this.f12507a = bitmap;
            this.b = str;
            this.c = encodeCallback;
            this.d = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            Bitmap bitmap = this.f12507a;
            if (bitmap == null) {
                bitmap = BitmapFactory.decodeResource(ShareNewQRCodeView.access$200(ShareNewQRCodeView.this).getResources(), R.drawable.share_tao_ico).copy(Bitmap.Config.ARGB_8888, true);
            }
            if (bitmap != null) {
                nd8.c(ShareNewQRCodeView.access$200(ShareNewQRCodeView.this)).a(1, ShareUtils.bmpToByteArray(bitmap, false), bitmap.getWidth(), bitmap.getHeight(), this.b, bitmap.getRowBytes(), 0, lr7.b(ShareNewQRCodeView.access$200(ShareNewQRCodeView.this), 180.0f), 'Q', 0, this.c, this.d);
            } else {
                md8.c(ShareNewQRCodeView.access$200(ShareNewQRCodeView.this)).a(blo.g(true), this.b, 0, new MaSizeType(0, 0, lr7.b(ShareNewQRCodeView.access$200(ShareNewQRCodeView.this), 180.0f)), false, this.c);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class f implements SnapshotTargetView.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public f() {
        }

        @Override // com.taobao.tao.longpic.SnapshotTargetView.b
        public void a(String str, ShareData shareData) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("98675c59", new Object[]{this, str, shareData});
                return;
            }
            View findViewById = ShareNewQRCodeView.access$1400(ShareNewQRCodeView.this).findViewById(R.id.snapshot_main_layout);
            if (a0m.c()) {
                ShareNewQRCodeView.access$1500(ShareNewQRCodeView.this, findViewById, str, shareData);
            } else {
                ShareNewQRCodeView.access$1600(ShareNewQRCodeView.this, findViewById, str, shareData);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class h implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public h() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            Properties properties = new Properties();
            properties.put("Reason", "noAuthorization");
            TBS.Ext.commitEvent("Page_QRCode_SaveFail", properties);
            Toast makeText = Toast.makeText(ShareNewQRCodeView.access$200(ShareNewQRCodeView.this), Localization.q(R.string.taobao_app_1010_1_17836), 1);
            makeText.setGravity(17, 0, 0);
            makeText.show();
            ShareNewQRCodeView.access$000(ShareNewQRCodeView.this).dismiss();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class i implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Bitmap f12511a;
        public final /* synthetic */ String b;
        public final /* synthetic */ ShareData c;

        public i(Bitmap bitmap, String str, ShareData shareData) {
            this.f12511a = bitmap;
            this.b = str;
            this.c = shareData;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                new a().execute(new Void[0]);
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public class a extends AsyncTask<Void, Void, Boolean> {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/longpic/ShareNewQRCodeView$18$1");
            }

            /* renamed from: a */
            public Boolean doInBackground(Void... voidArr) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (Boolean) ipChange.ipc$dispatch("9ea9e934", new Object[]{this, voidArr});
                }
                File externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM);
                i iVar = i.this;
                String b = hhi.b(true, iVar.f12511a, externalStoragePublicDirectory, ShareNewQRCodeView.access$200(ShareNewQRCodeView.this));
                Bitmap bitmap = i.this.f12511a;
                if (bitmap != null && !bitmap.isRecycled()) {
                    i.this.f12511a.recycle();
                }
                return Boolean.valueOf(!TextUtils.isEmpty(b));
            }

            /* renamed from: b */
            public void onPostExecute(Boolean bool) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("b98eb50", new Object[]{this, bool});
                    return;
                }
                ShareNewQRCodeView.access$300(ShareNewQRCodeView.this);
                if (!bool.booleanValue()) {
                    Properties properties = new Properties();
                    properties.put("Reason", "others");
                    TBS.Ext.commitEvent("Page_QRCode_SaveFail", properties);
                    Toast makeText = Toast.makeText(ShareNewQRCodeView.access$200(ShareNewQRCodeView.this), Localization.q(R.string.taobao_app_1010_1_17858), 1);
                    makeText.setGravity(17, 0, 0);
                    makeText.show();
                } else if (!ShareNewQRCodeView.access$1700(ShareNewQRCodeView.this)) {
                    ShareNewQRCodeView.access$1702(ShareNewQRCodeView.this, true);
                    i iVar = i.this;
                    ShareNewQRCodeView.access$1800(ShareNewQRCodeView.this, iVar.b, iVar.c);
                    if (!TextUtils.isEmpty(ShareNewQRCodeView.access$1900(ShareNewQRCodeView.this))) {
                        kwr.g(ShareNewQRCodeView.access$200(ShareNewQRCodeView.this), kwr.TAO_PASSWORD_FROM_PIC_SAVE_KEY, ShareNewQRCodeView.access$1900(ShareNewQRCodeView.this));
                    }
                    TBS.Ext.commitEvent("Page_QRCode_SaveSuccess", (Properties) null);
                }
                ShareNewQRCodeView.access$000(ShareNewQRCodeView.this).dismiss();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class j implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ TPTargetType f12513a;
        public final /* synthetic */ ShareData b;
        public final /* synthetic */ PopupWindow c;

        public j(TPTargetType tPTargetType, ShareData shareData, PopupWindow popupWindow) {
            this.f12513a = tPTargetType;
            this.b = shareData;
            this.c = popupWindow;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            String str;
            String str2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            if (tn1.KEY_SHARE_CONFIG_SINAWEIBO.equals(this.f12513a.getInfo())) {
                new hwr().a(ShareTargetType.Share2SinaWeibo.getValue(), null);
                str = "weibo";
            } else {
                String c = kwr.c(this.f12513a);
                if (!TextUtils.isEmpty(c)) {
                    kwr.e(ShareNewQRCodeView.access$200(ShareNewQRCodeView.this), c);
                }
                if (tn1.KEY_SHARE_CONFIG_WEIXIN.equals(this.f12513a.getInfo())) {
                    str = tn1.KEY_SHARE_CONFIG_WEIXIN;
                } else {
                    str = "qq";
                }
            }
            TBShareContent e = bwr.h().e();
            StringBuilder sb = new StringBuilder("app=");
            sb.append(str);
            sb.append("&");
            if (e == null) {
                str2 = "";
            } else {
                str2 = e.originUTArgs();
            }
            sb.append(str2);
            String sb2 = sb.toString();
            TBS.Ext.commitEvent("Page_QRCode", 19999, "QRCodeOpenApp", null, null, "bizID=" + this.b.getBusinessId(), sb2);
            if ("qrcode".equals(ShareNewQRCodeView.access$900(ShareNewQRCodeView.this))) {
                TBS.Ext.commitEvent("Page_QRCode_Anti", 5002, this.b.getBusinessId(), "QRCode", null, sb2);
            } else {
                TBS.Ext.commitEvent("Page_QRCode", 5002, this.b.getBusinessId(), "QRCode", null, sb2);
            }
            this.c.dismiss();
            HashMap hashMap = new HashMap();
            hashMap.put("result", "success");
            ShareBusiness.getInstance().onShareFinished(hashMap);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class k implements View.OnTouchListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public k(ShareNewQRCodeView shareNewQRCodeView) {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("d4aa3aa4", new Object[]{this, view, motionEvent})).booleanValue();
            }
            return true;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class l implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ PopupWindow f12514a;
        public final /* synthetic */ TPTargetType b;
        public final /* synthetic */ ShareData c;

        public l(ShareNewQRCodeView shareNewQRCodeView, PopupWindow popupWindow, TPTargetType tPTargetType, ShareData shareData) {
            this.f12514a = popupWindow;
            this.b = tPTargetType;
            this.c = shareData;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            this.f12514a.dismiss();
            if (this.b.getInfo().equals(tn1.KEY_SHARE_CONFIG_SINAWEIBO)) {
                str = "weibo";
            } else if (this.b.getInfo().equals("qqfriend")) {
                str = "qq";
            } else {
                str = tn1.KEY_SHARE_CONFIG_WEIXIN;
            }
            TBS.Ext.commitEvent("Page_QRCode", 19999, "QRCodeCancelShare", null, null, "bizID=" + this.c.getBusinessId(), "app=".concat(str));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class m implements Animation.AnimationListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public m() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("724c33d", new Object[]{this, animation});
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8f2883e7", new Object[]{this, animation});
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f2d146c4", new Object[]{this, animation});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class n implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ShareData f12516a;

        public n(ShareData shareData) {
            this.f12516a = shareData;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            TBS.Ext.commitEvent("Page_QRCode", 19999, "QRCodeCancel", null, null, "bizID=" + this.f12516a.getBusinessId());
            ShareNewQRCodeView.access$000(ShareNewQRCodeView.this).dismiss();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class o implements s8d<FailPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public o(ShareNewQRCodeView shareNewQRCodeView) {
        }

        /* renamed from: a */
        public boolean onHappen(FailPhenixEvent failPhenixEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5fa0e8d0", new Object[]{this, failPhenixEvent})).booleanValue();
            }
            TLog.logi("ShareSnapshot", "get images from detail error" + failPhenixEvent.getResultCode());
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class p implements s8d<SuccPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ TUrlImageView f12517a;

        public p(TUrlImageView tUrlImageView) {
            this.f12517a = tUrlImageView;
        }

        /* renamed from: a */
        public boolean onHappen(SuccPhenixEvent succPhenixEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("362cccf4", new Object[]{this, succPhenixEvent})).booleanValue();
            }
            if (succPhenixEvent != null) {
                BitmapDrawable drawable = succPhenixEvent.getDrawable();
                int intrinsicWidth = drawable.getIntrinsicWidth();
                int intrinsicHeight = drawable.getIntrinsicHeight();
                float access$100 = ShareNewQRCodeView.access$100(ShareNewQRCodeView.this);
                this.f12517a.setLayoutParams(new LinearLayout.LayoutParams((int) access$100, (int) ((access$100 / intrinsicWidth) * intrinsicHeight)));
            }
            this.f12517a.setVisibility(0);
            return true;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class q implements s8d<FailPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public q(ShareNewQRCodeView shareNewQRCodeView) {
        }

        /* renamed from: a */
        public boolean onHappen(FailPhenixEvent failPhenixEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5fa0e8d0", new Object[]{this, failPhenixEvent})).booleanValue();
            }
            TLog.logi("ShareSnapshot", "get images from detail error" + failPhenixEvent.getResultCode());
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class r implements s8d<SuccPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ TUrlImageView f12518a;

        public r(TUrlImageView tUrlImageView) {
            this.f12518a = tUrlImageView;
        }

        /* renamed from: a */
        public boolean onHappen(SuccPhenixEvent succPhenixEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("362cccf4", new Object[]{this, succPhenixEvent})).booleanValue();
            }
            if (succPhenixEvent != null) {
                BitmapDrawable drawable = succPhenixEvent.getDrawable();
                int intrinsicWidth = drawable.getIntrinsicWidth();
                int intrinsicHeight = drawable.getIntrinsicHeight();
                float access$100 = ShareNewQRCodeView.access$100(ShareNewQRCodeView.this);
                this.f12518a.setLayoutParams(new LinearLayout.LayoutParams((int) access$100, (int) ((access$100 / intrinsicWidth) * intrinsicHeight)));
            }
            this.f12518a.setVisibility(0);
            return true;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class s implements s8d<SuccPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ v f12519a;
        public final /* synthetic */ float b;
        public final /* synthetic */ TUrlImageView c;

        public s(v vVar, float f, TUrlImageView tUrlImageView) {
            this.f12519a = vVar;
            this.b = f;
            this.c = tUrlImageView;
        }

        /* renamed from: a */
        public boolean onHappen(SuccPhenixEvent succPhenixEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("362cccf4", new Object[]{this, succPhenixEvent})).booleanValue();
            }
            if (succPhenixEvent != null) {
                BitmapDrawable drawable = succPhenixEvent.getDrawable();
                int intrinsicWidth = drawable.getIntrinsicWidth();
                int intrinsicHeight = drawable.getIntrinsicHeight();
                float access$100 = ShareNewQRCodeView.access$100(ShareNewQRCodeView.this);
                this.f12519a.a(this.b, ShareNewQRCodeView.access$100(ShareNewQRCodeView.this));
                v vVar = this.f12519a;
                int i = vVar.e;
                int i2 = vVar.f;
                int i3 = vVar.g;
                int i4 = vVar.h;
                if (i3 > access$100) {
                    i3 = (int) access$100;
                }
                if (i4 / access$100 > 4.0f) {
                    i4 = ((int) access$100) * 4;
                }
                if (i2 > access$100) {
                    i2 = 0;
                }
                if (i4 == 0 && i3 != 0) {
                    i4 = (int) ((intrinsicHeight / intrinsicWidth) * i3);
                } else if (i4 != 0 && i3 == 0) {
                    i3 = (int) access$100;
                }
                if (!(i4 == 0 && i3 == 0)) {
                    intrinsicHeight = i4;
                    intrinsicWidth = i3;
                }
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) access$100, intrinsicHeight);
                layoutParams.setMargins(i2, i, 0, 0);
                layoutParams.height = intrinsicHeight;
                layoutParams.width = intrinsicWidth;
                this.c.setLayoutParams(layoutParams);
            }
            this.c.setVisibility(0);
            return true;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class t implements s8d<FailPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f12520a;

        public t(int i) {
            this.f12520a = i;
        }

        /* renamed from: a */
        public boolean onHappen(FailPhenixEvent failPhenixEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5fa0e8d0", new Object[]{this, failPhenixEvent})).booleanValue();
            }
            ShareNewQRCodeView.access$800(ShareNewQRCodeView.this, this.f12520a, null);
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface u {
        void onSuccess();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class v {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public float f12521a;
        public float b;
        public float c;
        public float d;
        public int e;
        public int f;
        public int g;
        public int h;

        static {
            t2o.a(666894513);
        }

        public void a(float f, float f2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("721dc64f", new Object[]{this, new Float(f), new Float(f2)});
                return;
            }
            float f3 = f2 / f;
            this.e = (int) (this.f12521a * f3);
            this.f = (int) (this.b * f3);
            this.g = (int) (this.c * f3);
            this.h = (int) (f3 * this.d);
        }

        public void b(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("229e7e53", new Object[]{this, jSONObject});
                return;
            }
            HashMap hashMap = new HashMap();
            for (int i = 0; i < ShareNewQRCodeView.access$2200().length; i++) {
                String str = ShareNewQRCodeView.access$2200()[i];
                try {
                    hashMap.put(str, Float.valueOf(Float.parseFloat(String.valueOf(jSONObject.get(str)))));
                } catch (Exception e) {
                    e.printStackTrace();
                    hashMap.put(str, Float.valueOf(0.0f));
                }
            }
            this.f12521a = ((Float) hashMap.get(ShareNewQRCodeView.access$2300())).floatValue();
            this.b = ((Float) hashMap.get(ShareNewQRCodeView.access$2400())).floatValue();
            this.c = ((Float) hashMap.get(ShareNewQRCodeView.access$2500())).floatValue();
            this.d = ((Float) hashMap.get(ShareNewQRCodeView.access$2600())).floatValue();
        }

        public boolean c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("42eba9fc", new Object[]{this})).booleanValue();
            }
            if (this.f12521a == 0.0f && this.b == 0.0f && this.c == 0.0f && this.d == 0.0f) {
                return true;
            }
            return false;
        }
    }

    public ShareNewQRCodeView(Context context) {
        this.mContext = context;
    }

    public static /* synthetic */ PopupWindow access$000(ShareNewQRCodeView shareNewQRCodeView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PopupWindow) ipChange.ipc$dispatch("a26cba3f", new Object[]{shareNewQRCodeView});
        }
        return shareNewQRCodeView.mPopupWindow;
    }

    public static /* synthetic */ int access$100(ShareNewQRCodeView shareNewQRCodeView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f929e367", new Object[]{shareNewQRCodeView})).intValue();
        }
        return shareNewQRCodeView.getWindowWidth();
    }

    public static /* synthetic */ void access$1000(ShareNewQRCodeView shareNewQRCodeView, Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6eb0dc28", new Object[]{shareNewQRCodeView, bitmap});
        } else {
            shareNewQRCodeView.dealQRImages(bitmap);
        }
    }

    public static /* synthetic */ View access$1100(ShareNewQRCodeView shareNewQRCodeView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("2382b7e7", new Object[]{shareNewQRCodeView});
        }
        return shareNewQRCodeView.mQRCodeView;
    }

    public static /* synthetic */ u access$1200(ShareNewQRCodeView shareNewQRCodeView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (u) ipChange.ipc$dispatch("3552f1ed", new Object[]{shareNewQRCodeView});
        }
        return shareNewQRCodeView.listener;
    }

    public static /* synthetic */ void access$1300(ShareNewQRCodeView shareNewQRCodeView, String str, int i2, EncodeCallback encodeCallback, Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d70b130", new Object[]{shareNewQRCodeView, str, new Integer(i2), encodeCallback, bitmap});
        } else {
            shareNewQRCodeView.encodeQrcode(str, i2, encodeCallback, bitmap);
        }
    }

    public static /* synthetic */ View access$1400(ShareNewQRCodeView shareNewQRCodeView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("f8ccad04", new Object[]{shareNewQRCodeView});
        }
        return shareNewQRCodeView.mView;
    }

    public static /* synthetic */ void access$1500(ShareNewQRCodeView shareNewQRCodeView, View view, String str, ShareData shareData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9823cc10", new Object[]{shareNewQRCodeView, view, str, shareData});
        } else {
            shareNewQRCodeView.saveToDCIMAndroid10(view, str, shareData);
        }
    }

    public static /* synthetic */ void access$1600(ShareNewQRCodeView shareNewQRCodeView, View view, String str, ShareData shareData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e39ee6f", new Object[]{shareNewQRCodeView, view, str, shareData});
        } else {
            shareNewQRCodeView.saveToDCIM(view, str, shareData);
        }
    }

    public static /* synthetic */ boolean access$1700(ShareNewQRCodeView shareNewQRCodeView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c8413a3", new Object[]{shareNewQRCodeView})).booleanValue();
        }
        return shareNewQRCodeView.isShowShareDialog;
    }

    public static /* synthetic */ boolean access$1702(ShareNewQRCodeView shareNewQRCodeView, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3312471b", new Object[]{shareNewQRCodeView, new Boolean(z)})).booleanValue();
        }
        shareNewQRCodeView.isShowShareDialog = z;
        return z;
    }

    public static /* synthetic */ void access$1800(ShareNewQRCodeView shareNewQRCodeView, String str, ShareData shareData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11ef1a83", new Object[]{shareNewQRCodeView, str, shareData});
        } else {
            shareNewQRCodeView.doShare(str, shareData);
        }
    }

    public static /* synthetic */ String access$1900(ShareNewQRCodeView shareNewQRCodeView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a71caa63", new Object[]{shareNewQRCodeView});
        }
        return shareNewQRCodeView.mShareUrl;
    }

    public static /* synthetic */ Context access$200(ShareNewQRCodeView shareNewQRCodeView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("2d11f8b", new Object[]{shareNewQRCodeView});
        }
        return shareNewQRCodeView.mContext;
    }

    public static /* synthetic */ boolean access$2002(ShareNewQRCodeView shareNewQRCodeView, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("881d1133", new Object[]{shareNewQRCodeView, new Boolean(z)})).booleanValue();
        }
        shareNewQRCodeView.isDoShareProgress = z;
        return z;
    }

    public static /* synthetic */ void access$2100(ShareNewQRCodeView shareNewQRCodeView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6154ca6", new Object[]{shareNewQRCodeView});
        } else {
            shareNewQRCodeView.sendBroadCast4Tmall();
        }
    }

    public static /* synthetic */ String[] access$2200() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("81db1816", new Object[0]);
        }
        return QR_PARAMS;
    }

    public static /* synthetic */ String access$2300() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4ee31a58", new Object[0]);
        }
        return QR_TOP;
    }

    public static /* synthetic */ String access$2400() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4ae4a937", new Object[0]);
        }
        return QR_LEFT;
    }

    public static /* synthetic */ String access$2500() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("46e63816", new Object[0]);
        }
        return QR_WIDTH;
    }

    public static /* synthetic */ String access$2600() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("42e7c6f5", new Object[0]);
        }
        return QR_HEIGHT;
    }

    public static /* synthetic */ void access$300(ShareNewQRCodeView shareNewQRCodeView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc7d2fb2", new Object[]{shareNewQRCodeView});
        } else {
            shareNewQRCodeView.onLoadingFinish();
        }
    }

    public static /* synthetic */ boolean access$402(ShareNewQRCodeView shareNewQRCodeView, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f5c7cb29", new Object[]{shareNewQRCodeView, new Boolean(z)})).booleanValue();
        }
        shareNewQRCodeView.mGetBitmapFinish = z;
        return z;
    }

    public static /* synthetic */ Handler access$500(ShareNewQRCodeView shareNewQRCodeView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("fcbc4cd6", new Object[]{shareNewQRCodeView});
        }
        return shareNewQRCodeView.mHandler;
    }

    public static /* synthetic */ Bitmap access$600(ShareNewQRCodeView shareNewQRCodeView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("b374f3ed", new Object[]{shareNewQRCodeView});
        }
        return shareNewQRCodeView.mQRBitmap;
    }

    public static /* synthetic */ Bitmap access$602(ShareNewQRCodeView shareNewQRCodeView, Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("b4f380df", new Object[]{shareNewQRCodeView, bitmap});
        }
        shareNewQRCodeView.mQRBitmap = bitmap;
        return bitmap;
    }

    public static /* synthetic */ void access$700(ShareNewQRCodeView shareNewQRCodeView, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c155b095", new Object[]{shareNewQRCodeView, new Integer(i2)});
        } else {
            shareNewQRCodeView.mergerQrcodeBitmap(i2);
        }
    }

    public static /* synthetic */ void access$800(ShareNewQRCodeView shareNewQRCodeView, int i2, Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4856f898", new Object[]{shareNewQRCodeView, new Integer(i2), bitmap});
        } else {
            shareNewQRCodeView.doMergerBitmap(i2, bitmap);
        }
    }

    public static /* synthetic */ String access$900(ShareNewQRCodeView shareNewQRCodeView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f2d8c5b4", new Object[]{shareNewQRCodeView});
        }
        return shareNewQRCodeView.taoLongPicCode;
    }

    private void buildShareTargets(ShareData shareData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5307ed3", new Object[]{this, shareData});
            return;
        }
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add(ShareTargetType.Share2Weixin.getValue());
        arrayList.add(ShareTargetType.Share2QQ.getValue());
        arrayList.add(ShareTargetType.Share2SinaWeibo.getValue());
        if (ShareBizAdapter.getInstance().getShareEngine() != null) {
            ArrayList<vi3> a2 = ShareBizAdapter.getInstance().getShareEngine().getChanelEngine().a(arrayList, null);
            SnapshotTargetView snapshotTargetView = (SnapshotTargetView) this.mView.findViewById(R.id.snapshot_share_targets);
            if (a2 == null) {
                a2 = new ArrayList<>();
            }
            snapshotTargetView.setVisibility(0);
            snapshotTargetView.setData(this.shareListener, a2, shareData);
        }
    }

    private void dealImageType(JSONObject jSONObject, float f2, FrameLayout frameLayout, LinearLayout linearLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b2c4d44", new Object[]{this, jSONObject, new Float(f2), frameLayout, linearLayout});
        } else if (jSONObject != null && jSONObject.getString(QR_URL) != null) {
            String string = jSONObject.getString(QR_URL);
            if (!TextUtils.isEmpty(string)) {
                TUrlImageView tUrlImageView = new TUrlImageView(this.mContext);
                v vVar = new v();
                vVar.b(jSONObject);
                tUrlImageView.setVisibility(0);
                tUrlImageView.setImageUrl(string);
                tUrlImageView.setStrategyConfig(zoe.f32908a);
                tUrlImageView.setScaleType(ImageView.ScaleType.FIT_XY);
                tUrlImageView.failListener(new q(this));
                if (vVar.c()) {
                    tUrlImageView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                    linearLayout.addView(tUrlImageView);
                    tUrlImageView.succListener(new r(tUrlImageView));
                    return;
                }
                tUrlImageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
                frameLayout.addView(tUrlImageView);
                tUrlImageView.succListener(new s(vVar, f2, tUrlImageView));
            }
        }
    }

    private void dealQRImages(Bitmap bitmap) {
        v vVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c72bb542", new Object[]{this, bitmap});
            return;
        }
        ArrayList<ImageView> arrayList = this.qrImageViews;
        if (arrayList != null && arrayList.size() != 0 && bitmap != null) {
            Iterator<ImageView> it = this.qrImageViews.iterator();
            while (it.hasNext()) {
                ImageView next = it.next();
                if (next.getTag() != null) {
                    try {
                        vVar = (v) next.getTag();
                    } catch (Throwable unused) {
                        vVar = null;
                    }
                    if (vVar != null) {
                        next.setBackground(new BitmapDrawable(this.mContext.getResources(), bitmap));
                        if (vVar.c()) {
                            int width = bitmap.getWidth();
                            int height = bitmap.getHeight();
                            float windowWidth = getWindowWidth();
                            next.setLayoutParams(new LinearLayout.LayoutParams((int) windowWidth, (int) ((windowWidth / width) * height)));
                            next.setVisibility(0);
                        } else {
                            int width2 = bitmap.getWidth();
                            int height2 = bitmap.getHeight();
                            float windowWidth2 = getWindowWidth();
                            int i2 = vVar.e;
                            int i3 = vVar.f;
                            int i4 = vVar.g;
                            int i5 = vVar.h;
                            if (i4 > windowWidth2) {
                                i4 = (int) windowWidth2;
                            }
                            if (i5 / windowWidth2 > 4.0f) {
                                i5 = ((int) windowWidth2) * 4;
                            }
                            if (i3 > windowWidth2) {
                                i3 = 0;
                            }
                            if (i5 == 0 && i4 != 0) {
                                i5 = (int) ((height2 / width2) * i4);
                            } else if (i5 != 0 && i4 == 0) {
                                i4 = (int) ((width2 / height2) * i5);
                            }
                            if (i5 == 0 && i4 == 0) {
                                i4 = width2;
                                i5 = height2;
                            }
                            if (i5 > 0 && i4 > 0) {
                                i5 = (int) ((height2 / width2) * i4);
                            }
                            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) windowWidth2, i5);
                            layoutParams.setMargins(i3, i2, 0, 0);
                            layoutParams.height = i5;
                            layoutParams.width = i4;
                            next.setLayoutParams(layoutParams);
                        }
                    }
                }
            }
        }
    }

    private void doMergerBitmap(int i2, Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd671c86", new Object[]{this, new Integer(i2), bitmap});
        } else {
            new b(i2, bitmap).execute(new Void[0]);
        }
    }

    private void encodeQrcode(String str, String str2, int i2, EncodeCallback encodeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1d40b4c", new Object[]{this, str, str2, new Integer(i2), encodeCallback});
        } else if (hjp.TYPE_GEN3_CODE.equals(str2)) {
            View view = this.mQRCodeView;
            if (view != null) {
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                layoutParams.height = lr7.b(this.mContext, 130.0f);
                this.mQRCodeView.setLayoutParams(layoutParams);
                TUrlImageView tUrlImageView = this.mQRCodeLogoView;
                if (tUrlImageView != null) {
                    tUrlImageView.setVisibility(0);
                }
                md8.c(this.mContext).a(GEN3_CODE_WHITE_BG_URL, str, 3, new MaSizeType(0, 0, lr7.b(this.mContext, 130.0f)), true, encodeCallback);
            }
        } else {
            TUrlImageView tUrlImageView2 = this.mQRCodeLogoView;
            if (tUrlImageView2 != null) {
                tUrlImageView2.setVisibility(8);
            }
            String g2 = lkp.b.g();
            if (!TextUtils.isEmpty(g2)) {
                s0m.B().T(g2).succListener(new d(str, i2, encodeCallback)).failListener(new c(str, i2, encodeCallback)).fetch();
            } else {
                encodeQrcode(str, i2, encodeCallback, (Bitmap) null);
            }
        }
    }

    private int getWindowWidth() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5ca3e2fa", new Object[]{this})).intValue();
        }
        return ((WindowManager) this.mContext.getSystemService(pg1.ATOM_EXT_window)).getDefaultDisplay().getWidth();
    }

    private void initAnimation() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de75c2db", new Object[]{this});
            return;
        }
        Animation loadAnimation = AnimationUtils.loadAnimation(this.mContext.getApplicationContext(), R.anim.share_push_from_down);
        this.showAnimation = loadAnimation;
        loadAnimation.setDuration(500L);
        this.showAnimation.setAnimationListener(new m());
    }

    private void initTopAndBottomViewByConfig(String str, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1714aeec", new Object[]{this, str, new Boolean(z), new Boolean(z2)});
            return;
        }
        this.mQRCodeView = this.mView.findViewById(R.id.snapshot_qrcode);
        TUrlImageView tUrlImageView = (TUrlImageView) this.mView.findViewById(R.id.head_image);
        tUrlImageView.setStrategyConfig(zoe.f32908a);
        if (z2) {
            tUrlImageView.setVisibility(8);
        } else if (TextUtils.isEmpty(str)) {
            String f2 = lkp.b.f();
            if (!TextUtils.isEmpty(f2)) {
                tUrlImageView.setImageUrl(f2);
            } else {
                tUrlImageView.setVisibility(8);
            }
        } else if ("false".equals(str)) {
            tUrlImageView.setVisibility(8);
        } else {
            tUrlImageView.setImageUrl(str);
        }
        LinearLayout linearLayout = (LinearLayout) this.mView.findViewById(R.id.snapshot_bottom);
        this.bottomViews = linearLayout;
        if (z) {
            linearLayout.setVisibility(8);
        }
    }

    private void loadImage(Context context, String str, Boolean bool, ImageView imageView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90540891", new Object[]{this, context, str, bool, imageView});
        } else if (context != null && !TextUtils.isEmpty(str) && imageView != null) {
            if (bool.booleanValue()) {
                s0m.B().N0(context).T(str).bitmapProcessors(new iy4()).into(imageView);
            } else {
                s0m.B().N0(context).T(str).into(imageView);
            }
        }
    }

    private void mergerQrcodeBitmap(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd36ab05", new Object[]{this, new Integer(i2)});
            return;
        }
        String d2 = lkp.d(lkp.b.PIIIC_QRCODE_URL, "");
        if (TextUtils.isEmpty(d2)) {
            doMergerBitmap(i2, null);
        } else {
            s0m.B().T(d2).succListener(new a(i2)).failListener(new t(i2)).fetch();
        }
    }

    private void onLoadingFinish() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("707bbdd7", new Object[]{this});
            return;
        }
        View view = this.mView;
        if (view != null) {
            if (this.progressLayout == null) {
                this.progressLayout = view.findViewById(R.id.progressLayout);
            }
            View view2 = this.progressLayout;
            if (view2 != null) {
                view2.setVisibility(8);
            }
        }
    }

    private void onLoadingStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f60ade0c", new Object[]{this});
            return;
        }
        View view = this.mView;
        if (view != null) {
            if (this.progressLayout == null) {
                this.progressLayout = view.findViewById(R.id.progressLayout);
            }
            View view2 = this.progressLayout;
            if (view2 != null) {
                view2.setVisibility(0);
            }
        }
    }

    private void saveQRType(JSONObject jSONObject, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8419e84f", new Object[]{this, jSONObject, new Float(f2)});
        } else if (jSONObject != null) {
            v vVar = new v();
            vVar.b(jSONObject);
            vVar.a(f2, getWindowWidth());
            ImageView imageView = new ImageView(this.mContext);
            imageView.setTag(vVar);
            if (vVar.c()) {
                imageView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                this.linearLayout.addView(imageView);
            } else {
                imageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
                this.frameLayout.addView(imageView);
            }
            this.qrImageViews.add(imageView);
        }
    }

    private void saveToDCIMAndroid10(View view, String str, ShareData shareData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f5f01c9", new Object[]{this, view, str, shareData});
            return;
        }
        Bitmap createViewBitmap = BitmapUtil.createViewBitmap(view);
        if (createViewBitmap != null && !this.isDoShareProgress) {
            this.isDoShareProgress = true;
            new g(createViewBitmap, str, shareData).execute(new Void[0]);
        }
    }

    private void sendBroadCast4Tmall() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("196fba34", new Object[]{this});
        } else if (!this.isShowShareDialog) {
            LocalBroadcastManager.getInstance(hjp.a().getApplicationContext()).sendBroadcast(new Intent("action.share_dialog_close"));
        }
    }

    private void showShareDialog(TPTargetType tPTargetType, String str, ColorStateList colorStateList, ShareData shareData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c751aef", new Object[]{this, tPTargetType, str, colorStateList, shareData});
            return;
        }
        PopupWindow popupWindow = new PopupWindow(this.mContext);
        View inflate = this.inflater.inflate(R.layout.share_snapshot_dialog, (ViewGroup) null);
        TextView textView = (TextView) inflate.findViewById(R.id.snapshot_dialog_text);
        textView.setText(str);
        textView.setTextColor(colorStateList);
        textView.setOnClickListener(new j(tPTargetType, shareData, popupWindow));
        ((TIconFontTextView) inflate.findViewById(R.id.snapshot_close)).setOnClickListener(new l(this, popupWindow, tPTargetType, shareData));
        popupWindow.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: com.taobao.tao.longpic.ShareNewQRCodeView.21
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.widget.PopupWindow.OnDismissListener
            public void onDismiss() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("cab76ab2", new Object[]{this});
                    return;
                }
                ShareNewQRCodeView.access$2002(ShareNewQRCodeView.this, false);
                ShareNewQRCodeView.access$1702(ShareNewQRCodeView.this, false);
                ShareNewQRCodeView.access$2100(ShareNewQRCodeView.this);
            }
        });
        popupWindow.setContentView(inflate);
        View k2 = bwr.h().k();
        if (k2 != null) {
            popupWindow.setWidth(-1);
            popupWindow.setHeight(-1);
            popupWindow.setFocusable(true);
            popupWindow.setBackgroundDrawable(new ColorDrawable(this.mContext.getResources().getColor(R.color.half_transparent)));
            try {
                popupWindow.showAtLocation(k2, 48, 0, 0);
            } catch (WindowManager.BadTokenException e2) {
                e2.printStackTrace();
            }
        }
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cab76ab2", new Object[]{this});
        } else {
            sendBroadCast4Tmall();
        }
    }

    public void showSnapshotDialog(List<String> list, ShareData shareData, String str, JSONObject jSONObject, String str2, boolean z, boolean z2, TBShareContent tBShareContent, boolean z3, u uVar) {
        boolean z4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9986064c", new Object[]{this, list, shareData, str, jSONObject, str2, new Boolean(z), new Boolean(z2), tBShareContent, new Boolean(z3), uVar});
            return;
        }
        this.listener = uVar;
        if (this.mPopupWindow == null) {
            TBS.Ext.commitEvent("Page_QRCode", 19999, "ShowPicView", null, null, "bizID=" + shareData.getBusinessId());
            View k2 = bwr.h().k();
            if (k2 != null) {
                initAnimation();
                LayoutInflater from = LayoutInflater.from(hjp.a().getApplicationContext());
                this.inflater = from;
                this.mView = from.inflate(R.layout.share_longpic_qrcode_view, (ViewGroup) null);
                initTopAndBottomViewByConfig(str2, z, tBShareContent != null ? tBShareContent.disableHeadUrl : false);
                this.mQrTipsTextView = (TextView) this.mView.findViewById(R.id.qr_tips_text);
                if (tBShareContent != null && !TextUtils.isEmpty(tBShareContent.qrTipsTxt)) {
                    this.mQrTipsTextView.setText(tBShareContent.qrTipsTxt);
                }
                View findViewById = this.mView.findViewById(R.id.super_user_container);
                if (z3) {
                    findViewById.setVisibility(0);
                } else {
                    findViewById.setVisibility(8);
                }
                this.frameLayout = (FrameLayout) this.mView.findViewById(R.id.snapshot_defined_layout);
                this.linearLayout = (LinearLayout) this.mView.findViewById(R.id.snapshot_image_layout);
                String sourceType = shareData.getSourceType();
                String text = shareData.getText();
                if (!TextUtils.isEmpty(text) && !z2) {
                    if ("shop".equals(sourceType)) {
                        TextView textView = (TextView) this.mView.findViewById(R.id.snapshot_title_shop);
                        textView.setText(text);
                        textView.setVisibility(0);
                    } else {
                        TextView textView2 = (TextView) this.mView.findViewById(R.id.snapshot_desp);
                        textView2.setText(text);
                        textView2.setVisibility(0);
                    }
                }
                if (!TextUtils.isEmpty(str)) {
                    TextView textView3 = (TextView) this.mView.findViewById(R.id.snapshot_price);
                    SpannableStringBuilder buildPrice = buildPrice(str);
                    if (!TextUtils.isEmpty(buildPrice)) {
                        textView3.setText(buildPrice);
                        textView3.setVisibility(0);
                    }
                } else {
                    this.mView.findViewById(R.id.snapshot_desp_container).setVisibility(8);
                }
                TUrlImageView tUrlImageView = (TUrlImageView) this.mView.findViewById(R.id.snapshot_qrcode_logo);
                this.mQRCodeLogoView = tUrlImageView;
                tUrlImageView.setVisibility(4);
                String g2 = lkp.b.g();
                if (TextUtils.isEmpty(g2)) {
                    g2 = TAO_LOGO_URL;
                }
                if (!ShareBizAdapter.getInstance().getLogin().checkSessionValid() || !TextUtils.equals(lkp.d(lkp.b.KEY_NEED_SHOW_AVATAR, "false"), "true")) {
                    z4 = false;
                } else {
                    g2 = ShareBizAdapter.getInstance().getLogin().getHeadPicLink();
                    z4 = true;
                }
                loadImage(this.mContext, g2, Boolean.valueOf(z4), this.mQRCodeLogoView);
                if (jSONObject == null) {
                    generateImagesView(list, sourceType);
                } else {
                    generateImageViewWithTemplate(jSONObject);
                }
                String[] split = lkp.d(lkp.b.KEY_TAO_LONG_COPY, "").split(SymbolExpUtil.SYMBOL_VERTICALBAR);
                if (split.length >= 3) {
                    this.mQrCodeDesp1View = (TextView) this.mView.findViewById(R.id.snapshot_qrcode_desp1);
                    this.mQrCodeDesp2View = (TextView) this.mView.findViewById(R.id.snapshot_qrcode_desp2);
                    this.mCopyRightView = (TextView) this.mView.findViewById(R.id.copyright_announcement);
                    this.mQrCodeDesp1View.setText(split[0]);
                    this.mQrCodeDesp2View.setText(split[1]);
                    this.mCopyRightView.setText(split[2]);
                }
                View findViewById2 = this.mView.findViewById(R.id.snapshot_bar_layout);
                ViewProxy.setOnTouchListener(findViewById2, new k(this));
                findViewById2.startAnimation(this.showAnimation);
                buildShareTargets(shareData);
                this.mPopupWindow = new PopupWindow(this.mContext);
                ((TIconFontTextView) this.mView.findViewById(R.id.snapshot_cancel)).setOnClickListener(new n(shareData));
                this.mPopupWindow.setContentView(this.mView);
                this.mPopupWindow.setWidth(-1);
                this.mPopupWindow.setHeight(-1);
                this.mPopupWindow.setFocusable(true);
                this.mPopupWindow.setBackgroundDrawable(new ColorDrawable(this.mContext.getResources().getColor(R.color.half_transparent)));
                try {
                    this.mPopupWindow.showAtLocation(k2, 81, 0, 0);
                } catch (WindowManager.BadTokenException unused) {
                }
                this.mPopupWindow.setOnDismissListener(this);
                onLoadingStart();
                initAnimation();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class TargetItemAdapter extends RecyclerView.Adapter<ViewHolder> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final LayoutInflater f12499a;
        public final List<vi3> b;
        public final Context c;
        public c d;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public static class ViewHolder extends RecyclerView.ViewHolder {

            /* renamed from: a  reason: collision with root package name */
            public TIconFontTextView f12500a;
            public ImageView b;
            public TextView c;
            public ImageView d;
            public TextView e;

            static {
                t2o.a(666894512);
            }

            public ViewHolder(View view) {
                super(view);
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public class a implements View.OnClickListener {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ vi3 f12501a;

            public a(vi3 vi3Var) {
                this.f12501a = vi3Var;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else {
                    TargetItemAdapter.M(TargetItemAdapter.this).a(this.f12501a);
                }
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public class b extends AsyncTask<Void, Void, Void> {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ SharedPreferences f12502a;
            public final /* synthetic */ int b;

            public b(TargetItemAdapter targetItemAdapter, SharedPreferences sharedPreferences, int i) {
                this.f12502a = sharedPreferences;
                this.b = i;
            }

            public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/longpic/ShareNewQRCodeView$TargetItemAdapter$2");
            }

            /* renamed from: a */
            public Void doInBackground(Void... voidArr) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (Void) ipChange.ipc$dispatch("6194eca6", new Object[]{this, voidArr});
                }
                SharedPreferences.Editor edit = this.f12502a.edit();
                edit.putInt("show_share_qrcode_mask_count", this.b + 1);
                edit.apply();
                return null;
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public interface c {
            void a(vi3 vi3Var);
        }

        static {
            t2o.a(666894508);
        }

        public TargetItemAdapter(Context context, List<vi3> list) {
            Context applicationContext = context.getApplicationContext();
            this.c = applicationContext;
            this.f12499a = LayoutInflater.from(applicationContext);
            this.b = list;
        }

        public static /* synthetic */ c M(TargetItemAdapter targetItemAdapter) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (c) ipChange.ipc$dispatch("5ebafe08", new Object[]{targetItemAdapter});
            }
            return targetItemAdapter.d;
        }

        public static /* synthetic */ Object ipc$super(TargetItemAdapter targetItemAdapter, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/longpic/ShareNewQRCodeView$TargetItemAdapter");
        }

        /* renamed from: N */
        public void onBindViewHolder(ViewHolder viewHolder, int i) {
            int i2;
            int i3 = 2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("87507079", new Object[]{this, viewHolder, new Integer(i)});
                return;
            }
            vi3 vi3Var = this.b.get(i);
            try {
                RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) viewHolder.itemView.getLayoutParams();
                if (layoutParams != null) {
                    if (i == 0) {
                        i2 = lr7.b(this.c, 5.0f);
                    } else {
                        i2 = 0;
                    }
                    layoutParams.setMarginStart(i2);
                }
                viewHolder.itemView.setLayoutParams(layoutParams);
            } catch (Throwable unused) {
            }
            viewHolder.c.setText(vi3Var.g());
            if (vi3Var.c() == -1 && vi3Var.d() > 0) {
                viewHolder.b.setVisibility(0);
                viewHolder.f12500a.setVisibility(8);
                viewHolder.b.setImageResource(vi3Var.d());
            } else if (vi3Var.c() > 0 && vi3Var.d() == -1) {
                viewHolder.b.setVisibility(8);
                viewHolder.f12500a.setVisibility(0);
                viewHolder.f12500a.setText(this.c.getResources().getString(vi3Var.c()));
            }
            if (Q(vi3Var.k())) {
                viewHolder.d.setVisibility(0);
            } else {
                viewHolder.d.setVisibility(8);
            }
            if (TextUtils.isEmpty(vi3Var.f())) {
                viewHolder.e.setVisibility(8);
            } else {
                viewHolder.e.setVisibility(0);
                String f = vi3Var.f();
                if (f.length() <= 2) {
                    i3 = f.length();
                }
                viewHolder.e.setText(f.substring(0, i3));
            }
            if (this.d != null) {
                ViewProxy.setOnClickListener(viewHolder.itemView, new a(vi3Var));
            }
        }

        /* renamed from: O */
        public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ViewHolder) ipChange.ipc$dispatch("259d98fb", new Object[]{this, viewGroup, new Integer(i)});
            }
            View inflate = this.f12499a.inflate(R.layout.share_item, viewGroup, false);
            ViewHolder viewHolder = new ViewHolder(inflate);
            viewHolder.c = (TextView) inflate.findViewById(R.id.target_item_title);
            viewHolder.b = (ImageView) inflate.findViewById(R.id.target_item_image);
            viewHolder.f12500a = (TIconFontTextView) inflate.findViewById(R.id.target_item_iconfont);
            viewHolder.d = (ImageView) inflate.findViewById(R.id.target_item_mask);
            viewHolder.e = (TextView) inflate.findViewById(R.id.target_item_mark_tv);
            return viewHolder;
        }

        public void P(c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2541abf0", new Object[]{this, cVar});
            } else {
                this.d = cVar;
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("970ddc80", new Object[]{this})).intValue();
            }
            List<vi3> list = this.b;
            if (list != null) {
                return list.size();
            }
            return 0;
        }

        public final boolean Q(String str) {
            SharedPreferences defaultSharedPreferences;
            int i;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("d84b8d5e", new Object[]{this, str})).booleanValue();
            }
            if (!ShareTargetType.Share2QRCode.getValue().equals(str) || (i = (defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this.c)).getInt("show_share_qrcode_mask_count", 0)) >= 3) {
                return false;
            }
            new b(this, defaultSharedPreferences, i).execute(new Void[0]);
            return true;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b extends AsyncTask<Void, Bitmap, Bitmap> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f12504a;
        public final /* synthetic */ Bitmap b;

        public b(int i, Bitmap bitmap) {
            this.f12504a = i;
            this.b = bitmap;
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode == -1325021319) {
                super.onPostExecute(objArr[0]);
                return null;
            } else if (hashCode == 1050423957) {
                super.onProgressUpdate((Object[]) objArr[0]);
                return null;
            } else {
                int hashCode2 = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/tao/longpic/ShareNewQRCodeView$11");
            }
        }

        /* renamed from: b */
        public void onPostExecute(Bitmap bitmap) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c38e7f1", new Object[]{this, bitmap});
                return;
            }
            super.onPostExecute(bitmap);
            if (ShareNewQRCodeView.access$1100(ShareNewQRCodeView.this) != null && ShareNewQRCodeView.access$1100(ShareNewQRCodeView.this).getVisibility() != 8) {
                if (bitmap != null) {
                    ShareNewQRCodeView.access$1100(ShareNewQRCodeView.this).setBackground(new BitmapDrawable(ShareNewQRCodeView.access$200(ShareNewQRCodeView.this).getResources(), bitmap));
                }
                ShareNewQRCodeView.access$300(ShareNewQRCodeView.this);
                ShareNewQRCodeView.access$402(ShareNewQRCodeView.this, true);
                if (ShareNewQRCodeView.access$1200(ShareNewQRCodeView.this) != null) {
                    ShareNewQRCodeView.access$1200(ShareNewQRCodeView.this).onSuccess();
                }
            }
        }

        /* renamed from: c */
        public void onProgressUpdate(Bitmap... bitmapArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f4450555", new Object[]{this, bitmapArr});
                return;
            }
            super.onProgressUpdate(bitmapArr);
            ShareNewQRCodeView.access$1000(ShareNewQRCodeView.this, bitmapArr[0]);
        }

        /* renamed from: a */
        public Bitmap doInBackground(Void... voidArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Bitmap) ipChange.ipc$dispatch("bb544155", new Object[]{this, voidArr});
            }
            if (!"qrcode".equals(ShareNewQRCodeView.access$900(ShareNewQRCodeView.this)) || ShareNewQRCodeView.access$600(ShareNewQRCodeView.this) == null) {
                return ShareNewQRCodeView.access$600(ShareNewQRCodeView.this);
            }
            Bitmap b = z6n.b(ShareNewQRCodeView.access$600(ShareNewQRCodeView.this), null, this.f12504a);
            publishProgress(b);
            Bitmap bitmap = this.b;
            if (bitmap == null) {
                bitmap = BitmapFactory.decodeResource(ShareNewQRCodeView.access$200(ShareNewQRCodeView.this).getResources(), R.drawable.share_qrcode_bg).copy(Bitmap.Config.ARGB_8888, true);
            }
            return z6n.a(b, bitmap);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class g extends AsyncTask<Void, Void, Boolean> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Bitmap f12509a;
        public final /* synthetic */ String b;
        public final /* synthetic */ ShareData c;

        public g(Bitmap bitmap, String str, ShareData shareData) {
            this.f12509a = bitmap;
            this.b = str;
            this.c = shareData;
        }

        public static /* synthetic */ Object ipc$super(g gVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/longpic/ShareNewQRCodeView$16");
        }

        /* renamed from: a */
        public Boolean doInBackground(Void... voidArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Boolean) ipChange.ipc$dispatch("9ea9e934", new Object[]{this, voidArr});
            }
            String b = hhi.b(true, this.f12509a, Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM), ShareNewQRCodeView.access$200(ShareNewQRCodeView.this));
            Bitmap bitmap = this.f12509a;
            if (bitmap != null && !bitmap.isRecycled()) {
                this.f12509a.recycle();
            }
            return Boolean.valueOf(!TextUtils.isEmpty(b));
        }

        /* renamed from: b */
        public void onPostExecute(Boolean bool) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b98eb50", new Object[]{this, bool});
                return;
            }
            ShareNewQRCodeView.access$300(ShareNewQRCodeView.this);
            if (!bool.booleanValue()) {
                Properties properties = new Properties();
                properties.put("Reason", "others");
                TBS.Ext.commitEvent("Page_QRCode_SaveFail", properties);
                Toast makeText = Toast.makeText(ShareNewQRCodeView.access$200(ShareNewQRCodeView.this), Localization.q(R.string.taobao_app_1010_1_17858), 1);
                makeText.setGravity(17, 0, 0);
                makeText.show();
            } else if (!ShareNewQRCodeView.access$1700(ShareNewQRCodeView.this)) {
                ShareNewQRCodeView.access$1702(ShareNewQRCodeView.this, true);
                ShareNewQRCodeView.access$1800(ShareNewQRCodeView.this, this.b, this.c);
                if (!TextUtils.isEmpty(ShareNewQRCodeView.access$1900(ShareNewQRCodeView.this))) {
                    kwr.g(ShareNewQRCodeView.access$200(ShareNewQRCodeView.this), kwr.TAO_PASSWORD_FROM_PIC_SAVE_KEY, ShareNewQRCodeView.access$1900(ShareNewQRCodeView.this));
                }
                TBS.Ext.commitEvent("Page_QRCode_SaveSuccess", (Properties) null);
            }
            ShareNewQRCodeView.access$000(ShareNewQRCodeView.this).dismiss();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void dealTextType(com.alibaba.fastjson.JSONObject r7, float r8, android.widget.FrameLayout r9, android.widget.LinearLayout r10) {
        /*
            r6 = this;
            r0 = 0
            com.android.alibaba.ip.runtime.IpChange r1 = com.taobao.tao.longpic.ShareNewQRCodeView.$ipChange
            boolean r2 = r1 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r2 == 0) goto L_0x0023
            java.lang.Float r2 = new java.lang.Float
            r2.<init>(r8)
            r8 = 5
            java.lang.Object[] r8 = new java.lang.Object[r8]
            r8[r0] = r6
            r0 = 1
            r8[r0] = r7
            r7 = 2
            r8[r7] = r2
            r7 = 3
            r8[r7] = r9
            r7 = 4
            r8[r7] = r10
            java.lang.String r7 = "d1fa959a"
            r1.ipc$dispatch(r7, r8)
            return
        L_0x0023:
            if (r7 != 0) goto L_0x0026
            return
        L_0x0026:
            java.lang.String r1 = "content"
            java.lang.String r1 = r7.getString(r1)
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 == 0) goto L_0x0033
            return
        L_0x0033:
            android.widget.TextView r2 = new android.widget.TextView
            android.content.Context r3 = r6.mContext
            r2.<init>(r3)
            com.taobao.tao.longpic.ShareNewQRCodeView$v r3 = new com.taobao.tao.longpic.ShareNewQRCodeView$v
            r3.<init>()
            r3.b(r7)
            int r4 = r6.getWindowWidth()
            float r4 = (float) r4
            r3.a(r8, r4)
            java.lang.String r8 = "color"
            java.lang.String r8 = r7.getString(r8)
            java.lang.String r4 = "#666666"
            int r4 = android.graphics.Color.parseColor(r4)
            boolean r5 = android.text.TextUtils.isEmpty(r8)     // Catch: all -> 0x0061
            if (r5 != 0) goto L_0x0062
            int r4 = android.graphics.Color.parseColor(r8)     // Catch: all -> 0x0061
            goto L_0x0062
        L_0x0061:
        L_0x0062:
            r2.setTextColor(r4)
            java.lang.String r8 = "size"
            java.lang.String r7 = r7.getString(r8)
            boolean r8 = android.text.TextUtils.isEmpty(r7)
            if (r8 != 0) goto L_0x0089
            java.lang.String r8 = "small"
            boolean r8 = r8.equals(r7)
            if (r8 == 0) goto L_0x007e
            r7 = 12
            goto L_0x008b
        L_0x007e:
            java.lang.String r8 = "big"
            boolean r7 = r8.equals(r7)
            if (r7 == 0) goto L_0x0089
            r7 = 18
            goto L_0x008b
        L_0x0089:
            r7 = 16
        L_0x008b:
            float r7 = (float) r7
            r2.setTextSize(r7)
            r2.setText(r1)
            boolean r7 = r3.c()
            r8 = -2
            if (r7 == 0) goto L_0x00a8
            android.widget.LinearLayout$LayoutParams r7 = new android.widget.LinearLayout$LayoutParams
            r7.<init>(r8, r8)
            r2.setLayoutParams(r7)
            r10.addView(r2)
            r2.setVisibility(r0)
            goto L_0x00d2
        L_0x00a8:
            android.widget.FrameLayout$LayoutParams r7 = new android.widget.FrameLayout$LayoutParams
            r7.<init>(r8, r8)
            r2.setLayoutParams(r7)
            r9.addView(r2)
            android.widget.FrameLayout$LayoutParams r7 = new android.widget.FrameLayout$LayoutParams
            int r9 = r3.g
            int r10 = r3.h
            r7.<init>(r9, r10)
            int r9 = r3.f
            int r10 = r3.e
            r7.setMargins(r9, r10, r0, r0)
            int r9 = r3.h
            if (r9 != 0) goto L_0x00c9
            r7.height = r8
        L_0x00c9:
            int r9 = r3.g
            if (r9 != 0) goto L_0x00cf
            r7.width = r8
        L_0x00cf:
            r2.setLayoutParams(r7)
        L_0x00d2:
            android.text.TextUtils$TruncateAt r7 = android.text.TextUtils.TruncateAt.END
            r2.setEllipsize(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.tao.longpic.ShareNewQRCodeView.dealTextType(com.alibaba.fastjson.JSONObject, float, android.widget.FrameLayout, android.widget.LinearLayout):void");
    }

    private void saveToDCIM(View view, String str, ShareData shareData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41b73a31", new Object[]{this, view, str, shareData});
            return;
        }
        Bitmap createViewBitmap = BitmapUtil.createViewBitmap(view);
        if (createViewBitmap != null && !this.isDoShareProgress) {
            this.isDoShareProgress = true;
            com.taobao.runtimepermission.a.c(this.mContext, a0m.a()).t("tb_share").x(true).w(Localization.q(R.string.taobao_app_1010_1_17871)).A(new i(createViewBitmap, str, shareData)).z(new h()).m();
        }
    }

    private SpannableStringBuilder buildPrice(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SpannableStringBuilder) ipChange.ipc$dispatch("c6f3bfef", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.contains("-")) {
            String[] split = str.split("\\-");
            if (split == null || split.length <= 0) {
                return null;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(lwm.unit + split[0]);
            spannableStringBuilder.setSpan(new AbsoluteSizeSpan(lr7.b(this.mContext, 33.0f)), 1, split[0].split("\\.")[0].length() + 1, 17);
            return spannableStringBuilder;
        }
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(lwm.unit.concat(str));
        spannableStringBuilder2.setSpan(new AbsoluteSizeSpan(lr7.b(this.mContext, 33.0f)), 1, str.split("\\.")[0].length() + 1, 17);
        return spannableStringBuilder2;
    }

    private void doShare(String str, ShareData shareData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("faaa8606", new Object[]{this, str, shareData});
        } else if (ShareTargetType.Share2Weixin.getValue().equals(str)) {
            showShareDialog(TPTargetType.WEIXIN, Localization.q(R.string.taobao_app_1010_1_17863), this.mContext.getResources().getColorStateList(R.color.snapshot_weixin), shareData);
            TBS.Ext.commitEvent("Page_QRCode", 19999, "QRCodeShare", null, null, "bizID=" + shareData.getBusinessId(), "app=weixin");
        } else if (ShareTargetType.Share2QQ.getValue().equals(str)) {
            showShareDialog(TPTargetType.QQFRIEND, Localization.q(R.string.taobao_app_1010_1_17862), this.mContext.getResources().getColorStateList(R.color.snapshot_qq), shareData);
            TBS.Ext.commitEvent("Page_QRCode", 19999, "QRCodeShare", null, null, "bizID=" + shareData.getBusinessId(), "app=qq");
        } else if (ShareTargetType.Share2SinaWeibo.getValue().equals(str)) {
            showShareDialog(TPTargetType.SINAWEIBO, Localization.q(R.string.taobao_app_1010_1_17835), this.mContext.getResources().getColorStateList(R.color.snapshot_weibo), shareData);
            TBS.Ext.commitEvent("Page_QRCode", 19999, "QRCodeShare", null, null, "bizID=" + shareData.getBusinessId(), "app=weibo");
        } else if (DraftManager.ACTION_TYPE_SAVE.equals(str)) {
            Toast makeText = Toast.makeText(this.mContext, Localization.q(R.string.taobao_app_1010_1_17861), 1);
            makeText.setGravity(17, 0, 0);
            makeText.show();
            TBS.Ext.commitEvent("Page_QRCode", 19999, "QRCodeSavePic", null, null, "bizID=" + shareData.getBusinessId());
            HashMap hashMap = new HashMap();
            hashMap.put("result", "success");
            ShareBusiness.getInstance().onShareFinished(hashMap);
            this.isShowShareDialog = false;
            sendBroadCast4Tmall();
        }
    }

    private void generateImageViewWithTemplate(JSONObject jSONObject) {
        JSONArray jSONArray;
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2417aa7e", new Object[]{this, jSONObject});
        } else if (jSONObject != null && (jSONArray = jSONObject.getJSONArray(QR_TEMPLATE)) != null) {
            if (jSONArray.size() > blo.h()) {
                i2 = blo.h();
            } else {
                i2 = jSONArray.size();
            }
            if (i2 > 20) {
                i2 = 20;
            }
            float floatValue = jSONObject.getFloat(QR_BASE_WIDTH).floatValue() > 0.0f ? jSONObject.getFloat(QR_BASE_WIDTH).floatValue() : 100.0f;
            for (int i3 = 0; i3 < i2; i3++) {
                try {
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i3);
                    if (jSONObject2 != null) {
                        String string = jSONObject2.getString("type");
                        if (!TextUtils.isEmpty(string)) {
                            if ("image".equals(string)) {
                                dealImageType(jSONObject2, floatValue, this.frameLayout, this.linearLayout);
                            } else if ("text".equals(string)) {
                                dealTextType(jSONObject2, floatValue, this.frameLayout, this.linearLayout);
                            } else if ("qrCode".equals(string)) {
                                saveQRType(jSONObject2, floatValue);
                            }
                        }
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
            if (this.frameLayout.getChildCount() == 0) {
                this.frameLayout.setVisibility(8);
            }
            if (this.linearLayout.getChildCount() == 0) {
                this.linearLayout.setVisibility(8);
            }
        }
    }

    private void generateImagesView(List<String> list, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fae1fa54", new Object[]{this, list, str});
        } else if (list != null && list.size() != 0 && !"shop".equals(str)) {
            LinearLayout linearLayout = (LinearLayout) this.mView.findViewById(R.id.snapshot_image_layout);
            ((FrameLayout) this.mView.findViewById(R.id.snapshot_defined_layout)).setVisibility(8);
            int i2 = 4;
            if (list.size() <= 4) {
                i2 = list.size();
            }
            for (int i3 = list.size() > 1 ? 1 : 0; i3 < i2; i3++) {
                TUrlImageView tUrlImageView = new TUrlImageView(this.mContext);
                tUrlImageView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                tUrlImageView.setVisibility(0);
                tUrlImageView.setImageUrl(list.get(i3));
                tUrlImageView.setStrategyConfig(zoe.f32908a);
                tUrlImageView.setScaleType(ImageView.ScaleType.FIT_XY);
                tUrlImageView.failListener(new o(this));
                tUrlImageView.succListener(new p(tUrlImageView));
                linearLayout.addView(tUrlImageView);
            }
        }
    }

    public Bitmap createQrcode(String str, String str2, final int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("bba68cbc", new Object[]{this, str, str2, new Integer(i2)});
        }
        int a2 = lkp.a(lkp.b.PIIIC_QRCODE_COLOR);
        if (a2 != -1) {
            i2 = a2;
        }
        if (TextUtils.isEmpty(str)) {
            p0u.a(this.mContext, Localization.q(R.string.taobao_app_1010_1_23569));
            onLoadingFinish();
            this.mGetBitmapFinish = true;
            this.mPopupWindow.dismiss();
            return null;
        }
        this.taoLongPicCode = str2;
        this.mShareUrl = str;
        this.mGetBitmapFinish = false;
        encodeQrcode(str, str2, i2, new EncodeCallback() { // from class: com.taobao.tao.longpic.ShareNewQRCodeView.8

            /* compiled from: Taobao */
            /* renamed from: com.taobao.tao.longpic.ShareNewQRCodeView$8$a */
            /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
            public class a implements Runnable {
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public a() {
                }

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    p0u.a(ShareNewQRCodeView.access$200(ShareNewQRCodeView.this), Localization.q(R.string.taobao_app_1010_1_23569));
                    ShareNewQRCodeView.access$300(ShareNewQRCodeView.this);
                    ShareNewQRCodeView.access$402(ShareNewQRCodeView.this, true);
                    ShareNewQRCodeView.access$000(ShareNewQRCodeView.this).dismiss();
                }
            }

            /* compiled from: Taobao */
            /* renamed from: com.taobao.tao.longpic.ShareNewQRCodeView$8$b */
            /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
            public class b implements Runnable {
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* renamed from: a  reason: collision with root package name */
                public final /* synthetic */ BitmapHolder f12498a;

                public b(BitmapHolder bitmapHolder) {
                    this.f12498a = bitmapHolder;
                }

                @Override // java.lang.Runnable
                public void run() {
                    Bitmap bitmap;
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    BitmapHolder bitmapHolder = this.f12498a;
                    if (bitmapHolder == null || (bitmap = bitmapHolder.encodeResult) == null) {
                        p0u.a(ShareNewQRCodeView.access$200(ShareNewQRCodeView.this), Localization.q(R.string.taobao_app_1010_1_23569));
                        ShareNewQRCodeView.access$300(ShareNewQRCodeView.this);
                        ShareNewQRCodeView.access$402(ShareNewQRCodeView.this, true);
                        ShareNewQRCodeView.access$000(ShareNewQRCodeView.this).dismiss();
                        return;
                    }
                    ShareNewQRCodeView.access$602(ShareNewQRCodeView.this, bitmap);
                    AnonymousClass8 r0 = AnonymousClass8.this;
                    ShareNewQRCodeView.access$700(ShareNewQRCodeView.this, i2);
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return null;
            }

            @Override // com.taobao.taobao.scancode.encode.aidlservice.EncodeCallback
            public void onError(EncodeError encodeError) {
                ShareNewQRCodeView.access$500(ShareNewQRCodeView.this).post(new a());
            }

            @Override // com.taobao.taobao.scancode.encode.aidlservice.EncodeCallback
            public void onSuccess(BitmapHolder bitmapHolder) throws RemoteException {
                TLog.logi("ShareQRCodeScanView", "generateCode get QRcode success");
                ShareNewQRCodeView.access$500(ShareNewQRCodeView.this).post(new b(bitmapHolder));
            }
        });
        return null;
    }

    static {
        t2o.a(666894481);
    }

    private void encodeQrcode(String str, int i2, EncodeCallback encodeCallback, Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5ab6bd8", new Object[]{this, str, new Integer(i2), encodeCallback, bitmap});
        } else {
            Coordinator.execute(new e(bitmap, str, encodeCallback, i2));
        }
    }
}
