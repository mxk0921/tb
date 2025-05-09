package com.taobao.umipublish.extension.preview.image;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import com.alibaba.ability.localization.Localization;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.idst.nls.nlsclientsdk.requests.Constant;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.base.data.IUGCMedia;
import com.taobao.android.litecreator.base.data.ImageBean;
import com.taobao.android.litecreator.base.data.UGCImage;
import com.taobao.android.litecreator.base.workflow.annotation.WorkflowNode;
import com.taobao.android.litecreator.sdk.editor.data.Music;
import com.taobao.android.litecreator.widgets.LCMaterialDialog;
import com.taobao.android.nav.Nav;
import com.taobao.taobao.R;
import com.taobao.taopai.business.image.edit.entities.Elements;
import com.taobao.umipublish.extension.preview.BasePreviewActivity;
import com.taobao.umipublish.extension.preview.PreviewDelegate;
import com.taobao.umipublish.extension.preview.PreviewModel;
import com.taobao.umipublish.extension.windvane.UmiWvPlugin;
import com.taobao.weex.common.Constants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import tb.a19;
import tb.acq;
import tb.c5e;
import tb.dov;
import tb.kfv;
import tb.krq;
import tb.m3v;
import tb.mj4;
import tb.n3e;
import tb.qrf;
import tb.rng;
import tb.t2o;
import tb.ydv;

