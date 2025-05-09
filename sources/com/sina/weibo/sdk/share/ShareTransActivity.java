package com.sina.weibo.sdk.share;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import com.sina.weibo.sdk.api.WeiboMultiMessage;
import com.sina.weibo.sdk.b.a;
import com.sina.weibo.sdk.b.c;
import com.sina.weibo.sdk.b.d;
import com.sina.weibo.sdk.b.e;
import java.util.ArrayList;
import java.util.Iterator;
import tb.acq;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class ShareTransActivity extends BaseActivity {
    private Intent t;
    private FrameLayout u;
    private d v;
    private String w;
    private Handler x = new Handler(Looper.getMainLooper()) { // from class: com.sina.weibo.sdk.share.ShareTransActivity.1
        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            super.handleMessage(message);
            if (message.what == 1) {
                Object obj = message.obj;
                if (obj instanceof Intent) {
                    ShareTransActivity.this.b((Intent) obj);
                    return;
                }
            }
            ShareTransActivity.this.j();
        }
    };

    static {
        t2o.a(988807238);
    }

    private static void c(Intent intent) {
        if (intent != null && intent.getFlags() != 0) {
            int flags = intent.getFlags();
            String binaryString = Integer.toBinaryString(flags);
            ArrayList arrayList = new ArrayList();
            arrayList.add(64);
            arrayList.add(128);
            arrayList.add(1);
            arrayList.add(2);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                flags &= ~((Integer) it.next()).intValue();
            }
            c.a("WBShareTag", "clear flags: " + binaryString + "->" + Integer.toBinaryString(flags));
            intent.setFlags(flags);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        FrameLayout frameLayout = this.u;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
        Handler handler = this.x;
        if (handler != null) {
            handler.removeMessages(0);
            this.x = null;
        }
        try {
            Intent intent = new Intent();
            Bundle bundle = new Bundle();
            bundle.putInt("_weibo_resp_errcode", 1);
            intent.putExtras(bundle);
            setResult(-1, intent);
        } catch (Exception e) {
            e.printStackTrace();
        }
        finish();
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        acq.B(context);
    }

    @Override // android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        c.a("WBShareTag", "onActivityResult. Means share result coming!");
        Handler handler = this.x;
        if (handler == null) {
            return;
        }
        if (i2 == -1) {
            Message obtain = Message.obtain(handler, 1);
            obtain.obj = intent;
            this.x.sendMessageDelayed(obtain, 100L);
            return;
        }
        handler.sendEmptyMessageDelayed(0, 100L);
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        c.a("WBShareTag", "start share activity again. Means share result coming!");
        int intExtra = intent.getIntExtra("start_flag", -1);
        if (intExtra != 1001) {
            if (intExtra == 1002) {
                b(intent);
            } else {
                j();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Intent intent) {
        FrameLayout frameLayout = this.u;
        if (frameLayout != null) {
            frameLayout.setVisibility(4);
        }
        Handler handler = this.x;
        if (handler != null) {
            handler.removeMessages(0);
            this.x = null;
        }
        if (!a(intent)) {
            j();
            return;
        }
        c(intent);
        setResult(-1, intent);
        finish();
    }

    @Override // com.sina.weibo.sdk.share.BaseActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        View view;
        super.onCreate(bundle);
        c.a("WBShareTag", "start share activity.");
        Intent intent = getIntent();
        this.t = intent;
        if (intent == null) {
            finish();
        } else if (intent.getIntExtra("start_flag", -1) != 1001) {
            finish();
        } else {
            this.u = new FrameLayout(this);
            int intExtra = getIntent().getIntExtra("progress_id", -1);
            if (intExtra != -1) {
                view = ((LayoutInflater) getSystemService("layout_inflater")).inflate(intExtra, (ViewGroup) null);
            } else {
                view = new ProgressBar(this);
            }
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 17;
            this.u.addView(view, layoutParams);
            this.u.setBackgroundColor(855638016);
            setContentView(this.u);
            c.a("WBShareTag", "prepare wb resource.");
            Bundle extras = this.t.getExtras();
            if (extras == null) {
                finish();
                return;
            }
            WeiboMultiMessage weiboMultiMessage = new WeiboMultiMessage();
            weiboMultiMessage.readFromBundle(extras);
            if (weiboMultiMessage.multiImageObject == null && weiboMultiMessage.videoSourceObject == null) {
                a(weiboMultiMessage);
                return;
            }
            d dVar = this.v;
            if (dVar != null) {
                dVar.cancel(true);
            }
            d dVar2 = new d(this, new b() { // from class: com.sina.weibo.sdk.share.ShareTransActivity.2
                @Override // com.sina.weibo.sdk.share.b
                public final void a(c cVar) {
                    ShareTransActivity.this.u.setVisibility(4);
                    if (cVar == null) {
                        ShareTransActivity.this.c("Trans result is null.");
                    } else if (cVar.z) {
                        ShareTransActivity.this.a(cVar.A);
                    } else if (TextUtils.isEmpty(cVar.errorMessage)) {
                        ShareTransActivity.this.c("Trans resource fail.");
                    } else {
                        ShareTransActivity.this.c(cVar.errorMessage);
                    }
                }
            });
            this.v = dVar2;
            dVar2.execute(weiboMultiMessage);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(WeiboMultiMessage weiboMultiMessage) {
        c.a("WBShareTag", "start wb composer");
        try {
            this.t.putExtra("start_flag", 1002);
            String f = d.f(String.valueOf((Math.random() * 10000.0d) + System.currentTimeMillis()));
            this.w = f;
            this.t.putExtra("share_back_flag", f);
            this.t.putExtra("share_flag_for_new_version", 1);
            Bundle extras = this.t.getExtras();
            Intent intent = new Intent("com.sina.weibo.sdk.action.ACTION_WEIBO_ACTIVITY");
            a.C0305a c = a.c(this);
            if (c != null) {
                intent.setPackage(c.packageName);
            }
            intent.putExtras(weiboMultiMessage.writeToBundle(extras));
            intent.putExtra("_weibo_sdkVersion", "0041005000");
            intent.putExtra("_weibo_appPackage", getPackageName());
            intent.putExtra("_weibo_appKey", com.sina.weibo.sdk.a.a().getAppKey());
            intent.putExtra("_weibo_flag", 538116905);
            intent.putExtra("_weibo_sign", d.f(e.b(this, getPackageName())));
            String stringExtra = this.t.getStringExtra("start_web_activity");
            if (!TextUtils.isEmpty(stringExtra) && "com.sina.weibo.sdk.web.WebActivity".equals(stringExtra)) {
                intent.setClassName(this, stringExtra);
                startActivityForResult(intent, 10001);
            } else if (com.sina.weibo.sdk.a.a(this)) {
                if (c != null) {
                    intent.setPackage(c.packageName);
                }
                startActivityForResult(intent, 10001);
            } else {
                c("Start weibo client's composer fail. And Weibo client is not installed.");
            }
        } catch (Throwable th) {
            c.b("WBShareTag", "start wb composer fail," + th.getMessage());
            c("Start weibo client's composer fail. " + th.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(String str) {
        FrameLayout frameLayout = this.u;
        if (frameLayout != null) {
            frameLayout.setVisibility(4);
        }
        Handler handler = this.x;
        if (handler != null) {
            handler.removeMessages(0);
            this.x = null;
        }
        Intent intent = new Intent();
        Bundle bundle = new Bundle();
        bundle.putInt("_weibo_resp_errcode", 2);
        bundle.putString("_weibo_resp_errstr", str);
        intent.putExtras(bundle);
        setResult(-1, intent);
        finish();
    }

    private boolean a(Intent intent) {
        if (TextUtils.isEmpty(this.w) || intent == null || !intent.getExtras().containsKey("share_back_flag")) {
            return false;
        }
        return TextUtils.equals(this.w, intent.getStringExtra("share_back_flag"));
    }
}
