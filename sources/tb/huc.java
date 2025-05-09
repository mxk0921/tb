package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.page.ITMSPage;
import java.util.Arrays;
import java.util.Locale;
import tb.z5d;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public interface huc extends z5d {
    public static final a Companion = a.$$INSTANCE;
    public static final String META_KEY_SHARE_BIZ_ID = "WV.Meta.Share.BizId";
    public static final String META_KEY_SHARE_DISABLED = "WV.Meta.Share.Disabled";
    public static final String META_KEY_SHARE_IMAGE = "WV.Meta.Share.Image";
    public static final String META_KEY_SHARE_TARGETS = "WV.Meta.Share.Targets";
    public static final String META_KEY_SHARE_TEXT = "WV.Meta.Share.Text";
    public static final String META_KEY_SHARE_TITLE = "WV.Meta.Share.Title";
    public static final String META_KEY_SHARE_URL = "WV.Meta.Share.Url";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final String META_KEY_SHARE_BIZ_ID = "WV.Meta.Share.BizId";
        public static final String META_KEY_SHARE_DISABLED = "WV.Meta.Share.Disabled";
        public static final String META_KEY_SHARE_IMAGE = "WV.Meta.Share.Image";
        public static final String META_KEY_SHARE_TARGETS = "WV.Meta.Share.Targets";
        public static final String META_KEY_SHARE_TEXT = "WV.Meta.Share.Text";
        public static final String META_KEY_SHARE_TITLE = "WV.Meta.Share.Title";
        public static final String META_KEY_SHARE_URL = "WV.Meta.Share.Url";
        public static final /* synthetic */ a $$INSTANCE = new a();

        /* renamed from: a  reason: collision with root package name */
        public static final String[] f20904a = {"WV.Meta.Share.Title", "WV.Meta.Share.Url", "WV.Meta.Share.Image", "WV.Meta.Share.Text", "WV.Meta.Share.Disabled", "WV.Meta.Share.Targets", "WV.Meta.Share.BizId"};

        static {
            t2o.a(839909625);
        }

        public final String a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("b1964309", new Object[]{this});
            }
            int length = f20904a.length;
            String str = "(function(){var d=document,r={}";
            String str2 = "";
            for (int i = 0; i < length; i++) {
                str = ckf.p(str, String.format(Locale.getDefault(), ",n%d='%s',e%d=d.getElementById(n%d)", Arrays.copyOf(new Object[]{Integer.valueOf(i), f20904a[i], Integer.valueOf(i), Integer.valueOf(i)}, 4)));
                str2 = ckf.p(str2, String.format(Locale.getDefault(), "if(e%d){r[n%d]=e%d.getAttribute('value')}", Arrays.copyOf(new Object[]{Integer.valueOf(i), Integer.valueOf(i), Integer.valueOf(i)}, 3)));
            }
            return ckf.p(str, String.format(";%sreturn JSON.stringify(r);})()", Arrays.copyOf(new Object[]{str2}, 1)));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(839909626);
        }

        public static void a(huc hucVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("221f6133", new Object[]{hucVar});
                return;
            }
            ckf.g(hucVar, "this");
            z5d.a.a(hucVar);
        }

        public static void b(huc hucVar, ITMSPage iTMSPage) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("acd9db2d", new Object[]{hucVar, iTMSPage});
                return;
            }
            ckf.g(hucVar, "this");
            ckf.g(iTMSPage, "page");
            z5d.a.b(hucVar, iTMSPage);
        }

        public static void c(huc hucVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("279e157b", new Object[]{hucVar});
                return;
            }
            ckf.g(hucVar, "this");
            z5d.a.c(hucVar);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface c {
        void a(JSONObject jSONObject);
    }

    void N(String str);

    void o0(c cVar);
}
