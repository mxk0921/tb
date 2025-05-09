package com.alipay.mobile.verifyidentity.prodmanger.biopen.ui;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.alipay.android.phone.seauthenticator.iotauth.authmanager.AuthenticatorManager;
import com.alipay.mobile.common.transportext.biz.shared.ExtTransAppVisibleReceiver;
import com.alipay.mobile.verifyidentity.common.ModuleConstants;
import com.alipay.mobile.verifyidentity.data.ProdManagerResult;
import com.alipay.mobile.verifyidentity.engine.MicroModuleContext;
import com.alipay.mobile.verifyidentity.info.EnvInfoUtil;
import com.alipay.mobile.verifyidentity.log.VerifyLogCat;
import com.alipay.mobile.verifyidentity.log.behavior.VerifyLogger;
import com.alipay.mobile.verifyidentity.prod.manager.module.BaseProdManager;
import com.alipay.mobile.verifyidentity.prodmanager.TitleBarAdapter;
import com.alipay.mobile.verifyidentity.prodmanger.biopen.handler.BioOpenHandler;
import com.alipay.mobile.verifyidentity.rpc.RpcException;
import com.alipay.mobile.verifyidentity.rpc.biz.MICRpcServiceBiz;
import com.alipay.mobile.verifyidentity.ui.BaseVerifyActivity;
import com.alipay.mobile.verifyidentity.utils.CommonConstant;
import com.alipay.mobile.verifyidentity.utils.ReportHelper;
import com.alipay.mobile.verifyidentity.utils.task.AsyncTaskExecutor;
import com.alipay.mobileic.core.model.rpc.MICProdmngRequest;
import com.alipay.mobileic.core.model.rpc.MICProdmngResponse;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import tb.acq;
import tb.upx;
import tb.vaj;
import tb.why;
import tb.yj4;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class BioDetailActivity extends BaseVerifyActivity {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int GET_DATA_SUCCESS = 1;
    public static final int GET_ICON = 2;
    public String A;
    public String B;
    public String C;
    public String D;
    public String E;
    public String F;
    public String G;
    public String H;
    public boolean I;
    public BroadcastReceiver J;
    public LocalBroadcastManager K;
    public long M;
    public LinearLayout b;
    public TextView c;
    public TextView d;
    public TextView e;
    public TextView f;
    public TextView g;
    public TextView h;
    public TextView i;
    public Button j;
    public ImageView k;
    public ImageView l;
    public ImageView m;
    public LinearLayout n;
    public LinearLayout o;
    public RelativeLayout p;
    public RelativeLayout q;
    public View r;
    public View s;
    public CheckBox t;
    public Bundle v;
    public BaseProdManager w;
    public String x;
    public String y;
    public String z;
    public boolean u = false;
    public final a L = new a(this);

    /* compiled from: Taobao */
    /* renamed from: com.alipay.mobile.verifyidentity.prodmanger.biopen.ui.BioDetailActivity$15  reason: invalid class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public final class AnonymousClass15 implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public AnonymousClass15() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            String string;
            String string2;
            String string3;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            if (BioDetailActivity.access$100(BioDetailActivity.this)) {
                string = BioDetailActivity.this.getResources().getString(R.string.intelligent_single_alert_close);
                string2 = BioDetailActivity.this.getResources().getString(R.string.ing_know);
                string3 = BioDetailActivity.this.getResources().getString(R.string.ing_close);
            } else {
                string = BioDetailActivity.this.getResources().getString(R.string.intelligent_single_alert_open);
                string2 = BioDetailActivity.this.getResources().getString(R.string.ing_open);
                string3 = BioDetailActivity.this.getResources().getString(R.string.ing_close_ignore);
            }
            BioDetailActivity.this.alert((String) null, string, string2, new DialogInterface.OnClickListener() { // from class: com.alipay.mobile.verifyidentity.prodmanger.biopen.ui.BioDetailActivity.15.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                    } else if (!BioDetailActivity.access$100(BioDetailActivity.this)) {
                        BioDetailActivity.access$200(BioDetailActivity.this, true);
                    }
                }
            }, string3, new DialogInterface.OnClickListener() { // from class: com.alipay.mobile.verifyidentity.prodmanger.biopen.ui.BioDetailActivity.15.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                    } else if (BioDetailActivity.access$100(BioDetailActivity.this)) {
                        BioDetailActivity.access$200(BioDetailActivity.this, false);
                    }
                }
            }, Boolean.FALSE);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class a extends Handler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final WeakReference<BioDetailActivity> f4392a;

        public a(BioDetailActivity bioDetailActivity) {
            this.f4392a = new WeakReference<>(bioDetailActivity);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/mobile/verifyidentity/prodmanger/biopen/ui/BioDetailActivity$a");
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
                return;
            }
            BioDetailActivity bioDetailActivity = this.f4392a.get();
            if (bioDetailActivity != null) {
                Bitmap bitmap = (Bitmap) message.obj;
                int i = message.what;
                if (i == 1) {
                    BioDetailActivity.access$2400(bioDetailActivity).setImageBitmap(bitmap);
                } else if (i == 2) {
                    BioDetailActivity.access$2500(bioDetailActivity).setImageBitmap(bitmap);
                }
            }
        }
    }

    public static /* synthetic */ Button access$000(BioDetailActivity bioDetailActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Button) ipChange.ipc$dispatch("e0ab52ef", new Object[]{bioDetailActivity});
        }
        return bioDetailActivity.j;
    }

    public static /* synthetic */ boolean access$100(BioDetailActivity bioDetailActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b121d99e", new Object[]{bioDetailActivity})).booleanValue();
        }
        return bioDetailActivity.I;
    }

    public static /* synthetic */ String access$1000(BioDetailActivity bioDetailActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("516dd6b4", new Object[]{bioDetailActivity});
        }
        return bioDetailActivity.z;
    }

    public static /* synthetic */ String access$1100(BioDetailActivity bioDetailActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("81250ab5", new Object[]{bioDetailActivity});
        }
        return bioDetailActivity.y;
    }

    public static /* synthetic */ String access$1200(BioDetailActivity bioDetailActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b0dc3eb6", new Object[]{bioDetailActivity});
        }
        return bioDetailActivity.x;
    }

    public static /* synthetic */ String access$1202(BioDetailActivity bioDetailActivity, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5862acae", new Object[]{bioDetailActivity, str});
        }
        bioDetailActivity.x = str;
        return str;
    }

    public static /* synthetic */ boolean access$1300(BioDetailActivity bioDetailActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ebd4150d", new Object[]{bioDetailActivity})).booleanValue();
        }
        return bioDetailActivity.u;
    }

    public static /* synthetic */ void access$1400(BioDetailActivity bioDetailActivity, final String str, final String str2, final String str3, final Bundle bundle) {
        String str4;
        String str5;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47d8744e", new Object[]{bioDetailActivity, str, str2, str3, bundle});
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putBoolean(CommonConstant.alertTextColor, true);
        if (CommonConstant.FINGERPRINT_PAY.equalsIgnoreCase(bioDetailActivity.y)) {
            str5 = bioDetailActivity.getResources().getString(R.string.finger_closed_dialog_title);
            str4 = bioDetailActivity.getResources().getString(R.string.finger_closed_dialog_msg);
        } else if (CommonConstant.FACEID_PAY.equalsIgnoreCase(bioDetailActivity.y)) {
            str4 = bioDetailActivity.getResources().getString(R.string.face_closed_dialog_title);
            str5 = null;
        } else {
            str5 = null;
            str4 = null;
        }
        bioDetailActivity.alert(str5, str4, bioDetailActivity.getResources().getString(R.string.finger_closed_confirm), new DialogInterface.OnClickListener() { // from class: com.alipay.mobile.verifyidentity.prodmanger.biopen.ui.BioDetailActivity.4
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                } else {
                    BioDetailActivity.access$1500(BioDetailActivity.this, "close", str, str2, str3, bundle, new Bundle());
                }
            }
        }, bioDetailActivity.getResources().getString(R.string.finger_closed_cancel), new DialogInterface.OnClickListener() { // from class: com.alipay.mobile.verifyidentity.prodmanger.biopen.ui.BioDetailActivity.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                    return;
                }
                HashMap hashMap = new HashMap();
                hashMap.put("selectCode", "0");
                hashMap.put("sceneId", BioDetailActivity.access$900(BioDetailActivity.this));
                BioDetailActivity.access$1700(BioDetailActivity.this, "UC-MobileIC-20180315-4", "", hashMap);
            }
        }, bundle2);
    }

    public static /* synthetic */ String access$1600(BioDetailActivity bioDetailActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6fb90eba", new Object[]{bioDetailActivity});
        }
        return bioDetailActivity.A;
    }

    public static /* synthetic */ void access$1700(BioDetailActivity bioDetailActivity, String str, String str2, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3e2634c", new Object[]{bioDetailActivity, str, str2, map});
        } else {
            b(str, str2, map);
        }
    }

    public static /* synthetic */ void access$1800(BioDetailActivity bioDetailActivity, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba87eb2e", new Object[]{bioDetailActivity, str});
        } else {
            bioDetailActivity.e(str);
        }
    }

    public static /* synthetic */ void access$1900(BioDetailActivity bioDetailActivity, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81b7374d", new Object[]{bioDetailActivity, str});
        } else if ("SYSTEM_ERROR".equalsIgnoreCase(str)) {
            bioDetailActivity.toast(bioDetailActivity.getResources().getString(R.string.vi_system_error), R.drawable.vi_warning, 0);
        } else if ("OPEN_SUCCESS".equalsIgnoreCase(str)) {
            bioDetailActivity.toast(bioDetailActivity.getResources().getString(R.string.open_success), R.drawable.open_success, 0);
        } else if ("CLOSE_SUCCESS".equalsIgnoreCase(str)) {
            bioDetailActivity.toast(bioDetailActivity.getResources().getString(R.string.close_success), R.drawable.open_success, 0);
        } else if ("RPC_EXCEPTION".equalsIgnoreCase(str)) {
            bioDetailActivity.toast(bioDetailActivity.getResources().getString(R.string.vi_network_error), R.drawable.vi_warning, 0);
        }
    }

    public static /* synthetic */ void access$200(BioDetailActivity bioDetailActivity, final boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5393627b", new Object[]{bioDetailActivity, new Boolean(z)});
        } else {
            AsyncTaskExecutor.getInstance().execute(new Runnable() { // from class: com.alipay.mobile.verifyidentity.prodmanger.biopen.ui.BioDetailActivity.16
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public final void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        BioDetailActivity.this.showProgressDialog("", false, null);
                        MICProdmngRequest mICProdmngRequest = new MICProdmngRequest();
                        mICProdmngRequest.envData = EnvInfoUtil.getBaseEnvData();
                        mICProdmngRequest.module = ModuleConstants.VI_MODULE_MENU;
                        mICProdmngRequest.action = "changeIntelligent";
                        HashMap hashMap = new HashMap();
                        mICProdmngRequest.params = hashMap;
                        hashMap.put("intelligentEnable", String.valueOf(z));
                        mICProdmngRequest.params.put("_rpcSource_", "ALIAPP");
                        Bundle bundle = BioDetailActivity.access$300(BioDetailActivity.this).getBundle("InitParams");
                        if (bundle != null) {
                            mICProdmngRequest.params.put("tbsid", bundle.getString("tbsid"));
                            String access$400 = BioDetailActivity.access$400();
                            VerifyLogCat.i(access$400, "tbsid:" + bundle.getString("tbsid"));
                        }
                        BioDetailActivity.access$500(BioDetailActivity.this, new MICRpcServiceBiz().prodmng(mICProdmngRequest), z);
                    } catch (RpcException unused) {
                        BioDetailActivity.this.dismissProgressDialog();
                        BioDetailActivity.access$500(BioDetailActivity.this, null, z);
                        VerifyLogCat.e(BioDetailActivity.access$400(), "RpcException");
                    }
                }
            }, "sendintelligentRpc");
        }
    }

    public static /* synthetic */ void access$2000(BioDetailActivity bioDetailActivity, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1bf4a707", new Object[]{bioDetailActivity, new Boolean(z)});
        } else {
            bioDetailActivity.c(z);
        }
    }

    public static /* synthetic */ void access$2100(BioDetailActivity bioDetailActivity, final String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66f70e16", new Object[]{bioDetailActivity, str});
        } else {
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.alipay.mobile.verifyidentity.prodmanger.biopen.ui.BioDetailActivity.9
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public final void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    BioDetailActivity.access$1800(BioDetailActivity.this, str);
                    if (!BioDetailActivity.access$1300(BioDetailActivity.this)) {
                        return;
                    }
                    if (CommonConstant.FINGERPRINT_PAY.equalsIgnoreCase(BioDetailActivity.access$1100(BioDetailActivity.this))) {
                        BioDetailActivity.access$2202(BioDetailActivity.this, CommonConstant.FINGER_PAY_CLOSE_KEY);
                    } else if (CommonConstant.FACEID_PAY.equalsIgnoreCase(BioDetailActivity.access$1100(BioDetailActivity.this))) {
                        BioDetailActivity.access$2202(BioDetailActivity.this, CommonConstant.FACEID_PAY_CLOSE_KEY);
                    }
                }
            }, 2000L);
        }
    }

    public static /* synthetic */ String access$2202(BioDetailActivity bioDetailActivity, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ce78cf0d", new Object[]{bioDetailActivity, str});
        }
        bioDetailActivity.getClass();
        return str;
    }

    public static /* synthetic */ a access$2300(BioDetailActivity bioDetailActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("b30000af", new Object[]{bioDetailActivity});
        }
        return bioDetailActivity.L;
    }

    public static /* synthetic */ ImageView access$2400(BioDetailActivity bioDetailActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ImageView) ipChange.ipc$dispatch("bec056c7", new Object[]{bioDetailActivity});
        }
        return bioDetailActivity.l;
    }

    public static /* synthetic */ ImageView access$2500(BioDetailActivity bioDetailActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ImageView) ipChange.ipc$dispatch("c247f9c8", new Object[]{bioDetailActivity});
        }
        return bioDetailActivity.m;
    }

    public static /* synthetic */ Bundle access$300(BioDetailActivity bioDetailActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bundle) ipChange.ipc$dispatch("1f5d5c1c", new Object[]{bioDetailActivity});
        }
        return bioDetailActivity.v;
    }

    public static /* synthetic */ String access$400() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("60292585", new Object[0]);
        }
        return "BioDetailActivity";
    }

    public static /* synthetic */ void access$600(BioDetailActivity bioDetailActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e2d6f5", new Object[]{bioDetailActivity});
        } else {
            bioDetailActivity.d();
        }
    }

    public static /* synthetic */ String access$700(BioDetailActivity bioDetailActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e4f27a4c", new Object[]{bioDetailActivity});
        }
        return bioDetailActivity.D;
    }

    public static /* synthetic */ void access$800(BioDetailActivity bioDetailActivity, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e8b6741", new Object[]{bioDetailActivity, bundle});
            return;
        }
        Intent intent = new Intent(bioDetailActivity, BioProtoActivity.class);
        intent.putExtras(bundle);
        MicroModuleContext.getInstance().startProdActivityByContext(intent);
    }

    public static /* synthetic */ String access$900(BioDetailActivity bioDetailActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4460e24e", new Object[]{bioDetailActivity});
        }
        return bioDetailActivity.B;
    }

    public static void b(String str, String str2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84162689", new Object[]{str, str2, map});
        } else {
            VerifyLogger.getInstance().eventBehavior(str, "", "", str2, map);
        }
    }

    public static /* synthetic */ Object ipc$super(BioDetailActivity bioDetailActivity, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1504501726:
                super.onDestroy();
                return null;
            case -884160602:
                return new Boolean(super.onKeyDown(((Number) objArr[0]).intValue(), (KeyEvent) objArr[1]));
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case 514894248:
                super.attachBaseContext((Context) objArr[0]);
                return null;
            case 797441118:
                super.onPause();
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/mobile/verifyidentity/prodmanger/biopen/ui/BioDetailActivity");
        }
    }

    public final synchronized void a(final String str, final String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9378d7c", new Object[]{this, str, str2});
        } else {
            new Thread(new Runnable() { // from class: com.alipay.mobile.verifyidentity.prodmanger.biopen.ui.BioDetailActivity.11
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:46:0x00ca  */
                /* JADX WARN: Removed duplicated region for block: B:55:0x00bd A[EXC_TOP_SPLITTER, SYNTHETIC] */
                /* JADX WARN: Type inference failed for: r3v1, types: [java.net.HttpURLConnection] */
                /* JADX WARN: Type inference failed for: r3v10 */
                /* JADX WARN: Type inference failed for: r3v6 */
                /* JADX WARN: Unknown variable types count: 1 */
                @Override // java.lang.Runnable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final void run() {
                    /*
                        r7 = this;
                        r0 = 1
                        java.lang.String r1 = "关闭流异常"
                        com.android.alibaba.ip.runtime.IpChange r2 = com.alipay.mobile.verifyidentity.prodmanger.biopen.ui.BioDetailActivity.AnonymousClass11.$ipChange
                        boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
                        if (r3 == 0) goto L_0x0015
                        java.lang.String r1 = "5c510192"
                        java.lang.Object[] r0 = new java.lang.Object[r0]
                        r3 = 0
                        r0[r3] = r7
                        r2.ipc$dispatch(r1, r0)
                        return
                    L_0x0015:
                        r2 = 0
                        java.net.URL r3 = new java.net.URL     // Catch: all -> 0x007c, Exception -> 0x007f, OutOfMemoryError -> 0x009d
                        java.lang.String r4 = r2     // Catch: all -> 0x007c, Exception -> 0x007f, OutOfMemoryError -> 0x009d
                        r3.<init>(r4)     // Catch: all -> 0x007c, Exception -> 0x007f, OutOfMemoryError -> 0x009d
                        java.net.URLConnection r3 = r3.openConnection()     // Catch: all -> 0x007c, Exception -> 0x007f, OutOfMemoryError -> 0x009d
                        java.net.HttpURLConnection r3 = (java.net.HttpURLConnection) r3     // Catch: all -> 0x007c, Exception -> 0x007f, OutOfMemoryError -> 0x009d
                        java.lang.String r4 = "GET"
                        r3.setRequestMethod(r4)     // Catch: all -> 0x0053, Exception -> 0x0080, OutOfMemoryError -> 0x009e
                        r4 = 10000(0x2710, float:1.4013E-41)
                        r3.setConnectTimeout(r4)     // Catch: all -> 0x0053, Exception -> 0x0080, OutOfMemoryError -> 0x009e
                        r3.setDoInput(r0)     // Catch: all -> 0x0053, Exception -> 0x0080, OutOfMemoryError -> 0x009e
                        int r4 = r3.getResponseCode()     // Catch: all -> 0x0053, Exception -> 0x0080, OutOfMemoryError -> 0x009e
                        r5 = 200(0xc8, float:2.8E-43)
                        if (r4 != r5) goto L_0x006b
                        java.io.InputStream r2 = r3.getInputStream()     // Catch: all -> 0x0053, Exception -> 0x0080, OutOfMemoryError -> 0x009e
                        android.graphics.Bitmap r4 = android.graphics.BitmapFactory.decodeStream(r2)     // Catch: all -> 0x0053, Exception -> 0x0080, OutOfMemoryError -> 0x009e
                        android.os.Message r5 = android.os.Message.obtain()     // Catch: all -> 0x0053, Exception -> 0x0080, OutOfMemoryError -> 0x009e
                        r5.obj = r4     // Catch: all -> 0x0053, Exception -> 0x0080, OutOfMemoryError -> 0x009e
                        java.lang.String r4 = "REG_PICTURE"
                        java.lang.String r6 = r3     // Catch: all -> 0x0053, Exception -> 0x0080, OutOfMemoryError -> 0x009e
                        boolean r4 = r4.equalsIgnoreCase(r6)     // Catch: all -> 0x0053, Exception -> 0x0080, OutOfMemoryError -> 0x009e
                        if (r4 == 0) goto L_0x0055
                        r5.what = r0     // Catch: all -> 0x0053, Exception -> 0x0080, OutOfMemoryError -> 0x009e
                        goto L_0x0062
                    L_0x0053:
                        r0 = move-exception
                        goto L_0x00bb
                    L_0x0055:
                        java.lang.String r0 = "ICON"
                        java.lang.String r4 = r3     // Catch: all -> 0x0053, Exception -> 0x0080, OutOfMemoryError -> 0x009e
                        boolean r0 = r0.equalsIgnoreCase(r4)     // Catch: all -> 0x0053, Exception -> 0x0080, OutOfMemoryError -> 0x009e
                        if (r0 == 0) goto L_0x0062
                        r0 = 2
                        r5.what = r0     // Catch: all -> 0x0053, Exception -> 0x0080, OutOfMemoryError -> 0x009e
                    L_0x0062:
                        com.alipay.mobile.verifyidentity.prodmanger.biopen.ui.BioDetailActivity r0 = com.alipay.mobile.verifyidentity.prodmanger.biopen.ui.BioDetailActivity.this     // Catch: all -> 0x0053, Exception -> 0x0080, OutOfMemoryError -> 0x009e
                        com.alipay.mobile.verifyidentity.prodmanger.biopen.ui.BioDetailActivity$a r0 = com.alipay.mobile.verifyidentity.prodmanger.biopen.ui.BioDetailActivity.access$2300(r0)     // Catch: all -> 0x0053, Exception -> 0x0080, OutOfMemoryError -> 0x009e
                        r0.sendMessage(r5)     // Catch: all -> 0x0053, Exception -> 0x0080, OutOfMemoryError -> 0x009e
                    L_0x006b:
                        if (r2 == 0) goto L_0x0078
                        r2.close()     // Catch: Exception -> 0x0071
                        goto L_0x0078
                    L_0x0071:
                        java.lang.String r0 = com.alipay.mobile.verifyidentity.prodmanger.biopen.ui.BioDetailActivity.access$400()
                        com.alipay.mobile.verifyidentity.log.VerifyLogCat.e(r0, r1)
                    L_0x0078:
                        r3.disconnect()
                        return
                    L_0x007c:
                        r0 = move-exception
                        r3 = r2
                        goto L_0x00bb
                    L_0x007f:
                        r3 = r2
                    L_0x0080:
                        java.lang.String r0 = com.alipay.mobile.verifyidentity.prodmanger.biopen.ui.BioDetailActivity.access$400()     // Catch: all -> 0x0053
                        java.lang.String r4 = "加载图片异常"
                        com.alipay.mobile.verifyidentity.log.VerifyLogCat.e(r0, r4)     // Catch: all -> 0x0053
                        if (r2 == 0) goto L_0x0097
                        r2.close()     // Catch: Exception -> 0x0090
                        goto L_0x0097
                    L_0x0090:
                        java.lang.String r0 = com.alipay.mobile.verifyidentity.prodmanger.biopen.ui.BioDetailActivity.access$400()
                        com.alipay.mobile.verifyidentity.log.VerifyLogCat.e(r0, r1)
                    L_0x0097:
                        if (r3 == 0) goto L_0x00ba
                        r3.disconnect()
                        return
                    L_0x009d:
                        r3 = r2
                    L_0x009e:
                        java.lang.String r0 = com.alipay.mobile.verifyidentity.prodmanger.biopen.ui.BioDetailActivity.access$400()     // Catch: all -> 0x0053
                        java.lang.String r4 = "加载图片内存溢出异常"
                        com.alipay.mobile.verifyidentity.log.VerifyLogCat.e(r0, r4)     // Catch: all -> 0x0053
                        if (r2 == 0) goto L_0x00b5
                        r2.close()     // Catch: Exception -> 0x00ae
                        goto L_0x00b5
                    L_0x00ae:
                        java.lang.String r0 = com.alipay.mobile.verifyidentity.prodmanger.biopen.ui.BioDetailActivity.access$400()
                        com.alipay.mobile.verifyidentity.log.VerifyLogCat.e(r0, r1)
                    L_0x00b5:
                        if (r3 == 0) goto L_0x00ba
                        r3.disconnect()
                    L_0x00ba:
                        return
                    L_0x00bb:
                        if (r2 == 0) goto L_0x00c8
                        r2.close()     // Catch: Exception -> 0x00c1
                        goto L_0x00c8
                    L_0x00c1:
                        java.lang.String r2 = com.alipay.mobile.verifyidentity.prodmanger.biopen.ui.BioDetailActivity.access$400()
                        com.alipay.mobile.verifyidentity.log.VerifyLogCat.e(r2, r1)
                    L_0x00c8:
                        if (r3 == 0) goto L_0x00cd
                        r3.disconnect()
                    L_0x00cd:
                        throw r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.alipay.mobile.verifyidentity.prodmanger.biopen.ui.BioDetailActivity.AnonymousClass11.run():void");
                }
            }, "ViloadImage").start();
        }
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1eb0a9a8", new Object[]{this, context});
            return;
        }
        super.attachBaseContext(context);
        acq.B(context);
    }

    public final void c(final boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            runOnUiThread(new Runnable() { // from class: com.alipay.mobile.verifyidentity.prodmanger.biopen.ui.BioDetailActivity.13
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public final void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        BioDetailActivity.access$000(BioDetailActivity.this).setClickable(z);
                    }
                }
            });
        }
    }

    public final void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            "Y".equalsIgnoreCase(ReportHelper.getReportFlag(ReportHelper.closeShowIntelligent));
        }
    }

    public final void e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        ProdManagerResult prodManagerResult = new ProdManagerResult(str);
        BaseProdManager baseProdManager = this.w;
        if (baseProdManager != null) {
            baseProdManager.callback(prodManagerResult, null);
        } else {
            VerifyLogCat.d("BioDetailActivity", "fingerManager为空！无法回调！");
        }
        finish();
    }

    public final void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else {
            this.o.setOnClickListener(new View.OnClickListener() { // from class: com.alipay.mobile.verifyidentity.prodmanger.biopen.ui.BioDetailActivity.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                        return;
                    }
                    Bundle bundle = new Bundle();
                    bundle.putString(upx.PRODUCT_ID, BioDetailActivity.access$1100(BioDetailActivity.this));
                    bundle.putString("protoUrl", BioDetailActivity.access$1600(BioDetailActivity.this));
                    BioDetailActivity.access$800(BioDetailActivity.this, bundle);
                }
            });
        }
    }

    public boolean isDoubleClick() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5f3d16b8", new Object[]{this})).booleanValue();
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = elapsedRealtime - this.M;
        if (0 < j && j < 1000) {
            return true;
        }
        this.M = elapsedRealtime;
        return false;
    }

    public void notifyCancel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("673f922a", new Object[]{this});
            return;
        }
        VerifyLogCat.d("BioDetailActivity", "cancel");
        HashMap hashMap = new HashMap();
        hashMap.put("sceneId", this.B);
        hashMap.put(upx.PRODUCT_ID, this.y);
        b("UC-MobileIC-20180705-1", "", hashMap);
        e("1003");
    }

    @Override // com.alipay.mobile.verifyidentity.ui.BaseVerifyActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        if (getIntent() != null) {
            this.v = getIntent().getExtras();
        }
        setContentView(R.layout.bio_open_view);
        if (this.v != null) {
            this.w = MicroModuleContext.getInstance().findProManager(this.v.getString("token"));
        }
        this.b = (LinearLayout) findViewById(R.id.full_page);
        this.r = findViewById(R.id.rl_titlebar);
        this.s = findViewById(R.id.face_login_divider);
        this.q = (RelativeLayout) findViewById(R.id.face_login_titlebar);
        this.c = (TextView) findViewById(R.id.tv_title_name);
        this.d = (TextView) findViewById(R.id.tv_skip);
        this.i = (TextView) findViewById(R.id.tv_protocol);
        this.n = (LinearLayout) findViewById(R.id.liner_finger_page);
        this.e = (TextView) findViewById(R.id.tv_finger_page_guide);
        this.f = (TextView) findViewById(R.id.tv_finger_page_content);
        TextView textView = (TextView) findViewById(R.id.ing_tle);
        TextView textView2 = (TextView) findViewById(R.id.ing_des);
        this.j = (Button) findViewById(R.id.bio_open_button);
        this.k = (ImageView) findViewById(R.id.iv_finger_imageView);
        this.l = (ImageView) findViewById(R.id.iv_tpl);
        this.p = (RelativeLayout) findViewById(R.id.business_module);
        this.o = (LinearLayout) findViewById(R.id.business_info);
        this.m = (ImageView) findViewById(R.id.business_icon);
        this.g = (TextView) findViewById(R.id.business_text);
        this.h = (TextView) findViewById(R.id.bottom_content);
        this.t = (CheckBox) findViewById(R.id.business_switch);
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.ing_layout);
        Bundle bundle2 = this.v;
        VerifyLogCat.d("BioDetailActivity", "初始化生物开通页面");
        if (bundle2 != null) {
            if (bundle2.getBundle("InitParams") != null) {
                this.B = bundle2.getBundle("InitParams").getString("sceneId");
            }
            this.y = bundle2.getString(upx.PRODUCT_ID);
            this.z = bundle2.getString(yj4.PARAM_PRODUCT_TYPE);
            this.C = bundle2.getString("btnText");
            bundle2.getString("biolink");
            bundle2.getString("biolinkurl");
            this.D = bundle2.getString("gnUrl");
            this.E = bundle2.getString("gnPrefix");
            this.F = bundle2.getString("gnProl");
            if (!bundle2.containsKey("intgeable")) {
                this.I = true;
            } else {
                this.I = bundle2.getBoolean("intgeable");
            }
            this.G = bundle2.getString("intgetitle");
            this.H = bundle2.getString("intgedesc");
            if (TextUtils.isEmpty(this.y)) {
                if ("1".equalsIgnoreCase(this.z)) {
                    this.y = CommonConstant.FINGERPRINT_PAY;
                } else if ("4".equalsIgnoreCase(this.z)) {
                    this.y = CommonConstant.FACEID_PAY;
                }
            }
            String str = this.y;
            String string = bundle2.getString("pageTitle");
            if (CommonConstant.FACELOGIN.equalsIgnoreCase(str)) {
                this.r.setVisibility(8);
                this.q.setVisibility(0);
                this.s.setVisibility(0);
                this.d.setVisibility(0);
                this.c.setText(string);
                this.d.setText(getResources().getString(R.string.face_skip));
                this.d.setOnClickListener(new View.OnClickListener() { // from class: com.alipay.mobile.verifyidentity.prodmanger.biopen.ui.BioDetailActivity.12
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                        } else {
                            BioDetailActivity.this.notifyCancel();
                        }
                    }
                });
            } else {
                this.q.setVisibility(8);
                this.s.setVisibility(8);
                TitleBarAdapter titleBarAdapter = new TitleBarAdapter();
                titleBarAdapter.a(this, string, false);
                titleBarAdapter.f4342a = new TitleBarAdapter.OnLeftButtonClickListener() { // from class: com.alipay.mobile.verifyidentity.prodmanger.biopen.ui.BioDetailActivity.14
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.alipay.mobile.verifyidentity.prodmanager.TitleBarAdapter.OnLeftButtonClickListener
                    public final void a() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                        } else {
                            BioDetailActivity.this.notifyCancel();
                        }
                    }
                };
            }
            if (!TextUtils.isEmpty(bundle2.getString("tplId")) && !"BIC_REG_DEFAULT".equalsIgnoreCase(bundle2.getString("tplId"))) {
                VerifyLogCat.i("BioDetailActivity", "inter tplId");
                this.n.setVisibility(8);
                this.l.setVisibility(0);
                DisplayMetrics displayMetrics = new DisplayMetrics();
                getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
                int i = displayMetrics.widthPixels;
                ViewGroup.LayoutParams layoutParams = this.l.getLayoutParams();
                layoutParams.width = i;
                layoutParams.height = (i * 432) / 375;
                this.l.setLayoutParams(layoutParams);
                this.l.setBackgroundColor(Color.parseColor(why.DEFAULT_MASK_BACKGROUND_COLOR));
                if (!TextUtils.isEmpty(this.v.getString(vaj.KEY_BG_IMG))) {
                    a(this.v.getString(vaj.KEY_BG_IMG), "REG_PICTURE");
                }
                if ("BIC_REG_PICTURE".equalsIgnoreCase(bundle2.getString("tplId")) || "BIS_REG_PICTURE".equalsIgnoreCase(bundle2.getString("tplId"))) {
                    this.b.setBackgroundColor(Color.parseColor("#F5F5F9"));
                    this.j.setVisibility(0);
                    if (TextUtils.isEmpty(bundle2.getString("btnNormalColor")) || TextUtils.isEmpty(bundle2.getString("btnPressedColor"))) {
                        this.j.setBackgroundResource(R.drawable.au_button_open);
                    } else {
                        this.j.setBackgroundColor(Color.parseColor(bundle2.getString("btnNormalColor")));
                        final String string2 = bundle2.getString("btnNormalColor");
                        final String string3 = bundle2.getString("btnPressedColor");
                        this.j.setOnTouchListener(new View.OnTouchListener() { // from class: com.alipay.mobile.verifyidentity.prodmanger.biopen.ui.BioDetailActivity.1
                            public static volatile transient /* synthetic */ IpChange $ipChange;

                            @Override // android.view.View.OnTouchListener
                            public final boolean onTouch(View view, MotionEvent motionEvent) {
                                IpChange ipChange2 = $ipChange;
                                if (ipChange2 instanceof IpChange) {
                                    return ((Boolean) ipChange2.ipc$dispatch("d4aa3aa4", new Object[]{this, view, motionEvent})).booleanValue();
                                }
                                if (view.getId() == R.id.bio_open_button) {
                                    if (motionEvent.getAction() == 1) {
                                        BioDetailActivity.access$000(BioDetailActivity.this).setBackgroundColor(Color.parseColor(string2));
                                    }
                                    if (motionEvent.getAction() == 0) {
                                        BioDetailActivity.access$000(BioDetailActivity.this).setBackgroundColor(Color.parseColor(string3));
                                    }
                                }
                                return false;
                            }
                        });
                    }
                    if (!TextUtils.isEmpty(bundle2.getString("bottomContent"))) {
                        this.j.setText(bundle2.getString("bottomContent"));
                    } else {
                        this.j.setText(getResources().getString(R.string.bio_open));
                    }
                    this.j.setTextColor(getResources().getColor(R.color.colorWhite));
                    bundle2.getString("protocol_url");
                    g();
                } else if ("BIS_FACELOGIN_REG_PICTURE".equalsIgnoreCase(bundle2.getString("tplId"))) {
                    this.b.setBackgroundColor(Color.parseColor(why.DEFAULT_MASK_BACKGROUND_COLOR));
                    if (bundle2.getBoolean("sliderVisible")) {
                        this.p.setVisibility(0);
                        this.o.setVisibility(0);
                        String string4 = bundle2.getString("text");
                        String string5 = bundle2.getString("highlight");
                        this.A = bundle2.getString("url");
                        a(bundle2.getString("icon"), "ICON");
                        if ("disable".equalsIgnoreCase(bundle2.getString("status"))) {
                            this.t.setVisibility(8);
                            this.g.setText(string4);
                            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
                            layoutParams2.addRule(13);
                            this.o.setLayoutParams(layoutParams2);
                            this.o.setClickable(false);
                        } else {
                            this.t.setVisibility(0);
                            if (!TextUtils.isEmpty(string4) && !TextUtils.isEmpty(string5) && string4.contains(string5)) {
                                int indexOf = string4.indexOf(string5);
                                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string4);
                                spannableStringBuilder.setSpan(new ForegroundColorSpan(Color.parseColor("#1677ff")), indexOf, string5.length() + indexOf, 33);
                                this.g.setText(spannableStringBuilder);
                            }
                            if ("open".equalsIgnoreCase(bundle2.getString("status"))) {
                                this.t.setChecked(true);
                                this.x = "open";
                            } else if ("close".equalsIgnoreCase(bundle2.getString("status"))) {
                                this.t.setChecked(false);
                                this.x = "close";
                            }
                            this.t.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.alipay.mobile.verifyidentity.prodmanger.biopen.ui.BioDetailActivity.3
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                                public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                                    IpChange ipChange2 = $ipChange;
                                    if (ipChange2 instanceof IpChange) {
                                        ipChange2.ipc$dispatch("d2d88ae", new Object[]{this, compoundButton, new Boolean(z)});
                                    } else if (z) {
                                        BioDetailActivity.access$1202(BioDetailActivity.this, "open");
                                    } else {
                                        BioDetailActivity.access$1202(BioDetailActivity.this, "close");
                                    }
                                }
                            });
                            g();
                        }
                    }
                    this.j.setVisibility(0);
                    this.h.setVisibility(0);
                    if (TextUtils.isEmpty(bundle2.getString("bottomContent"))) {
                        this.h.setText(getResources().getString(R.string.face_bottomContent));
                    } else {
                        this.h.setText(bundle2.getString("bottomContent"));
                    }
                    this.j.setText(getResources().getString(R.string.face_login_open));
                }
                this.u = false;
            } else if (TextUtils.isEmpty(bundle2.getString("code")) || bundle2.getBoolean("isViewable")) {
                VerifyLogCat.i("BioDetailActivity", "inter other");
                this.b.setBackgroundColor(Color.parseColor("#F5F5F9"));
                if (this.v.getBoolean("isViewable") && "close".equals(this.v.get("productStatus"))) {
                    VerifyLogCat.i("BioDetailActivity", "setOpenPage");
                    f();
                    this.j.setBackgroundResource(R.drawable.au_button_open);
                    if (!TextUtils.isEmpty(this.C)) {
                        this.j.setText(this.C);
                    } else {
                        this.j.setText(getResources().getString(R.string.bio_open));
                    }
                    this.j.setTextColor(getResources().getColor(R.color.button_blue));
                    g();
                    this.u = false;
                } else if (this.v.getBoolean("isViewable") && "open".equals(this.v.get("productStatus"))) {
                    VerifyLogCat.i("BioDetailActivity", "setClosedPage");
                    f();
                    this.j.setBackgroundResource(R.drawable.au_button_close);
                    this.j.setTextColor(getResources().getColor(R.color.button_red));
                    LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) this.j.getLayoutParams();
                    layoutParams3.setMargins(42, 90, 42, 0);
                    this.j.setLayoutParams(layoutParams3);
                    if (!TextUtils.isEmpty(this.C)) {
                        this.j.setText(this.C);
                    } else if (CommonConstant.FINGERPRINT_PAY.equalsIgnoreCase(this.y)) {
                        this.j.setText(getResources().getString(R.string.finger_close));
                    } else if (CommonConstant.FACEID_PAY.equalsIgnoreCase(this.y)) {
                        this.j.setText(getResources().getString(R.string.face_close));
                    }
                    this.u = true;
                }
                if (TextUtils.isEmpty(this.D) || TextUtils.isEmpty(this.F)) {
                    this.i.setVisibility(8);
                } else {
                    if (TextUtils.isEmpty(this.E)) {
                        this.E = "";
                    }
                    String str2 = this.E + this.F;
                    int indexOf2 = str2.indexOf(this.F);
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(str2);
                    spannableStringBuilder2.setSpan(new ForegroundColorSpan(Color.parseColor("#1677ff")), indexOf2, this.F.length() + indexOf2, 33);
                    this.i.setText(str2);
                    this.i.setText(spannableStringBuilder2);
                    this.i.setOnClickListener(new View.OnClickListener() { // from class: com.alipay.mobile.verifyidentity.prodmanger.biopen.ui.BioDetailActivity.19
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            IpChange ipChange2 = $ipChange;
                            if (ipChange2 instanceof IpChange) {
                                ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                            } else if (!TextUtils.isEmpty(BioDetailActivity.access$700(BioDetailActivity.this)) && !BioDetailActivity.this.isDoubleClick()) {
                                Bundle bundle3 = new Bundle();
                                bundle3.putString("bicListUrl", BioDetailActivity.access$700(BioDetailActivity.this));
                                BioDetailActivity.access$800(BioDetailActivity.this, bundle3);
                            }
                        }
                    });
                    this.i.setVisibility(0);
                }
                d();
            } else {
                VerifyLogCat.i("BioDetailActivity", "inter code and not viewable");
                this.b.setBackgroundColor(Color.parseColor("#F5F5F9"));
                if ("1".equalsIgnoreCase(this.z)) {
                    this.k.setBackgroundResource(R.drawable.vi_finger_open_style);
                } else if ("4".equalsIgnoreCase(this.z)) {
                    this.k.setBackgroundResource(R.drawable.vi_face_open_style);
                } else {
                    this.k.setBackgroundResource(R.drawable.vi_finger_error);
                }
                this.e.setText(bundle2.getString("pageGuide"));
                this.f.setText(bundle2.getString(upx.PAGE_CONTENT));
            }
        }
        final Bundle bundle3 = this.v;
        VerifyLogCat.i("BioDetailActivity", "bioDetail code:" + bundle3.getString("code"));
        this.j.setOnClickListener(new View.OnClickListener() { // from class: com.alipay.mobile.verifyidentity.prodmanger.biopen.ui.BioDetailActivity.20
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AuthenticatorManager instance;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                Bundle bundle4 = bundle3.getBundle("InitParams");
                String string6 = bundle3.getString("module");
                String string7 = bundle3.getString("token");
                String string8 = bundle3.getString("action");
                Bundle bundle5 = new Bundle();
                bundle5.putString("sceneId", BioDetailActivity.access$900(BioDetailActivity.this));
                bundle5.putString("bizId", bundle4.getString("bizId"));
                bundle5.putString("tbsid", bundle4.getString("tbsid"));
                bundle5.putString(yj4.PARAM_PRODUCT_TYPE, BioDetailActivity.access$1000(BioDetailActivity.this));
                if (CommonConstant.FACELOGIN.equalsIgnoreCase(BioDetailActivity.access$1100(BioDetailActivity.this))) {
                    bundle5.putString("sliderStatus", BioDetailActivity.access$1200(BioDetailActivity.this));
                    bundle5.putString(ModuleConstants.VI_MODULE_BIO_METAINFO, EnvInfoUtil.getBioMetaInfo());
                } else if (!TextUtils.isEmpty(bundle4.getString("userId")) && (instance = AuthenticatorManager.getInstance(BioDetailActivity.this)) != null) {
                    bundle5.putString("secData", instance.getSecData(bundle4.getString("userId")));
                }
                if (BioDetailActivity.access$1300(BioDetailActivity.this)) {
                    VerifyLogCat.d(BioDetailActivity.access$400(), "进行关闭");
                    BioDetailActivity.access$1400(BioDetailActivity.this, string7, string6, string8, bundle5);
                    return;
                }
                BioDetailActivity.access$1500(BioDetailActivity.this, "open", string7, string6, string8, bundle5, bundle3);
            }
        });
        this.J = new BroadcastReceiver() { // from class: com.alipay.mobile.verifyidentity.prodmanger.biopen.ui.BioDetailActivity.10
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass10 r2, String str3, Object... objArr) {
                str3.hashCode();
                int hashCode = str3.hashCode();
                throw new InstantReloadException("String switch could not find '" + str3 + "' with hashcode " + hashCode + " in com/alipay/mobile/verifyidentity/prodmanger/biopen/ui/BioDetailActivity$10");
            }

            @Override // android.content.BroadcastReceiver
            public final void onReceive(Context context, Intent intent) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                    return;
                }
                String action = intent.getAction();
                if (ExtTransAppVisibleReceiver.FRAMEWORK_ACTIVITY_USERLEAVEHINT.equalsIgnoreCase(action) || "android.intent.action.SCREEN_OFF".equalsIgnoreCase(action)) {
                    BioDetailActivity.access$2000(BioDetailActivity.this, true);
                }
            }
        };
        this.K = LocalBroadcastManager.getInstance(this);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(ExtTransAppVisibleReceiver.FRAMEWORK_ACTIVITY_USERLEAVEHINT);
        this.K.registerReceiver(this.J, intentFilter);
        IntentFilter intentFilter2 = new IntentFilter();
        intentFilter2.addAction("android.intent.action.SCREEN_OFF");
        registerReceiver(this.J, intentFilter2);
    }

    @Override // android.app.Activity
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        MicroModuleContext.getInstance().onDestroyProManager();
        LocalBroadcastManager localBroadcastManager = this.K;
        if (localBroadcastManager != null) {
            localBroadcastManager.unregisterReceiver(this.J);
            unregisterReceiver(this.J);
        }
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cb4cc7a6", new Object[]{this, new Integer(i), keyEvent})).booleanValue();
        }
        if (i != 4) {
            return super.onKeyDown(i, keyEvent);
        }
        notifyCancel();
        return true;
    }

    @Override // com.alipay.mobile.verifyidentity.ui.BaseVerifyActivity, android.app.Activity
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        super.onPause();
        if (CommonConstant.FACEID_PAY.equalsIgnoreCase(this.y) || CommonConstant.FINGERPRINT_PAY.equalsIgnoreCase(this.y)) {
            try {
                AuthenticatorManager.getInstance(this).stopAuth(this, Integer.valueOf(this.z).intValue());
                c(true);
            } catch (Throwable th) {
                VerifyLogCat.d("BioDetailActivity", th.getMessage());
            }
        }
    }

    public final void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        this.b.setBackgroundColor(Color.parseColor("#F5F5F5"));
        if (CommonConstant.FINGERPRINT_PAY.equalsIgnoreCase(this.y)) {
            this.k.setBackgroundResource(R.drawable.vi_finger_open_style);
        } else if (CommonConstant.FACEID_PAY.equalsIgnoreCase(this.y)) {
            this.k.setBackgroundResource(R.drawable.vi_face_open_style);
        }
        this.e.setText(this.v.getString("pageGuide"));
        this.f.setText(this.v.getString(upx.PAGE_CONTENT));
        this.j.setVisibility(0);
    }

    public static /* synthetic */ void access$500(BioDetailActivity bioDetailActivity, MICProdmngResponse mICProdmngResponse, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8614db36", new Object[]{bioDetailActivity, mICProdmngResponse, new Boolean(z)});
            return;
        }
        bioDetailActivity.dismissProgressDialog();
        if (mICProdmngResponse != null && mICProdmngResponse.success) {
            Map<String, String> map = mICProdmngResponse.data;
            if (map != null) {
                bioDetailActivity.G = map.get("intelligentTitle");
                bioDetailActivity.H = map.get("intelligentDesc");
            }
            if (TextUtils.isEmpty(bioDetailActivity.G)) {
                bioDetailActivity.G = "";
            }
            if (TextUtils.isEmpty(bioDetailActivity.H)) {
                bioDetailActivity.H = "";
            }
            if (z) {
                bioDetailActivity.I = true;
                bioDetailActivity.toast(bioDetailActivity.getResources().getString(R.string.ing_open_success), R.drawable.open_success, 0);
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.alipay.mobile.verifyidentity.prodmanger.biopen.ui.BioDetailActivity.17
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // java.lang.Runnable
                    public final void run() {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        } else {
                            BioDetailActivity.access$600(BioDetailActivity.this);
                        }
                    }
                });
                return;
            }
            bioDetailActivity.I = false;
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.alipay.mobile.verifyidentity.prodmanger.biopen.ui.BioDetailActivity.18
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public final void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        BioDetailActivity.access$600(BioDetailActivity.this);
                    }
                }
            });
            bioDetailActivity.toast(bioDetailActivity.getResources().getString(R.string.ing_close_success), R.drawable.open_success, 0);
        } else if (z) {
            bioDetailActivity.toast(bioDetailActivity.getResources().getString(R.string.ing_open_fail), R.drawable.warning, 0);
        } else {
            bioDetailActivity.toast(bioDetailActivity.getResources().getString(R.string.ing_close_fail), R.drawable.warning, 0);
        }
    }

    public static /* synthetic */ void access$1500(BioDetailActivity bioDetailActivity, String str, String str2, String str3, String str4, Bundle bundle, Bundle bundle2) {
        String str5;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("220fe2f", new Object[]{bioDetailActivity, str, str2, str3, str4, bundle, bundle2});
            return;
        }
        VerifyLogCat.d("BioDetailActivity", "进行开通:");
        String string = bundle2.getString("code");
        String string2 = bundle2.getString("alertText");
        if (bundle != null) {
            bundle.putString("alertText", string2);
        }
        VerifyLogCat.i("BioDetailActivity", "开通Code:" + string);
        if ("not_exist_bic_feature".equalsIgnoreCase(string)) {
            Bundle bundle3 = new Bundle();
            bundle3.putBoolean(CommonConstant.alertTextColor, true);
            if ("1".equalsIgnoreCase(bioDetailActivity.z)) {
                str5 = MicroModuleContext.getInstance().getContext().getResources().getString(R.string.finger_guide_print);
            } else if ("4".equalsIgnoreCase(bioDetailActivity.z)) {
                str5 = MicroModuleContext.getInstance().getContext().getResources().getString(R.string.face_guide_print);
            } else {
                str5 = "";
            }
            MicroModuleContext.getInstance().alert(null, str5, MicroModuleContext.getInstance().getContext().getResources().getString(R.string.finger_register), new DialogInterface.OnClickListener() { // from class: com.alipay.mobile.verifyidentity.prodmanger.biopen.ui.BioDetailActivity.6
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                        return;
                    }
                    AuthenticatorManager.getInstance(BioDetailActivity.this).startBioManager(Integer.valueOf(BioDetailActivity.access$1000(BioDetailActivity.this)).intValue());
                    BioDetailActivity.access$1700(BioDetailActivity.this, "UC-MobileIC-20190425-5", "", new HashMap());
                    BioDetailActivity.access$1800(BioDetailActivity.this, "1003");
                }
            }, MicroModuleContext.getInstance().getContext().getResources().getString(R.string.finger_cancel), new DialogInterface.OnClickListener() { // from class: com.alipay.mobile.verifyidentity.prodmanger.biopen.ui.BioDetailActivity.7
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                        return;
                    }
                    BioDetailActivity.access$1800(BioDetailActivity.this, "1003");
                    BioDetailActivity.access$1700(BioDetailActivity.this, "UC-MobileIC-20190425-6", "", new HashMap());
                }
            }, bundle3);
            return;
        }
        bioDetailActivity.c(false);
        BioOpenHandler bioOpenHandler = new BioOpenHandler();
        Bundle bundle4 = new Bundle();
        bundle4.putString(upx.PRODUCT_ID, bioDetailActivity.y);
        bundle4.putString("status", str);
        bundle4.putString("token", str2);
        bundle4.putString("module", str3);
        bundle4.putString("action", str4);
        bundle4.putBundle("extParams", bundle);
        bioOpenHandler.a(bioDetailActivity, bundle4, new BioOpenHandler.BioOpenCallback() { // from class: com.alipay.mobile.verifyidentity.prodmanger.biopen.ui.BioDetailActivity.8
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alipay.mobile.verifyidentity.prodmanger.biopen.handler.BioOpenHandler.BioOpenCallback
            public final void a(String str6, boolean z) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8123ece2", new Object[]{this, str6, new Boolean(z)});
                    return;
                }
                String access$400 = BioDetailActivity.access$400();
                VerifyLogCat.i(access$400, "DetailCode：" + str6);
                BioDetailActivity.access$1900(BioDetailActivity.this, str6);
                if (z) {
                    BioDetailActivity.access$2000(BioDetailActivity.this, true);
                } else {
                    BioDetailActivity.access$2100(BioDetailActivity.this, str6);
                }
            }
        });
    }
}
