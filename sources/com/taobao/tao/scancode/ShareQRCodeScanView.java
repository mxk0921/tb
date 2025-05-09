package com.taobao.tao.scancode;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.alibaba.ability.localization.Localization;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.task.Coordinator;
import com.taobao.phenix.intf.event.FailPhenixEvent;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import com.taobao.statistic.TBS;
import com.taobao.tao.log.TLog;
import com.taobao.taobao.R;
import com.taobao.taobao.scancode.encode.aidlservice.BitmapHolder;
import com.taobao.taobao.scancode.encode.aidlservice.EncodeCallback;
import com.taobao.taobao.scancode.encode.aidlservice.EncodeError;
import com.taobao.taobao.scancode.encode.aidlservice.MaSizeType;
import com.taobao.uikit.extend.feature.view.TIconFontTextView;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import com.ut.share.data.ShareData;
import com.ut.share.utils.ShareUtils;
import java.util.List;
import tb.blo;
import tb.bwr;
import tb.hjp;
import tb.lkp;
import tb.lr7;
import tb.md8;
import tb.nd8;
import tb.p0u;
import tb.pg1;
import tb.s0m;
import tb.s8d;
import tb.t2o;
import tb.z6n;
import tb.zoe;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class ShareQRCodeScanView implements PopupWindow.OnDismissListener {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ACTION_SHARE_DIALOG_CLOSE = "action.share_dialog_close";
    private Animation dismissAnimation;
    private LayoutInflater inflater;
    private k listener;
    private Context mContext;
    private boolean mGetBitmapFinish = false;
    private Handler mHandler = new Handler(Looper.getMainLooper());
    private PopupWindow mPopupWindow;
    private Bitmap mQRBitmap;
    private View mQRCodeView;
    private View mView;
    private View progressLayout;
    private Animation showAnimation;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Bitmap f12746a;
        public final /* synthetic */ String b;
        public final /* synthetic */ EncodeCallback c;
        public final /* synthetic */ int d;

        public a(Bitmap bitmap, String str, EncodeCallback encodeCallback, int i) {
            this.f12746a = bitmap;
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
            Bitmap bitmap = this.f12746a;
            if (bitmap == null) {
                bitmap = BitmapFactory.decodeResource(ShareQRCodeScanView.access$200(ShareQRCodeScanView.this).getResources(), R.drawable.share_tao_ico).copy(Bitmap.Config.ARGB_8888, true);
            }
            if (bitmap != null) {
                nd8.c(ShareQRCodeScanView.access$200(ShareQRCodeScanView.this)).a(1, ShareUtils.bmpToByteArray(bitmap, false), bitmap.getWidth(), bitmap.getHeight(), this.b, bitmap.getRowBytes(), 0, lr7.b(ShareQRCodeScanView.access$200(ShareQRCodeScanView.this), 180.0f), 'Q', 0, this.c, this.d);
            } else {
                md8.c(ShareQRCodeScanView.access$200(ShareQRCodeScanView.this)).a(blo.g(true), this.b, 0, new MaSizeType(0, 0, lr7.b(ShareQRCodeScanView.access$200(ShareQRCodeScanView.this), 180.0f)), false, this.c);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements Animation.AnimationListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
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
    public class c implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ShareData f12748a;

        public c(ShareData shareData) {
            this.f12748a = shareData;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            TBS.Ext.commitEvent("Page_QRCode_Scan", 19999, "QRCodeScanCancel", null, null, "bizID=" + this.f12748a.getBusinessId());
            ShareQRCodeScanView.access$000(ShareQRCodeScanView.this).dismiss();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class d implements s8d<FailPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d(ShareQRCodeScanView shareQRCodeScanView) {
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
    public class e implements s8d<SuccPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ TUrlImageView f12749a;

        public e(TUrlImageView tUrlImageView) {
            this.f12749a = tUrlImageView;
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
                float access$100 = ShareQRCodeScanView.access$100(ShareQRCodeScanView.this);
                this.f12749a.setLayoutParams(new LinearLayout.LayoutParams((int) access$100, (int) ((access$100 / intrinsicWidth) * intrinsicHeight)));
            }
            this.f12749a.setVisibility(0);
            return true;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class f implements s8d<FailPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f12750a;
        public final /* synthetic */ int b;
        public final /* synthetic */ EncodeCallback c;

        public f(String str, int i, EncodeCallback encodeCallback) {
            this.f12750a = str;
            this.b = i;
            this.c = encodeCallback;
        }

        /* renamed from: a */
        public boolean onHappen(FailPhenixEvent failPhenixEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5fa0e8d0", new Object[]{this, failPhenixEvent})).booleanValue();
            }
            ShareQRCodeScanView.access$800(ShareQRCodeScanView.this, this.f12750a, this.b, this.c, null);
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class g implements s8d<SuccPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f12751a;
        public final /* synthetic */ int b;
        public final /* synthetic */ EncodeCallback c;

        public g(String str, int i, EncodeCallback encodeCallback) {
            this.f12751a = str;
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
                ShareQRCodeScanView.access$800(ShareQRCodeScanView.this, this.f12751a, this.b, this.c, succPhenixEvent.getDrawable().getBitmap());
            }
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class h implements s8d<FailPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f12752a;

        public h(int i) {
            this.f12752a = i;
        }

        /* renamed from: a */
        public boolean onHappen(FailPhenixEvent failPhenixEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5fa0e8d0", new Object[]{this, failPhenixEvent})).booleanValue();
            }
            ShareQRCodeScanView.access$900(ShareQRCodeScanView.this, this.f12752a, null);
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class i implements s8d<SuccPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f12753a;

        public i(int i) {
            this.f12753a = i;
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
                    ShareQRCodeScanView.access$900(ShareQRCodeScanView.this, this.f12753a, createScaledBitmap);
                } else {
                    ShareQRCodeScanView.access$900(ShareQRCodeScanView.this, this.f12753a, bitmap);
                }
            }
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class j extends AsyncTask<Void, Bitmap, Bitmap> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f12754a;
        public final /* synthetic */ Bitmap b;

        public j(int i, Bitmap bitmap) {
            this.f12754a = i;
            this.b = bitmap;
        }

        public static /* synthetic */ Object ipc$super(j jVar, String str, Object... objArr) {
            if (str.hashCode() == -1325021319) {
                super.onPostExecute(objArr[0]);
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/scancode/ShareQRCodeScanView$9");
        }

        /* renamed from: a */
        public Bitmap doInBackground(Void... voidArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Bitmap) ipChange.ipc$dispatch("bb544155", new Object[]{this, voidArr});
            }
            if (ShareQRCodeScanView.access$600(ShareQRCodeScanView.this) == null) {
                return null;
            }
            Bitmap b = z6n.b(ShareQRCodeScanView.access$600(ShareQRCodeScanView.this), null, this.f12754a);
            Bitmap bitmap = this.b;
            if (bitmap == null) {
                bitmap = BitmapFactory.decodeResource(ShareQRCodeScanView.access$200(ShareQRCodeScanView.this).getResources(), R.drawable.share_qrcode_bg).copy(Bitmap.Config.ARGB_8888, true);
            }
            return z6n.a(b, bitmap);
        }

        /* renamed from: b */
        public void onPostExecute(Bitmap bitmap) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c38e7f1", new Object[]{this, bitmap});
                return;
            }
            super.onPostExecute(bitmap);
            if (ShareQRCodeScanView.access$1000(ShareQRCodeScanView.this) != null) {
                if (bitmap != null) {
                    ShareQRCodeScanView.access$1000(ShareQRCodeScanView.this).setBackground(new BitmapDrawable(ShareQRCodeScanView.access$200(ShareQRCodeScanView.this).getResources(), bitmap));
                }
                ShareQRCodeScanView.access$300(ShareQRCodeScanView.this);
                ShareQRCodeScanView.access$402(ShareQRCodeScanView.this, true);
                if (ShareQRCodeScanView.access$1100(ShareQRCodeScanView.this) != null) {
                    ShareQRCodeScanView.access$1100(ShareQRCodeScanView.this).onSuccess();
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface k {
        void onSuccess();
    }

    static {
        t2o.a(666894526);
    }

    public ShareQRCodeScanView(Context context) {
        this.mContext = context;
    }

    public static /* synthetic */ PopupWindow access$000(ShareQRCodeScanView shareQRCodeScanView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PopupWindow) ipChange.ipc$dispatch("7331f0b4", new Object[]{shareQRCodeScanView});
        }
        return shareQRCodeScanView.mPopupWindow;
    }

    public static /* synthetic */ int access$100(ShareQRCodeScanView shareQRCodeScanView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6749ce52", new Object[]{shareQRCodeScanView})).intValue();
        }
        return shareQRCodeScanView.getWindowWidth();
    }

    public static /* synthetic */ View access$1000(ShareQRCodeScanView shareQRCodeScanView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("c5bf533", new Object[]{shareQRCodeScanView});
        }
        return shareQRCodeScanView.mQRCodeView;
    }

    public static /* synthetic */ k access$1100(ShareQRCodeScanView shareQRCodeScanView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (k) ipChange.ipc$dispatch("770e18a4", new Object[]{shareQRCodeScanView});
        }
        return shareQRCodeScanView.listener;
    }

    public static /* synthetic */ Context access$200(ShareQRCodeScanView shareQRCodeScanView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("6a4fedb6", new Object[]{shareQRCodeScanView});
        }
        return shareQRCodeScanView.mContext;
    }

    public static /* synthetic */ void access$300(ShareQRCodeScanView shareQRCodeScanView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2fb031d", new Object[]{shareQRCodeScanView});
        } else {
            shareQRCodeScanView.onLoadingFinish();
        }
    }

    public static /* synthetic */ boolean access$402(ShareQRCodeScanView shareQRCodeScanView, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b0b7005e", new Object[]{shareQRCodeScanView, new Boolean(z)})).booleanValue();
        }
        shareQRCodeScanView.mGetBitmapFinish = z;
        return z;
    }

    public static /* synthetic */ Handler access$500(ShareQRCodeScanView shareQRCodeScanView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("1b287b0b", new Object[]{shareQRCodeScanView});
        }
        return shareQRCodeScanView.mHandler;
    }

    public static /* synthetic */ Bitmap access$600(ShareQRCodeScanView shareQRCodeScanView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("b98c9318", new Object[]{shareQRCodeScanView});
        }
        return shareQRCodeScanView.mQRBitmap;
    }

    public static /* synthetic */ Bitmap access$602(ShareQRCodeScanView shareQRCodeScanView, Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("ee3bf94", new Object[]{shareQRCodeScanView, bitmap});
        }
        shareQRCodeScanView.mQRBitmap = bitmap;
        return bitmap;
    }

    public static /* synthetic */ void access$700(ShareQRCodeScanView shareQRCodeScanView, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d150998a", new Object[]{shareQRCodeScanView, new Integer(i2)});
        } else {
            shareQRCodeScanView.mergerQrcodeBitmap(i2);
        }
    }

    public static /* synthetic */ void access$800(ShareQRCodeScanView shareQRCodeScanView, String str, int i2, EncodeCallback encodeCallback, Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30c57ac5", new Object[]{shareQRCodeScanView, str, new Integer(i2), encodeCallback, bitmap});
        } else {
            shareQRCodeScanView.encodeQrcode(str, i2, encodeCallback, bitmap);
        }
    }

    public static /* synthetic */ void access$900(ShareQRCodeScanView shareQRCodeScanView, int i2, Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edd91322", new Object[]{shareQRCodeScanView, new Integer(i2), bitmap});
        } else {
            shareQRCodeScanView.doMergerBitmap(i2, bitmap);
        }
    }

    private void doMergerBitmap(int i2, Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd671c86", new Object[]{this, new Integer(i2), bitmap});
        } else {
            new j(i2, bitmap).execute(new Void[0]);
        }
    }

    private void encodeQrcode(String str, int i2, EncodeCallback encodeCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11433316", new Object[]{this, str, new Integer(i2), encodeCallback});
            return;
        }
        String g2 = lkp.b.g();
        if (!TextUtils.isEmpty(g2)) {
            s0m.B().T(g2).succListener(new g(str, i2, encodeCallback)).failListener(new f(str, i2, encodeCallback)).fetch();
        } else {
            encodeQrcode(str, i2, encodeCallback, null);
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
        this.showAnimation.setAnimationListener(new b());
    }

    private void initBottomView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("773b9d27", new Object[]{this});
            return;
        }
        String h2 = lkp.b.h();
        if (TextUtils.isEmpty(h2)) {
            this.mView.findViewById(R.id.share_bottom_layout).setVisibility(0);
            return;
        }
        TUrlImageView tUrlImageView = (TUrlImageView) this.mView.findViewById(R.id.share_bottom_iv);
        tUrlImageView.setImageUrl(h2);
        tUrlImageView.setVisibility(0);
    }

    private void initImage(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a728767c", new Object[]{this, str});
            return;
        }
        TUrlImageView tUrlImageView = (TUrlImageView) this.mView.findViewById(R.id.snapshot_image);
        tUrlImageView.setVisibility(0);
        tUrlImageView.setImageUrl(str);
        tUrlImageView.setStrategyConfig(zoe.f32908a);
        tUrlImageView.setScaleType(ImageView.ScaleType.FIT_XY);
        tUrlImageView.failListener(new d(this));
        tUrlImageView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        tUrlImageView.succListener(new e(tUrlImageView));
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
            s0m.B().T(d2).succListener(new i(i2)).failListener(new h(i2)).fetch();
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

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cab76ab2", new Object[]{this});
            return;
        }
        LocalBroadcastManager.getInstance(hjp.a().getApplicationContext()).sendBroadcast(new Intent("action.share_dialog_close"));
        this.mHandler.removeCallbacksAndMessages(null);
    }

    public Bitmap createQrcode(String str, final int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("dc8a3e86", new Object[]{this, str, new Integer(i2)});
        }
        if (this.mPopupWindow == null) {
            return null;
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
        this.mGetBitmapFinish = false;
        encodeQrcode(str, i2, new EncodeCallback() { // from class: com.taobao.tao.scancode.ShareQRCodeScanView.4

            /* compiled from: Taobao */
            /* renamed from: com.taobao.tao.scancode.ShareQRCodeScanView$4$a */
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
                    p0u.a(ShareQRCodeScanView.access$200(ShareQRCodeScanView.this), Localization.q(R.string.taobao_app_1010_1_23569));
                    ShareQRCodeScanView.access$300(ShareQRCodeScanView.this);
                    ShareQRCodeScanView.access$402(ShareQRCodeScanView.this, true);
                    ShareQRCodeScanView.access$000(ShareQRCodeScanView.this).dismiss();
                }
            }

            /* compiled from: Taobao */
            /* renamed from: com.taobao.tao.scancode.ShareQRCodeScanView$4$b */
            /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
            public class b implements Runnable {
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* renamed from: a  reason: collision with root package name */
                public final /* synthetic */ BitmapHolder f12745a;

                public b(BitmapHolder bitmapHolder) {
                    this.f12745a = bitmapHolder;
                }

                @Override // java.lang.Runnable
                public void run() {
                    Bitmap bitmap;
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    BitmapHolder bitmapHolder = this.f12745a;
                    if (bitmapHolder == null || (bitmap = bitmapHolder.encodeResult) == null) {
                        p0u.a(ShareQRCodeScanView.access$200(ShareQRCodeScanView.this), Localization.q(R.string.taobao_app_1010_1_23569));
                        ShareQRCodeScanView.access$300(ShareQRCodeScanView.this);
                        ShareQRCodeScanView.access$402(ShareQRCodeScanView.this, true);
                        ShareQRCodeScanView.access$000(ShareQRCodeScanView.this).dismiss();
                        return;
                    }
                    ShareQRCodeScanView.access$602(ShareQRCodeScanView.this, bitmap);
                    AnonymousClass4 r0 = AnonymousClass4.this;
                    ShareQRCodeScanView.access$700(ShareQRCodeScanView.this, i2);
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return null;
            }

            @Override // com.taobao.taobao.scancode.encode.aidlservice.EncodeCallback
            public void onError(EncodeError encodeError) throws RemoteException {
                ShareQRCodeScanView.access$500(ShareQRCodeScanView.this).post(new a());
            }

            @Override // com.taobao.taobao.scancode.encode.aidlservice.EncodeCallback
            public void onSuccess(BitmapHolder bitmapHolder) throws RemoteException {
                TLog.logi("ShareQRCodeScanView", "generateCode get QRcode success");
                ShareQRCodeScanView.access$500(ShareQRCodeScanView.this).post(new b(bitmapHolder));
            }
        });
        return null;
    }

    public void showSnapshotDialog(List<String> list, ShareData shareData, String str, JSONObject jSONObject, boolean z, k kVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2c7624c", new Object[]{this, list, shareData, str, jSONObject, new Boolean(z), kVar});
            return;
        }
        this.listener = kVar;
        if (this.mPopupWindow == null) {
            TBS.Ext.commitEvent("Page_QRCode_Scan", 19999, "ShowPicView", null, null, "bizID=" + shareData.getBusinessId());
            initAnimation();
            LayoutInflater from = LayoutInflater.from(hjp.a().getApplicationContext());
            this.inflater = from;
            this.mView = from.inflate(R.layout.share_qrcode_scan_view, (ViewGroup) null);
            View k2 = bwr.h().k();
            if (k2 != null) {
                this.mQRCodeView = this.mView.findViewById(R.id.snapshot_qrcode);
                View findViewById = this.mView.findViewById(R.id.super_user_container);
                if (z) {
                    findViewById.setVisibility(0);
                } else {
                    findViewById.setVisibility(8);
                }
                String sourceType = shareData.getSourceType();
                String text = shareData.getText();
                if (!TextUtils.isEmpty(text)) {
                    if ("shop".equals(sourceType)) {
                        TextView textView = (TextView) this.mView.findViewById(R.id.snapshot_title_shop);
                        textView.setText(text);
                        textView.setVisibility(0);
                    } else {
                        TextView textView2 = (TextView) this.mView.findViewById(R.id.snapshot_title);
                        textView2.setText(text);
                        textView2.setVisibility(0);
                    }
                }
                initImage(shareData.getImageUrl());
                initBottomView();
                PopupWindow popupWindow = new PopupWindow(this.mContext);
                this.mPopupWindow = popupWindow;
                popupWindow.setContentView(this.mView);
                this.mPopupWindow.setWidth(-1);
                this.mPopupWindow.setHeight(-1);
                this.mPopupWindow.setFocusable(true);
                this.mPopupWindow.setBackgroundDrawable(new ColorDrawable(this.mContext.getResources().getColor(R.color.half_transparent)));
                ((TIconFontTextView) this.mView.findViewById(R.id.snapshot_cancel)).setOnClickListener(new c(shareData));
                this.mPopupWindow.setOnDismissListener(this);
                try {
                    this.mPopupWindow.showAtLocation(k2, 81, 0, 0);
                } catch (WindowManager.BadTokenException unused) {
                }
                onLoadingStart();
            }
        }
    }

    private void encodeQrcode(String str, int i2, EncodeCallback encodeCallback, Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5ab6bd8", new Object[]{this, str, new Integer(i2), encodeCallback, bitmap});
        } else {
            Coordinator.execute(new a(bitmap, str, encodeCallback, i2));
        }
    }
}
