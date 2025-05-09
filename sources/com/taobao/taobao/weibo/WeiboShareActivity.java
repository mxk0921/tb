package com.taobao.taobao.weibo;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;
import com.alibaba.ability.localization.Localization;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.tools.ir.runtime.ApplicationInvoker;
import com.sina.weibo.sdk.common.UiError;
import com.sina.weibo.sdk.openapi.IWBAPI;
import com.sina.weibo.sdk.share.WbShareCallback;
import com.taobao.share.multiapp.ShareBizAdapter;
import com.taobao.tao.TaobaoApplication;
import com.taobao.tao.log.TLog;
import com.taobao.taobao.R;
import com.ut.share.ShareApi;
import com.ut.share.ShareAppRegister;
import com.ut.share.SharePlatform;
import com.ut.share.business.ShareBusiness;
import com.ut.share.data.ShareData;
import com.ut.share.executor.ExecutorFactory;
import com.ut.share.executor.WeiboExecutor;
import com.ut.share.sdk.ShareWeiboController;
import java.util.HashMap;
import java.util.Map;
import tb.acq;
import tb.gpd;
import tb.rb;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class WeiboShareActivity extends Activity {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                WeiboShareActivity.this.finish();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements WbShareCallback {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Map f12966a;

        public b(Map map) {
            this.f12966a = map;
        }

        @Override // com.sina.weibo.sdk.share.WbShareCallback
        public void onCancel() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("379d4540", new Object[]{this});
                return;
            }
            Toast.makeText(WeiboShareActivity.this, Localization.q(R.string.taobao_app_1010_1_18292), 1).show();
            this.f12966a.put(rb.RESULT_KEY, "cancel");
            ShareBusiness.getInstance().onShareFinished(this.f12966a);
        }

        @Override // com.sina.weibo.sdk.share.WbShareCallback
        public void onComplete() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5cbffcbf", new Object[]{this});
                return;
            }
            Toast.makeText(WeiboShareActivity.this, Localization.q(R.string.share_finish_tip), 1).show();
            this.f12966a.put(rb.RESULT_KEY, "success");
            ShareBusiness.getInstance().onShareFinished(this.f12966a);
        }

        @Override // com.sina.weibo.sdk.share.WbShareCallback
        public void onError(UiError uiError) {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2b582a4d", new Object[]{this, uiError});
                return;
            }
            Toast.makeText(WeiboShareActivity.this, Localization.q(R.string.taobao_app_1010_1_18295), 1).show();
            this.f12966a.put(rb.RESULT_KEY, "fail");
            Map map = this.f12966a;
            if (uiError == null) {
                str = "";
            } else {
                str = uiError.errorMessage;
            }
            map.put("errorMessage", str);
            ShareBusiness.getInstance().onShareFinished(this.f12966a);
        }
    }

    static {
        t2o.a(664797299);
    }

    public WeiboShareActivity() {
        ApplicationInvoker.getInstance("com.taobao.clipboard_share").invoke("com.taobao.share.core.ContactsApplication", TaobaoApplication.sApplication);
    }

    public static /* synthetic */ Object ipc$super(WeiboShareActivity weiboShareActivity, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -641568046) {
            super.onCreate((Bundle) objArr[0]);
            return null;
        } else if (hashCode == 514894248) {
            super.attachBaseContext((Context) objArr[0]);
            return null;
        } else if (hashCode == 1257714799) {
            super.onActivityResult(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), (Intent) objArr[2]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/taobao/weibo/WeiboShareActivity");
        }
    }

    public final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e96fc0a", new Object[]{this});
            return;
        }
        ExecutorFactory instance = ExecutorFactory.getInstance();
        SharePlatform sharePlatform = SharePlatform.SinaWeibo;
        WeiboExecutor weiboExecutor = (WeiboExecutor) instance.findExecutor(sharePlatform);
        if (weiboExecutor == null || weiboExecutor.getWeibo() == null) {
            gpd shareChannel = ShareBizAdapter.getInstance().getShareChannel();
            ShareAppRegister.registerWeibo(shareChannel.d(), shareChannel.e());
            ShareApi.getInstance().canShare(this, sharePlatform);
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

    public final void b(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81029d40", new Object[]{this, intent});
            return;
        }
        WeiboExecutor weiboExecutor = (WeiboExecutor) ExecutorFactory.getInstance().findExecutor(SharePlatform.SinaWeibo);
        IWBAPI iwbapi = null;
        ShareWeiboController weibo = weiboExecutor == null ? null : weiboExecutor.getWeibo();
        if (weibo != null) {
            iwbapi = weibo.getWeiboShareAPI();
        }
        if (iwbapi != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("platform", "2");
            iwbapi.doResultIntent(intent, new b(hashMap));
        }
    }

    public final void c(ShareData shareData) {
        ShareWeiboController shareWeiboController;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42199526", new Object[]{this, shareData});
            return;
        }
        try {
            WeiboExecutor weiboExecutor = (WeiboExecutor) ExecutorFactory.getInstance().findExecutor(SharePlatform.SinaWeibo);
            if (weiboExecutor == null) {
                shareWeiboController = null;
            } else {
                shareWeiboController = weiboExecutor.getWeibo();
            }
            if (shareWeiboController == null) {
                finish();
                return;
            }
            String link = shareData.getLink();
            String imagePath = shareData.getImagePath();
            String text = shareData.getText();
            if (!TextUtils.isEmpty(link)) {
                shareData.setType(ShareData.MessageType.WEBPAGE);
            } else if (!TextUtils.isEmpty(imagePath)) {
                shareData.setType(ShareData.MessageType.IMAGE);
            } else if (!TextUtils.isEmpty(text)) {
                shareData.setType(ShareData.MessageType.TEXT);
            }
            shareWeiboController.realShare(this, shareData);
        } catch (RuntimeException unused) {
            Toast.makeText(getApplicationContext(), Localization.q(R.string.taobao_app_1010_1_18295), 1).show();
            TLog.logi("WeiboShareActivity", "onCreate.Exception call finish");
            finish();
        }
    }

    @Override // android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        super.onActivityResult(i, i2, intent);
        b(intent);
        finish();
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        requestWindowFeature(1);
        super.onCreate(bundle);
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setGravity(83);
        linearLayout.setBackgroundResource(17170445);
        linearLayout.setOnClickListener(new a());
        setContentView(linearLayout);
        ShareData shareData = (ShareData) getIntent().getParcelableExtra("shareData");
        if (shareData == null) {
            finish();
            return;
        }
        a();
        c(shareData);
    }
}
