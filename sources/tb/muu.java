package tb;

import android.content.Context;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.base.data.IUGCMedia;
import com.taobao.android.litecreator.base.data.UGCImage;
import com.taobao.android.litecreator.base.data.UGCVideo;
import com.taobao.android.litecreator.base.data.meta.MediaStatInfo;
import com.taobao.android.litecreator.sdk.editor.data.EditorInfo;
import com.taobao.android.litecreator.sdk.editor.data.Resource;
import tb.dov;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class muu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final String f24324a = "UGCWorkFlowHelper";
    public static final String b = "guangguang";
    public static final String c = "x_rate";
    public static final String d = "x_ask_everyone";

    public static String a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fb691b50", new Object[]{context});
        }
        if (context instanceof n3e) {
            return c((n3e) context);
        }
        return null;
    }

    public static String b(IUGCMedia iUGCMedia) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2a0433ea", new Object[]{iUGCMedia});
        }
        if (iUGCMedia == null || iUGCMedia.getBiz() == null) {
            str = "";
        } else {
            str = iUGCMedia.getBiz().bizLine;
        }
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        String str2 = b;
        odg.c(f24324a, "getBizLine is null, plz check: ");
        return str2;
    }

    public static String c(n3e n3eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("97e12656", new Object[]{n3eVar});
        }
        return b(n3eVar.get());
    }

    public static String d(IUGCMedia iUGCMedia) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3c46a86c", new Object[]{iUGCMedia});
        }
        if (iUGCMedia == null || iUGCMedia.getBiz() == null) {
            str = "";
        } else {
            str = iUGCMedia.getBiz().bizScene;
        }
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        String str2 = b;
        odg.c(f24324a, "getBizScene is null, plz check:!!! ");
        return str2;
    }

    public static String e(n3e n3eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4f842c94", new Object[]{n3eVar});
        }
        return d(n3eVar.get());
    }

    public static EditorInfo f(Context context) {
        EditorInfo editorInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (EditorInfo) ipChange.ipc$dispatch("7d4af4ea", new Object[]{context});
        }
        UGCVideo o = o(context);
        if (o == null || (editorInfo = o.editorInfo) == null) {
            return null;
        }
        return editorInfo;
    }

    public static EditorInfo g(Context context) {
        EditorInfo editorInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (EditorInfo) ipChange.ipc$dispatch("1424b27b", new Object[]{context});
        }
        UGCImage m = m(context);
        if (m == null || (editorInfo = m.editorInfo) == null) {
            return null;
        }
        return editorInfo;
    }

    public static String h(Context context) {
        Resource resource;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("75a99b8c", new Object[]{context});
        }
        EditorInfo g = g(context);
        if (g == null || (resource = g.resource) == null) {
            return null;
        }
        return resource.type;
    }

    public static String i(Context context) {
        Resource resource;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("86e8abfd", new Object[]{context});
        }
        EditorInfo f = f(context);
        if (f == null || (resource = f.resource) == null) {
            return null;
        }
        return resource.type;
    }

    public static String j(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1bb2dda", new Object[]{context});
        }
        if (context instanceof n3e) {
            return l((n3e) context);
        }
        return null;
    }

    public static String k(IUGCMedia iUGCMedia) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("43a4db20", new Object[]{iUGCMedia});
        }
        if (iUGCMedia != null) {
            return iUGCMedia.getPublishSessionId();
        }
        return null;
    }

    public static String l(n3e n3eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bc9b0160", new Object[]{n3eVar});
        }
        return k(n3eVar.get());
    }

    public static UGCImage m(Context context) {
        IUGCMedia iUGCMedia;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UGCImage) ipChange.ipc$dispatch("956c0b7d", new Object[]{context});
        }
        if (!(context instanceof n3e) || (iUGCMedia = ((n3e) context).get()) == null || iUGCMedia.getImages() == null || iUGCMedia.getImages().size() < 1) {
            return null;
        }
        return iUGCMedia.getImages().get(0);
    }

    public static IUGCMedia n(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IUGCMedia) ipChange.ipc$dispatch("5dc5461c", new Object[]{context});
        }
        if (context instanceof n3e) {
            return ((n3e) context).get();
        }
        return null;
    }

    public static UGCVideo o(Context context) {
        IUGCMedia iUGCMedia;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UGCVideo) ipChange.ipc$dispatch("ddc5f93d", new Object[]{context});
        }
        if (!(context instanceof n3e) || (iUGCMedia = ((n3e) context).get()) == null || iUGCMedia.getVideos() == null || iUGCMedia.getVideos().size() < 1) {
            return null;
        }
        return iUGCMedia.getVideos().get(0);
    }

    public static dov.a p(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dov.a) ipChange.ipc$dispatch("ee792fb8", new Object[]{context});
        }
        return dov.b(j(context));
    }

    public static String q(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("15546ab9", new Object[]{context});
        }
        return r(o(context));
    }

    public static String r(UGCVideo uGCVideo) {
        MediaStatInfo mediaStatInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("62b2e6f5", new Object[]{uGCVideo});
        }
        if (uGCVideo == null || (mediaStatInfo = (MediaStatInfo) uGCVideo.getMeta("mediaStatInfo")) == null) {
            return "unknown";
        }
        return mediaStatInfo.source;
    }

    public static boolean u(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f742d9d9", new Object[]{context})).booleanValue();
        }
        return v(i(context));
    }

    public static boolean w(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7194ae7f", new Object[]{context})).booleanValue();
        }
        if (context instanceof n3e) {
            return true;
        }
        return false;
    }

    public static boolean s(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5cfb4486", new Object[]{str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return TextUtils.equals(str, Resource.TYPE_TEMPLATE_IMG);
    }

    public static boolean x(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e6a78fca", new Object[]{context})).booleanValue();
        }
        IUGCMedia n = n(context);
        if (n == null || !(n.getMeta("onlyQuickPublishMode") instanceof Boolean)) {
            return false;
        }
        return ((Boolean) n.getMeta("onlyQuickPublishMode")).booleanValue();
    }

    public static boolean z(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("822c3037", new Object[]{context})).booleanValue();
        }
        UGCVideo o = o(context);
        if (o == null || !(o.getMeta("media_is_reedit") instanceof Boolean)) {
            return false;
        }
        return ((Boolean) o.getMeta("media_is_reedit")).booleanValue();
    }

    public static boolean t(Context context) {
        Resource resource;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2727b50e", new Object[]{context})).booleanValue();
        }
        EditorInfo f = f(context);
        return (f == null || (resource = f.resource) == null || (str = resource.type) == null || (!TextUtils.equals(str, Resource.TYPE_DEFAULT_MULTI) && !TextUtils.equals(f.resource.type, Resource.TYPE_RECORD_MULTI))) ? false : true;
    }

    public static boolean v(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("584e061", new Object[]{str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return TextUtils.equals(str, "template") || TextUtils.equals(str, Resource.TYPE_TEMPLATE_TIMELINE) || TextUtils.equals(str, Resource.TYPE_TEMPLATE_ALBUM_AI_EDIT) || TextUtils.equals(str, Resource.TYPE_TEMPLATE_IN_MULTI);
    }

    public static boolean y(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("399ee316", new Object[]{context})).booleanValue();
        }
        if (!(context instanceof n3e)) {
            return false;
        }
        String e = e((n3e) context);
        if (TextUtils.equals(e, c) || TextUtils.equals(e, d) || TextUtils.equals(i(context), Resource.TYPE_TEMPLATE_LITE)) {
            return false;
        }
        dov.a p = p(context);
        if (p.g("disable_edit_quick_publish", false) || !eag.f() || p.g(dov.KEY_XGC_APPEND_MODE, false) || z(context) || !p.g("async_publish", true)) {
            return false;
        }
        odg.c(f24324a, "isQuickPublishMode----------->");
        return true;
    }

    static {
        t2o.a(511705160);
    }
}