/* compiled from: Taobao */
@WorkflowNode(bothWay = true)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class UmiImagePreviewActivity extends BasePreviewActivity implements n3e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String PAGE_NAME = "Page_GGPicCheck";
    public IUGCMedia g;
    public final Handler h = new Handler();
    public JSONArray i = new JSONArray();
    public final JSONArray j = new JSONArray();
    public final JSONArray k = new JSONArray();
    public final List<String> l = new ArrayList();
    public JSONArray m;
    public boolean n;

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
            UmiImagePreviewActivity.this.J3();
            HashMap hashMap = new HashMap();
            hashMap.put("biz_scene", UmiImagePreviewActivity.n3(UmiImagePreviewActivity.this));
            hashMap.put(dov.KEY_ONIOLN_FITTING_ROOM_SCENE, UmiImagePreviewActivity.o3(UmiImagePreviewActivity.this));
            UmiImagePreviewActivity.t3(UmiImagePreviewActivity.this).f(mj4.CONTROL_EDIT, hashMap);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class b implements View.OnClickListener {
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
                } else {
                    UmiImagePreviewActivity.y3(UmiImagePreviewActivity.this, false);
                }
            }
        }

        /* compiled from: Taobao */
        /* renamed from: com.taobao.umipublish.extension.preview.image.UmiImagePreviewActivity$b$b  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
        public class DialogInterface$OnClickListenerC0794b implements DialogInterface.OnClickListener {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public DialogInterface$OnClickListenerC0794b() {
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                    return;
                }
                UmiImagePreviewActivity.y3(UmiImagePreviewActivity.this, true);
                UmiImagePreviewActivity.this.B3();
            }
        }

        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("biz_scene", UmiImagePreviewActivity.u3(UmiImagePreviewActivity.this));
            hashMap.put(dov.KEY_ONIOLN_FITTING_ROOM_SCENE, UmiImagePreviewActivity.v3(UmiImagePreviewActivity.this));
            UmiImagePreviewActivity.w3(UmiImagePreviewActivity.this).f(Constant.VALUE_NAME_VPR_DELETE, hashMap);
            if (!UmiImagePreviewActivity.x3(UmiImagePreviewActivity.this)) {
                UmiImagePreviewActivity.this.B3();
            } else {
                new LCMaterialDialog.Builder(UmiImagePreviewActivity.this).setMessage(Localization.q(R.string.gg_pub_confirm_delete_photo)).setPositiveButton(Localization.q(R.string.gg_pub_confirm), new DialogInterface$OnClickListenerC0794b()).setNegativeButton(Localization.q(R.string.gg_pub_cancel), new a()).setCancelable(true).create().show();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class c implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            UmiImagePreviewActivity.z3(UmiImagePreviewActivity.this).f("Back", null);
            if (!UmiImagePreviewActivity.this.i.isEmpty()) {
                UmiImagePreviewActivity.this.D3();
            } else {
                UmiImagePreviewActivity.this.finish();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class d implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                UmiImagePreviewActivity.A3(UmiImagePreviewActivity.this).f("Music", null);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class e implements PreviewDelegate.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e() {
        }

        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fb514ad1", new Object[]{this});
            } else {
                UmiImagePreviewActivity.p3(UmiImagePreviewActivity.this).j("Music", null);
            }
        }

        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cb2056e3", new Object[]{this});
            } else {
                UmiImagePreviewActivity.q3(UmiImagePreviewActivity.this).f("PicOperate", null);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class f implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ PreviewModel f13997a;
        public final /* synthetic */ boolean b;

        public f(PreviewModel previewModel, boolean z) {
            this.f13997a = previewModel;
            this.b = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            UmiImagePreviewActivity.r3(UmiImagePreviewActivity.this).w(this.f13997a.f13989a, false);
            if (this.b && !ydv.c()) {
                UmiImagePreviewActivity.s3(UmiImagePreviewActivity.this).i(this.f13997a.f13989a);
            }
        }
    }

    static {
        t2o.a(944767039);
        t2o.a(511705155);
    }

    public static /* synthetic */ c5e A3(UmiImagePreviewActivity umiImagePreviewActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c5e) ipChange.ipc$dispatch("80a1aa0", new Object[]{umiImagePreviewActivity});
        }
        return umiImagePreviewActivity.c;
    }

    public static /* synthetic */ Object ipc$super(UmiImagePreviewActivity umiImagePreviewActivity, String str, Object... objArr) {
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
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/umipublish/extension/preview/image/UmiImagePreviewActivity");
        }
    }

    public static /* synthetic */ String n3(UmiImagePreviewActivity umiImagePreviewActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9e092d9a", new Object[]{umiImagePreviewActivity});
        }
        return umiImagePreviewActivity.f13983a;
    }

    public static /* synthetic */ String o3(UmiImagePreviewActivity umiImagePreviewActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c64f6ddb", new Object[]{umiImagePreviewActivity});
        }
        return umiImagePreviewActivity.b;
    }

    public static /* synthetic */ c5e p3(UmiImagePreviewActivity umiImagePreviewActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c5e) ipChange.ipc$dispatch("bbdfe986", new Object[]{umiImagePreviewActivity});
        }
        return umiImagePreviewActivity.c;
    }

    public static /* synthetic */ c5e q3(UmiImagePreviewActivity umiImagePreviewActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c5e) ipChange.ipc$dispatch("f56d3b47", new Object[]{umiImagePreviewActivity});
        }
        return umiImagePreviewActivity.c;
    }

    public static /* synthetic */ PreviewDelegate r3(UmiImagePreviewActivity umiImagePreviewActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PreviewDelegate) ipChange.ipc$dispatch("71c22aee", new Object[]{umiImagePreviewActivity});
        }
        return umiImagePreviewActivity.e;
    }

    public static /* synthetic */ PreviewDelegate s3(UmiImagePreviewActivity umiImagePreviewActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PreviewDelegate) ipChange.ipc$dispatch("c18e138d", new Object[]{umiImagePreviewActivity});
        }
        return umiImagePreviewActivity.e;
    }

    public static /* synthetic */ c5e t3(UmiImagePreviewActivity umiImagePreviewActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c5e) ipChange.ipc$dispatch("752cde59", new Object[]{umiImagePreviewActivity});
        }
        return umiImagePreviewActivity.c;
    }

    public static /* synthetic */ String u3(UmiImagePreviewActivity umiImagePreviewActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("16dbee5d", new Object[]{umiImagePreviewActivity});
        }
        return umiImagePreviewActivity.f13983a;
    }

    public static /* synthetic */ String v3(UmiImagePreviewActivity umiImagePreviewActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3f222e9e", new Object[]{umiImagePreviewActivity});
        }
        return umiImagePreviewActivity.b;
    }

    public static /* synthetic */ c5e w3(UmiImagePreviewActivity umiImagePreviewActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c5e) ipChange.ipc$dispatch("21d4d39c", new Object[]{umiImagePreviewActivity});
        }
        return umiImagePreviewActivity.c;
    }

    public static /* synthetic */ boolean x3(UmiImagePreviewActivity umiImagePreviewActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7464f584", new Object[]{umiImagePreviewActivity})).booleanValue();
        }
        return umiImagePreviewActivity.n;
    }

    public static /* synthetic */ void y3(UmiImagePreviewActivity umiImagePreviewActivity, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f634f95", new Object[]{umiImagePreviewActivity, new Boolean(z)});
        } else {
            umiImagePreviewActivity.K3(z);
        }
    }

    public static /* synthetic */ c5e z3(UmiImagePreviewActivity umiImagePreviewActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c5e) ipChange.ipc$dispatch("ce7cc8df", new Object[]{umiImagePreviewActivity});
        }
        return umiImagePreviewActivity.c;
    }

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
            ((ArrayList) this.l).add(j.draftId);
            this.i.add(E3);
            if (this.g != null) {
                C3(j);
            }
            if (this.f.d.isEmpty()) {
                D3();
            }
        }
    }

    public void C3(PreviewModel.Media media) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70c1a45d", new Object[]{this, media});
            return;
        }
        Iterator<UGCImage> it = this.g.getImages().iterator();
        while (it.hasNext()) {
            ImageBean imageBean = it.next().compress;
            if (imageBean != null && TextUtils.equals(imageBean.path, media.path)) {
                it.remove();
                return;
            }
        }
    }

    public void D3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8336bcd", new Object[]{this});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("deleteItems", (Object) this.i);
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
            iUGCMedia.setMeta("result_data", qrf.q(intent));
        }
        finish();
    }

    public JSONObject E3(int i, PreviewModel.Media media) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("9faf6692", new Object[]{this, new Integer(i), media});
        }
        JSONObject jSONObject = new JSONObject();
        if (media.type == 0) {
            str = "image";
        } else {
            str = "video";
        }
        jSONObject.put("type", (Object) str);
        jSONObject.put("path", (Object) media.path);
        jSONObject.put("extraInfo", (Object) F3(i));
        return jSONObject;
    }

    public JSONObject F3(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("693c9d54", new Object[]{this, new Integer(i)});
        }
        if (i >= this.m.size() || i < 0 || this.m.getJSONObject(i) == null) {
            return null;
        }
        return this.m.getJSONObject(i).getJSONObject("extraInfo");
    }

    public String G3(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("62395dac", new Object[]{this, intent});
        }
        return intent.getStringExtra("imageDatas");
    }

    public final Music H3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Music) ipChange.ipc$dispatch("846e1f40", new Object[]{this});
        }
        Intent intent = getIntent();
        if (intent == null) {
            return null;
        }
        String stringExtra = intent.getStringExtra("music");
        if (TextUtils.isEmpty(stringExtra)) {
            return null;
        }
        return (Music) JSON.parseObject(stringExtra, Music.class);
    }

    public PreviewModel I3(String str, int i, JSONArray jSONArray, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PreviewModel) ipChange.ipc$dispatch("fcb075fe", new Object[]{this, str, new Integer(i), jSONArray, new Boolean(z)});
        }
        return PreviewModel.a(str, i, jSONArray, z);
    }

    public void J3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dbb014", new Object[]{this});
        } else if (this.f != null && this.g != null) {
            ArrayList arrayList = new ArrayList();
            for (PreviewModel.Media media : this.f.d) {
                Elements elements = new Elements();
                elements.setDraftId(media.draftId);
                elements.setFileUrl(media.path);
                arrayList.add(elements);
            }
            Bundle bundle = new Bundle();
            Uri.Builder buildUpon = Uri.parse(UmiWvPlugin.NEW_IMAGEEDIT_PATH).buildUpon();
            buildUpon.appendQueryParameter("scene", "imageEditNew");
            buildUpon.appendQueryParameter("biz_scene", kfv.b().e("biz_scene", ""));
            buildUpon.appendQueryParameter("umi_pub_session", kfv.b().e("umi_pub_session", ""));
            buildUpon.appendQueryParameter("current_image_index", this.e.o() + "");
            Uri build = buildUpon.build();
            if (this.g != null) {
                Intent intent = new Intent();
                intent.putExtra("action", "edit");
                intent.putExtra("origin_image", this.e.n().originData.toString());
                this.g.setMeta("result_data", qrf.q(intent));
                this.g.setMeta("current_image_index", Integer.valueOf(this.e.o()));
            }
            Nav.from(this).withExtras(bundle).forResult(4).toUri(build);
        }
    }

    public final void K3(boolean z) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f5f65e3", new Object[]{this, new Boolean(z)});
            return;
        }
        HashMap hashMap = new HashMap();
        if (z) {
            str = "1";
        } else {
            str = "0";
        }
        hashMap.put("operate", str);
        ((m3v) this.c).f("PicDeletePop", hashMap);
    }

    public final void L3(PreviewModel previewModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("403c92b8", new Object[]{this, previewModel});
            return;
        }
        Music H3 = H3();
        if (H3 != null) {
            PreviewModel.Music music = new PreviewModel.Music();
            previewModel.e = music;
            music.path = H3.path;
            music.name = H3.name;
        }
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
        return "a2116i.b10340776";
    }

    @Override // com.taobao.umipublish.extension.preview.BasePreviewActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88afc63", new Object[]{this});
        } else {
            D3();
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
            intent.putExtra("action", "edit");
            intent.putExtra("origin_image", this.e.n().originData.toString());
            setResult(i2, intent);
            finish();
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
        } else {
            this.g = iUGCMedia;
        }
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
        this.i = new JSONArray();
        Intent intent = getIntent();
        String stringExtra = intent.getStringExtra("recordUrl");
        this.m = JSON.parseArray(G3(intent));
        int intExtra = intent.getIntExtra("currentIdx", 0);
        boolean booleanExtra = intent.getBooleanExtra("canEdit", false);
        boolean booleanExtra2 = intent.getBooleanExtra("canDelete", false);
        boolean booleanExtra3 = intent.getBooleanExtra(Constants.Name.AUTO_PLAY, true);
        this.n = intent.getBooleanExtra("deleteNeedConfirm", true);
        PreviewModel I3 = I3(stringExtra, intExtra, this.m, booleanExtra);
        L3(I3);
        this.e.k(booleanExtra2);
        this.e.x(I3);
        this.e.l(booleanExtra);
        this.e.C(new a19(new a()));
        this.e.B(new b());
        this.e.A(new c());
        this.e.D(new d());
        this.e.y(new e());
        this.h.post(new f(I3, booleanExtra3));
        this.f = I3;
    }
}
