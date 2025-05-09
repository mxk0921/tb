package com.taobao.umipublish.extension.preview.video;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.alibaba.ability.localization.Localization;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.idst.nls.nlsclientsdk.requests.Constant;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.base.data.IUGCMedia;
import com.taobao.android.litecreator.base.workflow.annotation.WorkflowNode;
import com.taobao.android.litecreator.widgets.LCMaterialDialog;
import com.taobao.android.nav.Nav;
import com.taobao.taobao.R;
import com.taobao.umipublish.extension.preview.BasePreviewActivity;
import com.taobao.umipublish.extension.preview.PreviewModel;
import com.taobao.umipublish.extension.windvane.UmiWvPlugin;
import java.util.HashMap;
import tb.a19;
import tb.acq;
import tb.c5e;
import tb.dag;
import tb.dov;
import tb.mj4;
import tb.muu;
import tb.n3e;
import tb.qrf;
import tb.rng;
import tb.t2o;
import tb.tep;
import tb.ydv;

/* compiled from: Taobao */
@WorkflowNode(bothWay = true, checkerClassName = "com.taobao.umipublish.extension.preview.VideoChecker")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class UmiVideoPreviewActivity extends BasePreviewActivity implements n3e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_CAN_DELETE_VIDEO = "canDeleteVideo";
    public static final String KEY_CAN_EDIT_COVER = "canEditCover";
    public static final String KEY_CAN_EDIT_VIDEO = "canEditVideo";
    public static final String PAGE_NAME = "Page_GGVideoCheck";
    public IUGCMedia g;

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
            UmiVideoPreviewActivity.this.x3();
            HashMap hashMap = new HashMap();
            hashMap.put("biz_scene", UmiVideoPreviewActivity.n3(UmiVideoPreviewActivity.this));
            hashMap.put(dov.KEY_ONIOLN_FITTING_ROOM_SCENE, UmiVideoPreviewActivity.o3(UmiVideoPreviewActivity.this));
            UmiVideoPreviewActivity.p3(UmiVideoPreviewActivity.this).f("Cover", hashMap);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class b implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            Nav.from(UmiVideoPreviewActivity.this).toUri(dag.c(muu.d(UmiVideoPreviewActivity.this.g)).e("VIDEO_EDIT_PATH"));
            HashMap hashMap = new HashMap();
            hashMap.put("biz_scene", UmiVideoPreviewActivity.q3(UmiVideoPreviewActivity.this));
            hashMap.put(dov.KEY_ONIOLN_FITTING_ROOM_SCENE, UmiVideoPreviewActivity.r3(UmiVideoPreviewActivity.this));
            UmiVideoPreviewActivity.s3(UmiVideoPreviewActivity.this).f(mj4.CONTROL_EDIT, hashMap);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class c implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
        public class a implements DialogInterface.OnClickListener {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("type", (Object) "video");
                jSONObject2.put("path", (Object) UmiVideoPreviewActivity.t3(UmiVideoPreviewActivity.this).d.get(0).path);
                JSONArray jSONArray = new JSONArray();
                jSONArray.add(jSONObject2);
                jSONObject.put("deleteItems", (Object) jSONArray);
                jSONObject.put("leftCount", (Object) 0);
                Intent intent = new Intent();
                intent.putExtra("data", jSONObject.toJSONString());
                intent.putExtra("action", "delete");
                UmiVideoPreviewActivity umiVideoPreviewActivity = UmiVideoPreviewActivity.this;
                IUGCMedia iUGCMedia = umiVideoPreviewActivity.g;
                if (iUGCMedia != null) {
                    iUGCMedia.getVideos().clear();
                    UmiVideoPreviewActivity.this.g.setMeta("ugc_video_from_album_input", "");
                    UmiVideoPreviewActivity.this.g.setMeta("result_data", qrf.q(intent));
                } else {
                    umiVideoPreviewActivity.setResult(-1, intent);
                }
                UmiVideoPreviewActivity.this.finish();
            }
        }

        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            new LCMaterialDialog.Builder(UmiVideoPreviewActivity.this).setMessage(Localization.q(R.string.gg_pub_confirm_delete_video)).setPositiveButton(Localization.q(R.string.gg_pub_confirm), new a()).setNegativeButton(Localization.q(R.string.gg_pub_cancel), (DialogInterface.OnClickListener) null).setCancelable(true).create().show();
            HashMap hashMap = new HashMap();
            hashMap.put("biz_scene", UmiVideoPreviewActivity.u3(UmiVideoPreviewActivity.this));
            hashMap.put(dov.KEY_ONIOLN_FITTING_ROOM_SCENE, UmiVideoPreviewActivity.v3(UmiVideoPreviewActivity.this));
            UmiVideoPreviewActivity.w3(UmiVideoPreviewActivity.this).f(Constant.VALUE_NAME_VPR_DELETE, hashMap);
        }
    }

    static {
        t2o.a(944767048);
        t2o.a(511705155);
    }

    public static /* synthetic */ Object ipc$super(UmiVideoPreviewActivity umiVideoPreviewActivity, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1630383126:
                super.startActivityForResult((Intent) objArr[0], ((Number) objArr[1]).intValue(), (Bundle) objArr[2]);
                return null;
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case 514894248:
                super.attachBaseContext((Context) objArr[0]);
                return null;
            case 1150324634:
                super.finish();
                return null;
            case 1257714799:
                super.onActivityResult(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), (Intent) objArr[2]);
                return null;
            case 1264052993:
                super.onNewIntent((Intent) objArr[0]);
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/umipublish/extension/preview/video/UmiVideoPreviewActivity");
        }
    }

    public static /* synthetic */ String n3(UmiVideoPreviewActivity umiVideoPreviewActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7844299a", new Object[]{umiVideoPreviewActivity});
        }
        return umiVideoPreviewActivity.f13983a;
    }

    public static /* synthetic */ String o3(UmiVideoPreviewActivity umiVideoPreviewActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a08a69db", new Object[]{umiVideoPreviewActivity});
        }
        return umiVideoPreviewActivity.b;
    }

    public static /* synthetic */ c5e p3(UmiVideoPreviewActivity umiVideoPreviewActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c5e) ipChange.ipc$dispatch("4d21da59", new Object[]{umiVideoPreviewActivity});
        }
        return umiVideoPreviewActivity.c;
    }

    public static /* synthetic */ String q3(UmiVideoPreviewActivity umiVideoPreviewActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f116ea5d", new Object[]{umiVideoPreviewActivity});
        }
        return umiVideoPreviewActivity.f13983a;
    }

    public static /* synthetic */ String r3(UmiVideoPreviewActivity umiVideoPreviewActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("195d2a9e", new Object[]{umiVideoPreviewActivity});
        }
        return umiVideoPreviewActivity.b;
    }

    public static /* synthetic */ c5e s3(UmiVideoPreviewActivity umiVideoPreviewActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c5e) ipChange.ipc$dispatch("f9c9cf9c", new Object[]{umiVideoPreviewActivity});
        }
        return umiVideoPreviewActivity.c;
    }

    public static /* synthetic */ PreviewModel t3(UmiVideoPreviewActivity umiVideoPreviewActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PreviewModel) ipChange.ipc$dispatch("c891d7ef", new Object[]{umiVideoPreviewActivity});
        }
        return umiVideoPreviewActivity.f;
    }

    public static /* synthetic */ String u3(UmiVideoPreviewActivity umiVideoPreviewActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("922feb61", new Object[]{umiVideoPreviewActivity});
        }
        return umiVideoPreviewActivity.f13983a;
    }

    public static /* synthetic */ String v3(UmiVideoPreviewActivity umiVideoPreviewActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ba762ba2", new Object[]{umiVideoPreviewActivity});
        }
        return umiVideoPreviewActivity.b;
    }

    public static /* synthetic */ c5e w3(UmiVideoPreviewActivity umiVideoPreviewActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c5e) ipChange.ipc$dispatch("dfff16a0", new Object[]{umiVideoPreviewActivity});
        }
        return umiVideoPreviewActivity.c;
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1eb0a9a8", new Object[]{this, context});
            return;
        }
        super.attachBaseContext(context);
        acq.B(context);
    }

    @Override // com.taobao.umipublish.extension.preview.BasePreviewActivity, android.app.Activity
    public void finish() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44908f9a", new Object[]{this});
            return;
        }
        rng.a(this);
        super.finish();
    }

    @Override // com.taobao.umipublish.extension.preview.BasePreviewActivity
    public String getPageName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("707fddc9", new Object[]{this});
        }
        return PAGE_NAME;
    }

    @Override // com.taobao.umipublish.extension.preview.BasePreviewActivity
    public String l3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d8ae70bf", new Object[]{this});
        }
        return "a2116i.b10448971";
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        rng.c(this, i, i2, intent);
        super.onActivityResult(i, i2, intent);
        if (i == 4 && i2 == -1) {
            intent.putExtra("action", "change_cover");
            setResult(i2, intent);
            finish();
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b57eb01", new Object[]{this, intent});
            return;
        }
        super.onNewIntent(intent);
        rng.b(this, intent);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void startActivityForResult(Intent intent, int i, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ed253ea", new Object[]{this, intent, new Integer(i), bundle});
        } else {
            super.startActivityForResult(intent, rng.e(this, intent, i, bundle), bundle);
        }
    }

    public void x3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c769b653", new Object[]{this});
        } else if (this.f != null) {
            PreviewModel.Media n = this.e.n();
            String str = n.path;
            String str2 = n.ratio;
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                Uri.Builder path = new Uri.Builder().scheme("http").authority("h5.m.taobao.com").path("/taopai/tpdefault.html");
                IUGCMedia iUGCMedia = this.g;
                if (iUGCMedia != null) {
                    path = Uri.parse(UmiWvPlugin.getCoverPickPath(iUGCMedia.getPublishSessionId())).buildUpon();
                }
                Uri.Builder appendQueryParameter = path.appendQueryParameter("scene", "selectCover").appendQueryParameter("biz_scene", "template");
                appendQueryParameter.appendQueryParameter(tep.KEY_UNIFORM_RESULT, "[{\"fileUrl\": \"" + str + "\"}]");
                if ("1:1".equals(str2)) {
                    path.appendQueryParameter("shot_ratio", "0001");
                    path.appendQueryParameter("trackdatas", "{\"umi_cover_ratio\":\"1\", \"tid\": \"-1\"}");
                } else {
                    path.appendQueryParameter("trackdatas", "{\"umi_cover_ratio\":\"0\", \"tid\": \"-1\"}");
                }
                Nav.from(this).forResult(4).toUri(path.build());
            }
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // tb.mee
    public IUGCMedia get() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IUGCMedia) ipChange.ipc$dispatch("d0edc317", new Object[]{this}) : this.g;
    }

    public void in(IUGCMedia iUGCMedia) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e0ca12a", new Object[]{this, iUGCMedia});
        } else {
            this.g = iUGCMedia;
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // tb.nee
    public IUGCMedia out() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (IUGCMedia) ipChange.ipc$dispatch("91970c1f", new Object[]{this}) : this.g;
    }

    public void update(IUGCMedia iUGCMedia) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c6590ce", new Object[]{this, iUGCMedia});
            return;
        }
        this.g = iUGCMedia;
        Intent intent = new Intent();
        intent.putExtra("action", "change_cover");
        this.g.setMeta("result_data", qrf.q(intent));
        finish();
    }

    @Override // com.taobao.umipublish.extension.preview.BasePreviewActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        rng.d(this, getIntent());
        if (rng.g(this, getIntent())) {
            super.onCreate(bundle);
            finish();
            return;
        }
        super.onCreate(bundle);
        Intent intent = getIntent();
        String stringExtra = intent.getStringExtra("videoPath");
        String stringExtra2 = intent.getStringExtra("ratio");
        boolean z = (!intent.getBooleanExtra(KEY_CAN_EDIT_VIDEO, false) || this.g.getVideos() == null || this.g.getVideos().get(0) == null || this.g.getVideos().get(0).editorInfo == null || !ydv.v()) ? false : true;
        boolean booleanExtra = intent.getBooleanExtra(KEY_CAN_EDIT_COVER, false);
        boolean booleanExtra2 = intent.getBooleanExtra(KEY_CAN_DELETE_VIDEO, true);
        PreviewModel c2 = PreviewModel.c(stringExtra, stringExtra2);
        c2.f = Localization.q(R.string.gg_pub_change_cover);
        this.e.x(c2);
        this.e.C(new a19(new a()));
        this.e.m(z);
        this.e.E(new b());
        this.e.B(new c());
        this.e.l(booleanExtra);
        this.e.k(booleanExtra2);
        this.f = c2;
    }
}
