package tb;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import com.alibaba.ability.localization.Localization;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.task.Coordinator;
import com.taobao.share.copy.ClipUrlWatcherControl;
import com.taobao.share.core.screenshot.ALDetailAffectionBean;
import com.taobao.share.multiapp.ShareBizAdapter;
import com.taobao.tao.log.TLog;
import com.taobao.taobao.R;
import com.ut.share.business.ShareBusiness;
import com.ut.share.business.ShareContent;
import com.ut.share.business.WWMessageType;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class mvo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final String e = pg9.c().toString() + yhs.DEFAULT_PLAN_B_PASSWORD_REGEX;
    public static final String f = pg9.e().toString() + yhs.DEFAULT_PLAN_B_PASSWORD_REGEX;
    public static final String g = Localization.q(R.string.app_screenshot);

    /* renamed from: a  reason: collision with root package name */
    public ContentObserver f24337a;
    public Context b = null;
    public final Handler c = new Handler();
    public String d = "";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a extends ContentObserver {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f24338a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Handler handler, Context context) {
            super(handler);
            this.f24338a = context;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/share/core/screenshot/ScreenObserverManager$1");
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b71c021e", new Object[]{this, new Boolean(z)});
            }
        }

        /* compiled from: Taobao */
        /* renamed from: tb.mvo$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public class RunnableC0999a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ String f24339a;
            public final /* synthetic */ String b;
            public final /* synthetic */ long c;

            public RunnableC0999a(String str, String str2, long j) {
                this.f24339a = str;
                this.b = str2;
                this.c = j;
            }

            @Override // java.lang.Runnable
            public void run() {
                boolean z = false;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                try {
                    mvo.d(mvo.this, this.f24339a);
                    if (mvo.e(mvo.this, this.f24339a, this.b) && mvo.f(mvo.this, this.c)) {
                        TLog.loge("ScreenObserverManager", Localization.q(R.string.taobao_app_1010_1_18279) + this.f24339a + "===========" + this.b);
                        ShareContent g = mvo.g(mvo.this, this.f24339a);
                        Activity activity = ClipUrlWatcherControl.z().s().get();
                        StringBuilder sb = new StringBuilder();
                        sb.append(Localization.q(R.string.taobao_app_1010_1_18289));
                        sb.append(activity != null);
                        sb.append("===========");
                        if (g != null) {
                            z = true;
                        }
                        sb.append(z);
                        TLog.loge("ScreenObserverManager", sb.toString());
                        if (activity != null && g != null) {
                            TLog.loge("ScreenObserverManager", Localization.q(R.string.taobao_app_1010_1_18288) + "true===========true");
                            ShareBusiness.getInstance();
                            ShareBusiness.share(activity, g);
                        }
                    }
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z, Uri uri) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c2652e9", new Object[]{this, new Boolean(z), uri});
                return;
            }
            Activity activity = ClipUrlWatcherControl.z().s().get();
            if (activity != null && mip.u(activity)) {
                TLog.loge("ScreenObserverManager", Localization.q(R.string.taobao_app_1010_1_18283));
                mvo.a(mvo.this, a0m.a());
                Cursor cursor = null;
                if (uri != null) {
                    try {
                        String uri2 = uri.toString();
                        if (!uri2.matches(mvo.b())) {
                            if (uri2.matches(mvo.c())) {
                            }
                        }
                        cursor = this.f24338a.getContentResolver().query(uri, null, null, null, "date_added DESC");
                        if (cursor != null && cursor.moveToFirst()) {
                            Coordinator.execute(new RunnableC0999a(pg9.d(this.f24338a, cursor), cursor.getString(cursor.getColumnIndex("_display_name")), cursor.getLong(cursor.getColumnIndex("date_added"))));
                        }
                    } catch (Throwable th) {
                        try {
                            TLog.loge("ScreenObserverManager", Localization.q(R.string.taobao_app_1010_1_18275) + th.getMessage());
                            th.printStackTrace();
                            if (cursor == null) {
                                return;
                            }
                        } finally {
                            if (cursor != null) {
                                cursor.close();
                            }
                        }
                    }
                }
                if (cursor == null) {
                }
            }
        }
    }

    static {
        t2o.a(664797246);
    }

    public static /* synthetic */ void a(mvo mvoVar, String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ca98a08", new Object[]{mvoVar, strArr});
        } else {
            mvoVar.o(strArr);
        }
    }

    public static /* synthetic */ String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6c2478e8", new Object[0]);
        }
        return e;
    }

    public static /* synthetic */ String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("682607c7", new Object[0]);
        }
        return f;
    }

    public static /* synthetic */ String d(mvo mvoVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("81c71f1a", new Object[]{mvoVar, str});
        }
        mvoVar.d = str;
        return str;
    }

    public static /* synthetic */ boolean e(mvo mvoVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1b291e53", new Object[]{mvoVar, str, str2})).booleanValue();
        }
        return mvoVar.m(str, str2);
    }

    public static /* synthetic */ boolean f(mvo mvoVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("beb3674c", new Object[]{mvoVar, new Long(j)})).booleanValue();
        }
        return mvoVar.l(j);
    }

    public static /* synthetic */ ShareContent g(mvo mvoVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ShareContent) ipChange.ipc$dispatch("ef42d7e7", new Object[]{mvoVar, str});
        }
        return mvoVar.h(str);
    }

    public static String q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8aa7c0a8", new Object[0]);
        }
        String string = hjp.a().getSharedPreferences("TB_Detail", 0).getString(wj4.SP_KEY_AFFECTION_DETAIL, "");
        new StringBuilder("getItemDetailShareContent： ").append(string);
        if (!TextUtils.isEmpty(string)) {
            dmp.a("TB_Detail", string);
            return string;
        }
        String c = dmp.c("TB_Detail");
        fwr.a("ScreenObserverManager", "getItemDetailShareContent： null fixIt: " + c);
        return c;
    }

    public final ShareContent h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ShareContent) ipChange.ipc$dispatch("bbd34d69", new Object[]{this, str});
        }
        String q = q();
        if (TextUtils.isEmpty(q)) {
            return null;
        }
        ShareContent shareContent = new ShareContent();
        ALDetailAffectionBean aLDetailAffectionBean = (ALDetailAffectionBean) JSON.parseObject(q, ALDetailAffectionBean.class);
        HashMap hashMap = new HashMap();
        hashMap.put("title", aLDetailAffectionBean.title);
        hashMap.put("shop", aLDetailAffectionBean.shop);
        hashMap.put("price", aLDetailAffectionBean.price);
        hashMap.put("pic", aLDetailAffectionBean.pic);
        hashMap.put("itemid", aLDetailAffectionBean.itemid);
        hashMap.put("url", aLDetailAffectionBean.url);
        shareContent.businessId = tn1.KEY_SHARE_SCREENSHOT_BIZ_ID;
        shareContent.templateId = "detail";
        shareContent.description = aLDetailAffectionBean.title;
        HashMap hashMap2 = new HashMap();
        hashMap2.put("price", aLDetailAffectionBean.price);
        hashMap2.put("title", aLDetailAffectionBean.title);
        hashMap2.put("images", new String[]{aLDetailAffectionBean.pic});
        hashMap2.put("screenshot", str);
        shareContent.extendParams = hashMap;
        shareContent.templateParams = hashMap2;
        shareContent.imageUrl = this.d;
        shareContent.url = aLDetailAffectionBean.url;
        shareContent.title = aLDetailAffectionBean.title;
        shareContent.contentType = "";
        shareContent.wwMsgType = WWMessageType.WWMessageTypeDetail;
        return shareContent;
    }

    public final boolean i(Context context, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2b4b3ec", new Object[]{this, context, strArr})).booleanValue();
        }
        if (!(Build.VERSION.SDK_INT < 23 || context == null || strArr == null)) {
            for (String str : strArr) {
                if (ContextCompat.checkSelfPermission(context, str) != 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        Log.e("ScreenObserverManager", Localization.q(R.string.taobao_app_1010_1_18297));
        Application a2 = hjp.a();
        this.b = a2;
        k(a2);
        n();
    }

    public final void k(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95c744f5", new Object[]{this, context});
        } else if (this.f24337a == null) {
            this.f24337a = new a(this.c, context);
        }
    }

    public final boolean l(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e8cf7de2", new Object[]{this, new Long(j)})).booleanValue();
        }
        try {
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            if (currentTimeMillis - j < 0) {
                j /= 1000;
            }
            StringBuilder sb = new StringBuilder("fileAddTime = ");
            sb.append(j);
            sb.append(";currentTime = ");
            sb.append(currentTimeMillis);
            long j2 = currentTimeMillis - j;
            if (j2 <= 5) {
                return true;
            }
            TLog.loge("ScreenObserverManager", "isInValidTimeInterval VALID_TIME_INTERVAL" + j2);
            return false;
        } catch (Throwable unused) {
            return true;
        }
    }

    public final void o(String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee708f23", new Object[]{this, strArr});
            return;
        }
        Activity topActivity = ShareBizAdapter.getInstance().getAppEnv().getTopActivity();
        if (topActivity != null) {
            try {
                if (!i(this.b, strArr)) {
                    ActivityCompat.requestPermissions(topActivity, strArr, nd2.EVALUATION);
                }
            } catch (Exception unused) {
            }
        }
    }

    public void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("330f983f", new Object[]{this});
        } else if (this.f24337a != null) {
            this.b.getContentResolver().unregisterContentObserver(this.f24337a);
            TLog.loge("ScreenObserverManager", "unregister observer");
        }
    }

    public void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8fc5b66", new Object[]{this});
        } else if (this.f24337a != null) {
            this.b.getContentResolver().registerContentObserver(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, true, this.f24337a);
            this.b.getContentResolver().registerContentObserver(MediaStore.Images.Media.INTERNAL_CONTENT_URI, true, this.f24337a);
            TLog.loge("ScreenObserverManager", "register observer");
        }
    }

    public final boolean m(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a93f4e49", new Object[]{this, str, str2})).booleanValue();
        }
        if (!((!TextUtils.isEmpty(str) && (str.toLowerCase().contains("tencent") || str.toLowerCase().contains("qq") || str.toLowerCase().contains(tn1.KEY_SHARE_CONFIG_WEIXIN) || str.toLowerCase().contains("wechat"))) || str == null || str2 == null)) {
            if (!str2.toLowerCase().contains("screenshot") && !str.toLowerCase().contains("screenshot")) {
                String lowerCase = str2.toLowerCase();
                String str3 = g;
                if (lowerCase.contains(str3) || str.toLowerCase().contains(str3)) {
                }
            }
            return true;
        }
        return false;
    }
}
