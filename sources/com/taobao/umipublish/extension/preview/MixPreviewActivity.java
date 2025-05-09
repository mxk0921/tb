package com.taobao.umipublish.extension.preview;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.base.data.IUGCMedia;
import com.taobao.umipublish.extension.preview.PreviewModel;
import com.taobao.umipublish.extension.preview.image.UmiImagePreviewActivity;
import tb.acq;
import tb.krq;
import tb.m3v;
import tb.qrf;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class MixPreviewActivity extends UmiImagePreviewActivity {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String o = UmiImagePreviewActivity.PAGE_NAME;
    public String p = "a2116i.b10340776";
    public boolean q;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            ((m3v) MixPreviewActivity.this.c).f("Back", null);
            if (!MixPreviewActivity.M3(MixPreviewActivity.this).isEmpty()) {
                MixPreviewActivity.this.D3();
            } else {
                MixPreviewActivity.this.finish();
            }
        }
    }

    static {
        t2o.a(944767024);
    }

    public static /* synthetic */ JSONArray M3(MixPreviewActivity mixPreviewActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("4a9474a8", new Object[]{mixPreviewActivity});
        }
        return mixPreviewActivity.j;
    }

    public static /* synthetic */ Object ipc$super(MixPreviewActivity mixPreviewActivity, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -641568046) {
            super.onCreate((Bundle) objArr[0]);
            return null;
        } else if (hashCode == 514894248) {
            super.attachBaseContext((Context) objArr[0]);
            return null;
        } else if (hashCode == 1150324634) {
            super.finish();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/umipublish/extension/preview/MixPreviewActivity");
        }
    }

    @Override // com.taobao.umipublish.extension.preview.image.UmiImagePreviewActivity
    public void B3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae222d00", new Object[]{this});
            return;
        }
        int o = this.e.o();
        PreviewModel.Media j = this.e.j(o);
        if (j != null) {
            JSONObject E3 = E3(o, j);
            this.j.add(Integer.valueOf(o));
            this.k.add(E3);
            if (j.type == 0 && this.g != null) {
                C3(j);
            }
            if (this.f.d.isEmpty()) {
                D3();
            }
        }
    }

    @Override // com.taobao.umipublish.extension.preview.image.UmiImagePreviewActivity
    public void D3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8336bcd", new Object[]{this});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("deleteItemsPos", (Object) this.j);
        jSONObject.put("deleteItems", (Object) this.k);
        jSONObject.put("leftCount", (Object) Integer.valueOf(this.f.d.size()));
        Intent intent = new Intent();
        intent.putExtra("data", jSONObject.toJSONString());
        JSONArray jSONArray = new JSONArray();
        for (PreviewModel.Media media : this.f.d) {
            jSONArray.add(media.originData);
        }
        intent.putExtra("left_images", jSONArray.toString());
        intent.putExtra("action", "delete");
        intent.putExtra("draft_ids", krq.t(this.l, ","));
        IUGCMedia iUGCMedia = this.g;
        if (iUGCMedia == null) {
            setResult(-1, intent);
        } else {
            iUGCMedia.getVideos().clear();
            this.g.setMeta("ugc_video_from_album_input", "");
            this.g.setMeta("result_data", qrf.q(intent));
        }
        finish();
    }

    @Override // com.taobao.umipublish.extension.preview.image.UmiImagePreviewActivity
    public String G3(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("62395dac", new Object[]{this, intent});
        }
        return intent.getStringExtra("inputMedias");
    }

    @Override // com.taobao.umipublish.extension.preview.image.UmiImagePreviewActivity
    public PreviewModel I3(String str, int i, JSONArray jSONArray, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PreviewModel) ipChange.ipc$dispatch("fcb075fe", new Object[]{this, str, new Integer(i), jSONArray, new Boolean(z)});
        }
        return PreviewModel.b(str, i, jSONArray, z);
    }

    @Override // com.taobao.umipublish.extension.preview.image.UmiImagePreviewActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1eb0a9a8", new Object[]{this, context});
            return;
        }
        super.attachBaseContext(context);
        acq.B(context);
    }

    @Override // com.taobao.umipublish.extension.preview.image.UmiImagePreviewActivity, com.taobao.umipublish.extension.preview.BasePreviewActivity, android.app.Activity
    public void finish() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44908f9a", new Object[]{this});
            return;
        }
        super.finish();
        if (this.q) {
            overridePendingTransition(17432576, 17432577);
        }
    }

    @Override // com.taobao.umipublish.extension.preview.image.UmiImagePreviewActivity, com.taobao.umipublish.extension.preview.BasePreviewActivity
    public String getPageName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("707fddc9", new Object[]{this});
        }
        String stringExtra = getIntent().getStringExtra("pageName");
        if (!TextUtils.isEmpty(stringExtra)) {
            this.o = stringExtra;
        }
        return this.o;
    }

    @Override // com.taobao.umipublish.extension.preview.image.UmiImagePreviewActivity, com.taobao.umipublish.extension.preview.BasePreviewActivity
    public String l3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d8ae70bf", new Object[]{this});
        }
        String stringExtra = getIntent().getStringExtra("spm");
        if (!TextUtils.isEmpty(stringExtra)) {
            this.p = stringExtra;
        }
        return this.p;
    }

    @Override // com.taobao.umipublish.extension.preview.image.UmiImagePreviewActivity, com.taobao.umipublish.extension.preview.BasePreviewActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88afc63", new Object[]{this});
        } else {
            D3();
        }
    }

    @Override // com.taobao.umipublish.extension.preview.image.UmiImagePreviewActivity, com.taobao.umipublish.extension.preview.BasePreviewActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        this.q = getIntent().getBooleanExtra("rateAnimEnable", false);
        this.e.A(new a());
    }
}
