package com.etao.feimagesearch.util.album;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.alibaba.ability.localization.Localization;
import com.alipay.android.msp.drivers.actions.MspEventTypes;
import com.alipay.security.mobile.alipayauthenticatorservice.message.Result;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.CaptureBridge;
import com.taobao.taobao.R;
import java.net.URLEncoder;
import tb.a07;
import tb.ckf;
import tb.h9w;
import tb.jzu;
import tb.lg4;
import tb.mzu;
import tb.nmj;
import tb.p73;
import tb.pei;
import tb.q2r;
import tb.rdi;
import tb.ryp;
import tb.s63;
import tb.t2o;
import tb.tsq;
import tb.wsq;
import tb.z7n;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class SystemAlbumPickerFragment extends Fragment {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public q2r.a f4885a;
    public String c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a {
        static {
            t2o.a(481297667);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    static {
        t2o.a(481297666);
    }

    public static /* synthetic */ Object ipc$super(SystemAlbumPickerFragment systemAlbumPickerFragment, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -641568046) {
            super.onCreate((Bundle) objArr[0]);
            return null;
        } else if (hashCode == 1257714799) {
            super.onActivityResult(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), (Intent) objArr[2]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/etao/feimagesearch/util/album/SystemAlbumPickerFragment");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        setRetainInstance(true);
    }

    public final void p2(boolean z, q2r.a aVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55bfbc2a", new Object[]{this, new Boolean(z), aVar, str});
            return;
        }
        this.f4885a = aVar;
        this.c = str;
        Intent intent = new Intent("android.intent.action.PICK", MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
        if (z) {
            intent.setType("image/*;video/mp4");
        } else {
            intent.setType("image/*");
        }
        startActivityForResult(Intent.createChooser(intent, Localization.q(R.string.taobao_app_1007_1_18991)), Result.ALIPAY_READ_RSA_KEY_INFO_FAILED);
    }

    public final void r2(Activity activity, pei peiVar) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71dcefe8", new Object[]{this, activity, peiVar});
        } else if (!activity.isFinishing()) {
            if (!peiVar.p() || !u2(activity, peiVar)) {
                if (peiVar.p()) {
                    str = "video";
                } else if (z7n.k(peiVar.g())) {
                    str = Localization.q(R.string.taobao_app_1007_1_18944);
                    ckf.f(str, "localizedString(\n       …_app_1007_1_18944\n      )");
                } else {
                    str = Localization.q(R.string.taobao_app_1007_1_18966);
                    ckf.f(str, "localizedString(R.string.taobao_app_1007_1_18966)");
                }
                mzu.k(s63.ALBUM_PAGE_NAME, "SelectedPhoto", ckf.p("pssource=", this.c), ckf.p("picCreateTime=", Long.valueOf(peiVar.c())), ckf.p("picIndex=", Integer.valueOf(peiVar.h())), ckf.p("query_type=", str));
                q2r.a aVar = this.f4885a;
                if (aVar != null) {
                    ((CaptureBridge.a) aVar).a(peiVar);
                }
            }
        }
    }

    public final void s2(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a5c654f", new Object[]{this, context, str});
        } else {
            Toast.makeText(context, str, 0).show();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
            return;
        }
        super.onActivityResult(i, i2, intent);
        if (intent != null && i2 == -1 && i == 293) {
            Uri data = intent.getData();
            if (data == null) {
                Context context = getContext();
                ckf.d(context);
                String q = Localization.q(R.string.taobao_app_1007_1_19014);
                ckf.f(q, "localizedString(R.string.taobao_app_1007_1_19014)");
                s2(context, q);
                return;
            }
            String path = data.getPath();
            String str = "";
            if (path == null) {
                path = str;
            }
            String type = intent.getType();
            if (type != null) {
                str = type;
            }
            if (!TextUtils.isEmpty(str)) {
                z = wsq.O(str, "video", false, 2, null);
            } else if (TextUtils.isEmpty(path) || (!wsq.O(path, "video", false, 2, null) && !wsq.O(path, "Video", false, 2, null) && !wsq.O(path, "VID", false, 2, null) && !wsq.O(path, MspEventTypes.ACTION_STRING_VID, false, 2, null))) {
                z = false;
            }
            FragmentActivity activity = getActivity();
            if (activity != null) {
                pei f = rdi.f(activity, data, z);
                if (f == null) {
                    Context context2 = getContext();
                    ckf.d(context2);
                    String q2 = Localization.q(R.string.taobao_app_1007_1_19012);
                    ckf.f(q2, "localizedString(R.string.taobao_app_1007_1_19012)");
                    s2(context2, q2);
                    return;
                }
                f.r(data);
                FragmentActivity activity2 = getActivity();
                if (activity2 != null) {
                    r2(activity2, f);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.app.Activity");
            }
            throw new NullPointerException("null cannot be cast to non-null type android.app.Activity");
        }
    }

    public final boolean u2(Activity activity, pei peiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7491c07", new Object[]{this, activity, peiVar})).booleanValue();
        }
        String g = peiVar.g();
        ckf.f(g, "item.path");
        if (!tsq.w(g, ryp.FILE_TYPE_VIDEO_MP4, false, 2, null)) {
            String q = Localization.q(R.string.taobao_app_1007_1_19000);
            ckf.f(q, "localizedString(R.string.taobao_app_1007_1_19000)");
            s2(activity, q);
            return true;
        } else if (!peiVar.o(lg4.L2())) {
            h9w.b(peiVar.j(), false);
            s2(activity, Localization.q(R.string.taobao_app_1007_not_supported_now) + lg4.L2() + Localization.q(R.string.taobao_app_1007_1_19020));
            jzu.n(p73.f25916a, "videoSearchTimeLimitExceeded", 19999, "totalTime", String.valueOf(peiVar.j()));
            return true;
        } else if (peiVar.n()) {
            h9w.b(peiVar.j(), false);
            String q2 = Localization.q(R.string.taobao_app_1007_1_19024);
            ckf.f(q2, "localizedString(R.string.taobao_app_1007_1_19024)");
            s2(activity, q2);
            jzu.n(p73.f25916a, "videoSearchTimeLimitExceeded", 19999, "totalTime", String.valueOf(peiVar.j()));
            return true;
        } else {
            boolean equals = TextUtils.equals(this.c, "sys_album");
            jzu.e("SelectedVideo", new String[0]);
            h9w.b(peiVar.j(), true);
            if (!equals) {
                return false;
            }
            String uri = Uri.parse("https://m.taobao.com/video_imagesearch").buildUpon().appendQueryParameter("videoUrl", URLEncoder.encode(peiVar.g())).appendQueryParameter("pssource", this.c).build().toString();
            ckf.f(uri, "parse(\"https://m.taobao.…ource).build().toString()");
            nmj.a(activity, uri);
            return true;
        }
    }
}
