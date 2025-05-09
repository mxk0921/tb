package com.taobao.umipublish.extension.preview;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.appcompat.app.AppCompatActivity;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.sdk.framework.container.ut.UtParams;
import com.taobao.taobao.R;
import java.util.Map;
import tb.c5e;
import tb.dov;
import tb.kfv;
import tb.m3v;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public abstract class BasePreviewActivity extends AppCompatActivity {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f13983a;
    public String b;
    public c5e c;
    public Map<String, String> d;
    public PreviewDelegate e;
    public PreviewModel f;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a extends TypeReference<Map<String, String>> {
        public a(BasePreviewActivity basePreviewActivity) {
        }
    }

    static {
        t2o.a(944767021);
    }

    public static /* synthetic */ Object ipc$super(BasePreviewActivity basePreviewActivity, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1512649357:
                super.onResume();
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case 143326307:
                super.onBackPressed();
                return null;
            case 797441118:
                super.onPause();
                return null;
            case 1150324634:
                super.finish();
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/umipublish/extension/preview/BasePreviewActivity");
        }
    }

    @Override // android.app.Activity
    public void finish() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44908f9a", new Object[]{this});
            return;
        }
        super.finish();
        overridePendingTransition(R.anim.anim_hold, R.anim.anim_preview_out);
    }

    public abstract String getPageName();

    public abstract String l3();

    public final void m3(Activity activity, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d4ec884", new Object[]{this, activity, new Integer(i)});
        } else {
            activity.getWindow().setNavigationBarColor(i);
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88afc63", new Object[]{this});
            return;
        }
        super.onBackPressed();
        overridePendingTransition(R.anim.anim_hold, R.anim.anim_preview_out);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        PreviewDelegate previewDelegate = this.e;
        if (previewDelegate != null) {
            previewDelegate.t();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        super.onPause();
        PreviewDelegate previewDelegate = this.e;
        if (previewDelegate != null) {
            previewDelegate.u();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        ((m3v) this.c).d(this, UtParams.newInstance().putParams("biz_scene", this.f13983a).putParams(dov.KEY_ONIOLN_FITTING_ROOM_SCENE, this.b));
        PreviewDelegate previewDelegate = this.e;
        if (previewDelegate != null) {
            previewDelegate.v();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        PreviewDelegate previewDelegate = new PreviewDelegate(this);
        this.e = previewDelegate;
        setContentView(previewDelegate.q());
        m3(this, -16777216);
        this.f13983a = kfv.b().d("biz_scene");
        this.b = kfv.b().d(dov.KEY_ONIOLN_FITTING_ROOM_SCENE);
        Intent intent = getIntent();
        if (intent == null || !intent.getBooleanExtra("useIntent", false)) {
            this.c = new m3v(getPageName(), l3());
            return;
        }
        if (TextUtils.isEmpty(this.f13983a)) {
            this.f13983a = intent.getStringExtra("biz_scene");
        }
        if (TextUtils.isEmpty(this.b)) {
            this.b = intent.getStringExtra(dov.KEY_ONIOLN_FITTING_ROOM_SCENE);
        }
        String stringExtra = intent.getStringExtra("track_common_args");
        if (!TextUtils.isEmpty(stringExtra)) {
            this.d = (Map) JSON.parseObject(stringExtra, new a(this), new Feature[0]);
        }
        this.c = new m3v(getPageName(), l3(), this.d);
    }
}
