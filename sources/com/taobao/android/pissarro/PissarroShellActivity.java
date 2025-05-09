package com.taobao.android.pissarro;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.widget.Toast;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.TBDeviceUtils;
import com.taobao.android.litecreator.modules.edit.image.thumbnaillist.ThumbnailListAdapter;
import com.taobao.android.nav.Nav;
import com.taobao.android.weex_framework.MUSAppMonitor;
import com.taobao.tao.log.TLog;
import com.taobao.taobao.R;
import com.taobao.taopai.business.common.model.TaopaiParams;
import com.taobao.taopai.business.image.external.Image;
import com.xiaomi.mipush.sdk.PushMessageHelper;
import java.io.Serializable;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
import tb.acq;
import tb.ag4;
import tb.d7r;
import tb.dov;
import tb.nxv;
import tb.q3m;
import tb.q7u;
import tb.r3m;
import tb.s3m;
import tb.t2o;
import tb.tep;
import tb.wgs;
import tb.x6u;
import tb.xbt;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class PissarroShellActivity extends Activity {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_FUN = "key_fun";

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, String> f9165a = new HashMap();

    static {
        t2o.a(623902729);
    }

    public static /* synthetic */ Object ipc$super(PissarroShellActivity pissarroShellActivity, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case 143326307:
                super.onBackPressed();
                return null;
            case 514894248:
                super.attachBaseContext((Context) objArr[0]);
                return null;
            case 1257714799:
                super.onActivityResult(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), (Intent) objArr[2]);
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/pissarro/PissarroShellActivity");
        }
    }

    public final String a() {
        ComponentName componentName;
        ComponentName componentName2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1788758", new Object[]{this});
        }
        ActivityManager activityManager = (ActivityManager) getSystemService("activity");
        try {
            if (!(activityManager.getRunningTasks(1) == null || activityManager.getRunningTasks(1).size() == 0)) {
                componentName = activityManager.getRunningTasks(1).get(0).topActivity;
                if (componentName != null) {
                    componentName2 = activityManager.getRunningTasks(1).get(0).topActivity;
                    return componentName2.getClassName();
                }
            }
        } catch (Throwable unused) {
        }
        return "";
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

    public final void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("232fde0b", new Object[]{this});
            return;
        }
        r3m.b().f(ag4.a());
        if (r3m.b().a() != null) {
            ((HashMap) this.f9165a).put(dov.KEY_BIZ_LINE, r3m.b().a().e());
            ((HashMap) this.f9165a).put("biz_code", r3m.b().a().d());
            ((HashMap) this.f9165a).put("biz_scene", r3m.b().a().f());
        }
        e();
    }

    public final void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("526d9380", new Object[]{this});
            return;
        }
        String str = s3m.URL_IMAGE_EDIT;
        Serializable from = TaopaiParams.from(Uri.parse(str));
        Bundle bundle = new Bundle();
        bundle.putString(tep.KEY_IMAGE_PATH, getIntent().getStringExtra(tep.KEY_IMAGE_PATH));
        bundle.putSerializable("pissaro_taopai_param", from);
        wgs.a(this).g(str, bundle, 102);
    }

    @Override // android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        super.onActivityResult(i, i2, intent);
        if (intent == null || i2 != -1) {
            nxv.c(this);
        } else if (i == 100 || i == 101 || i == 102) {
            c(intent);
        }
        finish();
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88afc63", new Object[]{this});
            return;
        }
        super.onBackPressed();
        nxv.c(this);
    }

    public final void c(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69dc5ef6", new Object[]{this, intent});
            return;
        }
        String stringExtra = intent.getStringExtra(tep.KEY_IMAGE_PATH);
        List<Image> b = !TextUtils.isEmpty(stringExtra) ? b(stringExtra) : null;
        if (b == null) {
            b = b(intent.getStringExtra(ThumbnailListAdapter.TYPE_TAG_MEDIA_IMAGE));
        }
        if (b == null) {
            b = b(intent.getStringExtra("MEDIA_LIST"));
        }
        if (b == null || b.isEmpty()) {
            int intExtra = intent.getIntExtra("errorCode", -1);
            int intExtra2 = intent.getIntExtra("subCode", -1);
            String stringExtra2 = intent.getStringExtra("errorMsg");
            nxv.e(this, intExtra, intExtra2, stringExtra2);
            ((HashMap) this.f9165a).put("error_code", String.valueOf(intExtra));
            ((HashMap) this.f9165a).put(MUSAppMonitor.ERROR_MSG, stringExtra2);
            ((HashMap) this.f9165a).put("error_subCode", String.valueOf(intExtra2));
            q7u.a("tp_windvane", "fail", this.f9165a);
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Image image : b) {
            com.taobao.android.pissarro.external.Image image2 = new com.taobao.android.pissarro.external.Image();
            image2.setPath(image.getPath());
            image2.setFileId(image.getFileId());
            image2.setResourceUrl(image.getCdnURL());
            image2.setCoverUrl(image.getCoverUrl());
            image2.setCoverPath(image.getCoverPath());
            image2.setMediaType(image.getType());
            image2.setWidth(image.getWidth());
            image2.setHeight(image.getHeight());
            image2.setDuration(image.getDuration() / 1000);
            arrayList.add(image2);
        }
        Intent intent2 = new Intent();
        intent2.putExtra(tep.KEY_IMAGE_PATH, b.get(0).getPath());
        setResult(-1, intent2);
        nxv.d(this, arrayList);
        q7u.a("tp_windvane", "succeed", this.f9165a);
    }

    public final void e() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3bf3491", new Object[]{this});
            return;
        }
        int intExtra = getIntent().getIntExtra(KEY_FUN, 1);
        if (intExtra == 0) {
            if (q3m.c().a().getFacing() == 1) {
                str = s3m.URL_CAMERA_FRONT_FACING;
            } else {
                str = s3m.URL_CAMERA_BACK_FACING;
            }
            if (q3m.c().a().isDisableAlbumSelect()) {
                str = str + "&show_video_pick=0";
            }
            Nav forResult = Nav.from(this).forResult(100);
            if (x6u.e()) {
                str = ag4.c();
            }
            forResult.toUri(str);
        } else if (intExtra != 1) {
            if (intExtra != 2) {
                Log.e("TaopaiRecord", " PissarroShellActivity finish by default = ");
                finish();
                return;
            }
            g();
        } else if (TextUtils.equals(a(), "com.taobao.taopai.business.image.album.ImageGalleryActivity")) {
            TLog.loge("PissarroShellActivity", "jump taopai image gallery activity repeat , return");
        } else {
            Nav.from(this).forResult(101).toUri(ag4.b());
        }
    }

    public final void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4717d95", new Object[]{this});
        } else if (!x6u.d() || (!TBDeviceUtils.p(this) && !TBDeviceUtils.P(this))) {
            setRequestedOrientation(1);
            TLog.loge("PissarroShellActivity", "is phone setOrientation portrait");
        } else {
            d7r.a(this);
            TLog.loge("PissarroShellActivity", "isFoldDevice setOrientation");
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        f();
        if (xbt.c()) {
            TLog.loge("PissarroShellActivity", "jumpTaopai start");
            d();
            return;
        }
        TLog.logi("PissarroShellActivity", "finish");
        Toast.makeText(this, getString(R.string.pissarro_function_wait), 0).show();
        finish();
    }

    public final List<Image> b(String str) {
        List<Image> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("1ccecae8", new Object[]{this, str});
        }
        try {
            list = JSON.parseArray(str, Image.class);
        } catch (Throwable th) {
            TLog.loge("PissarroShellActivity", "getImages fastjson error = " + th.getMessage());
            ((HashMap) this.f9165a).put(PushMessageHelper.ERROR_TYPE, "get image fastjson error");
            ((HashMap) this.f9165a).put("error_detail", th.getMessage());
            ((HashMap) this.f9165a).put("json_origin", URLEncoder.encode(str));
            list = null;
        }
        if (list == null) {
            try {
                JSONArray jSONArray = new JSONArray(str);
                if (jSONArray.length() > 0) {
                    for (int i = 0; i < jSONArray.length(); i++) {
                        JSONObject jSONObject = jSONArray.getJSONObject(i);
                        Image image = new Image();
                        image.setId(jSONObject.optString("id"));
                        image.setSequence(jSONObject.optInt("sequence"));
                        image.setPath(jSONObject.optString("path"));
                        image.setCoverPath(jSONObject.optString("coverPath"));
                        image.setWidth(jSONObject.optInt("width"));
                        image.setHeight(jSONObject.optInt("height"));
                        image.setCdnURL(jSONObject.optString("cdnURL"));
                        image.setCoverUrl(jSONObject.optString(tep.KEY_TP_RETURN_VIDEO_COVER_CDN_URL));
                        image.setFileId(jSONObject.optString(tep.KEY_TP_RETURN_VIDEO_FILE_ID));
                        image.setDuration(jSONObject.optInt("duration"));
                        image.setType(jSONObject.optString("type"));
                        list.add(image);
                    }
                }
            } catch (Throwable th2) {
                TLog.loge("PissarroShellActivity", "getImages System error = " + th2.getMessage());
                ((HashMap) this.f9165a).put(PushMessageHelper.ERROR_TYPE, "get image System json error");
                ((HashMap) this.f9165a).put("error_detail", th2.getMessage());
            }
        }
        return list;
    }
}
