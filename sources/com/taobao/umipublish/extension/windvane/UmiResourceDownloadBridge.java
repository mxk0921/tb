package com.taobao.umipublish.extension.windvane;

import android.content.Context;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.text.TextUtils;
import com.alibaba.ability.localization.Localization;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.weex.common.Constants;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import tb.cg9;
import tb.ebg;
import tb.gl4;
import tb.i6a;
import tb.i8g;
import tb.ixp;
import tb.k0n;
import tb.kpw;
import tb.nsw;
import tb.odg;
import tb.onf;
import tb.rv7;
import tb.t2o;
import tb.tu7;
import tb.upl;
import tb.zu7;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class UmiResourceDownloadBridge extends kpw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String ACTION_DOWNLOAD_RESOURCE = "downResource";
    private static final String DEFAULT_SUFFIX = ".mp4";
    public static final String PLUGIN_NAME = "XGCResourceDownloadBridge";
    private static final String TAG = "XGCResourceDownloadBridge";
    private static Map<String, String> sDownloadedCache = new HashMap();
    private k0n mProgressDialog;

    static {
        t2o.a(944767090);
    }

    public static /* synthetic */ void access$000(UmiResourceDownloadBridge umiResourceDownloadBridge, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f118cb76", new Object[]{umiResourceDownloadBridge, new Integer(i)});
        } else {
            umiResourceDownloadBridge.updateDialogProgress(i);
        }
    }

    public static /* synthetic */ void access$100(UmiResourceDownloadBridge umiResourceDownloadBridge, String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b3983f", new Object[]{umiResourceDownloadBridge, str, str2, wVCallBackContext});
        } else {
            umiResourceDownloadBridge.onDownloadFailed(str, str2, wVCallBackContext);
        }
    }

    public static /* synthetic */ Map access$200() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("e220286e", new Object[0]);
        }
        return sDownloadedCache;
    }

    public static /* synthetic */ void access$300(UmiResourceDownloadBridge umiResourceDownloadBridge, String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("236af7c1", new Object[]{umiResourceDownloadBridge, str, str2, wVCallBackContext});
        } else {
            umiResourceDownloadBridge.onDownloadSuccess(str, str2, wVCallBackContext);
        }
    }

    private zu7 buildDownloadRequest(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (zu7) ipChange.ipc$dispatch("271df285", new Object[]{this, str, str2});
        }
        zu7 zu7Var = new zu7();
        zu7Var.b.g = getDownloadStoreDir(this.mContext);
        zu7Var.b.f29547a = "guangguang";
        onf onfVar = new onf();
        onfVar.f25507a = str;
        onfVar.d = i6a.b() + str2;
        zu7Var.f33016a.add(onfVar);
        return zu7Var;
    }

    private void downloadResourceWithURL(String str, String str2, final WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2ed808b", new Object[]{this, str, str2, wVCallBackContext});
            return;
        }
        String str3 = sDownloadedCache.get(str);
        if (TextUtils.isEmpty(str3) || !cg9.l(str3)) {
            final int b = rv7.e().b(buildDownloadRequest(str, str2), new tu7() { // from class: com.taobao.umipublish.extension.windvane.UmiResourceDownloadBridge.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // tb.tu7
                public void onDownloadError(String str4, int i, String str5) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("cc722e3b", new Object[]{this, str4, new Integer(i), str5});
                        return;
                    }
                    odg.c("XGCResourceDownloadBridge", "downloadResource.onDownloadError. errorCode:" + i + ", errorMsg:" + str5);
                    UmiResourceDownloadBridge.access$100(UmiResourceDownloadBridge.this, String.valueOf(i), str5, wVCallBackContext);
                }

                @Override // tb.tu7
                public void onDownloadFinish(String str4, String str5) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("43d7a315", new Object[]{this, str4, str5});
                        return;
                    }
                    odg.d("XGCResourceDownloadBridge", "downloadResource.onDownloadFinish. url:" + str4 + ", filePath:" + str5);
                    UmiResourceDownloadBridge.access$200().put(str4, str5);
                    UmiResourceDownloadBridge.access$300(UmiResourceDownloadBridge.this, str4, str5, wVCallBackContext);
                }

                @Override // tb.tu7
                public void onDownloadProgress(int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("49af8908", new Object[]{this, new Integer(i)});
                    } else {
                        UmiResourceDownloadBridge.access$000(UmiResourceDownloadBridge.this, i);
                    }
                }

                @Override // tb.tu7
                public void onDownloadStateChange(String str4, boolean z) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("98fdb789", new Object[]{this, str4, new Boolean(z)});
                    }
                }

                @Override // tb.tu7
                public void onFinish(boolean z) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("6a109f1b", new Object[]{this, new Boolean(z)});
                        return;
                    }
                    odg.d("XGCResourceDownloadBridge", "downloadResource.onFinish. b:" + z);
                }

                @Override // tb.tu7
                public void onNetworkLimit(int i, upl uplVar, tu7.a aVar) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("fcf51783", new Object[]{this, new Integer(i), uplVar, aVar});
                    }
                }
            });
            showProgressDialog(new Runnable() { // from class: com.taobao.umipublish.extension.windvane.UmiResourceDownloadBridge.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    rv7.e().a(b);
                    UmiResourceDownloadBridge.access$100(UmiResourceDownloadBridge.this, "-1", "canceled_by_user", wVCallBackContext);
                }
            });
            return;
        }
        onDownloadSuccess(str, str3, wVCallBackContext);
    }

    public static String getDownloadStoreDir(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ee66c429", new Object[]{context});
        }
        File externalFilesDir = context.getExternalFilesDir(null);
        if (externalFilesDir == null || !externalFilesDir.exists()) {
            return null;
        }
        String str = externalFilesDir.getAbsolutePath() + i8g.LC_TEMP_DIR;
        File file = new File(str);
        if (file.exists() || file.mkdirs()) {
            return str;
        }
        return null;
    }

    private void initLoadingDialog() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54fe9cfb", new Object[]{this});
        } else if (this.mProgressDialog == null) {
            this.mProgressDialog = new k0n(this.mContext, null);
        }
    }

    public static /* synthetic */ Object ipc$super(UmiResourceDownloadBridge umiResourceDownloadBridge, String str, Object... objArr) {
        if (str.hashCode() == -1504501726) {
            super.onDestroy();
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/umipublish/extension/windvane/UmiResourceDownloadBridge");
    }

    private void onDownloadFailed(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b07c0e7c", new Object[]{this, str, str2, wVCallBackContext});
            return;
        }
        ebg.l(this.mContext, Localization.q(R.string.gg_pub_download_failed_retry));
        hideProcessingDialog();
        nsw nswVar = new nsw("HY_FAILED");
        nswVar.b("errorCode", str);
        nswVar.b("errorMsg", str2);
        wVCallBackContext.error(nswVar);
    }

    private void onDownloadSuccess(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a176654", new Object[]{this, str, str2, wVCallBackContext});
            return;
        }
        hideProcessingDialog();
        nsw nswVar = new nsw("HY_SUCCESS");
        nswVar.b("remoteUrl", str);
        nswVar.b(gl4.CONFIG_LOCAL_PATH, str2);
        wVCallBackContext.success(nswVar);
    }

    private void showProgressDialog(final Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("839aadb7", new Object[]{this, runnable});
            return;
        }
        initLoadingDialog();
        this.mProgressDialog.show();
        this.mProgressDialog.h(Localization.q(R.string.gg_pub_downloading_please_wait));
        this.mProgressDialog.c(true);
        this.mProgressDialog.f(new ixp(this, this.mProgressDialog) { // from class: com.taobao.umipublish.extension.windvane.UmiResourceDownloadBridge.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
                if (str.hashCode() == 61372776) {
                    super.d();
                    return null;
                }
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/umipublish/extension/windvane/UmiResourceDownloadBridge$1");
            }

            @Override // tb.ixp, tb.qob
            public void d() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3a87968", new Object[]{this});
                    return;
                }
                super.d();
                Runnable runnable2 = runnable;
                if (runnable2 != null) {
                    runnable2.run();
                }
            }
        });
    }

    private void updateDialogProgress(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3acf95e", new Object[]{this, new Integer(i)});
        } else {
            this.mProgressDialog.g(i);
        }
    }

    @Override // tb.kpw
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if (!TextUtils.equals(str, ACTION_DOWNLOAD_RESOURCE)) {
            return false;
        }
        downloadResource(str2, wVCallBackContext);
        return true;
    }

    public void hideProcessingDialog() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9fb09a4", new Object[]{this});
            return;
        }
        k0n k0nVar = this.mProgressDialog;
        if (k0nVar != null) {
            k0nVar.dismiss();
        }
    }

    private void downloadResource(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38447884", new Object[]{this, str, wVCallBackContext});
            return;
        }
        JSONObject parseObject = JSON.parseObject(str);
        if (parseObject == null || !parseObject.containsKey("url")) {
            odg.c("XGCResourceDownloadBridge", "downloadResource.error: invalid params");
            wVCallBackContext.error();
            return;
        }
        String string = parseObject.getString(Constants.Name.SUFFIX);
        if (TextUtils.isEmpty(string)) {
            string = ".mp4";
        }
        downloadResourceWithURL(parseObject.getString("url"), string, wVCallBackContext);
    }

    @Override // tb.kpw, com.uc.webview.export.extension.IEmbedViewContainer.OnStateChangedListener
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        odg.d("XGCResourceDownloadBridge", "onDestroy.");
        this.mProgressDialog = null;
    }
}
